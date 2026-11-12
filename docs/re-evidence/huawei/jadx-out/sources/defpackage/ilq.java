package defpackage;

import com.huawei.health.tradeservice.pay.ReservedInfor;

/* JADX INFO: loaded from: classes32.dex */
public class ilq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37786c;
    private String d;
    private ReservedInfor e;

    public ReservedInfor b() {
        return this.e;
    }

    public void a(ReservedInfor reservedInfor) {
        this.e = reservedInfor;
    }

    public void d(String str) {
        this.d = str;
    }

    public String e() {
        return this.d;
    }

    public void c(int i) {
        this.f37785b = i;
    }

    public int d() {
        return this.f37785b;
    }

    public void c(String str) {
        this.f37786c = str;
    }

    public String c() {
        return this.f37786c;
    }

    public String toString() {
        return "ProductId = " + this.d + " PriceType = " + this.f37785b + " AppPayLoad = " + this.f37786c + " ReservedInfor = " + this.e;
    }
}
