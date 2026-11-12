package com.huami.watch.companion.ecg.ui.activity;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chenenyu.router.annotation.Route;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.huami.ecg.chart.EcgGridView;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.model.FilterRecord;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import com.huami.watch.companion.ecg.arch.EcgListViewModel;
import com.huami.watch.companion.ecg.media.ExoMediaPlayHelper;
import com.huami.watch.companion.ecg.model.EcgListData;
import com.huami.watch.companion.ecg.model.EcgSection;
import com.huami.watch.companion.ecg.ui.activity.EcgActivity;
import com.huami.watch.companion.ecg.ui.adapter.EcgAdapter;
import com.huami.watch.companion.ecg.util.EcgMedicalUtil;
import com.huami.watch.companion.ecg.util.EcgUtils;
import com.huami.watch.companion.ui.view.HuaMiFontTextView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Route({RouterHelper.ECG_PATH})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\u000f\u001a\u00020\u0002H\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0014R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0019\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001d\u0010\u001e\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/activity/EcgActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initTitle", "t", DTransferConstants.SEARCH_KEY, "observeData", "Landroid/widget/ImageView;", ViewHierarchyConstants.VIEW_KEY, "", "url", "C", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStop", "onDestroy", "Landroid/view/View;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.b, "()Landroid/view/View;", "mFootView", "b", "o", "mJpDescView", "Lcom/huami/watch/companion/ecg/arch/EcgListViewModel;", "c", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/watch/companion/ecg/arch/EcgListViewModel;", "mViewModel", "Lcom/huami/watch/companion/ecg/ui/adapter/EcgAdapter;", GoogleApiAvailabilityLight.a, "m", "()Lcom/huami/watch/companion/ecg/ui/adapter/EcgAdapter;", "mAdapter", "Lcom/huami/watch/companion/ecg/media/ExoMediaPlayHelper;", "e", "Lcom/huami/watch/companion/ecg/media/ExoMediaPlayHelper;", "mPlayer", "<init>", "()V", "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgActivity extends AppCompatActivity {
    private static final int f = 1500;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFootView = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mJpDescView = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter = LazyKt__LazyJVMKt.lazy(new Function0<EcgAdapter>() { // from class: com.huami.watch.companion.ecg.ui.activity.EcgActivity$mAdapter$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgAdapter invoke() {
            final EcgActivity ecgActivity = this.a;
            return new EcgAdapter(new EcgAdapter.EcgItemInitScrop() { // from class: com.huami.watch.companion.ecg.ui.activity.EcgActivity$mAdapter$2.1

                /* JADX INFO: renamed from: com.huami.watch.companion.ecg.ui.activity.EcgActivity$mAdapter$2$1$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/ecg/core/model/FilterRecord;", "filterRecord", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function1<FilterRecord, Unit> {
                    public final /* synthetic */ EcgGridView a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(EcgGridView ecgGridView) {
                        super(1);
                        this.a = ecgGridView;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void a(@Nullable FilterRecord filterRecord) {
                        List<Float> filterData;
                        EcgGridView ecgGridView = this.a;
                        List listEmptyList = null;
                        if (filterRecord != null && (filterData = filterRecord.getFilterData()) != null) {
                            listEmptyList = new ArrayList();
                            int i = 0;
                            for (Object obj : filterData) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                }
                                ((Number) obj).floatValue();
                                if (i <= 1500) {
                                    listEmptyList.add(obj);
                                }
                                i = i2;
                            }
                        }
                        if (listEmptyList == null) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        }
                        ecgGridView.setData(listEmptyList);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(FilterRecord filterRecord) {
                        a(filterRecord);
                        return Unit.INSTANCE;
                    }
                }

                @Override // com.huami.watch.companion.ecg.ui.adapter.EcgAdapter.EcgItemInitScrop
                public void getFilterRecord(@NotNull EcgData data, @NotNull EcgGridView view) {
                    ecgActivity.p().loadFilterRecord(data, true, new a(view));
                }

                @Override // com.huami.watch.companion.ecg.ui.adapter.EcgAdapter.EcgItemInitScrop
                public void playVoiceTag(@NotNull ImageView view, @NotNull String url) throws Exception {
                    ecgActivity.C(view, url);
                }
            });
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private ExoMediaPlayHelper mPlayer;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<View> {
        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return LayoutInflater.from(EcgActivity.this).inflate(R.layout.view_ecg_list_foot, (ViewGroup) EcgActivity.this.findViewById(R.id.ecg_list), false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<View> {
        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return EcgActivity.this.n().findViewById(R.id.ecg_jp_desc);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ecg/arch/EcgListViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<EcgListViewModel> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgListViewModel invoke() {
            return (EcgListViewModel) new ViewModelProvider(EcgActivity.this).get(EcgListViewModel.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "play", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ ImageView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ImageView imageView) {
            super(1);
            this.b = imageView;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (!z) {
                this.b.setImageResource(R.drawable.ic_voice_3);
                return;
            }
            Drawable drawable = ContextCompat.getDrawable(EcgActivity.this, R.drawable.voice_play_bg);
            Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            this.b.setImageDrawable(animationDrawable);
            animationDrawable.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(EcgActivity ecgActivity) {
        ((SmartRefreshLayout) ecgActivity.findViewById(R.id.refresh_layout)).setLoadmoreFinished(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(EcgActivity ecgActivity, List list) {
        ecgActivity.m().setNewData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(ImageView view, String url) throws Exception {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (this.mPlayer == null) {
            this.mPlayer = new ExoMediaPlayHelper(false, 1, defaultConstructorMarker);
        }
        this.mPlayer.setUrl(this, url, null);
        this.mPlayer.play(new d(view));
    }

    private final void initTitle() {
        ((RainbowTitleBar) findViewById(R.id.actionbar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: lf1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgActivity.x(this.a, view);
            }
        });
    }

    private final EcgAdapter m() {
        return (EcgAdapter) this.mAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View n() {
        return (View) this.mFootView.getValue();
    }

    private final View o() {
        return (View) this.mJpDescView.getValue();
    }

    private final void observeData() {
        p().getEcgSectionLiveData().observe(this, new Observer() { // from class: of1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgActivity.B(this.a, (List) obj);
            }
        });
        p().getEcgLatestLiveData().observe(this, new Observer() { // from class: mf1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgActivity.y(this.a, (EcgData) obj);
            }
        });
        p().getHasMoreData().observe(this, new Observer() { // from class: nf1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgActivity.z(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EcgListViewModel p() {
        return (EcgListViewModel) this.mViewModel.getValue();
    }

    private final void q() {
        int i = R.id.ecg_list;
        ((RecyclerView) findViewById(i)).setLayoutManager(new LinearLayoutManager(this));
        m().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: qf1
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                EcgActivity.r(this.a, baseQuickAdapter, view, i2);
            }
        });
        m().setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() { // from class: pf1
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                EcgActivity.s(this.a, baseQuickAdapter, view, i2);
            }
        });
        m().setFooterView(n());
        ((RecyclerView) findViewById(i)).setAdapter(m());
        if (Intrinsics.areEqual(Locale.getDefault(), Locale.JAPANESE) || Intrinsics.areEqual(Locale.getDefault(), Locale.JAPAN)) {
            o().setVisibility(0);
        } else {
            o().setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(EcgActivity ecgActivity, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        EcgListData ecgListData;
        EcgSection ecgSection = (EcgSection) ecgActivity.m().getItem(i);
        if (ecgSection == null || (ecgListData = (EcgListData) ecgSection.t) == null) {
            return;
        }
        EcgDetailActivity.INSTANCE.to(ecgActivity, ecgListData.getEcg().getTimestamp());
        EcgAnalyticsManagerKt.ecgC(ecgListData.getEcg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void s(EcgActivity ecgActivity, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        EcgSection ecgSection;
        EcgListData ecgListData;
        if (view.getId() != R.id.hrv || (ecgSection = (EcgSection) ecgActivity.m().getItem(i)) == null || (ecgListData = (EcgListData) ecgSection.t) == null) {
            return;
        }
        EcgMedicalUtil ecgMedicalUtil = EcgMedicalUtil.INSTANCE;
        if (ecgMedicalUtil.getEcgMedicalService().isMedicalSource(ecgListData.getEcg().getDeviceSource())) {
            ecgListData = null;
        }
        if (ecgListData == null) {
            return;
        }
        ecgMedicalUtil.toHrv(ecgActivity);
    }

    private final void t() {
        int i = R.id.refresh_layout;
        ((SmartRefreshLayout) findViewById(i)).setEnableLoadmore(true);
        ((SmartRefreshLayout) findViewById(i)).setEnableLoadmoreWhenContentNotFull(true);
        ((SmartRefreshLayout) findViewById(i)).setEnableAutoLoadmore(true);
        ((SmartRefreshLayout) findViewById(i)).setEnableRefresh(true);
        ((SmartRefreshLayout) findViewById(i)).setOnLoadmoreListener(new OnLoadmoreListener() { // from class: rf1
            @Override // com.scwang.smartrefresh.layout.listener.OnLoadmoreListener
            public final void onLoadmore(RefreshLayout refreshLayout) {
                EcgActivity.u(this.a, refreshLayout);
            }
        });
        ((SmartRefreshLayout) findViewById(i)).setOnRefreshListener(new OnRefreshListener() { // from class: sf1
            @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
            public final void onRefresh(RefreshLayout refreshLayout) {
                EcgActivity.v(this.a, refreshLayout);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(EcgActivity ecgActivity, RefreshLayout refreshLayout) {
        ecgActivity.p().loadData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(final EcgActivity ecgActivity, RefreshLayout refreshLayout) {
        ((SmartRefreshLayout) ecgActivity.findViewById(R.id.refresh_layout)).post(new Runnable() { // from class: tf1
            @Override // java.lang.Runnable
            public final void run() {
                EcgActivity.w(this.a);
            }
        });
        ecgActivity.p().loadData(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(EcgActivity ecgActivity) {
        ((SmartRefreshLayout) ecgActivity.findViewById(R.id.refresh_layout)).setLoadmoreFinished(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(EcgActivity ecgActivity, View view) {
        ecgActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(EcgActivity ecgActivity, EcgData ecgData) {
        if (ecgData == null) {
            ((CollapsingToolbarLayout) ecgActivity.findViewById(R.id.header)).setVisibility(8);
            ((LinearLayout) ecgActivity.findViewById(R.id.empty_header)).setVisibility(0);
        } else {
            ((CollapsingToolbarLayout) ecgActivity.findViewById(R.id.header)).setVisibility(0);
            ((LinearLayout) ecgActivity.findViewById(R.id.empty_header)).setVisibility(8);
            ((HuaMiFontTextView) ecgActivity.findViewById(R.id.hrv)).setText(String.valueOf((int) Math.rint(EcgUtils.INSTANCE.hrv(ecgData))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(final EcgActivity ecgActivity, Boolean bool) {
        int i = R.id.refresh_layout;
        ((SmartRefreshLayout) ecgActivity.findViewById(i)).finishRefresh();
        ((SmartRefreshLayout) ecgActivity.findViewById(i)).finishLoadmore();
        if (bool.booleanValue()) {
            return;
        }
        ((SmartRefreshLayout) ecgActivity.findViewById(i)).post(new Runnable() { // from class: uf1
            @Override // java.lang.Runnable
            public final void run() {
                EcgActivity.A(this.a);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecg);
        initTitle();
        t();
        q();
        observeData();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mPlayer = null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        ExoMediaPlayHelper exoMediaPlayHelper = this.mPlayer;
        if (exoMediaPlayHelper == null) {
            return;
        }
        exoMediaPlayHelper.stop();
    }
}
