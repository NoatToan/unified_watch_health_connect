package com.huami.training.ui.entrance;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.training.decoration.VerticalLinearSpacingDecoration;
import com.huami.training.di.koin.ScopesAndQualifersKt;
import com.huami.training.dto.DisplayMode;
import com.huami.training.dto.TargetMode;
import com.huami.training.dto.TrainingPlanState;
import com.huami.training.ext.DrawableExKt;
import com.huami.training.ext.ImageViewExKt;
import com.huami.training.ext.ViewExKt;
import com.huami.training.helper.AppExecutors;
import com.huami.training.navigation.NavigationController;
import com.huami.training.ui.R;
import com.huami.training.ui.common.CourseLayoutDelegate;
import com.huami.training.ui.entrance.EntranceFragment;
import com.huami.training.ui.tag.TagsAdapter;
import com.huami.training.ui.widget.BannerLineNavigator;
import com.huami.training.ui.widget.CourseBanner;
import com.huami.training.ui.widget.CourseCardView;
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
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
import net.lucode.hackware.magicindicator.MagicIndicator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000»\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\b\b*\u0001f\u0018\u0000 l2\u00020\u0001:\u0001lB\u0007¢\u0006\u0004\bj\u0010kJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u001c\u0010\u0010\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\rH\u0002J\"\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000eH\u0002J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\u0002H\u0016J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020&H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016R\u001d\u00101\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u00106\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00105R\u001d\u0010;\u001a\u0002078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b9\u0010:R\u001d\u0010@\u001a\u00020<8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Z\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010e\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010i\u001a\u00020f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006m"}, d2 = {"Lcom/huami/training/ui/entrance/EntranceFragment;", "Landroidx/fragment/app/Fragment;", "", "P", ExifInterface.LATITUDE_SOUTH, "J", "H", "R", "N", "Lcom/huami/training/vo/EntranceSubjectVo;", "subject", "jumpToTarget", "i0", "Lcom/huami/training/vo/Resource;", "", "it", "z", "Lcom/huami/training/dto/DisplayMode;", "displayMode", "list", "getSubject", "Lcom/huami/training/dto/TargetMode;", "targetMode", "", "k0", "(Lcom/huami/training/dto/TargetMode;)Ljava/lang/Integer;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "onPause", "", "isVisibleToUser", "setUserVisibleHint", "hidden", "onHiddenChanged", "onDestroyView", "Lcom/huami/training/helper/AppExecutors;", "a", "Lkotlin/Lazy;", LogUtil.D, "()Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lcom/huami/training/navigation/NavigationController;", "b", "E", "()Lcom/huami/training/navigation/NavigationController;", "navigationController", "Lcom/huami/training/ui/entrance/EntranceViewModel;", "c", "G", "()Lcom/huami/training/ui/entrance/EntranceViewModel;", "viewModel", "Lcom/huami/training/ui/common/CourseLayoutDelegate;", GoogleApiAvailabilityLight.a, "F", "()Lcom/huami/training/ui/common/CourseLayoutDelegate;", "tagsDelegate", "Lcom/huami/training/ui/entrance/EntranceAdapter;", "e", "Lcom/huami/training/ui/entrance/EntranceAdapter;", "entranceAdapter", "Lcom/huami/training/ui/entrance/EntranceBannerPagerAdapter;", "f", "Lcom/huami/training/ui/entrance/EntranceBannerPagerAdapter;", "bannerAdapter", "Lcom/huami/training/ui/widget/BannerLineNavigator;", "g", "Lcom/huami/training/ui/widget/BannerLineNavigator;", "bannerLineNavigator", "Lcom/huami/training/ui/entrance/EntranceTodayTrainingAdapter;", "h", "Lcom/huami/training/ui/entrance/EntranceTodayTrainingAdapter;", "todayTrainingAdapter", "Lcom/huami/training/ui/tag/TagsAdapter;", "i", "Lcom/huami/training/ui/tag/TagsAdapter;", "todayTagAdapter", z.j, "Landroid/view/View;", "header", hl.k, "Z", "hasObserved", "Lcom/huami/training/utils/FragmentTrackHelper;", "l", "Lcom/huami/training/utils/FragmentTrackHelper;", "trackHelper", "", "m", "Ljava/lang/Long;", BloodPressureConst.ParamKey.PLANID, GoogleApiAvailabilityLight.b, LogUtil.I, "scrollDistance", "com/huami/training/ui/entrance/EntranceFragment$scrollListener$1", "o", "Lcom/huami/training/ui/entrance/EntranceFragment$scrollListener$1;", "scrollListener", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class EntranceFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

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
    private final Lazy tagsDelegate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private EntranceAdapter entranceAdapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private EntranceBannerPagerAdapter bannerAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private BannerLineNavigator bannerLineNavigator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private EntranceTodayTrainingAdapter todayTrainingAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private TagsAdapter todayTagAdapter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private View header;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean hasObserved;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final FragmentTrackHelper trackHelper;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private Long planId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int scrollDistance;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final EntranceFragment$scrollListener$1 scrollListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/training/ui/entrance/EntranceFragment$Companion;", "", "Lcom/huami/training/ui/entrance/EntranceFragment;", "create", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EntranceFragment create() {
            return new EntranceFragment();
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/vo/EntranceSubjectVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<EntranceSubjectVo, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull EntranceSubjectVo entranceSubjectVo) {
            EntranceFragment.this.jumpToTarget(entranceSubjectVo);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EntranceSubjectVo entranceSubjectVo) {
            a(entranceSubjectVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/vo/TrainingVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<TrainingVo, Unit> {
        public final /* synthetic */ RecyclerView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RecyclerView recyclerView) {
            super(1);
            this.b = recyclerView;
        }

        public final void a(@NotNull TrainingVo trainingVo) {
            EntranceFragment.this.E().navigateToTrainingDetail(this.b.getContext(), trainingVo.getId(), trainingVo.getTrainingType());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TrainingVo trainingVo) {
            a(trainingVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/vo/TagVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<TagVo, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull TagVo tagVo) {
            AnalyticsHelper.INSTANCE.countCourseTag(tagVo.getName());
            EntranceFragment.this.G().setTodayTag(tagVo.getId());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TagVo tagVo) {
            a(tagVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lcom/huami/training/vo/TrainingVo;", "courseVo", "", "position", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function2<TrainingVo, Integer, Unit> {
        public final /* synthetic */ View b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(2);
            this.b = view;
        }

        public final void a(@NotNull TrainingVo trainingVo, int i) {
            AnalyticsHelper.INSTANCE.countCourseTodayClicked(i, String.valueOf(trainingVo.getId()), trainingVo.getLabel());
            EntranceFragment.this.E().navigateToTrainingDetail(this.b.getContext(), trainingVo.getId(), trainingVo.getTrainingType());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(TrainingVo trainingVo, Integer num) {
            a(trainingVo, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/vo/TrainingVo;", "courseVo", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<TrainingVo, Unit> {
        public final /* synthetic */ View b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(1);
            this.b = view;
        }

        public final void a(@NotNull TrainingVo trainingVo) {
            AnalyticsHelper.INSTANCE.countAddCourseClicked();
            EntranceFragment.this.E().navigateToTrainingDetail(this.b.getContext(), trainingVo.getId(), trainingVo.getTrainingType());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TrainingVo trainingVo) {
            a(trainingVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "jumpType", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function2<String, Integer, Unit> {
        public final /* synthetic */ View a;
        public final /* synthetic */ EntranceFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(View view, EntranceFragment entranceFragment) {
            super(2);
            this.a = view;
            this.b = entranceFragment;
        }

        public final void a(@Nullable String str, int i) {
            Context context = this.a.getContext();
            if (context != null) {
                this.b.E().navigateToTrainingFilterList(context, str);
            }
            AnalyticsHelper.INSTANCE.countKingKongIconClicked(str);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            a(str, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<Long, Unit> {
        public static final g a = new g();

        public g() {
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
    public static final class h extends Lambda implements Function0<Unit> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AnalyticsHelper.INSTANCE.countMainCourseVisit();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.huami.training.ui.entrance.EntranceFragment$scrollListener$1] */
    public EntranceFragment() {
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.appExecutors = LazyKt__LazyJVMKt.lazy(new Function0<AppExecutors>() { // from class: com.huami.training.ui.entrance.EntranceFragment$special$$inlined$injectInTr$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.training.helper.AppExecutors, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AppExecutors getA() {
                return ScopesAndQualifersKt.trainingScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(new Function0<NavigationController>() { // from class: com.huami.training.ui.entrance.EntranceFragment$special$$inlined$injectInTr$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.training.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NavigationController getA() {
                return ScopesAndQualifersKt.trainingScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(NavigationController.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<EntranceViewModel>() { // from class: com.huami.training.ui.entrance.EntranceFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.entrance.EntranceViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final EntranceViewModel getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(EntranceViewModel.class), objArr4, objArr5);
            }
        });
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.tagsDelegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<CourseLayoutDelegate>() { // from class: com.huami.training.ui.entrance.EntranceFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.common.CourseLayoutDelegate, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final CourseLayoutDelegate getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(CourseLayoutDelegate.class), objArr6, objArr7);
            }
        });
        this.trackHelper = FragmentTrackHelperKt.trackHelper(this, g.a, h.a);
        this.scrollListener = new RecyclerView.OnScrollListener() { // from class: com.huami.training.ui.entrance.EntranceFragment$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                this.a.scrollDistance += dy;
                float f2 = this.a.scrollDistance > 255 ? 1.0f : this.a.scrollDistance / 255.0f;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                View view = this.a.getView();
                int i = (int) (255 * f2);
                ((ConstraintLayout) (view == null ? null : view.findViewById(R.id.title_layout))).setBackgroundColor(Color.argb(i, 255, 255, 255));
                View view2 = this.a.getView();
                (view2 == null ? null : view2.findViewById(R.id.status_mask)).setBackgroundColor(Color.argb(i, 255, 255, 255));
                View view3 = this.a.getView();
                ((TypefaceTextView) (view3 == null ? null : view3.findViewById(R.id.title))).setTextColor(Color.argb(i, 0, 0, 0));
                Drawable drawable = ContextCompat.getDrawable(recyclerView.getContext(), R.drawable.tr_ic_search_white);
                if (drawable == null) {
                    return;
                }
                Drawable drawableTint = DrawableExKt.tint(drawable, ArgbEvaluatorCompat.getInstance().evaluate((float) Math.pow(f2, 3), (Integer) (-1), (Integer) (-16777216)).intValue());
                if (drawableTint == null) {
                    return;
                }
                View view4 = this.a.getView();
                ((ImageView) (view4 != null ? view4.findViewById(R.id.search) : null)).setImageDrawable(drawableTint);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(EntranceFragment entranceFragment, EntranceSubjectVo entranceSubjectVo, View view) {
        entranceFragment.jumpToTarget(entranceSubjectVo);
        if (entranceSubjectVo.getTrainingType() == null) {
            AnalyticsHelper.INSTANCE.countTopicEvent(entranceSubjectVo.getId(), true);
        } else {
            AnalyticsHelper.INSTANCE.countTopicEvent(String.valueOf(entranceSubjectVo.getTrainingId()), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(EntranceFragment entranceFragment, EntranceSubjectVo entranceSubjectVo, View view) {
        entranceFragment.jumpToTarget(entranceSubjectVo);
        if (entranceSubjectVo.getTrainingType() == null) {
            AnalyticsHelper.INSTANCE.countTopicShort(true, entranceSubjectVo.getId(), true);
        } else {
            AnalyticsHelper.INSTANCE.countTopicShort(true, String.valueOf(entranceSubjectVo.getTrainingId()), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(EntranceFragment entranceFragment, EntranceSubjectVo entranceSubjectVo, View view) {
        entranceFragment.jumpToTarget(entranceSubjectVo);
        if (entranceSubjectVo.getTrainingType() == null) {
            AnalyticsHelper.INSTANCE.countTopicShort(false, entranceSubjectVo.getId(), true);
        } else {
            AnalyticsHelper.INSTANCE.countTopicShort(false, String.valueOf(entranceSubjectVo.getTrainingId()), false);
        }
    }

    private final AppExecutors D() {
        return (AppExecutors) this.appExecutors.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController E() {
        return (NavigationController) this.navigationController.getValue();
    }

    private final CourseLayoutDelegate F() {
        return (CourseLayoutDelegate) this.tagsDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EntranceViewModel G() {
        return (EntranceViewModel) this.viewModel.getValue();
    }

    private final void H() {
        EntranceBannerPagerAdapter entranceBannerPagerAdapter = new EntranceBannerPagerAdapter();
        this.bannerAdapter = entranceBannerPagerAdapter;
        entranceBannerPagerAdapter.setItemClickListener(new a());
        View view = this.header;
        if (view == null) {
            return;
        }
        ((CourseBanner) view.findViewById(R.id.entrance_banner)).setAdapter(this.bannerAdapter);
        ((MagicIndicator) view.findViewById(R.id.entrance_indicator)).setNavigator(this.bannerLineNavigator);
        BannerLineNavigator bannerLineNavigator = this.bannerLineNavigator;
        if (bannerLineNavigator == null) {
            return;
        }
        bannerLineNavigator.setNavigatorChangeListener(new BannerLineNavigator.OnNavigatorChangeListener() { // from class: um1
            @Override // com.huami.training.ui.widget.BannerLineNavigator.OnNavigatorChangeListener
            public final void onPageSelected(int i) {
                EntranceFragment.I(this.a, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(EntranceFragment entranceFragment, int i) {
        EntranceBannerPagerAdapter entranceBannerPagerAdapter = entranceFragment.bannerAdapter;
        EntranceSubjectVo item = entranceBannerPagerAdapter == null ? null : entranceBannerPagerAdapter.getItem(i);
        if (item == null) {
            return;
        }
        if (item.getTrainingType() == null) {
            AnalyticsHelper.INSTANCE.countBannerItemVisit(item.getId(), i, true);
        } else {
            AnalyticsHelper.INSTANCE.countBannerItemVisit(String.valueOf(item.getTrainingId()), i, false);
        }
    }

    private final void J() {
        View view = this.header;
        if (view == null) {
            return;
        }
        ((CourseCardView) view.findViewById(R.id.card_training_plan_empty)).setOnClickListener(new View.OnClickListener() { // from class: ym1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EntranceFragment.K(this.a, view2);
            }
        });
        view.findViewById(R.id.card_training_plan).setOnClickListener(new View.OnClickListener() { // from class: fm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EntranceFragment.L(this.a, view2);
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: qm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EntranceFragment.M(this.a, view2);
            }
        };
        ((CourseCardView) view.findViewById(R.id.card_joined_courses_separated)).setOnClickListener(onClickListener);
        view.findViewById(R.id.joined_course).setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(EntranceFragment entranceFragment, View view) {
        AnalyticsHelper.INSTANCE.countStartTraining();
        entranceFragment.E().navigateToCreatePlanPage(view.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(EntranceFragment entranceFragment, View view) {
        AnalyticsHelper.INSTANCE.countContinuePlanClickInCourse(entranceFragment.planId);
        entranceFragment.E().navigateToPlanDetailPage(view.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(EntranceFragment entranceFragment, View view) {
        AnalyticsHelper.INSTANCE.countContinueCourse();
        entranceFragment.E().navigateToJoinedTrainingList(view.getContext());
    }

    private final void N() {
        View view = getView();
        RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.recycler_view));
        EntranceAdapter entranceAdapter = new EntranceAdapter(recyclerView.getContext(), new b(recyclerView));
        this.entranceAdapter = entranceAdapter;
        recyclerView.setAdapter(entranceAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new VerticalLinearSpacingDecoration(0, (int) ViewExKt.dpToPx(recyclerView, 7.0f), 0, (int) ViewExKt.dpToPx(recyclerView, 7.0f), 1, 5, null));
        recyclerView.setHasFixedSize(true);
        recyclerView.addOnScrollListener(this.scrollListener);
        recyclerView.setItemAnimator(null);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i = R.layout.tr_entrance_head;
        View view2 = getView();
        View viewInflate = layoutInflaterFrom.inflate(i, (ViewGroup) (view2 == null ? null : view2.findViewById(R.id.recycler_view)), false);
        EntranceAdapter entranceAdapter2 = this.entranceAdapter;
        if (entranceAdapter2 != null) {
            entranceAdapter2.setHeaderView(viewInflate);
        }
        this.header = viewInflate;
        View view3 = getView();
        ((ImageView) (view3 != null ? view3.findViewById(R.id.search) : null)).setOnClickListener(new View.OnClickListener() { // from class: xm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                EntranceFragment.O(this.a, view4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(EntranceFragment entranceFragment, View view) {
        Context context = entranceFragment.getContext();
        if (context == null) {
            return;
        }
        entranceFragment.E().navigateToSearch(context);
        AnalyticsHelper.INSTANCE.recordDefaultSearchCourseEvent();
    }

    private final void P() {
        View view = getView();
        final CustomSmartRefreshLayout customSmartRefreshLayout = (CustomSmartRefreshLayout) (view == null ? null : view.findViewById(R.id.smart_refresh));
        customSmartRefreshLayout.setEnableLoadmore(false);
        customSmartRefreshLayout.setEnableRefresh(true);
        customSmartRefreshLayout.setOnRefreshListener(new OnRefreshListener() { // from class: vm1
            @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
            public final void onRefresh(RefreshLayout refreshLayout) {
                EntranceFragment.Q(customSmartRefreshLayout, this, refreshLayout);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(CustomSmartRefreshLayout customSmartRefreshLayout, EntranceFragment entranceFragment, RefreshLayout refreshLayout) {
        customSmartRefreshLayout.autoRefresh();
        entranceFragment.G().refresh();
    }

    private final void R() {
        View view = this.header;
        if (view == null) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.today_tag);
        TagsAdapter tagsAdapter = new TagsAdapter(F(), 0, new c(), 2, null);
        this.todayTagAdapter = tagsAdapter;
        recyclerView.setAdapter(tagsAdapter);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext());
        flexboxLayoutManager.setFlexDirection(0);
        Unit unit = Unit.INSTANCE;
        recyclerView.setLayoutManager(flexboxLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.rcv_today_training);
        EntranceTodayTrainingAdapter entranceTodayTrainingAdapter = new EntranceTodayTrainingAdapter(D());
        this.todayTrainingAdapter = entranceTodayTrainingAdapter;
        recyclerView2.setAdapter(entranceTodayTrainingAdapter);
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView2.getContext(), 1);
        Drawable drawable = ContextCompat.getDrawable(recyclerView2.getContext(), R.drawable.tr_item_divider);
        if (drawable != null) {
            dividerItemDecoration.setDrawable(drawable);
        }
        recyclerView2.addItemDecoration(dividerItemDecoration);
        EntranceTodayTrainingAdapter entranceTodayTrainingAdapter2 = this.todayTrainingAdapter;
        if (entranceTodayTrainingAdapter2 != null) {
            entranceTodayTrainingAdapter2.setItemClickListener(new d(view));
        }
        EntranceTodayTrainingAdapter entranceTodayTrainingAdapter3 = this.todayTrainingAdapter;
        if (entranceTodayTrainingAdapter3 == null) {
            return;
        }
        entranceTodayTrainingAdapter3.setJoinCourseClickListener(new e(view));
    }

    private final void S() {
        if (this.hasObserved) {
            return;
        }
        this.hasObserved = true;
        G().getConfigFetchResult().observe(this, new Observer() { // from class: sm1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceFragment.W((Resource) obj);
            }
        });
        G().getRefreshState().observe(this, new Observer() { // from class: mm1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceFragment.b0(this.a, (Boolean) obj);
            }
        });
        G().getEntranceCard().observe(this, new Observer() { // from class: tm1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceFragment.f0((Resource) obj);
            }
        });
        G().getBanners().observe(this, new Observer() { // from class: jm1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceFragment.g0(this.a, (Resource) obj);
            }
        });
        G().getSubjects().observe(this, new Observer() { // from class: im1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceFragment.h0(this.a, (Resource) obj);
            }
        });
        G().getKingIcons().observe(this, new Observer() { // from class: gm1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceFragment.T(this.a, (Resource) obj);
            }
        });
        G().getTrainingPlan().observe(this, new Observer() { // from class: hm1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceFragment.U(this.a, (Resource) obj);
            }
        });
        G().getPlanBgImage().observe(this, new Observer() { // from class: nm1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceFragment.V(this.a, (String) obj);
            }
        });
        G().getAllJoinedCourse().observe(this, new Observer() { // from class: lm1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceFragment.X(this.a, (Resource) obj);
            }
        });
        G().getPlanAndJoinedCourseVisible().observe(this, new Observer() { // from class: om1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceFragment.Y(this.a, (Pair) obj);
            }
        });
        G().getTodayTagResult().observe(this, new Observer() { // from class: dn1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceFragment.Z(this.a, (Resource) obj);
            }
        });
        G().getTodayTrainingResult().observe(this, new Observer() { // from class: km1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceFragment.a0(this.a, (Resource) obj);
            }
        });
        G().getKankanPagedList().observe(this, new Observer() { // from class: cn1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceFragment.c0(this.a, (PagedList) obj);
            }
        });
        G().getKankanNetworkState().observe(this, new Observer() { // from class: rm1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceFragment.d0((Resource) obj);
            }
        });
        G().getKankanRefreshState().observe(this, new Observer() { // from class: pm1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceFragment.e0((Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x002a  */
    public static final void T(EntranceFragment entranceFragment, Resource resource) {
        boolean z;
        View view = entranceFragment.header;
        if (view == null) {
            return;
        }
        int i = R.id.king_zone;
        KingView kingView = (KingView) view.findViewById(i);
        if (resource.getData() != null) {
            Collection collection = (Collection) resource.getData();
            z = collection == null || collection.isEmpty() ? false : true;
        }
        ViewExKt.setVisible(kingView, z);
        List<EntranceKingVo> list = (List) resource.getData();
        if (list == null) {
            return;
        }
        ((KingView) view.findViewById(i)).setData(list);
        ((KingView) view.findViewById(i)).setOnItemClickListener(new f(view, entranceFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(EntranceFragment entranceFragment, Resource resource) {
        TrainingPlanVo trainingPlanVo;
        View view = entranceFragment.header;
        if (view == null || (trainingPlanVo = (TrainingPlanVo) resource.getData()) == null) {
            return;
        }
        View view2 = entranceFragment.getView();
        ((TypefaceTextView) (view2 == null ? null : view2.findViewById(R.id.tv_training_plan_days))).setText(WhenMappings.$EnumSwitchMapping$0[trainingPlanVo.getState().ordinal()] == 1 ? view.getResources().getQuantityString(R.plurals.tr_wait_x_days_then_begin, trainingPlanVo.getWaitDays(), Integer.valueOf(trainingPlanVo.getWaitDays())) : entranceFragment.getString(R.string.tr_plan_day_progress, trainingPlanVo.getDayIndex(), Integer.valueOf(trainingPlanVo.getTotalDays())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(EntranceFragment entranceFragment, String str) {
        View view;
        if (str == null || (view = entranceFragment.header) == null) {
            return;
        }
        ImageViewExKt.loadUrlWithCorner((ImageView) view.findViewById(R.id.training_plan_empty_bg_image), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(Resource resource) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(EntranceFragment entranceFragment, Resource resource) {
        Integer num;
        View view = entranceFragment.header;
        if (view == null || (num = (Integer) resource.getData()) == null) {
            return;
        }
        int iIntValue = num.intValue();
        String quantityString = view.getResources().getQuantityString(R.plurals.tr_total_group_number, iIntValue, Integer.valueOf(iIntValue));
        View viewFindViewById = view.findViewById(R.id.joined_course);
        int i = R.id.joined_course_count;
        ((TypefaceTextView) viewFindViewById.findViewById(i)).setText(quantityString);
        ((TypefaceTextView) ((CourseCardView) view.findViewById(R.id.card_joined_courses_separated)).findViewById(i)).setText(quantityString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(EntranceFragment entranceFragment, Pair pair) {
        Pair pair2 = (Pair) pair.component1();
        boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
        Boolean bool = (Boolean) pair2.getFirst();
        Long l = (Long) pair2.getSecond();
        entranceFragment.planId = l;
        View view = entranceFragment.header;
        if (view == null) {
            return;
        }
        int i = R.id.joined_course;
        if ((view.findViewById(i).getVisibility() == 8 && zBooleanValue && bool != null && bool.booleanValue()) || (((CourseCardView) view.findViewById(R.id.card_joined_courses_separated)).getVisibility() == 8 && zBooleanValue && bool != null && !bool.booleanValue())) {
            AnalyticsHelper.INSTANCE.countCourseContinueVisit();
        }
        int i2 = R.id.card_training_plan_empty;
        if (((CourseCardView) view.findViewById(i2)).getVisibility() == 8 && bool != null && !bool.booleanValue()) {
            AnalyticsHelper.INSTANCE.countStartPlanVisitInCourse();
        }
        int i3 = R.id.card_my_training_both;
        if (((CourseCardView) view.findViewById(i3)).getVisibility() == 8 && bool != null && bool.booleanValue()) {
            AnalyticsHelper.INSTANCE.countContinuePlanVisitInCourse(l);
        }
        ViewExKt.setVisible((CourseCardView) view.findViewById(i3), bool != null && bool.booleanValue());
        ViewExKt.setVisible((CourseCardView) view.findViewById(i2), (bool == null || bool.booleanValue()) ? false : true);
        ViewExKt.setVisible(view.findViewById(R.id.card_my_training_both_divider), zBooleanValue && bool != null && bool.booleanValue());
        ViewExKt.setVisible(view.findViewById(i), bool != null && bool.booleanValue() && zBooleanValue);
        ViewExKt.setVisible((CourseCardView) view.findViewById(R.id.card_joined_courses_separated), (!zBooleanValue || bool == null || bool.booleanValue()) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(EntranceFragment entranceFragment, Resource resource) {
        View view = entranceFragment.header;
        if (view == null) {
            return;
        }
        List<TagVo> list = (List) resource.getData();
        if (list != null && !list.isEmpty()) {
            TagsAdapter tagsAdapter = entranceFragment.todayTagAdapter;
            if (tagsAdapter != null) {
                tagsAdapter.setNewData(list);
            }
            TagsAdapter tagsAdapter2 = entranceFragment.todayTagAdapter;
            if (tagsAdapter2 != null) {
                tagsAdapter2.selectItem(0);
            }
            entranceFragment.G().setTodayTag(list.get(0).getId());
            if (((ConstraintLayout) view.findViewById(R.id.today_zone)).getVisibility() == 8) {
                AnalyticsHelper analyticsHelper = AnalyticsHelper.INSTANCE;
                analyticsHelper.countCourseTagVisit(list);
                analyticsHelper.countCourseMoreVisit();
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.today_zone);
        Collection collection = (Collection) resource.getData();
        ViewExKt.setVisible(constraintLayout, !(collection == null || collection.isEmpty()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    public static final void a0(EntranceFragment entranceFragment, Resource resource) {
        boolean z;
        boolean z2;
        View view = entranceFragment.header;
        if (view == null) {
            return;
        }
        CourseCardView courseCardView = (CourseCardView) view.findViewById(R.id.today_training_error);
        if (resource.getStatus() != Status.ERROR) {
            if (resource.getStatus() == Status.SUCCESS) {
                Collection collection = (Collection) resource.getData();
                z = collection == null || collection.isEmpty();
            }
        }
        ViewExKt.setVisible(courseCardView, z);
        CourseCardView courseCardView2 = (CourseCardView) view.findViewById(R.id.today_training);
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
        ViewExKt.setVisible(courseCardView2, z2);
        Collection collection3 = (Collection) resource.getData();
        if (collection3 == null || collection3.isEmpty()) {
            EntranceTodayTrainingAdapter entranceTodayTrainingAdapter = entranceFragment.todayTrainingAdapter;
            if (entranceTodayTrainingAdapter == null) {
                return;
            }
            entranceTodayTrainingAdapter.submitList(CollectionsKt__CollectionsKt.emptyList());
            return;
        }
        EntranceTodayTrainingAdapter entranceTodayTrainingAdapter2 = entranceFragment.todayTrainingAdapter;
        if (entranceTodayTrainingAdapter2 == null) {
            return;
        }
        entranceTodayTrainingAdapter2.submitList((List) resource.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(EntranceFragment entranceFragment, Boolean bool) {
        View view = entranceFragment.getView();
        if (((CustomSmartRefreshLayout) (view == null ? null : view.findViewById(R.id.smart_refresh))).isRefreshing() && bool.booleanValue()) {
            View view2 = entranceFragment.getView();
            ((CustomSmartRefreshLayout) (view2 != null ? view2.findViewById(R.id.smart_refresh) : null)).finishRefresh(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(EntranceFragment entranceFragment, PagedList pagedList) {
        EntranceAdapter entranceAdapter = entranceFragment.entranceAdapter;
        if (entranceAdapter != null) {
            entranceAdapter.submitList(pagedList);
        }
        View view = entranceFragment.header;
        if (view == null) {
            return;
        }
        ViewExKt.setVisible((TypefaceTextView) view.findViewById(R.id.kankan_title), !pagedList.isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(Resource resource) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(Resource resource) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(Resource resource) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(EntranceFragment entranceFragment, Resource resource) {
        EntranceBannerPagerAdapter entranceBannerPagerAdapter = entranceFragment.bannerAdapter;
        if (entranceBannerPagerAdapter != null) {
            entranceBannerPagerAdapter.setNewData((List) resource.getData());
        }
        List list = (List) resource.getData();
        if (list == null) {
            return;
        }
        int size = list.size();
        View view = entranceFragment.header;
        if (view == null) {
            return;
        }
        if (size > 0) {
            CourseBanner courseBanner = (CourseBanner) view.findViewById(R.id.entrance_banner);
            if (courseBanner != null) {
                courseBanner.bind((MagicIndicator) view.findViewById(R.id.entrance_indicator), size, true);
            }
            BannerLineNavigator bannerLineNavigator = entranceFragment.bannerLineNavigator;
            if (bannerLineNavigator != null) {
                bannerLineNavigator.onPageSelected(0);
            }
        }
        BannerLineNavigator bannerLineNavigator2 = entranceFragment.bannerLineNavigator;
        if (bannerLineNavigator2 == null) {
            return;
        }
        bannerLineNavigator2.setTotalCount(size);
        bannerLineNavigator2.notifyDataSetChanged();
    }

    private final EntranceSubjectVo getSubject(DisplayMode displayMode, List<EntranceSubjectVo> list) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(EntranceFragment entranceFragment, Resource resource) {
        entranceFragment.z(resource);
    }

    private final void i0() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        int statusBarHeight = BaseTitleActivity.getStatusBarHeight(context);
        View view = getView();
        ViewGroup.LayoutParams layoutParams = (view == null ? null : view.findViewById(R.id.status_mask)).getLayoutParams();
        layoutParams.height = statusBarHeight;
        View view2 = getView();
        (view2 == null ? null : view2.findViewById(R.id.status_mask)).setLayoutParams(layoutParams);
        View view3 = getView();
        ((TypefaceTextView) (view3 != null ? view3.findViewById(R.id.title) : null)).setOnClickListener(new View.OnClickListener() { // from class: wm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                EntranceFragment.j0(this.a, view4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(EntranceFragment entranceFragment, View view) {
        if (entranceFragment.scrollDistance > entranceFragment.getResources().getDisplayMetrics().heightPixels) {
            View view2 = entranceFragment.getView();
            ((RecyclerView) (view2 == null ? null : view2.findViewById(R.id.recycler_view))).smoothScrollToPosition(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jumpToTarget(EntranceSubjectVo subject) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        E().navigateToSpecialPagerFromAd(context, k0(subject.getTargetMode()), subject.getTargetUrl());
    }

    private final Integer k0(TargetMode targetMode) {
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

    private final void z(Resource<? extends List<EntranceSubjectVo>> it2) {
        View view = this.header;
        if (view == null) {
            return;
        }
        final EntranceSubjectVo subject = getSubject(DisplayMode.LARGE, it2.getData());
        final EntranceSubjectVo subject2 = getSubject(DisplayMode.LEFT, it2.getData());
        final EntranceSubjectVo subject3 = getSubject(DisplayMode.RIGHT, it2.getData());
        if (subject == null || subject2 == null || subject3 == null) {
            ViewExKt.setVisible((ConstraintLayout) view.findViewById(R.id.subject_zone), false);
            ViewExKt.setVisible((CourseCardView) view.findViewById(R.id.subject_top), false);
            ViewExKt.setVisible((CourseCardView) view.findViewById(R.id.subject_left), false);
            ViewExKt.setVisible((CourseCardView) view.findViewById(R.id.subject_right), false);
            return;
        }
        ViewExKt.setVisible((ConstraintLayout) view.findViewById(R.id.subject_zone), true);
        int i = R.id.subject_top;
        if (((CourseCardView) view.findViewById(i)).getVisibility() == 8) {
            if (subject.getTrainingType() == null) {
                AnalyticsHelper.INSTANCE.countTopicVisit(subject.getId(), true);
            } else {
                AnalyticsHelper.INSTANCE.countTopicVisit(String.valueOf(subject.getTrainingId()), false);
            }
            ViewExKt.setVisible((CourseCardView) view.findViewById(i), true);
        }
        ((TypefaceTextView) view.findViewById(R.id.subject_title_top)).setText(subject.getTitle());
        ((TypefaceTextView) view.findViewById(R.id.subject_subtitle_top)).setText(subject.getSubtitle());
        ImageViewExKt.loadUrlWithCorner((ImageView) view.findViewById(R.id.subject_img_top), subject.getImageUrl());
        ((CourseCardView) view.findViewById(i)).setOnClickListener(new View.OnClickListener() { // from class: zm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EntranceFragment.A(this.a, subject, view2);
            }
        });
        int i2 = R.id.subject_left;
        if (((CourseCardView) view.findViewById(i2)).getVisibility() == 8) {
            if (subject2.getTrainingType() == null) {
                AnalyticsHelper.INSTANCE.countTopicShortVisit(true, subject2.getId(), true);
            } else {
                AnalyticsHelper.INSTANCE.countTopicShortVisit(true, String.valueOf(subject2.getTrainingId()), false);
            }
            ViewExKt.setVisible((CourseCardView) view.findViewById(i2), true);
        }
        ((TypefaceTextView) view.findViewById(R.id.subject_title_left)).setText(subject2.getTitle());
        ((TypefaceTextView) view.findViewById(R.id.subject_subtitle_left)).setText(subject2.getSubtitle());
        ImageViewExKt.loadUrlWithCorner((ImageView) view.findViewById(R.id.subject_img_left), subject2.getImageUrl());
        ((CourseCardView) view.findViewById(i2)).setOnClickListener(new View.OnClickListener() { // from class: an1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EntranceFragment.B(this.a, subject2, view2);
            }
        });
        int i3 = R.id.subject_right;
        if (((CourseCardView) view.findViewById(i3)).getVisibility() == 8) {
            if (subject3.getTrainingType() == null) {
                AnalyticsHelper.INSTANCE.countTopicShortVisit(false, subject3.getId(), true);
            } else {
                AnalyticsHelper.INSTANCE.countTopicShortVisit(false, String.valueOf(subject3.getTrainingId()), false);
            }
            ViewExKt.setVisible((CourseCardView) view.findViewById(i3), true);
        }
        ((TypefaceTextView) view.findViewById(R.id.subject_title_right)).setText(subject3.getTitle());
        ((TypefaceTextView) view.findViewById(R.id.subject_subtitle_right)).setText(subject3.getSubtitle());
        ImageViewExKt.loadUrlWithCorner((ImageView) view.findViewById(R.id.subject_img_right), subject3.getImageUrl());
        ((CourseCardView) view.findViewById(i3)).setOnClickListener(new View.OnClickListener() { // from class: bn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EntranceFragment.C(this.a, subject3, view2);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_entrance, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.scrollDistance = 0;
        this.hasObserved = false;
        View view = getView();
        ((RecyclerView) (view == null ? null : view.findViewById(R.id.recycler_view))).removeOnScrollListener(this.scrollListener);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        this.trackHelper.trackOnHiddenChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        CourseBanner courseBanner;
        super.onPause();
        this.trackHelper.trackOnPause();
        View view = this.header;
        if (view == null || (courseBanner = (CourseBanner) view.findViewById(R.id.entrance_banner)) == null) {
            return;
        }
        courseBanner.stopAutoPlay();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.trackHelper.trackOnResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        N();
        P();
        i0();
        H();
        R();
        J();
        if (getUserVisibleHint()) {
            S();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        this.trackHelper.trackOnUserVisibleHint();
        if (!isVisibleToUser || getView() == null) {
            return;
        }
        S();
    }
}
