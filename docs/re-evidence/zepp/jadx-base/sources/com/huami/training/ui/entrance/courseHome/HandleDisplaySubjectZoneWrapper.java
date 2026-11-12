package com.huami.training.ui.entrance.courseHome;

import com.huami.training.ui.entrance.CourseHomeFragment;
import com.huami.training.vo.EntranceSubjectVo;
import com.huami.training.vo.Resource;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016R\u0019\u0010\u000e\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/training/ui/entrance/courseHome/HandleDisplaySubjectZoneWrapper;", "Lcom/huami/training/ui/entrance/courseHome/IHandleDisplaySubjectZone;", "Lcom/huami/training/ui/entrance/CourseHomeFragment;", "fragment", "Lcom/huami/training/vo/Resource;", "", "Lcom/huami/training/vo/EntranceSubjectVo;", "it", "", "displaySubjectZone", "a", "Lcom/huami/training/ui/entrance/courseHome/IHandleDisplaySubjectZone;", "getHandleDisplaySubjectZone", "()Lcom/huami/training/ui/entrance/courseHome/IHandleDisplaySubjectZone;", "handleDisplaySubjectZone", "<init>", "(Lcom/huami/training/ui/entrance/courseHome/IHandleDisplaySubjectZone;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public class HandleDisplaySubjectZoneWrapper implements IHandleDisplaySubjectZone {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IHandleDisplaySubjectZone handleDisplaySubjectZone;

    public HandleDisplaySubjectZoneWrapper(@NotNull IHandleDisplaySubjectZone iHandleDisplaySubjectZone) {
        this.handleDisplaySubjectZone = iHandleDisplaySubjectZone;
    }

    @Override // com.huami.training.ui.entrance.courseHome.IHandleDisplaySubjectZone
    public void displaySubjectZone(@NotNull CourseHomeFragment fragment, @NotNull Resource<? extends List<EntranceSubjectVo>> it2) {
        this.handleDisplaySubjectZone.displaySubjectZone(fragment, it2);
    }

    @NotNull
    public final IHandleDisplaySubjectZone getHandleDisplaySubjectZone() {
        return this.handleDisplaySubjectZone;
    }
}
