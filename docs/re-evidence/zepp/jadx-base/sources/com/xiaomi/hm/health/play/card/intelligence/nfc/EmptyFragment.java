package com.xiaomi.hm.health.play.card.intelligence.nfc;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/nfc/EmptyFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "inject", "removeSelfFromActivity", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EmptyFragment extends Fragment {

    @NotNull
    private static final String a = "com.xiaomi.hm.health.play.card.intelligence.empty_fragment_tag";

    public void _$_clearFindViewByIdCache() {
    }

    public final void inject(@NotNull FragmentActivity activity) {
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag(a) == null) {
            supportFragmentManager.beginTransaction().add(this, a).commitNow();
        }
    }

    public final void removeSelfFromActivity(@NotNull FragmentActivity activity) {
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        if (Intrinsics.areEqual(supportFragmentManager.findFragmentByTag(a), this)) {
            supportFragmentManager.beginTransaction().remove(this).commit();
        }
    }
}
