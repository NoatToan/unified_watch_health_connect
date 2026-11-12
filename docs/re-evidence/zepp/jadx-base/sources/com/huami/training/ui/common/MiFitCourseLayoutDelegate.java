package com.huami.training.ui.common;

import com.huami.training.ui.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/huami/training/ui/common/MiFitCourseLayoutDelegate;", "Lcom/huami/training/ui/common/CourseLayoutDelegate;", "", "getFirstLoadErrorViewHolder", "getSearchEdit", "getCourseTags", "getCourseItem", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class MiFitCourseLayoutDelegate implements CourseLayoutDelegate {
    @Override // com.huami.training.ui.common.CourseLayoutDelegate
    public int getCourseItem() {
        return R.layout.tr_item_course;
    }

    @Override // com.huami.training.ui.common.CourseLayoutDelegate
    public int getCourseTags() {
        return R.layout.tr_item_tag;
    }

    @Override // com.huami.training.ui.common.CourseLayoutDelegate
    public int getFirstLoadErrorViewHolder() {
        return R.layout.tr_network_error;
    }

    @Override // com.huami.training.ui.common.CourseLayoutDelegate
    public int getSearchEdit() {
        return R.layout.layout_training_search_edit;
    }
}
