package com.sohlman.liferay.disableassetincrement.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceWrapper;
import com.liferay.portlet.asset.service.AssetEntryLocalService;

public class AssetEntryLocalServiceHook extends AssetEntryLocalServiceWrapper {
	/* (non-Java-doc)
	 * @see com.liferay.portlet.asset.service.AssetEntryLocalServiceWrapper#AssetEntryLocalServiceWrapper(AssetEntryLocalService assetEntryLocalService)
	 */
	public AssetEntryLocalServiceHook(AssetEntryLocalService assetEntryLocalService) {
		super(assetEntryLocalService);
	}

	@Override
	public AssetEntry incrementViewCounter(long userId, String className,
			long classPK) throws PortalException, SystemException {
		return super.getEntry(className, classPK);
	}
	
	@Override
	public AssetEntry incrementViewCounter(long userId, String className,
			long classPK, int increment) throws SystemException {
		
		return super.fetchEntry(className, classPK);
		
	}
}