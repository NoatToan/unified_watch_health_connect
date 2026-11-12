package com.huawei.health.pluginhealthzone;

import android.content.Context;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import defpackage.ffz;
import defpackage.gqb;
import defpackage.gqc;
import defpackage.gqd;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface FamilyHealthZoneApi {
    Class<? extends JsModuleBase> getCommonJsModule(String str);

    void getCommonUsedDevices(IBaseResponseCallback iBaseResponseCallback);

    void getOtherUserInfo(String str, UserInfoCallback<gqc> userInfoCallback);

    void getUserGrpList(IBaseResponseCallback iBaseResponseCallback);

    void getUserGrpNotifyList(IBaseResponseCallback iBaseResponseCallback, int i);

    void gotoFamilyHealth(Context context, String str);

    void notifyMemberCheckHealth(String str, IBaseResponseCallback iBaseResponseCallback);

    void requestFindUserInfo(int i, String str, UserInfoCallback<gqd.c> userInfoCallback);

    void setCommonUsedDevices(List<gqb> list, IBaseResponseCallback iBaseResponseCallback);

    void startFamilySpaceH5(Context context, ffz ffzVar);
}
