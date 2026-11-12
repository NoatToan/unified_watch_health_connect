package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

/* JADX INFO: loaded from: classes21.dex */
public class abv extends ym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected transient BeanDescription f234a;
    protected transient BeanPropertyDefinition d;
    protected final JavaType e;

    protected abv(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
        this.e = javaType;
        this.f234a = null;
        this.d = null;
    }

    protected abv(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        super(jsonGenerator, str);
        this.e = javaType;
        this.f234a = null;
        this.d = null;
    }

    protected abv(JsonParser jsonParser, String str, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        super(jsonParser, str);
        this.e = beanDescription == null ? null : beanDescription.getType();
        this.f234a = beanDescription;
        this.d = beanPropertyDefinition;
    }

    protected abv(JsonGenerator jsonGenerator, String str, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        super(jsonGenerator, str);
        this.e = beanDescription == null ? null : beanDescription.getType();
        this.f234a = beanDescription;
        this.d = beanPropertyDefinition;
    }

    public static abv d(JsonParser jsonParser, String str, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        return new abv(jsonParser, str, beanDescription, beanPropertyDefinition);
    }

    public static abv d(JsonParser jsonParser, String str, JavaType javaType) {
        return new abv(jsonParser, str, javaType);
    }

    public static abv c(JsonGenerator jsonGenerator, String str, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        return new abv(jsonGenerator, str, beanDescription, beanPropertyDefinition);
    }

    public static abv b(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        return new abv(jsonGenerator, str, javaType);
    }
}
