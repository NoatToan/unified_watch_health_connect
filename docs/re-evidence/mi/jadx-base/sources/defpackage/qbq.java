package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class qbq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<SettableBeanProperty> f31348a;

    public qbq() {
        this.f31348a = new ArrayList();
    }

    public void a(SettableBeanProperty settableBeanProperty) {
        this.f31348a.add(settableBeanProperty);
    }

    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, bip bipVar) throws IOException {
        int size = this.f31348a.size();
        for (int i = 0; i < size; i++) {
            SettableBeanProperty settableBeanProperty = this.f31348a.get(i);
            JsonParser jsonParserF1 = bipVar.f1();
            jsonParserF1.G0();
            settableBeanProperty.deserializeAndSet(jsonParserF1, deserializationContext, obj);
        }
        return obj;
    }

    public qbq c(NameTransformer nameTransformer) {
        esd<Object> esdVarUnwrappingDeserializer;
        ArrayList arrayList = new ArrayList(this.f31348a.size());
        for (SettableBeanProperty settableBeanProperty : this.f31348a) {
            SettableBeanProperty settableBeanPropertyWithSimpleName = settableBeanProperty.withSimpleName(nameTransformer.transform(settableBeanProperty.getName()));
            esd<Object> valueDeserializer = settableBeanPropertyWithSimpleName.getValueDeserializer();
            if (valueDeserializer != null && (esdVarUnwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer)) != valueDeserializer) {
                settableBeanPropertyWithSimpleName = settableBeanPropertyWithSimpleName.withValueDeserializer(esdVarUnwrappingDeserializer);
            }
            arrayList.add(settableBeanPropertyWithSimpleName);
        }
        return new qbq(arrayList);
    }

    public qbq(List<SettableBeanProperty> list) {
        this.f31348a = list;
    }
}
