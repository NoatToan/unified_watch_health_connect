package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s4q implements r4q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeFactory f33295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JavaType f33296b;

    public s4q(JavaType javaType, TypeFactory typeFactory) {
        this.f33296b = javaType;
        this.f33295a = typeFactory;
    }

    @Override // defpackage.r4q
    public void c(JavaType javaType) {
    }

    @Override // defpackage.r4q
    public String f() {
        return e(null, this.f33296b.getRawClass());
    }
}
