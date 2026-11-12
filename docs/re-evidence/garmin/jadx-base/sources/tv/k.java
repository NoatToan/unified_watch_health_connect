package tv;

import bs2.b7;
import bs2.bk;
import bs2.c10;
import bs2.ck;
import bs2.id;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.fit.FitRuntimeException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ltv/k;", "Luv/h;", "", "path", "<init>", "(Ljava/lang/String;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements uv.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c10 f166522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final id f166523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f166524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f166525d;

    static {
        new a(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        if (r7 != null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Object obj;
        str.getClass();
        n nVar = new n();
        String str2 = "IOException opening swing file for integrity check: ";
        b7 b7Var = new b7();
        ck ckVar = new ck(b7Var);
        c10 c10Var = null;
        c10Var = null;
        c10Var = null;
        c10Var = null;
        c10Var = null;
        c10Var = null;
        c10Var = null;
        FileInputStream fileInputStream3 = null;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream(str);
                    try {
                        if (!b7Var.b(fileInputStream)) {
                            i2.a aVar = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar.getClass();
                            i2.a.b(a2Var, "VectorSettingsFITParser", "Failed to open or integrity check failed.");
                            obj = str2;
                            fileInputStream.close();
                            fileInputStream2 = obj;
                            this.f166522a = c10Var;
                            this.f166523b = nVar.f166533b;
                        }
                        try {
                            fileInputStream.close();
                            Unit unit = Unit.INSTANCE;
                        } catch (IOException unused) {
                            Unit unit2 = Unit.INSTANCE;
                        }
                        try {
                            fileInputStream2 = new FileInputStream(str);
                            ckVar.f19784a0.add(new o(nVar));
                            ckVar.f19832f.add(new p(nVar));
                            try {
                                try {
                                    ckVar.c(fileInputStream2);
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException unused2) {
                                    }
                                    c10Var = nVar.f166532a;
                                    fileInputStream2 = fileInputStream2;
                                } catch (Throwable th3) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException unused3) {
                                    }
                                    throw th3;
                                }
                            } catch (FitRuntimeException e4) {
                                String str3 = "FitRuntimeException parsing swing file: " + e4.getMessage();
                                i2.a aVar2 = i2.f36769a;
                                a2 a2Var2 = a2.GENERAL;
                                aVar2.getClass();
                                i2.a.b(a2Var2, "VectorSettingsFITParser", str3);
                                fileInputStream2.close();
                                fileInputStream2 = fileInputStream2;
                            }
                        } catch (FileNotFoundException e14) {
                            String strN = fb1.c.n("parseVectorSettingsFITFile: ", e14.getMessage());
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var3 = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.f(a2Var3, "VectorSettingsFITParser", strN);
                        }
                        this.f166522a = c10Var;
                        this.f166523b = nVar.f166533b;
                    } catch (IOException e15) {
                        e = e15;
                        String str4 = "IOException opening swing file for integrity check: " + e.getMessage();
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var4 = a2.GENERAL;
                        aVar4.getClass();
                        i2.a.b(a2Var4, "VectorSettingsFITParser", str4);
                        obj = aVar4;
                    }
                } catch (IOException unused4) {
                }
            } catch (IOException e16) {
                e = e16;
                fileInputStream = null;
            } catch (Throwable th4) {
                th = th4;
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            fileInputStream3 = fileInputStream;
        }
    }

    @Override // uv.h
    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF166524c() {
        return this.f166524c;
    }

    @Override // uv.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public final id getF166523b() {
        return this.f166523b;
    }

    @Override // uv.h
    public final bk c() {
        return this.f166522a;
    }

    public final Float d() {
        Float fH;
        c10 c10Var = this.f166522a;
        Double dValueOf = (c10Var == null || (fH = c10Var.h(2)) == null) ? null : Double.valueOf(fH.floatValue());
        BigDecimal scale = dValueOf != null ? new BigDecimal(dValueOf.doubleValue()).setScale(3, RoundingMode.HALF_EVEN) : null;
        if (scale != null) {
            return Float.valueOf(scale.floatValue());
        }
        return null;
    }

    public final Float e() {
        Float fH;
        c10 c10Var = this.f166522a;
        Double dValueOf = (c10Var == null || (fH = c10Var.h(3)) == null) ? null : Double.valueOf(fH.floatValue());
        BigDecimal scale = dValueOf != null ? new BigDecimal(dValueOf.doubleValue()).setScale(3, RoundingMode.HALF_EVEN) : null;
        if (scale != null) {
            return Float.valueOf(scale.floatValue());
        }
        return null;
    }

    public final void f(Long l14) {
        Long lJ;
        long jLongValue = l14.longValue();
        c10 c10Var = this.f166522a;
        if (c10Var == null || (lJ = c10Var.j(1, 65535)) == null || jLongValue != lJ.longValue()) {
            if (c10Var != null) {
                c10Var.n(1, l14);
            }
            this.f166524c = true;
            this.f166525d = false;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltv/k$a;", "", "<init>", "()V", "", "INVALID_UINT32", "J", "", "BIG_DECIMAL_SCALE", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
