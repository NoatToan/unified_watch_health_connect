package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.IAggregateListenerEx;
import com.huawei.hihealth.util.HiDivideUtil;
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
public class ksz extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IAggregateListenerEx f39394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f39395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39396c;
    private List<HiDataAggregateProOption> d;
    private int e;
    private int i;
    private String j;

    ksz(Context context) {
        super(context);
    }

    public boolean c(List list, IAggregateListenerEx iAggregateListenerEx, boolean z) throws RemoteException {
        if (list == null) {
            LogUtil.j("HiH_HiDataAggProEx", "aggregateProOptions is null");
            ktu.c(iAggregateListenerEx, null, 7, 2);
            return false;
        }
        LogUtil.d("HiH_HiDataAggProEx", "initialize aggregateProOptions = ", list);
        ArrayList arrayList = new ArrayList(10);
        this.d = arrayList;
        try {
            arrayList.addAll(list);
            this.f39394a = iAggregateListenerEx;
            this.j = ljp.e(this.mContext);
            this.f39396c = ktx.c().e(this.j);
            this.i = kud.a().e();
            this.e = ktx.c().a(this.j);
            this.f39395b = z;
            if (this.i <= 0) {
                LogUtil.j("HiH_HiDataAggProEx", "initialize userID <= 0 ,appID = ", Integer.valueOf(this.f39396c));
                ktu.c(iAggregateListenerEx, null, 24, 2);
                return false;
            }
            if (z && !b()) {
                return false;
            }
            try {
                Iterator<HiDataAggregateProOption> it = this.d.iterator();
                while (it.hasNext()) {
                    lkm.b(it.next().getAggregateOption());
                }
                return true;
            } catch (lks e) {
                ReleaseLogUtil.a("HiH_HiDataAggProEx", "initialize HiValidException = ", e.getMessage());
                ktu.c(iAggregateListenerEx, null, 3, 2);
                return false;
            }
        } catch (ClassCastException e2) {
            ReleaseLogUtil.a("HiH_HiDataAggProEx", "initialize ClassCastException e = ", e2.getMessage());
            throw new RemoteException(e2.getMessage());
        }
    }

    private boolean b() {
        int iA;
        int i = this.e;
        if (i == -1) {
            LogUtil.a("HiH_HiDataAggProEx", "initialize appType is invalid");
            ktu.c(this.f39394a, null, 17, 2);
            return false;
        }
        if (i == 0 || (iA = kud.a().a(this.f39396c)) == 0) {
            return true;
        }
        ktu.c(this.f39394a, null, iA, 2);
        return false;
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        int i;
        int i2;
        char c2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i3 = 8;
        int i4 = 5;
        try {
            try {
                try {
                    kym kymVar = new kym();
                    kymVar.g(this.i);
                    kymVar.d(this.f39396c);
                    int i5 = this.e;
                    int i6 = this.f39396c;
                    int i7 = this.i;
                    char c3 = 6;
                    Integer numValueOf = Integer.valueOf(i6);
                    char c4 = 3;
                    LogUtil.d("HiH_HiDataAggProEx", "execute checkAppType  ", Integer.valueOf(i5), " appID = ", numValueOf, " userID = ", Integer.valueOf(i7));
                    int i8 = 0;
                    while (i8 < this.d.size()) {
                        HiDataAggregateProOption hiDataAggregateProOption = this.d.get(i8);
                        if (hiDataAggregateProOption == null) {
                            c2 = c3;
                            i = i4;
                        } else {
                            int i9 = this.e;
                            int i10 = this.f39396c;
                            int i11 = this.i;
                            try {
                                Object[] objArr = new Object[i3];
                                objArr[0] = "appTp=";
                                objArr[1] = Integer.valueOf(i9);
                                objArr[2] = " appId=";
                                objArr[c4] = Integer.valueOf(i10);
                                objArr[4] = " id=";
                                Integer numValueOf2 = Integer.valueOf(i11);
                                i = 5;
                                try {
                                    objArr[5] = numValueOf2;
                                    c2 = 6;
                                    objArr[6] = " aggProOpt=";
                                    objArr[7] = hiDataAggregateProOption;
                                    ReleaseLogUtil.d("HiH_HiDataAggProEx", objArr);
                                    if (this.f39395b && this.e != 0) {
                                        HiAuthManager.getInstance().checkReadAuth(this.f39396c, this.i, hiDataAggregateProOption.getAggregateOption().getType());
                                    }
                                    HiDivideUtil.d(i8, lgb.a(this.mContext).readAggregateData(kymVar, hiDataAggregateProOption.getAggregateOption(), kth.b(this.f39395b).d(hiDataAggregateProOption.getPackageName()).b(hiDataAggregateProOption.getDataFilter()).d(hiDataAggregateProOption.getWithoutDefaultZero()).d()), this.f39394a);
                                } catch (Exception e) {
                                    e = e;
                                    ReleaseLogUtil.a("HiH_HiDataAggProEx", "execute Exception", LogAnonymous.b(e));
                                    i2 = i;
                                    ktu.c(this.f39394a, null, i2, 2);
                                    LogUtil.a("HiH_HiDataAggProEx", "execute end totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                                }
                            } catch (Exception e2) {
                                e = e2;
                                i = 5;
                            }
                        }
                        i8++;
                        i4 = i;
                        c3 = c2;
                        i3 = 8;
                        c4 = 3;
                    }
                    ktu.c(this.f39394a, null, 0, 2);
                } catch (HiAuthException e3) {
                    ReleaseLogUtil.a("HiH_HiDataAggProEx", "execute HiAuthException e = ", e3.getMessage());
                    i2 = 8;
                    ktu.c(this.f39394a, null, i2, 2);
                }
            } catch (Exception e4) {
                e = e4;
                i = i4;
            }
            LogUtil.a("HiH_HiDataAggProEx", "execute end totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Throwable th) {
            ktu.c(this.f39394a, null, 0, 2);
            throw th;
        }
    }
}
