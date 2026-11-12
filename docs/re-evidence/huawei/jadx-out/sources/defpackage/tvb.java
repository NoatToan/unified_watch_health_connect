package defpackage;

import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.fitness.activity.active.writehelper.SportSimplifyItemCallback;
import com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class tvb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SportSimplifyItemCallback f49697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f49698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49699c;
    private final SportHistoryListFragment.n d = new SportHistoryListFragment.n();

    public void c() {
        this.f49699c = true;
    }

    public void c(int i, long j, SportSimplifyItemCallback sportSimplifyItemCallback) {
        if (j != this.f49698b || this.f49699c) {
            this.f49697a = sportSimplifyItemCallback;
            this.f49698b = j;
            this.f49699c = false;
            a(i, HiDateUtil.p(j), HiDateUtil.g(j));
        }
    }

    private void a(int i, long j, long j2) {
        this.d.a(new ntx.d().b(j).d(j2).c(0).e(0).a(i).a(), new a(i, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<vrb> list) {
        this.f49697a.onResponse(0, list);
    }

    static class a implements SportHistoryListFragment.IMultiResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f49700a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<tvb> f49701c;

        a(int i, tvb tvbVar) {
            this.f49701c = new WeakReference<>(tvbVar);
            this.f49700a = i;
        }

        @Override // com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment.IMultiResponseCallback
        public void onNotify(int[] iArr, Object[] objArr) {
            List list;
            LogUtil.a("Track_SportListSearchHelper", "Simply cb errorCode : ", Integer.valueOf(iArr.length), "Simply cb datas : ", Integer.valueOf(objArr.length));
            tvb tvbVar = this.f49701c.get();
            if (tvbVar == null) {
                ReleaseLogUtil.e("Track_SportListSearchHelper", "ReadTrackSimplifyListCallback sportHistory mWeakReference is null");
                return;
            }
            List list2 = null;
            try {
                list = njy.b(objArr[0], HiHealthData.class) ? (List) objArr[0] : null;
                try {
                    if (njy.b(objArr[1], WorkoutRecord.class)) {
                        list2 = (List) objArr[1];
                    }
                } catch (ClassCastException e) {
                    e = e;
                    ReleaseLogUtil.e("Track_SportListSearchHelper", "parseTrackSimplifyData ", e.getMessage());
                }
            } catch (ClassCastException e2) {
                e = e2;
                list = null;
            }
            ArrayList arrayList = new ArrayList(10);
            vqz.c((List<HiHealthData>) list, arrayList);
            tvbVar.b(vrg.d(arrayList, list2, this.f49700a));
        }
    }
}
