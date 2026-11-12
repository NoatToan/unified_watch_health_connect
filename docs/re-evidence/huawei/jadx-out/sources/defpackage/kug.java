package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiUserInfo;
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
public class kug extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ICommonListener f39504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39505c;
    private int d;
    private final ArrayList<Object> e;
    private int f;
    private int[] h;

    kug(Context context) {
        super(context);
        this.h = new int[]{-1};
        ArrayList<Object> arrayList = new ArrayList<>(10);
        this.e = arrayList;
        arrayList.add(HiErrorCode.c(0));
    }

    public boolean e(ICommonListener iCommonListener, boolean z) throws RemoteException {
        this.f39504b = iCommonListener;
        this.f39503a = ljp.e(this.mContext);
        this.d = ktx.c().e(this.f39503a);
        this.f = kud.a().e();
        int iA = ktx.c().a(this.f39503a);
        this.f39505c = iA;
        if (iA != 0) {
            this.d = ktx.c().b(HuaweiHealth.c());
        }
        if (this.f > 0) {
            return !z || a();
        }
        this.e.set(0, 2);
        ktu.a(iCommonListener, 24, this.e);
        return false;
    }

    private boolean a() throws Throwable {
        int i = this.f39505c;
        if (i == -1) {
            LogUtil.a("HiH_HiUserDataFetchOperation", "initialize fetchUserData() appType is invalid");
            this.e.set(0, 2);
            ktu.a(this.f39504b, 17, this.e);
            return false;
        }
        if (i == 0) {
            return true;
        }
        int iA = kud.a().a(this.d);
        if (iA != 0) {
            this.e.set(0, 2);
            ktu.a(this.f39504b, iA, this.e);
            return false;
        }
        try {
            HiAuthManager.getInstance().checkReadAuth(this.d, this.f, this.h);
            return true;
        } catch (HiAuthException e) {
            ReleaseLogUtil.a("HiH_HiUserDataFetchOperation", "initialize HiAuthException e = ", e.getMessage(), " appID = ", Integer.valueOf(this.d), " who = ", Integer.valueOf(this.f));
            this.e.set(0, 2);
            ktu.a(this.f39504b, 8, this.e);
            return false;
        }
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("HiH_HiUserDataFetchOperation", "execute checkAppType  ", Integer.valueOf(this.f39505c), " appID = ", Integer.valueOf(this.d));
        List<HiUserInfo> listFetchUserData = kud.a().fetchUserData(this.d);
        LogUtil.d("HiH_HiUserDataFetchOperation", "execute fetchUserData userInfos = ", listFetchUserData);
        if (listFetchUserData != null) {
            ktu.d(this.f39504b, 0, listFetchUserData);
        } else {
            LogUtil.a("HiH_HiUserDataFetchOperation", "execute fail");
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(false);
            ktu.a(this.f39504b, 14, arrayList);
        }
        LogUtil.a("HiH_HiUserDataFetchOperation", "execute end! cost time is ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }
}
