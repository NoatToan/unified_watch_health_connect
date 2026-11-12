package defpackage;

import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes4.dex */
public class u4d extends f52 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f35366b = -1;
    public long c = -1;
    public v4d d;

    public u4d(v4d v4dVar) {
        this.d = v4dVar;
    }

    @Override // defpackage.f52, defpackage.uj4
    public void b(String str, Object obj) {
        this.f35366b = System.currentTimeMillis();
    }

    @Override // defpackage.f52, defpackage.uj4
    public void e(String str, Object obj, Animatable animatable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.c = jCurrentTimeMillis;
        v4d v4dVar = this.d;
        if (v4dVar != null) {
            v4dVar.a(jCurrentTimeMillis - this.f35366b);
        }
    }
}
