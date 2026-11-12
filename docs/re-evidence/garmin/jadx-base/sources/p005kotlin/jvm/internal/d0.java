package p005kotlin.jvm.internal;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/jvm/internal/d0;", "Lkotlin/jvm/internal/g;", "Ljava/lang/Class;", "jClass", "", "moduleName", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f105791a;

    public d0(Class<?> cls, String str) {
        cls.getClass();
        str.getClass();
        this.f105791a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            return this.f105791a.equals(((d0) obj).f105791a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f105791a.hashCode();
    }

    @Override // p005kotlin.jvm.internal.g
    public final Class<?> j() {
        return this.f105791a;
    }

    public final String toString() {
        return this.f105791a.toString() + " (Kotlin reflection is not available)";
    }
}
