package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.hihonor.assistant.cardmgrsdk.model.CardDispReqBuilder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean f3058a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static int f3059b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f3060c = 20;
    private static WeakReference<ld> d;
    private static int e;

    public static void a(boolean z, int i) {
        synchronized (lj.class) {
            f3058a = z;
            e = Math.max(0, i);
        }
    }

    static final class a extends mb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static int f3061a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static int f3062b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static int f3063c = 3;
        private Context d;
        private li e;
        private int g;
        private List<li> h;

        a(Context context, int i) {
            this.d = context;
            this.g = i;
        }

        a(Context context, int i, List<li> list) {
            this(context, i);
            this.h = list;
        }

        a(Context context, int i, li liVar) {
            this(context, i);
            this.e = liVar;
        }

        @Override // com.amap.api.col.p0003sl.mb
        public final void runTask() {
            li liVar;
            Throwable th;
            ByteArrayOutputStream byteArrayOutputStream;
            int i = this.g;
            if (i == 1) {
                try {
                    if (this.d != null && this.e != null) {
                        synchronized (lj.class) {
                            Context context = this.d;
                            if (context != null && (liVar = this.e) != null) {
                                lj.a(context, liVar.a());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    jv.c(th2, "stm", "as");
                    return;
                }
            }
            if (i != 2) {
                if (i == 3) {
                    try {
                        if (this.d == null) {
                            return;
                        }
                        ld ldVarA = lk.a(lj.d);
                        lk.a(this.d, ldVarA, jt.h, 1000, CardDispReqBuilder.MAX_IMAGE_SIZE, "2");
                        if (ldVarA.g == null) {
                            ldVarA.g = new ll(new lp(this.d, new lm(new lq(new ls()))));
                        }
                        ldVarA.h = 3600000;
                        if (TextUtils.isEmpty(ldVarA.i)) {
                            ldVarA.i = "cKey";
                        }
                        if (ldVarA.f == null) {
                            ldVarA.f = new lw(this.d, ldVarA.h, ldVarA.i, new lt(ldVarA.f3040a, new lu(this.d, lj.f3058a, lj.f3060c * 1024, lj.f3059b * 1024, "staticUpdate", lj.e * 1024)));
                        }
                        le.a(ldVarA);
                        return;
                    } catch (Throwable th3) {
                        jv.c(th3, "stm", "usd");
                        return;
                    }
                }
                return;
            }
            try {
                synchronized (lj.class) {
                    if (this.h != null && this.d != null) {
                        byte[] byteArray = new byte[0];
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                for (li liVar2 : this.h) {
                                    if (liVar2 != null) {
                                        byteArrayOutputStream.write(liVar2.a());
                                    }
                                }
                                byteArray = byteArrayOutputStream.toByteArray();
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    jv.c(th, "stm", "aStB");
                                    if (byteArrayOutputStream != null) {
                                    }
                                    lj.a(this.d, byteArray);
                                } catch (Throwable th5) {
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Throwable th6) {
                                            th6.printStackTrace();
                                        }
                                    }
                                    throw th5;
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            byteArrayOutputStream = null;
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th8) {
                            th8.printStackTrace();
                        }
                        lj.a(this.d, byteArray);
                    }
                }
            } catch (Throwable th9) {
                jv.c(th9, "stm", "apb");
            }
        }
    }

    public static void a(li liVar, Context context) {
        synchronized (lj.class) {
            ma.a().a(new a(context, a.f3061a, liVar));
        }
    }

    public static void a(List<li> list, Context context) {
        synchronized (lj.class) {
            if (list != null) {
                try {
                    if (list.size() != 0) {
                        ma.a().a(new a(context, a.f3062b, list));
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void b(List<li> list, Context context) {
        synchronized (lj.class) {
            try {
                List<li> listB = kw.b();
                if (listB != null && listB.size() > 0) {
                    list.addAll(listB);
                }
            } catch (Throwable unused) {
            }
            a(list, context);
        }
    }

    public static void a(Context context) {
        ma.a().a(new a(context, a.f3063c));
    }

    static /* synthetic */ void a(Context context, byte[] bArr) throws IOException {
        ld ldVarA = lk.a(d);
        lk.a(context, ldVarA, jt.h, 1000, CardDispReqBuilder.MAX_IMAGE_SIZE, "2");
        if (ldVarA.e == null) {
            ldVarA.e = new kj();
        }
        try {
            le.a(Integer.toString(new Random().nextInt(100)) + Long.toString(System.nanoTime()), bArr, ldVarA);
        } catch (Throwable th) {
            jv.c(th, "stm", "wts");
        }
    }
}
