package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class aie implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected transient aia<ahd, ys> f450b = new aia<>(20, 200);

    public ys b(JavaType javaType, MapperConfig<?> mapperConfig) {
        return a(javaType.getRawClass(), mapperConfig);
    }

    public ys a(Class<?> cls, MapperConfig<?> mapperConfig) {
        ahd ahdVar = new ahd(cls);
        ys ysVar = this.f450b.get(ahdVar);
        if (ysVar != null) {
            return ysVar;
        }
        ys ysVarFindRootName = mapperConfig.getAnnotationIntrospector().findRootName(mapperConfig.introspectClassAnnotations(cls).getClassInfo());
        if (ysVarFindRootName == null || !ysVarFindRootName.c()) {
            ysVarFindRootName = ys.c(cls.getSimpleName());
        }
        this.f450b.put(ahdVar, ysVarFindRootName);
        return ysVarFindRootName;
    }

    protected Object readResolve() {
        return new aie();
    }
}
