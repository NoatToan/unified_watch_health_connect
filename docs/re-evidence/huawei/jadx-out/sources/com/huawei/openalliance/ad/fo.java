package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.openalliance.ad.constant.AdConfigMapKey;
import com.huawei.openalliance.ad.constant.ConfigMapKeys;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class fo implements gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f18809a = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static gj f18810c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f18811b;

    @Override // com.huawei.openalliance.ad.gj
    public int d(String str) {
        return e(str).getInt("resultAdReqType", 0);
    }

    @Override // com.huawei.openalliance.ad.gj
    public boolean c(String str) {
        return e(str).getBoolean(ConfigMapKeys.CLICK_VALID_CTRL, false);
    }

    @Override // com.huawei.openalliance.ad.gj
    public int b(String str) {
        return e(str).getInt("recommendPath", 0);
    }

    @Override // com.huawei.openalliance.ad.gj
    public boolean a(String str) {
        return e(str).getBoolean("recommendEnabled", false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003a  */
    @Override // com.huawei.openalliance.ad.gj
    public void a(String str, Map<String, String> map) {
        boolean z;
        SharedPreferences.Editor editorEdit = e(str).edit();
        Integer numJ = com.huawei.openalliance.ad.utils.dg.j(map.get(AdConfigMapKey.AD_RECOMMEND_ENABLED));
        Integer numJ2 = com.huawei.openalliance.ad.utils.dg.j(map.get(AdConfigMapKey.FAT_AD_RECOMMEND_PATH));
        editorEdit.putBoolean(ConfigMapKeys.CLICK_VALID_CTRL, "1".equals(map.get(ConfigMapKeys.CLICK_VALID_CTRL)));
        if (numJ != null) {
            z = numJ.intValue() == 1;
        }
        editorEdit.putBoolean("recommendEnabled", z);
        editorEdit.putInt("recommendPath", numJ2 != null ? numJ2.intValue() : 0);
        editorEdit.putInt("resultAdReqType", com.huawei.openalliance.ad.utils.dg.a(map.get("resultAdReqType"), 0));
        editorEdit.apply();
    }

    private SharedPreferences e(String str) {
        return this.f18811b.getSharedPreferences("hiad_slot_cfg_" + str, 0);
    }

    private static gj b(Context context) {
        gj gjVar;
        synchronized (f18809a) {
            if (f18810c == null) {
                f18810c = new fo(context);
            }
            gjVar = f18810c;
        }
        return gjVar;
    }

    public static gj a(Context context) {
        return b(context);
    }

    private fo(Context context) {
        this.f18811b = com.huawei.openalliance.ad.utils.ab.i(context.getApplicationContext());
    }
}
