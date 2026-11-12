package com.unicom.online.account.kernel;

import android.util.Log;

/* JADX INFO: loaded from: classes20.dex */
public final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f31164a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f31165b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f31166c;
    private static int d;
    private static int e;
    private static StringBuilder f = new StringBuilder();
    private static StringBuilder g = new StringBuilder();
    private static StringBuilder h = new StringBuilder();
    private static StringBuilder i = new StringBuilder();

    public static void c(String str) {
        Log.e("UniAccount", ac.d() + " " + str);
        a(0, str);
    }

    public static void b(String str) {
        if (f31164a) {
            Log.e("UniAccount", ac.d() + " " + str);
            a(0, str);
        }
    }

    private static void b(int i2, String str) {
        StringBuilder sb;
        if (f31164a) {
            if (i2 == 0) {
                sb = g;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        sb = i;
                    }
                    f.append(str);
                }
                sb = h;
            }
            sb.append(str);
            f.append(str);
        }
    }

    public static void a(boolean z) {
        f31164a = z;
    }

    public static void a(String str) {
        if (f31164a) {
            Log.d("UniAccount", ac.d() + " " + str);
            a(0, str);
        }
    }

    public static void a(Exception exc) {
        if (f31164a) {
            exc.printStackTrace();
        }
    }

    public static void a(int i2, String str) {
        if (f31164a) {
            if (i2 == 3) {
                StringBuilder sb = new StringBuilder("【");
                int i3 = e;
                e = i3 + 1;
                sb.append(i3);
                sb.append("】:");
                sb.append(str);
                sb.append("\n");
                b(i2, sb.toString());
                i2 = 1;
            }
            StringBuilder sb2 = new StringBuilder("【");
            int i4 = d;
            d = i4 + 1;
            sb2.append(i4);
            sb2.append("】\n时间戳:");
            sb2.append(System.currentTimeMillis());
            sb2.append("\n时间差:");
            sb2.append(System.currentTimeMillis() - f31166c);
            sb2.append("\n数据:\n");
            sb2.append(str);
            sb2.append("\n\n");
            b(i2, sb2.toString());
            f31166c = System.currentTimeMillis();
        }
    }

    public static void a() {
        d = 0;
        e = 0;
        g.setLength(0);
        g.append("\n\n■★■★■★■★■★■★■★■★■★■\n\ncom debug info\n\n■★■★■★■★■★■★■★■★■★■\n\n");
        f.setLength(0);
        f.append("\n\n■★■★■★■★■★■★■★■★■★■\n\nall debug info\n\n■★■★■★■★■★■★■★■★■★■\n\n");
        h.setLength(0);
        h.append("\n\n■★■★■★■★■★■★■★■★■★■\n\nresult  info\n\n■★■★■★■★■★■★■★■★■★■\n\n");
        i.setLength(0);
        i.append("\n\n■★■★■★■★■★■★■★■★■★■\n\ncost time  info\n\n■★■★■★■★■★■★■★■★■★■\n\n");
    }

    public static String a(int i2) {
        StringBuilder sb;
        if (i2 == 0) {
            sb = g;
        } else if (i2 == 1) {
            sb = f;
        } else if (i2 == 2) {
            sb = h;
        } else {
            if (i2 != 3) {
                return "no info";
            }
            sb = i;
        }
        return sb.toString();
    }
}
