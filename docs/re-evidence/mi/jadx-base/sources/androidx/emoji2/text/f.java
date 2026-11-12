package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import defpackage.ekp;
import defpackage.g6i;
import defpackage.otf;
import defpackage.ptf;
import defpackage.z88;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final otf f2304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f2305b;
    public final a c = new a(1024);
    public final Typeface d;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f2306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public z88 f2307b;

        public a() {
            this(1);
        }

        public a a(int i) {
            SparseArray<a> sparseArray = this.f2306a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        public final z88 b() {
            return this.f2307b;
        }

        public void c(z88 z88Var, int i, int i2) {
            a aVarA = a(z88Var.b(i));
            if (aVarA == null) {
                aVarA = new a();
                this.f2306a.put(z88Var.b(i), aVarA);
            }
            if (i2 > i) {
                aVarA.c(z88Var, i + 1, i2);
            } else {
                aVarA.f2307b = z88Var;
            }
        }

        public a(int i) {
            this.f2306a = new SparseArray<>(i);
        }
    }

    public f(Typeface typeface, otf otfVar) {
        this.d = typeface;
        this.f2304a = otfVar;
        this.f2305b = new char[otfVar.k() * 2];
        a(otfVar);
    }

    public static f b(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            ekp.a("EmojiCompat.MetadataRepo.create");
            return new f(typeface, ptf.b(byteBuffer));
        } finally {
            ekp.b();
        }
    }

    public final void a(otf otfVar) {
        int iK = otfVar.k();
        for (int i = 0; i < iK; i++) {
            z88 z88Var = new z88(this, i);
            Character.toChars(z88Var.f(), this.f2305b, i * 2);
            h(z88Var);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public char[] c() {
        return this.f2305b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public otf d() {
        return this.f2304a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int e() {
        return this.f2304a.l();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public a f() {
        return this.c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Typeface g() {
        return this.d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public void h(z88 z88Var) {
        g6i.h(z88Var, "emoji metadata cannot be null");
        g6i.b(z88Var.c() > 0, "invalid metadata codepoint length");
        this.c.c(z88Var, 0, z88Var.c() - 1);
    }
}
