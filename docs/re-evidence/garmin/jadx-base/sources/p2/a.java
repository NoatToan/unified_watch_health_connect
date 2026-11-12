package p2;

import oe2.f;
import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt", f = "RightClickGestures.kt", l = {45}, m = "awaitFirstRightClickDown", v = 1)
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b5.c f134977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f134978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f134979c;

    public a(d<? super a> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134978b = obj;
        this.f134979c |= Integer.MIN_VALUE;
        return f.d(null, this);
    }
}
