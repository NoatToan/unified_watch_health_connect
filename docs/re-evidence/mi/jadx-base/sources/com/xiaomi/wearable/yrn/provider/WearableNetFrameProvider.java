package com.xiaomi.wearable.yrn.provider;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.exception.export.ExceptionHelper;
import com.xiaomi.fitness.exception.export.ExceptionHelperExtKt;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleRequestBean;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleResponseBean;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleResponseInfoBean;
import com.xiaomi.yrn.env.entity.bundleload.load.YRNNetworkLoadRequest;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import defpackage.ezr;
import defpackage.f1d;
import defpackage.gyr;
import defpackage.q1d;
import defpackage.r1d;
import defpackage.s1d;
import defpackage.sur;
import defpackage.vwr;
import io.sentry.SentryLevel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\nJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00122\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/xiaomi/wearable/yrn/provider/WearableNetFrameProvider;", "Ls1d;", "", "appName", "Lr1d;", "getNetFrameProvider", "(Ljava/lang/String;)Lr1d;", "msg", "", "captureException", "(Ljava/lang/String;)V", "Lcom/xiaomi/yrn/env/entity/bundleload/YRNBundleRequestBean;", "request", "Lf1d;", "Lcom/xiaomi/yrn/env/entity/bundleload/YRNBundleResponseBean;", "callback", "getNetBundleInfo", "(Lcom/xiaomi/yrn/env/entity/bundleload/YRNBundleRequestBean;Lf1d;)V", "Lcom/xiaomi/yrn/env/entity/bundleload/load/YRNNetworkLoadRequest;", "Lsur;", "", "downloadBundle", "(Lcom/xiaomi/yrn/env/entity/bundleload/load/YRNNetworkLoadRequest;Lf1d;)Z", "assetsJsonFile", "", "Lcom/xiaomi/yrn/env/entity/YRNBundleInfo;", "parseBuiltinBundleInfoJson", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lgyr;", "netFactory", "Lgyr;", "TAG", "Ljava/lang/String;", "<init>", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWearableRNBundleProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearableRNBundleProvider.kt\ncom/xiaomi/wearable/yrn/provider/WearableNetFrameProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n1#2:408\n*E\n"})
public final class WearableNetFrameProvider implements s1d {

    @NotNull
    private final String TAG;

    @NotNull
    private gyr netFactory;

    public WearableNetFrameProvider(@NotNull String appName) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        this.netFactory = new gyr(appName);
        this.TAG = "YRN_YRNV3_SDK";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void captureException(String msg) {
        Logger.e(this.TAG, msg);
        ExceptionHelper.DefaultImpls.uploadEvent$default(ExceptionHelperExtKt.getInstance(ExceptionHelper.INSTANCE), CollectionsKt__CollectionsJVMKt.listOf(this.TAG), (SentryLevel) null, msg, 2, (Object) null);
    }

    private final r1d getNetFrameProvider(String appName) {
        if (TextUtils.isEmpty(appName) || vwr.g().d(appName) == null || vwr.g().d(appName).n() == null) {
            return null;
        }
        return vwr.g().d(appName).n();
    }

