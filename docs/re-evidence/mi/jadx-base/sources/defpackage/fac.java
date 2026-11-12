package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public class fac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17597b;
    public View c;
    public Rect d;

    public int a(int i) {
        int i2 = this.f17597b;
        if ((1610612736 & i2) == i) {
            return (-1610612737) & i2;
        }
        return 0;
    }

    public boolean b() {
        return this.f17596a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof fac) {
            return ((fac) obj).c == this.c;
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
