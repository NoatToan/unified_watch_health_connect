package t23;

import ch.qos.logback.core.CoreConstants;
import t43.i;

/* JADX INFO: loaded from: classes3.dex */
public final class w<Type extends t43.i> extends h1<Type> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x33.f f162067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f162068b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x33.f fVar, Type type) {
        super(null);
        fVar.getClass();
        type.getClass();
        this.f162067a = fVar;
        this.f162068b = type;
    }

    @Override // t23.h1
    public final boolean a(x33.f fVar) {
        return p005kotlin.jvm.internal.s.g(this.f162067a, fVar);
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f162067a + ", underlyingType=" + this.f162068b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
