package com.nimbusds.jose.jwk;

import com.mapbox.maps.p;
import java.text.ParseException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public enum KeyOperation {
    SIGN("sign"),
    VERIFY("verify"),
    ENCRYPT("encrypt"),
    DECRYPT("decrypt"),
    WRAP_KEY("wrapKey"),
    UNWRAP_KEY("unwrapKey"),
    DERIVE_KEY("deriveKey"),
    DERIVE_BITS("deriveBits");

    private final String identifier;

    KeyOperation(String str) {
        if (str != null) {
            this.identifier = str;
        } else {
            h.s("The key operation identifier must not be null");
            throw null;
        }
    }

    public static Set<KeyOperation> parse(List<String> list) throws ParseException {
        KeyOperation keyOperation;
        if (list == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : list) {
            if (str != null) {
                KeyOperation[] keyOperationArrValues = values();
                int length = keyOperationArrValues.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        keyOperation = null;
                        break;
                    }
                    keyOperation = keyOperationArrValues[i14];
                    if (str.equals(keyOperation.identifier())) {
                        break;
                    }
                    i14++;
                }
                if (keyOperation == null) {
                    p.i(0, "Invalid JWK operation: ".concat(str));
                    return null;
                }
                linkedHashSet.add(keyOperation);
            }
        }
        return linkedHashSet;
    }

    public String identifier() {
        return this.identifier;
    }

    @Override // java.lang.Enum
    public String toString() {
        return identifier();
    }
}
