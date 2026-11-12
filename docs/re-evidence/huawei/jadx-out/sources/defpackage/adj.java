package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import java.io.Closeable;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class adj extends PolymorphicTypeValidator implements Serializable {
    private static final long serialVersionUID = 1;

    protected boolean b(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity validateBaseType(MapperConfig<?> mapperConfig, JavaType javaType) {
        if (e(mapperConfig, javaType)) {
            return PolymorphicTypeValidator.Validity.DENIED;
        }
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity validateSubClassName(MapperConfig<?> mapperConfig, JavaType javaType, String str) {
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity validateSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) {
        if (b(mapperConfig, javaType, javaType2)) {
            return PolymorphicTypeValidator.Validity.ALLOWED;
        }
        return PolymorphicTypeValidator.Validity.DENIED;
    }

    protected boolean e(MapperConfig<?> mapperConfig, JavaType javaType) {
        return a.e.b(javaType.getRawClass());
    }

    static final class a {
        public static final a e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<String> f300a;

        private a() {
            HashSet hashSet = new HashSet();
            this.f300a = hashSet;
            hashSet.add(Object.class.getName());
            hashSet.add(Closeable.class.getName());
            hashSet.add(Serializable.class.getName());
            hashSet.add(AutoCloseable.class.getName());
            hashSet.add(Cloneable.class.getName());
            hashSet.add("java.util.logging.Handler");
            hashSet.add("javax.naming.Referenceable");
            hashSet.add("javax.sql.DataSource");
        }

        public boolean b(Class<?> cls) {
            return this.f300a.contains(cls.getName());
        }
    }
}
