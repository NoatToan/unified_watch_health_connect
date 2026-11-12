package defpackage;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class bpr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ObjectIdGenerator<?> f4470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4471b;
    public boolean c = false;

    public bpr(ObjectIdGenerator<?> objectIdGenerator) {
        this.f4470a = objectIdGenerator;
    }

    public Object a(Object obj) {
        if (this.f4471b == null) {
            this.f4471b = this.f4470a.generateId(obj);
        }
        return this.f4471b;
    }

    public void b(JsonGenerator jsonGenerator, wwl wwlVar, a4h a4hVar) throws IOException {
        this.c = true;
        if (jsonGenerator.n()) {
            Object obj = this.f4471b;
            jsonGenerator.C0(obj == null ? null : String.valueOf(obj));
            return;
        }
        owl owlVar = a4hVar.f605b;
        if (owlVar != null) {
            jsonGenerator.o0(owlVar);
            a4hVar.d.serialize(this.f4471b, jsonGenerator, wwlVar);
        }
    }

    public boolean c(JsonGenerator jsonGenerator, wwl wwlVar, a4h a4hVar) throws IOException {
        if (this.f4471b == null) {
            return false;
        }
        if (!this.c && !a4hVar.e) {
            return false;
        }
        if (jsonGenerator.n()) {
            jsonGenerator.D0(String.valueOf(this.f4471b));
            return true;
        }
        a4hVar.d.serialize(this.f4471b, jsonGenerator, wwlVar);
        return true;
    }
}
