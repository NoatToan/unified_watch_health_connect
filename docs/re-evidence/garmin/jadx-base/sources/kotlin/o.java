package kotlin;

import android.view.MotionEvent;
import e23.a;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class o extends w implements a<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f91359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MotionEvent f91360b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, MotionEvent motionEvent) {
        super(0);
        this.f91359a = mVar;
        this.f91360b = motionEvent;
    }

    @Override // e23.a
    public final Boolean invoke() {
        return Boolean.valueOf(super/*android.view.View*/.dispatchGenericMotionEvent(this.f91360b));
    }
}
