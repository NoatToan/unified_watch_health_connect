package m63;

import java.lang.annotation.Annotation;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm63/c1;", "Lk63/e;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c1 implements k63.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f116925a = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k63.m.d f116926b = k63.m.d.f103256a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f116927c = "kotlin.Nothing";

    private c1() {
    }

    @Override // k63.e
    public final int c() {
        return 0;
    }

    @Override // k63.e
    public final String d(int i14) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // k63.e
    public final List<Annotation> e(int i14) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // k63.e
    /* JADX INFO: renamed from: f */
    public final String getF117004c() {
        return f116927c;
    }

    @Override // k63.e
    public final int g(String str) {
        str.getClass();
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // k63.e
    public final k63.l getKind() {
        return f116926b;
    }

    @Override // k63.e
    public final k63.e h(int i14) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final int hashCode() {
        return (f116926b.hashCode() * 31) + f116927c.hashCode();
    }

    @Override // k63.e
    public final boolean i(int i14) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
