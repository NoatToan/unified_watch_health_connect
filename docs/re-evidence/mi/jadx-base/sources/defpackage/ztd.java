package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ztd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4h f41658a;

    @JsonCreator
    public ztd(c4h c4hVar) {
        this.f41658a = c4hVar;
    }

    public static zsd a() {
        c4h c4hVarObjectNode = JsonNodeFactory.instance.objectNode();
        c4hVarObjectNode.j0("type", "any");
        return c4hVarObjectNode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ztd)) {
            return false;
        }
        ztd ztdVar = (ztd) obj;
        c4h c4hVar = this.f41658a;
        if (c4hVar == null) {
            return ztdVar.f41658a == null;
        }
        return c4hVar.equals(ztdVar.f41658a);
    }

    public int hashCode() {
        return this.f41658a.hashCode();
    }

    public String toString() {
        return this.f41658a.toString();
    }
}
