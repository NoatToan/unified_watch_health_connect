package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class pk8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaType f30485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b[] f30486b;
    public final Map<String, Object> c;
    public final String[] d;
    public final bip[] e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JavaType f30487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<b> f30488b = new ArrayList();
        public final Map<String, Object> c = new HashMap();

        public a(JavaType javaType) {
            this.f30487a = javaType;
        }

        public final void a(String str, Integer num) {
            Object obj = this.c.get(str);
            if (obj == null) {
                this.c.put(str, num);
                return;
            }
            if (obj instanceof List) {
                ((List) obj).add(num);
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(obj);
            linkedList.add(num);
            this.c.put(str, linkedList);
        }

        public void b(SettableBeanProperty settableBeanProperty, q4q q4qVar) {
            Integer numValueOf = Integer.valueOf(this.f30488b.size());
            this.f30488b.add(new b(settableBeanProperty, q4qVar));
            a(settableBeanProperty.getName(), numValueOf);
            a(q4qVar.getPropertyName(), numValueOf);
        }

        public pk8 c(BeanPropertyMap beanPropertyMap) {
            int size = this.f30488b.size();
            b[] bVarArr = new b[size];
            for (int i = 0; i < size; i++) {
                b bVar = this.f30488b.get(i);
                SettableBeanProperty settableBeanPropertyFind = beanPropertyMap.find(bVar.d());
                if (settableBeanPropertyFind != null) {
                    bVar.g(settableBeanPropertyFind);
                }
                bVarArr[i] = bVar;
            }
            return new pk8(this.f30487a, bVarArr, this.c, null, null);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SettableBeanProperty f30489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q4q f30490b;
        public final String c;
        public SettableBeanProperty d;

        public b(SettableBeanProperty settableBeanProperty, q4q q4qVar) {
            this.f30489a = settableBeanProperty;
            this.f30490b = q4qVar;
            this.c = q4qVar.getPropertyName();
        }

        public String a() {
            Class<?> defaultImpl = this.f30490b.getDefaultImpl();
            if (defaultImpl == null) {
                return null;
            }
            return this.f30490b.getTypeIdResolver().e(null, defaultImpl);
        }

        public SettableBeanProperty b() {
            return this.f30489a;
        }

        public SettableBeanProperty c() {
            return this.d;
        }

        public String d() {
            return this.c;
        }

        public boolean e() {
            return this.f30490b.getDefaultImpl() != null;
        }

        public boolean f(String str) {
            return str.equals(this.c);
        }

        public void g(SettableBeanProperty settableBeanProperty) {
            this.d = settableBeanProperty;
        }
    }

    public pk8(JavaType javaType, b[] bVarArr, Map<String, Object> map, String[] strArr, bip[] bipVarArr) {
        this.f30485a = javaType;
        this.f30486b = bVarArr;
        this.c = map;
        this.d = strArr;
        this.e = bipVarArr;
    }

    public static a d(JavaType javaType) {
        return new a(javaType);
    }

    public final Object a(JsonParser jsonParser, DeserializationContext deserializationContext, int i, String str) throws IOException {
        JsonParser jsonParserH1 = this.e[i].h1(jsonParser);
        if (jsonParserH1.G0() == JsonToken.VALUE_NULL) {
            return null;
        }
        bip bipVar = new bip(jsonParser, deserializationContext);
        bipVar.L0();
        bipVar.Q0(str);
        bipVar.k1(jsonParserH1);
        bipVar.i0();
        JsonParser jsonParserH2 = bipVar.h1(jsonParser);
        jsonParserH2.G0();
        return this.f30486b[i].b().deserialize(jsonParserH2, deserializationContext);
    }

    public final void b(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i, String str) throws IOException {
        JsonParser jsonParserH1 = this.e[i].h1(jsonParser);
        if (jsonParserH1.G0() == JsonToken.VALUE_NULL) {
            this.f30486b[i].b().set(obj, null);
            return;
        }
        bip bipVar = new bip(jsonParser, deserializationContext);
        bipVar.L0();
        bipVar.Q0(str);
        bipVar.k1(jsonParserH1);
        bipVar.i0();
        JsonParser jsonParserH2 = bipVar.h1(jsonParser);
        jsonParserH2.G0();
        this.f30486b[i].b().deserializeAndSet(jsonParserH2, deserializationContext, obj);
    }

    public final boolean c(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj, String str2, int i) throws IOException {
        if (!this.f30486b[i].f(str)) {
            return false;
        }
        if (obj == null || this.e[i] == null) {
            this.d[i] = str2;
            return true;
        }
        b(jsonParser, deserializationContext, obj, i, str2);
        this.e[i] = null;
        return true;
    }

    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, qdi qdiVar, ldi ldiVar) throws IOException {
        String strA;
        Object obj;
        int length = this.f30486b.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            String str = this.d[i];
            b bVar = this.f30486b[i];
            if (str == null) {
                if (this.e[i] != null) {
                    if (bVar.e()) {
                        strA = bVar.a();
                    } else {
                        deserializationContext.reportInputMismatch(this.f30485a, "Missing external type id property '%s'", bVar.d());
                        strA = str;
                    }
                }
            } else if (this.e[i] == null) {
                strA = str;
                deserializationContext.reportInputMismatch(this.f30485a, "Missing property '%s' for external type id '%s'", bVar.b().getName(), this.f30486b[i].d());
                strA = str;
            }
            strA = str;
            objArr[i] = a(jsonParser, deserializationContext, i, strA);
            SettableBeanProperty settableBeanPropertyB = bVar.b();
            if (settableBeanPropertyB.getCreatorIndex() >= 0) {
                qdiVar.b(settableBeanPropertyB, objArr[i]);
                SettableBeanProperty settableBeanPropertyC = bVar.c();
                if (settableBeanPropertyC != null && settableBeanPropertyC.getCreatorIndex() >= 0) {
                    if (!settableBeanPropertyC.getType().hasRawClass(String.class)) {
                        obj = strA;
                        bip bipVar = new bip(jsonParser, deserializationContext);
                        bipVar.Q0(strA);
                        Object objDeserialize = settableBeanPropertyC.getValueDeserializer().deserialize(bipVar.i1(), deserializationContext);
                        bipVar.close();
                        obj = objDeserialize;
                    }
                    obj = strA;
                    qdiVar.b(settableBeanPropertyC, obj);
                }
            }
        }
        Object objA = ldiVar.a(deserializationContext, qdiVar);
        for (int i2 = 0; i2 < length; i2++) {
            SettableBeanProperty settableBeanPropertyB2 = this.f30486b[i2].b();
            if (settableBeanPropertyB2.getCreatorIndex() < 0) {
                settableBeanPropertyB2.set(objA, objArr[i2]);
            }
        }
        return objA;
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        int length = this.f30486b.length;
        for (int i = 0; i < length; i++) {
            String strA = this.d[i];
            if (strA == null) {
                bip bipVar = this.e[i];
                if (bipVar != null) {
                    if (bipVar.m1().isScalarValue()) {
                        JsonParser jsonParserH1 = bipVar.h1(jsonParser);
                        jsonParserH1.G0();
                        SettableBeanProperty settableBeanPropertyB = this.f30486b[i].b();
                        Object objDeserializeIfNatural = q4q.deserializeIfNatural(jsonParserH1, deserializationContext, settableBeanPropertyB.getType());
                        if (objDeserializeIfNatural != null) {
                            settableBeanPropertyB.set(obj, objDeserializeIfNatural);
                        } else if (this.f30486b[i].e()) {
                            strA = this.f30486b[i].a();
                        } else {
                            deserializationContext.reportInputMismatch(obj.getClass(), "Missing external type id property '%s'", this.f30486b[i].d());
                        }
                    }
                }
            } else if (this.e[i] == null) {
                SettableBeanProperty settableBeanPropertyB2 = this.f30486b[i].b();
                if (settableBeanPropertyB2.isRequired() || deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    deserializationContext.reportInputMismatch(obj.getClass(), "Missing property '%s' for external type id '%s'", settableBeanPropertyB2.getName(), this.f30486b[i].d());
                }
                return obj;
            }
            b(jsonParser, deserializationContext, obj, i, strA);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    public boolean g(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) throws IOException {
        Object obj2 = this.c.get(str);
        if (obj2 == null) {
            return false;
        }
        if (obj2 instanceof List) {
            Iterator it = ((List) obj2).iterator();
            Integer num = (Integer) it.next();
            if (this.f30486b[num.intValue()].f(str)) {
                String strD0 = jsonParser.d0();
                jsonParser.O0();
                this.d[num.intValue()] = strD0;
                while (it.hasNext()) {
                    this.d[((Integer) it.next()).intValue()] = strD0;
                }
            } else {
                bip bipVar = new bip(jsonParser, deserializationContext);
                bipVar.k1(jsonParser);
                this.e[num.intValue()] = bipVar;
                while (it.hasNext()) {
                    this.e[((Integer) it.next()).intValue()] = bipVar;
                }
            }
            return true;
        }
        int iIntValue = ((Integer) obj2).intValue();
        if (this.f30486b[iIntValue].f(str)) {
            this.d[iIntValue] = jsonParser.d0();
            jsonParser.O0();
            if (obj != null && this.e[iIntValue] != null) {
                String[] strArr = this.d;
                String str2 = strArr[iIntValue];
                strArr[iIntValue] = null;
                b(jsonParser, deserializationContext, obj, iIntValue, str2);
                this.e[iIntValue] = null;
            }
        } else {
            bip bipVar2 = new bip(jsonParser, deserializationContext);
            bipVar2.k1(jsonParser);
            this.e[iIntValue] = bipVar2;
            if (obj != null && this.d[iIntValue] != null) {
                String[] strArr2 = this.d;
                String str3 = strArr2[iIntValue];
                strArr2[iIntValue] = null;
                b(jsonParser, deserializationContext, obj, iIntValue, str3);
                this.e[iIntValue] = null;
            }
        }
        return true;
    }

    public boolean h(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) throws IOException {
        Object obj2 = this.c.get(str);
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        String strD0 = jsonParser.d0();
        if (!(obj2 instanceof List)) {
            return c(jsonParser, deserializationContext, str, obj, strD0, ((Integer) obj2).intValue());
        }
        Iterator it = ((List) obj2).iterator();
        while (it.hasNext()) {
            if (c(jsonParser, deserializationContext, str, obj, strD0, ((Integer) it.next()).intValue())) {
                z = true;
            }
        }
        return z;
    }

    public pk8 i() {
        return new pk8(this);
    }

    public pk8(pk8 pk8Var) {
        this.f30485a = pk8Var.f30485a;
        b[] bVarArr = pk8Var.f30486b;
        this.f30486b = bVarArr;
        this.c = pk8Var.c;
        int length = bVarArr.length;
        this.d = new String[length];
        this.e = new bip[length];
    }
}
