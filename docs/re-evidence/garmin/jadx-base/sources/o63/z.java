package o63;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129909a;

        static {
            int[] iArr = new int[n63.a.values().length];
            try {
                iArr[n63.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n63.a.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n63.a.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f129909a = iArr;
        }
    }

    public static final String a(k63.e eVar, n63.b bVar) {
        eVar.getClass();
        bVar.getClass();
        for (Annotation annotation : eVar.getAnnotations()) {
            if (annotation instanceof n63.f) {
                return ((n63.f) annotation).discriminator();
            }
        }
        return bVar.f123893a.f123928j;
    }
}
