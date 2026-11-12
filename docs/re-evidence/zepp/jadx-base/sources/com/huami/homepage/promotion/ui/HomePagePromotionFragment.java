package com.huami.homepage.promotion.ui;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.homepage.promotion.R;
import com.huami.homepage.promotion.beans.PromotionVo;
import com.huami.homepage.promotion.server.PromotionDataManager;
import com.huami.homepage.promotion.server.PromotionType;
import com.huami.homepage.promotion.ui.HomePagePromotionFragment;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/homepage/promotion/ui/HomePagePromotionFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/ViewGroup;", "parent", "", "b", "Landroid/view/LayoutInflater;", "inflater", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/homepage/promotion/ui/ExternalNavigator;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/homepage/promotion/ui/ExternalNavigator;", "navigator", "f", "()Landroid/view/View;", "promotionTitle", "c", "g", "()Landroid/view/ViewGroup;", RootDescription.ROOT_ELEMENT, "Lcom/huami/homepage/promotion/ui/PromotionManager;", "e", "()Lcom/huami/homepage/promotion/ui/PromotionManager;", "promotionManager", "<init>", "()V", "promotion_release"}, k = 1, mv = {1, 5, 1})
public final class HomePagePromotionFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy promotionTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy root;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy promotionManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/homepage/promotion/ui/PromotionManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<PromotionManager> {

        /* JADX INFO: renamed from: com.huami.homepage.promotion.ui.HomePagePromotionFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroid/widget/ImageView;", "imageView", "", "url", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0450a extends Lambda implements Function2<ImageView, String, Unit> {
            public static final C0450a a = new C0450a();

            public C0450a() {
                super(2);
            }

            public final void a(@NotNull ImageView imageView, @NotNull String str) {
                HomePagePromotionFragmentKt.b(imageView, str, R.drawable.status_promotion_image_placeholder);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ImageView imageView, String str) {
                a(imageView, str);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Landroid/view/View;", "v", "", "<anonymous parameter 1>", "Lcom/huami/homepage/promotion/beans/PromotionVo;", "item", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function3<View, Integer, PromotionVo, Unit> {
            public final /* synthetic */ HomePagePromotionFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(HomePagePromotionFragment homePagePromotionFragment) {
                super(3);
                this.a = homePagePromotionFragment;
            }

            public final void a(@NotNull View view, int i, @NotNull PromotionVo promotionVo) {
                Map<String, String> mapMapOf = r.mapOf(TuplesKt.to("tp", "selected"), TuplesKt.to("id", promotionVo.getId()));
                ExternalNavigator externalNavigatorD = this.a.d();
                if (externalNavigatorD == null) {
                    return;
                }
                externalNavigatorD.onNavigate(view.getContext(), promotionVo, "HOME_SELECTED_C", mapMapOf);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, PromotionVo promotionVo) {
                a(view, num.intValue(), promotionVo);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PromotionManager invoke() {
            return new PromotionManager(HomePagePromotionFragment.this.requireActivity(), C0450a.a, PromotionDataManager.INSTANCE.loadData(PromotionType.HOME_PAGE_PROMOTION), new b(HomePagePromotionFragment.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/view/View;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<View> {
        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final View invoke() {
            View view = HomePagePromotionFragment.this.getView();
            if (view == null) {
                return null;
            }
            return view.findViewById(R.id.promotion_title);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<ViewGroup> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewGroup invoke() {
            View view = HomePagePromotionFragment.this.getView();
            if (view == null) {
                return null;
            }
            return (ViewGroup) view.findViewById(R.id.root);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomePagePromotionFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ExternalNavigator>() { // from class: com.huami.homepage.promotion.ui.HomePagePromotionFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.homepage.promotion.ui.ExternalNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExternalNavigator invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(ExternalNavigator.class), qualifier, objArr);
            }
        });
        this.promotionTitle = LazyKt__LazyJVMKt.lazy(new b());
        this.root = LazyKt__LazyJVMKt.lazy(new c());
        this.promotionManager = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final void b(ViewGroup parent) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = HomePagePromotionFragmentKt.a(parent, 10);
        layoutParams.setMarginStart(HomePagePromotionFragmentKt.a(parent, 10));
        layoutParams.setMarginEnd(HomePagePromotionFragmentKt.a(parent, 10));
        final RecyclerView recyclerView = e().getRecyclerView();
        parent.addView(recyclerView, layoutParams);
        View viewF = f();
        if (viewF != null) {
            HomePagePromotionFragmentKt.c(viewF, false);
        }
        HomePagePromotionFragmentKt.c(recyclerView, false);
        e().getFilterDataSource().observe(getViewLifecycleOwner(), new Observer() { // from class: v84
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HomePagePromotionFragment.c(this.a, recyclerView, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(HomePagePromotionFragment homePagePromotionFragment, RecyclerView recyclerView, List list) {
        boolean z = !list.isEmpty();
        View viewF = homePagePromotionFragment.f();
        if (viewF != null) {
            HomePagePromotionFragmentKt.c(viewF, z);
        }
        HomePagePromotionFragmentKt.c(recyclerView, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExternalNavigator d() {
        return (ExternalNavigator) this.navigator.getValue();
    }

    private final PromotionManager e() {
        return (PromotionManager) this.promotionManager.getValue();
    }

    private final View f() {
        return (View) this.promotionTitle.getValue();
    }

    private final ViewGroup g() {
        return (ViewGroup) this.root.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_homepage_promotion, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        b(g());
    }
}
