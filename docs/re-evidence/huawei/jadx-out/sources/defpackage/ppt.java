package defpackage;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ppt {
    public static boolean a() {
        return false;
    }

    private static ppu c() {
        AssetManager assets = BaseApplication.b().getAssets();
        try {
            String strC = CommonUtil.c(fdy.d("com.huawei.health_Sport_Common", "automatic_recognize_walk", "json"));
            if (TextUtils.isEmpty(strC)) {
                LogUtil.j("Track_AutoTrackUtils", "cloudConfigPath is illegal!");
                return null;
            }
            String strA = pia.a(new File(strC));
            LogUtil.j("Track_AutoTrackUtils", "getAutoWalkLocalPhoneModel.readFileToData jsonData = ", strA);
            if (TextUtils.isEmpty(strA)) {
                ppu ppuVar = (ppu) lls.a(assets.open("automatic_recognize_walk.json"), ppu.class);
                ReleaseLogUtil.d("Track_AutoTrackUtils", "mDefaultConfig : ", ppuVar == null ? 0 : ppuVar.a());
                c(ppuVar);
                return ppuVar;
            }
            ppu ppuVar2 = (ppu) new Gson().fromJson(strA, ppu.class);
            c(ppuVar2);
            return ppuVar2;
        } catch (JsonParseException unused) {
            ReleaseLogUtil.a("Track_AutoTrackUtils", "JsonParseException failed");
            return null;
        } catch (IOException e) {
            ReleaseLogUtil.a("Track_AutoTrackUtils", "loadDefaultCardSetConfig failed, ", LogAnonymous.b(e));
            return null;
        }
    }

    private static void c(ppu ppuVar) {
        if (ppuVar != null) {
            ppuVar.d(0);
        }
    }

    public static boolean b() {
        ppu ppuVarC = c();
        if (ppuVarC == null) {
            LogUtil.j("Track_AutoTrackUtils", "read native file is false");
            return false;
        }
        List<String> listB = ppuVarC.b();
        return CommonUtil.c((String[]) listB.toArray(new String[listB.size()]));
    }
}
