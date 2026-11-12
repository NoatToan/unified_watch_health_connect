package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqw;
import defpackage.qsp;
import health.compact.a.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionShuteyeShare extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f7921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7922c;
    private int d;
    private int e;
    private HealthTextView f;
    private int g;
    private int h;
    private HealthTextView i;
    private LinearLayout j;
    private HealthTextView n;

    public SectionShuteyeShare(Context context) {
        this(context, null);
    }

    public SectionShuteyeShare(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionShuteyeShare(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7922c = 0;
        this.g = 0;
        this.e = 0;
        this.h = 0;
        this.d = 8;
        this.f7920a = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.b("SectionShuteyeShare", "onCreateView");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.fragment_fitness_core_sleep_share_shuteye, (ViewGroup) this, false);
        this.j = (LinearLayout) viewInflate.findViewById(R.id.share_dream_talkTen);
        this.i = (HealthTextView) viewInflate.findViewById(R.id.shareDreamTalkText);
        this.f7921b = (HealthTextView) viewInflate.findViewById(R.id.dreamTalkMintesText);
        this.f = (HealthTextView) viewInflate.findViewById(R.id.shareSnoreText);
        this.n = (HealthTextView) viewInflate.findViewById(R.id.snoreMintesText);
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionShuteyeShare";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.b("SectionShuteyeShare", "no need to bind");
            return;
        }
        LogUtil.b("SectionShuteyeShare", "bindParamsToView");
        String strD = qqw.d((Map) map, "SHARE_DREAM_TALK", "");
        String strD2 = qqw.d((Map) map, "SHARE_SNORE", "");
        String strD3 = qqw.d((Map) map, "SHARE_DREAM_TALK_MINTES", "");
        String strD4 = qqw.d((Map) map, "SHARE_SNORE_MINTES", "");
        qsp.a(this.i, strD, true);
        qsp.a(this.f, strD2, true);
        qsp.a(this.f7921b, strD3, true);
        qsp.a(this.n, strD4, true);
        LogUtil.b("SectionShuteyeShare", "shareDreamTalktext=" + strD + ",shareDreamMinentsText=" + strD3);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void setViewSHow(int i) {
        this.d = i;
        this.j.setVisibility(i);
    }
}
