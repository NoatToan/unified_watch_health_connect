package gl1;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.livesessionview.LiveActivityActivity;

/* JADX INFO: loaded from: classes10.dex */
public final class q {
    public static Intent a(Context context, long j8, zf2.d dVar, zf2.i iVar, String str, boolean z14, boolean z15, boolean z16, int i14) {
        if ((i14 & 8) != 0) {
            iVar = null;
        }
        if ((i14 & 16) != 0) {
            str = null;
        }
        if ((i14 & 32) != 0) {
            z14 = false;
        }
        if ((i14 & 64) != 0) {
            z15 = false;
        }
        if ((i14 & 128) != 0) {
            z16 = true;
        }
        context.getClass();
        dVar.getClass();
        LiveActivityActivity.f50544d.getClass();
        return LiveActivityActivity.a.b(context, j8, dVar, iVar, str, z14, z15, z16);
    }

    public static final void b(lc.y yVar, long j8, String str) {
        yVar.getClass();
        yVar.h(new c31.e(str, yVar, j8, 3), new e(j8, str));
    }

    public static final void c(lc.y yVar, long j8, boolean z14) {
        yVar.getClass();
        yVar.h(new o(z14, yVar, 0), new i(j8));
        if (z14) {
            yVar.f111904b.k().q(new i(j8));
        }
    }
}
