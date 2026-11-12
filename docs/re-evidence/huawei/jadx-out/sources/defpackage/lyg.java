package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lyg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41115c;
    private int d;

    public void b(int i) {
        this.d = i;
    }

    public void c(int i) {
        this.f41113a = i;
    }

    public void a(int i) {
        this.f41114b = i;
    }

    public void d(int i) {
        this.f41115c = i;
    }

    public int e() {
        return this.d;
    }

    public int a() {
        return this.f41113a;
    }

    public int c() {
        return this.f41114b;
    }

    public int d() {
        return this.f41115c;
    }

    public static List<lyg> e(int i) {
        lyg lygVar = new lyg();
        lygVar.b(1);
        lygVar.c(3);
        lygVar.a(500);
        lygVar.d(2);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(lygVar);
        lyg lygVar2 = new lyg();
        lygVar2.b(3);
        lygVar2.c(3);
        lygVar2.a(100);
        lygVar2.d(2);
        arrayList.add(lygVar2);
        lyg lygVar3 = new lyg();
        lygVar3.b(4);
        lygVar3.c(3);
        if (i != 1 && i == 6) {
            lygVar3.a(21600);
        } else {
            lygVar3.a(3600);
        }
        lygVar3.d(2);
        arrayList.add(lygVar3);
        lyg lygVar4 = new lyg();
        lygVar4.b(5);
        lygVar4.c(3);
        lygVar4.a(250);
        lygVar4.d(2);
        arrayList.add(lygVar4);
        return arrayList;
    }

    public String toString() {
        return "DeviceReportThroshold{dataType=" + this.d + ", valueType=" + this.f41113a + ", value=" + this.f41114b + ", action=" + this.f41115c + '}';
    }
}
