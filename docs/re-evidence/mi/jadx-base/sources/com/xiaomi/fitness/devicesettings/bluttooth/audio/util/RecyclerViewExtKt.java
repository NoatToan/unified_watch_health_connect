package com.xiaomi.fitness.devicesettings.bluttooth.audio.util;

import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001a4\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\u001a\u001a\u0010\u0006\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\b"}, d2 = {"getSpanOffset", "Lkotlin/Pair;", "", "Landroidx/recyclerview/widget/RecyclerView;", "position", "offset", "scrollToPositionWithOffset", "", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RecyclerViewExtKt {
    @NotNull
    public static final Pair<Integer, Integer> getSpanOffset(@NotNull RecyclerView recyclerView, int i, @Nullable Pair<Integer, Integer> pair) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        if (pair != null && recyclerView.getLayoutManager() != null) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager);
            View viewFindViewByPosition = layoutManager.findViewByPosition(i);
            if (!(viewFindViewByPosition instanceof TextView)) {
                return new Pair<>(1, 0);
            }
            TextView textView = (TextView) viewFindViewByPosition;
            if (textView.getHeight() < recyclerView.getHeight()) {
                return new Pair<>(1, 0);
            }
            Layout layout = textView.getLayout();
            Intrinsics.checkNotNullExpressionValue(layout, "getLayout(...)");
            int lineForOffset = layout.getLineForOffset(pair.getFirst().intValue());
            int lineForOffset2 = layout.getLineForOffset(pair.getSecond().intValue());
            int lineTop = layout.getLineTop(lineForOffset);
            int lineBottom = layout.getLineBottom(lineForOffset2);
            int top = textView.getTop();
            int height = lineBottom - recyclerView.getHeight();
            StringBuilder sb = new StringBuilder();
            sb.append("locationY: ");
            sb.append(top);
            sb.append(" textY: ");
            sb.append(lineBottom);
            sb.append(" Absolute Y: ");
            sb.append(height);
            int i2 = lineBottom + top;
            if (i2 < 0) {
                return new Pair<>(1, Integer.valueOf(lineTop * (-1)));
            }
            return i2 < recyclerView.getHeight() ? new Pair<>(-1, Integer.valueOf(top * (-1))) : new Pair<>(1, Integer.valueOf(height * (-1)));
        }
        return new Pair<>(0, 0);
    }

    public static final void scrollToPositionWithOffset(@NotNull RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        if (recyclerView.getLayoutManager() != null && (recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, i2);
        }
    }
}
