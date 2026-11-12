package defpackage;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class iyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f22235b;
    public final c1d c;

    public class a implements m1d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int[] f22236a;

        public a(int[] iArr) {
            this.f22236a = iArr;
        }

        @Override // defpackage.m1d
        public void onLoadFailure(String str) {
            iyr.this.f22234a = false;
        }

        @Override // defpackage.m1d
        public void onLoadStart() {
        }

        @Override // defpackage.m1d
        public void onLoadSuccess(String str) {
            iyr.this.f22234a = false;
            int[] iArr = this.f22236a;
            int i = iArr[0] + 1;
            iArr[0] = i;
            iyr.this.c(i);
        }
    }

    public iyr(c1d c1dVar) {
        sk1.c(c1dVar);
        this.c = c1dVar;
    }

    public final void c(int i) {
        int[] iArr = {i};
        if (this.f22235b.size() <= i || TextUtils.isEmpty(this.f22235b.get(i))) {
            return;
        }
        this.c.l(this.f22235b.get(i), new a(iArr));
    }

    public void d() {
        gur gurVarE;
        c1d c1dVar = this.c;
        if (c1dVar == null || (gurVarE = c1dVar.e()) == null || TextUtils.isEmpty(gurVarE.j())) {
            return;
        }
        String strJ = gurVarE.j();
        if (this.c.j("") == null || this.f22234a) {
            return;
        }
        this.f22234a = true;
        k1d k1dVarH = vwr.g().h(strJ);
        if (k1dVarH != null) {
            List<String> preLoadBundle = k1dVarH.getPreLoadBundle();
            this.f22235b = preLoadBundle;
            if (preLoadBundle == null || preLoadBundle.size() <= 0) {
                return;
            }
        }
        c(0);
    }
}
