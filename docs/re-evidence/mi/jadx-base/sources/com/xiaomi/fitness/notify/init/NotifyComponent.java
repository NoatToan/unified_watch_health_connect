package com.xiaomi.fitness.notify.init;

import android.app.NotificationManager;
import android.content.Intent;
import android.text.TextUtils;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.media.export.MediaHelper;
import com.xiaomi.fitness.milink.export.MilinkManager;
import com.xiaomi.fitness.milink.export.MilinkManagerExtKt;
import com.xiaomi.fitness.notify.BaseNotifySyncService;
import com.xiaomi.fitness.notify.BleNotifyModel;
import com.xiaomi.fitness.notify.CallServiceRegister;
import com.xiaomi.fitness.notify.Constant;
import com.xiaomi.fitness.notify.FindPhoneRegister;
import com.xiaomi.fitness.notify.di.NotifyStartExtKt;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.notify.init.NotifyComponent;
import com.xiaomi.fitness.notify.util.ApplicationIconSender;
import com.xiaomi.fitness.notify.util.NotifyLogUtils;
import com.xiaomi.fitness.notify.util.NotifyPreference;
import com.xiaomi.fitness.notify.util.NotifyUtil;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import dagger.hilt.android.EntryPointAccessors;
import defpackage.aje;
import defpackage.d2m;
import defpackage.oxg;
import defpackage.qxg;
import defpackage.s7r;
import defpackage.sxg;
import defpackage.wxg;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 &2\u00020\u0001:\u0004&'()B\u0007¢\u0006\u0004\b%\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u000fR\u001b\u0010\u0019\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u00060\u001fR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u00060\"R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/notify/init/NotifyComponent;", "", "Lqxg;", "notification", "", "handleOpenNotify", "(Lqxg;)V", "handleRemoveNotify", "", "did", "Lwxg;", "request", "handleReplyRequest", "(Ljava/lang/String;Lwxg;)V", "reportData", "()V", "startNotifyService", "initWearOsNotify", "initNotify", "statPermission", "Lcom/xiaomi/fitness/notify/init/NotifyComponent$MediaPoint;", "mediaPoint$delegate", "Lkotlin/Lazy;", "getMediaPoint", "()Lcom/xiaomi/fitness/notify/init/NotifyComponent$MediaPoint;", "mediaPoint", "Lcom/xiaomi/fitness/media/export/MediaHelper;", "mediaHelper$delegate", "getMediaHelper", "()Lcom/xiaomi/fitness/media/export/MediaHelper;", "mediaHelper", "Lcom/xiaomi/fitness/notify/init/NotifyComponent$ILFEventCallbackImpl;", "ilfEventCallback", "Lcom/xiaomi/fitness/notify/init/NotifyComponent$ILFEventCallbackImpl;", "Lcom/xiaomi/fitness/notify/init/NotifyComponent$DataHandlerImpl;", "dataHandlerImpl", "Lcom/xiaomi/fitness/notify/init/NotifyComponent$DataHandlerImpl;", "<init>", "Companion", "MediaPoint", "ILFEventCallbackImpl", "DataHandlerImpl", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@AppComponent(namespace = "通知提醒")
public final class NotifyComponent {

    @NotNull
    public static final String TAG = "NofityComponent";
    public static final int sControlNext = 2;
    public static final int sControlPause = 1;
    public static final int sControlPlay = 0;
    public static final int sControlPrev = 3;
    public static final int sControlVolDonw = 5;
    public static final int sControlVolUp = 4;

