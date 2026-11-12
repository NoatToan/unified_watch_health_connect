package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.j1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class g6t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f18661a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f18662b = 20;
    public static int c = 20;
    public static WeakReference<z5t> d;
    public static int e;

    public static void b(Context context) {
        j1.h().b(new a(context, a.f18663k));
    }

    public static /* synthetic */ void c(Context context, byte[] bArr) throws IOException {
        z5t z5tVarE = h6t.e(d);
        h6t.f(context, z5tVarE, k2t.e, 1000, 307200, "2");
        if (z5tVarE.e == null) {
            z5tVarE.e = new j4t();
        }
        try {
            b6t.b(Integer.toString(new Random().nextInt(100)) + Long.toString(System.nanoTime()), bArr, z5tVarE);
        } catch (Throwable th) {
            m2t.r(th, "stm", "wts");
        }
    }

    public static synchronized void d(List<f6t> list, Context context) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    j1.h().b(new a(context, a.j, list));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void e(f6t f6tVar, Context context) {
        j1.h().b(new a(context, a.i, f6tVar));
    }

    public static synchronized void f(boolean z, int i) {
        f18661a = z;
        e = Math.max(0, i);
    }

    public static synchronized void h(List<f6t> list, Context context) {
        try {
            List<f6t> listP = v4t.p();
            if (listP != null && listP.size() > 0) {
                list.addAll(listP);
            }
        } catch (Throwable unused) {
        }
        d(list, context);
    }

    public static class a extends f7t {
        public static int i = 1;
        public static int j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f18663k = 3;
        public Context d;
        public f6t e;
        public int g;
        public List<f6t> h;

        public a(Context context, int i2) {
            this.d = context;
            this.g = i2;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            f6t f6tVar;
            Throwable th;
            int i2 = this.g;
            if (i2 == 1) {
                try {
                    if (this.d != null && this.e != null) {
                        synchronized (g6t.class) {
                            try {
                                Context context = this.d;
                                if (context != null && (f6tVar = this.e) != null) {
                                    g6t.c(context, f6tVar.b());
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    m2t.r(th3, "stm", "as");
                    return;
                }
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    try {
                        if (this.d == null) {
                            return;
                        }
                        z5t z5tVarE = h6t.e(g6t.d);
                        h6t.f(this.d, z5tVarE, k2t.e, 1000, 307200, "2");
                        if (z5tVarE.g == null) {
                            z5tVarE.g = new i6t(new m6t(this.d, new j6t(new n6t(new p6t()))));
                        }
                        z5tVarE.h = 3600000;
                        if (TextUtils.isEmpty(z5tVarE.i)) {
                            z5tVarE.i = "cKey";
                        }
                        if (z5tVarE.f == null) {
                            Context context2 = this.d;
                            z5tVarE.f = new u6t(context2, z5tVarE.h, z5tVarE.i, new q6t(z5tVarE.f40930a, new s6t(context2, g6t.f18661a, g6t.c * 1024, g6t.f18662b * 1024, "staticUpdate", g6t.e * 1024)));
                        }
                        b6t.a(z5tVarE);
                        return;
                    } catch (Throwable th4) {
                        m2t.r(th4, "stm", "usd");
                        return;
                    }
                }
                return;
            }
            try {
                synchronized (g6t.class) {
                    if (this.h != null && this.d != null) {
                        byte[] byteArray = new byte[0];
                        ByteArrayOutputStream byteArrayOutputStream = null;
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                for (f6t f6tVar2 : this.h) {
                                    if (f6tVar2 != null) {
                                        byteArrayOutputStream2.write(f6tVar2.b());
                                    }
                                }
                                byteArray = byteArrayOutputStream2.toByteArray();
                                try {
                                    byteArrayOutputStream2.close();
                                } catch (Throwable th5) {
                                    th = th5;
                                    th.printStackTrace();
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                try {
                                    m2t.r(th, "stm", "aStB");
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Throwable th7) {
                                            th = th7;
                                            th.printStackTrace();
                                        }
                                    }
                                } catch (Throwable th8) {
                                    if (byteArrayOutputStream == null) {
                                        throw th8;
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th8;
                                    } catch (Throwable th9) {
                                        th9.printStackTrace();
                                        throw th8;
                                    }
                                }
                            }
                        } catch (Throwable th10) {
                            th = th10;
                        }
                        g6t.c(this.d, byteArray);
                    }
                }
            } catch (Throwable th11) {
                m2t.r(th11, "stm", "apb");
            }
        }

        public a(Context context, int i2, List<f6t> list) {
            this(context, i2);
            this.h = list;
        }

        public a(Context context, int i2, f6t f6tVar) {
            this(context, i2);
            this.e = f6tVar;
        }
    }
}
