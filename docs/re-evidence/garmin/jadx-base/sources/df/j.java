package df;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;

/* JADX INFO: loaded from: classes7.dex */
public class j implements z0<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f59404a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ef.b f59405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f59406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p.a f59407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0 f59408e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f59409a;

        public a(Object obj) {
            this.f59409a = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (j.this.f59406c) {
                try {
                    Object objMo330apply = j.this.f59407d.mo330apply(this.f59409a);
                    j jVar = j.this;
                    Object obj = jVar.f59404a;
                    if (obj == null && objMo330apply != null) {
                        jVar.f59404a = objMo330apply;
                        jVar.f59408e.j(objMo330apply);
                    } else if (obj != null && !obj.equals(objMo330apply)) {
                        j jVar2 = j.this;
                        jVar2.f59404a = objMo330apply;
                        jVar2.f59408e.j(objMo330apply);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public j(ef.b bVar, Object obj, p.a aVar, w0 w0Var) {
        this.f59405b = bVar;
        this.f59406c = obj;
        this.f59407d = aVar;
        this.f59408e = w0Var;
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        this.f59405b.b(new a(obj));
    }
}
