package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zm9 {

    public static final class a extends BeanPropertyWriter implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BeanPropertyWriter f41453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<?>[] f41454b;

        public a(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
            super(beanPropertyWriter);
            this.f41453a = beanPropertyWriter;
            this.f41454b = clsArr;
        }

        public final boolean a(Class<?> cls) {
            if (cls == null) {
                return true;
            }
            int length = this.f41454b.length;
            for (int i = 0; i < length; i++) {
                if (this.f41454b[i].isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignNullSerializer(eud<Object> eudVar) {
            this.f41453a.assignNullSerializer(eudVar);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignSerializer(eud<Object> eudVar) {
            this.f41453a.assignSerializer(eudVar);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a rename(NameTransformer nameTransformer) {
            return new a(this.f41453a.rename(nameTransformer), this.f41454b);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
        public void depositSchemaProperty(itd itdVar, wwl wwlVar) throws JsonMappingException {
            if (a(wwlVar.getActiveView())) {
                super.depositSchemaProperty(itdVar, wwlVar);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception {
            if (a(wwlVar.getActiveView())) {
                this.f41453a.serializeAsElement(obj, jsonGenerator, wwlVar);
            } else {
                this.f41453a.serializeAsPlaceholder(obj, jsonGenerator, wwlVar);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception {
            if (a(wwlVar.getActiveView())) {
                this.f41453a.serializeAsField(obj, jsonGenerator, wwlVar);
            } else {
                this.f41453a.serializeAsOmittedField(obj, jsonGenerator, wwlVar);
            }
        }
    }

    public static final class b extends BeanPropertyWriter implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BeanPropertyWriter f41455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<?> f41456b;

        public b(BeanPropertyWriter beanPropertyWriter, Class<?> cls) {
            super(beanPropertyWriter);
            this.f41455a = beanPropertyWriter;
            this.f41456b = cls;
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b rename(NameTransformer nameTransformer) {
            return new b(this.f41455a.rename(nameTransformer), this.f41456b);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignNullSerializer(eud<Object> eudVar) {
            this.f41455a.assignNullSerializer(eudVar);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignSerializer(eud<Object> eudVar) {
            this.f41455a.assignSerializer(eudVar);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
        public void depositSchemaProperty(itd itdVar, wwl wwlVar) throws JsonMappingException {
            Class<?> activeView = wwlVar.getActiveView();
            if (activeView == null || this.f41456b.isAssignableFrom(activeView)) {
                super.depositSchemaProperty(itdVar, wwlVar);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception {
            Class<?> activeView = wwlVar.getActiveView();
            if (activeView == null || this.f41456b.isAssignableFrom(activeView)) {
                this.f41455a.serializeAsElement(obj, jsonGenerator, wwlVar);
            } else {
                this.f41455a.serializeAsPlaceholder(obj, jsonGenerator, wwlVar);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception {
            Class<?> activeView = wwlVar.getActiveView();
            if (activeView == null || this.f41456b.isAssignableFrom(activeView)) {
                this.f41455a.serializeAsField(obj, jsonGenerator, wwlVar);
            } else {
                this.f41455a.serializeAsOmittedField(obj, jsonGenerator, wwlVar);
            }
        }
    }

    public static BeanPropertyWriter a(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        return clsArr.length == 1 ? new b(beanPropertyWriter, clsArr[0]) : new a(beanPropertyWriter, clsArr);
    }
}
