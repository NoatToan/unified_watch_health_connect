package c22;

import java.util.Arrays;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
public interface c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23014a = a.f23015a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/c2$a;", "", "<init>", "()V", "gcm-common-strings_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f23015a = new a();

        private a() {
        }

        public static c2 a() {
            try {
                return (c2) KoinJavaComponent.get$default(c2.class, null, null, 6, null);
            } catch (Exception e4) {
                int i14 = gt2.c.f79010a;
                gt2.b.f79005a.h("GGeneral").error("OnDemandResources.getInstance " + e4);
                return null;
            }
        }
    }

    default String a(String str) {
        str.getClass();
        return c(str, Arrays.copyOf(new Object[0], 0));
    }

    String b(String str, Object... objArr);

    String c(String str, Object... objArr);

    String d(String str);
}
