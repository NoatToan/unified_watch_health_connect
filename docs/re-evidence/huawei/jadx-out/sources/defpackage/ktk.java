package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.IDataClientListener;
import com.huawei.hihealthservice.HiDataOperation;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ktk extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IDataClientListener f39424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HiDataSourceFetchOption f39426c;
    private String d;
    private int e;
    private int j;

    ktk(Context context) {
        super(context);
    }

    public boolean d(HiDataSourceFetchOption hiDataSourceFetchOption, IDataClientListener iDataClientListener, boolean z) throws RemoteException {
        if (iDataClientListener == null) {
            LogUtil.j("HiH_HiDataSourceFetchOperation", "listener is null");
            return false;
        }
        if (hiDataSourceFetchOption == null) {
            LogUtil.j("HiH_HiDataSourceFetchOperation", "fetchOption is null");
            ktu.b(iDataClientListener, (List) null);
            return false;
        }
        this.f39424a = iDataClientListener;
        this.f39426c = hiDataSourceFetchOption;
        this.d = ljp.e(this.mContext);
        this.e = ktx.c().e(this.d);
        this.j = kud.a().e();
        this.f39425b = ktx.c().a(this.d);
        if (this.j <= 0) {
            LogUtil.j("HiH_HiDataSourceFetchOperation", "fetchDataSource initialize userID <= 0 ,appID = ", Integer.valueOf(this.e));
            ktu.b(iDataClientListener, (List) null);
            return false;
        }
        if (this.f39426c.getFetchType() == null) {
            LogUtil.j("HiH_HiDataSourceFetchOperation", "FetchType is null!");
            ktu.b(iDataClientListener, (List) null);
            return false;
        }
        if (this.f39426c.getFetchType().intValue() == 1 && (this.f39426c.getClientIds() == null || this.f39426c.getClientIds().length == 0)) {
            LogUtil.j("HiH_HiDataSourceFetchOperation", "FetchType is READ_CLIENT but clientId list is empty");
            ktu.b(iDataClientListener, (List) null);
            return false;
        }
        if (!z || b()) {
            return true;
        }
        LogUtil.j("HiH_HiDataSourceFetchOperation", "Check app auth is false!");
        return false;
    }

    private boolean b() {
        if (this.f39425b != -1) {
            return true;
        }
        LogUtil.j("HiH_HiDataSourceFetchOperation", "initialize appType is invalid");
        ktu.b(this.f39424a, (List) null);
        return false;
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<HiHealthClient> healthClientListByUserId = lfv.d(this.mContext).getHealthClientListByUserId(this.j, this.f39426c);
        ktu.b(this.f39424a, healthClientListByUserId);
        LogUtil.d("HiH_HiDataSourceFetchOperation", "fetchDataSource end, clientList is ", healthClientListByUserId);
        LogUtil.a("HiH_HiDataSourceFetchOperation", "execute end totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }
}
