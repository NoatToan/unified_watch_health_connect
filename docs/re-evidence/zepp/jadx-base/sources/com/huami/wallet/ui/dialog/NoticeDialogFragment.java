package com.huami.wallet.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.utils.ImageLoadUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class NoticeDialogFragment extends DialogFragment {
    private a a;
    private Builder b;

    public static class Builder {
        public String a;
        public String b;
        public String c;
        public int d = -1;
        public OnKnownButtonClickListener e;

        public NoticeDialogFragment create() {
            NoticeDialogFragment noticeDialogFragment = new NoticeDialogFragment();
            noticeDialogFragment.d(this);
            return noticeDialogFragment;
        }

        public Builder setImageResId(@DrawableRes int i) {
            this.d = i;
            return this;
        }

        public Builder setNoticeMsg(String str) {
            this.b = str;
            return this;
        }

        public Builder setOnKnownButtonClickListener(OnKnownButtonClickListener onKnownButtonClickListener) {
            this.e = onKnownButtonClickListener;
            return this;
        }

        public Builder setTitle(String str) {
            this.a = str;
            return this;
        }
    }

    public interface OnKnownButtonClickListener {
        void onKnown();
    }

    public static class a {
        public final ImageView a;
        public final TextView b;
        public final TextView c;
        public final Button d;

        public a(Dialog dialog) {
            this.a = (ImageView) dialog.findViewById(R.id.dialog_image);
            this.b = (TextView) dialog.findViewById(R.id.dialog_title);
            this.c = (TextView) dialog.findViewById(R.id.dialog_message);
            this.d = (Button) dialog.findViewById(R.id.known_button);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        OnKnownButtonClickListener onKnownButtonClickListener;
        Builder builder = this.b;
        if (builder != null && (onKnownButtonClickListener = builder.e) != null) {
            onKnownButtonClickListener.onKnown();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Builder builder) {
        this.b = builder;
    }

    private void initViews() {
        this.a.d.setOnClickListener(new View.OnClickListener() { // from class: rf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c(view);
            }
        });
        Builder builder = this.b;
        if (builder != null) {
            String str = builder.a;
            if (str != null) {
                this.a.b.setText(str);
            }
            String str2 = this.b.b;
            if (str2 != null) {
                this.a.c.setText(str2);
            }
            String str3 = this.b.c;
            if (str3 != null) {
                ImageLoadUtils.loadImage(this.a.a, str3);
            }
            int i = this.b.d;
            if (i != -1) {
                this.a.a.setImageResource(i);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        initViews();
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        Objects.requireNonNull(context);
        Dialog dialog = new Dialog(context);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.requestFeature(1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setContentView(R.layout.wl_dialog_notice);
        this.a = new a(dialog);
        if (window != null) {
            window.setGravity(17);
            window.setLayout(-1, -2);
        }
        return dialog;
    }
}
