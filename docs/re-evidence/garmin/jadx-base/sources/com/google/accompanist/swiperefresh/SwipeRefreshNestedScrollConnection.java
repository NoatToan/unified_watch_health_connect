package com.google.accompanist.swiperefresh;

import a5.a;
import a5.j;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import g6.s;
import ge1.b;
import gl1.y;
import n4.c;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import t13.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u0019H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/google/accompanist/swiperefresh/SwipeRefreshNestedScrollConnection;", "La5/a;", "Lcom/google/accompanist/swiperefresh/SwipeRefreshState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lo53/b0;", "coroutineScope", "Lkotlin/Function0;", "", "onRefresh", "<init>", "(Lcom/google/accompanist/swiperefresh/SwipeRefreshState;Lo53/b0;Le23/a;)V", "Ln4/c;", "available", "onScroll-MK-Hz9U", "(J)J", "onScroll", "La5/j;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Lg6/s;", "onPreFling-QWom1Mo", "(JLt13/d;)Ljava/lang/Object;", "onPreFling", "Lcom/google/accompanist/swiperefresh/SwipeRefreshState;", "Lo53/b0;", "Le23/a;", "", "enabled", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", "", "refreshTrigger", "F", "getRefreshTrigger", "()F", "setRefreshTrigger", "(F)V", "swiperefresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SwipeRefreshNestedScrollConnection implements a {
    private final b0 coroutineScope;
    private boolean enabled;
    private final e23.a<Unit> onRefresh;
    private float refreshTrigger;
    private final SwipeRefreshState state;

    public SwipeRefreshNestedScrollConnection(SwipeRefreshState swipeRefreshState, b0 b0Var, e23.a<Unit> aVar) {
        swipeRefreshState.getClass();
        b0Var.getClass();
        aVar.getClass();
        this.state = swipeRefreshState;
        this.coroutineScope = b0Var;
        this.onRefresh = aVar;
    }

    /* JADX INFO: renamed from: onScroll-MK-Hz9U, reason: not valid java name */
    private final long m90onScrollMKHz9U(long available) {
        float fH = c.h(available);
        SwipeRefreshState swipeRefreshState = this.state;
        if (fH > 0.0f) {
            swipeRefreshState.setSwipeInProgress$swiperefresh_release(true);
        } else if (MathKt.c(swipeRefreshState.getIndicatorOffset()) == 0) {
            this.state.setSwipeInProgress$swiperefresh_release(false);
        }
        float indicatorOffset = this.state.getIndicatorOffset() + (c.h(available) * 0.5f);
        if (indicatorOffset < 0.0f) {
            indicatorOffset = 0.0f;
        }
        float indicatorOffset2 = indicatorOffset - this.state.getIndicatorOffset();
        if (Math.abs(indicatorOffset2) >= 0.5f) {
            b.T(this.coroutineScope, null, null, new SwipeRefreshNestedScrollConnection$onScroll$1(this, indicatorOffset2, null), 3);
            return y.f(0.0f, indicatorOffset2 / 0.5f);
        }
        c.f123541b.getClass();
        return 0L;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final float getRefreshTrigger() {
        return this.refreshTrigger;
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public /* bridge */ /* synthetic */ Object mo1onPostFlingRZ2iAVY(long j8, long j14, d dVar) {
        return super.mo1onPostFlingRZ2iAVY(j8, j14, dVar);
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo2onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (!this.enabled) {
            c.f123541b.getClass();
            return 0L;
        }
        if (this.state.isRefreshing()) {
            c.f123541b.getClass();
            return 0L;
        }
        j.f1233b.getClass();
        if (source == j.f1236e && c.h(available) > 0.0f) {
            return m90onScrollMKHz9U(available);
        }
        c.f123541b.getClass();
        return 0L;
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo3onPreFlingQWom1Mo(long j8, d<? super s> dVar) {
        if (!this.state.isRefreshing() && this.state.getIndicatorOffset() >= this.refreshTrigger) {
            this.onRefresh.invoke();
        }
        this.state.setSwipeInProgress$swiperefresh_release(false);
        s.f76026b.getClass();
        return s.a(0L);
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo4onPreScrollOzD1aCk(long available, int source) {
        if (!this.enabled) {
            c.f123541b.getClass();
            return 0L;
        }
        if (this.state.isRefreshing()) {
            c.f123541b.getClass();
            return 0L;
        }
        j.f1233b.getClass();
        if (source == j.f1236e && c.h(available) < 0.0f) {
            return m90onScrollMKHz9U(available);
        }
        c.f123541b.getClass();
        return 0L;
    }

    public final void setEnabled(boolean z14) {
        this.enabled = z14;
    }

    public final void setRefreshTrigger(float f14) {
        this.refreshTrigger = f14;
    }
}
