package com.xiaomi.fitness.milink.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.miui.circulate.api.bean.ExtraBundle;
import com.miui.circulate.api.bean.ResponseParam;
import com.miui.circulate.api.exception.CirculateException;
import com.miui.circulate.api.protocol.audio.support.MediaMetaData;
import com.miui.circulate.api.protocol.audio.support.PlayCapacity;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;
import com.miui.circulate.device.api.Constant;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.milink.bean.ExtraAudioData;
import com.xiaomi.fitness.milink.bean.ExtraHeadsetData;
import com.xiaomi.fitness.milink.circulate.BaseDeviceController;
import com.xiaomi.fitness.milink.circulate.BluetoothDeviceController;
import com.xiaomi.fitness.milink.circulate.PhoneDeviceController;
import com.xiaomi.fitness.milink.circulate.SoundDeviceController;
import com.xiaomi.fitness.milink.circulate.TvDeviceController;
import com.xiaomi.fitness.milink.util.MilinkHelper;
import defpackage.ap1;
import defpackage.dy6;
import defpackage.gdd;
import defpackage.gx3;
import defpackage.h4q;
import defpackage.hyc;
import defpackage.jpe;
import defpackage.knb;
import defpackage.l0j;
import defpackage.lnb;
import defpackage.red;
import defpackage.sdd;
import defpackage.sx3;
import defpackage.u3r;
import defpackage.xw3;
import defpackage.yo1;
import defpackage.yw3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ã\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0003bhl\bÆ\u0002\u0018\u00002\u00020\u0001B\n\b\u0002¢\u0006\u0005\b\u009c\u0001\u0010\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J#\u0010\u001b\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u0013JY\u0010(\u001a\u00020'2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\b,\u0010\u0013J!\u00100\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0002¢\u0006\u0004\b2\u0010\u0004J\r\u00103\u001a\u00020\u0002¢\u0006\u0004\b3\u0010\u0004J\r\u00104\u001a\u00020\t¢\u0006\u0004\b4\u0010\u0013J\r\u00105\u001a\u00020\t¢\u0006\u0004\b5\u0010\u0013J%\u00108\u001a\u00020\t2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u00107\u001a\u00020\u0002¢\u0006\u0004\b8\u00109J'\u0010:\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u00107\u001a\u00020\u0002H\u0007¢\u0006\u0004\b:\u00109J\u001b\u0010;\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b;\u0010\u000bJ%\u0010?\u001a\u00020\t2\b\u0010<\u001a\u0004\u0018\u00010$2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020'0=¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\t2\u0006\u0010A\u001a\u00020'¢\u0006\u0004\bB\u0010CJ\u0015\u0010F\u001a\u00020\t2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020\t2\u0006\u0010E\u001a\u00020H¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020\t2\u0006\u0010E\u001a\u00020K¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bN\u0010+J\u0019\u0010P\u001a\u0004\u0018\u00010'2\b\u0010O\u001a\u0004\u0018\u00010$¢\u0006\u0004\bP\u0010QJ\u0015\u0010R\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bR\u0010+J\r\u0010S\u001a\u00020\t¢\u0006\u0004\bS\u0010\u0013R\u0014\u0010T\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\bT\u0010UR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010V\u001a\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010^\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010_R\u0016\u0010a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010\\R\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010ZR\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010p\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR$\u0010u\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010CR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020'0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010|\u001a\u00020$8\u0006X\u0086T¢\u0006\u0006\n\u0004\b|\u0010UR\u001d\u0010\u007f\u001a\b\u0018\u00010}R\u00020~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0081\u0001\u001a\u00020]8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010_R\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0085\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010ZR\u0016\u0010\u0086\u0001\u001a\u00020$8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010UR\u0016\u0010\u0087\u0001\u001a\u00020$8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010UR\u0016\u0010\u0088\u0001\u001a\u00020$8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010UR\u0016\u0010\u0089\u0001\u001a\u00020$8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010UR\u0016\u0010\u008a\u0001\u001a\u00020$8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010UR\u0017\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0017\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0017\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00018F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0017\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0097\u00018F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0013\u0010\u009b\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010\u0004¨\u0006\u009d\u0001"}, d2 = {"Lcom/xiaomi/fitness/milink/util/MilinkHelper;", "", "", "isSupportCirculate", "()Z", "isSupportMilinkPlayControl", "", "", "protocolTypes", "", "startDiscovery", "(Ljava/util/List;)V", "Lcom/miui/circulate/api/service/CirculateDeviceInfo;", "deviceInfo", "Lcom/miui/circulate/api/service/CirculateServiceInfo;", "serviceInfo", "onAudioDeviceFound", "(Lcom/miui/circulate/api/service/CirculateDeviceInfo;Lcom/miui/circulate/api/service/CirculateServiceInfo;)V", "syncEmptyLocalPhoneToDeviceInternal", "()V", "beforeStopDiscovery", "registerAudioServiceNotify", "registerHeadsetServiceNotify", "unregisterServiceNotify", "Lcom/miui/circulate/api/protocol/audio/support/MediaMetaData;", "old", "new", "isSameMetaData", "(Lcom/miui/circulate/api/protocol/audio/support/MediaMetaData;Lcom/miui/circulate/api/protocol/audio/support/MediaMetaData;)Z", "registerPhoneVolumeChangeBroadcast", "mediaMetaData1", "Lcom/xiaomi/fitness/milink/bean/ExtraAudioData;", "extraAudioData1", "Lcom/xiaomi/fitness/milink/bean/ExtraHeadsetData;", "extraHeadsetData1", "playState1", "", "outputId1", "connectId1", "Lcom/xiaomi/fitness/milink/circulate/BaseDeviceController;", "createDeviceController", "(Lcom/miui/circulate/api/service/CirculateDeviceInfo;Lcom/miui/circulate/api/protocol/audio/support/MediaMetaData;Lcom/xiaomi/fitness/milink/bean/ExtraAudioData;Lcom/xiaomi/fitness/milink/bean/ExtraHeadsetData;ILjava/lang/String;Ljava/lang/String;)Lcom/xiaomi/fitness/milink/circulate/BaseDeviceController;", "isAudioGroup", "(Lcom/miui/circulate/api/service/CirculateDeviceInfo;)Z", "releaseWakeLock", "Landroid/content/Context;", "context", Constants.KEY_PACKAGE_NAME, "checkApkInstalled", "(Landroid/content/Context;Ljava/lang/String;)Z", "isSupportMilink", "isSupportScreenCast", "initCirculateContext", "stopDiscovery", "oriProtocolTypes", "isLocalOnly", "initCirculateClient", "(Ljava/util/List;Z)V", "requestShareDevice", "unInit", "lostId", "Ljava/util/concurrent/CopyOnWriteArrayList;", "list", "syncRemainDeviceList", "(Ljava/lang/String;Ljava/util/concurrent/CopyOnWriteArrayList;)V", "controller", "updateCirculateDeviceWrapperList", "(Lcom/xiaomi/fitness/milink/circulate/BaseDeviceController;)V", "Lgdd;", "control", "handleAudioControl", "(Lgdd;)V", "Lred;", "handleTvControl", "(Lred;)V", "Lsdd;", "handleHeadsetControl", "(Lsdd;)V", "isMiHealthSupportDevice", "deviceId", "getDeviceController", "(Ljava/lang/String;)Lcom/xiaomi/fitness/milink/circulate/BaseDeviceController;", "isCirculateDevice", "reset", "TAG", "Ljava/lang/String;", "Ljava/util/List;", "getProtocolTypes", "()Ljava/util/List;", "isFoundLocal", "Z", "initFailCount", "I", "", "lastRequestTime", "J", "lastInitSuccessTime", "mScreenOnCount", "com/xiaomi/fitness/milink/util/MilinkHelper$audioServiceNotify$1", "audioServiceNotify", "Lcom/xiaomi/fitness/milink/util/MilinkHelper$audioServiceNotify$1;", "Landroid/media/AudioManager;", "mAudioManager", "Landroid/media/AudioManager;", "com/xiaomi/fitness/milink/util/MilinkHelper$mPhoneVolumeChangeReceiver$1", "mPhoneVolumeChangeReceiver", "Lcom/xiaomi/fitness/milink/util/MilinkHelper$mPhoneVolumeChangeReceiver$1;", "isPhoneVolumeChangeReceiverRegistered", "com/xiaomi/fitness/milink/util/MilinkHelper$headsetServiceNotify$1", "headsetServiceNotify", "Lcom/xiaomi/fitness/milink/util/MilinkHelper$headsetServiceNotify$1;", "Lgx3;", "mCirculateContext", "Lgx3;", "Lxw3;", "mCirculateClient", "Lxw3;", "currentDeviceController", "Lcom/xiaomi/fitness/milink/circulate/BaseDeviceController;", "getCurrentDeviceController", "()Lcom/xiaomi/fitness/milink/circulate/BaseDeviceController;", "setCurrentDeviceController", "deviceControllerList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "LOCAL_DEVICE_ID", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "mWakeLock", "Landroid/os/PowerManager$WakeLock;", "TIME_SCREEN_ON", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "isDiscovery", "MILINK_PACKAGE_NAME", "VOLUME_CHANGED_ACTION", "EXTRA_VOLUME_STREAM_TYPE", "EXTRA_VOLUME_STREAM_VALUE", "EXTRA_PREV_VOLUME_STREAM_VALUE", "Lyo1;", "getAudioServiceController", "()Lyo1;", "audioServiceController", "Lh4q;", "getTvController", "()Lh4q;", "tvController", "Lknb;", "getHeadsetController", "()Lknb;", "headsetController", "Lcom/xiaomi/fitness/milink/circulate/PhoneDeviceController;", "getLocalDeviceController", "()Lcom/xiaomi/fitness/milink/circulate/PhoneDeviceController;", "localDeviceController", "isSomeDeviceCirculating", "<init>", "milink_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMilinkHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MilinkHelper.kt\ncom/xiaomi/fitness/milink/util/MilinkHelper\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,891:1\n37#2:892\n36#2,3:893\n1#3:896\n*S KotlinDebug\n*F\n+ 1 MilinkHelper.kt\ncom/xiaomi/fitness/milink/util/MilinkHelper\n*L\n102#1:892\n102#1:893,3\n*E\n"})
public final class MilinkHelper {

