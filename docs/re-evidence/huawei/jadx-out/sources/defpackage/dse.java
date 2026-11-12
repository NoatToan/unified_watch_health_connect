package defpackage;

import com.braintreepayments.api.PayPalPaymentIntent;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class dse implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("isFinish")
    private boolean f32304a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("isViewed")
    private boolean f32305b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(MatterDataContans.KEY_MAC_ADDRESS)
    private String f32306c;

    @SerializedName(PayPalPaymentIntent.ORDER)
    private int d;

    @SerializedName("marketingBacklog")
    private dsg e;

    @SerializedName(RemoteMessageConst.Notification.TAG)
    private String g;

    @Expose(serialize = false)
    private String i;

    public dse(String str, String str2) {
        this.g = str;
        this.i = str2;
    }

    public boolean a() {
        return this.f32304a;
    }

    public boolean b() {
        return this.f32305b;
    }

    public void c(boolean z) {
        this.f32305b = z;
    }

    public void b(String str) {
        this.f32306c = str;
    }

    public int e() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    public dsg c() {
        return this.e;
    }

    public void a(dsg dsgVar) {
        this.e = dsgVar;
    }

    public String d() {
        return this.i;
    }
}
