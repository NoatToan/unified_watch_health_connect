package jj;

import android.content.Context;
import androidx.fragment.app.v;
import androidx.lifecycle.b0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f98920a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p.b f98921b;

    public class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f98922a;

        public a(b0 b0Var) {
            this.f98922a = b0Var;
        }

        @Override // jj.m
        public final void onDestroy() {
            n.this.f98920a.remove(this.f98922a);
        }

        @Override // jj.m
        public final void onStart() {
        }

        @Override // jj.m
        public final void onStop() {
        }
    }

    public final class b implements q {
        public b(n nVar, v vVar) {
        }
    }

    public n(p.b bVar) {
        this.f98921b = bVar;
    }

    public final com.bumptech.glide.k a(Context context, com.bumptech.glide.b bVar, b0 b0Var, v vVar, boolean z14) {
        qj.m.a();
        qj.m.a();
        HashMap map = this.f98920a;
        com.bumptech.glide.k kVar = (com.bumptech.glide.k) map.get(b0Var);
        if (kVar != null) {
            return kVar;
        }
        l lVar = new l(b0Var);
        b bVar2 = new b(this, vVar);
        ((p.a) this.f98921b).getClass();
        com.bumptech.glide.k kVar2 = new com.bumptech.glide.k(bVar, lVar, bVar2, context);
        map.put(b0Var, kVar2);
        lVar.a(new a(b0Var));
        if (z14) {
            kVar2.onStart();
        }
        return kVar2;
    }
}
