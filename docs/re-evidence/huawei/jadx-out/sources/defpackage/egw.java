package defpackage;

import com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class egw extends AbstractCommand {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    byte[] f32962a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    byte[] f32963c;
    private byte[] e;

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte getCheck() {
        return (byte) 0;
    }

    public egw(c cVar) {
        this.f32962a = new byte[0];
        this.f32963c = new byte[0];
        this.mHead = cVar.f6508a;
        this.mOrder = cVar.e;
        this.mCommand = cVar.d;
        this.mCode = cVar.f6509b;
        this.f32962a = cVar.f32964c;
        this.f32963c = cVar.f;
        this.e = cVar.h;
    }

    public static class c extends AbstractCommand.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        byte[] f32964c;
        byte[] f;
        private byte[] h;

        public c() {
            super((byte) -64);
            this.f32964c = new byte[0];
            this.f = new byte[0];
            this.h = new byte[0];
        }

        public void b(byte[] bArr) {
            this.f32964c = bArr;
        }

        public void c(byte[] bArr) {
            this.h = bArr;
        }

        public void e(byte[] bArr) {
            this.f = bArr;
        }

        public egw d() {
            return new egw(this);
        }

        public egw d(byte[] bArr) {
            int iA = super.a(bArr);
            int i = 0;
            if (egz.b(this.d, this.f6509b)) {
                this.f32964c = new byte[]{bArr[iA + 1], bArr[iA]};
                iA += 2;
            }
            LogUtil.a("CommandHeadCommand", "HeadCommand, build(), mFlag = ", erh.a(this.f32964c, ""));
            this.f = new byte[]{bArr[iA + 1], bArr[iA + 2]};
            int i2 = iA + 3;
            this.h = new byte[bArr.length - i2];
            while (i2 < bArr.length) {
                this.h[i] = bArr[i2];
                i++;
                i2++;
            }
            return new egw(this);
        }
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte[] toByteArray() {
        byte[] bArr = new byte[20];
        int byteArray = super.toByteArray(bArr);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.f32962a;
            if (i2 >= bArr2.length) {
                break;
            }
            LogUtil.a("CommandHeadCommand", "mFlag[flagIndex] = ", Byte.valueOf(bArr2[i2]));
            byteArray++;
            bArr[byteArray] = this.f32962a[i2];
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.f32963c;
            if (i3 >= bArr3.length) {
                break;
            }
            byteArray++;
            bArr[byteArray] = bArr3[i3];
            i3++;
        }
        while (true) {
            byte[] bArr4 = this.e;
            if (i >= bArr4.length) {
                return bArr;
            }
            byteArray++;
            bArr[byteArray] = bArr4[i];
            i++;
        }
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte[] getParameterLength() {
        return this.f32963c;
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte[] getPara() {
        return this.e;
    }

    public byte[] b() {
        return this.f32962a;
    }
}
