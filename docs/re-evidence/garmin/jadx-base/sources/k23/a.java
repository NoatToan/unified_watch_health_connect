package k23;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import okhttp3.HttpUrl;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk23/a;", "Ljava/lang/reflect/GenericArrayType;", "", "Ljava/lang/reflect/Type;", "elementType", "<init>", "(Ljava/lang/reflect/Type;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f102455a;

    public a(Type type) {
        type.getClass();
        this.f102455a = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return this.f102455a.equals(((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f102455a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return w.a(this.f102455a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public final int hashCode() {
        return this.f102455a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
