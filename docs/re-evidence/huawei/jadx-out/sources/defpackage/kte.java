package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.IDataOperateListener;
import com.huawei.hihealth.data.constant.HiErrorCode;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.HiDataOperation;
import com.huawei.hihealthservice.auth.HiAuthException;
import com.huawei.hihealthservice.auth.HiAuthManager;
import com.huawei.hwcloudmodel.model.unite.DataTimeDelCondition;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kte extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<Object> f39412c;
    private int d;
    private int e;
    private kym f;
    private HiDataDeleteOption g;
    private int h;
    private String i;
    private IDataOperateListener j;
    private int n;

    @Override // com.huawei.hihealthservice.HiDataOperation
    public boolean isMonitorThread() {
        return true;
    }

    kte(Context context) {
        super(context);
        this.d = 2;
        ArrayList<Object> arrayList = new ArrayList<>(10);
        this.f39412c = arrayList;
        arrayList.add(HiErrorCode.c(0));
    }

    public boolean e(HiDataDeleteOption hiDataDeleteOption, IDataOperateListener iDataOperateListener, kth kthVar) throws RemoteException {
        if (hiDataDeleteOption == null || kthVar == null) {
            LogUtil.e("HiH_HiDataDeleteOperation", "initialize deleteOption or extendOption is null ");
            ktu.d(iDataOperateListener, 7, this.f39412c);
            return false;
        }
        ReleaseLogUtil.d("HiH_HiDataDeleteOperation", "deleteHiHealthData deleteOption = ", hiDataDeleteOption, ", extendOption = ", kthVar);
        if (kthVar.e(kthVar.c()) || kthVar.e(kthVar.a()) || kthVar.e(kthVar.e())) {
            ReleaseLogUtil.e("HiH_HiDataDeleteOperation", "ExtendOption input wrong, DeleteLevel is ", Integer.valueOf(kthVar.c()), ", DeleteType is ", Integer.valueOf(kthVar.a()), ", DeleteInterval is ", Integer.valueOf(kthVar.e()));
            ktu.d(iDataOperateListener, 7, this.f39412c);
            return false;
        }
        String strE = ljp.e(this.mContext);
        this.i = strE;
        this.g = hiDataDeleteOption;
        this.j = iDataOperateListener;
        this.f39411b = ktx.c().b(lkf.a(strE));
        this.n = kud.a().e();
        this.e = ktx.c().a(this.i);
        this.d = 1;
        this.f39410a = this.f39411b;
        this.h = kthVar.e();
        if (kthVar.j() != null) {
            this.f39410a = ktx.c().b(kthVar.j());
        }
        if (kthVar.i() && !e()) {
            return false;
        }
        this.d = 1;
        c(this.i, kthVar);
        return true;
    }

    private boolean e() throws Throwable {
        int i = this.e;
        if (i == -1) {
            LogUtil.j("HiH_HiDataDeleteOperation", "initialize appType is invalid errorCode is ", 17);
            ktu.d(this.j, 17, this.f39412c);
            return false;
        }
        LogUtil.a("HiH_HiDataDeleteOperation", "isDeleteAppTypeInvalid checkAppType  ", Integer.valueOf(i), " appID = ", Integer.valueOf(this.f39411b));
        if (this.e == 0) {
            return true;
        }
        int iA = kud.a().a(this.f39411b);
        if (iA != 0) {
            ktu.d(this.j, iA, this.f39412c);
            return false;
        }
        try {
            HiAuthManager.getInstance().checkDeleteAuth(this.f39411b, this.n, this.g.getTypes());
            return true;
        } catch (HiAuthException e) {
            ReleaseLogUtil.a("HiH_HiDataDeleteOperation", "isDeleteAppTypeInvalid HiAuthException ex=", e.getMessage());
            this.f39412c.clear();
            this.f39412c.add(HiErrorCode.c(8) + e.getMessage());
            ktu.d(this.j, 8, this.f39412c);
            return false;
        }
    }

    private void c(String str, kth kthVar) throws RemoteException {
        List<Integer> listD;
        if (TextUtils.isEmpty(str)) {
            str = this.mContext.getPackageName();
        }
        kym kymVarC = ktx.c().c(str);
        this.f = kymVarC;
        kymVarC.g(this.n);
        if (this.e != -1) {
            listD = e(kthVar.a(), this.n, this.f39410a, kthVar.d());
        } else {
            listD = kwt.b().d(this.n, this.f39410a);
        }
        this.f.b(listD);
        LogUtil.a("HiH_HiDataDeleteOperation", "initHealthContext callingAppID = ", Integer.valueOf(this.f39411b), ", deleteAppId=", Integer.valueOf(this.f39410a), ", UserId=", Integer.valueOf(this.n), ", dataType=", Integer.valueOf(this.d));
    }

    private List<Integer> e(int i, int i2, int i3, String str) {
        kyj kyjVarC = kyj.c();
        if (i == 0) {
            return kyjVarC.c(i2);
        }
        if (i == 1) {
            return kyjVarC.e(i3, i2);
        }
        if (i != 2) {
            return null;
        }
        return kyjVarC.a(i2, str);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0107: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:32:0x0107 */
    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) throws Throwable {
        int i;
        int i2;
        Object obj = "execute end totalTime = ";
        int i3 = 2;
        try {
            try {
                try {
                    lkp.d(this.g, this.f);
                    List<DataTimeDelCondition> listDeleteHealthData = lfs.d(this.mContext).deleteHealthData(this.g, this.f, this.h);
                    if (HiCommonUtil.b(listDeleteHealthData)) {
                        i2 = 0;
                    } else {
                        i2 = 9;
                        try {
                            this.f39412c.clear();
                            this.f39412c.add(HiJsonUtil.d(listDeleteHealthData));
                        } catch (lks e) {
                            e = e;
                            ReleaseLogUtil.a("HiH_HiDataDeleteOperation", "execute HiValidException = ", e.getMessage());
                            i3 = 3;
                            this.f39412c.clear();
                            this.f39412c.add(HiErrorCode.c(3) + e.getMessage());
                            ktu.d(this.j, 3, this.f39412c);
                            Object[] objArr = {"execute end totalTime = ", Long.valueOf(System.currentTimeMillis() - this.mStartTime)};
                            ReleaseLogUtil.d("HiH_HiDataDeleteOperation", objArr);
                            obj = objArr;
                            return;
                        } catch (Exception e2) {
                            e = e2;
                            ReleaseLogUtil.a("HiH_HiDataDeleteOperation", "execute Exception=", LogAnonymous.b(e));
                            this.f39412c.clear();
                            this.f39412c.add(HiErrorCode.c(2) + "delete exception");
                            ktu.d(this.j, 2, this.f39412c);
                            Object[] objArr2 = {"execute end totalTime = ", Long.valueOf(System.currentTimeMillis() - this.mStartTime)};
                            ReleaseLogUtil.d("HiH_HiDataDeleteOperation", objArr2);
                            obj = objArr2;
                            return;
                        }
                    }
                    liz.a().c(lkg.e(this.g.getTypes()), ArkUIXConstants.DELETE, this.f);
                    ktu.d(this.j, i2, this.f39412c);
                    ReleaseLogUtil.d("HiH_HiDataDeleteOperation", "execute end totalTime = ", Long.valueOf(System.currentTimeMillis() - this.mStartTime));
                } catch (Throwable th) {
                    th = th;
                    ktu.d(this.j, i3, this.f39412c);
                    ReleaseLogUtil.d("HiH_HiDataDeleteOperation", obj, Long.valueOf(System.currentTimeMillis() - this.mStartTime));
                    throw th;
                }
            } catch (lks e3) {
                e = e3;
            } catch (Exception e4) {
                e = e4;
            } catch (Throwable th2) {
                th = th2;
                i3 = 0;
                ktu.d(this.j, i3, this.f39412c);
                ReleaseLogUtil.d("HiH_HiDataDeleteOperation", obj, Long.valueOf(System.currentTimeMillis() - this.mStartTime));
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            i3 = i;
        }
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public int getDataType() {
        return this.d;
    }
}
