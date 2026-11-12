package com.huami.femalehealth.uilib.helper;

import com.huami.femalehealth.logiclib.helper.ext.NumberExtKt;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.data.SportDay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/femalehealth/uilib/helper/FHSettingUtils;", "", "<init>", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public class FHSettingUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bJ\n\u0010\u000f\u001a\u00020\b*\u00020\u000b¨\u0006\u0012"}, d2 = {"Lcom/huami/femalehealth/uilib/helper/FHSettingUtils$Companion;", "", "", "", "createPeriodLongDialogData", "min", "createPhysiologicalLongDialogData", "createRemindlLongDialogData", "", "notString", "createRemindLongDialogDataWithNot", "Lcom/huami/femalehealth/uilib/data/SportDay;", "day", "createLastPeriodDialogData", "indexOfLastPeriodDialogData", "fmtKey", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<String> createLastPeriodDialogData(@NotNull SportDay day) {
            ArrayList arrayList = new ArrayList();
            int i = 99;
            while (true) {
                int i2 = i - 1;
                arrayList.add(fmtKey(day.addDay(-i)));
                if (i2 < 0) {
                    return arrayList;
                }
                i = i2;
            }
        }

        @NotNull
        public final List<Integer> createPeriodLongDialogData() {
            ArrayList arrayList = new ArrayList();
            int i = 1;
            while (true) {
                int i2 = i + 1;
                arrayList.add(Integer.valueOf(i));
                if (i2 > 60) {
                    return arrayList;
                }
                i = i2;
            }
        }

        @NotNull
        public final List<Integer> createPhysiologicalLongDialogData(int min) {
            ArrayList arrayList = new ArrayList();
            if (min <= 100) {
                while (true) {
                    int i = min + 1;
                    arrayList.add(Integer.valueOf(min));
                    if (i > 100) {
                        break;
                    }
                    min = i;
                }
            }
            return arrayList;
        }

        @NotNull
        public final List<Object> createRemindLongDialogDataWithNot(@NotNull String notString) {
            ArrayList arrayList = new ArrayList();
            int i = 1;
            while (true) {
                int i2 = i + 1;
                arrayList.add(Integer.valueOf(i));
                if (i2 > 5) {
                    arrayList.add(0, notString);
                    return arrayList;
                }
                i = i2;
            }
        }

        @NotNull
        public final List<Integer> createRemindlLongDialogData() {
            ArrayList arrayList = new ArrayList();
            int i = 1;
            while (true) {
                int i2 = i + 1;
                arrayList.add(Integer.valueOf(i));
                if (i2 > 5) {
                    return arrayList;
                }
                i = i2;
            }
        }

        @NotNull
        public final String fmtKey(@NotNull SportDay sportDay) {
            return NumberExtKt.dateFormat(sportDay.getTimestamp(), ResourceHelper.INSTANCE.getString(R.string.fh_time_format_include_year));
        }

        public final int indexOfLastPeriodDialogData(@NotNull SportDay day) {
            Iterator<String> it2 = createLastPeriodDialogData(new SportDay()).iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(FHSettingUtils.INSTANCE.fmtKey(day), it2.next())) {
                    return i;
                }
                i++;
            }
            return -1;
        }
    }
}
