package com.huami.training.ui.entrance.courseHome.displaySubjectImpl;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huami.training.dto.DisplayMode;
import com.huami.training.ext.ImageViewExKt;
import com.huami.training.ext.ViewExKt;
import com.huami.training.ui.R;
import com.huami.training.ui.entrance.CourseHomeFragment;
import com.huami.training.ui.entrance.courseHome.IHandleDisplaySubjectZone;
import com.huami.training.ui.entrance.courseHome.displaySubjectImpl.DefaultHandleDisplaySubjectZone;
import com.huami.training.ui.widget.RoundImageView;
import com.huami.training.utils.AnalyticsHelper;
import com.huami.training.vo.EntranceSubjectVo;
import com.huami.training.vo.Resource;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/huami/training/ui/entrance/courseHome/displaySubjectImpl/DefaultHandleDisplaySubjectZone;", "Lcom/huami/training/ui/entrance/courseHome/IHandleDisplaySubjectZone;", "Lcom/huami/training/ui/entrance/CourseHomeFragment;", "fragment", "Lcom/huami/training/vo/Resource;", "", "Lcom/huami/training/vo/EntranceSubjectVo;", "it", "", "displaySubjectZone", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class DefaultHandleDisplaySubjectZone implements IHandleDisplaySubjectZone {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CourseHomeFragment courseHomeFragment, EntranceSubjectVo entranceSubjectVo, View view) {
        courseHomeFragment.jumpToTarget(entranceSubjectVo);
        if (entranceSubjectVo.getTrainingType() == null) {
            AnalyticsHelper.INSTANCE.countTopicEvent(entranceSubjectVo.getId(), true);
        } else {
            AnalyticsHelper.INSTANCE.countTopicEvent(String.valueOf(entranceSubjectVo.getTrainingId()), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(CourseHomeFragment courseHomeFragment, EntranceSubjectVo entranceSubjectVo, View view) {
        courseHomeFragment.jumpToTarget(entranceSubjectVo);
        if (entranceSubjectVo.getTrainingType() == null) {
            AnalyticsHelper.INSTANCE.countTopicShort(true, entranceSubjectVo.getId(), true);
        } else {
            AnalyticsHelper.INSTANCE.countTopicShort(true, String.valueOf(entranceSubjectVo.getTrainingId()), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(CourseHomeFragment courseHomeFragment, EntranceSubjectVo entranceSubjectVo, View view) {
        courseHomeFragment.jumpToTarget(entranceSubjectVo);
        if (entranceSubjectVo.getTrainingType() == null) {
            AnalyticsHelper.INSTANCE.countTopicShort(false, entranceSubjectVo.getId(), true);
        } else {
            AnalyticsHelper.INSTANCE.countTopicShort(false, String.valueOf(entranceSubjectVo.getTrainingId()), false);
        }
    }

    @Override // com.huami.training.ui.entrance.courseHome.IHandleDisplaySubjectZone
    public void displaySubjectZone(@NotNull final CourseHomeFragment fragment, @NotNull Resource<? extends List<EntranceSubjectVo>> it2) {
        View header = fragment.getHeader();
        float dimension = header.getContext().getResources().getDimension(R.dimen.tr_card_radius_v);
        final EntranceSubjectVo subject = fragment.getSubject(DisplayMode.LARGE, it2.getData());
        final EntranceSubjectVo subject2 = fragment.getSubject(DisplayMode.LEFT, it2.getData());
        final EntranceSubjectVo subject3 = fragment.getSubject(DisplayMode.RIGHT, it2.getData());
        if (subject == null || subject2 == null || subject3 == null) {
            ViewExKt.setVisible((ConstraintLayout) header.findViewById(R.id.subject_zone), false);
            ViewExKt.setVisible((ConstraintLayout) header.findViewById(R.id.subject_top), false);
            ViewExKt.setVisible((ConstraintLayout) header.findViewById(R.id.subject_left), false);
            ViewExKt.setVisible((ConstraintLayout) header.findViewById(R.id.subject_right), false);
            return;
        }
        ViewExKt.setVisible((ConstraintLayout) header.findViewById(R.id.subject_zone), true);
        int i = R.id.subject_top;
        if (((ConstraintLayout) header.findViewById(i)).getVisibility() == 8) {
            if (subject.getTrainingType() == null) {
                AnalyticsHelper.INSTANCE.countTopicVisit(subject.getId(), true);
            } else {
                AnalyticsHelper.INSTANCE.countTopicVisit(String.valueOf(subject.getTrainingId()), false);
            }
            ViewExKt.setVisible((ConstraintLayout) header.findViewById(i), true);
        }
        ((TypefaceTextView) header.findViewById(R.id.subject_title_top)).setText(subject.getTitle());
        ((TypefaceTextView) header.findViewById(R.id.subject_subtitle_top)).setText(subject.getSubtitle());
        ImageViewExKt.loadUrlWithCorner((RoundImageView) header.findViewById(R.id.subject_img_top), subject.getImageUrl(), Float.valueOf(dimension));
        ((ConstraintLayout) header.findViewById(i)).setOnClickListener(new View.OnClickListener() { // from class: o51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultHandleDisplaySubjectZone.d(fragment, subject, view);
            }
        });
        int i2 = R.id.subject_left;
        if (((ConstraintLayout) header.findViewById(i2)).getVisibility() == 8) {
            if (subject2.getTrainingType() == null) {
                AnalyticsHelper.INSTANCE.countTopicShortVisit(true, subject2.getId(), true);
            } else {
                AnalyticsHelper.INSTANCE.countTopicShortVisit(true, String.valueOf(subject2.getTrainingId()), false);
            }
            ViewExKt.setVisible((ConstraintLayout) header.findViewById(i2), true);
        }
        ((TypefaceTextView) header.findViewById(R.id.subject_title_left)).setText(subject2.getTitle());
        ((TypefaceTextView) header.findViewById(R.id.subject_subtitle_left)).setText(subject2.getSubtitle());
        ImageViewExKt.loadUrlWithCorner((RoundImageView) header.findViewById(R.id.subject_img_left), subject2.getImageUrl(), Float.valueOf(dimension));
        ((ConstraintLayout) header.findViewById(i2)).setOnClickListener(new View.OnClickListener() { // from class: p51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultHandleDisplaySubjectZone.e(fragment, subject2, view);
            }
        });
        int i3 = R.id.subject_right;
        if (((ConstraintLayout) header.findViewById(i3)).getVisibility() == 8) {
            if (subject3.getTrainingType() == null) {
                AnalyticsHelper.INSTANCE.countTopicShortVisit(false, subject3.getId(), true);
            } else {
                AnalyticsHelper.INSTANCE.countTopicShortVisit(false, String.valueOf(subject3.getTrainingId()), false);
            }
            ViewExKt.setVisible((ConstraintLayout) header.findViewById(i3), true);
        }
        ((TypefaceTextView) header.findViewById(R.id.subject_title_right)).setText(subject3.getTitle());
        ((TypefaceTextView) header.findViewById(R.id.subject_subtitle_right)).setText(subject3.getSubtitle());
        ImageViewExKt.loadUrlWithCorner((RoundImageView) header.findViewById(R.id.subject_img_right), subject3.getImageUrl(), Float.valueOf(dimension));
        ((ConstraintLayout) header.findViewById(i3)).setOnClickListener(new View.OnClickListener() { // from class: q51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultHandleDisplaySubjectZone.f(fragment, subject3, view);
            }
        });
    }
}
