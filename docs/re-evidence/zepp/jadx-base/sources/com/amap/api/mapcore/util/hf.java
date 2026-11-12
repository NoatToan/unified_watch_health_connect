package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hf {
    private Context a;
    private gt b;
    private boolean c = true;
    private boolean d = false;
    private boolean e = true;
    private boolean f = false;
    private List<String> g = new ArrayList();
    private hh h = new hh((byte) 0);
    private hh i = new hh();
    private ho.a j = new ho.a() { // from class: com.amap.api.mapcore.util.hf.1
        @Override // com.amap.api.mapcore.util.ho.a
        public final void a(int i) {
            if (i > 0 && hf.a(hf.this) != null) {
                ((hg) hf.this.c().f).a(i);
                hf.a(hf.this, "error", String.valueOf(((hg) hf.this.c().f).b()));
                hf.a(hf.this).postDelayed(new Runnable() { // from class: com.amap.api.mapcore.util.hf.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        hf.this.c(false);
                    }
                }, 660000L);
            }
        }
    };
    private ho.a k = new ho.a() { // from class: com.amap.api.mapcore.util.hf.2
        @Override // com.amap.api.mapcore.util.ho.a
        public final void a(int i) {
            if (i <= 0) {
                return;
            }
            ((hg) hf.this.e().f).a(i);
            hf.a(hf.this, "info", String.valueOf(((hg) hf.this.e().f).b()));
            if (hf.a(hf.this) == null) {
                return;
            }
            hf.a(hf.this).postDelayed(new Runnable() { // from class: com.amap.api.mapcore.util.hf.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    hf.this.d(false);
                }
            }, 660000L);
        }
    };
    private Handler l = null;
    private iu m = null;
    private iu n = null;

    public static class a {
        public static Map<String, hf> a = new HashMap();
    }

    private hf(gt gtVar) {
        this.b = gtVar;
    }

    public static hf a(gt gtVar) {
        if (gtVar == null || TextUtils.isEmpty(gtVar.a())) {
            return null;
        }
        if (a.a.get(gtVar.a()) == null) {
            a.a.put(gtVar.a(), new hf(gtVar));
        }
        return a.a.get(gtVar.a());
    }

    private iu f() {
        if (this.a == null) {
            return null;
        }
        iu iuVar = new iu();
        this.m = iuVar;
        iuVar.a = g();
        iu iuVar2 = this.m;
        iuVar2.b = 512000000L;
        iuVar2.d = GoogleSignInStatusCodes.SIGN_IN_FAILED;
        iuVar2.c = "1";
        iuVar2.h = -1;
        iuVar2.i = "inlkey";
        long jA = a("info");
        this.m.f = new hg(this.f, new jp(this.a, this.d), jA, 30000000);
        iu iuVar3 = this.m;
        iuVar3.g = null;
        return iuVar3;
    }

    private String g() {
        Context context = this.a;
        if (context == null) {
            return null;
        }
        return a(context, "CAF9B6B99962BF5C2264824231D7A40C", this.b);
    }

    private String h() {
        Context context = this.a;
        if (context == null) {
            return null;
        }
        return a(context, "CB5E100E5A9A3E7F6D1FD97512215282", this.b);
    }

    private boolean b() {
        return this.a != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        iu iuVarC = c(he.b);
        if (z) {
            ((hg) iuVarC.f).a(z);
        }
        Context context = this.a;
        if (context == null) {
            return;
        }
        ho.a(context, iuVarC, this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        iu iuVarC = c(he.a);
        if (z) {
            ((hg) iuVarC.f).a(z);
        }
        Context context = this.a;
        if (context == null) {
            return;
        }
        ho.a(context, iuVarC, this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public iu e() {
        iu iuVar = this.m;
        if (iuVar != null) {
            return iuVar;
        }
        f();
        return this.m;
    }

    private hh b(int i) {
        if (i == he.b) {
            return this.i;
        }
        return this.h;
    }

    public final void a(Context context) {
        this.a = context.getApplicationContext();
    }

    private void b(boolean z) {
        c(z);
        d(z);
    }

    private iu c(int i) {
        if (i == he.b) {
            if (this.n == null) {
                this.n = c();
            }
            return this.n;
        }
        if (this.m == null) {
            this.m = e();
        }
        return this.m;
    }

    private iu d() {
        if (this.a == null) {
            return null;
        }
        iu iuVar = new iu();
        this.n = iuVar;
        iuVar.a = h();
        iu iuVar2 = this.n;
        iuVar2.b = 512000000L;
        iuVar2.d = GoogleSignInStatusCodes.SIGN_IN_FAILED;
        iuVar2.c = "1";
        iuVar2.h = -1;
        iuVar2.i = "elkey";
        long jA = a("error");
        this.n.f = new hg(true, new jp(this.a, this.d), jA, 10000000);
        iu iuVar3 = this.n;
        iuVar3.g = null;
        return iuVar3;
    }

    public final void a(boolean z, boolean z2, boolean z3, boolean z4, List<String> list) {
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = list;
        d();
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public iu c() {
        iu iuVar = this.n;
        if (iuVar != null) {
            return iuVar;
        }
        d();
        return this.n;
    }

    public final void a(boolean z) {
        if (b()) {
            b(z);
        }
    }

    public final void a(he heVar) {
        if (b() && this.c && he.a(heVar)) {
            boolean z = true;
            if (heVar != null) {
                List<String> list = this.g;
                if (list != null && list.size() != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= this.g.size()) {
                            z = false;
                            break;
                        } else if (!TextUtils.isEmpty(this.g.get(i)) && heVar.b().contains(this.g.get(i))) {
                            break;
                        } else {
                            i++;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return;
            }
            if (this.e || heVar.a() != he.a) {
                hh hhVarB = b(heVar.a());
                if (hhVarB.a(heVar.b())) {
                    String strA = he.a(hhVarB.a());
                    if (this.a == null || TextUtils.isEmpty(strA) || "[]".equals(strA)) {
                        return;
                    }
                    ho.a(this.a, this.b, heVar.c(), c(heVar.a()), strA);
                    b(false);
                    hhVarB.b();
                }
                hhVarB.a(heVar);
            }
        }
    }

    public final void a() {
        if (b()) {
            a(he.b);
            a(he.a);
        }
    }

    private void a(int i) {
        Context context;
        hh hhVarB = b(i);
        String strA = he.a(hhVarB.a());
        if (TextUtils.isEmpty(strA) || "[]".equals(strA) || (context = this.a) == null) {
            return;
        }
        ho.a(context, this.b, he.a(i), c(i), strA);
        hhVarB.b();
    }

    private long a(String str) {
        try {
            String str2 = new SimpleDateFormat("yyyyMMdd").format(new Date());
            return Long.parseLong(hi.a(this.b).a(this.a, "", "", str2 + str));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    private static String a(Context context, String str, gt gtVar) {
        String strB;
        if (context == null) {
            return null;
        }
        if (gtVar != null) {
            try {
                if (TextUtils.isEmpty(gtVar.a())) {
                    strB = "a";
                } else {
                    strB = gr.b(gtVar.a());
                }
            } catch (Throwable unused) {
                return null;
            }
        } else {
            strB = "a";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append("EBDEC84EF205FEA2DF0719DEB822869E");
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        sb.append(strB);
        return sb.toString();
    }

    public static /* synthetic */ Handler a(hf hfVar) {
        Context context = hfVar.a;
        if (context == null || context == null) {
            return null;
        }
        if (hfVar.l == null) {
            hfVar.l = new Handler(hfVar.a.getMainLooper());
        }
        return hfVar.l;
    }

    public static /* synthetic */ void a(hf hfVar, String str, String str2) {
        try {
            String str3 = new SimpleDateFormat("yyyyMMdd").format(new Date());
            hi.a(hfVar.b).a(hfVar.a, "", "", str3 + str, str2);
        } catch (Throwable unused) {
        }
    }
}
