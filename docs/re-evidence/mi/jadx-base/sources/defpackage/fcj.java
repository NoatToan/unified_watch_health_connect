package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class fcj implements bud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f17651a;

    public fcj(String str) {
        this.f17651a = str;
    }

    public void a(JsonGenerator jsonGenerator) throws IOException {
        Object obj = this.f17651a;
        if (obj instanceof owl) {
            jsonGenerator.J0((owl) obj);
        } else {
            jsonGenerator.K0(String.valueOf(obj));
        }
    }

    public void b(JsonGenerator jsonGenerator) throws IOException {
        Object obj = this.f17651a;
        if (obj instanceof bud) {
            jsonGenerator.B0(obj);
        } else {
            a(jsonGenerator);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fcj)) {
            return false;
        }
        Object obj2 = this.f17651a;
        Object obj3 = ((fcj) obj).f17651a;
        if (obj2 == obj3) {
            return true;
        }
        return obj2 != null && obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f17651a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // defpackage.bud
    public void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        Object obj = this.f17651a;
        if (obj instanceof bud) {
            ((bud) obj).serialize(jsonGenerator, wwlVar);
        } else {
            a(jsonGenerator);
        }
    }

    @Override // defpackage.bud
    public void serializeWithType(JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        Object obj = this.f17651a;
        if (obj instanceof bud) {
            ((bud) obj).serializeWithType(jsonGenerator, wwlVar, e5qVar);
        } else if (obj instanceof owl) {
            serialize(jsonGenerator, wwlVar);
        }
    }

    public String toString() {
        return String.format("[RawValue of type %s]", h04.g(this.f17651a));
    }
}
