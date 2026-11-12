package com.loc;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.hm.health.Constant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes18.dex */
public class bb {
    public static boolean a = false;
    public static int b = 20;
    private static int c = 20;
    private static WeakReference<aw> d;
    private static int e;

    public static class a implements Runnable {
        public static int a = 1;
        public static int b = 2;
        public static int c = 3;
        private Context d;
        private ba e;
        private int f;
        private List<ba> g;

        public a(Context context, int i) {
            this.d = context;
            this.f = i;
        }

        public a(Context context, int i, ba baVar) {
            this(context, i);
            this.e = baVar;
        }

        public a(Context context, int i, List<ba> list) {
            this(context, i);
            this.g = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            String str2;
            ba baVar;
            Throwable th;
            int i = this.f;
            if (i == 1) {
                try {
                    if (this.d != null && this.e != null) {
                        synchronized (bb.class) {
                            Context context = this.d;
                            if (context != null && (baVar = this.e) != null) {
                                bb.a(context, baVar.a());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    str = "stm";
                    str2 = Constant.PAI_KEY_ACTIVITY_SCORES;
                }
            } else {
                if (i != 2) {
                    if (i == 3) {
                        try {
                            if (this.d == null) {
                                return;
                            }
                            aw awVarA = bc.a(bb.d);
                            bc.a(this.d, awVarA, z.h, 1000, 307200, "2");
                            if (awVarA.g == null) {
                                awVarA.g = new bd(new bh(this.d, new be(new bi(new bk()))));
                            }
                            awVarA.h = 3600000;
                            if (TextUtils.isEmpty(awVarA.i)) {
                                awVarA.i = "cKey";
                            }
                            if (awVarA.f == null) {
                                Context context2 = this.d;
                                awVarA.f = new bo(context2, awVarA.h, awVarA.i, new bl(awVarA.a, new bm(context2, bb.a, bb.c * 1024, bb.b * 1024, "staticUpdate", bb.e * 1024)));
                            }
                            ax.a(awVarA);
                            return;
                        } catch (Throwable th3) {
                            ab.b(th3, "stm", "usd");
                            return;
                        }
                    }
                    return;
                }
                try {
                    synchronized (bb.class) {
                        if (this.g != null && this.d != null) {
                            ByteArrayOutputStream byteArrayOutputStream = null;
                            byte[] byteArray = new byte[0];
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                try {
                                    for (ba baVar2 : this.g) {
                                        if (baVar2 != null) {
                                            byteArrayOutputStream2.write(baVar2.a());
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
                                        ab.b(th, "stm", "aStB");
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
                            bb.a(this.d, byteArray);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    str = "stm";
                    str2 = "apb";
                }
            }
            ab.b(th, str, str2);
        }
    }

    public static void a(Context context) {
        ab.d().submit(new a(context, a.c));
    }

    public static /* synthetic */ void a(Context context, byte[] bArr) throws IOException {
        aw awVarA = bc.a(d);
        bc.a(context, awVarA, z.h, 1000, 307200, "2");
        if (awVarA.e == null) {
            awVarA.e = new am();
        }
        try {
            ax.a(Integer.toString(new Random().nextInt(100)) + Long.toString(System.nanoTime()), bArr, awVarA);
        } catch (Throwable th) {
            ab.b(th, "stm", "wts");
        }
    }

    public static synchronized void a(ba baVar, Context context) {
        ab.d().submit(new a(context, a.a, baVar));
    }

    public static synchronized void a(List<ba> list, Context context) {
        try {
            if (list.size() == 0) {
                return;
            }
        } catch (Throwable unused) {
        }
        ab.d().submit(new a(context, a.b, list));
    }

    public static synchronized void a(boolean z, int i) {
        a = z;
        e = Math.max(0, i);
    }
}
