package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes19.dex */
public class uyq implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("email")
    private String f50744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("content")
    private String f50745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("customerType")
    private String f50746c;

    @SerializedName("customerName")
    private String d;

    @SerializedName(HwPayConstant.KEY_AMOUNT)
    private Double e;

    @SerializedName("taxNo")
    private String f;

    @SerializedName("orderCode")
    private String g;

    @SerializedName("invoiceType")
    private String i;

    @SerializedName("locale")
    private String j;

    public void c(String str) {
        this.i = str;
    }

    public void d(String str) {
        this.f50745b = str;
    }

    public void a(String str) {
        this.f50746c = str;
    }

    public void b(String str) {
        this.d = str;
    }

    public void i(String str) {
        this.f = str;
    }

    public void e(String str) {
        this.f50744a = str;
    }

    public void h(String str) {
        this.g = str;
    }

    public void e(Double d) {
        this.e = d;
    }

    public void j(String str) {
        this.j = str;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("tradeService") + "/tradeservice/v1/invoice-request";
    }
}
