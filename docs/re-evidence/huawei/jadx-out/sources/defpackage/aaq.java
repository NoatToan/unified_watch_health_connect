package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class aaq {
    protected final List<SettableBeanProperty> d;

    public aaq() {
        this.d = new ArrayList();
    }

    protected aaq(List<SettableBeanProperty> list) {
        this.d = list;
    }

    public void e(SettableBeanProperty settableBeanProperty) {
        this.d.add(settableBeanProperty);
    }

    public aaq c(NameTransformer nameTransformer) {
        JsonDeserializer<Object> jsonDeserializerUnwrappingDeserializer;
        ArrayList arrayList = new ArrayList(this.d.size());
        for (SettableBeanProperty settableBeanProperty : this.d) {
            SettableBeanProperty settableBeanPropertyWithSimpleName = settableBeanProperty.withSimpleName(nameTransformer.transform(settableBeanProperty.getName()));
            JsonDeserializer<Object> valueDeserializer = settableBeanPropertyWithSimpleName.getValueDeserializer();
            if (valueDeserializer != null && (jsonDeserializerUnwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer)) != valueDeserializer) {
                settableBeanPropertyWithSimpleName = settableBeanPropertyWithSimpleName.withValueDeserializer(jsonDeserializerUnwrappingDeserializer);
            }
            arrayList.add(settableBeanPropertyWithSimpleName);
        }
        return new aaq(arrayList);
    }

    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, aii aiiVar) throws IOException {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            SettableBeanProperty settableBeanProperty = this.d.get(i);
            JsonParser jsonParserB = aiiVar.b();
            jsonParserB.nextToken();
            settableBeanProperty.deserializeAndSet(jsonParserB, deserializationContext, obj);
        }
        return obj;
    }
}
