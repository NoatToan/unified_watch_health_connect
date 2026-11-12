package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealthservice.HiDataOperation;
import com.huawei.hihealthservice.auth.HiAuthException;
import com.huawei.hihealthservice.auth.HiAuthManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ktm extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kth f39430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39432c;
    private int d;
    private int e;
    private int f;
    private IDataReadResultListener h;
    private HiDataReadOption i;

    ktm(Context context) {
        super(context);
    }

    public boolean d(HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener, kth kthVar) throws RemoteException {
        if (hiDataReadOption == null || kthVar == null) {
            LogUtil.j("HiH_HiDataReadOp", "readOption or extendOption is null");
            ktu.b(iDataReadResultListener, null, 7, 2);
            return false;
        }
        this.f39430a = kthVar;
        this.i = hiDataReadOption;
        this.h = iDataReadResultListener;
        this.f39431b = ljp.e(this.mContext);
        this.e = ktx.c().e(this.f39431b);
        this.f = kud.a().e();
        this.f39432c = ktx.c().a(this.f39431b);
        this.d = this.e;
        if (kthVar.j() != null) {
            this.d = ktx.c().b(kthVar.j());
        }
        int i = this.f39432c;
        int i2 = this.e;
        int i3 = this.f;
        ReleaseLogUtil.d("HiH_HiDataReadOp", "AppTp:", Integer.valueOf(i), ",AppId=", Integer.valueOf(i2), ",id=", Integer.valueOf(i3), ",readOpt=", this.i, ",extOpt=", kthVar);
        if (this.f <= 0) {
            LogUtil.j("HiH_HiDataReadOp", "initialize userID <= 0 ,appID = ", Integer.valueOf(this.e));
            ktu.b(this.h, null, 24, 2);
            return false;
        }
        if (kthVar.i() && !c()) {
            return false;
        }
        try {
            lkq.b(this.i);
            return true;
        } catch (lks e) {
            ReleaseLogUtil.a("HiH_HiDataReadOp", "readHiHealthData() HiValidException = ", e.getMessage());
            ktu.b(this.h, null, 3, 2);
            return false;
        }
    }

    private boolean c() throws Throwable {
        int i = this.f39432c;
        if (i == -1) {
            LogUtil.a("HiH_HiDataReadOp", "initialize appType is invalid");
            ktu.b(this.h, null, 17, 2);
            return false;
        }
        if (i == 0) {
            return true;
        }
        int iA = kud.a().a(this.e);
        if (iA != 0) {
            ktu.b(this.h, null, iA, 2);
            return false;
        }
        try {
            HiAuthManager.getInstance().checkReadAuth(this.e, this.f, this.i.getType());
            return true;
        } catch (HiAuthException e) {
            ReleaseLogUtil.a("HiH_HiDataReadOp", "checkReadAppAuth HiAuthException e = ", e.getMessage(), " appID = ", Integer.valueOf(this.e), " who = ", Integer.valueOf(this.f));
            ktu.b(this.h, null, 8, 2);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Long, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ?? r2 = 0;
        r2 = 0;
        ?? ValueOf = 0;
        ValueOf = 0;
        int i = 0;
        try {
            try {
                kym kymVar = new kym(this.d, this.f);
                int alignType = this.i.getAlignType();
                lgb lgbVarA = lgb.a(this.mContext);
                if (alignType > 0) {
                    lgbVarA.readDataByAlignType(alignType, kymVar, this.i, this.h);
                } else {
                    lgbVarA.readDataByType(this.i, kymVar, this.f39430a, this.h);
                }
            } catch (Exception e) {
                ReleaseLogUtil.a("HiH_HiDataReadOp", "execute exception = ", LogAnonymous.b(e));
                i = 5;
            }
            ktu.b(this.h, null, i, 2);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            ValueOf = Long.valueOf(jCurrentTimeMillis);
            Long lValueOf = Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis);
            r2 = ", totalTime = ";
            LogUtil.a("HiH_HiDataReadOp", "execute end time = ", ValueOf, ", totalTime = ", lValueOf);
        } catch (Throwable th) {
            ktu.b(this.h, r2, ValueOf, 2);
            throw th;
        }
    }
}
