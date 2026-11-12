package com.huawei.health.sportservice.download.common;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.hauwei.health.sportservice.R;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.LogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class ResDownloadUserConfirmation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomProgressDialog f8835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomProgressDialog.Builder f8836b;
    private Context e;

    public ResDownloadUserConfirmation(Context context) {
        this.e = context;
    }

    public void d(final View.OnClickListener onClickListener, List<String> list, long j, final List<View.OnClickListener> list2, final List<View.OnClickListener> list3) {
        Activity activityC = c(this.e);
        boolean zE = e(activityC, list);
        LogUtil.b("SportService_ResDownloadUserConfirmation", "notifyShowConfirmDownloadDialog", Boolean.valueOf(zE));
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(activityC);
        builder.a(activityC.getString(R.string.IDS_service_area_notice_title));
        builder.d(c(activityC, j, list));
        builder.c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.sportservice.download.common.ResDownloadUserConfirmation.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.b("SportService_ResDownloadUserConfirmation", "click cancel show button");
                onClickListener.onClick(view);
                for (View.OnClickListener onClickListener2 : list3) {
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                }
            }
        });
        builder.d(zE ? R.string.IDS_bundle_update_button : R.string.IDS_bundle_download_button, new View.OnClickListener() { // from class: com.huawei.health.sportservice.download.common.ResDownloadUserConfirmation.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.b("SportService_ResDownloadUserConfirmation", "click confirm view");
                ResDownloadUserConfirmation.this.d(list3);
                for (View.OnClickListener onClickListener2 : list2) {
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                }
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
        LogUtil.b("SportService_ResDownloadUserConfirmation", "notifyShowConfirmDownloadDialog");
    }

    public static Activity c(Context context) {
        Activity activityJ;
        if (context instanceof Activity) {
            LogUtil.b("SportService_ResDownloadUserConfirmation", "checkContext context instanceof Activity");
            activityJ = (Activity) context;
        } else {
            LogUtil.b("SportService_ResDownloadUserConfirmation", "checkContext context is not Activity");
            activityJ = BaseApplication.j();
        }
        LogUtil.b("SportService_ResDownloadUserConfirmation", "checkContext mActivity.getLocalClassName() = ", activityJ.getLocalClassName());
        return activityJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final List<View.OnClickListener> list) {
        if (this.f8836b == null || this.f8835a == null) {
            LogUtil.b("SportService_ResDownloadUserConfirmation", "createProgress");
            CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.e);
            this.f8836b = builder;
            builder.e(this.e.getString(R.string.IDS_update_downloading)).e(new View.OnClickListener() { // from class: com.huawei.health.sportservice.download.common.ResDownloadUserConfirmation.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.b("SportService_ResDownloadUserConfirmation", "progress dialog cancel");
                    for (View.OnClickListener onClickListener : list) {
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                    }
                }
            });
            CustomProgressDialog customProgressDialogC = this.f8836b.c();
            this.f8835a = customProgressDialogC;
            customProgressDialogC.setCanceledOnTouchOutside(false);
            this.f8836b.b(1);
        }
    }

    private boolean e(Context context, List<String> list) {
        if (njy.e(list)) {
            LogUtil.e("SportService_ResDownloadUserConfirmation", "moduleNames is empty");
            return false;
        }
        Set<String> updateModules = AppBundle.c().getUpdateModules(this.e, true);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (updateModules.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public void b(final String str, final int i, final List<View.OnClickListener> list) {
        HandlerExecutor.b(new Runnable() { // from class: hbo
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e(list, i, str);
            }
        });
    }

    public /* synthetic */ void e(List list, int i, String str) {
        d(list);
        CustomProgressDialog.Builder builder = this.f8836b;
        CustomProgressDialog customProgressDialog = this.f8835a;
        if (builder == null || customProgressDialog == null) {
            LogUtil.e("SportService_ResDownloadUserConfirmation", "builder == null || dialog == null", Integer.valueOf(i));
            return;
        }
        if (i > 0) {
            builder.b(i);
        }
        if (!TextUtils.isEmpty(str)) {
            builder.e(str);
        }
        if (customProgressDialog.isShowing()) {
            return;
        }
        customProgressDialog.show();
    }

    public void a() {
        CustomProgressDialog customProgressDialog = this.f8835a;
        this.f8835a = null;
        this.f8836b = null;
        LogUtil.b("SportService_ResDownloadUserConfirmation", "closeProgressDialog ", Boolean.valueOf(customProgressDialog != null));
        if (customProgressDialog != null) {
            customProgressDialog.dismiss();
        }
    }

    public void c(String str, final View.OnClickListener onClickListener, final View.OnClickListener onClickListener2) {
        Activity activityC = c(this.e);
        View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.activity_bundle_ask_dialog, (ViewGroup) null);
        viewInflate.findViewById(R.id.bundle_ask_dialog_list).setVisibility(8);
        ((HealthTextView) viewInflate.findViewById(R.id.bundle_ask_dialog_content)).setText(str);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(activityC);
        builder.b(com.huawei.ui.commonui.R.string.IDS_service_area_notice_title);
        builder.d(viewInflate);
        builder.c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.sportservice.download.common.ResDownloadUserConfirmation.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.b("SportService_ResDownloadUserConfirmation", "showErrorDialog cancel show button");
                View.OnClickListener onClickListener3 = onClickListener;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(view);
                }
            }
        });
        builder.d(R.string.IDS_retry, new View.OnClickListener() { // from class: com.huawei.health.sportservice.download.common.ResDownloadUserConfirmation.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.b("SportService_ResDownloadUserConfirmation", "showErrorDialog confirm ");
                View.OnClickListener onClickListener3 = onClickListener2;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(view);
                }
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
    }

    private View c(Context context, long j, List<String> list) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.activity_bundle_ask_dialog, (ViewGroup) null);
        b(context, viewInflate, j);
        c(context, viewInflate, list);
        return viewInflate;
    }

    private void c(Context context, View view, List<String> list) {
        ((ListView) view.findViewById(R.id.bundle_ask_dialog_list)).setAdapter((ListAdapter) new c(context, R.layout.activity_bundle_ask_dialog_list_item, R.id.bundle_dialog_list_item, list));
    }

    static class c extends ArrayAdapter<String> {
        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return false;
        }

        c(Context context, int i, int i2, List<String> list) {
            super(context, i, i2, list);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return AppBundle.c().getModuleTitle(getContext(), (String) super.getItem(i));
        }
    }

    private void b(Context context, View view, long j) {
        ((HealthTextView) view.findViewById(R.id.bundle_ask_dialog_content)).setText(context.getString(R.string.IDS_download_update_tips, qrs.a(context, j)));
    }
}
