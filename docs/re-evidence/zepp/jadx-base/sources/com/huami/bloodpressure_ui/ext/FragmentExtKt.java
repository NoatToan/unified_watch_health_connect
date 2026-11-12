package com.huami.bloodpressure_ui.ext;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a \u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0000H\u0000¨\u0006\u0006"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "containerViewId", "fragment", "", "replaceFragmentInTransaction", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class FragmentExtKt {
    public static final void replaceFragmentInTransaction(@NotNull Fragment fragment, @IdRes int i, @NonNull @NotNull Fragment fragment2) {
        fragment.getChildFragmentManager().beginTransaction().replace(i, fragment2).commit();
    }
}
