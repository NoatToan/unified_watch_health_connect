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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lks/a;", "Lzd0/e0;", "Lam/x0;", "activityType", "", "isManualActivity", "isOwnedActivity", "<init>", "(Lam/x0;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x0 f106373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f106374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f106375k;

    public a(x0 x0Var, Boolean bool, Boolean bool2) {
        this.f106373i = x0Var;
        this.f106374j = bool;
        this.f106375k = bool2;
    }

    @Override // zd0.e0
    public final m0 a() {
        return null;
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
        x0 x0Var = this.f106373i;
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
        Boolean bool = n0Var.f25481f;
        if (bool != null && !bool.equals(this.f106374j)) {
            return l0.HIDE;
        }
        Boolean bool2 = n0Var.f25482g;
        return (bool2 == null || bool2.equals(this.f106375k)) ? l0.SHOW : l0.HIDE;
    }
}
