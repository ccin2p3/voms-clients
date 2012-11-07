package org.italiangrid.voms.clients;

import java.util.List;

import eu.emi.security.authn.x509.proxy.ProxyType;

/**
 * This class represents the options given to drive the {@link ProxyInitBehaviour} when
 * creating a VOMS proxy. 
 * 
 * @author Andrea Ceccanti
 *
 */
public class ProxyInitOptions {

	private String certFile;
	private String keyFile;
	private String generatedProxyFile;
		
	private String lifetimeString;
	
	private String policyFile;
	
	private String policyLanguage;
	
	private int pathLenConstraint;
	
	private ProxyType proxyType;
	
	private int timeoutInSeconds;
	
	private boolean verifyAC = true;
	
	private boolean readPasswordFromStdin = false;
	
	private List<String> vomsCommands;
	
	private List<String> targets;
	
	

	/**
	 * @return the certFile
	 */
	public String getCertFile() {
		return certFile;
	}

	/**
	 * @param certFile the certFile to set
	 */
	public void setCertFile(String certFile) {
		this.certFile = certFile;
	}

	/**
	 * @return the keyFile
	 */
	public String getKeyFile() {
		return keyFile;
	}

	/**
	 * @param keyFile the keyFile to set
	 */
	public void setKeyFile(String keyFile) {
		this.keyFile = keyFile;
	}

	/**
	 * @return the generatedProxyFile
	 */
	public String getGeneratedProxyFile() {
		return generatedProxyFile;
	}

	/**
	 * @param generatedProxyFile the generatedProxyFile to set
	 */
	public void setGeneratedProxyFile(String generatedProxyFile) {
		this.generatedProxyFile = generatedProxyFile;
	}

	/**
	 * @return the lifetimeString
	 */
	public String getLifetimeString() {
		return lifetimeString;
	}

	/**
	 * @param lifetimeString the lifetimeString to set
	 */
	public void setLifetimeString(String lifetimeString) {
		this.lifetimeString = lifetimeString;
	}

	/**
	 * @return the policyFile
	 */
	public String getPolicyFile() {
		return policyFile;
	}

	/**
	 * @param policyFile the policyFile to set
	 */
	public void setPolicyFile(String policyFile) {
		this.policyFile = policyFile;
	}

	/**
	 * @return the policyLanguage
	 */
	public String getPolicyLanguage() {
		return policyLanguage;
	}

	/**
	 * @param policyLanguage the policyLanguage to set
	 */
	public void setPolicyLanguage(String policyLanguage) {
		this.policyLanguage = policyLanguage;
	}

	/**
	 * @return the pathLenConstraint
	 */
	public int getPathLenConstraint() {
		return pathLenConstraint;
	}

	/**
	 * @param pathLenConstraint the pathLenConstraint to set
	 */
	public void setPathLenConstraint(int pathLenConstraint) {
		this.pathLenConstraint = pathLenConstraint;
	}

	/**
	 * @return the proxyType
	 */
	public ProxyType getProxyType() {
		return proxyType;
	}

	/**
	 * @param proxyType the proxyType to set
	 */
	public void setProxyType(ProxyType proxyType) {
		this.proxyType = proxyType;
	}

	/**
	 * @return the timeoutInSeconds
	 */
	public int getTimeoutInSeconds() {
		return timeoutInSeconds;
	}

	/**
	 * @param timeoutInSeconds the timeoutInSeconds to set
	 */
	public void setTimeoutInSeconds(int timeoutInSeconds) {
		this.timeoutInSeconds = timeoutInSeconds;
	}

	/**
	 * @return the verifyAC
	 */
	public boolean isVerifyAC() {
		return verifyAC;
	}

	/**
	 * @param verifyAC the verifyAC to set
	 */
	public void setVerifyAC(boolean verifyAC) {
		this.verifyAC = verifyAC;
	}

	/**
	 * @return the vomsCommands
	 */
	public List<String> getVomsCommands() {
		return vomsCommands;
	}

	/**
	 * @param vomsCommands the vomsCommands to set
	 */
	public void setVomsCommands(List<String> vomsCommands) {
		this.vomsCommands = vomsCommands;
	}

	/**
	 * @return the readPasswordFromStdin
	 */
	public boolean isReadPasswordFromStdin() {
		return readPasswordFromStdin;
	}

	/**
	 * @param readPasswordFromStdin the readPasswordFromStdin to set
	 */
	public void setReadPasswordFromStdin(boolean readPasswordFromStdin) {
		this.readPasswordFromStdin = readPasswordFromStdin;
	}

	/**
	 * @return the targets
	 */
	public List<String> getTargets() {
		return targets;
	}

	/**
	 * @param targets the targets to set
	 */
	public void setTargets(List<String> targets) {
		this.targets = targets;
	}
	
}