    @NotNull
    private static final String EXTRA_PREV_VOLUME_STREAM_VALUE = "android.media.EXTRA_PREV_VOLUME_STREAM_VALUE";

    @NotNull
    private static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";

    @NotNull
    private static final String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";

    @NotNull
    public static final String LOCAL_DEVICE_ID = "local_device_id";

    @NotNull
    private static final String MILINK_PACKAGE_NAME = "com.milink.service";

    @NotNull
    private static final String TAG = "MilinkHelper";
    private static final long TIME_SCREEN_ON = 10000;

    @NotNull
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";

    @Nullable
    private static volatile BaseDeviceController currentDeviceController;

    @NotNull
    private static final CopyOnWriteArrayList<BaseDeviceController> deviceControllerList;

    @NotNull
    private static final MilinkHelper$headsetServiceNotify$1 headsetServiceNotify;
    private static int initFailCount;
    private static boolean isDiscovery;
    private static boolean isPhoneVolumeChangeReceiverRegistered;
    private static long lastInitSuccessTime;
    private static long lastRequestTime;

    @NotNull
    private static final AudioManager mAudioManager;

    @Nullable
    private static xw3 mCirculateClient;

    @Nullable
    private static gx3 mCirculateContext;

    @NotNull
    private static final Handler mHandler;

    @NotNull
    private static final MilinkHelper$mPhoneVolumeChangeReceiver$1 mPhoneVolumeChangeReceiver;
    private static int mScreenOnCount;

    @Nullable
    private static PowerManager.WakeLock mWakeLock;

    @NotNull
    public static final MilinkHelper INSTANCE = new MilinkHelper();

    @NotNull
    private static final List<Integer> protocolTypes = new ArrayList();
    private static boolean isFoundLocal = true;

