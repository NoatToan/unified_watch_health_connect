package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.data.constant.HiHealthDataKey;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.sync.dataswitch.CoreSleepSwitch;
import com.huawei.hwcloudmodel.healthdatacloud.model.AddHealthStatReq;
import com.huawei.hwcloudmodel.model.unite.ProfessionalSleepTotal;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lhj {
    private static Context e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private lqo f40146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kwt f40147c;
    private boolean d;
    private int f;

    private lhj() {
        this.f40145a = 0;
        this.f = 0;
        this.d = false;
        this.f40147c = kwt.b();
        this.f40146b = lqo.b(e);
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final lhj f40148b = new lhj();
    }

    public static lhj b(Context context) {
        e = context.getApplicationContext();
        return b.f40148b;
    }

    public void a(int i, HiSyncOption hiSyncOption, CoreSleepSwitch coreSleepSwitch) throws lif {
        ReleaseLogUtil.d("HiH_HiSyncSleepStat", "pushData() begin!");
        this.f40145a = 0;
        this.f = 0;
        this.d = liq.f();
        if (!lgp.m()) {
            ReleaseLogUtil.e("HiH_HiSyncSleepStat", "pushData() healthDataPrivacy switch is closed, push end!");
            return;
        }
        int iG = this.f40147c.g(i);
        if (iG <= 0) {
            LogUtil.j("HiH_HiSyncSleepStat", "pushData() no statClient get, maybe no data need to push ,push end !");
        } else {
            if (this.d) {
                this.f = 0;
            }
            b(iG, hiSyncOption, coreSleepSwitch);
        }
        ReleaseLogUtil.d("HiH_HiSyncSleepStat", "pushData() end !");
    }

    private void b(int i, HiSyncOption hiSyncOption, CoreSleepSwitch coreSleepSwitch) throws lif {
        List<HiHealthData> listE;
        while (this.f40145a < 2 && (listE = e(i)) != null && !listE.isEmpty()) {
            if (b(listE, hiSyncOption, coreSleepSwitch)) {
                liq.e(e, listE, HiHealthDataType.e(), i);
            }
        }
        this.f40145a = 0;
    }

    private List<HiHealthData> e(int i) {
        int[] iArr = new int[2];
        if (!this.d) {
            iArr[0] = 50;
            iArr[1] = 0;
            return liq.a(e, i, HiHealthDataType.e(), HiHealthDataKey.e(), iArr);
        }
        iArr[0] = 50;
        iArr[1] = 1;
        return liq.a(e, i, HiHealthDataType.e(), HiHealthDataKey.e(), iArr);
    }

    private boolean b(List<HiHealthData> list, HiSyncOption hiSyncOption, CoreSleepSwitch coreSleepSwitch) throws lif {
        if (!this.d) {
            int i = this.f + 1;
            this.f = i;
            liq.c(i, hiSyncOption.getSyncManual());
        } else {
            int i2 = this.f + 1;
            this.f = i2;
            if (3 < i2) {
                this.f40145a += 2;
                return false;
            }
        }
        List<ProfessionalSleepTotal> listE = coreSleepSwitch.e(list);
        if (listE.isEmpty()) {
            this.f40145a++;
            return false;
        }
        AddHealthStatReq addHealthStatReq = new AddHealthStatReq();
        addHealthStatReq.setProfessionalSleepTotal(listE);
        addHealthStatReq.setTimeZone(list.get(0).getTimeZone());
        while (this.f40145a < 2) {
            if (!lih.e(this.f40146b.c(addHealthStatReq), false)) {
                this.f40145a++;
            } else {
                ReleaseLogUtil.d("HiH_HiSyncSleepStat", "addCoreSleepStat success, mUploadCount is ,", Integer.valueOf(this.f));
                LogUtil.a("HiH_HiSyncSleepStat", ",stat is ", HiJsonUtil.d(listE));
                return true;
            }
        }
        ReleaseLogUtil.d("HiH_HiSyncSleepStat", "addCoreSleepStat failed, mUploadCount is ,", Integer.valueOf(this.f));
        LogUtil.a("HiH_HiSyncSleepStat", "stat is ", HiJsonUtil.d(listE));
        return false;
    }

    public List<Integer> b(int i) {
        return liq.c(e, this.f40147c.g(i));
    }
}
