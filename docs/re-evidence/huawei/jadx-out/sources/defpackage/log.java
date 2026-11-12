package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbtsdk.linklayer.DataReceivedCallback;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class log {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40551a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lnq f40552c = new lnq();
    private DataReceivedCallback d;
    private loh e;

    public log(int i, DataReceivedCallback dataReceivedCallback) {
        this.f40551a = i;
        this.d = dataReceivedCallback;
        this.e = new loh(BaseApplication.b(), this.f40551a);
    }

    public void e(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length;
        String strSpliceMTUPackage = this.e.spliceMTUPackage(length, bArr);
        if (strSpliceMTUPackage == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtLinkLayerParser", "dataContent is null.");
            return;
        }
        if (strSpliceMTUPackage.length() == 0) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtLinkLayerParser", "package and length less than MTU threshold.");
            return;
        }
        List<lnq> responsePacket = this.e.parseResponsePacket(length, cph.d(strSpliceMTUPackage));
        if (responsePacket == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtLinkLayerParser", "sliceResponseList obtain error");
        } else {
            a(responsePacket);
        }
    }

    private void a(List<lnq> list) {
        for (lnq lnqVar : list) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BtLinkLayerParser", "slice info : ", Boolean.valueOf(lnqVar.c()), ". success info : ", Boolean.valueOf(lnqVar.a()), ". receivedAll info : ", Boolean.valueOf(lnqVar.e()));
            if (!lnqVar.c() && lnqVar.a()) {
                e(lnqVar.b(), lnqVar.d());
            } else {
                if (this.f40552c.b() != 0) {
                    byte[] bArr = new byte[this.f40552c.d().length + lnqVar.d().length];
                    System.arraycopy(this.f40552c.d(), 0, bArr, 0, this.f40552c.d().length);
                    System.arraycopy(lnqVar.d(), 0, bArr, this.f40552c.d().length, lnqVar.d().length);
                    this.f40552c.b(bArr);
                } else {
                    this.f40552c.b(lnqVar.d());
                }
                this.f40552c.b(lnqVar.b() + this.f40552c.b());
                this.f40552c.b(lnqVar.a());
                this.f40552c.d(lnqVar.e());
                if (this.f40552c.e()) {
                    e(this.f40552c.b(), this.f40552c.d());
                    a();
                }
            }
        }
    }

    private void e(int i, byte[] bArr) {
        DataReceivedCallback dataReceivedCallback = this.d;
        if (dataReceivedCallback != null) {
            dataReceivedCallback.onDataReceived(i, bArr);
        }
    }

    private void a() {
        this.f40552c.d(false);
        this.f40552c.b(0);
        this.f40552c.b((byte[]) null);
        this.f40552c.a(false);
    }

    public ArrayList<byte[]> a(byte[] bArr) {
        return this.e.wrapCommandPackets(bArr.length, bArr);
    }
}
