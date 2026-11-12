package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class cir {
    private ArrayList<civ> e = new ArrayList<>(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<ciq> f1626c = new ArrayList<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<ciu> f1625b = new ArrayList<>(16);

    public void a(ArrayList<civ> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.add(i, arrayList.get(i));
        }
    }

    public void e(ArrayList<ciq> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f1626c.add(i, arrayList.get(i));
        }
    }

    public void d(ArrayList<ciu> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f1625b.add(i, arrayList.get(i));
        }
    }

    public ArrayList<civ> d() {
        return this.e;
    }

    public ArrayList<ciq> e() {
        return this.f1626c;
    }

    public ArrayList<ciu> b() {
        return this.f1625b;
    }
}
