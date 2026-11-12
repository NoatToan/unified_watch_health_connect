package defpackage;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class wi implements ObjectIdResolver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Map<ObjectIdGenerator.c, Object> f52074c;

    @Override // com.fasterxml.jackson.annotation.ObjectIdResolver
    public void bindItem(ObjectIdGenerator.c cVar, Object obj) {
        Map<ObjectIdGenerator.c, Object> map = this.f52074c;
        if (map == null) {
            this.f52074c = new HashMap();
        } else {
            Object obj2 = map.get(cVar);
            if (obj2 != null) {
                if (obj2 == obj) {
                    return;
                }
                throw new IllegalStateException("Already had POJO for id (" + cVar.f4068a.getClass().getName() + ") [" + cVar + "]");
            }
        }
        this.f52074c.put(cVar, obj);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdResolver
    public Object resolveId(ObjectIdGenerator.c cVar) {
        Map<ObjectIdGenerator.c, Object> map = this.f52074c;
        if (map == null) {
            return null;
        }
        return map.get(cVar);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdResolver
    public boolean canUseFor(ObjectIdResolver objectIdResolver) {
        return objectIdResolver.getClass() == getClass();
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdResolver
    public ObjectIdResolver newForDeserialization(Object obj) {
        return new wi();
    }
}
