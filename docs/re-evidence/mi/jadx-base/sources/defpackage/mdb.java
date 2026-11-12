package defpackage;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public class mdb implements zye {
    public static Hashtable h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public aw6 f26035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26036b;
    public int c;
    public dpf d;
    public dpf e;
    public byte[] f;
    public byte[] g;

    static {
        Hashtable hashtable = new Hashtable();
        h = hashtable;
        hashtable.put("GOST3411", rcd.b(32));
        h.put("MD2", rcd.b(16));
        h.put("MD4", rcd.b(64));
        h.put(Coder.KEY_MD5, rcd.b(64));
        h.put("RIPEMD128", rcd.b(64));
        h.put("RIPEMD160", rcd.b(64));
        h.put("SHA-1", rcd.b(64));
        h.put("SHA-224", rcd.b(64));
        h.put(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, rcd.b(64));
        h.put("SHA-384", rcd.b(128));
        h.put("SHA-512", rcd.b(128));
        h.put("Tiger", rcd.b(64));
        h.put("Whirlpool", rcd.b(64));
    }

    public mdb(aw6 aw6Var) {
        this(aw6Var, b(aw6Var));
    }

    public static int b(aw6 aw6Var) {
        if (aw6Var instanceof ck8) {
            return ((ck8) aw6Var).d();
        }
        Integer num = (Integer) h.get(aw6Var.getAlgorithmName());
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("unknown digest passed: " + aw6Var.getAlgorithmName());
    }

    public static void c(byte[] bArr, int i, byte b2) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ b2);
        }
    }

    @Override // defpackage.zye
    public void a(lw3 lw3Var) {
        byte[] bArr;
        this.f26035a.reset();
        byte[] bArrA = ((c0e) lw3Var).a();
        int length = bArrA.length;
        if (length > this.c) {
            this.f26035a.update(bArrA, 0, length);
            this.f26035a.doFinal(this.f, 0);
            length = this.f26036b;
        } else {
            System.arraycopy(bArrA, 0, this.f, 0, length);
        }
        while (true) {
            bArr = this.f;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.g, 0, this.c);
        c(this.f, this.c, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG);
        c(this.g, this.c, (byte) 92);
        aw6 aw6Var = this.f26035a;
        if (aw6Var instanceof dpf) {
            dpf dpfVarCopy = ((dpf) aw6Var).copy();
            this.e = dpfVarCopy;
            ((aw6) dpfVarCopy).update(this.g, 0, this.c);
        }
        aw6 aw6Var2 = this.f26035a;
        byte[] bArr2 = this.f;
        aw6Var2.update(bArr2, 0, bArr2.length);
        aw6 aw6Var3 = this.f26035a;
        if (aw6Var3 instanceof dpf) {
            this.d = ((dpf) aw6Var3).copy();
        }
    }

    @Override // defpackage.zye
    public int doFinal(byte[] bArr, int i) {
        this.f26035a.doFinal(this.g, this.c);
        dpf dpfVar = this.e;
        if (dpfVar != null) {
            ((dpf) this.f26035a).a(dpfVar);
            aw6 aw6Var = this.f26035a;
            aw6Var.update(this.g, this.c, aw6Var.c());
        } else {
            aw6 aw6Var2 = this.f26035a;
            byte[] bArr2 = this.g;
            aw6Var2.update(bArr2, 0, bArr2.length);
        }
        int iDoFinal = this.f26035a.doFinal(bArr, i);
        int i2 = this.c;
        while (true) {
            byte[] bArr3 = this.g;
            if (i2 >= bArr3.length) {
                break;
            }
            bArr3[i2] = 0;
            i2++;
        }
        dpf dpfVar2 = this.d;
        if (dpfVar2 != null) {
            ((dpf) this.f26035a).a(dpfVar2);
        } else {
            aw6 aw6Var3 = this.f26035a;
            byte[] bArr4 = this.f;
            aw6Var3.update(bArr4, 0, bArr4.length);
        }
        return iDoFinal;
    }

    @Override // defpackage.zye
    public String getAlgorithmName() {
        return this.f26035a.getAlgorithmName() + "/HMAC";
    }

    @Override // defpackage.zye
    public int getMacSize() {
        return this.f26036b;
    }

    @Override // defpackage.zye
    public void reset() {
        this.f26035a.reset();
        aw6 aw6Var = this.f26035a;
        byte[] bArr = this.f;
        aw6Var.update(bArr, 0, bArr.length);
    }

    @Override // defpackage.zye
    public void update(byte b2) {
        this.f26035a.update(b2);
    }

    public mdb(aw6 aw6Var, int i) {
        this.f26035a = aw6Var;
        int iC = aw6Var.c();
        this.f26036b = iC;
        this.c = i;
        this.f = new byte[i];
        this.g = new byte[i + iC];
    }

    @Override // defpackage.zye
    public void update(byte[] bArr, int i, int i2) {
        this.f26035a.update(bArr, i, i2);
    }
}
