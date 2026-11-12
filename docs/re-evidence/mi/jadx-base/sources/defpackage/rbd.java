package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class rbd {
    public static final rbd e = new rbd(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32379b;
    public final int c;
    public final int d;

    @RequiresApi(29)
    public static class a {
        public static Insets a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public rbd(int i, int i2, int i3, int i4) {
        this.f32378a = i;
        this.f32379b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static rbd a(rbd rbdVar, rbd rbdVar2) {
        return b(Math.max(rbdVar.f32378a, rbdVar2.f32378a), Math.max(rbdVar.f32379b, rbdVar2.f32379b), Math.max(rbdVar.c, rbdVar2.c), Math.max(rbdVar.d, rbdVar2.d));
    }

    public static rbd b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new rbd(i, i2, i3, i4);
    }

    public static rbd c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    @RequiresApi(api = 29)
    public static rbd d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    @RequiresApi(29)
    public Insets e() {
        return a.a(this.f32378a, this.f32379b, this.c, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rbd.class != obj.getClass()) {
            return false;
        }
        rbd rbdVar = (rbd) obj;
        return this.d == rbdVar.d && this.f32378a == rbdVar.f32378a && this.c == rbdVar.c && this.f32379b == rbdVar.f32379b;
    }

    public int hashCode() {
        return (((((this.f32378a * 31) + this.f32379b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return "Insets{left=" + this.f32378a + ", top=" + this.f32379b + ", right=" + this.c + ", bottom=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }
}
