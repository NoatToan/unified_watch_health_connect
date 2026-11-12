package com.huawei.ui.homehealth.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.callback.ReconnectCallback;
import defpackage.qrs;

/* JADX INFO: loaded from: classes17.dex */
public class CloudReconnectFailDialog extends BaseDialog {
    public CloudReconnectFailDialog(Context context, int i) {
        super(context, i);
    }

    public static class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RelativeLayout f26170b;
        private Context d;
        private HealthRadioButton e;
        private CloudReconnectFailDialog f;
        private HealthTextView g;
        private HealthTextView h;
        private HealthTextView i;
        private HealthTextView j;
        private HealthRadioButton l;
        private RelativeLayout m;
        private HealthButton n;
        private View p;
        private ReconnectCallback r;
        private HealthButton s;
        private View t;
        private boolean k = true;
        private int o = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f26169a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f26171c = -1;

        public Builder(Context context) {
            this.d = context;
        }

        public Builder a(int i, int i2) {
            this.f26171c = i;
            this.f26169a = i2;
            return this;
        }

        public Builder b(ReconnectCallback reconnectCallback) {
            this.r = reconnectCallback;
            return this;
        }

        public CloudReconnectFailDialog e() {
            LogUtil.a("CloudReconnectFailDialog", "enter create dialog");
            this.f = new CloudReconnectFailDialog(this.d, R.style.CustomDialog);
            Context context = this.d;
            if (context == null) {
                LogUtil.j("CloudReconnectFailDialog", "enter create mContext == null");
                return this.f;
            }
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.cloud_reconnect_dialog_layout, (ViewGroup) null);
            TypedValue typedValue = new TypedValue();
            this.d.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, typedValue, true);
            TypedArray typedArrayObtainStyledAttributes = this.d.getTheme().obtainStyledAttributes(typedValue.resourceId, R.styleable.customDialogDefinition);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.customDialogDefinition_dialogBackground);
            typedArrayObtainStyledAttributes.recycle();
            viewInflate.setBackground(drawable);
            this.f.addContentView(viewInflate, new ViewGroup.LayoutParams(-2, -2));
            c(viewInflate);
            g();
            i();
            this.f.setContentView(viewInflate);
            return this.f;
        }

        private void c(View view) {
            this.h = (HealthTextView) view.findViewById(R.id.fail_dialog_tv_title);
            this.p = view.findViewById(R.id.tip_layout);
            this.t = view.findViewById(R.id.phone_layout);
            this.f26170b = (RelativeLayout) view.findViewById(R.id.connected_rl);
            this.m = (RelativeLayout) view.findViewById(R.id.no_connected_rl);
            this.e = (HealthRadioButton) view.findViewById(R.id.connected_rb);
            this.l = (HealthRadioButton) view.findViewById(R.id.no_connected_rb);
            this.i = (HealthTextView) view.findViewById(R.id.dialog_content_one);
            this.j = (HealthTextView) view.findViewById(R.id.dialog_content_two);
            this.g = (HealthTextView) view.findViewById(R.id.dialog_content_three);
            this.n = (HealthButton) view.findViewById(R.id.fail_dialog_btn_negative);
            this.s = (HealthButton) view.findViewById(R.id.fail_dialog_btn_positive);
            if (qrs.ah(BaseApplication.getContext())) {
                ((HealthTextView) this.m.findViewById(R.id.no_connected_another_phone)).setText(R.string.IDS_check_device_no_connected_another_pad);
            }
        }

        private void g() {
            this.m.setOnClickListener(new a(false));
            this.f26170b.setOnClickListener(new a(true));
            h();
        }

        private void i() {
            this.n.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.view.CloudReconnectFailDialog.Builder.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Builder.this.a();
                }
            });
            this.s.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.view.CloudReconnectFailDialog.Builder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Builder.this.j();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.f == null) {
                LogUtil.j("CloudReconnectFailDialog", "onNegativeButtonClick mDialog == null");
                return;
            }
            int i = this.o;
            if (i == 1) {
                LogUtil.a("CloudReconnectFailDialog", "onNegativeButtonClick mDialog.dismiss()");
                this.f.dismiss();
                return;
            }
            if (i == 2) {
                LogUtil.a("CloudReconnectFailDialog", "onNegativeButtonClick showDialogOne()");
                f();
            } else if (i == 3) {
                if (this.k) {
                    this.j.setVisibility(0);
                    LogUtil.a("CloudReconnectFailDialog", "onNegativeButtonClick showDialogTwo()");
                    m();
                } else {
                    LogUtil.a("CloudReconnectFailDialog", "onNegativeButtonClick showDialogOne()");
                    f();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            if (this.f == null) {
                LogUtil.j("CloudReconnectFailDialog", "onPositiveButtonClick mDialog == null");
                return;
            }
            int i = this.o;
            if (i == 1) {
                if (this.k) {
                    this.t.setVisibility(8);
                    this.p.setVisibility(0);
                    LogUtil.a("CloudReconnectFailDialog", "onPositiveButtonClick showDialogTwo()");
                    m();
                    return;
                }
                this.t.setVisibility(8);
                this.p.setVisibility(0);
                LogUtil.a("CloudReconnectFailDialog", "onPositiveButtonClick mPage == 1 showDialogThree()");
                k();
                return;
            }
            if (i == 2) {
                LogUtil.a("CloudReconnectFailDialog", "onPositiveButtonClick mPage == 2 showDialogThree()");
                k();
            } else if (i == 3) {
                this.o = 1;
                ReconnectCallback reconnectCallback = this.r;
                if (reconnectCallback != null) {
                    reconnectCallback.reconnect();
                }
                LogUtil.a("CloudReconnectFailDialog", "onPositiveButtonClick mDialog.dismiss()");
                this.f.dismiss();
            }
        }

        private void f() {
            this.o = 1;
            this.h.setText(this.d.getResources().getString(R.string.IDS_failed_connect_device));
            this.t.setVisibility(0);
            this.p.setVisibility(8);
            this.n.setText(this.d.getResources().getString(R.string.IDS_device_user_guide_cancel_btn));
            this.s.setText(this.d.getResources().getString(R.string.IDS_device_user_guide_next_btn));
        }

        private void m() {
            this.o = 2;
            this.g.setVisibility(0);
            this.h.setText(this.d.getResources().getString(R.string.IDS_please_complete_the_following_steps));
            this.i.setText(this.d.getResources().getString(R.string.IDS_other_phone_or_pad_settings_bluetooth, 1));
            this.j.setText(this.d.getResources().getString(R.string.IDS_turn_off_bluetooth_and_next_new, 2));
            this.g.setText(this.d.getResources().getString(R.string.IDS_note_open_another_phone_or_pad_bluetooth));
            this.n.setText(this.d.getResources().getString(R.string.IDS_device_user_guide_previous_btn));
            this.s.setText(this.d.getResources().getString(R.string.IDS_device_user_guide_next_btn));
        }

        private void k() {
            LogUtil.a("CloudReconnectFailDialog", "mDeviceType = ", Integer.valueOf(this.f26171c));
            this.o = 3;
            this.h.setText(this.d.getResources().getString(R.string.IDS_connect_device_tip_title));
            if (this.f26169a == 2) {
                c();
            } else {
                d();
            }
            this.n.setText(this.d.getResources().getString(R.string.IDS_device_user_guide_previous_btn));
            this.s.setText(this.d.getResources().getString(R.string.IDS_hw_health_wear_connect_device_connect_button));
        }

        private void c() {
            if (this.f26171c == 75) {
                LogUtil.a("CloudReconnectFailDialog", "dialog bolt");
                this.j.setVisibility(8);
                this.g.setVisibility(8);
                this.i.setText(this.d.getResources().getString(R.string.IDS_bolt_awaken_device_second, 3));
                return;
            }
            LogUtil.a("CloudReconnectFailDialog", "dialog other ble");
            this.g.setVisibility(0);
            this.i.setText(this.d.getResources().getString(R.string.IDS_serial_number_placeholder, 1, this.d.getResources().getString(R.string.IDS_open_bluetooth_again)));
            this.j.setText(this.d.getResources().getString(R.string.IDS_serial_number_placeholder, 2, this.d.getResources().getString(R.string.IDS_reconnect_des_info_new)));
            this.g.setText(this.d.getResources().getString(R.string.IDS_serial_number_placeholder, 3, this.d.getResources().getString(R.string.IDS_touch_reconnect)));
        }

        private void d() {
            int i = this.f26171c;
            if (i == 58) {
                LogUtil.a("CloudReconnectFailDialog", "dialog b6");
                this.j.setVisibility(0);
                this.g.setVisibility(8);
                this.i.setText(this.d.getResources().getString(R.string.IDS_connect_new_device_b6, 1));
                this.j.setText(this.d.getResources().getString(R.string.IDS_serial_number_placeholder, 2, this.d.getResources().getString(R.string.IDS_touch_reconnect)));
                return;
            }
            if (i == 16) {
                LogUtil.a("CloudReconnectFailDialog", "dialog b5");
                this.j.setVisibility(0);
                this.g.setVisibility(8);
                this.i.setText(this.d.getResources().getString(R.string.IDS_serial_number_placeholder, 1, this.d.getResources().getString(R.string.IDS_connect_new_device_b5)));
                this.j.setText(this.d.getResources().getString(R.string.IDS_serial_number_placeholder, 2, this.d.getResources().getString(R.string.IDS_touch_reconnect)));
                return;
            }
            if (i == 7) {
                LogUtil.a("CloudReconnectFailDialog", "dialog b3");
                b();
                return;
            }
            if (i == 14) {
                LogUtil.a("CloudReconnectFailDialog", "dialog b3 youth");
                this.j.setVisibility(0);
                this.g.setVisibility(8);
                this.i.setText(this.d.getResources().getString(R.string.IDS_serial_number_placeholder, 1, this.d.getResources().getString(R.string.IDS_connect_new_device_b3_young)));
                this.j.setText(this.d.getResources().getString(R.string.IDS_serial_number_placeholder, 2, this.d.getResources().getString(R.string.IDS_touch_reconnect)));
                return;
            }
            LogUtil.a("CloudReconnectFailDialog", "dialog other");
            this.j.setVisibility(0);
            this.g.setVisibility(0);
            this.i.setText(this.d.getResources().getString(R.string.IDS_disconnect_or_restore_device, 1));
            this.j.setText(this.d.getResources().getString(R.string.IDS_restore_and_startup_wizard, 2));
            this.g.setText(this.d.getResources().getString(R.string.IDS_serial_number_placeholder, 3, this.d.getResources().getString(R.string.IDS_touch_reconnect)));
        }

        private void b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.d.getResources().getString(R.string.IDS_serial_number_placeholder, 1, this.d.getResources().getString(R.string.IDS_connect_new_device_b3)));
            String string = spannableStringBuilder.toString();
            int iIndexOf = string.indexOf("%1$s");
            if (iIndexOf > 0) {
                Drawable drawable = this.d.getResources().getDrawable(R.drawable.img_pairing_more_new);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 1), iIndexOf, iIndexOf + 4, 33);
            }
            int iIndexOf2 = string.indexOf("%2$s");
            if (iIndexOf2 > 0) {
                Drawable drawable2 = this.d.getResources().getDrawable(R.drawable.img_bluetooth_new);
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                spannableStringBuilder.setSpan(new ImageSpan(drawable2, 1), iIndexOf2, iIndexOf2 + 4, 33);
            }
            this.j.setVisibility(0);
            this.g.setVisibility(8);
            this.i.setText(spannableStringBuilder);
            this.j.setText(this.d.getResources().getString(R.string.IDS_serial_number_placeholder, 2, this.d.getResources().getString(R.string.IDS_touch_reconnect)));
        }

        class a implements View.OnClickListener {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f26174c;

            a(boolean z) {
                this.f26174c = z;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("CloudReconnectFailDialog", "MySelectionOptionOnClickListener onClick(), isSelect:", Boolean.valueOf(this.f26174c));
                Builder.this.k = this.f26174c;
                Builder.this.h();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            if (this.k) {
                this.e.setChecked(true);
                this.l.setChecked(false);
            } else {
                this.e.setChecked(false);
                this.l.setChecked(true);
            }
        }
    }
}
