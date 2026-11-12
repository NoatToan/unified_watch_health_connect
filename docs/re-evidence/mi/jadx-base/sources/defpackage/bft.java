package defpackage;

import defpackage.xdt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class bft<T extends xdt> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vr f4163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<T> f4164b;
    public int c;
    public boolean d;

    public bft(T t) {
        this.f4163a = vr.GSENSOR;
        this.f4164b = new ArrayList<>();
        this.c = 0;
        this.f4163a = t.a();
        this.f4164b.add(t);
    }

    public void a(int i) {
        this.c = i;
    }

    public void b(boolean z) {
        this.d = z;
    }

    public bft(ArrayList<T> arrayList) {
        this.f4163a = vr.GSENSOR;
        this.f4164b = new ArrayList<>();
        this.c = 0;
        this.f4163a = arrayList.get(0).a();
        this.f4164b = arrayList;
    }
}
