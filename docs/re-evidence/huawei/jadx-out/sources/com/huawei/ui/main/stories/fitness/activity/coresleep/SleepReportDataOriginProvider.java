package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDataModelActivity;
import defpackage.gxq;
import defpackage.iov;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class SleepReportDataOriginProvider extends MinorProvider<gxq> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26841c = false;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.f26841c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, gxq gxqVar) {
        if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL && (gxqVar.h().q() || gxqVar.h().t())) {
            this.f26841c = false;
            sectionBean.d(this, gxqVar);
            return;
        }
        if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            Map<String, Object> mapM = gxqVar.m();
            this.f26841c = false;
            if (mapM != null) {
                Object obj = mapM.get("BAR_CHART_HELP_ICON_VISIBILITY");
                if ((obj instanceof Integer) && ((Integer) obj).intValue() == 0) {
                    this.f26841c = true;
                    sectionBean.d(this, gxqVar);
                    return;
                }
                return;
            }
            return;
        }
        this.f26841c = false;
        sectionBean.d(this, gxqVar);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, gxq gxqVar) {
        map.put("REPORT_TEXT", e());
        map.put("CORE_SLEEP_BTN_TIPS", false);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f A[PHI: r4
      0x003f: PHI (r4v4 int) = (r4v3 int), (r4v2 int) binds: [B:12:0x003d, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    protected SpannableString e() {
        final Context contextB = BaseApplication.b();
        String str = String.format(Locale.ENGLISH, contextB.getString(R.string.IDS_manual_sleep_more_data), contextB.getString(R.string.IDS_manual_sleep_manual_sleep_input), "");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < str.length(); i4++) {
            if (str.charAt(i4) == '\"') {
                if (i2 == -1) {
                    i2 = i4;
                } else {
                    i3 = i4;
                }
            } else if (str.charAt(i4) == 8220) {
                i++;
                if (i == 2) {
                    i2 = i4;
                }
            } else if (str.charAt(i4) == 8221) {
                i3 = i4;
            }
        }
        SpannableString spannableString = new SpannableString(str);
        if (i2 != -1 && i3 != -1 && i2 != str.length() - 1) {
            spannableString.setSpan(new ClickableSpan() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepReportDataOriginProvider.4
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    PageModelArgs pageModelArgs = new PageModelArgs(103, "PrivacyDataConstructor", 3, 1);
                    Intent intent = new Intent(contextB, (Class<?>) PrivacyDataModelActivity.class);
                    intent.setFlags(268435456);
                    intent.putExtra("extra_page_model_args", pageModelArgs);
                    iov.d(contextB, intent);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(ContextCompat.getColor(contextB, R.color.sleep_no_data_learn_more_color));
                    textPaint.setUnderlineText(false);
                }
            }, i2, i3 + 1, 18);
        }
        return spannableString;
    }
}
