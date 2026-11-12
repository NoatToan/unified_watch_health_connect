package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.main.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class uwe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f50638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<HiTimeInterval> f50639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50640c;
    private Handler d;
    private Activity e;
    private int f;
    private CustomProgressDialog.Builder g;
    private CustomProgressDialog i;
    private Handler h = new d(this);
    private uwf j = uwf.d();

    public uwe(Activity activity, Handler handler) {
        this.e = activity;
        this.d = handler;
        this.f50638a = new c(this, this.e);
    }

    public static class d extends BaseHandler<uwe> {
        d(uwe uweVar) {
            super(uweVar);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(uwe uweVar, Message message) {
            LogUtil.a("DeleteHealthDataDialog", "handleMessageWhenReferenceNotNull()");
            if (uweVar != null) {
                if (uweVar.f50640c == uweVar.f) {
                    uweVar.c();
                    if (uweVar.d != null) {
                        uweVar.d.sendEmptyMessage(2);
                        return;
                    } else {
                        LogUtil.j("DeleteHealthDataDialog", "mCallBackHandler is null");
                        return;
                    }
                }
                uweVar.b();
                return;
            }
            LogUtil.a("DeleteHealthDataDialog", "handleMessageWhenReferenceNotNull obj == null !");
        }
    }

    public void b(List<HiTimeInterval> list) {
        if (list != null && list.size() > 0) {
            int size = list.size();
            this.f = size;
            this.f50639b = list;
            this.f50640c = 0;
            if (size > 100) {
                d();
            }
            b();
            return;
        }
        Handler handler = this.d;
        if (handler == null) {
            LogUtil.j("DeleteHealthDataDialog", "mCallBackHandler is null");
        } else {
            handler.sendEmptyMessage(2);
        }
    }

    private void d() {
        if (this.i == null) {
            this.i = new CustomProgressDialog(this.e);
            CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.e);
            this.g = builder;
            builder.e(this.e.getString(R.string.IDS_hw_health_show_healthdata_deleteing));
            CustomProgressDialog customProgressDialogC = this.g.c();
            this.i = customProgressDialogC;
            customProgressDialogC.setCanceledOnTouchOutside(false);
            this.i.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: uwe.1
                @Override // android.content.DialogInterface.OnKeyListener
                public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return i == 4;
                }
            });
        }
        if (this.e.isFinishing()) {
            return;
        }
        this.i.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        CustomProgressDialog customProgressDialog;
        int i = this.f50640c;
        int i2 = this.f;
        if (i < i2) {
            int i3 = i + 100;
            if (i3 <= i2) {
                this.j.b(this.e, this.f50639b.subList(i, i3), this.f50638a);
                this.f50640c += 100;
            } else {
                this.j.b(this.e, this.f50639b.subList(i, i2), this.f50638a);
                this.f50640c = this.f;
            }
            if (this.e.isFinishing() || (customProgressDialog = this.i) == null || !customProgressDialog.isShowing()) {
                return;
            }
            int i4 = (this.f50640c * 100) / this.f;
            this.g.b(i4);
            this.g.d(i4);
        }
    }

    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<uwe> f50641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<Activity> f50642b;

        c(uwe uweVar, Activity activity) {
            this.f50641a = new WeakReference<>(uweVar);
            this.f50642b = new WeakReference<>(activity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i == 0) {
                LogUtil.a("DeleteHealthDataDialog", "delete successful");
            } else {
                LogUtil.a("DeleteHealthDataDialog", "delete failed");
            }
            WeakReference<Activity> weakReference = this.f50642b;
            if (weakReference == null) {
                LogUtil.j("DeleteHealthDataDialog", "DeleteDataResponseCallback onResponse mActivityWeakReference is null");
                return;
            }
            Activity activity = weakReference.get();
            if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
                LogUtil.j("DeleteHealthDataDialog", "DeleteDataResponseCallback onResponse activity is not exist");
                return;
            }
            WeakReference<uwe> weakReference2 = this.f50641a;
            if (weakReference2 == null) {
                LogUtil.j("DeleteHealthDataDialog", "DeleteDataResponseCallback onResponse mDialogWeakReference is null");
                return;
            }
            uwe uweVar = weakReference2.get();
            if (uweVar != null) {
                if (uweVar.h != null) {
                    uweVar.h.sendEmptyMessage(1);
                    return;
                } else {
                    LogUtil.j("DeleteHealthDataDialog", "mDeleteHealthDataDialogHandler is null");
                    return;
                }
            }
            LogUtil.j("DeleteHealthDataDialog", "DeleteDataResponseCallback onResponse deleteHealthDataDialog is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        CustomProgressDialog customProgressDialog;
        if (this.e.isFinishing() || (customProgressDialog = this.i) == null) {
            return;
        }
        customProgressDialog.cancel();
        this.i = null;
    }
}
