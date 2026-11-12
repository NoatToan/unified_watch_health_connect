package com.mi.health.course.activity.eco;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackConstant;
import com.example.statistics.export.OneTrackExtKt;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mi.health.course.activity.eco.EcoCourseVideoVM;
import com.mi.health.course.data.CastScreenCMD;
import com.mi.health.course.data.Resolution;
import com.mi.health.course.data.Resolution1080;
import com.mi.health.course.data.Resolution4K;
import com.mi.health.course.data.Resolution720;
import com.mi.health.course.data.ResolutionKt;
import com.mi.health.course.export.data.CourseAllInfoKt;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.util.UUIDUtilKt;
import com.milink.sdk.cast.MiLinkDevice;
import com.milink.sdk.client.MiLinkCastCallback;
import com.milink.sdk.client.MiLinkCastClient;
import com.milink.sdk.client.MiLinkDataCallback;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingConst;
import com.xiaomi.smarthome.homeroom.model.Home;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 c2\u00020\u0001:\u0001cB\t\b\u0007¢\u0006\u0004\bb\u0010+J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b#\u0010\"J!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\b¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0002¢\u0006\u0004\b,\u0010)J\r\u0010-\u001a\u00020\u0002¢\u0006\u0004\b-\u0010)J\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010+J'\u00104\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u00042\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J)\u0010:\u001a\u00020\b2\u0006\u00107\u001a\u0002062\b\b\u0002\u00108\u001a\u00020\u00062\b\b\u0002\u00109\u001a\u00020\u001f¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\b¢\u0006\u0004\b<\u0010+J\u0017\u0010=\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\bH\u0014¢\u0006\u0004\b?\u0010+R#\u0010F\u001a\n A*\u0004\u0018\u00010@0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0016\u0010J\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010HR\u0016\u0010L\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR$\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010QR\"\u0010S\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001b0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010`¨\u0006d"}, d2 = {"Lcom/mi/health/course/activity/eco/EcoCourseVideoVM;", "Lcom/mi/health/course/activity/eco/EcoCourseBasePlayerVM;", "", "result", "", "errorCode", "", Home.JSON_KEY_ADDRESS, "", "report", "(ZILjava/lang/String;)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setMilinkConnectListener", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/mi/health/course/data/CastScreenCMD$GetVideoDataFromTV;", "setTVDataListener", "Lcom/mi/health/course/data/Resolution;", "resolution", "setClarity", "(Lcom/mi/health/course/data/Resolution;)V", "videoUrl", "clarity", "Lcom/google/android/exoplayer2/q;", "prepare", "(Ljava/lang/String;Lcom/mi/health/course/data/Resolution;)Lcom/google/android/exoplayer2/q;", "", "Lcom/mi/health/course/export/data/CourseConfigModel$VideoSegment;", "segments", "setSegments", "(Ljava/util/List;)V", "", "curPos", "hasNextSegment", "(J)Z", "hasPreSegment", "Lkotlin/Pair;", "getNextSegmentPos", "(J)Lkotlin/Pair;", "getPreSegmentPos", "isSupportSendData", "()Z", "initMilinkClient", "()V", "isStartCast", "isDataCasting", "stopCast", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "phoneSportData", "mode", "Lcom/mi/health/course/export/data/CourseConfigModel$DeviceLinkage;", "deviceLinkage", "sendDataToTV", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;ILcom/mi/health/course/export/data/CourseConfigModel$DeviceLinkage;)V", "Lcom/mi/health/course/data/CastScreenCMD$Operation;", "operationCmd", "urlPath", "nextProgress", "sendCmdToTV", "(Lcom/mi/health/course/data/CastScreenCMD$Operation;Ljava/lang/String;J)V", "sendRequestClarity", "sendDeviceStatus", "(Lcom/mi/health/course/export/data/CourseConfigModel$DeviceLinkage;)V", "onCleared", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "mGson$delegate", "Lkotlin/Lazy;", "getMGson", "()Lcom/google/gson/Gson;", "mGson", "mConnected", "Z", "isMilinkInit", "isNewTvSdk", "Lcom/milink/sdk/client/MiLinkCastClient;", "mCastClient", "Lcom/milink/sdk/client/MiLinkCastClient;", "mUid", "Ljava/lang/String;", "milinkConnectEmitter", "Lkotlin/jvm/functions/Function1;", "tVDataEmitter", "maxHeartRate", "I", "getMaxHeartRate", "()I", "setMaxHeartRate", "(I)V", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "Ljava/util/TreeSet;", "segmentSet", "Ljava/util/TreeSet;", "lastSegmentPos", "J", "firstSegmentPos", "<init>", "Companion", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoCourseVideoVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoCourseVideoVM.kt\ncom/mi/health/course/activity/eco/EcoCourseVideoVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n1863#2,2:339\n1#3:341\n*S KotlinDebug\n*F\n+ 1 EcoCourseVideoVM.kt\ncom/mi/health/course/activity/eco/EcoCourseVideoVM\n*L\n85#1:339,2\n*E\n"})
public final class EcoCourseVideoVM extends EcoCourseBasePlayerVM {

