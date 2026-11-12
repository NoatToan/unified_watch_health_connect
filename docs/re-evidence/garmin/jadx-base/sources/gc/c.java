package gc;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f76786f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f76788h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f76795o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f76781a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f76782b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<String> f76783c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f76784d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f76785e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f76787g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f76789i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f76790j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f76791k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f76792l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f76793m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f76794n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f76796p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f76797q = false;

    public static int a(int i14, String str, String str2, int i15) {
        if (str.isEmpty() || i14 == -1) {
            return i14;
        }
        if (str.equals(str2)) {
            return i14 + i15;
        }
        return -1;
    }
}
