package com.huawei.health.routeradapter;

import android.content.Context;
import android.net.Uri;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.R;
import defpackage.irz;
import defpackage.isa;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class ColumnPretreatmentService implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        Uri uriO = guidepost.o();
        if (uriO != null && b(context, uriO)) {
            return false;
        }
        b(context, uriO, guidepost);
        return false;
    }

    private boolean d(Context context, Uri uri) {
        if (context == null) {
            return false;
        }
        try {
            AppRouter.c("/OperationBundle/FunctionMenuActivity").a("contentType", Integer.parseInt(uri.getQueryParameter("contentType"))).b(context);
            return true;
        } catch (NumberFormatException unused) {
            LogUtil.e("Opera_ColumnPretreatmentService", "goToDetail() Exception.");
            return false;
        }
    }

    private boolean a(Context context) {
        if (context == null) {
            return false;
        }
        AppRouter.c("/OperationBundle/SocialAssessmentActivity").b(context);
        return true;
    }

    private boolean c(Context context) {
        if (context == null) {
            return false;
        }
        if (isa.d()) {
            irz.d(context, "");
            return true;
        }
        AppRouter.c("/home/discover").b(BaseApplication.b());
        return true;
    }

    private boolean e(Context context, Uri uri) {
        if (context == null) {
            return false;
        }
        AppRouter.c("/OperationBundle/MemberTypeSelectActivity").a(R.anim.fade_in, R.anim.fade_out).c("memberTypeSelectUri", uri.toString()).b(context);
        return true;
    }

    private void b(Context context, Uri uri, Guidepost guidepost) {
        AppRouter.c("/home/main").b(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    private boolean b(Context context, Uri uri) {
        byte b2;
        String queryParameter = uri.getQueryParameter("module");
        if (queryParameter == null) {
            return false;
        }
        queryParameter.hashCode();
        switch (queryParameter) {
            case "vipMember":
                b2 = 0;
                break;
            case "functionMenu":
                b2 = 1;
                break;
            case "evaluation":
                b2 = 2;
                break;
            case "vipTypeSelect":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return c(context);
        }
        if (b2 == 1) {
            return d(context, uri);
        }
        if (b2 == 2) {
            return a(context);
        }
        if (b2 != 3) {
            return false;
        }
        return e(context, uri);
    }
}
