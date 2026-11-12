package com.xiaomi.yrn.net.impl;

import defpackage.q1d;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class YRNNetYouPinBeanImpl implements q1d {

    public class MiYouPinBundleInfoBean implements Serializable {
        private String branch;
        private String bundlePath;
        private String description;
        private Object ext;
        private String maketime;
        private String maxCommonJSApiLevel;
        private String maxNativeApiLevel;
        private String md5;
        private String module;
        private String moduleIdMapVersion;
        final /* synthetic */ YRNNetYouPinBeanImpl this$0;
        private int updateStrategy;
        private String url;
        private String version;

        public MiYouPinBundleInfoBean(YRNNetYouPinBeanImpl yRNNetYouPinBeanImpl) {
        }

        public String getBranch() {
            return this.branch;
        }

        public String getBundlePath() {
            return this.bundlePath;
        }

        public String getDescription() {
            return this.description;
        }

        public Object getExt() {
            return this.ext;
        }

        public String getMaketime() {
            return this.maketime;
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

        public String getModuleIdMapVersion() {
            return this.moduleIdMapVersion;
        }

        public int getUpdateStrategy() {
            return this.updateStrategy;
        }

        public String getUrl() {
            return this.url;
        }

        public String getVersion() {
            return this.version;
        }

        public void setBranch(String str) {
            this.branch = str;
        }

        public void setBundlePath(String str) {
            this.bundlePath = str;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setExt(Object obj) {
            this.ext = obj;
        }

        public void setMaketime(String str) {
            this.maketime = str;
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

        public void setModuleIdMapVersion(String str) {
            this.moduleIdMapVersion = str;
        }

        public void setUpdateStrategy(int i) {
            this.updateStrategy = i;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setVersion(String str) {
            this.version = str;
        }
    }

    public class MiYouPinResponseBean implements Serializable {
        private int code;
        private MiYouPinResponseInfoBean data;
        final /* synthetic */ YRNNetYouPinBeanImpl this$0;
        private String traceId;

        public MiYouPinResponseBean(YRNNetYouPinBeanImpl yRNNetYouPinBeanImpl) {
        }

        public int getCode() {
            return this.code;
        }

        public MiYouPinResponseInfoBean getData() {
            return this.data;
        }

        public String getTraceId() {
            return this.traceId;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public void setData(MiYouPinResponseInfoBean miYouPinResponseInfoBean) {
            this.data = miYouPinResponseInfoBean;
        }

        public void setTraceId(String str) {
            this.traceId = str;
        }
    }

    public class MiYouPinResponseInfoBean implements Serializable {
        private String appName;
        private String maxNativeApiLevel;
        private List<MiYouPinBundleInfoBean> modules;
        private String platform;
        private String rnEngineVersion;
        final /* synthetic */ YRNNetYouPinBeanImpl this$0;

        public MiYouPinResponseInfoBean(YRNNetYouPinBeanImpl yRNNetYouPinBeanImpl) {
        }

        public String getAppName() {
            return this.appName;
        }

        public String getMaxNativeApiLevel() {
            return this.maxNativeApiLevel;
        }

        public List<MiYouPinBundleInfoBean> getModules() {
            return this.modules;
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

        public void setMaxNativeApiLevel(String str) {
            this.maxNativeApiLevel = str;
        }

        public void setModules(List<MiYouPinBundleInfoBean> list) {
            this.modules = list;
        }

        public void setPlatform(String str) {
            this.platform = str;
        }

        public void setRnEngineVersion(String str) {
            this.rnEngineVersion = str;
        }
    }
}
