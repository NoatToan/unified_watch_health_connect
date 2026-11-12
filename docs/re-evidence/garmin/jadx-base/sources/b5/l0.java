package b5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lb5/l0;", "", "packedValue", "", "Landroidx/compose/ui/input/pointer/NativePointerKeyboardModifiers;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15836a;

    private /* synthetic */ l0(int i14) {
        this.f15836a = i14;
    }

    public static final /* synthetic */ l0 a(int i14) {
        return new l0(i14);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l0) {
            return this.f15836a == ((l0) obj).f15836a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15836a);
    }

    public final String toString() {
        return ds.e0.i("PointerKeyboardModifiers(packedValue=", this.f15836a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
