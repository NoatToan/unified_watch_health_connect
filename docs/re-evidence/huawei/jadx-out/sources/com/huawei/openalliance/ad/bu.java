package com.huawei.openalliance.ad;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import com.huawei.hms.ads.dynamic.IObjectWrapper;
import com.huawei.hms.ads.dynamic.ObjectWrapper;
import com.huawei.hms.ads.template.downloadbuttonstyle.RemoteButtonStyleAttr;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.views.AppDownloadButton;

/* JADX INFO: loaded from: classes12.dex */
public class bu {
    public static com.huawei.hms.ads.template.downloadbuttonstyle.a b(Context context, AppDownloadButton appDownloadButton, int i, RemoteButtonStyleAttr remoteButtonStyleAttr) {
        com.huawei.hms.ads.template.downloadbuttonstyle.a dVar;
        hw.a("UiEngineProxyUtils", "btnStyle: %s", Integer.valueOf(i));
        if (i == 1) {
            dVar = new com.huawei.hms.ads.template.downloadbuttonstyle.d(context, appDownloadButton);
        } else if (i != 2) {
            dVar = (i == 3 || i == 4) ? new com.huawei.hms.ads.template.downloadbuttonstyle.e(context, appDownloadButton, remoteButtonStyleAttr) : new com.huawei.hms.ads.template.downloadbuttonstyle.b(context, appDownloadButton);
        } else {
            dVar = new com.huawei.hms.ads.template.downloadbuttonstyle.c(context, appDownloadButton);
        }
        dVar.a(context);
        return dVar;
    }

    public static com.huawei.hms.ads.template.downloadbuttonstyle.a a(Context context, AppDownloadButton appDownloadButton, int i, RemoteButtonStyleAttr remoteButtonStyleAttr) {
        hw.a("UiEngineProxyUtils", "updateBtnStyle: %s", Integer.valueOf(i));
        com.huawei.hms.ads.template.downloadbuttonstyle.a bVar = i != 4 ? new com.huawei.hms.ads.template.downloadbuttonstyle.b(context, appDownloadButton) : new com.huawei.hms.ads.template.downloadbuttonstyle.e(context, appDownloadButton, remoteButtonStyleAttr);
        bVar.a();
        return bVar;
    }

    public static RemoteButtonStyleAttr a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            gr grVar = new gr(bundle);
            RemoteButtonStyleAttr remoteButtonStyleAttr = (RemoteButtonStyleAttr) com.huawei.openalliance.ad.utils.bk.b(grVar.d(ParamConstants.BtnParams.BUTTON_STYLE_JSON), RemoteButtonStyleAttr.class, new Class[0]);
            if (remoteButtonStyleAttr != null) {
                IBinder iBinderE = grVar.e(ParamConstants.BtnParams.NORMAL_BG_DRAWABLE);
                if (iBinderE != null) {
                    remoteButtonStyleAttr.a((Drawable) ObjectWrapper.unwrap((IObjectWrapper) iBinderE));
                }
                IBinder iBinderE2 = grVar.e(ParamConstants.BtnParams.PROCESS_BG_DRAWABLE);
                if (iBinderE2 != null) {
                    remoteButtonStyleAttr.b((Drawable) ObjectWrapper.unwrap((IObjectWrapper) iBinderE2));
                }
                IBinder iBinderE3 = grVar.e(ParamConstants.BtnParams.INSTALL_BG_DRAWABLE);
                if (iBinderE3 != null) {
                    remoteButtonStyleAttr.c((Drawable) ObjectWrapper.unwrap((IObjectWrapper) iBinderE3));
                }
                IBinder binder = bundle.getBinder(ParamConstants.BtnParams.CANCEL_BG_DRAWABLE);
                if (binder != null) {
                    remoteButtonStyleAttr.f((Drawable) ObjectWrapper.unwrap((IObjectWrapper) binder));
                }
                IBinder iBinderE4 = grVar.e(ParamConstants.BtnParams.DOWN_CANCEL_BTN);
                if (iBinderE4 != null) {
                    remoteButtonStyleAttr.d((Drawable) ObjectWrapper.unwrap((IObjectWrapper) iBinderE4));
                }
                IBinder iBinderE5 = grVar.e(ParamConstants.BtnParams.NORMAL_BG_DRAWABLE_DARK);
                if (iBinderE5 != null) {
                    remoteButtonStyleAttr.e((Drawable) ObjectWrapper.unwrap((IObjectWrapper) iBinderE5));
                }
                IBinder iBinderE6 = grVar.e(ParamConstants.BtnParams.PROCESS_BG_DRAWABLE_DARK);
                if (iBinderE6 != null) {
                    remoteButtonStyleAttr.h((Drawable) ObjectWrapper.unwrap((IObjectWrapper) iBinderE6));
                }
                IBinder iBinderE7 = grVar.e(ParamConstants.BtnParams.INSTALL_BG_DRAWABLE_DARK);
                if (iBinderE7 != null) {
                    remoteButtonStyleAttr.i((Drawable) ObjectWrapper.unwrap((IObjectWrapper) iBinderE7));
                }
                IBinder iBinderE8 = grVar.e(ParamConstants.BtnParams.DOWN_CANCEL_BTN_DARK);
                if (iBinderE8 != null) {
                    remoteButtonStyleAttr.j((Drawable) ObjectWrapper.unwrap((IObjectWrapper) iBinderE8));
                }
                IBinder binder2 = bundle.getBinder(ParamConstants.BtnParams.CANCEL_BG_DRAWABLE_DARK);
                if (binder2 != null) {
                    remoteButtonStyleAttr.g((Drawable) ObjectWrapper.unwrap((IObjectWrapper) binder2));
                }
                remoteButtonStyleAttr.a(grVar.d("download_text"));
                remoteButtonStyleAttr.b(grVar.d("installed_text"));
                remoteButtonStyleAttr.e(grVar.d(ParamConstants.BtnParams.WEB_PAGE_BUTTON_TEXT));
                remoteButtonStyleAttr.a(grVar.a(ParamConstants.BtnParams.APP_RELATED, false));
                remoteButtonStyleAttr.c(grVar.d(ParamConstants.BtnParams.PRIOR_BEFORE_DOWNLOAD_BUTTON_TEXT));
                remoteButtonStyleAttr.f(grVar.d(ParamConstants.BtnParams.PRIOR_WEB_PAGE_BUTTON_TEXT));
                remoteButtonStyleAttr.d(grVar.d(ParamConstants.BtnParams.PRIOR_PROMT_DOWNLOAD_BUTTON_TEXT));
            }
            return remoteButtonStyleAttr;
        } catch (Throwable th) {
            hw.c("UiEngineProxyUtils", "getAttrs err: %s", th.getClass().getSimpleName());
            return null;
        }
    }
}
