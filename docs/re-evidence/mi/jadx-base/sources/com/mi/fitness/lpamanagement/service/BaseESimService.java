package com.mi.fitness.lpamanagement.service;

import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.cmcc.server.ICMCCRemoteService;
import com.euicc.server.IRemoteService;
import com.facebook.react.modules.appstate.AppStateModule;
import com.mi.fitness.lpamanagement.request.LpaManagementApiRequest;
import com.mi.fitness.lpamanagement.service.BaseESimService;
import com.mi.fitness.lpamanagement.util.BluetoothSender;
import com.mi.fitness.lpamanagement.util.LpaManagementUtil;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.notify.Constant;
import com.xiaomi.passport.sim.SIMInfo;
import defpackage.azi;
import defpackage.fve;
import defpackage.kve;
import defpackage.s7r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011*\u0001\r\b\u0016\u0018\u0000 +2\u00020\u0001:\u0003)*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0016\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0005J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0016J\b\u0010 \u001a\u00020\u000bH\u0016J\b\u0010!\u001a\u00020\u000bH\u0002J\b\u0010\"\u001a\u00020\u000bH\u0002J\b\u0010#\u001a\u00020\u000bH\u0016R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0012\u0010\u0015\u001a\u00060\u0016R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010$\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/mi/fitness/lpamanagement/service/BaseESimService;", "Landroid/app/Service;", "<init>", "()V", "mShouldResetService", "", "lpaManagementApiRequest", "Lcom/mi/fitness/lpamanagement/request/LpaManagementApiRequest;", "getLpaManagementApiRequest", "()Lcom/mi/fitness/lpamanagement/request/LpaManagementApiRequest;", "onCreate", "", "receiver", "com/mi/fitness/lpamanagement/service/BaseESimService$receiver$1", "Lcom/mi/fitness/lpamanagement/service/BaseESimService$receiver$1;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onUnbind", LifecycleConstantKt.ON_DESTROY, "curDataHandler", "Lcom/mi/fitness/lpamanagement/service/BaseESimService$DataHandlerImpl;", "downloadESim", "activationCode", "", AuthorizeActivityBase.KEY_OPERATOR, "", "enableHighTechVersion", "onProfileDownloadStatusCallBack", "status", "clearSimInfoList", "onDeviceMultiSimInfoCallBack", "onGetEuiccDone", "loadEuiccInfo", "getESimList", "isConnected", "()Z", "did", "getDid", "()Ljava/lang/String;", "ESimInfo", "DataHandlerImpl", "Companion", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseESimService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseESimService.kt\ncom/mi/fitness/lpamanagement/service/BaseESimService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,334:1\n1872#2,3:335\n*S KotlinDebug\n*F\n+ 1 BaseESimService.kt\ncom/mi/fitness/lpamanagement/service/BaseESimService\n*L\n161#1:335,3\n*E\n"})
public class BaseESimService extends Service {
    private static final int EVENT_QUERY_TIMEOUT = 1;
    public static final int OPERATOR_CM = 1;
    public static final int OPERATOR_CT = 3;
    public static final int OPERATOR_CU = 2;

    @NotNull
    public static final String RESET_ACTION = "com.mi.fitness.EsimService.RESET_ACTION";

    @NotNull
    public static final String TAG = "BaseESimService";
    public static final int UNKNOWN = 0;

    @JvmField
    public static boolean isGetAttachedDeviceMultiSimInfoInProgress;

    @Nullable
    private static String queryStamp;

    @JvmField
    @NotNull
    public static Handler sHandler;

    @JvmField
    public boolean mShouldResetService;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int sResultCode = -2;
    private static int sDeviceType = 2;

    @NotNull
    private static String sDeviceIMEI = "";

    @NotNull
    private static String sDeviceSerialNumber = "";

    @NotNull
    private static String sProductName = "Mi Watch";

    @NotNull
    private static String sEID = "";

    @NotNull
    private static List<ESimInfo> esimInfoList = new ArrayList();

    @NotNull
    private final LpaManagementApiRequest lpaManagementApiRequest = new LpaManagementApiRequest();

