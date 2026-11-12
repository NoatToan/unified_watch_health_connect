package com.huawei.watchface;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.uikit.hwprogressbar.widget.HwProgressBar;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class i0 extends u {
    public static final String f = "i0";
    public static final byte[] g = new byte[1];
    public static boolean h;
    public static AnimationDrawable i;

    public i0(Context context, int i2) {
        super(context, i2);
    }

    public final void a(boolean z) {
        synchronized (i0.class) {
            h = z;
        }
    }

    @Override // com.huawei.watchface.u, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        synchronized (g) {
            a(false);
            AnimationDrawable animationDrawable = i;
            if (animationDrawable != null && animationDrawable.isRunning()) {
                i.stop();
                i = null;
            }
        }
    }

    @Override // com.huawei.watchface.u, android.app.Dialog
    public void show() {
        super.show();
        AnimationDrawable animationDrawable = i;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }

    public i0(Context context) {
        super(context, R.style.watch_face_customDialog);
    }

    public static class a extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i0 f30206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Context f30207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HwProgressBar f30208c;
        public TextView d;
        public TextView e;
        public ImageView f;
        public View.OnClickListener g;
        public String h;

        /* JADX INFO: renamed from: com.huawei.watchface.i0$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0297a implements View.OnClickListener {
            public ViewOnClickListenerC0297a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (a.this.f30206a != null) {
                    HwLog.i(i0.f, "mCustomProgressDialog.dismiss");
                    a.this.f30206a.dismiss();
                }
                View.OnClickListener onClickListener = a.this.g;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        }

        public a(Context context) {
            this.f30207b = context;
        }

        public a a(String str) {
            this.h = str;
            TextView textView = this.e;
            if (textView != null && str != null) {
                textView.setText(str);
            }
            return this;
        }

        public a b(String str) {
            TextView textView;
            if (str != null && (textView = this.d) != null) {
                textView.setText(str);
            }
            return this;
        }

        public a a(int i) {
            HwProgressBar hwProgressBar = this.f30208c;
            if (hwProgressBar != null) {
                hwProgressBar.setProgress(i);
            }
            return this;
        }

        public a a(View.OnClickListener onClickListener) {
            this.g = onClickListener;
            return this;
        }

        public i0 a() {
            View viewInflate;
            LayoutInflater layoutInflater = (LayoutInflater) this.f30207b.getSystemService("layout_inflater");
            this.f30207b.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, new TypedValue(), true);
            Drawable drawable = ContextCompat.getDrawable(this.f30207b, R.drawable.watchface_shape_dialog_bg);
            if (i0.h) {
                this.f30206a = new i0(this.f30207b, R.style.watch_face_progress_data_insert_dialog);
                viewInflate = layoutInflater.inflate(R.layout.watchface_dialog_custom_loading, (ViewGroup) null);
                i0.i = (AnimationDrawable) ((ImageView) viewInflate.findViewById(R.id.watch_face_data_loading_img)).getDrawable();
            } else {
                this.f30206a = new i0(this.f30207b, R.style.watch_face_customDialog_process);
                viewInflate = layoutInflater.inflate(R.layout.watchface_dialog_custom_progress, (ViewGroup) null);
                this.d = (TextView) viewInflate.findViewById(R.id.custom_progress_dialog_percent);
                this.f30208c = (HwProgressBar) viewInflate.findViewById(R.id.custom_progress_dialog_progressbar);
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.custom_progress_dialog_cancel);
                this.f = imageView;
                if (this.g != null) {
                    imageView.setOnClickListener(new ViewOnClickListenerC0297a());
                    this.f.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                TextView textView = (TextView) viewInflate.findViewById(R.id.custom_progress_dialog_desc);
                this.e = textView;
                textView.setText(this.h);
                HwLog.i(i0.f, "mProgressDesc :" + this.h);
                this.f30208c.setMax(100);
            }
            viewInflate.setBackground(drawable);
            this.f30206a.setContentView(viewInflate);
            return this.f30206a;
        }
    }
}
