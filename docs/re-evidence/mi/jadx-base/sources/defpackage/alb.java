package defpackage;

import androidx.collection.SparseArrayCompat;

/* JADX INFO: loaded from: classes3.dex */
public class alb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArrayCompat<String> f1167a = new SparseArrayCompat<>();
    public static final int c = 268435456;
    public static final int e = 268435456;
    public static final int f = 268435457;
    public static final int g = 268435458;
    public static final int h = 268435459;
    public static final int i = 268435460;
    public static final int j = 268435461;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f1169k = 268435462;
    public static final int l = 268435463;
    public static final int m = 268435464;
    public static final int n = 268435465;
    public static final int o = 268435466;
    public static final int p = 268435467;
    public static final int q = 268435468;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f1170r = 268435469;
    public static final int s = 268435470;
    public static final int t = 268435471;
    public static final int d = 268435472;
    public static final int u = 268435472;
    public static final int w = 268435472;
    public static final int x = 268435473;
    public static final int y = 268435474;
    public static final int z = 268435475;
    public static final int A = 268435476;
    public static final int B = 268435477;
    public static final int C = 268435478;
    public static final int D = 268435479;
    public static final int E = 268435480;
    public static final int F = 268435481;
    public static final int v = 268435482;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f1168b = 268435482;

    static {
        a();
    }

    public static void a() {
        SparseArrayCompat<String> sparseArrayCompat = f1167a;
        sparseArrayCompat.append(e, "MIUI_VIRTUAL_RELEASE");
        sparseArrayCompat.append(f, "MIUI_TAP_NORMAL");
        sparseArrayCompat.append(g, "MIUI_TAP_LIGHT");
        sparseArrayCompat.append(h, "MIUI_FLICK");
        sparseArrayCompat.append(i, "MIUI_SWITCH");
        sparseArrayCompat.append(j, "MIUI_MESH_HEAVY");
        sparseArrayCompat.append(f1169k, "MIUI_MESH_NORMAL");
        sparseArrayCompat.append(l, "MIUI_MESH_LIGHT");
        sparseArrayCompat.append(m, "MIUI_LONG_PRESS");
        sparseArrayCompat.append(n, "MIUI_POPUP_NORMAL");
        sparseArrayCompat.append(o, "MIUI_POPUP_LIGHT");
        sparseArrayCompat.append(p, "MIUI_PICK_UP");
        sparseArrayCompat.append(q, "MIUI_SCROLL_EDGE");
        sparseArrayCompat.append(f1170r, "MIUI_TRIGGER_DRAWER");
        sparseArrayCompat.append(s, "MIUI_FLICK_LIGHT");
        sparseArrayCompat.append(t, "MIUI_HOLD");
        sparseArrayCompat.append(w, "MIUI_BOUNDARY_SPATIAL");
        sparseArrayCompat.append(x, "MIUI_BOUNDARY_TIME");
        sparseArrayCompat.append(y, "MIUI_BUTTON_LARGE");
        sparseArrayCompat.append(z, "MIUI_BUTTON_MIDDLE");
        sparseArrayCompat.append(A, "MIUI_BUTTON_SMALL");
        sparseArrayCompat.append(B, "MIUI_GEAR_LIGHT");
        sparseArrayCompat.append(C, "MIUI_GEAR_HEAVY");
        sparseArrayCompat.append(D, "MIUI_KEYBOARD");
        sparseArrayCompat.append(E, "MIUI_ALERT");
        sparseArrayCompat.append(F, "MIUI_ZAXIS_SWITCH");
    }

    public static String b(int i2) {
        return f1167a.get(i2, "IllegalFeedback");
    }
}
