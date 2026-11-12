package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealthservice.HiDataOperation;
import com.huawei.hihealthservice.auth.HiAuthException;
import com.huawei.hihealthservice.auth.HiAuthManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ktf extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f39413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f39415c;
    private int d;
    private int e;
    private List<HiDataReadProOption> g;
    private int i;
    private IDataReadResultListener j;

    ktf(Context context) {
        super(context);
    }

    public boolean b(List list, IDataReadResultListener iDataReadResultListener, boolean z) throws RemoteException {
        if (list == null) {
            LogUtil.j("HiH_HiDataRdExOp", "readOptions is null");
            ktu.b(iDataReadResultListener, null, 7, 2);
            return false;
        }
        ArrayList arrayList = new ArrayList(10);
        this.g = arrayList;
        try {
            arrayList.addAll(list);
            this.f39413a = z;
            this.j = iDataReadResultListener;
            this.f39415c = ljp.e(this.mContext);
            this.e = ktx.c().e(this.f39415c);
            this.i = kud.a().e();
            int iA = ktx.c().a(this.f39415c);
            this.f39414b = iA;
            int i = this.e;
            this.d = i;
            int i2 = this.i;
            LogUtil.a("HiH_HiDataRdExOp", "AppType  ", Integer.valueOf(iA), " appID = ", Integer.valueOf(i), " id = ", Integer.valueOf(i2), " readOptions = ", this.g);
            if (this.i <= 0) {
                LogUtil.j("HiH_HiDataRdExOp", "initialize userID <= 0 ,appID = ", Integer.valueOf(this.e));
                ktu.b(this.j, null, 24, 2);
                return false;
            }
            if (z && !d()) {
                return false;
            }
            try {
                Iterator<HiDataReadProOption> it = this.g.iterator();
                while (it.hasNext()) {
                    lkq.b(it.next().getDataReadOption());
                }
                return true;
            } catch (lks e) {
                ReleaseLogUtil.a("HiH_HiDataRdExOp", "readHiHealthData() HiValidException = ", e.getMessage());
                ktu.b(this.j, null, 3, 2);
                return false;
            }
        } catch (ClassCastException e2) {
            ReleaseLogUtil.a("HiH_HiDataRdExOp", "initialize ClassCastException e = ", e2.getMessage());
            throw new RemoteException(e2.getMessage());
        }
    }

    private boolean d() {
        int iA;
        int i = this.f39414b;
        if (i == -1) {
            LogUtil.a("HiH_HiDataRdExOp", "initialize appType is invalid");
            ktu.b(this.j, null, 17, 2);
            return false;
        }
        if (i == 0 || (iA = kud.a().a(this.e)) == 0) {
            return true;
        }
        ktu.b(this.j, null, iA, 2);
        return false;
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        int i;
        int i2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i3 = 8;
        try {
            try {
                try {
                    kym kymVar = new kym(this.d, this.i);
                    lgb lgbVarA = lgb.a(this.mContext);
                    int i4 = 0;
                    while (i4 < this.g.size()) {
                        HiDataReadProOption hiDataReadProOption = this.g.get(i4);
                        if (hiDataReadProOption != null) {
                            int i5 = this.f39414b;
                            int i6 = this.e;
                            int i7 = this.i;
                            Object[] objArr = new Object[i3];
                            objArr[0] = "appType ";
                            objArr[1] = Integer.valueOf(i5);
                            objArr[2] = " appId ";
                            objArr[3] = Integer.valueOf(i6);
                            objArr[4] = " id ";
                            i = 5;
                            try {
                                objArr[5] = Integer.valueOf(i7);
                                objArr[6] = " dataReadOption is ";
                                objArr[7] = hiDataReadProOption;
                                ReleaseLogUtil.d("HiH_HiDataRdExOp", objArr);
                                if (this.f39414b != 0) {
                                    HiAuthManager.getInstance().checkReadAuth(this.e, this.i, hiDataReadProOption.getDataReadOption().getType());
                                }
                                int alignType = hiDataReadProOption.getDataReadOption().getAlignType();
                                kth kthVarD = kth.b(this.f39413a).d(hiDataReadProOption.getPackageName()).a(Integer.valueOf(hiDataReadProOption.getSequenceDataType())).b(hiDataReadProOption.getDataFilter()).a(hiDataReadProOption.getMetadataFilter()).c(hiDataReadProOption.isLastDayDetail()).d();
                                if (alignType > 0) {
                                    lgbVarA.readDataByAlignType(alignType, kymVar, hiDataReadProOption.getDataReadOption(), this.j);
                                } else {
                                    lgbVarA.readDataByType(hiDataReadProOption.getDataReadOption(), kymVar, kthVarD, this.j);
                                }
                            } catch (Exception e) {
                                e = e;
                                ReleaseLogUtil.a("HiH_HiDataRdExOp", "execute exception = ", LogAnonymous.b(e));
                                i2 = i;
                                ktu.b(this.j, null, i2, 2);
                                LogUtil.a("HiH_HiDataRdExOp", "execute end time = ", Long.valueOf(jCurrentTimeMillis), ", totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            }
                        }
                        i4++;
                        i3 = 8;
                    }
                    ktu.b(this.j, null, 0, 2);
                } catch (HiAuthException e2) {
                    ReleaseLogUtil.a("HiH_HiDataRdExOp", "execute HiAuthException e = ", e2.getMessage());
                    i2 = 8;
                    ktu.b(this.j, null, i2, 2);
                }
            } catch (Exception e3) {
                e = e3;
                i = 5;
            }
            LogUtil.a("HiH_HiDataRdExOp", "execute end time = ", Long.valueOf(jCurrentTimeMillis), ", totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Throwable th) {
            ktu.b(this.j, null, 0, 2);
            throw th;
        }
    }
}
