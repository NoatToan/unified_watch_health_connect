package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqv;
import defpackage.qre;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public class CustomAlertDialog extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f23387c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f23389b;
    private a d;
    private boolean e;

    private CustomAlertDialog(Context context, int i) {
        super(context, i);
        this.f23388a = context;
        this.d = new a(context);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        String string;
        try {
            string = this.f23388a.getString(i);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("CustomAlertDialog", "Resources NotFound");
            string = "";
        }
        this.d.a(string);
    }

    public void c(Typeface typeface, int i) {
        a aVar = this.d;
        if (aVar == null || typeface == null) {
            LogUtil.e("CustomAlertDialog", "setTitleTypeface mController or typeface is null");
        } else {
            aVar.e(typeface, i);
        }
    }

    public void e(String str) {
        if (str == null) {
            return;
        }
        this.d.b(str);
    }

    public void a(Typeface typeface) {
        a aVar = this.d;
        if (aVar == null || typeface == null) {
            LogUtil.e("CustomAlertDialog", "setMessageTypeface mController or typeface is null");
        } else {
            aVar.b(typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a b() {
        return this.d;
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f23390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f23391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f23392c;
        private CustomAlertDialog d;
        private Drawable e;
        private boolean h;

        public Builder(Context context) {
            this(context, R.style.CustomDialog);
        }

        public Builder(Context context, int i) {
            this.f23391b = context;
            this.f23392c = true;
            this.h = false;
            CustomAlertDialog customAlertDialog = new CustomAlertDialog(context, i);
            this.d = customAlertDialog;
            this.f23390a = customAlertDialog.b();
            Handler unused = CustomAlertDialog.f23387c = new ButtonHandler(this.d);
        }

        public Builder b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f23390a.a(str);
            }
            return this;
        }

        public Builder d(int i) {
            String string;
            try {
                string = this.f23391b.getString(i);
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("CustomAlertDialog", "Resources NotFound");
                string = "";
            }
            if (!TextUtils.isEmpty(string)) {
                this.f23390a.a(string);
            }
            return this;
        }

        public Builder e(int i) {
            this.f23390a.a(i);
            return this;
        }

        public Builder a(int i) {
            this.f23390a.e(i);
            return this;
        }

        public Builder e(CharSequence charSequence) {
            if (!TextUtils.isEmpty(charSequence)) {
                this.f23390a.b(charSequence);
            }
            return this;
        }

        public Builder b(int i) {
            if (i != 0) {
                this.f23390a.b(i);
            }
            return this;
        }

        public Builder e(int i, int i2) {
            this.f23390a.a(i, i2);
            return this;
        }

        public Builder c(int i) {
            String string;
            try {
                string = this.f23391b.getString(i);
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("CustomAlertDialog", "Resources NotFound");
                string = "";
            }
            if (!TextUtils.isEmpty(string)) {
                this.f23390a.b(string);
            }
            return this;
        }

        public Builder a(View view) {
            this.f23390a.b(view);
            return this;
        }

        public Builder d(int i, DialogInterface.OnClickListener onClickListener) {
            return c(i, 0, onClickListener, true);
        }

        public Builder e(String str, DialogInterface.OnClickListener onClickListener) {
            return a(str, 0, onClickListener, true);
        }

        public Builder b(int i, int i2, DialogInterface.OnClickListener onClickListener) {
            return c(i, i2, onClickListener, true);
        }

        public Builder a(int i, DialogInterface.OnClickListener onClickListener) {
            return c(i, 0, onClickListener, false);
        }

        public Builder d(String str, DialogInterface.OnClickListener onClickListener) {
            return a(str, 0, onClickListener, false);
        }

        public Builder a(int i, int i2, DialogInterface.OnClickListener onClickListener) {
            return c(i, i2, onClickListener, false);
        }

        public HealthButton c() {
            return this.f23390a.a();
        }

        public HealthButton a() {
            return this.f23390a.e();
        }

        public CustomAlertDialog b() {
            return d();
        }

        public Builder e(boolean z) {
            this.f23392c = z;
            return this;
        }

        public Builder a(boolean z) {
            this.h = z;
            return this;
        }

        private CustomAlertDialog d() {
            if (this.f23391b == null) {
                return this.d;
            }
            TypedValue typedValue = new TypedValue();
            this.f23391b.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, typedValue, true);
            TypedArray typedArrayObtainStyledAttributes = this.f23391b.getTheme().obtainStyledAttributes(typedValue.resourceId, R.styleable.customDialogDefinition);
            Drawable drawable = this.e;
            if (drawable == null) {
                if (typedValue.resourceId != 0) {
                    drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.customDialogDefinition_dialogBackground);
                } else {
                    drawable = ContextCompat.getDrawable(this.f23391b, R.drawable.activity_dialog_bg);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            this.f23390a.c().setBackground(drawable);
            this.d.addContentView(this.f23390a.c(), new ViewGroup.LayoutParams(-2, -2));
            this.d.setContentView(this.f23390a.c());
            this.d.setCancelable(this.f23392c);
            if (this.h) {
                this.d.setWindowGravityParams(17);
            }
            return this.d;
        }

        public Builder e(Drawable drawable) {
            this.e = drawable;
            return this;
        }

        public Builder c(int i, int i2, DialogInterface.OnClickListener onClickListener, boolean z) {
            return onClickListener == null ? this : a(qre.f(i), i2, onClickListener, z);
        }

        public Builder a(String str, int i, DialogInterface.OnClickListener onClickListener, boolean z) {
            if (onClickListener != null && !TextUtils.isEmpty(str)) {
                if (z) {
                    this.f23390a.b(str, i, onClickListener);
                    return this;
                }
                this.f23390a.c(str, i, onClickListener);
            }
            return this;
        }
    }

    static final class ButtonHandler extends Handler {
        private WeakReference<DialogInterface> d;

        ButtonHandler(DialogInterface dialogInterface) {
            this.d = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if ((i == -3 || i == -2 || i == -1) && (message.obj instanceof DialogInterface.OnClickListener)) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.d.get(), message.what);
            }
        }
    }

    class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Message f23394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View.OnClickListener f23395c = new View.OnClickListener() { // from class: com.huawei.ui.commonui.dialog.CustomAlertDialog.a.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int id = view.getId();
                Message messageObtain = id == R.id.dialog_btn_positive ? Message.obtain(a.this.g) : null;
                if (id == R.id.dialog_btn_negative) {
                    messageObtain = Message.obtain(a.this.f23394b);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                CustomAlertDialog.this.dismiss();
            }
        };
        private HealthButton d;
        private HealthButton e;
        private RelativeLayout f;
        private Message g;
        private LinearLayout h;
        private HealthTextView i;
        private LinearLayout j;
        private View l;
        private HealthTextView m;
        private RelativeLayout o;

        a(Context context) {
            b(context);
        }

        private void b(Context context) {
            View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.commonui_custom_dialog, (ViewGroup) null);
            this.l = viewInflate;
            this.h = (LinearLayout) viewInflate.findViewById(R.id.dialog_rlyt_title);
            this.f = (RelativeLayout) this.l.findViewById(R.id.dialog_llyt_btn_panel);
            this.o = (RelativeLayout) this.l.findViewById(R.id.dialog_rlyt_content);
            this.j = (LinearLayout) this.l.findViewById(R.id.dialog_llyt_message);
            this.m = (HealthTextView) this.l.findViewById(R.id.dialog_tv_title);
            this.i = (HealthTextView) this.l.findViewById(R.id.dialog_tv_message);
            this.d = (HealthButton) this.l.findViewById(R.id.dialog_btn_positive);
            this.e = (HealthButton) this.l.findViewById(R.id.dialog_btn_negative);
        }

        public void a(String str) {
            if (str == null) {
                return;
            }
            this.h.setVisibility(0);
            this.m.setVisibility(0);
            this.m.setText(str);
        }

        public void e(Typeface typeface, int i) {
            HealthTextView healthTextView = this.m;
            if (healthTextView == null || typeface == null) {
                LogUtil.e("CustomAlertDialog", "setTitleTypeface mTitle or typeface is null");
            } else {
                healthTextView.setTypeface(typeface, i);
            }
        }

        public void a(int i) {
            this.m.setGravity(i);
        }

        public void e(int i) {
            this.i.setGravity(i);
        }

        public void b(CharSequence charSequence) {
            if (charSequence == null) {
                return;
            }
            this.o.setVisibility(0);
            this.j.setVisibility(0);
            this.i.setVisibility(0);
            this.i.setText(charSequence);
            if (d()) {
                this.i.setGravity(8388627);
            } else {
                this.i.setGravity(17);
            }
        }

        public void b(Typeface typeface) {
            HealthTextView healthTextView = this.i;
            if (healthTextView == null || typeface == null) {
                LogUtil.e("CustomAlertDialog", "setMessageTypeface mMessage or typeface is null");
            } else {
                healthTextView.setTypeface(typeface);
            }
        }

        public void b(int i) {
            RelativeLayout relativeLayout = this.o;
            if (relativeLayout != null) {
                relativeLayout.getLayoutParams().height = i;
            }
        }

        public void a(int i, int i2) {
            RelativeLayout relativeLayout = this.o;
            if (relativeLayout != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
                layoutParams.setMarginStart(i);
                layoutParams.setMarginEnd(i2);
            }
        }

        private boolean d() {
            HealthTextView healthTextView = this.m;
            return healthTextView != null && healthTextView.getVisibility() == 0;
        }

        public void b(View view) {
            if (view == null) {
                return;
            }
            CustomAlertDialog.this.f23389b = view;
            this.o.setVisibility(0);
            this.o.removeAllViews();
            this.o.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }

        public View c() {
            return this.l;
        }

        public void b(String str, int i, DialogInterface.OnClickListener onClickListener) {
            this.f.setVisibility(0);
            this.d.setVisibility(0);
            if (!TextUtils.isEmpty(str)) {
                this.d.setText(str);
            }
            if (i != 0) {
                this.d.setTextColor(CustomAlertDialog.this.f23388a.getColor(i));
            }
            if (onClickListener != null) {
                this.g = CustomAlertDialog.f23387c.obtainMessage(-1, onClickListener);
                this.d.setOnClickListener(this.f23395c);
            }
        }

        public void c(String str, int i, DialogInterface.OnClickListener onClickListener) {
            this.f.setVisibility(0);
            this.e.setVisibility(0);
            if (!TextUtils.isEmpty(str)) {
                this.e.setText(str);
            }
            if (i != 0) {
                this.e.setTextColor(CustomAlertDialog.this.f23388a.getColor(i));
            }
            if (onClickListener != null) {
                this.f23394b = CustomAlertDialog.f23387c.obtainMessage(-2, onClickListener);
                this.e.setOnClickListener(this.f23395c);
            }
        }

        public HealthButton a() {
            return this.d;
        }

        public HealthButton e() {
            return this.e;
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.e) {
            a(this.f23389b);
        }
    }

    private int a() {
        return (int) (((double) qqv.b(this.f23388a)) * 0.8d);
    }

    private void a(View view) {
        if (view == null) {
            LogUtil.j("CustomAlertDialog", "setDialogViewHeight, view is null");
            return;
        }
        int iA = a();
        LogUtil.a("CustomAlertDialog", "setDialogViewHeight, dialogMaxHeight:", Integer.valueOf(iA));
        int measuredHeight = view.getMeasuredHeight();
        int height = (iA - view.getRootView().findViewById(R.id.dialog_rlyt_title).getHeight()) - view.getRootView().findViewById(R.id.dialog_btn_negative).getHeight();
        LogUtil.a("CustomAlertDialog", "setDialogViewHeight, contentHeight:", Integer.valueOf(measuredHeight), ", usableHeight:", Integer.valueOf(height));
        if (height < measuredHeight) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = height;
            view.setLayoutParams(layoutParams);
            view.requestLayout();
        }
    }
}
