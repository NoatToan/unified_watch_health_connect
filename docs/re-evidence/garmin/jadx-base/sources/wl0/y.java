package wl0;

import bs2.ax;
import bs2.b7;
import bs2.bx;
import bs2.ck;
import bs2.cx;
import bs2.zw;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.fit.FitRuntimeException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class y {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public zw f186011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f186012b = new ArrayList();
    }

    public static t a(long j8, String str, String str2) throws Throwable {
        a aVarB;
        t tVar = new t();
        a aVarB2 = b(j8, str);
        if (aVarB2 != null) {
            tVar.f185999d = aVarB2.f186011a;
            tVar.f186000e.addAll(aVarB2.f186012b);
        }
        if (str2 != null && (aVarB = b(0L, str2)) != null) {
            tVar.f186001f = aVarB.f186011a;
            tVar.f186002g.addAll(aVarB.f186012b);
        }
        return tVar;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0044: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:13:0x0044 */
    public static a b(final long j8, String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        final a aVar = new a();
        b7 b7Var = new b7();
        ck ckVar = new ck(b7Var);
        FileInputStream fileInputStream3 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    if (!b7Var.b(fileInputStream)) {
                        a2 a2Var = a2.GOLF;
                        i2.a(a2Var, "GolfSwingFITParser", "Failed to open or integrity check failed.");
                        try {
                            fileInputStream.close();
                            return null;
                        } catch (IOException e4) {
                            i2.a(a2Var, "GolfSwingFITParser", "IOException closing swing file for integrity check: " + e4.getMessage());
                            return null;
                        }
                    }
                    try {
                        fileInputStream.close();
                    } catch (IOException e14) {
                        i2.a(a2.GOLF, "GolfSwingFITParser", "IOException closing swing file for integrity check: " + e14.getMessage());
                    }
                    try {
                        FileInputStream fileInputStream4 = new FileInputStream(str);
                        ckVar.V2.add(new ax() { // from class: wl0.w
                            @Override // bs2.ax
                            public final void a(zw zwVar) {
                                long j14 = j8;
                                if (j14 == 0 || zwVar.getTimestamp().a().longValue() == j14) {
                                    aVar.f186011a = zwVar;
                                }
                            }
                        });
                        ckVar.W2.add(new cx() { // from class: wl0.x
                            @Override // bs2.cx
                            public final void a(bx bxVar) {
                                long j14 = j8;
                                if (j14 == 0 || bxVar.p(bxVar.j(253, 65535)).a().longValue() == j14) {
                                    aVar.f186012b.add(bxVar);
                                }
                            }
                        });
                        try {
                            ckVar.c(fileInputStream4);
                            return aVar;
                        } catch (FitRuntimeException e15) {
                            i2.a(a2.GOLF, "GolfSwingFITParser", "FitRuntimeException parsing swing file: " + e15.getMessage());
                            return null;
                        } finally {
                            try {
                                fileInputStream4.close();
                            } catch (IOException e16) {
                                i2.a(a2.GOLF, "GolfSwingFITParser", "FitRuntimeException parsing swing file: " + e16.getMessage());
                            }
                        }
                    } catch (IOException e17) {
                        i2.a(a2.GOLF, "GolfSwingFITParser", "IOException opening swing file for parsing:" + e17.getMessage());
                        return null;
                    }
                } catch (IOException e18) {
                    e = e18;
                    i2.a(a2.GOLF, "GolfSwingFITParser", "IOException opening swing file for integrity check: " + e.getMessage());
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e19) {
                            i2.a(a2.GOLF, "GolfSwingFITParser", "IOException closing swing file for integrity check: " + e19.getMessage());
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream3 = fileInputStream2;
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (IOException e24) {
                        i2.a(a2.GOLF, "GolfSwingFITParser", "IOException closing swing file for integrity check: " + e24.getMessage());
                    }
                }
                throw th;
            }
        } catch (IOException e25) {
            e = e25;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            if (fileInputStream3 != null) {
                fileInputStream3.close();
            }
            throw th;
        }
        return null;
    }
}
