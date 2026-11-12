package com.google.accompanist.swiperefresh;

import com.mapbox.maps.MapboxMap;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import s1.b;
import s1.d;
import s1.n;
import u1.k1;
import u1.l1;
import u13.a;

/* JADX INFO: loaded from: classes13.dex */
@e
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\nR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019\"\u0004\b\u001a\u0010\u0005R+\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u0005R\u0011\u0010 \u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/google/accompanist/swiperefresh/SwipeRefreshState;", "", "", "isRefreshing", "<init>", "(Z)V", "", MapboxMap.QFE_OFFSET, "", "animateOffsetTo$swiperefresh_release", "(FLt13/d;)Ljava/lang/Object;", "animateOffsetTo", "delta", "dispatchScrollDelta$swiperefresh_release", "dispatchScrollDelta", "Ls1/b;", "Ls1/n;", "_indicatorOffset", "Ls1/b;", "Lu1/l1;", "mutatorMutex", "Lu1/l1;", "<set-?>", "isRefreshing$delegate", "Lp3/p1;", "()Z", "setRefreshing", "isSwipeInProgress$delegate", "isSwipeInProgress", "setSwipeInProgress$swiperefresh_release", "getIndicatorOffset", "()F", "indicatorOffset", "swiperefresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SwipeRefreshState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: isRefreshing$delegate, reason: from kotlin metadata */
    private final p1 isRefreshing;
    private final b<Float, n> _indicatorOffset = d.a(0.0f, 0.01f);
    private final l1 mutatorMutex = new l1();

    /* JADX INFO: renamed from: isSwipeInProgress$delegate, reason: from kotlin metadata */
    private final p1 isSwipeInProgress = p0.n(Boolean.FALSE);

    public SwipeRefreshState(boolean z14) {
        this.isRefreshing = p0.n(Boolean.valueOf(z14));
    }

    public final Object animateOffsetTo$swiperefresh_release(float f14, t13.d<? super Unit> dVar) {
        Object objB = this.mutatorMutex.b(k1.Default, new SwipeRefreshState$animateOffsetTo$2(this, f14, null), dVar);
        return objB == a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    public final Object dispatchScrollDelta$swiperefresh_release(float f14, t13.d<? super Unit> dVar) {
        Object objB = this.mutatorMutex.b(k1.UserInput, new SwipeRefreshState$dispatchScrollDelta$2(this, f14, null), dVar);
        return objB == a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    public final float getIndicatorOffset() {
        return this._indicatorOffset.e().floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRefreshing() {
        return ((Boolean) this.isRefreshing.getF182175a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSwipeInProgress() {
        return ((Boolean) this.isSwipeInProgress.getF182175a()).booleanValue();
    }

    public final void setRefreshing(boolean z14) {
        this.isRefreshing.setValue(Boolean.valueOf(z14));
    }

    public final void setSwipeInProgress$swiperefresh_release(boolean z14) {
        this.isSwipeInProgress.setValue(Boolean.valueOf(z14));
    }
}
