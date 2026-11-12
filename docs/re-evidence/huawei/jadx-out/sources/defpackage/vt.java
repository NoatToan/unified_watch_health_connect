package defpackage;

import com.careforeyou.library.enums.Protocal_Type;
import com.careforeyou.library.protocal.iStraightFrame;

/* JADX INFO: loaded from: classes4.dex */
public class vt {
    private static volatile iStraightFrame e;

    /* JADX INFO: renamed from: vt$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f51571b;

        static {
            int[] iArr = new int[Protocal_Type.values().length];
            f51571b = iArr;
            try {
                iArr[Protocal_Type.OKOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51571b[Protocal_Type.OKOKCloud.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51571b[Protocal_Type.OKOKCloudV3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51571b[Protocal_Type.OKOKCloudV4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static iStraightFrame d(Protocal_Type protocal_Type) {
        int i = AnonymousClass1.f51571b[protocal_Type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (e == null || !(e instanceof wb)) {
                    e = new wb();
                }
            } else if ((i == 3 || i == 4) && (e == null || !(e instanceof wa))) {
                e = new wa();
            }
        } else if (e == null || !(e instanceof vx)) {
            e = new vx();
        }
        return e;
    }
}
