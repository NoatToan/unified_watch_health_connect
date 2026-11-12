package com.huami.training.ui.course;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.p008lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.di.koin.ScopesAndQualifersKt;
import com.huami.training.navigation.NavigationController;
import com.huami.training.ui.R;
import com.huami.training.ui.course.TrainingFilterListActivity;
import com.huami.training.utils.AnalyticsHelper;
import com.huami.training.vo.FilterInfo;
import com.huami.training.vo.FilterModeVo;
import com.huami.training.vo.Resource;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import defpackage.GlobalTitleStyleKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.m;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 72\u00020\u0001:\u000278B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0016\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fR\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\u00060\"R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R&\u0010+\u001a\u0012\u0012\u0004\u0012\u00020'0&j\b\u0012\u0004\u0012\u00020'`(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R&\u0010.\u001a\u0012\u0012\u0004\u0012\u00020,0&j\b\u0012\u0004\u0012\u00020,`(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u0018\u00101\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00069"}, d2 = {"Lcom/huami/training/ui/course/TrainingFilterListActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "r", "initTitle", DTransferConstants.SEARCH_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onPostCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onRightOnClicked", "", "position", "", StatEvent.MINE_KINGKONG_C_ORDER_VALUE, "refreshSelectedPage", "Lcom/huami/training/navigation/NavigationController;", "x", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.b, "()Lcom/huami/training/navigation/NavigationController;", "navigationController", "Lcom/huami/training/ui/course/TrainingFilterListDelegate;", "y", "o", "()Lcom/huami/training/ui/course/TrainingFilterListDelegate;", "uiDelegate", "Lcom/huami/training/ui/course/TrainingFilterViewModel;", "z", b.r, "()Lcom/huami/training/ui/course/TrainingFilterViewModel;", "viewModel", "Lcom/huami/training/ui/course/TrainingFilterListActivity$TrainingFilterPagerAdapter;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/huami/training/ui/course/TrainingFilterListActivity$TrainingFilterPagerAdapter;", "pagerAdapter", "Ljava/util/ArrayList;", "Lcom/huami/training/vo/FilterModeVo;", "Lkotlin/collections/ArrayList;", "B", "Ljava/util/ArrayList;", "filterModeData", "Lcom/huami/training/ui/course/TrainingFilterListFragment;", "C", "fragments", LogUtil.D, "Ljava/lang/String;", "jumpType", "E", LogUtil.I, "currentItem", "<init>", "()V", "Companion", "TrainingFilterPagerAdapter", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingFilterListActivity extends BaseTitleActivity {

    @NotNull
    public static final String FILTER_MODE_ORDER_ASC = "ASC";

    @NotNull
    public static final String FILTER_MODE_ORDER_DESC = "DESC";

    @NotNull
    public static final String JUMP_TYPE = "JUMP_TYPE";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private TrainingFilterPagerAdapter pagerAdapter;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<FilterModeVo> filterModeData;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<TrainingFilterListFragment> fragments;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    private String jumpType;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private int currentItem;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy uiDelegate;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/training/ui/course/TrainingFilterListActivity$TrainingFilterPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "getCount", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Lcom/huami/training/ui/course/TrainingFilterListActivity;Landroidx/fragment/app/FragmentManager;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public final class TrainingFilterPagerAdapter extends FragmentPagerAdapter {
        public TrainingFilterPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            return TrainingFilterListActivity.this.fragments.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NotNull
        public Fragment getItem(int position) {
            return (Fragment) TrainingFilterListActivity.this.fragments.get(position);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrainingFilterListActivity() {
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(new Function0<NavigationController>() { // from class: com.huami.training.ui.course.TrainingFilterListActivity$special$$inlined$injectInTr$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.training.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                return ScopesAndQualifersKt.trainingScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(NavigationController.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.uiDelegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TrainingFilterListDelegate>() { // from class: com.huami.training.ui.course.TrainingFilterListActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.course.TrainingFilterListDelegate, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TrainingFilterListDelegate invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(TrainingFilterListDelegate.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TrainingFilterViewModel>() { // from class: com.huami.training.ui.course.TrainingFilterListActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.course.TrainingFilterViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TrainingFilterViewModel invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(TrainingFilterViewModel.class), objArr4, objArr5);
            }
        });
        this.filterModeData = new ArrayList<>();
        this.fragments = new ArrayList<>();
    }

    private final void initTitle() {
        setRightImageRes(R.drawable.ic_search_20, R.color.s2);
    }

    private final NavigationController n() {
        return (NavigationController) this.navigationController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrainingFilterListDelegate o() {
        return (TrainingFilterListDelegate) this.uiDelegate.getValue();
    }

    private final TrainingFilterViewModel p() {
        return (TrainingFilterViewModel) this.viewModel.getValue();
    }

    private final void q() {
        this.pagerAdapter = new TrainingFilterPagerAdapter(getSupportFragmentManager());
        int i = R.id.filter_viewpager;
        ViewPager viewPager = (ViewPager) findViewById(i);
        TrainingFilterPagerAdapter trainingFilterPagerAdapter = this.pagerAdapter;
        Objects.requireNonNull(trainingFilterPagerAdapter);
        viewPager.setAdapter(trainingFilterPagerAdapter);
        ((ViewPager) findViewById(i)).setOffscreenPageLimit(this.fragments.size());
        CommonNavigator commonNavigator = new CommonNavigator(this);
        commonNavigator.setScrollPivotX(0.5f);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = "";
        commonNavigator.setAdapter(new TrainingFilterListActivity$initMagicIndicator$1$1(commonNavigator, this, objectRef, objectRef2, new Ref.BooleanRef()));
        int i2 = R.id.filter_mode;
        ((MagicIndicator) findViewById(i2)).setNavigator(commonNavigator);
        ViewPagerHelper.bind((MagicIndicator) findViewById(i2), (ViewPager) findViewById(i));
    }

    private final void r() {
        this.jumpType = getIntent().getStringExtra(JUMP_TYPE);
        p().getConfigLoadTrigger().observe(this, new Observer() { // from class: dv7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TrainingFilterListActivity.s((Resource) obj);
            }
        });
        p().getFilterModeResult().observe(this, new Observer() { // from class: cv7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TrainingFilterListActivity.t(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(Resource resource) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(TrainingFilterListActivity trainingFilterListActivity, Resource resource) {
        Unit unit;
        List list = (List) resource.getData();
        if (list != null && (!list.isEmpty())) {
            trainingFilterListActivity.filterModeData.clear();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                FilterModeVo filterModeVo = (FilterModeVo) obj;
                trainingFilterListActivity.filterModeData.add(filterModeVo);
                String defaultOrder = filterModeVo.getDefaultOrder();
                FilterInfo filterInfo = new FilterInfo(filterModeVo.getText(), filterModeVo.getJumpType(), !(defaultOrder == null || m.isBlank(defaultOrder)) ? filterModeVo.getDefaultOrder() : FILTER_MODE_ORDER_DESC);
                ArrayList<TrainingFilterListFragment> arrayList2 = trainingFilterListActivity.fragments;
                TrainingFilterListFragment.Companion companion = TrainingFilterListFragment.INSTANCE;
                List<String> supportOrders = filterModeVo.getSupportOrders();
                arrayList2.add(companion.create(filterInfo, supportOrders == null ? 1 : supportOrders.size()));
                String str = trainingFilterListActivity.jumpType;
                if (str == null) {
                    unit = null;
                } else {
                    if (Intrinsics.areEqual(str, filterModeVo.getJumpType())) {
                        trainingFilterListActivity.currentItem = i;
                    }
                    unit = Unit.INSTANCE;
                }
                arrayList.add(unit);
                i = i2;
            }
            trainingFilterListActivity.q();
            ((ViewPager) trainingFilterListActivity.findViewById(R.id.filter_viewpager)).setCurrentItem(trainingFilterListActivity.currentItem, true);
            int i3 = trainingFilterListActivity.currentItem;
            if (i3 == 0) {
                trainingFilterListActivity.fragments.get(i3).setUserVisibleHint(true);
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GlobalTitleStyleKt.setUnifyTitleStyle$default(this, getResources().getString(R.string.tr_all_training_courses), null, 2, null);
        setContentView(R.layout.activity_training_filter_list);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        r();
        initTitle();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onRightOnClicked(@Nullable View view) {
        super.onRightOnClicked(view);
        n().navigateToSearch(this);
        AnalyticsHelper.INSTANCE.recordDefaultSearchCourseEvent();
    }

    public final void refreshSelectedPage(int position, @NotNull String order) {
        if (this.fragments.isEmpty() || position >= this.fragments.size()) {
            return;
        }
        this.fragments.get(position).changedFilterOrder(order);
    }
}
