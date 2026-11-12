package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.health.FaCardSettingActivity;
import com.huawei.health.facardagds.FaCardAgdsApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.main.R;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class ira extends BaseDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f37982a;
    private View d;

    public ira(Context context, String str, String str2, String str3, int i) {
        super(context, R.style.DialogFullScreen, 0);
        this.f37982a = context;
        d(str, str2, str3, i);
    }

    private void d(final String str, String str2, String str3, int i) {
        LogUtil.a("FaCardSettingDialog", "initView");
        View viewInflate = ((LayoutInflater) this.f37982a.getSystemService("layout_inflater")).inflate(com.huawei.health.R.layout.dialog_fa_card_setting_view, (ViewGroup) null);
        this.d = viewInflate;
        ((TextView) viewInflate.findViewById(com.huawei.health.R.id.fa_setting_title)).setText(qre.f(com.huawei.health.R.string.IDS_fa_card_setting_title));
        TextView textView = (TextView) this.d.findViewById(com.huawei.health.R.id.fa_card_title);
        ImageView imageView = (ImageView) this.d.findViewById(com.huawei.health.R.id.fa_setting_cancel);
        ((ImageView) this.d.findViewById(com.huawei.health.R.id.fa_card_img)).setImageResource(i);
        textView.setText(str2);
        ((TextView) this.d.findViewById(com.huawei.health.R.id.fa_card_description)).setText(str3);
        final HealthButton healthButton = (HealthButton) this.d.findViewById(com.huawei.health.R.id.add_btn);
        healthButton.setOnTouchListener(new View.OnTouchListener() { // from class: ira.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    healthButton.setBackground(qre.c(com.huawei.health.R.drawable.fa_add_button_bg_down));
                    healthButton.setTextColor(qre.e(com.huawei.health.R.color.hw_show_public_text_color5));
                }
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                healthButton.setBackground(qre.c(com.huawei.health.R.drawable.fa_add_button_bg));
                healthButton.setTextColor(qre.e(com.huawei.health.R.color.color_ffffffff));
                return false;
            }
        });
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: iqz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37980a.e(str, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: irf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37990c.c(view);
            }
        });
        setContentView(this.d);
    }

    /* synthetic */ void e(String str, View view) {
        etv.b().addFACardToDesktop(600, str, new FaCardAgdsApi.OpenAgdsResultCallback() { // from class: ira.5
            @Override // com.huawei.health.facardagds.FaCardAgdsApi.OpenAgdsResultCallback
            public void onResponse(int i) {
                if (i == 5) {
                    qpx.e(BaseApplication.getContext(), com.huawei.health.R.string.IDS_fa_hint_recover_facard);
                    return;
                }
                if (i == 0 || i == 10) {
                    if (i == 10) {
                        qpx.e(ira.this.f37982a, qre.f(com.huawei.health.R.string.IDS_fa_card_setting_success));
                    }
                    ira.this.d();
                    return;
                }
                qpx.e(ira.this.f37982a, qre.f(com.huawei.health.R.string.IDS_fa_card_setting_fail));
            }
        });
    }

    /* synthetic */ void c(View view) {
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!e()) {
            ReleaseLogUtil.e("R_FaCardSettingDialog", "can't dismiss");
            return;
        }
        try {
            dismiss();
        } catch (Exception e) {
            LogUtil.e("FaCardSettingDialog", e.getMessage());
        }
    }

    private boolean e() {
        Context context = this.f37982a;
        if (!(context instanceof FaCardSettingActivity)) {
            return false;
        }
        FaCardSettingActivity faCardSettingActivity = (FaCardSettingActivity) context;
        return (faCardSettingActivity.isFinishing() || faCardSettingActivity.isDestroyed() || !isShowing()) ? false : true;
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog
    public void configDialog() {
        super.configDialog();
        if (this.d == null) {
            ReleaseLogUtil.e("FaCardSettingDialog", "mView is null");
        } else if (qrs.af(this.f37982a)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
            int iA = (int) qre.a(com.huawei.health.R.dimen.health_common_84dp);
            marginLayoutParams.setMarginStart(iA);
            marginLayoutParams.setMarginEnd(iA);
        }
    }
}
