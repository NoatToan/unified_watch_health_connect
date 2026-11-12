package defpackage;

import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.knit.data.KnitHealthDataChangeListener;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class fop implements HiSubscribeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<KnitHealthDataChangeListener> f34322a;
    private String d;

    public fop(KnitHealthDataChangeListener knitHealthDataChangeListener, String str) {
        this.f34322a = new WeakReference<>(knitHealthDataChangeListener);
        this.d = str;
    }

    @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
    public void onResult(List<Integer> list, List<Integer> list2) {
        KnitHealthDataChangeListener knitHealthDataChangeListener = this.f34322a.get();
        if (knitHealthDataChangeListener != null && njy.b(list)) {
            knitHealthDataChangeListener.setSubscribeList(list);
        }
    }

    @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
    public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
        KnitHealthDataChangeListener knitHealthDataChangeListener = this.f34322a.get();
        if (knitHealthDataChangeListener == null) {
            return;
        }
        if (ArkUIXConstants.DELETE.equals(str)) {
            knitHealthDataChangeListener.onDataDeleted();
        } else if (ArkUIXConstants.INSERT.equals(str)) {
            knitHealthDataChangeListener.onDataInserted(j);
        } else {
            LogUtil.j(this.d, "unknown changeKey = ", str);
        }
    }
}
