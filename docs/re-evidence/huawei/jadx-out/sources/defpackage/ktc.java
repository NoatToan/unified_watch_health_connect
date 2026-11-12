package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiAggregateOption;
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
public class ktc extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IAggregateListenerEx f39406c;
    private int d;
    private List<HiAggregateOption> e;
    private int g;

    ktc(Context context) {
        super(context);
    }

    public boolean c(List list, IAggregateListenerEx iAggregateListenerEx, boolean z) throws RemoteException {
        if (list == null) {
            LogUtil.j("HiH_HiDataAggExOp", "aggregateOptions is null");
            ktu.c(iAggregateListenerEx, null, 7, 2);
            return false;
        }
        LogUtil.d("HiH_HiDataAggExOp", "initialize aggregateOptions = ", list);
        ArrayList arrayList = new ArrayList(10);
        this.e = arrayList;
        try {
            arrayList.addAll(list);
            this.f39406c = iAggregateListenerEx;
            this.f39405b = ljp.e(this.mContext);
            this.d = ktx.c().e(this.f39405b);
            this.g = kud.a().e();
            this.f39404a = ktx.c().a(this.f39405b);
            if (this.g <= 0) {
                LogUtil.j("HiH_HiDataAggExOp", "initialize userID <= 0 ,appID = ", Integer.valueOf(this.d));
                ktu.c(iAggregateListenerEx, null, 24, 2);
                return false;
            }
            if (z && !c()) {
                return false;
            }
            try {
                Iterator<HiAggregateOption> it = this.e.iterator();
                while (it.hasNext()) {
                    lkm.b(it.next());
                }
                return true;
            } catch (lks e) {
                ReleaseLogUtil.a("HiH_HiDataAggExOp", "initialize HiValidException = ", e.getMessage());
                ktu.c(iAggregateListenerEx, null, 3, 2);
                return false;
            }
        } catch (ClassCastException e2) {
            ReleaseLogUtil.a("HiH_HiDataAggExOp", "initialize ClassCastException e = ", e2.getMessage());
            throw new RemoteException(e2.getMessage());
        }
    }

    private boolean c() {
        int iA;
        int i = this.f39404a;
        if (i == -1) {
            LogUtil.a("HiH_HiDataAggExOp", "initialize appType is invalid");
            ktu.c(this.f39406c, null, 17, 2);
            return false;
        }
        if (i == 0 || (iA = kud.a().a(this.d)) == 0) {
            return true;
        }
        ktu.c(this.f39406c, null, iA, 2);
        return false;
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        int i;
        int i2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i3 = 8;
        int i4 = 5;
        try {
            try {
                try {
                    kym kymVar = new kym();
                    kymVar.g(this.g);
                    kymVar.d(this.d);
                    int i5 = this.f39404a;
                    int i6 = this.d;
                    int i7 = this.g;
                    Integer numValueOf = Integer.valueOf(i6);
                    char c2 = 3;
                    LogUtil.d("HiH_HiDataAggExOp", "execute checkAppType  ", Integer.valueOf(i5), " appID = ", numValueOf, " userID = ", Integer.valueOf(i7));
                    int i8 = 0;
                    while (i8 < this.e.size()) {
                        HiAggregateOption hiAggregateOption = this.e.get(i8);
                        int i9 = this.f39404a;
                        int i10 = this.d;
                        int i11 = this.g;
                        try {
                            Object[] objArr = new Object[i3];
                            objArr[0] = "appTp ";
                            objArr[1] = Integer.valueOf(i9);
                            objArr[2] = " appId ";
                            objArr[c2] = Integer.valueOf(i10);
                            objArr[4] = " id ";
                            Integer numValueOf2 = Integer.valueOf(i11);
                            i = 5;
                            try {
                                objArr[5] = numValueOf2;
                                objArr[6] = " aggOpt=";
                                objArr[7] = hiAggregateOption;
                                ReleaseLogUtil.d("HiH_HiDataAggExOp", objArr);
                                if (this.f39404a != 0) {
                                    HiAuthManager.getInstance().checkReadAuth(this.d, this.g, hiAggregateOption.getType());
                                }
                                HiDivideUtil.d(i8, lgb.a(this.mContext).readAggregateData(kymVar, hiAggregateOption, null), this.f39406c);
                                i8++;
                                i4 = 5;
                                i3 = 8;
                                c2 = 3;
                            } catch (Exception e) {
                                e = e;
                                ReleaseLogUtil.a("HiH_HiDataAggExOp", "execute Exception", LogAnonymous.b(e));
                                i2 = i;
                                ktu.c(this.f39406c, null, i2, 2);
                                LogUtil.a("HiH_HiDataAggExOp", "execute end totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = 5;
                        }
                    }
                    ktu.c(this.f39406c, null, 0, 2);
                } catch (HiAuthException e3) {
                    ReleaseLogUtil.a("HiH_HiDataAggExOp", "execute HiAuthException e = ", e3.getMessage());
                    i2 = 8;
                    ktu.c(this.f39406c, null, i2, 2);
                }
            } catch (Exception e4) {
                e = e4;
                i = i4;
            }
            LogUtil.a("HiH_HiDataAggExOp", "execute end totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Throwable th) {
            ktu.c(this.f39406c, null, 0, 2);
            throw th;
        }
    }
}
