package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.ICommonListener;
import com.huawei.hihealthservice.HiDataOperation;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class ktw extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Boolean> f39474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kym f39475b;
    private ICommonListener e;

    ktw(Context context) {
        super(context);
        this.f39474a = new ArrayList<>(10);
    }

    public boolean d(ICommonListener iCommonListener) throws RemoteException {
        if (iCommonListener == null) {
            return false;
        }
        this.f39475b = ktx.c().a();
        this.e = iCommonListener;
        if (ktx.c().e() != -1) {
            return true;
        }
        ReleaseLogUtil.d("HiH_HiLogoutOperation", "hiLogout() appType is invalid");
        this.f39474a.add(false);
        ktu.a(this.e, 17, this.f39474a);
        return false;
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        ReleaseLogUtil.d("HiH_HiLogoutOperation", "hiLogout()");
        String strD = kud.a().d();
        if (kud.a().hiLogout(this.f39475b) > 0) {
            kud.a().b(strD);
            kzw.c().b(strD);
            lkb.e(this.mContext, strD);
            this.f39474a.add(true);
            ktu.d(this.e, 0, this.f39474a);
            return;
        }
        ReleaseLogUtil.d("HiH_HiLogoutOperation", "hiLogout() fail");
        this.f39474a.add(false);
        ktu.a(this.e, 13, this.f39474a);
    }
}
