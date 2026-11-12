package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class sgs implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f33625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<Context> f33626b;

    public sgs(String str, WeakReference<Context> weakReference) {
        this.f33625a = str;
        this.f33626b = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        WeakReference<Context> weakReference = this.f33626b;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return;
        }
        if (iis.a(this.f33625a) <= ogs.f29159b) {
            x9s.y("=====> do not need clean db");
            return;
        }
        bhs bhsVarI = bhs.i(this.f33625a);
        ygs ygsVarK = ygs.k(this.f33625a);
        bhsVarI.g(ygsVarK);
        ygsVarK.g(vgs.j(context, this.f33625a, 1000));
        ths.b(context).d(bhsVarI);
    }
}
