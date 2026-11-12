package z2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl", f = "PlatformSelectionBehaviors.android.kt", l = {369, 380}, m = "classifyText-M8tDOmk", v = 1)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f201751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f201752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.b f201753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f201754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f201755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f201756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f201757g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f201756f = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f201755e = obj;
        this.f201757g |= Integer.MIN_VALUE;
        return w.d(this.f201756f, null, 0L, null, this);
    }
}
