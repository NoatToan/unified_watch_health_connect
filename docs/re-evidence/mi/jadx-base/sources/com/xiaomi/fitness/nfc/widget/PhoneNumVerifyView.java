package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.onetrack.OneTrack;
import defpackage.bg4;
import defpackage.mri;
import defpackage.o0j;
import defpackage.rji;
import defpackage.sui;
import defpackage.z5l;

/* JADX INFO: loaded from: classes9.dex */
public class PhoneNumVerifyView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f12646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EditText f12647b;
    public TextView c;
    public a d;
    public c e;
    public Context f;
    public TextView g;
    public View h;
    public TextView i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12648k;
    public Typeface l;
    public Typeface m;
    public boolean n;
    public CardWrapper o;
    public b p;

    public class a implements TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strTrim = PhoneNumVerifyView.this.f12646a.getText().toString().trim();
            String captcha = PhoneNumVerifyView.this.getCaptcha();
            boolean isShowPhoneNumInput = PhoneNumVerifyView.this.getIsShowPhoneNumInput();
            boolean isShowCaptchaInput = PhoneNumVerifyView.this.getIsShowCaptchaInput();
            boolean z = false;
            boolean z2 = !TextUtils.isEmpty(strTrim) && PhoneNumVerifyView.this.k(strTrim);
            boolean z3 = !TextUtils.isEmpty(captcha);
            if (isShowPhoneNumInput && strTrim.length() == 11 && !strTrim.startsWith("1")) {
                ToastUtil.showShortToast(o0j.p0);
            }
            if (isShowPhoneNumInput && isShowCaptchaInput) {
                PhoneNumVerifyView.this.o.setPhoneNum(strTrim);
                PhoneNumVerifyView.this.o.setCaptcha(captcha);
                PhoneNumVerifyView phoneNumVerifyView = PhoneNumVerifyView.this;
                if (z2 && z3) {
                    z = true;
                }
                phoneNumVerifyView.n = z;
            } else if (isShowPhoneNumInput) {
                PhoneNumVerifyView.this.o.setPhoneNum(strTrim);
                PhoneNumVerifyView.this.n = z2;
            } else {
                PhoneNumVerifyView.this.n = true;
            }
            if (PhoneNumVerifyView.this.p != null) {
                PhoneNumVerifyView.this.p.a();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public a() {
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a(String str);
    }

    public PhoneNumVerifyView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCaptcha() {
        return this.f12647b.getText().toString().trim();
    }

    public void g(boolean z) {
        this.c.setEnabled(z);
        this.c.setClickable(z);
    }

    public boolean getIsShowCaptchaInput() {
        return this.f12648k;
    }

    public boolean getIsShowPhoneNumInput() {
        return this.j;
    }

    public String getPhoneNum() {
        return this.f12646a.getText().toString().trim();
    }

    public boolean h() {
        return this.n;
    }

    public final /* synthetic */ void i(Object obj) throws Exception {
        j();
    }

    public final void j() {
        String strTrim = this.f12646a.getText().toString().trim();
        if (!k(strTrim)) {
            ToastUtil.showShortToast(o0j.H5);
            return;
        }
        c cVar = this.e;
        if (cVar != null) {
            cVar.a(strTrim);
        }
        g(false);
        this.c.setText(getResources().getString(o0j.G5));
        this.c.setTextColor(getResources().getColor(rji.p));
        this.c.setTypeface(this.m);
    }

    public boolean k(String str) {
        return str.startsWith("1") && str.length() == 11;
    }

    public void setCardWrapper(CardWrapper cardWrapper) {
        this.o = cardWrapper;
    }

    public void setOnPhoneAndCodeTextChangeListener(b bVar) {
        this.p = bVar;
    }

    public void setOnRequestCaptchaListener(c cVar) {
        this.e = cVar;
    }

    public void setPhoneValidate(boolean z) {
        this.n = z;
    }

    public void setSendCodeCountDownTxt(String str) {
        this.c.setText(str);
    }

    public void setSendCodeCountDownTxtColor(int i) {
        this.c.setTextColor(i);
    }

    public PhoneNumVerifyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhoneNumVerifyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = true;
        this.f12648k = true;
        this.n = true;
        this.f = context;
        View viewInflate = LayoutInflater.from(context).inflate(sui.S0, (ViewGroup) this, true);
        this.g = (TextView) viewInflate.findViewById(mri.b5);
        this.f12646a = (EditText) viewInflate.findViewById(mri.w1);
        this.h = viewInflate.findViewById(mri.r5);
        this.i = (TextView) viewInflate.findViewById(mri.W4);
        this.f12647b = (EditText) viewInflate.findViewById(mri.u1);
        this.c = (TextView) viewInflate.findViewById(mri.d5);
        a aVar = new a();
        this.d = aVar;
        this.f12647b.addTextChangedListener(aVar);
        this.f12646a.addTextChangedListener(this.d);
        z5l.a(this.c, new bg4() { // from class: wth
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                this.f38343a.i(obj);
            }
        });
        this.l = Typeface.create("miui-bold", 0);
        this.m = Typeface.create(OneTrack.Param.MIUI, 0);
    }
}
