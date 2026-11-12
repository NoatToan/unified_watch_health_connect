package com.huawei.pluginhealthzone.cloud;

import defpackage.gqb;
import defpackage.pgp;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface CloudApi {
    void getCommonUsedDevices(String str, HttpDataCallback httpDataCallback);

    void getMyFollowRelations(Collection<Long> collection, HttpDataCallback httpDataCallback);

    void getPositionPushInfo(String str, int i, HttpDataCallback httpDataCallback);

    void getPushInformationByNotifyTime(long j, int i, HttpDataCallback httpDataCallback);

    void getVerifyCode(HttpDataCallback httpDataCallback);

    void notifyMemberToCheckHealth(String str, HttpDataCallback httpDataCallback);

    void setCommonUsedDevices(List<gqb> list, HttpDataCallback httpDataCallback);

    void setLocationPermission(String str, int i, HttpDataCallback httpDataCallback);

    void uploadPosition(String str, pgp pgpVar, int i, HttpDataCallback httpDataCallback);
}
