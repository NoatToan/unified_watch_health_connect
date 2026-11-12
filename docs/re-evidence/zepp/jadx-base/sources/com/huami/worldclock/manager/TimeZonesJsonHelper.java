package com.huami.worldclock.manager;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.worldclock.bean.WorldClockBean;
import com.huami.worldclock.utils.AssetUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007J\u001e\u0010\r\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/worldclock/manager/TimeZonesJsonHelper;", "", "", "jsonStr", "", "Lcom/huami/worldclock/bean/WorldClockBean;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "managerTimeZonesData", "worldClocks", "", "isFirstUsing", "worldClockListToJsonString", "parsePropertyToZones", "parsePropertyIsFirstUsing", "Ljava/lang/String;", "TAG", "b", "Ljava/util/List;", "localAssetWorldClock", "<init>", "()V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class TimeZonesJsonHelper {

    @NotNull
    public static final TimeZonesJsonHelper INSTANCE = new TimeZonesJsonHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "TimeZonesManager";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static List<WorldClockBean> localAssetWorldClock;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc, String str) {
            super(0);
            this.a = exc;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "exception:" + this.a + "\njsonStr:" + this.b;
        }
    }

    private TimeZonesJsonHelper() {
    }

    private final List<WorldClockBean> a(String jsonStr) {
        JsonArray asJsonArray;
        ArrayList arrayList = new ArrayList();
        try {
            Gson gson = new Gson();
            JsonElement jsonElement = new JsonParser().parse(jsonStr);
            if (jsonElement.isJsonArray() && (asJsonArray = jsonElement.getAsJsonArray()) != null) {
                Iterator<JsonElement> it2 = asJsonArray.iterator();
                while (it2.hasNext()) {
                    arrayList.add((WorldClockBean) gson.fromJson(it2.next(), WorldClockBean.class));
                }
            }
        } catch (Exception e) {
            HMLog.info(TAG, new a(e, jsonStr));
        }
        return arrayList;
    }

    public static /* synthetic */ String worldClockListToJsonString$default(TimeZonesJsonHelper timeZonesJsonHelper, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return timeZonesJsonHelper.worldClockListToJsonString(list, z);
    }

    @Nullable
    public final synchronized List<WorldClockBean> managerTimeZonesData(@NotNull Context context) {
        String assetsFile;
        if (localAssetWorldClock == null && (assetsFile = AssetUtils.INSTANCE.readAssetsFile("timezones.json", context)) != null) {
            localAssetWorldClock = INSTANCE.a(assetsFile);
        }
        return localAssetWorldClock;
    }

    public final boolean parsePropertyIsFirstUsing(@NotNull String jsonStr) {
        if (TextUtils.isEmpty(jsonStr)) {
            return true;
        }
        try {
            JsonElement jsonElement = new JsonParser().parse(jsonStr);
            if (jsonElement.isJsonObject()) {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (asJsonObject.has("isFirstUsing")) {
                    return asJsonObject.get("isFirstUsing").getAsBoolean();
                }
                return true;
            }
        } catch (Exception e) {
            HMLog.i(TAG, e.getMessage(), new Object[0]);
        }
        return true;
    }

    @NotNull
    public final List<WorldClockBean> parsePropertyToZones(@NotNull String jsonStr) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(jsonStr)) {
            return arrayList;
        }
        try {
            JsonElement jsonElement = new JsonParser().parse(jsonStr);
            if (jsonElement.isJsonObject()) {
                JsonElement jsonElement2 = jsonElement.getAsJsonObject().get("items");
                if (jsonElement2.isJsonArray()) {
                    for (JsonElement jsonElement3 : jsonElement2.getAsJsonArray()) {
                        if (jsonElement3.isJsonObject()) {
                            WorldClockBean worldClockBean = new WorldClockBean(null, null, false, null, null, 0, 0L, false, 255, null);
                            worldClockBean.setCityCN(jsonElement3.getAsJsonObject().get("cityCN").getAsString());
                            worldClockBean.setCity(jsonElement3.getAsJsonObject().get("city").getAsString());
                            worldClockBean.setMainCity(jsonElement3.getAsJsonObject().get("mainCity").getAsBoolean());
                            worldClockBean.setIdentifier(jsonElement3.getAsJsonObject().get("identifier").getAsString());
                            worldClockBean.setCityCode(jsonElement3.getAsJsonObject().get("cityCode").getAsString());
                            worldClockBean.setDaylightState(jsonElement3.getAsJsonObject().get("daylightState").getAsInt());
                            worldClockBean.setOffsetTransitionDateTime(jsonElement3.getAsJsonObject().has("offsetTransitionDateTime") ? jsonElement3.getAsJsonObject().get("offsetTransitionDateTime").getAsLong() : 0L);
                            arrayList.add(worldClockBean);
                        }
                    }
                }
                return arrayList;
            }
        } catch (Exception e) {
            HMLog.i(TAG, e.getMessage(), new Object[0]);
        }
        return arrayList;
    }

    @NotNull
    public final String worldClockListToJsonString(@NotNull List<WorldClockBean> worldClocks, boolean isFirstUsing) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("isFirstUsing", Boolean.valueOf(isFirstUsing));
        JsonArray jsonArray = new JsonArray();
        for (WorldClockBean worldClockBean : worldClocks) {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("cityCN", worldClockBean.getCityCN());
            jsonObject2.addProperty("city", worldClockBean.getCity());
            jsonObject2.addProperty("mainCity", Boolean.valueOf(worldClockBean.getMainCity()));
            jsonObject2.addProperty("identifier", worldClockBean.getIdentifier());
            jsonObject2.addProperty("cityCode", worldClockBean.getCityCode());
            jsonObject2.addProperty("daylightState", Integer.valueOf(worldClockBean.getDaylightState()));
            jsonObject2.addProperty("offsetTransitionDateTime", Long.valueOf(worldClockBean.getOffsetTransitionDateTime()));
            jsonArray.add(jsonObject2);
        }
        jsonObject.add("items", jsonArray);
        return jsonObject.toString();
    }
}
