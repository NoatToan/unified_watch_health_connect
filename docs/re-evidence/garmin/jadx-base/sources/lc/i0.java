package lc;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import lc.h0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B-\b\u0000\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\fB#\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\rB?\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e\u0012\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u000f¢\u0006\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Llc/i0;", "Llc/h0;", "D", "", "Llc/v0;", "navigator", "", TtmlNode.ATTR_ID, "", "route", "<init>", "(Llc/v0;ILjava/lang/String;)V", "(Llc/v0;I)V", "(Llc/v0;Ljava/lang/String;)V", "Lk23/d;", "", "Lk23/p;", "Llc/q0;", "typeMap", "(Llc/v0;Lk23/d;Ljava/util/Map;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class i0<D extends h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0<? extends D> f111783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f111784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<k23.p, ? extends q0<?>> f111786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f111787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f111788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f111789g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i0(v0<? extends D> v0Var, k23.d<?> dVar, Map<k23.p, q0<?>> map) {
        this(v0Var, dVar != null ? rc.l.b(gl1.y.J(dVar)) : -1, dVar != null ? rc.l.d(gl1.y.J(dVar), map, null) : null);
        v0Var.getClass();
        map.getClass();
        if (dVar != null) {
            for (r rVar : rc.l.c(gl1.y.J(dVar), map)) {
                this.f111787e.put(rVar.f111860a, rVar.f111861b);
            }
        }
        this.f111786d = map;
    }

    public D a() {
        D d14 = (D) b();
        d14.f111775d = null;
        qc.j jVar = d14.f111773b;
        for (Map.Entry entry : this.f111787e.entrySet()) {
            String str = (String) entry.getKey();
            t tVar = (t) entry.getValue();
            str.getClass();
            tVar.getClass();
            jVar.getClass();
            jVar.f144345d.put(str, tVar);
        }
        Iterator it = this.f111788f.iterator();
        while (it.hasNext()) {
            d14.a((d0) it.next());
        }
        for (Map.Entry entry2 : this.f111789g.entrySet()) {
            d14.j(((Number) entry2.getKey()).intValue(), (s) entry2.getValue());
        }
        String str2 = this.f111785c;
        if (str2 != null) {
            d14.l(str2);
        }
        int i14 = this.f111784b;
        if (i14 != -1) {
            jVar.f144346e = i14;
            jVar.f144343b = null;
        }
        return d14;
    }

    public D b() {
        return (D) this.f111783a.a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public i0(v0<? extends D> v0Var, int i14) {
        this(v0Var, i14, (String) null);
        v0Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i0(v0<? extends D> v0Var, String str) {
        this(v0Var, -1, str);
        v0Var.getClass();
    }

    public i0(v0<? extends D> v0Var, int i14, String str) {
        v0Var.getClass();
        this.f111783a = v0Var;
        this.f111784b = i14;
        this.f111785c = str;
        this.f111787e = new LinkedHashMap();
        this.f111788f = new ArrayList();
        this.f111789g = new LinkedHashMap();
    }
}
