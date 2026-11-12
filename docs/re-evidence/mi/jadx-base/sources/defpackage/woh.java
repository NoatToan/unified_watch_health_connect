package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.miui.tsmclient.sesdk.OrderData;
import com.xiaomi.fitness.nfc.issuer.IssuerResult;
import com.xiaomi.fitness.nfc.ui.CardOrderDetailFragment;
import com.xiaomi.fitness.nfc.ui.RechargeActivity;

/* JADX INFO: loaded from: classes9.dex */
public class woh extends dld {
    @Override // defpackage.itc
    public boolean a(boolean z) {
        if (!z && (this.f15657b.hasTransferInOrder() || this.f15657b.hasIssueNoComplete())) {
            return true;
        }
        OrderData.Order orderHasIssueOrder = this.f15657b.hasIssueOrder();
        if (orderHasIssueOrder == null) {
            orderHasIssueOrder = this.f15657b.getTransferInOrder();
        }
        return orderHasIssueOrder != null;
    }

    @Override // defpackage.itc
    public void b(Intent intent) {
        this.f15657b = zl3.g().i();
    }

    @Override // defpackage.dld
    public void i() {
        ltg.c().t((this.f15657b.isCloudTransit() || this.f15657b.getTransferInOrder() != null) ? 3 : 1, 0, this.f15657b);
        super.i();
    }

    @Override // defpackage.dld
    public void n(boolean z, int i, String str, IssuerResult issuerResult) {
        super.n(z, i, str, issuerResult);
        if (z) {
            this.f15656a.getHandler().sendEmptyMessage(4);
            return;
        }
        ltg.c().s(1, 2);
        if (this.f15657b.isCloudTransit() || this.f15657b.getTransferInOrder() != null) {
            String strB = fmg.b(i);
            Integer numValueOf = Integer.valueOf(i);
            if (!TextUtils.isEmpty(strB)) {
                str = strB;
            }
            this.f15656a.getHandler().obtainMessage(7, new Pair(numValueOf, str)).sendToTarget();
            return;
        }
        zl3.g().l(this.f15657b);
        Bundle bundle = new Bundle();
        bundle.putString(CardOrderDetailFragment.sOrderId, this.f15657b.mOrderInfo.getOrderId());
        bundle.putBoolean(CardOrderDetailFragment.sIsFromIssue, true);
        if (!TextUtils.isEmpty(str)) {
            if (str.contains("Not enough memory space")) {
                str = this.f15656a.getString(o0j.h5);
            }
            bundle.putString(CardOrderDetailFragment.ERROR_MSG_KEY, str);
        }
        this.f15656a.gotoPageForResult(CardOrderDetailFragment.class, bundle, 100);
        this.f15656a.setCancelResult();
    }

    @Override // defpackage.dld
    public void o() {
        super.o();
        Intent intent = new Intent(this.f15656a.getActivity(), (Class<?>) RechargeActivity.class);
        zl3.g().l(this.f15657b);
        Bundle arguments = this.f15656a.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        intent.putExtras(arguments);
        this.f15656a.startActivityForResult(intent, 1);
    }

    @Override // defpackage.dld
    public void p() {
        super.p();
    }
}
