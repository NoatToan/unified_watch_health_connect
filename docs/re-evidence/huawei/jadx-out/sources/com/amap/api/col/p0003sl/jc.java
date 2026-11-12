package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.operation.utils.CloudParamKeys;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ix f2860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2861c = true;
    private boolean d = false;
    private boolean e = true;
    private boolean f = false;
    private List<String> g = new ArrayList();
    private je h = new je((byte) 0);
    private je i = new je();
    private jw.a j = new jw.a() { // from class: com.amap.api.col.3sl.jc.1
        @Override // com.amap.api.col.3sl.jw.a
        public final void a(int i) {
            if (i > 0 && jc.a(jc.this) != null) {
                ((jd) jc.this.c().f).a(i);
                jc.a(jc.this, VastAttribute.ERROR, String.valueOf(((jd) jc.this.c().f).b()));
                jc.a(jc.this).postDelayed(new Runnable() { // from class: com.amap.api.col.3sl.jc.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        jc.this.c(false);
                    }
                }, 660000L);
            }
        }
    };
    private jw.a k = new jw.a() { // from class: com.amap.api.col.3sl.jc.2
        @Override // com.amap.api.col.3sl.jw.a
        public final void a(int i) {
            if (i <= 0) {
                return;
            }
            ((jd) jc.this.e().f).a(i);
            jc.a(jc.this, CloudParamKeys.INFO, String.valueOf(((jd) jc.this.e().f).b()));
            if (jc.a(jc.this) == null) {
                return;
            }
            jc.a(jc.this).postDelayed(new Runnable() { // from class: com.amap.api.col.3sl.jc.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    jc.this.d(false);
                }
            }, 660000L);
        }
    };
    private Handler l = null;
    private ld m = null;
    private ld n = null;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Map<String, jc> f2866a = new HashMap();
    }

    public static jc a(ix ixVar) {
        if (ixVar == null || TextUtils.isEmpty(ixVar.a())) {
            return null;
        }
        if (a.f2866a.get(ixVar.a()) == null) {
            a.f2866a.put(ixVar.a(), new jc(ixVar));
        }
        return a.f2866a.get(ixVar.a());
    }

    private jc(ix ixVar) {
        this.f2860b = ixVar;
    }

    public final void a(Context context) {
        this.f2859a = context.getApplicationContext();
    }

    public final void a(boolean z, boolean z2, boolean z3, boolean z4, List<String> list) {
        this.f2861c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = list;
        d();
        f();
    }

    public final void a(boolean z) {
        if (b()) {
            b(z);
        }
    }

    public final void a(jb jbVar) {
        if (b() && this.f2861c && jb.a(jbVar) && jbVar != null) {
            List<String> list = this.g;
            if (list != null && list.size() != 0) {
                for (int i = 0; i < this.g.size(); i++) {
                    if (!TextUtils.isEmpty(this.g.get(i)) && jbVar.b().contains(this.g.get(i))) {
                        return;
                    }
                }
            }
            if (this.e || jbVar.a() != jb.f2856a) {
                je jeVarB = b(jbVar.a());
                if (jeVarB.a(jbVar.b())) {
                    String strA = jb.a(jeVarB.a());
                    if (this.f2859a == null || TextUtils.isEmpty(strA) || "[]".equals(strA)) {
                        return;
                    }
                    jw.a(this.f2859a, this.f2860b, jbVar.c(), c(jbVar.a()), strA);
                    b(false);
                    jeVarB.b();
                }
                jeVarB.a(jbVar);
            }
        }
    }

    public final void a() {
        if (b()) {
            a(jb.f2857b);
            a(jb.f2856a);
        }
    }

    private void a(int i) {
        Context context;
        je jeVarB = b(i);
        String strA = jb.a(jeVarB.a());
        if (TextUtils.isEmpty(strA) || "[]".equals(strA) || (context = this.f2859a) == null) {
            return;
        }
        jw.a(context, this.f2860b, jb.a(i), c(i), strA);
        jeVarB.b();
    }

    private boolean b() {
        return this.f2859a != null;
    }

    private je b(int i) {
        if (i == jb.f2857b) {
            return this.i;
        }
        return this.h;
    }

    private void b(boolean z) {
        c(z);
        d(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        ld ldVarC = c(jb.f2857b);
        if (z) {
            ((jd) ldVarC.f).a(z);
        }
        Context context = this.f2859a;
        if (context == null) {
            return;
        }
        jw.a(context, ldVarC, this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        ld ldVarC = c(jb.f2856a);
        if (z) {
            ((jd) ldVarC.f).a(z);
        }
        Context context = this.f2859a;
        if (context == null) {
            return;
        }
        jw.a(context, ldVarC, this.k);
    }

    private ld c(int i) {
        if (i == jb.f2857b) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public ld c() {
        ld ldVar = this.n;
        if (ldVar != null) {
            return ldVar;
        }
        d();
        return this.n;
    }

    private ld d() {
        if (this.f2859a == null) {
            return null;
        }
        ld ldVar = new ld();
        this.n = ldVar;
        ldVar.f3040a = h();
        this.n.f3041b = 512000000L;
        this.n.d = 12500;
        this.n.f3042c = "1";
        this.n.h = -1;
        this.n.i = "elkey";
        long jA = a(VastAttribute.ERROR);
        this.n.f = new jd(true, new ly(this.f2859a, this.d), jA, ExceptionCode.CRASH_EXCEPTION);
        this.n.g = null;
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ld e() {
        ld ldVar = this.m;
        if (ldVar != null) {
            return ldVar;
        }
        f();
        return this.m;
    }

    private long a(String str) {
        try {
            String str2 = new SimpleDateFormat("yyyyMMdd").format(new Date());
            return Long.parseLong(jf.a(this.f2860b).a(this.f2859a, "", "", str2 + str));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private ld f() {
        if (this.f2859a == null) {
            return null;
        }
        ld ldVar = new ld();
        this.m = ldVar;
        ldVar.f3040a = g();
        this.m.f3041b = 512000000L;
        this.m.d = 12500;
        this.m.f3042c = "1";
        this.m.h = -1;
        this.m.i = "inlkey";
        long jA = a(CloudParamKeys.INFO);
        this.m.f = new jd(this.f, new ly(this.f2859a, this.d), jA, 30000000);
        this.m.g = null;
        return this.m;
    }

    private String g() {
        Context context = this.f2859a;
        if (context == null) {
            return null;
        }
        return a(context, "CAF9B6B99962BF5C2264824231D7A40C", this.f2860b);
    }

    private String h() {
        Context context = this.f2859a;
        if (context == null) {
            return null;
        }
        return a(context, "CB5E100E5A9A3E7F6D1FD97512215282", this.f2860b);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    private static String a(Context context, String str, ix ixVar) {
        String strB;
        if (context == null) {
            return null;
        }
        if (ixVar != null) {
            try {
                if (!TextUtils.isEmpty(ixVar.a())) {
                    strB = it.b(ixVar.a());
                } else {
                    strB = "a";
                }
            } catch (Throwable unused) {
                return null;
            }
        } else {
            strB = "a";
        }
        return context.getFilesDir().getAbsolutePath() + File.separator + "EBDEC84EF205FEA2DF0719DEB822869E" + File.separator + str + File.separator + strB;
    }

    static /* synthetic */ Handler a(jc jcVar) {
        Context context = jcVar.f2859a;
        if (context == null || context == null) {
            return null;
        }
        if (jcVar.l == null) {
            jcVar.l = new Handler(jcVar.f2859a.getMainLooper());
        }
        return jcVar.l;
    }

    static /* synthetic */ void a(jc jcVar, String str, String str2) {
        try {
            String str3 = new SimpleDateFormat("yyyyMMdd").format(new Date());
            jf.a(jcVar.f2860b).a(jcVar.f2859a, "", "", str3 + str, str2);
        } catch (Throwable unused) {
        }
    }
}
