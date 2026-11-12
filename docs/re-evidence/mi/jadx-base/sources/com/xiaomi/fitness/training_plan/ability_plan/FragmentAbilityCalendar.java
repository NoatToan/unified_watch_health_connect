package com.xiaomi.fitness.training_plan.ability_plan;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.training_plan.ability_plan.FragmentAbilityCalendar;
import com.xiaomi.fitness.training_plan.util.CalendarUtils;
import com.xiaomi.fitness.training_plan.widget.AbilityWeekCourseLayout;
import com.xiaomi.fitness.training_plan_export.adapter.AbilityCourseListAdapter;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlan;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlan;
import defpackage.chi;
import defpackage.eih;
import defpackage.j2a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b9\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001c\u001a\u0004\u0018\u00010\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\"R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010,\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\"R\u0016\u0010-\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\"R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010)R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/training_plan/ability_plan/FragmentAbilityCalendar;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "", "initView", "()V", "initDayTipView", "buildCalendarData", "", "position", "calcWeekPlanByPosition", "(I)V", "", "dateTime", "getCurDateCourse", "(J)V", "weekPosition", "updateCourseList", "(IJ)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lj2a;", "mBinding", "Lj2a;", "currentWeekPosition", "I", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlan;", "abilityPlan", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlan;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;", "preHandledDayPlans", "Ljava/util/ArrayList;", "weekCount", "curShowingWeekPlan", "initWeekPosition", "curDayOfWeek", "Landroid/util/SparseArray;", "Lcom/xiaomi/fitness/training_plan/widget/AbilityWeekCourseLayout;", "weekView", "Landroid/util/SparseArray;", "curDateTime", "J", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "curCourseList", "Lcom/xiaomi/fitness/training_plan_export/adapter/AbilityCourseListAdapter;", "courseListAdapter", "Lcom/xiaomi/fitness/training_plan_export/adapter/AbilityCourseListAdapter;", "<init>", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFragmentAbilityCalendar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentAbilityCalendar.kt\ncom/xiaomi/fitness/training_plan/ability_plan/FragmentAbilityCalendar\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n1863#2:287\n1863#2,2:288\n1864#2:290\n*S KotlinDebug\n*F\n+ 1 FragmentAbilityCalendar.kt\ncom/xiaomi/fitness/training_plan/ability_plan/FragmentAbilityCalendar\n*L\n264#1:287\n267#1:288,2\n264#1:290\n*E\n"})
public final class FragmentAbilityCalendar extends BaseFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DAY_IN_SECOND = 86400;
    private static final int EMPTY_DATETIME = -1;

    @NotNull
    public static final String KEY_PLAN = "ability_plan";
    private static final int MAX_WEEK_DAY = 7;
    private AbilityPlan abilityPlan;
    private AbilityCourseListAdapter courseListAdapter;

    @NotNull
    private final ArrayList<AbilityDayPlanCourse> curCourseList;
    private long curDateTime;
    private int curDayOfWeek;

    @NotNull
    private final ArrayList<AbilityDayPlan> curShowingWeekPlan;
    private int currentWeekPosition;
    private int initWeekPosition;

    @Nullable
    private j2a mBinding;

    @NotNull
    private final ArrayList<AbilityDayPlan> preHandledDayPlans;
    private int weekCount;

    @NotNull
    private final SparseArray<AbilityWeekCourseLayout> weekView;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/training_plan/ability_plan/FragmentAbilityCalendar$Companion;", "", "<init>", "()V", "KEY_PLAN", "", "EMPTY_DATETIME", "", "MAX_WEEK_DAY", "DAY_IN_SECOND", "showAbilityPlanCalendar", "", "containerId", "plan", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlan;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void showAbilityPlanCalendar(int containerId, @NotNull AbilityPlan plan, @Nullable FragmentManager fragmentManager) {
            k kVarO;
            Intrinsics.checkNotNullParameter(plan, "plan");
            Bundle bundle = new Bundle();
            bundle.putSerializable(FragmentAbilityCalendar.KEY_PLAN, plan);
            if (fragmentManager != null) {
                try {
                    kVarO = fragmentManager.o();
                } catch (Exception e) {
                    LogExtKt.loge(BaseFragment.TAG, "showAbilityCalendar exception " + e.getMessage());
                    return;
                }
            } else {
                kVarO = null;
            }
            Object objNewInstance = FragmentAbilityCalendar.class.newInstance();
            ((FragmentAbilityCalendar) objNewInstance).setArguments(bundle);
            FragmentAbilityCalendar fragmentAbilityCalendar = (FragmentAbilityCalendar) objNewInstance;
            if (kVarO != null) {
                kVarO.x(containerId, fragmentAbilityCalendar, "FragmentAbilityCalendar");
            }
            if (kVarO != null) {
                kVarO.m();
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.ability_plan.FragmentAbilityCalendar$initView$1, reason: invalid class name */
    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"com/xiaomi/fitness/training_plan/ability_plan/FragmentAbilityCalendar$initView$1", "Leih;", "", "getCount", "()I", "Landroid/view/View;", "view", "", "obj", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "position", "instantiateItem", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "", "destroyItem", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends eih {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit instantiateItem$lambda$1(int i, FragmentAbilityCalendar this$0, int i2, long j) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (i == this$0.currentWeekPosition) {
                this$0.curDayOfWeek = i2;
                this$0.curDateTime = j;
                this$0.updateCourseList(i, this$0.curDateTime);
            }
            return Unit.INSTANCE;
        }

        @Override // defpackage.eih
        public void destroyItem(ViewGroup container, int position, Object obj) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(obj, "obj");
            if (!(obj instanceof View)) {
                super.destroyItem(container, position, obj);
            } else {
                container.removeView((View) obj);
                FragmentAbilityCalendar.this.weekView.remove(position);
            }
        }

        @Override // defpackage.eih
        public int getCount() {
            return FragmentAbilityCalendar.this.weekCount;
        }

        @Override // defpackage.eih
        public Object instantiateItem(ViewGroup container, final int position) {
            Intrinsics.checkNotNullParameter(container, "container");
            FragmentAbilityCalendar.this.calcWeekPlanByPosition(position);
            Context context = FragmentAbilityCalendar.this.getContext();
            Intrinsics.checkNotNull(context);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(FragmentAbilityCalendar.this.curShowingWeekPlan);
            int i = FragmentAbilityCalendar.this.curDayOfWeek;
            final FragmentAbilityCalendar fragmentAbilityCalendar = FragmentAbilityCalendar.this;
            AbilityWeekCourseLayout abilityWeekCourseLayout = new AbilityWeekCourseLayout(context, arrayList, position, i, new Function2() { // from class: i2a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FragmentAbilityCalendar.AnonymousClass1.instantiateItem$lambda$1(position, fragmentAbilityCalendar, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                }
            });
            container.addView(abilityWeekCourseLayout);
            FragmentAbilityCalendar.this.weekView.put(position, abilityWeekCourseLayout);
            return abilityWeekCourseLayout;
        }

        @Override // defpackage.eih
        public boolean isViewFromObject(View view, Object obj) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(obj, "obj");
            return Intrinsics.areEqual(view, obj);
        }
    }

    public FragmentAbilityCalendar() {
        super(0, 1, null);
        this.currentWeekPosition = -1;
        this.preHandledDayPlans = new ArrayList<>();
        this.curShowingWeekPlan = new ArrayList<>();
        this.initWeekPosition = -1;
        this.curDayOfWeek = -1;
        this.weekView = new SparseArray<>();
        this.curCourseList = new ArrayList<>();
    }

    private final void buildCalendarData() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable(KEY_PLAN) : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan_export.model.AbilityPlan");
        AbilityPlan abilityPlan = (AbilityPlan) serializable;
        this.abilityPlan = abilityPlan;
        if (abilityPlan == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abilityPlan");
            abilityPlan = null;
        }
        AbilityDayPlan abilityDayPlan = (AbilityDayPlan) CollectionsKt___CollectionsKt.first((List) abilityPlan.getPlanCourseList());
        AbilityPlan abilityPlan2 = this.abilityPlan;
        if (abilityPlan2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abilityPlan");
            abilityPlan2 = null;
        }
        AbilityDayPlan abilityDayPlan2 = (AbilityDayPlan) CollectionsKt___CollectionsKt.last((List) abilityPlan2.getPlanCourseList());
        CalendarUtils calendarUtils = CalendarUtils.INSTANCE;
        long j = 1000;
        this.weekCount = calendarUtils.calcWeekCount(new Date(abilityDayPlan.getDate() * j), new Date(abilityDayPlan2.getDate() * j));
        int iCalcDayOfWeek = calendarUtils.calcDayOfWeek(new Date(abilityDayPlan.getDate() * j));
        int iCalcDayOfWeek2 = calendarUtils.calcDayOfWeek(new Date(abilityDayPlan2.getDate() * j));
        if (iCalcDayOfWeek != -1 && iCalcDayOfWeek2 != -1) {
            int i = 86400;
            if (iCalcDayOfWeek != 1) {
                int i2 = iCalcDayOfWeek - 1;
                while (i2 > 0) {
                    this.preHandledDayPlans.add(new AbilityDayPlan(true, CollectionsKt__CollectionsKt.emptyList(), abilityDayPlan.getDate() - ((long) (i2 * i)), iCalcDayOfWeek - i2, 0L, true, 16, null));
                    i2--;
                    i = 86400;
                }
            }
            ArrayList<AbilityDayPlan> arrayList = this.preHandledDayPlans;
            AbilityPlan abilityPlan3 = this.abilityPlan;
            if (abilityPlan3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("abilityPlan");
                abilityPlan3 = null;
            }
            arrayList.addAll(abilityPlan3.getPlanCourseList());
            if (iCalcDayOfWeek2 != 7) {
                int i3 = 7 - iCalcDayOfWeek2;
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = i4 + 1;
                    this.preHandledDayPlans.add(new AbilityDayPlan(true, CollectionsKt__CollectionsKt.emptyList(), abilityDayPlan2.getDate() + ((long) (i5 * 86400)), i4 + iCalcDayOfWeek2 + 1, 0L, true, 16, null));
                    i4 = i5;
                }
            }
        }
        AbilityDayPlan abilityDayPlan3 = (AbilityDayPlan) CollectionsKt___CollectionsKt.first((List) this.preHandledDayPlans);
        CalendarUtils calendarUtils2 = CalendarUtils.INSTANCE;
        Integer numCalcWeekDelta = calendarUtils2.calcWeekDelta(new Date(), new Date(abilityDayPlan3.getDate() * j));
        this.curDayOfWeek = (numCalcWeekDelta == null || numCalcWeekDelta.intValue() > 0) ? 1 : calendarUtils2.calcCurDayOfWeek();
        int iCalcWeekCount = calendarUtils2.calcWeekCount(new Date(abilityDayPlan3.getDate() * j), new Date()) - 1;
        this.initWeekPosition = iCalcWeekCount;
        if (iCalcWeekCount < 0) {
            this.initWeekPosition = 0;
        }
        int i6 = this.initWeekPosition;
        int i7 = this.weekCount;
        if (i6 > i7 - 1) {
            this.initWeekPosition = i7 - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calcWeekPlanByPosition(int position) {
        this.curShowingWeekPlan.clear();
        int i = (position + 1) * 7;
        int i2 = i - 1;
        int i3 = i - 7;
        if (i3 > i2) {
            return;
        }
        while (true) {
            this.curShowingWeekPlan.add(this.preHandledDayPlans.get(i3));
            if (i3 == i2) {
                return;
            } else {
                i3++;
            }
        }
    }

    private final void getCurDateCourse(long dateTime) {
        List<AbilityDayPlanCourse> courseList;
        this.curCourseList.clear();
        for (AbilityDayPlan abilityDayPlan : this.curShowingWeekPlan) {
            if (abilityDayPlan.getDate() == dateTime && !abilityDayPlan.isRestDay() && (courseList = abilityDayPlan.getCourseList()) != null) {
                for (AbilityDayPlanCourse abilityDayPlanCourse : courseList) {
                    abilityDayPlanCourse.setDate(dateTime);
                    AbilityPlan abilityPlan = this.abilityPlan;
                    if (abilityPlan == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("abilityPlan");
                        abilityPlan = null;
                    }
                    abilityDayPlanCourse.setPlanId(abilityPlan.getPlanId());
                    this.curCourseList.add(abilityDayPlanCourse);
                }
            }
        }
    }

    private final void initDayTipView() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String[] stringArray = ResourceExtKt.getStringArray(contextRequireContext, chi.f5350b);
        j2a j2aVar = this.mBinding;
        if (j2aVar != null && (textView7 = j2aVar.C) != null) {
            textView7.setText(stringArray[0]);
        }
        j2a j2aVar2 = this.mBinding;
        if (j2aVar2 != null && (textView6 = j2aVar2.I) != null) {
            textView6.setText(stringArray[1]);
        }
        j2a j2aVar3 = this.mBinding;
        if (j2aVar3 != null && (textView5 = j2aVar3.J) != null) {
            textView5.setText(stringArray[2]);
        }
        j2a j2aVar4 = this.mBinding;
        if (j2aVar4 != null && (textView4 = j2aVar4.G) != null) {
            textView4.setText(stringArray[3]);
        }
        j2a j2aVar5 = this.mBinding;
        if (j2aVar5 != null && (textView3 = j2aVar5.B) != null) {
            textView3.setText(stringArray[4]);
        }
        j2a j2aVar6 = this.mBinding;
        if (j2aVar6 != null && (textView2 = j2aVar6.E) != null) {
            textView2.setText(stringArray[5]);
        }
        j2a j2aVar7 = this.mBinding;
        if (j2aVar7 == null || (textView = j2aVar7.F) == null) {
            return;
        }
        textView.setText(stringArray[6]);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void initView() {
        ViewPager viewPager;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView.o linearLayoutManager;
        RecyclerView recyclerView3;
        ViewPager viewPager2;
        ViewPager viewPager3;
        initDayTipView();
        j2a j2aVar = this.mBinding;
        if (j2aVar != null && (viewPager3 = j2aVar.K) != null) {
            viewPager3.setAdapter(new AnonymousClass1());
        }
        j2a j2aVar2 = this.mBinding;
        if (j2aVar2 != null && (viewPager2 = j2aVar2.K) != null) {
            viewPager2.addOnPageChangeListener(new ViewPager.i() { // from class: com.xiaomi.fitness.training_plan.ability_plan.FragmentAbilityCalendar.initView.2
                @Override // androidx.viewpager.widget.ViewPager.i
                public void onPageScrollStateChanged(int state) {
                }

                @Override // androidx.viewpager.widget.ViewPager.i
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                }

                @Override // androidx.viewpager.widget.ViewPager.i
                public void onPageSelected(int position) {
                    FragmentAbilityCalendar.this.currentWeekPosition = position;
                    AbilityWeekCourseLayout abilityWeekCourseLayout = (AbilityWeekCourseLayout) FragmentAbilityCalendar.this.weekView.get(position);
                    if (abilityWeekCourseLayout != null) {
                        abilityWeekCourseLayout.updateDayOfWeek(FragmentAbilityCalendar.this.curDayOfWeek);
                    }
                }
            });
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNull(contextRequireContext, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) contextRequireContext;
        AbilityPlan abilityPlan = this.abilityPlan;
        if (abilityPlan == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abilityPlan");
            abilityPlan = null;
        }
        AbilityCourseListAdapter abilityCourseListAdapter = new AbilityCourseListAdapter(fragmentActivity, abilityPlan.getPlanId(), this.curCourseList, false, false, 24, null);
        this.courseListAdapter = abilityCourseListAdapter;
        j2a j2aVar3 = this.mBinding;
        if (j2aVar3 != null && (recyclerView3 = j2aVar3.A) != null) {
            recyclerView3.setAdapter(abilityCourseListAdapter);
        }
        j2a j2aVar4 = this.mBinding;
        if (j2aVar4 != null && (recyclerView2 = j2aVar4.A) != null) {
            if (UIUtils.INSTANCE.isTablet()) {
                GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
                gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.training_plan.ability_plan.FragmentAbilityCalendar$initView$3$1
                    @Override // androidx.recyclerview.widget.GridLayoutManager.b
                    public int getSpanSize(int position) {
                        return 1;
                    }
                });
                linearLayoutManager = gridLayoutManager;
            } else {
                linearLayoutManager = new LinearLayoutManager(getContext());
            }
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        j2a j2aVar5 = this.mBinding;
        if (j2aVar5 != null && (recyclerView = j2aVar5.A) != null) {
            recyclerView.addItemDecoration(new RecyclerView.n() { // from class: com.xiaomi.fitness.training_plan.ability_plan.FragmentAbilityCalendar.initView.4
                @Override // androidx.recyclerview.widget.RecyclerView.n
                public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
                    Intrinsics.checkNotNullParameter(outRect, "outRect");
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(state, "state");
                    outRect.bottom = ExtUtilsKt.getDp(12);
                    outRect.right = ExtUtilsKt.getDp(12);
                }
            });
        }
        int i = this.initWeekPosition;
        this.currentWeekPosition = i;
        j2a j2aVar6 = this.mBinding;
        if (j2aVar6 == null || (viewPager = j2aVar6.K) == null) {
            return;
        }
        viewPager.setCurrentItem(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCourseList(int weekPosition, long dateTime) {
        TextView textView;
        RecyclerView recyclerView;
        calcWeekPlanByPosition(weekPosition);
        getCurDateCourse(dateTime);
        AbilityCourseListAdapter abilityCourseListAdapter = this.courseListAdapter;
        if (abilityCourseListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("courseListAdapter");
            abilityCourseListAdapter = null;
        }
        abilityCourseListAdapter.notifyDataSetChanged();
        j2a j2aVar = this.mBinding;
        if (j2aVar != null && (recyclerView = j2aVar.A) != null) {
            recyclerView.setVisibility(this.curCourseList.isEmpty() ? 8 : 0);
        }
        j2a j2aVar2 = this.mBinding;
        if (j2aVar2 == null || (textView = j2aVar2.D) == null) {
            return;
        }
        textView.setVisibility(this.curCourseList.isEmpty() ? 0 : 8);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this.mBinding = j2a.A0(inflater, container, false);
        buildCalendarData();
        if (isAdded() && !isDetached()) {
            initView();
        }
        j2a j2aVar = this.mBinding;
        if (j2aVar != null) {
            return j2aVar.getRoot();
        }
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
    }
}
