package com.huawei.health.routeradapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.operation.utils.Constants;
import com.huawei.phoneservice.feedback.ui.ProblemSuggestActivity;
import defpackage.iov;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class FaPretreatmentService implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.c("FaPretreatmentService", "uri == null");
            return false;
        }
        LogUtil.c("FaPretreatmentService", uriO.toString());
        if (TextUtils.isEmpty(uriO.getQuery())) {
            return false;
        }
        e(context, uriO.getQueryParameter("target"));
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    private void e(Context context, String str) {
        byte b2;
        switch (str) {
            case "startWalk":
                b2 = 4;
                break;
            case "device":
                b2 = 3;
                break;
            case "myData":
                b2 = 0;
                break;
            case "myTarget":
                b2 = 5;
                break;
            case "userInfo":
                b2 = 1;
                break;
            case "":
                b2 = 6;
                break;
            case "problemSuggest":
                b2 = 2;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            c(context);
            return;
        }
        if (b2 == 1) {
            g(context);
            return;
        }
        if (b2 == 2) {
            b(context);
            return;
        }
        if (b2 == 3) {
            e(context);
        } else if (b2 == 4) {
            d(context);
        } else {
            if (b2 != 5) {
                return;
            }
            a(context);
        }
    }

    private void c(Context context) {
        AppRouter.c("/Main/HealthDatasActivity").e(67108864).b(context);
    }

    private void g(Context context) {
        AppRouter.c("/HWUserProfileMgr/UserInfoActivity").e(67108864).b(context);
    }

    private void b(Context context) {
        Intent intent = new Intent(context, (Class<?>) ProblemSuggestActivity.class);
        intent.setFlags(67108864);
        iov.d(context, intent);
    }

    private void e(Context context) {
        AppRouter.c("/home/device").c(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE).e(67108864).b(context);
    }

    private void d(Context context) {
        AppRouter.c("/PluginMotionTrack/TrackMainMapActivity").e(67108864).b(context);
    }

    private void a(Context context) {
        AppRouter.c("/HWUserProfileMgr/MyTargetActivity").e(67108864).b(context);
    }
}
