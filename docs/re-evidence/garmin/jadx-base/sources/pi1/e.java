package pi1;

import android.content.Context;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wd2.m1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e implements l<m1, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f137859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t13.d<m1> f137860b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(Context context, t13.d<? super m1> dVar) {
        this.f137859a = context;
        this.f137860b = dVar;
    }

    @Override // e23.l
    public final Unit invoke(m1 m1Var) {
        m1 m1Var2 = m1Var;
        m1Var2.getClass();
        m1Var2.i(this.f137859a, new d(this.f137860b, m1Var2));
        return Unit.INSTANCE;
    }
}
