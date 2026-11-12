package com.huawei.ui.main.stories.fitness.activity.coresleep.utils;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.oval.HealthOval;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.coresleep.SleepBootMaskingLayerView;
import defpackage.lsy;
import defpackage.qre;
import defpackage.qri;
import defpackage.uck;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class SleepBootPagerHelper extends BaseBootPagerHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26873a;

    public SleepBootPagerHelper(Context context) {
        super(context);
        this.f26873a = true;
    }

    public boolean c() {
        String strC = uck.c(this.mContext, getSharePreferenceString());
        return "default_value".equals(strC) || String.valueOf(true).equals(strC);
    }

    public void d(boolean z) {
        this.f26873a = z;
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BaseBootPagerHelper
    public void showBootPage(final LinearLayout linearLayout) {
        if (linearLayout == null && this.mContainer == null) {
            return;
        }
        lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.utils.SleepBootPagerHelper.5
            @Override // java.lang.Runnable
            public void run() {
                if (!SleepBootPagerHelper.this.c()) {
                    if (SleepBootPagerHelper.this.mHealthPageResTrigger != null) {
                        SleepBootPagerHelper.this.mHealthPageResTrigger.setIsFirstEntryNoDataSleep(false);
                        return;
                    }
                    return;
                }
                SleepBootPagerHelper.this.showBootPageInner(linearLayout);
            }
        });
    }

    public void c(LinearLayout linearLayout) {
        if (this.mBootPageView == null || this.mBootPageView.getVisibility() != 0) {
            ReleaseLogUtil.d("SleepBootPagerHelper", "onConfigurationChanged mBootPageView is null");
        } else {
            this.mContainer = null;
            showBootPageInner(linearLayout);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BaseBootPagerHelper
    protected void configBootPage(LinearLayout linearLayout) {
        if (!this.f26873a || linearLayout == null) {
            return;
        }
        this.mContainer = linearLayout;
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.sleep_aasm_boot_page_layout, (ViewGroup) linearLayout, false);
        this.mBootPageView = (SleepBootMaskingLayerView) viewInflate.findViewById(R.id.sleep_boot_page);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.sleep_boot_page_content_3);
        ImageButton imageButton = (ImageButton) viewInflate.findViewById(R.id.sleep_boot_page_close);
        HealthOval healthOval = (HealthOval) viewInflate.findViewById(R.id.aasm_boot_oval_one);
        HealthOval healthOval2 = (HealthOval) viewInflate.findViewById(R.id.aasm_boot_oval_two);
        healthOval.setFillColor(-1);
        healthOval2.setFillColor(-1);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: ucw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        });
        if (!LanguageUtil.o(BaseApplication.b())) {
            ((ImageView) viewInflate.findViewById(R.id.show_sleep_data_case)).setImageResource(R.drawable.sleep_boot_page_view_case_img_oversea);
        }
        Button button = (Button) viewInflate.findViewById(R.id.sleep_boot_page_sure_btn);
        String strF = qre.f(R.string.IDS_sleep_boot_page_jump_name);
        SpannableString spannableString = new SpannableString(new StringBuilder(qre.a(R.string.IDS_sleep_boot_page_content_four, strF)));
        final String str = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.knowledge?h5pro=true&isImmerse&urlType=4&pName=com.huawei.health&path=Knowledge&knowledgeNo=truSleep5";
        qri.a(spannableString, strF, new ClickableSpan() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.utils.SleepBootPagerHelper.4
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                AppRouter.e(Uri.parse(str)).b(BaseApplication.b());
                SleepBootPagerHelper.this.mBootPageView.setVisibility(8);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(qre.e(R.color.color_ffb566ff));
            }
        });
        healthTextView.setText(spannableString);
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        button.setOnClickListener(new View.OnClickListener() { // from class: udb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(view);
            }
        });
        linearLayout.addView(viewInflate);
        uck.d(this.mContext, getSharePreferenceString(), String.valueOf(false));
    }

    public /* synthetic */ void d(View view) {
        this.mBootPageView.setVisibility(8);
    }

    public /* synthetic */ void a(View view) {
        this.mBootPageView.setVisibility(8);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BaseBootPagerHelper
    protected String getSharePreferenceString() {
        return "IS_FIRST_ENTRY_SLEEP_BED_SCIENCE";
    }
}
