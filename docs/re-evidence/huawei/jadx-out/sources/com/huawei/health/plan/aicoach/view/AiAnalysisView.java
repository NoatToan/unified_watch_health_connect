package com.huawei.health.plan.aicoach.view;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.plan.aicoach.ControlTypeEnum;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.gfl;
import defpackage.gfo;
import defpackage.gfr;
import defpackage.gft;
import defpackage.gfu;
import defpackage.gfv;
import defpackage.gfz;
import defpackage.njy;
import defpackage.qre;
import defpackage.qsw;
import defpackage.qsx;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class AiAnalysisView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f8524b;
    private LinearLayout e;
    private LinearLayout f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthTextView i;
    private String j;
    private HealthImageView k;
    private HealthImageView l;
    private HealthTextView m;
    private boolean n;
    private boolean o;
    private HealthImageView q;
    private int r;
    private static final int[] d = {-22151, -35034, -40115, -39820, -3966209, -11165212};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f8523c = {0.0f, 0.24f, 0.43f, 0.62f, 0.81f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f8522a = Pattern.compile("\\n+");

    public AiAnalysisView(Context context) {
        super(context);
        this.o = false;
        this.j = null;
        this.r = 2;
        this.n = false;
        a();
    }

    public AiAnalysisView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = false;
        this.j = null;
        this.r = 2;
        this.n = false;
        a();
    }

    public AiAnalysisView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = false;
        this.j = null;
        this.r = 2;
        this.n = false;
        a();
    }

    private void a() {
        inflate(getContext(), R.layout.ai_analysis_detail_layout, this);
        this.e = (LinearLayout) findViewById(R.id.ai_analysis_layout);
        this.q = (HealthImageView) findViewById(R.id.iv_watch);
        this.l = (HealthImageView) findViewById(R.id.iv_down_arrow);
        this.k = (HealthImageView) findViewById(R.id.iv_up_arrow);
        this.f8524b = (HealthTextView) findViewById(R.id.copyright_text_view);
        this.g = (HealthTextView) findViewById(R.id.default_text_view);
        this.i = (HealthTextView) findViewById(R.id.default_title_text_view);
        this.f = (LinearLayout) findViewById(R.id.default_title_layout);
        this.m = (HealthTextView) findViewById(R.id.guide_text_view);
        this.h = (HealthTextView) findViewById(R.id.ai_analysis_title);
        d();
    }

    public void e(LinkedHashMap<Integer, gfl> linkedHashMap) {
        c(linkedHashMap);
    }

    private void d() {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: gfq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35035a.a(view);
            }
        };
        this.l.setOnClickListener(onClickListener);
        this.k.setOnClickListener(onClickListener);
    }

    public /* synthetic */ void a(View view) {
        boolean z = !this.o;
        this.o = z;
        b(z);
    }

    private void c(LinearLayout linearLayout) {
        this.l.setVisibility(8);
        this.k.setVisibility(0);
        this.f8524b.setVisibility(0);
        linearLayout.setVisibility(0);
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        if (TextUtils.isEmpty(this.j)) {
            return;
        }
        this.m.setMaxLines(Integer.MAX_VALUE);
    }

    private void d(LinearLayout linearLayout) {
        this.k.setVisibility(8);
        this.l.setVisibility(0);
        linearLayout.setVisibility(8);
        this.f8524b.setVisibility(8);
        if (!TextUtils.isEmpty(this.j)) {
            c();
        } else {
            e();
        }
    }

    private void c() {
        this.m.setMaxLines(this.r);
        this.f.setVisibility(8);
        this.g.setVisibility(8);
    }

    private void e() {
        this.f.setVisibility(0);
        this.g.setVisibility(0);
    }

    private void b(boolean z) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.content_container);
        if (z) {
            c(linearLayout);
        } else {
            d(linearLayout);
        }
    }

    private void c(LinkedHashMap<Integer, gfl> linkedHashMap) {
        if (njy.e(linkedHashMap)) {
            ReleaseLogUtil.e("AiAnalysisView", "processAICoachResponse data is empty.");
            return;
        }
        gfl gflVar = linkedHashMap.get(0);
        if (gflVar == null || gflVar.e() == null) {
            ReleaseLogUtil.e("AiAnalysisView", "processAICoachResponse content is null.");
            return;
        }
        List<gfo> listC = gflVar.e().c();
        if (njy.e(listC)) {
            ReleaseLogUtil.e("AiAnalysisView", "processAICoachResponse controlData is empty.");
        } else {
            c(listC);
        }
    }

    private void c(List<gfo> list) {
        boolean z = false;
        gfz gfzVar = null;
        gft gftVar = null;
        gfr gfrVar = null;
        gfv gfvVar = null;
        int iC = 0;
        for (gfo gfoVar : list) {
            if (gfoVar != null) {
                String strA = gfoVar.a();
                String strC = gfoVar.c();
                if (!TextUtils.isEmpty(strC)) {
                    LogUtil.a("AiAnalysisView", "contentStr =" + strC);
                    if (ControlTypeEnum.PARALLEL_SUB_CONTROL.getControlType().equals(strA)) {
                        gftVar = (gft) HiJsonUtil.d(strC, gft.class);
                    } else if (ControlTypeEnum.SUMMARY_CONTROL.getControlType().equals(strA)) {
                        gfrVar = (gfr) HiJsonUtil.d(strC, gfr.class);
                    } else if (ControlTypeEnum.INPUT_GUIDE_TEXT_CONTROL.getControlType().equals(strA)) {
                        gfvVar = (gfv) HiJsonUtil.d(strC, gfv.class);
                    } else if (ControlTypeEnum.PARALLEL_CONTROL.getControlType().equals(strA)) {
                        gfzVar = (gfz) HiJsonUtil.d(strC, gfz.class);
                    } else if (ControlTypeEnum.CONTROL_RESULT.getControlType().equals(strA)) {
                        iC = c(strC);
                    }
                }
            }
        }
        if (iC == 27007) {
            z = true;
        } else if (iC != 27008) {
            ReleaseLogUtil.e("AiAnalysisView", "processControlData resultCode:", Integer.valueOf(iC));
            return;
        }
        c(gfzVar, gftVar, gfrVar, gfvVar, z);
    }

    private void c(gfz gfzVar, gft gftVar, gfr gfrVar, gfv gfvVar, boolean z) {
        boolean zO = Utils.o();
        if (zO) {
            if (gfvVar == null) {
                ReleaseLogUtil.e("AiAnalysisView", "updateAiAnalysisView inputGuideTextControl is null");
                return;
            } else {
                this.e.setVisibility(0);
                this.j = gfvVar.e();
                this.r = Integer.MAX_VALUE;
            }
        } else if (gfrVar == null || gftVar == null) {
            ReleaseLogUtil.e("AiAnalysisView", "updateAiAnalysisView summaryControl or parallelSubControl is null");
            return;
        } else {
            this.e.setVisibility(0);
            this.j = gfrVar.e();
            this.r = z ? 3 : 2;
        }
        if (zO) {
            a(gfzVar);
        } else {
            e(gftVar);
        }
        d(this.j);
        e(gfrVar, z);
        b(z, zO);
    }

    private void b(boolean z, boolean z2) {
        if (z) {
            this.e.setBackground(new qsx());
            this.q.setImageResource(R.drawable.ic_training_plan_ai);
            this.f8524b.setTextColor(qre.e(R.color.common_black_20alpha));
            this.f8524b.setTextSize(10.0f);
            ViewGroup.LayoutParams layoutParams = this.f8524b.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMargins(0, qre.b(R.dimen.health_common_12dp), 0, 0);
                this.f8524b.setLayoutParams(layoutParams2);
            }
            this.m.setTypeface(Typeface.createFromAsset(BaseApplication.b().getAssets(), "fonts/Harmony-Heavy.ttf"));
            this.m.setTextColor(qre.e(R.color.emui_primary));
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(this.h.getTextSize());
            textPaint.setTypeface(this.h.getTypeface());
            this.h.getPaint().setShader(new LinearGradient(0.0f, 0.0f, textPaint.measureText(this.h.getText().toString()), 0.0f, d, f8523c, Shader.TileMode.CLAMP));
            this.h.invalidate();
        } else {
            this.q.setImageResource(R.drawable.sportwatch);
            this.f8524b.setTextColor(qre.e(R.color.colorAccent));
            this.f8524b.setTextSize(12.0f);
            this.h.setTextColor(qre.e(R.color.emui_color_text_secondary));
            this.e.setBackground(new qsw());
            this.m.setTextColor(qre.e(R.color.emui_color_text_secondary));
        }
        if (z2) {
            this.l.setVisibility(8);
            this.k.setVisibility(8);
        }
    }

    private void e(gft gftVar) {
        HealthTextView healthTextView;
        if (gftVar == null) {
            return;
        }
        String strE = gftVar.e();
        String strD = gftVar.d();
        if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(strD) || (healthTextView = this.h) == null || this.f8524b == null) {
            return;
        }
        healthTextView.setText(strE);
        this.f8524b.setText(strD);
    }

    private void a(gfz gfzVar) {
        HealthTextView healthTextView;
        if (gfzVar == null) {
            return;
        }
        String strA = gfzVar.a();
        if (TextUtils.isEmpty(strA) || (healthTextView = this.h) == null) {
            return;
        }
        healthTextView.setText(strA);
    }

    private void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.m.setText(str);
        this.m.setMaxLines(this.r);
        this.m.setVisibility(0);
        this.g.setVisibility(8);
        this.f.setVisibility(8);
    }

    private void e(gfr gfrVar, boolean z) {
        if (gfrVar == null) {
            return;
        }
        List<gfu> listD = gfrVar.d();
        if (njy.e(listD)) {
            return;
        }
        Iterator<gfu> it = listD.iterator();
        while (it.hasNext()) {
            e(it.next(), z);
        }
    }

    private void e(gfu gfuVar, boolean z) {
        View viewInflate;
        String strE = gfuVar.e();
        String strD = gfuVar.d();
        if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(strD)) {
            return;
        }
        String strReplaceAll = f8522a.matcher(strD.trim()).replaceAll("\n");
        if (z) {
            viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.textdetail_view_item_vip, (ViewGroup) null);
        } else {
            viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.textdetail_view_item, (ViewGroup) null);
        }
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.titleTextView);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.contentTextView);
        healthTextView.setText(strE);
        healthTextView2.setText(strReplaceAll);
        if (!this.n) {
            this.n = true;
            this.g.setText(strReplaceAll);
            this.i.setText(strE);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.content_container);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, qre.b(R.dimen.health_common_12dp), 0, 0);
        viewInflate.setLayoutParams(layoutParams);
        if (linearLayout != null) {
            linearLayout.addView(viewInflate);
        }
    }

    private int c(String str) {
        try {
            return new JSONObject(str).optInt("resultCode", -1);
        } catch (JSONException e) {
            ReleaseLogUtil.a("AiAnalysisView", "parseResultCode exception", e);
            return 0;
        }
    }
}
