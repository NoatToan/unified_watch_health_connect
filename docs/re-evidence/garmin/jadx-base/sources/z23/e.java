package z23;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f202038a = new e();

    @Override // e23.l
    public final Object invoke(Object obj) {
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        List<k23.d<? extends Object>> list = f.f202041a;
        parameterizedType.getClass();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return p13.u.v(actualTypeArguments);
    }
}
