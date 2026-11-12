package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.ICommonListener;
import com.huawei.hihealthservice.HiDataOperation;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class ktt extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HiAccountInfo f39472a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ICommonListener f39473c;
    private final ArrayList<Boolean> d;
    private kym e;

    ktt(Context context) {
        super(context);
        this.d = new ArrayList<>(10);
    }

    public boolean a(HiAccountInfo hiAccountInfo, ICommonListener iCommonListener) throws RemoteException {
        if (iCommonListener == null) {
            return false;
        }
        this.e = ktx.c().a();
        this.f39472a = hiAccountInfo;
        this.f39473c = iCommonListener;
        if (ktx.c().e() == -1) {
            LogUtil.a("HiH_HiLoginOperation", "hiLogin() appType is invalid");
            this.d.add(false);
            ktu.a(iCommonListener, 17, this.d);
            return false;
        }
        if (!ktx.c().j()) {
            LogUtil.e("HiH_HiLoginOperation", "is not allow login");
            this.d.add(false);
            ktu.a(this.f39473c, 12, this.d);
            return false;
        }
        HiAccountInfo hiAccountInfo2 = this.f39472a;
        if (hiAccountInfo2 != null && !TextUtils.isEmpty(hiAccountInfo2.getHuid()) && !this.f39472a.getHuid().contains("com.") && !"0".equals(this.f39472a.getHuid())) {
            return true;
        }
        this.d.add(false);
        ktu.a(this.f39473c, 7, this.d);
        return false;
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        LogUtil.a("HiH_HiLoginOperation", "hiLogin() accountInfo:", this.f39472a, "app context:", this.e);
        boolean zHiLogin = kud.a().hiLogin(this.f39472a, this.e);
        if (lkb.s(this.mContext)) {
            lkb.x(this.mContext);
        }
        LogUtil.d("HiH_HiLoginOperation", "hiLogin() result = ", Boolean.valueOf(zHiLogin));
        if (zHiLogin) {
            if (ktx.c().f()) {
                boolean zF = ktx.c().f();
                LogUtil.a("HiH_HiLoginOperation", "hiLogin() boolean is ", Boolean.valueOf(zF), " app = ", this.e);
                if (!ktx.c().g()) {
                    ljl.a(this.mContext).a(this.f39472a.getHuid());
                }
            }
            this.d.add(true);
            ktu.d(this.f39473c, 0, this.d);
            return;
        }
        LogUtil.a("HiH_HiLoginOperation", "hiLogin() fail");
        this.d.add(false);
        ktu.a(this.f39473c, 12, this.d);
    }
}
