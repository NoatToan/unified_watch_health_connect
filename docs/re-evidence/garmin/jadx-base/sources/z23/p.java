package z23;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p extends p005kotlin.jvm.internal.q implements e23.l<Constructor<?>, w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f202066a = new p();

    public p() {
        super(1, w.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);
    }

    @Override // e23.l
    public final w invoke(Constructor<?> constructor) {
        Constructor<?> constructor2 = constructor;
        constructor2.getClass();
        return new w(constructor2);
    }
}
