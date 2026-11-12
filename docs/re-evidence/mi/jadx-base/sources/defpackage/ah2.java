package defpackage;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public class ah2 implements ghe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ghe f1007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1008b = 0;
    public int c = -1;
    public int d = -1;
    public Object e = null;

    public ah2(ghe gheVar) {
        this.f1007a = gheVar;
    }

    public void a() {
        int i = this.f1008b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.f1007a.onInserted(this.c, this.d);
        } else if (i == 2) {
            this.f1007a.onRemoved(this.c, this.d);
        } else if (i == 3) {
            this.f1007a.onChanged(this.c, this.d, this.e);
        }
        this.e = null;
        this.f1008b = 0;
    }

    @Override // defpackage.ghe
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i, int i2, Object obj) {
        int i3;
        if (this.f1008b == 3) {
            int i4 = this.c;
            int i5 = this.d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.e == obj) {
                this.c = Math.min(i, i4);
                this.d = Math.max(i5 + i4, i3) - this.c;
                return;
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.f1008b = 3;
    }

    @Override // defpackage.ghe
    public void onInserted(int i, int i2) {
        int i3;
        if (this.f1008b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.f1008b = 1;
    }

    @Override // defpackage.ghe
    public void onMoved(int i, int i2) {
        a();
        this.f1007a.onMoved(i, i2);
    }

    @Override // defpackage.ghe
    public void onRemoved(int i, int i2) {
        int i3;
        if (this.f1008b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
        } else {
            a();
            this.c = i;
            this.d = i2;
            this.f1008b = 2;
        }
    }
}
