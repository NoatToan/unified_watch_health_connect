package i02;

import b5.a0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.grid.DragGestureKt", f = "DragGesture.kt", l = {79}, m = "awaitLongPressOrCancellation", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f86836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f86837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f86838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86839d;

    public c(t13.d<? super c> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f86838c = obj;
        this.f86839d |= Integer.MIN_VALUE;
        return e.a(null, null, this);
    }
}
