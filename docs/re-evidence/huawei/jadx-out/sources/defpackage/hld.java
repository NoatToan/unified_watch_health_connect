package defpackage;

import com.huawei.trade.datatype.ProductSummary;
import com.huawei.trade.datatype.TradeViewInfo;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;

/* JADX INFO: loaded from: classes9.dex */
public class hld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36873c;
    private ProductSummary d;
    private int e;
    private ProductSummary f;
    private TradeViewInfo h;

    public int d() {
        return this.e;
    }

    public void c(int i) {
        this.e = i;
    }

    public boolean i() {
        return this.f36872b;
    }

    public void d(boolean z) {
        this.f36872b = z;
    }

    public boolean b() {
        return this.f36871a;
    }

    public void b(boolean z) {
        this.f36871a = z;
    }

    public boolean h() {
        if (this.d != null) {
            return true;
        }
        return this.f36873c;
    }

    public ProductSummary e() {
        return this.f;
    }

    public void c(ProductSummary productSummary) {
        this.f = productSummary;
    }

    public ProductSummary c() {
        return this.d;
    }

    public void a(ProductSummary productSummary) {
        this.d = productSummary;
    }

    public TradeViewInfo a() {
        return this.h;
    }

    public void e(TradeViewInfo tradeViewInfo) {
        this.h = tradeViewInfo;
    }

    public boolean g() {
        if (f()) {
            return true;
        }
        return !VersionControlUtil.isSupportOperationAccount();
    }

    public boolean f() {
        int i = this.e;
        if (i == 0) {
            return true;
        }
        return (this.f36872b && i == 2) || (i == 1 && this.f36871a);
    }

    public boolean n() {
        return this.e == 2 && !this.f36872b;
    }

    public boolean o() {
        return (this.e != 1 || h() || this.f36871a) ? false : true;
    }

    public boolean l() {
        return this.e == 1 && h() && !this.f36872b && !this.f36871a;
    }

    public boolean m() {
        return this.e == 1 && h() && this.f36872b && !this.f36871a;
    }

    public boolean j() {
        return this.e == 1 && h() && !this.f36871a;
    }
}
