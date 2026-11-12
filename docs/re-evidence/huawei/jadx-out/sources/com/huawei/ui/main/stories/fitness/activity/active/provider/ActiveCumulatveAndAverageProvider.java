package com.huawei.ui.main.stories.fitness.activity.active.provider;

import android.content.Context;
import android.text.SpannableString;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.ui.main.R;
import defpackage.qre;
import defpackage.qri;
import defpackage.tty;
import health.compact.a.UnitUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class ActiveCumulatveAndAverageProvider extends MinorProvider<tty> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private tty f26519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SectionBean f26520b;

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        this.f26519a = new tty();
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        super.loadData(context, sectionBean);
        this.f26520b = sectionBean;
        sectionBean.c(this.f26519a);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap map, tty ttyVar) {
        super.parseParams(context, map, ttyVar);
        this.f26519a = ttyVar;
        map.put("CUMULATIVE_SUM", c(ttyVar.d()));
        map.put("DAILY_AVERAGE", c(ttyVar.a()));
    }

    private SpannableString c(int i) {
        String strE = UnitUtil.e(i, 1, 0);
        SpannableString spannableString = new SpannableString(qre.e(R.plurals.IDS_hour_unit, i, strE));
        qri.c(spannableString, strE, qre.b(R.dimen.health_common_20sp));
        qri.b(spannableString, strE, R.color.textColorPrimary);
        qri.e(spannableString, strE, R.string.textFontFamilyMedium);
        return spannableString;
    }
}
