package n23;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public class s implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f122602a = new s();

    @Override // e23.l
    public final Object invoke(Object obj) {
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        parameterizedType.getClass();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return p13.u.i0(actualTypeArguments);
    }
}
