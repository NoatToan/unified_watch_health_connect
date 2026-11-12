package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class zy extends SettableBeanProperty.Delegating {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final boolean f54762b;
    protected final String d;
    protected final SettableBeanProperty e;

    public zy(SettableBeanProperty settableBeanProperty, String str, SettableBeanProperty settableBeanProperty2, boolean z) {
        super(settableBeanProperty);
        this.d = str;
        this.e = settableBeanProperty2;
        this.f54762b = z;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
    public SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty) {
        throw new IllegalStateException("Should never try to reset delegate");
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(yi yiVar) {
        this.delegate.fixAccess(yiVar);
        this.e.fixAccess(yiVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        set(obj, this.delegate.deserialize(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void set(Object obj, Object obj2) throws IOException {
        setAndReturn(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        if (obj2 != null) {
            if (this.f54762b) {
                if (obj2 instanceof Object[]) {
                    for (Object obj3 : (Object[]) obj2) {
                        if (obj3 != null) {
                            this.e.set(obj3, obj);
                        }
                    }
                } else if (obj2 instanceof Collection) {
                    for (Object obj4 : (Collection) obj2) {
                        if (obj4 != null) {
                            this.e.set(obj4, obj);
                        }
                    }
                } else {
                    if (!(obj2 instanceof Map)) {
                        throw new IllegalStateException("Unsupported container type (" + obj2.getClass().getName() + ") when resolving reference '" + this.d + "'");
                    }
                    for (Object obj5 : ((Map) obj2).values()) {
                        if (obj5 != null) {
                            this.e.set(obj5, obj);
                        }
                    }
                }
            } else {
                this.e.set(obj2, obj);
            }
        }
        return this.delegate.setAndReturn(obj, obj2);
    }
}
