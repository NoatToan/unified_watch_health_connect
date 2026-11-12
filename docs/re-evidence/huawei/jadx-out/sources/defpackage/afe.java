package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.util.Annotations;

/* JADX INFO: loaded from: classes21.dex */
public class afe extends VirtualBeanPropertyWriter {
    private static final long serialVersionUID = 1;
    protected final String d;

    protected afe(String str, BeanPropertyDefinition beanPropertyDefinition, Annotations annotations, JavaType javaType) {
        this(str, beanPropertyDefinition, annotations, javaType, beanPropertyDefinition.findInclusion());
    }

    protected afe(String str, BeanPropertyDefinition beanPropertyDefinition, Annotations annotations, JavaType javaType, JsonInclude.b bVar) {
        super(beanPropertyDefinition, annotations, javaType, null, null, null, bVar, null);
        this.d = str;
    }

    public static afe b(String str, BeanPropertyDefinition beanPropertyDefinition, Annotations annotations, JavaType javaType) {
        return new afe(str, beanPropertyDefinition, annotations, javaType);
    }

    @Override // com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter
    public VirtualBeanPropertyWriter withConfig(MapperConfig<?> mapperConfig, ack ackVar, BeanPropertyDefinition beanPropertyDefinition, JavaType javaType) {
        throw new IllegalStateException("Should not be called on this type");
    }

    @Override // com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter
    public Object value(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        return serializerProvider.getAttribute(this.d);
    }
}
