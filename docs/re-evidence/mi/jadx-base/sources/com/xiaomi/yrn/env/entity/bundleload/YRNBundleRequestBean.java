package com.xiaomi.yrn.env.entity.bundleload;

import java.io.Serializable;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class YRNBundleRequestBean implements Serializable {
    protected String appName;
    protected String branch;
    protected Integer maxCommonJSApiLevel;
    protected int maxNativeApiLevel;
    protected List<String> module;
    protected String moduleIdMapVersion;
    protected String platform;
    protected String rnEngineVersion;

    public String getAppName() {
        return this.appName;
    }

    public String getBranch() {
        return this.branch;
    }

    public Integer getMaxCommonJSApiLevel() {
        return this.maxCommonJSApiLevel;
    }

    public int getMaxNativeApiLevel() {
        return this.maxNativeApiLevel;
    }

    public List<String> getModule() {
        return this.module;
    }

    public String getModuleIdMapVersion() {
        return this.moduleIdMapVersion;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getRnEngineVersion() {
        return this.rnEngineVersion;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setBranch(String str) {
        this.branch = str;
    }

    public void setMaxCommonJSApiLevel(int i) {
        this.maxCommonJSApiLevel = Integer.valueOf(i);
    }

    public void setMaxNativeApiLevel(int i) {
        this.maxNativeApiLevel = i;
    }

    public void setModule(List<String> list) {
        this.module = list;
    }

    public void setModuleIdMapVersion(String str) {
        this.moduleIdMapVersion = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setRnEngineVersion(String str) {
        this.rnEngineVersion = str;
    }

    public String toString() {
        return "YRNBundleRequestBean{appName='" + this.appName + "', platform='" + this.platform + "', maxNativeApiLevel=" + this.maxNativeApiLevel + ", rnEngineVersion='" + this.rnEngineVersion + "', branch='" + this.branch + "', module=" + this.module + ", maxCommonJSApiLevel=" + this.maxCommonJSApiLevel + ", moduleIdMapVersion='" + this.moduleIdMapVersion + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
