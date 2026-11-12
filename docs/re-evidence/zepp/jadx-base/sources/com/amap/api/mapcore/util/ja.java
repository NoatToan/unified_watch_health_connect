package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.hm.health.Constant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public class ja {
    public static boolean a = false;
    public static int b = 20;
    private static int c = 20;
    private static WeakReference<iu> d;
    private static int e;

    public static synchronized void a(iz izVar, Context context) {
        hn.d().submit(new a(context, a.a, izVar));
    }

    public static class a implements Runnable {
        public static int a = 1;
        public static int b = 2;
        public static int c = 3;
        private Context d;
        private iz e;
        private int f;
        private List<iz> g;

        public a(Context context, int i) {
            this.d = context;
            this.f = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            iz izVar;
            Throwable th;
            int i = this.f;
            if (i == 1) {
                try {
                    if (this.d != null && this.e != null) {
                        synchronized (ja.class) {
                            Context context = this.d;
                            if (context != null && (izVar = this.e) != null) {
                                ja.a(context, izVar.a());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    hn.c(th2, "stm", Constant.PAI_KEY_ACTIVITY_SCORES);
                    return;
                }
            }
            if (i != 2) {
                if (i == 3) {
                    try {
                        if (this.d == null) {
                            return;
                        }
                        iu iuVarA = jb.a(ja.d);
                        jb.a(this.d, iuVarA, hl.h, 1000, 307200, "2");
                        if (iuVarA.g == null) {
                            iuVarA.g = new jc(new jg(this.d, new jd(new jh(new jj()))));
                        }
                        iuVarA.h = 3600000;
                        if (TextUtils.isEmpty(iuVarA.i)) {
                            iuVarA.i = "cKey";
                        }
                        if (iuVarA.f == null) {
                            Context context2 = this.d;
                            iuVarA.f = new jn(context2, iuVarA.h, iuVarA.i, new jk(iuVarA.a, new jl(context2, ja.a, ja.c * 1024, ja.b * 1024, "staticUpdate", ja.e * 1024)));
                        }
                        iv.a(iuVarA);
                        return;
                    } catch (Throwable th3) {
                        hn.c(th3, "stm", "usd");
                        return;
                    }
                }
                return;
            }
            try {
                synchronized (ja.class) {
                    if (this.g != null && this.d != null) {
                        ByteArrayOutputStream byteArrayOutputStream = null;
                        byte[] byteArray = new byte[0];
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                for (iz izVar2 : this.g) {
                                    if (izVar2 != null) {
                                        byteArrayOutputStream2.write(izVar2.a());
                                    }
                                }
                                byteArray = byteArrayOutputStream2.toByteArray();
                                try {
                                    byteArrayOutputStream2.close();
                                } catch (Throwable th4) {
                                    th = th4;
                                    th.printStackTrace();
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                try {
                                    hn.c(th, "stm", "aStB");
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Throwable th6) {
                                            th = th6;
                                            th.printStackTrace();
                                        }
                                    }
                                } catch (Throwable th7) {
                                    if (byteArrayOutputStream == null) {
                                        throw th7;
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th8.printStackTrace();
                                        throw th7;
                                    }
                                }
                            }
                        } catch (Throwable th9) {
                            th = th9;
                        }
                        ja.a(this.d, byteArray);
                    }
                }
            } catch (Throwable th10) {
                hn.c(th10, "stm", "apb");
            }
        }

        public a(Context context, int i, List<iz> list) {
            this(context, i);
            this.g = list;
        }

        public a(Context context, int i, iz izVar) {
            this(context, i);
            this.e = izVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
    
        if (r4.size() == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void a(List<iz> list, Context context) {
        if (list != null) {
        }
        return;
        hn.d().submit(new a(context, a.b, list));
    }

    public static void a(Context context) {
        hn.d().submit(new a(context, a.c));
    }

    public static /* synthetic */ void a(Context context, byte[] bArr) throws IOException {
        iu iuVarA = jb.a(d);
        jb.a(context, iuVarA, hl.h, 1000, 307200, "2");
        if (iuVarA.e == null) {
            iuVarA.e = new ib();
        }
        try {
            iv.a(Integer.toString(new Random().nextInt(100)) + Long.toString(System.nanoTime()), bArr, iuVarA);
        } catch (Throwable th) {
            hn.c(th, "stm", "wts");
        }
    }
}
