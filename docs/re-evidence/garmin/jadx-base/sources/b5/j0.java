package b5;

import android.view.MotionEvent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "motionEvent", "Landroid/view/MotionEvent;", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class j0 extends p005kotlin.jvm.internal.w implements e23.l<MotionEvent, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f15831a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(i0 i0Var) {
        super(1);
        this.f15831a = i0Var;
    }

    @Override // e23.l
    public final Unit invoke(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        k0 k0Var = this.f15831a.f15816a;
        if (k0Var != null) {
            k0Var.invoke(motionEvent2);
            return Unit.INSTANCE;
        }
        p005kotlin.jvm.internal.s.m("onTouchEvent");
        throw null;
    }
}
