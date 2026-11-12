package com.huawei.operation.utils;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealthkit.context.H5ProAppInfo;
import com.huawei.hihealthservice.hihealthkit.util.AppStatusHelper;
import com.huawei.hwonesdk.datastructure.request.DataType;
import com.huawei.operation.h5pro.H5MiniProgramSecurityHelper;
import defpackage.krn;
import defpackage.lcn;
import defpackage.nqk;
import defpackage.nqo;
import defpackage.nqt;
import defpackage.nqv;
import defpackage.nqw;
import defpackage.nqy;
import defpackage.nrb;
import defpackage.nrk;
import defpackage.peh;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes41.dex */
public class CheckAuthPermissionUtils {
    private static final String TAG = "CheckAuthPermissionUtils";

    public enum SupportMethod {
        READ_DATA,
        AGGREGATE_DATA,
        READ_DATA_SOURCE,
        DELETE_DATA,
        SUBSCRIBE_DATA,
        UNSUBSCRIBE_DATA
    }

    public static int checkAuthPermission(String str, int i, Context context, SupportMethod supportMethod, krn krnVar) {
        int iE = -1;
        try {
            H5ProAppInfo outOfBandData = krnVar.getOutOfBandData();
            if (outOfBandData != null && outOfBandData.getPkgName() != null) {
                if (H5MiniProgramSecurityHelper.isTrustedMiniProgram(outOfBandData.getPkgName())) {
                    ReleaseLogUtil.d(TAG, "default allowed h5 app");
                    return 0;
                }
                List<Integer> typeList = getTypeList(str, supportMethod);
                if (CollectionUtils.a(typeList)) {
                    LogUtil.a(TAG, "typeList is empty ");
                    return -1;
                }
                for (Integer num : typeList) {
                    iE = lcn.e(context, outOfBandData, new AppStatusHelper(context), num.intValue(), i);
                    if (iE != 0) {
                        LogUtil.a(TAG, "type no authority = ", num);
                        break;
                    }
                }
                return iE;
            }
            ReleaseLogUtil.a(TAG, "outOfBandData is null");
            return -1;
        } catch (RemoteException unused) {
            LogUtil.c(TAG, "checkAuthPermission fail");
            return -1;
        }
    }

    private static List<Integer> getTypeList(String str, SupportMethod supportMethod) {
        final ArrayList arrayList = new ArrayList();
        int iOrdinal = supportMethod.ordinal();
        if (iOrdinal == 0) {
            arrayList.addAll(dealReadDataType(str));
            return arrayList;
        }
        if (iOrdinal == 1) {
            ArrayList arrayList2 = new ArrayList();
            if (str.startsWith("[") && str.endsWith("]")) {
                arrayList2.addAll(peh.c(str, nqo[].class));
            } else {
                arrayList2.add((nqo) peh.b(str, nqo.class));
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((nqo) it.next()).d().getmId()));
            }
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    arrayList.addAll(dealDeleteDataRequest(str));
                    return arrayList;
                }
                if (iOrdinal == 4 || iOrdinal == 5) {
                    arrayList.addAll((Collection) peh.c(str, DataType[].class).stream().map(new CheckAuthPermissionUtils$$ExternalSyntheticLambda1()).collect(Collectors.toList()));
                    return arrayList;
                }
                LogUtil.a(TAG, "not  support method");
                return arrayList;
            }
            nqv nqvVar = (nqv) peh.b(str, nqv.class);
            if (nqvVar != null && nqvVar.a() != null && nqvVar.a().e() != null) {
                nqvVar.a().e().forEach(new Consumer() { // from class: com.huawei.operation.utils.CheckAuthPermissionUtils$$ExternalSyntheticLambda0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        arrayList.add(Integer.valueOf(((DataType) obj).getmId()));
                    }
                });
                return arrayList;
            }
        }
        return arrayList;
    }

    private static List<Integer> dealDeleteDataRequest(String str) {
        if (str.contains("fields")) {
            return (List) peh.c(str, nrk[].class).stream().map(new Function() { // from class: com.huawei.operation.utils.CheckAuthPermissionUtils$$ExternalSyntheticLambda2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((nrk) obj).a().getmId());
                }
            }).collect(Collectors.toList());
        }
        List listC = peh.c(str, nqw[].class);
        ArrayList arrayList = new ArrayList();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.addAll((Collection) ((nqw) it.next()).h().stream().map(new CheckAuthPermissionUtils$$ExternalSyntheticLambda1()).collect(Collectors.toList()));
        }
        return arrayList;
    }

    private static List<Integer> dealReadDataType(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.contains(nqk.f)) {
            nqt nqtVar = (nqt) peh.b(str, nqt.class);
            LogUtil.a(TAG, "Request is ", nqtVar);
            if (nqtVar == null) {
                ReleaseLogUtil.a(TAG, "samplePointReadRequest is null");
                return arrayList;
            }
            arrayList.addAll((Collection) nqtVar.k().stream().map(new CheckAuthPermissionUtils$$ExternalSyntheticLambda1()).collect(Collectors.toList()));
            return arrayList;
        }
        if (str.contains(nqk.j)) {
            nqy nqyVar = (nqy) peh.b(str, nqy.class);
            LogUtil.a(TAG, "Request is ", nqyVar);
            if (nqyVar == null) {
                ReleaseLogUtil.a(TAG, "sampleStatReadRequest is null");
                return arrayList;
            }
            arrayList.add(Integer.valueOf(nqyVar.l().getmId()));
            return arrayList;
        }
        if (str.contains(nqk.i)) {
            nrb nrbVar = (nrb) peh.b(str, nrb.class);
            LogUtil.a(TAG, "Request is ", nrbVar);
            if (nrbVar == null) {
                ReleaseLogUtil.a(TAG, "sampleStatReadRequest is null");
                return arrayList;
            }
            arrayList.add(Integer.valueOf(nrbVar.l().getmId()));
        }
        return arrayList;
    }
}
