package com.huami.training.util;

import com.google.android.gms.fitness.FitnessActivities;
import com.huami.tools.log.HMLog;
import com.huami.training.dto.TrainingType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/huami/training/util/TrainingUtils;", "", "", "target", "Lkotlin/Pair;", "", "Lcom/huami/training/dto/TrainingType;", "parseTraining", "expiry", "parseExpiry", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingUtils {

    @NotNull
    public static final TrainingUtils INSTANCE = new TrainingUtils();

    private TrainingUtils() {
    }

    @Nullable
    public final String parseExpiry(long expiry) {
        if (expiry == 0) {
            return null;
        }
        return new SimpleDateFormat("MM-dd", Locale.getDefault()).format(new Date(expiry));
    }

    @NotNull
    public final Pair<Long, TrainingType> parseTraining(@Nullable String target) {
        MatchResult matchResultFind$default;
        List<String> groupValues;
        Long lValueOf;
        Object obj;
        TrainingType trainingType;
        Object obj2 = null;
        if (target == null || (matchResultFind$default = Regex.find$default(new Regex("sport:(training|yoga|course):(\\d+)"), target, 0, 2, null)) == null || (groupValues = matchResultFind$default.getGroupValues()) == null || groupValues.size() != 3) {
            obj = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(groupValues.get(2)));
                try {
                    String str = groupValues.get(1);
                    int iHashCode = str.hashCode();
                    if (iHashCode != -1354571749) {
                        if (iHashCode != 3714672) {
                            if (iHashCode == 1276119258 && str.equals("training")) {
                                trainingType = TrainingType.ACTION;
                                obj2 = trainingType;
                            }
                        } else if (str.equals(FitnessActivities.YOGA)) {
                            trainingType = TrainingType.YOGA;
                            obj2 = trainingType;
                        }
                    } else if (str.equals("course")) {
                        trainingType = TrainingType.FEATURED_COURSE;
                        obj2 = trainingType;
                    }
                } catch (Exception e) {
                    e = e;
                    HMLog.w("TrainingUtils.parseTraining()", e, Intrinsics.stringPlus("解析专题位训练信息出错, ", target), new Object[0]);
                }
            } catch (Exception e2) {
                e = e2;
                lValueOf = null;
            }
            obj = obj2;
            obj2 = lValueOf;
        }
        return new Pair<>(obj2, obj);
    }
}
