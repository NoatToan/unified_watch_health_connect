package com.xiaomi.fitness.common.calendar;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.calendar.BaseCalendarFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.util.HealthBundleKey;
import defpackage.eri;
import defpackage.l2c;
import defpackage.v93;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 X2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002WXB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u00020:H&J\u001a\u0010>\u001a\u00020:2\u0006\u0010?\u001a\u00020@2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010A\u001a\u00020:2\u0006\u0010?\u001a\u00020@H\u0004J\b\u0010B\u001a\u00020:H\u0002J\b\u0010C\u001a\u00020:H\u0002J\u0010\u0010D\u001a\u00020$2\u0006\u0010E\u001a\u00020$H\u0002J\u0010\u0010F\u001a\u00020:2\u0006\u0010G\u001a\u00020\u0003H\u0016J\u000e\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020/J\b\u0010J\u001a\u00020:H&J\u0010\u0010K\u001a\u00020:2\u0006\u0010L\u001a\u00020MH\u0016J\u0017\u0010N\u001a\u00020:2\b\u0010O\u001a\u0004\u0018\u00010PH\u0007¢\u0006\u0002\bQJ\b\u0010V\u001a\u00020:H&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u00106\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00107\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\u001c\u0010R\u001a\u0004\u0018\u00010PX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bN\u0010U¨\u0006Y"}, d2 = {"Lcom/xiaomi/fitness/common/calendar/BaseCalendarFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Landroidx/lifecycle/Observer;", "", "<init>", "()V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "mSelectDate", "Lorg/joda/time/LocalDate;", "getMSelectDate", "()Lorg/joda/time/LocalDate;", "setMSelectDate", "(Lorg/joda/time/LocalDate;)V", "fragmentName", "", "getFragmentName", "()Ljava/lang/String;", "setFragmentName", "(Ljava/lang/String;)V", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "Ljava/util/Calendar;", "viewModel", "Lcom/xiaomi/fitness/common/calendar/CalendarViewModel;", "getViewModel", "()Lcom/xiaomi/fitness/common/calendar/CalendarViewModel;", "setViewModel", "(Lcom/xiaomi/fitness/common/calendar/CalendarViewModel;)V", "mDataList", "Ljava/util/LinkedList;", "", "getMDataList", "()Ljava/util/LinkedList;", "now", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "healthType", "", "isThreeCircle", "fromActivity", "getFromActivity", "()Z", "setFromActivity", "(Z)V", "dataComeFrom", "isShowFuture", "setShowFuture", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "bindData", "onViewCreated", "view", "Landroid/view/View;", "initView", "updateDotData", "updateTargetData", "getNextStart", "sec", "onChanged", "changed", "getTimeFromPos", "pos", "initRecycler", "onAttach", "context", "Landroid/content/Context;", "setOnCalendarSelectChangedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/common/calendar/BaseCalendarFragment$OnCalendarSelectChangedListener;", "setOnCalendarSelectChangedListener1", "onCalendarSelectChangedListener", "getOnCalendarSelectChangedListener", "()Lcom/xiaomi/fitness/common/calendar/BaseCalendarFragment$OnCalendarSelectChangedListener;", "(Lcom/xiaomi/fitness/common/calendar/BaseCalendarFragment$OnCalendarSelectChangedListener;)V", "scrollToCurrent", "OnCalendarSelectChangedListener", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseCalendarFragment extends BaseFragment implements Observer<Boolean> {
    public static final int INVALID_TYPE = -1;

    @NotNull
    public static final String TAG = "BaseCalendarFragment";
    private final Calendar calendar;
    private int dataComeFrom;

    @Nullable
    private String fragmentName;
    private boolean fromActivity;
    private int healthType;
    private boolean isShowFuture;
    private boolean isThreeCircle;

    @Nullable
    private LinearLayoutManager layoutManager;

    @NotNull
    private final LinkedList<Long> mDataList;

    @Nullable
    private LocalDate mSelectDate;
    private final long now;

    @Nullable
    private OnCalendarSelectChangedListener onCalendarSelectChangedListener;

    @Nullable
    private RecyclerView recyclerView;
    protected CalendarViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/common/calendar/BaseCalendarFragment$OnCalendarSelectChangedListener;", "", "onDayChanged", "", "localDate", "Lorg/joda/time/LocalDate;", "onWeekChanged", "onMonthChanged", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnCalendarSelectChangedListener {
        void onDayChanged(@Nullable LocalDate localDate);

        void onMonthChanged(@Nullable LocalDate localDate);

        void onWeekChanged(@Nullable LocalDate localDate);
    }

    public BaseCalendarFragment() {
        super(0, 1, null);
        this.calendar = Calendar.getInstance();
        this.mDataList = new LinkedList<>();
        this.now = System.currentTimeMillis() / 1000;
        this.healthType = -1;
    }

    private final long getNextStart(long sec) {
        this.calendar.setTimeInMillis(sec * 1000);
        int i = this instanceof CalendarMonthFragment ? 6 : 5;
        Calendar calendar = this.calendar;
        calendar.add(i, calendar.getActualMaximum(i));
        return this.calendar.getTimeInMillis() / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(BaseCalendarFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateTargetData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(BaseCalendarFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateDotData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDotData() {
        if (isInvalid() || this.dataComeFrom == 1) {
            return;
        }
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        Intrinsics.checkNotNull(linearLayoutManager);
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        LinearLayoutManager linearLayoutManager2 = this.layoutManager;
        Intrinsics.checkNotNull(linearLayoutManager2);
        int iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
        if (iFindLastVisibleItemPosition < iFindFirstVisibleItemPosition || iFindFirstVisibleItemPosition < 0) {
            return;
        }
        long timeFromPos = getTimeFromPos(iFindFirstVisibleItemPosition);
        int i = iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition;
        int i2 = 0;
        long j = timeFromPos;
        while (i2 <= i && j < this.now) {
            long nextStart = getNextStart(j);
            if (this instanceof CalendarMonthFragment) {
                HomeDataType homeDataTypeE = l2c.e(this.healthType);
                Intrinsics.checkNotNullExpressionValue(homeDataTypeE, "mapHomeDataType(...)");
                CalendarViewModel viewModel = getViewModel();
                LifecycleOwner viewLifecycleOwner = ((CalendarMonthFragment) this).getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                viewModel.reqMonthsData(j, nextStart, homeDataTypeE, viewLifecycleOwner);
            } else {
                HomeDataType homeDataTypeE2 = l2c.e(this.healthType);
                Intrinsics.checkNotNullExpressionValue(homeDataTypeE2, "mapHomeDataType(...)");
                CalendarViewModel viewModel2 = getViewModel();
                LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                viewModel2.reqDaysData(j, nextStart, homeDataTypeE2, viewLifecycleOwner2);
            }
            i2++;
            j = nextStart;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTargetData() {
        if (isInvalid() || this.dataComeFrom == 1) {
            return;
        }
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        Intrinsics.checkNotNull(linearLayoutManager);
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        LinearLayoutManager linearLayoutManager2 = this.layoutManager;
        Intrinsics.checkNotNull(linearLayoutManager2);
        int iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
        if (iFindLastVisibleItemPosition < iFindFirstVisibleItemPosition || iFindFirstVisibleItemPosition < 0) {
            return;
        }
        long timeFromPos = getTimeFromPos(iFindFirstVisibleItemPosition);
        int i = iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition;
        int i2 = 0;
        while (i2 <= i) {
            long nextStart = getNextStart(timeFromPos);
            if (getViewModel().getCircleModelMap().get(Long.valueOf(timeFromPos)) == null) {
                getViewModel().triggerFetchRainbowReportList(timeFromPos, nextStart).observe(getViewLifecycleOwner(), new BaseCalendarFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: n22
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return BaseCalendarFragment.updateTargetData$lambda$2(this.f27464a, (List) obj);
                    }
                }));
            }
            i2++;
            timeFromPos = nextStart;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateTargetData$lambda$2(BaseCalendarFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CalendarViewModel viewModel = this$0.getViewModel();
        Intrinsics.checkNotNull(list);
        MonthReportModel monthReportModelCreateReportMap = viewModel.createReportMap(list);
        if (monthReportModelCreateReportMap.getTimeFirstDay() != -1) {
            CalendarViewModel viewModel2 = this$0.getViewModel();
            LifecycleOwner viewLifecycleOwner = this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            viewModel2.createMonthReportList(monthReportModelCreateReportMap, viewLifecycleOwner);
        }
        return Unit.INSTANCE;
    }

    public abstract void bindData();

    @Nullable
    public final String getFragmentName() {
        return this.fragmentName;
    }

    public final boolean getFromActivity() {
        return this.fromActivity;
    }

    @Nullable
    public final LinearLayoutManager getLayoutManager() {
        return this.layoutManager;
    }

    @NotNull
    public final LinkedList<Long> getMDataList() {
        return this.mDataList;
    }

    @Nullable
    public final LocalDate getMSelectDate() {
        return this.mSelectDate;
    }

    @Nullable
    public final OnCalendarSelectChangedListener getOnCalendarSelectChangedListener() {
        return this.onCalendarSelectChangedListener;
    }

    @Nullable
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public final long getTimeFromPos(int pos) {
        Long l = this.mDataList.get(pos);
        Intrinsics.checkNotNullExpressionValue(l, "get(...)");
        return l.longValue();
    }

    @NotNull
    public final CalendarViewModel getViewModel() {
        CalendarViewModel calendarViewModel = this.viewModel;
        if (calendarViewModel != null) {
            return calendarViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public abstract void initRecycler();

    public final void initView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.recyclerView = (RecyclerView) view.findViewById(eri.pd);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity());
        this.layoutManager = linearLayoutManager;
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        v93 v93Var = new v93();
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(v93Var);
        }
        initRecycler();
        if (this.healthType != -1) {
            RecyclerView recyclerView3 = this.recyclerView;
            if (recyclerView3 != null) {
                recyclerView3.addOnScrollListener(new RecyclerView.s() { // from class: com.xiaomi.fitness.common.calendar.BaseCalendarFragment.initView.1
                    @Override // androidx.recyclerview.widget.RecyclerView.s
                    public void onScrollStateChanged(RecyclerView recyclerView4, int newState) {
                        Intrinsics.checkNotNullParameter(recyclerView4, "recyclerView");
                        if (newState == 0) {
                            if (BaseCalendarFragment.this.isThreeCircle) {
                                BaseCalendarFragment.this.updateTargetData();
                            } else {
                                BaseCalendarFragment.this.updateDotData();
                            }
                        }
                    }
                });
            }
            if (this.isThreeCircle) {
                RecyclerView recyclerView4 = this.recyclerView;
                if (recyclerView4 != null) {
                    recyclerView4.post(new Runnable() { // from class: o22
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseCalendarFragment.initView$lambda$0(this.f28661a);
                        }
                    });
                    return;
                }
                return;
            }
            RecyclerView recyclerView5 = this.recyclerView;
            if (recyclerView5 != null) {
                recyclerView5.post(new Runnable() { // from class: p22
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseCalendarFragment.initView$lambda$1(this.f29926a);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: isShowFuture, reason: from getter */
    public final boolean getIsShowFuture() {
        return this.isShowFuture;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mSelectDate = (LocalDate) arguments.getSerializable("calendar_date");
            this.fragmentName = arguments.getString("intentFragment");
            this.dataComeFrom = arguments.getInt("data_come_from");
            this.isThreeCircle = arguments.getBoolean(HealthBundleKey.BUNDLE_PARAMS_CALENDAR_THREE_CIRCLE_FLAG, false);
        }
    }

    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Boolean bool) {
        onChanged(bool.booleanValue());
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i = arguments.getInt("sport_type", -1);
            this.healthType = i;
            Logger.d(TAG, "onCreate: sportType = " + i);
            this.fromActivity = arguments.getBoolean("from_activity");
            this.isShowFuture = arguments.getBoolean("calendar_show_future");
            this.dataComeFrom = arguments.getInt("data_come_from", 0);
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        setViewModel((CalendarViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(CalendarViewModel.class));
        getViewModel().getLiveData().observe(this, this);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initView(view);
    }

    public abstract void scrollToCurrent();

    public final void setFragmentName(@Nullable String str) {
        this.fragmentName = str;
    }

    public final void setFromActivity(boolean z) {
        this.fromActivity = z;
    }

    public final void setLayoutManager(@Nullable LinearLayoutManager linearLayoutManager) {
        this.layoutManager = linearLayoutManager;
    }

    public final void setMSelectDate(@Nullable LocalDate localDate) {
        this.mSelectDate = localDate;
    }

    public final void setOnCalendarSelectChangedListener(@Nullable OnCalendarSelectChangedListener onCalendarSelectChangedListener) {
        this.onCalendarSelectChangedListener = onCalendarSelectChangedListener;
    }

    @JvmName(name = "setOnCalendarSelectChangedListener1")
    public final void setOnCalendarSelectChangedListener1(@Nullable OnCalendarSelectChangedListener listener) {
        this.onCalendarSelectChangedListener = listener;
    }

    public final void setRecyclerView(@Nullable RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public final void setShowFuture(boolean z) {
        this.isShowFuture = z;
    }

    public final void setViewModel(@NotNull CalendarViewModel calendarViewModel) {
        Intrinsics.checkNotNullParameter(calendarViewModel, "<set-?>");
        this.viewModel = calendarViewModel;
    }

    public void onChanged(boolean changed) {
        if (changed) {
            RecyclerView recyclerView = this.recyclerView;
            Intrinsics.checkNotNull(recyclerView);
            if (recyclerView.getAdapter() != null) {
                RecyclerView recyclerView2 = this.recyclerView;
                Intrinsics.checkNotNull(recyclerView2);
                RecyclerView.Adapter adapter = recyclerView2.getAdapter();
                Intrinsics.checkNotNull(adapter);
                adapter.notifyDataSetChanged();
            }
        }
    }
}
