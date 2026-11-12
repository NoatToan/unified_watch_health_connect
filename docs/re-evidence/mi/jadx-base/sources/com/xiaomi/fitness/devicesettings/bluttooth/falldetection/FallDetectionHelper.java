package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import android.annotation.SuppressLint;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionGetMapUrlResult;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionHelper;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionReportPositionResult;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.sport_manager_export.utils.GnssStatusCompat;
import com.xiaomi.fitness.sync.export.di.SyncExtKt;
import com.xiaomi.fitness.sync.export.di.WeatherSyncManager;
import defpackage.bxa;
import defpackage.eg4;
import defpackage.gg4;
import defpackage.kah;
import defpackage.qyi;
import defpackage.r72;
import defpackage.wzi;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bV\u0010\u001eJ/\u0010\u0007\u001a\u00020\u00052\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J5\u0010$\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\"2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0003¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b,\u0010+J\u0015\u0010-\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b-\u0010+J\r\u0010.\u001a\u00020\u0005¢\u0006\u0004\b.\u0010\u001eR\u001a\u0010/\u001a\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010'R\u001a\u00102\u001a\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010'R\u001a\u00104\u001a\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u0010'R(\u00108\u001a\b\u0012\u0004\u0012\u000207068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010A\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00100\u001a\u0004\bB\u0010'\"\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u00100R\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\bT\u00100R\u0016\u0010U\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u00100¨\u0006W"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionHelper;", "", "Lkotlin/Function3;", "", "", "", "position", "getLocation", "(Lkotlin/jvm/functions/Function3;)V", "requestTTS", "(Ljava/lang/String;)V", MiuiCursorConstants.CONTENT, "saveTTSFile", "path", "sendTTSFileToDevice", "reportId", "", "reason", "startTimer", "(Ljava/lang/String;I)V", "longitude", "latitude", "reportPosition", "(Ljava/lang/String;DD)V", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionGetMapUrlResult;", "success", "getFallHelpMapUrl", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "stopTimer", "()V", "getShareLocationDurationText", "(Ljava/lang/String;)Ljava/lang/String;", "mapUrl", "", "contacts", "sendSms", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)V", "getSatelliteCount", "()I", "Lgg4;", "helpRequest", "applyFallDetection", "(Lgg4;)V", "applySos", "applyShareLocation", "endFallDetectionHelp", "REASON_FALL_DETECTION", "I", "getREASON_FALL_DETECTION", "REASON_ONLYSOS", "getREASON_ONLYSOS", "REASON_SHARE_DETECTION", "getREASON_SHARE_DETECTION", "", "Leg4;", "sLocalEmergencyContactList", "Ljava/util/List;", "getSLocalEmergencyContactList", "()Ljava/util/List;", "setSLocalEmergencyContactList", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionRequest;", "fallDetectionRequest", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionRequest;", "currentReason", "getCurrentReason", "setCurrentReason", "(I)V", "Landroid/speech/tts/TextToSpeech;", "mSpeech", "Landroid/speech/tts/TextToSpeech;", "Ljava/util/TimerTask;", "timerTask", "Ljava/util/TimerTask;", "Ljava/util/Timer;", "timer", "Ljava/util/Timer;", "reportCount", "Landroid/location/LocationManager;", "locationManager", "Landroid/location/LocationManager;", "TAG", "Ljava/lang/String;", "REPORT_MAX", "reportDuration", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FallDetectionHelper {
    private static final int REASON_FALL_DETECTION = 0;
    private static final int REPORT_MAX = 1440;

    @NotNull
    private static final String TAG = "FallDetectionHelper";

    @NotNull
    private static final LocationManager locationManager;

    @Nullable
    private static TextToSpeech mSpeech;
    private static int reportCount;
    private static int reportDuration;

    @Nullable
    private static Timer timer;

    @Nullable
    private static TimerTask timerTask;

    @NotNull
    public static final FallDetectionHelper INSTANCE = new FallDetectionHelper();
    private static final int REASON_ONLYSOS = 1;
    private static final int REASON_SHARE_DETECTION = 2;

    @NotNull
    private static List<eg4> sLocalEmergencyContactList = new ArrayList();

    @NotNull
    private static final FallDetectionRequest fallDetectionRequest = new FallDetectionRequest();
    private static int currentReason = -1;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionHelper$applyShareLocation$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionHelper$applyShareLocation$1", f = "FallDetectionHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ gg4 $helpRequest;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(gg4 gg4Var, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$helpRequest = gg4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(final gg4 gg4Var, final String[] strArr, final double d, final double d2, final String str) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jAbs = Math.abs(new Random().nextLong());
            StringBuilder sb = new StringBuilder();
            sb.append(jCurrentTimeMillis);
            sb.append(jAbs);
            final String string = sb.toString();
            FallDetectionHelper.INSTANCE.getFallHelpMapUrl(string, new Function1() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.d
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FallDetectionHelper.AnonymousClass1.invokeSuspend$lambda$1$lambda$0(string, d2, d, gg4Var, str, strArr, (FallDetectionGetMapUrlResult) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1$lambda$0(String str, double d, double d2, gg4 gg4Var, String str2, String[] strArr, FallDetectionGetMapUrlResult fallDetectionGetMapUrlResult) {
            FallDetectionHelper fallDetectionHelper = FallDetectionHelper.INSTANCE;
            fallDetectionHelper.reportPosition(str, d, d2);
            fallDetectionHelper.startTimer(str, gg4Var.d);
            Logger.i(FallDetectionHelper.TAG, str + " getFallHelpMapUrl success: " + fallDetectionGetMapUrlResult.getMessage_url());
            fallDetectionHelper.sendSms(str2, fallDetectionGetMapUrlResult.getMessage_url(), strArr, fallDetectionHelper.getREASON_SHARE_DETECTION());
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$helpRequest, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final String[] strArr = this.$helpRequest.c;
            if (strArr == null || strArr.length == 0) {
                Logger.i(FallDetectionHelper.TAG, "contacts empty, can not send sms");
                return Unit.INSTANCE;
            }
            if (PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ACCESS_FINE_LOCATION") && PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                FallDetectionHelper fallDetectionHelper = FallDetectionHelper.INSTANCE;
                final gg4 gg4Var = this.$helpRequest;
                fallDetectionHelper.getLocation(new Function3() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.e
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        return FallDetectionHelper.AnonymousClass1.invokeSuspend$lambda$1(gg4Var, strArr, ((Double) obj2).doubleValue(), ((Double) obj3).doubleValue(), (String) obj4);
                    }
                });
            } else {
                Logger.i(FallDetectionHelper.TAG, "no location permission!");
                FallDetectionHelper fallDetectionHelper2 = FallDetectionHelper.INSTANCE;
                fallDetectionHelper2.sendSms("", "", strArr, fallDetectionHelper2.getREASON_SHARE_DETECTION());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionHelper$applySos$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionHelper$applySos$1", f = "FallDetectionHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ gg4 $helpRequest;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20671(gg4 gg4Var, Continuation<? super C20671> continuation) {
            super(2, continuation);
            this.$helpRequest = gg4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(final gg4 gg4Var, final String[] strArr, final double d, final double d2, final String str) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jAbs = Math.abs(new Random().nextLong());
            StringBuilder sb = new StringBuilder();
            sb.append(jCurrentTimeMillis);
            sb.append(jAbs);
            final String string = sb.toString();
            FallDetectionHelper.INSTANCE.getFallHelpMapUrl(string, new Function1() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.g
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FallDetectionHelper.C20671.invokeSuspend$lambda$1$lambda$0(string, d2, d, gg4Var, str, strArr, (FallDetectionGetMapUrlResult) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1$lambda$0(String str, double d, double d2, gg4 gg4Var, String str2, String[] strArr, FallDetectionGetMapUrlResult fallDetectionGetMapUrlResult) {
            FallDetectionHelper fallDetectionHelper = FallDetectionHelper.INSTANCE;
            fallDetectionHelper.reportPosition(str, d, d2);
            fallDetectionHelper.startTimer(str, gg4Var.d);
            Logger.i(FallDetectionHelper.TAG, str + " getFallHelpMapUrl success: " + fallDetectionGetMapUrlResult.getMessage_url());
            fallDetectionHelper.sendSms(str2, fallDetectionGetMapUrlResult.getMessage_url(), strArr, fallDetectionHelper.getREASON_ONLYSOS());
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20671(this.$helpRequest, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final String[] strArr = this.$helpRequest.c;
            if (strArr == null || strArr.length == 0) {
                Logger.i(FallDetectionHelper.TAG, "contacts empty, can not send sms");
                return Unit.INSTANCE;
            }
            if (PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ACCESS_FINE_LOCATION") && PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                FallDetectionHelper fallDetectionHelper = FallDetectionHelper.INSTANCE;
                final gg4 gg4Var = this.$helpRequest;
                fallDetectionHelper.getLocation(new Function3() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.f
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        return FallDetectionHelper.C20671.invokeSuspend$lambda$1(gg4Var, strArr, ((Double) obj2).doubleValue(), ((Double) obj3).doubleValue(), (String) obj4);
                    }
                });
            } else {
                Logger.i(FallDetectionHelper.TAG, "no location permission!");
                FallDetectionHelper fallDetectionHelper2 = FallDetectionHelper.INSTANCE;
                fallDetectionHelper2.sendSms("", "", strArr, fallDetectionHelper2.getREASON_ONLYSOS());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionHelper$getLocation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionHelper$getLocation$1", "Lkah;", "", "latitude", "longitude", "altitude", "", "locationSuccess", "(DDD)V", "", Constants.EXTRA_ERROR_MESSAGE, "locationFail", "(Ljava/lang/String;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C20681 implements kah {
        final /* synthetic */ Function3<Double, Double, String, Unit> $position;

        /* JADX WARN: Multi-variable type inference failed */
        public C20681(Function3<? super Double, ? super Double, ? super String, Unit> function3) {
            this.$position = function3;
        }

        @Override // defpackage.kah
        public void locationFail(String errorMsg) {
            Logger.i(FallDetectionHelper.TAG, "locationFail: " + errorMsg);
            Function3<Double, Double, String, Unit> function3 = this.$position;
            Double dValueOf = Double.valueOf(0.0d);
            function3.invoke(dValueOf, dValueOf, "");
        }

        @Override // defpackage.kah
        public void locationSuccess(double latitude, double longitude, double altitude) {
            Logger.i(FallDetectionHelper.TAG, "location latitude: " + latitude + ", longitude: " + longitude);
            double[] dArrB = bxa.b(latitude, longitude);
            Intrinsics.checkNotNull(dArrB);
            String string = Arrays.toString(ArraysKt___ArraysJvmKt.toTypedArray(dArrB));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Logger.i(FallDetectionHelper.TAG, "GPS84: " + string);
            AnyExtKt.io$default(null, new FallDetectionHelper$getLocation$1$locationSuccess$1(dArrB, this, this.$position, null), 1, null);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionHelper$startTimer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionHelper$startTimer$1", "Ljava/util/TimerTask;", "run", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C20721 extends TimerTask {
        final /* synthetic */ String $reportId;

        public C20721(String str) {
            this.$reportId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit run$lambda$0(String reportId, double d, double d2, String str) {
            Intrinsics.checkNotNullParameter(reportId, "$reportId");
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            FallDetectionHelper.INSTANCE.reportPosition(reportId, d2, d);
            return Unit.INSTANCE;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            FallDetectionHelper.reportCount++;
            if (FallDetectionHelper.reportCount > FallDetectionHelper.reportDuration) {
                FallDetectionHelper.INSTANCE.stopTimer();
                return;
            }
            FallDetectionHelper fallDetectionHelper = FallDetectionHelper.INSTANCE;
            final String str = this.$reportId;
            fallDetectionHelper.getLocation(new Function3() { // from class: o99
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FallDetectionHelper.C20721.run$lambda$0(str, ((Double) obj).doubleValue(), ((Double) obj2).doubleValue(), (String) obj3);
                }
            });
        }
    }

    static {
        Object systemService = ApplicationExtKt.getApplication().getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        locationManager = (LocationManager) systemService;
        reportDuration = REPORT_MAX;
    }

    private FallDetectionHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyFallDetection$lambda$1(final gg4 helpRequest, final double d, final double d2, final String positionName) {
        Intrinsics.checkNotNullParameter(helpRequest, "$helpRequest");
        Intrinsics.checkNotNullParameter(positionName, "positionName");
        FallDetectionHelper fallDetectionHelper = INSTANCE;
        fallDetectionHelper.requestTTS(positionName);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jAbs = Math.abs(new Random().nextLong());
        StringBuilder sb = new StringBuilder();
        sb.append(jCurrentTimeMillis);
        sb.append(jAbs);
        final String string = sb.toString();
        final String[] strArr = helpRequest.c;
        if (strArr == null || strArr.length == 0) {
            Logger.i(TAG, "contacts empty, can not send sms");
            return Unit.INSTANCE;
        }
        fallDetectionHelper.getFallHelpMapUrl(string, new Function1() { // from class: k99
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FallDetectionHelper.applyFallDetection$lambda$1$lambda$0(string, d2, d, helpRequest, positionName, strArr, (FallDetectionGetMapUrlResult) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyFallDetection$lambda$1$lambda$0(String reportId, double d, double d2, gg4 helpRequest, String positionName, String[] strArr, FallDetectionGetMapUrlResult result) {
        Intrinsics.checkNotNullParameter(reportId, "$reportId");
        Intrinsics.checkNotNullParameter(helpRequest, "$helpRequest");
        Intrinsics.checkNotNullParameter(positionName, "$positionName");
        Intrinsics.checkNotNullParameter(result, "result");
        FallDetectionHelper fallDetectionHelper = INSTANCE;
        fallDetectionHelper.reportPosition(reportId, d, d2);
        fallDetectionHelper.startTimer(reportId, helpRequest.d);
        Logger.i(TAG, reportId + " getFallHelpMapUrl success: " + result.getMessage_url());
        fallDetectionHelper.sendSms(positionName, result.getMessage_url(), strArr, REASON_FALL_DETECTION);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getFallHelpMapUrl(String reportId, Function1<? super FallDetectionGetMapUrlResult, Unit> success) {
        fallDetectionRequest.getFallDetectionHelpSms(reportId, success, new Function1() { // from class: h99
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FallDetectionHelper.getFallHelpMapUrl$lambda$4((ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFallHelpMapUrl$lambda$4(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "get map url fail: " + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getLocation(Function3<? super Double, ? super Double, ? super String, Unit> position) {
        SyncExtKt.getInstance(WeatherSyncManager.INSTANCE).requestLocation(ApplicationExtKt.getApplication(), false, new C20681(position));
    }

    @SuppressLint({"MissingPermission"})
    private final int getSatelliteCount() {
        GpsStatus gpsStatus = locationManager.getGpsStatus(null);
        int i = 0;
        if (gpsStatus == null) {
            return 0;
        }
        int maxSatellites = gpsStatus.getMaxSatellites();
        Iterator<GpsSatellite> it = gpsStatus.getSatellites().iterator();
        while (it.hasNext() && i <= maxSatellites) {
            if (it.next().usedInFix()) {
                i++;
            }
        }
        Logger.i(TAG, "get used satellite count: " + i);
        return i;
    }

    private final String getShareLocationDurationText(String position) {
        int i = reportDuration / 60;
        if (i == 1) {
            String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qyi.f31975r, 1, 1, position);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return quantityString;
        }
        if (i != 24) {
            return ResourceExtKt.getString(wzi.d7, position);
        }
        String quantityString2 = ApplicationExtKt.getApplication().getResources().getQuantityString(qyi.f31975r, 24, 24, position);
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        return quantityString2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportPosition(String reportId, double longitude, double latitude) {
        Logger.i(TAG, "reportPosition count: " + reportCount);
        int accuracyStatus = GnssStatusCompat.INSTANCE.getAccuracyStatus();
        Logger.i(TAG, "gnss status: " + accuracyStatus);
        fallDetectionRequest.reportFallDetectionPosition(reportId, longitude, latitude, accuracyStatus != 3 ? 1 : 3, new Function1() { // from class: i99
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FallDetectionHelper.reportPosition$lambda$2((FallDetectionReportPositionResult) obj);
            }
        }, new Function1() { // from class: j99
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FallDetectionHelper.reportPosition$lambda$3((ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportPosition$lambda$2(FallDetectionReportPositionResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "report " + reportCount + " success");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportPosition$lambda$3(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "report " + reportCount + " fail: " + it);
        return Unit.INSTANCE;
    }

    private final void requestTTS(final String position) {
        mSpeech = new TextToSpeech(ApplicationExtKt.getApplication(), new TextToSpeech.OnInitListener() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionHelper.requestTTS.1
            @Override // android.speech.tts.TextToSpeech.OnInitListener
            public void onInit(int status) {
                Logger.i(FallDetectionHelper.TAG, "init tts engine: " + status);
                if (status != 0) {
                    FallDetectionHelper.mSpeech = null;
                    return;
                }
                TextToSpeech textToSpeech = FallDetectionHelper.mSpeech;
                if (textToSpeech != null) {
                    textToSpeech.setSpeechRate(1.0f);
                }
                TextToSpeech textToSpeech2 = FallDetectionHelper.mSpeech;
                Integer numValueOf = textToSpeech2 != null ? Integer.valueOf(textToSpeech2.setLanguage(Locale.getDefault())) : null;
                if ((numValueOf == null || numValueOf.intValue() != -1) && (numValueOf == null || numValueOf.intValue() != -2)) {
                    FallDetectionHelper.INSTANCE.saveTTSFile(ResourceExtKt.getString(wzi.q4, position));
                    return;
                }
                Logger.i(FallDetectionHelper.TAG, "tts can't set to " + Locale.getDefault().getDisplayName());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveTTSFile(String content) {
        final String str = r72.f("SosAudio") + File.separator + System.currentTimeMillis() + ".wav";
        final File file = new File(str);
        TextToSpeech textToSpeech = mSpeech;
        Integer numValueOf = textToSpeech != null ? Integer.valueOf(textToSpeech.synthesizeToFile(content, (Bundle) null, file, String.valueOf(System.currentTimeMillis()))) : null;
        Logger.i(TAG, "intent save tts audio to " + str + " " + numValueOf);
        if (numValueOf == null || numValueOf.intValue() != 0) {
            mSpeech = null;
            return;
        }
        TextToSpeech textToSpeech2 = mSpeech;
        if (textToSpeech2 != null) {
            textToSpeech2.setOnUtteranceProgressListener(new UtteranceProgressListener() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionHelper.saveTTSFile.1
                @Override // android.speech.tts.UtteranceProgressListener
                public void onDone(String utteranceId) {
                    Logger.i(FallDetectionHelper.TAG, "save tts file: " + utteranceId + " onDone, length: " + file.length());
                    FallDetectionHelper.INSTANCE.sendTTSFileToDevice(str);
                }

                @Override // android.speech.tts.UtteranceProgressListener
                public void onError(String utteranceId) {
                    Logger.i(FallDetectionHelper.TAG, "save tts file: " + utteranceId);
                    FallDetectionHelper.mSpeech = null;
                }

                @Override // android.speech.tts.UtteranceProgressListener
                public void onStart(String utteranceId) {
                    Logger.i(FallDetectionHelper.TAG, "save tts file: " + utteranceId + " onStart");
                }

                @Override // android.speech.tts.UtteranceProgressListener
                public void onError(String utteranceId, int errorCode) {
                    Logger.i(FallDetectionHelper.TAG, "save tts file: " + utteranceId + " onError: " + errorCode);
                    FallDetectionHelper.mSpeech = null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSms(String position, String mapUrl, String[] contacts, int reason) {
        String shareLocationDurationText;
        try {
            if (reason == REASON_ONLYSOS) {
                shareLocationDurationText = ResourceExtKt.getString(wzi.J3, position);
            } else if (reason == REASON_FALL_DETECTION) {
                shareLocationDurationText = ResourceExtKt.getString(wzi.o4, position);
            } else {
                shareLocationDurationText = reason == REASON_SHARE_DETECTION ? getShareLocationDurationText(position) : "";
            }
            if (position.length() == 0) {
                shareLocationDurationText = ResourceExtKt.getString(wzi.K3);
            }
            String str = shareLocationDurationText + mapUrl;
            int length = contacts.length;
            for (final int i = 0; i < length; i++) {
                NotifyHelperExtKt.getNotificationManagerExport().sendSmsExport(contacts[i], str, new Function1() { // from class: m99
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return FallDetectionHelper.sendSms$lambda$5(i, ((Boolean) obj).booleanValue());
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendSms$lambda$5(int i, boolean z) {
        Logger.i(TAG, "send fall sms to " + i + " " + z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendTTSFileToDevice(String path) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).sendFile(wearableDeviceModel.getDid(), 5, 0, path, 4096, new SyncStateListener() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionHelper.sendTTSFileToDevice.1
            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onFinish(String did, int code) {
                Intrinsics.checkNotNullParameter(did, "did");
                Logger.i(FallDetectionHelper.TAG, "send tts audio file finish: " + code);
                FallDetectionHelper.mSpeech = null;
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onStart(String did) {
                Intrinsics.checkNotNullParameter(did, "did");
                Logger.i(FallDetectionHelper.TAG, "send tts audio file start");
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onSyncing(String did, int progress) {
                Intrinsics.checkNotNullParameter(did, "did");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startTimer(String reportId, int reason) {
        stopTimer();
        currentReason = reason;
        Logger.i(TAG, "startTimer");
        if (timerTask == null) {
            timerTask = new C20721(reportId);
        }
        if (timer == null) {
            Timer timer2 = new Timer();
            timer = timer2;
            timer2.schedule(timerTask, 60000L, 60000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopTimer() {
        Logger.i(TAG, "stopTimer");
        currentReason = -1;
        reportCount = 0;
        TimerTask timerTask2 = timerTask;
        if (timerTask2 != null) {
            timerTask2.cancel();
        }
        timerTask = null;
        Timer timer2 = timer;
        if (timer2 != null) {
            timer2.cancel();
        }
        Timer timer3 = timer;
        if (timer3 != null) {
            timer3.purge();
        }
        timer = null;
    }

    public final void applyFallDetection(@NotNull final gg4 helpRequest) {
        int i;
        Intrinsics.checkNotNullParameter(helpRequest, "helpRequest");
        if (ApplicationExtKt.isBackground(ApplicationExtKt.getApplication()) && (i = Build.VERSION.SDK_INT) >= 29 && !PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            Logger.i(TAG, "no background permission: " + i);
            return;
        }
        if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ACCESS_COARSE_LOCATION")) {
            Logger.i(TAG, "no location permission!");
        } else {
            GnssStatusCompat.INSTANCE.registerGnssStatusCallback(locationManager);
            getLocation(new Function3() { // from class: l99
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FallDetectionHelper.applyFallDetection$lambda$1(helpRequest, ((Double) obj).doubleValue(), ((Double) obj2).doubleValue(), (String) obj3);
                }
            });
        }
    }

    public final void applyShareLocation(@NotNull gg4 helpRequest) {
        Intrinsics.checkNotNullParameter(helpRequest, "helpRequest");
        Logger.i(TAG, "applyShareLocation");
        if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.SEND_SMS")) {
            Logger.i(TAG, "no sms permission!");
            return;
        }
        GnssStatusCompat.INSTANCE.registerGnssStatusCallback(locationManager);
        int i = helpRequest.e;
        if (i <= 0) {
            stopTimer();
            Logger.i(TAG, "shareLocationDuration == 0 stop share location");
            return;
        }
        reportDuration = i;
        reportCount = 0;
        if (currentReason == helpRequest.d) {
            Logger.i(TAG, "under share location just renew reportDuration and return");
        } else {
            AnyExtKt.io$default(null, new AnonymousClass1(helpRequest, null), 1, null);
        }
    }

    public final void applySos(@NotNull gg4 helpRequest) {
        Intrinsics.checkNotNullParameter(helpRequest, "helpRequest");
        if (!PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.SEND_SMS")) {
            Logger.i(TAG, "no sms permission!");
        } else {
            GnssStatusCompat.INSTANCE.registerGnssStatusCallback(locationManager);
            AnyExtKt.io$default(null, new C20671(helpRequest, null), 1, null);
        }
    }

    public final void endFallDetectionHelp() {
        stopTimer();
        GnssStatusCompat.INSTANCE.unregisterGnssStatusCallback(locationManager);
    }

    public final int getCurrentReason() {
        return currentReason;
    }

    public final int getREASON_FALL_DETECTION() {
        return REASON_FALL_DETECTION;
    }

    public final int getREASON_ONLYSOS() {
        return REASON_ONLYSOS;
    }

    public final int getREASON_SHARE_DETECTION() {
        return REASON_SHARE_DETECTION;
    }

    @NotNull
    public final List<eg4> getSLocalEmergencyContactList() {
        return sLocalEmergencyContactList;
    }

    public final void setCurrentReason(int i) {
        currentReason = i;
    }

    public final void setSLocalEmergencyContactList(@NotNull List<eg4> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        sLocalEmergencyContactList = list;
    }
}
