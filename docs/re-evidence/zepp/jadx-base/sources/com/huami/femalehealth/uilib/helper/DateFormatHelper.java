package com.huami.femalehealth.uilib.helper;

import com.huami.femalehealth.logiclib.calculation.Milli;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.uilib.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/femalehealth/uilib/helper/DateFormatHelper;", "", "<init>", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class DateFormatHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/huami/femalehealth/uilib/helper/DateFormatHelper$Companion;", "", "", "milli", "", "smartDateFormat", "", "showHourDescription", "showSecond", "smartTimeFormat", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String smartTimeFormat$default(Companion companion, long j, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            return companion.smartTimeFormat(j, z, z2);
        }

        @NotNull
        public final String smartDateFormat(long milli) {
            Milli milli2 = new Milli(milli);
            DateHelper dateHelper = DateHelper.INSTANCE;
            if (dateHelper.isCurrentDay(milli)) {
                return ResourceHelper.INSTANCE.getString(R.string.fh_card_today);
            }
            return dateHelper.isCurrentYear(milli) ? new SimpleDateFormat(ResourceHelper.INSTANCE.getString(R.string.fh_time_format), Locale.getDefault()).format(Long.valueOf(milli2.getValue())) : new SimpleDateFormat(ResourceHelper.INSTANCE.getString(R.string.fh_time_format_include_year), Locale.getDefault()).format(Long.valueOf(milli2.getValue()));
        }

        @NotNull
        public final String smartTimeFormat(long milli, boolean showHourDescription, boolean showSecond) {
            int i;
            int i2;
            int i3;
            DateHelper dateHelper = DateHelper.INSTANCE;
            if (dateHelper.isCurrentDay(milli)) {
                if (showHourDescription && showSecond) {
                    i3 = R.string.fh_time_format_single_with_second_and_hour_desc;
                } else if (showHourDescription && !showSecond) {
                    i3 = R.string.fh_time_format_single_with_hour_desc;
                } else if (showHourDescription || !showSecond) {
                    i3 = (showHourDescription || showSecond) ? R.string.fh_time_format_include_year_and_second_without_hour_desc : R.string.fh_time_format_single;
                } else {
                    i3 = R.string.fh_time_format_single_with_second;
                }
                return new SimpleDateFormat(ResourceHelper.INSTANCE.getString(i3), Locale.getDefault()).format(Long.valueOf(milli));
            }
            if (!dateHelper.isCurrentYear(milli)) {
                if (showHourDescription && showSecond) {
                    i = R.string.fh_time_format_include_year_and_second_with_hour_desc;
                } else if (!showHourDescription || showSecond) {
                    i = ((!showHourDescription && showSecond) || showHourDescription || showSecond) ? R.string.fh_time_format_include_year_and_second_without_hour_desc : R.string.fh_time_format_include_year_with_time;
                } else {
                    i = R.string.fh_time_format_include_year_with_hour_desc_and_second;
                }
                return new SimpleDateFormat(ResourceHelper.INSTANCE.getString(i), Locale.getDefault()).format(Long.valueOf(milli));
            }
            if (showHourDescription && showSecond) {
                i2 = R.string.fh_time_format_without_year_and_second_with_hour_desc;
            } else if (showHourDescription && !showSecond) {
                i2 = R.string.fh_time_format_without_year_with_hour_desc_and_second;
            } else if (showHourDescription || !showSecond) {
                i2 = (showHourDescription || showSecond) ? R.string.fh_time_format_include_year_and_second_without_hour_desc : R.string.fh_time_format_without_year_and_hour_desc_and_second;
            } else {
                i2 = R.string.fh_time_format_without_year_and_hour_desc_with_second;
            }
            return new SimpleDateFormat(ResourceHelper.INSTANCE.getString(i2), Locale.getDefault()).format(Long.valueOf(milli));
        }
    }
}
