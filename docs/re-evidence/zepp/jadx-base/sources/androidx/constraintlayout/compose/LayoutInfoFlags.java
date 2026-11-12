package androidx.constraintlayout.compose;

import com.huami.nfc.bus.NoticesEntity;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/constraintlayout/compose/LayoutInfoFlags;", "", "<init>", "(Ljava/lang/String;I)V", NoticesEntity.LOOP_TYPE_NONE, "BOUNDS", "compose_release"}, k = 1, mv = {1, 5, 1})
public enum LayoutInfoFlags {
    NONE,
    BOUNDS;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static LayoutInfoFlags[] valuesCustom() {
        LayoutInfoFlags[] layoutInfoFlagsArrValuesCustom = values();
        return (LayoutInfoFlags[]) Arrays.copyOf(layoutInfoFlagsArrValuesCustom, layoutInfoFlagsArrValuesCustom.length);
    }
}
