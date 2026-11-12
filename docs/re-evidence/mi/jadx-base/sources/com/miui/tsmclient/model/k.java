package com.miui.tsmclient.model;

import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;
import com.miui.tsmclient.entity.PayableCardInfo;
import com.miui.tsmclient.pay.OrderInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface k<T extends PayableCardInfo> extends j<T> {
    BaseResponse a(Context context, T t, OrderInfo orderInfo, Tag tag, Bundle bundle);
}
