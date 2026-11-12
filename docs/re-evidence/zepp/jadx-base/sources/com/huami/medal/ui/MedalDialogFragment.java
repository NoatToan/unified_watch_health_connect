package com.huami.medal.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import com.huami.medal.R;
import com.huami.medal.data.MedalDataManager;
import com.xiaomi.hm.health.databases.model.Medal;
import com.xiaomi.hm.health.imageload.HMImageLoader;

/* JADX INFO: loaded from: classes10.dex */
public class MedalDialogFragment extends DialogFragment {
    private Medal a;
    private DialogInterface.OnDismissListener b;

    public static class Builder {
        private Medal a;
        private DialogInterface.OnDismissListener b;

        public MedalDialogFragment create() {
            MedalDialogFragment medalDialogFragment = new MedalDialogFragment();
            medalDialogFragment.a = this.a;
            medalDialogFragment.b = this.b;
            return medalDialogFragment;
        }

        public Builder setMedal(Medal medal) {
            this.a = medal;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.b = onDismissListener;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void d(Dialog dialog) {
        TextView textView = (TextView) dialog.findViewById(R.id.medal_title);
        TextView textView2 = (TextView) dialog.findViewById(R.id.medal_subtitle);
        TextView textView3 = (TextView) dialog.findViewById(R.id.medal_desc);
        ImageView imageView = (ImageView) dialog.findViewById(R.id.medal_icon);
        dialog.findViewById(R.id.btn_close).setOnClickListener(new View.OnClickListener() { // from class: hw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e(view);
            }
        });
        Medal medal = this.a;
        if (medal != null) {
            textView.setText(medal.getTitle());
            textView2.setText(this.a.getSubTitle());
            textView3.setText(Html.fromHtml(this.a.getObtainText()));
            HMImageLoader.with(getContext()).load(this.a.getObtainIcon()).into(imageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        MedalDataManager.takeMedalInRx(this.a);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.dialog_medal);
        dialog.setCanceledOnTouchOutside(true);
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        d(dialog);
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.b;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
