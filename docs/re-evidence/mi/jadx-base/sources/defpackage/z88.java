package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.f;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class z88 {
    public static final ThreadLocal<ntf> d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f41012b;
    public volatile int c = 0;

    public z88(f fVar, @IntRange(from = 0) int i) {
        this.f41012b = fVar;
        this.f41011a = i;
    }

    public void a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface typefaceG = this.f41012b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f41012b.c(), this.f41011a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i) {
        return g().h(i);
    }

    public int c() {
        return g().i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int d() {
        return this.c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public final ntf g() {
        ThreadLocal<ntf> threadLocal = d;
        ntf ntfVar = threadLocal.get();
        if (ntfVar == null) {
            ntfVar = new ntf();
            threadLocal.set(ntfVar);
        }
        this.f41012b.d().j(ntfVar, this.f41011a);
        return ntfVar;
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void k(boolean z) {
        this.c = z ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int iC = c();
        for (int i = 0; i < iC; i++) {
            sb.append(Integer.toHexString(b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
