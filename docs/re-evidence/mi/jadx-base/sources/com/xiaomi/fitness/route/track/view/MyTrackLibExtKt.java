package com.xiaomi.fitness.route.track.view;

import android.app.Application;
import android.content.Context;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.route.export.api.TrackApi;
import com.xiaomi.fitness.route.export.api.TrackApiKt;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.TrackDetailData;
import com.xiaomi.fitness.route.track.view.MyTrackLibExtKt;
import com.xiaomi.fitness.route.track.viewmodel.DistributeTrackImpl;
import com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.r72;
import defpackage.x0j;
import defpackage.xr5;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0003\u001a6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010\r\u001a(\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0002\u0010\u0010\u001a&\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0001H\u0086@¢\u0006\u0002\u0010\u0017\u001a\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"TAG", "", "getTrackDis", "Lcom/xiaomi/fitness/route/track/view/TrackDetailActivity;", "preInstallTrack", "Lcom/xiaomi/fitness/route/track/view/ResultData;", "id", MediaStoreUtil.MediaInfo.SIZE, "", "file", "Ljava/io/File;", "name", "distance", "(Ljava/lang/String;ILjava/io/File;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doInstallTrack", "segmentLength", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeByteArrayToDownload", "context", "Landroid/content/Context;", "byteArray", "", "fileName", "(Landroid/content/Context;[BLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installToDevice", "Lcom/xiaomi/fitness/route/track/view/RouteResultData;", "originalRoute", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$OriginalRoute;", "(Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$OriginalRoute;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "route_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMyTrackLibExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyTrackLibExt.kt\ncom/xiaomi/fitness/route/track/view/MyTrackLibExtKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,278:1\n314#2,11:279\n*S KotlinDebug\n*F\n+ 1 MyTrackLibExt.kt\ncom/xiaomi/fitness/route/track/view/MyTrackLibExtKt\n*L\n93#1:279,11\n*E\n"})
public final class MyTrackLibExtKt {

    @NotNull
    public static final String TAG = "MyTrackLibExt";

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.view.MyTrackLibExtKt$doInstallTrack$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.view.MyTrackLibExtKt", f = "MyTrackLibExt.kt", i = {0}, l = {81}, m = "doInstallTrack", n = {"id"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MyTrackLibExtKt.doInstallTrack(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.view.MyTrackLibExtKt$installToDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.view.MyTrackLibExtKt", f = "MyTrackLibExt.kt", i = {0, 1, 1, 2}, l = {117, 122, 134}, m = "installToDevice", n = {"originalRoute", "originalRoute", "recorderFile", "originalRoute"}, s = {"L$0", "L$0", "L$1", "L$0"})
    public static final class C29051 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C29051(Continuation<? super C29051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MyTrackLibExtKt.installToDevice(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.view.MyTrackLibExtKt$preInstallTrack$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.view.MyTrackLibExtKt", f = "MyTrackLibExt.kt", i = {0}, l = {69}, m = "preInstallTrack", n = {"id"}, s = {"L$0"})
    public static final class C29061 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C29061(Continuation<? super C29061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MyTrackLibExtKt.preInstallTrack(null, 0, null, null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object doInstallTrack(String str, File file, Integer num, Continuation<? super ResultData> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objInstallTrackOnDevice = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInstallTrackOnDevice);
            FitnessLogUtils.i(TAG, "++++++++++ doInstallTrack start , id:" + str);
            TrackApi trackApiKt = TrackApiKt.getInstance(TrackApi.INSTANCE);
            Function3<? super Boolean, ? super Integer, ? super Integer, Unit> function3 = new Function3() { // from class: bfg
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MyTrackLibExtKt.doInstallTrack$lambda$0(((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), (Integer) obj3);
                }
            };
            anonymousClass2.L$0 = str;
            anonymousClass2.label = 1;
            objInstallTrackOnDevice = trackApiKt.installTrackOnDevice(str, file, num, function3, anonymousClass2);
            if (objInstallTrackOnDevice == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) anonymousClass2.L$0;
            ResultKt.throwOnFailure(objInstallTrackOnDevice);
        }
        boolean zBooleanValue = ((Boolean) objInstallTrackOnDevice).booleanValue();
        FitnessLogUtils.i(TAG, "++++++++++ doInstallTrack end,result:" + zBooleanValue + " , id:" + str);
        return zBooleanValue ? new ResultData(true, 0, Boxing.boxInt(100)) : new ResultData(false, 255, Boxing.boxInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doInstallTrack$lambda$0(boolean z, int i, Integer num) {
        return Unit.INSTANCE;
    }

    @NotNull
    public static final String getTrackDis(@NotNull TrackDetailActivity trackDetailActivity) {
        String dis;
        Intrinsics.checkNotNullParameter(trackDetailActivity, "<this>");
        try {
            TrackDetailData routeDetail = trackDetailActivity.getRouteDetail();
            return xr5.d(2, ((routeDetail == null || (dis = routeDetail.getDis()) == null) ? 0.0d : Double.parseDouble(dis)) / ((double) 1000)).toString();
        } catch (Exception e) {
            FitnessLogUtils.e(MyTrackLibraryAdapter.TAG, "e:" + e);
            return "--";
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x014f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0167 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0168  */
    /* JADX WARN: Code duplicated, block: B:62:0x020f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0215  */
    /* JADX WARN: Code duplicated, block: B:66:0x0218  */
    /* JADX WARN: Code duplicated, block: B:68:0x021b  */
    /* JADX WARN: Code duplicated, block: B:70:0x021e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0221  */
    /* JADX WARN: Code duplicated, block: B:72:0x0228  */
    /* JADX WARN: Code duplicated, block: B:73:0x022f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0236  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final Object installToDevice(@NotNull MyTrackLibraryVM.OriginalRoute originalRoute, @NotNull Continuation<? super RouteResultData> continuation) {
        C29051 c29051;
        Object obj;
        MyTrackLibraryVM.OriginalRoute originalRoute2;
        String nameStr;
        MyTrackLibraryVM.OriginalRoute originalRoute3;
        File file;
        Recorder second;
        Recorder second2;
        ResultData resultData;
        int code;
        String string;
        MyTrackLibraryVM.OriginalRoute originalRoute4;
        ResultData resultData2;
        Integer result;
        if (continuation instanceof C29051) {
            c29051 = (C29051) continuation;
            int i = c29051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29051.label = i - Integer.MIN_VALUE;
            } else {
                c29051 = new C29051(continuation);
            }
        } else {
            c29051 = new C29051(continuation);
        }
        Object objDoInstallTrack = c29051.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29051.label;
        if (i2 != 0) {
            if (i2 == 1) {
                MyTrackLibraryVM.OriginalRoute originalRoute5 = (MyTrackLibraryVM.OriginalRoute) c29051.L$0;
                ResultKt.throwOnFailure(objDoInstallTrack);
                obj = objDoInstallTrack;
                originalRoute2 = originalRoute5;
            } else if (i2 == 2) {
                file = (File) c29051.L$1;
                originalRoute3 = (MyTrackLibraryVM.OriginalRoute) c29051.L$0;
                ResultKt.throwOnFailure(objDoInstallTrack);
                resultData = (ResultData) objDoInstallTrack;
                FitnessLogUtils.i(DistributeTrackImpl.TAG, "5/5 preinstall to Device ,isSuccess:" + resultData.getSuccess() + ", , code:" + resultData.getCode() + " , id:" + originalRoute3.getRoute().getRoute_id());
                if (resultData.getSuccess()) {
                    code = resultData.getCode();
                    if (code != 1) {
                        string = ResourceExtKt.getString(x0j.M);
                    } else if (code != 2) {
                        string = ResourceExtKt.getString(x0j.N);
                    } else if (code != 6) {
                        string = ResourceExtKt.getString(x0j.h);
                    } else if (code != 7) {
                        string = "unknown";
                    } else {
                        string = ResourceExtKt.getString(x0j.O);
                    }
                    return new RouteResultData(false, originalRoute3.getRoute().getRoute_id(), resultData.getCode(), string);
                }
                String route_id = originalRoute3.getRoute().getRoute_id();
                Integer result2 = resultData.getResult();
                c29051.L$0 = originalRoute3;
                c29051.L$1 = null;
                c29051.label = 3;
                objDoInstallTrack = doInstallTrack(route_id, file, result2, c29051);
                if (objDoInstallTrack == coroutine_suspended) {
                    return coroutine_suspended;
                }
                originalRoute4 = originalRoute3;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                originalRoute4 = (MyTrackLibraryVM.OriginalRoute) c29051.L$0;
                ResultKt.throwOnFailure(objDoInstallTrack);
            }
            resultData2 = (ResultData) objDoInstallTrack;
            if (!resultData2.getSuccess() && (result = resultData2.getResult()) != null && result.intValue() == 100) {
                FitnessLogUtils.i(DistributeTrackImpl.TAG, "5/5 install to Device success , code:" + resultData2.getCode() + " , id:" + originalRoute4.getRoute().getRoute_id());
                return new RouteResultData(true, originalRoute4.getRoute().getRoute_id(), resultData2.getCode(), null, 8, null);
            }
            FitnessLogUtils.i(DistributeTrackImpl.TAG, "5/5 install to Device fail, code:" + resultData2.getCode() + " , id:" + originalRoute4.getRoute().getRoute_id());
            return new RouteResultData(false, originalRoute4.getRoute().getRoute_id(), resultData2.getCode(), "下发路线失败,路线id:" + originalRoute4.getRoute().getRoute_id());
        }
        ResultKt.throwOnFailure(objDoInstallTrack);
        FitnessLogUtils.i(DistributeTrackImpl.TAG, ">>>>>>>> write file , name:" + originalRoute.getRoute().getRoute_id());
        Application app = AppUtil.getApp();
        Pair<byte[], Recorder> recorderData = originalRoute.getRecorderData();
        byte[] first = recorderData != null ? recorderData.getFirst() : null;
        Intrinsics.checkNotNull(first);
        String route_id2 = originalRoute.getRoute().getRoute_id();
        c29051.L$0 = originalRoute;
        c29051.label = 1;
        Object objWriteByteArrayToDownload = writeByteArrayToDownload(app, first, route_id2, c29051);
        if (objWriteByteArrayToDownload == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj = objWriteByteArrayToDownload;
        originalRoute2 = originalRoute;
        File file2 = (File) obj;
        FitnessLogUtils.i(DistributeTrackImpl.TAG, ">>>>>>>> file:" + file2.getAbsolutePath());
        String route_id3 = originalRoute2.getRoute().getRoute_id();
        int length = (int) file2.length();
        Pair<byte[], Recorder> recorderData2 = originalRoute2.getRecorderData();
        if (recorderData2 == null || (second2 = recorderData2.getSecond()) == null || (nameStr = second2.getNameStr()) == null) {
            nameStr = "";
        }
        String str = nameStr;
        Pair<byte[], Recorder> recorderData3 = originalRoute2.getRecorderData();
        int dis = (recorderData3 == null || (second = recorderData3.getSecond()) == null) ? 0 : second.getDis();
        c29051.L$0 = originalRoute2;
        c29051.L$1 = file2;
        c29051.label = 2;
        Object objPreInstallTrack = preInstallTrack(route_id3, length, file2, str, dis, c29051);
        if (objPreInstallTrack == coroutine_suspended) {
            return coroutine_suspended;
        }
        originalRoute3 = originalRoute2;
        objDoInstallTrack = objPreInstallTrack;
        file = file2;
        resultData = (ResultData) objDoInstallTrack;
        FitnessLogUtils.i(DistributeTrackImpl.TAG, "5/5 preinstall to Device ,isSuccess:" + resultData.getSuccess() + ", , code:" + resultData.getCode() + " , id:" + originalRoute3.getRoute().getRoute_id());
        if (resultData.getSuccess()) {
            code = resultData.getCode();
            if (code != 1) {
                string = ResourceExtKt.getString(x0j.M);
            } else if (code != 2) {
                string = ResourceExtKt.getString(x0j.N);
            } else if (code != 6) {
                string = ResourceExtKt.getString(x0j.h);
            } else if (code != 7) {
                string = "unknown";
            } else {
                string = ResourceExtKt.getString(x0j.O);
            }
            return new RouteResultData(false, originalRoute3.getRoute().getRoute_id(), resultData.getCode(), string);
        }
        String route_id4 = originalRoute3.getRoute().getRoute_id();
        Integer result3 = resultData.getResult();
        c29051.L$0 = originalRoute3;
        c29051.L$1 = null;
        c29051.label = 3;
        objDoInstallTrack = doInstallTrack(route_id4, file, result3, c29051);
        if (objDoInstallTrack == coroutine_suspended) {
            return coroutine_suspended;
        }
        originalRoute4 = originalRoute3;
        resultData2 = (ResultData) objDoInstallTrack;
        if (!resultData2.getSuccess()) {
        }
        FitnessLogUtils.i(DistributeTrackImpl.TAG, "5/5 install to Device fail, code:" + resultData2.getCode() + " , id:" + originalRoute4.getRoute().getRoute_id());
        return new RouteResultData(false, originalRoute4.getRoute().getRoute_id(), resultData2.getCode(), "下发路线失败,路线id:" + originalRoute4.getRoute().getRoute_id());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object preInstallTrack(String str, int i, File file, String str2, int i2, Continuation<? super ResultData> continuation) {
        C29061 c29061;
        String str3;
        if (continuation instanceof C29061) {
            c29061 = (C29061) continuation;
            int i3 = c29061.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c29061.label = i3 - Integer.MIN_VALUE;
            } else {
                c29061 = new C29061(continuation);
            }
        } else {
            c29061 = new C29061(continuation);
        }
        C29061 c29062 = c29061;
        Object objPreInstallTrackOnDevice = c29062.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c29062.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objPreInstallTrackOnDevice);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel != null && !wearableDeviceModel.getIsDeviceConnected()) {
                ToastUtil.showShortToast(x0j.d);
                return new ResultData(false, 255, null);
            }
            if (!file.exists()) {
                FitnessLogUtils.i(TAG, "preInstallTrack file is not exists");
                return new ResultData(false, 255, null);
            }
            FitnessLogUtils.i(TAG, "preInstallTrack start , id:" + str);
            TrackApi trackApiKt = TrackApiKt.getInstance(TrackApi.INSTANCE);
            c29062.L$0 = str;
            c29062.label = 1;
            objPreInstallTrackOnDevice = trackApiKt.preInstallTrackOnDevice(str, i, file, str2, i2, c29062);
            if (objPreInstallTrackOnDevice == coroutine_suspended) {
                return coroutine_suspended;
            }
            str3 = str;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) c29062.L$0;
            ResultKt.throwOnFailure(objPreInstallTrackOnDevice);
        }
        int iIntValue = ((Number) objPreInstallTrackOnDevice).intValue();
        FitnessLogUtils.i(TAG, "preInstallTrack end, result:" + (iIntValue == 0) + " , id:" + str3);
        return new ResultData(iIntValue == 0, iIntValue, Boxing.boxInt(iIntValue));
    }

    @Nullable
    public static final Object writeByteArrayToDownload(@NotNull Context context, @NotNull byte[] bArr, @NotNull String str, @NotNull Continuation<? super File> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        File file = new File(r72.p(), str);
        if (file.exists()) {
            file.delete();
        }
        try {
            FilesKt__FileReadWriteKt.writeBytes(file, bArr);
            if (!cancellableContinuationImpl.isCancelled() || cancellableContinuationImpl.isCompleted()) {
                cancellableContinuationImpl.resumeWith(Result.m886constructorimpl(file));
            }
        } catch (Exception e) {
            Logger.i(ParserHelper.TAG, "writeByteArrayToDownload: " + e.getMessage() + " ");
            new File("");
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
