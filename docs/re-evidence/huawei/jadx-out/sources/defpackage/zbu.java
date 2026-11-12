package defpackage;

import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u0010"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "<init>", "()V", "sdkIsNullOrAtLeast", "", "version", "", "addSuppressed", "", "cause", "", TrackConstants$Events.EXCEPTION, "getSuppressed", "", "ReflectSdkVersion", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class zbu extends zbq {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion;", "", "<init>", "()V", "sdkVersion", "", "Ljava/lang/Integer;", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f53972c = new d();
        public static final Integer d;

        private d() {
        }

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            d = num2;
        }
    }

    private final boolean e(int i) {
        return d.d == null || d.d.intValue() >= i;
    }

    @Override // defpackage.zbq
    public void c(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        zcp.c(th, "");
        zcp.c(th2, "");
        if (e(19)) {
            th.addSuppressed(th2);
        } else {
            super.c(th, th2);
        }
    }
}
