package com.huami.watchfacesstore.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import com.amap.api.mapcore.util.hl;
import com.google.android.material.tabs.TabLayout;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.databinding.WfActivityWatchfacesStoreBinding;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ui.WatchFacesStoreActivity;
import com.huami.watchfacesstore.ui.base.BaseActivity;
import com.huami.watchfacesstore.ui.manager.WatchManagerFragment;
import com.huami.watchfacesstore.ui.store.WatchFaceStoreFragment;
import com.loc.z;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0019\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001d\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010 ¨\u0006%"}, d2 = {"Lcom/huami/watchfacesstore/ui/WatchFacesStoreActivity;", "Lcom/huami/watchfacesstore/ui/base/BaseActivity;", "", "m", "l", "initView", "Landroidx/viewbinding/ViewBinding;", "getBinding", "", "index", "switchTab", "Landroid/os/Bundle;", "outState", "onSaveInstanceState", "Lcom/huami/watchfacesstore/databinding/WfActivityWatchfacesStoreBinding;", "g", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "i", "()Lcom/huami/watchfacesstore/databinding/WfActivityWatchfacesStoreBinding;", "binding", "Lcom/huami/watchfacesstore/ui/store/WatchFaceStoreFragment;", "h", "Lkotlin/Lazy;", z.j, "()Lcom/huami/watchfacesstore/ui/store/WatchFaceStoreFragment;", "watchFaceStoreFragment", "Lcom/huami/watchfacesstore/ui/manager/WatchManagerFragment;", hl.k, "()Lcom/huami/watchfacesstore/ui/manager/WatchManagerFragment;", "watchManagerFragment", "", "Landroidx/fragment/app/Fragment;", "[Landroidx/fragment/app/Fragment;", "fragments", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchFacesStoreActivity extends BaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] k;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = ActivityViewBindingsKt.viewBinding(new WatchFacesStoreActivity$special$$inlined$viewBinding$1(new InflateViewBinder(WfActivityWatchfacesStoreBinding.class)));

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchFaceStoreFragment = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchManagerFragment = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Fragment[] fragments;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/watchfacesstore/ui/WatchFacesStoreActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "actionStart", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void actionStart(@NotNull Context context) {
            Intent intent = new Intent(context, (Class<?>) WatchFacesStoreActivity.class);
            intent.putExtra("checkNetwork", false);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/WatchFaceStoreFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<WatchFaceStoreFragment> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchFaceStoreFragment getA() {
            return new WatchFaceStoreFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/WatchManagerFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<WatchManagerFragment> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchManagerFragment getA() {
            return new WatchManagerFragment();
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WatchFacesStoreActivity.class), "binding", "getBinding()Lcom/huami/watchfacesstore/databinding/WfActivityWatchfacesStoreBinding;"));
        k = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WfActivityWatchfacesStoreBinding i() {
        return (WfActivityWatchfacesStoreBinding) this.binding.getValue(this, k[0]);
    }

    private final WatchFaceStoreFragment j() {
        return (WatchFaceStoreFragment) this.watchFaceStoreFragment.getValue();
    }

    private final WatchManagerFragment k() {
        return (WatchManagerFragment) this.watchManagerFragment.getValue();
    }

    private final void l() {
        Fragment[] fragmentArr = {j(), k()};
        this.fragments = fragmentArr;
        Objects.requireNonNull(fragmentArr);
        for (Fragment fragment : fragmentArr) {
            ExtensionsKt.addFragmentByTag$default(this, fragment, R.id.wf_container, null, 4, null);
        }
        Fragment[] fragmentArr2 = this.fragments;
        Objects.requireNonNull(fragmentArr2);
        ExtensionsKt.hideFragment(this, fragmentArr2[1]);
    }

    private final void m() {
        i().tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: com.huami.watchfacesstore.ui.WatchFacesStoreActivity$setListeners$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ TabLayout.Tab a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(TabLayout.Tab tab) {
                    super(0);
                    this.a = tab;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "onTabSelected:" + this.a.getPosition();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ TabLayout.Tab a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(TabLayout.Tab tab) {
                    super(0);
                    this.a = tab;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "onTabUnselected:" + this.a.getPosition();
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(@NotNull TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(@NotNull TabLayout.Tab tab) {
                HMLog.info("WatchFacesStoreActivity", new a(tab));
                WatchFacesStoreActivity watchFacesStoreActivity = this.a;
                Fragment[] fragmentArr = watchFacesStoreActivity.fragments;
                Objects.requireNonNull(fragmentArr);
                ExtensionsKt.showFragment(watchFacesStoreActivity, fragmentArr[tab.getPosition()]);
                if (tab.getPosition() == 1) {
                    ExtensionsKt.invisible(this.a.i().ivChangeView);
                } else {
                    ExtensionsKt.visible(this.a.i().ivChangeView);
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(@NotNull TabLayout.Tab tab) {
                HMLog.info("WatchFacesStoreActivity", new b(tab));
                WatchFacesStoreActivity watchFacesStoreActivity = this.a;
                Fragment[] fragmentArr = watchFacesStoreActivity.fragments;
                Objects.requireNonNull(fragmentArr);
                ExtensionsKt.hideFragment(watchFacesStoreActivity, fragmentArr[tab.getPosition()]);
            }
        });
        i().ivChangeView.setOnClickListener(new View.OnClickListener() { // from class: ng8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchFacesStoreActivity.n(this.a, view);
            }
        });
        i().ivHomeBack.setOnClickListener(new View.OnClickListener() { // from class: mg8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchFacesStoreActivity.o(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(WatchFacesStoreActivity watchFacesStoreActivity, View view) {
        if (watchFacesStoreActivity.j().isListMode()) {
            watchFacesStoreActivity.i().ivChangeView.setImageResource(R.drawable.wf_ic_change_view);
        } else {
            watchFacesStoreActivity.i().ivChangeView.setImageResource(R.drawable.wf_ic_change_view_2);
        }
        watchFacesStoreActivity.j().setListMode(!watchFacesStoreActivity.j().isListMode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(WatchFacesStoreActivity watchFacesStoreActivity, View view) {
        watchFacesStoreActivity.finish();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    @NotNull
    public ViewBinding getBinding() {
        return i();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    public void initView() {
        StatusBarUtil.setStatusBarColor(this, ContextCompat.getColor(this, R.color.wf_home_background_color));
        l();
        TabLayout tabLayout = i().tabLayout;
        tabLayout.addTab(tabLayout.newTab().setText(R.string.wf_home_tab_name_1));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.wf_home_tab_name_2));
        m();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
    }

    public final void switchTab(int index) {
        TabLayout.Tab tabAt = i().tabLayout.getTabAt(index);
        if (tabAt == null) {
            return;
        }
        tabAt.select();
    }
}
