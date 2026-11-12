package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.common.utils.CollectionUtils;
import health.compact.a.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("alarmInfoList")
    private List<ayx> f1399a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("enabled")
    private boolean f1400c;

    public cao(boolean z, List<ayx> list) {
        d(z);
        e(list);
    }

    public boolean d() {
        return this.f1400c;
    }

    public void d(boolean z) {
        this.f1400c = z;
        if (CollectionUtils.a(this.f1399a)) {
            ReleaseLogUtil.d("R_HL_HealthModeReminderBean", "setEnabled mAlarmInfoList ", this.f1399a);
            return;
        }
        for (ayx ayxVar : this.f1399a) {
            if (ayxVar != null) {
                ayxVar.b(z);
            }
        }
    }

    public List<ayx> b() {
        return this.f1399a;
    }

    public void e(List<ayx> list) {
        this.f1399a = list;
    }

    public String toString() {
        if (CollectionUtils.a(this.f1399a)) {
            ReleaseLogUtil.d("R_HL_HealthModeReminderBean", "toString mAlarmInfoList ", this.f1399a);
            return "HealthModeReminderBean{mIsEnabled=" + this.f1400c + ", mAlarmInfoList=" + this.f1399a + '}';
        }
        StringBuilder sb = new StringBuilder("HealthModeReminderBean{mIsEnabled=" + this.f1400c);
        for (ayx ayxVar : this.f1399a) {
            if (ayxVar != null) {
                int iC = ayxVar.c();
                int iE = ayxVar.e();
                int iA = ayxVar.a();
                boolean zH = ayxVar.h();
                sb.append(", {hour=");
                sb.append(iC);
                sb.append(", minute=");
                sb.append(iE);
                sb.append(", daysOfWeek=");
                sb.append(iA);
                sb.append(", isEnabled=");
                sb.append(zH);
                sb.append("}");
            }
        }
        return ((Object) sb) + "}";
    }
}
