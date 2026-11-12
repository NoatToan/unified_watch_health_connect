package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import health.compact.a.SharedPreferenceManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class wnc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTextAlertDialog f52221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f52222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f52223c;
    private HealthCheckBox d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private HealthTextView k;
    private HealthTextView l;
    private HealthCheckBox m;
    private HealthTextView n;
    private HealthTextView o;
    private CustomViewDialog p;

    public void e(final Context context) {
        if (context == null) {
            return;
        }
        View viewInflate = View.inflate(context, R.layout.vmall_services_custom_view_dialog, null);
        wvi.c(context, viewInflate);
        c(context, viewInflate);
        a();
        e(context, viewInflate);
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(context).a(context.getString(R.string.IDS_hwh_vmall_privacy_change_notice)).b(viewInflate, 24, 0).c(context.getString(R.string.IDS_hw_show_cancel), new View.OnClickListener() { // from class: wnc.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("VmallPrivacyNotice", "negative button clicked");
            }
        }).a(context.getString(R.string.IDS_hwh_privacy_revoke_auth).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: wnc.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SharedPreferenceManager.e(context, "socialsharedpreference", Constants.IS_SIGN_VMALL_ARG, Boolean.toString(false), null);
                LogUtil.a("VmallPrivacyNotice", "user cancel sign vmall agr IS_SIGN_VMALL_ARG = false");
                CustomTextAlertDialog.Builder builderA = new CustomTextAlertDialog.Builder(context).a(R.string.IDS_settings_restore_factory_settings_dialog_title).b(R.string.IDS_hwh_vmall_revoke_auth_notice).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: wnc.1.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        LogUtil.d("VmallPrivacyNotice", "positive button clicked");
                    }
                });
                wnc.this.f52221a = builderA.b();
                wnc.this.f52221a.setCancelable(false);
                if (wnc.this.f52221a.isShowing()) {
                    return;
                }
                wnc.this.f52221a.show();
            }
        }).d();
        this.p = customViewDialogD;
        customViewDialogD.setCancelable(false);
        this.p.show();
    }

    private void c(Context context, View view) {
        if (context == null || view == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.hw_health_agree_dialog_recommend_layout);
        this.f52222b = linearLayout;
        linearLayout.setVisibility(8);
        this.g = (HealthTextView) view.findViewById(R.id.hw_health_service_item_one);
        this.j = (HealthTextView) view.findViewById(R.id.hw_health_service_item_two);
        this.f = (HealthTextView) view.findViewById(R.id.hw_health_service_item_three);
        this.e = (HealthTextView) view.findViewById(R.id.hw_health_service_item_four);
        this.k = (HealthTextView) view.findViewById(R.id.hw_health_service_item_five);
        this.n = (HealthTextView) view.findViewById(R.id.hw_health_service_item_six);
        this.f52223c = (HealthTextView) view.findViewById(R.id.hw_health_service_item_seven);
        this.o = (HealthTextView) view.findViewById(R.id.hw_health_service_item_eight);
        this.i = (HealthTextView) view.findViewById(R.id.hw_health_service_item_nine);
        this.h = (HealthTextView) view.findViewById(R.id.hw_health_service_item_ten);
        this.g.setText(context.getString(R.string.IDS_hwh_vmall_agreement_public_one));
        this.j.setText(context.getString(R.string.IDS_hwh_vmall_agreement_public_two));
        this.f.setText(context.getString(R.string.IDS_hwh_vmall_agreement_public_three));
        this.e.setText(context.getString(R.string.IDS_hwh_vmall_agreement_public_four));
        this.k.setText(context.getString(R.string.IDS_hwh_vmall_agreement_public_five));
        this.n.setText(context.getString(R.string.IDS_hwh_vmall_agreement_public_six));
        this.f52223c.setText(context.getString(R.string.IDS_hwh_vmall_agreement_public_seven));
        this.o.setText(context.getString(R.string.IDS_hwh_vmall_agreement_server_info));
        this.i.setText(context.getString(R.string.IDS_hwh_vmall_agreement_background));
        this.h.setText(context.getString(R.string.IDS_hwh_vmall_unagreement));
        this.m = (HealthCheckBox) view.findViewById(R.id.hw_health_agree_dialog_user_plan_box);
        this.d = (HealthCheckBox) view.findViewById(R.id.hw_health_agree_dialog_recommend_box);
        this.m.setChecked(niz.c());
        this.d.setChecked(!"0".equals(SharedPreferenceManager.e(context, Integer.toString(10000), "health_product_recommend")));
    }

    private void a() {
        this.m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: wnc.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ioi.d().e(11, z, null, null);
            }
        });
        this.d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: wnc.2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LogUtil.d("VmallPrivacyNotice", "handleLayout onCheckedChanged");
            }
        });
    }

    private void e(Context context, View view) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.hw_health_service_item_ele);
        this.l = healthTextView;
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        this.l.setHighlightColor(context.getResources().getColor(android.R.color.transparent));
        String string = context.getString(R.string.IDS_hwh_vmall_use_agreement);
        String strTrim = context.getString(R.string.IDS_hwh_vmall_privacy_statement).trim();
        SpannableString spannableString = new SpannableString(context.getString(R.string.IDS_hwh_vmall_user_agreement, string, strTrim));
        int iIndexOf = spannableString.toString().indexOf(string);
        if (iIndexOf >= 0) {
            wmt wmtVar = new wmt(context, "VmallUserAgreement");
            spannableString.setSpan(new TypefaceSpan(com.huawei.openalliance.ad.constant.Constants.FONT), iIndexOf, string.length() + iIndexOf, 33);
            spannableString.setSpan(wmtVar, iIndexOf, string.length() + iIndexOf, 17);
        }
        int iIndexOf2 = spannableString.toString().indexOf(strTrim);
        if (iIndexOf2 >= 0) {
            wmt wmtVar2 = new wmt(context, "VmallPrivacy");
            spannableString.setSpan(new TypefaceSpan(com.huawei.openalliance.ad.constant.Constants.FONT), iIndexOf2, strTrim.length() + iIndexOf2, 33);
            spannableString.setSpan(wmtVar2, iIndexOf2, strTrim.length() + iIndexOf2, 17);
        }
        this.l.setText(spannableString);
    }
}
