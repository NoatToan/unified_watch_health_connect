package com.unionpay.tsm;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.entity.UnionPayResource;
import com.unionpay.entity.UnionPayStatus;
import com.unionpay.tsm.constant.TsmErrorMsg;

/* JADX INFO: loaded from: classes18.dex */
public class TsmDialogHelper {
    private FragmentActivity a;
    private LoadingDialog b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UnionPayStatus.values().length];
            a = iArr;
            try {
                iArr[UnionPayStatus.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UnionPayStatus.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public TsmDialogHelper(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity;
    }

    private String c() {
        return this.a.getString(R.string.wl_bank_loading);
    }

    private Intent d() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:com.unionpay.tsmbleuniteservice"));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(DialogInterface dialogInterface, int i) {
        this.a.startActivity(d());
        this.a.finish();
    }

    private void g(UnionPayResource<?> unionPayResource, @NonNull String str) {
        if (unionPayResource == null) {
            return;
        }
        int i = a.a[unionPayResource.status.ordinal()];
        if (i == 1) {
            showLoadingDialog(str);
        } else if (i != 2) {
            hideLoadingDialog();
        } else {
            hideLoadingDialog();
            onError(unionPayResource);
        }
    }

    private void h() {
        new AlertDialogFragment.Builder(this.a.getApplicationContext()).setTitle(R.string.wl_bank_tips).setMessage(R.string.wl_tsm_service_not_start).setNeutralButton(R.string.wl_bank_set, new DialogInterface.OnClickListener() { // from class: nz7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.f(dialogInterface, i);
            }
        }).create().show(this.a.getSupportFragmentManager(), "Tsm Not Start");
    }

    public void hideLoadingDialog() {
        LoadingDialog loadingDialog = this.b;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.b.dismiss();
    }

    public void onError(@NonNull UnionPayResource<?> unionPayResource) {
        if (unionPayResource.status != UnionPayStatus.ERROR) {
            return;
        }
        TsmErrorMsg tsmErrorMsgCodeOf = TsmErrorMsg.codeOf(unionPayResource.code);
        if (tsmErrorMsgCodeOf != null) {
            showTipDialog(tsmErrorMsgCodeOf);
        } else if (String.valueOf(-1).equals(unionPayResource.code)) {
            h();
        } else {
            if (TextUtils.isEmpty(unionPayResource.message)) {
                return;
            }
            Toast.makeText(this.a, unionPayResource.message, 0).show();
        }
    }

    public void showLoadingDialog(@NonNull String str) {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this.a, str);
        this.b = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
    }

    public void showOrError(UnionPayResource<?> unionPayResource) {
        g(unionPayResource, c());
    }

    public void showTipDialog(@NonNull TsmErrorMsg tsmErrorMsg) {
        new AlertDialogFragment.Builder(this.a.getApplicationContext()).setTitle(R.string.wl_bank_tips).setMessage(tsmErrorMsg.msg).setNeutralButton(R.string.wl_bank_btn_known, new DialogInterface.OnClickListener() { // from class: oz7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).create().show(this.a.getSupportFragmentManager(), tsmErrorMsg.name());
    }
}
