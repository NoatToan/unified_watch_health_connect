package c22;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.util.UCropImageUtil", f = "UCropImageUtil.kt", l = {42}, m = "loadImageAndStoreToUri", v = 2)
public final class h3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k3 f23083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23084c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(k3 k3Var, t13.d<? super h3> dVar) {
        super(dVar);
        this.f23083b = k3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23082a = obj;
        this.f23084c |= Integer.MIN_VALUE;
        return this.f23083b.b(null, null, this);
    }
}
