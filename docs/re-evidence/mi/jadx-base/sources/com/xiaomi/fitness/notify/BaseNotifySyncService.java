package com.xiaomi.fitness.notify;

import android.app.KeyguardManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.RemoteController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mibi.sdk.component.params.SdkContants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingConstants;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingsExportPreference;
import com.xiaomi.fitness.media.export.MediaHelper;
import com.xiaomi.fitness.media.export.MediaHelperExtKt;
import com.xiaomi.fitness.milink.export.MilinkManager;
import com.xiaomi.fitness.milink.export.MilinkManagerExtKt;
import com.xiaomi.fitness.notify.BaseNotifySyncService;
import com.xiaomi.fitness.notify.callnotify.WechatCallNotifyManager;
import com.xiaomi.fitness.notify.data.FocusNotificationParam;
import com.xiaomi.fitness.notify.data.FocusNotificationParamV2;
import com.xiaomi.fitness.notify.data.NotificationInfo;
import com.xiaomi.fitness.notify.data.NotificationWrapper;
import com.xiaomi.fitness.notify.di.NotifyStartExtKt;
import com.xiaomi.fitness.notify.focus.NotificationFocusManager;
import com.xiaomi.fitness.notify.focus.RemoveNotification;
import com.xiaomi.fitness.notify.notification.NotificationManagerInter;
import com.xiaomi.fitness.notify.util.BlueToothSender;
import com.xiaomi.fitness.notify.util.NotificationFilterHelper;
import com.xiaomi.fitness.notify.util.NotifyLogUtils;
import com.xiaomi.fitness.notify.util.NotifyPreference;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.aje;
import defpackage.d2m;
import defpackage.e98;
import defpackage.rxg;
import defpackage.sxg;
import defpackage.wwg;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \u009d\u00012\u00020\u00012\u00020\u0002:\f\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001B\b¢\u0006\u0005\b\u009c\u0001\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001b\u0010\u0013J#\u0010\u001e\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\"\u0010!J#\u0010#\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b#\u0010\u001fJ\u0019\u0010$\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b&\u0010\u001fJ\u001b\u0010)\u001a\u0004\u0018\u00010\t2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\u0004\u0018\u00010\t2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b+\u0010*J\u001f\u0010.\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u0010\u0005J!\u00107\u001a\u00020\u00162\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u0019\u0010:\u001a\u00020\u00032\b\u00109\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b:\u0010\fJ\u000f\u0010;\u001a\u00020\u0003H\u0002¢\u0006\u0004\b;\u0010\u0005J!\u0010>\u001a\u00020\u00032\b\u0010<\u001a\u0004\u0018\u00010\t2\u0006\u0010=\u001a\u00020\tH\u0002¢\u0006\u0004\b>\u0010?J)\u0010D\u001a\u00020,2\b\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010B\u001a\u00020,2\u0006\u0010C\u001a\u00020,H\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0003H\u0016¢\u0006\u0004\bF\u0010\u0005J\u0019\u0010G\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\bG\u0010\u0011J+\u0010J\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u0016H\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\u00032\u0006\u0010O\u001a\u00020,H\u0016¢\u0006\u0004\bP\u0010QJ/\u0010P\u001a\u00020\u00032\u0006\u0010O\u001a\u00020,2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020R2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bP\u0010WJ\u0017\u0010Y\u001a\u00020\u00032\u0006\u0010X\u001a\u00020,H\u0016¢\u0006\u0004\bY\u0010QJ\u001b\u0010]\u001a\u00020\u00032\n\u0010\\\u001a\u00060ZR\u00020[H\u0016¢\u0006\u0004\b]\u0010^J\u001b\u0010`\u001a\u0004\u0018\u00010_2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u0003H\u0016¢\u0006\u0004\bb\u0010\u0005J\u000f\u0010c\u001a\u00020\u0003H\u0016¢\u0006\u0004\bc\u0010\u0005J\u000f\u0010d\u001a\u00020\u0003H\u0016¢\u0006\u0004\bd\u0010\u0005J\r\u0010e\u001a\u00020\u0016¢\u0006\u0004\be\u0010fR\u0016\u0010g\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0017\u0010j\u001a\u00020i8\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\"\u0010n\u001a\u00020R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0018\u0010u\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010~\u001a\u00060}R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001c\u0010\u0081\u0001\u001a\u00070\u0080\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0084\u0001\u001a\u00070\u0083\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R&\u0010\u0086\u0001\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010h\u001a\u0005\b\u0086\u0001\u0010f\"\u0005\b\u0087\u0001\u0010NR\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\"\u0010\u008c\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\"\u0010\u008e\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008d\u0001R#\u0010\u0090\u0001\u001a\f\u0012\u0005\u0012\u00030\u008f\u0001\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008d\u0001R!\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008d\u0001R \u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020\t0\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008d\u0001R\u001e\u0010\u0095\u0001\u001a\u00070\u0094\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0097\u0001\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010oR\u0017\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0098\u00018F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001¨\u0006£\u0001"}, d2 = {"Lcom/xiaomi/fitness/notify/BaseNotifySyncService;", "Landroid/service/notification/NotificationListenerService;", "Landroid/media/RemoteController$OnClientUpdateListener;", "", "toggleMediaSession", "()V", "addNotifications", "removeNotifications", "postNotifications", "", "packageName", "reportReceiveData", "(Ljava/lang/String;)V", "reportSendToDeviceData", "Landroid/service/notification/StatusBarNotification;", "sbn", "handleNotificationPosted", "(Landroid/service/notification/StatusBarNotification;)V", "getFilterPackageName", "(Ljava/lang/String;)Ljava/lang/String;", "", PluginDeviceInfo.FICONON, "", "isHighSurrogate", "(C)Z", "isLowSurrogate", "str", "supportEmoji", "Landroid/app/Notification;", "notification", "isSpotifyPlayerChannel", "(Landroid/service/notification/StatusBarNotification;Landroid/app/Notification;)Z", "whatsAppFilter", "(Landroid/service/notification/StatusBarNotification;)Z", "isAppGroupSummary", "isMiFocusNotification", "isMiMusicPlayerChannel", "(Landroid/app/Notification;)Z", "isMiHealthGlucoseAbnormalNotification", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "getTitle", "(Landroid/os/Bundle;)Ljava/lang/String;", "getText", "", "reason", "handleNotificationRemoved", "(Landroid/service/notification/StatusBarNotification;I)V", "reasonToString", "(I)Ljava/lang/String;", "alertOutGoingCall", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/notify/data/NotificationInfo;", "notifyData", "isNeedRemoveNotify", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/notify/data/NotificationInfo;)Z", "incomingNumber", "alertPhoneMissCall", "alertPhoneInCallStop", "phoneNum", MediaStoreUtil.MediaInfo.DISPLAY_NAME, "alertPhoneInCall", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "onCreate", "onNotificationPosted", "Landroid/service/notification/NotificationListenerService$RankingMap;", "rankingMap", "onNotificationRemoved", "(Landroid/service/notification/StatusBarNotification;Landroid/service/notification/NotificationListenerService$RankingMap;I)V", "clearing", "onClientChange", "(Z)V", "state", "onClientPlaybackStateUpdate", "(I)V", "", "stateChangeTimeMs", "currentPosMs", "", "speed", "(IJJF)V", "transportControlFlags", "onClientTransportControlUpdate", "Landroid/media/RemoteController$MetadataEditor;", "Landroid/media/RemoteController;", "metadataEditor", "onClientMetadataUpdate", "(Landroid/media/RemoteController$MetadataEditor;)V", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", LifecycleConstantKt.ON_DESTROY, "onListenerConnected", "onListenerDisconnected", "isNeedMediaSession", "()Z", "isNotificationServiceConnected", "Z", "Lcom/xiaomi/fitness/media/export/MediaHelper;", "mediaHelper", "Lcom/xiaomi/fitness/media/export/MediaHelper;", "getMediaHelper", "()Lcom/xiaomi/fitness/media/export/MediaHelper;", "delayTime", "J", "getDelayTime", "()J", "setDelayTime", "(J)V", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "Landroid/content/pm/PackageManager;", "mPackageManager", "Landroid/content/pm/PackageManager;", "Ljava/text/SimpleDateFormat;", "mSimpleDateFormat", "Ljava/text/SimpleDateFormat;", "Lcom/xiaomi/fitness/notify/BaseNotifySyncService$RemoveNotificationReceiver;", "mRemoveNotificationReceiver", "Lcom/xiaomi/fitness/notify/BaseNotifySyncService$RemoveNotificationReceiver;", "Lcom/xiaomi/fitness/notify/BaseNotifySyncService$OpenNotificationReceiver;", "mOpenNotificationReceiver", "Lcom/xiaomi/fitness/notify/BaseNotifySyncService$OpenNotificationReceiver;", "Lcom/xiaomi/fitness/notify/BaseNotifySyncService$TimeZoneChangeReceiver;", "mTimeZoneChangeReceiver", "Lcom/xiaomi/fitness/notify/BaseNotifySyncService$TimeZoneChangeReceiver;", "isPhoneSupportMilink", "setPhoneSupportMilink", "Landroid/os/HandlerThread;", "handlerThread", "Landroid/os/HandlerThread;", "", "mNotifyDataList", "Ljava/util/List;", "mNotifyDataListTempList", "Lcom/xiaomi/fitness/notify/focus/RemoveNotification;", "mNotifyDataRemoveList", "Lrxg;", "mFinalSendNotificationList", "mProgressNotificationTemp", "Lcom/xiaomi/fitness/notify/BaseNotifySyncService$MusicSettingChangeReceiver;", "musicSettingChangeReceiver", "Lcom/xiaomi/fitness/notify/BaseNotifySyncService$MusicSettingChangeReceiver;", "lastWhatsAppWhen", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "getHuamiApiCaller", "()Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "huamiApiCaller", "<init>", "Companion", "MyHandler", "MusicSettingChangeReceiver", "TimeZoneChangeReceiver", "OpenNotificationReceiver", "RemoveNotificationReceiver", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBaseNotifySyncService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseNotifySyncService.kt\ncom/xiaomi/fitness/notify/BaseNotifySyncService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,1384:1\n1863#2,2:1385\n1863#2,2:1387\n37#3:1389\n36#3,3:1390\n37#3:1393\n36#3,3:1394\n29#4:1397\n*S KotlinDebug\n*F\n+ 1 BaseNotifySyncService.kt\ncom/xiaomi/fitness/notify/BaseNotifySyncService\n*L\n332#1:1385,2\n392#1:1387,2\n396#1:1389\n396#1:1390,3\n449#1:1393\n449#1:1394,3\n747#1:1397\n*E\n"})
public class BaseNotifySyncService extends NotificationListenerService implements RemoteController.OnClientUpdateListener {
    public static final long NOTIFICATION_DELAY_TIME = 600000;

