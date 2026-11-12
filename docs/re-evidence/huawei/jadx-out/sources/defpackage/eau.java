package defpackage;

import android.text.TextUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.operation.utils.Constants;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eau {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HiHealthData f32618c;
    private boolean d;
    private List<eav> e;

    public eau(HiHealthData hiHealthData) {
        this.f32618c = hiHealthData;
    }

    public List<eav> c() {
        return this.e;
    }

    public void b(List<eav> list) {
        this.e = list;
    }

    public double d() {
        HiHealthData hiHealthData = this.f32618c;
        if (hiHealthData != null) {
            return hiHealthData.getDouble("bodyWeight");
        }
        return 0.0d;
    }

    public String b() {
        HiHealthData hiHealthData = this.f32618c;
        if (hiHealthData != null) {
            return UnitUtil.d("yyyy/MM/dd HH:mm", hiHealthData.getStartTime());
        }
        return null;
    }

    public long e() {
        HiHealthData hiHealthData = this.f32618c;
        if (hiHealthData != null) {
            return hiHealthData.getStartTime();
        }
        return 0L;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eau)) {
            return false;
        }
        eau eauVar = (eau) obj;
        if (TextUtils.isEmpty(b()) || TextUtils.isEmpty(eauVar.b())) {
            return false;
        }
        return b().equals(eauVar.b());
    }

    public int hashCode() {
        HiHealthData hiHealthData = this.f32618c;
        if (hiHealthData != null) {
            return hiHealthData.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("ClaimWeightDataBean{StartTime =");
        stringBuffer.append(b() == null ? Constants.NULL : b()).append("', mIsChoose ='");
        stringBuffer.append(this.d);
        stringBuffer.append(", mData ='").append(this.f32618c.toString());
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public HiHealthData a() {
        return this.f32618c;
    }

    public boolean f() {
        return this.d;
    }

    public void a(boolean z) {
        this.d = z;
    }
}
