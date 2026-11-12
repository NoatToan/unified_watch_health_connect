package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.IMultiDataClientListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.HiDataOperation;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class kts extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IMultiDataClientListener f39469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f39470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HiTimeInterval f39471c;
    private List<Integer> d;
    private int e;

    kts(Context context) {
        super(context);
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        if (this.f39470b) {
            ktu.e(this.f39469a, lfv.d(this.mContext).getHealthClientMergedListByTime(this.d, this.f39471c, this.e));
            return;
        }
        HashMap map = new HashMap(16);
        for (Integer num : new HashSet(this.d)) {
            map.put(num, lfv.d(this.mContext).getHealthClientListByTime(num.intValue(), this.f39471c, this.e));
        }
        ktu.e(this.f39469a, map);
    }

    public boolean d(List list, HiTimeInterval hiTimeInterval, boolean z, IMultiDataClientListener iMultiDataClientListener) throws RemoteException {
        if (iMultiDataClientListener == null) {
            LogUtil.e("HiH_HiFetchDSByTypOp", "fetchDataSourceByTypes listener is null");
            return false;
        }
        if (ktx.c().e() == -1) {
            LogUtil.a("HiH_HiFetchDSByTypOp", "fetchDataSourceByTypes() appType is invalid");
            e();
            return false;
        }
        if (hiTimeInterval == null) {
            LogUtil.j("HiH_HiFetchDSByTypOp", "fetchDataSourceByTypes timeInterval is null");
            e();
            return false;
        }
        List<Integer> listD = d(list);
        if (listD.size() != list.size()) {
            LogUtil.j("HiH_HiFetchDSByTypOp", "fetchDataSourceByTypes types contains invalid value(s)");
            e();
            return false;
        }
        this.e = ktx.c().d();
        this.d = listD;
        this.f39471c = hiTimeInterval;
        this.f39470b = z;
        this.f39469a = iMultiDataClientListener;
        ReleaseLogUtil.d("HiH_HiFetchDSByTypOp", "fetchDataSourceByTypes=", HiJsonUtil.d(list), ",tmIntval=", hiTimeInterval, ",mge=", Boolean.valueOf(z));
        return true;
    }

    private List<Integer> d(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iB = CommonUtil.b(it.next().toString(), 10);
            if (iB != -1) {
                arrayList.add(Integer.valueOf(iB));
            }
        }
        return arrayList;
    }

    private void e() {
        if (this.f39470b) {
            ktu.e(this.f39469a, (List) null);
        } else {
            ktu.e(this.f39469a, (Map) null);
        }
    }
}
