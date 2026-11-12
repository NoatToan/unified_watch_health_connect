package com.xiaomi.fitness.watch.face.data;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.watch.face.data.FaceFunUtil;
import com.xiaomi.fitness.watch.face.helper.FaceDownloadHelper;
import com.xiaomi.fitness.watch.face.request.FaceApiRequest;
import defpackage.bg4;
import defpackage.im9;
import defpackage.j5h;
import defpackage.m7m;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.tgc;
import defpackage.v4h;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0003J\b\u0010\u0012\u001a\u00020\u000bH\u0007J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/FaceFunUtil;", "", "<init>", "()V", "lastReqTime", "", "isRequesting", "", "faceApiRequest", "Lcom/xiaomi/fitness/watch/face/request/FaceApiRequest;", "downloadZip", "", "data", "Lcom/xiaomi/fitness/watch/face/data/FaceIconZipRes$DataBean;", "validZip", "md5", "", "unzipRes", "reqIconZip", TSMAuthContants.PARAM_VALID, "getVersion", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceFunUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceFunUtil.kt\ncom/xiaomi/fitness/watch/face/data/FaceFunUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
public final class FaceFunUtil {

    @NotNull
    public static final FaceFunUtil INSTANCE = new FaceFunUtil();

    @NotNull
    private static final FaceApiRequest faceApiRequest = new FaceApiRequest();
    private static boolean isRequesting;
    private static long lastReqTime;

    private FaceFunUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadZip(final FaceIconZipRes.DataBean data) {
        Logger.d("FaceFunUtil", "downloadZip: " + Thread.currentThread().getName());
        String config_hash = data.config_hash;
        Intrinsics.checkNotNullExpressionValue(config_hash, "config_hash");
        if (validZip(config_hash)) {
            unzipRes(data);
            return;
        }
        FaceDownloadHelper faceDownloadHelper = FaceDownloadHelper.INSTANCE;
        String config = data.config;
        Intrinsics.checkNotNullExpressionValue(config, "config");
        faceDownloadHelper.downloadFile(config, FaceFunUtilKt.ZIP_PATH, new tgc() { // from class: com.xiaomi.fitness.watch.face.data.FaceFunUtil.downloadZip.1
            @Override // defpackage.tgc
            public void onComplete() {
                Logger.d("FaceFunUtil", "downloadZip success: " + Thread.currentThread().getName());
                FaceFunUtil.INSTANCE.unzipRes(data);
            }

            @Override // defpackage.tgc
            public void onError(String errorMsg) {
                Logger.e("FaceFunUtil", "downloadZip onError: " + errorMsg);
                FaceFunUtil.isRequesting = false;
            }

            @Override // defpackage.tgc
            public /* bridge */ /* synthetic */ void onProgress(int i) {
                super.onProgress(i);
            }
        });
    }

    private final int getVersion() {
        return m7m.a().b("face_data_version", -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final void unzipRes(final FaceIconZipRes.DataBean data) {
        o4h o4hVarH = o4h.f(new j5h() { // from class: qx8
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                FaceFunUtil.unzipRes$lambda$1(data, v4hVar);
            }
        }).S(ofl.c()).H(ofl.c());
        final Function1 function1 = new Function1() { // from class: rx8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceFunUtil.unzipRes$lambda$2(data, (Boolean) obj);
            }
        };
        o4hVarH.N(new bg4() { // from class: sx8
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                FaceFunUtil.unzipRes$lambda$3(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unzipRes$lambda$1(FaceIconZipRes.DataBean data, v4h it) {
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(it, "it");
        FaceFunUtil faceFunUtil = INSTANCE;
        String config_hash = data.config_hash;
        Intrinsics.checkNotNullExpressionValue(config_hash, "config_hash");
        if (!faceFunUtil.validZip(config_hash)) {
            it.onNext(Boolean.FALSE);
            Logger.i("FaceFunUtil", "unzipRes: valid zip error");
            it.onComplete();
        } else if (im9.z(new File(FaceFunUtilKt.getICON_PATH()))) {
            it.onNext(Boolean.valueOf(im9.T(FaceFunUtilKt.ZIP_PATH, FaceFunUtilKt.getICON_PATH())));
            it.onComplete();
        } else {
            it.onNext(Boolean.FALSE);
            Logger.i("FaceFunUtil", "unzipRes: delete false");
            it.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unzipRes$lambda$2(FaceIconZipRes.DataBean data, Boolean bool) {
        Intrinsics.checkNotNullParameter(data, "$data");
        Logger.i("FaceFunUtil", "unzipRes: ret = " + bool);
        if (bool.booleanValue()) {
            lastReqTime = System.currentTimeMillis();
            m7m.a().f("face_data_version", data.version);
        }
        isRequesting = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unzipRes$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean valid(FaceIconZipRes.DataBean data) {
        return (data == null || TextUtils.isEmpty(data.config) || TextUtils.isEmpty(data.config_hash)) ? false : true;
    }

    private final boolean validZip(String md5) {
        return new File(FaceFunUtilKt.ZIP_PATH).exists() && Intrinsics.areEqual(MD5Util.getFileMD5(FaceFunUtilKt.ZIP_PATH), md5);
    }

    @SuppressLint({"CheckResult"})
    public final void reqIconZip() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            return;
        }
        Logger.d("FaceFunUtil", "reqIconZip: " + isRequesting);
        if (isRequesting || System.currentTimeMillis() - lastReqTime <= 86400000) {
            return;
        }
        isRequesting = true;
        final int version = getVersion();
        faceApiRequest.getFaceDataIcon(DeviceModelExtKt.getModel(wearableDeviceModel), Math.max(version, 0), new Function1<FaceIconZipRes.DataBean, Unit>() { // from class: com.xiaomi.fitness.watch.face.data.FaceFunUtil.reqIconZip.1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(FaceIconZipRes.DataBean dataBean) {
                invoke2(dataBean);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(FaceIconZipRes.DataBean data) {
                Intrinsics.checkNotNullParameter(data, "data");
                FaceFunUtil faceFunUtil = FaceFunUtil.INSTANCE;
                boolean z = !faceFunUtil.valid(data) || data.version <= version;
                Logger.d("FaceFunUtil", "onSuccess: noNeedDownload = " + z);
                if (!z) {
                    faceFunUtil.downloadZip(data);
                } else {
                    FaceFunUtil.lastReqTime = System.currentTimeMillis();
                    FaceFunUtil.isRequesting = false;
                }
            }
        }, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.watch.face.data.FaceFunUtil.reqIconZip.2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                invoke2(apiException);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(ApiException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                Logger.i("FaceFunUtil", "reqIconZip onFail: code = " + exception.getErrorCode() + ";");
                FaceFunUtil.isRequesting = false;
            }
        });
    }
}
