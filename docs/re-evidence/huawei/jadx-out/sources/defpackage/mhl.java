package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mhl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41682a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41683c;
    private int d;
    private int e;

    public void c(int i) {
        this.d = i;
    }

    public void b(int i) {
        this.f41682a = i;
    }

    public void e(int i) {
        this.e = i;
    }

    public void a(int i) {
        this.f41683c = i;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.f41682a;
    }

    public int e() {
        return this.e;
    }

    public int a() {
        return this.f41683c;
    }

    public static List<mhl> d(int i) {
        mhl mhlVar = new mhl();
        mhlVar.c(1);
        mhlVar.b(3);
        mhlVar.e(500);
        mhlVar.a(2);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(mhlVar);
        mhl mhlVar2 = new mhl();
        mhlVar2.c(3);
        mhlVar2.b(3);
        mhlVar2.e(100);
        mhlVar2.a(2);
        arrayList.add(mhlVar2);
        mhl mhlVar3 = new mhl();
        mhlVar3.c(4);
        mhlVar3.b(3);
        if (i != 1 && i == 6) {
            mhlVar3.e(21600);
        } else {
            mhlVar3.e(3600);
        }
        mhlVar3.a(2);
        arrayList.add(mhlVar3);
        mhl mhlVar4 = new mhl();
        mhlVar4.c(5);
        mhlVar4.b(3);
        mhlVar4.e(250);
        mhlVar4.a(2);
        arrayList.add(mhlVar4);
        return arrayList;
    }

    public String toString() {
        return "DeviceReportThroshold{dataType=" + this.d + ", valueType=" + this.f41682a + ", value=" + this.e + ", action=" + this.f41683c + '}';
    }
}
