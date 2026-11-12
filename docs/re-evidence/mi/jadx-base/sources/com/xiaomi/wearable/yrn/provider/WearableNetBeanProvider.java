package com.xiaomi.wearable.yrn.provider;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.exception.export.ExceptionHelper;
import com.xiaomi.fitness.exception.export.ExceptionHelperExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleRequestBean;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleResponseBean;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleResponseInfoBean;
import defpackage.nxr;
import defpackage.q1d;
import defpackage.vwr;
import io.sentry.SentryLevel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0003\u001c\u001d\u001eB\u000f\u0012\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\fJ)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0012\u0010\u0004\u001a\u000e\u0012\b\u0012\u00060\u0003R\u00020\u0000\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider;", "Lq1d;", "", "Lcom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider$MiSkyTreeResponseBundleInfoBean;", "modules", "Lcom/xiaomi/yrn/env/entity/YRNBundleInfo;", "convertSkyTreeBundleToYRN", "(Ljava/util/List;)Ljava/util/List;", "", "msg", "", "captureException", "(Ljava/lang/String;)V", "Lcom/xiaomi/yrn/env/entity/bundleload/YRNBundleRequestBean;", "bean", "getRequestStrFromBean", "(Lcom/xiaomi/yrn/env/entity/bundleload/YRNBundleRequestBean;)Ljava/lang/String;", "responseBody", "Lcom/xiaomi/yrn/env/entity/bundleload/YRNBundleResponseBean;", "getBeanFromNetResponseStr", "(Ljava/lang/String;)Lcom/xiaomi/yrn/env/entity/bundleload/YRNBundleResponseBean;", "assetsJsonContent", "getAssetsBuiltinBundle", "(Ljava/lang/String;)Ljava/util/List;", "mAppName", "Ljava/lang/String;", "appName", "<init>", "MiSkyTreeResponseBundleInfoBean", "MiSkyTreeResponseInfoBean", "MiSkyTreeResponseBean", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWearableRNBundleProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearableRNBundleProvider.kt\ncom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,407:1\n1863#2,2:408\n*S KotlinDebug\n*F\n+ 1 WearableRNBundleProvider.kt\ncom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider\n*L\n274#1:408,2\n*E\n"})
public final class WearableNetBeanProvider implements q1d {

    @NotNull
    private final String mAppName;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\b\u0018\u00010\u0014R\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider$MiSkyTreeResponseBean;", "Ljava/io/Serializable;", "<init>", "(Lcom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider;)V", "code", "", "getCode", "()I", "setCode", "(I)V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "traceId", "getTraceId", "setTraceId", "data", "Lcom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider$MiSkyTreeResponseInfoBean;", "Lcom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider;", "getData", "()Lcom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider$MiSkyTreeResponseInfoBean;", "setData", "(Lcom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider$MiSkyTreeResponseInfoBean;)V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MiSkyTreeResponseBean implements Serializable {
        private int code;

        @Nullable
        private MiSkyTreeResponseInfoBean data;

        @Nullable
        private String message;

        @Nullable
        private String traceId;

