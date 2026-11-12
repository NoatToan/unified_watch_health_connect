package defpackage;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.b;

/* JADX INFO: loaded from: classes4.dex */
public class usd extends b.a {
    public usd() {
        super((Class<?>) JsonLocation.class);
    }

    public static final int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return ((Number) obj).intValue();
    }

    public static final long b(Object obj) {
        if (obj == null) {
            return 0L;
        }
        return ((Number) obj).longValue();
    }

    public static CreatorProperty c(String str, JavaType javaType, int i) {
        return new CreatorProperty(PropertyName.construct(str), javaType, null, null, null, null, i, null, PropertyMetadata.STD_REQUIRED);
    }

    @Override // com.fasterxml.jackson.databind.deser.b
    public boolean canCreateFromObjectWith() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.b
    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) {
        return new JsonLocation(objArr[0], b(objArr[1]), b(objArr[2]), a(objArr[3]), a(objArr[4]));
    }

    @Override // com.fasterxml.jackson.databind.deser.b
    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationConfig) {
        JavaType javaTypeConstructType = deserializationConfig.constructType(Integer.TYPE);
        JavaType javaTypeConstructType2 = deserializationConfig.constructType(Long.TYPE);
        return new SettableBeanProperty[]{c("sourceRef", deserializationConfig.constructType(Object.class), 0), c("byteOffset", javaTypeConstructType2, 1), c("charOffset", javaTypeConstructType2, 2), c("lineNr", javaTypeConstructType, 3), c("columnNr", javaTypeConstructType, 4)};
    }
}
