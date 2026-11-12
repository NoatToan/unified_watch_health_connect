package com.xiaomi.fitness.route.track;

import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J$\u0010\u0005\u001a\u00020\u00032\u001a\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0007H&J.\u0010\n\u001a\u00020\u00032$\u0010\u0006\u001a \u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00030\u000bH&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/route/track/TrackListFragmentOperator;", "", "onEndViewClick", "", "onStartViewClick", "setStartViewRefreshListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function2;", "Landroid/view/View;", "", "setEndViewRefreshListener", "Lkotlin/Function3;", "requestEndView", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TrackListFragmentOperator {
    void onEndViewClick();

    void onStartViewClick();

    void requestEndView();

    void setEndViewRefreshListener(@NotNull Function3<? super View, ? super Integer, ? super Integer, Unit> listener);

    void setStartViewRefreshListener(@NotNull Function2<? super View, ? super Integer, Unit> listener);
}