        public MiSkyTreeResponseBean() {
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final MiSkyTreeResponseInfoBean getData() {
            return this.data;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final String getTraceId() {
            return this.traceId;
        }

        public final void setCode(int i) {
            this.code = i;
        }

        public final void setData(@Nullable MiSkyTreeResponseInfoBean miSkyTreeResponseInfoBean) {
            this.data = miSkyTreeResponseInfoBean;
        }

        public final void setMessage(@Nullable String str) {
            this.message = str;
        }

        public final void setTraceId(@Nullable String str) {
            this.traceId = str;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\u001a\u0010+\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u00107\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\t¨\u0006:"}, d2 = {"Lcom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider$MiSkyTreeResponseBundleInfoBean;", "Ljava/io/Serializable;", "<init>", "(Lcom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider;)V", "moduleId", "", "getModuleId", "()Ljava/lang/String;", "setModuleId", "(Ljava/lang/String;)V", "moduleName", "getModuleName", "setModuleName", "version", "getVersion", "setVersion", "description", "getDescription", "setDescription", "branch", "getBranch", "setBranch", "moduleMapVersion", "getModuleMapVersion", "setModuleMapVersion", "makeTime", "getMakeTime", "setMakeTime", "urlmd5", "getUrlmd5", "setUrlmd5", "maxNativeApiLevel", "", "getMaxNativeApiLevel", "()J", "setMaxNativeApiLevel", "(J)V", "maxCommonJSApiLevel", "getMaxCommonJSApiLevel", "setMaxCommonJSApiLevel", "urlcdn", "getUrlcdn", "setUrlcdn", "residentMemory", "", "getResidentMemory", "()Z", "setResidentMemory", "(Z)V", FitnessRecordKey.updateType, "", "getUpdateType", "()I", "setUpdateType", "(I)V", "bundlePath", "getBundlePath", "setBundlePath", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MiSkyTreeResponseBundleInfoBean implements Serializable {

        @Nullable
        private String branch;

        @Nullable
        private String bundlePath;

        @Nullable
        private String description;

        @Nullable
        private String makeTime;
        private long maxCommonJSApiLevel;
        private long maxNativeApiLevel;

        @Nullable
        private String moduleId;

        @Nullable
        private String moduleMapVersion;

        @Nullable
        private String moduleName;
        private boolean residentMemory;
        private int updateType;

        @Nullable
        private String urlcdn;

        @Nullable
        private String urlmd5;

        @Nullable
        private String version;

        public MiSkyTreeResponseBundleInfoBean() {
        }

        @Nullable
        public final String getBranch() {
            return this.branch;
        }

        @Nullable
        public final String getBundlePath() {
            return this.bundlePath;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final String getMakeTime() {
            return this.makeTime;
        }

        public final long getMaxCommonJSApiLevel() {
            return this.maxCommonJSApiLevel;
        }

        public final long getMaxNativeApiLevel() {
            return this.maxNativeApiLevel;
        }

        @Nullable
        public final String getModuleId() {
            return this.moduleId;
        }

        @Nullable
        public final String getModuleMapVersion() {
            return this.moduleMapVersion;
        }

        @Nullable
        public final String getModuleName() {
            return this.moduleName;
        }

        public final boolean getResidentMemory() {
            return this.residentMemory;
        }

        public final int getUpdateType() {
            return this.updateType;
        }

        @Nullable
        public final String getUrlcdn() {
            return this.urlcdn;
        }

        @Nullable
        public final String getUrlmd5() {
            return this.urlmd5;
        }

        @Nullable
        public final String getVersion() {
            return this.version;
        }

        public final void setBranch(@Nullable String str) {
            this.branch = str;
        }

        public final void setBundlePath(@Nullable String str) {
            this.bundlePath = str;
        }

        public final void setDescription(@Nullable String str) {
            this.description = str;
        }

        public final void setMakeTime(@Nullable String str) {
            this.makeTime = str;
        }

        public final void setMaxCommonJSApiLevel(long j) {
            this.maxCommonJSApiLevel = j;
        }

        public final void setMaxNativeApiLevel(long j) {
            this.maxNativeApiLevel = j;
        }

        public final void setModuleId(@Nullable String str) {
            this.moduleId = str;
        }

        public final void setModuleMapVersion(@Nullable String str) {
            this.moduleMapVersion = str;
        }

        public final void setModuleName(@Nullable String str) {
            this.moduleName = str;
        }

        public final void setResidentMemory(boolean z) {
            this.residentMemory = z;
        }

        public final void setUpdateType(int i) {
            this.updateType = i;
        }

        public final void setUrlcdn(@Nullable String str) {
            this.urlcdn = str;
        }

        public final void setUrlmd5(@Nullable String str) {
            this.urlmd5 = str;
        }

        public final void setVersion(@Nullable String str) {
            this.version = str;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R&\u0010\u0016\u001a\u000e\u0012\b\u0012\u00060\u0018R\u00020\u0019\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider$MiSkyTreeResponseInfoBean;", "Ljava/io/Serializable;", "<init>", "(Lcom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider;)V", "appKey", "", "getAppKey", "()Ljava/lang/String;", "setAppKey", "(Ljava/lang/String;)V", "platform", "getPlatform", "setPlatform", "maxNativeApiLevel", "", "getMaxNativeApiLevel", "()J", "setMaxNativeApiLevel", "(J)V", "rnEngineVersion", "getRnEngineVersion", "setRnEngineVersion", "modules", "", "Lcom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider$MiSkyTreeResponseBundleInfoBean;", "Lcom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider;", "getModules", "()Ljava/util/List;", "setModules", "(Ljava/util/List;)V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MiSkyTreeResponseInfoBean implements Serializable {

        @Nullable
        private String appKey;
        private long maxNativeApiLevel;

        @Nullable
        private List<MiSkyTreeResponseBundleInfoBean> modules;

        @Nullable
        private String platform;
        private long rnEngineVersion;

        public MiSkyTreeResponseInfoBean() {
        }

        @Nullable
        public final String getAppKey() {
            return this.appKey;
        }

        public final long getMaxNativeApiLevel() {
            return this.maxNativeApiLevel;
        }

        @Nullable
        public final List<MiSkyTreeResponseBundleInfoBean> getModules() {
            return this.modules;
        }

        @Nullable
        public final String getPlatform() {
            return this.platform;
        }

        public final long getRnEngineVersion() {
            return this.rnEngineVersion;
        }

        public final void setAppKey(@Nullable String str) {
            this.appKey = str;
        }

        public final void setMaxNativeApiLevel(long j) {
            this.maxNativeApiLevel = j;
        }

        public final void setModules(@Nullable List<MiSkyTreeResponseBundleInfoBean> list) {
            this.modules = list;
        }

        public final void setPlatform(@Nullable String str) {
            this.platform = str;
        }

        public final void setRnEngineVersion(long j) {
            this.rnEngineVersion = j;
        }
    }

    public WearableNetBeanProvider(@NotNull String appName) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        this.mAppName = appName;
    }

    private final void captureException(String msg) {
        Logger.e("WearableNetBeanProvider", msg);
        ExceptionHelper.DefaultImpls.uploadEvent$default(ExceptionHelperExtKt.getInstance(ExceptionHelper.INSTANCE), CollectionsKt__CollectionsJVMKt.listOf("WearableNetBeanProvider"), (SentryLevel) null, msg, 2, (Object) null);
    }

    private final List<YRNBundleInfo> convertSkyTreeBundleToYRN(List<MiSkyTreeResponseBundleInfoBean> modules) {
        ArrayList arrayList = new ArrayList();
        List<MiSkyTreeResponseBundleInfoBean> list = modules;
        if (list != null && !list.isEmpty()) {
            for (MiSkyTreeResponseBundleInfoBean miSkyTreeResponseBundleInfoBean : modules) {
                if (miSkyTreeResponseBundleInfoBean != null) {
                    YRNBundleInfo yRNBundleInfo = new YRNBundleInfo();
                    yRNBundleInfo.setModule(miSkyTreeResponseBundleInfoBean.getModuleName());
                    yRNBundleInfo.setVersion(miSkyTreeResponseBundleInfoBean.getVersion());
                    yRNBundleInfo.setDescription(miSkyTreeResponseBundleInfoBean.getDescription());
                    yRNBundleInfo.setBranch(miSkyTreeResponseBundleInfoBean.getBranch());
                    yRNBundleInfo.setModuleIdMapVersion(miSkyTreeResponseBundleInfoBean.getModuleMapVersion());
                    yRNBundleInfo.setMaketime(miSkyTreeResponseBundleInfoBean.getMakeTime());
                    yRNBundleInfo.setMd5(miSkyTreeResponseBundleInfoBean.getUrlmd5());
                    yRNBundleInfo.setMaxNativeApiLevel((int) miSkyTreeResponseBundleInfoBean.getMaxNativeApiLevel());
                    yRNBundleInfo.setMaxCommonJSApiLevel((int) miSkyTreeResponseBundleInfoBean.getMaxCommonJSApiLevel());
                    yRNBundleInfo.setUrl(miSkyTreeResponseBundleInfoBean.getUrlcdn());
                    yRNBundleInfo.setBundlePath(miSkyTreeResponseBundleInfoBean.getBundlePath());
                    yRNBundleInfo.setResidentMemory(miSkyTreeResponseBundleInfoBean.getResidentMemory());
                    yRNBundleInfo.setUpdateStrategy(miSkyTreeResponseBundleInfoBean.getUpdateType());
                    arrayList.add(yRNBundleInfo);
                }
            }
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    @Override // defpackage.q1d
    @NotNull
    public List<YRNBundleInfo> getAssetsBuiltinBundle(@NotNull String assetsJsonContent) {
        Intrinsics.checkNotNullParameter(assetsJsonContent, "assetsJsonContent");
        Object objFromJson = new Gson().fromJson(assetsJsonContent, new TypeToken<List<? extends MiSkyTreeResponseBundleInfoBean>>() { // from class: com.xiaomi.wearable.yrn.provider.WearableNetBeanProvider$getAssetsBuiltinBundle$type$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return convertSkyTreeBundleToYRN((List) objFromJson);
    }

    @Override // defpackage.q1d
    @NotNull
    public YRNBundleResponseBean getBeanFromNetResponseStr(@Nullable String responseBody) {
        YRNBundleResponseBean yRNBundleResponseBean = new YRNBundleResponseBean();
        if (responseBody != null) {
            try {
                MiSkyTreeResponseBean miSkyTreeResponseBean = (MiSkyTreeResponseBean) nxr.d(responseBody, MiSkyTreeResponseBean.class);
                if (miSkyTreeResponseBean == null) {
                    yRNBundleResponseBean.setCode(-1);
                    captureException("Failed to parse response: " + responseBody);
                    return yRNBundleResponseBean;
                }
                yRNBundleResponseBean.setCode(miSkyTreeResponseBean.getCode());
                yRNBundleResponseBean.setTraceId(miSkyTreeResponseBean.getTraceId());
                MiSkyTreeResponseInfoBean data = miSkyTreeResponseBean.getData();
                if (data != null) {
                    YRNBundleResponseInfoBean yRNBundleResponseInfoBean = new YRNBundleResponseInfoBean();
                    yRNBundleResponseInfoBean.setAppName(data.getAppKey());
                    yRNBundleResponseInfoBean.setPlatform(data.getPlatform());
                    yRNBundleResponseInfoBean.setMaxNativeApiLevel((int) data.getMaxNativeApiLevel());
                    long rnEngineVersion = data.getRnEngineVersion();
                    StringBuilder sb = new StringBuilder();
                    sb.append(rnEngineVersion);
                    yRNBundleResponseInfoBean.setRnEngineVersion(sb.toString());
                    yRNBundleResponseInfoBean.setModules(convertSkyTreeBundleToYRN(data.getModules()));
                    yRNBundleResponseBean.setData(yRNBundleResponseInfoBean);
                }
            } catch (Exception e) {
                yRNBundleResponseBean.setCode(-1);
                captureException("Exception in getBeanFromNetResponseStr: " + e.getMessage() + ", response: " + responseBody);
                e.printStackTrace();
            }
        }
        return yRNBundleResponseBean;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x00af  */
    @Override // defpackage.q1d
    @NotNull
    public String getRequestStrFromBean(@NotNull YRNBundleRequestBean bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("appKey", bean.getAppName());
        jsonObject.addProperty("platform", bean.getPlatform());
        jsonObject.addProperty("rnEngineVersion", bean.getRnEngineVersion());
        jsonObject.addProperty("maxNativeApiLevel", String.valueOf(bean.getMaxNativeApiLevel()));
        JsonArray jsonArray = new JsonArray();
        List<String> module = bean.getModule();
        Intrinsics.checkNotNullExpressionValue(module, "getModule(...)");
        Iterator<T> it = module.iterator();
        while (it.hasNext()) {
            jsonArray.add((String) it.next());
        }
        jsonObject.add("moduleNames", jsonArray);
        jsonObject.addProperty("uid", AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        String upperCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        jsonObject.addProperty("areaId", upperCase);
        List<String> module2 = bean.getModule();
        Intrinsics.checkNotNullExpressionValue(module2, "getModule(...)");
        if (module2.size() == 1) {
            List<String> module3 = bean.getModule();
            Intrinsics.checkNotNullExpressionValue(module3, "getModule(...)");
            if (!Intrinsics.areEqual(CollectionsKt___CollectionsKt.first((List) module3), vwr.g().c(this.mAppName))) {
                jsonObject.addProperty("maxCommonJSApiLevel", bean.getMaxCommonJSApiLevel().toString());
                jsonObject.addProperty("moduleIdMapVersion", bean.getModuleIdMapVersion());
            }
        } else {
            jsonObject.addProperty("maxCommonJSApiLevel", bean.getMaxCommonJSApiLevel().toString());
            jsonObject.addProperty("moduleIdMapVersion", bean.getModuleIdMapVersion());
        }
        String strF = nxr.f(jsonObject);
        Intrinsics.checkNotNullExpressionValue(strF, "toJsonString(...)");
        return strF;
    }
}
