package com.miui.tsmclient.model;

import android.content.Context;
import android.nfc.Tag;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.PayableCardInfo;
import com.miui.tsmclient.pay.OrderInfo;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclientsdk.MiTsmCallback;

/* JADX INFO: loaded from: classes6.dex */
public class m extends f {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PayableCardInfo f10372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f10373b;
        public final /* synthetic */ OrderInfo c;
        public final /* synthetic */ Tag d;
        public final /* synthetic */ MiTsmCallback e;

        public a(PayableCardInfo payableCardInfo, Context context, OrderInfo orderInfo, Tag tag, MiTsmCallback miTsmCallback) {
            this.f10372a = payableCardInfo;
            this.f10373b = context;
            this.c = orderInfo;
            this.d = tag;
            this.e = miTsmCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.a().a(((k) e.a().a(m.this.f10356b, this.f10372a.mCardType)).a(this.f10373b, this.f10372a, this.c, this.d, null), this.e);
        }
    }

    public m(Context context) {
        super(context);
    }

    public BaseResponse a(Context context, CardInfo cardInfo) {
        BaseResponse baseResponseA;
        if (!(cardInfo instanceof PayableCardInfo)) {
            return new BaseResponse(1, new Object[0]);
        }
        PayableCardInfo payableCardInfo = (PayableCardInfo) cardInfo;
        OrderInfo rechargeOrder = payableCardInfo.getRechargeOrder();
        if (rechargeOrder == null) {
            return new BaseResponse(0, new Object[0]);
        }
        j jVarA = g.a(cardInfo.mCardType);
        return (!(jVarA instanceof k) || (baseResponseA = ((k) jVarA).a(context, payableCardInfo, rechargeOrder, null, null)) == null) ? new BaseResponse(-2, new Object[0]) : baseResponseA;
    }

    public void a(Context context, PayableCardInfo payableCardInfo, OrderInfo orderInfo, Tag tag, MiTsmCallback miTsmCallback) {
        if (payableCardInfo != null && orderInfo != null) {
            e.a().a(new a(payableCardInfo, context, orderInfo, tag, miTsmCallback));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f.class.getSimpleName());
        sb.append("recharge() param is invalid! info == null:");
        sb.append(payableCardInfo == null);
        LogUtils.d(sb.toString());
        if (miTsmCallback != null) {
            miTsmCallback.onFail(1, "", new Object[0]);
        }
    }
}
