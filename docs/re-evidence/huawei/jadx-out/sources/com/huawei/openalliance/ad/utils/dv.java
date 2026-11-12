package com.huawei.openalliance.ad.utils;

import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.pa;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class dv {
    public static boolean a(ContentRecord contentRecord, String str) {
        if (contentRecord == null || !pa.H(contentRecord.X())) {
            return (dg.b(str) || !dg.c(str)) ? a(contentRecord) : Boolean.parseBoolean(str);
        }
        return a(contentRecord);
    }

    private static boolean a(ContentRecord contentRecord) {
        hw.a("VideoSoundUtil", "get video sound config from server");
        if (contentRecord == null) {
            return true;
        }
        Map<String, String> mapAK = contentRecord.aK();
        if (br.a(mapAK)) {
            return true;
        }
        return !"y".equals(mapAK.get(Constants.VIDEO_PLAY_SOUND));
    }
}