    @Override // defpackage.s1d
    public boolean downloadBundle(@NotNull final YRNNetworkLoadRequest request, @Nullable final f1d<sur> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!TextUtils.isEmpty(request.getUrl()) && !TextUtils.isEmpty(request.getZipCachePath())) {
            Logger.d(this.TAG, "WearableNetFrameProvider.downloadBundle: url is " + request.getUrl() + ",and download Path is " + request.getZipCachePath());
            return this.netFactory.e(request.getUrl(), new JsonObject(), request.getZipCachePath(), new f1d<String>() { // from class: com.xiaomi.wearable.yrn.provider.WearableNetFrameProvider.downloadBundle.1
                @Override // defpackage.f1d
                public void onFailure(int code, String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    ezr.c().f(YRNTraceEvent.newEvent(request.getAppName(), 1100, "downloadBundle fail", null, "onFailure,code is " + code + ",message is " + message));
                    f1d<sur> f1dVar = callback;
                    if (f1dVar != null) {
                        f1dVar.onFailure(code, message);
                    }
                    ExceptionHelper.DefaultImpls.uploadEvent$default(ExceptionHelperExtKt.getInstance(ExceptionHelper.INSTANCE), CollectionsKt__CollectionsJVMKt.listOf("YRNBundleDownloadFail"), (SentryLevel) null, "code: " + code + ", message: " + message + ", url: " + request.getUrl(), 2, (Object) null);
                }

                @Override // defpackage.f1d
                public void onSuccess(String s) {
                    ezr.c().f(YRNTraceEvent.newEvent(request.getAppName(), 1100, "downloadBundle success", null, "request is " + request));
                    f1d<sur> f1dVar = callback;
                    if (f1dVar != null) {
                        f1dVar.onSuccess(null);
                    }
                }
            });
        }
        String string = request.toString();
        if (string == null) {
            string = "request is Empty";
        }
        captureException("WearableNetFrameProvider.downloadBundle:request is " + string);
        if (callback != null) {
            callback.onFailure(-1, "WearableNetFrameProvider.downloadBundle:request is " + string);
        }
        ezr.c().f(YRNTraceEvent.newEvent(request.getAppName(), 1100, "downloadBundle fail", null, "onFailure,request  is " + string));
        return false;
    }

    @Override // defpackage.s1d
    public void getNetBundleInfo(@NotNull final YRNBundleRequestBean request, @Nullable final f1d<YRNBundleResponseBean> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        String appName = request.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName(...)");
        r1d netFrameProvider = getNetFrameProvider(appName);
        if (netFrameProvider == null) {
            Logger.e(this.TAG, "WearableNetFrameProvider.getNetBundleInfo:IYRNNetDefaultFrameInfoProvider is null,pls check");
            if (callback != null) {
                callback.onFailure(-1, "WearableNetFrameProvider.getNetBundleInfo:provider is null ");
                return;
            }
            return;
        }
        String bundleNetUrl = netFrameProvider.getBundleNetUrl(vwr.g().f(request.getAppName()));
        Intrinsics.checkNotNullExpressionValue(bundleNetUrl, "getBundleNetUrl(...)");
        if (TextUtils.isEmpty(bundleNetUrl)) {
            if (callback != null) {
                callback.onFailure(-1, "WearableNetFrameProvider.getNetBundleInfo:url is Empty ");
            }
            captureException("WearableNetFrameProvider.getNetBundleInfo: url is Empty!");
        } else {
            final q1d netBeanProvider = netFrameProvider.getNetBeanProvider();
            this.netFactory.d(bundleNetUrl, netBeanProvider.getRequestStrFromBean(request), new f1d<String>() { // from class: com.xiaomi.wearable.yrn.provider.WearableNetFrameProvider.getNetBundleInfo.1
                @Override // defpackage.f1d
                public void onFailure(int code, String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    ezr.c().f(YRNTraceEvent.newEvent(request.getAppName(), 913, "getNetBundleInfo", null, "onFailure,code is " + code + ",message is " + message));
                    ExceptionHelper.DefaultImpls.uploadEvent$default(ExceptionHelperExtKt.getInstance(ExceptionHelper.INSTANCE), CollectionsKt__CollectionsJVMKt.listOf("YRNSkyTreeFail"), (SentryLevel) null, "code: " + code + ", message: " + message, 2, (Object) null);
                }

                @Override // defpackage.f1d
                public void onSuccess(String s) {
                    ArrayList arrayList;
                    List<YRNBundleInfo> modules;
                    try {
                        ezr.c().f(YRNTraceEvent.newEvent(request.getAppName(), 912, "getNetBundleInfo", null, s));
                        if (s != null) {
                            YRNBundleResponseBean beanFromNetResponseStr = netBeanProvider.getBeanFromNetResponseStr(s);
                            YRNBundleResponseInfoBean data = beanFromNetResponseStr.getData();
                            if (data != null) {
                                YRNBundleResponseInfoBean data2 = beanFromNetResponseStr.getData();
                                if (data2 == null || (modules = data2.getModules()) == null) {
                                    arrayList = null;
                                } else {
                                    YRNBundleRequestBean yRNBundleRequestBean = request;
                                    arrayList = new ArrayList();
                                    for (Object obj : modules) {
                                        if (yRNBundleRequestBean.getModule().contains(((YRNBundleInfo) obj).getModule())) {
                                            arrayList.add(obj);
                                        }
                                    }
                                }
                                data.setModules(arrayList);
                            }
                            ezr.c().f(YRNTraceEvent.newEvent(request.getAppName(), 1100, "getNetBundleInfo_TraceId", null, !TextUtils.isEmpty(beanFromNetResponseStr.getTraceId()) ? beanFromNetResponseStr.getTraceId() : s));
                            f1d<YRNBundleResponseBean> f1dVar = callback;
                            if (f1dVar != null) {
                                f1dVar.onSuccess(beanFromNetResponseStr);
                            }
                        }
                    } catch (Exception e) {
                        this.captureException("Exception in sendAsyncRequest response parser: " + e.getMessage() + ", response: " + s);
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // defpackage.s1d
    @Nullable
    public List<YRNBundleInfo> parseBuiltinBundleInfoJson(@NotNull String appName, @NotNull String assetsJsonFile) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(assetsJsonFile, "assetsJsonFile");
        if (TextUtils.isEmpty(assetsJsonFile)) {
            captureException("WearableNetFrameProvider.parseBuiltinBundleInfoJson:assetsJsonFile is Empty");
            return null;
        }
        try {
            long jNanoTime = System.nanoTime();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(vwr.g().a().getAssets().open(assetsJsonFile)));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
            Logger.d(this.TAG, "WearableNetFrameProvider.parseBuiltinBundleInfoJson:spend:" + (System.nanoTime() - jNanoTime) + " ns");
            ezr.c().f(YRNTraceEvent.newEvent(appName, 1100, "parseBuiltinBundleInfoJson", null, sb.toString()));
            r1d netFrameProvider = getNetFrameProvider(appName);
            if (netFrameProvider != null) {
                return netFrameProvider.getNetBeanProvider().getAssetsBuiltinBundle(sb.toString());
            }
        } catch (IOException e) {
            ezr.c().f(YRNTraceEvent.newEvent(appName, 1100, "parseBuiltinBundleInfoJson", null, "exception is " + e));
            e.printStackTrace();
        }
        return null;
    }
}
