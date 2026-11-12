package com.huami.moving.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huami.moving.model.StrengthTrainingAction;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/moving/utils/StrenthTrainingUtils;", "", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class StrenthTrainingUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "StrenthTrainingUtils";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/moving/utils/StrenthTrainingUtils$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "type", "", "Lcom/huami/moving/model/StrengthTrainingAction;", "findStrenthTrainingByType", "(Landroid/content/Context;Ljava/lang/Integer;)Ljava/util/List;", "typeList", "findStrenthTrainingByTypeList", "Lorg/json/JSONObject;", "itemObject", "jsonToStrengthTrainingAction", "Lorg/json/JSONArray;", "array", "", "toIntArray", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ List findStrenthTrainingByType$default(Companion companion, Context context, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                num = -1;
            }
            return companion.findStrenthTrainingByType(context, num);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0047 A[Catch: JSONException -> 0x0053, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0053, blocks: (B:6:0x0013, B:9:0x001f, B:17:0x0041, B:19:0x0047, B:12:0x0037), top: B:26:0x0013 }] */
        @NotNull
        public final List<StrengthTrainingAction> findStrenthTrainingByType(@NotNull Context context, @Nullable Integer type) {
            String strenthTraining = StrenthTrainingKeeper.INSTANCE.getStrenthTraining(context);
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(strenthTraining)) {
                return arrayList;
            }
            try {
                JSONArray jSONArray = new JSONArray(strenthTraining);
                int length = jSONArray.length();
                if (length > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        JSONObject jSONObject = new JSONObject(jSONArray.get(i).toString());
                        int iOptInt = jSONObject.optInt("actionType");
                        if (type != null && iOptInt == type.intValue()) {
                            arrayList.add(jsonToStrengthTrainingAction(jSONObject));
                        } else if (type != null && type.intValue() == -1) {
                            arrayList.add(jsonToStrengthTrainingAction(jSONObject));
                        }
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
            } catch (JSONException e) {
                HMLog.i(StrenthTrainingUtils.a, "error:" + e.getMessage(), new Object[0]);
            }
            return arrayList;
        }

        @NotNull
        public final List<StrengthTrainingAction> findStrenthTrainingByTypeList(@NotNull Context context, @NotNull List<Integer> typeList) {
            String strenthTraining = StrenthTrainingKeeper.INSTANCE.getStrenthTraining(context);
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(strenthTraining)) {
                return arrayList;
            }
            try {
                JSONArray jSONArray = new JSONArray(strenthTraining);
                int length = jSONArray.length();
                if (length > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        JSONObject jSONObject = new JSONObject(jSONArray.get(i).toString());
                        if (typeList.contains(Integer.valueOf(jSONObject.optInt("actionType")))) {
                            arrayList.add(jsonToStrengthTrainingAction(jSONObject));
                        }
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
            } catch (JSONException e) {
                HMLog.i(StrenthTrainingUtils.a, "error:" + e.getMessage(), new Object[0]);
            }
            return arrayList;
        }

        @NotNull
        public final StrengthTrainingAction jsonToStrengthTrainingAction(@NotNull JSONObject itemObject) {
            return new StrengthTrainingAction(itemObject.optInt("actionType"), itemObject.optString("actionName"), toIntArray(itemObject.optJSONArray("mainPositions")), toIntArray(itemObject.optJSONArray("subPositions")), itemObject.optInt("selfWeightType"));
        }

        @NotNull
        public final int[] toIntArray(@Nullable JSONArray array) {
            int i = 0;
            if (array == null) {
                return new int[0];
            }
            int[] iArr = new int[array.length()];
            int length = array.length();
            if (length <= 0) {
                return iArr;
            }
            while (true) {
                int i2 = i + 1;
                iArr[i] = array.getInt(i);
                if (i2 >= length) {
                    return iArr;
                }
                i = i2;
            }
        }
    }
}
