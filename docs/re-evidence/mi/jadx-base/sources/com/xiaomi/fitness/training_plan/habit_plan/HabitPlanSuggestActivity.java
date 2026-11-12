package com.xiaomi.fitness.training_plan.habit_plan;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestActivity;
import com.xiaomi.fitness.training_plan.util.CalendarUtils;
import com.xiaomi.fitness.training_plan_export.model.HabitPlan;
import com.xiaomi.fitness.training_plan_export.utils.TrainingEventUtils;
import com.xiaomi.fitness.widget.view.RoundImageView;
import com.xiaomi.wearable.yrn.export.YRNHelper;
import com.xiaomi.wearable.yrn.export.YRNHelperExtKt;
import com.xiaomi.wearable.yrn.export.constants.YRNSportConfig;
import defpackage.chi;
import defpackage.cyi;
import defpackage.jvi;
import defpackage.k1j;
import defpackage.nm0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00016B\u0007¢\u0006\u0004\b5\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR&\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\f0\u001ej\b\u0012\u0004\u0012\u00020\f`\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u0010/\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u0014\u00102\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00101¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanSuggestActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanSuggestVM;", "Lnm0;", "", "initData", "()V", "initView", "", "buildDaysOfWeekParams", "()Ljava/lang/String;", "", "", "days", "getWeekDaysStr", "(Ljava/util/List;)Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitSuggestData;", "suggestWeekData", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitSuggestData;", "suggestTimeData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "planDateList", "Ljava/util/ArrayList;", "", "planDistance", "Ljava/lang/Float;", "fromImprove", "Z", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "improveHabitPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "Landroid/view/View$OnClickListener;", "positiveFromInitListener", "Landroid/view/View$OnClickListener;", "negativeFromInitListener", "positiveFromImproveListener", "negativeFromImproveListener", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHabitPlanSuggestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HabitPlanSuggestActivity.kt\ncom/xiaomi/fitness/training_plan/habit_plan/HabitPlanSuggestActivity\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,338:1\n53#2,7:339\n1#3:346\n1872#4,3:347\n1863#4,2:350\n54#5,3:352\n24#5:355\n59#5,6:356\n*S KotlinDebug\n*F\n+ 1 HabitPlanSuggestActivity.kt\ncom/xiaomi/fitness/training_plan/habit_plan/HabitPlanSuggestActivity\n*L\n141#1:339,7\n287#1:347,3\n114#1:350,2\n159#1:352,3\n159#1:355\n159#1:356,6\n*E\n"})
public final class HabitPlanSuggestActivity extends Hilt_HabitPlanSuggestActivity<HabitPlanSuggestVM, nm0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_DAY_OF_WEEKS = "day_of_weeks";

    @NotNull
    private static final String EXTRA_DISTANCE = "distance";

    @NotNull
    private static final String EXTRA_FROM_IMPROVE = "from_improve";

    @NotNull
    private static final String EXTRA_PLAN_ID = "plan_id";

    @NotNull
    private static final String EXTRA_RUNNING_DISTANCE = "running_distance";

    @NotNull
    private static final String EXTRA_RUNNING_PACE_FASTER = "running_pace_faster";

    @NotNull
    private static final String EXTRA_RUNNING_TYPE = "running_type";

    @NotNull
    private static final String TAG = "HabitPlanSuggestActivity";
    private boolean fromImprove;

    @Nullable
    private HabitPlan improveHabitPlan;

    @Nullable
    private Float planDistance;

    @Nullable
    private HabitSuggestData suggestTimeData;

    @Nullable
    private HabitSuggestData suggestWeekData;

    @NotNull
    private ArrayList<Integer> planDateList = new ArrayList<>();

    @NotNull
    private final View.OnClickListener positiveFromInitListener = new View.OnClickListener() { // from class: jhb
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            HabitPlanSuggestActivity.positiveFromInitListener$lambda$8(this.f22803a, view);
        }
    };

    @NotNull
    private final View.OnClickListener negativeFromInitListener = new View.OnClickListener() { // from class: khb
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            HabitPlanSuggestActivity.negativeFromInitListener$lambda$11(this.f23848a, view);
        }
    };

    @NotNull
    private final View.OnClickListener positiveFromImproveListener = new View.OnClickListener() { // from class: lhb
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            HabitPlanSuggestActivity.positiveFromImproveListener$lambda$13(this.f25073a, view);
        }
    };

    @NotNull
    private final View.OnClickListener negativeFromImproveListener = new View.OnClickListener() { // from class: mhb
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            HabitPlanSuggestActivity.negativeFromImproveListener$lambda$15(this.f26181a, view);
        }
    };

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016Jf\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001c2\u0006\u0010\u0013\u001a\u00020\u001428\u0010\u001d\u001a4\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0015\u0012\u0013\u0018\u00010\"¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u000e0\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanSuggestActivity$Companion;", "", "<init>", "()V", "TAG", "", "EXTRA_FROM_IMPROVE", "EXTRA_DAY_OF_WEEKS", "EXTRA_DISTANCE", "EXTRA_PLAN_ID", "EXTRA_RUNNING_TYPE", "EXTRA_RUNNING_DISTANCE", "EXTRA_RUNNING_PACE_FASTER", "launchFromCreate", "", "context", "Landroid/content/Context;", "type", "", "distance", "", "paceFaster", "", "launchFromImprove", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "planId", "", "dayOfWeeks", "", "forResult", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "resultCode", "Landroid/content/Intent;", "data", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launchFromCreate(@NotNull Context context, int type, float distance, boolean paceFaster) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) HabitPlanSuggestActivity.class);
            intent.putExtra(HabitPlanSuggestActivity.EXTRA_RUNNING_TYPE, type);
            intent.putExtra("running_distance", distance);
            intent.putExtra(HabitPlanSuggestActivity.EXTRA_RUNNING_PACE_FASTER, paceFaster);
            context.startActivity(intent);
        }

        public final void launchFromImprove(@NotNull BaseActivity context, long planId, @NotNull List<Integer> dayOfWeeks, float distance, @NotNull Function2<? super Integer, ? super Intent, Unit> forResult) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dayOfWeeks, "dayOfWeeks");
            Intrinsics.checkNotNullParameter(forResult, "forResult");
            Intent intent = new Intent(context, (Class<?>) HabitPlanSuggestActivity.class);
            intent.putExtra(HabitPlanSuggestActivity.EXTRA_FROM_IMPROVE, true);
            intent.putExtra("plan_id", planId);
            intent.putExtra(HabitPlanSuggestActivity.EXTRA_DAY_OF_WEEKS, ListExtKt.toArrayList(dayOfWeeks));
            intent.putExtra("distance", distance);
            context.startForActivityResult(intent, forResult);
        }
    }

    private final String buildDaysOfWeekParams() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : this.planDateList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            sb.append(String.valueOf(((Number) obj).intValue()));
            if (i < this.planDateList.size() - 1) {
                sb.append(",");
            }
            i = i2;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final String getWeekDaysStr(List<Integer> days) {
        if (days.size() >= 7) {
            String string = getString(k1j.V0);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        List<String> listWeeksIntToChinese = CalendarUtils.INSTANCE.weeksIntToChinese(days, ResourceExtKt.getStringArray(this, chi.f5350b));
        switch (days.size()) {
            case 1:
                String string2 = getString(k1j.P0);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(string2, Arrays.copyOf(new Object[]{listWeeksIntToChinese.get(0)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            case 2:
                String string3 = getString(k1j.Q0);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str2 = String.format(string3, Arrays.copyOf(new Object[]{listWeeksIntToChinese.get(0), listWeeksIntToChinese.get(1)}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                return str2;
            case 3:
                String string4 = getString(k1j.R0);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                String str3 = String.format(string4, Arrays.copyOf(new Object[]{listWeeksIntToChinese.get(0), listWeeksIntToChinese.get(1), listWeeksIntToChinese.get(2)}, 3));
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                return str3;
            case 4:
                String string5 = getString(k1j.S0);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                String str4 = String.format(string5, Arrays.copyOf(new Object[]{listWeeksIntToChinese.get(0), listWeeksIntToChinese.get(1), listWeeksIntToChinese.get(2), listWeeksIntToChinese.get(3)}, 4));
                Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                return str4;
            case 5:
                String string6 = getString(k1j.T0);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                String str5 = String.format(string6, Arrays.copyOf(new Object[]{listWeeksIntToChinese.get(0), listWeeksIntToChinese.get(1), listWeeksIntToChinese.get(2), listWeeksIntToChinese.get(3), listWeeksIntToChinese.get(4)}, 5));
                Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                return str5;
            case 6:
                String string7 = getString(k1j.U0);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
                String str6 = String.format(string7, Arrays.copyOf(new Object[]{listWeeksIntToChinese.get(0), listWeeksIntToChinese.get(1), listWeeksIntToChinese.get(2), listWeeksIntToChinese.get(3), listWeeksIntToChinese.get(4), listWeeksIntToChinese.get(5)}, 6));
                Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                return str6;
            default:
                return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        List integerArrayListExtra;
        this.fromImprove = getIntent().getBooleanExtra(EXTRA_FROM_IMPROVE, false);
        ((HabitPlanSuggestVM) getMViewModel()).getSuggestLiveData().observe(this, new HabitPlanSuggestActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hhb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitPlanSuggestActivity.initData$lambda$1(this.f20065a, (HabitPlan) obj);
            }
        }));
        if (this.fromImprove) {
            long longExtra = getIntent().getLongExtra("plan_id", 0L);
            String stringExtra = getIntent().getStringExtra(EXTRA_DAY_OF_WEEKS);
            if (stringExtra == null || stringExtra.length() == 0) {
                integerArrayListExtra = getIntent().getIntegerArrayListExtra(EXTRA_DAY_OF_WEEKS);
            } else {
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
                Gson gsonCreate = gsonBuilder.create();
                Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
                integerArrayListExtra = (ArrayList) gsonCreate.fromJson(stringExtra, new TypeToken<ArrayList<Integer>>() { // from class: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestActivity$initData$dayOfWeeks$1
                }.getType());
            }
            float floatExtra = getIntent().getFloatExtra("distance", 0.0f);
            this.improveHabitPlan = integerArrayListExtra != null ? new HabitPlan(longExtra, integerArrayListExtra, floatExtra) : null;
            MutableLiveData<HabitPlan> suggestLiveData = ((HabitPlanSuggestVM) getMViewModel()).getSuggestLiveData();
            if (integerArrayListExtra == null) {
                integerArrayListExtra = ArraysKt___ArraysKt.toList(new int[]{1, 3, 5});
            }
            suggestLiveData.setValue(new HabitPlan(longExtra, integerArrayListExtra, floatExtra));
        } else {
            ((HabitPlanSuggestVM) getMViewModel()).getHabitSuggest(getIntent().getIntExtra(EXTRA_RUNNING_TYPE, 0), getIntent().getFloatExtra("running_distance", 0.0f), getIntent().getBooleanExtra(EXTRA_RUNNING_PACE_FASTER, false));
        }
        ((HabitPlanSuggestVM) getMViewModel()).getAccountInfo().observe(this, new HabitPlanSuggestActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ihb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitPlanSuggestActivity.initData$lambda$6(this.f21141a, (AccountCoreInfo) obj);
            }
        }));
        ((HabitPlanSuggestVM) getMViewModel()).m620getAccountInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$1(HabitPlanSuggestActivity this$0, HabitPlan habitPlan) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LogExtKt.logi(TAG, "habitPlan{id:" + habitPlan.getId() + ",dayOfWeek size:" + habitPlan.getDayOfWeek().size() + ",distanec:" + habitPlan.getDistance() + "}");
        Iterator<T> it = habitPlan.getDayOfWeek().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (!this$0.planDateList.contains(Integer.valueOf(iIntValue))) {
                this$0.planDateList.add(Integer.valueOf(iIntValue));
            }
        }
        this$0.planDistance = Float.valueOf(habitPlan.getDistance());
        String string = this$0.getString(k1j.Y0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.suggestWeekData = new HabitSuggestData(string, this$0.getWeekDaysStr(habitPlan.getDayOfWeek()), String.valueOf(habitPlan.getDayOfWeek().size()), ResourceExtKt.getQuantityString(this$0, cyi.p, habitPlan.getDayOfWeek().size(), Integer.valueOf(habitPlan.getDayOfWeek().size())));
        String string2 = this$0.getString(k1j.X0);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = this$0.getString(k1j.W0);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        this$0.suggestTimeData = new HabitSuggestData(string2, string3, String.valueOf(habitPlan.getDistance()), ResourceExtKt.getQuantityString(this$0, cyi.q, (int) habitPlan.getDistance(), Float.valueOf(habitPlan.getDistance())));
        ((nm0) this$0.getMBinding()).H.render(this$0.suggestWeekData);
        ((nm0) this$0.getMBinding()).G.render(this$0.suggestTimeData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$6(HabitPlanSuggestActivity this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (accountCoreInfo != null) {
            ((nm0) this$0.getMBinding()).L.setText(!TextUtils.isEmpty(accountCoreInfo.getUserName()) ? accountCoreInfo.getUserName() : "--");
            if (!TextUtils.isEmpty(accountCoreInfo.getAvatarAddress())) {
                RoundImageView userAvatar = ((nm0) this$0.getMBinding()).J;
                Intrinsics.checkNotNullExpressionValue(userAvatar, "userAvatar");
                String avatarAddress = accountCoreInfo.getAvatarAddress();
                ImageLoader imageLoader = Coil.imageLoader(userAvatar.getContext());
                ImageRequest.Builder builderTarget = new ImageRequest.Builder(userAvatar.getContext()).data(avatarAddress).target(userAvatar);
                builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
                imageLoader.enqueue(builderTarget.build());
            }
        } else {
            Logger.i(TAG, "get empty accoun info!!");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((nm0) getMBinding()).I.hideMore();
        ((nm0) getMBinding()).I.hideBack();
        ((nm0) getMBinding()).I.setTitle(k1j.c1);
        if (this.fromImprove) {
            ((nm0) getMBinding()).M.setText(getString(k1j.b1));
            ((nm0) getMBinding()).A.setText(getString(k1j.a1));
            ((nm0) getMBinding()).F.setText(getString(k1j.Z0));
            ((nm0) getMBinding()).A.setOnClickListener(this.positiveFromImproveListener);
            ((nm0) getMBinding()).F.setOnClickListener(this.negativeFromImproveListener);
        } else {
            ((nm0) getMBinding()).A.setOnClickListener(this.positiveFromInitListener);
            ((nm0) getMBinding()).F.setOnClickListener(this.negativeFromInitListener);
        }
        ((nm0) getMBinding()).H.render(this.suggestWeekData);
        ((nm0) getMBinding()).G.render(this.suggestTimeData);
        ((nm0) getMBinding()).L.getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void negativeFromImproveListener$lambda$15(final HabitPlanSuggestActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((HabitPlanSuggestVM) this$0.getMViewModel()).habitImproveReply(false, new Function1() { // from class: fhb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitPlanSuggestActivity.negativeFromImproveListener$lambda$15$lambda$14(this.f17783a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit negativeFromImproveListener$lambda$15$lambda$14(HabitPlanSuggestActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.setResult(-1);
            this$0.finish();
        } else {
            ToastUtil.showToast(this$0.getString(k1j.L0));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void negativeFromInitListener$lambda$11(final HabitPlanSuggestActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) HabitPlanManualActivity.class);
        ResourceExtKt.getStringArray(this$0, chi.f5350b);
        intent.putIntegerArrayListExtra(HabitPlanManualActivity.EXTRA_SELECT_DATE, this$0.planDateList);
        intent.putExtra("distance", this$0.planDistance);
        this$0.startForActivityResult(intent, new Function2() { // from class: dhb
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HabitPlanSuggestActivity.negativeFromInitListener$lambda$11$lambda$10(this.f15529a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit negativeFromInitListener$lambda$11$lambda$10(HabitPlanSuggestActivity this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (intent != null) {
            this$0.planDateList.clear();
            ArrayList<Integer> arrayList = this$0.planDateList;
            ArrayList<Integer> integerArrayListExtra = intent.getIntegerArrayListExtra(HabitPlanManualActivity.EXTRA_SELECT_DATE);
            Intrinsics.checkNotNull(integerArrayListExtra);
            arrayList.addAll(integerArrayListExtra);
            Float f = this$0.planDistance;
            Intrinsics.checkNotNull(f);
            Float fValueOf = Float.valueOf(intent.getFloatExtra("distance", f.floatValue()));
            this$0.planDistance = fValueOf;
            LogExtKt.logi(TAG, "activity result:planDateList:" + this$0.planDateList + ",planDistance:" + fValueOf);
            String string = this$0.getString(k1j.Y0);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this$0.suggestWeekData = new HabitSuggestData(string, this$0.getWeekDaysStr(this$0.planDateList), String.valueOf(this$0.planDateList.size()), ResourceExtKt.getQuantityString(this$0, cyi.p, this$0.planDateList.size(), Integer.valueOf(this$0.planDateList.size())));
            String string2 = this$0.getString(k1j.X0);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = this$0.getString(k1j.W0);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String strValueOf = String.valueOf(this$0.planDistance);
            int i2 = cyi.q;
            Float f2 = this$0.planDistance;
            this$0.suggestTimeData = new HabitSuggestData(string2, string3, strValueOf, ResourceExtKt.getQuantityString(this$0, i2, f2 != null ? (int) f2.floatValue() : 0, this$0.planDistance));
            ((nm0) this$0.getMBinding()).H.render(this$0.suggestWeekData);
            ((nm0) this$0.getMBinding()).G.render(this$0.suggestTimeData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void positiveFromImproveListener$lambda$13(final HabitPlanSuggestActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((HabitPlanSuggestVM) this$0.getMViewModel()).habitImproveReply(true, new Function1() { // from class: ghb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitPlanSuggestActivity.positiveFromImproveListener$lambda$13$lambda$12(this.f18994a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.xiaomi.fitness.baseui.AbsViewModel, dvq] */
    public static final Unit positiveFromImproveListener$lambda$13$lambda$12(HabitPlanSuggestActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.setResult(-1);
            PageState.DefaultImpls.showLoading$default(this$0, k1j.o1, false, 2, null);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this$0.getMViewModel()), null, null, new HabitPlanSuggestActivity$positiveFromImproveListener$1$1$1(this$0, null), 3, null);
        } else {
            ToastUtil.showToast(this$0.getString(k1j.L0));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void positiveFromInitListener$lambda$8(final HabitPlanSuggestActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HabitPlanSuggestVM habitPlanSuggestVM = (HabitPlanSuggestVM) this$0.getMViewModel();
        String strBuildDaysOfWeekParams = this$0.buildDaysOfWeekParams();
        Float f = this$0.planDistance;
        Intrinsics.checkNotNull(f);
        habitPlanSuggestVM.generateHabitPlan(strBuildDaysOfWeekParams, f.floatValue(), new Function1() { // from class: ehb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitPlanSuggestActivity.positiveFromInitListener$lambda$8$lambda$7(this.f16643a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit positiveFromInitListener$lambda$8$lambda$7(HabitPlanSuggestActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            TrainingEventUtils.INSTANCE.trackPlanGenerated(true, 0);
            ToastUtil.showToast(this$0.getString(k1j.F0));
            MainExtKt.showTabWithIndex(this$0, MainTab.INSTANCE.getINDEX_SPORT());
            YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).sendJSEvent(YRNSportConfig.CREATE_GROW_PLAN_SUCCESS, null);
            this$0.finish();
        } else {
            TrainingEventUtils.INSTANCE.trackPlanGenerated(false, 0);
            ToastUtil.showToast(this$0.getString(k1j.E0));
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.x;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.training_plan.habit_plan.Hilt_HabitPlanSuggestActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DisplayUtil.setTranslucentStatusBar(this);
        setActionBarDisplayable(false);
        setTitle(getString(k1j.c1));
        initData();
        initView();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @Nullable KeyEvent event) {
        if (event == null || event.getKeyCode() != 4) {
            return super.onKeyDown(keyCode, event);
        }
        return true;
    }
}
