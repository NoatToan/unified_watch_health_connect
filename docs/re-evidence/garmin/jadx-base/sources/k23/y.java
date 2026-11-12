package k23;

import ch.qos.logback.classic.spi.CallerData;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lk23/y;", "Ljava/lang/reflect/WildcardType;", "", "Ljava/lang/reflect/Type;", "upperBound", "lowerBound", "<init>", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y implements WildcardType, Type {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f102482c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f102483d = new y(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f102484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f102485b;

    public y(Type type, Type type2) {
        this.f102484a = type;
        this.f102485b = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f102485b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f102485b;
        if (type != null) {
            return "? super " + w.a(type);
        }
        Type type2 = this.f102484a;
        if (type2 == null || p005kotlin.jvm.internal.s.g(type2, Object.class)) {
            return CallerData.NA;
        }
        return "? extends " + w.a(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f102484a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk23/y$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
