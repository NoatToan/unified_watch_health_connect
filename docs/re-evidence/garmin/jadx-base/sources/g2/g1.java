package g2;

import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f75120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f75121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f75122c;

    static {
        float f14 = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
        g6.f.a aVar = g6.f.f75994b;
        f75120a = f14;
        f75121b = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        f75122c = 50;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ca A[Catch: k -> 0x01b2, TryCatch #9 {k -> 0x01b2, blocks: (B:34:0x00c6, B:36:0x00ca, B:38:0x00d0, B:52:0x00f8, B:54:0x0112, B:58:0x0127, B:62:0x012f), top: B:128:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x0124  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d  */
    /* JADX WARN: Code duplicated, block: B:73:0x017f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, s1.m] */
    /* JADX WARN: Type inference failed for: r12v6, types: [T, s1.m] */
    /* JADX WARN: Type inference failed for: r3v12, types: [g2.d1] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v7, types: [g2.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x017f -> B:114:0x018a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(e2.h0 r28, int r29, int r30, int r31, g6.c r32, v13.c r33) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.g1.a(e2.h0, int, int, int, g6.c, v13.c):java.lang.Object");
    }

    public static final boolean b(boolean z14, d1 d1Var, int i14, int i15) {
        if (z14) {
            if (d1Var.b() > i14) {
                return true;
            }
            return d1Var.b() == i14 && d1Var.a() > i15;
        }
        if (d1Var.b() < i14) {
            return true;
        }
        return d1Var.b() == i14 && d1Var.a() < i15;
    }

    public static final boolean c(d1 d1Var, int i14) {
        return i14 <= d1Var.c() && d1Var.b() <= i14;
    }
}
