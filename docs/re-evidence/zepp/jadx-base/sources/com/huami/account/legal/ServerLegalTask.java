package com.huami.account.legal;

import android.content.Context;
import android.os.AsyncTask;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleOwner;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.legal.ServerLegalTask;
import com.huami.account.service.model.Area;
import com.huami.account.ui.R;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.ui.common.LoadingDialogContainer;
import com.huami.widget.toast.CustomToast;

/* JADX INFO: loaded from: classes4.dex */
public class ServerLegalTask extends AsyncTask<Void, Void, Boolean> {
    private final Area a;
    private final Callback b;

    public interface Callback {
        void onResult(boolean z);
    }

    public interface SuccessCallback {
        void onSuccess();
    }

    public ServerLegalTask(Area area, Callback callback) {
        this.a = area;
        this.b = callback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(Context context, SuccessCallback successCallback, LoadingDialogContainer loadingDialogContainer, boolean z) {
        if ((context instanceof LifecycleOwner) && ((LifecycleOwner) context).getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        if (z) {
            successCallback.onSuccess();
        } else {
            CustomToast.showShort(context, R.string.account_ui_amazfit_watch_query_failed);
        }
        loadingDialogContainer.getLoadingDialog().hide();
    }

    public static void executeServerLegalTask(final Context context, final LoadingDialogContainer loadingDialogContainer, Area area, final SuccessCallback successCallback) {
        loadingDialogContainer.showLoadingDialog(context.getString(R.string.account_ui_loading));
        new ServerLegalTask(area, new Callback() { // from class: ao6
            @Override // com.huami.account.legal.ServerLegalTask.Callback
            public final void onResult(boolean z) {
                ServerLegalTask.b(context, successCallback, loadingDialogContainer, z);
            }
        }).execute(new Void[0]);
    }

    @Override // android.os.AsyncTask
    public Boolean doInBackground(Void... voidArr) {
        boolean zIsShowUxAgreement = SelectAreaHelper.isShowUxAgreement(this.a);
        Area area = this.a;
        return Boolean.valueOf(UserLegalInfoManager.requestAllForRegister(zIsShowUxAgreement, area == null ? null : area.getValue()));
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
        this.b.onResult(bool.booleanValue());
    }
}
