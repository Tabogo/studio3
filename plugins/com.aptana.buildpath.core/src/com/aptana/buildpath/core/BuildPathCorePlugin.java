package com.aptana.buildpath.core;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class BuildPathCorePlugin extends Plugin
{
	private static BuildPathCorePlugin plugin;
	private static BundleContext context;

	public static final String PLUGIN_ID = "com.aptana.buildpath.core"; //$NON-NLS-1$

	/**
	 * Returns the bundle context
	 * 
	 * @return the bundle context
	 */
	static BundleContext getContext()
	{
		return context;
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static BuildPathCorePlugin getDefault()
	{
		return plugin;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception
	{
		BuildPathCorePlugin.context = bundleContext;
		super.start(bundleContext);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception
	{
		plugin = null;
		super.stop(context);
		BuildPathCorePlugin.context = null;
	}
}
