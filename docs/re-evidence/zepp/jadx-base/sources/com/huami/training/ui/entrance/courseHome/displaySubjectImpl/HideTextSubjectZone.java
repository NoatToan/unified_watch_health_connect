package com.huami.training.ui.entrance.courseHome.displaySubjectImpl;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huami.training.dto.DisplayMode;
import com.huami.training.ext.ViewExKt;
import com.huami.training.ui.R;
import com.huami.training.ui.entrance.CourseHomeFragment;
import com.huami.training.ui.entrance.courseHome.HandleDisplaySubjectZoneWrapper;
import com.huami.training.ui.entrance.courseHome.IHandleDisplaySubjectZone;
import com.huami.training.vo.EntranceSubjectVo;
import com.huami.training.vo.Resource;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/huami/training/ui/entrance/courseHome/displaySubjectImpl/HideTextSubjectZone;", "Lcom/huami/training/ui/entrance/courseHome/HandleDisplaySubjectZoneWrapper;", "Lcom/huami/training/ui/entrance/CourseHomeFragment;", "fragment", "Lcom/huami/training/vo/Resource;", "", "Lcom/huami/training/vo/EntranceSubjectVo;", "it", "", "displaySubjectZone", "Lcom/huami/training/ui/entrance/courseHome/IHandleDisplaySubjectZone;", "handleDisplaySubjectZone", "<init>", "(Lcom/huami/training/ui/entrance/courseHome/IHandleDisplaySubjectZone;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class HideTextSubjectZone extends HandleDisplaySubjectZoneWrapper {
    public HideTextSubjectZone(@NotNull IHandleDisplaySubjectZone iHandleDisplaySubjectZone) {
        super(iHandleDisplaySubjectZone);
    }

    @Override // com.huami.training.ui.entrance.courseHome.HandleDisplaySubjectZoneWrapper, com.huami.training.ui.entrance.courseHome.IHandleDisplaySubjectZone
    public void displaySubjectZone(@NotNull CourseHomeFragment fragment, @NotNull Resource<? extends List<EntranceSubjectVo>> it2) {
        super.displaySubjectZone(fragment, it2);
        View header = fragment.getHeader();
        EntranceSubjectVo subject = fragment.getSubject(DisplayMode.LARGE, it2.getData());
        EntranceSubjectVo subject2 = fragment.getSubject(DisplayMode.LEFT, it2.getData());
        EntranceSubjectVo subject3 = fragment.getSubject(DisplayMode.RIGHT, it2.getData());
        if (subject == null || subject2 == null || subject3 == null) {
            ViewExKt.setVisible((ConstraintLayout) header.findViewById(R.id.subject_zone), false);
            ViewExKt.setVisible((ConstraintLayout) header.findViewById(R.id.subject_top), false);
            ViewExKt.setVisible((ConstraintLayout) header.findViewById(R.id.subject_left), false);
            ViewExKt.setVisible((ConstraintLayout) header.findViewById(R.id.subject_right), false);
            return;
        }
        ViewExKt.setVisible((TypefaceTextView) header.findViewById(R.id.subject_title_top), false);
        ViewExKt.setVisible((TypefaceTextView) header.findViewById(R.id.subject_subtitle_top), false);
        ViewExKt.setVisible((TypefaceTextView) header.findViewById(R.id.subject_title_left), false);
        ViewExKt.setVisible((TypefaceTextView) header.findViewById(R.id.subject_subtitle_left), false);
        ViewExKt.setVisible((TypefaceTextView) header.findViewById(R.id.subject_title_right), false);
        ViewExKt.setVisible((TypefaceTextView) header.findViewById(R.id.subject_subtitle_right), false);
    }
}
