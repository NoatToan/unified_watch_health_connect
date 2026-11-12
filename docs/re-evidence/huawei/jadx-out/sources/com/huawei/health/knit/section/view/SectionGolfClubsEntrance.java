package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fts;
import defpackage.qqw;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class SectionGolfClubsEntrance extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f7796a;

    public SectionGolfClubsEntrance(Context context) {
        super(context);
    }

    public SectionGolfClubsEntrance(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionGolfClubsEntrance(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        if (this.f7796a == null) {
            this.f7796a = LayoutInflater.from(context).inflate(R.layout.section_golf_clubs_enter, (ViewGroup) this, false);
        }
        return this.f7796a;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Track_SectionGolfClubsEntrance";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        Object objB = qqw.b(map, "CLICK_EVENT_LISTENER", null);
        if (fts.e(objB)) {
            final OnClickSectionListener onClickSectionListener = (OnClickSectionListener) objB;
            setOnClickListener(new View.OnClickListener() { // from class: fvx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    onClickSectionListener.onClick("TITLE_SHOW_MORE_CLICK_EVENT");
                }
            });
        }
    }
}
