package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import java.io.IOException;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class adh extends adl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BitSet f298c = new BitSet(0);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Integer> f299b;
    private final Map<BitSet, String> d;

    public adh(JavaType javaType, TypeIdResolver typeIdResolver, JavaType javaType2, yi yiVar, Collection<adg> collection) {
        super(javaType, typeIdResolver, null, false, javaType2, null);
        this.f299b = new HashMap();
        this.d = b(yiVar, collection);
    }

    public adh(adh adhVar, BeanProperty beanProperty) {
        super(adhVar, beanProperty);
        this.f299b = adhVar.f299b;
        this.d = adhVar.d;
    }

    @Override // defpackage.adl, defpackage.adf, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new adh(this, beanProperty);
    }

    protected Map<BitSet, String> b(yi yiVar, Collection<adg> collection) {
        boolean zIsEnabled = yiVar.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        HashMap map = new HashMap();
        int i = 0;
        for (adg adgVar : collection) {
            List<BeanPropertyDefinition> listFindProperties = yiVar.e(yiVar.getTypeFactory().b(adgVar.a())).findProperties();
            BitSet bitSet = new BitSet(listFindProperties.size() + i);
            Iterator<BeanPropertyDefinition> it = listFindProperties.iterator();
            while (it.hasNext()) {
                String name = it.next().getName();
                if (zIsEnabled) {
                    name = name.toLowerCase();
                }
                Integer numValueOf = this.f299b.get(name);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(i);
                    this.f299b.put(name, Integer.valueOf(i));
                    i++;
                }
                bitSet.set(numValueOf.intValue());
            }
            String str = (String) map.put(bitSet, adgVar.a().getName());
            if (str != null) {
                throw new IllegalStateException(String.format("Subtypes %s and %s have the same signature and cannot be uniquely deduced.", str, adgVar.a().getName()));
            }
        }
        return map;
    }

    @Override // defpackage.adl, defpackage.adf, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == JsonToken.START_OBJECT) {
            jsonTokenCurrentToken = jsonParser.nextToken();
        } else if (jsonTokenCurrentToken != JsonToken.FIELD_NAME) {
            return a(jsonParser, deserializationContext, null, "Unexpected input");
        }
        if (jsonTokenCurrentToken == JsonToken.END_OBJECT && (str = this.d.get(f298c)) != null) {
            return d(jsonParser, deserializationContext, null, str);
        }
        LinkedList linkedList = new LinkedList(this.d.keySet());
        aii aiiVar = new aii(jsonParser, deserializationContext);
        boolean zIsEnabled = deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            if (zIsEnabled) {
                strCurrentName = strCurrentName.toLowerCase();
            }
            aiiVar.copyCurrentStructure(jsonParser);
            Integer num = this.f299b.get(strCurrentName);
            if (num != null) {
                a(linkedList, num.intValue());
                if (linkedList.size() == 1) {
                    return d(jsonParser, deserializationContext, aiiVar, this.d.get(linkedList.get(0)));
                }
            }
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        return a(jsonParser, deserializationContext, aiiVar, String.format("Cannot deduce unique subtype of %s (%d candidates match)", ahw.a(this._baseType), Integer.valueOf(linkedList.size())));
    }

    private static void a(List<BitSet> list, int i) {
        Iterator<BitSet> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().get(i)) {
                it.remove();
            }
        }
    }
}
