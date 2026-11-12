package defpackage;

import com.huawei.health.trusport_ee_jni.trusport_eeJNI;

/* JADX INFO: loaded from: classes32.dex */
public final class imm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final imm f37831a;
    public static final imm aa;
    private static int ac;
    private static imm[] ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final imm f37832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final imm f37833c;
    public static final imm d;
    public static final imm e;
    public static final imm f;
    public static final imm g;
    public static final imm h;
    public static final imm i;
    public static final imm j;
    public static final imm k;
    public static final imm l;
    public static final imm m;
    public static final imm n;
    public static final imm o;
    public static final imm p;
    public static final imm q;
    public static final imm r;
    public static final imm s;
    public static final imm t;
    public static final imm u;
    public static final imm v;
    public static final imm w;
    public static final imm x;
    public static final imm y;
    private final int ab;
    private final String z;

    static {
        imm immVar = new imm("TRUSPORT_EE_ERROR_OK", trusport_eeJNI.TRUSPORT_EE_ERROR_OK_get());
        x = immVar;
        imm immVar2 = new imm("TRUSPORT_EE_ERROR_NULL_POINTER");
        v = immVar2;
        imm immVar3 = new imm("TRUSPORT_EE_ERROR_BUFFER_OVERFLOW");
        f37833c = immVar3;
        imm immVar4 = new imm("TRUSPORT_EE_ERROR_DATA_SIZE_MISMATCH");
        f37831a = immVar4;
        imm immVar5 = new imm("TRUSPORT_EE_ERROR_DATA_NOT_AVAILABLE");
        e = immVar5;
        imm immVar6 = new imm("TRUSPORT_EE_ERROR_INVALID_HR");
        l = immVar6;
        imm immVar7 = new imm("TRUSPORT_EE_ERROR_INVALID_SPEED");
        t = immVar7;
        imm immVar8 = new imm("TRUSPORT_EE_ERROR_INVALID_SR");
        s = immVar8;
        imm immVar9 = new imm("TRUSPORT_EE_ERROR_INVALID_PUSH_POWER");
        o = immVar9;
        imm immVar10 = new imm("TRUSPORT_EE_ERROR_INVALID_AGE");
        i = immVar10;
        imm immVar11 = new imm("TRUSPORT_EE_ERROR_INVALID_HEIGHT");
        m = immVar11;
        imm immVar12 = new imm("TRUSPORT_EE_ERROR_INVALID_WEIGHT");
        y = immVar12;
        imm immVar13 = new imm("TRUSPORT_EE_ERROR_INVALID_ACTIVITY_CLASS");
        g = immVar13;
        imm immVar14 = new imm("TRUSPORT_EE_ERROR_INVALID_VO2MAX");
        w = immVar14;
        imm immVar15 = new imm("TRUSPORT_EE_ERROR_INVALID_STEP_LENGTH");
        r = immVar15;
        imm immVar16 = new imm("TRUSPORT_EE_ERROR_INVALID_TIMESTAMP");
        q = immVar16;
        imm immVar17 = new imm("TRUSPORT_EE_ERROR_INVALID_ACTION");
        h = immVar17;
        imm immVar18 = new imm("TRUSPORT_EE_ERROR_INVALID_VERBOSITY");
        u = immVar18;
        imm immVar19 = new imm("TRUSPORT_EE_ERROR_INVALID_EE");
        n = immVar19;
        imm immVar20 = new imm("TRUSPORT_EE_ERROR_INVALID_SWOLF");
        p = immVar20;
        imm immVar21 = new imm("TRUSPORT_EE_ERROR_INVALID_DISTANCE");
        f = immVar21;
        imm immVar22 = new imm("TRUSPORT_EE_ERROR_INVALID_DURATION");
        k = immVar22;
        imm immVar23 = new imm("TRUSPORT_EE_ERROR_INVALID_ACC");
        j = immVar23;
        imm immVar24 = new imm("TRUSPORT_EE_ERROR_CORRUPTED_DATA");
        d = immVar24;
        imm immVar25 = new imm("TRUSPORT_EE_ERROR_INCOMPATIBLE_COMMON");
        f37832b = immVar25;
        imm immVar26 = new imm("TRUSPORT_EE_ERROR_UNKNOWN_ERROR");
        aa = immVar26;
        ad = new imm[]{immVar, immVar2, immVar3, immVar4, immVar5, immVar6, immVar7, immVar8, immVar9, immVar10, immVar11, immVar12, immVar13, immVar14, immVar15, immVar16, immVar17, immVar18, immVar19, immVar20, immVar21, immVar22, immVar23, immVar24, immVar25, immVar26};
        ac = 0;
    }

    public String toString() {
        return this.z;
    }

    public static imm b(int i2) {
        imm[] immVarArr = ad;
        if (i2 < immVarArr.length && i2 >= 0) {
            imm immVar = immVarArr[i2];
            if (immVar.ab == i2) {
                return immVar;
            }
        }
        int i3 = 0;
        while (true) {
            imm[] immVarArr2 = ad;
            if (i3 < immVarArr2.length) {
                imm immVar2 = immVarArr2[i3];
                if (immVar2.ab == i2) {
                    return immVar2;
                }
                i3++;
            } else {
                throw new IllegalArgumentException("No enum " + imm.class + " with value " + i2);
            }
        }
    }

    private imm(String str) {
        this.z = str;
        int i2 = ac;
        ac = i2 + 1;
        this.ab = i2;
    }

    private imm(String str, int i2) {
        this.z = str;
        this.ab = i2;
        ac = i2 + 1;
    }
}
