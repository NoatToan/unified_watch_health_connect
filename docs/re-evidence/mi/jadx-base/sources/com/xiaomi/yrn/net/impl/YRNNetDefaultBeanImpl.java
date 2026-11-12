package com.xiaomi.yrn.net.impl;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleRequestBean;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleResponseBean;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleResponseInfoBean;
import defpackage.nxr;
import defpackage.q1d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class YRNNetDefaultBeanImpl implements q1d {

    public class MiSkyTreeResponseBean implements Serializable {
        private int code;
        private MiSkyTreeResponseInfoBean data;
        private String message;
        private String traceId;

        public MiSkyTreeResponseBean() {
        }

        public int getCode() {
            return this.code;
        }

        public MiSkyTreeResponseInfoBean getData() {
            return this.data;
        }

        public String getMessage() {
            return this.message;
        }

        public String getTraceId() {
            return this.traceId;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public void setData(MiSkyTreeResponseInfoBean miSkyTreeResponseInfoBean) {
            this.data = miSkyTreeResponseInfoBean;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        public void setTraceId(String str) {
            this.traceId = str;
        }
    }

    public class MiSkyTreeResponseBundleInfoBean implements Serializable {
        private String branch;
        private String bundlePath;
        private String description;
        private String makeTime;
        private long maxCommonJSApiLevel;
        private long maxNativeApiLevel;
        private String moduleId;
        private String moduleMapVersion;
        private String moduleName;
        private boolean residentMemory;
        private int updateType;
        private String urlcdn;
        private String urlmd5;
        private String version;

        public MiSkyTreeResponseBundleInfoBean() {
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

        public String getMakeTime() {
            return this.makeTime;
        }

        public long getMaxCommonJSApiLevel() {
            return this.maxCommonJSApiLevel;
        }

        public long getMaxNativeApiLevel() {
            return this.maxNativeApiLevel;
        }

        public String getModuleId() {
            return this.moduleId;
        }

        public String getModuleMapVersion() {
            return this.moduleMapVersion;
        }

        public String getModuleName() {
            return this.moduleName;
        }

        public int getUpdateType() {
            return this.updateType;
        }

        public String getUrlcdn() {
            return this.urlcdn;
        }

        public String getUrlmd5() {
            return this.urlmd5;
        }

        public String getVersion() {
            return this.version;
        }

        public boolean isResidentMemory() {
            return this.residentMemory;
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

        public void setMakeTime(String str) {
            this.makeTime = str;
        }

        public void setMaxCommonJSApiLevel(long j) {
            this.maxCommonJSApiLevel = j;
        }

        public void setMaxNativeApiLevel(long j) {
            this.maxNativeApiLevel = j;
        }

        public void setModuleId(String str) {
            this.moduleId = str;
        }

        public void setModuleMapVersion(String str) {
            this.moduleMapVersion = str;
        }

        public void setModuleName(String str) {
            this.moduleName = str;
        }

        public void setResidentMemory(boolean z) {
            this.residentMemory = z;
        }

        public void setUpdateType(int i) {
            this.updateType = i;
        }

        public void setUrlcdn(String str) {
            this.urlcdn = str;
        }

        public void setUrlmd5(String str) {
            this.urlmd5 = str;
        }

        public void setVersion(String str) {
            this.version = str;
        }
    }

    public class MiSkyTreeResponseInfoBean implements Serializable {
        private String appKey;
        private long maxNativeApiLevel;
        private List<MiSkyTreeResponseBundleInfoBean> modules;
        private String platform;
        private long rnEngineVersion;

        public MiSkyTreeResponseInfoBean() {
        }

        public String getAppKey() {
            return this.appKey;
        }

        public long getMaxNativeApiLevel() {
            return this.maxNativeApiLevel;
        }

        public List<MiSkyTreeResponseBundleInfoBean> getModules() {
            return this.modules;
        }

        public String getPlatform() {
            return this.platform;
        }

        public long getRnEngineVersion() {
            return this.rnEngineVersion;
        }

        public void setAppKey(String str) {
            this.appKey = str;
        }

        public void setMaxNativeApiLevel(long j) {
            this.maxNativeApiLevel = j;
        }

        public void setModules(List<MiSkyTreeResponseBundleInfoBean> list) {
            this.modules = list;
        }

        public void setPlatform(String str) {
            this.platform = str;
        }

        public void setRnEngineVersion(long j) {
            this.rnEngineVersion = j;
        }
    }

    public class a extends TypeToken<List<MiSkyTreeResponseBundleInfoBean>> {
        public a() {
        }
    }

    public List<YRNBundleInfo> a(List<MiSkyTreeResponseBundleInfoBean> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (MiSkyTreeResponseBundleInfoBean miSkyTreeResponseBundleInfoBean : list) {
                if (miSkyTreeResponseBundleInfoBean != null) {
                    YRNBundleInfo yRNBundleInfo = new YRNBundleInfo();
                    yRNBundleInfo.setModule(miSkyTreeResponseBundleInfoBean.getModuleName());
                    yRNBundleInfo.setVersion(miSkyTreeResponseBundleInfoBean.getVersion());
                    yRNBundleInfo.setDescription(miSkyTreeResponseBundleInfoBean.getDescription());
                    yRNBundleInfo.setBranch(miSkyTreeResponseBundleInfoBean.getBranch());
                    yRNBundleInfo.setModuleIdMapVersion(miSkyTreeResponseBundleInfoBean.getModuleMapVersion() + "");
                    yRNBundleInfo.setMaketime(miSkyTreeResponseBundleInfoBean.getMakeTime());
                    yRNBundleInfo.setMd5(miSkyTreeResponseBundleInfoBean.getUrlmd5());
                    yRNBundleInfo.setMaxNativeApiLevel((int) miSkyTreeResponseBundleInfoBean.getMaxNativeApiLevel());
                    yRNBundleInfo.setMaxCommonJSApiLevel((int) miSkyTreeResponseBundleInfoBean.getMaxCommonJSApiLevel());
                    yRNBundleInfo.setUrl(miSkyTreeResponseBundleInfoBean.getUrlcdn());
                    yRNBundleInfo.setBundlePath(miSkyTreeResponseBundleInfoBean.getBundlePath());
                    yRNBundleInfo.setResidentMemory(miSkyTreeResponseBundleInfoBean.isResidentMemory());
                    yRNBundleInfo.setUpdateStrategy(miSkyTreeResponseBundleInfoBean.getUpdateType());
                    arrayList.add(yRNBundleInfo);
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.q1d
    public List<YRNBundleInfo> getAssetsBuiltinBundle(String str) {
        return a((List) new Gson().fromJson(str, new a().getType()));
    }

    @Override // defpackage.q1d
    public YRNBundleResponseBean getBeanFromNetResponseStr(String str) {
        YRNBundleResponseBean yRNBundleResponseBean = new YRNBundleResponseBean();
        MiSkyTreeResponseBean miSkyTreeResponseBean = (MiSkyTreeResponseBean) nxr.d(str, MiSkyTreeResponseBean.class);
        if (miSkyTreeResponseBean != null) {
            yRNBundleResponseBean.setCode(miSkyTreeResponseBean.getCode());
            yRNBundleResponseBean.setTraceId(miSkyTreeResponseBean.getTraceId());
            MiSkyTreeResponseInfoBean data = miSkyTreeResponseBean.getData();
            if (data != null) {
                YRNBundleResponseInfoBean yRNBundleResponseInfoBean = new YRNBundleResponseInfoBean();
                yRNBundleResponseInfoBean.setAppName(data.getAppKey());
                yRNBundleResponseInfoBean.setPlatform(data.getPlatform());
                yRNBundleResponseInfoBean.setMaxNativeApiLevel((int) data.getMaxNativeApiLevel());
                yRNBundleResponseInfoBean.setRnEngineVersion(data.getRnEngineVersion() + "");
                yRNBundleResponseInfoBean.setModules(a(data.getModules()));
                yRNBundleResponseBean.setData(yRNBundleResponseInfoBean);
            }
        }
        return yRNBundleResponseBean;
    }

    @Override // defpackage.q1d
    public String getRequestStrFromBean(YRNBundleRequestBean yRNBundleRequestBean) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("appKey", yRNBundleRequestBean.getAppName());
        jsonObject.addProperty("platform", yRNBundleRequestBean.getPlatform());
        jsonObject.addProperty("branch", yRNBundleRequestBean.getBranch());
        JsonArray jsonArray = new JsonArray();
        if (yRNBundleRequestBean.getModule() != null && !yRNBundleRequestBean.getModule().isEmpty()) {
            Iterator<String> it = yRNBundleRequestBean.getModule().iterator();
            while (it.hasNext()) {
                jsonArray.add(it.next());
            }
        }
        jsonObject.add("moduleNames", jsonArray);
        jsonObject.addProperty("maxNativeApiLevel", Integer.valueOf(yRNBundleRequestBean.getMaxNativeApiLevel()));
        if (yRNBundleRequestBean.getMaxCommonJSApiLevel() != null) {
            jsonObject.addProperty("maxCommonJSApiLevel", yRNBundleRequestBean.getMaxCommonJSApiLevel());
        }
        jsonObject.addProperty("rnEngineVersion", yRNBundleRequestBean.getRnEngineVersion());
        jsonObject.addProperty("moduleIdMapVersion", yRNBundleRequestBean.getModuleIdMapVersion());
        return nxr.f(jsonObject);
    }
}
