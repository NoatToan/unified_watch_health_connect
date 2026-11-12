package z23;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f202036a = new d();

    @Override // e23.l
    public final Object invoke(Object obj) {
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        List<k23.d<? extends Object>> list = f.f202041a;
        parameterizedType.getClass();
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }
}
