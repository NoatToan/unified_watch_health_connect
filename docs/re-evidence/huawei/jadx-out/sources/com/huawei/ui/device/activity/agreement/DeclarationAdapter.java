package com.huawei.ui.device.activity.agreement;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.util.EventBus;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.device.R;
import com.huawei.ui.device.declaration.xmlparser.DeclarationConstants;
import defpackage.lsy;
import defpackage.qrs;
import defpackage.qug;
import defpackage.rbg;
import defpackage.rbm;
import defpackage.rbu;
import defpackage.rbw;
import defpackage.rbx;
import defpackage.rby;
import defpackage.rbz;
import defpackage.rca;
import defpackage.rcb;
import defpackage.rcc;
import defpackage.rcd;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class DeclarationAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<rbg> f24191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private rbg f24192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24193c;
    private boolean d;
    private Context e;
    private CompoundButton.OnCheckedChangeListener f = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.agreement.DeclarationAdapter.3
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (DeclarationAdapter.this.f24192b != null) {
                String strC = DeclarationAdapter.this.f24192b.c();
                if (TextUtils.isEmpty(strC)) {
                    LogUtil.j("DeclarationAdapter", " featureId is empty");
                    return;
                }
                Bundle bundle = new Bundle();
                LogUtil.a("DeclarationAdapter", " featureId is :", strC);
                if ("hms_auto_update".equals(strC)) {
                    LogUtil.a("DeclarationAdapter", " featureId is HMS_AUTO_UPDATE :", Boolean.valueOf(z));
                    bundle.putInt("hms_auto_update", z ? 1 : 0);
                    EventBus.a(new EventBus.d("device_pair_aboard_switch_status", bundle));
                    return;
                }
                return;
            }
            LogUtil.j("DeclarationAdapter", " mDeclarationBean is null");
        }
    };
    private int g;
    private String i;
    private CustomAlertDialog j;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    public DeclarationAdapter(Context context, List<rbg> list, int i) {
        this.d = false;
        this.g = -1;
        this.e = context;
        this.f24191a = list;
        this.d = c(list);
        this.f24193c = GRSManager.c(context).getCommonCountryCode();
        this.g = i;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<rbg> list = this.f24191a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public rbg getItem(int i) {
        List<rbg> list = this.f24191a;
        if (list == null || list.isEmpty()) {
            LogUtil.j("DeclarationAdapter", "getItem: mData is null or empty.");
            return new rbg();
        }
        if (i < 0 || i > this.f24191a.size() - 1) {
            LogUtil.j("DeclarationAdapter", "getItem: illegal position.");
            return new rbg();
        }
        return this.f24191a.get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (i < 0 || i > this.f24191a.size() - 1) {
            LogUtil.j("DeclarationAdapter", "getItemViewType: illegal position.");
            return 0;
        }
        return this.f24191a.get(i).g();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        List<rbg> list = this.f24191a;
        if (list == null || list.isEmpty()) {
            LogUtil.j("DeclarationAdapter", "getView: mData is null or empty.");
            return new View(this.e);
        }
        if (i < 0 || i > this.f24191a.size() - 1) {
            LogUtil.j("DeclarationAdapter", "getView: illegal position.");
            return new View(this.e);
        }
        if (this.f24191a.get(i) == null) {
            LogUtil.j("DeclarationAdapter", "getView: the data of this position is null");
            return new View(this.e);
        }
        rbg rbgVar = this.f24191a.get(i);
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            return d(view, viewGroup, rbgVar);
        }
        if (itemViewType == 1) {
            return c(view, viewGroup, rbgVar);
        }
        View view2 = new View(this.e);
        LogUtil.j("DeclarationAdapter", "get view in default case");
        return view2;
    }

    private View d(View view, ViewGroup viewGroup, rbg rbgVar) {
        if (view == null) {
            view = LayoutInflater.from(this.e).inflate(R.layout.item_list_view_declaration_head, viewGroup, false);
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.tv_title);
            if (rbgVar != null && healthTextView != null) {
                String strJ = rbgVar.j();
                if (!TextUtils.isEmpty(strJ)) {
                    healthTextView.setText(qug.a(strJ));
                }
            }
        }
        return view;
    }

    private View c(View view, ViewGroup viewGroup, rbg rbgVar) {
        c cVar;
        if (TextUtils.isEmpty(rbgVar.c())) {
            LogUtil.j("DeclarationAdapter", "getBodyItemView: featureId is null or emtpy.");
            return new View(this.e);
        }
        if (view == null) {
            view = LayoutInflater.from(this.e).inflate(R.layout.item_list_view_declaration_body, viewGroup, false);
            cVar = new c(view);
            view.setTag(cVar);
        } else {
            Object tag = view.getTag();
            cVar = tag instanceof c ? (c) tag : null;
        }
        if (cVar == null) {
            LogUtil.j("DeclarationAdapter", "getBodyItemView: bodyViewHolder is null.");
            return new View(this.e);
        }
        e(cVar, rbgVar);
        return view;
    }

    private void e(c cVar, rbg rbgVar) {
        if (cVar == null || rbgVar == null) {
            LogUtil.j("DeclarationAdapter", "setValue some thing is null");
            return;
        }
        a(cVar, rbgVar);
        cVar.f24208b.removeAllViews();
        List<rbx> listE = rbgVar.e();
        if (listE == null || listE.isEmpty()) {
            return;
        }
        c(cVar, listE, rbgVar);
    }

    private void a(c cVar, rbg rbgVar) {
        if (cVar.h.getParent() != null && rbgVar.n()) {
            d(cVar, cVar.h);
        }
        if (cVar.j.getParent() != null && rbgVar.f()) {
            d(cVar, cVar.j);
        }
        String strJ = rbgVar.j();
        int i = 0;
        if (TextUtils.isEmpty(strJ)) {
            cVar.f24209c.setVisibility(8);
        } else {
            cVar.f24209c.setVisibility(0);
            cVar.f24209c.setText(qug.a(strJ));
        }
        if (cVar.d) {
            cVar.f24207a.setOnCheckedChangeListener(null);
            if ("select_all_enhanced_services".equals(rbgVar.c())) {
                cVar.f24207a.setChecked(c(this.f24191a));
            } else {
                cVar.f24207a.setChecked(rbgVar.i());
            }
        }
        if (!rbgVar.f() && !rbgVar.n()) {
            i = 8;
        }
        if (cVar.d) {
            cVar.f24207a.setVisibility(i);
        }
        d(cVar, rbgVar);
    }

    private void d(c cVar, ViewStub viewStub) {
        View viewInflate = viewStub.inflate();
        if (viewInflate != null) {
            cVar.d = true;
            cVar.f24207a = (HealthCheckBox) viewInflate.findViewById(R.id.checkbox);
        }
    }

    private void d(c cVar, final rbg rbgVar) {
        if (!cVar.d) {
            LogUtil.j("DeclarationAdapter", "addCheckedListener: do not have checkbox.");
        } else {
            cVar.f24207a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.agreement.DeclarationAdapter.4
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    LogUtil.a("DeclarationAdapter", "enter setOnCheckedChangeListener");
                    if (!"select_all_enhanced_services".equals(rbgVar.c())) {
                        for (rbg rbgVar2 : DeclarationAdapter.this.f24191a) {
                            String strC = rbgVar2.c();
                            if (!TextUtils.isEmpty(strC) && strC.equals(rbgVar.c())) {
                                rbgVar2.a(z);
                            }
                        }
                        for (rbg rbgVar3 : DeclarationAdapter.this.f24191a) {
                            if ("select_all_enhanced_services".equals(rbgVar3.c())) {
                                DeclarationAdapter declarationAdapter = DeclarationAdapter.this;
                                rbgVar3.a(declarationAdapter.c((List<rbg>) declarationAdapter.f24191a));
                            }
                        }
                        DeclarationAdapter.this.notifyDataSetChanged();
                        return;
                    }
                    if ("select_all_enhanced_services".equals(rbgVar.c())) {
                        LogUtil.a("DeclarationAdapter", "enter equals All Enhanced services");
                        DeclarationAdapter declarationAdapter2 = DeclarationAdapter.this;
                        if (declarationAdapter2.e((List<rbg>) declarationAdapter2.f24191a)) {
                            DeclarationAdapter.this.d = false;
                        } else {
                            DeclarationAdapter declarationAdapter3 = DeclarationAdapter.this;
                            declarationAdapter3.d = declarationAdapter3.c((List<rbg>) declarationAdapter3.f24191a);
                        }
                        DeclarationAdapter declarationAdapter4 = DeclarationAdapter.this;
                        declarationAdapter4.d = !declarationAdapter4.d;
                        Iterator it = DeclarationAdapter.this.f24191a.iterator();
                        while (it.hasNext()) {
                            ((rbg) it.next()).a(DeclarationAdapter.this.d);
                        }
                        LogUtil.a("DeclarationAdapter", "mIsSelectAll", Boolean.valueOf(DeclarationAdapter.this.d));
                        DeclarationAdapter.this.notifyDataSetChanged();
                        return;
                    }
                    LogUtil.a("DeclarationAdapter", "bean.getFeatureId()", rbgVar.c());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(List<rbg> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        for (rbg rbgVar : list) {
            if (rbgVar != null && !TextUtils.isEmpty(rbgVar.c()) && !"select_all_enhanced_services".equals(rbgVar.c()) && !rbgVar.i()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(List<rbg> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        for (rbg rbgVar : list) {
            if (rbgVar != null && !TextUtils.isEmpty(rbgVar.c()) && !"select_all_enhanced_services".equals(rbgVar.c()) && rbgVar.i()) {
                return false;
            }
        }
        return true;
    }

    private void d(HealthTextView healthTextView) {
        if (healthTextView == null) {
            LogUtil.j("DeclarationAdapter", "addSwitchFaceListener textView is null");
        } else {
            healthTextView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.agreement.DeclarationAdapter.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(DeclarationAdapter.this.e, (Class<?>) HmsAutoUpdateActivity.class);
                        if (DeclarationAdapter.this.e instanceof AboardHmsDeclarationActivity) {
                            AboardHmsDeclarationActivity aboardHmsDeclarationActivity = (AboardHmsDeclarationActivity) DeclarationAdapter.this.e;
                            intent.putExtra("hms_auto_update", aboardHmsDeclarationActivity.a());
                            intent.putExtra("pairGuideSelectAddress", aboardHmsDeclarationActivity.d());
                            intent.putExtra("device_country_code", aboardHmsDeclarationActivity.c());
                            intent.putExtra("device_emui_version", aboardHmsDeclarationActivity.e());
                            intent.putExtra("device_name", aboardHmsDeclarationActivity.b());
                            intent.putExtra("device_version_type", DeclarationAdapter.this.g);
                        }
                        DeclarationAdapter.this.e.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        LogUtil.e("DeclarationAdapter", "ActivityNotFoundException e:", e.getMessage());
                    }
                }
            });
        }
    }

    private void c(c cVar, rbg rbgVar) {
        if (cVar.f == null) {
            LogUtil.j("DeclarationAdapter", " mToggleButton is null");
        } else {
            this.f24192b = rbgVar;
            cVar.f.setOnCheckedChangeListener(this.f);
        }
    }

    private void c(c cVar, List<rbx> list, rbg rbgVar) {
        View viewE;
        for (rbx rbxVar : list) {
            if (!(rbxVar instanceof rbw)) {
                if (rbxVar instanceof rby) {
                    if (rbxVar instanceof rbz) {
                        viewE = a((rbz) rbxVar, cVar.f24208b, rbgVar);
                        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) viewE.findViewById(R.id.switch_button);
                        c(healthSwitchButton, rbgVar);
                        LogUtil.a("DeclarationAdapter", " enter addToggleButtonChangedListener");
                        cVar.f = healthSwitchButton;
                        c(cVar, rbgVar);
                    } else {
                        viewE = e((rby) rbxVar, cVar.f24208b, rbgVar);
                    }
                    cVar.f24208b.addView(viewE);
                } else if (!(rbxVar instanceof rca)) {
                    LogUtil.j("DeclarationAdapter", "setValue in for loop unknown part type");
                } else {
                    View viewC = c((rca) rbxVar, cVar.f24208b);
                    cVar.f24208b.addView(viewC);
                    cVar.e = (HealthTextView) viewC.findViewById(R.id.text_view_switch);
                    c(cVar.e, rbgVar);
                    d(cVar.e);
                }
            } else {
                cVar.f24208b.addView(d((rbw) rbxVar, cVar.f24208b, rbgVar));
            }
        }
    }

    private void c(HealthSwitchButton healthSwitchButton, rbg rbgVar) {
        if (healthSwitchButton != null) {
            healthSwitchButton.setChecked(rbgVar.i());
        }
    }

    private void c(HealthTextView healthTextView, rbg rbgVar) {
        if (healthTextView != null) {
            healthTextView.setText(qug.a(a(rbgVar.i() ? DeclarationConstants.SwitchFaceState.Enabled : DeclarationConstants.SwitchFaceState.Disabled)));
        }
    }

    private View c(rca rcaVar, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.item_list_view_declaration_body_switch_face, viewGroup, false);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.text_view_name);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.text_view_description);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_next);
        Drawable drawable = this.e.getResources().getDrawable(R.drawable.common_ui_arrow_right);
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
        imageView.setBackgroundDrawable(drawable);
        healthTextView.setText(rcaVar.b());
        rbu rbuVarA = rcaVar.a();
        ((HealthTextView) viewInflate.findViewById(R.id.text_view_switch)).setText(a(rbuVarA.e()));
        if (TextUtils.isEmpty(rbuVarA.a())) {
            healthTextView2.setVisibility(8);
            return viewInflate;
        }
        healthTextView2.setVisibility(0);
        healthTextView2.setText(qug.a(rbuVarA.a()));
        return viewInflate;
    }

    private String a(DeclarationConstants.SwitchFaceState switchFaceState) {
        int i;
        if (switchFaceState == DeclarationConstants.SwitchFaceState.Disabled) {
            i = R.string.IDS_startup_hms_disabled;
        } else if (switchFaceState == DeclarationConstants.SwitchFaceState.Enabled) {
            i = R.string.IDS_startup_hms_enabled;
        } else {
            LogUtil.j("DeclarationAdapter", "getSwitchText: unknown state");
            i = 0;
        }
        return i == 0 ? "" : this.e.getString(i);
    }

    private View e(rby rbyVar, ViewGroup viewGroup, rbg rbgVar) {
        LogUtil.a("DeclarationAdapter", "checkbox");
        View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.item_list_view_declaration_body_check_box, viewGroup, false);
        ((HealthTextView) viewInflate.findViewById(R.id.text_view_name)).setText(qug.a(rbyVar.d()));
        ((HealthTextView) viewInflate.findViewById(R.id.text_view_description)).setText(qug.a(rbyVar.a()));
        HealthCheckBox healthCheckBox = (HealthCheckBox) viewInflate.findViewById(R.id.checkbox);
        if (rbgVar == null) {
            healthCheckBox.setChecked(rbyVar.c().c());
            return viewInflate;
        }
        healthCheckBox.setChecked(rbgVar.i());
        return viewInflate;
    }

    private View a(rbz rbzVar, ViewGroup viewGroup, rbg rbgVar) {
        LogUtil.a("DeclarationAdapter", "ToggleButton");
        View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.item_list_view_declaration_toggle, viewGroup, false);
        ((HealthTextView) viewInflate.findViewById(R.id.toggle_text_view_name)).setText(rbzVar.d());
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.toggle_text_view_description);
        List<rcb> listE = rbzVar.e();
        String strA = rbzVar.a();
        if (listE != null && !listE.isEmpty()) {
            healthTextView.setText(a(listE, strA, 0, rbgVar));
            return viewInflate;
        }
        healthTextView.setText(strA);
        return viewInflate;
    }

    private View d(rbw rbwVar, ViewGroup viewGroup, rbg rbgVar) {
        View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.item_list_view_declaration_body_paragraph, viewGroup, false);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.text_view_content);
        if (rbwVar != null && rbwVar.b() != null) {
            String strA = qug.a(rbwVar.b().replace("\\n", System.lineSeparator()));
            List<rcb> listE = rbwVar.e();
            if (listE != null && !listE.isEmpty()) {
                SpannableStringBuilder spannableStringBuilderA = a(listE, strA, R.color.emui_accent, rbgVar);
                healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
                healthTextView.setText(spannableStringBuilderA);
                return viewInflate;
            }
            healthTextView.setText(strA);
        }
        return viewInflate;
    }

    private SpannableStringBuilder a(List<rcb> list, String str, final int i, final rbg rbgVar) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("DeclarationAdapter", "parsePlaceHolder is null :", list);
            return new SpannableStringBuilder("");
        }
        int size = list.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = list.get(i2).c();
        }
        if (size != str.split("%[1-9]{1}[0-9]{0,}\\$[sdifgoxXeEaA]").length - 1) {
            LogUtil.j("DeclarationAdapter", "The lengths of placeholdersValues and format do not match.");
            OpAnalyticsUtil.getInstance().setRiskWarningEvent("parseOOBEPlaceHolder", "The lengths of placeholdersValues and format do not match." + str);
        }
        String str2 = String.format(Locale.ENGLISH, str, strArr);
        LogUtil.a("DeclarationAdapter", "parsePlaceHolder value:", str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        for (final rcb rcbVar : list) {
            String strC = rcbVar.c();
            if (str2.contains(strC)) {
                spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.huawei.ui.device.activity.agreement.DeclarationAdapter.2
                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        if (!d() || i == 0) {
                            textPaint.setColor(DeclarationAdapter.this.e.getResources().getColor(R.color.textColorPrimary));
                        } else {
                            textPaint.setColor(DeclarationAdapter.this.e.getResources().getColor(i));
                        }
                        textPaint.setUnderlineText(false);
                    }

                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        DeclarationAdapter.this.a(rcbVar, rbgVar);
                    }

                    private boolean d() {
                        DeclarationConstants.PlaceholderType placeholderTypeD = rcbVar.d();
                        return placeholderTypeD == DeclarationConstants.PlaceholderType.URL || placeholderTypeD == DeclarationConstants.PlaceholderType.JSON;
                    }
                }, str2.indexOf(strC), str2.indexOf(strC) + strC.length(), 33);
            }
        }
        LogUtil.a("DeclarationAdapter", "getParagraphView stringBuilder.toString():", spannableStringBuilder.toString());
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(rcb rcbVar, rbg rbgVar) {
        if (rcbVar instanceof rcd) {
            a((rcd) rcbVar, rbgVar);
        } else if (rcbVar instanceof rcc) {
            d((rcc) rcbVar);
        } else {
            LogUtil.j("DeclarationAdapter", "parsePlaceHolder#SpannableStringBuilder#onClick not supported placeholder.");
        }
    }

    private void a(final rcd rcdVar, rbg rbgVar) {
        if (rcdVar == null) {
            LogUtil.j("DeclarationAdapter", "handleUrl： urlPlaceholder is null.");
            return;
        }
        final String strA = rcdVar.a();
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("DeclarationAdapter", "handleUrl：url is null or empty.");
            return;
        }
        int iE = CommonUtil.e(rcdVar.e(), -1);
        if (iE == 1) {
            this.i = rbgVar.a();
        } else if (iE == 2) {
            this.i = rbgVar.d();
        } else {
            this.i = "";
            LogUtil.j("DeclarationAdapter", "handleUrl：unknown flag: ", Integer.valueOf(iE));
        }
        if (TextUtils.isEmpty(this.i)) {
            LogUtil.j("DeclarationAdapter", "handleUrl：version is null or empty.");
        } else {
            lsy.a(new Runnable() { // from class: com.huawei.ui.device.activity.agreement.DeclarationAdapter.1
                @Override // java.lang.Runnable
                public void run() {
                    String strB = DeclarationAdapter.this.b();
                    String strB2 = rcdVar.b();
                    String str = String.format(Locale.ENGLISH, "country=%1$s&branchid=%2$s&version=%3$s&language=%4$s", DeclarationAdapter.this.f24193c, strB2, DeclarationAdapter.this.i, strB);
                    if (DeclarationAdapter.this.g == 99 && strA.toLowerCase().contains("code")) {
                        str = String.format(Locale.ENGLISH, "branchid=%1$s&version=%2$s&language=%3$s", strB2, DeclarationAdapter.this.i, strB);
                    }
                    qug.c(DeclarationAdapter.this.e, strA + str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        Locale locale = Locale.getDefault();
        String script = locale.getScript();
        String language = locale.getLanguage();
        if (!TextUtils.isEmpty(script)) {
            language = language + Constants.LINK + script;
        }
        return language + Constants.LINK + locale.getCountry();
    }

    private void d(rcc rccVar) {
        if (rccVar == null) {
            LogUtil.j("DeclarationAdapter", "handleJson： jsonPlaceholder is null.");
            return;
        }
        rbm rbmVarB = rccVar.b();
        LogUtil.a("DeclarationAdapter", "handleJson：", rbmVarB);
        c(rbmVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c() {
        Resources resources = BaseApplication.getContext().getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", OsType.ANDROID));
        }
        return 0;
    }

    private void c(rbm rbmVar) {
        if (rbmVar == null || rbmVar.e() == null) {
            LogUtil.j("DeclarationAdapter", "showPermissionsDialog： permissionsNote note is null or permission list is null");
            return;
        }
        final CustomAlertDialog customAlertDialogE = e();
        ((HealthTextView) customAlertDialogE.findViewById(R.id.text_view_title)).setText(qug.a(rbmVar.c()));
        ((HealthTextView) customAlertDialogE.findViewById(R.id.text_view_description)).setText(qug.a(rbmVar.a()));
        ((ListView) customAlertDialogE.findViewById(R.id.list_view_content)).setAdapter((ListAdapter) new PermissionsDialogAdapter(this.e, rbmVar.e()));
        customAlertDialogE.show();
        if (this.e instanceof EnhancementImprovementActivity) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.device.activity.agreement.DeclarationAdapter.10
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Thread.sleep(100L);
                        EnhancementImprovementActivity enhancementImprovementActivity = (EnhancementImprovementActivity) DeclarationAdapter.this.e;
                        final LinearLayout linearLayout = (LinearLayout) customAlertDialogE.findViewById(R.id.permission_note_layout);
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        enhancementImprovementActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        final int iC = (displayMetrics.heightPixels - DeclarationAdapter.this.c()) - qrs.d(BaseApplication.getContext(), 64.0f);
                        int measuredHeight = linearLayout.getMeasuredHeight();
                        LogUtil.a("DeclarationAdapter", "measureHeight：", Integer.valueOf(measuredHeight), "endHeight:", Integer.valueOf(iC));
                        if (measuredHeight > iC) {
                            enhancementImprovementActivity.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.agreement.DeclarationAdapter.10.5
                                @Override // java.lang.Runnable
                                public void run() {
                                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                                    layoutParams.height = iC;
                                    linearLayout.setLayoutParams(layoutParams);
                                }
                            });
                        }
                    } catch (InterruptedException unused) {
                        LogUtil.e("DeclarationAdapter", "InterruptedException");
                    }
                }
            });
        }
    }

    private CustomAlertDialog e() {
        CustomAlertDialog customAlertDialog = this.j;
        if (customAlertDialog != null) {
            if (customAlertDialog.isShowing()) {
                this.j.dismiss();
            }
            return this.j;
        }
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.e).a(View.inflate(this.e, R.layout.dialog_layout_declaration_permissions_note, null)).a(R.string.IDS_startup_permissions_known, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.agreement.DeclarationAdapter.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                DeclarationAdapter.this.d();
            }
        }).b();
        this.j = customAlertDialogB;
        return customAlertDialogB;
    }

    public void d() {
        CustomAlertDialog customAlertDialog = this.j;
        if (customAlertDialog == null) {
            LogUtil.j("DeclarationAdapter", "dismissPermissionDialog: permission dialog is null.");
            return;
        }
        if (customAlertDialog.isShowing()) {
            this.j.dismiss();
        }
        this.j = null;
    }

    public static class PermissionsDialogAdapter extends BaseAdapter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<rbm.a> f24205c;
        private Context d;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public PermissionsDialogAdapter(Context context, List<rbm.a> list) {
            this.d = context;
            this.f24205c = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<rbm.a> list = this.f24205c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public rbm.a getItem(int i) {
            List<rbm.a> list = this.f24205c;
            if (list == null) {
                LogUtil.j("DeclarationAdapter", "mPermissions is null.");
                return new rbm.a();
            }
            if (i < 0 || i >= list.size()) {
                LogUtil.a("DeclarationAdapter", "invalid index of mPermissions.");
                return new rbm.a();
            }
            return this.f24205c.get(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            b bVar = null;
            Object[] objArr = 0;
            if (view == null) {
                view = LayoutInflater.from(this.d).inflate(R.layout.item_list_view_dialog_layout_declaration_permissions_note, viewGroup, false);
                b bVar2 = new b(view);
                view.setTag(bVar2);
                bVar = bVar2;
            } else {
                Object tag = view.getTag();
                if (tag instanceof b) {
                    bVar = (b) tag;
                }
            }
            if (bVar == null) {
                LogUtil.j("DeclarationAdapter", "PermissionsDialogAdapter#getView: viewHolder is null.");
                return new View(this.d);
            }
            List<rbm.a> list = this.f24205c;
            if (list == null) {
                LogUtil.j("DeclarationAdapter", "PermissionsDialogAdapter#getView: mPermissions is null.");
                return new View(this.d);
            }
            if (i < 0 || i >= list.size()) {
                LogUtil.a("DeclarationAdapter", "PermissionsDialogAdapter#getView: invalid index of mPermissions.");
                return new View(this.d);
            }
            rbm.a aVar = this.f24205c.get(i);
            if (aVar == null) {
                return new View(this.d);
            }
            bVar.f24206a.setText(qug.a(aVar.d()));
            bVar.e.setText(qug.a(aVar.b()));
            return view;
        }

        static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private HealthTextView f24206a;
            private HealthTextView e;

            private b(View view) {
                this.f24206a = (HealthTextView) view.findViewById(R.id.text_view_sub_title);
                this.e = (HealthTextView) view.findViewById(R.id.text_view_sub_description);
            }
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthCheckBox f24207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LinearLayout f24208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f24209c;
        private boolean d;
        private HealthTextView e;
        private HealthSwitchButton f;
        private ViewStub h;
        private ViewStub j;

        c(View view) {
            if (view == null) {
                LogUtil.j("DeclarationAdapter", "BodyViewHolder view is null");
                return;
            }
            this.h = (ViewStub) view.findViewById(R.id.view_stub_start);
            this.f24209c = (HealthTextView) view.findViewById(R.id.text_view_title);
            this.j = (ViewStub) view.findViewById(R.id.view_stub_end);
            this.f24208b = (LinearLayout) view.findViewById(R.id.ll_content);
            this.f = (HealthSwitchButton) view.findViewById(R.id.switch_button);
        }
    }
}
