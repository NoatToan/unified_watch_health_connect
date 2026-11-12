package defpackage;

import android.util.LruCache;
import com.huawei.hihealth.HiHealthData;
import health.compact.a.HiCommonUtil;

/* JADX INFO: loaded from: classes10.dex */
public class kyg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LruCache<String, String> f39617c;

    private kyg() {
        this.f39617c = new LruCache<>(20);
    }

    static class b {
        private static final kyg d = new kyg();
    }

    public static kyg c() {
        return b.d;
    }

    public void a(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return;
        }
        String strB = b(hiHealthData);
        String str = this.f39617c.get(strB);
        if (str == null) {
            str = "";
        }
        this.f39617c.put(strB, str + hiHealthData.getSequenceData());
    }

    public String d(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return "";
        }
        String strB = b(hiHealthData);
        String str = this.f39617c.get(strB);
        if (HiCommonUtil.a(str)) {
            return hiHealthData.getSequenceData();
        }
        this.f39617c.remove(strB);
        return str + hiHealthData.getSequenceData();
    }

    private String b(HiHealthData hiHealthData) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(hiHealthData.getStartTime()).append("_").append(hiHealthData.getEndTime()).append("_").append(hiHealthData.getType()).append("_").append(hiHealthData.getClientId()).append("_").append(hiHealthData.getDataId());
        return stringBuffer.toString();
    }
}
