package k23;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class x extends p005kotlin.jvm.internal.q implements e23.l<Class<?>, Class<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f102481a = new x();

    public x() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // e23.l
    public final Class<?> invoke(Class<?> cls) {
        Class<?> cls2 = cls;
        cls2.getClass();
        return cls2.getComponentType();
    }
}
