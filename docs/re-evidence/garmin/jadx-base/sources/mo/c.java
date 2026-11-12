package mo;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class c extends q implements l<Boolean, Unit> {
    public c(Object obj) {
        super(1, obj, a.class, "onIncludeDogChanged", "onIncludeDogChanged(Z)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        ((a) this.receiver).a(bool.booleanValue());
        return Unit.INSTANCE;
    }
}
