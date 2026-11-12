package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyValue;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: loaded from: classes21.dex */
public class aai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object[] f175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected PropertyValue f176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final DeserializationContext f177c;
    protected Object d;
    protected final aah e;
    protected int f;
    protected int g;
    protected final BitSet i;
    protected final JsonParser j;

    public aai(JsonParser jsonParser, DeserializationContext deserializationContext, int i, aah aahVar) {
        this.j = jsonParser;
        this.f177c = deserializationContext;
        this.f = i;
        this.e = aahVar;
        this.f175a = new Object[i];
        if (i < 32) {
            this.i = null;
        } else {
            this.i = new BitSet();
        }
    }

    public Object[] e(SettableBeanProperty[] settableBeanPropertyArr) throws ym {
        if (this.f > 0) {
            if (this.i == null) {
                int i = this.g;
                int length = this.f175a.length;
                int i2 = 0;
                while (i2 < length) {
                    if ((i & 1) == 0) {
                        this.f175a[i2] = c(settableBeanPropertyArr[i2]);
                    }
                    i2++;
                    i >>= 1;
                }
            } else {
                int length2 = this.f175a.length;
                int i3 = 0;
                while (true) {
                    int iNextClearBit = this.i.nextClearBit(i3);
                    if (iNextClearBit >= length2) {
                        break;
                    }
                    this.f175a[iNextClearBit] = c(settableBeanPropertyArr[iNextClearBit]);
                    i3 = iNextClearBit + 1;
                }
            }
        }
        if (this.f177c.isEnabled(DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES)) {
            for (int i4 = 0; i4 < settableBeanPropertyArr.length; i4++) {
                if (this.f175a[i4] == null) {
                    SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i4];
                    this.f177c.reportInputMismatch(settableBeanProperty, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES` enabled", settableBeanProperty.getName(), Integer.valueOf(settableBeanPropertyArr[i4].getCreatorIndex()));
                }
            }
        }
        return this.f175a;
    }

    protected Object c(SettableBeanProperty settableBeanProperty) throws ym {
        if (settableBeanProperty.getInjectableValueId() != null) {
            return this.f177c.findInjectableValue(settableBeanProperty.getInjectableValueId(), settableBeanProperty, null);
        }
        if (settableBeanProperty.isRequired()) {
            this.f177c.reportInputMismatch(settableBeanProperty, "Missing required creator property '%s' (index %d)", settableBeanProperty.getName(), Integer.valueOf(settableBeanProperty.getCreatorIndex()));
        }
        if (this.f177c.isEnabled(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
            this.f177c.reportInputMismatch(settableBeanProperty, "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled", settableBeanProperty.getName(), Integer.valueOf(settableBeanProperty.getCreatorIndex()));
        }
        try {
            Object nullValue = settableBeanProperty.getNullValueProvider().getNullValue(this.f177c);
            return nullValue != null ? nullValue : settableBeanProperty.getValueDeserializer().getNullValue(this.f177c);
        } catch (ym e) {
            AnnotatedMember member = settableBeanProperty.getMember();
            if (member != null) {
                e.prependPath(member.getDeclaringClass(), settableBeanProperty.getName());
            }
            throw e;
        }
    }

    public boolean e(String str) throws IOException {
        aah aahVar = this.e;
        if (aahVar == null || !str.equals(aahVar.f172a.b())) {
            return false;
        }
        this.d = this.e.c(this.j, this.f177c);
        return true;
    }

    public Object c(DeserializationContext deserializationContext, Object obj) throws IOException {
        aah aahVar = this.e;
        if (aahVar != null) {
            Object obj2 = this.d;
            if (obj2 != null) {
                deserializationContext.findObjectId(obj2, aahVar.e, this.e.h).a(obj);
                SettableBeanProperty settableBeanProperty = this.e.f173b;
                if (settableBeanProperty != null) {
                    return settableBeanProperty.setAndReturn(obj, this.d);
                }
            } else {
                deserializationContext.reportUnresolvedObjectId(aahVar, obj);
            }
        }
        return obj;
    }

    protected PropertyValue d() {
        return this.f176b;
    }

    public boolean b(SettableBeanProperty settableBeanProperty, Object obj) {
        int creatorIndex = settableBeanProperty.getCreatorIndex();
        this.f175a[creatorIndex] = obj;
        BitSet bitSet = this.i;
        if (bitSet == null) {
            int i = this.g;
            int i2 = (1 << creatorIndex) | i;
            if (i != i2) {
                this.g = i2;
                int i3 = this.f - 1;
                this.f = i3;
                if (i3 <= 0) {
                    return this.e == null || this.d != null;
                }
            }
        } else if (!bitSet.get(creatorIndex)) {
            this.i.set(creatorIndex);
            this.f--;
        }
        return false;
    }

    public void e(SettableBeanProperty settableBeanProperty, Object obj) {
        this.f176b = new PropertyValue.d(this.f176b, obj, settableBeanProperty);
    }

    public void c(zj zjVar, String str, Object obj) {
        this.f176b = new PropertyValue.a(this.f176b, obj, zjVar, str);
    }

    public void b(Object obj, Object obj2) {
        this.f176b = new PropertyValue.b(this.f176b, obj2, obj);
    }
}
