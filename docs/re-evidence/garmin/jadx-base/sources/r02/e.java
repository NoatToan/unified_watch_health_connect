package r02;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableLayoutKt", f = "ZoomableLayout.kt", l = {270}, m = "awaitTwoDowns", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b5.c f148835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f148836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f148837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f148838d;

    public e(t13.d<? super e> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148837c = obj;
        this.f148838d |= Integer.MIN_VALUE;
        return l.b(null, this);
    }
}
