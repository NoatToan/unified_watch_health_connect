package com.huami.moving.utils;

import com.huami.mifit.sportlib.dbkit.bulkparse.SportDetailSegmentParser;
import com.huami.mifit.sportlib.dbkit.bulkparse.SportSegmentData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/moving/utils/StrengthStatisticUtil;", "", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class StrengthStatisticUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "actionType";

    @NotNull
    private static final String b = "count";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005R\u0016\u0010\t\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/moving/utils/StrengthStatisticUtil$Companion;", "", "", "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", "list", "", "formatSegment2JsonString", "segmentStr", "formatLap2JsonString", "KEY_ACTION_TYPE", "Ljava/lang/String;", "KEY_COUNT", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String formatLap2JsonString(@NotNull String segmentStr) {
            List<SportSegmentData> arrayList;
            List<List<SportSegmentData>> listInitSegmentData = SportDetailSegmentParser.INSTANCE.initSegmentData(segmentStr);
            if (listInitSegmentData == null || listInitSegmentData.isEmpty()) {
                return "";
            }
            List<SportSegmentData> list = listInitSegmentData.get(1);
            if (list == null || list.isEmpty()) {
                List<SportSegmentData> list2 = listInitSegmentData.get(5);
                if (list2 == null || list2.isEmpty()) {
                    List<SportSegmentData> list3 = listInitSegmentData.get(6);
                    arrayList = !(list3 == null || list3.isEmpty()) ? listInitSegmentData.get(6) : new ArrayList<>();
                } else {
                    arrayList = listInitSegmentData.get(5);
                }
            } else {
                arrayList = listInitSegmentData.get(1);
            }
            return formatSegment2JsonString(arrayList);
        }

        @NotNull
        public final String formatSegment2JsonString(@Nullable List<SportSegmentData> list) throws JSONException {
            JSONArray jSONArray = new JSONArray();
            if (list == null || list.isEmpty()) {
                return "";
            }
            for (SportSegmentData sportSegmentData : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("actionType", sportSegmentData.getStrengthTrainType());
                jSONObject.put("count", sportSegmentData.getCount());
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        }
    }
}
