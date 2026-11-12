package defpackage;

import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public class id {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vector f21010a = new Vector();

    public void a(gd gdVar) {
        this.f21010a.addElement(gdVar);
    }

    public gd b(int i) {
        return (gd) this.f21010a.elementAt(i);
    }

    public int c() {
        return this.f21010a.size();
    }
}
