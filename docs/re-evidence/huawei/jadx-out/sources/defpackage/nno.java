package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class nno {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<nnp> f43326a = new ArrayList<>();
    private String e;

    public nno(String str) {
        this.e = str;
    }

    public String c() {
        return this.e;
    }

    public ArrayList<nnp> b() {
        return this.f43326a;
    }

    public void b(nnp nnpVar) {
        this.f43326a.add(nnpVar);
    }

    public void d() {
        ArrayList<nnp> arrayList = this.f43326a;
        if (arrayList != null) {
            arrayList.clear();
            this.f43326a = new ArrayList<>();
        }
    }
}
