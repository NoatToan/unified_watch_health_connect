package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.lifecycle.Transformations;
import com.mi.health.a;
import com.mi.health.exercise.widget.GoalHelper;
import com.mi.health.router.business.IntentHelper;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.export.step.IStepProviderSyncer;
import com.xiaomi.fit.fitness.export.step.StepExportExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.lifecycle.LiveDataHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.dataprovider.DataProvider;
import com.xiaomi.fitness.dataprovider.DataProviderException;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class nfo extends DataProvider {
    public static /* synthetic */ void f() {
        StepExportExtKt.getINSTANCE(IStepProviderSyncer.INSTANCE).doRequestSteps("form StepWidgetProvider");
    }

    public final Map<String, Object> c(int i, String str, String str2, String str3) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("code", Integer.valueOf(i));
        arrayMap.put("title", getContext().getString(ezi.s));
        arrayMap.put("setup_uri", IntentHelper.INSTANCE.getRouterIntentByAction("steps").toUri(1));
        arrayMap.put("privacy_grant_uri", new Intent(a.f9964a).toUri(1));
        Objects.requireNonNull(str2);
        arrayMap.put(MiuiCursorConstants.CONTENT, str2);
        if (str3 == null) {
            str3 = "";
        }
        arrayMap.put("unit", str3);
        arrayMap.put("icon", getContext().getResources().getResourceName(ymi.f40330k));
        return arrayMap;
    }

    public final Map<String, Object> d() {
        int goalValue = GoalHelper.INSTANCE.getGoalValue(1, AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false).getRegularGoalList());
        Logger.i("StepWidgetProvider", "getSimpleStepGoal goal:" + goalValue);
        return Collections.singletonMap(FitnessPersistKey.Rainbow, String.valueOf(goalValue));
    }

    public final Map<String, Object> e(Uri uri, final String str) {
        ExecutorHelper.runInBackground(new Runnable() { // from class: lfo
            @Override // java.lang.Runnable
            public final void run() {
                nfo.f();
            }
        });
        return (Map) LiveDataHelper.INSTANCE.takeData(Transformations.map(FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getHomeDataRepository().getHomeDataWithTag(Collections.singletonList(HomeDataType.STEP), "home"), new Function1() { // from class: mfo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f26116a.g(str, (Map) obj);
            }
        }), 20, TimeUnit.SECONDS, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    public final /* synthetic */ Map g(String str, Map map) {
        String string;
        String quantityString;
        Resources resources = getContext().getResources();
        if (map != null) {
            HomeDataType homeDataType = HomeDataType.STEP;
            if (!map.containsKey(homeDataType) || map.get(homeDataType) == null) {
                string = resources.getString(ezi.n);
                quantityString = null;
            } else {
                DailyStepReport dailyStepReport = (DailyStepReport) map.get(homeDataType);
                Objects.requireNonNull(dailyStepReport);
                string = String.valueOf(dailyStepReport.getSteps());
                quantityString = resources.getQuantityString(lyi.f25557a, dailyStepReport.getSteps());
            }
        } else {
            string = resources.getString(ezi.n);
            quantityString = null;
        }
        Logger.i("StepWidgetProvider", "getSimpleStepWidget step:" + string);
        return c(0, str, string, quantityString);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public String getType(Uri uri) {
        int iMatchPath = matchPath(uri);
        if (iMatchPath == 2) {
            return "vnd.android.cursor.item/vnd.mi.health.widget.steps.simple";
        }
        if (iMatchPath != 3) {
            return null;
        }
        return "vnd.android.cursor.item/vnd.mi.health.widget.steps.goal";
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public void onRegisterPath(DataProvider.PathMapper pathMapper) {
        pathMapper.addPath("/simple", 2);
        pathMapper.addPath("/goal", 3);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, String str3) throws DataProviderException {
        Map<String, Object> mapC = (RegionPreference.INSTANCE.getPRIVACY_AGREE() && (TextUtils.isEmpty(RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion()) ^ true)) ? null : c(a.C0299a.f9966b, str3, getContext().getString(ezi.f17226r), null);
        if (mapC != null) {
            return DataProvider.INSTANCE.requireValidCursor(getContext(), uri, yc5.a(mapC, null));
        }
        int iMatchPath = matchPath(uri);
        if (iMatchPath == 2) {
            return DataProvider.INSTANCE.requireValidCursor(getContext(), uri, yc5.a(e(uri, str3), null));
        }
        if (iMatchPath == 3) {
            return DataProvider.INSTANCE.requireValidCursor(getContext(), uri, yc5.a(d(), null));
        }
        return null;
    }
}
