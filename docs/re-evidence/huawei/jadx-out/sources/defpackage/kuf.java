package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.ICommonListener;
import com.huawei.hihealth.data.constant.HiErrorCode;
import com.huawei.hihealthservice.HiDataOperation;
import com.huawei.hihealthservice.auth.HiAuthException;
import com.huawei.hihealthservice.auth.HiAuthManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kuf extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HiDataReadOption f39500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ICommonListener f39501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<Object> f39502c;
    private int d;
    private int e;
    private int[] f;
    private kyj h;
    private int i;

    kuf(Context context) {
        super(context);
        this.f = new int[]{-1};
        ArrayList<Object> arrayList = new ArrayList<>(10);
        this.f39502c = arrayList;
        arrayList.add(HiErrorCode.c(0));
    }

    public boolean c(HiDataReadOption hiDataReadOption, ICommonListener iCommonListener, boolean z) throws RemoteException {
        this.f39501b = iCommonListener;
        this.f39500a = hiDataReadOption;
        this.h = kyj.c();
        String strE = ljp.e(this.mContext);
        this.d = ktx.c().e(strE);
        this.i = kud.a().e();
        int iA = ktx.c().a(strE);
        this.e = iA;
        if (iA != 0) {
            this.d = ktx.c().b(HuaweiHealth.c());
        }
        if (this.i > 0) {
            return !z || c();
        }
        this.f39502c.set(0, 2);
        ktu.a(iCommonListener, 24, this.f39502c);
        return false;
    }

    private boolean c() throws Throwable {
        int i = this.e;
        if (i == -1) {
            LogUtil.j("HiH_HiSptTypeLstFtOp", "initialize checkAppAuth() appType is invalid");
            this.f39502c.set(0, 2);
            ktu.a(this.f39501b, 17, this.f39502c);
            return false;
        }
        if (i == 0) {
            return true;
        }
        int iA = kud.a().a(this.d);
        if (iA != 0) {
            this.f39502c.set(0, 2);
            ktu.a(this.f39501b, iA, this.f39502c);
            return false;
        }
        try {
            HiAuthManager.getInstance().checkReadAuth(this.d, this.i, this.f);
            return true;
        } catch (HiAuthException e) {
            ReleaseLogUtil.a("HiH_HiSptTypeLstFtOp", "initialize HiAuthException e = ", e.getMessage(), " appID = ", Integer.valueOf(this.d), " who = ", Integer.valueOf(this.i));
            this.f39502c.set(0, 2);
            ktu.a(this.f39501b, 8, this.f39502c);
            return false;
        }
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("HiH_HiSptTypeLstFtOp", "execute checkAppType  ", Integer.valueOf(this.e), " appID = ", Integer.valueOf(this.d));
        List<Integer> listA = a(this.f39500a.getReadType(), this.i, this.d, this.f39500a.getDeviceUuid());
        if (njy.e(listA)) {
            LogUtil.j("HiH_HiSptTypeLstFtOp", "execute getClientIds is null");
            ktu.a(this.f39501b, 7, new ArrayList());
            return;
        }
        List<Integer> listA2 = kws.e(this.mContext).a(listA);
        ReleaseLogUtil.d("HiH_HiSptTypeLstFtOp", "execute fetchSportTypeList sportTypes = ", listA2);
        if (listA2 != null) {
            ktu.d(this.f39501b, 0, listA2);
        } else {
            LogUtil.a("HiH_HiSptTypeLstFtOp", "execute fail");
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(false);
            ktu.a(this.f39501b, 14, arrayList);
        }
        LogUtil.a("HiH_HiSptTypeLstFtOp", "execute end! cost time is ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private List<Integer> a(int i, int i2, int i3, String str) {
        if (i == 0) {
            return this.h.c(i2);
        }
        if (i == 1) {
            return this.h.e(i3, i2);
        }
        if (i != 2) {
            return null;
        }
        return this.h.a(i2, str);
    }
}
