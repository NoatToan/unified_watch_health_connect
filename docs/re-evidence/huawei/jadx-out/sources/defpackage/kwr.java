package defpackage;

import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kuz f39564a;

    private kwr() {
        this.f39564a = kuz.d();
    }

    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final kwr f39565c = new kwr();
    }

    public static kwr c() {
        return d.f39565c;
    }

    public List<HiHealthData> a(int i, List<Integer> list, String str) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        String[] strArr = new String[size + 1];
        stringBuffer.append("type_id =? ");
        strArr[0] = Long.toString(i);
        kwb.e("client_id", list, stringBuffer, strArr, 1);
        LogUtil.d("Debug_DataRealTimeManager", "queryRealTimeData() sbSelector = ", stringBuffer);
        return kwf.o(this.f39564a.query(stringBuffer.toString(), strArr, null, null, "start_time DESC "), str);
    }
}
