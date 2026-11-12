package ks;

import am.x0;
import c80.m0;
import c80.n0;
import d53.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import t13.d;
import zd0.e0;
import zd0.l0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lks/b;", "Lzd0/e0;", "Lam/x0;", "activityType", "<init>", "(Lam/x0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x0 f106376i;

    public b(x0 x0Var) {
        this.f106376i = x0Var;
    }

    @Override // zd0.e0
    public final m0 a() {
        return m0.f25442f;
    }

    @Override // zd0.e0
    public final Object c(d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        String str;
        String str2;
        String str3 = n0Var.f25479d;
        x0 x0Var = this.f106376i;
        if (str3 != null && str3.length() != 0) {
            if (x0Var == null || (str2 = x0Var.f4358a) == null) {
                return l0.HIDE;
            }
            List listW = w.W(str3, new String[]{","});
            ArrayList arrayList = new ArrayList(y.r(listW, 10));
            Iterator it = listW.iterator();
            while (it.hasNext()) {
                arrayList.add(w.i0((String) it.next()).toString());
            }
            if (!arrayList.contains(str2)) {
                return l0.HIDE;
            }
        }
        String str4 = n0Var.f25480e;
        if (str4 != null && str4.length() != 0) {
            if (x0Var == null || (str = x0Var.f4358a) == null) {
                return l0.HIDE;
            }
            List listW2 = w.W(str4, new String[]{","});
            ArrayList arrayList2 = new ArrayList(y.r(listW2, 10));
            Iterator it3 = listW2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(w.i0((String) it3.next()).toString());
            }
            if (arrayList2.contains(str)) {
                return l0.HIDE;
            }
        }
        return l0.SHOW;
    }
}
