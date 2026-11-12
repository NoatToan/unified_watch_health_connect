package com.huawei.hms.iapfull.pay;

import android.view.View;
import android.widget.AdapterView;
import com.huawei.hms.iapfull.network.model.MyPayType;
import com.huawei.hms.iapfull.y0;

/* JADX INFO: loaded from: classes10.dex */
class c implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ PayActivity f13733a;

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        if (this.f13733a.l == null || this.f13733a.f13725c == null) {
            str = "onItemClick, list or adapter is null";
        } else {
            if (this.f13733a.l.size() <= i) {
                return;
            }
            if (1 == ((MyPayType) this.f13733a.l.get(i)).getMode()) {
                this.f13733a.f13725c.a(i);
                this.f13733a.k = i;
                this.f13733a.f13725c.notifyDataSetChanged();
                return;
            }
            str = "onItemClick, payType not support";
        }
        y0.b("PayActivity", str);
    }

    c(PayActivity payActivity) {
        this.f13733a = payActivity;
    }
}
