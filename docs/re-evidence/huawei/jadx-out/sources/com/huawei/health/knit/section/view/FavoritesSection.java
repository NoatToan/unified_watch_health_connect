package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.health.knit.section.listener.IViewCreatedCallback;
import com.huawei.health.servicesui.R;
import defpackage.qqw;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class FavoritesSection extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f7595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f7596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7597c;

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected boolean isSupportSafeRegion() {
        return false;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public boolean isSupportShare() {
        return false;
    }

    public FavoritesSection(Context context) {
        super(context);
    }

    public FavoritesSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FavoritesSection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.f7597c = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.favorites_layout, (ViewGroup) this, false);
        this.f7595a = (LinearLayout) viewInflate.findViewById(R.id.sleep_day_operation_config_layout);
        this.f7596b = (LinearLayout) viewInflate.findViewById(R.id.sleep_favorites_audios);
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "FavoritesSection";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        IViewCreatedCallback iViewCreatedCallback = (IViewCreatedCallback) qqw.a(map, "CONFIG_CALL_BACK", (Class<Object>) IViewCreatedCallback.class, (Object) null);
        if (iViewCreatedCallback != null) {
            iViewCreatedCallback.onLayoutUpdate(this.f7595a);
        }
        IViewCreatedCallback iViewCreatedCallback2 = (IViewCreatedCallback) qqw.a(map, "FAVORITES_CALL_BACK", (Class<Object>) IViewCreatedCallback.class, (Object) null);
        if (iViewCreatedCallback2 != null) {
            iViewCreatedCallback2.onLayoutUpdate(this.f7596b);
        }
    }
}
