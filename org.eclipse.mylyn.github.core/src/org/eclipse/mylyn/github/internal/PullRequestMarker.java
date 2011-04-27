/*******************************************************************************
 *  Copyright (c) 2011 GitHub Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *    Kevin Sawicki (GitHub Inc.) - initial API and implementation
 *******************************************************************************/
package org.eclipse.mylyn.github.internal;

/**
 * Pull request marker model class.
 */
public class PullRequestMarker {

	private Repository repository;

	private String label;
	private String ref;
	private String sha;

	private User user;

	/**
	 * @return repository
	 */
	public Repository getRepository() {
		return this.repository;
	}

	/**
	 * @return label
	 */
	public String getLabel() {
		return this.label;
	}

	/**
	 * @return ref
	 */
	public String getRef() {
		return this.ref;
	}

	/**
	 * @return sha
	 */
	public String getSha() {
		return this.sha;
	}

	/**
	 * @return user
	 */
	public User getUser() {
		return this.user;
	}

}
