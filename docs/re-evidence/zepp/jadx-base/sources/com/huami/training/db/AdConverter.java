package com.huami.training.db;

import androidx.room.TypeConverter;
import com.huami.training.dto.DisplayMode;
import com.huami.training.dto.SubjectPlace;
import com.huami.training.dto.TargetMode;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/huami/training/db/AdConverter;", "", "Lcom/huami/training/dto/SubjectPlace;", "subjectPlace", "", "subjectPlaceToInt", "(Lcom/huami/training/dto/SubjectPlace;)Ljava/lang/Integer;", "intToSubjectPlace", "(Ljava/lang/Integer;)Lcom/huami/training/dto/SubjectPlace;", "Lcom/huami/training/dto/DisplayMode;", "displayMode", "displayModeToInt", "(Lcom/huami/training/dto/DisplayMode;)Ljava/lang/Integer;", "intToDisplayMode", "(Ljava/lang/Integer;)Lcom/huami/training/dto/DisplayMode;", "Lcom/huami/training/dto/TargetMode;", "targetMode", "targetModeToInt", "(Lcom/huami/training/dto/TargetMode;)Ljava/lang/Integer;", "intToTargetMode", "(Ljava/lang/Integer;)Lcom/huami/training/dto/TargetMode;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class AdConverter {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[SubjectPlace.values().length];
            iArr[SubjectPlace.COURSE_SUBJECT.ordinal()] = 1;
            iArr[SubjectPlace.SPORT_EXERCISE.ordinal()] = 2;
            iArr[SubjectPlace.COURSE_CAROUSEL.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DisplayMode.values().length];
            iArr2[DisplayMode.LARGE.ordinal()] = 1;
            iArr2[DisplayMode.LEFT.ordinal()] = 2;
            iArr2[DisplayMode.RIGHT.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TargetMode.values().length];
            iArr3[TargetMode.NONE.ordinal()] = 1;
            iArr3[TargetMode.WEBVIEW.ordinal()] = 2;
            iArr3[TargetMode.INTERNAL.ordinal()] = 3;
            iArr3[TargetMode.EXTERNAL.ordinal()] = 4;
            iArr3[TargetMode.RN.ordinal()] = 5;
            iArr3[TargetMode.INSIDE_REDIRECT.ordinal()] = 6;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @TypeConverter
    @Nullable
    public final Integer displayModeToInt(@Nullable DisplayMode displayMode) {
        int i = displayMode == null ? -1 : WhenMappings.$EnumSwitchMapping$1[displayMode.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? null : 3;
        }
        return 2;
    }

    @TypeConverter
    @Nullable
    public final DisplayMode intToDisplayMode(@Nullable Integer displayMode) {
        if (displayMode != null && displayMode.intValue() == 1) {
            return DisplayMode.LARGE;
        }
        if (displayMode != null && displayMode.intValue() == 2) {
            return DisplayMode.LEFT;
        }
        if (displayMode != null && displayMode.intValue() == 3) {
            return DisplayMode.RIGHT;
        }
        return null;
    }

    @TypeConverter
    @Nullable
    public final SubjectPlace intToSubjectPlace(@Nullable Integer subjectPlace) {
        if (subjectPlace != null && subjectPlace.intValue() == 1) {
            return SubjectPlace.COURSE_SUBJECT;
        }
        if (subjectPlace != null && subjectPlace.intValue() == 2) {
            return SubjectPlace.SPORT_EXERCISE;
        }
        if (subjectPlace != null && subjectPlace.intValue() == 3) {
            return SubjectPlace.COURSE_CAROUSEL;
        }
        return null;
    }

    @TypeConverter
    @Nullable
    public final TargetMode intToTargetMode(@Nullable Integer targetMode) {
        if (targetMode != null && targetMode.intValue() == 0) {
            return TargetMode.NONE;
        }
        if (targetMode != null && targetMode.intValue() == 1) {
            return TargetMode.WEBVIEW;
        }
        if (targetMode != null && targetMode.intValue() == 2) {
            return TargetMode.INTERNAL;
        }
        if (targetMode != null && targetMode.intValue() == 3) {
            return TargetMode.EXTERNAL;
        }
        if (targetMode != null && targetMode.intValue() == 4) {
            return TargetMode.RN;
        }
        if (targetMode != null && targetMode.intValue() == 5) {
            return TargetMode.INSIDE_REDIRECT;
        }
        return null;
    }

    @TypeConverter
    @Nullable
    public final Integer subjectPlaceToInt(@Nullable SubjectPlace subjectPlace) {
        int i = subjectPlace == null ? -1 : WhenMappings.$EnumSwitchMapping$0[subjectPlace.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? null : 3;
        }
        return 2;
    }

    @TypeConverter
    @Nullable
    public final Integer targetModeToInt(@Nullable TargetMode targetMode) {
        switch (targetMode == null ? -1 : WhenMappings.$EnumSwitchMapping$2[targetMode.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                return null;
        }
    }
}
