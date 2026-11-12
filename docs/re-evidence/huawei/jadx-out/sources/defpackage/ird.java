package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.main.R;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class ird extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f37985c;
    private View d;

    public ird(Context context, String str, String str2, String str3, int i, String str4) {
        super(context, R.style.DialogFullScreen, 0);
        this.f37985c = context;
        b(str, str2, str3, i, str4);
    }

    private void b(String str, String str2, String str3, int i, final String str4) {
        LogUtil.a("HonorCardSettingDialog", "initView");
        View viewInflate = ((LayoutInflater) this.f37985c.getSystemService("layout_inflater")).inflate(com.huawei.health.R.layout.dialog_honor_card_setting_view, (ViewGroup) null);
        this.d = viewInflate;
        ((TextView) viewInflate.findViewById(com.huawei.health.R.id.honor_setting_title)).setText(qre.f(com.huawei.health.R.string.IDS_fa_card_setting_title));
        TextView textView = (TextView) this.d.findViewById(com.huawei.health.R.id.honor_card_title);
        ImageView imageView = (ImageView) this.d.findViewById(com.huawei.health.R.id.honor_setting_cancel);
        ((ImageView) this.d.findViewById(com.huawei.health.R.id.honor_card_img)).setImageResource(i);
        textView.setText(str2);
        ((TextView) this.d.findViewById(com.huawei.health.R.id.honor_card_description)).setText(str3);
        final HealthButton healthButton = (HealthButton) this.d.findViewById(com.huawei.health.R.id.add_btn);
        healthButton.setOnTouchListener(new View.OnTouchListener() { // from class: ird.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    healthButton.setBackground(qre.c(com.huawei.health.R.drawable.honor_add_button_bg_down));
                    healthButton.setTextColor(qre.e(com.huawei.health.R.color.hw_show_public_text_color5));
                }
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                healthButton.setBackground(qre.c(com.huawei.health.R.drawable.honor_add_button_bg));
                healthButton.setTextColor(qre.e(com.huawei.health.R.color.color_ffffffff));
                return false;
            }
        });
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: irh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37992c.d(str4, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: irg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37991a.d(view);
            }
        });
        setContentView(this.d);
    }

    /* synthetic */ void d(String str, View view) {
        a(str);
    }

    /* synthetic */ void d(View view) {
        dismiss();
    }

    private void a(String str) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setData(Uri.parse(str));
        try {
            this.f37985c.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            ReleaseLogUtil.a("R_HonorCardSettingDialog", "Device card has been removed");
            qpx.e(this.f37985c, com.huawei.health.R.string.IDS_honor_card_recover_hint);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog
    public void configDialog() {
        super.configDialog();
        if (this.d == null) {
            ReleaseLogUtil.e("HonorCardSettingDialog", "mView is null");
        } else if (qrs.af(this.f37985c)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
            int iA = (int) qre.a(com.huawei.health.R.dimen.health_common_84dp);
            marginLayoutParams.setMarginStart(iA);
            marginLayoutParams.setMarginEnd(iA);
        }
    }
}
