package kotlin;

import p1.j0;
import q53.k;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2374, 2410}, m = "boundsUpdatesEventLoop$ui", v = 1)
public final class v extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f91593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f91594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f91595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f91596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f91597e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u uVar, d<? super v> dVar) {
        super(dVar);
        this.f91596d = uVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f91595c = obj;
        this.f91597e |= Integer.MIN_VALUE;
        return this.f91596d.c(this);
    }
}
