package com.mi.health.course.vm;

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
import com.mi.health.course.data.CastScreenCMD;
import com.mi.health.course.data.Resolution;
import com.mi.health.course.data.Resolution1080;
import com.mi.health.course.data.Resolution4K;
import com.mi.health.course.data.Resolution720;
import com.mi.health.course.data.ResolutionKt;
import com.mi.health.course.export.data.CourseAllInfoKt;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.util.LogUtil;
import com.mi.health.course.util.UUIDUtilKt;
import com.mi.health.course.vm.CourseVideoVM;
import com.milink.sdk.cast.MiLinkDevice;
import com.milink.sdk.client.MiLinkCastCallback;
import com.milink.sdk.client.MiLinkCastClient;
import com.milink.sdk.client.MiLinkDataCallback;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingConst;
import com.xiaomi.smarthome.homeroom.model.Home;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002pqB\t\b\u0007¢\u0006\u0004\bo\u0010/J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010!\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b'\u0010&J!\u0010)\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00070(2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00070(2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J\u001f\u00103\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00102\u001a\u00020\t¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00102\u001a\u00020\t¢\u0006\u0004\b5\u00104J\u001d\u00106\u001a\u00020\u00042\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\t¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0004¢\u0006\u0004\b8\u0010/J\r\u00109\u001a\u00020\u0007¢\u0006\u0004\b9\u0010-J\r\u0010:\u001a\u00020\u0007¢\u0006\u0004\b:\u0010-J\r\u0010;\u001a\u00020\u0004¢\u0006\u0004\b;\u0010/J'\u0010A\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\t2\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BJ)\u0010G\u001a\u00020\u00042\u0006\u0010D\u001a\u00020C2\b\b\u0002\u0010E\u001a\u00020\u000b2\b\b\u0002\u0010F\u001a\u00020#¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\u0004¢\u0006\u0004\bI\u0010/J\u0017\u0010J\u001a\u00020\u00042\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0004H\u0014¢\u0006\u0004\bL\u0010/R#\u0010S\u001a\n N*\u0004\u0018\u00010M0M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010UR\u0016\u0010W\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010UR\u0016\u0010Y\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R$\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R$\u0010_\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010^R\"\u0010`\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020\u001f0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010l\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010n\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010m¨\u0006r"}, d2 = {"Lcom/mi/health/course/vm/CourseVideoVM;", "Lcom/mi/health/course/vm/CourseBasePlayerVM;", "", "data", "", "handleTVData", "([B)V", "", "result", "", "errorCode", "", Home.JSON_KEY_ADDRESS, "report", "(ZILjava/lang/String;)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setMilinkConnectListener", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/mi/health/course/data/CastScreenCMD$GetVideoDataFromTV;", "setTVDataListener", "Lcom/mi/health/course/data/Resolution;", "resolution", "setClarity", "(Lcom/mi/health/course/data/Resolution;)V", "videoUrl", "clarity", "Lcom/google/android/exoplayer2/q;", "prepare", "(Ljava/lang/String;Lcom/mi/health/course/data/Resolution;)Lcom/google/android/exoplayer2/q;", "", "Lcom/mi/health/course/export/data/CourseConfigModel$VideoSegment;", "segments", "setSegments", "(Ljava/util/List;)V", "", "curPos", "hasNextSegment", "(J)Z", "hasPreSegment", "Lkotlin/Pair;", "getNextSegmentPos", "(J)Lkotlin/Pair;", "getPreSegmentPos", "isSupportSendData", "()Z", "onInit", "()V", "Lcom/milink/sdk/cast/MiLinkDevice;", "p0", GlobalDynamicSettingConst.COUNTRY_DOMAIN_PV, "onConnected", "(Lcom/milink/sdk/cast/MiLinkDevice;I)V", "onDisconnected", "onFailure", "(II)V", "initMilinkClient", "isStartCast", "isDataCasting", "stopCast", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "phoneSportData", "mode", "Lcom/mi/health/course/export/data/CourseConfigModel$DeviceLinkage;", "deviceLinkage", "sendDataToTV", "(Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;ILcom/mi/health/course/export/data/CourseConfigModel$DeviceLinkage;)V", "Lcom/mi/health/course/data/CastScreenCMD$Operation;", "operationCmd", "urlPath", "nextProgress", "sendCmdToTV", "(Lcom/mi/health/course/data/CastScreenCMD$Operation;Ljava/lang/String;J)V", "sendRequestClarity", "sendDeviceStatus", "(Lcom/mi/health/course/export/data/CourseConfigModel$DeviceLinkage;)V", "onCleared", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "mGson$delegate", "Lkotlin/Lazy;", "getMGson", "()Lcom/google/gson/Gson;", "mGson", "mConnected", "Z", "isMilinkInit", "isNewTvSdk", "Lcom/milink/sdk/client/MiLinkCastClient;", "mCastClient", "Lcom/milink/sdk/client/MiLinkCastClient;", "mUid", "Ljava/lang/String;", "milinkConnectEmitter", "Lkotlin/jvm/functions/Function1;", "tVDataEmitter", "maxHeartRate", "I", "getMaxHeartRate", "()I", "setMaxHeartRate", "(I)V", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "Ljava/util/TreeSet;", "segmentSet", "Ljava/util/TreeSet;", "lastSegmentPos", "J", "firstSegmentPos", "<init>", "MyMiLinkCastCallback", "StaticDataCallback", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCourseVideoVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseVideoVM.kt\ncom/mi/health/course/vm/CourseVideoVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,346:1\n1863#2,2:347\n1#3:349\n*S KotlinDebug\n*F\n+ 1 CourseVideoVM.kt\ncom/mi/health/course/vm/CourseVideoVM\n*L\n83#1:347,2\n*E\n"})
public final class CourseVideoVM extends CourseBasePlayerVM {
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
    private final Lazy mGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wy4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseVideoVM.mGson_delegate$lambda$0();
        }
    });

    @NotNull
    private String mUid = "";

    @NotNull
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    @NotNull
    private final TreeSet<CourseConfigModel.VideoSegment> segmentSet = new TreeSet<>();
    private long firstSegmentPos = Long.MAX_VALUE;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0016\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/mi/health/course/vm/CourseVideoVM$MyMiLinkCastCallback;", "Lcom/milink/sdk/client/MiLinkCastCallback;", "vm", "Lcom/mi/health/course/vm/CourseVideoVM;", "<init>", "(Lcom/mi/health/course/vm/CourseVideoVM;)V", "ref", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "setRef", "(Ljava/lang/ref/WeakReference;)V", "onInit", "", "onConnected", "p0", "Lcom/milink/sdk/cast/MiLinkDevice;", GlobalDynamicSettingConst.COUNTRY_DOMAIN_PV, "", "onConnectionChange", "p2", "onPrivateProtectChange", "onDisconnected", "onFailure", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MyMiLinkCastCallback extends MiLinkCastCallback {

        @Nullable
        private WeakReference<CourseVideoVM> ref;

        public MyMiLinkCastCallback(@NotNull CourseVideoVM vm) {
            Intrinsics.checkNotNullParameter(vm, "vm");
            this.ref = new WeakReference<>(vm);
        }

        @Nullable
        public final WeakReference<CourseVideoVM> getRef() {
            return this.ref;
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onConnected(@Nullable MiLinkDevice p0, int p1) {
            CourseVideoVM courseVideoVM;
            WeakReference<CourseVideoVM> weakReference = this.ref;
            if (weakReference == null || (courseVideoVM = weakReference.get()) == null) {
                return;
            }
            courseVideoVM.onConnected(p0, p1);
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onConnectionChange(int p0, @Nullable MiLinkDevice p1, int p2) {
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onDisconnected(@Nullable MiLinkDevice p0, int p1) {
            CourseVideoVM courseVideoVM;
            WeakReference<CourseVideoVM> weakReference = this.ref;
            if (weakReference == null || (courseVideoVM = weakReference.get()) == null) {
                return;
            }
            courseVideoVM.onDisconnected(p0, p1);
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onFailure(int p0, int p1) {
            CourseVideoVM courseVideoVM;
            WeakReference<CourseVideoVM> weakReference = this.ref;
            if (weakReference == null || (courseVideoVM = weakReference.get()) == null) {
                return;
            }
            courseVideoVM.onFailure(p0, p1);
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onInit() {
            CourseVideoVM courseVideoVM;
            WeakReference<CourseVideoVM> weakReference = this.ref;
            if (weakReference == null || (courseVideoVM = weakReference.get()) == null) {
                return;
            }
            courseVideoVM.onInit();
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onPrivateProtectChange(int p0, int p1) {
        }

        public final void setRef(@Nullable WeakReference<CourseVideoVM> weakReference) {
            this.ref = weakReference;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/mi/health/course/vm/CourseVideoVM$StaticDataCallback;", "Lcom/milink/sdk/client/MiLinkDataCallback;", "vmRef", "Ljava/lang/ref/WeakReference;", "Lcom/mi/health/course/vm/CourseVideoVM;", "<init>", "(Ljava/lang/ref/WeakReference;)V", "getVmRef", "()Ljava/lang/ref/WeakReference;", "onReceived", "", "data", "", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StaticDataCallback extends MiLinkDataCallback {

        @NotNull
        private final WeakReference<CourseVideoVM> vmRef;

        public StaticDataCallback(@NotNull WeakReference<CourseVideoVM> vmRef) {
            Intrinsics.checkNotNullParameter(vmRef, "vmRef");
            this.vmRef = vmRef;
        }

        @NotNull
        public final WeakReference<CourseVideoVM> getVmRef() {
            return this.vmRef;
        }

        @Override // com.milink.sdk.cast.IMiLinkDataCallback
        public void onReceived(@Nullable byte[] data) {
            CourseVideoVM courseVideoVM = this.vmRef.get();
            if (courseVideoVM != null) {
                courseVideoVM.handleTVData(data);
            }
        }
    }

    private final Gson getMGson() {
        return (Gson) this.mGson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTVData(byte[] data) {
        if (data == null) {
            return;
        }
        final CastScreenCMD.GetVideoDataFromTV getVideoDataFromTV = (CastScreenCMD.GetVideoDataFromTV) getMGson().fromJson(new String(data, Charsets.UTF_8), CastScreenCMD.GetVideoDataFromTV.class);
        this.mHandler.post(new Runnable() { // from class: xy4
            @Override // java.lang.Runnable
            public final void run() {
                CourseVideoVM.handleTVData$lambda$8(this.f39577a, getVideoDataFromTV);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleTVData$lambda$8(CourseVideoVM this$0, CastScreenCMD.GetVideoDataFromTV getVideoDataFromTV) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super CastScreenCMD.GetVideoDataFromTV, Unit> function1 = this$0.tVDataEmitter;
        if (function1 != null) {
            Intrinsics.checkNotNull(getVideoDataFromTV);
            function1.invoke2(getVideoDataFromTV);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$0() {
        return new GsonBuilder().disableHtmlEscaping().create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConnected$lambda$6(CourseVideoVM this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Boolean, Unit> function1 = this$0.milinkConnectEmitter;
        if (function1 != null) {
            function1.invoke2(Boolean.valueOf(this$0.mConnected));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDisconnected$lambda$7(CourseVideoVM this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Boolean, Unit> function1 = this$0.milinkConnectEmitter;
        if (function1 != null) {
            function1.invoke2(Boolean.valueOf(this$0.mConnected));
        }
    }

    private final void report(boolean result, int errorCode, String address) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[9];
        pairArr[0] = TuplesKt.to("tip", "56.53.1.1.22973");
        pairArr[1] = TuplesKt.to("device_model", wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null);
        pairArr[2] = TuplesKt.to("device_name", wearableDeviceModel != null ? DeviceModelExtKt.getName(wearableDeviceModel) : null);
        pairArr[3] = TuplesKt.to("device_version", wearableDeviceModel != null ? DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel) : null);
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

    public static /* synthetic */ void report$default(CourseVideoVM courseVideoVM, boolean z, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            str = "";
        }
        courseVideoVM.report(z, i, str);
    }

    public static /* synthetic */ void sendCmdToTV$default(CourseVideoVM courseVideoVM, CastScreenCMD.Operation operation, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        courseVideoVM.sendCmdToTV(operation, str, j);
    }

    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    @NotNull
    public final Pair<Long, Boolean> getNextSegmentPos(long curPos) {
        if (!hasNextSegment(curPos)) {
            LogUtil.INSTANCE.d("CoursePlayerVideoVM", "getNextSegmentPos: no next " + curPos);
            return new Pair<>(Long.valueOf(curPos), Boolean.TRUE);
        }
        CourseConfigModel.VideoSegment videoSegment = new CourseConfigModel.VideoSegment();
        videoSegment.timeInMills = 1 + curPos;
        CourseConfigModel.VideoSegment videoSegmentCeiling = this.segmentSet.ceiling(videoSegment);
        LogUtil.INSTANCE.d("CoursePlayerVideoVM", "getNextSegmentPos: " + videoSegmentCeiling);
        if (videoSegmentCeiling != null) {
            curPos = videoSegmentCeiling.timeInMills;
        }
        return new Pair<>(Long.valueOf(curPos), Boolean.valueOf(curPos >= this.segmentSet.last().timeInMills));
    }

    @NotNull
    public final Pair<Long, Boolean> getPreSegmentPos(long curPos) {
        if (!hasPreSegment(curPos)) {
            LogUtil.INSTANCE.d("CoursePlayerVideoVM", "getPreSegmentPos: no pre " + curPos);
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
        LogUtil.INSTANCE.d("CoursePlayerVideoVM", "getPreSegmentPos:  cur = " + videoSegment + "; floor = " + videoSegmentFloor);
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
        LogUtil.INSTANCE.i("castScreen", "milink init start isSupportSendData==" + isSupportSendData());
        MiLinkCastClient miLinkCastClient = new MiLinkCastClient((Context) ApplicationExtKt.getApplication(), true);
        this.mCastClient = miLinkCastClient;
        miLinkCastClient.init(new MyMiLinkCastCallback(this));
        MiLinkCastClient miLinkCastClient2 = this.mCastClient;
        if (miLinkCastClient2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
            miLinkCastClient2 = null;
        }
        miLinkCastClient2.setDataCallback(new StaticDataCallback(new WeakReference(this)));
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

    @Override // com.mi.health.course.vm.CourseBasePlayerVM, defpackage.dvq
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

    public final void onConnected(@Nullable MiLinkDevice p0, int p1) {
        String wifiMac;
        setOtherDevice(p0 != null ? p0.getName() : null);
        this.mConnected = true;
        boolean zAreEqual = Intrinsics.areEqual(p0 != null ? p0.getType() : null, MiLinkDevice.TYPE_MIPLAY_DATA);
        this.isNewTvSdk = zAreEqual;
        LogUtil.INSTANCE.i("castScreen", "milink connected isNewTvSdk=" + zAreEqual);
        if (this.isNewTvSdk) {
            this.mHandler.post(new Runnable() { // from class: vy4
                @Override // java.lang.Runnable
                public final void run() {
                    CourseVideoVM.onConnected$lambda$6(this.f37355a);
                }
            });
            sendRequestClarity();
        }
        if (p0 == null || (wifiMac = p0.getWifiMac()) == null) {
            wifiMac = "";
        }
        report$default(this, true, 0, wifiMac, 2, null);
    }

    public final void onDisconnected(@Nullable MiLinkDevice p0, int p1) {
        LogUtil.INSTANCE.i("castScreen", "milink onDisconnected");
        this.mConnected = false;
        if (this.isNewTvSdk) {
            this.mHandler.post(new Runnable() { // from class: yy4
                @Override // java.lang.Runnable
                public final void run() {
                    CourseVideoVM.onDisconnected$lambda$7(this.f40680a);
                }
            });
        }
    }

    public final void onFailure(int p0, int p1) {
        LogUtil.INSTANCE.i("castScreen", "milink onFailure code==" + p0 + "  *** flag==" + p1);
        this.mConnected = false;
        report$default(this, false, p0, null, 4, null);
    }

    public final void onInit() {
        this.isMilinkInit = true;
        LogUtil.INSTANCE.i("castScreen", "milink init success");
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
            LogUtil.INSTANCE.i("castScreen", "sendCmdToTV==" + getMGson().toJson(sendVideoCMD));
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
            LogUtil.INSTANCE.d("castScreen", "sendDataToTV==" + getMGson().toJson(sendVideoData));
        }
    }

    public final void sendDeviceStatus(@Nullable CourseConfigModel.DeviceLinkage deviceLinkage) {
        if (isDataCasting()) {
            ArrayList arrayList = new ArrayList();
            if (getDeviceStatusObj().getWearHas()) {
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                arrayList.add(new CastScreenCMD.DeviceInfo(getDeviceStatusObj().getWearName(), getDeviceStatusObj().getWearConnect() ? 1 : 2, (wearableDeviceModel == null || !DeviceModelExtKt.isBandType(wearableDeviceModel)) ? 2 : 1));
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
            LogUtil.INSTANCE.i("castScreen", "sendDeviceStatus==" + getMGson().toJson(sendDevicesStatus));
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
            LogUtil.INSTANCE.i("castScreen", "sendRequestClarity==" + getMGson().toJson(sendVideoCMD));
        }
    }

    public final void setClarity(@NotNull Resolution resolution) {
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        LogUtil.INSTANCE.d("CoursePlayerVideoVM", "play: resolution = " + resolution.getRange());
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
        LogUtil.INSTANCE.i("CoursePlayerVideoVM", "setSegments: " + segments);
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
