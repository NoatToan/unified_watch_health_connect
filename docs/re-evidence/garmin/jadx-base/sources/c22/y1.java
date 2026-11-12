package c22;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.util.MapSearchUtil", f = "MapSearchUtil.kt", l = {21}, m = "getAddress", v = 2)
public final class y1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f23756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23757c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var, t13.d<? super y1> dVar) {
        super(dVar);
        this.f23756b = z1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23755a = obj;
        this.f23757c |= Integer.MIN_VALUE;
        return this.f23756b.e(null, this);
    }
}
