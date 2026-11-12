package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class k7s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f23571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23572b;

    public k7s(List list, boolean z) {
        this.f23571a = list;
        this.f23572b = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zF = f7s.f("www.baidu.com:80");
        Iterator it = this.f23571a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zF = zF || f7s.f((String) it.next());
            if (zF && !this.f23572b) {
                break;
            }
        }
        gvs.b(zF ? 1 : 2);
    }
}
