package ea;

import android.os.Bundle;
import android.text.Spanned;
import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f63587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f63588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f63589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f63590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f63591e;

    static {
        int i14 = z.f70071a;
        f63587a = Integer.toString(0, 36);
        f63588b = Integer.toString(1, 36);
        f63589c = Integer.toString(2, 36);
        f63590d = Integer.toString(3, 36);
        f63591e = Integer.toString(4, 36);
    }

    private c() {
    }

    public static Bundle a(Spanned spanned, Object obj, int i14, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f63587a, spanned.getSpanStart(obj));
        bundle2.putInt(f63588b, spanned.getSpanEnd(obj));
        bundle2.putInt(f63589c, spanned.getSpanFlags(obj));
        bundle2.putInt(f63590d, i14);
        if (bundle != null) {
            bundle2.putBundle(f63591e, bundle);
        }
        return bundle2;
    }
}
