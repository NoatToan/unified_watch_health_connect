package defpackage;

import com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand;

/* JADX INFO: loaded from: classes7.dex */
public class egu extends AbstractCommand {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f32958c;

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte getCheck() {
        return (byte) 0;
    }

    public egu(a aVar) {
        this.mHead = aVar.f6508a;
        this.mOrder = aVar.e;
        this.mCommand = aVar.d;
        this.mCode = aVar.f6509b;
        this.f32958c = aVar.f32959c;
    }

    public static class a extends AbstractCommand.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f32959c;

        public a() {
            super((byte) -64);
            this.f32959c = new byte[0];
        }

        public void e(byte[] bArr) {
            this.f32959c = bArr;
        }

        public egu d() {
            return new egu(this);
        }

        public egu c(byte[] bArr) {
            int iA = super.a(bArr) + 1;
            this.f32959c = new byte[bArr.length - iA];
            int i = 0;
            while (iA < bArr.length) {
                this.f32959c[i] = bArr[iA];
                i++;
                iA++;
            }
            return new egu(this);
        }
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte[] toByteArray() {
        byte[] bArr = new byte[20];
        int byteArray = super.toByteArray(bArr);
        int i = 0;
        while (true) {
            byte[] bArr2 = this.f32958c;
            if (i >= bArr2.length) {
                return bArr;
            }
            byteArray++;
            bArr[byteArray] = bArr2[i];
            i++;
        }
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte[] getParameterLength() {
        return new byte[0];
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand
    public byte[] getPara() {
        return this.f32958c;
    }
}
