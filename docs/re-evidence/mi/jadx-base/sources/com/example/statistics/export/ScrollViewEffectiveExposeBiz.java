package com.example.statistics.export;

import android.view.View;
import android.widget.ScrollView;
import com.example.statistics.export.ScrollViewEffectiveExposeBiz;
import com.xiaomi.fitness.common.log.Logger;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import miuix.core.widget.NestedScrollView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/example/statistics/export/ScrollViewEffectiveExposeBiz;", "", "<init>", "()V", "trackView", "Landroid/view/View;", "bottomHeight", "", "startTrackItemExpose", "", "view", "trackedRecord", "", "", "parentBottomHeight", "Companion", "statistics-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScrollViewEffectiveExposeBiz {

    @NotNull
    public static final String TAG = "ScrollviewEffectiveExpose";
    private int bottomHeight;

    @Nullable
    private View trackView;

    public static /* synthetic */ void startTrackItemExpose$default(ScrollViewEffectiveExposeBiz scrollViewEffectiveExposeBiz, View view, Set set, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        scrollViewEffectiveExposeBiz.startTrackItemExpose(view, set, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTrackItemExpose$lambda$1(Set trackedRecord, int i, View view, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(trackedRecord, "$trackedRecord");
        if (view != null) {
            Logger.d(TAG, "onScrollChangeListener " + i3);
            EffectiveExposeExtKt.trackViewExposeIfNeed$default(view, trackedRecord, i, null, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTrackItemExpose$lambda$2(View view, Set trackedRecord, int i) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(trackedRecord, "$trackedRecord");
        EffectiveExposeExtKt.trackViewExposeIfNeed$default(view, trackedRecord, i, null, 8, null);
    }

    public final void startTrackItemExpose(@NotNull final View view, @NotNull final Set<String> trackedRecord, final int parentBottomHeight) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(trackedRecord, "trackedRecord");
        this.bottomHeight = parentBottomHeight;
        Logger.i(TAG, "startTrackItemExpose");
        this.trackView = view;
        if ((view instanceof ScrollView) || (view instanceof NestedScrollView) || (view instanceof androidx.core.widget.NestedScrollView)) {
            view.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: zhl
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view2, int i, int i2, int i3, int i4) {
                    ScrollViewEffectiveExposeBiz.startTrackItemExpose$lambda$1(trackedRecord, parentBottomHeight, view2, i, i2, i3, i4);
                }
            });
            view.postDelayed(new Runnable() { // from class: ail
                @Override // java.lang.Runnable
                public final void run() {
                    ScrollViewEffectiveExposeBiz.startTrackItemExpose$lambda$2(view, trackedRecord, parentBottomHeight);
                }
            }, 1000L);
        }
    }
}
