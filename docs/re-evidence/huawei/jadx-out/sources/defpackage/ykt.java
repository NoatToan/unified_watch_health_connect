package defpackage;

import com.huawei.wearengine.sensor.AsyncReadCallback;
import com.huawei.wearengine.sensor.DataResult;
import com.huawei.wearengine.sensor.Sensor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes46.dex */
public class ykt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f53599c;
    private int d;
    private int e;
    private AsyncReadCallback f;
    private int g;
    private int h;
    private Sensor i;
    private int j;
    private ykv k;
    private List<Float> l = new ArrayList(10);
    private String m;
    private long n;
    private long o;
    private int q;

    private int b(int i) {
        if (i == 2 || i == 3) {
            return 3;
        }
        return i != 4 ? 0 : 4;
    }

    public ykt(ykv ykvVar, ykv ykvVar2, AsyncReadCallback asyncReadCallback, String str) {
        this.f = asyncReadCallback;
        this.m = str;
        this.k = ykvVar2;
        b(ykvVar);
    }

    public void a(ykv ykvVar) {
        yit.e("AsyncReadListener", "enter updateDeviceReportFrequency");
        b(ykvVar);
    }

    private void b(ykv ykvVar) {
        if (this.k == null || ykvVar == null) {
            yit.b("AsyncReadListener", "initData mSubscribeFqu or deviceReportFqu is null");
            return;
        }
        this.f53599c = ykvVar.d() == this.k.d();
        this.d = this.k.b();
        this.j = ykvVar.c();
        int iB = ykvVar.b();
        this.e = iB;
        if (iB != 0) {
            this.f53598b = this.j / iB;
        }
        if (ykvVar.c() != 0) {
            this.g = this.k.c() / ykvVar.c();
        }
        this.f53597a = 0;
    }

    public void b() {
        yit.e("AsyncReadListener", "enter flush");
        if (this.l.isEmpty()) {
            return;
        }
        e(this.h);
    }

    public void e(int i, DataResult dataResult) {
        yit.e("AsyncReadListener", "enter handlerData");
        if (dataResult == null) {
            yit.b("AsyncReadListener", "handleData dataResult is null");
            return;
        }
        if (this.f53599c) {
            yit.e("AsyncReadListener", "handlerData onReadResult " + dataResult.getSensor().getType());
            try {
                this.f.onReadResult(i, dataResult);
                return;
            } catch (Exception unused) {
                yit.b("AsyncReadListener", "handleData onReadResult Exception");
                return;
            }
        }
        int i2 = this.q + 1;
        this.q = i2;
        if ((i2 * this.j) % this.d == 0) {
            float[] fArrAsFloats = dataResult.asFloats();
            if (dataResult.getSensor() == null) {
                yit.b("AsyncReadListener", "dataResult sensor is null");
                c();
                return;
            }
            this.f53597a = b(dataResult.getSensor().getType());
            e(fArrAsFloats);
            yit.a("AsyncReadListener", "handlerData pick data size：" + this.l.size() + " mWaitedTime=" + this.q + " getRepPeriod=" + this.k.c() + " highFreq=" + this.j + " floats.length=" + fArrAsFloats.length + " packLength=" + this.f53597a);
        }
        this.i = dataResult.getSensor();
        this.n = dataResult.getUtc();
        this.o = dataResult.getTimestamp();
        this.h = i;
        if (this.q == this.g) {
            e(i);
        }
    }

    private void c() {
        this.q = 0;
        this.l.clear();
    }

    private void e(float[] fArr) {
        if (this.f53597a == fArr.length) {
            for (int i = 0; i < this.f53597a; i++) {
                if (i >= fArr.length) {
                    yit.b("AsyncReadListener", "pickData one pack wrong data");
                    c();
                    return;
                }
                this.l.add(Float.valueOf(fArr[i]));
            }
            return;
        }
        for (int i2 = 1; i2 <= this.f53598b; i2++) {
            if ((this.e * i2) % this.d == 0) {
                int i3 = 0;
                while (true) {
                    int i4 = this.f53597a;
                    if (i3 >= i4) {
                        break;
                    }
                    int i5 = ((i2 - 1) * i4) + i3;
                    if (i5 >= fArr.length) {
                        yit.b("AsyncReadListener", "pickData wrong data");
                        c();
                        break;
                    } else {
                        this.l.add(Float.valueOf(fArr[i5]));
                        i3++;
                    }
                }
            }
        }
    }

    private void e(int i) {
        if (this.i == null) {
            yit.b("AsyncReadListener", "sendData mSensor");
            return;
        }
        DataResult dataResult = new DataResult();
        float[] fArr = new float[this.l.size()];
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            fArr[i2] = this.l.get(i2).floatValue();
        }
        dataResult.setValues(fArr);
        dataResult.setSensor(this.i);
        dataResult.setUtc(this.n);
        dataResult.setTimestamp(this.o);
        yit.e("AsyncReadListener", "sendData => type: " + this.i.getType());
        try {
            this.f.onReadResult(i, dataResult);
        } catch (Exception unused) {
            yit.b("AsyncReadListener", "sendData onReadResult Exception");
        }
        c();
    }

    public ykv d() {
        return this.k;
    }
}
