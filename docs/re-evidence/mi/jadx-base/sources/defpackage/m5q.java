package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class m5q extends eud<Object> implements cj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e5q f25786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eud<Object> f25787b;

    public m5q(e5q e5qVar, eud<?> eudVar) {
        this.f25786a = e5qVar;
        this.f25787b = eudVar;
    }

    public e5q a() {
        return this.f25786a;
    }

    @Override // defpackage.cj4
    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        eud<?> eudVarHandleSecondaryContextualization = this.f25787b;
        if (eudVarHandleSecondaryContextualization instanceof cj4) {
            eudVarHandleSecondaryContextualization = wwlVar.handleSecondaryContextualization(eudVarHandleSecondaryContextualization, beanProperty);
        }
        return eudVarHandleSecondaryContextualization == this.f25787b ? this : new m5q(this.f25786a, eudVarHandleSecondaryContextualization);
    }

    @Override // defpackage.eud
    public Class<Object> handledType() {
        return Object.class;
    }

    @Override // defpackage.eud
    public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        this.f25787b.serializeWithType(obj, jsonGenerator, wwlVar, this.f25786a);
    }

    @Override // defpackage.eud
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        this.f25787b.serializeWithType(obj, jsonGenerator, wwlVar, e5qVar);
    }
}
