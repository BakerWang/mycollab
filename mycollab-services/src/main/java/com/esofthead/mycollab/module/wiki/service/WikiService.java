package com.esofthead.mycollab.module.wiki.service;

import java.util.List;

import javax.jcr.version.Version;

import com.esofthead.mycollab.module.wiki.domain.Folder;
import com.esofthead.mycollab.module.wiki.domain.Page;
import com.esofthead.mycollab.module.wiki.domain.WikiResource;

/**
 * 
 * @author MyCollab Ltd.
 * @since 4.4.0
 *
 */
public interface WikiService {
	/**
	 * 
	 * @param page
	 * @param createdUser
	 */
	void savePage(Page page, String createdUser);

	/**
	 * 
	 * @param path
	 * @return
	 */
	List<Version> getPageVersions(String path);

	Page getPageByVersion(String path, String versionName);

	/**
	 * 
	 * @param folder
	 * @param createdUser
	 */
	void createFolder(Folder folder, String createdUser);

	/**
	 * 
	 * @param path
	 * @return
	 */
	List<Page> getPages(String path);

	List<WikiResource> getResources(String path);

	/**
	 * 
	 * @param path
	 */
	void removeResource(String path);
}