    @NotNull
    public static final String NOTIFY_OPEN = "com.xiaomi.wearable.home.devices.ble.sync.NOTIFY_OPEN";

    @NotNull
    public static final String NOTIFY_REMOVE = "com.xiaomi.wearable.home.devices.ble.sync.NOTIFY_REMOVE";

    @NotNull
    public static final String OPEN_NOTIFICATION_LIST = "open_notification_list";

    @NotNull
    public static final String REMOVE_NOTIFICATION_LIST = "remove_notification_list";

    @NotNull
    public static final String SYNC_NOTIFICATION_ICON = "com.xiaomi.wearable.home.devices.ble.sync.NOTIFY_ICON";

    @NotNull
    public static final String TAG = "NotifySyncService";

    @Nullable
    private HandlerThread handlerThread;
    private boolean isNotificationServiceConnected;

    @Nullable
    private Handler mHandler;

    @Nullable
    private List<NotificationInfo> mNotifyDataList;

    @Nullable
    private List<NotificationInfo> mNotifyDataListTempList;

    @Nullable
    private List<RemoveNotification> mNotifyDataRemoveList;

    @Nullable
    private PackageManager mPackageManager;

    @NotNull
    private final MediaHelper mediaHelper = MediaHelperExtKt.getInstance(MediaHelper.INSTANCE);
    private long delayTime = 100;

