package com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr;

import android.content.res.Resources;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.DefaultHuamiHealthModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingViewModel;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import defpackage.qyi;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u00101\u001a\u00020\u0011J\u0006\u00102\u001a\u00020\u0011J\u0006\u00103\u001a\u00020\u0011J\"\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00162\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020508J\u001a\u00109\u001a\u0002052\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020508J\b\u0010:\u001a\u00020\u0006H\u0002J\u0006\u0010;\u001a\u00020\u0006J\u0006\u0010<\u001a\u00020\u0006J\"\u0010=\u001a\u0002052\u0006\u0010>\u001a\u00020\u00162\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020508J\"\u0010?\u001a\u0002052\u0006\u0010>\u001a\u00020\u00162\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020508J\"\u0010D\u001a\u0002052\u0006\u0010E\u001a\u00020\u00062\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020508J\u0014\u0010F\u001a\u000205*\u00020G2\u0006\u0010H\u001a\u00020\u0006H\u0002J\b\u0010I\u001a\u00020\nH\u0002J\u0013\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0002\u0010\u0013J\u0018\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u0016H\u0002J\u0018\u0010M\u001a\u00020\u00112\u0006\u0010L\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u0016H\u0002J\u0013\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0002\u0010\u0013J\u0013\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0002\u0010\u0013J\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\nH\u0002¢\u0006\u0002\u0010QJ\b\u0010R\u001a\u00020\nH\u0002J\u0018\u0010S\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0016H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001a\u0010\fR!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u001f\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b \u0010\u0018R\u0011\u0010!\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b!\u0010\bR\u001b\u0010\"\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000e\u001a\u0004\b#\u0010\fR!\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u000e\u001a\u0004\b&\u0010\u0013R\u0011\u0010(\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0011\u0010*\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b*\u0010\bR\u0011\u0010+\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b+\u0010\bR\u001a\u0010,\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\b\"\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b/\u0010\bR\u0011\u00100\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b0\u0010\bR/\u0010@\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020508\u0012\u0004\u0012\u0002050A¢\u0006\b\n\u0000\u001a\u0004\bB\u0010C¨\u0006T"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/hr/HuamiHrSettingViewModel;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorViewModel;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/DefaultHuamiHealthModel;", "<init>", "()V", "hrDetectionEnable", "", "getHrDetectionEnable", "()Z", "hrIntervals", "", "getHrIntervals", "()[I", "hrIntervals$delegate", "Lkotlin/Lazy;", "hrIntervalStrs", "", "", "getHrIntervalStrs", "()[Ljava/lang/String;", "hrIntervalStrs$delegate", "curHrIntervalPosition", "", "getCurHrIntervalPosition", "()I", "warningIntervals", "getWarningIntervals", "warningIntervals$delegate", "warningIntervalStrs", "getWarningIntervalStrs", "warningIntervalStrs$delegate", "curWarningIntervalPosition", "getCurWarningIntervalPosition", "isSupportLowHrWarning", "lowWarningIntervals", "getLowWarningIntervals", "lowWarningIntervals$delegate", "lowWarningIntervalStrs", "getLowWarningIntervalStrs", "lowWarningIntervalStrs$delegate", "curLowWarningIntervalPosition", "getCurLowWarningIntervalPosition", "isSupportActiveDetection", "isActiveEnable", "is10SupportHrDetection", "set10SupportHrDetection", "(Z)V", "isSupportHrDetection", "isAbnormalHeartbeatEnable", "getCurHeartFreqStr", "getCurWarningIntervalStr", "getCurLowWarningIntervalStr", "syncHrRateFreq", "", "freq", "callback", "Lkotlin/Function1;", "load10SupportHighLow", "syncWarningViewEnable", "isHighEnable", "isLowEnable", "syncWarningInterval", "interval", "syncLowWarningInterval", "syncActiveDetection", "Lkotlin/Function2;", "getSyncActiveDetection", "()Lkotlin/jvm/functions/Function2;", "syncHeartHealthyDetection", "checked", "setHrWarningEnable", "Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;", "enable", "buildHrIntervals", "buildHrIntervalStrs", "getHeartFreqStr", "type", "getHeartFreqStrList", "buildWarningIntervalStrs", "buildLowWarningIntervalStrs", "trans2WarningStrArray", "([I)[Ljava/lang/String;", "buildWarningIntervals", "getWarningIntervalStr", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHuamiHrSettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuamiHrSettingViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/healthmonitor/hr/HuamiHrSettingViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,321:1\n11188#2:322\n11523#2,3:323\n11188#2:330\n11523#2,3:331\n37#3:326\n36#3,3:327\n37#3:334\n36#3,3:335\n*S KotlinDebug\n*F\n+ 1 HuamiHrSettingViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/healthmonitor/hr/HuamiHrSettingViewModel\n*L\n247#1:322\n247#1:323,3\n293#1:330\n293#1:331,3\n252#1:326\n252#1:327,3\n298#1:334\n298#1:335,3\n*E\n"})
public final class HuamiHrSettingViewModel extends BaseHuamiHealthMonitorViewModel<DefaultHuamiHealthModel> {
    private boolean is10SupportHrDetection;

    @NotNull
    private final Function2<Boolean, Function1<? super Boolean, Unit>, Unit> syncActiveDetection;

    /* JADX INFO: renamed from: hrIntervals$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrIntervals = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: skc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuamiHrSettingViewModel.hrIntervals_delegate$lambda$0(this.f33732a);
        }
    });

    /* JADX INFO: renamed from: hrIntervalStrs$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrIntervalStrs = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tkc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuamiHrSettingViewModel.hrIntervalStrs_delegate$lambda$1(this.f34789a);
        }
    });

    /* JADX INFO: renamed from: warningIntervals$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy warningIntervals = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ukc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuamiHrSettingViewModel.warningIntervals_delegate$lambda$2(this.f35868a);
        }
    });

    /* JADX INFO: renamed from: warningIntervalStrs$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy warningIntervalStrs = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vkc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuamiHrSettingViewModel.warningIntervalStrs_delegate$lambda$3(this.f36978a);
        }
    });

    /* JADX INFO: renamed from: lowWarningIntervals$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lowWarningIntervals = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wkc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuamiHrSettingViewModel.lowWarningIntervals_delegate$lambda$4();
        }
    });

    /* JADX INFO: renamed from: lowWarningIntervalStrs$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lowWarningIntervalStrs = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xkc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuamiHrSettingViewModel.lowWarningIntervalStrs_delegate$lambda$5(this.f39214a);
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingViewModel$load10SupportHighLow$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingViewModel$load10SupportHighLow$1", f = "HuamiHrSettingViewModel.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HuamiHrSettingViewModel.this.new AnonymousClass1(this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                HuamiHrSettingViewModel$load10SupportHighLow$1$result$1 huamiHrSettingViewModel$load10SupportHighLow$1$result$1 = new HuamiHrSettingViewModel$load10SupportHighLow$1$result$1(HuamiHrSettingViewModel.this, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, huamiHrSettingViewModel$load10SupportHighLow$1$result$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Logger.i(HuamiHrSettingViewModel.this.getTAG(), "load10SupportHighLow result:" + zBooleanValue);
            HuamiHrSettingViewModel.this.set10SupportHrDetection(zBooleanValue);
            Function1<Boolean, Unit> function1 = this.$callback;
            if (function1 != null) {
                function1.invoke2(Boxing.boxBoolean(HuamiHrSettingViewModel.this.getIs10SupportHrDetection()));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingViewModel$syncHeartHealthyDetection$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingViewModel$syncHeartHealthyDetection$1", f = "HuamiHrSettingViewModel.kt", i = {1}, l = {210, 215}, m = "invokeSuspend", n = {"success"}, s = {"Z$0"})
    public static final class C21751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ boolean $checked;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21751(boolean z, Function1<? super Boolean, Unit> function1, Continuation<? super C21751> continuation) {
            super(2, continuation);
            this.$checked = z;
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HuamiHrSettingViewModel.this.new C21751(this.$checked, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = this.Z$0;
                    ResultKt.throwOnFailure(obj);
                }
                zBooleanValue = z;
                Logger.i(HuamiHrSettingViewModel.this.getTAG(), "syncHeartHealthyDetection " + HuamiHrSettingViewModel.this.getMConfig().isAbnormalHeartbeatEnable() + " success:" + zBooleanValue);
                this.$callback.invoke2(Boxing.boxBoolean(zBooleanValue));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            HuamiHrSettingViewModel$syncHeartHealthyDetection$1$success$1 huamiHrSettingViewModel$syncHeartHealthyDetection$1$success$1 = new HuamiHrSettingViewModel$syncHeartHealthyDetection$1$success$1(HuamiHrSettingViewModel.this, this.$checked, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, huamiHrSettingViewModel$syncHeartHealthyDetection$1$success$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                HuamiHrSettingViewModel.this.getMConfig().setAbnormalHeartbeatEnable(this.$checked);
                HuamiHrSettingViewModel huamiHrSettingViewModel = HuamiHrSettingViewModel.this;
                this.Z$0 = zBooleanValue;
                this.label = 2;
                if (huamiHrSettingViewModel.syncRemote(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z = zBooleanValue;
                zBooleanValue = z;
            }
            Logger.i(HuamiHrSettingViewModel.this.getTAG(), "syncHeartHealthyDetection " + HuamiHrSettingViewModel.this.getMConfig().isAbnormalHeartbeatEnable() + " success:" + zBooleanValue);
            this.$callback.invoke2(Boxing.boxBoolean(zBooleanValue));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingViewModel$syncHrRateFreq$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingViewModel$syncHrRateFreq$1", f = "HuamiHrSettingViewModel.kt", i = {}, l = {78, 85}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ int $freq;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21761(int i, Function1<? super Boolean, Unit> function1, Continuation<? super C21761> continuation) {
            super(2, continuation);
            this.$freq = i;
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HuamiHrSettingViewModel.this.new C21761(this.$freq, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            HuamiHrSettingViewModel$syncHrRateFreq$1$result$1 huamiHrSettingViewModel$syncHrRateFreq$1$result$1 = new HuamiHrSettingViewModel$syncHrRateFreq$1$result$1(HuamiHrSettingViewModel.this, this.$freq, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, huamiHrSettingViewModel$syncHrRateFreq$1$result$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Logger.i(HuamiHrSettingViewModel.this.getTAG(), "syncHrRateFreq(" + this.$freq + ") success:" + zBooleanValue);
            this.$callback.invoke2(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                HuamiHrSettingViewModel huamiHrSettingViewModel = HuamiHrSettingViewModel.this;
                this.label = 2;
                if (huamiHrSettingViewModel.syncRemote(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingViewModel$syncLowWarningInterval$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingViewModel$syncLowWarningInterval$1", f = "HuamiHrSettingViewModel.kt", i = {}, l = {180, SportReportBaseParser.ReportType.avgDescentRate}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ int $interval;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21771(Function1<? super Boolean, Unit> function1, int i, Continuation<? super C21771> continuation) {
            super(2, continuation);
            this.$callback = function1;
            this.$interval = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HuamiHrSettingViewModel.this.new C21771(this.$callback, this.$interval, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            HuamiHrSettingViewModel$syncLowWarningInterval$1$success$1 huamiHrSettingViewModel$syncLowWarningInterval$1$success$1 = new HuamiHrSettingViewModel$syncLowWarningInterval$1$success$1(HuamiHrSettingViewModel.this, this.$interval, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, huamiHrSettingViewModel$syncLowWarningInterval$1$success$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Logger.i(HuamiHrSettingViewModel.this.getTAG(), "syncWarningInterval success:" + zBooleanValue);
            this.$callback.invoke2(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                HuamiHrSettingViewModel huamiHrSettingViewModel = HuamiHrSettingViewModel.this;
                this.label = 2;
                if (huamiHrSettingViewModel.syncRemote(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingViewModel$syncWarningInterval$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingViewModel$syncWarningInterval$1", f = "HuamiHrSettingViewModel.kt", i = {}, l = {165, 173}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ int $interval;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21781(Function1<? super Boolean, Unit> function1, int i, Continuation<? super C21781> continuation) {
            super(2, continuation);
            this.$callback = function1;
            this.$interval = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HuamiHrSettingViewModel.this.new C21781(this.$callback, this.$interval, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            HuamiHrSettingViewModel$syncWarningInterval$1$success$1 huamiHrSettingViewModel$syncWarningInterval$1$success$1 = new HuamiHrSettingViewModel$syncWarningInterval$1$success$1(HuamiHrSettingViewModel.this, this.$interval, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, huamiHrSettingViewModel$syncWarningInterval$1$success$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Logger.i(HuamiHrSettingViewModel.this.getTAG(), "syncWarningInterval success:" + zBooleanValue);
            this.$callback.invoke2(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                HuamiHrSettingViewModel huamiHrSettingViewModel = HuamiHrSettingViewModel.this;
                this.label = 2;
                if (huamiHrSettingViewModel.syncRemote(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HuamiHrSettingViewModel() {
        getType().postValue(1);
        this.syncActiveDetection = new Function2() { // from class: ykc
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HuamiHrSettingViewModel.syncActiveDetection$lambda$6(this.f40268a, ((Boolean) obj).booleanValue(), (Function1) obj2);
            }
        };
    }

    private final String[] buildHrIntervalStrs() {
        int[] hrIntervals = getHrIntervals();
        ArrayList arrayList = new ArrayList(hrIntervals.length);
        int length = hrIntervals.length;
        for (int i = 0; i < length; i++) {
            int i2 = hrIntervals[i];
            arrayList.add(i2 > 0 ? getHeartFreqStrList(2, i2) : ResourceExtKt.getString(wzi.y1));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final int[] buildHrIntervals() {
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel == null) {
            deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        }
        return (deviceModel == null || !DeviceModelExtKt.isL66(deviceModel)) ? new int[]{1, 5, 10, 30, 0} : new int[]{1, 10, 30, 255, 0};
    }

    private final String[] buildLowWarningIntervalStrs() {
        return trans2WarningStrArray(getLowWarningIntervals());
    }

    private final String[] buildWarningIntervalStrs() {
        return trans2WarningStrArray(getWarningIntervals());
    }

    private final int[] buildWarningIntervals() {
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel == null) {
            deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        }
        List mutableList = (deviceModel == null || !DeviceModelExtKt.isKongMing(deviceModel)) ? CollectionsKt___CollectionsKt.toMutableList(RangesKt___RangesKt.step(new IntRange(100, 150), 10)) : CollectionsKt___CollectionsKt.toMutableList(RangesKt___RangesKt.step(new IntRange(100, 150), 5));
        mutableList.add(0);
        return CollectionsKt___CollectionsKt.toIntArray(mutableList);
    }

    private final String getHeartFreqStr(int type, int freq) {
        if (getMConfig().isAbnormalHeartbeatEnable()) {
            return ResourceExtKt.getString(wzi.U2);
        }
        if (type != 0 && type != 1) {
            if (freq != 255) {
                return ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qyi.d, freq, Integer.valueOf(freq));
            }
            String string = ApplicationExtKt.getApplication().getString(wzi.U4);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        return ResourceExtKt.getString(wzi.y1);
    }

    private final String getHeartFreqStrList(int type, int freq) {
        if (type != 0 && type != 1) {
            if (freq != 255) {
                return ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qyi.d, freq, Integer.valueOf(freq));
            }
            String string = ApplicationExtKt.getApplication().getString(wzi.U4);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        return ResourceExtKt.getString(wzi.y1);
    }

    private final boolean getHrDetectionEnable() {
        return getMConfig().getType() == 2 || getMConfig().getType() == 3;
    }

    private final String getWarningIntervalStr(boolean enable, int interval) {
        Resources resources = AppUtil.getApp().getResources();
        if (!enable || interval <= 0) {
            String string = resources.getString(wzi.q3);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String quantityString = resources.getQuantityString(qyi.e, interval, Integer.valueOf(interval));
        Intrinsics.checkNotNull(quantityString);
        return quantityString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] hrIntervalStrs_delegate$lambda$1(HuamiHrSettingViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.buildHrIntervalStrs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] hrIntervals_delegate$lambda$0(HuamiHrSettingViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.buildHrIntervals();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] lowWarningIntervalStrs_delegate$lambda$5(HuamiHrSettingViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.buildLowWarningIntervalStrs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] lowWarningIntervals_delegate$lambda$4() {
        return new int[]{40, 45, 50, 0};
    }

    private final void setHrWarningEnable(HRDetect hRDetect, boolean z) {
        hRDetect.setWarningEnable(z);
        hRDetect.setLowWarningEnable(z);
        if (!ArraysKt___ArraysKt.contains(getWarningIntervals(), hRDetect.getWarningValue())) {
            Logger.w(getTAG(), "warningValue fixed oldVal:" + hRDetect.getWarningValue() + " newVal:0");
            hRDetect.setWarningValue(0);
        }
        if (ArraysKt___ArraysKt.contains(getLowWarningIntervals(), hRDetect.getLowWarningValue())) {
            return;
        }
        Logger.w(getTAG(), "lowWarningValue fixed oldVal:" + hRDetect.getLowWarningValue() + " newVal:0");
        hRDetect.setLowWarningValue(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncActiveDetection$lambda$6(HuamiHrSettingViewModel this$0, boolean z, Function1 callback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this$0), null, null, new HuamiHrSettingViewModel$syncActiveDetection$1$1(this$0, z, callback, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean syncWarningViewEnable() {
        WearableDeviceModel deviceModel;
        setHrWarningEnable(getMConfig(), isHighEnable());
        WearableDeviceModel deviceModel2 = getDeviceModel();
        boolean highHr = deviceModel2 != null ? com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.setHighHr(deviceModel2, getMConfig().isWarningEnable(), getMConfig().getWarningValue()) : false;
        boolean z = !isLowEnable() || ((deviceModel = getDeviceModel()) != null && com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.setLowHr(deviceModel, getMConfig().isLowWarningEnable(), getMConfig().getLowWarningValue()));
        Logger.i(getTAG(), "setWarningViewEnable " + highHr + " " + z);
        return highHr && z;
    }

    private final String[] trans2WarningStrArray(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            arrayList.add(i2 >= 0 ? getWarningIntervalStr(true, i2) : ResourceExtKt.getString(wzi.q3));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] warningIntervalStrs_delegate$lambda$3(HuamiHrSettingViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.buildWarningIntervalStrs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] warningIntervals_delegate$lambda$2(HuamiHrSettingViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.buildWarningIntervals();
    }

    @NotNull
    public final String getCurHeartFreqStr() {
        return getHeartFreqStr(getMConfig().getType(), getMConfig().getFreq());
    }

    public final int getCurHrIntervalPosition() {
        return getHrDetectionEnable() ? ArraysKt___ArraysKt.indexOf(getHrIntervals(), getMConfig().getFreq()) : getHrIntervals().length - 1;
    }

    public final int getCurLowWarningIntervalPosition() {
        return getMConfig().isLowWarningEnable() ? ArraysKt___ArraysKt.indexOf(getLowWarningIntervals(), getMConfig().getLowWarningValue()) : getLowWarningIntervals().length - 1;
    }

    @NotNull
    public final String getCurLowWarningIntervalStr() {
        return getWarningIntervalStr(getMConfig().isLowWarningEnable(), getMConfig().getLowWarningValue());
    }

    public final int getCurWarningIntervalPosition() {
        return getMConfig().isWarningEnable() ? ArraysKt___ArraysKt.indexOf(getWarningIntervals(), getMConfig().getWarningValue()) : getWarningIntervals().length - 1;
    }

    @NotNull
    public final String getCurWarningIntervalStr() {
        return getWarningIntervalStr(getMConfig().isWarningEnable(), getMConfig().getWarningValue());
    }

    @NotNull
    public final String[] getHrIntervalStrs() {
        return (String[]) this.hrIntervalStrs.getValue();
    }

    @NotNull
    public final int[] getHrIntervals() {
        return (int[]) this.hrIntervals.getValue();
    }

    @NotNull
    public final String[] getLowWarningIntervalStrs() {
        return (String[]) this.lowWarningIntervalStrs.getValue();
    }

    @NotNull
    public final int[] getLowWarningIntervals() {
        return (int[]) this.lowWarningIntervals.getValue();
    }

    @NotNull
    public final Function2<Boolean, Function1<? super Boolean, Unit>, Unit> getSyncActiveDetection() {
        return this.syncActiveDetection;
    }

    @NotNull
    public final String[] getWarningIntervalStrs() {
        return (String[]) this.warningIntervalStrs.getValue();
    }

    @NotNull
    public final int[] getWarningIntervals() {
        return (int[]) this.warningIntervals.getValue();
    }

    /* JADX INFO: renamed from: is10SupportHrDetection, reason: from getter */
    public final boolean getIs10SupportHrDetection() {
        return this.is10SupportHrDetection;
    }

    public final boolean isAbnormalHeartbeatEnable() {
        return getMConfig().isAbnormalHeartbeatEnable();
    }

    public final boolean isActiveEnable() {
        return getMConfig().isActiveEnable();
    }

    public final boolean isHighEnable() {
        if (getMConfig().isAbnormalHeartbeatEnable()) {
            return true;
        }
        if (getHrDetectionEnable() && getMConfig().getType() != 1 && getMConfig().getType() != 0) {
            WearableDeviceModel deviceModel = getDeviceModel();
            if (deviceModel == null || !DeviceModelExtKt.isPanGu(deviceModel)) {
                if (getMConfig().getFreq() == 255 || getMConfig().getFreq() <= 1) {
                    return true;
                }
                if (getMConfig().getFreq() == 10) {
                    return this.is10SupportHrDetection;
                }
            } else if (getMConfig().getFreq() <= 10) {
                return true;
            }
        }
        return false;
    }

    public final boolean isLowEnable() {
        WearableDeviceModel deviceModel = getDeviceModel();
        if ((deviceModel != null && DeviceModelExtKt.isPanGu(deviceModel)) || getMConfig().getType() == 1 || getMConfig().getType() == 0) {
            return false;
        }
        if (getMConfig().getFreq() == 255 || getMConfig().getFreq() <= 1) {
            return true;
        }
        if (getMConfig().getFreq() == 10) {
            return this.is10SupportHrDetection;
        }
        return false;
    }

    public final boolean isSupportActiveDetection() {
        WearableDeviceModel deviceModel = getDeviceModel();
        boolean z = false;
        if (deviceModel != null && DeviceModelExtKt.isL66(deviceModel)) {
            z = true;
        }
        return !z;
    }

    public final boolean isSupportHrDetection() {
        WearableDeviceModel deviceModel = getDeviceModel();
        return (deviceModel == null || DeviceModelExtKt.isKongMing(deviceModel)) ? false : true;
    }

    public final boolean isSupportLowHrWarning() {
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel != null) {
            return DeviceModelExtKt.isL66(deviceModel);
        }
        return false;
    }

    public final void load10SupportHighLow(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(callback, null), 3, null);
    }

    public final void set10SupportHrDetection(boolean z) {
        this.is10SupportHrDetection = z;
    }

    public final void syncHeartHealthyDetection(boolean checked, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21751(checked, callback, null), 3, null);
    }

    public final void syncHrRateFreq(int freq, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21761(freq, callback, null), 3, null);
    }

    public final void syncLowWarningInterval(int interval, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (isSupportLowHrWarning()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21771(callback, interval, null), 3, null);
        }
    }

    public final void syncWarningInterval(int interval, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21781(callback, interval, null), 3, null);
    }
}
