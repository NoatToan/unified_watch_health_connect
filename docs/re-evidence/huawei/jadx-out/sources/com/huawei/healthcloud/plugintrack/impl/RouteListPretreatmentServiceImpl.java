package com.huawei.healthcloud.plugintrack.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteConstants;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.iov;
import health.compact.a.CommonUtils;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class RouteListPretreatmentServiceImpl implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        int i;
        byte b2;
        Uri uriO = guidepost.o();
        if (uriO != null) {
            String queryParameter = uriO.getQueryParameter(BleConstants.SPORT_TYPE);
            if (TextUtils.isEmpty(queryParameter)) {
                i = 258;
            } else {
                i = Integer.parseInt(queryParameter);
            }
        } else {
            i = 258;
        }
        String strL = guidepost.l();
        ReleaseLogUtil.b("Track_RouteListPretreatmentServiceImpl", "onPretreatment path is ", strL);
        strL.hashCode();
        switch (strL) {
            case "/router/runningRouteList":
                b2 = 0;
                break;
            case "/router/runningRouteHistory":
                b2 = 1;
                break;
            case "/router/runningRouteDetail":
                b2 = 2;
                break;
            case "/router/myRouteList":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            RunningRouteUtils.b(context, i, (HotPathCityInfo) null);
        } else if (b2 == 1) {
            RunningRouteUtils.e(context, "punch");
        } else if (b2 == 2) {
            b(context, uriO);
        } else if (b2 == 3) {
            RunningRouteUtils.e(context, "save");
        }
        return false;
    }

    private void b(Context context, Uri uri) {
        if (uri == null || context == null) {
            ReleaseLogUtil.b("Track_RouteListPretreatmentServiceImpl", "jumpToDetail uri or context is null");
            return;
        }
        LogUtil.a("Track_RouteListPretreatmentServiceImpl", "jumpToDetail uri: ", uri);
        int iJ = CommonUtils.j(uri.getQueryParameter("pathClass"));
        String queryParameter = uri.getQueryParameter("pathId");
        LogUtil.a("Track_RouteListPretreatmentServiceImpl", "jumpToDetail pathId: ", queryParameter);
        if (iJ == 1) {
            Intent intent = new Intent(context, (Class<?>) ClockingRankActivity.class);
            intent.putExtra("PATH_ID", queryParameter);
            intent.putExtra("pathClass", iJ);
            iov.d(context, intent);
            return;
        }
        RunningRouteUtils.e(context, queryParameter, RunningRouteConstants.BiFromActivity.FROM_DEEPLINK.getIndex());
    }
}
