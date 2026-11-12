package com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand;

import com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.CourseModel;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.egx;
import defpackage.egz;
import defpackage.ehn;
import defpackage.erh;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class CommandArrayList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private egx f6511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ReceiveCallback f6512c;
    private byte d;
    private byte e;
    private int f;
    private int g;
    private int j;
    private int k;
    private byte m;
    private byte[] o;
    private List<CourseModel.Course> i = new ArrayList();
    private AbstractCommand[] h = new AbstractCommand[20];

    public interface ReceiveCallback {
        void onReceiveSuccess(byte b2, CommandArrayList commandArrayList);
    }

    public void e(int i, AbstractCommand abstractCommand) {
        this.h[i] = abstractCommand;
        int i2 = this.g + 1;
        this.g = i2;
        LogUtil.a("PDROPE_CommandArrayList", "mFrameCount = ", Integer.valueOf(i2), ", mFrameSum = ", Integer.valueOf(this.j));
        if (this.g == this.j) {
            this.f6510a = true;
            this.f6512c.onReceiveSuccess(this.m, this);
        }
    }

    public void h() {
        int iD = ehn.d(this.h[0].getParameterLength(), 18, 0);
        LogUtil.a("PDROPE_CommandArrayList", "processPara, length = ", Integer.valueOf(iD));
        this.o = new byte[iD];
        int length = 0;
        for (int i = 0; i < this.j; i++) {
            egz.d(this.o, length, this.h[i].getPara(), 0, this.h[i].getPara().length);
            length += this.h[i].getPara().length;
        }
        byte[] bArr = this.o;
        this.k = bArr.length;
        LogUtil.a("PDROPE_CommandArrayList", "processPara, mPara = ", erh.a(bArr, ""));
        i();
    }

    public boolean a() {
        if (ehn.d(this.h[0].getParameterLength(), 18, 0) != this.k) {
            LogUtil.j("PDROPE_CommandArrayList", "The length of parameter content is not equal with value of parameter length.");
            return false;
        }
        byte check = this.h[this.j - 1].getCheck();
        LogUtil.a("PDROPE_CommandArrayList", "appCheck = ", Byte.valueOf(this.f6511b.getCheck()), ", deviceCheck = ", Byte.valueOf(check));
        if (this.f6511b.getCheck() == check) {
            return true;
        }
        LogUtil.j("PDROPE_CommandArrayList", "Data verify failed!");
        return false;
    }

    private void i() {
        egx.c cVar = new egx.c();
        cVar.d(this.h[0].getHead());
        cVar.c(this.h[0].getOrder());
        cVar.e(this.h[0].getCommand());
        cVar.a(this.h[0].getCode());
        cVar.e(this.f);
        cVar.e(this.o);
        this.f6511b = cVar.c();
    }

    public void d(int i) {
        this.j = i;
    }

    public void e(ReceiveCallback receiveCallback) {
        this.f6512c = receiveCallback;
    }

    public void c(byte b2) {
        this.m = b2;
    }

    public byte e() {
        return this.e;
    }

    public void a(byte b2) {
        this.e = b2;
    }

    public byte c() {
        return this.d;
    }

    public byte[] f() {
        return this.o;
    }

    public void d(byte b2) {
        this.d = b2;
    }

    public int b() {
        return this.f;
    }

    public void d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            this.f = 0;
        } else {
            this.f = ehn.d(bArr, 18, 0);
        }
    }

    public int d() {
        return this.k;
    }
}
