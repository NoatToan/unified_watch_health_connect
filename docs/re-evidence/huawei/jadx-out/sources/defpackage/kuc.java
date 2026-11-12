package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealth.util.HiDivideUtil;
import com.huawei.hihealth.util.HiZipUtil;
import com.huawei.hihealthservice.HiDataOperation;
import com.huawei.hihealthservice.auth.HiAuthException;
import com.huawei.hihealthservice.auth.HiAuthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kuc extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HiDataReadOption f39494c;
    private IDataReadResultListener d;
    private boolean e;
    private HiDataReadProOption f;
    private int[] g;
    private int h;
    private kyj j;

    kuc(Context context) {
        super(context);
        this.g = new int[]{-1};
    }

    private boolean a(IDataReadResultListener iDataReadResultListener, boolean z) throws RemoteException {
        this.d = iDataReadResultListener;
        this.j = kyj.c();
        String strE = ljp.e(this.mContext);
        this.f39492a = ktx.c().e(strE);
        this.h = kud.a().e();
        int iA = ktx.c().a(strE);
        this.f39493b = iA;
        if (iA != 0) {
            this.f39492a = ktx.c().b(HuaweiHealth.c());
        }
        if (this.h > 0) {
            return !z || a();
        }
        LogUtil.j("HiH_HiSeqDataFetchOp", "initialize userID <= 0 ,appID = ", Integer.valueOf(this.f39492a));
        ktu.b(iDataReadResultListener, null, 24, 2);
        return false;
    }

    public boolean c(HiDataReadProOption hiDataReadProOption, IDataReadResultListener iDataReadResultListener, boolean z) throws RemoteException {
        this.e = false;
        this.f = hiDataReadProOption;
        if (hiDataReadProOption.getDataReadOption() == null) {
            ktu.b(iDataReadResultListener, null, 7, 2);
            return false;
        }
        if (hiDataReadProOption.getDataReadOption().getStartTime() > hiDataReadProOption.getDataReadOption().getEndTime()) {
            ktu.b(iDataReadResultListener, null, 3, 2);
            return false;
        }
        if (hiDataReadProOption.getTrackDataType() <= 0) {
            ktu.b(iDataReadResultListener, null, 7, 2);
            return false;
        }
        if (hiDataReadProOption.isReturnSequenceData() && (hiDataReadProOption.getDataReadOption().getCount() > 20 || hiDataReadProOption.getDataReadOption().getCount() <= 0)) {
            ReleaseLogUtil.a("HiH_HiSeqDataFetchOp", "limit must be 1 to 20. but : " + hiDataReadProOption.getDataReadOption().getCount());
            ktu.b(iDataReadResultListener, null, 3, 2);
            return false;
        }
        return a(iDataReadResultListener, z);
    }

    public boolean b(HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener, boolean z) throws RemoteException {
        this.e = true;
        this.f39494c = hiDataReadOption;
        if (hiDataReadOption.getStartTime() > hiDataReadOption.getEndTime()) {
            ktu.b(iDataReadResultListener, null, 3, 2);
            return false;
        }
        return a(iDataReadResultListener, z);
    }

    private boolean a() throws Throwable {
        int i = this.f39493b;
        if (i == -1) {
            LogUtil.a("HiH_HiSeqDataFetchOp", "initialize appType is invalid");
            ktu.b(this.d, null, 17, 2);
            return false;
        }
        if (i == 0) {
            return true;
        }
        int iA = kud.a().a(this.f39492a);
        if (iA != 0) {
            ktu.b(this.d, null, iA, 2);
            return false;
        }
        try {
            HiAuthManager.getInstance().checkReadAuth(this.f39492a, this.h, this.g);
            return true;
        } catch (HiAuthException e) {
            ReleaseLogUtil.a("HiH_HiSeqDataFetchOp", "checkAppAuth HiAuthException e = ", e.getMessage(), " appID = ", Integer.valueOf(this.f39492a), " who = ", Integer.valueOf(this.h));
            ktu.b(this.d, null, 8, 2);
            return false;
        }
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        int readType;
        String deviceUuid;
        Object obj;
        List<HiHealthData> listC;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("HiH_HiSeqDataFetchOp", "execute checkAppType  ", Integer.valueOf(this.f39493b), " appID = ", Integer.valueOf(this.f39492a));
        if (this.e) {
            HiDataReadOption hiDataReadOption = this.f39494c;
            readType = hiDataReadOption.getReadType();
            deviceUuid = this.f39494c.getDeviceUuid();
            obj = hiDataReadOption;
        } else {
            HiDataReadProOption hiDataReadProOption = this.f;
            readType = hiDataReadProOption.getDataReadOption().getReadType();
            deviceUuid = this.f.getDataReadOption().getDeviceUuid();
            obj = hiDataReadProOption;
        }
        List<Integer> listE = e(readType, this.h, this.f39492a, deviceUuid);
        if (njy.e(listE)) {
            LogUtil.j("HiH_HiSeqDataFetchOp", "execute getClientIds is null");
            ktu.b(this.d, null, 7, 2);
            return;
        }
        if (this.e) {
            listC = kws.e(this.mContext).b(listE, this.f39494c);
        } else {
            listC = kws.e(this.mContext).c(listE, this.f);
            if (this.f.isReturnSequenceData()) {
                d(listC);
            }
        }
        b(listC, this.mContext);
        int i = 0;
        if (listC != null) {
            ReleaseLogUtil.d("HiH_HiSeqDataFetchOp", "mReadOption=", obj, ",sequenceDataList=", Integer.valueOf(listC.size()));
            try {
                HiDivideUtil.d(0, listC, this.d);
            } catch (Exception e) {
                ReleaseLogUtil.a("HiH_HiSeqDataFetchOp", "execute exception = ", LogAnonymous.b(e));
                i = 5;
            }
        }
        ktu.b(this.d, null, i, 2);
        LogUtil.a("HiH_HiSeqDataFetchOp", "execute end! cost time is ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private void d(List<HiHealthData> list) {
        if (njy.e(list)) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            String sequenceData = hiHealthData.getSequenceData();
            if (sequenceData != null) {
                try {
                    if (30001 == hiHealthData.getType()) {
                        sequenceData = HiZipUtil.d(sequenceData);
                    }
                    HiDivideUtil.a(BaseApplication.getContext(), true, sequenceData, hiHealthData);
                } catch (IOException e) {
                    ReleaseLogUtil.a("HiH_HiSeqDataFetchOp", "setSequenceDataToFile uncompress e = ", ExceptionUtils.c(e));
                }
            }
        }
    }

    private List<Integer> e(int i, int i2, int i3, String str) {
        if (i == 0) {
            return this.j.c(i2);
        }
        if (i == 1) {
            return this.j.e(i3, i2);
        }
        if (i != 2) {
            return null;
        }
        return this.j.a(i2, str);
    }

    private static void b(List<HiHealthData> list, Context context) {
        if (list != null) {
            for (HiHealthData hiHealthData : list) {
                int clientId = hiHealthData.getClientId();
                kyh kyhVarD = kyh.d(context);
                hiHealthData.putInt("trackdata_deviceType", kyhVarD.b(clientId));
                HiDeviceInfo hiDeviceInfoD = kyhVarD.d(clientId);
                if (hiDeviceInfoD != null) {
                    String strB = kyhVarD.b(hiDeviceInfoD);
                    String strE = kyhVarD.e(hiDeviceInfoD);
                    String strA = kyhVarD.a(hiDeviceInfoD);
                    String strC = kyhVarD.c(hiDeviceInfoD);
                    String strD = kyhVarD.d(hiDeviceInfoD);
                    hiHealthData.putString("device_model", strE);
                    hiHealthData.putString("device_name", strB);
                    hiHealthData.putString("device_uniquecode", strA);
                    hiHealthData.putString("device_prodid", strC);
                    hiHealthData.putString("device_subprodid", strD);
                }
            }
        }
    }
}
