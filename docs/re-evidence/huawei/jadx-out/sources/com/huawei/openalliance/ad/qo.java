package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.EventType;

/* JADX INFO: loaded from: classes12.dex */
public abstract class qo {
    public static qp a(Context context, tf tfVar, String str) {
        return a(context, tfVar, a(str));
    }

    public static qp a(Context context, tf tfVar, EventType eventType) {
        return a(context, tfVar, eventType.getCategory());
    }

    public static qp a(Context context, tf tfVar, int i) {
        if (i == 1) {
            return new qq(context, tfVar);
        }
        if (i != 2) {
            return i != 4 ? new qr(context, tfVar) : new ql(context, tfVar);
        }
        return new qn(context, tfVar);
    }

    private static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 3;
        }
        for (EventType eventType : EventType.values()) {
            if (TextUtils.equals(eventType.value(), str)) {
                return eventType.getCategory();
            }
        }
        return 3;
    }
}
