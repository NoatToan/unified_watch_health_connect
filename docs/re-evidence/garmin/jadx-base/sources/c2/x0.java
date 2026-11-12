package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc2/x0;", "", "", "lineIndex", "positionInLine", "Lg6/f;", "maxMainAxisSize", "maxCrossAxisSize", "<init>", "(IIFFLkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public x0(int i14, int i15, float f14, float f15, int i16, p005kotlin.jvm.internal.j jVar) {
        int i17 = (i16 & 1) != 0 ? 0 : i14;
        int i18 = (i16 & 2) != 0 ? 0 : i15;
        if ((i16 & 4) != 0) {
            f14 = 0;
            g6.f.a aVar = g6.f.f75994b;
        }
        float f16 = f14;
        if ((i16 & 8) != 0) {
            f15 = 0;
            g6.f.a aVar2 = g6.f.f75994b;
        }
        this(i17, i18, f16, f15, null);
    }

    private x0(int i14, int i15, float f14, float f15) {
    }

    public /* synthetic */ x0(int i14, int i15, float f14, float f15, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, f14, f15);
    }
}
