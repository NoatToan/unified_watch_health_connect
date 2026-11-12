package t5;

import android.text.Layout;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt5/z;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f162484a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f162485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Layout.Alignment f162486c;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (p005kotlin.jvm.internal.s.g(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (p005kotlin.jvm.internal.s.g(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f162485b = alignment;
        f162486c = alignment2;
    }

    private z() {
    }
}