    @NotNull
    private static final MilinkHelper$audioServiceNotify$1 audioServiceNotify = new ap1() { // from class: com.xiaomi.fitness.milink.util.MilinkHelper$audioServiceNotify$1
        @Override // defpackage.ap1
        public void onBufferStateChange(CirculateDeviceInfo deviceInfo, int bufferStates) {
            Logger.i("MilinkHelper", "onBufferStateChange, device: " + (deviceInfo != null ? deviceInfo.f10301a : null) + ", bufferStates " + bufferStates);
        }

        @Override // defpackage.ap1
        @RequiresApi(24)
        public void onMediaInfoChange(CirculateDeviceInfo deviceInfo, MediaMetaData metaData) {
            Logger.i("MilinkHelper", "onMediaInfoChange, device: " + (deviceInfo != null ? deviceInfo.f10301a : null) + ", metaData " + (metaData != null ? metaData.e() : null));
            if (deviceInfo == null) {
                return;
            }
            MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
            BaseDeviceController deviceController = milinkHelper.getDeviceController(deviceInfo.f10301a);
            SoundDeviceController soundDeviceController = deviceController instanceof SoundDeviceController ? (SoundDeviceController) deviceController : null;
            if (soundDeviceController == null) {
                return;
            }
            if (milinkHelper.isCirculateDevice(soundDeviceController.getDeviceInfo())) {
                Logger.i("MilinkHelper", "onMediaInfoChange but in circulate, mute");
                return;
            }
            if (milinkHelper.isSameMetaData(soundDeviceController.getMediaMetaData(), metaData)) {
                Logger.i("MilinkHelper", "onMediaInfoChange same, mute");
                return;
            }
            soundDeviceController.setMediaMetaData(metaData);
            Logger.i("MilinkHelper", "onMediaInfoChange need update: " + (metaData != null ? metaData.e() : null));
            soundDeviceController.onMediaInfoChange(metaData);
        }

        @Override // defpackage.ap1
        @RequiresApi(24)
        public void onMirrorModeChange(CirculateDeviceInfo deviceInfo, int mode) {
            Logger.i("MilinkHelper", "onMirrorModeChange, device: " + (deviceInfo != null ? deviceInfo.f10301a : null) + ", mode " + mode);
            if (deviceInfo == null) {
                return;
            }
            BaseDeviceController deviceController = MilinkHelper.INSTANCE.getDeviceController(deviceInfo.f10301a);
            if (mode != 2 || deviceController == null) {
                return;
            }
            deviceController.onDisconnect();
        }

        @Override // defpackage.ap1
        @RequiresApi(24)
        public void onPlayStateChange(CirculateDeviceInfo deviceInfo, int state) {
            Logger.i("MilinkHelper", "onPlayStateChange, device: " + (deviceInfo != null ? deviceInfo.f10301a : null) + ", state " + state);
            if (deviceInfo == null) {
                return;
            }
            if (state == 0 || state == 9 || state == 2 || state == 3) {
                MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
                BaseDeviceController deviceController = milinkHelper.getDeviceController(deviceInfo.f10301a);
                SoundDeviceController soundDeviceController = deviceController instanceof SoundDeviceController ? (SoundDeviceController) deviceController : null;
                if (soundDeviceController == null) {
                    return;
                }
                if (milinkHelper.isCirculateDevice(soundDeviceController.getDeviceInfo())) {
                    Logger.i("MilinkHelper", "onPlayStateChange but in circulate, mute");
                    return;
                }
                Logger.i("MilinkHelper", "onPlayStateChange need update: " + state);
                soundDeviceController.onPlayStateChange(state);
            }
        }

        @Override // defpackage.ap1
        public void onPositionChange(CirculateDeviceInfo deviceInfo, long position) {
            Logger.i("MilinkHelper", "onPositionChange, device: " + (deviceInfo != null ? deviceInfo.f10301a : null) + ", position " + position);
            if (deviceInfo == null) {
                return;
            }
            MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
            BaseDeviceController deviceController = milinkHelper.getDeviceController(deviceInfo.f10301a);
            SoundDeviceController soundDeviceController = deviceController instanceof SoundDeviceController ? (SoundDeviceController) deviceController : null;
            if (soundDeviceController == null) {
                return;
            }
            if (milinkHelper.isCirculateDevice(soundDeviceController.getDeviceInfo())) {
                Logger.i("MilinkHelper", "onPositionChange but in circulate, mute");
                return;
            }
            Logger.i("MilinkHelper", "onPositionChange need update: " + position);
            soundDeviceController.onPositionChange(position);
        }

        @Override // defpackage.ap1
        public void onSourceAudioListUpdate(CirculateDeviceInfo p0, List<MediaMetaData> p1) {
        }

        @Override // defpackage.ap1
        public void onSourceExecuteFail(CirculateDeviceInfo p0, String p1) {
        }

        @Override // defpackage.ap1
        public void onSourceExecuteSuccess(CirculateDeviceInfo p0, String p1) {
        }

        @Override // defpackage.ap1
        public void onSourceLoopTypeUpdate(CirculateDeviceInfo p0, int p1) {
        }

        @Override // defpackage.ap1
        public void onSourcePlayCapacityUpdate(CirculateDeviceInfo p0, PlayCapacity p1) {
        }

        @Override // defpackage.ap1
        @RequiresApi(24)
        public void onVolumeChange(CirculateDeviceInfo deviceInfo, int volume) {
            Logger.i("MilinkHelper", "onVolumeChange, device: " + (deviceInfo != null ? deviceInfo.f10301a : null) + ", volume " + volume);
            if (deviceInfo == null) {
                return;
            }
            BaseDeviceController deviceController = MilinkHelper.INSTANCE.getDeviceController(deviceInfo.f10301a);
            SoundDeviceController soundDeviceController = deviceController instanceof SoundDeviceController ? (SoundDeviceController) deviceController : null;
            if (soundDeviceController == null) {
                return;
            }
            ExtraAudioData extraAudioData = soundDeviceController.getExtraAudioData();
            if (extraAudioData != null && volume == extraAudioData.getVolume()) {
                Logger.i("MilinkHelper", "onVolumeChange same, mute");
                return;
            }
            Logger.i("MilinkHelper", "onVolumeChange need update: " + volume);
            soundDeviceController.onVolumeChange(volume);
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.fitness.milink.util.MilinkHelper$handleAudioControl$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.milink.util.MilinkHelper$handleAudioControl$1", f = "MilinkHelper.kt", i = {}, l = {532}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $cmd;
        final /* synthetic */ gdd $control;
        final /* synthetic */ BaseDeviceController $controller;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseDeviceController baseDeviceController, int i, gdd gddVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$controller = baseDeviceController;
            this.$cmd = i;
            this.$control = gddVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$controller, this.$cmd, this.$control, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
                if (!milinkHelper.isMiHealthSupportDevice(this.$controller.getDeviceInfo())) {
                    Logger.i(MilinkHelper.TAG, "can not control " + this.$controller.getDeviceInfo().c + ", circulate by others");
                    return Unit.INSTANCE;
                }
                boolean zIsCirculateDevice = milinkHelper.isCirculateDevice(this.$controller.getDeviceInfo());
                Logger.i(MilinkHelper.TAG, "try control " + this.$controller.getDeviceInfo().c + ", isCirculate? " + zIsCirculateDevice);
                MilinkOneTrackHelper.INSTANCE.attachMilinkOneTrackControl(this.$controller.getDeviceInfo(), 1, this.$cmd);
                BaseDeviceController baseDeviceController = this.$controller;
                int i2 = this.$cmd;
                gdd gddVar = this.$control;
                int i3 = gddVar.e;
                String strValue = gddVar.f;
                Intrinsics.checkNotNullExpressionValue(strValue, "strValue");
                this.label = 1;
                if (baseDeviceController.handleAudioControl(i2, i3, strValue, zIsCirculateDevice, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.xiaomi.fitness.milink.util.MilinkHelper$audioServiceNotify$1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.xiaomi.fitness.milink.util.MilinkHelper$mPhoneVolumeChangeReceiver$1] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.xiaomi.fitness.milink.util.MilinkHelper$headsetServiceNotify$1] */
    static {
        Object systemService = ApplicationExtKt.getApplication().getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        mAudioManager = (AudioManager) systemService;
        mPhoneVolumeChangeReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.milink.util.MilinkHelper$mPhoneVolumeChangeReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra;
                if (intent == null || (intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", 0)) != 3) {
                    return;
                }
                int intExtra2 = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", 0);
                int intExtra3 = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                int streamMaxVolume = (intExtra3 * 100) / MilinkHelper.mAudioManager.getStreamMaxVolume(3);
                Logger.i("MilinkHelper", "onVolumeChange: type = " + intExtra + " prev = " + intExtra2 + " cur = " + intExtra3 + " volume = " + streamMaxVolume);
                PhoneDeviceController localDeviceController = MilinkHelper.INSTANCE.getLocalDeviceController();
                if (localDeviceController != null) {
                    localDeviceController.onVolumeChange(streamMaxVolume);
                }
            }
        };
        headsetServiceNotify = new lnb() { // from class: com.xiaomi.fitness.milink.util.MilinkHelper$headsetServiceNotify$1
            @Override // defpackage.lnb
            public void onBluetoothBatteryChanged(CirculateServiceInfo bluetoothService, List<Integer> battery) {
                Logger.i("MilinkHelper", "onBluetoothBatteryChanged, battery " + battery);
            }

            public void onBluetoothLowDelayModeChanged(CirculateServiceInfo bluetoothService, boolean lowDelayMode) {
                Logger.i("MilinkHelper", "onBluetoothLowDelayModeChanged, lowDelayMode " + lowDelayMode);
            }

            @Override // defpackage.lnb
            public void onBluetoothModeChanged(CirculateServiceInfo bluetoothService, int mode) {
                Logger.i("MilinkHelper", "onBluetoothModeChanged, mode " + mode);
                BaseDeviceController deviceController = MilinkHelper.INSTANCE.getDeviceController(bluetoothService != null ? bluetoothService.f10304a : null);
                BluetoothDeviceController bluetoothDeviceController = deviceController instanceof BluetoothDeviceController ? (BluetoothDeviceController) deviceController : null;
                if (bluetoothDeviceController == null) {
                    Logger.i("MilinkHelper", "HeadsetServiceNotify, but device not found");
                } else {
                    bluetoothDeviceController.onBluetoothModeChanged(mode);
                }
            }

            @Override // defpackage.lnb
            public void onBluetoothNameChanged(CirculateServiceInfo bluetoothService, String name) {
                Logger.i("MilinkHelper", "onBluetoothNameChanged, name " + name);
                MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
                BaseDeviceController deviceController = milinkHelper.getDeviceController(bluetoothService != null ? bluetoothService.f10304a : null);
                if (deviceController != null) {
                    deviceController.getDeviceInfo().c = name;
                    milinkHelper.updateCirculateDeviceWrapperList(deviceController);
                    return;
                }
                Logger.i("MilinkHelper", "onBluetoothModeChanged, but " + (bluetoothService != null ? bluetoothService.f10304a : null) + " not found");
            }

            @Override // defpackage.lnb
            public void onBluetoothVolumeChanged(CirculateServiceInfo bluetoothService, int volume) {
                Logger.i("MilinkHelper", "onBluetoothVolumeChanged, volume " + volume);
            }
        };
        deviceControllerList = new CopyOnWriteArrayList<>();
        mHandler = new Handler(Looper.getMainLooper());
    }

    private MilinkHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void beforeStopDiscovery() throws CirculateException {
        Logger.i(TAG, "beforeStopDiscovery isDiscovery: " + isDiscovery + " circulateDeviceInfoList: " + deviceControllerList.size());
        if (isDiscovery) {
            xw3 xw3Var = mCirculateClient;
            if (xw3Var != null) {
                xw3Var.stopDiscovery();
            }
            isDiscovery = false;
            mHandler.removeCallbacksAndMessages(null);
        }
    }

    private final boolean checkApkInstalled(Context context, String pkgName) {
        if (TextUtils.isEmpty(pkgName)) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNull(pkgName);
            packageManager.getPackageInfo(pkgName, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    private final BaseDeviceController createDeviceController(CirculateDeviceInfo deviceInfo, MediaMetaData mediaMetaData1, ExtraAudioData extraAudioData1, ExtraHeadsetData extraHeadsetData1, int playState1, String outputId1, String connectId1) {
        BaseDeviceController phoneDeviceController;
        String str = deviceInfo.d;
        if (str == null) {
            phoneDeviceController = new PhoneDeviceController(deviceInfo);
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -1834993054) {
                if (iHashCode != 2690) {
                    phoneDeviceController = iHashCode != 80074991 ? new SoundDeviceController(deviceInfo) : new SoundDeviceController(deviceInfo);
                } else if (str.equals("TV")) {
                    phoneDeviceController = new TvDeviceController(deviceInfo);
                } else {
                    phoneDeviceController = new PhoneDeviceController(deviceInfo);
                }
            } else if (str.equals("Headset")) {
                phoneDeviceController = new BluetoothDeviceController(deviceInfo);
            } else {
                phoneDeviceController = new PhoneDeviceController(deviceInfo);
            }
        }
        phoneDeviceController.setCirculateClient(mCirculateClient);
        phoneDeviceController.setMediaMetaData(mediaMetaData1);
        phoneDeviceController.setExtraAudioData(extraAudioData1);
        phoneDeviceController.setExtraHeadsetData(extraHeadsetData1);
        phoneDeviceController.setPlayState(playState1);
        phoneDeviceController.setOutputId(outputId1);
        phoneDeviceController.setConnectId(connectId1);
        return phoneDeviceController;
    }

    public static /* synthetic */ BaseDeviceController createDeviceController$default(MilinkHelper milinkHelper, CirculateDeviceInfo circulateDeviceInfo, MediaMetaData mediaMetaData, ExtraAudioData extraAudioData, ExtraHeadsetData extraHeadsetData, int i, String str, String str2, int i2, Object obj) {
        return milinkHelper.createDeviceController(circulateDeviceInfo, (i2 & 2) != 0 ? null : mediaMetaData, (i2 & 4) != 0 ? null : extraAudioData, (i2 & 8) == 0 ? extraHeadsetData : null, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str, (i2 & 64) == 0 ? str2 : "");
    }

    public static /* synthetic */ void initCirculateClient$default(MilinkHelper milinkHelper, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        milinkHelper.initCirculateClient(list, z);
    }

    private final boolean isAudioGroup(CirculateDeviceInfo deviceInfo) {
        ExtraBundle extraBundle = deviceInfo.h;
        return extraBundle != null && extraBundle.e(CirculateDeviceInfo.IS_GROUP, -1) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSameMetaData(MediaMetaData old, MediaMetaData mediaMetaData) {
        if (old == null && mediaMetaData == null) {
            return true;
        }
        if (old == null || mediaMetaData == null) {
            return false;
        }
        return Intrinsics.areEqual(old.e(), mediaMetaData.e()) && Intrinsics.areEqual(old.c(), mediaMetaData.c()) && Intrinsics.areEqual(old.a(), mediaMetaData.a()) && old.d() == mediaMetaData.d();
    }

    private final boolean isSupportCirculate() {
        int i = Build.VERSION.SDK_INT;
        PackageUtil packageUtil = PackageUtil.INSTANCE;
        boolean z = false;
        if (packageUtil.checkIfIDMSupport() && packageUtil.checkIfMIUIPlusSupport()) {
            z = true;
        }
        Logger.i(TAG, "isCirculateAvailable: " + z + " sdkVersion: " + i);
        return z;
    }

    private final boolean isSupportMilinkPlayControl() {
        boolean zCheckIfMilinkAppSupport = PackageUtil.INSTANCE.checkIfMilinkAppSupport();
        Logger.i(TAG, "isSupportMilinkPlayControl: " + zCheckIfMilinkAppSupport);
        return zCheckIfMilinkAppSupport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAudioDeviceFound(CirculateDeviceInfo deviceInfo, CirculateServiceInfo serviceInfo) {
        Object next;
        if (!isAudioGroup(deviceInfo)) {
            BaseDeviceController baseDeviceControllerCreateDeviceController$default = createDeviceController$default(this, deviceInfo, null, null, null, 0, null, null, 126, null);
            deviceControllerList.add(baseDeviceControllerCreateDeviceController$default);
            baseDeviceControllerCreateDeviceController$default.onServiceFound(serviceInfo);
            return;
        }
        String str = serviceInfo.f10304a;
        Iterator<T> it = deviceControllerList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((BaseDeviceController) next).getLogicalId(), str));
        BaseDeviceController baseDeviceController = (BaseDeviceController) next;
        if (baseDeviceController == null) {
            BaseDeviceController baseDeviceControllerCreateDeviceController$default2 = createDeviceController$default(this, deviceInfo, null, null, null, 0, null, null, 126, null);
            baseDeviceControllerCreateDeviceController$default2.setLogicalId(str);
            deviceControllerList.add(baseDeviceControllerCreateDeviceController$default2);
            baseDeviceControllerCreateDeviceController$default2.onServiceFound(serviceInfo);
            return;
        }
        List<String> audioGroupDevices = baseDeviceController.getAudioGroupDevices();
        String id = deviceInfo.f10301a;
        Intrinsics.checkNotNullExpressionValue(id, "id");
        audioGroupDevices.add(id);
    }

    private final void registerAudioServiceNotify() {
        yo1 audioServiceController = getAudioServiceController();
        if (audioServiceController != null) {
            audioServiceController.b(audioServiceNotify);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerHeadsetServiceNotify() {
        knb headsetController = getHeadsetController();
        if (headsetController != null) {
            headsetController.b(headsetServiceNotify);
        }
    }

    private final void registerPhoneVolumeChangeBroadcast() {
        try {
            if (isPhoneVolumeChangeReceiverRegistered) {
                ApplicationExtKt.getApplication().unregisterReceiver(mPhoneVolumeChangeReceiver);
                isPhoneVolumeChangeReceiverRegistered = false;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(VOLUME_CHANGED_ACTION);
            ApplicationExtKt.getApplication().registerReceiver(mPhoneVolumeChangeReceiver, intentFilter);
            isPhoneVolumeChangeReceiverRegistered = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseWakeLock() {
        if (mWakeLock != null) {
            Logger.i(TAG, "release WakeLock!!");
            u3r.c(mWakeLock);
            mWakeLock = null;
        }
    }

    public static /* synthetic */ void requestShareDevice$default(MilinkHelper milinkHelper, List list, boolean z, int i, Object obj) throws CirculateException {
        if ((i & 2) != 0) {
            z = true;
        }
        milinkHelper.requestShareDevice(list, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startDiscovery(List<Integer> protocolTypes2) {
        Logger.i(TAG, "startDiscovery");
        Integer[] numArr = (Integer[]) protocolTypes2.toArray(new Integer[0]);
        dy6 dy6VarE = new dy6.b((Integer[]) Arrays.copyOf(numArr, numArr.length)).d(16).d(8).e();
        isDiscovery = true;
        registerAudioServiceNotify();
        try {
            xw3 xw3Var = mCirculateClient;
            if (xw3Var != null) {
                xw3Var.h(dy6VarE);
            }
            lastRequestTime = System.currentTimeMillis();
            mHandler.postDelayed(new Runnable() { // from class: vxf
                @Override // java.lang.Runnable
                public final void run() throws CirculateException {
                    MilinkHelper.startDiscovery$lambda$0();
                }
            }, 300000L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startDiscovery$lambda$0() throws CirculateException {
        Logger.i(TAG, "time up, stop discovery");
        INSTANCE.beforeStopDiscovery();
    }

    private final void syncEmptyLocalPhoneToDeviceInternal() {
        CirculateDeviceInfo circulateDeviceInfoD;
        final PhoneDeviceController localDeviceController;
        Logger.i(TAG, "syncLocalPhoneToDevice");
        registerPhoneVolumeChangeBroadcast();
        xw3 xw3Var = mCirculateClient;
        if (xw3Var == null || (circulateDeviceInfoD = xw3Var.d()) == null) {
            return;
        }
        if (getLocalDeviceController() == null) {
            circulateDeviceInfoD.c = ResourceExtKt.getString(l0j.f24483a);
            circulateDeviceInfoD.d = Constant.DeviceType.ANDROID_PHONE;
            String id = circulateDeviceInfoD.f10301a;
            Intrinsics.checkNotNullExpressionValue(id, "id");
            BaseDeviceController baseDeviceControllerCreateDeviceController$default = createDeviceController$default(this, circulateDeviceInfoD, null, null, null, 0, id, null, 94, null);
            localDeviceController = baseDeviceControllerCreateDeviceController$default instanceof PhoneDeviceController ? (PhoneDeviceController) baseDeviceControllerCreateDeviceController$default : null;
        } else {
            localDeviceController = getLocalDeviceController();
        }
        if (localDeviceController != null) {
            localDeviceController.release();
        }
        if (localDeviceController != null) {
            localDeviceController.setOutputId(circulateDeviceInfoD.f10301a);
        }
        currentDeviceController = localDeviceController;
        CopyOnWriteArrayList<BaseDeviceController> copyOnWriteArrayList = deviceControllerList;
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.add(localDeviceController);
        if (localDeviceController != null) {
            Logger.i(TAG, "try sync media info after sync");
            localDeviceController.updateAudioInfoSync(new Function0() { // from class: wxf
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MilinkHelper.syncEmptyLocalPhoneToDeviceInternal$lambda$2(localDeviceController);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncEmptyLocalPhoneToDeviceInternal$lambda$2(PhoneDeviceController phoneDeviceController) {
        AnyExtKt.main$default(null, new MilinkHelper$syncEmptyLocalPhoneToDeviceInternal$1$1(phoneDeviceController, null), 1, null);
        return Unit.INSTANCE;
    }

    private final void unregisterServiceNotify() {
        yo1 audioServiceController = getAudioServiceController();
        if (audioServiceController != null) {
            audioServiceController.c(audioServiceNotify);
        }
    }

    @Nullable
    public final yo1 getAudioServiceController() {
        try {
            xw3 xw3Var = mCirculateClient;
            hyc hycVarE = xw3Var != null ? xw3Var.e(65536) : null;
            if (hycVarE instanceof yo1) {
                return (yo1) hycVarE;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final BaseDeviceController getCurrentDeviceController() {
        return currentDeviceController;
    }

    @Nullable
    public final BaseDeviceController getDeviceController(@Nullable String deviceId) {
        Object next;
        Iterator<T> it = deviceControllerList.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((BaseDeviceController) next).getDeviceInfo().f10301a, deviceId)) {
                return (BaseDeviceController) next;
            }
        }
        next = null;
        return (BaseDeviceController) next;
    }

    @Nullable
    public final knb getHeadsetController() {
        try {
            xw3 xw3Var = mCirculateClient;
            hyc hycVarE = xw3Var != null ? xw3Var.e(393216) : null;
            if (hycVarE instanceof knb) {
                return (knb) hycVarE;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final PhoneDeviceController getLocalDeviceController() {
        BaseDeviceController deviceController = getDeviceController("local_device_id");
        if (deviceController instanceof PhoneDeviceController) {
            return (PhoneDeviceController) deviceController;
        }
        return null;
    }

    @NotNull
    public final List<Integer> getProtocolTypes() {
        return protocolTypes;
    }

    @Nullable
    public final h4q getTvController() {
        try {
            xw3 xw3Var = mCirculateClient;
            hyc hycVarE = xw3Var != null ? xw3Var.e(327681) : null;
            if (hycVarE instanceof h4q) {
                return (h4q) hycVarE;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void handleAudioControl(@NotNull gdd control) {
        Intrinsics.checkNotNullParameter(control, "control");
        Logger.i(TAG, "handleAudioControl device: " + control.c + " cmd: " + control.d + " int: " + control.e + " str: " + control.f);
        int i = control.d;
        BaseDeviceController deviceController = getDeviceController(control.c);
        if (deviceController == null) {
            Logger.i(TAG, "device not found of disconnect");
        } else {
            AnyExtKt.io$default(null, new AnonymousClass1(deviceController, i, control, null), 1, null);
        }
    }

    public final void handleHeadsetControl(@NotNull sdd control) {
        Intrinsics.checkNotNullParameter(control, "control");
        Logger.i(TAG, "handleHeadsetControl deviceId: " + control.c + " voiceMode: " + control.d);
        int i = control.d;
        BaseDeviceController deviceController = getDeviceController(control.c);
        if (deviceController == null) {
            return;
        }
        MilinkOneTrackHelper.INSTANCE.attachMilinkOneTrackControl(deviceController.getDeviceInfo(), 3, i);
        deviceController.handleHeadsetControl(Integer.valueOf(i), null);
    }

    public final void handleTvControl(@NotNull red control) {
        Intrinsics.checkNotNullParameter(control, "control");
        String str = control.c;
        Logger.i(TAG, "handleTvControl device: " + str + " cmd: " + control.d + " str: " + str);
        int i = control.d;
        BaseDeviceController deviceController = getDeviceController(control.c);
        if (deviceController == null) {
            return;
        }
        MilinkOneTrackHelper.INSTANCE.attachMilinkOneTrackControl(deviceController.getDeviceInfo(), 2, i);
        deviceController.handleTvControl(i);
    }

    public final void initCirculateClient(@NotNull final List<Integer> oriProtocolTypes, boolean isLocalOnly) {
        Intrinsics.checkNotNullParameter(oriProtocolTypes, "oriProtocolTypes");
        Logger.i(TAG, "initCirculateClient oriProtocolTypes: " + oriProtocolTypes + " " + mCirculateClient + " isLocalOnly: " + isLocalOnly);
        isFoundLocal = isLocalOnly;
        if (mCirculateClient == null) {
            gx3 gx3Var = mCirculateContext;
            sx3 sx3Var = gx3Var != null ? (sx3) gx3Var.a("CirculateServiceManager") : null;
            mCirculateClient = sx3Var != null ? sx3Var.a(new yw3() { // from class: com.xiaomi.fitness.milink.util.MilinkHelper.initCirculateClient.1
                @Override // defpackage.yw3
                public void anyProtocolInitFail(int p0) {
                    Logger.i(MilinkHelper.TAG, "anyProtocolInitFail: " + p0);
                }

                @Override // defpackage.yw3
                public void anyProtocolInitSuccess(int p0) {
                    Logger.i(MilinkHelper.TAG, "anyProtocolInitSuccess: " + p0);
                }

                @Override // defpackage.yw3
                public void initFail(ResponseParam response) {
                    MilinkHelper.initFailCount++;
                    Logger.i(MilinkHelper.TAG, "newCirculateClient initFail: " + MilinkHelper.initFailCount);
                    if (MilinkHelper.initFailCount < 5) {
                        MilinkHelper.INSTANCE.initCirculateClient(oriProtocolTypes, MilinkHelper.isFoundLocal);
                    }
                }

                @Override // defpackage.yw3
                public void initSuccess() {
                    long j = MilinkHelper.lastInitSuccessTime;
                    MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
                    Logger.i(MilinkHelper.TAG, "lastInitSuccessTime: " + j + " initSuccess: " + milinkHelper.getProtocolTypes() + " isLocalOnly: " + MilinkHelper.isFoundLocal);
                    if (System.currentTimeMillis() - MilinkHelper.lastInitSuccessTime <= 100) {
                        return;
                    }
                    MilinkHelper.lastInitSuccessTime = System.currentTimeMillis();
                    if (MilinkHelper.isFoundLocal) {
                        return;
                    }
                    milinkHelper.startDiscovery(milinkHelper.getProtocolTypes());
                }

                @Override // defpackage.yw3
                public void onConnectStateChange(int state, CirculateDeviceInfo deviceInfo, CirculateServiceInfo serviceInfo) {
                    BaseDeviceController deviceController;
                    CirculateDeviceInfo deviceInfo2;
                    Logger.i(MilinkHelper.TAG, "onConnectStateChange, state: " + state + " deviceInfo: " + deviceInfo + " serviceInfo: " + serviceInfo);
                    if (deviceInfo == null || serviceInfo == null) {
                        return;
                    }
                    String str = null;
                    try {
                        if (state != 0) {
                            if (state != 2) {
                                return;
                            }
                            MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
                            BaseDeviceController deviceController2 = milinkHelper.getDeviceController(deviceInfo.f10301a);
                            if (serviceInfo.c != 393216) {
                                if (deviceController2 != null) {
                                    deviceController2.onConnect(serviceInfo);
                                    return;
                                }
                                return;
                            }
                            milinkHelper.registerHeadsetServiceNotify();
                            if (milinkHelper.getDeviceController(serviceInfo.f10304a) == null) {
                                CirculateDeviceInfo circulateDeviceInfo = new CirculateDeviceInfo();
                                circulateDeviceInfo.f10301a = serviceInfo.f10304a;
                                knb headsetController = milinkHelper.getHeadsetController();
                                circulateDeviceInfo.c = headsetController != null ? headsetController.m(serviceInfo) : null;
                                circulateDeviceInfo.d = "Headset";
                                String id = deviceInfo.f10301a;
                                Intrinsics.checkNotNullExpressionValue(id, "id");
                                BaseDeviceController baseDeviceControllerCreateDeviceController$default = MilinkHelper.createDeviceController$default(milinkHelper, circulateDeviceInfo, null, null, null, 0, null, id, 62, null);
                                MilinkHelper.deviceControllerList.add(baseDeviceControllerCreateDeviceController$default);
                                baseDeviceControllerCreateDeviceController$default.onServiceFound(serviceInfo);
                                return;
                            }
                            return;
                        }
                        if (Intrinsics.areEqual(deviceInfo.f10301a, "local_device_id") && serviceInfo.c == 393216) {
                            MilinkHelper milinkHelper2 = MilinkHelper.INSTANCE;
                            BaseDeviceController deviceController3 = milinkHelper2.getDeviceController(serviceInfo.f10304a);
                            if (deviceController3 != null) {
                                deviceController3.onServiceLost(serviceInfo);
                            }
                            MilinkHelper.deviceControllerList.remove(deviceController3);
                            if (deviceController3 != null && (deviceInfo2 = deviceController3.getDeviceInfo()) != null) {
                                str = deviceInfo2.f10301a;
                            }
                            milinkHelper2.syncRemainDeviceList(str, MilinkHelper.deviceControllerList);
                            return;
                        }
                        if (serviceInfo.c == 65536 && (deviceController = MilinkHelper.INSTANCE.getDeviceController(deviceInfo.f10301a)) != null) {
                            deviceController.onDisconnect();
                        }
                        Iterator it = MilinkHelper.deviceControllerList.iterator();
                        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                        while (it.hasNext()) {
                            BaseDeviceController baseDeviceController = (BaseDeviceController) it.next();
                            if (baseDeviceController.onSearchConnect()) {
                                Logger.i(MilinkHelper.TAG, deviceInfo.c + " DISCONNECTED, cause circulate to " + baseDeviceController.getDeviceInfo().c + " protocolType: " + serviceInfo.c);
                                return;
                            }
                        }
                        Logger.i(MilinkHelper.TAG, deviceInfo.f10301a + " DISCONNECTED, cause circulate to local phone");
                        PhoneDeviceController localDeviceController = MilinkHelper.INSTANCE.getLocalDeviceController();
                        if (localDeviceController != null) {
                            BaseDeviceController.onConnect$default(localDeviceController, null, 1, null);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                public void onDiscoveryError(ResponseParam response) throws CirculateException {
                    Logger.i(MilinkHelper.TAG, "onDiscoveryError, code: " + (response != null ? Integer.valueOf(response.f10288a) : null) + " msg: " + (response != null ? response.f10289b : null));
                    MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
                    milinkHelper.beforeStopDiscovery();
                    milinkHelper.releaseWakeLock();
                }

                @Override // defpackage.yw3
                public /* bridge */ /* synthetic */ void onDiscoveryStateChange(int i) {
                    super.onDiscoveryStateChange(i);
                }

                @Override // defpackage.yw3
                public void onServiceFound(CirculateDeviceInfo deviceInfo, CirculateServiceInfo serviceInfo) {
                    Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
                    Logger.i(MilinkHelper.TAG, "onServiceFound :" + deviceInfo.f10301a + " deviceInfo: " + deviceInfo + " serviceInfo: " + serviceInfo);
                    if (serviceInfo == null || serviceInfo.c != 65536) {
                        return;
                    }
                    MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
                    if (milinkHelper.getDeviceController(deviceInfo.f10301a) == null) {
                        milinkHelper.onAudioDeviceFound(deviceInfo, serviceInfo);
                    }
                }

                @Override // defpackage.yw3
                public void onServiceLost(CirculateDeviceInfo deviceInfo, CirculateServiceInfo serviceInfo) {
                    Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
                    Logger.i(MilinkHelper.TAG, "onServiceLost, deviceInfo: " + deviceInfo + " serviceInfo: " + serviceInfo);
                    if (serviceInfo == null) {
                        return;
                    }
                    BaseDeviceController deviceController = serviceInfo.c == 393216 ? MilinkHelper.INSTANCE.getDeviceController(serviceInfo.f10304a) : MilinkHelper.INSTANCE.getDeviceController(deviceInfo.f10301a);
                    if (deviceController != null && deviceController.onServiceLost(serviceInfo)) {
                        MilinkHelper.deviceControllerList.remove(deviceController);
                        MilinkHelper.INSTANCE.syncRemainDeviceList(deviceController.getDeviceInfo().f10301a, MilinkHelper.deviceControllerList);
                    }
                }

                @Override // defpackage.yw3
                public void onServiceUpdate(CirculateDeviceInfo deviceInfo, CirculateServiceInfo serviceInfo) {
                    Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
                    Logger.i(MilinkHelper.TAG, "onServiceUpdate, deviceInfo: " + deviceInfo + " serviceInfo: " + serviceInfo);
                    if (serviceInfo == null) {
                        return;
                    }
                    MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
                    BaseDeviceController deviceController = milinkHelper.getDeviceController(serviceInfo.c == 393216 ? serviceInfo.f10304a : deviceInfo.f10301a);
                    if (deviceController != null) {
                        deviceController.onServiceUpdate(serviceInfo);
                        return;
                    }
                    Logger.i(MilinkHelper.TAG, "onServiceUpdate " + deviceInfo.f10301a + " but in cache, onServiceFound in fact");
                    milinkHelper.onAudioDeviceFound(deviceInfo, serviceInfo);
                }
            }) : null;
        }
        if (isLocalOnly) {
            syncEmptyLocalPhoneToDeviceInternal();
            return;
        }
        List<Integer> list = protocolTypes;
        list.clear();
        list.addAll(oriProtocolTypes);
        Logger.i(TAG, "initCirculateClient protocolTypes: " + list);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        try {
            initFailCount = 0;
            xw3 xw3Var = mCirculateClient;
            if (xw3Var != null) {
                xw3Var.g(arrayList);
            }
        } catch (CirculateException e) {
            e.printStackTrace();
        }
    }

    public final void initCirculateContext() {
        if (isSupportCirculate()) {
            Logger.i(TAG, "support initCirculateContext");
            gx3.a aVar = new gx3.a(ApplicationExtKt.getApplication(), "com.mi.health");
            try {
                aVar.g(Constant.DeviceCategory.HEALTH);
                aVar.f(true);
                if (AppUtil.INSTANCE.isDevChannel()) {
                    aVar.e(true);
                    jpe.c(true);
                }
                mCirculateContext = gx3.i(aVar);
                Logger.i(TAG, "init milink mCirculateContext install");
            } catch (CirculateException e) {
                Logger.e(TAG, "install context", e);
            }
        }
    }

    public final boolean isCirculateDevice(@NotNull CirculateDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        PhoneDeviceController localDeviceController = getLocalDeviceController();
        return Intrinsics.areEqual(localDeviceController != null ? localDeviceController.getOutputId() : null, deviceInfo.f10301a);
    }

    public final boolean isMiHealthSupportDevice(@NotNull CirculateDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        if (Intrinsics.areEqual(deviceInfo.f10301a, "local_device_id") || Intrinsics.areEqual(deviceInfo.d, "Headset")) {
            return true;
        }
        yo1 audioServiceController = getAudioServiceController();
        Integer numValueOf = audioServiceController != null ? Integer.valueOf(audioServiceController.j(deviceInfo)) : null;
        Set<CirculateServiceInfo> set = deviceInfo.i;
        if (set == null || set.isEmpty()) {
            Logger.i(TAG, "get " + deviceInfo.f10301a + " isSupportControlDevice, service empty");
            return false;
        }
        boolean z = false;
        for (CirculateServiceInfo circulateServiceInfo : deviceInfo.i) {
            if (circulateServiceInfo.c == 65536 && circulateServiceInfo.e()) {
                z = true;
            }
        }
        Logger.i(TAG, "get " + deviceInfo.f10301a + " isSupportControlDevice, mirrorMode: " + numValueOf + " connect: " + z);
        if (numValueOf != null && numValueOf.intValue() == 1 && z) {
            return true;
        }
        return numValueOf != null && numValueOf.intValue() == 2 && deviceInfo.j == 1;
    }

    public final boolean isSomeDeviceCirculating() {
        CirculateDeviceInfo deviceInfo;
        BaseDeviceController baseDeviceController = currentDeviceController;
        return !Intrinsics.areEqual((baseDeviceController == null || (deviceInfo = baseDeviceController.getDeviceInfo()) == null) ? null : deviceInfo.f10301a, "local_device_id");
    }

    public final boolean isSupportMilink() {
        return PermissionsUtil.INSTANCE.checkPermission("android.permission.MEDIA_CONTENT_CONTROL") && !AppUtil.INSTANCE.isPlayChannel() && isSupportCirculate() && isSupportMilinkPlayControl();
    }

    public final boolean isSupportScreenCast() {
        return checkApkInstalled(AppUtil.getApp(), "com.milink.service");
    }

    @RequiresApi(24)
    public final void requestShareDevice(@NotNull List<Integer> protocolTypes2, boolean isLocalOnly) throws CirculateException {
        int i;
        Intrinsics.checkNotNullParameter(protocolTypes2, "protocolTypes");
        if (mCirculateClient == null) {
            Logger.i(TAG, "client is null, new client and requestShareDevice " + mCirculateContext);
            initCirculateClient(protocolTypes2, isLocalOnly);
            return;
        }
        Logger.i(TAG, "already init, requestShareDevice lastRequestTime: " + lastRequestTime);
        if (!isLocalOnly && !u3r.b(ApplicationExtKt.getApplication()) && (i = mScreenOnCount) < 3) {
            Logger.i(TAG, "requestShareDevice delay, cause screen off! try " + i);
            mWakeLock = u3r.a(ApplicationExtKt.getApplication(), 10000L);
            requestShareDevice(protocolTypes2, false);
            mScreenOnCount = mScreenOnCount + 1;
            return;
        }
        if (System.currentTimeMillis() - lastRequestTime <= 100) {
            return;
        }
        mHandler.removeCallbacksAndMessages(null);
        releaseWakeLock();
        mScreenOnCount = 0;
        beforeStopDiscovery();
        syncEmptyLocalPhoneToDeviceInternal();
        if (isLocalOnly) {
            return;
        }
        initCirculateClient(protocolTypes2, false);
    }

    public final void reset() {
        Logger.i(TAG, "reset milink");
        deviceControllerList.clear();
        unregisterServiceNotify();
        mHandler.removeCallbacksAndMessages(null);
        isDiscovery = false;
        mWakeLock = null;
    }

    public final void setCurrentDeviceController(@Nullable BaseDeviceController baseDeviceController) {
        currentDeviceController = baseDeviceController;
    }

    public final void stopDiscovery() throws CirculateException {
        Logger.i(TAG, "stop by screen cast, isDiscovery is " + isDiscovery);
        xw3 xw3Var = mCirculateClient;
        if (xw3Var != null) {
            xw3Var.stopDiscovery();
        }
        reset();
    }

    public final void syncRemainDeviceList(@Nullable String lostId, @NotNull CopyOnWriteArrayList<BaseDeviceController> list) {
        CirculateDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(list, "list");
        if (lostId == null || lostId.length() == 0) {
            return;
        }
        Logger.i(TAG, "syncRemainDeviceList: " + list.size());
        BaseDeviceController baseDeviceController = currentDeviceController;
        boolean zAreEqual = Intrinsics.areEqual(lostId, (baseDeviceController == null || (deviceInfo = baseDeviceController.getDeviceInfo()) == null) ? null : deviceInfo.f10301a);
        MilinkExtKt.syncShareDevice(list);
        Iterator<BaseDeviceController> it = list.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            BaseDeviceController next = it.next();
            if (zAreEqual && next.onSearchConnect()) {
                String id = next.getDeviceInfo().f10301a;
                Intrinsics.checkNotNullExpressionValue(id, "id");
                next.updateOutputId(id);
            }
            if (next.getMediaMetaData() != null || next.getPlayState() != 0) {
                boolean zIsCirculateDevice = isCirculateDevice(next.getDeviceInfo());
                Logger.i(TAG, "syncRemainDeviceList, " + next.getDeviceInfo().f10301a + ".isCirculateDevice: " + zIsCirculateDevice);
                next.updateLatestPosition(zIsCirculateDevice);
            }
        }
    }

    public final void unInit(@NotNull List<Integer> protocolTypes2) {
        Intrinsics.checkNotNullParameter(protocolTypes2, "protocolTypes");
        xw3 xw3Var = mCirculateClient;
        if (xw3Var != null) {
            xw3Var.f(protocolTypes2);
        }
        xw3 xw3Var2 = mCirculateClient;
        if (xw3Var2 != null) {
            xw3Var2.release();
        }
    }

    public final void updateCirculateDeviceWrapperList(@NotNull BaseDeviceController controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (getDeviceController(controller.getDeviceInfo().f10301a) == null) {
            Logger.i(TAG, controller.getDeviceInfo().c + " has already removed");
            return;
        }
        Logger.i(TAG, "update exist device " + controller.getDeviceInfo().c + " hash: " + System.identityHashCode(controller));
        MilinkExtKt.updateShareDevice(controller);
    }
}
