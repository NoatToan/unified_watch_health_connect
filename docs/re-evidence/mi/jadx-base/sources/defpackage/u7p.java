package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class u7p {
    public float c;
    public j7p f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f35502a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l7p f35503b = new a();
    public boolean d = true;
    public WeakReference<b> e = new WeakReference<>(null);

    public class a extends l7p {
        public a() {
        }

        @Override // defpackage.l7p
        public void a(int i) {
            u7p.this.d = true;
            b bVar = (b) u7p.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // defpackage.l7p
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            u7p.this.d = true;
            b bVar = (b) u7p.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public u7p(b bVar) {
        g(bVar);
    }

    public final float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f35502a.measureText(charSequence, 0, charSequence.length());
    }

    public j7p d() {
        return this.f;
    }

    public TextPaint e() {
        return this.f35502a;
    }

    public float f(String str) {
        if (!this.d) {
            return this.c;
        }
        float fC = c(str);
        this.c = fC;
        this.d = false;
        return fC;
    }

    public void g(b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public void h(j7p j7pVar, Context context) {
        if (this.f != j7pVar) {
            this.f = j7pVar;
            if (j7pVar != null) {
                j7pVar.o(context, this.f35502a, this.f35503b);
                b bVar = this.e.get();
                if (bVar != null) {
                    this.f35502a.drawableState = bVar.getState();
                }
                j7pVar.n(context, this.f35502a, this.f35503b);
                this.d = true;
            }
            b bVar2 = this.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z) {
        this.d = z;
    }

    public void j(Context context) {
        this.f.n(context, this.f35502a, this.f35503b);
    }
}
