package com.xiaomi.fitness.sport_xms;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.bean.BatteryInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.membership.export.MembershipHelper;
import com.xiaomi.fitness.membership.export.MembershipHelperExtKt;
import com.xiaomi.fitness.membership.export.data.VipInfo;
import com.xiaomi.fitness.mine.export.MineSettingManager;
import com.xiaomi.fitness.mine.export.MineSettingManagerExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteData;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.RequestCallback;
import com.xiaomi.fitness.sport_xms.SportXmsApiImpl;
import com.xiaomi.fitness.sport_xms.data.CourseVipInfo;
import com.xiaomi.fitness.sport_xms.data.DeviceInfo;
import com.xiaomi.fitness.sport_xms.data.PhoneData;
import com.xiaomi.fitness.sport_xms.data.SportXmsFinishData;
import com.xiaomi.fitness.sport_xms.data.SportXmsRequestData;
import com.xiaomi.fitness.sport_xms.data.UserInfo;
import com.xiaomi.fitness.sport_xms.extension.DeviceModelExtKt;
import defpackage.axc;
import defpackage.cxc;
import defpackage.hzc;
import defpackage.kxc;
import defpackage.lxc;
import defpackage.mxc;
import defpackage.nxc;
import defpackage.wwc;
import defpackage.x7r;
import defpackage.xwc;
import defpackage.zwc;
import java.io.ObjectOutputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0006*\u0004mpsv\u0018\u0000 z2\u00020\u0001:\u0001zB\u0007¢\u0006\u0004\by\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0016\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u0012J\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\bJ\u0019\u0010 \u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b%\u0010\u0006J\u0019\u0010'\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0019H\u0016¢\u0006\u0004\b+\u0010\u001bJ\u000f\u0010,\u001a\u00020\u0019H\u0016¢\u0006\u0004\b,\u0010\u001bJ\u0019\u0010.\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000fH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u0010\bJ\u0019\u00105\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0019H\u0016¢\u0006\u0004\b7\u0010\u001bJ\u0019\u00109\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:J!\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b?\u0010@J\u0011\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0019¢\u0006\u0004\bD\u0010\u001bJ\u0019\u0010F\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR/\u0010V\u001a\u0004\u0018\u00010-2\b\u0010P\u001a\u0004\u0018\u00010-8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010/R\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010IR\u0016\u0010^\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010IR\u0016\u0010`\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001b\u0010l\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010d\u001a\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010x¨\u0006{"}, d2 = {"Lcom/xiaomi/fitness/sport_xms/SportXmsApiImpl;", "Lhzc$a;", "Llxc;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "initSender", "(Llxc;)V", "reset", "()V", "", "did", "Lcom/xiaomi/fitness/sport_xms/data/SportXmsRequestData;", "sportXmsRequestData", "startSport", "(Ljava/lang/String;Lcom/xiaomi/fitness/sport_xms/data/SportXmsRequestData;)V", "", DailyRecordKey.sportType, "pauseSport", "(Ljava/lang/String;I)V", "resumeSport", "Lcom/xiaomi/fitness/sport_xms/data/SportXmsFinishData;", "sportXmsFinishData", "finishSport", "(Ljava/lang/String;Lcom/xiaomi/fitness/sport_xms/data/SportXmsFinishData;)V", "finishSportByType", "", "hasOngoingSport", "()Z", "deviceModelDid", "restartSport", "abnormalChangeSportStateToFinish", "Lmxc;", "setSportStateChangedListener", "(Lmxc;)V", "Lkxc;", "setSportXmsDataChangedListener", "(Lkxc;)V", "setSportXmsSensorDataChangedListener", "Lnxc;", "setXiaomiUserInfoListener", "(Lnxc;)V", "getDeviceBattery", "()Ljava/lang/String;", "isSupportSomatosensoryGame", "isDeviceConnected", "Lzwc;", "setDeviceConnectedListener", "(Lzwc;)V", "vibrateLevel", "shake", "(I)V", "goToAidongCoursePaymentPage", "Lwwc;", "getAidongMemberExpireTimestamp", "(Lwwc;)V", "isOpenPaidFeatures", "Laxc;", "getCurDeviceMode", "(Laxc;)V", "mode", "switchCurDeviceMode", "(ILaxc;)V", "Lcxc;", "isDeviceSporting", "(Lcxc;)V", "Lcom/xiaomi/fitness/sport_xms/data/DeviceInfo;", "getDeviceInfo", "()Lcom/xiaomi/fitness/sport_xms/data/DeviceInfo;", "aidongIsSporting", "Lxwc;", "setAidongCourseVipInfoListener", "(Lxwc;)V", "sportState", "I", "stateListener", "Lmxc;", "dataListener", "Lkxc;", "sensorListener", "Llxc;", "<set-?>", "mDeviceConnectedListener$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMDeviceConnectedListener", "()Lzwc;", "setMDeviceConnectedListener", "mDeviceConnectedListener", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "Ljava/io/ObjectOutputStream;", "outputStream", "Ljava/io/ObjectOutputStream;", "tempCalorie", "disConnectCal", "", "disconnectTime", "J", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "sportStateCaller$delegate", "Lkotlin/Lazy;", "getSportStateCaller", "()Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "sportStateCaller", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteData;", "sportDataCaller$delegate", "getSportDataCaller", "()Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteData;", "sportDataCaller", "com/xiaomi/fitness/sport_xms/SportXmsApiImpl$iSportDataChangedListener$1", "iSportDataChangedListener", "Lcom/xiaomi/fitness/sport_xms/SportXmsApiImpl$iSportDataChangedListener$1;", "com/xiaomi/fitness/sport_xms/SportXmsApiImpl$iSportSensorDataChangedListener$1", "iSportSensorDataChangedListener", "Lcom/xiaomi/fitness/sport_xms/SportXmsApiImpl$iSportSensorDataChangedListener$1;", "com/xiaomi/fitness/sport_xms/SportXmsApiImpl$iSportStateChangedListener$1", "iSportStateChangedListener", "Lcom/xiaomi/fitness/sport_xms/SportXmsApiImpl$iSportStateChangedListener$1;", "com/xiaomi/fitness/sport_xms/SportXmsApiImpl$deviceStatusListener$1", "deviceStatusListener", "Lcom/xiaomi/fitness/sport_xms/SportXmsApiImpl$deviceStatusListener$1;", "<init>", "Companion", "sport-xms_release"}, k = 1, mv = {2, 0, 0})
public final class SportXmsApiImpl extends hzc.a {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportXmsApiImpl.class, "mDeviceConnectedListener", "getMDeviceConnectedListener()Lcom/xiaomi/fitness/sport_xms/listener/IRemoteDeviceConnectedListener;", 0))};

    @NotNull
    public static final String DataKey = "SportXmsApiImpl";

    @NotNull
    public static final String TAG = "SportXmsApiImpl";

    @Nullable
    private kxc dataListener;

    @NotNull
    private final SportXmsApiImpl$deviceStatusListener$1 deviceStatusListener;
    private int disConnectCal;
    private long disconnectTime;

    @NotNull
    private final Executor executor;

    @NotNull
    private final SportXmsApiImpl$iSportDataChangedListener$1 iSportDataChangedListener;

    @NotNull
    private final SportXmsApiImpl$iSportSensorDataChangedListener$1 iSportSensorDataChangedListener;

    @NotNull
    private final SportXmsApiImpl$iSportStateChangedListener$1 iSportStateChangedListener;

    /* JADX INFO: renamed from: mDeviceConnectedListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mDeviceConnectedListener = new BinderDelegate("IRemoteDeviceConnectedListener");
    private ObjectOutputStream outputStream;

    @Nullable
    private lxc sensorListener;

    /* JADX INFO: renamed from: sportDataCaller$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportDataCaller;
    private int sportState;

    /* JADX INFO: renamed from: sportStateCaller$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportStateCaller;

    @Nullable
    private mxc stateListener;
    private int tempCalorie;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_xms.SportXmsApiImpl$setAidongCourseVipInfoListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_xms.SportXmsApiImpl$setAidongCourseVipInfoListener$1", f = "SportXmsApiImpl.kt", i = {}, l = {419}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ xwc $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32181(xwc xwcVar, Continuation<? super C32181> continuation) {
            super(2, continuation);
            this.$listener = xwcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32181(this.$listener, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws RemoteException {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MembershipHelper membershipHelperExtKt = MembershipHelperExtKt.getInstance(MembershipHelper.INSTANCE);
                this.label = 1;
                obj = MembershipHelper.DefaultImpls.getVipInfo$default(membershipHelperExtKt, false, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            VipInfo vipInfo = (VipInfo) obj;
            if ((vipInfo != null && vipInfo.getActive()) || (vipInfo != null && vipInfo.getDeprecatedMember())) {
                i2 = 1;
            }
            CourseVipInfo courseVipInfo = new CourseVipInfo(i2, vipInfo != null ? vipInfo.getExpiredAt() : null);
            xwc xwcVar = this.$listener;
            if (xwcVar != null) {
                xwcVar.Z1(courseVipInfo);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_xms.SportXmsApiImpl$setXiaomiUserInfoListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_xms.SportXmsApiImpl$setXiaomiUserInfoListener$1", f = "SportXmsApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ nxc $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32191(nxc nxcVar, Continuation<? super C32191> continuation) {
            super(2, continuation);
            this.$listener = nxcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(nxc nxcVar, AccountCoreInfo accountCoreInfo) throws RemoteException {
            UserInfo userInfo = new UserInfo(accountCoreInfo != null ? accountCoreInfo.getUserName() : null, accountCoreInfo != null ? accountCoreInfo.getAvatarAddress() : null, UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getSex(), accountCoreInfo != null ? accountCoreInfo.getUserId() : null);
            if (nxcVar != null) {
                nxcVar.r(userInfo);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32191(this.$listener, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UserInfoManager accountManagerExtKt = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
            final nxc nxcVar = this.$listener;
            UserInfoManager.getAccountCoreInfo$default(accountManagerExtKt, false, new Function1() { // from class: com.xiaomi.fitness.sport_xms.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return SportXmsApiImpl.C32191.invokeSuspend$lambda$0(nxcVar, (AccountCoreInfo) obj2);
                }
            }, 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.xiaomi.fitness.sport_xms.SportXmsApiImpl$iSportDataChangedListener$1] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.xiaomi.fitness.sport_xms.SportXmsApiImpl$iSportStateChangedListener$1] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.xiaomi.fitness.sport_xms.SportXmsApiImpl$deviceStatusListener$1] */
    public SportXmsApiImpl() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.executor = executorServiceNewSingleThreadExecutor;
        this.sportStateCaller = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: l6o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportXmsApiImpl.sportStateCaller_delegate$lambda$0();
            }
        });
        this.sportDataCaller = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: m6o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportXmsApiImpl.sportDataCaller_delegate$lambda$1();
            }
        });
        this.iSportDataChangedListener = new ISportDataChangedListener() { // from class: com.xiaomi.fitness.sport_xms.SportXmsApiImpl$iSportDataChangedListener$1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
            public void onLocationChanged(SportLocationResult location) {
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
            public void onPhoneDataChanged(PhoneSportData phoneSportData) throws RemoteException {
                FitnessLogUtils.i("SportXmsApiImpl", "phoneSportData:" + phoneSportData);
                this.this$0.tempCalorie = phoneSportData != null ? (int) phoneSportData.calorie : 0;
                PhoneData phoneData = new PhoneData(phoneSportData != null ? phoneSportData.duration : 0, phoneSportData != null ? phoneSportData.heart_rate : 0, this.this$0.tempCalorie);
                kxc kxcVar = this.this$0.dataListener;
                if (kxcVar != null) {
                    kxcVar.p4(phoneData);
                }
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
            public void onReceiveWearData(x7r wearSportData) {
            }
        };
        this.iSportSensorDataChangedListener = new SportXmsApiImpl$iSportSensorDataChangedListener$1(this);
        this.iSportStateChangedListener = new ISportStateChangedListener() { // from class: com.xiaomi.fitness.sport_xms.SportXmsApiImpl$iSportStateChangedListener$1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
            public void onSportFinished(boolean validSport, byte[] ids, FinishSportData finishSportData) throws RemoteException {
                Logger.i("SportXmsApiImpl", "onSportFinished");
                this.this$0.sportState = 4;
                mxc mxcVar = this.this$0.stateListener;
                if (mxcVar != null) {
                    mxcVar.onSportFinished(0, true);
                }
                this.this$0.reset();
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
            public void onSportPaused() throws RemoteException {
                Logger.i("SportXmsApiImpl", "onSportPaused");
                this.this$0.sportState = 2;
                mxc mxcVar = this.this$0.stateListener;
                if (mxcVar != null) {
                    mxcVar.onSportPaused(0);
                }
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
            public void onSportRestarted() throws RemoteException {
                Logger.i("SportXmsApiImpl", "onSportRestarted");
                this.this$0.sportState = 3;
                mxc mxcVar = this.this$0.stateListener;
                if (mxcVar != null) {
                    mxcVar.onSportRestarted(0);
                }
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
            public void onSportSegment(int i, int i2) {
                ISportStateChangedListener.DefaultImpls.onSportSegment(this, i, i2);
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
            public void onSportStarted(int code, int startTime, int timeZone, int sportType, int sportLaunchType) throws RemoteException {
                Logger.i("SportXmsApiImpl", "onSportStarted , code : " + code + ", startTime : " + startTime);
                this.this$0.sportState = 1;
                mxc mxcVar = this.this$0.stateListener;
                if (mxcVar != null) {
                    mxcVar.onSportStarted(code, startTime, timeZone, 1);
                }
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
            public void preSport() {
                ISportStateChangedListener.DefaultImpls.preSport(this);
            }
        };
        this.deviceStatusListener = new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.sport_xms.SportXmsApiImpl$deviceStatusListener$1
            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectFailure(String did, int errorCode, int retryTimes) throws RemoteException {
                Logger.i("SportXmsApiImpl", "onConnectFailure");
                zwc mDeviceConnectedListener = this.this$0.getMDeviceConnectedListener();
                if (mDeviceConnectedListener != null) {
                    mDeviceConnectedListener.onConnectFailure(did, errorCode, retryTimes);
                }
                SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).abnormalChangeSportStateToPause();
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectStart(String did) throws RemoteException {
                Logger.i("SportXmsApiImpl", "onConnectStart");
                zwc mDeviceConnectedListener = this.this$0.getMDeviceConnectedListener();
                if (mDeviceConnectedListener != null) {
                    mDeviceConnectedListener.onConnectStart(did);
                }
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) throws RemoteException {
                Logger.i("SportXmsApiImpl", "onConnectSuccess");
                zwc mDeviceConnectedListener = this.this$0.getMDeviceConnectedListener();
                if (mDeviceConnectedListener != null) {
                    mDeviceConnectedListener.onConnectSuccess(did);
                }
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) throws RemoteException {
                Logger.i("SportXmsApiImpl", "onDisconnect");
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (!Intrinsics.areEqual(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, did)) {
                    Logger.i("SportXmsApiImpl", "onDisconnect() called with: is not current did");
                    return;
                }
                if (System.currentTimeMillis() - this.this$0.disconnectTime > 1000) {
                    this.this$0.disConnectCal += this.this$0.tempCalorie;
                    zwc mDeviceConnectedListener = this.this$0.getMDeviceConnectedListener();
                    if (mDeviceConnectedListener != null) {
                        mDeviceConnectedListener.onDisconnect(did);
                    }
                    int sportType = this.this$0.getSportStateCaller().getSportType();
                    Logger.i("SportXmsApiImpl", "curSportType:" + sportType);
                    if (sportType == 810 || sportType == 812) {
                        this.this$0.getSportStateCaller().abnormalChangeSportStateToPause();
                    }
                }
                this.this$0.disconnectTime = System.currentTimeMillis();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAidongMemberExpireTimestamp$lambda$3(wwc wwcVar, long j) throws RemoteException {
        Logger.i("SportXmsApiImpl", "getAidongMemberExpireTimestamp:onSuccess:" + j);
        if (wwcVar != null) {
            wwcVar.d5(j);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAidongMemberExpireTimestamp$lambda$4(wwc wwcVar, ApiException it) throws RemoteException {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("SportXmsApiImpl", "getAidongMemberExpireTimestamp , onError");
        if (wwcVar != null) {
            wwcVar.onError();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCurDeviceMode$lambda$5(axc axcVar, int i) throws RemoteException {
        Logger.i("SportXmsApiImpl", "getCurDeviceMode, code :" + i);
        if (i == -1) {
            if (axcVar != null) {
                axcVar.onError(-1);
            }
        } else if (axcVar != null) {
            axcVar.o5(i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zwc getMDeviceConnectedListener() {
        return (zwc) this.mDeviceConnectedListener.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final ISportRemoteData getSportDataCaller() {
        return (ISportRemoteData) this.sportDataCaller.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISportRemoteState getSportStateCaller() {
        return (ISportRemoteState) this.sportStateCaller.getValue();
    }

    private final void initSender(lxc listener) {
        this.sensorListener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit isDeviceSporting$lambda$7(cxc cxcVar, boolean z) throws RemoteException {
        IBinder iBinderAsBinder;
        Logger.i("SportXmsApiImpl", "isSporting:" + z);
        if (cxcVar != null && (iBinderAsBinder = cxcVar.asBinder()) != null && iBinderAsBinder.isBinderAlive()) {
            if (z) {
                cxcVar.C0(z);
            } else {
                cxcVar.C0(z);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reset() {
        Logger.i("SportXmsApiImpl", "reset");
        this.stateListener = null;
        this.dataListener = null;
        this.sensorListener = null;
        this.disconnectTime = 0L;
        this.disConnectCal = 0;
        this.tempCalorie = 0;
        getSportDataCaller().removeSportDataChangedListener("SportXmsApiImpl", this.iSportDataChangedListener);
        getSportDataCaller().removeSportSensorDataChangedListener("SportXmsApiImpl", this.iSportSensorDataChangedListener);
        getSportStateCaller().removeSportStateChangedListener(SportXmsApiImpl.class, this.iSportStateChangedListener);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this.deviceStatusListener);
    }

    private final void setMDeviceConnectedListener(zwc zwcVar) {
        this.mDeviceConnectedListener.setValue((Object) this, $$delegatedProperties[0], zwcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ISportRemoteData sportDataCaller_delegate$lambda$1() {
        return SportManagerExtKt.getInstance(ISportRemoteData.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ISportRemoteState sportStateCaller_delegate$lambda$0() {
        return SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit switchCurDeviceMode$lambda$6(axc axcVar, int i) throws RemoteException {
        Logger.i("SportXmsApiImpl", "switchCurDeviceMode, code :" + i);
        if (i == -1) {
            if (axcVar != null) {
                axcVar.onError(-1);
            }
        } else if (axcVar != null) {
            axcVar.o5(i);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.hzc
    public void abnormalChangeSportStateToFinish() {
        Logger.i("SportXmsApiImpl", "abnormalChangeSportStateToFinish");
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).abnormalChangeSportStateToFinish();
    }

    public final boolean aidongIsSporting() {
        int i = this.sportState;
        return (i == 0 || i == 4) ? false : true;
    }

    @Override // defpackage.hzc
    public void finishSport(@Nullable String did, @Nullable SportXmsFinishData sportXmsFinishData) {
        Logger.i("SportXmsApiImpl", "finishSport , did : " + did + " , sportXmsFinishData:" + sportXmsFinishData);
        FinishSportData finishSportData = new FinishSportData();
        finishSportData.setSportXmsFinishSportData(sportXmsFinishData);
        finishSportData.setSportType(sportXmsFinishData != null ? sportXmsFinishData.getSportType() : 0);
        ISportRemoteState sportManagerExtKt = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        sportManagerExtKt.finishSport(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, finishSportData, new RequestCallback() { // from class: com.xiaomi.fitness.sport_xms.SportXmsApiImpl.finishSport.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
            }
        });
    }

    @Override // defpackage.hzc
    public void finishSportByType(@Nullable String did, int sportType) {
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).finishSport(did, sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport_xms.SportXmsApiImpl.finishSportByType.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
            }
        });
    }

    @Override // defpackage.hzc
    public void getAidongMemberExpireTimestamp(@Nullable final wwc listener) {
        MineSettingManagerExtKt.getInstance(MineSettingManager.INSTANCE).getAidongMemberExpireTimestamp(new Function1() { // from class: i6o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportXmsApiImpl.getAidongMemberExpireTimestamp$lambda$3(listener, ((Long) obj).longValue());
            }
        }, new Function1() { // from class: j6o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportXmsApiImpl.getAidongMemberExpireTimestamp$lambda$4(listener, (ApiException) obj);
            }
        });
    }

    @Override // defpackage.hzc
    public void getCurDeviceMode(@Nullable final axc listener) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            DeviceModelExtKt.getDeviceWearMode(wearableDeviceModel, new Function1() { // from class: g6o
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportXmsApiImpl.getCurDeviceMode$lambda$5(listener, ((Integer) obj).intValue());
                }
            });
        }
    }

    @Override // defpackage.hzc
    @NotNull
    public String getDeviceBattery() {
        WearableDeviceInfo deviceInfo;
        BatteryInfo batteryInfo;
        String string;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return (wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null || (batteryInfo = deviceInfo.getBatteryInfo()) == null || (string = Integer.valueOf(batteryInfo.getBattery()).toString()) == null) ? "" : string;
    }

    @Override // defpackage.hzc
    @Nullable
    public DeviceInfo getDeviceInfo() {
        String name;
        String model;
        String did;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            return null;
        }
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        WearableDeviceInfo deviceInfo = wearableDeviceModel2 != null ? wearableDeviceModel2.getDeviceInfo() : null;
        Logger.i("SportXmsApiImpl", "deviceInfo:" + deviceInfo);
        String str = "";
        if (deviceInfo == null || (name = deviceInfo.getName()) == null) {
            name = "";
        }
        if (deviceInfo == null || (model = deviceInfo.getModel()) == null) {
            model = "";
        }
        if (deviceInfo != null && (did = deviceInfo.getDid()) != null) {
            str = did;
        }
        return new DeviceInfo(name, model, str);
    }

    @Override // defpackage.hzc
    public void goToAidongCoursePaymentPage() {
        MineSettingManagerExtKt.getInstance(MineSettingManager.INSTANCE).goToAidongCoursePaymentPage();
    }

    @Override // defpackage.hzc
    public boolean hasOngoingSport() {
        return getSportStateCaller().hasOngoingSport();
    }

    @Override // defpackage.hzc
    public boolean isDeviceConnected() {
        return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).isConnected();
    }

    @Override // defpackage.hzc
    public void isDeviceSporting(@Nullable final cxc listener) throws RemoteException {
        if (!isSupportSomatosensoryGame()) {
            if (listener != null) {
                listener.C0(false);
            }
        } else {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel != null) {
                DeviceModelExtKt.isDeviceSporting(wearableDeviceModel, new Function1() { // from class: k6o
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportXmsApiImpl.isDeviceSporting$lambda$7(listener, ((Boolean) obj).booleanValue());
                    }
                });
            }
        }
    }

    @Override // defpackage.hzc
    public boolean isOpenPaidFeatures() {
        return MineSettingManagerExtKt.getInstance(MineSettingManager.INSTANCE).showAidongMemberPaymentEntrance();
    }

    @Override // defpackage.hzc
    public boolean isSupportSomatosensoryGame() {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        return (wearableDeviceModel == null || (DeviceManagerExtKt.getInstance(companion).getDeviceCapability(wearableDeviceModel.getDid()) & 512) == 0) ? false : true;
    }

    @Override // defpackage.hzc
    public void pauseSport(@Nullable String did, int sportType) {
        Logger.i("SportXmsApiImpl", "pauseSport , did:" + did + " , sportType:" + sportType);
        ISportRemoteState sportManagerExtKt = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        sportManagerExtKt.pauseSport(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport_xms.SportXmsApiImpl.pauseSport.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
            }
        });
    }

    @Override // defpackage.hzc
    public void restartSport(@Nullable String deviceModelDid, int sportType) {
        Logger.i("SportXmsApiImpl", "restartSport , did : " + deviceModelDid + " , sportType:" + sportType);
        ISportRemoteState sportManagerExtKt = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        sportManagerExtKt.restartSport(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport_xms.SportXmsApiImpl.restartSport.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
            }
        });
    }

    @Override // defpackage.hzc
    public void resumeSport(@Nullable String did, int sportType) {
        Logger.i("SportXmsApiImpl", "resumeSport , did :" + did + " , sportType:" + sportType);
        ISportRemoteState sportManagerExtKt = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        sportManagerExtKt.resumeSport(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport_xms.SportXmsApiImpl.resumeSport.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
            }
        });
    }

    @Override // defpackage.hzc
    public void setAidongCourseVipInfoListener(@Nullable xwc listener) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C32181(listener, null), 3, null);
    }

    @Override // defpackage.hzc
    public void setDeviceConnectedListener(@Nullable zwc listener) {
        Logger.i("SportXmsApiImpl", "setDeviceConnectedListener");
        setMDeviceConnectedListener(listener);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this.deviceStatusListener);
    }

    @Override // defpackage.hzc
    public void setSportStateChangedListener(@Nullable mxc listener) {
        Logger.i("SportXmsApiImpl", "setSportStateChangedListener");
        this.stateListener = listener;
    }

    @Override // defpackage.hzc
    public void setSportXmsDataChangedListener(@Nullable kxc listener) {
        Logger.i("SportXmsApiImpl", "setSportXmsDataChangedListener");
        this.dataListener = listener;
    }

    @Override // defpackage.hzc
    public void setSportXmsSensorDataChangedListener(@Nullable lxc listener) {
        Logger.i("SportXmsApiImpl", "setSportXmsSensorDataChangedListener");
        initSender(listener);
    }

    @Override // defpackage.hzc
    public void setXiaomiUserInfoListener(@Nullable nxc listener) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C32191(listener, null), 3, null);
    }

    @Override // defpackage.hzc
    public void shake(int vibrateLevel) {
        Logger.i("SportXmsApiImpl", "shake , vibrateLevel:" + vibrateLevel);
        getSportStateCaller().shake(vibrateLevel);
    }

    @Override // defpackage.hzc
    public void startSport(@Nullable String did, @Nullable SportXmsRequestData sportXmsRequestData) {
        getSportDataCaller().addSportDataChangedListener("SportXmsApiImpl", this.iSportDataChangedListener);
        getSportDataCaller().addSportSensorDataChangedListener("SportXmsApiImpl", this.iSportSensorDataChangedListener);
        getSportStateCaller().addSportStateChangedListener(SportXmsApiImpl.class, this.iSportStateChangedListener);
        if (sportXmsRequestData != null) {
            Logger.i("SportXmsApiImpl", "startSport , sportTime:" + sportXmsRequestData.getTimeStamp() + " , timeZone:" + sportXmsRequestData.getTimeZone() + " , sportType:" + sportXmsRequestData.getSportType() + " , sportState:" + sportXmsRequestData.getSportState() + " , did:" + did);
            SportRequestData sportRequestDataO = new SportRequestData.a().z(sportXmsRequestData.getSportType()).x(sportXmsRequestData.getSportState()).B((long) sportXmsRequestData.getTimeStamp(), TimeUnit.SECONDS).E(sportXmsRequestData.getTimeZone()).o();
            ISportRemoteState sportManagerExtKt = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            String did2 = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
            Intrinsics.checkNotNull(sportRequestDataO);
            sportManagerExtKt.startSport(did2, sportRequestDataO, new RequestCallback() { // from class: com.xiaomi.fitness.sport_xms.SportXmsApiImpl$startSport$1$1
                @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                }
            });
        }
    }

    @Override // defpackage.hzc
    public void switchCurDeviceMode(int mode, @Nullable final axc listener) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            DeviceModelExtKt.setDeviceWearMode(wearableDeviceModel, mode, new Function1() { // from class: h6o
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportXmsApiImpl.switchCurDeviceMode$lambda$6(listener, ((Integer) obj).intValue());
                }
            });
        }
    }
}