    @NotNull
    public static final String CAST_TAG = "castScreen";

    @NotNull
    public static final String TAG = "EcoCourseVideoVM";
    private boolean isMilinkInit;
    private boolean isNewTvSdk;
    private long lastSegmentPos;
    private MiLinkCastClient mCastClient;
    private boolean mConnected;
    private int maxHeartRate;

    @Nullable
    private Function1<? super Boolean, Unit> milinkConnectEmitter;

    @Nullable
    private Function1<? super CastScreenCMD.GetVideoDataFromTV, Unit> tVDataEmitter;

    /* JADX INFO: renamed from: mGson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cq7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseVideoVM.mGson_delegate$lambda$0();
        }
    });

    @NotNull
    private String mUid = "";

    @NotNull
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    @NotNull
    private final TreeSet<CourseConfigModel.VideoSegment> segmentSet = new TreeSet<>();
    private long firstSegmentPos = Long.MAX_VALUE;

    /* JADX INFO: renamed from: com.mi.health.course.activity.eco.EcoCourseVideoVM$initMilinkClient$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\r\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"com/mi/health/course/activity/eco/EcoCourseVideoVM$initMilinkClient$1", "Lcom/milink/sdk/client/MiLinkCastCallback;", "onInit", "", "onFailure", "p0", "", GlobalDynamicSettingConst.COUNTRY_DOMAIN_PV, "onConnectionChange", "Lcom/milink/sdk/cast/MiLinkDevice;", "p2", "onPrivateProtectChange", "onConnected", "onDisconnected", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends MiLinkCastCallback {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onConnected$lambda$0(EcoCourseVideoVM this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Function1 function1 = this$0.milinkConnectEmitter;
            if (function1 != null) {
                function1.invoke2(Boolean.valueOf(this$0.mConnected));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onDisconnected$lambda$1(EcoCourseVideoVM this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Function1 function1 = this$0.milinkConnectEmitter;
            if (function1 != null) {
                function1.invoke2(Boolean.valueOf(this$0.mConnected));
            }
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onConnected(MiLinkDevice p0, int p1) {
            String wifiMac;
            EcoCourseVideoVM.this.setOtherDevice(p0 != null ? p0.getName() : null);
            EcoCourseVideoVM.this.mConnected = true;
            EcoCourseVideoVM.this.isNewTvSdk = Intrinsics.areEqual(p0 != null ? p0.getType() : null, MiLinkDevice.TYPE_MIPLAY_DATA);
            FitnessLogUtils.d(EcoCourseVideoVM.TAG, "milink connected isNewTvSdk=" + EcoCourseVideoVM.this.isNewTvSdk);
            if (EcoCourseVideoVM.this.isNewTvSdk) {
                Handler handler = EcoCourseVideoVM.this.mHandler;
                final EcoCourseVideoVM ecoCourseVideoVM = EcoCourseVideoVM.this;
                handler.post(new Runnable() { // from class: gq7
                    @Override // java.lang.Runnable
                    public final void run() {
                        EcoCourseVideoVM.AnonymousClass1.onConnected$lambda$0(ecoCourseVideoVM);
                    }
                });
                EcoCourseVideoVM.this.sendRequestClarity();
            }
            EcoCourseVideoVM ecoCourseVideoVM2 = EcoCourseVideoVM.this;
            if (p0 == null || (wifiMac = p0.getWifiMac()) == null) {
                wifiMac = "";
            }
            EcoCourseVideoVM.report$default(ecoCourseVideoVM2, true, 0, wifiMac, 2, null);
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onConnectionChange(int p0, MiLinkDevice p1, int p2) {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onDisconnected(MiLinkDevice p0, int p1) {
            FitnessLogUtils.d(EcoCourseVideoVM.TAG, "milink onDisconnected");
            EcoCourseVideoVM.this.mConnected = false;
            if (EcoCourseVideoVM.this.isNewTvSdk) {
                Handler handler = EcoCourseVideoVM.this.mHandler;
                final EcoCourseVideoVM ecoCourseVideoVM = EcoCourseVideoVM.this;
                handler.post(new Runnable() { // from class: eq7
                    @Override // java.lang.Runnable
                    public final void run() {
                        EcoCourseVideoVM.AnonymousClass1.onDisconnected$lambda$1(ecoCourseVideoVM);
                    }
                });
            }
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onFailure(int p0, int p1) {
            FitnessLogUtils.d(EcoCourseVideoVM.TAG, "milink onFailure code==" + p0 + "  *** flag==" + p1);
            EcoCourseVideoVM.this.mConnected = false;
            EcoCourseVideoVM.report$default(EcoCourseVideoVM.this, false, p0, null, 4, null);
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onInit() {
            EcoCourseVideoVM.this.isMilinkInit = true;
            FitnessLogUtils.d(EcoCourseVideoVM.TAG, "milink init success");
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onPrivateProtectChange(int p0, int p1) {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.activity.eco.EcoCourseVideoVM$initMilinkClient$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/mi/health/course/activity/eco/EcoCourseVideoVM$initMilinkClient$2", "Lcom/milink/sdk/client/MiLinkDataCallback;", "onReceived", "", "p0", "", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 extends MiLinkDataCallback {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onReceived$lambda$0(EcoCourseVideoVM this$0, CastScreenCMD.GetVideoDataFromTV getVideoDataFromTV) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Function1 function1 = this$0.tVDataEmitter;
            if (function1 != null) {
                Intrinsics.checkNotNull(getVideoDataFromTV);
                function1.invoke2(getVideoDataFromTV);
            }
        }

        @Override // com.milink.sdk.cast.IMiLinkDataCallback
        public void onReceived(byte[] p0) {
            if (p0 == null) {
                return;
            }
            final CastScreenCMD.GetVideoDataFromTV getVideoDataFromTV = (CastScreenCMD.GetVideoDataFromTV) EcoCourseVideoVM.this.getMGson().fromJson(new String(p0, Charsets.UTF_8), CastScreenCMD.GetVideoDataFromTV.class);
            FitnessLogUtils.d(EcoCourseVideoVM.TAG, "milink onReceived status==" + getVideoDataFromTV.status + "***progress==" + getVideoDataFromTV.progress + "***clarity==" + getVideoDataFromTV.clarity);
            Handler handler = EcoCourseVideoVM.this.mHandler;
            final EcoCourseVideoVM ecoCourseVideoVM = EcoCourseVideoVM.this;
            handler.post(new Runnable() { // from class: iq7
                @Override // java.lang.Runnable
                public final void run() {
                    EcoCourseVideoVM.AnonymousClass2.onReceived$lambda$0(ecoCourseVideoVM, getVideoDataFromTV);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson getMGson() {
        return (Gson) this.mGson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$0() {
        return new GsonBuilder().disableHtmlEscaping().create();
    }

    private final void report(boolean result, int errorCode, String address) {
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[9];
        pairArr[0] = TuplesKt.to("tip", "56.53.1.1.22973");
        pairArr[1] = TuplesKt.to("device_model", ecoDeviceModel != null ? EcoDeviceModelExtKt.getModel(ecoDeviceModel) : null);
        pairArr[2] = TuplesKt.to("device_name", ecoDeviceModel != null ? EcoDeviceModelExtKt.getName(ecoDeviceModel) : null);
        pairArr[3] = TuplesKt.to("device_version", ecoDeviceModel != null ? EcoDeviceModelExtKt.getFirmwareVersion(ecoDeviceModel) : null);
        pairArr[4] = TuplesKt.to("name", "course_projection_command");
        pairArr[5] = TuplesKt.to("target_type", "television");
        if (address != null && address.length() != 0) {
            address = MD5Util.MD5(address);
        }
        pairArr[6] = TuplesKt.to("device_did", address);
        pairArr[7] = TuplesKt.to("result", Boolean.valueOf(result));
        pairArr[8] = TuplesKt.to("error_code", Integer.valueOf(errorCode));
        oneTrackExtKt.reportData(OneTrackConstant.EVENT_NAME_CONNECTIVITY, MapsKt__MapsKt.mapOf(pairArr));
    }

    public static /* synthetic */ void report$default(EcoCourseVideoVM ecoCourseVideoVM, boolean z, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            str = "";
        }
        ecoCourseVideoVM.report(z, i, str);
    }

    public static /* synthetic */ void sendCmdToTV$default(EcoCourseVideoVM ecoCourseVideoVM, CastScreenCMD.Operation operation, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        ecoCourseVideoVM.sendCmdToTV(operation, str, j);
    }

    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    @NotNull
    public final Pair<Long, Boolean> getNextSegmentPos(long curPos) {
        if (!hasNextSegment(curPos)) {
            FitnessLogUtils.d(TAG, "getNextSegmentPos: no next " + curPos);
            return new Pair<>(Long.valueOf(curPos), Boolean.TRUE);
        }
        CourseConfigModel.VideoSegment videoSegment = new CourseConfigModel.VideoSegment();
        videoSegment.timeInMills = 1 + curPos;
        CourseConfigModel.VideoSegment videoSegmentCeiling = this.segmentSet.ceiling(videoSegment);
        FitnessLogUtils.d(TAG, "getNextSegmentPos: " + videoSegmentCeiling);
        if (videoSegmentCeiling != null) {
            curPos = videoSegmentCeiling.timeInMills;
        }
        return new Pair<>(Long.valueOf(curPos), Boolean.valueOf(curPos >= this.segmentSet.last().timeInMills));
    }

    @NotNull
    public final Pair<Long, Boolean> getPreSegmentPos(long curPos) {
        if (!hasPreSegment(curPos)) {
            FitnessLogUtils.d(TAG, "getPreSegmentPos: no pre " + curPos);
            return new Pair<>(Long.valueOf(curPos), Boolean.TRUE);
        }
        Object obj = null;
        for (Object obj2 : this.segmentSet) {
            if (((CourseConfigModel.VideoSegment) obj2).timeInMills <= curPos) {
                obj = obj2;
            }
        }
        CourseConfigModel.VideoSegment videoSegment = (CourseConfigModel.VideoSegment) obj;
        if (videoSegment == null) {
            return new Pair<>(Long.valueOf(curPos), Boolean.TRUE);
        }
        CourseConfigModel.VideoSegment videoSegment2 = new CourseConfigModel.VideoSegment();
        videoSegment2.timeInMills = videoSegment.timeInMills - 1;
        CourseConfigModel.VideoSegment videoSegmentFloor = this.segmentSet.floor(videoSegment2);
        FitnessLogUtils.d(TAG, "getPreSegmentPos:  cur = " + videoSegment + "; floor = " + videoSegmentFloor);
        if (videoSegmentFloor != null) {
            curPos = videoSegmentFloor.timeInMills;
        }
        return new Pair<>(Long.valueOf(curPos), Boolean.valueOf(curPos < ((CourseConfigModel.VideoSegment) CollectionsKt___CollectionsKt.elementAt(this.segmentSet, 1)).timeInMills));
    }

    public final boolean hasNextSegment(long curPos) {
        return (this.segmentSet.isEmpty() ^ true) && curPos < this.segmentSet.last().timeInMills;
    }

    public final boolean hasPreSegment(long curPos) {
        return this.segmentSet.size() > 1 && curPos >= ((CourseConfigModel.VideoSegment) CollectionsKt___CollectionsKt.elementAt(this.segmentSet, 1)).timeInMills;
    }

    public final void initMilinkClient() {
        FitnessLogUtils.d(TAG, "milink init start isSupportSendData==" + isSupportSendData());
        MiLinkCastClient miLinkCastClient = new MiLinkCastClient((Context) ApplicationExtKt.getApplication(), true);
        this.mCastClient = miLinkCastClient;
        miLinkCastClient.init(new AnonymousClass1());
        MiLinkCastClient miLinkCastClient2 = this.mCastClient;
        if (miLinkCastClient2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
            miLinkCastClient2 = null;
        }
        miLinkCastClient2.setDataCallback(new AnonymousClass2());
    }

    public final boolean isDataCasting() {
        return this.mConnected && this.isNewTvSdk;
    }

    public final boolean isStartCast() {
        if (!this.isMilinkInit) {
            return true;
        }
        if (this.mConnected) {
            return false;
        }
        this.mUid = UUIDUtilKt.makeUUID(100);
        MiLinkCastClient miLinkCastClient = this.mCastClient;
        if (miLinkCastClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
            miLinkCastClient = null;
        }
        miLinkCastClient.startWithUI(5);
        return true;
    }

    public final boolean isSupportSendData() {
        MiLinkCastClient miLinkCastClient = new MiLinkCastClient((Context) ApplicationExtKt.getApplication(), true);
        this.mCastClient = miLinkCastClient;
        return miLinkCastClient.support("data");
    }

    @Override // com.mi.health.course.activity.eco.EcoCourseBasePlayerVM, defpackage.dvq
    public void onCleared() {
        super.onCleared();
        if (this.isMilinkInit) {
            MiLinkCastClient miLinkCastClient = this.mCastClient;
            if (miLinkCastClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
                miLinkCastClient = null;
            }
            miLinkCastClient.release();
        }
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @NotNull
    public final q prepare(@NotNull String videoUrl, @NotNull Resolution clarity) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(clarity, "clarity");
        q player = getPlayer();
        setClarity(clarity);
        player.I(m.c(videoUrl));
        player.prepare();
        player.z(true);
        return player;
    }

    public final void sendCmdToTV(@NotNull CastScreenCMD.Operation operationCmd, @NotNull String urlPath, long nextProgress) {
        Intrinsics.checkNotNullParameter(operationCmd, "operationCmd");
        Intrinsics.checkNotNullParameter(urlPath, "urlPath");
        if (isDataCasting()) {
            CastScreenCMD.SendVideoCMD sendVideoCMD = new CastScreenCMD.SendVideoCMD();
            int i = 2;
            sendVideoCMD.type = 2;
            sendVideoCMD.uid = this.mUid;
            sendVideoCMD.url = urlPath;
            sendVideoCMD.progress = nextProgress;
            sendVideoCMD.operation = operationCmd.getOperationCmd();
            Resolution savedResolution = ResolutionKt.getSavedResolution();
            if (Intrinsics.areEqual(savedResolution, Resolution720.INSTANCE)) {
                i = 1;
            } else if (!Intrinsics.areEqual(savedResolution, Resolution1080.INSTANCE)) {
                if (!Intrinsics.areEqual(savedResolution, Resolution4K.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 3;
            }
            sendVideoCMD.clarity = i;
            MiLinkCastClient miLinkCastClient = this.mCastClient;
            if (miLinkCastClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
                miLinkCastClient = null;
            }
            String json = getMGson().toJson(sendVideoCMD);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            byte[] bytes = json.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            miLinkCastClient.send(bytes);
            FitnessLogUtils.d(TAG, "sendCmdToTV==" + getMGson().toJson(sendVideoCMD));
        }
    }

    public final void sendDataToTV(@NotNull PhoneSportData phoneSportData, int mode, @Nullable CourseConfigModel.DeviceLinkage deviceLinkage) {
        String str;
        Intrinsics.checkNotNullParameter(phoneSportData, "phoneSportData");
        if (isDataCasting()) {
            CastScreenCMD.CourseData courseData = new CastScreenCMD.CourseData();
            int i = phoneSportData.pace;
            float f = i > 0 ? 3600 / i : 0.0f;
            if (deviceLinkage == null || (str = deviceLinkage.concernedData) == null) {
                str = "";
            }
            courseData.concernedData = str;
            courseData.distance = phoneSportData.distance;
            courseData.calorie = (int) (phoneSportData.calorie / 1000);
            courseData.hrm = phoneSportData.heart_rate;
            courseData.speed = f;
            CastScreenCMD.SendVideoData sendVideoData = new CastScreenCMD.SendVideoData();
            sendVideoData.type = 1;
            sendVideoData.course = Integer.valueOf(mode);
            sendVideoData.courseMode = Integer.valueOf(deviceLinkage != null ? deviceLinkage.style : 1);
            sendVideoData.uid = this.mUid;
            sendVideoData.totalTime = getPlayer().q();
            sendVideoData.currentTime = getSupportDeviceLink() ? phoneSportData.deviceDuration : phoneSportData.duration;
            sendVideoData.maxHr = this.maxHeartRate;
            sendVideoData.data = courseData;
            MiLinkCastClient miLinkCastClient = this.mCastClient;
            if (miLinkCastClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
                miLinkCastClient = null;
            }
            String json = getMGson().toJson(sendVideoData);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            byte[] bytes = json.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            miLinkCastClient.send(bytes);
            FitnessLogUtils.d(TAG, "sendDataToTV==" + getMGson().toJson(sendVideoData));
        }
    }

    public final void sendDeviceStatus(@Nullable CourseConfigModel.DeviceLinkage deviceLinkage) {
        if (isDataCasting()) {
            ArrayList arrayList = new ArrayList();
            if (getDeviceStatusObj().getWearHas()) {
                EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
                arrayList.add(new CastScreenCMD.DeviceInfo(getDeviceStatusObj().getWearName(), getDeviceStatusObj().getWearConnect() ? 1 : 2, (ecoDeviceModel == null || !EcoDeviceModelExtKt.isBandType(ecoDeviceModel)) ? 2 : 1));
            }
            if (getDeviceStatusObj().getSportHas()) {
                arrayList.add(new CastScreenCMD.DeviceInfo(getDeviceStatusObj().getSportName(), getDeviceStatusObj().getSportConnect() ? 1 : 2, 3));
            }
            CastScreenCMD.SendDevicesStatus sendDevicesStatus = new CastScreenCMD.SendDevicesStatus();
            sendDevicesStatus.type = 4;
            sendDevicesStatus.uid = this.mUid;
            sendDevicesStatus.courseMode = deviceLinkage != null ? deviceLinkage.style : 1;
            ArrayList arrayList2 = new ArrayList();
            sendDevicesStatus.deviceInfos = arrayList2;
            arrayList2.addAll(arrayList);
            MiLinkCastClient miLinkCastClient = this.mCastClient;
            if (miLinkCastClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
                miLinkCastClient = null;
            }
            String json = getMGson().toJson(sendDevicesStatus);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            byte[] bytes = json.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            miLinkCastClient.send(bytes);
            FitnessLogUtils.d(TAG, "sendDeviceStatus==" + getMGson().toJson(sendDevicesStatus));
        }
    }

    public final void sendRequestClarity() {
        if (isDataCasting()) {
            CastScreenCMD.SendVideoCMD sendVideoCMD = new CastScreenCMD.SendVideoCMD();
            sendVideoCMD.type = 3;
            sendVideoCMD.uid = this.mUid;
            MiLinkCastClient miLinkCastClient = this.mCastClient;
            if (miLinkCastClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
                miLinkCastClient = null;
            }
            String json = getMGson().toJson(sendVideoCMD);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            byte[] bytes = json.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            miLinkCastClient.send(bytes);
            FitnessLogUtils.d(TAG, "sendRequestClarity==" + getMGson().toJson(sendVideoCMD));
        }
    }

    public final void setClarity(@NotNull Resolution resolution) {
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        FitnessLogUtils.d(TAG, "play: resolution = " + resolution.getRange());
        int iIntValue = resolution.getRange().getSecond().intValue();
        int iIntValue2 = resolution.getRange().getFirst().intValue();
        DefaultTrackSelector trackSelector = getTrackSelector();
        trackSelector.M(trackSelector.v().g().i(iIntValue, iIntValue2).j(iIntValue, iIntValue2).a());
    }

    public final void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public final void setMilinkConnectListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.milinkConnectEmitter = listener;
    }

    public final void setSegments(@NotNull List<? extends CourseConfigModel.VideoSegment> segments) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        for (CourseConfigModel.VideoSegment videoSegment : segments) {
            String time = videoSegment.time;
            Intrinsics.checkNotNullExpressionValue(time, "time");
            videoSegment.timeInMills = CourseAllInfoKt.parseTime(time);
        }
        List<? extends CourseConfigModel.VideoSegment> list = segments;
        this.segmentSet.addAll(list);
        FitnessLogUtils.d(TAG, "setSegments: " + segments);
        if (!list.isEmpty()) {
            this.firstSegmentPos = this.segmentSet.first().timeInMills;
            this.lastSegmentPos = this.segmentSet.last().timeInMills;
        }
    }

    public final void setTVDataListener(@NotNull Function1<? super CastScreenCMD.GetVideoDataFromTV, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.tVDataEmitter = listener;
    }

    public final void stopCast() {
        if (this.mConnected) {
            if (this.isNewTvSdk) {
                sendCmdToTV$default(this, CastScreenCMD.Operation.STOP, null, 0L, 6, null);
            }
            MiLinkCastClient miLinkCastClient = this.mCastClient;
            if (miLinkCastClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
                miLinkCastClient = null;
            }
            miLinkCastClient.stopConnect(5);
        }
    }
}
