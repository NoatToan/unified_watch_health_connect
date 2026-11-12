package l4;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll4/f;", "Lg6/c;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements g6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f109845a = p.f109853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f109846b;

    public final l e(e23.l<? super q4.c, Unit> lVar) {
        l lVar2 = new l(lVar);
        this.f109846b = lVar2;
        return lVar2;
    }

    @Override // g6.c
    /* JADX INFO: renamed from: getDensity */
    public final float getF75991a() {
        return this.f109845a.getDensity().getF75991a();
    }

    @Override // g6.i
    /* JADX INFO: renamed from: r0 */
    public final float getF75992b() {
        return this.f109845a.getDensity().getF75992b();
    }
}
