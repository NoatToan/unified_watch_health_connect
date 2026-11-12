package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class ads extends adp {
    protected final String d;
    protected final String e;

    protected ads(JavaType javaType, ahp ahpVar, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, ahpVar, polymorphicTypeValidator);
        String name = javaType.getRawClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            this.e = "";
            this.d = ".";
        } else {
            this.d = name.substring(0, iLastIndexOf + 1);
            this.e = name.substring(0, iLastIndexOf);
        }
    }

    public static ads b(JavaType javaType, MapperConfig<?> mapperConfig, PolymorphicTypeValidator polymorphicTypeValidator) {
        return new ads(javaType, mapperConfig.getTypeFactory(), polymorphicTypeValidator);
    }

    @Override // defpackage.adp, com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public JsonTypeInfo.Id getMechanism() {
        return JsonTypeInfo.Id.MINIMAL_CLASS;
    }

    @Override // defpackage.adp, com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String idFromValue(Object obj) {
        String name = obj.getClass().getName();
        return name.startsWith(this.d) ? name.substring(this.d.length() - 1) : name;
    }

    @Override // defpackage.adp
    protected JavaType e(String str, DatabindContext databindContext) throws IOException {
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder(str.length() + this.e.length());
            if (this.e.isEmpty()) {
                sb.append(str.substring(1));
            } else {
                sb.append(this.e);
                sb.append(str);
            }
            str = sb.toString();
        }
        return super.e(str, databindContext);
    }
}
