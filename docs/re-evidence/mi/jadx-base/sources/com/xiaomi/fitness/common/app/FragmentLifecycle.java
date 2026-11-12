package com.xiaomi.fitness.common.app;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/common/app/FragmentLifecycle;", "Landroidx/fragment/app/FragmentManager$l;", "Landroidx/fragment/app/FragmentManager;", "fm", "Landroidx/fragment/app/Fragment;", PluginDeviceInfo.FBLUETOOTHPAIR, "Landroid/os/Bundle;", "savedInstanceState", "", "onFragmentCreated", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V", "Landroid/view/View;", "v", "onFragmentViewCreated", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;)V", "onFragmentDestroyed", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V", "<init>", "()V", "common_release"}, k = 1, mv = {2, 0, 0})
public final class FragmentLifecycle extends FragmentManager.l {
    @Override // androidx.fragment.app.FragmentManager.l
    public void onFragmentCreated(@NotNull FragmentManager fm, @NotNull Fragment f, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        super.onFragmentCreated(fm, f, savedInstanceState);
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public void onFragmentDestroyed(@NotNull FragmentManager fm, @NotNull Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        super.onFragmentDestroyed(fm, f);
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public void onFragmentViewCreated(@NotNull FragmentManager fm, @NotNull Fragment f, @NotNull View v, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(v, "v");
        super.onFragmentViewCreated(fm, f, v, savedInstanceState);
    }
}
