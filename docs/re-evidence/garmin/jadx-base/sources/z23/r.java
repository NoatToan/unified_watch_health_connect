package z23;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r extends p005kotlin.jvm.internal.q implements e23.l<Field, z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f202068a = new r();

    public r() {
        super(1, z.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);
    }

    @Override // e23.l
    public final z invoke(Field field) {
        Field field2 = field;
        field2.getClass();
        return new z(field2);
    }
}
