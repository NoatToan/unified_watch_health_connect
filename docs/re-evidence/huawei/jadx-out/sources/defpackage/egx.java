package defpackage;

import com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class egx extends AbstractCommand {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    byte[] f32965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    byte f32966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    byte[] f32967c;
    byte[] d;

    public egx(c cVar) {
        this.mHead = cVar.f6508a;
        this.mOrder = cVar.e;
        this.mCommand = cVar.d;
        this.mCode = cVar.f6509b;
        this.f32967c = cVar.f;
        this.d = cVar.g;
        this.f32965a = cVar.j;
        this.f32966b = cVar.f32968c;
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte[] toByteArray() {
        int i = 0;
        byte[] bArr = new byte[this.f32967c.length + 5 + this.f32965a.length + (this.mCode == 0 ? this.d.length : 0)];
        int byteArray = super.toByteArray(bArr);
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.d;
            if (i2 >= bArr2.length) {
                break;
            }
            byteArray++;
            bArr[byteArray] = bArr2[i2];
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.f32967c;
            if (i3 >= bArr3.length) {
                break;
            }
            byteArray++;
            bArr[byteArray] = bArr3[i3];
            i3++;
        }
        while (true) {
            byte[] bArr4 = this.f32965a;
            if (i < bArr4.length) {
                byteArray++;
                bArr[byteArray] = bArr4[i];
                i++;
            } else {
                bArr[byteArray + 1] = this.f32966b;
                LogUtil.a("Command", toString());
                return bArr;
            }
        }
    }

    public List<AbstractCommand> b() {
        ArrayList arrayList = new ArrayList();
        int length = this.f32965a.length;
        byte[] bArr = this.d;
        if (length <= 13 - bArr.length) {
            arrayList.add(this);
            return arrayList;
        }
        if (length <= 29 - bArr.length) {
            a(arrayList);
            return arrayList;
        }
        egw.c cVar = new egw.c();
        byte b2 = 0;
        cVar.c((byte) 0);
        cVar.e(this.mCommand);
        cVar.a(this.mCode);
        cVar.b(this.d);
        cVar.e(this.f32967c);
        cVar.c(egz.d(this.f32965a, 0, 14 - this.d.length));
        arrayList.add(cVar.d());
        int length2 = 14 - this.d.length;
        while (length2 <= this.f32965a.length - 16) {
            egu.a aVar = new egu.a();
            byte b3 = (byte) (((length2 / 16) + 1) & 255);
            aVar.c(b3);
            aVar.e(this.mCommand);
            aVar.a(this.mCode);
            int i = length2 + 16;
            aVar.e(egz.d(this.f32965a, length2, i));
            arrayList.add(aVar.d());
            b2 = b3;
            length2 = i;
        }
        egv.e eVar = new egv.e();
        eVar.c((byte) (b2 + 1));
        eVar.e(this.mCommand);
        eVar.a(this.mCode);
        byte[] bArr2 = this.f32965a;
        eVar.d(egz.d(bArr2, length2, bArr2.length));
        eVar.b(this.f32966b);
        arrayList.add(eVar.a());
        return arrayList;
    }

    private void a(List<AbstractCommand> list) {
        egw.c cVar = new egw.c();
        cVar.c((byte) 0);
        cVar.e(this.mCommand);
        cVar.a(this.mCode);
        cVar.e(this.f32967c);
        cVar.c(egz.d(this.f32965a, 0, 14 - this.d.length));
        list.add(cVar.d());
        egv.e eVar = new egv.e();
        eVar.c((byte) 1);
        eVar.e(this.mCommand);
        eVar.a(this.mCode);
        byte[] bArr = this.f32965a;
        eVar.d(egz.d(bArr, 14 - this.d.length, bArr.length));
        eVar.b(this.f32966b);
        list.add(eVar.a());
    }

    public static class c extends AbstractCommand.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        byte f32968c;
        byte[] f;
        byte[] g;
        private byte[] j;

        public c() {
            super((byte) 0);
            this.g = new byte[0];
            this.f = new byte[0];
            this.j = new byte[0];
        }

        public void e(int i) {
            this.g = new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255)};
        }

        private void b(int i) {
            this.f = new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255)};
        }

        public void e(byte[] bArr) {
            this.j = bArr;
            b(bArr.length);
        }

        public egx c() {
            e();
            return new egx(this);
        }

        public egx d(byte[] bArr) {
            int iA = super.a(bArr);
            int i = 0;
            if (egz.b(this.d, this.f6509b)) {
                this.g = new byte[]{bArr[iA + 1], bArr[iA]};
                iA += 2;
            }
            this.f = new byte[]{bArr[iA + 1], bArr[iA + 2]};
            int i2 = iA + 3;
            this.j = new byte[(bArr.length - 1) - i2];
            while (i2 < bArr.length - 1) {
                this.j[i] = bArr[i2];
                i++;
                i2++;
            }
            this.f32968c = bArr[bArr.length - 1];
            return new egx(this);
        }

        private void e() {
            int i = this.d + this.f6509b;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[] bArr = this.g;
                if (i3 >= bArr.length) {
                    break;
                }
                i += bArr[i3];
                i3++;
            }
            int i4 = 0;
            while (true) {
                byte[] bArr2 = this.f;
                if (i4 >= bArr2.length) {
                    break;
                }
                i += bArr2[i4];
                i4++;
            }
            while (true) {
                byte[] bArr3 = this.j;
                if (i2 < bArr3.length) {
                    i += bArr3[i2];
                    i2++;
                } else {
                    this.f32968c = (byte) (i & 255);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "Command{mHead=" + ((int) this.mHead) + ", mOrder=" + ((int) this.mOrder) + ", mCommand=" + ((int) this.mCommand) + ", mCode = " + ((int) this.mCode) + ", mFlag = " + ehn.b(this.d, 2) + ", mParameterLength = " + ehn.b(this.f32967c, 10) + ", mPara = " + ehn.b(this.f32965a, 16) + ", mCheck = " + ((int) this.f32966b) + '}';
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte getCommand() {
        return this.mCommand;
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte getCode() {
        return this.mCode;
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte[] getParameterLength() {
        return this.f32967c;
    }

    public byte[] a() {
        return this.d;
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte[] getPara() {
        return this.f32965a;
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte getCheck() {
        return this.f32966b;
    }
}
