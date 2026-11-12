package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class zu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f54567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c[] f54568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JavaType f54569c;
    private final aii[] d;
    private final String[] e;

    protected zu(JavaType javaType, c[] cVarArr, Map<String, Object> map, String[] strArr, aii[] aiiVarArr) {
        this.f54569c = javaType;
        this.f54568b = cVarArr;
        this.f54567a = map;
        this.e = strArr;
        this.d = aiiVarArr;
    }

    protected zu(zu zuVar) {
        this.f54569c = zuVar.f54569c;
        c[] cVarArr = zuVar.f54568b;
        this.f54568b = cVarArr;
        this.f54567a = zuVar.f54567a;
        int length = cVarArr.length;
        this.e = new String[length];
        this.d = new aii[length];
    }

    public static a c(JavaType javaType) {
        return new a(javaType);
    }

    public zu e() {
        return new zu(this);
    }

    public boolean b(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) throws IOException {
        Object obj2 = this.f54567a.get(str);
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        String text = jsonParser.getText();
        if (obj2 instanceof List) {
            Iterator it = ((List) obj2).iterator();
            while (it.hasNext()) {
                if (a(jsonParser, deserializationContext, str, obj, text, ((Integer) it.next()).intValue())) {
                    z = true;
                }
            }
            return z;
        }
        return a(jsonParser, deserializationContext, str, obj, text, ((Integer) obj2).intValue());
    }

    private final boolean a(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj, String str2, int i) throws IOException {
        if (!this.f54568b[i].d(str)) {
            return false;
        }
        if (obj != null && this.d[i] != null) {
            b(jsonParser, deserializationContext, obj, i, str2);
            this.d[i] = null;
            return true;
        }
        this.e[i] = str2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    public boolean d(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) throws IOException {
        Object obj2 = this.f54567a.get(str);
        if (obj2 == null) {
            return false;
        }
        if (obj2 instanceof List) {
            Iterator it = ((List) obj2).iterator();
            Integer num = (Integer) it.next();
            if (this.f54568b[num.intValue()].d(str)) {
                String text = jsonParser.getText();
                jsonParser.skipChildren();
                this.e[num.intValue()] = text;
                while (it.hasNext()) {
                    this.e[((Integer) it.next()).intValue()] = text;
                }
            } else {
                aii aiiVar = new aii(jsonParser, deserializationContext);
                aiiVar.copyCurrentStructure(jsonParser);
                this.d[num.intValue()] = aiiVar;
                while (it.hasNext()) {
                    this.d[((Integer) it.next()).intValue()] = aiiVar;
                }
            }
            return true;
        }
        int iIntValue = ((Integer) obj2).intValue();
        if (this.f54568b[iIntValue].d(str)) {
            this.e[iIntValue] = jsonParser.getValueAsString();
            jsonParser.skipChildren();
            if (obj != null && this.d[iIntValue] != null) {
                String[] strArr = this.e;
                String str2 = strArr[iIntValue];
                strArr[iIntValue] = null;
                b(jsonParser, deserializationContext, obj, iIntValue, str2);
                this.d[iIntValue] = null;
            }
        } else {
            aii aiiVar2 = new aii(jsonParser, deserializationContext);
            aiiVar2.copyCurrentStructure(jsonParser);
            this.d[iIntValue] = aiiVar2;
            if (obj != null && this.e[iIntValue] != null) {
                String[] strArr2 = this.e;
                String str3 = strArr2[iIntValue];
                strArr2[iIntValue] = null;
                b(jsonParser, deserializationContext, obj, iIntValue, str3);
                this.d[iIntValue] = null;
            }
        }
        return true;
    }

    public Object c(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        int length = this.f54568b.length;
        for (int i = 0; i < length; i++) {
            String strC = this.e[i];
            c cVar = this.f54568b[i];
            if (strC == null) {
                aii aiiVar = this.d[i];
                if (aiiVar != null) {
                    if (aiiVar.d().isScalarValue()) {
                        JsonParser jsonParserA = aiiVar.a(jsonParser);
                        jsonParserA.nextToken();
                        SettableBeanProperty settableBeanPropertyA = cVar.a();
                        Object objDeserializeIfNatural = TypeDeserializer.deserializeIfNatural(jsonParserA, deserializationContext, settableBeanPropertyA.getType());
                        if (objDeserializeIfNatural != null) {
                            settableBeanPropertyA.set(obj, objDeserializeIfNatural);
                        }
                    }
                    if (!cVar.b()) {
                        deserializationContext.reportPropertyInputMismatch(this.f54569c, cVar.a().getName(), "Missing external type id property '%s' (and no 'defaultImpl' specified)", cVar.d());
                    } else {
                        strC = cVar.c();
                        if (strC == null) {
                            deserializationContext.reportPropertyInputMismatch(this.f54569c, cVar.a().getName(), "Invalid default type id for property '%s': `null` returned by TypeIdResolver", cVar.d());
                        }
                    }
                }
            } else if (this.d[i] == null) {
                SettableBeanProperty settableBeanPropertyA2 = cVar.a();
                if (!settableBeanPropertyA2.isRequired() && !deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    break;
                }
                deserializationContext.reportPropertyInputMismatch(obj.getClass(), settableBeanPropertyA2.getName(), "Missing property '%s' for external type id '%s'", settableBeanPropertyA2.getName(), cVar.d());
                return obj;
            }
            b(jsonParser, deserializationContext, obj, i, strC);
        }
        return obj;
    }

    public Object c(JsonParser jsonParser, DeserializationContext deserializationContext, aai aaiVar, aag aagVar) throws IOException {
        String strC;
        Object obj;
        int length = this.f54568b.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            String str = this.e[i];
            c cVar = this.f54568b[i];
            if (str == null) {
                aii aiiVar = this.d[i];
                if (aiiVar != null && aiiVar.d() != JsonToken.VALUE_NULL) {
                    if (!cVar.b()) {
                        deserializationContext.reportPropertyInputMismatch(this.f54569c, cVar.a().getName(), "Missing external type id property '%s'", cVar.d());
                        strC = str;
                    } else {
                        strC = cVar.c();
                    }
                }
            } else if (this.d[i] == null) {
                SettableBeanProperty settableBeanPropertyA = cVar.a();
                if (settableBeanPropertyA.isRequired() || deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    strC = str;
                    strC = str;
                    strC = str;
                    deserializationContext.reportPropertyInputMismatch(this.f54569c, settableBeanPropertyA.getName(), "Missing property '%s' for external type id '%s'", settableBeanPropertyA.getName(), this.f54568b[i].d());
                    strC = str;
                }
            }
            strC = str;
            strC = str;
            strC = str;
            if (this.d[i] != null) {
                objArr[i] = a(jsonParser, deserializationContext, i, strC);
            }
            SettableBeanProperty settableBeanPropertyA2 = cVar.a();
            if (settableBeanPropertyA2.getCreatorIndex() >= 0) {
                aaiVar.b(settableBeanPropertyA2, objArr[i]);
                SettableBeanProperty settableBeanPropertyE = cVar.e();
                if (settableBeanPropertyE != null && settableBeanPropertyE.getCreatorIndex() >= 0) {
                    if (!settableBeanPropertyE.getType().hasRawClass(String.class)) {
                        obj = strC;
                        aii aiiVar2 = new aii(jsonParser, deserializationContext);
                        aiiVar2.writeString(strC);
                        Object objDeserialize = settableBeanPropertyE.getValueDeserializer().deserialize(aiiVar2.c(), deserializationContext);
                        aiiVar2.close();
                        obj = objDeserialize;
                    }
                    obj = strC;
                    aaiVar.b(settableBeanPropertyE, obj);
                }
            }
        }
        Object objA = aagVar.a(deserializationContext, aaiVar);
        for (int i2 = 0; i2 < length; i2++) {
            SettableBeanProperty settableBeanPropertyA3 = this.f54568b[i2].a();
            if (settableBeanPropertyA3.getCreatorIndex() < 0) {
                settableBeanPropertyA3.set(objA, objArr[i2]);
            }
        }
        return objA;
    }

    protected final Object a(JsonParser jsonParser, DeserializationContext deserializationContext, int i, String str) throws IOException {
        JsonParser jsonParserA = this.d[i].a(jsonParser);
        if (jsonParserA.nextToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        aii aiiVar = new aii(jsonParser, deserializationContext);
        aiiVar.writeStartArray();
        aiiVar.writeString(str);
        aiiVar.copyCurrentStructure(jsonParserA);
        aiiVar.writeEndArray();
        JsonParser jsonParserA2 = aiiVar.a(jsonParser);
        jsonParserA2.nextToken();
        return this.f54568b[i].a().deserialize(jsonParserA2, deserializationContext);
    }

    protected final void b(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i, String str) throws IOException {
        if (str == null) {
            deserializationContext.reportInputMismatch(this.f54569c, "Internal error in external Type Id handling: `null` type id passed", new Object[0]);
        }
        JsonParser jsonParserA = this.d[i].a(jsonParser);
        if (jsonParserA.nextToken() == JsonToken.VALUE_NULL) {
            this.f54568b[i].a().set(obj, null);
            return;
        }
        aii aiiVar = new aii(jsonParser, deserializationContext);
        aiiVar.writeStartArray();
        aiiVar.writeString(str);
        aiiVar.copyCurrentStructure(jsonParserA);
        aiiVar.writeEndArray();
        JsonParser jsonParserA2 = aiiVar.a(jsonParser);
        jsonParserA2.nextToken();
        this.f54568b[i].a().deserializeAndSet(jsonParserA2, deserializationContext, obj);
    }

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final JavaType f54570c;
        private final List<c> d = new ArrayList();
        private final Map<String, Object> e = new HashMap();

        protected a(JavaType javaType) {
            this.f54570c = javaType;
        }

        public void c(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            Integer numValueOf = Integer.valueOf(this.d.size());
            this.d.add(new c(settableBeanProperty, typeDeserializer));
            a(settableBeanProperty.getName(), numValueOf);
            a(typeDeserializer.getPropertyName(), numValueOf);
        }

        private void a(String str, Integer num) {
            Object obj = this.e.get(str);
            if (obj == null) {
                this.e.put(str, num);
                return;
            }
            if (obj instanceof List) {
                ((List) obj).add(num);
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(obj);
            linkedList.add(num);
            this.e.put(str, linkedList);
        }

        public zu e(zr zrVar) {
            int size = this.d.size();
            c[] cVarArr = new c[size];
            for (int i = 0; i < size; i++) {
                c cVar = this.d.get(i);
                SettableBeanProperty settableBeanPropertyB = zrVar.b(cVar.d());
                if (settableBeanPropertyB != null) {
                    cVar.c(settableBeanPropertyB);
                }
                cVarArr[i] = cVar;
            }
            return new zu(this.f54570c, cVarArr, this.e, null, null);
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f54571a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SettableBeanProperty f54572c;
        private final TypeDeserializer d;
        private SettableBeanProperty e;

        public c(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            this.f54572c = settableBeanProperty;
            this.d = typeDeserializer;
            this.f54571a = typeDeserializer.getPropertyName();
        }

        public void c(SettableBeanProperty settableBeanProperty) {
            this.e = settableBeanProperty;
        }

        public boolean d(String str) {
            return str.equals(this.f54571a);
        }

        public boolean b() {
            return this.d.hasDefaultImpl();
        }

        public String c() {
            Class<?> defaultImpl = this.d.getDefaultImpl();
            if (defaultImpl == null) {
                return null;
            }
            return this.d.getTypeIdResolver().idFromValueAndType(null, defaultImpl);
        }

        public String d() {
            return this.f54571a;
        }

        public SettableBeanProperty a() {
            return this.f54572c;
        }

        public SettableBeanProperty e() {
            return this.e;
        }
    }
}
