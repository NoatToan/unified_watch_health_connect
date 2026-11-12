package com.huawei.health.device.kit.hwwsp.hagrid.bean;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.doa;
import defpackage.dod;
import defpackage.doi;
import defpackage.eeq;

/* JADX INFO: loaded from: classes7.dex */
public class MultiPackageDataRecLogic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MultiPackageCb f6309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6310b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6311c;
    private String d;
    private byte[] e;

    public interface MultiPackageCb {
        void onDataReceiveDone(byte[] bArr);
    }

    public MultiPackageDataRecLogic(String str, MultiPackageCb multiPackageCb, String str2, Context context) {
        this.f6311c = str;
        this.f6309a = multiPackageCb;
        this.d = str2;
    }

    public void b(byte[] bArr) {
        dod dodVarB = doa.b(bArr);
        if (dodVarB == null) {
            this.f6309a.onDataReceiveDone(null);
            this.e = null;
            this.f6310b = 0;
            LogUtil.e(this.f6311c, "recv multi package error.");
            return;
        }
        int iD = (dodVarB.d() + 1) * 15;
        if (this.e == null) {
            this.e = new byte[iD];
        }
        if (dodVarB.c() != this.f6310b) {
            LogUtil.a(this.f6311c, "recv seq error");
            this.f6309a.onDataReceiveDone(null);
            this.e = null;
            this.f6310b = 0;
            return;
        }
        LogUtil.a(this.f6311c, "recv ", Integer.valueOf(dodVarB.c()), "/", Integer.valueOf(dodVarB.d()));
        int iC = dodVarB.c() * 15;
        byte[] bArrE = dodVarB.e();
        if (bArrE != null && bArrE.length + iC <= iD) {
            d(this.e, iC, dodVarB.e());
            this.f6310b++;
            c(dodVarB);
        } else {
            LogUtil.a(this.f6311c, "recv data length error");
            this.f6309a.onDataReceiveDone(this.e);
            this.e = null;
            this.f6310b = 0;
        }
    }

    private void c(dod dodVar) {
        if (dodVar == null) {
            return;
        }
        byte[] bArr = new byte[16];
        if (dodVar.c() >= dodVar.d()) {
            if (dodVar.a() != 15) {
                int iD = (dodVar.d() * 15) + dodVar.a();
                byte[] bArr2 = new byte[iD];
                a(bArr2, 0, this.e, iD);
                this.e = bArr2;
                if (dodVar.b() == -51) {
                    System.arraycopy(this.e, 0, bArr, 0, 16);
                    LogUtil.a(this.f6311c, "recv data mOnePackage", eeq.e(this.e));
                    LogUtil.a(this.f6311c, "recv data ivinfo", eeq.e(bArr));
                    byte[] bArr3 = this.e;
                    int length = bArr3.length - 16;
                    byte[] bArr4 = new byte[length];
                    System.arraycopy(bArr3, 16, bArr4, 0, length);
                    LogUtil.a(this.f6311c, "recv data playload", eeq.e(bArr4));
                    byte[] bArrD = doi.d(bArr4, doi.d(this.d), bArr);
                    this.e = bArrD;
                    LogUtil.a(this.f6311c, "recv data desEncrypt mOnePackage", eeq.e(bArrD));
                }
            }
            String str = this.f6311c;
            byte[] bArr5 = this.e;
            LogUtil.a(str, "recv data finished(", bArr5 != null ? Integer.valueOf(bArr5.length) : " mOnePackage is null ", " Bytes)");
            MultiPackageCb multiPackageCb = this.f6309a;
            if (multiPackageCb != null) {
                multiPackageCb.onDataReceiveDone(this.e);
            }
            this.e = null;
            this.f6310b = 0;
        }
    }

    private static int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr == null || bArr2 == null || i < 0 || i + i2 > bArr.length) {
            return 0;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i + i3] = bArr2[i3];
        }
        return i2;
    }

    private static int d(byte[] bArr, int i, byte[] bArr2) {
        return a(bArr, i, bArr2, bArr2 != null ? bArr2.length : 0);
    }
}
