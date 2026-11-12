package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f5273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Typeface f5274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5275c;

    public x(w wVar, TextView textView, Typeface typeface, int i14) {
        this.f5273a = textView;
        this.f5274b = typeface;
        this.f5275c = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5273a.setTypeface(this.f5274b, this.f5275c);
    }
}
