package defpackage;

import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public class jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vector f22657a = new Vector();

    public void a(hd hdVar) {
        this.f22657a.addElement(hdVar);
    }

    public hd b(int i) {
        return (hd) this.f22657a.elementAt(i);
    }

    public int c() {
        return this.f22657a.size();
    }
}
