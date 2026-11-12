package defpackage;

import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.mi.health.a;
import com.mi.health.step.StepTimelineDataHandler;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.export.step.IStepProviderSyncer;
import com.xiaomi.fit.fitness.export.step.StepExportExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.account.user.DallyGoalItem;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.lifecycle.DataHolder;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.dataprovider.DataProvider;
import com.xiaomi.fitness.dataprovider.DataProviderException;
import com.xiaomi.fitness.dataprovider.DataUtils;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class udo extends DataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eie f35665a = new eie(1);

    public static /* synthetic */ void b() {
        StepExportExtKt.getINSTANCE(IStepProviderSyncer.INSTANCE).doRequestSteps("form StepDataProvider");
    }

    public final Cursor c(Uri uri, String[] strArr, String str) {
        List<DallyGoalItem> regularGoalList = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false).getRegularGoalList();
        Logger.i("StepDataProvider", "queryGoalList:" + regularGoalList + ";callPackage:" + str);
        if (regularGoalList == null || regularGoalList.isEmpty()) {
            return DataUtils.obtainEmptyCursor(0, null);
        }
        if (strArr == null || strArr.length <= 0) {
            strArr = new String[]{"goal_type", "goal_target"};
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr, regularGoalList.size());
        for (DallyGoalItem dallyGoalItem : regularGoalList) {
            MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
            rowBuilderNewRow.add("goal_type", Integer.valueOf(dallyGoalItem.getField()));
            rowBuilderNewRow.add("goal_target", Integer.valueOf(dallyGoalItem.getTarget()));
        }
        return matrixCursor;
    }

    public final Cursor d(Uri uri, String[] strArr, String str) throws DataProviderException {
        rdo rdoVar = new rdo(getContext(), strArr, str);
        IHomeDataRepository homeDataRepository = FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getHomeDataRepository();
        LiveData<Cursor> liveDataAsLiveData = new DataHolder(rdoVar).addSource("step", Map.class, homeDataRepository.getHomeData(Collections.singletonList(HomeDataType.STEP))).addSource("calorie", Map.class, homeDataRepository.getHomeData(Collections.singletonList(HomeDataType.CALORIE))).addSource("strength", Map.class, homeDataRepository.getHomeData(Collections.singletonList(HomeDataType.MH_STRENGTH))).asLiveData();
        this.f35665a.c(getContext(), uri, liveDataAsLiveData);
        ExecutorHelper.runInBackground(new Runnable() { // from class: tdo
            @Override // java.lang.Runnable
            public final void run() {
                udo.b();
            }
        });
        Logger.i("StepDataProvider", "queryStepBrief: uri=" + uri + ", callPackage=" + str);
        return DataProvider.INSTANCE.requireValidCursor(getContext(), uri, liveDataAsLiveData);
    }

    public final Cursor e(Uri uri, String[] strArr, String str) throws DataProviderException {
        long todayZeroTimeInSec;
        String queryParameter = uri.getQueryParameter("time");
        if (TextUtils.isEmpty(queryParameter)) {
            todayZeroTimeInSec = 0;
        } else {
            try {
                todayZeroTimeInSec = Long.parseLong(queryParameter);
            } catch (NumberFormatException unused) {
                todayZeroTimeInSec = 0;
            }
        }
        if (todayZeroTimeInSec <= 0) {
            todayZeroTimeInSec = FitnessDateUtils.getTodayZeroTimeInSec();
        }
        LiveData<Cursor> liveDataAsLiveData = new DataHolder(new StepTimelineDataHandler(strArr, getContext()), false).addSource(StepTimelineDataHandler.STEP_REPORT_MAP, Map.class, FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getHomeDataRepository().getHomeDataWithTagTime(Collections.singletonList(HomeDataType.STEP), "days", Long.valueOf(todayZeroTimeInSec))).asLiveData();
        this.f35665a.c(getContext(), uri, liveDataAsLiveData);
        return DataProvider.INSTANCE.requireValidCursor(getContext(), uri, liveDataAsLiveData);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public String getType(Uri uri) {
        int iMatchPath = matchPath(uri);
        if (iMatchPath == 2) {
            return "vnd.android.cursor.item/vnd.mi.health.steps.brief";
        }
        if (iMatchPath == 3) {
            return "vnd.android.cursor.dir/vnd.mi.health.steps.goals";
        }
        if (iMatchPath != 4) {
            return null;
        }
        return "vnd.android.cursor.dir/vnd.mi.health.steps.timeline";
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public void onRegisterPath(DataProvider.PathMapper pathMapper) {
        pathMapper.addPath("/brief", 2);
        pathMapper.addPath("/goals", 3);
        pathMapper.addPath("/timeline", 4);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, String str3) throws DataProviderException {
        boolean privacy_agree = RegionPreference.INSTANCE.getPRIVACY_AGREE();
        boolean z = !TextUtils.isEmpty(RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion());
        if (privacy_agree && z) {
            int iMatchPath = matchPath(uri);
            if (iMatchPath == 2) {
                return d(uri, strArr, str3);
            }
            if (iMatchPath == 3) {
                return c(uri, strArr, str3);
            }
            if (iMatchPath != 4) {
                return null;
            }
            return e(uri, strArr, str3);
        }
        Bundle bundle = new Bundle();
        String str4 = a.f9964a;
        bundle.putString("setup_uri", new Intent(str4).toUri(1));
        bundle.putString("privacy_url", of4.f(LocaleUtil.getCurrentLocale(), "app"));
        bundle.putString("privacy_grant_uri", new Intent(str4).toUri(1));
        Logger.i("StepDataProvider", "query fail,privacyEnable:" + privacy_agree + ";regionEnable:" + z);
        throw new DataProviderException(a.C0299a.f9966b, bundle);
    }
}
