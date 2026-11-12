package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.JsonNode;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class adc {
    private final aeu d;

    @JsonCreator
    public adc(aeu aeuVar) {
        this.d = aeuVar;
    }

    public String toString() {
        return this.d.toString();
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof adc)) {
            return false;
        }
        adc adcVar = (adc) obj;
        aeu aeuVar = this.d;
        if (aeuVar == null) {
            return adcVar.d == null;
        }
        return aeuVar.equals(adcVar.d);
    }

    public static JsonNode e() {
        aeu aeuVarObjectNode = aes.e.objectNode();
        aeuVarObjectNode.c("type", "any");
        return aeuVarObjectNode;
    }
}
