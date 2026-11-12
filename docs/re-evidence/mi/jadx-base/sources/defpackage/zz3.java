package defpackage;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes4.dex */
public class zz3 extends s4q {
    public zz3(JavaType javaType, TypeFactory typeFactory) {
        super(javaType, typeFactory);
    }

    @Override // defpackage.r4q
    public String a(Object obj) {
        return g(obj, obj.getClass(), this.f33295a);
    }

    @Override // defpackage.r4q
    public String b() {
        return "class name used as type id";
    }

    @Override // defpackage.r4q
    public JavaType d(pp5 pp5Var, String str) throws IOException {
        return h(str, pp5Var);
    }

    @Override // defpackage.r4q
    public String e(Object obj, Class<?> cls) {
        return g(obj, cls, this.f33295a);
    }

    public String g(Object obj, Class<?> cls, TypeFactory typeFactory) {
        if (Enum.class.isAssignableFrom(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (!name.startsWith("java.util.")) {
            return (name.indexOf(36) < 0 || h04.F(cls) == null || h04.F(this.f33296b.getRawClass()) != null) ? name : this.f33296b.getRawClass().getName();
        }
        if (obj instanceof EnumSet) {
            return typeFactory.constructCollectionType(EnumSet.class, h04.t((EnumSet) obj)).toCanonical();
        }
        return obj instanceof EnumMap ? typeFactory.constructMapType(EnumMap.class, h04.s((EnumMap) obj), Object.class).toCanonical() : name;
    }

    public JavaType h(String str, pp5 pp5Var) throws IOException {
        JavaType javaTypeResolveSubType = pp5Var.resolveSubType(this.f33296b, str);
        return (javaTypeResolveSubType == null && (pp5Var instanceof DeserializationContext)) ? ((DeserializationContext) pp5Var).handleUnknownTypeId(this.f33296b, str, this, "no such class found") : javaTypeResolveSubType;
    }
}
