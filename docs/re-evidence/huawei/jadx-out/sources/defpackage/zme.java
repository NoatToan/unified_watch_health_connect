package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
public final class zme {
    public static final int a() {
        return AVAILABLE_PROCESSORS.b();
    }

    public static final int a(String str, int i, int i2, int i3) {
        return systemProp.e(str, i, i2, i3);
    }

    public static final boolean a(String str, boolean z) {
        return systemProp.b(str, z);
    }

    public static final String c(String str) {
        return AVAILABLE_PROCESSORS.b(str);
    }

    public static final String d(String str, String str2) {
        return systemProp.e(str, str2);
    }

    public static final long e(String str, long j, long j2, long j3) {
        return systemProp.d(str, j, j2, j3);
    }
}
