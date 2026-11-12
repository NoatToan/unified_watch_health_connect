package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class mnq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static mnq f42019c;
    private static final Object d = new Object();

    public static mnq b() {
        mnq mnqVar;
        synchronized (d) {
            if (f42019c == null) {
                f42019c = new mnq();
            }
            mnqVar = f42019c;
        }
        return mnqVar;
    }

    public boolean e(TransferFileInfo transferFileInfo) {
        long j;
        LogUtil.a("HwFileTransferTaskManager", "enter isResetContinueTask");
        if (transferFileInfo != null && mnr.b().b(transferFileInfo)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str = "LAST_CONTINUE_TIME" + nio.e(transferFileInfo.getDeviceSn());
            String strE = mnr.b().e(str);
            if (TextUtils.isEmpty(strE)) {
                LogUtil.a("HwFileTransferTaskManager", "lastTimeString is empty");
                mnr.b().d(str, String.valueOf(jCurrentTimeMillis));
                return false;
            }
            try {
                j = Long.parseLong(strE);
            } catch (NumberFormatException unused) {
                LogUtil.e("HwFileTransferTaskManager", "isResetContinueTask NumberFormatException.");
                j = 0;
            }
            LogUtil.a("HwFileTransferTaskManager", "last time is:", Long.valueOf(j), ", current time is:", Long.valueOf(jCurrentTimeMillis));
            if (jCurrentTimeMillis - j > 86400000) {
                mnr.b().d(str, "");
                return true;
            }
        }
        return false;
    }

    public void a(ArrayList arrayList, TransferFileInfo transferFileInfo) {
        if (!mnr.b().b(transferFileInfo) || arrayList == null || arrayList.isEmpty()) {
            LogUtil.j("HwFileTransferTaskManager", "compareList Invalid argument.");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (int i = 0; i < arrayList.size() - 1; i++) {
            stringBuffer.append(arrayList.get(i).toString() + ',');
        }
        stringBuffer.append(arrayList.get(arrayList.size() - 1).toString());
        String strE = mnr.b().e("CONTINUE_LOG_LIST");
        if (strE == null) {
            mnr.b().d(stringBuffer, arrayList);
            return;
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(strE.split(",")));
        ArrayList<String> arrayList3 = new ArrayList<>(arrayList2);
        if (njy.c(arrayList, arrayList2, false)) {
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "filelist is same with the previou");
            String strE2 = mnr.b().e("CONTINUE_LOG_NAME");
            if (strE2 != null && strE.indexOf(strE2) != -1) {
                d(strE2, arrayList3, arrayList);
                return;
            }
        }
        mnr.b().e(stringBuffer, arrayList);
    }

    private void d(String str, ArrayList<String> arrayList, ArrayList arrayList2) {
        if (arrayList == null) {
            return;
        }
        String str2 = arrayList.get(0);
        while (!str.equals(str2)) {
            arrayList.remove(0);
            if (!arrayList.isEmpty()) {
                str2 = arrayList.get(0);
            }
        }
        arrayList2.clear();
        Object objClone = arrayList.clone();
        if (objClone instanceof ArrayList) {
            arrayList2.addAll((ArrayList) objClone);
        }
    }
}
