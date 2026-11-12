package defpackage;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public class brd extends oz5.a {
    @Override // defpackage.oz5
    public esd<?> findReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, fh2 fh2Var, q4q q4qVar, esd<?> esdVar) {
        if (referenceType.hasRawClass(Optional.class)) {
            return new ach(referenceType, null, q4qVar, esdVar);
        }
        return null;
    }
}