    @NotNull
    private final SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH);

    @NotNull
    private final RemoveNotificationReceiver mRemoveNotificationReceiver = new RemoveNotificationReceiver();

    @NotNull
    private final OpenNotificationReceiver mOpenNotificationReceiver = new OpenNotificationReceiver();

    @NotNull
    private final TimeZoneChangeReceiver mTimeZoneChangeReceiver = new TimeZoneChangeReceiver();
    private boolean isPhoneSupportMilink = true;

    @NotNull
    private List<rxg> mFinalSendNotificationList = new ArrayList();

    @NotNull
    private List<String> mProgressNotificationTemp = new ArrayList();

    @NotNull
    private MusicSettingChangeReceiver musicSettingChangeReceiver = new MusicSettingChangeReceiver();
    private long lastWhatsAppWhen = -1;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/notify/BaseNotifySyncService$MusicSettingChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/xiaomi/fitness/notify/BaseNotifySyncService;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MusicSettingChangeReceiver extends BroadcastReceiver {
        public MusicSettingChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            boolean booleanExtra = intent.getBooleanExtra("isNeedSync", true);
            Logger.i("MediaSyncManager", "BaseNotifySyncService isNeedSync:" + booleanExtra);
            if (booleanExtra) {
                DeviceSettingsExportPreference.INSTANCE.setAppMusicSync2Device(booleanExtra);
                BaseNotifySyncService.this.getMediaHelper().registerRemoteController(new ComponentName(BaseNotifySyncService.this, (Class<?>) MusicSettingChangeReceiver.class));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/notify/BaseNotifySyncService$MyHandler;", "Landroid/os/Handler;", "looper", "Landroid/os/Looper;", "<init>", "(Lcom/xiaomi/fitness/notify/BaseNotifySyncService;Landroid/os/Looper;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MyHandler extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyHandler(Looper looper) {
            super(looper);
            Intrinsics.checkNotNull(looper);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence handleMessage$lambda$2(NotificationInfo it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return String.valueOf(it.getNotifyData().i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence handleMessage$lambda$6(RemoveNotification it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return String.valueOf(it.getNotifyData().c);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            List list;
            Handler handler;
            Handler handler2;
            Intrinsics.checkNotNullParameter(msg, "msg");
            int i = msg.what;
            if (i == 0) {
                Object obj = msg.obj;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.notify.data.NotificationInfo");
                NotificationInfo notificationInfo = (NotificationInfo) obj;
                List list2 = BaseNotifySyncService.this.mNotifyDataRemoveList;
                if (list2 != null && (!list2.isEmpty())) {
                    List list3 = BaseNotifySyncService.this.mNotifyDataRemoveList;
                    Iterator it = list3 != null ? list3.iterator() : null;
                    if (it != null) {
                        while (it.hasNext()) {
                            sxg notifyData = ((RemoveNotification) it.next()).getNotifyData();
                            if (notificationInfo.getNotifyData().i == notifyData.c && Intrinsics.areEqual(notificationInfo.getNotifyData().c, notifyData.d) && Intrinsics.areEqual(notificationInfo.getNotifyData().f33036k, notifyData.f)) {
                                it.remove();
                            }
                        }
                    }
                    List list4 = BaseNotifySyncService.this.mNotifyDataRemoveList;
                    if (list4 != null && !(!list4.isEmpty()) && (handler = BaseNotifySyncService.this.mHandler) != null) {
                        handler.removeMessages(4);
                    }
                }
                if (BaseNotifySyncService.this.mNotifyDataList == null) {
                    BaseNotifySyncService.this.mNotifyDataList = new ArrayList();
                }
                if (notificationInfo.getNotifyData().q == null) {
                    List list5 = BaseNotifySyncService.this.mNotifyDataList;
                    Iterator it2 = list5 != null ? list5.iterator() : null;
                    if (it2 != null) {
                        while (it2.hasNext()) {
                            NotificationInfo notificationInfo2 = (NotificationInfo) it2.next();
                            if (notificationInfo2.getNotifyData().i == notificationInfo.getNotifyData().i && Intrinsics.areEqual(notificationInfo2.getNotifyData().c, notificationInfo.getNotifyData().c) && Intrinsics.areEqual(notificationInfo2.getNotifyData().f33036k, notificationInfo.getNotifyData().f33036k)) {
                                it2.remove();
                            }
                        }
                    }
                }
                if (BaseNotifySyncService.this.mNotifyDataListTempList == null) {
                    BaseNotifySyncService.this.mNotifyDataListTempList = new ArrayList();
                }
                List list6 = BaseNotifySyncService.this.mNotifyDataList;
                if (list6 != null) {
                    list6.add(notificationInfo);
                }
                List list7 = BaseNotifySyncService.this.mNotifyDataListTempList;
                if (list7 != null && !list7.isEmpty()) {
                    List list8 = BaseNotifySyncService.this.mNotifyDataListTempList;
                    Intrinsics.checkNotNull(list8);
                    if (list8.size() >= 200 && (list = BaseNotifySyncService.this.mNotifyDataListTempList) != null) {
                    }
                }
                List list9 = BaseNotifySyncService.this.mNotifyDataListTempList;
                if (list9 != null) {
                    list9.add(notificationInfo);
                }
                Logger.i(BaseNotifySyncService.TAG, "handleMessages  MSG_NOTIFY_ADD");
                Handler handler3 = BaseNotifySyncService.this.mHandler;
                if (handler3 == null || handler3.hasMessages(2)) {
                    return;
                }
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel != null && DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                    BaseNotifySyncService.this.setDelayTime(0L);
                }
                Logger.i(BaseNotifySyncService.TAG, "send MSG_NOTIFY_ADD_TIMEOUT");
                Handler handler4 = BaseNotifySyncService.this.mHandler;
                if (handler4 != null) {
                    handler4.sendEmptyMessageDelayed(2, BaseNotifySyncService.this.getDelayTime());
                    return;
                }
                return;
            }
            if (i == 2) {
                List list10 = BaseNotifySyncService.this.mNotifyDataList;
                Integer numValueOf = list10 != null ? Integer.valueOf(list10.size()) : null;
                List list11 = BaseNotifySyncService.this.mNotifyDataList;
                Logger.i(BaseNotifySyncService.TAG, "handle message  MSG_NOTIFY_ADD_TIMEOUT  mNotifyDataList size" + numValueOf + " ids: " + (list11 != null ? CollectionsKt___CollectionsKt.joinToString$default(list11, null, null, null, 0, null, new Function1() { // from class: s92
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return BaseNotifySyncService.MyHandler.handleMessage$lambda$2((NotificationInfo) obj2);
                    }
                }, 31, null) : null));
                List list12 = BaseNotifySyncService.this.mNotifyDataList;
                if (list12 != null && (!list12.isEmpty())) {
                    BaseNotifySyncService.this.addNotifications();
                }
                if (BaseNotifySyncService.this.mNotifyDataList == null) {
                    BaseNotifySyncService.this.mNotifyDataList = new ArrayList();
                    return;
                }
                List list13 = BaseNotifySyncService.this.mNotifyDataList;
                if (list13 != null) {
                    list13.clear();
                    return;
                }
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        Logger.i(BaseNotifySyncService.TAG, "MSG_NOTIFY_POSTED ");
                        Object obj2 = msg.obj;
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.service.notification.StatusBarNotification");
                        BaseNotifySyncService.this.handleNotificationPosted((StatusBarNotification) obj2);
                        return;
                    }
                    if (i != 6) {
                        return;
                    }
                    Logger.i(BaseNotifySyncService.TAG, "MSG_NOTIFY_REMOVED ");
                    Object obj3 = msg.obj;
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type com.xiaomi.fitness.notify.data.NotificationWrapper");
                    NotificationWrapper notificationWrapper = (NotificationWrapper) obj3;
                    BaseNotifySyncService.this.handleNotificationRemoved(notificationWrapper.getSbn(), notificationWrapper.getReason());
                    return;
                }
                List list14 = BaseNotifySyncService.this.mNotifyDataRemoveList;
                Integer numValueOf2 = list14 != null ? Integer.valueOf(list14.size()) : null;
                List list15 = BaseNotifySyncService.this.mNotifyDataRemoveList;
                Logger.i(BaseNotifySyncService.TAG, "MSG_NOTIFY_REMOVE_TIMEOUT size = " + numValueOf2 + " ids: " + (list15 != null ? CollectionsKt___CollectionsKt.joinToString$default(list15, null, null, null, 0, null, new Function1() { // from class: t92
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj4) {
                        return BaseNotifySyncService.MyHandler.handleMessage$lambda$6((RemoveNotification) obj4);
                    }
                }, 31, null) : null));
                List list16 = BaseNotifySyncService.this.mNotifyDataRemoveList;
                if (list16 != null && (!list16.isEmpty())) {
                    BaseNotifySyncService.this.removeNotifications();
                }
                if (BaseNotifySyncService.this.mNotifyDataRemoveList == null) {
                    BaseNotifySyncService.this.mNotifyDataRemoveList = new ArrayList();
                    return;
                }
                List list17 = BaseNotifySyncService.this.mNotifyDataRemoveList;
                if (list17 != null) {
                    list17.clear();
                    return;
                }
                return;
            }
            Object obj4 = msg.obj;
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type com.xiaomi.fitness.notify.focus.RemoveNotification");
            RemoveNotification removeNotification = (RemoveNotification) obj4;
            sxg notifyData2 = removeNotification.getNotifyData();
            List list18 = BaseNotifySyncService.this.mNotifyDataList;
            if (list18 != null && (!list18.isEmpty())) {
                List list19 = BaseNotifySyncService.this.mNotifyDataList;
                Iterator it3 = list19 != null ? list19.iterator() : null;
                if (it3 != null) {
                    while (it3.hasNext()) {
                        NotificationInfo notificationInfo3 = (NotificationInfo) it3.next();
                        if (notificationInfo3.getNotifyData().i == notifyData2.c && Intrinsics.areEqual(notificationInfo3.getNotifyData().c, notifyData2.d) && Intrinsics.areEqual(notificationInfo3.getNotifyData().f33036k, notifyData2.f)) {
                            it3.remove();
                        }
                    }
                }
            }
            List list20 = BaseNotifySyncService.this.mNotifyDataListTempList;
            if (list20 != null && (!list20.isEmpty())) {
                List list21 = BaseNotifySyncService.this.mNotifyDataListTempList;
                Iterator it4 = list21 != null ? list21.iterator() : null;
                if (it4 != null) {
                    while (it4.hasNext()) {
                        NotificationInfo notificationInfo4 = (NotificationInfo) it4.next();
                        if (notificationInfo4.getNotifyData().i == notifyData2.c && Intrinsics.areEqual(notificationInfo4.getNotifyData().c, notifyData2.d) && Intrinsics.areEqual(notificationInfo4.getNotifyData().f33036k, notifyData2.f)) {
                            it4.remove();
                        }
                    }
                }
            }
            if (BaseNotifySyncService.this.mNotifyDataRemoveList == null) {
                BaseNotifySyncService.this.mNotifyDataRemoveList = new ArrayList();
            }
            List list22 = BaseNotifySyncService.this.mNotifyDataRemoveList;
            Iterator it5 = list22 != null ? list22.iterator() : null;
            if (it5 != null) {
                while (it5.hasNext()) {
                    sxg notifyData3 = ((RemoveNotification) it5.next()).getNotifyData();
                    if (notifyData3.c == notifyData2.c && Intrinsics.areEqual(notifyData3.d, notifyData2.d) && Intrinsics.areEqual(notifyData3.f, notifyData2.f)) {
                        it5.remove();
                    }
                }
            }
            List list23 = BaseNotifySyncService.this.mNotifyDataRemoveList;
            if (list23 != null) {
                list23.add(removeNotification);
            }
            List list24 = BaseNotifySyncService.this.mNotifyDataRemoveList;
            Logger.i(BaseNotifySyncService.TAG, "handle MSG_NOTIFY_REMOVE size = " + (list24 != null ? Integer.valueOf(list24.size()) : null));
            if (notifyData2.c != 0 || !Intrinsics.areEqual("phone", notifyData2.d)) {
                Handler handler5 = BaseNotifySyncService.this.mHandler;
                if (handler5 == null || handler5.hasMessages(4) || (handler2 = BaseNotifySyncService.this.mHandler) == null) {
                    return;
                }
                handler2.sendEmptyMessageDelayed(4, 100L);
                return;
            }
            Handler handler6 = BaseNotifySyncService.this.mHandler;
            if (handler6 != null) {
                handler6.removeMessages(4);
            }
            Handler handler7 = BaseNotifySyncService.this.mHandler;
            if (handler7 != null) {
                handler7.sendEmptyMessage(4);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/notify/BaseNotifySyncService$OpenNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/xiaomi/fitness/notify/BaseNotifySyncService;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class OpenNotificationReceiver extends BroadcastReceiver {
        public OpenNotificationReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            List list;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String stringExtra = intent.getStringExtra(BaseNotifySyncService.OPEN_NOTIFICATION_LIST);
            if (stringExtra == null || stringExtra.length() == 0 || (list = BaseNotifySyncService.this.mNotifyDataListTempList) == null || list.isEmpty()) {
                return;
            }
            List list2 = BaseNotifySyncService.this.mNotifyDataListTempList;
            Intrinsics.checkNotNull(list2);
            int size = list2.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    return;
                }
                List list3 = BaseNotifySyncService.this.mNotifyDataListTempList;
                Intrinsics.checkNotNull(list3);
                NotificationInfo notificationInfo = (NotificationInfo) list3.get(size);
                if (Intrinsics.areEqual(notificationInfo.getNotifyData().f33036k, stringExtra) && notificationInfo.getPendingIntent() != null) {
                    Logger.i(BaseNotifySyncService.TAG, "OpenNotificationReceiver onReceive isMatch = " + stringExtra);
                    try {
                        notificationInfo.getPendingIntent().send();
                        return;
                    } catch (PendingIntent.CanceledException unused) {
                        Logger.e(BaseNotifySyncService.TAG, "OpenNotificationReceiver CanceledException");
                        return;
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/notify/BaseNotifySyncService$RemoveNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/xiaomi/fitness/notify/BaseNotifySyncService;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class RemoveNotificationReceiver extends BroadcastReceiver {
        public RemoveNotificationReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(BaseNotifySyncService.REMOVE_NOTIFICATION_LIST);
            Logger.d(BaseNotifySyncService.TAG, "NotificationReceiver onReceive" + stringArrayListExtra);
            if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                return;
            }
            Iterator<String> it = stringArrayListExtra.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                String next = it.next();
                Logger.i(BaseNotifySyncService.TAG, "RemoveNotificationReceiver cancel" + next);
                if (BaseNotifySyncService.this.isNotificationServiceConnected) {
                    try {
                        BaseNotifySyncService.this.cancelNotification(next);
                    } catch (SecurityException e) {
                        Logger.i(BaseNotifySyncService.TAG, "RemoveNotificationReceiver exception" + e);
                    }
                }
            }
            List list = BaseNotifySyncService.this.mNotifyDataListTempList;
            if (list == null || !(!list.isEmpty())) {
                return;
            }
            List list2 = BaseNotifySyncService.this.mNotifyDataListTempList;
            Iterator it2 = list2 != null ? list2.iterator() : null;
            if (it2 != null) {
                while (it2.hasNext()) {
                    if (stringArrayListExtra.contains(((NotificationInfo) it2.next()).getNotifyData().f33036k)) {
                        it2.remove();
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/notify/BaseNotifySyncService$TimeZoneChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/xiaomi/fitness/notify/BaseNotifySyncService;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class TimeZoneChangeReceiver extends BroadcastReceiver {
        public TimeZoneChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            TimeZone timeZone = TimeZone.getDefault();
            if (timeZone == null) {
                return;
            }
            Logger.i(BaseNotifySyncService.TAG, "time zone change:" + timeZone);
            BaseNotifySyncService.this.mSimpleDateFormat.setTimeZone(timeZone);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.BaseNotifySyncService$reportReceiveData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.BaseNotifySyncService$reportReceiveData$1", f = "BaseNotifySyncService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $packageName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$packageName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseNotifySyncService.this.new AnonymousClass1(this.$packageName, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String firmwareVersion;
            WearableDeviceInfo deviceInfo;
            String firmwareVersion2;
            WearableDeviceInfo deviceInfo2;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IOnetrack.Companion companion = IOnetrack.INSTANCE;
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(companion);
            OneTrackStatBean oneTrackStatBean = new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.0.0.0.42183");
            Object[] objArr = new Object[18];
            objArr[0] = "name";
            objArr[1] = "notification_permission_setting";
            objArr[2] = "notification_listen";
            objArr[3] = Boxing.boxBoolean(NotifyStartExtKt.getNotificationManagerImpl().isNotificationListenersEnabled());
            objArr[4] = "notify_enabled";
            objArr[5] = Boxing.boxBoolean(NotifyStartExtKt.getNotificationManagerImpl().isNotifySwitchStatusEnable());
            objArr[6] = "background_unLimit";
            objArr[7] = Boxing.boxBoolean(d2m.y(BaseNotifySyncService.this.getApplication()));
            objArr[8] = "source";
            objArr[9] = "when_receive_notify";
            objArr[10] = "phone_brand";
            RomUtils romUtils = RomUtils.INSTANCE;
            String name = romUtils.getRomInfo().getName();
            String str = "";
            if (name == null) {
                name = "";
            }
            objArr[11] = name;
            objArr[12] = "user_id";
            UserInfoManager.Companion companion2 = UserInfoManager.INSTANCE;
            objArr[13] = AccountManagerExtKt.getInstance(companion2).getUserId();
            objArr[14] = "result";
            WearableDeviceManager.Companion companion3 = WearableDeviceManager.INSTANCE;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion3).getCurrentDeviceModel();
            objArr[15] = String.valueOf(wearableDeviceModel != null ? Boxing.boxBoolean(wearableDeviceModel.getIsDeviceConnected()) : null);
            objArr[16] = "device_version";
            WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion3).getCurrentDeviceModel();
            if (wearableDeviceModel2 == null || (deviceInfo2 = wearableDeviceModel2.getDeviceInfo()) == null || (firmwareVersion = deviceInfo2.getFirmwareVersion()) == null) {
                firmwareVersion = "";
            }
            objArr[17] = firmwareVersion;
            oneTrackExtKt.reportData(oneTrackStatBean, objArr);
            IOnetrack oneTrackExtKt2 = OneTrackExtKt.getInstance(companion);
            OneTrackStatBean oneTrackStatBean2 = new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.0.0.0.42187");
            Object[] objArr2 = new Object[12];
            objArr2[0] = "name";
            objArr2[1] = "notification_receive";
            objArr2[2] = "package_name";
            objArr2[3] = this.$packageName;
            objArr2[4] = "phone_brand";
            String name2 = romUtils.getRomInfo().getName();
            if (name2 == null) {
                name2 = "";
            }
            objArr2[5] = name2;
            objArr2[6] = "user_id";
            objArr2[7] = AccountManagerExtKt.getInstance(companion2).getUserId();
            objArr2[8] = "result";
            WearableDeviceModel wearableDeviceModel3 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion3).getCurrentDeviceModel();
            objArr2[9] = String.valueOf(wearableDeviceModel3 != null ? Boxing.boxBoolean(wearableDeviceModel3.getIsDeviceConnected()) : null);
            objArr2[10] = "device_version";
            WearableDeviceModel wearableDeviceModel4 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion3).getCurrentDeviceModel();
            if (wearableDeviceModel4 != null && (deviceInfo = wearableDeviceModel4.getDeviceInfo()) != null && (firmwareVersion2 = deviceInfo.getFirmwareVersion()) != null) {
                str = firmwareVersion2;
            }
            objArr2[11] = str;
            oneTrackExtKt2.reportData(oneTrackStatBean2, objArr2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.BaseNotifySyncService$reportSendToDeviceData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.BaseNotifySyncService$reportSendToDeviceData$1", f = "BaseNotifySyncService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C27151(Continuation<? super C27151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseNotifySyncService.this.new C27151(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WearableDeviceInfo deviceInfo;
            String firmwareVersion;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            OneTrackStatBean oneTrackStatBean = new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.0.0.0.42188");
            Object[] objArr = new Object[12];
            objArr[0] = "name";
            objArr[1] = "notification_send_to_device";
            objArr[2] = "value_num";
            objArr[3] = Boxing.boxInt(BaseNotifySyncService.this.mFinalSendNotificationList.size());
            objArr[4] = "phone_brand";
            String name = RomUtils.INSTANCE.getRomInfo().getName();
            String str = "";
            if (name == null) {
                name = "";
            }
            objArr[5] = name;
            objArr[6] = "user_id";
            objArr[7] = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
            objArr[8] = "result";
            WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            objArr[9] = String.valueOf(wearableDeviceModel != null ? Boxing.boxBoolean(wearableDeviceModel.getIsDeviceConnected()) : null);
            objArr[10] = "device_version";
            WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            if (wearableDeviceModel2 != null && (deviceInfo = wearableDeviceModel2.getDeviceInfo()) != null && (firmwareVersion = deviceInfo.getFirmwareVersion()) != null) {
                str = firmwareVersion;
            }
            objArr[11] = str;
            oneTrackExtKt.reportData(oneTrackStatBean, objArr);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addNotifications() {
        WearableDeviceModel wearableDeviceModel;
        List<NotificationInfo> list = this.mNotifyDataList;
        if (list == null || list.isEmpty() || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) == null || !wearableDeviceModel.getIsDeviceConnected()) {
            return;
        }
        this.mFinalSendNotificationList.clear();
        ArrayList arrayList = new ArrayList(this.mNotifyDataList);
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            if (isNeedRemoveNotify(wearableDeviceModel, (NotificationInfo) next)) {
                it.remove();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.mFinalSendNotificationList.add(((NotificationInfo) it2.next()).getNotifyData());
        }
        postNotifications();
    }

    private final void alertOutGoingCall() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && DeviceModelExtKt.isBluetooth(wearableDeviceModel) && NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
            BleNotifyModel.INSTANCE.alertOutGoingCall();
        }
    }

    private final void alertPhoneInCall(String phoneNum, String displayName) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            HuaMiNotifyModel.INSTANCE.getInstance().alertCall(wearableDeviceModel, phoneNum, displayName);
        } else {
            if (wearableDeviceModel == null || !DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
                return;
            }
            BleNotifyModel.INSTANCE.alertCall(wearableDeviceModel, phoneNum, displayName);
        }
    }

    private final void alertPhoneInCallStop() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            HuaMiNotifyModel.INSTANCE.getInstance().alertInCallStop(wearableDeviceModel);
        } else {
            if (wearableDeviceModel == null || !DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
                return;
            }
            BleNotifyModel.INSTANCE.alertInCallStop();
        }
    }

    private final void alertPhoneMissCall(String incomingNumber) {
        Logger.i(TAG, "alertPhoneMissCall incomingNumber = " + incomingNumber);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            HuaMiNotifyModel.INSTANCE.getInstance().alertInCallStop(wearableDeviceModel);
        } else {
            if (wearableDeviceModel == null || !DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
                return;
            }
            BleNotifyModel.INSTANCE.missPhoneCall(wearableDeviceModel, incomingNumber);
        }
    }

    private final String getFilterPackageName(String packageName) {
        return (RomUtils.INSTANCE.isVivo() && Intrinsics.areEqual("com.android.mms.service", packageName)) ? "com.android.mms" : packageName;
    }

    private final String getText(Bundle bundle) {
        Object obj = bundle != null ? bundle.get("android.text") : null;
        if (obj instanceof CharSequence) {
            return obj.toString();
        }
        if (obj == null) {
            return null;
        }
        Logger.i(TAG, "No CharSequence text:" + obj.getClass().getName());
        return null;
    }

    private final String getTitle(Bundle bundle) {
        Object obj = bundle != null ? bundle.get("android.title") : null;
        if (obj instanceof CharSequence) {
            return obj.toString();
        }
        if (obj == null) {
            return null;
        }
        Logger.i(TAG, "No CharSequence title:" + obj.getClass().getName());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNotificationPosted(StatusBarNotification sbn) {
        CharSequence charSequenceLoadLabel;
        NotificationInfo notificationInfo;
        String did;
        String str = "";
        int id = sbn.getId();
        String key = sbn.getKey();
        String packageName = sbn.getPackageName();
        boolean zIsOngoing = sbn.isOngoing();
        long postTime = sbn.getPostTime();
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        Logger.i(TAG, "onNotificationPosted Id:" + id + " key:" + key + " PackageName:" + packageName + " IsOngoing:" + zIsOngoing + " PostTime:" + postTime + " currentDeviceModel.connected: " + (wearableDeviceModel != null ? Boolean.valueOf(wearableDeviceModel.getIsDeviceConnected()) : "device is null"));
        NotifyLogUtils.INSTANCE.log();
        String packageName2 = sbn.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "getPackageName(...)");
        reportReceiveData(packageName2);
        Notification notification = sbn.getNotification();
        Bundle bundle = notification != null ? notification.extras : null;
        try {
            PackageManager packageManager = this.mPackageManager;
            Intrinsics.checkNotNull(packageManager);
            PackageInfo packageInfo = packageManager.getPackageInfo(sbn.getPackageName(), 0);
            if (packageInfo == null) {
                return;
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                PackageManager packageManager2 = this.mPackageManager;
                Intrinsics.checkNotNull(packageManager2);
                charSequenceLoadLabel = applicationInfo.loadLabel(packageManager2);
            } else {
                charSequenceLoadLabel = null;
            }
            String strValueOf = String.valueOf(charSequenceLoadLabel);
            if (TextUtils.isEmpty(strValueOf)) {
                return;
            }
            Logger.i(TAG, "onNotificationPosted Id:" + sbn.getId() + " , appName : " + strValueOf);
            NotificationFilterHelper notificationFilterHelper = NotificationFilterHelper.INSTANCE;
            if (notificationFilterHelper.isMipmapNotification(sbn)) {
                Logger.i(TAG, " isMipmapNotification = true");
                return;
            }
            String title = getTitle(bundle);
            String text = getText(bundle);
            if (sbn.isOngoing() && !notificationFilterHelper.isWeChatIncomingCall(sbn, title, text) && !notificationFilterHelper.isQQNormalMessage(sbn, text) && !notificationFilterHelper.isOtherVoiceIncomingCall(sbn)) {
                Logger.i(TAG, " isOngoing = true isIncomingCall = false");
                return;
            }
            if (notificationFilterHelper.isMiEarphone(sbn)) {
                Logger.i(TAG, " isMiEarphone = true");
                return;
            }
            if (isMiFocusNotification(sbn, notification)) {
                Logger.d(TAG, "isMiFocusNotification");
                return;
            }
            if (isMiMusicPlayerChannel(notification)) {
                Logger.d(TAG, "isMiMusicPlayerChannel");
                return;
            }
            if (isSpotifyPlayerChannel(sbn, notification)) {
                Logger.d(TAG, "isSpotifyPlayerChannel");
                return;
            }
            if (isAppGroupSummary(sbn) && !sbn.isOngoing()) {
                Logger.d(TAG, "isAppGroupSummary");
                return;
            }
            if (whatsAppFilter(sbn)) {
                Logger.d(TAG, "whatsAppFilter");
                return;
            }
            if (RomUtils.INSTANCE.isHuawei() && notificationFilterHelper.isHuaWeiMMSChannel(sbn)) {
                Logger.i(TAG, "isHuaWeiMMSChannel");
                return;
            }
            if (isMiHealthGlucoseAbnormalNotification(sbn, notification)) {
                Logger.i(TAG, "isMiHealthGlucoseAbnormalChannel return");
                return;
            }
            if (TextUtils.isEmpty(title) || TextUtils.isEmpty(text)) {
                if (notification == null || TextUtils.isEmpty(notification.tickerText)) {
                    Logger.i(TAG, "No title or text");
                    return;
                } else {
                    if (TextUtils.isEmpty(title)) {
                        title = strValueOf;
                    }
                    text = notification.tickerText.toString();
                }
            }
            String strSupportEmoji = supportEmoji(title);
            String strSupportEmoji2 = supportEmoji(text);
            if (Intrinsics.areEqual("com.xiaomi.xmsf", sbn.getPackageName()) && Intrinsics.areEqual("GroupSummary", strSupportEmoji) && Intrinsics.areEqual("GroupSummary", strSupportEmoji2)) {
                return;
            }
            String channelId = notification.getChannelId();
            String str2 = sbn.getId() + sbn.getKey() + channelId;
            if (this.mProgressNotificationTemp.contains(str2)) {
                Logger.i(TAG, "mProgressNotificationTemp.contains");
                return;
            }
            String packageName3 = sbn.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName3, "getPackageName(...)");
            String filterPackageName = getFilterPackageName(packageName3);
            Intrinsics.checkNotNull(notification);
            Bundle bundle2 = bundle;
            if (notificationFilterHelper.isProgressNotification(this, notification, filterPackageName)) {
                Logger.i(TAG, "onNotificationPosted isProgressNotification id = " + sbn.getId() + "  , key = " + sbn.getKey() + "  , appName = " + strValueOf + "  , channelId = " + channelId);
                if (this.mProgressNotificationTemp.contains(str2)) {
                    return;
                }
                if (this.mProgressNotificationTemp.size() >= 100) {
                    this.mProgressNotificationTemp.remove(0);
                }
                this.mProgressNotificationTemp.add(str2);
                return;
            }
            if (notificationFilterHelper.isHideInWhiteListNotification(sbn, filterPackageName)) {
                Logger.i(TAG, "isHideInWhiteListNotification = " + filterPackageName);
                return;
            }
            if (notificationFilterHelper.isMediaNotification(sbn)) {
                Logger.i(TAG, "onNotificationPosted isMediaNotification id = " + sbn.getId() + "  , key = " + sbn.getKey() + "  , appName = " + strValueOf + "  , channelId = " + channelId);
                return;
            }
            rxg rxgVar = new rxg();
            rxgVar.i = sbn.getId();
            rxgVar.c = filterPackageName;
            rxgVar.j = "";
            rxgVar.f33036k = sbn.getKey();
            rxgVar.d = strValueOf;
            rxgVar.e = strSupportEmoji;
            rxgVar.f = "";
            rxgVar.g = strSupportEmoji2;
            rxgVar.h = this.mSimpleDateFormat.format(new Date(sbn.getPostTime()));
            rxgVar.l = 0;
            Logger.i(TAG, "onNotificationPosted Id:" + sbn.getId() + " -> MSG_NOTIFY_ADD");
            if (notificationFilterHelper.isWeChatIncomingCall(sbn, strSupportEmoji, strSupportEmoji2)) {
                WechatCallNotifyManager wechatCallNotifyManager = WechatCallNotifyManager.INSTANCE;
                String key2 = sbn.getKey();
                Intrinsics.checkNotNullExpressionValue(key2, "getKey(...)");
                wechatCallNotifyManager.setKeyAndTime(key2, sbn.getPostTime());
                rxgVar.p = true;
            }
            if (NotifyStartExtKt.getNotificationFocusManager().supportFocusRomVersion() > 0 && NotifyStartExtKt.getNotificationFocusManager().hasFocusPermission(filterPackageName, this)) {
                String string = bundle2 != null ? bundle2.getString(NotificationFocusManager.NOTIFICATION_FOCUS_EXTRA) : null;
                Logger.i(TAG, "parseFocusNotification focusExtra = " + string);
                if (string != null && string.length() != 0) {
                    FocusNotificationParam focusNotificationParam = (FocusNotificationParam) new Gson().fromJson(string, new TypeToken<FocusNotificationParam>() { // from class: com.xiaomi.fitness.notify.BaseNotifySyncService$handleNotificationPosted$$inlined$fromJson$1
                    }.getType());
                    Logger.i(TAG, "parseFocusNotification focusNotificationParam = " + focusNotificationParam);
                    WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
                    if (wearableDeviceModel2 != null && (did = wearableDeviceModel2.getDid()) != null) {
                        str = did;
                    }
                    int deviceCapability = DeviceManagerExtKt.getInstance(companion).getDeviceCapability(str);
                    int deviceCapabilityV2 = DeviceManagerExtKt.getInstance(companion).getDeviceCapabilityV2(str);
                    Logger.i(TAG, "parseFocusNotification capability = " + deviceCapability + " capabilityV2 = " + deviceCapabilityV2);
                    if (!notificationFilterHelper.isNotificationSpotlightAppInWhiteList(filterPackageName)) {
                        Logger.i(TAG, "focus notify not in list");
                        return;
                    }
                    if ((deviceCapability & 16777216) == 0 && (deviceCapabilityV2 & 64) == 0 && Intrinsics.areEqual(focusNotificationParam.getUpdatable(), Boolean.TRUE)) {
                        return;
                    }
                    NotifyStartExtKt.getNotificationFocusManager().handleFocusNotification(filterPackageName, focusNotificationParam, rxgVar);
                    FocusNotificationParamV2 param_v2 = focusNotificationParam.getParam_v2();
                    if (NotifyStartExtKt.getNotificationFocusManager().handleFocusNotificationPostDisable(rxgVar, (param_v2 != null && Intrinsics.areEqual(param_v2.getUpdatable(), Boolean.TRUE)) || Intrinsics.areEqual(focusNotificationParam.getUpdatable(), Boolean.TRUE))) {
                        return;
                    }
                }
            }
            if (notificationFilterHelper.isSupportOpenNotificationApp(notification)) {
                rxgVar.o = true;
                notificationInfo = new NotificationInfo(rxgVar, notification.contentIntent, sbn.getPostTime());
            } else {
                rxgVar.o = false;
                notificationInfo = new NotificationInfo(rxgVar, null, sbn.getPostTime());
            }
            if (!isNeedRemoveNotify((WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel(), notificationInfo) && System.currentTimeMillis() - sbn.getPostTime() >= 600000) {
                NotifyPreference.INSTANCE.setNotificationDelayTime(System.currentTimeMillis());
                Logger.i(TAG, "onNotificationPosted notification delay:" + sbn.getPostTime() + ",current = " + System.currentTimeMillis());
            }
            Handler handler = this.mHandler;
            Intrinsics.checkNotNull(handler);
            Handler handler2 = this.mHandler;
            Intrinsics.checkNotNull(handler2);
            handler.sendMessage(handler2.obtainMessage(0, notificationInfo));
        } catch (Exception e) {
            Logger.e(TAG, "onNotificationPosted Id:" + sbn.getId() + "onNotificationPosted Exception" + e.getMessage());
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNotificationRemoved(StatusBarNotification sbn, int reason) {
        String packageName = sbn.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        String filterPackageName = getFilterPackageName(packageName);
        if (NotifyStartExtKt.getNotificationFocusManager().supportFocusRomVersion() > 0 && NotifyStartExtKt.getNotificationFocusManager().hasFocusPermission(filterPackageName, this)) {
            Notification notification = sbn.getNotification();
            Bundle bundle = notification != null ? notification.extras : null;
            String string = bundle != null ? bundle.getString(NotificationFocusManager.NOTIFICATION_FOCUS_EXTRA) : null;
            Logger.i(TAG, "onNotificationRemoved reason " + reasonToString(reason) + " ,focusExtra = " + string);
        }
        Logger.i(TAG, "onNotificationRemoved appID:" + filterPackageName + " uid:" + sbn.getId() + " key:" + sbn.getKey() + "  reason:" + reasonToString(reason));
        try {
            sxg sxgVar = new sxg();
            sxgVar.c = sbn.getId();
            sxgVar.d = filterPackageName;
            sxgVar.e = "";
            sxgVar.f = sbn.getKey();
            Handler handler = this.mHandler;
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage(3, new RemoveNotification(reason, sxgVar));
                Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
                WechatCallNotifyManager wechatCallNotifyManager = WechatCallNotifyManager.INSTANCE;
                if (!wechatCallNotifyManager.isCallNotifyKey(sbn.getKey())) {
                    handler.sendMessage(messageObtainMessage);
                    return;
                }
                Handler handler2 = this.mHandler;
                Intrinsics.checkNotNull(handler2);
                wechatCallNotifyManager.sendRemoveMessageDelayIfNeed(handler2, System.currentTimeMillis(), messageObtainMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final boolean isAppGroupSummary(StatusBarNotification sbn) {
        if (sbn == null || sbn.getNotification() == null) {
            return false;
        }
        return wwg.b(sbn.getNotification());
    }

    private final boolean isHighSurrogate(char c) {
        return 55296 <= c && c < 56064;
    }

    private final boolean isLowSurrogate(char c) {
        return 56064 <= c && c < 57343;
    }

    private final boolean isMiFocusNotification(StatusBarNotification sbn, Notification notification) {
        return sbn != null && notification != null && TextUtils.equals("channel1", notification.getChannelId()) && sbn.getId() == 186666 && Intrinsics.areEqual(sbn.getPackageName(), getPackageName());
    }

    private final boolean isMiHealthGlucoseAbnormalNotification(StatusBarNotification sbn, Notification notification) {
        return sbn != null && notification != null && sbn.getPackageName().equals(getPackageName()) && notification.getChannelId().equals("com.mi.health-glucose-channel-id");
    }

    private final boolean isMiMusicPlayerChannel(Notification notification) {
        return notification != null && TextUtils.equals("com.miui.player:remote-notification", notification.getChannelId());
    }

    private final boolean isNeedRemoveNotify(WearableDeviceModel deviceModel, NotificationInfo notifyData) {
        List<String> notifyEnableList;
        if (deviceModel == null) {
            return false;
        }
        Object systemService = getSystemService("keyguard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        KeyguardManager keyguardManager = (KeyguardManager) systemService;
        NotificationManagerInter notificationManagerImpl = NotifyStartExtKt.getNotificationManagerImpl();
        String appId = notifyData.getNotifyData().c;
        Intrinsics.checkNotNullExpressionValue(appId, "appId");
        if (notificationManagerImpl.isTelApp(appId)) {
            Logger.i(TAG, "isNeedRemoveNotify isTelNotifyEnable:  = " + NotifyStartExtKt.getNotificationManagerImpl().isTelNotifyEnable(deviceModel.getDid()));
            return (NotifyStartExtKt.getNotificationManagerImpl().isTelNotifyEnable(deviceModel.getDid()) || NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) ? false : true;
        }
        if (!NotifyStartExtKt.getNotificationManagerImpl().isNotifyStatusOnScreenLockEnable(deviceModel.getDid()) || keyguardManager.isKeyguardLocked()) {
            boolean zIsSyncAllNotifySwitchStatusEnable = NotifyStartExtKt.getNotificationManagerImpl().isSyncAllNotifySwitchStatusEnable();
            boolean zIsNotifySwitchStatusEnable = NotifyStartExtKt.getNotificationManagerImpl().isNotifySwitchStatusEnable(deviceModel.getDid());
            if (zIsNotifySwitchStatusEnable && zIsSyncAllNotifySwitchStatusEnable) {
                return false;
            }
            if (zIsNotifySwitchStatusEnable && ((notifyEnableList = NotifyStartExtKt.getNotificationManagerImpl().getNotifyEnableList()) == null || notifyEnableList.isEmpty())) {
                NotifyStartExtKt.getNotificationManagerImpl().setNotifyEnableList(ArraysKt___ArraysKt.toList(NotificationManagerInter.INSTANCE.getDEFAULT_OPEN_APP_LIST()));
            }
            NotificationManagerInter notificationManagerImpl2 = NotifyStartExtKt.getNotificationManagerImpl();
            String did = deviceModel.getDid();
            String appId2 = notifyData.getNotifyData().c;
            Intrinsics.checkNotNullExpressionValue(appId2, "appId");
            String appGroup = notifyData.getNotifyData().j;
            Intrinsics.checkNotNullExpressionValue(appGroup, "appGroup");
            if (notificationManagerImpl2.isNotificationEnable(did, appId2, appGroup)) {
                return false;
            }
            Logger.i(TAG, "isNeedRemoveNotify notificationNotEnabled: id = " + notifyData.getNotifyData().i);
            return true;
        }
        Logger.i(TAG, "isNeedRemoveNotify isNotifyStatusOnScreenLockEnable: id = " + notifyData.getNotifyData().i + " isKeyguardLocked:" + keyguardManager.isKeyguardLocked());
        if (notifyData.getNotifyData().q == null && notifyData.getNotifyData().f33037r == null) {
            return true;
        }
        boolean zIsSyncAllNotifySwitchStatusEnable2 = NotifyStartExtKt.getNotificationManagerImpl().isSyncAllNotifySwitchStatusEnable();
        boolean zIsNotifySwitchStatusEnable2 = NotifyStartExtKt.getNotificationManagerImpl().isNotifySwitchStatusEnable(deviceModel.getDid());
        NotificationManagerInter notificationManagerImpl3 = NotifyStartExtKt.getNotificationManagerImpl();
        String did2 = deviceModel.getDid();
        String appId3 = notifyData.getNotifyData().c;
        Intrinsics.checkNotNullExpressionValue(appId3, "appId");
        String appGroup2 = notifyData.getNotifyData().j;
        Intrinsics.checkNotNullExpressionValue(appGroup2, "appGroup");
        boolean zIsNotificationEnable = notificationManagerImpl3.isNotificationEnable(did2, appId3, appGroup2);
        if (zIsNotifySwitchStatusEnable2 && (zIsSyncAllNotifySwitchStatusEnable2 || zIsNotificationEnable)) {
            Logger.i(TAG, "isFocusNotify: focus isNull = " + (notifyData.getNotifyData().q == null) + " , focusV2 isNull = " + (notifyData.getNotifyData().f33037r == null));
            return false;
        }
        Logger.i(TAG, "isNeedRemoveNotify isFocusNotify: focus isNull = " + (notifyData.getNotifyData().q == null) + " , focusV2 isNull = " + (notifyData.getNotifyData().f33037r == null));
        return true;
    }

    private final boolean isSpotifyPlayerChannel(StatusBarNotification sbn, Notification notification) {
        if (notification != null && sbn != null) {
            String channelId = notification.getChannelId();
            if (TextUtils.equals("com.spotify.music", sbn.getPackageName()) && TextUtils.equals("playback_channel", channelId)) {
                return true;
            }
        }
        return false;
    }

    private final void postNotifications() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        List<rxg> list = this.mFinalSendNotificationList;
        Logger.i(TAG, "postNotifications list size:" + (list != null ? Integer.valueOf(list.size()) : null));
        List<rxg> list2 = this.mFinalSendNotificationList;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        rxg.d dVar = new rxg.d();
        dVar.c = (rxg[]) this.mFinalSendNotificationList.toArray(new rxg[0]);
        StringBuilder sb = new StringBuilder();
        Iterator it = ArrayIteratorKt.iterator(dVar.c);
        while (it.hasNext()) {
            rxg rxgVar = (rxg) it.next();
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append(rxgVar.i);
        }
        if (sb.length() > 0) {
            Logger.i(TAG, "postNotifications id list:" + ((Object) sb));
        }
        if (DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            BlueToothSender.INSTANCE.addNotifications(dVar);
        }
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            HuaMiNotifyModel.INSTANCE.getInstance().postNotifications(wearableDeviceModel, this.mFinalSendNotificationList);
        }
        reportSendToDeviceData();
    }

    private final String reasonToString(int reason) {
        switch (reason) {
            case 1:
                return "REASON_CLICK";
            case 2:
                return "REASON_CANCEL";
            case 3:
                return "REASON_CANCEL_ALL";
            case 4:
                return "REASON_ERROR";
            case 5:
                return "REASON_PACKAGE_CHANGED";
            case 6:
                return "REASON_USER_STOPPED";
            case 7:
                return "REASON_PACKAGE_BANNED";
            case 8:
                return "REASON_APP_CANCEL";
            case 9:
                return "REASON_APP_CANCEL_ALL";
            case 10:
                return "REASON_LISTENER_CANCEL";
            case 11:
                return "REASON_LISTENER_CANCEL_ALL";
            case 12:
                return "REASON_GROUP_SUMMARY_CANCELED";
            case 13:
                return "REASON_GROUP_OPTIMIZATION";
            case 14:
                return "REASON_PACKAGE_SUSPENDED";
            case 15:
                return "REASON_PROFILE_TURNED_OFF";
            case 16:
                return "REASON_UNAUTOBUNDLED";
            case 17:
                return "REASON_CHANNEL_BANNED";
            case 18:
                return "REASON_SNOOZED";
            case 19:
                return "REASON_TIMEOUT";
            case 20:
                return "REASON_CHANNEL_REMOVED";
            case 21:
                return "REASON_CLEAR_DATA";
            case 22:
                return "REASON_ASSISTANT_CANCEL";
            case 23:
                return "REASON_LOCKDOWN";
            default:
                return String.valueOf(reason);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeNotifications() {
        if (this.mNotifyDataRemoveList == null) {
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            ArrayList arrayList = new ArrayList();
            List<RemoveNotification> list = this.mNotifyDataRemoveList;
            Intrinsics.checkNotNull(list);
            arrayList.addAll(list);
            if (!NotifyStartExtKt.getNotificationManagerImpl().isSyncAllNotifySwitchStatusEnable()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sxg notifyData = ((RemoveNotification) it.next()).getNotifyData();
                    NotificationManagerInter notificationManagerImpl = NotifyStartExtKt.getNotificationManagerImpl();
                    String appId = notifyData.d;
                    Intrinsics.checkNotNullExpressionValue(appId, "appId");
                    if (!notificationManagerImpl.isTelApp(appId)) {
                        BleNotifySettingImpl companion = BleNotifySettingImpl.INSTANCE.getInstance();
                        String did = wearableDeviceModel.getDid();
                        String appId2 = notifyData.d;
                        Intrinsics.checkNotNullExpressionValue(appId2, "appId");
                        String appGroup = notifyData.e;
                        Intrinsics.checkNotNullExpressionValue(appGroup, "appGroup");
                        if (!companion.isNotificationEnable(did, appId2, appGroup)) {
                            it.remove();
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((RemoveNotification) it2.next()).getNotifyData());
                }
                sxg.a aVar = new sxg.a();
                sxg[] sxgVarArr = (sxg[]) arrayList2.toArray(new sxg[0]);
                aVar.c = sxgVarArr;
                int length = sxgVarArr.length;
                sxg sxgVar = sxgVarArr[0];
                Logger.i(TAG, "BLE remove notifications from  phone size = " + length + ", id = " + sxgVar.d + ", key = " + sxgVar.f);
                NotifyStartExtKt.getNotificationFocusManager().handleFocusNotificationRemove(arrayList);
                BlueToothSender.INSTANCE.removeNotifications(aVar);
            }
        }
        Logger.i(TAG, "removeNotifications isHuaMi " + (wearableDeviceModel != null ? Boolean.valueOf(DeviceModelExtKt.isHuaMi(wearableDeviceModel)) : null));
    }

    private final void reportReceiveData(String packageName) {
        AnyExtKt.io$default(null, new AnonymousClass1(packageName, null), 1, null);
    }

    private final void reportSendToDeviceData() {
        AnyExtKt.io$default(null, new C27151(null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    private final String supportEmoji(String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < charArray.length) {
            if (isHighSurrogate(charArray[i])) {
                if (i != charArray.length - 1) {
                    int i2 = i + 1;
                    if (isLowSurrogate(charArray[i2])) {
                        int codePoint = Character.toCodePoint(charArray[i], charArray[i2]);
                        Map<Integer, Integer> map = e98.f16409a;
                        if (map.containsKey(Integer.valueOf(codePoint))) {
                            Integer num = map.get(Integer.valueOf(codePoint));
                            Intrinsics.checkNotNull(num, "null cannot be cast to non-null type kotlin.Int");
                            sb.append((char) num.intValue());
                            Integer num2 = map.get(Integer.valueOf(codePoint));
                            Logger.d("emoji in map: " + Integer.toHexString(num2 != null ? num2.intValue() : 0), new Object[0]);
                        } else {
                            sb.append(charArray[i]);
                            sb.append(charArray[i2]);
                        }
                        i = i2;
                    } else {
                        sb.append(charArray[i]);
                    }
                } else {
                    sb.append(charArray[i]);
                }
            } else if (isHighSurrogate(charArray[i]) || isLowSurrogate(charArray[i])) {
                sb.append(charArray[i]);
            } else {
                int i3 = charArray[i] & CharCompanionObject.MAX_VALUE;
                Map<Integer, Integer> map2 = e98.f16409a;
                if (map2.containsKey(Integer.valueOf(i3))) {
                    Integer num3 = map2.get(Integer.valueOf(i3));
                    Intrinsics.checkNotNull(num3, "null cannot be cast to non-null type kotlin.Int");
                    sb.append((char) num3.intValue());
                } else {
                    sb.append(charArray[i]);
                }
            }
            i++;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final void toggleMediaSession() {
        if (isNeedMediaSession()) {
            this.mediaHelper.registerRemoteController(new ComponentName(this, getClass()));
        } else {
            this.mediaHelper.onDestroy();
        }
    }

    private final boolean whatsAppFilter(StatusBarNotification sbn) {
        boolean z = false;
        if (sbn != null && sbn.getNotification() != null) {
            Notification notification = sbn.getNotification();
            if (Intrinsics.areEqual(sbn.getPackageName(), "com.whatsapp")) {
                long j = this.lastWhatsAppWhen;
                if (j == -1) {
                    this.lastWhatsAppWhen = notification.when;
                } else {
                    long j2 = notification.when;
                    z = j == j2;
                    this.lastWhatsAppWhen = j2;
                }
            }
        }
        return z;
    }

    public final long getDelayTime() {
        return this.delayTime;
    }

    @Nullable
    public final HuamiApiCaller getHuamiApiCaller() {
        String mac;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (mac = DeviceModelExtKt.getMac(wearableDeviceModel)) == null) {
            mac = "";
        }
        return deviceManagerExtKt.getHuaMiApiCaller(mac);
    }

    @NotNull
    public final MediaHelper getMediaHelper() {
        return this.mediaHelper;
    }

    public final boolean isNeedMediaSession() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        boolean zIsHuaMi = wearableDeviceModel != null ? DeviceModelExtKt.isHuaMi(wearableDeviceModel) : true;
        boolean zIsDeviceSupportMilink = MilinkManagerExtKt.getInstance(MilinkManager.INSTANCE).isDeviceSupportMilink();
        Logger.i(TAG, "onListenerConnected isPhoneSupportMilink:" + this.isPhoneSupportMilink + "  isDeviceSupportMilink:" + zIsDeviceSupportMilink + " isHuamiOrNull:" + zIsHuaMi);
        return (this.isPhoneSupportMilink && zIsDeviceSupportMilink && !zIsHuaMi) ? false : true;
    }

    /* JADX INFO: renamed from: isPhoneSupportMilink, reason: from getter */
    public final boolean getIsPhoneSupportMilink() {
        return this.isPhoneSupportMilink;
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        IBinder iBinderOnBind = super.onBind(intent);
        Constant.INSTANCE.setBinding(true);
        if (isNeedMediaSession()) {
            this.mediaHelper.registerRemoteController(new ComponentName(this, getClass()));
        }
        return iBinderOnBind;
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientChange(boolean clearing) {
        this.mediaHelper.onClientChange(clearing);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientMetadataUpdate(@NotNull RemoteController.MetadataEditor metadataEditor) {
        Intrinsics.checkNotNullParameter(metadataEditor, "metadataEditor");
        this.mediaHelper.onClientMetadataUpdate(metadataEditor);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int state) {
        this.mediaHelper.onClientPlaybackStateUpdate(state);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientTransportControlUpdate(int transportControlFlags) {
        this.mediaHelper.onClientTransportControlUpdate(transportControlFlags);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        boolean zIsPhoneSupportMilink = MilinkManagerExtKt.getInstance(MilinkManager.INSTANCE).isPhoneSupportMilink();
        this.isPhoneSupportMilink = zIsPhoneSupportMilink;
        Logger.i(TAG, "onCreate phoneSupportMilink:" + zIsPhoneSupportMilink);
        Logger.i(TAG, "onCreate isNotificationListenersEnabled:" + NotifyStartExtKt.getNotificationManagerImpl().isNotificationListenersEnabled() + " pid:" + Process.myPid());
        Constant.INSTANCE.setServiceCreated(true);
        HandlerThread handlerThread = new HandlerThread("notify");
        this.handlerThread = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.handlerThread;
        this.mHandler = new MyHandler(handlerThread2 != null ? handlerThread2.getLooper() : null);
        this.mPackageManager = getPackageManager();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        registerReceiver(this.mTimeZoneChangeReceiver, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction(NOTIFY_REMOVE);
        aje.b(this).c(this.mRemoveNotificationReceiver, intentFilter2);
        IntentFilter intentFilter3 = new IntentFilter();
        intentFilter3.addAction(NOTIFY_OPEN);
        aje.b(this).c(this.mOpenNotificationReceiver, intentFilter3);
        IntentFilter intentFilter4 = new IntentFilter();
        intentFilter4.addAction(DeviceSettingConstants.INSTANCE.getSActionMusicSettingChange());
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.musicSettingChangeReceiver, intentFilter4, 2);
        } else {
            registerReceiver(this.musicSettingChangeReceiver, intentFilter4);
        }
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Logger.i(TAG, LifecycleConstantKt.ON_DESTROY);
        this.mediaHelper.onDestroy();
        aje.b(this).e(this.mRemoveNotificationReceiver);
        aje.b(this).e(this.mOpenNotificationReceiver);
        unregisterReceiver(this.musicSettingChangeReceiver);
        unregisterReceiver(this.mTimeZoneChangeReceiver);
        NotifyStartExtKt.getNotificationFocusManager().handleFocusNotificationRemoveIfListenDisConnect();
        Constant.Companion companion = Constant.INSTANCE;
        companion.setBinding(false);
        companion.setServiceCreated(false);
        HandlerThread handlerThread = this.handlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerConnected() {
        this.isNotificationServiceConnected = true;
        if (isNeedMediaSession()) {
            this.mediaHelper.registerRemoteController(new ComponentName(this, getClass()));
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerDisconnected() {
        this.isNotificationServiceConnected = false;
        Logger.i(TAG, "onListenerDisconnected");
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(@Nullable StatusBarNotification sbn) {
        super.onNotificationPosted(sbn);
        if (sbn == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 5;
        messageObtain.obj = sbn;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(@Nullable StatusBarNotification sbn, @Nullable NotificationListenerService.RankingMap rankingMap, int reason) {
        super.onNotificationRemoved(sbn, rankingMap, reason);
        if (sbn == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 6;
        messageObtain.obj = new NotificationWrapper(sbn, reason);
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        Logger.i(TAG, "onStartCommand");
        toggleMediaSession();
        return super.onStartCommand(intent, flags, startId);
    }

    public final void setDelayTime(long j) {
        this.delayTime = j;
    }

    public final void setPhoneSupportMilink(boolean z) {
        this.isPhoneSupportMilink = z;
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int state, long stateChangeTimeMs, long currentPosMs, float speed) {
        this.mediaHelper.onClientPlaybackStateUpdate(state, stateChangeTimeMs, currentPosMs, speed);
    }
}
