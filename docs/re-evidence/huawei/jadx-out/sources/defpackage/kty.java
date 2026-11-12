package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.IAggregateListener;
import com.huawei.hihealth.util.HiDivideUtil;
import com.huawei.hihealthservice.HiDataOperation;
import com.huawei.hihealthservice.auth.HiAuthException;
import com.huawei.hihealthservice.auth.HiAuthManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class kty extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IAggregateListener f39482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39483c;
    private HiSportStatDataAggregateOption d;
    private int e;

    kty(Context context) {
        super(context);
    }

    public boolean b(HiSportStatDataAggregateOption hiSportStatDataAggregateOption, IAggregateListener iAggregateListener, boolean z) throws RemoteException {
        if (hiSportStatDataAggregateOption == null) {
            LogUtil.j("HiH_HiSportStatDataAggregateOperation", "aggregateOption is null");
            ktu.e(iAggregateListener, null, 7, 2);
            return false;
        }
        this.d = hiSportStatDataAggregateOption;
        this.f39482b = iAggregateListener;
        String strE = ljp.e(this.mContext);
        this.f39483c = ktx.c().e(strE);
        this.e = kud.a().e();
        this.f39481a = ktx.c().a(strE);
        if (this.e <= 0) {
            LogUtil.j("HiH_HiSportStatDataAggregateOperation", "initialize userID <= 0 ,appID = ", Integer.valueOf(this.f39483c));
            ktu.e(iAggregateListener, null, 24, 2);
            return false;
        }
        if (z && !c()) {
            return false;
        }
        try {
            lkm.c(this.d);
            return true;
        } catch (lks e) {
            ReleaseLogUtil.a("HiH_HiSportStatDataAggregateOperation", "initialize HiValidException = ", e.getMessage());
            ktu.e(this.f39482b, null, 3, 2);
            return false;
        }
    }

    private boolean c() throws Throwable {
        int i = this.f39481a;
        if (i == -1) {
            LogUtil.a("HiH_HiSportStatDataAggregateOperation", "initialize appType is invalid");
            ktu.e(this.f39482b, null, 17, 2);
            return false;
        }
        if (i == 0) {
            return true;
        }
        int iA = kud.a().a(this.f39483c);
        if (iA != 0) {
            ktu.e(this.f39482b, null, iA, 2);
            return false;
        }
        try {
            HiAuthManager.getInstance().checkReadAuth(this.f39483c, this.e, this.d.getType());
            return true;
        } catch (HiAuthException e) {
            ReleaseLogUtil.a("HiH_HiSportStatDataAggregateOperation", "initialize HiAuthException e = ", e.getMessage());
            ktu.e(this.f39482b, null, 8, 2);
            return false;
        }
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("HiH_HiSportStatDataAggregateOperation", "execute appType ", Integer.valueOf(this.f39481a), " appId ", Integer.valueOf(this.f39483c), " id ", Integer.valueOf(this.e), " aggregateOption is ", this.d);
        try {
            try {
                HiDivideUtil.d(lgb.a(this.mContext).readSportStatAggregateData(new kym(this.f39483c, this.e), this.d), this.f39482b);
                ktu.e(this.f39482b, null, 0, 2);
            } catch (Exception e) {
                ReleaseLogUtil.a("HiH_HiSportStatDataAggregateOperation", "execute Exception: ", LogAnonymous.b(e));
                ktu.e(this.f39482b, null, 5, 2);
            }
            LogUtil.a("HiH_HiSportStatDataAggregateOperation", "execute end time = ", Long.valueOf(jCurrentTimeMillis), ", totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Throwable th) {
            ktu.e(this.f39482b, null, 0, 2);
            throw th;
        }
    }
}
