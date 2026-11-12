package com.huawei.hwdevice.phoneprocess.binder;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IHeartStudyAIDL;
import defpackage.cpv;
import defpackage.eeq;
import defpackage.lnb;

/* JADX INFO: loaded from: classes2.dex */
public class HeartStudyBinder extends IHeartStudyAIDL.Stub {
    @Override // com.huawei.hwservicesmgr.IHeartStudyAIDL
    public String getBtDeviceBondId(String str) {
        LogUtil.a("HeartHealthBinder", "enter getBtDeviceBondId");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HeartHealthBinder", "getBtDeviceBondId mac is null");
            return "";
        }
        String strA = lnb.e(BaseApplication.getContext()).a(str, BaseApplication.getContext());
        if (!TextUtils.isEmpty(strA)) {
            return eeq.d(strA);
        }
        String strD = cpv.d(str);
        if (!TextUtils.isEmpty(strD)) {
            return eeq.d(strD);
        }
        LogUtil.a("HeartHealthBinder", "getBtDeviceBondId bindValue is null.");
        return "";
    }
}