    @NotNull
    private final BaseESimService$receiver$1 receiver = new BroadcastReceiver() { // from class: com.mi.fitness.lpamanagement.service.BaseESimService$receiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, BaseESimService.RESET_ACTION)) {
                Logger.i(BaseESimService.TAG, "receive RESET_ACTION");
                BaseESimService.Companion companion = BaseESimService.INSTANCE;
                companion.setSResultCode(-2);
                companion.setSDeviceIMEI("");
                companion.setSEID("");
                this.this$0.clearSimInfoList();
                companion.getEsimInfoList().clear();
                this.this$0.stopSelf();
            }
        }
    };

    @NotNull
    private final DataHandlerImpl curDataHandler = new DataHandlerImpl();

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0002J\u0006\u00105\u001a\u000202R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010\fR\u001a\u0010 \u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\n\"\u0004\b\"\u0010\fR\u001a\u0010#\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\n\"\u0004\b%\u0010\fR \u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u0012\u0010/\u001a\u0002008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/mi/fitness/lpamanagement/service/BaseESimService$Companion;", "", "<init>", "()V", "TAG", "", "isGetAttachedDeviceMultiSimInfoInProgress", "", "queryStamp", "getQueryStamp", "()Ljava/lang/String;", "setQueryStamp", "(Ljava/lang/String;)V", DeviceTypes.UNKNOWN, "", "OPERATOR_CM", "OPERATOR_CU", "OPERATOR_CT", "sResultCode", "getSResultCode", "()I", "setSResultCode", "(I)V", Constant.sDeviceType, "getSDeviceType", "setSDeviceType", "sDeviceIMEI", "getSDeviceIMEI", "setSDeviceIMEI", "sDeviceSerialNumber", "getSDeviceSerialNumber", "setSDeviceSerialNumber", "sProductName", "getSProductName", "setSProductName", "sEID", "getSEID", "setSEID", "esimInfoList", "", "Lcom/mi/fitness/lpamanagement/service/BaseESimService$ESimInfo;", "getEsimInfoList", "()Ljava/util/List;", "setEsimInfoList", "(Ljava/util/List;)V", "RESET_ACTION", "EVENT_QUERY_TIMEOUT", "sHandler", "Landroid/os/Handler;", "handleQueryTimeout", "", "msg", "Landroid/os/Message;", "resetEsimService", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized void handleQueryTimeout(Message msg) {
            if (BaseESimService.isGetAttachedDeviceMultiSimInfoInProgress) {
                if (Intrinsics.areEqual(getQueryStamp(), msg.obj.toString())) {
                    BaseESimService.isGetAttachedDeviceMultiSimInfoInProgress = false;
                    Logger.e(BaseESimService.TAG, "handleQueryTimeout: set isGetAttachedDeviceMultiSimInfoInProgress false");
                }
            }
        }

        @NotNull
        public final List<ESimInfo> getEsimInfoList() {
            return BaseESimService.esimInfoList;
        }

        @Nullable
        public final String getQueryStamp() {
            return BaseESimService.queryStamp;
        }

        @NotNull
        public final String getSDeviceIMEI() {
            return BaseESimService.sDeviceIMEI;
        }

        @NotNull
        public final String getSDeviceSerialNumber() {
            return BaseESimService.sDeviceSerialNumber;
        }

        public final int getSDeviceType() {
            return BaseESimService.sDeviceType;
        }

        @NotNull
        public final String getSEID() {
            return BaseESimService.sEID;
        }

        @NotNull
        public final String getSProductName() {
            return BaseESimService.sProductName;
        }

        public final int getSResultCode() {
            return BaseESimService.sResultCode;
        }

        public final synchronized void resetEsimService() {
            Logger.i(BaseESimService.TAG, "resetEsimService");
            ApplicationExtKt.getApplication().sendBroadcast(new Intent(BaseESimService.RESET_ACTION));
        }

        public final void setEsimInfoList(@NotNull List<ESimInfo> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            BaseESimService.esimInfoList = list;
        }

        public final void setQueryStamp(@Nullable String str) {
            BaseESimService.queryStamp = str;
        }

        public final void setSDeviceIMEI(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            BaseESimService.sDeviceIMEI = str;
        }

        public final void setSDeviceSerialNumber(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            BaseESimService.sDeviceSerialNumber = str;
        }

        public final void setSDeviceType(int i) {
            BaseESimService.sDeviceType = i;
        }

        public final void setSEID(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            BaseESimService.sEID = str;
        }

        public final void setSProductName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            BaseESimService.sProductName = str;
        }

        public final void setSResultCode(int i) {
            BaseESimService.sResultCode = i;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/mi/fitness/lpamanagement/service/BaseESimService$DataHandlerImpl;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "<init>", "(Lcom/mi/fitness/lpamanagement/service/BaseESimService;)V", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class DataHandlerImpl extends DataHandlerWrapper {
        public DataHandlerImpl() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            if (packet == null || packet.e != 9 || packet.f != 7) {
                return false;
            }
            int i = packet.x().o().c;
            Logger.i(BaseESimService.TAG, "report download progress:" + i);
            if (i == -1) {
                DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(9, BaseESimService.this.curDataHandler);
                BaseESimService.this.onProfileDownloadStatusCallBack(0);
            } else if (i == 100) {
                DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(9, BaseESimService.this.curDataHandler);
                BaseESimService.this.onProfileDownloadStatusCallBack(1);
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/mi/fitness/lpamanagement/service/BaseESimService$ESimInfo;", "", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", SIMInfo.SIM_INFO_TYPE_ICCID, "getIccid", "setIccid", AppStateModule.APP_STATE_ACTIVE, "", "getActive", "()Z", "setActive", "(Z)V", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ESimInfo {
        private boolean active;

        @Nullable
        private String iccid;

        @Nullable
        private String name;

        public final boolean getActive() {
            return this.active;
        }

        @Nullable
        public final String getIccid() {
            return this.iccid;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final void setActive(boolean z) {
            this.active = z;
        }

        public final void setIccid(@Nullable String str) {
            this.iccid = str;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }
    }

    static {
        final Looper mainLooper = Looper.getMainLooper();
        sHandler = new Handler(mainLooper) { // from class: com.mi.fitness.lpamanagement.service.BaseESimService$Companion$sHandler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg.what == 1) {
                    BaseESimService.INSTANCE.handleQueryTimeout(msg);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadESim$lambda$1(BaseESimService this$0, String activationCode, boolean z, List profiles) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activationCode, "$activationCode");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        if (!z) {
            Logger.i(TAG, "loadProfiles failed");
            this$0.onProfileDownloadStatusCallBack(0);
        } else if (profiles.isEmpty()) {
            Logger.i(TAG, "profile is empty start download profile");
            DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(9, this$0.curDataHandler);
            BluetoothSender.INSTANCE.downloadProfile(this$0.getDid(), LpaManagementUtil.INSTANCE.getRawActivationCode(activationCode), "", new Function1() { // from class: h72
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseESimService.downloadESim$lambda$1$lambda$0(((Boolean) obj).booleanValue());
                }
            });
        } else {
            Logger.i(TAG, "profileList is not empty");
            Application application = this$0.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            ToastExtKt.toastShort(application, azi.q);
            this$0.onProfileDownloadStatusCallBack(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadESim$lambda$1$lambda$0(boolean z) {
        Logger.i(TAG, "download result:" + z);
        return Unit.INSTANCE;
    }

    private final String getDid() {
        String did;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) ? "" : did;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getESimList$lambda$7$lambda$6(BaseESimService this$0, boolean z, List profiles) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        if (z && (!profiles.isEmpty())) {
            kve kveVar = (kve) profiles.get(0);
            String strByteToString = ByteUtil.byteToString(((kve) profiles.get(0)).c);
            boolean z2 = kveVar.f;
            String str = kveVar.e;
            ESimInfo eSimInfo = new ESimInfo();
            eSimInfo.setActive(z2);
            eSimInfo.setIccid(strByteToString);
            eSimInfo.setName(str);
            esimInfoList.add(eSimInfo);
        }
        this$0.loadEuiccInfo();
        return Unit.INSTANCE;
    }

    private final void loadEuiccInfo() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            BluetoothSender.INSTANCE.getEuiccInfo(wearableDeviceModel.getDid(), new Function2() { // from class: f72
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BaseESimService.loadEuiccInfo$lambda$5$lambda$4(this.f17478a, ((Boolean) obj).booleanValue(), (fve) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadEuiccInfo$lambda$5$lambda$4(BaseESimService this$0, boolean z, fve fveVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z && fveVar != null) {
            sEID = ByteUtil.byteToString(fveVar.c);
            sDeviceIMEI = fveVar.d;
            this$0.onGetEuiccDone();
        }
        return Unit.INSTANCE;
    }

    private final void onGetEuiccDone() {
        if (isGetAttachedDeviceMultiSimInfoInProgress) {
            onDeviceMultiSimInfoCallBack();
            isGetAttachedDeviceMultiSimInfoInProgress = false;
            sHandler.removeMessages(1);
        }
    }

    public void clearSimInfoList() {
    }

    public final void downloadESim(@NotNull final String activationCode, int operator) {
        Intrinsics.checkNotNullParameter(activationCode, "activationCode");
        Logger.i(TAG, "downloadEsim:" + activationCode);
        if (!isConnected()) {
            onProfileDownloadStatusCallBack(-2);
            return;
        }
        try {
            BluetoothSender.INSTANCE.loadProfiles(getDid(), new Function2() { // from class: e72
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BaseESimService.downloadESim$lambda$1(this.f16338a, activationCode, ((Boolean) obj).booleanValue(), (List) obj2);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final boolean enableHighTechVersion() {
        String firmwareVersion;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !Intrinsics.areEqual(DeviceModelExtKt.getModel(wearableDeviceModel), "mijia.watch.n62lte") || (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel)) == null) {
            return true;
        }
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) firmwareVersion, new String[]{"."}, false, 0, 6, (Object) null);
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) "1.11.11", new String[]{"."}, false, 0, 6, (Object) null);
            if (listSplit$default.size() != listSplit$default2.size()) {
                return false;
            }
            int i = 0;
            for (Object obj : listSplit$default) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                if (!Intrinsics.areEqual(str, listSplit$default2.get(i))) {
                    return Integer.parseInt(str) > Integer.parseInt((String) listSplit$default2.get(i));
                }
                i = i2;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public synchronized void getESimList() {
        if (isGetAttachedDeviceMultiSimInfoInProgress) {
            Logger.e(TAG, "getESimList: in progress ,so return");
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        isGetAttachedDeviceMultiSimInfoInProgress = true;
        String strValueOf = String.valueOf(System.currentTimeMillis());
        queryStamp = strValueOf;
        Handler handler = sHandler;
        handler.sendMessageDelayed(handler.obtainMessage(1, strValueOf), 10000L);
        CtESimService.INSTANCE.getMSimInfoList().clear();
        ICMCCRemoteService.INSTANCE.getMSimInfoList().clear();
        IRemoteService.INSTANCE.getMSimInfoList().clear();
        esimInfoList.clear();
        sEID = "";
        sDeviceIMEI = "";
        if (wearableDeviceModel != null) {
            BluetoothSender.INSTANCE.loadProfiles(wearableDeviceModel.getDid(), new Function2() { // from class: g72
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BaseESimService.getESimList$lambda$7$lambda$6(this.f18670a, ((Boolean) obj).booleanValue(), (List) obj2);
                }
            });
        }
    }

    @NotNull
    public final LpaManagementApiRequest getLpaManagementApiRequest() {
        return this.lpaManagementApiRequest;
    }

    public final boolean isConnected() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            return wearableDeviceModel.getIsDeviceConnected();
        }
        return false;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Logger.i(TAG, "onBind");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Logger.i(TAG, "onCreate");
        if (Build.VERSION.SDK_INT >= 33) {
            getApplication().registerReceiver(this.receiver, new IntentFilter(RESET_ACTION), 2);
        } else {
            getApplication().registerReceiver(this.receiver, new IntentFilter(RESET_ACTION));
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        Logger.i(TAG, LifecycleConstantKt.ON_DESTROY);
        try {
            getApplication().unregisterReceiver(this.receiver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onDeviceMultiSimInfoCallBack() {
    }

    public void onProfileDownloadStatusCallBack(int status) {
    }

    @Override // android.app.Service
    public boolean onUnbind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Logger.i(TAG, "onUnbind");
        return true;
    }
}
