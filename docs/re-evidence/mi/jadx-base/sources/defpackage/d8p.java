package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d8p extends ReplacementSpan implements xej {
    public static void g(Spannable spannable, TextView textView) {
        for (d8p d8pVar : (d8p[]) spannable.getSpans(0, spannable.length(), d8p.class)) {
            d8pVar.c();
            d8pVar.h(textView);
        }
    }

    public abstract Drawable a();

    public abstract int b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void h(TextView textView);
}
