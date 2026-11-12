package com.huawei.hms.iapfull.pay;

import android.text.TextUtils;
import com.huawei.hms.iapfull.R;
import com.huawei.hms.iapfull.bean.PayResult;
import com.huawei.hms.iapfull.e1;
import com.huawei.hms.iapfull.network.model.DeveloperSignResponse;
import com.huawei.hms.iapfull.q0;
import com.huawei.hms.iapfull.y0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
class i implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f13741a;

    @Override // com.huawei.hms.iapfull.q0
    public void a(String str, String str2) {
        this.f13741a.a().a();
        y0.b("PayPresenter", "requestDeveloperSign failed, errorCode is: " + str + ", desc:" + str2);
        if ("2".equals(str)) {
            e1.a().a(this.f13741a.a(), R.string.hwpay_sign_fail);
        }
        if ("1".equals(str)) {
            e1.a().a(this.f13741a.a(), R.string.hwpay_returnCodeclient10003des);
        }
        if (!f.a(str)) {
            if ("client10008".equals(str)) {
                str = "30002";
            } else if ("600000".equals(str)) {
                str = "30004";
            } else if ("600010".equals(str)) {
                str = "30099";
            } else {
                str = "1".equals(str) ? "30001" : "-1";
            }
        }
        PayResult payResult = new PayResult();
        payResult.setReturnCode(str);
        payResult.setErrMsg(str2);
        ((PayActivity) this.f13741a.d).a(payResult);
        this.f13741a.a().finish();
    }

    @Override // com.huawei.hms.iapfull.q0
    public void a(DeveloperSignResponse developerSignResponse) {
        this.f13741a.a().a();
        y0.b("PayPresenter", "request developerSign success...");
        this.f13741a.e = developerSignResponse.getHuaweiSDKKey();
        if (!TextUtils.isEmpty(this.f13741a.e)) {
            ((PayActivity) this.f13741a.d).a(true);
        }
        String packageName = this.f13741a.f13743b.getPackageName();
        g gVar = g.a.f13739a;
        j jVar = this.f13741a;
        List<DeveloperSignResponse.MyPayType> payTypeList = developerSignResponse.getPayTypeList();
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        if (payTypeList == null) {
            y0.b("PayPresenter", "parsesPayTypeList, list is null");
            copyOnWriteArrayList = null;
        } else {
            for (int i = 0; i < payTypeList.size(); i++) {
                copyOnWriteArrayList.add(Integer.valueOf(payTypeList.get(i).getPayType()));
            }
        }
        gVar.a(copyOnWriteArrayList);
        g gVar2 = g.a.f13739a;
        gVar2.a(developerSignResponse.getDics(), packageName);
        ((PayActivity) this.f13741a.d).a(gVar2.a());
        if (this.f13741a.f()) {
            ((PayActivity) this.f13741a.d).a(R.string.hwpay_withhold_confirm_open);
        }
        j jVar2 = this.f13741a;
        com.huawei.hms.iapfull.b.a(this.f13741a.a(), "iap_payment_launch", jVar2.a(jVar2.f13743b));
    }

    i(j jVar) {
        this.f13741a = jVar;
    }
}
