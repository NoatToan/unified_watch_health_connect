package defpackage;

import com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand;

/* JADX INFO: loaded from: classes7.dex */
public class egv extends AbstractCommand {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    byte f32960a;
    private byte[] e;

    public egv(e eVar) {
        this.mHead = eVar.f6508a;
        this.mOrder = eVar.e;
        this.mCommand = eVar.d;
        this.mCode = eVar.f6509b;
        this.e = eVar.f;
        this.f32960a = eVar.f32961c;
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte[] toByteArray() {
        byte[] bArr = new byte[this.e.length + 5];
        int byteArray = super.toByteArray(bArr);
        int i = 0;
        while (true) {
            byte[] bArr2 = this.e;
            if (i < bArr2.length) {
                byteArray++;
                bArr[byteArray] = bArr2[i];
                i++;
            } else {
                bArr[byteArray + 1] = this.f32960a;
                return bArr;
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte getCheck() {
        return this.f32960a;
    }

    public static class e extends AbstractCommand.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        byte f32961c;
        private byte[] f;

        public e() {
            super((byte) 64);
            this.f = new byte[0];
        }

        public void b(byte b2) {
            this.f32961c = b2;
        }

        public void d(byte[] bArr) {
            this.f = bArr;
        }

        public egv a() {
            return new egv(this);
        }

        public egv e(byte[] bArr) {
            int iA = super.a(bArr) + 1;
            this.f = new byte[(bArr.length - 1) - iA];
            int i = 0;
            while (iA < bArr.length - 1) {
                this.f[i] = bArr[iA];
                i++;
                iA++;
            }
            this.f32961c = bArr[bArr.length - 1];
            return new egv(this);
        }
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte[] getParameterLength() {
        return new byte[0];
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte[] getPara() {
        return this.e;
    }
}
