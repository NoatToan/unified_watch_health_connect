package com.xiaomi.fitness.baseui.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.u2j;

/* JADX INFO: loaded from: classes7.dex */
public class a extends Dialog implements DialogInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MLAlertController f11731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence[] f11732b;
    public Context c;
    public b d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: com.xiaomi.fitness.baseui.widget.a$a, reason: collision with other inner class name */
    public static class C0384a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MLAlertController.b f11733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Context f11734b;

        public C0384a(Context context) {
            this.f11734b = context;
            this.f11733a = new MLAlertController.b(context);
        }

        public a a() {
            a aVar = new a(this.f11733a.f11691a);
            MLAlertController.b bVar = this.f11733a;
            aVar.f11732b = bVar.x;
            bVar.a(aVar.f11731a);
            aVar.setCancelable(this.f11733a.u);
            if (this.f11733a.u) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f11733a.v);
            DialogInterface.OnKeyListener onKeyListener = this.f11733a.w;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            aVar.e(this.f11733a.T);
            return aVar;
        }

        public C0384a b(b bVar) {
            this.f11733a.T = bVar;
            return this;
        }

        public C0384a c(int i) {
            this.f11733a.c = i;
            return this;
        }

        public C0384a d(int i) {
            MLAlertController.b bVar = this.f11733a;
            bVar.f11693k = bVar.f11691a.getText(i);
            return this;
        }

        public C0384a e(int i, DialogInterface.OnClickListener onClickListener) {
            MLAlertController.b bVar = this.f11733a;
            bVar.q = bVar.f11691a.getText(i);
            this.f11733a.f11694r = onClickListener;
            return this;
        }

        public C0384a f(DialogInterface.OnCancelListener onCancelListener) {
            this.f11733a.v = onCancelListener;
            return this;
        }

        public C0384a g(int i, DialogInterface.OnClickListener onClickListener) {
            MLAlertController.b bVar = this.f11733a;
            bVar.o = bVar.f11691a.getText(i);
            this.f11733a.p = onClickListener;
            return this;
        }

        public C0384a h(int i) {
            MLAlertController.b bVar = this.f11733a;
            bVar.g = bVar.f11691a.getText(i);
            return this;
        }

        public C0384a i(View view) {
            MLAlertController.b bVar = this.f11733a;
            bVar.B = view;
            bVar.G = false;
            return this;
        }
    }

    public interface b {
        void afterDismissCallBack();

        void beforeDismissCallBack();
    }

    public a(Context context) {
        this(context, u2j.f35313b);
    }

    public static int b(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int c(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public final void d() {
        if (this.f11731a.x() != null) {
            ((InputMethodManager) this.c.getSystemService("input_method")).hideSoftInputFromWindow(this.f11731a.x().getWindowToken(), 0);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        b bVar = this.d;
        if (bVar != null) {
            bVar.beforeDismissCallBack();
        }
        d();
        super.dismiss();
        b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.afterDismissCallBack();
        }
        this.d = null;
    }

    public void e(b bVar) {
        this.d = bVar;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        this.f11731a.y();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MLAlertController mLAlertController = this.f11731a;
        if (mLAlertController != null) {
            mLAlertController.w();
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f11731a.z(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f11731a.A(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f11731a.P(charSequence);
    }

    @Override // android.app.Dialog
    public void show() {
        Context context = this.c;
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        super.show();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (this.f) {
            attributes.width = -1;
        } else {
            attributes.width = c(this.c) - DisplayUtil.dp2px(this.c, 0.0f);
        }
        if (this.e) {
            attributes.width = b(this.c) - DisplayUtil.dp2px(this.c, 0.0f);
        }
        attributes.height = -2;
        getWindow().setAttributes(attributes);
    }

    public a(Context context, int i) {
        super(context, i);
        this.f11731a = new MLAlertController(context, this, getWindow());
        this.c = context;
    }
}
