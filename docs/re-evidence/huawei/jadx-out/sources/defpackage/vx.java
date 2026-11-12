package defpackage;

import com.careforeyou.library.bean.CsFatScale;
import com.careforeyou.library.enums.EnumProcessResult;
import com.careforeyou.library.protocal.iStraightFrame;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class vx implements iStraightFrame {
    private CsFatScale e = null;
    private vk d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<Byte, byte[]> f51669a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<Byte, byte[]> f51670b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<Byte> f51671c = new ArrayList<>();

    private byte[] a(byte b2) {
        return new byte[]{(byte) (((byte) (b2 << 4)) >> 4), (byte) (b2 >> 4)};
    }

    private byte[] a(ArrayList<Byte> arrayList) {
        int size = arrayList.size();
        byte[] bArr = new byte[size];
        for (int i = 0; i < size; i++) {
            bArr[i] = arrayList.get(i).byteValue();
        }
        return bArr;
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    private byte[] d(boolean z) {
        int i = 0;
        byte[] bArrC = new byte[0];
        if (z) {
            while (i < this.f51670b.size()) {
                i++;
                bArrC = c(bArrC, this.f51670b.get(Byte.valueOf((byte) i)));
            }
            return bArrC;
        }
        while (i < this.f51669a.size()) {
            i++;
            bArrC = c(bArrC, this.f51669a.get(Byte.valueOf((byte) i)));
        }
        return bArrC;
    }

    @Override // com.careforeyou.library.protocal.iStraightFrame
    public EnumProcessResult process(byte[] bArr, String str) throws vs {
        byte[] bArrD;
        EnumProcessResult enumProcessResult = EnumProcessResult.Wait_Scale_Data;
        if (bArr == null) {
            throw new vs("帧格式错误 -- 帧为空");
        }
        if (bArr[0] != -54) {
            throw new vs("帧格式错误 -- 不是正确的帧头");
        }
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        if (b2 == 16) {
            byte b4 = bArr[4];
            byte[] bArrC = wg.c(bArr, 7, 2);
            byte[] bArrC2 = wg.c(bArr, 9, 2);
            byte[] bArrC3 = wg.c(bArr, 11, 2);
            byte[] bArrC4 = wg.c(bArr, 13, 2);
            byte[] bArrC5 = wg.c(bArr, 15, 2);
            byte[] bArrC6 = wg.c(bArr, 17, 1);
            CsFatScale csFatScale = new CsFatScale();
            this.e = csFatScale;
            csFatScale.setHistoryData(false);
            byte bE = wg.e(b4);
            this.e.setLockFlag(bE);
            vz vzVarE = wl.e(bArr[5], bArr[6], b4, false);
            this.e.setWeight(vzVarE.f51724a * 10.0d);
            this.e.setScaleWeightC(vzVarE.d);
            this.e.setScaleProperty(b4);
            if (bE > 0) {
                this.e.setAxunge(wg.a(bArrC));
                this.e.setWater(wg.a(bArrC2));
                this.e.setMuscle(wg.a(bArrC3));
                this.e.setBmrC(wg.a(bArrC4));
                this.e.setVisceral_fat(wg.a(bArrC5));
                this.e.setBone(wg.a(bArrC6));
            }
            return EnumProcessResult.Received_Scale_Data;
        }
        if (b2 == 17) {
            byte b5 = bArr[3];
            if (b5 == 0 || b5 == 1) {
                byte[] bArrC7 = wg.c(bArr, 5, 2);
                CsFatScale csFatScale2 = new CsFatScale();
                this.e = csFatScale2;
                csFatScale2.setHistoryData(false);
                this.e.setLockFlag(b5);
                this.e.setScaleProperty(bArr[11]);
                vz vzVarE2 = wl.e(bArrC7[0], bArrC7[1], this.e.getScaleProperty(), false);
                this.e.setWeight(vzVarE2.f51724a * 10.0d);
                this.e.setScaleWeightC(vzVarE2.d);
                return EnumProcessResult.Received_Scale_Data;
            }
            switch (b5) {
                case 18:
                case 19:
                    if (c(bArr)) {
                        if (b5 == 18) {
                            bArrD = d(false);
                        } else {
                            bArrD = d(true);
                        }
                        CsFatScale csFatScale3 = new CsFatScale();
                        this.e = csFatScale3;
                        if (b5 == 18) {
                            csFatScale3.setHistoryData(false);
                        } else {
                            this.e.weighingDate = new Date(((long) wg.a(wg.c(bArrD, 0, 4))) * 1000);
                            this.e.setHistoryData(true);
                        }
                        byte b6 = bArrD[4];
                        this.e.setRoleId(wg.a(wg.c(bArrD, 6, 4)));
                        byte[] bArrC8 = wg.c(bArrD, 10, 2);
                        this.e.setScaleProperty(b6);
                        vz vzVarE3 = wl.e(bArrC8[0], bArrC8[1], b6, false);
                        this.e.setWeight(vzVarE3.f51724a * 10.0d);
                        this.e.setScaleWeightC(vzVarE3.d);
                        this.e.setAxunge(wg.a(wg.c(bArrD, 12, 2)));
                        this.e.setWater(wg.a(wg.c(bArrD, 14, 2)));
                        this.e.setMuscle(wg.a(wg.c(bArrD, 16, 2)));
                        this.e.setBmrC(wg.a(wg.c(bArrD, 18, 2)));
                        this.e.setVisceral_fat(wg.a(wg.c(bArrD, 20, 2)));
                        this.e.setBone(wg.a(wg.c(bArrD, 22, 1)));
                        double muscle = (this.e.getMuscle() / this.e.getWeight()) * 100.0d;
                        if (muscle >= 50.0d) {
                            muscle = this.e.getMuscle();
                            if (muscle >= 50.0d) {
                                muscle = 50.0d;
                            }
                        }
                        this.e.setMuscle((int) (muscle * 10.0d));
                        this.e.setLockFlag((byte) 1);
                        if (b5 == 18) {
                            this.f51669a.clear();
                            this.f51669a = null;
                        } else {
                            this.f51670b.clear();
                            this.f51670b = null;
                        }
                        return EnumProcessResult.Received_Scale_Data;
                    }
                    return EnumProcessResult.Wait_Scale_Data;
                case 20:
                    byte[] bArrA = a(bArr[4]);
                    if (this.f51671c == null) {
                        this.f51671c = new ArrayList<>();
                    }
                    for (int i = 0; i < b3 - 2; i++) {
                        this.f51671c.add(Byte.valueOf(bArr[i + 5]));
                    }
                    if (bArrA[0] == bArrA[1]) {
                        byte[] bArrA2 = a(this.f51671c);
                        this.d = new vk();
                        byte[] bArrC9 = wg.c(bArrA2, 0, 2);
                        vz vzVarE4 = wl.e(bArrC9[0], bArrC9[1], bArrA2[2], false);
                        this.d.a(vzVarE4.f51724a * 10.0d);
                        this.d.e(vzVarE4.d);
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        for (int i2 = 3; i2 < bArrA2.length; i2 += 4) {
                            arrayList.add(Integer.valueOf(wg.a(wg.c(bArrA2, i2, 4))));
                        }
                        this.d.e(arrayList);
                        this.f51671c.clear();
                        this.f51671c = null;
                        return EnumProcessResult.Match_User_Msg;
                    }
                    return EnumProcessResult.Wait_Scale_Data;
            }
        }
        return enumProcessResult;
    }

    public vk d() {
        return this.d;
    }

    @Override // com.careforeyou.library.protocal.iStraightFrame
    public CsFatScale getFatScale() {
        return this.e;
    }

    private boolean c(byte[] bArr) {
        byte b2 = bArr[2];
        byte b3 = bArr[3];
        int i = b2 - 2;
        byte[] bArrA = a(bArr[4]);
        byte[] bArr2 = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr2[i2] = bArr[i2 + 5];
        }
        if (b3 == 18) {
            if (bArrA[1] == 1) {
                HashMap<Byte, byte[]> map = this.f51669a;
                if (map != null) {
                    map.clear();
                } else {
                    this.f51669a = new HashMap<>();
                }
            }
            if (this.f51669a.containsKey(Byte.valueOf(bArrA[1]))) {
                this.f51669a.remove(Byte.valueOf(bArrA[1]));
            }
            this.f51669a.put(Byte.valueOf(bArrA[1]), bArr2);
            if (bArrA[0] == bArrA[1]) {
                if (this.f51669a.size() == bArrA[0]) {
                    return true;
                }
                this.f51669a.clear();
                return false;
            }
        } else {
            if (bArrA[1] == 1) {
                HashMap<Byte, byte[]> map2 = this.f51670b;
                if (map2 != null) {
                    map2.clear();
                } else {
                    this.f51670b = new HashMap<>();
                }
            }
            if (this.f51670b.containsKey(Byte.valueOf(bArrA[1]))) {
                this.f51670b.remove(Byte.valueOf(bArrA[1]));
            }
            this.f51670b.put(Byte.valueOf(bArrA[1]), bArr2);
            if (bArrA[0] == bArrA[1]) {
                if (this.f51670b.size() == bArrA[0]) {
                    return true;
                }
                this.f51670b.clear();
                return false;
            }
        }
        return false;
    }
}
