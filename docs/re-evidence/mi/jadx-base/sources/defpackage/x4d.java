package defpackage;

import android.graphics.ColorSpace;
import android.util.Pair;

/* JADX INFO: loaded from: classes4.dex */
public class x4d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair<Integer, Integer> f38679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorSpace f38680b;

    public x4d(int i, int i2, ColorSpace colorSpace) {
        this.f38679a = (i == -1 || i2 == -1) ? null : new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.f38680b = colorSpace;
    }

    public ColorSpace a() {
        return this.f38680b;
    }

    public Pair<Integer, Integer> b() {
        return this.f38679a;
    }
}
