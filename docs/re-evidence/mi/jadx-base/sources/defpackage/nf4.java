package defpackage;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class nf4 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27877a;

    public nf4(Object obj) {
        this.f27877a = obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.b
    public boolean canCreateUsingDefault() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.b
    public boolean canInstantiate() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.b
    public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
        return this.f27877a;
    }

    @Override // com.fasterxml.jackson.databind.deser.b
    public Class<?> getValueClass() {
        return this.f27877a.getClass();
    }
}
