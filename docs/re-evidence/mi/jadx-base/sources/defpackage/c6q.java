package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class c6q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Typeface f4997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Typeface f4998b;

    public static void a(TextView textView) {
        try {
            if (f4997a == null) {
                f4997a = Typeface.create("sans-serif-light", 0);
            }
            textView.setTypeface(f4997a);
        } catch (Exception unused) {
            textView.setTypeface(Typeface.DEFAULT);
        }
    }

    public static void b(TextView textView) {
        try {
            if (f4998b == null) {
                f4998b = Typeface.create("sans-serif-medium", 0);
            }
            textView.setTypeface(f4998b);
        } catch (Exception unused) {
            textView.setTypeface(Typeface.DEFAULT);
        }
    }
}
