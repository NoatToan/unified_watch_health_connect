package defpackage;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.mi.health.a;
import com.mi.health.router.business.IntentHelper;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.dataprovider.DataProvider;
import com.xiaomi.fitness.dataprovider.DataProviderException;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;

/* JADX INFO: loaded from: classes5.dex */
public class v5c extends DataProvider {
    public final Cursor a(Uri uri, String[] strArr) throws DataProviderException {
        return DataProvider.INSTANCE.requireValidCursor(getContext(), uri, e6c.b(strArr));
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public String getType(Uri uri) {
        if (matchPath(uri) != 2) {
            return null;
        }
        return "vnd.android.cursor.item/vnd.mi.health.heartrate.recent";
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public void onRegisterPath(DataProvider.PathMapper pathMapper) {
        pathMapper.addPath("/recent", 2);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, String str3) throws DataProviderException {
        boolean privacy_agree = RegionPreference.INSTANCE.getPRIVACY_AGREE();
        boolean z = !TextUtils.isEmpty(RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion());
        if (privacy_agree && z) {
            if (matchPath(uri) != 2) {
                return null;
            }
            return a(uri, strArr);
        }
        Bundle bundle = new Bundle();
        bundle.putString("setup_uri", IntentHelper.INSTANCE.getRouterIntentByAction("heart_rate_home").toUri(0));
        String str4 = a.f9964a;
        bundle.putString("privacy_url", new Intent(str4).toUri(1));
        bundle.putString("privacy_grant_uri", new Intent(str4).toUri(1));
        throw new DataProviderException(a.C0299a.f9966b, bundle);
    }
}
