package com.huami.bloodpressure_ui.expire;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure.service.BloodPressureExpireVo;
import com.huami.bloodpressure.service.IBloodPressureExpireService;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import com.huami.bloodpressure_core.ext.UserEx;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.bloodpressure_core.sharedpreference.ISharedPref;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\bR\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/bloodpressure_ui/expire/BloodPressureExpireDialogLogic;", "", "", "prefix", "deviceId", "c", "e", "a", "", "b", GoogleApiAvailabilityLight.a, "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/bloodpressure/service/BloodPressureExpireVo;", "getDeviceExpireState", "", "setDayDialog", "expire", "setLocalNoMoreShowState", "Lcom/huami/bloodpressure_core/sharedpreference/ISharedPref;", "Lcom/huami/bloodpressure_core/sharedpreference/ISharedPref;", "sharedPref", "Lcom/huami/bloodpressure/service/IBloodPressureExpireService;", "Lcom/huami/bloodpressure/service/IBloodPressureExpireService;", "expireService", "Ljava/lang/String;", "userId", "<init>", "(Lcom/huami/bloodpressure_core/sharedpreference/ISharedPref;Lcom/huami/bloodpressure/service/IBloodPressureExpireService;)V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureExpireDialogLogic {

    @NotNull
    public static final String BLOODPRESSURE_DATE_PREFIX = "BP_DATE_PREFIX_";

    @NotNull
    private static final String d = "BP_EXPIRE_PREFIX_";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISharedPref sharedPref;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IBloodPressureExpireService expireService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String userId = UserEx.getUserId();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ BloodPressureExpireVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BloodPressureExpireVo bloodPressureExpireVo) {
            super(0);
            this.a = bloodPressureExpireVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deviceExpireState " + this.a;
        }
    }

    public BloodPressureExpireDialogLogic(@NotNull ISharedPref iSharedPref, @NotNull IBloodPressureExpireService iBloodPressureExpireService) {
        this.sharedPref = iSharedPref;
        this.expireService = iBloodPressureExpireService;
    }

    private final String a(String deviceId) {
        return c(BLOODPRESSURE_DATE_PREFIX, deviceId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(String deviceId) {
        return Intrinsics.areEqual(this.sharedPref.getString(a(deviceId), ""), TimeFormatEx.INSTANCE.formatTime(System.currentTimeMillis(), "yyyy-MM-dd"));
    }

    private final String c(String prefix, String deviceId) {
        return prefix + this.userId + "_" + deviceId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(String deviceId) {
        return this.sharedPref.getBoolean(e(deviceId), false);
    }

    private final String e(String deviceId) {
        return c(d, deviceId);
    }

    @NotNull
    public final Flow<BloodPressureExpireVo> getDeviceExpireState() {
        final Flow<BloodPressureExpireVo> currentDeviceExpire = this.expireService.getCurrentDeviceExpire();
        return new Flow<BloodPressureExpireVo>() { // from class: com.huami.bloodpressure_ui.expire.BloodPressureExpireDialogLogic$getDeviceExpireState$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.bloodpressure_ui.expire.BloodPressureExpireDialogLogic$getDeviceExpireState$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<BloodPressureExpireVo> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ BloodPressureExpireDialogLogic$getDeviceExpireState$$inlined$map$1 b;

                /* JADX INFO: renamed from: com.huami.bloodpressure_ui.expire.BloodPressureExpireDialogLogic$getDeviceExpireState$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.bloodpressure_ui.expire.BloodPressureExpireDialogLogic$getDeviceExpireState$$inlined$map$1$2", f = "BloodPressureExpireDialogLogic.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;
                    public Object e;
                    public Object f;
                    public Object g;
                    public Object h;
                    public Object i;
                    public Object j;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, BloodPressureExpireDialogLogic$getDeviceExpireState$$inlined$map$1 bloodPressureExpireDialogLogic$getDeviceExpireState$$inlined$map$1) {
                    this.a = flowCollector;
                    this.b = bloodPressureExpireDialogLogic$getDeviceExpireState$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(BloodPressureExpireVo bloodPressureExpireVo, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    BloodPressureExpireVo bloodPressureExpireVo2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        BloodPressureExpireVo bloodPressureExpireVo3 = bloodPressureExpireVo;
                        if (bloodPressureExpireVo3 == null) {
                            bloodPressureExpireVo2 = null;
                        } else {
                            boolean z = false;
                            if (!bloodPressureExpireVo3.getExpire()) {
                                this.setLocalNoMoreShowState(bloodPressureExpireVo3.getDeviceId(), false);
                            } else if (!this.d(bloodPressureExpireVo3.getDeviceId()) && !this.b(bloodPressureExpireVo3.getDeviceId())) {
                                z = true;
                            }
                            BloodPressureExpireVo bloodPressureExpireVo4 = new BloodPressureExpireVo(bloodPressureExpireVo3.getDeviceId(), z);
                            HMLog.info(BloodPressureConst.INSTANCE.getTAG(), new BloodPressureExpireDialogLogic.a(bloodPressureExpireVo4));
                            bloodPressureExpireVo2 = bloodPressureExpireVo4;
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(bloodPressureExpireVo2, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super BloodPressureExpireVo> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = currentDeviceExpire.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final void setDayDialog(@NotNull String deviceId) {
        this.sharedPref.saveString(a(deviceId), TimeFormatEx.INSTANCE.formatTime(System.currentTimeMillis(), "yyyy-MM-dd"));
    }

    public final void setLocalNoMoreShowState(@NotNull String deviceId, boolean expire) {
        this.sharedPref.saveBoolean(e(deviceId), expire);
    }
}
