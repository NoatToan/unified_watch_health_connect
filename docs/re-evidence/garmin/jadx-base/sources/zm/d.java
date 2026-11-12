package zm;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class d extends p005kotlin.jvm.internal.q implements e23.r<Float, Float, Float, Float, Unit> {
    public d(Object obj) {
        super(4, obj, c.class, "highlightRange", "highlightRange(FFFF)V", 0);
    }

    @Override // e23.r
    public final Unit invoke(Float f14, Float f15, Float f16, Float f17) {
        ((c) this.receiver).E(f14.floatValue(), f15.floatValue(), f16.floatValue(), f17.floatValue());
        return Unit.INSTANCE;
    }
}
