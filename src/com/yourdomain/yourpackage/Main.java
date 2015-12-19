package com.yourdomain.yourpackage;

import com.wicpar.wicparbase.utils.plugins.Injector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ro.fortsoft.pf4j.Extension;
import ro.fortsoft.pf4j.Plugin;
import ro.fortsoft.pf4j.PluginWrapper;

/**
 * Created by Frederic on 25/09/2015 at 13:58.
 */
public class Main extends Plugin
{
	/**
	 * Constructor to be used by plugin manager for plugin instantiation.
	 * Your plugins have to provide constructor with this exact signature to
	 * be successfully loaded by manager.
	 *
	 * @param wrapper
	 */
	public Main(PluginWrapper wrapper)
	{
		super(wrapper);
	}

	@Extension
	public static class testPlugin implements Injector
	{

		Logger logger = LoggerFactory.getLogger(this.getClass());

		@Override
		public void OnHandlerPreInit()
		{
			logger.info("Test PreInit");
		}

		@Override
		public void OnHandlerPostInit()
		{

		}

		@Override
		public void OnGamePreInit()
		{

		}

		@Override
		public void OnGamePostInit()
		{

		}

		@Override
		public void OnGameFinish()
		{

		}
	}

}
