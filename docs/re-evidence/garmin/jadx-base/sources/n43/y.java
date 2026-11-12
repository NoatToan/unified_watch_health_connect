package n43;

import java.util.Set;
import p13.c1;

/* JADX INFO: loaded from: classes3.dex */
public class y implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f123694a;

    public y(z zVar) {
        this.f123694a = zVar;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.l<Object>[] lVarArr = z.f123695f;
        z zVar = this.f123694a;
        Set<x33.f> setN = zVar.n();
        if (setN == null) {
            return null;
        }
        return c1.h(c1.h(zVar.m(), zVar.f123697c.f()), setN);
    }
}
