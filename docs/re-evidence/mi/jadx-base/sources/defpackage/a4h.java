package defpackage;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;

/* JADX INFO: loaded from: classes4.dex */
public final class a4h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaType f604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final owl f605b;
    public final ObjectIdGenerator<?> c;
    public final eud<Object> d;
    public final boolean e;

    public a4h(JavaType javaType, owl owlVar, ObjectIdGenerator<?> objectIdGenerator, eud<?> eudVar, boolean z) {
        this.f604a = javaType;
        this.f605b = owlVar;
        this.c = objectIdGenerator;
        this.d = eudVar;
        this.e = z;
    }

    public static a4h a(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, boolean z) {
        String simpleName = propertyName == null ? null : propertyName.getSimpleName();
        return new a4h(javaType, simpleName != null ? new SerializedString(simpleName) : null, objectIdGenerator, null, z);
    }

    public a4h b(boolean z) {
        return z == this.e ? this : new a4h(this.f604a, this.f605b, this.c, this.d, z);
    }

    public a4h c(eud<?> eudVar) {
        return new a4h(this.f604a, this.f605b, this.c, eudVar, this.e);
    }
}
