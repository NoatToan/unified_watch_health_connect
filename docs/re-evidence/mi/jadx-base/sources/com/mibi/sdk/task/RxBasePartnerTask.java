package com.mibi.sdk.task;

import android.content.Context;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.MemoryStorage;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.DeviceManager;

/* JADX INFO: loaded from: classes5.dex */
public abstract class RxBasePartnerTask<R> extends RxBasePaymentTask<R> {
    public RxBasePartnerTask(Context context, Session session, Class cls) {
        super(context, session, cls);
    }

    public void addPartnerParams(Connection connection, String str) {
        MemoryStorage memoryStorage = getSession().getMemoryStorage();
        String string = memoryStorage.getString(str, CommonConstants.KEY_PARTNER_USER_ID);
        String string2 = memoryStorage.getString(str, "accountType");
        long j = memoryStorage.getLong(str, "marketType");
        SortedParameter parameter = connection.getParameter();
        parameter.add("marketType", Long.valueOf(j));
        parameter.add(CommonConstants.KEY_PARTNER_USER_ID, string);
        parameter.add("accountType", string2);
        parameter.add(CommonConstants.KEY_SESSION, getSession().getUuid());
        parameter.add("deviceId", DeviceManager.getDeviceId(getSession()));
    }

    public String getPartnerUserId(String str) {
        return getSession().getMemoryStorage().getString(str, CommonConstants.KEY_PARTNER_USER_ID);
    }
}
