package com.xiaomi.yrn.env.entity.bundleload.load;

import java.io.Serializable;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class YRNLoadRequest implements Serializable {
    protected String appName;
    protected String cacheDirPath;
    protected String maxCommonJSApiLevel;
    protected String maxNativeApiLevel;
    protected String md5;
    protected String module;
    protected boolean needVerify = true;
    protected String usingBundlePath;
    protected String version;
    protected String zipCachePath;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YRNLoadRequest)) {
            return false;
        }
        YRNLoadRequest yRNLoadRequest = (YRNLoadRequest) obj;
        return Objects.equals(this.version, yRNLoadRequest.version) && Objects.equals(this.module, yRNLoadRequest.module) && Objects.equals(this.appName, yRNLoadRequest.appName);
    }

    public String getAppName() {
        return this.appName;
    }

    public String getCacheDirPath() {
        return this.cacheDirPath;
    }

    public String getMaxCommonJSApiLevel() {
        return this.maxCommonJSApiLevel;
    }

    public String getMaxNativeApiLevel() {
        return this.maxNativeApiLevel;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getModule() {
        return this.module;
    }

    public String getUsingBundlePath() {
        return this.usingBundlePath;
    }

    public String getVersion() {
        return this.version;
    }

    public String getZipCachePath() {
        return this.zipCachePath;
    }

    public int hashCode() {
        return Objects.hash(this.appName, this.module, this.version);
    }

    public boolean isNeedVerify() {
        return this.needVerify;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setMaxCommonJSApiLevel(String str) {
        this.maxCommonJSApiLevel = str;
    }

    public void setMaxNativeApiLevel(String str) {
        this.maxNativeApiLevel = str;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public void setNeedVerify(boolean z) {
        this.needVerify = z;
    }

    public void setUsingBundlePath(String str) {
        this.usingBundlePath = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setZipCachePath(String str) {
        this.zipCachePath = str;
    }

    public String toString() {
        return "YRNLoadRequest{appName='" + this.appName + "', module='" + this.module + "', version='" + this.version + "', md5='" + this.md5 + "', maxNativeApiLevel='" + this.maxNativeApiLevel + "', maxCommonJSApiLevel='" + this.maxCommonJSApiLevel + "', zipCachePath='" + this.zipCachePath + "', cacheDirPath='" + this.cacheDirPath + "', needVerify=" + this.needVerify + ", usingBundlePath='" + this.usingBundlePath + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
