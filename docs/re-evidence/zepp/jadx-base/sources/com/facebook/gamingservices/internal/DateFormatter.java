package com.facebook.gamingservices.internal;

import android.os.Build;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/facebook/gamingservices/internal/DateFormatter;", "", "", "isoDate", "Ljava/time/ZonedDateTime;", "format$facebook_gamingservices_release", "(Ljava/lang/String;)Ljava/time/ZonedDateTime;", TrainingWebConst.QueryParam.VIDEO_FORMAT, "<init>", "()V", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
public final class DateFormatter {

    @NotNull
    public static final DateFormatter INSTANCE = new DateFormatter();

    private DateFormatter() {
    }

    @Nullable
    public final ZonedDateTime format$facebook_gamingservices_release(@Nullable String isoDate) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ZonedDateTime.parse(isoDate, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ"));
        }
        return null;
    }
}
