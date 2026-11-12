package com.huawei.healthcloud.plugintrack.ui.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;

/* JADX INFO: loaded from: classes10.dex */
public final class TrackDialogViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomViewDialog f11405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CommonSingleCallback<Boolean> f11406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CommonSingleCallback<Boolean> f11407c;
    private Context d;
    private HealthRadioButton e;
    private CommonSingleCallback<Boolean> f;
    private View g;
    private HealthRadioButton h;
    private HealthCheckBox i;

    public TrackDialogViewHolder(Context context) {
        if (context == null) {
            LogUtil.j("Track_TrackDialogViewHolder", "TrackDialogViewHolder invalid params in constructor, context is null");
        } else {
            this.d = context;
            b();
        }
    }

    private void b() {
        Context context = this.d;
        if (context == null) {
            LogUtil.j("Track_TrackDialogViewHolder", "getDisplayDialogView Context is null");
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.retrack_video_setting_view, (ViewGroup) null);
        this.g = viewInflate;
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.retrack_play_video_type_layout);
        HealthTextView healthTextView = (HealthTextView) linearLayout.findViewById(R.id.one_type);
        HealthTextView healthTextView2 = (HealthTextView) linearLayout.findViewById(R.id.other_type);
        healthTextView.setText(this.d.getResources().getString(R.string.IDS_track_video_play_standard, 720));
        healthTextView2.setText(this.d.getResources().getString(R.string.IDS_track_video_play_hd, 1080));
        this.h = (HealthRadioButton) linearLayout.findViewById(R.id.save_to_my_route_radio_button);
        this.i = (HealthCheckBox) this.g.findViewById(R.id.no_more_next_tip);
        this.e = (HealthRadioButton) linearLayout.findViewById(R.id.rb_export_route);
        this.h.setClickable(false);
        this.e.setClickable(false);
        linearLayout.findViewById(R.id.standard_video).setOnClickListener(new View.OnClickListener() { // from class: jun
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(view);
            }
        });
        linearLayout.findViewById(R.id.hd_video).setOnClickListener(new View.OnClickListener() { // from class: jul
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        if (this.h.isChecked()) {
            return;
        }
        this.h.setChecked(true);
        this.e.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        if (this.e.isChecked()) {
            return;
        }
        this.e.setChecked(true);
        this.h.setChecked(false);
    }

    private void a() {
        if (this.g == null) {
            return;
        }
        this.f11405a = new CustomViewDialog.Builder(this.d).d(this.g).a(this.d.getResources().getString(R.string.IDS_application_market_confirm), new View.OnClickListener() { // from class: jum
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39071c.b(view);
            }
        }).c(this.d.getResources().getString(R.string.IDS_dialog_checkbox_cancel), new View.OnClickListener() { // from class: juk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39070a.a(view);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        CommonSingleCallback<Boolean> commonSingleCallback;
        CommonSingleCallback<Boolean> commonSingleCallback2;
        HealthCheckBox healthCheckBox = this.i;
        if (healthCheckBox != null && (commonSingleCallback2 = this.f) != null) {
            commonSingleCallback2.callback(Boolean.valueOf(healthCheckBox.isChecked()));
        }
        HealthRadioButton healthRadioButton = this.e;
        if (healthRadioButton != null && (commonSingleCallback = this.f11406b) != null) {
            commonSingleCallback.callback(Boolean.valueOf(healthRadioButton.isChecked()));
        }
        CommonSingleCallback<Boolean> commonSingleCallback3 = this.f11407c;
        if (commonSingleCallback3 != null) {
            commonSingleCallback3.callback(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        CommonSingleCallback<Boolean> commonSingleCallback = this.f11407c;
        if (commonSingleCallback != null) {
            commonSingleCallback.callback(false);
        }
        this.f11405a.dismiss();
    }

    public void e(boolean z) {
        if (this.f11405a == null) {
            a();
        }
        d(z);
        CustomViewDialog customViewDialog = this.f11405a;
        if (customViewDialog == null || customViewDialog.isShowing()) {
            return;
        }
        this.f11405a.show();
    }

    private void d(boolean z) {
        HealthRadioButton healthRadioButton = this.e;
        if (healthRadioButton == null || this.h == null) {
            return;
        }
        if (z) {
            healthRadioButton.setChecked(true);
            this.h.setChecked(false);
        } else {
            healthRadioButton.setChecked(false);
            this.h.setChecked(true);
        }
    }

    public TrackDialogViewHolder c(CommonSingleCallback<Boolean> commonSingleCallback) {
        this.f = commonSingleCallback;
        return this;
    }

    public TrackDialogViewHolder b(CommonSingleCallback<Boolean> commonSingleCallback) {
        this.f11406b = commonSingleCallback;
        return this;
    }

    public TrackDialogViewHolder d(CommonSingleCallback<Boolean> commonSingleCallback) {
        this.f11407c = commonSingleCallback;
        return this;
    }
}
