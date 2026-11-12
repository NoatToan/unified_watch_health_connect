package defpackage;

import android.content.res.Resources;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.heartrate.helper.HeartRateDetailData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class uef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f49983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<HeartRateDetailData> f49984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f49985c;
    private long d;
    private float e;

    public long e() {
        return this.f49985c;
    }

    public void c(long j) {
        this.f49985c = j;
    }

    public long c() {
        return this.d;
    }

    public void a(long j) {
        this.d = j;
    }

    public void c(float f) {
        this.e = f;
    }

    public void d(float f) {
        this.f49983a = f;
    }

    public void e(ArrayList<HeartRateDetailData> arrayList) {
        this.f49984b = arrayList;
    }

    public ArrayList<HeartRateDetailData> b() {
        return this.f49984b;
    }

    public String d() {
        Resources resources = BaseApplication.b().getResources();
        int i = R.plurals.IDS_health_zone_heart_rate_unit;
        int i2 = (int) this.f49983a;
        return resources.getQuantityString(i, i2, Integer.valueOf(i2), Integer.valueOf((int) this.e));
    }
}
