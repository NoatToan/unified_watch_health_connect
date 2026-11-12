package com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractCommand {
    protected byte mCode;
    protected byte mCommand;
    protected byte mHead;
    protected byte mOrder;

    public abstract byte getCheck();

    public abstract byte[] getPara();

    public abstract byte[] getParameterLength();

    public abstract byte[] toByteArray();

    public byte getHead() {
        return this.mHead;
    }

    public byte getOrder() {
        return this.mOrder;
    }

    public byte getCommand() {
        return this.mCommand;
    }

    public byte getCode() {
        return this.mCode;
    }

    public int toByteArray(byte[] bArr) {
        bArr[0] = this.mHead;
        bArr[1] = this.mOrder;
        bArr[2] = this.mCommand;
        bArr[3] = this.mCode;
        return 3;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte f6508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte f6509b;
        public byte d;
        public byte e;

        public b(byte b2) {
            this.f6508a = b2;
        }

        public void d(byte b2) {
            this.f6508a = b2;
        }

        public void a(int i) {
            this.d = (byte) (i & 255);
        }

        public void e(byte b2) {
            this.d = b2;
        }

        public void d(int i) {
            this.f6509b = (byte) (i & 255);
        }

        public void a(byte b2) {
            this.f6509b = b2;
        }

        public void c(byte b2) {
            this.e = b2;
        }

        public int a(byte[] bArr) {
            this.f6508a = bArr[0];
            this.e = bArr[1];
            this.d = bArr[2];
            this.f6509b = bArr[3];
            return 3;
        }
    }
}
