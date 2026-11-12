package com.huami.moving.ui.sport.detail.manager;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.huami.moving.ui.sport.detail.data.ChartShowDataBean;
import com.huami.moving.ui.sport.detail.data.SportShowDataBean;
import com.huami.tools.analytics.DbUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0011"}, d2 = {"Lcom/huami/moving/ui/sport/detail/manager/SportDataManager;", "", "", "fileName", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "c", "jsonStr", "", "Lcom/huami/moving/ui/sport/detail/data/SportShowDataBean;", "b", "Lcom/huami/moving/ui/sport/detail/data/ChartShowDataBean;", "a", "managerSportOverViewData", "managerChartData", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportDataManager {

    @NotNull
    public static final SportDataManager INSTANCE = new SportDataManager();

    private SportDataManager() {
    }

    private final List<ChartShowDataBean> a(String jsonStr) {
        JsonArray asJsonArray;
        ArrayList arrayList = new ArrayList();
        Gson gson = new Gson();
        JsonElement jsonElement = new JsonParser().parse(jsonStr);
        if (jsonElement.isJsonArray() && (asJsonArray = jsonElement.getAsJsonArray()) != null) {
            Iterator<JsonElement> it2 = asJsonArray.iterator();
            while (it2.hasNext()) {
                arrayList.add((ChartShowDataBean) gson.fromJson(it2.next(), ChartShowDataBean.class));
            }
        }
        return arrayList;
    }

    private final List<SportShowDataBean> b(String jsonStr) {
        JsonArray asJsonArray;
        ArrayList arrayList = new ArrayList();
        Gson gson = new Gson();
        JsonElement jsonElement = new JsonParser().parse(jsonStr);
        if (jsonElement.isJsonArray() && (asJsonArray = jsonElement.getAsJsonArray()) != null) {
            Iterator<JsonElement> it2 = asJsonArray.iterator();
            while (it2.hasNext()) {
                arrayList.add((SportShowDataBean) gson.fromJson(it2.next(), SportShowDataBean.class));
            }
        }
        return arrayList;
    }

    private final String c(String fileName, Context context) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open(fileName)));
            String str = "";
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                str = str + line;
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final List<ChartShowDataBean> managerChartData(@NotNull Context context) {
        String strC = c("chart_data.json", context);
        if (strC == null) {
            return null;
        }
        return INSTANCE.a(strC);
    }

    @Nullable
    public final List<SportShowDataBean> managerSportOverViewData(@NotNull Context context) {
        String strC = c("card_data.json", context);
        if (strC == null) {
            return null;
        }
        return INSTANCE.b(strC);
    }
}
