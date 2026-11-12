package com.huami.pai.ui.sporthint;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.ext.ViewExKt;
import com.huami.pai.koin.ScopesAndQualifersKt;
import com.huami.pai.lib.R;
import com.huami.pai.lib.databinding.FragmentPaiSporthintBinding;
import com.huami.pai.sp.ISharedPref;
import com.huami.pai.ui.history.PAIHistoryViewModel;
import com.huami.pai.vo.PAIDataVo;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.training.ui.activity.ActionDetailActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0011\u0010\u001f¨\u0006%"}, d2 = {"Lcom/huami/pai/ui/sporthint/PaiSportHintFragment;", "Landroidx/fragment/app/Fragment;", "", GoogleApiAvailabilityLight.a, "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "position", "setCurrentItem", "Lcom/huami/pai/ui/sporthint/PaiSportHintModel;", "a", "Lcom/huami/pai/ui/sporthint/PaiSportHintModel;", "mPaiSportViewModel", "", "b", "Z", "isRtl", "Lcom/huami/pai/sp/ISharedPref;", "c", "Lkotlin/Lazy;", "()Lcom/huami/pai/sp/ISharedPref;", "mSharedPref", "", "Ljava/lang/String;", "TAG", "Lcom/huami/pai/lib/databinding/FragmentPaiSporthintBinding;", "e", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "()Lcom/huami/pai/lib/databinding/FragmentPaiSporthintBinding;", "binding", "<init>", "()V", "Companion", "ViewPagerAdapter", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiSportHintFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] f;

    @NotNull
    private static final List<PaiSportType> g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private PaiSportHintModel mPaiSportViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isRtl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSharedPref;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String TAG;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/pai/ui/sporthint/PaiSportHintFragment$Companion;", "", "", "a", "", "Lcom/huami/pai/ui/sporthint/PaiSportType;", "sportItems", "Ljava/util/List;", "getSportItems", "()Ljava/util/List;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a() {
            getSportItems().clear();
            getSportItems().add(PaiSportType.RUNNING);
            getSportItems().add(PaiSportType.FAST_WALKING);
            getSportItems().add(PaiSportType.RIDING);
            getSportItems().add(PaiSportType.ROPE_SKIPPING);
            getSportItems().add(PaiSportType.INDOOR_EXERCISE);
        }

        @NotNull
        public final List<PaiSportType> getSportItems() {
            return PaiSportHintFragment.g;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/pai/ui/sporthint/PaiSportHintFragment$ViewPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "getCount", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Lcom/huami/pai/ui/sporthint/PaiSportHintFragment;Landroidx/fragment/app/FragmentManager;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public final class ViewPagerAdapter extends FragmentPagerAdapter {
        public ViewPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager, 1);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            return PaiSportHintFragment.INSTANCE.getSportItems().size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NotNull
        public Fragment getItem(int position) {
            HintFragment hintFragment = new HintFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(ActionDetailActivity.TRAINING_ACTION_CONTENT_POSITION, position);
            Unit unit = Unit.INSTANCE;
            hintFragment.setArguments(bundle);
            return hintFragment;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PaiSportHintFragment.class), "binding", "getBinding()Lcom/huami/pai/lib/databinding/FragmentPaiSporthintBinding;"));
        f = kPropertyArr;
        Companion companion = new Companion(null);
        INSTANCE = companion;
        g = new ArrayList();
        companion.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaiSportHintFragment() {
        super(R.layout.fragment_pai_sporthint);
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mSharedPref = LazyKt__LazyJVMKt.lazy(new Function0<ISharedPref>() { // from class: com.huami.pai.ui.sporthint.PaiSportHintFragment$special$$inlined$injectInPai$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.pai.sp.ISharedPref, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ISharedPref invoke() {
                return ScopesAndQualifersKt.paiScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(ISharedPref.class), qualifier, objArr);
            }
        });
        this.TAG = "PAI_HINT_CURRENT_POSITION";
        this.binding = FragmentViewBindingKt.viewBinding(new PaiSportHintFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentPaiSporthintBinding.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentPaiSporthintBinding b() {
        return (FragmentPaiSporthintBinding) this.binding.getValue(this, f[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISharedPref c() {
        return (ISharedPref) this.mSharedPref.getValue();
    }

    private final void d() {
        b().paiHintViewpager.setAdapter(new ViewPagerAdapter(getChildFragmentManager()));
        b().paiHintViewpager.setOffscreenPageLimit(5);
        b().paiHintViewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.huami.pai.ui.sporthint.PaiSportHintFragment$initViewPager$1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                this.a.c().saveInt(this.a.TAG, position);
            }
        });
        b().paiHintVpIndicator.setViewPager(b().paiHintViewpager);
        setCurrentItem(c().getInt(this.TAG, this.isRtl ? g.size() - 1 : 0));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.mPaiSportViewModel = (PaiSportHintModel) new ViewModelProvider(requireActivity()).get(PaiSportHintModel.class);
        boolean z = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        this.isRtl = z;
        if (z) {
            j.reverse(g);
        }
        ((PAIHistoryViewModel) new ViewModelProvider(requireActivity()).get(PAIHistoryViewModel.class)).getCurrentSelectData().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.pai.ui.sporthint.PaiSportHintFragment$onViewCreated$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                PAIDataVo pAIDataVo = (PAIDataVo) t;
                if (pAIDataVo != null) {
                    boolean zIsToday = SportDay.fromString(pAIDataVo.getDate()).isToday();
                    ViewExKt.setVisible(this.a.b().rlPaisport, zIsToday);
                    if (zIsToday) {
                        PaiSportHintModel paiSportHintModel = this.a.mPaiSportViewModel;
                        Objects.requireNonNull(paiSportHintModel);
                        paiSportHintModel.setPaiDataVo(pAIDataVo);
                    }
                }
            }
        });
        PaiSportHintModel paiSportHintModel = this.mPaiSportViewModel;
        Objects.requireNonNull(paiSportHintModel);
        paiSportHintModel.getMPaiDataVo().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.pai.ui.sporthint.PaiSportHintFragment$onViewCreated$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                PAIDataVo pAIDataVo = (PAIDataVo) t;
                this.a.b().paiHintProgress.setValue((int) pAIDataVo.getTp());
                PaiSportGoalResult v1 = PaiSportGoalUtil.INSTANCE.getV1((int) pAIDataVo.getDp(), (int) pAIDataVo.getTp());
                if (v1 instanceof PaiSportGoalResult.PaiReachGoal) {
                    this.a.b().paiHintGetContain.setVisibility(8);
                    this.a.b().paiHintTitle.setText(R.string.pai_achieve_goal);
                    PaiSportGoalResult.PaiReachGoal paiReachGoal = (PaiSportGoalResult.PaiReachGoal) v1;
                    this.a.b().paiHintHint.setText(paiReachGoal.getStrResId());
                    if (paiReachGoal.getStrResId() == R.string.pai_already_get_all_pai) {
                        this.a.b().paiHintProgress.setValue(75);
                        return;
                    }
                    return;
                }
                if (v1 instanceof PaiSportGoalResult.PaiProgressGoal) {
                    this.a.b().paiHintGetContain.setVisibility(0);
                    this.a.b().paiHintTitle.setText(R.string.pai_guide_feat_produce_title_modify);
                    this.a.b().paiHintHint.setText(this.a.getString(R.string.pai_distance_data, Integer.valueOf(((PaiSportGoalResult.PaiProgressGoal) v1).getV1())));
                    this.a.b().paiHintGetTitle.setText(R.string.pai_hint_get_by_sport);
                    PaiSportHintModel paiSportHintModel2 = this.a.mPaiSportViewModel;
                    Objects.requireNonNull(paiSportHintModel2);
                    paiSportHintModel2.setPaiGoal(v1);
                    return;
                }
                if (v1 instanceof PaiSportGoalResult.PaiRestGoal) {
                    this.a.b().paiHintGetContain.setVisibility(0);
                    this.a.b().paiHintTitle.setText(R.string.pai_guide_feat_produce_title_modify);
                    this.a.b().paiHintHint.setText(this.a.getString(R.string.pai_distance_data_day, Integer.valueOf(((PaiSportGoalResult.PaiRestGoal) v1).getV1())));
                    this.a.b().paiHintGetTitle.setText(R.string.pai_hint_get_by_sport);
                    PaiSportHintModel paiSportHintModel3 = this.a.mPaiSportViewModel;
                    Objects.requireNonNull(paiSportHintModel3);
                    paiSportHintModel3.setPaiGoal(v1);
                }
            }
        });
        d();
    }

    public final void setCurrentItem(int position) {
        if (position < 0 || position >= g.size()) {
            return;
        }
        b().paiHintViewpager.setCurrentItem(position);
    }
}
