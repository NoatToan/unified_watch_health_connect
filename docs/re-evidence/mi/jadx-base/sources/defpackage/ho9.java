package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.dataprovider.DataProvider;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.user.info.export.MedicalIdPreference;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;

/* JADX INFO: loaded from: classes5.dex */
public class ho9 extends DataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20284a = MedicalIdSPContract.PREF_FIRST;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20285b = MedicalIdSPContract.PREF_LOCK_SCREEN_SHOW;

    public final Cursor a() {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("action", "com.mi.health.action.FIRST_AID_HOME");
        boolean privacy_agree = RegionPreference.INSTANCE.getPRIVACY_AGREE();
        boolean z = !TextUtils.isEmpty(RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion());
        if (!privacy_agree || !z) {
            arrayMap.put("result", 0);
            Logger.i("FirstAidDataProvider", "health privacy enable false");
            return yc5.a(arrayMap, null);
        }
        MedicalIdPreference medicalIdPreference = MedicalIdPreference.INSTANCE;
        boolean medical_id_init_status = medicalIdPreference.getMEDICAL_ID_INIT_STATUS();
        boolean show_when_lock_screen = medicalIdPreference.getSHOW_WHEN_LOCK_SCREEN();
        boolean zA = joe.a(getContext());
        StringBuilder sb = new StringBuilder();
        sb.append("medicalIdFilled:");
        sb.append(!medical_id_init_status);
        sb.append("/lockShowEnable:");
        sb.append(show_when_lock_screen);
        sb.append("/healthHasLockPermission:");
        sb.append(zA);
        Logger.i("FirstAidDataProvider", sb.toString());
        arrayMap.put("result", Integer.valueOf((!medical_id_init_status && show_when_lock_screen && zA) ? 1 : 0));
        return yc5.a(arrayMap, null);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public String getType(Uri uri) {
        if (matchPath(uri) == 2) {
            return "vnd.android.cursor.item/vnd.mi.health.firstaid.query.emergency";
        }
        return null;
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public void onRegisterPath(DataProvider.PathMapper pathMapper) {
        pathMapper.addPath("/queryEmergencyEnter", 2);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, String str3) {
        if (matchPath(uri) == 2) {
            return a();
        }
        return null;
    }
}
