package defpackage;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oi3 extends l7p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f29191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f29192b;
    public boolean c;

    public interface a {
        void a(Typeface typeface);
    }

    public oi3(a aVar, Typeface typeface) {
        this.f29191a = typeface;
        this.f29192b = aVar;
    }

    @Override // defpackage.l7p
    public void a(int i) {
        d(this.f29191a);
    }

    @Override // defpackage.l7p
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.c = true;
    }

    public final void d(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.f29192b.a(typeface);
    }
}
