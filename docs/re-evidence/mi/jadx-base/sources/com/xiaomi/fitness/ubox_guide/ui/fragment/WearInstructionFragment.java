package com.xiaomi.fitness.ubox_guide.ui.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.navigation.NavController;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import defpackage.esi;
import defpackage.lvi;
import defpackage.r8q;
import defpackage.wc0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/ubox_guide/ui/fragment/WearInstructionFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/ubox_guide/ui/fragment/TempViewModel;", "Lr8q;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "<init>", "()V", "Companion", "ubox-guide_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WearInstructionFragment extends BaseBindingFragment<TempViewModel, r8q> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/ubox_guide/ui/fragment/WearInstructionFragment$Companion;", "", "<init>", "()V", "gotoWearInstructionFragment", "", "navController", "Landroidx/navigation/NavController;", "ubox-guide_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void gotoWearInstructionFragment(@NotNull NavController navController) {
            Intrinsics.checkNotNullParameter(navController, "navController");
            navController.n(esi.f17024k);
        }
    }

    public WearInstructionFragment() {
        super(lvi.d);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        wc0 actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        getParentFragmentManager().o().w(esi.e, SettingsPageUtilExtKt.getSettingsPageUtil().newWearInstructionPage()).l();
    }
}
