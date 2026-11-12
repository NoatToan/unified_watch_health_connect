package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class qdi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParser f31411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeserializationContext f31412b;
    public final ObjectIdReader c;
    public final Object[] d;
    public int e;
    public int f;
    public final BitSet g;
    public pdi h;
    public Object i;

    public qdi(JsonParser jsonParser, DeserializationContext deserializationContext, int i, ObjectIdReader objectIdReader) {
        this.f31411a = jsonParser;
        this.f31412b = deserializationContext;
        this.e = i;
        this.c = objectIdReader;
        this.d = new Object[i];
        if (i < 32) {
            this.g = null;
        } else {
            this.g = new BitSet();
        }
    }

    public Object a(SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        if (settableBeanProperty.getInjectableValueId() != null) {
            return this.f31412b.findInjectableValue(settableBeanProperty.getInjectableValueId(), settableBeanProperty, null);
        }
        if (settableBeanProperty.isRequired()) {
            this.f31412b.reportInputMismatch(settableBeanProperty, "Missing required creator property '%s' (index %d)", settableBeanProperty.getName(), Integer.valueOf(settableBeanProperty.getCreatorIndex()));
        }
        if (this.f31412b.isEnabled(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
            this.f31412b.reportInputMismatch(settableBeanProperty, "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled", settableBeanProperty.getName(), Integer.valueOf(settableBeanProperty.getCreatorIndex()));
        }
        return settableBeanProperty.getValueDeserializer().getNullValue(this.f31412b);
    }

    public boolean b(SettableBeanProperty settableBeanProperty, Object obj) {
        int creatorIndex = settableBeanProperty.getCreatorIndex();
        this.d[creatorIndex] = obj;
        BitSet bitSet = this.g;
        if (bitSet == null) {
            int i = this.f;
            int i2 = (1 << creatorIndex) | i;
            if (i != i2) {
                this.f = i2;
                int i3 = this.e - 1;
                this.e = i3;
                if (i3 <= 0) {
                    return this.c == null || this.i != null;
                }
            }
        } else if (!bitSet.get(creatorIndex)) {
            this.g.set(creatorIndex);
            this.e--;
        }
        return false;
    }

    public void c(SettableAnyProperty settableAnyProperty, String str, Object obj) {
        this.h = new pdi.a(this.h, obj, settableAnyProperty, str);
    }

    public void d(Object obj, Object obj2) {
        this.h = new pdi.b(this.h, obj2, obj);
    }

    public void e(SettableBeanProperty settableBeanProperty, Object obj) {
        this.h = new pdi.c(this.h, obj, settableBeanProperty);
    }

    public pdi f() {
        return this.h;
    }

    public Object[] g(SettableBeanProperty[] settableBeanPropertyArr) throws JsonMappingException {
        if (this.e > 0) {
            if (this.g != null) {
                int length = this.d.length;
                int i = 0;
                while (true) {
                    int iNextClearBit = this.g.nextClearBit(i);
                    if (iNextClearBit >= length) {
                        break;
                    }
                    this.d[iNextClearBit] = a(settableBeanPropertyArr[iNextClearBit]);
                    i = iNextClearBit + 1;
                }
            } else {
                int i2 = this.f;
                int length2 = this.d.length;
                int i3 = 0;
                while (i3 < length2) {
                    if ((i2 & 1) == 0) {
                        this.d[i3] = a(settableBeanPropertyArr[i3]);
                    }
                    i3++;
                    i2 >>= 1;
                }
            }
        }
        if (this.f31412b.isEnabled(DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES)) {
            for (int i4 = 0; i4 < settableBeanPropertyArr.length; i4++) {
                if (this.d[i4] == null) {
                    SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i4];
                    this.f31412b.reportInputMismatch(settableBeanProperty.getType(), "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_FOR_CREATOR_PARAMETERS` enabled", settableBeanProperty.getName(), Integer.valueOf(settableBeanPropertyArr[i4].getCreatorIndex()));
                }
            }
        }
        return this.d;
    }

    public Object h(DeserializationContext deserializationContext, Object obj) throws IOException {
        ObjectIdReader objectIdReader = this.c;
        if (objectIdReader != null) {
            Object obj2 = this.i;
            if (obj2 != null) {
                deserializationContext.findObjectId(obj2, objectIdReader.generator, objectIdReader.resolver).b(obj);
                SettableBeanProperty settableBeanProperty = this.c.idProperty;
                if (settableBeanProperty != null) {
                    return settableBeanProperty.setAndReturn(obj, this.i);
                }
            } else {
                deserializationContext.reportUnresolvedObjectId(objectIdReader, obj);
            }
        }
        return obj;
    }

    public boolean i(String str) throws IOException {
        ObjectIdReader objectIdReader = this.c;
        if (objectIdReader == null || !str.equals(objectIdReader.propertyName.getSimpleName())) {
            return false;
        }
        this.i = this.c.readObjectReference(this.f31411a, this.f31412b);
        return true;
    }
}
