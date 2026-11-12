package k23;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lk23/v;", "Ljava/lang/reflect/ParameterizedType;", "", "Ljava/lang/Class;", "rawType", "Ljava/lang/reflect/Type;", "ownerType", "", "typeArguments", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements ParameterizedType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f102476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f102477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f102478c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<Type, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f102479a = new a();

        public a() {
            super(1, w.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // e23.l
        public final String invoke(Type type) {
            Type type2 = type;
            type2.getClass();
            return w.a(type2);
        }
    }

    public v(Class<?> cls, Type type, List<? extends Type> list) {
        cls.getClass();
        list.getClass();
        this.f102476a = cls;
        this.f102477b = type;
        this.f102478c = (Type[]) list.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return this.f102476a.equals(parameterizedType.getRawType()) && p005kotlin.jvm.internal.s.g(this.f102477b, parameterizedType.getOwnerType()) && Arrays.equals(this.f102478c, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f102478c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f102477b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f102476a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() throws IOException {
        StringBuilder sb3 = new StringBuilder();
        Class<?> cls = this.f102476a;
        Type type = this.f102477b;
        if (type != null) {
            sb3.append(w.a(type));
            sb3.append("$");
            sb3.append(cls.getSimpleName());
        } else {
            sb3.append(w.a(cls));
        }
        Type[] typeArr = this.f102478c;
        if (typeArr.length != 0) {
            p13.u.N(typeArr, sb3, ", ", "<", ">", "...", a.f102479a);
        }
        return sb3.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f102476a.hashCode();
        Type type = this.f102477b;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f102478c);
    }

    public final String toString() {
        return getTypeName();
    }
}
