package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.IAggregateListener;
import com.huawei.hihealth.util.HiDivideUtil;
import com.huawei.hihealthservice.HiDataOperation;
import com.huawei.hihealthservice.auth.HiAuthException;
import com.huawei.hihealthservice.auth.HiAuthManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class ktd extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HiAggregateOption f39408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39409c;
    private IAggregateListener d;
    private int e;
    private int f;
    private String g;
    private kth j;

    ktd(Context context) {
        super(context);
    }

    public boolean b(HiAggregateOption hiAggregateOption, IAggregateListener iAggregateListener, kth kthVar) throws RemoteException {
        if (hiAggregateOption == null || kthVar == null) {
            LogUtil.j("HiH_HiDataAggregateOperation", "aggregateOption or extendOption is null");
            ktu.e(iAggregateListener, null, 7, 2);
            return false;
        }
        this.j = kthVar;
        this.f39408b = hiAggregateOption;
        this.d = iAggregateListener;
        this.g = ljp.e(this.mContext);
        this.e = ktx.c().e(this.g);
        this.f = kud.a().e();
        this.f39407a = ktx.c().a(this.g);
        this.f39409c = this.e;
        if (kthVar.j() != null) {
            this.f39409c = ktx.c().b(kthVar.j());
        }
        int i = this.f39407a;
        int i2 = this.e;
        int i3 = this.f;
        LogUtil.a("HiH_HiDataAggregateOperation", "appType ", Integer.valueOf(i), " appId ", Integer.valueOf(i2), " id ", Integer.valueOf(i3), " aggregateOption is ", this.f39408b, ", extendOption is ", kthVar);
        if (this.f <= 0) {
            LogUtil.j("HiH_HiDataAggregateOperation", "initialize userID <= 0 ,appID = ", Integer.valueOf(this.e));
            ktu.e(iAggregateListener, null, 24, 2);
            return false;
        }
        if (kthVar.i() && !d()) {
            return false;
        }
        try {
            lkm.b(this.f39408b);
            return true;
        } catch (lks e) {
            ReleaseLogUtil.a("HiH_HiDataAggregateOperation", "initialize HiValidException = ", e.getMessage());
            ktu.e(this.d, null, 3, 2);
            return false;
        }
    }

    private boolean d() throws Throwable {
        int i = this.f39407a;
        if (i == -1) {
            LogUtil.a("HiH_HiDataAggregateOperation", "initialize appType is invalid");
            ktu.e(this.d, null, 17, 2);
            return false;
        }
        if (i == 0) {
            return true;
        }
        int iA = kud.a().a(this.e);
        if (iA != 0) {
            ktu.e(this.d, null, iA, 2);
            return false;
        }
        try {
            HiAuthManager.getInstance().checkReadAuth(this.e, this.f, this.f39408b.getType());
            return true;
        } catch (HiAuthException e) {
            ReleaseLogUtil.a("HiH_HiDataAggregateOperation", "initialize HiAuthException e = ", e.getMessage());
            ktu.e(this.d, null, 8, 2);
            return false;
        }
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        try {
            try {
                if (b(this.f39408b)) {
                    lgg.d(this.f39408b.getStartTime());
                    lkb.r(this.mContext);
                }
                HiDivideUtil.d(lgb.a(this.mContext).readAggregateData(new kym(this.f39409c, this.f), this.f39408b, this.j), this.d);
            } catch (Exception e) {
                ReleaseLogUtil.a("HiH_HiDataAggregateOperation", "execute Exception: ", LogAnonymous.b(e));
                i = 5;
            }
            ktu.e(this.d, null, i, 2);
            LogUtil.a("HiH_HiDataAggregateOperation", "execute end time = ", Long.valueOf(jCurrentTimeMillis), ", totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Throwable th) {
            ktu.e(this.d, null, 0, 2);
            throw th;
        }
    }

    private boolean b(HiAggregateOption hiAggregateOption) {
        return lkb.e(this.mContext) && c(hiAggregateOption);
    }

    private boolean c(HiAggregateOption hiAggregateOption) {
        Arrays.sort(hiAggregateOption.getType());
        return Arrays.binarySearch(hiAggregateOption.getType(), 901) >= 0;
    }
}
