package com.miui.tsmclient.model;

import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;
import com.miui.tsmclient.entity.PayableCardInfo;
import com.miui.tsmclient.pay.OrderInfo;
import com.miui.tsmclient.util.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class a extends l {
    public static final int c = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10345b;

    public a(com.miui.tsmclient.model.mitsm.f fVar) {
        super(fVar);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final com.miui.tsmclient.model.BaseResponse a(android.content.Context r27, com.miui.tsmclient.entity.CardInfo r28, com.miui.tsmclient.model.mitsm.j r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instruction units count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.tsmclient.model.a.a(android.content.Context, com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.model.mitsm.j, android.os.Bundle):com.miui.tsmclient.model.BaseResponse");
    }

    @Override // com.miui.tsmclient.model.l
    public BaseResponse a(Context context, PayableCardInfo payableCardInfo, OrderInfo orderInfo, Tag tag, Bundle bundle) {
        BaseResponse baseResponseA;
        if (bundle == null) {
            bundle = new Bundle();
        }
        com.miui.tsmclient.model.mitsm.j jVar = bundle.getBoolean(Constants.EXTRA_OUT_OPERATION) ? com.miui.tsmclient.model.mitsm.j.OUT_RECHARGE : com.miui.tsmclient.model.mitsm.j.RECHARGE;
        bundle.putBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH, true);
        int i = this.f10345b;
        if (i == 0) {
            baseResponseA = super.a(context, payableCardInfo, orderInfo, tag, bundle);
        } else {
            if (i == 10) {
                this.f10345b = 0;
            }
            baseResponseA = null;
        }
        if (baseResponseA == null || baseResponseA.mResultCode == 0) {
            return a(context, payableCardInfo, jVar, bundle);
        }
        com.miui.tsmclient.model.mitsm.k.a().b(payableCardInfo, jVar.b());
        return baseResponseA;
    }
}
