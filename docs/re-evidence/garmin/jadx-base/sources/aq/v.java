package aq;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class v {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12266a;

        static {
            int[] iArr = new int[am.x0.values().length];
            try {
                iArr[am.x0.f4326r2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[am.x0.f4329s2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[am.x0.f4322q2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12266a = iArr;
        }
    }

    public static final void a(w wVar, String str, String str2, String str3, String str4, String str5) {
        wVar.f12271b.setText(str);
        b(wVar.f12272c, str2);
        b(wVar.f12273d, str3);
        b(wVar.f12274e, str4);
        b(wVar.f12275f, str5);
        ConstraintLayout constraintLayout = wVar.f12270a;
        if ((str4 == null || str4.length() != 0) && str4 != null) {
            return;
        }
        v22.e.j(constraintLayout);
    }

    public static final void b(TextView textView, String str) {
        if (str == null || str.length() <= 0) {
            v22.e.j(textView);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }
}
