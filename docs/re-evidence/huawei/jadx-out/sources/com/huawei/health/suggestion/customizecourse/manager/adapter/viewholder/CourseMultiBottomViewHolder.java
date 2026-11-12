package com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder;

import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.hdr;

/* JADX INFO: loaded from: classes9.dex */
public class CourseMultiBottomViewHolder extends CustomCourseDragViewHolder<hdr> {
    @Override // com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CustomCourseDragViewHolder
    public void setDragState(boolean z) {
    }

    public CourseMultiBottomViewHolder(View view) {
        super(view);
    }

    @Override // com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CustomCourseDragViewHolder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void init(hdr hdrVar, int i) {
        LogUtil.a("CourseMultiBottomViewHolder", "init, position=", Integer.valueOf(i));
    }
}
