package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\b\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/Float16;", "x", "y", "min-AoSsdG0", "(SS)S", "min", "max-AoSsdG0", "max", "ui-graphics_release"}, k = 2, mv = {1, 5, 1})
public final class Float16Kt {
    /* JADX INFO: renamed from: max-AoSsdG0, reason: not valid java name */
    public static final short m1344maxAoSsdG0(short s, short s2) {
        if (Float16.m1317isNaNimpl(s) || Float16.m1317isNaNimpl(s2)) {
            return Float16.INSTANCE.m1339getNaNslo4al4();
        }
        return Float16.m1304compareTo41bOqos(s, s2) >= 0 ? s : s2;
    }

    /* JADX INFO: renamed from: min-AoSsdG0, reason: not valid java name */
    public static final short m1345minAoSsdG0(short s, short s2) {
        if (Float16.m1317isNaNimpl(s) || Float16.m1317isNaNimpl(s2)) {
            return Float16.INSTANCE.m1339getNaNslo4al4();
        }
        return Float16.m1304compareTo41bOqos(s, s2) <= 0 ? s : s2;
    }
}
