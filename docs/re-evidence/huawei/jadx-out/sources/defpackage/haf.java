package defpackage;

import android.text.TextUtils;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class haf {
    public static gzf b() {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_RunningPaceZone_Config");
        if (userPreference == null) {
            return null;
        }
        String value = userPreference.getValue();
        LogUtil.a("Track_PaceZoneUtils", "mPaceZoneConfig:", value);
        if (TextUtils.isEmpty(value)) {
            return null;
        }
        gzf gzfVar = new gzf();
        gzfVar.c(value);
        return gzfVar;
    }

    public static gzf c() {
        gzf gzfVarB = b();
        return gzfVarB == null ? new gzf() : gzfVarB;
    }

    public static int[] e() {
        return c().j();
    }

    public static int[] d() {
        gzf gzfVarB = b();
        if (gzfVarB == null) {
            return new int[0];
        }
        return gzfVarB.j();
    }

    public static int[] e(gzf gzfVar, List<njl> list, long j) {
        int[] iArr = new int[5];
        if (gzfVar == null || njy.e(list)) {
            return null;
        }
        a(list, iArr, xjm.e(list, j), gzfVar);
        if (!d(iArr)) {
            return iArr;
        }
        LogUtil.j("Track_PaceZoneUtils", "hasInvalidValue requestPaceInterDuration");
        return null;
    }

    private static void a(List<njl> list, int[] iArr, int i, gzf gzfVar) {
        int iE;
        if (list == null) {
            LogUtil.e("Track_PaceZoneUtils", "paceList is null");
            return;
        }
        if (gzfVar == null) {
            return;
        }
        for (njl njlVar : list) {
            if (njlVar != null && (iE = gzfVar.e(njlVar.e())) != -1) {
                iArr[iE] = iArr[iE] + i;
            }
        }
    }

    private static boolean d(int[] iArr) {
        if (iArr == null) {
            return true;
        }
        boolean z = true;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == -1) {
                z2 = true;
            }
            if (i != 0) {
                z = false;
            }
        }
        return z || z2;
    }
}
