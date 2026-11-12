package com.example.statistics.export;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.example.statistics.export.EffectiveExposeExtKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NavigationBarHelper;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.onetrack.c.i;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u001a0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a>\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u0002\u001aF\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u0002\u001a(\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00012\u0016\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"TAG", "", "manualTriggerCheckExpose", "", "view", "Landroid/view/View;", "trackedRecord", "", "bottom", "", "delayMillis", "", "trackViewExposeIfNeed", "viewItem", "expandHeight", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lcom/example/statistics/export/TrackContent;", "trackContentViewItem", "tag", "trackView", i.d, "params", "", "", "statistics-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EffectiveExposeExtKt {

    @NotNull
    private static final String TAG = "EffectiveExpose";

    public static final void manualTriggerCheckExpose(@NotNull final View view, @NotNull final Set<String> trackedRecord, final int i, long j) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(trackedRecord, "trackedRecord");
        Logger.i(TAG, "manualTriggerCheckExpose " + view);
        if (j > 0) {
            view.postDelayed(new Runnable() { // from class: e38
                @Override // java.lang.Runnable
                public final void run() {
                    EffectiveExposeExtKt.manualTriggerCheckExpose$lambda$0(view, trackedRecord, i);
                }
            }, j);
        } else {
            trackViewExposeIfNeed$default(view, trackedRecord, i, null, 8, null);
        }
    }

    public static /* synthetic */ void manualTriggerCheckExpose$default(View view, Set set, int i, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            j = 0;
        }
        manualTriggerCheckExpose(view, set, i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void manualTriggerCheckExpose$lambda$0(View view, Set trackedRecord, int i) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(trackedRecord, "$trackedRecord");
        trackViewExposeIfNeed$default(view, trackedRecord, i, null, 8, null);
    }

    private static final void trackContentViewItem(TrackContent trackContent, View view, Set<String> set, int i, Function1<? super TrackContent, Unit> function1) {
        if (trackContent.getKey() == null || trackContent.getEventName() == null || trackContent.getParams() == null) {
            return;
        }
        Logger.d(TAG, "checkViewGroupExpose " + trackContent.getKey());
        boolean z = trackContent.getRepeatEnable() || !CollectionsKt___CollectionsKt.contains(set, trackContent.getKey());
        if (!z) {
            Logger.d(TAG, "key " + trackContent.getKey() + " has been exposed.. ");
            return;
        }
        Context context = view.getContext();
        UIUtils uIUtils = UIUtils.INSTANCE;
        Intrinsics.checkNotNull(context);
        int screenRealHeight = uIUtils.getScreenRealHeight(context);
        int navigationBarHeight = NavigationBarHelper.INSTANCE.getNavigationBarHeight(context);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i2 = iArr[1];
        int height = view.getHeight();
        float exposePercent = trackContent.getExposePercent();
        float f = height * exposePercent;
        Logger.i(TAG, "trackViewExposeIfNeed key " + trackContent.getKey() + ";screenRealHeight " + screenRealHeight + ";navigationBarHeight " + navigationBarHeight + ";top " + i2 + ";viewHeight " + height + ";visibleHeight " + f + ";expandHeight " + i + " percent " + exposePercent);
        boolean z2 = height <= 1 ? false : z;
        if ((i2 < 0 && Math.abs(i2) > f) || i2 > ((screenRealHeight - navigationBarHeight) - f) - i) {
            Logger.d(TAG, "key " + trackContent.getKey() + " filter invisible(need percent " + exposePercent + " in screen)");
            return;
        }
        if (z2) {
            if (function1 != null) {
                function1.invoke2(trackContent);
            } else {
                String eventName = trackContent.getEventName();
                Intrinsics.checkNotNull(eventName);
                Map<String, Object> params = trackContent.getParams();
                Intrinsics.checkNotNull(params);
                trackView(eventName, params);
            }
            String key = trackContent.getKey();
            Intrinsics.checkNotNull(key);
            set.add(key);
        }
    }

    public static /* synthetic */ void trackContentViewItem$default(TrackContent trackContent, View view, Set set, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            function1 = null;
        }
        trackContentViewItem(trackContent, view, set, i, function1);
    }

    private static final void trackView(String str, Map<String, ? extends Object> map) {
        Logger.i(TAG, "trackView item: " + str + " " + map);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trackViewExposeIfNeed(View view, Set<String> set, int i, Function1<? super TrackContent, Unit> function1) {
        if (!(view instanceof ViewGroup)) {
            Object tag = view.getTag();
            if (tag instanceof TrackContent) {
                trackContentViewItem((TrackContent) tag, view, set, i, function1);
                return;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            Object tag2 = childAt.getTag();
            if (tag2 instanceof TrackContent) {
                Intrinsics.checkNotNull(childAt);
                trackContentViewItem((TrackContent) tag2, childAt, set, i, function1);
            }
            if (childAt instanceof ViewGroup) {
                trackViewExposeIfNeed(childAt, set, i, function1);
            }
        }
    }

    public static /* synthetic */ void trackViewExposeIfNeed$default(View view, Set set, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        trackViewExposeIfNeed(view, set, i, function1);
    }
}
