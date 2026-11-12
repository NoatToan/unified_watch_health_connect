package com.huami.femalehealth.uilib.ui.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Group;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.chenenyu.router.annotation.Route;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.calendarview.Calendar;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.dto.Degree;
import com.huami.femalehealth.logiclib.dto.SymptomType;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.logiclib.manager.FHUploadPermissionManager;
import com.huami.femalehealth.logiclib.nav.ExternalNavigator;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.femalehealth.logiclib.vo.SymptomTotalVo;
import com.huami.femalehealth.logiclib.vo.SymptomVo;
import com.huami.femalehealth.uilib.FHDoMainBridge;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.adapter.HistoryCardNavAdapter;
import com.huami.femalehealth.uilib.adapter.TrainingAdapter;
import com.huami.femalehealth.uilib.helper.ChartHelper;
import com.huami.femalehealth.uilib.helper.FemaleAppNoticeHelper;
import com.huami.femalehealth.uilib.koin.ComponentCallbackExtKt;
import com.huami.femalehealth.uilib.koin.ScopesAndQualifersKt;
import com.huami.femalehealth.uilib.ui.activity.FemaleHealthActivity;
import com.huami.femalehealth.uilib.viewmodel.ChartViewPagerAdapter;
import com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel;
import com.huami.femalehealth.uilib.viewmodel.TrainingViewModel;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.femalehealth.uilib.widget.RTLTextView;
import com.huami.femalehealth.uilib.widget.TodayStatusCardView;
import com.huami.femalehealth.uilib.widget.calendar.FemaleHealthCalendarView;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.PeriodStyle;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.training.domain.model.TrainingVo;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Route({"fh/FemaleHealthActivity"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u0007¢\u0006\u0004\b=\u0010>J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\u001b\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0012\u0010\u0017\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\u001a\u0010\u001b\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\tH\u0016J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010)\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010.\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-R\u001d\u00103\u001a\u00020/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u00102R\u001d\u00108\u001a\u0002048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006@"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/FemaleHealthActivity;", "Lcom/huami/femalehealth/uilib/ui/activity/FHBaseTitleActivity;", "Lcom/huami/femalehealth/uilib/widget/calendar/FemaleHealthCalendarView$OnCalendarListener;", "", "initObservers", "K", "initView", "N", "x", "", "expand", "V", "(Ljava/lang/Boolean;)V", "Lcom/huami/femalehealth/logiclib/vo/SymptomTotalVo;", "symptomTotalVo", "R", "Q", "P", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "dateTriple", ExifInterface.LATITUDE_SOUTH, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/calendarview/Calendar;", "calendar", "isClick", "onCalendarSelect", "", "year", "month", "onMonthChange", "Lcom/huami/femalehealth/uilib/viewmodel/ChartViewPagerAdapter;", "a", "Lcom/huami/femalehealth/uilib/viewmodel/ChartViewPagerAdapter;", "adapter", "Lcom/huami/femalehealth/uilib/viewmodel/FemaleHealthViewModel;", "b", "Lkotlin/Lazy;", "w", "()Lcom/huami/femalehealth/uilib/viewmodel/FemaleHealthViewModel;", "viewModel", "Lcom/huami/femalehealth/uilib/viewmodel/TrainingViewModel;", "c", "v", "()Lcom/huami/femalehealth/uilib/viewmodel/TrainingViewModel;", "trainingVM", "Lcom/huami/femalehealth/logiclib/nav/ExternalNavigator;", GoogleApiAvailabilityLight.a, "t", "()Lcom/huami/femalehealth/logiclib/nav/ExternalNavigator;", "navigator", "Lcom/huami/femalehealth/uilib/helper/FemaleAppNoticeHelper;", "e", "u", "()Lcom/huami/femalehealth/uilib/helper/FemaleAppNoticeHelper;", "noticeHelper", "Lcom/huami/femalehealth/uilib/adapter/TrainingAdapter;", "f", "Lcom/huami/femalehealth/uilib/adapter/TrainingAdapter;", "trainingAdapter", "<init>", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class FemaleHealthActivity extends FHBaseTitleActivity implements FemaleHealthCalendarView.OnCalendarListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "FemaleHealthActivity";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private ChartViewPagerAdapter adapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy trainingVM;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy noticeHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private TrainingAdapter trainingAdapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/FemaleHealthActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "start", "startNewTask", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) FemaleHealthActivity.class));
        }

        public final void startNewTask(@NotNull Context context) {
            Intent intent = new Intent(context, (Class<?>) FemaleHealthActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "", "i", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<View, Integer, Unit> {
        public a() {
            super(2);
        }

        public final void a(@NotNull View view, int i) {
            ((ViewPager) FemaleHealthActivity.this.findViewById(R.id.vp_history_chart)).setCurrentItem(i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num) {
            a(view, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Triple<Degree, Degree, Degree> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Triple<? extends Degree, ? extends Degree, ? extends Degree> triple) {
            super(0);
            this.a = triple;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("设置卡片状态:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/domain/model/TrainingVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<TrainingVo, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull TrainingVo trainingVo) {
            FemaleHealthActivity.this.t().navigateToCourseDetail(FemaleHealthActivity.this, String.valueOf(trainingVo.getTrainingId()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TrainingVo trainingVo) {
            a(trainingVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/calendarview/Calendar;", "it", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Calendar, CalendarPeriodStyle> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CalendarPeriodStyle invoke(@NotNull Calendar calendar) {
            return FemaleHealthViewModel.calRenderStyle$default(FemaleHealthActivity.this.w(), calendar, false, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function0<Unit> {
        public e(FemaleHealthActivity femaleHealthActivity) {
            super(0, femaleHealthActivity, FemaleHealthActivity.class, "onPredictionClick", "onPredictionClick()V", 0);
        }

        public final void a() {
            ((FemaleHealthActivity) this.receiver).Q();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class f extends FunctionReferenceImpl implements Function0<Unit> {
        public f(FemaleHealthActivity femaleHealthActivity) {
            super(0, femaleHealthActivity, FemaleHealthActivity.class, "onEditClick", "onEditClick()V", 0);
        }

        public final void a() {
            ((FemaleHealthActivity) this.receiver).P();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Calendar a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Calendar calendar, boolean z) {
            super(0);
            this.a = calendar;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onCalendarSelect:" + this.a + " isClick -> " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onPredictionClick";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ SymptomTotalVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(SymptomTotalVo symptomTotalVo) {
            super(0);
            this.a = symptomTotalVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("refreshChart, map=");
            SymptomTotalVo symptomTotalVo = this.a;
            sb.append(symptomTotalVo == null ? null : symptomTotalVo.getMap());
            sb.append(", start=");
            SymptomTotalVo symptomTotalVo2 = this.a;
            sb.append(symptomTotalVo2 == null ? null : symptomTotalVo2.getStart());
            sb.append(", end=");
            SymptomTotalVo symptomTotalVo3 = this.a;
            sb.append(symptomTotalVo3 != null ? symptomTotalVo3.getEnd() : null);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.ui.activity.FemaleHealthActivity$refreshChart$2$1", f = "FemaleHealthActivity.kt", i = {}, l = {344}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Map<SymptomType, List<SymptomVo>> b;
        public final /* synthetic */ SymptomTotalVo c;
        public final /* synthetic */ FemaleHealthActivity d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.ui.activity.FemaleHealthActivity$refreshChart$2$1$2", f = "FemaleHealthActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ FemaleHealthActivity b;
            public final /* synthetic */ Map<SymptomType, List<SymptomVo>> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FemaleHealthActivity femaleHealthActivity, Map<SymptomType, List<SymptomVo>> map, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = femaleHealthActivity;
                this.c = map;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ChartViewPagerAdapter chartViewPagerAdapter = this.b.adapter;
                Objects.requireNonNull(chartViewPagerAdapter);
                chartViewPagerAdapter.setData(this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Map<SymptomType, List<SymptomVo>> map, SymptomTotalVo symptomTotalVo, FemaleHealthActivity femaleHealthActivity, Continuation<? super j> continuation) {
            super(2, continuation);
            this.b = map;
            this.c = symptomTotalVo;
            this.d = femaleHealthActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new j(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b.putAll(this.c.getMap());
                Set<Map.Entry<SymptomType, List<SymptomVo>>> setEntrySet = this.b.entrySet();
                Map<SymptomType, List<SymptomVo>> map = this.b;
                SymptomTotalVo symptomTotalVo = this.c;
                Iterator<T> it2 = setEntrySet.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    SymptomType symptomType = (SymptomType) entry.getKey();
                    map.put(symptomType, ChartHelper.INSTANCE.fillSymptomListIfNecessary((List) entry.getValue(), symptomTotalVo.getStart().getTime(), symptomTotalVo.getEnd().getTime(), symptomType));
                }
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(this.d, this.b, null);
                this.a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Unit> {
        public final /* synthetic */ DateTriple b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(DateTriple dateTriple) {
            super(0);
            this.b = dateTriple;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FemaleHealthActivity.this.w().delWhenSelectMenstruationStartDay(this.b, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<Unit> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;
        public final /* synthetic */ Ref.BooleanRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Boolean bool, Ref.BooleanRef booleanRef) {
            super(0);
            this.a = bool;
            this.b = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toggleHistorySymptomsCard, expand=" + this.a + ", visible=" + this.b.element;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FemaleHealthActivity() {
        final ComponentCallbackExtKt.C15291 c15291 = new ComponentCallbackExtKt.C15291(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<FemaleHealthViewModel>() { // from class: com.huami.femalehealth.uilib.ui.activity.FemaleHealthActivity$special$$inlined$injectViewModelInFH$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FemaleHealthViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(FemaleHealthViewModel.class), c15291, objArr);
            }
        });
        final ComponentCallbackExtKt.C15291 c15292 = new ComponentCallbackExtKt.C15291(this);
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.trainingVM = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TrainingViewModel>() { // from class: com.huami.femalehealth.uilib.ui.activity.FemaleHealthActivity$special$$inlined$injectViewModelInFH$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.femalehealth.uilib.viewmodel.TrainingViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TrainingViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(TrainingViewModel.class), c15292, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.navigator = LazyKt__LazyJVMKt.lazy(new Function0<ExternalNavigator>() { // from class: com.huami.femalehealth.uilib.ui.activity.FemaleHealthActivity$special$$inlined$injectInFH$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.femalehealth.logiclib.nav.ExternalNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExternalNavigator invoke() {
                return ScopesAndQualifersKt.femaleHealthScope(org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(ExternalNavigator.class), objArr4, objArr5);
            }
        });
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.noticeHelper = LazyKt__LazyJVMKt.lazy(new Function0<FemaleAppNoticeHelper>() { // from class: com.huami.femalehealth.uilib.ui.activity.FemaleHealthActivity$special$$inlined$injectInFH$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.femalehealth.uilib.helper.FemaleAppNoticeHelper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FemaleAppNoticeHelper invoke() {
                return ScopesAndQualifersKt.femaleHealthScope(org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(FemaleAppNoticeHelper.class), objArr6, objArr7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(FemaleHealthActivity femaleHealthActivity, DateTriple dateTriple) {
        ((FemaleHealthCalendarView) femaleHealthActivity.findViewById(R.id.calendarView)).refresh(dateTriple == null ? null : Integer.valueOf(dateTriple.getYear()), dateTriple != null ? Integer.valueOf(dateTriple.getMonth()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(FemaleHealthActivity femaleHealthActivity, String str) {
        ((TextView) femaleHealthActivity.findViewById(R.id.card_status_desc)).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(FemaleHealthActivity femaleHealthActivity, SymptomTotalVo symptomTotalVo) {
        femaleHealthActivity.R(symptomTotalVo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(FemaleHealthActivity femaleHealthActivity, DateTriple dateTriple) {
        if (dateTriple == null) {
            return;
        }
        femaleHealthActivity.S(dateTriple);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(FemaleHealthActivity femaleHealthActivity, Object obj) {
        femaleHealthActivity.u().changeNotice(femaleHealthActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(FemaleHealthActivity femaleHealthActivity, String str) {
        ((TextView) femaleHealthActivity.findViewById(R.id.card_status_title)).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(FemaleHealthActivity femaleHealthActivity, Boolean bool) {
        ((FemaleHealthCalendarView) femaleHealthActivity.findViewById(R.id.calendarView)).getCalendarStateView().openPeriod(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(FemaleHealthActivity femaleHealthActivity, Triple triple) {
        HMLog.info("xys", new b(triple));
        if (triple == null) {
            Degree degree = Degree.UNSPECIFIED;
            triple = new Triple(degree, degree, degree);
        }
        ((TodayStatusCardView) femaleHealthActivity.findViewById(R.id.tv_status_choose)).initSelect((Degree) triple.getFirst(), (Degree) triple.getSecond(), (Degree) triple.getThird());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(FemaleHealthActivity femaleHealthActivity, Triple triple) {
        if (triple == null) {
            return;
        }
        boolean zIsFeatureDay = DateHelper.INSTANCE.isFeatureDay(AidKt.toDate((DateTriple) triple.getFirst()).getTime());
        ExtKt.setVisible$default(femaleHealthActivity.findViewById(R.id.v_divider_day), !zIsFeatureDay, false, 2, null);
        int i2 = R.id.card_status_period;
        ExtKt.setVisible$default((TextView) femaleHealthActivity.findViewById(i2), !zIsFeatureDay, false, 2, null);
        int i3 = R.id.btn_period_end;
        ExtKt.setVisible$default((Button) femaleHealthActivity.findViewById(i3), !zIsFeatureDay, false, 2, null);
        ((TextView) femaleHealthActivity.findViewById(i2)).setText(((CalendarPeriodStyle) triple.getSecond()).name());
        boolean z = triple.getSecond() instanceof PeriodStyle;
        ExtKt.setVisible$default((TodayStatusCardView) femaleHealthActivity.findViewById(R.id.tv_status_choose), z, false, 2, null);
        ExtKt.setVisible$default(femaleHealthActivity.findViewById(R.id.v_divider_card), z, false, 2, null);
        if (!z) {
            ((Button) femaleHealthActivity.findViewById(i3)).setText(femaleHealthActivity.getString(R.string.fh_period_record));
            ((Button) femaleHealthActivity.findViewById(i3)).setEnabled(true);
        } else if (femaleHealthActivity.w().isTomorrowMenstruation((DateTriple) triple.getFirst()) || !((MenstruationVo) triple.getThird()).isEnd()) {
            ((Button) femaleHealthActivity.findViewById(i3)).setText(femaleHealthActivity.getString(R.string.fh_period_end));
            ((Button) femaleHealthActivity.findViewById(i3)).setEnabled(true);
        } else {
            ((Button) femaleHealthActivity.findViewById(i3)).setEnabled(false);
            ((Button) femaleHealthActivity.findViewById(i3)).setText(femaleHealthActivity.getString(R.string.fh_period_ending));
        }
        femaleHealthActivity.V(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(FemaleHealthActivity femaleHealthActivity, Resource resource) {
        TrainingAdapter trainingAdapter;
        if (WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()] == 1) {
            CardView cardView = (CardView) femaleHealthActivity.findViewById(R.id.card_training);
            Collection collection = (Collection) resource.getData();
            ExtKt.setVisible$default(cardView, true ^ (collection == null || collection.isEmpty()), false, 2, null);
            List<TrainingVo> list = (List) resource.getData();
            if (list == null || (trainingAdapter = femaleHealthActivity.trainingAdapter) == null) {
                return;
            }
            trainingAdapter.submit(list);
        }
    }

    private final void K() {
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.tv_title_bar);
        rainbowTitleBar.setTitle(R.string.fh_female_health);
        rainbowTitleBar.setMenuText(getString(R.string.fh_setting));
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: i52
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FemaleHealthActivity.L(this.a, view);
            }
        });
        rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: g52
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i2) {
                FemaleHealthActivity.M(this.a, view, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(FemaleHealthActivity femaleHealthActivity, View view) {
        femaleHealthActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(FemaleHealthActivity femaleHealthActivity, View view, int i2) {
        FHSettingActivity.INSTANCE.start(femaleHealthActivity);
    }

    private final void N() {
        TrainingAdapter trainingAdapter = new TrainingAdapter();
        trainingAdapter.setOnItemClickListener(new c());
        Unit unit = Unit.INSTANCE;
        this.trainingAdapter = trainingAdapter;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_training);
        if (recyclerView == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, 1);
        Drawable resDrawable = ExtKt.getResDrawable(recyclerView, R.drawable.fh_divider);
        if (resDrawable != null) {
            dividerItemDecoration.setDrawable(resDrawable);
        }
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(this.trainingAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(FemaleHealthActivity femaleHealthActivity, View view) {
        FHUploadPermissionManager fHUploadPermissionManager = FHUploadPermissionManager.INSTANCE;
        if (!fHUploadPermissionManager.getHasPermission()) {
            FHUploadPermissionManager.showNoPermissionMsg$default(fHUploadPermissionManager, femaleHealthActivity, null, 2, null);
            return;
        }
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.Button");
        CharSequence text = ((Button) view).getText();
        if (Intrinsics.areEqual(text, femaleHealthActivity.getString(R.string.fh_period_end))) {
            femaleHealthActivity.w().endMenstruation();
        } else if (Intrinsics.areEqual(text, femaleHealthActivity.getString(R.string.fh_period_record))) {
            femaleHealthActivity.w().createMenstruation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        MenstruationHistoryEditActivity.INSTANCE.start(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        HMLog.info("xys", h.a);
        InstructionsActivity.INSTANCE.start(this, getString(R.string.fh_instructions_activity_title), getString(R.string.fh_instructions_title), getString(R.string.fh_instructions_content));
    }

    private final void R(SymptomTotalVo symptomTotalVo) {
        HMLog.info(TAG, new i(symptomTotalVo));
        ExtKt.setVisible$default((CardView) findViewById(R.id.card_history), symptomTotalVo != null, false, 100L, 2, null);
        if (symptomTotalVo == null) {
            return;
        }
        ((TextView) findViewById(R.id.tv_history_date)).setText(ChartHelper.INSTANCE.formatHistoryCardDate(symptomTotalVo.getStart(), symptomTotalVo.getEnd()));
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new j(new LinkedHashMap(), symptomTotalVo, this, null), 3, null);
    }

    private final void S(final DateTriple dateTriple) {
        FHDoMainBridge.Companion companion = FHDoMainBridge.INSTANCE;
        if (companion.getCalendarDelDialog() == null) {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this, R.style.FHAlertDialog).setPositiveButton(getString(R.string.fh_delete), new DialogInterface.OnClickListener() { // from class: z42
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    FemaleHealthActivity.T(this.a, dateTriple, dialogInterface, i2);
                }
            }).setNegativeButton(getString(R.string.fh_save), new DialogInterface.OnClickListener() { // from class: h52
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    FemaleHealthActivity.U(dialogInterface, i2);
                }
            }).setMessage(getString(R.string.fh_save_today_period)).setCancelable(true).create();
            alertDialogCreate.show();
            alertDialogCreate.getButton(-1).setTextColor(ExtKt.getResColor(this, R.color.fh_dialog_positive_button_color));
            alertDialogCreate.getButton(-2).setTextColor(ExtKt.getResColor(this, R.color.fh_dialog_button_color));
            return;
        }
        Function3<SoftReference<FragmentActivity>, Function0<Unit>, Function0<Unit>, Unit> calendarDelDialog = companion.getCalendarDelDialog();
        if (calendarDelDialog == null) {
            return;
        }
        calendarDelDialog.invoke(new SoftReference<>(this), new k(dateTriple), l.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(FemaleHealthActivity femaleHealthActivity, DateTriple dateTriple, DialogInterface dialogInterface, int i2) {
        femaleHealthActivity.w().delWhenSelectMenstruationStartDay(dateTriple, true);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    private final void V(Boolean expand) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        int i2 = R.id.group_history;
        booleanRef.element = !ExtKt.isVisible((Group) findViewById(i2));
        HMLog.info(TAG, new m(expand, booleanRef));
        if (expand != null) {
            expand.booleanValue();
            booleanRef.element = expand.booleanValue();
        }
        ExtKt.setVisible((Group) findViewById(i2), booleanRef.element, true);
        ((TextView) findViewById(R.id.tv_history_collapse)).setText(ExtKt.isVisible((Group) findViewById(i2)) ? getResources().getString(R.string.fh_collapse) : getResources().getString(R.string.fh_expand));
    }

    public static /* synthetic */ void W(FemaleHealthActivity femaleHealthActivity, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = null;
        }
        femaleHealthActivity.V(bool);
    }

    private final void initObservers() {
        w().getRefreshLiveData().observe(this, new Observer() { // from class: n52
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FemaleHealthActivity.A(this.a, (DateTriple) obj);
            }
        });
        w().getStateCardContentLiveData().observe(this, new Observer() { // from class: c52
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FemaleHealthActivity.B(this.a, (String) obj);
            }
        });
        w().getStateCardDateLiveData().observe(this, new Observer() { // from class: b52
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FemaleHealthActivity.F(this.a, (String) obj);
            }
        });
        w().getEnablePredictLiveData().observe(this, new Observer() { // from class: a52
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FemaleHealthActivity.G(this.a, (Boolean) obj);
            }
        });
        w().getStatusLiveDate().observe(this, new Observer() { // from class: d52
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FemaleHealthActivity.H(this.a, (Triple) obj);
            }
        });
        w().getSelectDateLiveData().observe(this, new Observer() { // from class: e52
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FemaleHealthActivity.I(this.a, (Triple) obj);
            }
        });
        v().getTrainings().observe(this, new Observer() { // from class: m52
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FemaleHealthActivity.J(this.a, (Resource) obj);
            }
        });
        w().getSymptomLive().observe(this, new Observer() { // from class: p52
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FemaleHealthActivity.C(this.a, (SymptomTotalVo) obj);
            }
        });
        w().getDialogLiveData().observe(this, new Observer() { // from class: o52
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FemaleHealthActivity.D(this.a, (DateTriple) obj);
            }
        });
        ((FemaleHealthCalendarView) findViewById(R.id.calendarView)).showEdit(true);
        w().getChangeNoticeLiveData().observe(this, new Observer() { // from class: f52
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FemaleHealthActivity.E(this.a, obj);
            }
        });
    }

    private final void initView() {
        int i2 = R.id.calendarView;
        ((FemaleHealthCalendarView) findViewById(i2)).setCalendarListener(this);
        ((FemaleHealthCalendarView) findViewById(i2)).setFragmentManager(getSupportFragmentManager());
        ((FemaleHealthCalendarView) findViewById(i2)).setRenderStyle(new d());
        ((FemaleHealthCalendarView) findViewById(i2)).getCalendarStateView().setPredictionClick(new e(this));
        ((FemaleHealthCalendarView) findViewById(i2)).getCalendarStateView().setEditClick(new f(this));
        FemaleHealthCalendarView.selectDay$default((FemaleHealthCalendarView) findViewById(i2), 0, 0, 0, false, 15, null);
        ((Button) findViewById(R.id.btn_period_end)).setOnClickListener(new View.OnClickListener() { // from class: l52
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FemaleHealthActivity.O(this.a, view);
            }
        });
        ((TodayStatusCardView) findViewById(R.id.tv_status_choose)).setOnSelectListener(new TodayStatusCardView.OnSelectListener() { // from class: com.huami.femalehealth.uilib.ui.activity.FemaleHealthActivity.initView.5

            /* JADX INFO: renamed from: com.huami.femalehealth.uilib.ui.activity.FemaleHealthActivity$initView$5$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Degree a;
                public final /* synthetic */ Degree b;
                public final /* synthetic */ Degree c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Degree degree, Degree degree2, Degree degree3) {
                    super(0);
                    this.a = degree;
                    this.b = degree2;
                    this.c = degree3;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "painSelect:" + this.a + " bloodSelect:" + this.b + " moodSelect:" + this.c;
                }
            }

            @Override // com.huami.femalehealth.uilib.widget.TodayStatusCardView.OnSelectListener
            public void select(@NotNull Degree painSelect, @NotNull Degree bloodSelect, @NotNull Degree moodSelect) {
                FHUploadPermissionManager fHUploadPermissionManager = FHUploadPermissionManager.INSTANCE;
                if (!fHUploadPermissionManager.getHasPermission()) {
                    FHUploadPermissionManager.showNoPermissionMsg$default(fHUploadPermissionManager, FemaleHealthActivity.this, null, 2, null);
                } else {
                    HMLog.info("xys", new a(painSelect, bloodSelect, moodSelect));
                    FemaleHealthActivity.this.w().setCardStatus(painSelect, bloodSelect, moodSelect);
                }
            }
        });
        x();
        N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExternalNavigator t() {
        return (ExternalNavigator) this.navigator.getValue();
    }

    private final FemaleAppNoticeHelper u() {
        return (FemaleAppNoticeHelper) this.noticeHelper.getValue();
    }

    private final TrainingViewModel v() {
        return (TrainingViewModel) this.trainingVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FemaleHealthViewModel w() {
        return (FemaleHealthViewModel) this.viewModel.getValue();
    }

    private final void x() {
        this.adapter = new ChartViewPagerAdapter();
        int i2 = R.id.vp_history_chart;
        ViewPager viewPager = (ViewPager) findViewById(i2);
        ChartViewPagerAdapter chartViewPagerAdapter = this.adapter;
        Objects.requireNonNull(chartViewPagerAdapter);
        viewPager.setAdapter(chartViewPagerAdapter);
        ((ViewPager) findViewById(i2)).setOffscreenPageLimit(2);
        CommonNavigator commonNavigator = new CommonNavigator(this);
        commonNavigator.setAdjustMode(true);
        commonNavigator.setAdapter(new HistoryCardNavAdapter(new a()));
        int i3 = R.id.indicator_history_chart;
        ((MagicIndicator) findViewById(i3)).setNavigator(commonNavigator);
        ((MagicIndicator) findViewById(i3)).setBackgroundResource(R.drawable.fh_grey_radius_14dp_bg);
        ViewPagerHelper.bind((MagicIndicator) findViewById(i3), (ViewPager) findViewById(i2));
        ((RTLTextView) findViewById(R.id.tv_history_more)).setOnClickListener(new View.OnClickListener() { // from class: j52
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FemaleHealthActivity.y(this.a, view);
            }
        });
        ((TextView) findViewById(R.id.tv_history_collapse)).setOnClickListener(new View.OnClickListener() { // from class: k52
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FemaleHealthActivity.z(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(FemaleHealthActivity femaleHealthActivity, View view) {
        MenstruationHistoryActivity.INSTANCE.start(femaleHealthActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(FemaleHealthActivity femaleHealthActivity, View view) {
        W(femaleHealthActivity, null, 1, null);
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.FemaleHealthCalendarView.OnCalendarListener
    public void onCalendarSelect(@Nullable Calendar calendar, boolean isClick) {
        HMLog.info("xys", new g(calendar, isClick));
        w().onCalendarSelect(calendar);
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fh_activity_female_health);
        observerLifeCycle(w());
        K();
        initView();
        initObservers();
    }

    @Override // com.huami.femalehealth.uilib.widget.calendar.FemaleHealthCalendarView.OnCalendarListener
    public void onMonthChange(int year, int month) {
        w().onMonthChange(year, month);
    }
}
