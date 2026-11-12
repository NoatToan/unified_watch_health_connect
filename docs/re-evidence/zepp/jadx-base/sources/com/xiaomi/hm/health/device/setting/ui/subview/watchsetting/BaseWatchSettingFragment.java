package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingHelper;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\u0012\b\b\u0001\u0010!\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u00020\r8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u00020\u00148\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/BaseWatchSettingFragment;", "Landroidx/fragment/app/Fragment;", "", "b", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", "a", "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", "fragment", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingHelper;", "loadingHelper", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingHelper;", "getLoadingHelper", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingHelper;", "setLoadingHelper", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingHelper;)V", "", "Z", "getMenuVisible", "()Z", "menuVisible", "", "getContainerId", "()I", "containerId", "", "getTitleRes", "()Ljava/lang/String;", "titleRes", "layoutId", "<init>", "(I)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class BaseWatchSettingFragment extends Fragment {

    @NotNull
    private static final String c = "BaseWatchSettingFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private BTStatusFragment fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean menuVisible;
    public LoadingHelper loadingHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            WatchSettingExtsKt.navigateUpSafely(BaseWatchSettingFragment.this);
        }
    }

    public BaseWatchSettingFragment(@LayoutRes int i) {
        super(i);
    }

    private final void b() {
        if (this.fragment == null) {
            BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(getContainerId(), getChildFragmentManager());
            this.fragment = bTStatusFragmentNewInstance;
            if (bTStatusFragmentNewInstance != null) {
                bTStatusFragmentNewInstance.setShowBottomArea(false);
            }
            BTStatusFragment bTStatusFragment = this.fragment;
            if (bTStatusFragment == null) {
                return;
            }
            bTStatusFragment.setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment$initBTStatusFragment$1

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ Throwable a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(Throwable th) {
                        super(0);
                        this.a = th;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "error: " + this.a;
                    }
                }

                @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
                public void onEnableChange(boolean enable) {
                    Object objM3845constructorimpl;
                    BaseWatchSettingFragment baseWatchSettingFragment = this.a;
                    try {
                        Result.Companion companion = Result.Companion;
                        View view = baseWatchSettingFragment.getView();
                        ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.mask_view), !enable, false, 2, null);
                        objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        HMLog.info("BaseWatchSettingFragment", new a(thM3848exceptionOrNullimpl));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(BaseWatchSettingFragment baseWatchSettingFragment, View view) {
        WatchSettingExtsKt.navigateUpSafely(baseWatchSettingFragment);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public abstract int getContainerId();

    @NotNull
    public final LoadingHelper getLoadingHelper() {
        LoadingHelper loadingHelper = this.loadingHelper;
        Objects.requireNonNull(loadingHelper);
        return loadingHelper;
    }

    public boolean getMenuVisible() {
        return this.menuVisible;
    }

    @NotNull
    public abstract String getTitleRes();

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        b();
        View view2 = getView();
        TextView textView = (TextView) (view2 == null ? null : view2.findViewById(R.id.toolbar_title));
        if (textView != null) {
            textView.setText(getTitleRes());
        }
        View view3 = getView();
        AppCompatImageView appCompatImageView = (AppCompatImageView) (view3 == null ? null : view3.findViewById(R.id.btn_back));
        if (appCompatImageView != null) {
            ExtKt.smartClick$default(appCompatImageView, 0L, new a(), 1, null);
        }
        View view4 = getView();
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) (view4 == null ? null : view4.findViewById(R.id.title_bar));
        if (rainbowTitleBar != null) {
            rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: gs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    BaseWatchSettingFragment.c(this.a, view5);
                }
            });
        }
        View view5 = getView();
        RainbowTitleBar rainbowTitleBar2 = (RainbowTitleBar) (view5 == null ? null : view5.findViewById(R.id.title_bar));
        if (rainbowTitleBar2 != null) {
            rainbowTitleBar2.setTitle(getTitleRes());
        }
        if (!getMenuVisible()) {
            View view6 = getView();
            RainbowTitleBar rainbowTitleBar3 = (RainbowTitleBar) (view6 != null ? view6.findViewById(R.id.title_bar) : null);
            if (rainbowTitleBar3 != null) {
                rainbowTitleBar3.setMenuText("");
            }
        }
        setLoadingHelper(new LoadingHelper(requireContext()));
    }

    public final void setLoadingHelper(@NotNull LoadingHelper loadingHelper) {
        this.loadingHelper = loadingHelper;
    }
}
