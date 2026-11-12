package kotlin;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import e23.l;
import m4.g;
import y4.b;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li5/f2;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "Lm4/g;", "", "onMoveFocus", "<init>", "(Landroid/content/Context;Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<g, p005kotlin.Unit> f91178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f91180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GestureDetector f91181d;

    @p005kotlin.Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"i5/f2$a", "Landroid/view/GestureDetector$OnGestureListener;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements GestureDetector.OnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f14, float f15) {
            int i14;
            int i15;
            f2 f2Var = f2.this;
            boolean z14 = f2Var.f91180c;
            l<g, p005kotlin.Unit> lVar = f2Var.f91178a;
            if (!z14) {
                int i16 = f2Var.f91179b;
                b.f194373b.getClass();
                if (i16 == b.f194374c) {
                    if (Math.abs(f14) > Math.abs(f15)) {
                        if (f14 > 0.0f) {
                            g.f116466b.getClass();
                            i15 = g.f116467c;
                        } else {
                            g.f116466b.getClass();
                            i15 = g.f116468d;
                        }
                        lVar.invoke(g.a(i15));
                        return true;
                    }
                } else if (f2Var.f91179b == b.f194375d && Math.abs(f15) > Math.abs(f14)) {
                    if (f15 > 0.0f) {
                        g.f116466b.getClass();
                        i14 = g.f116467c;
                    } else {
                        g.f116466b.getClass();
                        i14 = g.f116468d;
                    }
                    lVar.invoke(g.a(i14));
                }
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f14, float f15) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f2(Context context, l<? super g, p005kotlin.Unit> lVar) {
        this.f91178a = lVar;
        b.f194373b.getClass();
        this.f91179b = 0;
        this.f91181d = new GestureDetector(context, new a());
    }
}
