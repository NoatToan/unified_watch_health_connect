package com.xiaomi.hm.health.traininglib.webapi;

import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.hm.health.HMIntentHandler;
import com.xiaomi.hm.health.baseutil.GlobalUtil;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.util.TrainingConstant;
import java.lang.reflect.Type;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class ParseJsonUtil {
    public static final int LONG_BY_GENDER_CODE_DEFAULT = 0;
    public static final int LONG_BY_GENDER_CODE_ERROR = 1;
    private static final String a = "ParseJsonUtil";

    public static class DivisionGender {

        @SerializedName(HMIntentHandler.NAME_FEMALE)
        public String female;

        @SerializedName("male")
        public String male;
    }

    public static class IdName {

        @SerializedName("id")
        public String id;

        @SerializedName("name")
        public String name;
    }

    public class a extends TypeToken<List<IdName>> {
    }

    private static DivisionGender a(String str) {
        if (str != null) {
            return (DivisionGender) parse2Object(str, DivisionGender.class);
        }
        return null;
    }

    private static IdName b(String str) {
        return (IdName) parse2Object(str, IdName.class);
    }

    private static List<IdName> c(String str) {
        if (str != null) {
            return parse2List(str, new a().getType());
        }
        return null;
    }

    public static String divisionGenderToJson(DivisionGender divisionGender) {
        return GlobalUtil.gson().toJson(divisionGender);
    }

    public static String getIdFromJson(String str) {
        IdName idNameB = b(str);
        if (idNameB != null) {
            return idNameB.id;
        }
        return null;
    }

    public static <T> List<T> getListFromItems(String str, Type type) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("items")) {
                return parse2List(jSONObject.getJSONArray("items").toString(), type);
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static long getLongByGender(String str, TrainerInfo trainerInfo) {
        try {
            DivisionGender divisionGenderA = a(str);
            if (divisionGenderA != null) {
                return trainerInfo.gender == TrainingConstant.GENDER_MALE ? Long.valueOf(divisionGenderA.male).longValue() : Long.valueOf(divisionGenderA.female).longValue();
            }
            return 0L;
        } catch (Exception unused) {
            return 1L;
        }
    }

    public static String getNameFromJson(String str) {
        IdName idNameB = b(str);
        if (idNameB != null) {
            return idNameB.name;
        }
        return null;
    }

    public static String getNamesFromJsonArray(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        List<IdName> listC = c(str);
        if (listC != null && listC.size() > 0) {
            int size = listC.size();
            for (int i = 0; i < size; i++) {
                sb.append(listC.get(i).name);
                if (i != size - 1) {
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }

    public static String getStringByGender(String str, TrainerInfo trainerInfo) {
        DivisionGender divisionGenderA = a(str);
        if (divisionGenderA != null) {
            return trainerInfo.gender == TrainingConstant.GENDER_MALE ? divisionGenderA.male : divisionGenderA.female;
        }
        return null;
    }

    public static String parse2Json(Object obj) {
        return GlobalUtil.gson().toJson(obj);
    }

    public static <T> List<T> parse2List(String str, Type type) {
        try {
            return (List) GlobalUtil.gson().fromJson(new JSONArray(str).toString(), type);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T parse2Object(String str, Type type) {
        try {
            return (T) GlobalUtil.gson().fromJson(str, type);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }
}
