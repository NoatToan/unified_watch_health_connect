package com.xiaomi.fitness.electronic.scale.config.sync;

import com.facebook.react.bridge.BaseJavaModule;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl;
import com.xiaomi.fitness.electronic.scale.data.ClaimRecord;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.event.ScaleEventBusIds;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.ProxyResponse;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.electronic.scale.export.bean.ShareAccount;
import com.xiaomi.fitness.electronic.scale.export.bean.SharedUser;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.export.sp.ElectronicScalePreference;
import com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper;
import com.xiaomi.fitness.electronic.scale.manager.MiAccountManager;
import com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper;
import com.xiaomi.fitness.electronic.scale.manager.WeightManager;
import com.xiaomi.fitness.electronic.scale.request.BindScaleRequest;
import com.xiaomi.fitness.electronic.scale.request.ScaleRequest;
import com.xiaomi.fitness.electronic.scale.util.DateUtil;
import com.xiaomi.fitness.electronic.scale.util.EcoDataHandlerHelper;
import com.xiaomi.fitness.electronic.scale.util.ScaleUtil;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.rn.share.ui.DeviceShareActivity;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.common.MRnCrossModuleConst;
import defpackage.bx7;
import defpackage.cz7;
import defpackage.ex7;
import defpackage.f4b;
import defpackage.iz7;
import defpackage.jx7;
import defpackage.ld8;
import defpackage.lx7;
import defpackage.mxo;
import defpackage.rw7;
import defpackage.sw7;
import defpackage.u7r;
import defpackage.uno;
import defpackage.uw7;
import defpackage.uxo;
import defpackage.ww7;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 C2\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\bA\u0010BJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0010J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u0010J\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010\u001fJ!\u0010%\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010\u0010J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010-J\u0015\u0010/\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b/\u0010\u0010J!\u00101\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u00100\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b3\u0010\u0010J\u0017\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b8\u0010\u0010R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0012098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020(098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020>098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010;R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020>098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010;¨\u0006D"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/config/sync/EightDeviceSyncImpl;", "Lcom/xiaomi/fitness/electronic/scale/config/sync/DeviceSync;", "Lex7;", SceneRecogBroadcastReceiver.FROM_USER, "", "deviceUserHasUser", "(Lex7;)Z", "", "did", "Lbx7;", "data", "hasHistoryData", "(Ljava/lang/String;Lbx7;)Z", "deviceId", "", "syncUser", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ShareAccount;", MRnCrossModuleConst.LightGroupMemberUpdateActivity.KEY_MEMBER, "addShareMember", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "", "userNum", "syncShareMemberUser", "(Ljava/lang/String;I)V", "account", "addShareUser", "(Ljava/lang/String;Lcom/xiaomi/fitness/electronic/scale/export/bean/ShareAccount;)V", "userId", "isDelShareUserToDevice", "(Ljava/lang/String;Lex7;)V", "syncTime", "addVirtualUser", "isDelVirtualUserToDevice", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "callback", "syncBindUer", "(Ljava/lang/String;Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;)V", "syncHistoryData", "Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;", "claimRecord", "saveHistoryData", "(Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;)V", "addHistoryData", "(Ljava/lang/String;Lbx7;)V", "saveData", "syncVirtualUser", "force", "syncMainUserInfoByDid", "(Ljava/lang/String;Z)V", "sendVersion", "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnEcoPaketEvent;", "event", "onEcoPacket", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnEcoPaketEvent;)V", BaseJavaModule.METHOD_TYPE_SYNC, "", DeviceShareActivity.sPageShareList, "Ljava/util/List;", "deviceUserList", "historyDataList", "", "delUserId", "addVirtualUserSuccessUserId", "<init>", "()V", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEightDeviceSyncImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EightDeviceSyncImpl.kt\ncom/xiaomi/fitness/electronic/scale/config/sync/EightDeviceSyncImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,749:1\n1863#2,2:750\n1863#2,2:752\n1863#2,2:754\n1863#2,2:756\n1863#2,2:758\n1863#2,2:760\n1863#2,2:763\n29#3:762\n*S KotlinDebug\n*F\n+ 1 EightDeviceSyncImpl.kt\ncom/xiaomi/fitness/electronic/scale/config/sync/EightDeviceSyncImpl\n*L\n97#1:750,2\n106#1:752,2\n196#1:754,2\n267#1:756,2\n347#1:758,2\n398#1:760,2\n327#1:763,2\n212#1:762\n*E\n"})
public final class EightDeviceSyncImpl implements DeviceSync {
    public static final int APP_VERSION = 1;

    @NotNull
    public static final String TAG = "EightDeviceSyncImpl";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static List<VirtualAccount> userList = new ArrayList();

    @NotNull
    private List<ShareAccount> shareList = new ArrayList();

    @NotNull
    private List<ex7> deviceUserList = new ArrayList();

    @NotNull
    private List<ClaimRecord> historyDataList = new ArrayList();

    @NotNull
    private List<Long> delUserId = new ArrayList();

    @NotNull
    private List<Long> addVirtualUserSuccessUserId = new ArrayList();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\tR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/config/sync/EightDeviceSyncImpl$Companion;", "", "Lbx7;", "data", "", "hasZk", "(Lbx7;)Z", "Lrw7;", "isBodyCompositionHasZk", "(Lrw7;)Z", "bodyComposition", "hasUserBia", "", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "userList", "Ljava/util/List;", "getUserList", "()Ljava/util/List;", "setUserList", "(Ljava/util/List;)V", "", "TAG", "Ljava/lang/String;", "", "APP_VERSION", "I", "<init>", "()V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<VirtualAccount> getUserList() {
            return EightDeviceSyncImpl.userList;
        }

        public final boolean hasUserBia(@Nullable rw7 bodyComposition) {
            return (bodyComposition == null || bodyComposition.j.c == 0) ? false : true;
        }

        public final boolean hasZk(@NotNull bx7 data) {
            Intrinsics.checkNotNullParameter(data, "data");
            sw7 sw7Var = data.h;
            if (sw7Var.c == 0 || sw7Var.d == 0 || sw7Var.e == 0 || sw7Var.f == 0 || sw7Var.g == 0 || sw7Var.h == 0) {
                return false;
            }
            sw7 sw7Var2 = data.i;
            return (sw7Var2.c == 0 || sw7Var2.d == 0 || sw7Var2.e == 0 || sw7Var2.f == 0 || sw7Var2.g == 0 || sw7Var2.h == 0) ? false : true;
        }

        public final boolean isBodyCompositionHasZk(@Nullable rw7 data) {
            if (data == null) {
                return false;
            }
            sw7 sw7Var = data.h;
            if (sw7Var.c != 0 && sw7Var.d != 0 && sw7Var.e != 0 && sw7Var.f != 0 && sw7Var.g != 0 && sw7Var.h != 0) {
                sw7 sw7Var2 = data.i;
                if (sw7Var2.c != 0 && sw7Var2.d != 0 && sw7Var2.e != 0 && sw7Var2.f != 0 && sw7Var2.g != 0 && sw7Var2.h != 0) {
                    return true;
                }
            }
            return false;
        }

        public final void setUserList(@NotNull List<VirtualAccount> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            EightDeviceSyncImpl.userList = list;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl$saveData$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl$saveData$2", f = "EightDeviceSyncImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C23592 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C23592(Continuation<? super C23592> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23592(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ScaleUtil.INSTANCE.sendDataChangedBroadcast(true, Boxing.boxInt(0));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23592) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl$saveData$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl$saveData$4", f = "EightDeviceSyncImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ScaleUtil.INSTANCE.sendDataChangedBroadcast(true, Boxing.boxInt(0));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public EightDeviceSyncImpl() {
        Logger.i(TAG, "init SyncUserUtil");
        ld8.c().p(this);
    }

    private final void addHistoryData(String did, bx7 data) {
        if (data.f >= 1 && !hasHistoryData(did, data)) {
            float f = data.f / 10;
            long j = ((long) data.g) * ((long) 1000);
            int i = data.l;
            sw7 sw7Var = data.h;
            int i2 = sw7Var.c;
            int i3 = sw7Var.d;
            int i4 = sw7Var.e;
            int i5 = sw7Var.f;
            int i6 = sw7Var.g;
            int i7 = sw7Var.h;
            sw7 sw7Var2 = data.i;
            ClaimRecord claimRecord = new ClaimRecord(did, null, f, null, false, j, i, i2, i3, i4, i5, i6, i7, sw7Var2.c, sw7Var2.d, sw7Var2.e, sw7Var2.f, sw7Var2.g, sw7Var2.h, 0, false, 524314, null);
            this.historyDataList.add(claimRecord);
            int i8 = data.e;
            if (i8 == 1 || i8 == 2) {
                saveHistoryData(claimRecord);
            } else {
                saveData(did, data);
            }
        }
    }

    private final void addShareMember(String deviceId, ArrayList<ShareAccount> members) {
        for (ShareAccount shareAccount : members) {
            if (shareAccount.isBondBoolean()) {
                addShareUser(deviceId, shareAccount);
            }
        }
    }

    private final void addShareUser(String deviceId, ShareAccount account) {
        EcoDeviceInfo deviceInfo;
        Logger.i(TAG, "add addShareUser :  " + f4b.c(account));
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(deviceId);
        if (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null || !deviceInfo.isOwner()) {
            ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).updateShareUserToDevice(deviceId, Long.parseLong(account.getUserId()), new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl.addShareUser.1
                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(EightDeviceSyncImpl.TAG, "addShareUser onError did ：" + did + " type ： " + type + "  code " + code);
                }

                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onSuccess(String did, int type, EcoSyncResult result) {
                    Logger.i(EightDeviceSyncImpl.TAG, "addShareUser success did ：" + did + " type ： " + type + "  pack " + (result != null ? result.getPacket() : null));
                }
            });
        }
    }

    private final void addVirtualUser(final String deviceId) {
        if (userList.size() < 1) {
            this.delUserId.clear();
            ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).getUserList(deviceId);
            return;
        }
        for (final VirtualAccount virtualAccount : userList) {
            ElectronicScaleCMDHelper electronicScaleCMDHelperExtKt = ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE);
            String strValueOf = String.valueOf(virtualAccount.getUid());
            String strValueOf2 = String.valueOf(virtualAccount.getAccountId());
            int weightTarget = (int) (virtualAccount.getWeightTarget() * 10);
            int sex = virtualAccount.getSex();
            WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
            String dateToString = weightInfoUtil.getDateToString(virtualAccount.getBirth(), "yyyy-MM-dd");
            Intrinsics.checkNotNull(dateToString);
            electronicScaleCMDHelperExtKt.updateVirtualUserToDevice(strValueOf, strValueOf2, deviceId, weightTarget, sex, weightInfoUtil.getAge(dateToString), virtualAccount.getHeight(), new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl$addVirtualUser$1$1
                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(EightDeviceSyncImpl.TAG, "syncVirtualUser onError did ：" + did + " type ： " + type + "  code " + code);
                }

                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onSuccess(String did, int type, EcoSyncResult result) {
                    this.this$0.addVirtualUserSuccessUserId.add(Long.valueOf(virtualAccount.getAccountId()));
                    if (this.this$0.addVirtualUserSuccessUserId.size() >= EightDeviceSyncImpl.INSTANCE.getUserList().size()) {
                        this.this$0.delUserId.clear();
                        ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).getUserList(deviceId);
                    }
                    Logger.i(EightDeviceSyncImpl.TAG, "syncVirtualUser success did ：" + did + " type ： " + type + "  pack " + (result != null ? result.getPacket() : null));
                }
            });
        }
    }

    private final boolean deviceUserHasUser(ex7 user) {
        for (ex7 ex7Var : this.deviceUserList) {
            if (ex7Var.d.c == user.d.c && ex7Var.c.c == user.c.c) {
                return true;
            }
        }
        return false;
    }

    private final boolean hasHistoryData(String did, bx7 data) {
        for (ClaimRecord claimRecord : this.historyDataList) {
            if (Intrinsics.areEqual(claimRecord.getDid(), did) && claimRecord.getCreateTime() == data.g) {
                return true;
            }
        }
        return false;
    }

    private final void isDelShareUserToDevice(String deviceId, ex7 userId) {
        EcoDeviceInfo deviceInfo;
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(deviceId);
        if ((ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null || deviceInfo.isOwner()) && userId.d.c == 0 && userId.c.c != Long.parseLong(MiAccountManager.INSTANCE.getInstance().getMiId())) {
            Logger.i(TAG, "isDelShareUserToDevice shareList " + this.shareList.size());
            Iterator<T> it = this.shareList.iterator();
            boolean z = true;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((ShareAccount) it.next()).getUserId(), String.valueOf(userId.c.c))) {
                    z = false;
                }
            }
            Logger.i(TAG, "isDelShareUserToDevice uid " + userId.c.c + " shouldDel : " + z);
            if (z && userId.d.c == 0 && !this.delUserId.contains(Long.valueOf(userId.c.c))) {
                Logger.i(TAG, "isDelShareUserToDevice uid del " + userId.c.c);
                this.delUserId.add(Long.valueOf(userId.c.c));
                ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).delVirtualUserToDevice(String.valueOf(userId.c.c), 0L, deviceId, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl.isDelShareUserToDevice.2
                    @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                    public void onError(String did, int type, int code) {
                        Logger.i(EightDeviceSyncImpl.TAG, "isDelShareUserToDevice error it " + type + "  " + code);
                    }

                    @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                    public void onSuccess(String did, int type, EcoSyncResult result) {
                        Logger.i(EightDeviceSyncImpl.TAG, "isDelShareUserToDevice success it " + (result != null ? result.getPacket() : null));
                    }
                });
            }
        }
    }

    private final void isDelVirtualUserToDevice(String deviceId, ex7 userId) {
        Logger.i(TAG, "isDelUserToDevice userList " + userList.size());
        MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
        Logger.i(TAG, "isDelUserToDevice getMiId " + companion.getInstance().getMiId());
        Logger.i(TAG, "isDelUserToDevice userId.miid " + userId.c.c);
        Logger.i(TAG, "isDelUserToDevice == " + Intrinsics.areEqual(companion.getInstance().getMiId(), String.valueOf(userId.c.c)));
        boolean z = false;
        if (Intrinsics.areEqual(companion.getInstance().getMiId(), String.valueOf(userId.c.c))) {
            boolean z2 = true;
            for (VirtualAccount virtualAccount : userList) {
                Logger.i(TAG, "isDelUserToDevice userId.miid " + virtualAccount.getAccountId() + " - " + userId.d.c);
                if (virtualAccount.getAccountId() == userId.d.c) {
                    z2 = false;
                }
            }
            z = z2;
        }
        Logger.i(TAG, "isDelUserToDevice uid " + userId.d.c + " shouldDel : " + z);
        if (z) {
            long j = userId.d.c;
            if (j == 0 || this.delUserId.contains(Long.valueOf(j))) {
                return;
            }
            Logger.i(TAG, "isDelUserToDevice uid del " + userId.d.c);
            this.delUserId.add(Long.valueOf(userId.d.c));
            ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).delVirtualUserToDevice(MiAccountManager.INSTANCE.getInstance().getMiId(), userId.d.c, deviceId, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl.isDelVirtualUserToDevice.2
                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(EightDeviceSyncImpl.TAG, "isDelUserToDevice error it " + type + "  " + code);
                }

                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onSuccess(String did, int type, EcoSyncResult result) {
                    Logger.i(EightDeviceSyncImpl.TAG, "isDelUserToDevice success it " + (result != null ? result.getPacket() : null));
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0354  */
    private final void saveData(String did, bx7 data) {
        String str;
        EcoDeviceInfo deviceInfo;
        EcoDeviceInfo deviceInfo2;
        int i;
        if (!INSTANCE.hasZk(data)) {
            long j = 1000;
            WeightResult weightResultUpdateHistoryDataToWeightResult = WeightResult.INSTANCE.updateHistoryDataToWeightResult(data, String.valueOf(data.d.c), data.f / 10, did, ((long) data.g) * j);
            VirtualAccount virtualAccount = new VirtualAccount(null, null, 0L, 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524287, null);
            virtualAccount.setDid(did);
            virtualAccount.setModel("yunmai.scales.ms3001");
            virtualAccount.setAccountId(data.d.c);
            virtualAccount.setUid(data.c.c);
            virtualAccount.setDel(false);
            virtualAccount.setIcon("");
            virtualAccount.setName("");
            virtualAccount.setAccountId(data.d.c);
            if (data.d.c == 0) {
                i = 1;
                virtualAccount.setType(1);
            } else {
                i = 1;
                virtualAccount.setType(2);
            }
            virtualAccount.setBodyComposition(f4b.c(weightResultUpdateHistoryDataToWeightResult));
            long j2 = ((long) data.g) * j;
            virtualAccount.setCreateTime(j2);
            virtualAccount.setCreateDate(DateUtil.INSTANCE.getDateToString(j2, "yyyyMMdd"));
            Logger.i(TAG, "saveData() virtualId : " + virtualAccount.getAccountId() + " ====== createDate : " + virtualAccount.getCreateDate());
            VirtualAccountHelper.insertVirtualAccount$default(VirtualAccountHelper.INSTANCE, virtualAccount, new Function0() { // from class: k38
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EightDeviceSyncImpl.saveData$lambda$12();
                }
            }, null, 4, null);
            if (virtualAccount.getType() == i) {
                WeightInfoUtil.INSTANCE.recordWeight(did, FitnessDateUtils.getCurrentTZOffsetInSec(), j2, weightResultUpdateHistoryDataToWeightResult);
                AnyExtKt.main$default(null, new C23592(null), i, null);
                return;
            }
            return;
        }
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        float f = 10;
        float f2 = data.f / f;
        int i2 = data.l;
        lx7 lx7Var = data.j;
        float f3 = lx7Var.c / f;
        float f4 = lx7Var.o / f;
        float f5 = lx7Var.d / f;
        float f6 = lx7Var.f / f;
        float f7 = lx7Var.i / f;
        float f8 = lx7Var.e / f;
        float f9 = lx7Var.g / f;
        float f10 = lx7Var.j / f;
        float f11 = lx7Var.m / f;
        float f12 = lx7Var.u / f;
        float f13 = lx7Var.v / f;
        float f14 = lx7Var.w / f;
        float f15 = lx7Var.x / f;
        float f16 = lx7Var.y / f;
        float f17 = lx7Var.J / f;
        float f18 = lx7Var.K / f;
        float f19 = lx7Var.L / f;
        float f20 = lx7Var.M / f;
        float f21 = lx7Var.N / f;
        float f22 = lx7Var.h;
        short s = (short) (((short) lx7Var.l) / 10);
        byte b2 = (byte) (lx7Var.f25514k / 10);
        byte b3 = (byte) (lx7Var.n / 10);
        float f23 = lx7Var.q / f;
        float f24 = lx7Var.s / f;
        int i3 = lx7Var.t;
        short s2 = (short) (((short) lx7Var.E) / 10);
        short s3 = (short) (((short) lx7Var.F) / 10);
        short s4 = (short) (((short) lx7Var.G) / 10);
        short s5 = (short) (((short) lx7Var.H) / 10);
        short s6 = (short) (((short) lx7Var.I) / 10);
        short s7 = (short) (((short) lx7Var.T) / 10);
        short s8 = (short) (((short) lx7Var.U) / 10);
        short s9 = (short) (((short) lx7Var.V) / 10);
        short s10 = (short) (((short) lx7Var.W) / 10);
        short s11 = (short) (((short) lx7Var.X) / 10);
        short s12 = (short) (((short) lx7Var.p) / 10);
        short s13 = (short) (((short) lx7Var.f25515r) / 10);
        byte b4 = (byte) (lx7Var.Y / 10);
        byte b5 = (byte) (lx7Var.Z / 10);
        byte b6 = (byte) (lx7Var.a0 / 10);
        byte b7 = (byte) (lx7Var.b0 / 10);
        byte b8 = (byte) (lx7Var.c0 / 10);
        byte b9 = (byte) (lx7Var.d0 / 10);
        float f25 = ((short) lx7Var.e0) / f;
        float f26 = ((short) lx7Var.g0) / f;
        float f27 = ((short) lx7Var.f0) / f;
        sw7 sw7Var = data.h;
        Integer numValueOf = sw7Var != null ? Integer.valueOf(sw7Var.c) : null;
        Intrinsics.checkNotNull(numValueOf);
        int iIntValue = numValueOf.intValue();
        sw7 sw7Var2 = data.h;
        Integer numValueOf2 = sw7Var2 != null ? Integer.valueOf(sw7Var2.d) : null;
        Intrinsics.checkNotNull(numValueOf2);
        int iIntValue2 = numValueOf2.intValue();
        sw7 sw7Var3 = data.h;
        Integer numValueOf3 = sw7Var3 != null ? Integer.valueOf(sw7Var3.e) : null;
        Intrinsics.checkNotNull(numValueOf3);
        int iIntValue3 = numValueOf3.intValue();
        sw7 sw7Var4 = data.h;
        Integer numValueOf4 = sw7Var4 != null ? Integer.valueOf(sw7Var4.f) : null;
        Intrinsics.checkNotNull(numValueOf4);
        int iIntValue4 = numValueOf4.intValue();
        sw7 sw7Var5 = data.h;
        Integer numValueOf5 = sw7Var5 != null ? Integer.valueOf(sw7Var5.g) : null;
        Intrinsics.checkNotNull(numValueOf5);
        int iIntValue5 = numValueOf5.intValue();
        sw7 sw7Var6 = data.h;
        Integer numValueOf6 = sw7Var6 != null ? Integer.valueOf(sw7Var6.h) : null;
        Intrinsics.checkNotNull(numValueOf6);
        int iIntValue6 = numValueOf6.intValue();
        sw7 sw7Var7 = data.i;
        Integer numValueOf7 = sw7Var7 != null ? Integer.valueOf(sw7Var7.c) : null;
        Intrinsics.checkNotNull(numValueOf7);
        int iIntValue7 = numValueOf7.intValue();
        sw7 sw7Var8 = data.i;
        Integer numValueOf8 = sw7Var8 != null ? Integer.valueOf(sw7Var8.d) : null;
        Intrinsics.checkNotNull(numValueOf8);
        int iIntValue8 = numValueOf8.intValue();
        sw7 sw7Var9 = data.i;
        Integer numValueOf9 = sw7Var9 != null ? Integer.valueOf(sw7Var9.e) : null;
        Intrinsics.checkNotNull(numValueOf9);
        int iIntValue9 = numValueOf9.intValue();
        sw7 sw7Var10 = data.i;
        Integer numValueOf10 = sw7Var10 != null ? Integer.valueOf(sw7Var10.f) : null;
        Intrinsics.checkNotNull(numValueOf10);
        int iIntValue10 = numValueOf10.intValue();
        sw7 sw7Var11 = data.i;
        Integer numValueOf11 = sw7Var11 != null ? Integer.valueOf(sw7Var11.g) : null;
        Intrinsics.checkNotNull(numValueOf11);
        int iIntValue11 = numValueOf11.intValue();
        sw7 sw7Var12 = data.i;
        Integer numValueOf12 = sw7Var12 != null ? Integer.valueOf(sw7Var12.h) : null;
        Intrinsics.checkNotNull(numValueOf12);
        int iIntValue12 = numValueOf12.intValue();
        String strValueOf = String.valueOf(data.d.c);
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
        if (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null || deviceInfo.getSn() == null) {
            str = "0";
        } else {
            EcoDeviceModel ecoDeviceModel2 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
            String sn = (ecoDeviceModel2 == null || (deviceInfo2 = ecoDeviceModel2.getDeviceInfo()) == null) ? null : deviceInfo2.getSn();
            if (sn == null) {
                str = "0";
            } else {
                str = sn;
            }
        }
        long j3 = 1000;
        final WeightResult weightResult = new WeightResult(1, userId, f2, i2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, s, b2, b3, f23, f24, i3, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, b4, b5, b6, b7, b8, b9, f25, f26, f27, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8, iIntValue9, iIntValue10, iIntValue11, iIntValue12, strValueOf, str, ((long) data.g) * j3);
        VirtualAccount virtualAccount2 = new VirtualAccount(null, null, 0L, 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524287, null);
        virtualAccount2.setDid(did);
        virtualAccount2.setModel("yunmai.scales.ms3001");
        MiAccountManager.Companion companion2 = MiAccountManager.INSTANCE;
        virtualAccount2.setUid(Long.parseLong(companion2.getInstance().getMiId()));
        virtualAccount2.setAccountId(data.d.c);
        if (data.d.c == 0) {
            virtualAccount2.setType(1);
        } else {
            virtualAccount2.setType(2);
        }
        virtualAccount2.setDel(false);
        virtualAccount2.setIcon(companion2.getInstance().getAvatarAddress());
        virtualAccount2.setName(companion2.getInstance().getNickName());
        virtualAccount2.setBodyComposition(f4b.c(weightResult));
        long j4 = ((long) data.g) * j3;
        virtualAccount2.setCreateTime(j4);
        virtualAccount2.setCreateDate(DateUtil.INSTANCE.getDateToString(j4, "yyyyMMdd"));
        Logger.i(TAG, "saveData() currentTimeMillis ：" + j4 + " uid : " + virtualAccount2.getUid() + " ====== createDate : " + virtualAccount2.getCreateDate());
        WeightManager.saveBodyMakeUpData$default(WeightManager.INSTANCE.getInstance(), virtualAccount2, null, new Function0() { // from class: l38
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EightDeviceSyncImpl.saveData$lambda$15(weightResult);
            }
        }, 2, null);
        if (virtualAccount2.getType() == 1) {
            WeightInfoUtil.INSTANCE.recordWeight(did, FitnessDateUtils.getCurrentTZOffsetInSec(), j4, weightResult);
            AnyExtKt.main$default(null, new AnonymousClass4(null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveData$lambda$12() {
        Logger.i(TAG, "saveData() virtual user success");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveData$lambda$15(WeightResult weightResult) {
        Intrinsics.checkNotNullParameter(weightResult, "$weightResult");
        Logger.i(TAG, "saveData() success" + f4b.c(weightResult));
        return Unit.INSTANCE;
    }

    private final void saveHistoryData(final ClaimRecord claimRecord) {
        ClaimRecordHelper.INSTANCE.insertClaimRecord(claimRecord, new Function0() { // from class: h38
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EightDeviceSyncImpl.saveHistoryData$lambda$11(claimRecord);
            }
        });
        this.historyDataList.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveHistoryData$lambda$11(ClaimRecord claimRecord) {
        Intrinsics.checkNotNullParameter(claimRecord, "$claimRecord");
        Logger.i(TAG, "save history data success " + f4b.c(claimRecord));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncBindUer(String did, OnEcoSyncCallback callback) {
        if (did == null) {
            return;
        }
        ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).bindUser(did, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncHistoryData(String deviceId) {
        this.historyDataList.clear();
        Logger.i(TAG, "syncHistoryData start");
        ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).getHistoryData(deviceId, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl.syncHistoryData.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e(EightDeviceSyncImpl.TAG, "syncHistoryData error  did : " + did + " , type : " + type + " , code : " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                Logger.i(EightDeviceSyncImpl.TAG, "syncHistoryData success  did : " + did + " , type : " + type + " , packet : " + (result != null ? result.getPacket() : null));
            }
        });
    }

    public static /* synthetic */ void syncMainUserInfoByDid$default(EightDeviceSyncImpl eightDeviceSyncImpl, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        eightDeviceSyncImpl.syncMainUserInfoByDid(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncShareMemberUser(final String deviceId, final int userNum) throws JSONException {
        EcoDeviceInfo deviceInfo;
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(deviceId);
        if (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null || deviceInfo.isOwner()) {
            BindScaleRequest.getShareList$default(new BindScaleRequest(), 1, null, new Function1() { // from class: i38
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EightDeviceSyncImpl.syncShareMemberUser$lambda$3(deviceId, this, userNum, (ScaleData) obj);
                }
            }, new Function1() { // from class: j38
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EightDeviceSyncImpl.syncShareMemberUser$lambda$4((ApiException) obj);
                }
            }, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncShareMemberUser$lambda$3(String deviceId, EightDeviceSyncImpl this$0, int i, ScaleData it) {
        Intrinsics.checkNotNullParameter(deviceId, "$deviceId");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        String resp = it.getResp();
        Logger.i(TAG, "initData, ScaleRequest().getShareList success, resp: " + resp);
        List<ShareAccount> data = ((SharedUser) new Gson().fromJson(resp, new TypeToken<SharedUser>() { // from class: com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl$syncShareMemberUser$lambda$3$$inlined$fromJson$1
        }.getType())).getData();
        ArrayList<ShareAccount> arrayList = new ArrayList<>();
        for (ShareAccount shareAccount : data) {
            if (Intrinsics.areEqual(shareAccount.getDid(), deviceId) && shareAccount.isBondBoolean()) {
                arrayList.add(shareAccount);
            }
        }
        this$0.shareList = arrayList;
        int i2 = i - 1;
        if (arrayList.size() > i2) {
            this$0.addShareMember(deviceId, arrayList);
        } else if (arrayList.size() < i2) {
            ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).getUserList(deviceId);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncShareMemberUser$lambda$4(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(TAG, "initData, ScaleRequest().getShareList error", it);
        return Unit.INSTANCE;
    }

    private final void syncTime(String did) {
        u7r u7rVar = new u7r();
        cz7 cz7Var = new cz7();
        u7rVar.e = 33;
        u7rVar.f = 0;
        iz7 iz7Var = new iz7();
        iz7Var.c = (int) (new Date().getTime() / ((long) 1000));
        cz7Var.y(iz7Var);
        u7rVar.A(cz7Var);
        Logger.i(TAG, " sync time  send " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl.syncTime.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.e(EightDeviceSyncImpl.TAG, "sync time on error  did : " + did2 + " , type : " + type + " , code : " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                Logger.i(EightDeviceSyncImpl.TAG, "sync time success  did : " + did2 + " , type : " + type + " , packet : " + f4b.c(result != null ? result.getPacket() : null));
            }
        }, 2000);
    }

    private final void syncUser(final String deviceId) {
        this.delUserId.clear();
        this.addVirtualUserSuccessUserId.clear();
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 15;
        uw7 uw7Var = new uw7();
        jx7 jx7Var = new jx7();
        jx7Var.c = Long.parseLong(MiAccountManager.INSTANCE.getInstance().getMiId());
        uw7Var.c = jx7Var;
        ww7 ww7Var = new ww7();
        ww7Var.H(uw7Var);
        u7rVar.D(ww7Var);
        Logger.i(TAG, "get user bun send " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceId, u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl.syncUser.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(EightDeviceSyncImpl.TAG, "get user bun error it " + type + "  " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) throws JSONException {
                EcoDeviceInfo deviceInfo;
                u7r packet;
                ww7 ww7VarT;
                uw7 uw7VarV;
                Integer numValueOf = null;
                Logger.i(EightDeviceSyncImpl.TAG, "get user bun success it " + (result != null ? result.getPacket() : null));
                if (result != null && (packet = result.getPacket()) != null && (ww7VarT = packet.t()) != null && (uw7VarV = ww7VarT.v()) != null) {
                    numValueOf = Integer.valueOf(uw7VarV.d);
                }
                if (numValueOf != null && numValueOf.intValue() == 0) {
                    EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(deviceId);
                    if (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null || deviceInfo.isOwner()) {
                        final EightDeviceSyncImpl eightDeviceSyncImpl = this;
                        final String str = deviceId;
                        eightDeviceSyncImpl.syncBindUer(str, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl$syncUser$1$onSuccess$2
                            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                            public void onError(String did2, int type2, int code) {
                                Logger.i(EightDeviceSyncImpl.TAG, "bind user success " + type2 + " " + code);
                            }

                            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                            public void onSuccess(String did2, int type2, EcoSyncResult result2) throws JSONException {
                                Logger.i(EightDeviceSyncImpl.TAG, "bind user success " + did2);
                                eightDeviceSyncImpl.syncVirtualUser(str);
                                eightDeviceSyncImpl.syncShareMemberUser(str, 1);
                                eightDeviceSyncImpl.syncHistoryData(str);
                            }
                        });
                        return;
                    } else {
                        ElectronicScaleCMDHelper electronicScaleCMDHelperExtKt = ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE);
                        String str2 = deviceId;
                        long j = Long.parseLong(MiAccountManager.INSTANCE.getInstance().getMiId());
                        final EightDeviceSyncImpl eightDeviceSyncImpl2 = this;
                        final String str3 = deviceId;
                        electronicScaleCMDHelperExtKt.updateShareUserToDevice(str2, j, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl$syncUser$1$onSuccess$1
                            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                            public void onError(String did2, int type2, int code) {
                                Logger.i(EightDeviceSyncImpl.TAG, "initShareUser onError did ：" + did2 + " type ： " + type2 + "  code " + code);
                            }

                            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                            public void onSuccess(String did2, int type2, EcoSyncResult result2) {
                                Logger.i(EightDeviceSyncImpl.TAG, "initShareUser success did ：" + did2 + " type ： " + type2 + "  pack " + (result2 != null ? result2.getPacket() : null));
                                eightDeviceSyncImpl2.syncVirtualUser(str3);
                                eightDeviceSyncImpl2.syncHistoryData(str3);
                            }
                        });
                        return;
                    }
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue() & 15;
                    int iIntValue2 = (numValueOf.intValue() >> 4) & 15;
                    Logger.i(EightDeviceSyncImpl.TAG, "get user bun success virtualUserNum " + iIntValue);
                    Logger.i(EightDeviceSyncImpl.TAG, "get user bun success shareUserNum " + iIntValue2);
                    this.syncVirtualUser(deviceId);
                    this.syncShareMemberUser(deviceId, iIntValue2);
                    this.syncHistoryData(deviceId);
                }
            }
        }, 2000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncVirtualUser$lambda$7(EightDeviceSyncImpl this$0, String deviceId, ProxyResponse it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceId, "$deviceId");
        Intrinsics.checkNotNullParameter(it, "it");
        userList.clear();
        List list = (List) it.getResult();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                userList.add((VirtualAccount) it2.next());
            }
        }
        Logger.i(TAG, "sync virtual user userNum :  " + userList.size() + " , " + f4b.c(userList));
        this$0.addVirtualUser(deviceId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncVirtualUser$lambda$8(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "syncVirtualUser error it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onEcoPacket(@NotNull ScaleEventBusIds.OnEcoPaketEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        u7r packet = event.getPacket();
        if (packet != null && packet.f == 17) {
            u7r packet2 = event.getPacket();
            Intrinsics.checkNotNull(packet2);
            ex7 userId = packet2.t().u().c;
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            if (!deviceUserHasUser(userId)) {
                Logger.i(TAG, "get user list : " + event.getPacket());
                List<ex7> list = this.deviceUserList;
                u7r packet3 = event.getPacket();
                Intrinsics.checkNotNull(packet3);
                ex7 userId2 = packet3.t().u().c;
                Intrinsics.checkNotNullExpressionValue(userId2, "userId");
                list.add(userId2);
                u7r packet4 = event.getPacket();
                Intrinsics.checkNotNull(packet4);
                if (packet4.t().u().c.d.c != 0) {
                    String did = event.getDid();
                    u7r packet5 = event.getPacket();
                    Intrinsics.checkNotNull(packet5);
                    ex7 userId3 = packet5.t().u().c;
                    Intrinsics.checkNotNullExpressionValue(userId3, "userId");
                    isDelVirtualUserToDevice(did, userId3);
                } else {
                    String did2 = event.getDid();
                    u7r packet6 = event.getPacket();
                    Intrinsics.checkNotNull(packet6);
                    ex7 userId4 = packet6.t().u().c;
                    Intrinsics.checkNotNullExpressionValue(userId4, "userId");
                    isDelShareUserToDevice(did2, userId4);
                }
            }
        }
        u7r packet7 = event.getPacket();
        if (packet7 == null || packet7.f != 10) {
            return;
        }
        Logger.i(TAG, "get history list : " + event.getPacket());
        String did3 = event.getDid();
        u7r packet8 = event.getPacket();
        Intrinsics.checkNotNull(packet8);
        bx7 bx7VarS = packet8.t().s();
        Intrinsics.checkNotNullExpressionValue(bx7VarS, "getUpdateHistoryData(...)");
        addHistoryData(did3, bx7VarS);
    }

    public final void sendVersion(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        u7r u7rVar = new u7r();
        u7rVar.e = 2;
        u7rVar.f = 82;
        uxo uxoVar = new uxo();
        mxo mxoVar = new mxo();
        mxoVar.c = 1;
        uxoVar.t(mxoVar);
        u7rVar.E(uxoVar);
        Logger.i(TAG, "send version " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl.sendVersion.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.i("sendVersion error code " + code, new Object[0]);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                Logger.i("sendVersion success", new Object[0]);
            }
        }, 2000);
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.sync.DeviceSync
    public void sync(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        sendVersion(did);
        syncTime(did);
        syncUser(did);
        syncMainUserInfoByDid$default(this, did, false, 2, null);
        EcoDataHandlerHelper.INSTANCE.updateDataHandler();
    }

    public final void syncMainUserInfoByDid(@Nullable String did, boolean force) {
        String model;
        if (did == null) {
            return;
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did);
        if (ecoDeviceModel == null || (model = EcoDeviceModelExtKt.getModel(ecoDeviceModel)) == null || EcoDeviceModelExtKt.isEightScale(model)) {
            final String str = ElectronicScalePreference.SCALE_UPDATE_INFO_KEY + did;
            Logger.i(TAG, "syncMainUser infoUpdate " + ElectronicScalePreference.getBoolean(str, false));
            if (!ElectronicScalePreference.getBoolean(str, false) || force) {
                MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
                ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).addOrUpdateMainUser(companion.getInstance().getMiId(), companion.getInstance().getAge(), companion.getInstance().getSex(), (int) companion.getInstance().getHeight(), companion.getInstance().getWeight(), did, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl.syncMainUserInfoByDid.1
                    @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                    public void onError(String did2, int type, int code) {
                        Logger.e(EightDeviceSyncImpl.TAG, "syncMainUser error  did : " + did2 + " , type : " + type + " , code : " + code);
                    }

                    @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                    public void onSuccess(String did2, int type, EcoSyncResult result) {
                        ElectronicScalePreference.putBoolean(str, true);
                        Logger.i(EightDeviceSyncImpl.TAG, "syncMainUser success  did : " + did2 + " , type : " + type + " , packet : " + (result != null ? result.getPacket() : null));
                    }
                });
            }
        }
    }

    public final void syncVirtualUser(@NotNull final String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        new ScaleRequest().getVirtualAccount(new NetCoroutineScope(null, null, null, 7, null), Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), deviceId, new Function1() { // from class: f38
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EightDeviceSyncImpl.syncVirtualUser$lambda$7(this.f17357a, deviceId, (ProxyResponse) obj);
            }
        }, new Function1() { // from class: g38
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EightDeviceSyncImpl.syncVirtualUser$lambda$8((ApiException) obj);
            }
        });
    }
}