    /* JADX INFO: renamed from: mediaPoint$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mediaPoint = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ayg
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NotifyComponent.mediaPoint_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: mediaHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mediaHelper = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: byg
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NotifyComponent.mediaHelper_delegate$lambda$1(this.f4725a);
        }
    });

    @NotNull
    private final ILFEventCallbackImpl ilfEventCallback = new ILFEventCallbackImpl();

    @NotNull
    private final DataHandlerImpl dataHandlerImpl = new DataHandlerImpl();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/notify/init/NotifyComponent$DataHandlerImpl;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "<init>", "(Lcom/xiaomi/fitness/notify/init/NotifyComponent;)V", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class DataHandlerImpl extends DataHandlerWrapper {
        public DataHandlerImpl() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            oxg oxgVarO;
            String str;
            wxg wxgVarV;
            Intrinsics.checkNotNullParameter(did, "did");
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
            if (wearableDeviceModel == null) {
                Logger.i(NotifyComponent.TAG, "DataHandlerImpl handlePacket deviceModel is null");
                return false;
            }
            Logger.i(NotifyComponent.TAG, "DataHandlerImpl handlePacket type:" + type);
            if (type == 7) {
                Integer numValueOf = packet != null ? Integer.valueOf(packet.f) : null;
                if (numValueOf != null && numValueOf.intValue() == 2) {
                    Logger.i(NotifyComponent.TAG, "handlePacket endCall");
                    NotifyUtil.INSTANCE.endCall(AppUtil.getApp());
                    return true;
                }
                if (numValueOf != null && numValueOf.intValue() == 5) {
                    aje.b(AppUtil.getApp()).d(new Intent(Constant.SILENCE_RINGER));
                    return true;
                }
                if (numValueOf != null && numValueOf.intValue() == 13) {
                    qxg qxgVarC = packet.C();
                    if (qxgVarC != null && (wxgVarV = qxgVarC.v()) != null) {
                        NotifyComponent notifyComponent = NotifyComponent.this;
                        Logger.i("replyRequest :" + wxgVarV, new Object[0]);
                        notifyComponent.handleReplyRequest(did, wxgVarV);
                    }
                    return true;
                }
                if (numValueOf != null && numValueOf.intValue() == 1) {
                    Logger.d(NotifyComponent.TAG, "handlePacket remove notify");
                    qxg qxgVarC2 = packet.C();
                    if (qxgVarC2 != null) {
                        NotifyComponent.this.handleRemoveNotify(qxgVarC2);
                    }
                    return true;
                }
                if (numValueOf != null && numValueOf.intValue() == 8) {
                    Logger.d(NotifyComponent.TAG, "handlePacket open notify");
                    qxg qxgVarC3 = packet.C();
                    if (qxgVarC3 != null) {
                        NotifyComponent.this.handleOpenNotify(qxgVarC3);
                    }
                    return true;
                }
                if (numValueOf != null && numValueOf.intValue() == 16 && (str = (oxgVarO = packet.C().o()).c) != null && str.length() != 0) {
                    Logger.i(NotifyComponent.TAG, "handlePacket APP_ICON_APPLY  = " + oxgVarO.c);
                    ApplicationIconSender applicationIconSender = ApplicationIconSender.INSTANCE;
                    String did2 = wearableDeviceModel.getDid();
                    String packageName = oxgVarO.c;
                    Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                    applicationIconSender.trySendAppIcon(did2, packageName);
                    return true;
                }
            } else if (type == 18) {
                Logger.i(NotifyComponent.TAG, "DataHandlerImpl handlePacket type:" + type + " id:" + (packet != null ? Integer.valueOf(packet.f) : null));
                if (packet != null && packet.f == 0) {
                    MilinkManager.Companion companion = MilinkManager.INSTANCE;
                    boolean zIsDeviceSupportMilink = MilinkManagerExtKt.getInstance(companion).isDeviceSupportMilink();
                    Logger.i(NotifyComponent.TAG, "packet?.id is Media.WEAR_REQUEST did == " + wearableDeviceModel.getDid() + " isDeviceSupportMilink:" + zIsDeviceSupportMilink);
                    if (MilinkManagerExtKt.getInstance(companion).isPhoneSupportMilink() && zIsDeviceSupportMilink) {
                        Logger.d(NotifyComponent.TAG, "request phone media info from milink");
                    } else {
                        Logger.d(NotifyComponent.TAG, "request phone media info from media session");
                        NotifyComponent.this.getMediaHelper().onRequest(wearableDeviceModel.getDid());
                    }
                    return true;
                }
                if (packet != null && packet.f == 2) {
                    NotifyComponent.this.getMediaHelper().onControl(packet.A());
                    return true;
                }
            } else if (type == 21 && packet != null && packet.f == 2) {
                if (packet.r() == null) {
                    Logger.d(NotifyComponent.TAG, "packet.getContact is null");
                    return false;
                }
                String strR = packet.r().r();
                if (TextUtils.isEmpty(strR)) {
                    Logger.i(NotifyComponent.TAG, "packet.getContact number isEmpty");
                    return false;
                }
                if (NotifyUtil.INSTANCE.shouldRequestPermission("android.permission.READ_CONTACTS")) {
                    Logger.i(NotifyComponent.TAG, "read contacts permission denied");
                } else {
                    AnyExtKt.io$default(null, new NotifyComponent$DataHandlerImpl$handlePacket$2(strR, wearableDeviceModel, null), 1, null);
                }
                return true;
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/notify/init/NotifyComponent$ILFEventCallbackImpl;", "Lcom/xiaomi/fitness/device/manager/export/LFEventCallbackWrapper;", "<init>", "(Lcom/xiaomi/fitness/notify/init/NotifyComponent;)V", "endCall", "", "ignoreCall", "phoneMuteMode", "phoneNormalMode", "onMusicControl", "deviceCommand", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$DeviceCommand;", "onNotificationDelete", "var1", "", "phoneMuteState", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNotifyComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotifyComponent.kt\ncom/xiaomi/fitness/notify/init/NotifyComponent$ILFEventCallbackImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,534:1\n1#2:535\n*E\n"})
    public final class ILFEventCallbackImpl extends LFEventCallbackWrapper {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HMMusicControl.DeviceCommand.values().length];
                try {
                    iArr[HMMusicControl.DeviceCommand.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HMMusicControl.DeviceCommand.PLAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HMMusicControl.DeviceCommand.PAUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[HMMusicControl.DeviceCommand.NEXT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[HMMusicControl.DeviceCommand.PREV.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[HMMusicControl.DeviceCommand.VOL_UP.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[HMMusicControl.DeviceCommand.VOL_DOWN.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public ILFEventCallbackImpl() {
        }

        @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper, com.xiaomi.wearable.hm.s
        public void endCall() {
            Logger.i("NofityComponent:ILFEventCallbackImpl endCall", new Object[0]);
            NotifyUtil.INSTANCE.endCall(AppUtil.getApp());
        }

        @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper, com.xiaomi.wearable.hm.s
        public void ignoreCall() {
            aje.b(AppUtil.getApp()).d(new Intent(Constant.SILENCE_RINGER));
        }

        @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper
        public void onMusicControl(@Nullable HMMusicControl.DeviceCommand deviceCommand) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            String did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
            Logger.i("NofityComponent:onMusicControl did == : " + did + "deviceCommand : " + deviceCommand, new Object[0]);
            switch (deviceCommand == null ? -1 : WhenMappings.$EnumSwitchMapping$0[deviceCommand.ordinal()]) {
                case 1:
                    if (did != null) {
                        NotifyComponent.this.getMediaHelper().onRequest(did);
                    }
                    break;
                case 2:
                    NotifyComponent.this.getMediaHelper().onControl(0);
                    break;
                case 3:
                    NotifyComponent.this.getMediaHelper().onControl(1);
                    break;
                case 4:
                    NotifyComponent.this.getMediaHelper().onControl(2);
                    break;
                case 5:
                    NotifyComponent.this.getMediaHelper().onControl(3);
                    break;
                case 6:
                    NotifyComponent.this.getMediaHelper().onControl(4);
                    break;
                case 7:
                    NotifyComponent.this.getMediaHelper().onControl(5);
                    break;
            }
        }

        @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper, com.xiaomi.wearable.hm.s
        public void onNotificationDelete(int var1) {
            super.onNotificationDelete(var1);
        }

        @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper, com.xiaomi.wearable.hm.s
        public void phoneMuteMode() {
            Object systemService = AppUtil.getApp().getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            if (!((NotificationManager) systemService).isNotificationPolicyAccessGranted()) {
                Logger.e("NofityComponent:phoneMuteMode: no permission", new Object[0]);
                return;
            }
            Logger.e("NofityComponent:phoneMuteMode: has permission", new Object[0]);
            Intent intent = new Intent(Constant.SILENCE_RINGER);
            intent.putExtra(Constant.sDeviceType, 1);
            aje.b(AppUtil.getApp()).d(intent);
        }

        @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper, com.xiaomi.wearable.hm.s
        public void phoneMuteState() {
        }

        @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper, com.xiaomi.wearable.hm.s
        public void phoneNormalMode() {
            Object systemService = AppUtil.getApp().getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            if (!((NotificationManager) systemService).isNotificationPolicyAccessGranted()) {
                Logger.e("NofityComponent:phoneNormalMode: no permission", new Object[0]);
                return;
            }
            Logger.e("NofityComponent:phoneNormalMode: has permission", new Object[0]);
            Intent intent = new Intent(Constant.NORMAL);
            intent.putExtra(Constant.sDeviceType, 1);
            aje.b(AppUtil.getApp()).d(intent);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/notify/init/NotifyComponent$MediaPoint;", "", "getMediaHelper", "Lcom/xiaomi/fitness/media/export/MediaHelper;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface MediaPoint {
        @NotNull
        MediaHelper getMediaHelper();
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.init.NotifyComponent$startNotifyService$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.init.NotifyComponent$startNotifyService$1", f = "NotifyComponent.kt", i = {}, l = {512}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C27281(Continuation<? super C27281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27281(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            try {
                ApplicationExtKt.getApplication().startService(new Intent(ApplicationExtKt.getApplication(), NotifyStartExtKt.getNotifyStartHelper().provideNotificationService()));
            } catch (Exception e) {
                Logger.i(NotifyComponent.TAG, "restartService play failed:" + e.getMessage());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.init.NotifyComponent$statPermission$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.init.NotifyComponent$statPermission$1", f = "NotifyComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C27291(Continuation<? super C27291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotifyComponent.this.new C27291(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NotifyComponent.this.reportData();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOpenNotify(qxg notification) {
        String str;
        sxg sxgVarR = notification.r();
        if (sxgVarR == null || (str = sxgVarR.f) == null) {
            return;
        }
        Logger.i(TAG, "handleOpenNotify = " + str);
        Intent intent = new Intent(BaseNotifySyncService.NOTIFY_OPEN);
        intent.putExtra(BaseNotifySyncService.OPEN_NOTIFICATION_LIST, str);
        aje.b(ApplicationExtKt.getApplication()).d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRemoveNotify(qxg notification) {
        sxg[] sxgVarArr;
        ArrayList<String> arrayList = new ArrayList<>();
        if (notification.r() != null && notification.r().f != null) {
            arrayList.add(notification.r().f);
        }
        if (notification.s() != null && (sxgVarArr = notification.s().c) != null && sxgVarArr.length != 0) {
            Iterator it = ArrayIteratorKt.iterator(notification.s().c);
            while (it.hasNext()) {
                String str = ((sxg) it.next()).f;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        Logger.i(TAG, "handleRemoveNotify" + arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        Intent intent = new Intent(BaseNotifySyncService.NOTIFY_REMOVE);
        intent.putStringArrayListExtra(BaseNotifySyncService.REMOVE_NOTIFICATION_LIST, arrayList);
        aje.b(ApplicationExtKt.getApplication()).d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleReplyRequest(String did, wxg request) {
        if (request.e == 1) {
            BleNotifyModel.INSTANCE.sendSms(did, request);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaHelper mediaHelper_delegate$lambda$1(NotifyComponent this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMediaPoint().getMediaHelper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaPoint mediaPoint_delegate$lambda$0() {
        return (MediaPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), MediaPoint.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportData() {
        WearableDeviceInfo deviceInfo;
        String firmwareVersion;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.0.0.0.42183");
        Object[] objArr = new Object[18];
        objArr[0] = "name";
        objArr[1] = "notification_permission_setting";
        objArr[2] = "notification_listen";
        objArr[3] = Boolean.valueOf(NotifyHelperExtKt.getNotificationManagerExport().isNotificationListenersEnabled());
        objArr[4] = "notify_enabled";
        objArr[5] = Boolean.valueOf(NotifyHelperExtKt.getNotificationManagerExport().isNotifySwitchStatusEnable());
        objArr[6] = "background_unLimit";
        objArr[7] = Boolean.valueOf(d2m.y(ApplicationExtKt.getApplication()));
        objArr[8] = "source";
        objArr[9] = "when_enter_app";
        objArr[10] = "phone_brand";
        String name = RomUtils.INSTANCE.getRomInfo().getName();
        String str = "";
        if (name == null) {
            name = "";
        }
        objArr[11] = name;
        objArr[12] = "user_id";
        objArr[13] = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        objArr[14] = "result";
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        objArr[15] = Boolean.valueOf(wearableDeviceModel != null ? wearableDeviceModel.getIsDeviceConnected() : false);
        objArr[16] = "device_version";
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel2 != null && (deviceInfo = wearableDeviceModel2.getDeviceInfo()) != null && (firmwareVersion = deviceInfo.getFirmwareVersion()) != null) {
            str = firmwareVersion;
        }
        objArr[17] = str;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startNotifyService() {
        try {
            Logger.i(TAG, "startService play notify service");
            ApplicationExtKt.getApplication().startService(new Intent(ApplicationExtKt.getApplication(), NotifyStartExtKt.getNotifyStartHelper().provideNotificationService()));
        } catch (Exception e) {
            Logger.i(TAG, "startService play failed:" + e.getMessage());
            AnyExtKt.io$default(null, new C27281(null), 1, null);
        }
    }

    @NotNull
    public final MediaHelper getMediaHelper() {
        return (MediaHelper) this.mediaHelper.getValue();
    }

    @NotNull
    public final MediaPoint getMediaPoint() {
        return (MediaPoint) this.mediaPoint.getValue();
    }

    @ComponentTask(notEarlierThan = 4, notLaterThan = 4, onMainThread = true, processName = ":device")
    public final void initNotify() {
        DeviceContact.Companion companion = DeviceContact.INSTANCE;
        DeviceSyncExtKt.getInstance(companion).addDataHandler(7, this.dataHandlerImpl);
        DeviceSyncExtKt.getInstance(companion).addDataHandler(21, this.dataHandlerImpl);
        DeviceSyncExtKt.getInstance(companion).addDataHandler(18, this.dataHandlerImpl);
        Logger.d(TAG, "addDataHandler");
        NotifyLogUtils.INSTANCE.log();
        NotifyStartExtKt.getNotifyStartHelper().toggleNotificationListenerService();
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(new OnDeviceFullStatusListener() { // from class: com.xiaomi.fitness.notify.init.NotifyComponent.initNotify.1
            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectFailure(String did, int errorCode, int retryTimes) {
                Logger.d(NotifyComponent.TAG, "onConnectFailure errorCode: " + errorCode);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectStart(String did) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                HuamiApiCaller huaMiApiCaller;
                Product product;
                Logger.d(NotifyComponent.TAG, "onConnectSuccess did: " + did);
                WearableDeviceManager.Companion companion2 = WearableDeviceManager.INSTANCE;
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion2).getCurrentDeviceModel();
                Logger.d(NotifyComponent.TAG, "onStart did: " + did + " product.type = " + ((wearableDeviceModel == null || (product = wearableDeviceModel.getProduct()) == null) ? null : Integer.valueOf(product.getType())) + " isHuami:" + (wearableDeviceModel != null ? Boolean.valueOf(DeviceModelExtKt.isHuaMi(wearableDeviceModel)) : null) + " isBluetooth:" + (wearableDeviceModel != null ? Boolean.valueOf(DeviceModelExtKt.isBluetooth(wearableDeviceModel)) : null));
                if (wearableDeviceModel != null) {
                    NotifyComponent notifyComponent = NotifyComponent.this;
                    if (DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "notification") && !DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
                        notifyComponent.startNotifyService();
                        Logger.d(NotifyComponent.TAG, "startService");
                        CallServiceRegister.INSTANCE.getInstance().registerReceiver();
                        FindPhoneRegister.INSTANCE.getInstance().registerReceiver();
                    }
                }
                if (wearableDeviceModel != null && DeviceModelExtKt.isHuaMi(wearableDeviceModel) && (huaMiApiCaller = DeviceManagerExtKt.getInstance(companion2).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel))) != null) {
                    huaMiApiCaller.addLFEventCallback(NotifyComponent.this.ilfEventCallback);
                }
                NotifyStartExtKt.getNotifyStartHelper().toggleNotificationListenerService();
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener
            public void onDestroy(String did, boolean isRemoved) {
                super.onDestroy(did, isRemoved);
                if (!isRemoved || did == null || did.length() == 0) {
                    return;
                }
                NotifyPreference notifyPreference = NotifyPreference.INSTANCE;
                notifyPreference.setNotifyIconListString(did, null);
                notifyPreference.setNeedShowNotificationRemind(did, true);
                notifyPreference.setNeedShowInCallRemind(did, true);
                notifyPreference.setNeedSyncNotification(did, true);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) {
                Logger.d(NotifyComponent.TAG, "onDisconnect did: " + did);
            }
        });
    }

    @ComponentTask(notEarlierThan = 4, notLaterThan = 4, onMainThread = true)
    public final void initWearOsNotify() {
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addSyncStateListener(new SyncStateListener() { // from class: com.xiaomi.fitness.notify.init.NotifyComponent.initWearOsNotify.1
            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onFinish(String did, int code) {
                Intrinsics.checkNotNullParameter(did, "did");
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onStart(String did) {
                Intrinsics.checkNotNullParameter(did, "did");
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel == null || !DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
                    return;
                }
                NotifyStartExtKt.getNotificationManagerImpl().initWearOsAllSync();
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onSyncing(String did, int progress) {
                Intrinsics.checkNotNullParameter(did, "did");
            }
        });
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.notify.init.NotifyComponent.initWearOsNotify.2
            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectFailure(String did, int errorCode, int retryTimes) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectStart(String did) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel == null || !DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
                    return;
                }
                NotifyStartExtKt.getNotificationManagerImpl().initWearOsAllSync();
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) {
            }
        });
    }

    @ComponentTask(notEarlierThan = 10, onMainThread = false)
    public final void statPermission() {
        AnyExtKt.io$default(null, new C27291(null), 1, null);
    }
}
