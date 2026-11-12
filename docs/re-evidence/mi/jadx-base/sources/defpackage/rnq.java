package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rnq extends m82 {
    @Override // defpackage.zsd
    public final boolean A(String str) {
        return false;
    }

    @Override // defpackage.zsd
    public final zsd T(String str) {
        return e5g.V();
    }

    public abstract JsonToken f();

    @Override // defpackage.zsd
    public <T extends zsd> T r() {
        return this;
    }

    @Override // defpackage.bud
    public void serializeWithType(JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        WritableTypeId writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.d(this, f()));
        serialize(jsonGenerator, wwlVar);
        e5qVar.h(jsonGenerator, writableTypeIdG);
    }

    @Override // defpackage.zsd
    public String toString() {
        return l();
    }

    @Override // defpackage.zsd
    public final zsd w(String str) {
        return null;
    }

    @Override // defpackage.zsd
    public final boolean z(String str) {
        return false;
    }
}
