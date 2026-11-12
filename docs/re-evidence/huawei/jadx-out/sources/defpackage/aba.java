package defpackage;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

/* JADX INFO: loaded from: classes21.dex */
public class aba extends ValueInstantiator.b {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromObjectWith() {
        return true;
    }

    public aba() {
        super((Class<?>) wq.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public SettableBeanProperty[] getFromObjectArguments(yi yiVar) {
        JavaType javaTypeConstructType = yiVar.constructType(Integer.TYPE);
        JavaType javaTypeConstructType2 = yiVar.constructType(Long.TYPE);
        return new SettableBeanProperty[]{b("sourceRef", yiVar.constructType(Object.class), 0), b("byteOffset", javaTypeConstructType2, 1), b("charOffset", javaTypeConstructType2, 2), b("lineNr", javaTypeConstructType, 3), b("columnNr", javaTypeConstructType, 4)};
    }

    private static zh b(String str, JavaType javaType, int i) {
        return zh.a(ys.c(str), javaType, null, null, null, null, i, null, yq.d);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) {
        return new wq(objArr[0], d(objArr[1]), d(objArr[2]), c(objArr[3]), c(objArr[4]));
    }

    private static final long d(Object obj) {
        if (obj == null) {
            return 0L;
        }
        return ((Number) obj).longValue();
    }

    private static final int c(Object obj) {
        if (obj == null) {
            return 0;
        }
        return ((Number) obj).intValue();
    }
}
