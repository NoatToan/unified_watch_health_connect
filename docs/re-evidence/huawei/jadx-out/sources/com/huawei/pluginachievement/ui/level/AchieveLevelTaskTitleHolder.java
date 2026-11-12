package com.huawei.pluginachievement.ui.level;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.pluginachievement.R;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.out;
import defpackage.ozs;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveLevelTaskTitleHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthSubHeader f22234a;

    AchieveLevelTaskTitleHolder(View view) {
        super(view);
        HealthSubHeader healthSubHeader = (HealthSubHeader) out.b(view, R.id.achieve_task_title);
        this.f22234a = healthSubHeader;
        healthSubHeader.setSubHeaderBackgroundColor(0);
    }

    public void b(ozs ozsVar) {
        if (ozsVar != null) {
            this.f22234a.setVisibility(0);
            if (TextUtils.isEmpty(ozsVar.c())) {
                this.f22234a.setVisibility(8);
            } else {
                this.f22234a.setVisibility(0);
                this.f22234a.setHeadTitleText(ozsVar.c());
            }
        }
    }
}
