package dm2;

import android.content.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class f extends com.garmin.android.library.backgroundtaskmanagement.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f f60466c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f60467b = LoggerFactory.getLogger("DevicesDbBizManager");

    private f() {
    }

    public static synchronized f N() {
        try {
            if (f60466c == null) {
                f fVar = new f();
                f60466c = fVar;
                fVar.f60467b.debug("DevicesDbBizManager created");
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f60466c;
    }

    public final void M(com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b, Context context, long j8, String str) {
        this.f60467b.debug(v.h.u(j8, "deleteFromAppDatabase: deviceUnitID ", ", productNbr ", str));
        com.garmin.android.library.backgroundtaskmanagement.c.d(new a(this, context, j8, str), interfaceC0995b);
    }

    public final void O(com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b, Context context, bm2.d dVar, String str, long j8, int i14, byte[] bArr, String str2, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z14) {
        this.f60467b.debug("save: deviceUnitID " + dVar.getF92746j());
        com.garmin.android.library.backgroundtaskmanagement.c.d(new h(this, context, dVar, str, j8, i14, bArr, true, str2, bArr2, bArr3, bArr4, z14, null), interfaceC0995b);
    }
}
