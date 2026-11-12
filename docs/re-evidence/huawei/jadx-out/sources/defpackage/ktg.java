package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiDataDeleteProOption;
import com.huawei.hihealth.IDeleteListenerEx;
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
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ktg extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39418c;
    private final HashMap<Integer, List<Object>> d;
    private kym e;
    private IDeleteListenerEx g;
    private String h;
    private int i;
    private List<HiDataDeleteProOption> j;

    @Override // com.huawei.hihealthservice.HiDataOperation
    public boolean isMonitorThread() {
        return true;
    }

    ktg(Context context) {
        super(context);
        this.d = new HashMap<>(16);
    }

    public boolean c(List<HiDataDeleteProOption> list, IDeleteListenerEx iDeleteListenerEx, boolean z) throws RemoteException {
        if (yls.c(list) || list.contains(null)) {
            LogUtil.e("HiH_HiDataDeleteProExOperation", "initialize deleteProOptions is or contains null");
            d(iDeleteListenerEx, 7);
            return false;
        }
        ReleaseLogUtil.d("HiH_HiDataDeleteProExOperation", "deleteHiHealthDataProEx initializing deleteOptions = ", list, ", needCheckAppAuth = ", Boolean.valueOf(z));
        this.h = ljp.e(this.mContext);
        this.f39417b = ktx.c().a(this.h);
        this.f39416a = ktx.c().b(this.h);
        this.i = kud.a().e();
        this.f39418c = 1;
        this.g = iDeleteListenerEx;
        this.j = list;
        kym kymVarC = ktx.c().c(TextUtils.isEmpty(this.h) ? this.mContext.getPackageName() : this.h);
        this.e = kymVarC;
        kymVarC.g(this.i);
        for (HiDataDeleteProOption hiDataDeleteProOption : list) {
            if (e(hiDataDeleteProOption.getDeleteLevel()) || e(hiDataDeleteProOption.getDeleteType()) || e(hiDataDeleteProOption.getDeleteInterval())) {
                ReleaseLogUtil.e("HiH_HiDataDeleteProExOperation", "deleteHiHealthDataProEx initialize ExtendOption input wrong, DeleteLevel is ", hiDataDeleteProOption.getDeleteLevel(), ", DeleteType is ", hiDataDeleteProOption.getDeleteType(), ", DeleteInterval is ", hiDataDeleteProOption.getDeleteInterval());
                d(this.g, 7);
                return false;
            }
            HiDataDeleteOption dataDeleteOption = hiDataDeleteProOption.getDataDeleteOption();
            if (dataDeleteOption == null) {
                ReleaseLogUtil.a("HiH_HiDataDeleteProExOperation", "initialize deleteOptions contains null");
                d(this.g, 7);
                return false;
            }
            if (z && !a(dataDeleteOption.getTypes())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        List<Integer> listD;
        for (HiDataDeleteProOption hiDataDeleteProOption : this.j) {
            try {
                int iB = hiDataDeleteProOption.getPackageName() != null ? ktx.c().b(this.h) : this.f39416a;
                if (this.f39417b != -1) {
                    listD = b(hiDataDeleteProOption.getDeleteType().intValue(), hiDataDeleteProOption.getDeviceUuid(), iB);
                } else {
                    listD = kwt.b().d(this.i, iB);
                }
                kym kymVarE = e(listD);
                HiDataDeleteOption dataDeleteOption = hiDataDeleteProOption.getDataDeleteOption();
                lkp.d(dataDeleteOption, kymVarE);
                List<DataTimeDelCondition> listDeleteHealthData = lfs.d(this.mContext).deleteHealthData(dataDeleteOption, kymVarE, hiDataDeleteProOption.getDeleteInterval().intValue());
                if (!HiCommonUtil.b(listDeleteHealthData)) {
                    b(false, 9, (Object) HiJsonUtil.d(listDeleteHealthData));
                }
                liz.a().c(lkg.e(dataDeleteOption.getTypes()), ArkUIXConstants.DELETE, kymVarE);
            } catch (lks e) {
                ReleaseLogUtil.a("HiH_HiDataDeleteProExOperation", "execute HiValidException = ", e.getMessage());
                b(false, 3, (Object) (HiErrorCode.c(3) + e.getMessage()));
            } catch (Exception e2) {
                ReleaseLogUtil.a("HiH_HiDataDeleteProExOperation", "execute Exception=", LogAnonymous.b(e2));
                b(false, 2, (Object) (HiErrorCode.c(2) + " delete exception"));
            }
        }
        ktu.c(this.g, this.d);
        LogUtil.a("HiH_HiDataDeleteProExOperation", "execute end totalTime = ", Long.valueOf(System.currentTimeMillis() - this.mStartTime));
    }

    private void d(IDeleteListenerEx iDeleteListenerEx, int i) {
        b(true, i, (Object) null);
        ktu.c(iDeleteListenerEx, this.d);
    }

    private void b(boolean z, int i, Object obj) {
        if (z) {
            this.d.clear();
        }
        if (this.d.containsKey(Integer.valueOf(i))) {
            this.d.get(Integer.valueOf(i)).add(obj);
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(obj);
        this.d.put(Integer.valueOf(i), arrayList);
    }

    private kym e(List<Integer> list) {
        LogUtil.d("HiH_HiDataDeleteProExOperation", "getHealthContext callingAppID = ", Integer.valueOf(this.f39416a), ", UserId=", Integer.valueOf(this.i), ", dataType=", Integer.valueOf(this.f39418c));
        this.e.b(list);
        return this.e;
    }

    private List<Integer> b(int i, String str, int i2) {
        kyj kyjVarC = kyj.c();
        if (i == 0) {
            return kyjVarC.c(this.i);
        }
        if (i == 1) {
            return kyjVarC.e(i2, this.i);
        }
        if (i != 2) {
            return null;
        }
        return kyjVarC.a(this.i, str);
    }

    private boolean a(int[] iArr) throws Throwable {
        int i = this.f39417b;
        if (i == -1) {
            LogUtil.j("HiH_HiDataDeleteProExOperation", "initialize appType is invalid errorCode is ", 17);
            d(this.g, 17);
            return false;
        }
        LogUtil.d("HiH_HiDataDeleteProExOperation", "deleteHiHealthDataProEx checkAppType  ", Integer.valueOf(i), " appID = ", Integer.valueOf(this.f39416a));
        if (this.f39417b != 0) {
            int iA = kud.a().a(this.f39416a);
            if (iA != 0) {
                d(this.g, iA);
                return false;
            }
            try {
                HiAuthManager.getInstance().checkDeleteAuth(this.f39416a, this.i, iArr);
            } catch (HiAuthException e) {
                ReleaseLogUtil.a("HiH_HiDataDeleteProExOperation", "isDeleteAppTypeInvalid HiAuthException ex=", e.getMessage());
                b(true, 8, (Object) (HiErrorCode.c(8) + e.getMessage()));
                ktu.c(this.g, this.d);
                return false;
            }
        }
        return true;
    }

    private boolean e(Integer num) {
        return num == null || num.intValue() == -1 || num.intValue() == -2;
    }
}
