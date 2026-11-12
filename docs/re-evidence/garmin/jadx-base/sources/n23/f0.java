package n23;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes3.dex */
public class f0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f122438a;

    public f0(p0 p0Var) {
        this.f122438a = p0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        Type[] lowerBounds;
        p0 p0Var = this.f122438a;
        Type type = null;
        if (p0Var.isSuspend()) {
            Object objN0 = p13.h0.n0(p0Var.A().b());
            ParameterizedType parameterizedType = objN0 instanceof ParameterizedType ? (ParameterizedType) objN0 : null;
            if (p005kotlin.jvm.internal.s.g(parameterizedType != null ? parameterizedType.getRawType() : null, t13.d.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                actualTypeArguments.getClass();
                Object objV = p13.u.V(actualTypeArguments);
                WildcardType wildcardType = objV instanceof WildcardType ? (WildcardType) objV : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    type = (Type) p13.u.E(lowerBounds);
                }
            }
        }
        return type == null ? p0Var.A().getF128710b() : type;
    }
}
