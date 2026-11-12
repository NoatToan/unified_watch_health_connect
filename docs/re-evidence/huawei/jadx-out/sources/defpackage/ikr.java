package defpackage;

import com.huawei.health.threeCircle.remind.model.ThreeCircleRemindData;
import com.huawei.operation.utils.Constants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Comparator;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes9.dex */
public class ikr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PriorityQueue<ThreeCircleRemindData> f37750b = new PriorityQueue<>(3, new Comparator() { // from class: iks
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ikr.c((ThreeCircleRemindData) obj, (ThreeCircleRemindData) obj2);
        }
    });

    static /* synthetic */ int c(ThreeCircleRemindData threeCircleRemindData, ThreeCircleRemindData threeCircleRemindData2) {
        return threeCircleRemindData.getPriority() - threeCircleRemindData2.getPriority();
    }

    public void d(ThreeCircleRemindData threeCircleRemindData) {
        synchronized (this) {
            ReleaseLogUtil.d("R_REMIND_DATA_QUEUE", "offer data:", threeCircleRemindData.getRemindType(), threeCircleRemindData.getSubRemindType(), threeCircleRemindData.getRemindText());
            this.f37750b.offer(threeCircleRemindData);
            while (this.f37750b.size() > 1) {
                ThreeCircleRemindData threeCircleRemindDataPoll = this.f37750b.poll();
                if (threeCircleRemindDataPoll != null) {
                    ReleaseLogUtil.d("R_REMIND_DATA_QUEUE", "poll data:", threeCircleRemindDataPoll.getRemindType());
                }
            }
        }
    }

    public ThreeCircleRemindData d() {
        ThreeCircleRemindData threeCircleRemindDataPeek;
        synchronized (this) {
            threeCircleRemindDataPeek = this.f37750b.peek();
            ReleaseLogUtil.d("R_REMIND_DATA_QUEUE", "peek:", threeCircleRemindDataPeek == null ? Constants.NULL : threeCircleRemindDataPeek.getRemindType());
        }
        return threeCircleRemindDataPeek;
    }

    public void e() {
        synchronized (this) {
            ReleaseLogUtil.d("R_REMIND_DATA_QUEUE", "postProcess clear");
            this.f37750b.clear();
        }
    }
}
