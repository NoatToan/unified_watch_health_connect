package com.xiaomi.hm.health.device.earbud.fragment.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.earbud.fragment.dialog.EarbudAddDownloadTipDialog;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\t\u001a\u00020\bH\u0014¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/fragment/dialog/EarbudAddDownloadTipDialog;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "initView", "", "hasPadding", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudAddDownloadTipDialog extends BaseDialogFragment {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(EarbudAddDownloadTipDialog earbudAddDownloadTipDialog, View view) {
        earbudAddDownloadTipDialog.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @Nullable
    public View initView() {
        View viewInflate = LayoutInflater.from(requireActivity()).inflate(R.layout.dialog_add_download_tip, (ViewGroup) null);
        viewInflate.findViewById(R.id.btn_know).setOnClickListener(new View.OnClickListener() { // from class: nd1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EarbudAddDownloadTipDialog.d(this.a, view);
            }
        });
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(false);
    }
}
