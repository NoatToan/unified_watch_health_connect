package x92;

import gt2.b;
import gt2.c;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx92/a;", "", "<init>", "()V", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f189663a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f189664b;

    static {
        int i14 = c.f79010a;
        f189664b = b.f79005a.h("DevicePasscode");
    }

    private a() {
    }

    public static void a(String str, String str2) {
        f189664b.debug(str + ": " + str2);
    }

    public static void b(String str, String str2) {
        f189664b.error(str + ": " + str2);
    }
}
