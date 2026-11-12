package i7;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f91899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Typeface f91900b;

    public a(c cVar, m mVar, Typeface typeface) {
        this.f91899a = mVar;
        this.f91900b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f91899a.b(this.f91900b);
    }
}
