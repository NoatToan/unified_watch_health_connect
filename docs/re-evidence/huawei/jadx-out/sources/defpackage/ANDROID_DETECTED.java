package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: zlm, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"ANDROID_DETECTED", "", "getANDROID_DETECTED", "()Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ANDROID_DETECTED {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f54272c;

    static {
        Object objE;
        try {
            yyt.c cVar = yyt.f53903b;
            objE = yyt.e(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            yyt.c cVar2 = yyt.f53903b;
            objE = yyt.e(createFailure.a(th));
        }
        f54272c = yyt.c(objE);
    }

    public static final boolean a() {
        return f54272c;
    }
}
