package com.huami.moving.config.chart;

import android.content.Context;
import com.huami.moving.config.SportConfigManager;
import com.huami.moving.utils.ext.TrackrecordKt;
import com.huami.tools.analytics.DbUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\"\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lcom/huami/moving/config/chart/SportChartJsonParser;", "Lorg/koin/core/component/KoinComponent;", "", "fileName", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "jsonStr", "", "", "a", "", "sportType", "", "Lcom/huami/moving/config/chart/SportChartType;", "matchChartTypeBySportType", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportChartJsonParser implements KoinComponent {

    @NotNull
    public static final SportChartJsonParser INSTANCE = new SportChartJsonParser();

    private SportChartJsonParser() {
    }

    private final Map<String, List<String>> a(String jsonStr) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = new JSONArray(jsonStr);
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("sportGroup");
                JSONArray jSONArray2 = jSONObject.getJSONArray("charts");
                ArrayList arrayList = new ArrayList();
                int length2 = jSONArray2.length();
                if (length2 > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        arrayList.add(jSONArray2.getString(i3));
                        if (i4 >= length2) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                linkedHashMap.put(string, arrayList);
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return linkedHashMap;
    }

    private final String b(String fileName, Context context) {
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

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final List<SportChartType> matchChartTypeBySportType(int sportType, @NotNull Context context) {
        ArrayList arrayList = new ArrayList();
        String strB = b("sportCharts.json", context);
        if (strB != null) {
            SportChartJsonParser sportChartJsonParser = INSTANCE;
            String groupId = ((SportConfigManager) sportChartJsonParser.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SportConfigManager.class), null, null)).getGroupId(TrackrecordKt.getSportType(sportType));
            if (groupId != null) {
                for (Map.Entry<String, List<String>> entry : sportChartJsonParser.a(strB).entrySet()) {
                    if (Intrinsics.areEqual(entry.getKey(), groupId)) {
                        Iterator<T> it2 = entry.getValue().iterator();
                        while (it2.hasNext()) {
                            arrayList.add(SportChartType.INSTANCE.getSportChartTypeByValue((String) it2.next()));
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
