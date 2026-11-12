package com.huawei.hwdevice.phoneprocess.mgr.exercise.utils;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.mvg;
import defpackage.mvj;
import defpackage.njo;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SequenceFileDataUtils {
    private static final int EVENT_LENGTH = 32;
    private static final String TAG = "SequenceFileDataUtils";

    private SequenceFileDataUtils() {
    }

    public static String getSequenceFileDataString(mvg mvgVar) {
        StringBuilder sb = new StringBuilder();
        if (mvgVar == null) {
            LogUtil.j(TAG, "sampleSequenceFileData is null");
            return sb.toString();
        }
        List<mvj> listB = mvgVar.b();
        if (njy.e(listB)) {
            LogUtil.j(TAG, "sampleSequenceDataList is null or empty");
            return sb.toString();
        }
        mvj mvjVar = listB.get(0);
        if (mvjVar == null) {
            LogUtil.j(TAG, "sampleSequenceData is null");
            return sb.toString();
        }
        String strD = mvjVar.d();
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j(TAG, "detailTotalData is null");
            return sb.toString();
        }
        while (strD.length() >= 32) {
            sb.append(new njo(strD.substring(0, 32)).toString());
            strD = strD.substring(32);
        }
        return sb.toString();
    }
}
