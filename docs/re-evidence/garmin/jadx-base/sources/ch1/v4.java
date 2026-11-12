package ch1;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class v4 extends fb2.r<vk1.j, vk1.j> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27484h = View.generateViewId();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f27485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f27486g;

    public v4(Context context, List<vk1.j> list) {
        super(context);
        this.f27485f = new HashMap();
        this.f27486g = new HashMap();
        Iterator<vk1.j> it = list.iterator();
        while (it.hasNext()) {
            this.f27485f.put(it.next(), Integer.valueOf(View.generateViewId()));
        }
    }

    @Override // fb2.r, fb2.e
    public final boolean g(i.c cVar, Object obj) {
        return y(cVar.findViewById(f27484h), cVar, (vk1.j) obj);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        fb2.f.a((vk1.j) obj, "Model is required");
        return true;
    }

    @Override // fb2.r
    public final Map<vk1.j, CharSequence> r(vk1.j[] jVarArr) {
        HashMap map = this.f27486g;
        if (map.isEmpty()) {
            for (vk1.j jVar : this.f27485f.keySet()) {
                map.put(jVar, b(jVar.f178641a));
            }
        }
        return map;
    }

    @Override // fb2.r
    public final vk1.j s(vk1.j jVar) {
        vk1.j jVar2 = jVar;
        fb2.f.a(jVar2, "Model is required");
        return jVar2;
    }

    @Override // fb2.r
    public final int t() {
        return f27484h;
    }

    @Override // fb2.r
    public final vk1.j[] v(vk1.j jVar) {
        ArrayList arrayList = new ArrayList();
        vk1.j[] jVarArr = {vk1.j.HR_MAX, vk1.j.LACTATE_THRESHOLD, vk1.j.HR_RESERVE};
        for (int i14 = 0; i14 < 3; i14++) {
            vk1.j jVar2 = jVarArr[i14];
            if (this.f27485f.keySet().contains(jVar2)) {
                arrayList.add(jVar2);
            }
        }
        return (vk1.j[]) arrayList.toArray(new vk1.j[arrayList.size()]);
    }

    @Override // fb2.r
    public final int w() {
        return 0;
    }

    @Override // fb2.r
    public final Map<vk1.j, Integer> x() {
        return this.f27485f;
    }

    @Override // fb2.r
    public final /* bridge */ /* synthetic */ void z(vk1.j jVar, vk1.j jVar2) {
    }
}
