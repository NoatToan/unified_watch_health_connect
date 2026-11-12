package com.huami.training.utils;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u000b\u001a\u00020\n*\u00020\u00002%\b\u0002\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/Fragment;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "duration", "", "durationTracker", "Lkotlin/Function0;", "viewScreenTracker", "Lcom/huami/training/utils/FragmentTrackHelper;", "trackHelper", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class FragmentTrackHelperKt {
    @NotNull
    public static final FragmentTrackHelper trackHelper(@NotNull Fragment fragment, @Nullable Function1<? super Long, Unit> function1, @Nullable Function0<Unit> function0) {
        return new FragmentTrackHelper(fragment, function1, function0);
    }

    public static /* synthetic */ FragmentTrackHelper trackHelper$default(Fragment fragment, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return trackHelper(fragment, function1, function0);
    }
}
