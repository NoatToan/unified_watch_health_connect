package t23;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Map;
import t43.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d0<Type extends t43.i> extends h1<Type> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<o13.p<x33.f, Type>> f162002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<x33.f, Type> f162003b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(List<? extends o13.p<x33.f, ? extends Type>> list) {
        super(null);
        list.getClass();
        this.f162002a = list;
        this.f162003b = p13.u0.l(list);
    }

    @Override // t23.h1
    public final boolean a(x33.f fVar) {
        return this.f162003b.containsKey(fVar);
    }

    public final String toString() {
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f162002a, new StringBuilder("MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes="));
    }
}
