package com.huami.training.ui.entrance;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.training.decoration.VerticalLinearSpacingDecoration;
import com.huami.training.di.koin.ScopesAndQualifersKt;
import com.huami.training.dto.DisplayMode;
import com.huami.training.dto.TargetMode;
import com.huami.training.dto.TrainingPlanState;
import com.huami.training.ext.ViewExKt;
import com.huami.training.helper.AppExecutors;
import com.huami.training.navigation.NavigationController;
import com.huami.training.ui.R;
import com.huami.training.ui.common.CourseLayoutDelegate;
import com.huami.training.ui.entrance.CourseHomeFragment;
import com.huami.training.ui.entrance.courseHome.IHandleDisplaySubjectZone;
import com.huami.training.ui.entrance.courseHome.displaySubjectImpl.DefaultHandleDisplaySubjectZone;
import com.huami.training.ui.entrance.courseHome.displaySubjectImpl.HideTextSubjectZone;
import com.huami.training.ui.tag.TagsAdapter;
import com.huami.training.ui.widget.CustomSmartRefreshLayout;
import com.huami.training.ui.widget.KingView;
import com.huami.training.utils.AnalyticsHelper;
import com.huami.training.utils.FragmentTrackHelper;
import com.huami.training.utils.FragmentTrackHelperKt;
import com.huami.training.vo.EntranceKingVo;
import com.huami.training.vo.EntranceSubjectVo;
import com.huami.training.vo.Resource;
import com.huami.training.vo.Status;
import com.huami.training.vo.TagVo;
import com.huami.training.vo.TrainingPlanVo;
import com.huami.training.vo.TrainingVo;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 h2\u00020\u0001:\u0001hB\u0007¢\u0006\u0004\bf\u0010gJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001c\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0002J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\"H\u0016J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u000fH\u0016J\"\u0010,\u001a\u0004\u0018\u00010\u000f2\u0006\u0010*\u001a\u00020)2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016R\u001d\u00102\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u00107\u001a\u0002038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u001d\u0010<\u001a\u0002088B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u0010;R\u001d\u0010A\u001a\u00020=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b?\u0010@R\u001d\u0010F\u001a\u00020B8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010/\u001a\u0004\bD\u0010ER\u001d\u0010K\u001a\u00020G8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010/\u001a\u0004\bI\u0010JR\u001d\u0010P\u001a\u00020L8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010/\u001a\u0004\bN\u0010OR\u001d\u0010T\u001a\u00020\u001c8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010/\u001a\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010\fR\u0016\u0010X\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010\u0005R\u0018\u0010[\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010\u0005¨\u0006i"}, d2 = {"Lcom/huami/training/ui/entrance/CourseHomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/huami/training/ui/entrance/courseHome/IHandleDisplaySubjectZone;", "w", "", LogUtil.I, "L", "C", "K", "G", "", "height", "Z", "Lcom/huami/training/vo/Resource;", "", "Lcom/huami/training/vo/EntranceSubjectVo;", "it", "t", "Lcom/huami/training/dto/TargetMode;", "targetMode", "b0", "(Lcom/huami/training/dto/TargetMode;)Ljava/lang/Integer;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "onPause", "", "isVisibleToUser", "setUserVisibleHint", "hidden", "onHiddenChanged", "subject", "jumpToTarget", "Lcom/huami/training/dto/DisplayMode;", "displayMode", "list", "getSubject", "Lcom/huami/training/helper/AppExecutors;", "a", "Lkotlin/Lazy;", "u", "()Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lcom/huami/training/navigation/NavigationController;", "b", "y", "()Lcom/huami/training/navigation/NavigationController;", "navigationController", "Lcom/huami/training/ui/entrance/EntranceViewModel;", "c", "B", "()Lcom/huami/training/ui/entrance/EntranceViewModel;", "viewModel", "Lcom/huami/training/ui/common/CourseLayoutDelegate;", GoogleApiAvailabilityLight.a, "x", "()Lcom/huami/training/ui/common/CourseLayoutDelegate;", "layoutDelegate", "Lcom/huami/training/ui/entrance/CourseHomeAdapter;", "e", "v", "()Lcom/huami/training/ui/entrance/CourseHomeAdapter;", "entranceAdapter", "Lcom/huami/training/ui/entrance/CourseHomeTodayTrainingAdapter;", "f", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lcom/huami/training/ui/entrance/CourseHomeTodayTrainingAdapter;", "todayTrainingAdapter", "Lcom/huami/training/ui/tag/TagsAdapter;", "g", "z", "()Lcom/huami/training/ui/tag/TagsAdapter;", "todayTagAdapter", "h", "getHeader", "()Landroid/view/View;", "header", "i", "hasObserved", z.j, "statusBarHeight", hl.k, "Lcom/huami/training/ui/entrance/courseHome/IHandleDisplaySubjectZone;", "handleDisplaySubjectZone", "Lcom/huami/training/utils/FragmentTrackHelper;", "l", "Lcom/huami/training/utils/FragmentTrackHelper;", "trackHelper", "", "m", "Ljava/lang/Long;", BloodPressureConst.ParamKey.PLANID, GoogleApiAvailabilityLight.b, "scrollDistance", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class CourseHomeFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String o = "margin_top";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy layoutDelegate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy entranceAdapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy todayTrainingAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy todayTagAdapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy header;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean hasObserved;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int statusBarHeight;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private IHandleDisplaySubjectZone handleDisplaySubjectZone;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final FragmentTrackHelper trackHelper;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private Long planId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int scrollDistance;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/training/ui/entrance/CourseHomeFragment$Companion;", "", "", "titleMarginTop", "Lcom/huami/training/ui/entrance/CourseHomeFragment;", "create", "", "EXTRA_MARGIN_TOP", "Ljava/lang/String;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CourseHomeFragment create(int titleMarginTop) {
            CourseHomeFragment courseHomeFragment = new CourseHomeFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(CourseHomeFragment.o, titleMarginTop);
            courseHomeFragment.setArguments(bundle);
            return courseHomeFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TrainingPlanState.values().length];
            iArr[TrainingPlanState.WAIT.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TargetMode.values().length];
            iArr2[TargetMode.NONE.ordinal()] = 1;
            iArr2[TargetMode.WEBVIEW.ordinal()] = 2;
            iArr2[TargetMode.INTERNAL.ordinal()] = 3;
            iArr2[TargetMode.EXTERNAL.ordinal()] = 4;
            iArr2[TargetMode.RN.ordinal()] = 5;
            iArr2[TargetMode.INSIDE_REDIRECT.ordinal()] = 6;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/ui/entrance/CourseHomeAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<CourseHomeAdapter> {

        /* JADX INFO: renamed from: com.huami.training.ui.entrance.CourseHomeFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0628a extends Lambda implements Function0<Unit> {
            public static final C0628a a = new C0628a();

            public C0628a() {
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/vo/TrainingVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<TrainingVo, Unit> {
            public final /* synthetic */ CourseHomeFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CourseHomeFragment courseHomeFragment) {
                super(1);
                this.a = courseHomeFragment;
            }

            public final void a(@NotNull TrainingVo trainingVo) {
                this.a.y().navigateToTrainingDetail(this.a.getContext(), trainingVo.getId(), trainingVo.getTrainingType());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TrainingVo trainingVo) {
                a(trainingVo);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CourseHomeAdapter invoke() {
            return new CourseHomeAdapter(CourseHomeFragment.this.getContext(), C0628a.a, new b(CourseHomeFragment.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<View> {
        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final View invoke() {
            return CourseHomeFragment.this.v().m3392getHeaderLayout();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lcom/huami/training/vo/TrainingVo;", "courseVo", "", "position", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<TrainingVo, Integer, Unit> {
        public final /* synthetic */ View b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(2);
            this.b = view;
        }

        public final void a(@NotNull TrainingVo trainingVo, int i) {
            AnalyticsHelper.INSTANCE.countCourseTodayClicked(i, String.valueOf(trainingVo.getId()), trainingVo.getLabel());
            CourseHomeFragment.this.y().navigateToTrainingDetail(this.b.getContext(), trainingVo.getId(), trainingVo.getTrainingType());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(TrainingVo trainingVo, Integer num) {
            a(trainingVo, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/vo/TrainingVo;", "courseVo", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<TrainingVo, Unit> {
        public final /* synthetic */ View b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(1);
            this.b = view;
        }

        public final void a(@NotNull TrainingVo trainingVo) {
            AnalyticsHelper.INSTANCE.countAddCourseClicked();
            CourseHomeFragment.this.y().navigateToTrainingDetail(this.b.getContext(), trainingVo.getId(), trainingVo.getTrainingType());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TrainingVo trainingVo) {
            a(trainingVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "jumpType", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function2<String, Integer, Unit> {
        public final /* synthetic */ View a;
        public final /* synthetic */ CourseHomeFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view, CourseHomeFragment courseHomeFragment) {
            super(2);
            this.a = view;
            this.b = courseHomeFragment;
        }

        public final void a(@Nullable String str, int i) {
            Context context = this.a.getContext();
            if (context != null) {
                this.b.y().navigateToTrainingFilterList(context, str);
            }
            AnalyticsHelper.INSTANCE.countKingKongIconClicked(str);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            a(str, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/ui/tag/TagsAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<TagsAdapter> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/vo/TagVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<TagVo, Unit> {
            public final /* synthetic */ CourseHomeFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(CourseHomeFragment courseHomeFragment) {
                super(1);
                this.a = courseHomeFragment;
            }

            public final void a(@NotNull TagVo tagVo) {
                AnalyticsHelper.INSTANCE.countCourseTag(tagVo.getName());
                this.a.B().setTodayTag(tagVo.getId());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TagVo tagVo) {
                a(tagVo);
                return Unit.INSTANCE;
            }
        }

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TagsAdapter invoke() {
            return new TagsAdapter(CourseHomeFragment.this.x(), UIUtil.dip2px(CourseHomeFragment.this.getContext(), 30.0d), new a(CourseHomeFragment.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/ui/entrance/CourseHomeTodayTrainingAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<CourseHomeTodayTrainingAdapter> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CourseHomeTodayTrainingAdapter invoke() {
            return new CourseHomeTodayTrainingAdapter(CourseHomeFragment.this.u());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<Long, Unit> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            AnalyticsHelper.INSTANCE.calculationMainCoursePageDuration(j);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Unit> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AnalyticsHelper.INSTANCE.countMainCourseVisit();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CourseHomeFragment() {
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.appExecutors = LazyKt__LazyJVMKt.lazy(new Function0<AppExecutors>() { // from class: com.huami.training.ui.entrance.CourseHomeFragment$special$$inlined$injectInTr$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.training.helper.AppExecutors, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AppExecutors invoke() {
                return ScopesAndQualifersKt.trainingScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(new Function0<NavigationController>() { // from class: com.huami.training.ui.entrance.CourseHomeFragment$special$$inlined$injectInTr$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.training.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                return ScopesAndQualifersKt.trainingScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(NavigationController.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<EntranceViewModel>() { // from class: com.huami.training.ui.entrance.CourseHomeFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.entrance.EntranceViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final EntranceViewModel invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(EntranceViewModel.class), objArr4, objArr5);
            }
        });
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.layoutDelegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<CourseLayoutDelegate>() { // from class: com.huami.training.ui.entrance.CourseHomeFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.common.CourseLayoutDelegate, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CourseLayoutDelegate invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(CourseLayoutDelegate.class), objArr6, objArr7);
            }
        });
        this.entranceAdapter = LazyKt__LazyJVMKt.lazy(new a());
        this.todayTrainingAdapter = LazyKt__LazyJVMKt.lazy(new g());
        this.todayTagAdapter = LazyKt__LazyJVMKt.lazy(new f());
        this.header = LazyKt__LazyJVMKt.lazy(new b());
        this.trackHelper = FragmentTrackHelperKt.trackHelper(this, h.a, i.a);
    }

    private final CourseHomeTodayTrainingAdapter A() {
        return (CourseHomeTodayTrainingAdapter) this.todayTrainingAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EntranceViewModel B() {
        return (EntranceViewModel) this.viewModel.getValue();
    }

    private final void C() {
        View header = getHeader();
        ((LinearLayout) header.findViewById(R.id.card_training_plan_empty)).setOnClickListener(new View.OnClickListener() { // from class: y01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseHomeFragment.D(this.a, view);
            }
        });
        header.findViewById(R.id.card_training_plan).setOnClickListener(new View.OnClickListener() { // from class: x01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseHomeFragment.E(this.a, view);
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: w01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseHomeFragment.F(this.a, view);
            }
        };
        ((LinearLayout) header.findViewById(R.id.card_joined_courses_separated)).setOnClickListener(onClickListener);
        header.findViewById(R.id.joined_course).setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(CourseHomeFragment courseHomeFragment, View view) {
        AnalyticsHelper.INSTANCE.countStartTraining();
        courseHomeFragment.y().navigateToCreatePlanPage(view.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(CourseHomeFragment courseHomeFragment, View view) {
        AnalyticsHelper.INSTANCE.countContinuePlanClickInCourse(courseHomeFragment.planId);
        courseHomeFragment.y().navigateToPlanDetailPage(view.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(CourseHomeFragment courseHomeFragment, View view) {
        AnalyticsHelper.INSTANCE.countContinueCourse();
        courseHomeFragment.y().navigateToJoinedTrainingList(view.getContext());
    }

    private final void G() {
        View view = getView();
        RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.recycler_view));
        recyclerView.setAdapter(v());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new VerticalLinearSpacingDecoration(0, (int) ViewExKt.dpToPx(recyclerView, 7.0f), 0, (int) ViewExKt.dpToPx(recyclerView, 7.0f), 1, 5, null));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i2 = R.layout.tr_entrance_head_v2;
        View view2 = getView();
        v().setHeaderView(layoutInflaterFrom.inflate(i2, (ViewGroup) (view2 == null ? null : view2.findViewById(R.id.recycler_view)), false));
        View view3 = getView();
        ((ImageView) (view3 != null ? view3.findViewById(R.id.search) : null)).setOnClickListener(new View.OnClickListener() { // from class: m01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                CourseHomeFragment.H(this.a, view4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(CourseHomeFragment courseHomeFragment, View view) {
        Context context = courseHomeFragment.getContext();
        if (context == null) {
            return;
        }
        courseHomeFragment.y().navigateToSearch(context);
        AnalyticsHelper.INSTANCE.recordDefaultSearchCourseEvent();
    }

    private final void I() {
        View view = getView();
        final CustomSmartRefreshLayout customSmartRefreshLayout = (CustomSmartRefreshLayout) (view == null ? null : view.findViewById(R.id.smart_refresh));
        customSmartRefreshLayout.setEnableLoadmore(false);
        customSmartRefreshLayout.setEnableRefresh(true);
        customSmartRefreshLayout.setOnRefreshListener(new OnRefreshListener() { // from class: v01
            @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
            public final void onRefresh(RefreshLayout refreshLayout) {
                CourseHomeFragment.J(customSmartRefreshLayout, this, refreshLayout);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(CustomSmartRefreshLayout customSmartRefreshLayout, CourseHomeFragment courseHomeFragment, RefreshLayout refreshLayout) {
        customSmartRefreshLayout.autoRefresh();
        courseHomeFragment.B().refresh();
    }

    private final void K() {
        View header = getHeader();
        KingView kingView = (KingView) header.findViewById(R.id.king_zone);
        kingView.setRadius(0.0f);
        kingView.setCardElevation(0.0f);
        RecyclerView recyclerView = (RecyclerView) header.findViewById(R.id.today_tag);
        recyclerView.setAdapter(z());
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext());
        flexboxLayoutManager.setFlexDirection(0);
        Unit unit = Unit.INSTANCE;
        recyclerView.setLayoutManager(flexboxLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) header.findViewById(R.id.rcv_today_training);
        recyclerView2.setAdapter(A());
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
        A().setItemClickListener(new c(header));
        A().setJoinCourseClickListener(new d(header));
    }

    private final void L() {
        if (this.hasObserved) {
            return;
        }
        this.hasObserved = true;
        B().getConfigFetchResult().observe(this, new Observer() { // from class: s01
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CourseHomeFragment.U((Resource) obj);
            }
        });
        B().getRefreshState().observe(this, new Observer() { // from class: p01
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CourseHomeFragment.V(this.a, (Boolean) obj);
            }
        });
        B().getEntranceCard().observe(this, new Observer() { // from class: t01
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CourseHomeFragment.W((Resource) obj);
            }
        });
        B().getSubjects().observe(this, new Observer() { // from class: o01
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CourseHomeFragment.X(this.a, (Resource) obj);
            }
        });
        B().getKingIcons().observe(this, new Observer() { // from class: d11
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CourseHomeFragment.Y(this.a, (Resource) obj);
            }
        });
        B().getTrainingPlan().observe(this, new Observer() { // from class: b11
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CourseHomeFragment.M(this.a, (Resource) obj);
            }
        });
        B().getAllJoinedCourse().observe(this, new Observer() { // from class: e11
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CourseHomeFragment.N(this.a, (Resource) obj);
            }
        });
        B().getPlanAndJoinedCourseVisible().observe(this, new Observer() { // from class: q01
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CourseHomeFragment.O(this.a, (Pair) obj);
            }
        });
        B().getTodayTagResult().observe(this, new Observer() { // from class: c11
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CourseHomeFragment.P(this.a, (Resource) obj);
            }
        });
        B().getTodayTrainingResult().observe(this, new Observer() { // from class: n01
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CourseHomeFragment.Q(this.a, (Resource) obj);
            }
        });
        B().getKankanPagedList().observe(this, new Observer() { // from class: a11
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CourseHomeFragment.R(this.a, (PagedList) obj);
            }
        });
        B().getKankanNetworkState().observe(this, new Observer() { // from class: u01
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CourseHomeFragment.S((Resource) obj);
            }
        });
        B().getKankanRefreshState().observe(this, new Observer() { // from class: r01
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CourseHomeFragment.T((Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(CourseHomeFragment courseHomeFragment, Resource resource) {
        View header = courseHomeFragment.getHeader();
        TrainingPlanVo trainingPlanVo = (TrainingPlanVo) resource.getData();
        if (trainingPlanVo == null) {
            return;
        }
        View view = courseHomeFragment.getView();
        ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.tv_training_plan_days))).setText(WhenMappings.$EnumSwitchMapping$0[trainingPlanVo.getState().ordinal()] == 1 ? header.getResources().getQuantityString(R.plurals.tr_wait_x_days_then_begin, trainingPlanVo.getWaitDays(), Integer.valueOf(trainingPlanVo.getWaitDays())) : courseHomeFragment.getString(R.string.tr_plan_day_progress, trainingPlanVo.getDayIndex(), Integer.valueOf(trainingPlanVo.getTotalDays())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(CourseHomeFragment courseHomeFragment, Resource resource) {
        View header = courseHomeFragment.getHeader();
        Integer num = (Integer) resource.getData();
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        String quantityString = header.getResources().getQuantityString(R.plurals.tr_total_group_number, iIntValue, Integer.valueOf(iIntValue));
        View viewFindViewById = header.findViewById(R.id.joined_course);
        int i2 = R.id.joined_course_count;
        ((TypefaceTextView) viewFindViewById.findViewById(i2)).setText(quantityString);
        ((TypefaceTextView) ((LinearLayout) header.findViewById(R.id.card_joined_courses_separated)).findViewById(i2)).setText(quantityString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(CourseHomeFragment courseHomeFragment, Pair pair) {
        Pair pair2 = (Pair) pair.component1();
        boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
        Boolean bool = (Boolean) pair2.getFirst();
        Long l = (Long) pair2.getSecond();
        courseHomeFragment.planId = l;
        View header = courseHomeFragment.getHeader();
        int i2 = R.id.joined_course;
        if ((header.findViewById(i2).getVisibility() == 8 && zBooleanValue && bool != null && bool.booleanValue()) || (((LinearLayout) header.findViewById(R.id.card_joined_courses_separated)).getVisibility() == 8 && zBooleanValue && bool != null && !bool.booleanValue())) {
            AnalyticsHelper.INSTANCE.countCourseContinueVisit();
        }
        int i3 = R.id.card_training_plan_empty;
        if (((LinearLayout) header.findViewById(i3)).getVisibility() == 8 && bool != null && !bool.booleanValue()) {
            AnalyticsHelper.INSTANCE.countStartPlanVisitInCourse();
        }
        int i4 = R.id.card_my_training_both_v;
        if (((LinearLayout) header.findViewById(i4)).getVisibility() == 8 && bool != null && bool.booleanValue()) {
            AnalyticsHelper.INSTANCE.countContinuePlanVisitInCourse(l);
        }
        ViewExKt.setVisible((LinearLayout) header.findViewById(i4), bool != null && bool.booleanValue());
        ViewExKt.setVisible((LinearLayout) header.findViewById(i3), (bool == null || bool.booleanValue()) ? false : true);
        ViewExKt.setVisible(header.findViewById(R.id.card_my_training_both_divider), zBooleanValue && bool != null && bool.booleanValue());
        ViewExKt.setVisible(header.findViewById(i2), bool != null && bool.booleanValue() && zBooleanValue);
        ViewExKt.setVisible((LinearLayout) header.findViewById(R.id.card_joined_courses_separated), (!zBooleanValue || bool == null || bool.booleanValue()) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(CourseHomeFragment courseHomeFragment, Resource resource) {
        View header = courseHomeFragment.getHeader();
        List<TagVo> list = (List) resource.getData();
        if (list != null && !list.isEmpty()) {
            courseHomeFragment.z().setNewData(list);
            courseHomeFragment.z().selectItem(0);
            courseHomeFragment.B().setTodayTag(list.get(0).getId());
            if (((ConstraintLayout) header.findViewById(R.id.today_zone)).getVisibility() == 8) {
                AnalyticsHelper analyticsHelper = AnalyticsHelper.INSTANCE;
                analyticsHelper.countCourseTagVisit(list);
                analyticsHelper.countCourseMoreVisit();
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) header.findViewById(R.id.today_zone);
        Collection collection = (Collection) resource.getData();
        ViewExKt.setVisible(constraintLayout, !(collection == null || collection.isEmpty()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    public static final void Q(CourseHomeFragment courseHomeFragment, Resource resource) {
        boolean z;
        boolean z2;
        View header = courseHomeFragment.getHeader();
        TypefaceTextView typefaceTextView = (TypefaceTextView) header.findViewById(R.id.today_training_error);
        if (resource.getStatus() != Status.ERROR) {
            if (resource.getStatus() == Status.SUCCESS) {
                Collection collection = (Collection) resource.getData();
                z = collection == null || collection.isEmpty();
            }
        }
        ViewExKt.setVisible(typefaceTextView, z);
        RecyclerView recyclerView = (RecyclerView) header.findViewById(R.id.rcv_today_training);
        if (resource.getStatus() != Status.SUCCESS) {
            z2 = false;
        } else {
            Collection collection2 = (Collection) resource.getData();
            if (collection2 == null || collection2.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        ViewExKt.setVisible(recyclerView, z2);
        Collection collection3 = (Collection) resource.getData();
        if (collection3 == null || collection3.isEmpty()) {
            courseHomeFragment.A().submitList(CollectionsKt__CollectionsKt.emptyList());
        } else {
            courseHomeFragment.A().submitList((List) resource.getData());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(CourseHomeFragment courseHomeFragment, PagedList pagedList) {
        courseHomeFragment.v().submitList(pagedList);
        ViewExKt.setVisible((TypefaceTextView) courseHomeFragment.getHeader().findViewById(R.id.kankan_title), !pagedList.isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(Resource resource) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(Resource resource) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(Resource resource) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(CourseHomeFragment courseHomeFragment, Boolean bool) {
        View view = courseHomeFragment.getView();
        if (((CustomSmartRefreshLayout) (view == null ? null : view.findViewById(R.id.smart_refresh))).isRefreshing() && bool.booleanValue()) {
            View view2 = courseHomeFragment.getView();
            ((CustomSmartRefreshLayout) (view2 != null ? view2.findViewById(R.id.smart_refresh) : null)).finishRefresh(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(Resource resource) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(CourseHomeFragment courseHomeFragment, Resource resource) {
        courseHomeFragment.t(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    public static final void Y(CourseHomeFragment courseHomeFragment, Resource resource) {
        boolean z;
        View header = courseHomeFragment.getHeader();
        int i2 = R.id.king_zone;
        KingView kingView = (KingView) header.findViewById(i2);
        if (resource.getData() != null) {
            Collection collection = (Collection) resource.getData();
            z = collection == null || collection.isEmpty() ? false : true;
        }
        ViewExKt.setVisible(kingView, z);
        List<EntranceKingVo> list = (List) resource.getData();
        if (list == null) {
            return;
        }
        ((KingView) header.findViewById(i2)).setData(list);
        ((KingView) header.findViewById(i2)).setOnItemClickListener(new e(header, courseHomeFragment));
    }

    private final void Z(int height) {
        View view = getView();
        ViewGroup.LayoutParams layoutParams = (view == null ? null : view.findViewById(R.id.status_mask)).getLayoutParams();
        layoutParams.height = height;
        View view2 = getView();
        (view2 == null ? null : view2.findViewById(R.id.status_mask)).setLayoutParams(layoutParams);
        View view3 = getView();
        CustomSmartRefreshLayout customSmartRefreshLayout = (CustomSmartRefreshLayout) (view3 == null ? null : view3.findViewById(R.id.smart_refresh));
        ViewGroup.LayoutParams layoutParams2 = customSmartRefreshLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
        ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = height + ((int) ViewExKt.dpToPx(customSmartRefreshLayout, 45.0f));
        customSmartRefreshLayout.setLayoutParams(layoutParams3);
        View view4 = getView();
        ((TypefaceTextView) (view4 != null ? view4.findViewById(R.id.title) : null)).setOnClickListener(new View.OnClickListener() { // from class: z01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                CourseHomeFragment.a0(this.a, view5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(CourseHomeFragment courseHomeFragment, View view) {
        if (courseHomeFragment.scrollDistance > courseHomeFragment.getResources().getDisplayMetrics().heightPixels) {
            View view2 = courseHomeFragment.getView();
            ((RecyclerView) (view2 == null ? null : view2.findViewById(R.id.recycler_view))).smoothScrollToPosition(0);
        }
    }

    private final Integer b0(TargetMode targetMode) {
        switch (targetMode == null ? -1 : WhenMappings.$EnumSwitchMapping$1[targetMode.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                return null;
        }
    }

    private final void t(Resource<? extends List<EntranceSubjectVo>> it2) {
        IHandleDisplaySubjectZone iHandleDisplaySubjectZoneW = w();
        if (iHandleDisplaySubjectZoneW == null) {
            return;
        }
        iHandleDisplaySubjectZoneW.displaySubjectZone(this, it2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppExecutors u() {
        return (AppExecutors) this.appExecutors.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CourseHomeAdapter v() {
        return (CourseHomeAdapter) this.entranceAdapter.getValue();
    }

    private final IHandleDisplaySubjectZone w() {
        if (this.handleDisplaySubjectZone == null) {
            this.handleDisplaySubjectZone = new HideTextSubjectZone(new DefaultHandleDisplaySubjectZone());
        }
        return this.handleDisplaySubjectZone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CourseLayoutDelegate x() {
        return (CourseLayoutDelegate) this.layoutDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController y() {
        return (NavigationController) this.navigationController.getValue();
    }

    private final TagsAdapter z() {
        return (TagsAdapter) this.todayTagAdapter.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public View getHeader() {
        return (View) this.header.getValue();
    }

    @Nullable
    public EntranceSubjectVo getSubject(@NotNull DisplayMode displayMode, @Nullable List<EntranceSubjectVo> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (EntranceSubjectVo entranceSubjectVo : list) {
            if (entranceSubjectVo.getDisplayMode() == displayMode) {
                return entranceSubjectVo;
            }
            arrayList.add(Unit.INSTANCE);
        }
        return null;
    }

    public void jumpToTarget(@NotNull EntranceSubjectVo subject) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        y().navigateToSpecialPagerFromAd(context, b0(subject.getTargetMode()), subject.getTargetUrl());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_course_home, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        this.trackHelper.trackOnHiddenChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.trackHelper.trackOnPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.trackHelper.trackOnResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.statusBarHeight = arguments.getInt(o);
        }
        G();
        I();
        Z(this.statusBarHeight);
        K();
        C();
        if (getUserVisibleHint()) {
            L();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        this.trackHelper.trackOnUserVisibleHint();
        if (!isVisibleToUser || getView() == null) {
            return;
        }
        L();
    }
}
