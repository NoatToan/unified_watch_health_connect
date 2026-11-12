package com.mi.health.menses.old;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import com.mi.health.RegionLimitAccessFilter;
import com.mi.health.a;
import com.mi.health.router.business.IntentHelper;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class MenstruationContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, String> f10028a = new ArrayMap();

    public final Bundle a(String str) {
        Bundle bundle = new Bundle();
        IHealthPage healthPageExtKt = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String curseTitle = healthPageExtKt.getCurseTitle(jCurrentTimeMillis);
        String curseSubTitle = healthPageExtKt.getCurseSubTitle(jCurrentTimeMillis);
        Logger.i("CurseProvider", "getTodayMenstruationBrief subtitle: " + curseSubTitle);
        boolean zHasPredictData = healthPageExtKt.hasPredictData();
        bundle.putString("title", curseTitle);
        bundle.putString(CardUIInfo.KEY_SUBTITILE, curseSubTitle);
        bundle.putBoolean("predictStatus", zHasPredictData);
        bundle.putInt(CommonConstants.KEY_VERSION_CODE, 1);
        bundle.putString(SportRecordBundleKey.BUNDLE_PARAM_URI, IntentHelper.INSTANCE.getRouterIntentByAction("lady_days").toUri(0));
        return bundle;
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        Logger.i("CurseProvider", "method = " + str);
        return (str.equals("get_today_menstruation_brief") && RegionLimitAccessFilter.INSTANCE.providerAccess(getContext()) == a.C0299a.f9965a) ? a(getCallingPackage()) : super.call(str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
