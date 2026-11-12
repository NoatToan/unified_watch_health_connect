package com.huawei.hms.update.ui;

import android.app.Dialog;
import android.app.ProgressDialog;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* JADX INFO: loaded from: classes34.dex */
public class CheckProgress extends AbstractDialog {
    private Dialog a() {
        ProgressDialog progressDialog = new ProgressDialog(getActivity(), getDialogThemeId());
        progressDialog.setMessage(ResourceLoaderUtil.getString("hms_checking"));
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }

    private Dialog b() {
        WatchProgressDialog watchProgressDialog = new WatchProgressDialog(getActivity());
        watchProgressDialog.setCanceledOnTouchOutside(false);
        return watchProgressDialog;
    }

    @Override // com.huawei.hms.update.ui.AbstractDialog
    public Dialog onCreateDialog() {
        return HwDialogUtil.a(getActivity()) != 6 ? a() : b();
    }
}
