package i02;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.grid.SpringDragCancelledAnimation", f = "DragCancelledAnimation.kt", l = {30, 31}, m = "dragCancelled-d-4ec7I", v = 2)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f86921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f86922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f86923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86924d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f86923c = uVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f86922b = obj;
        this.f86924d |= Integer.MIN_VALUE;
        return this.f86923c.a(null, 0L, this);
    }
}
