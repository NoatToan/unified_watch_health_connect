package com.xiaomi.fitness.sport_eco.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import com.google.gson.Gson;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.tsmclient.smartcard.CardConstants;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpModel;
import com.xiaomi.fitness.sport_eco.request.EnvironmentalRequest;
import com.xiaomi.fitness.sport_eco.view.environmental.model.EnvironmentalVO;
import defpackage.e1j;
import defpackage.foi;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J!\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0002J\u0018\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0017H\u0002J\u000e\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0015J\u000e\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/viewmodel/EcoEnvironmentalViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "request", "Lcom/xiaomi/fitness/sport_eco/request/EnvironmentalRequest;", "environmentalValue", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/sport_eco/view/environmental/model/EnvironmentalVO;", "getEnvironmentalValue", "()Landroidx/lifecycle/MutableLiveData;", "setEnvironmentalValue", "(Landroidx/lifecycle/MutableLiveData;)V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "fetchEnvironmental", "dealData", "vo", "getDes", "", "level", "", "getDesResId", "getDrawableId", "getLevel", SportDataTypeKt.DIMEN_TOTAL, "isNext", "", "(Ljava/lang/Integer;Z)I", "getPercent", "", "calcPercent", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, "addEnvironmental", "value", "initData", "environmentalVO", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoEnvironmentalViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "EcoEnvironmentalViewModel";

    @NotNull
    private MutableLiveData<EnvironmentalVO> environmentalValue = new MutableLiveData<>();
    private EnvironmentalRequest request;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.viewmodel.EcoEnvironmentalViewModel$addEnvironmental$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.viewmodel.EcoEnvironmentalViewModel$addEnvironmental$1", f = "EcoEnvironmentalViewModel.kt", i = {}, l = {SportReportBaseParser.ReportType.maxWaterTemperature}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$value = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoEnvironmentalViewModel.this.new AnonymousClass1(this.$value, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    EnvironmentalRequest environmentalRequest = EcoEnvironmentalViewModel.this.request;
                    if (environmentalRequest == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("request");
                        environmentalRequest = null;
                    }
                    String str = this.$value;
                    String strValueOf = String.valueOf(System.currentTimeMillis());
                    this.label = 1;
                    obj = environmentalRequest.addEnvironmentalValue(str, strValueOf, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                FtpModel.RespData respData = (FtpModel.RespData) obj;
                Logger.d(EcoEnvironmentalViewModel.TAG, "add resp = " + new Gson().toJson(respData));
                JSONObject jSONObject = new JSONObject(respData.getResp());
                int iOptInt = jSONObject.optInt("code");
                String strOptString = jSONObject.optString("msg");
                if (iOptInt != 200) {
                    Logger.e(EcoEnvironmentalViewModel.TAG, "error msg = " + strOptString);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final float calcPercent(int a2, int b2) {
        return new BigDecimal(a2).divide(new BigDecimal(b2), 2, 0).floatValue();
    }

    private final String getDes(int level) {
        switch (level) {
            case 0:
                return ResourceExtKt.getString(e1j.t);
            case 1:
                return ResourceExtKt.getString(e1j.m);
            case 2:
                return ResourceExtKt.getString(e1j.i);
            case 3:
                return ResourceExtKt.getString(e1j.s);
            case 4:
                return ResourceExtKt.getString(e1j.q);
            case 5:
                return ResourceExtKt.getString(e1j.f16165r);
            case 6:
                return ResourceExtKt.getString(e1j.o);
            case 7:
                return ResourceExtKt.getString(e1j.n);
            case 8:
                return ResourceExtKt.getString(e1j.l);
            case 9:
                return ResourceExtKt.getString(e1j.p);
            case 10:
                return ResourceExtKt.getString(e1j.f16164k);
            default:
                return ResourceExtKt.getString(e1j.t);
        }
    }

    private final int getDesResId(int level) {
        switch (level) {
            case 0:
                return e1j.t;
            case 1:
                return e1j.m;
            case 2:
                return e1j.i;
            case 3:
                return e1j.s;
            case 4:
                return e1j.q;
            case 5:
                return e1j.f16165r;
            case 6:
                return e1j.o;
            case 7:
                return e1j.n;
            case 8:
                return e1j.l;
            case 9:
                return e1j.p;
            case 10:
                return e1j.f16164k;
            default:
                return e1j.t;
        }
    }

    private final int getDrawableId(int level) {
        switch (level) {
            case 0:
                return foi.n;
            case 1:
                return foi.g;
            case 2:
                return foi.d;
            case 3:
                return foi.m;
            case 4:
                return foi.f18004k;
            case 5:
                return foi.l;
            case 6:
                return foi.i;
            case 7:
                return foi.h;
            case 8:
                return foi.f;
            case 9:
                return foi.j;
            case 10:
                return foi.e;
            default:
                return foi.e;
        }
    }

    private final int getLevel(Integer total, boolean isNext) {
        IntRange intRangeUntil = RangesKt___RangesKt.until(0, 100);
        if (total != null && intRangeUntil.contains(total.intValue())) {
            return isNext ? 1 : 0;
        }
        IntRange intRangeUntil2 = RangesKt___RangesKt.until(100, 450);
        if (total != null && intRangeUntil2.contains(total.intValue())) {
            return isNext ? 2 : 1;
        }
        IntRange intRangeUntil3 = RangesKt___RangesKt.until(450, 750);
        if (total != null && intRangeUntil3.contains(total.intValue())) {
            return isNext ? 3 : 2;
        }
        IntRange intRangeUntil4 = RangesKt___RangesKt.until(750, 1200);
        if (total != null && intRangeUntil4.contains(total.intValue())) {
            return isNext ? 4 : 3;
        }
        IntRange intRangeUntil5 = RangesKt___RangesKt.until(1200, 1800);
        if (total != null && intRangeUntil5.contains(total.intValue())) {
            return isNext ? 5 : 4;
        }
        IntRange intRangeUntil6 = RangesKt___RangesKt.until(1800, 3000);
        if (total != null && intRangeUntil6.contains(total.intValue())) {
            return isNext ? 6 : 5;
        }
        IntRange intRangeUntil7 = RangesKt___RangesKt.until(3000, CardConstants.ST_THREE_DAY_PASS_DEFAULT_BALANCE);
        if (total != null && intRangeUntil7.contains(total.intValue())) {
            return isNext ? 7 : 6;
        }
        IntRange intRangeUntil8 = RangesKt___RangesKt.until(CardConstants.ST_THREE_DAY_PASS_DEFAULT_BALANCE, 7500);
        if (total != null && intRangeUntil8.contains(total.intValue())) {
            return isNext ? 8 : 7;
        }
        IntRange intRangeUntil9 = RangesKt___RangesKt.until(7500, 12000);
        if (total != null && intRangeUntil9.contains(total.intValue())) {
            return isNext ? 9 : 8;
        }
        IntRange intRangeUntil10 = RangesKt___RangesKt.until(12000, 15000);
        if (total == null || !intRangeUntil10.contains(total.intValue())) {
            return 10;
        }
        return isNext ? 10 : 9;
    }

    public static /* synthetic */ int getLevel$default(EcoEnvironmentalViewModel ecoEnvironmentalViewModel, Integer num, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return ecoEnvironmentalViewModel.getLevel(num, z);
    }

    private final float getPercent(int level, int total) {
        if (total <= 0) {
            return 0.0f;
        }
        switch (level) {
            case 0:
                return calcPercent(total, 100);
            case 1:
                return calcPercent(total - 100, 450);
            case 2:
                return calcPercent(total - 450, 750);
            case 3:
                return calcPercent(total - 750, 1200);
            case 4:
                return calcPercent(total - 1200, 1800);
            case 5:
                return calcPercent(total - 1800, 3000);
            case 6:
                return calcPercent(total - 3000, CardConstants.ST_THREE_DAY_PASS_DEFAULT_BALANCE);
            case 7:
                return calcPercent(total - CardConstants.ST_THREE_DAY_PASS_DEFAULT_BALANCE, 7500);
            case 8:
                return calcPercent(total - 7500, 12000);
            case 9:
                return calcPercent(total - 12000, 15000);
            default:
                return 0.0f;
        }
    }

    public final void addEnvironmental(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ScopeExtKt.scopeNetLife$default(this, null, new AnonymousClass1(value, null), 1, null);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
        this.request = new EnvironmentalRequest();
    }

    @NotNull
    public final EnvironmentalVO dealData(@NotNull EnvironmentalVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        FitnessLogUtils.d(TAG, "total = " + vo.getTotal());
        int level$default = getLevel$default(this, vo.getTotal(), false, 2, null);
        int level = getLevel(vo.getTotal(), true);
        String des = getDes(level$default);
        int desResId = getDesResId(level$default);
        String des2 = getDes(level);
        Integer total = vo.getTotal();
        float percent = getPercent(level$default, total != null ? total.intValue() : 0);
        int drawableId = getDrawableId(level$default);
        int drawableId2 = getDrawableId(level);
        vo.setNextLevel(Integer.valueOf(level));
        vo.setCurrentLevel(Integer.valueOf(level$default));
        vo.setCurrentLevelDes(des);
        vo.setCurrentLevelDesResId(Integer.valueOf(desResId));
        vo.setNextLevelDes(des2);
        vo.setPercent(Float.valueOf(percent));
        vo.setCurDrawableId(Integer.valueOf(drawableId));
        vo.setNextDrawableId(Integer.valueOf(drawableId2));
        return vo;
    }

    public final void fetchEnvironmental() {
    }

    @NotNull
    public final MutableLiveData<EnvironmentalVO> getEnvironmentalValue() {
        return this.environmentalValue;
    }

    public final void initData(@NotNull EnvironmentalVO environmentalVO) {
        Intrinsics.checkNotNullParameter(environmentalVO, "environmentalVO");
        this.environmentalValue.setValue(dealData(environmentalVO));
    }

    public final void setEnvironmentalValue(@NotNull MutableLiveData<EnvironmentalVO> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.environmentalValue = mutableLiveData;
    }
}
