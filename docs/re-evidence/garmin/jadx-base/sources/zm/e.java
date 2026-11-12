package zm;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class e extends p005kotlin.jvm.internal.q implements e23.p<Float, Float, Unit> {
    public e(Object obj) {
        super(2, obj, c.class, "highlightValue", "highlightValue(FF)V", 0);
    }

    @Override // e23.p
    public final Unit invoke(Float f14, Float f15) {
        ((c) this.receiver).F(f14.floatValue(), f15.floatValue());
        return Unit.INSTANCE;
    }
}
