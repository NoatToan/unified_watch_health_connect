package com.huawei.hms.findnetwork.sdk;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.huawei.hiar.ARPose;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.findnetwork.FindNetworkEngine;
import com.huawei.hms.findnetwork.bean.BtMeasureResult;
import com.huawei.hms.findnetwork.comm.exception.FindNetworkException;
import com.huawei.hms.findnetwork.comm.request.bean.AccessoryCapabilities;
import com.huawei.hms.findnetwork.comm.request.bean.DeviceDetail;
import com.huawei.hms.findnetwork.comm.request.bean.NearLinkNavigationResult;
import com.huawei.hms.findnetwork.comm.request.bean.SetArPoseRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.SnRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.callback.NearLinkNavigationCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkStatusResult;
import com.huawei.hms.findnetwork.comm.util.ErrorCode;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.comm.util.MaskUtil;
import com.huawei.hms.findnetwork.request.QueryDeviceDetailApiCall;
import com.huawei.hms.findnetwork.threadpool.ThreadExec;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0443v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FindNetworkEngine f13248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SnRequestBean f13249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NearLinkNavigationCallback f13250c;
    public boolean d = false;
    public C0442u.c e = new c();

    /* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.v$a */
    public class a extends FindNetworkCallback {
        public a() {
        }

        public final /* synthetic */ void a() {
            C0443v.this.d();
        }

        @Override // com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback
        public void onFail(FindNetworkResult findNetworkResult) {
            HmsFindSDKLog.w("NearLinkNavigationProxy", "startBTMeasure onFail:" + findNetworkResult.getRespCode());
            if (findNetworkResult.getRespCode() != 907201165) {
                C0442u.b().a(new Runnable() { // from class: com.huawei.hms.findnetwork.sdk.v$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a();
                    }
                }, 5000L);
            }
        }

        @Override // com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback
        public void onSuccess(FindNetworkResult findNetworkResult) {
            HmsFindSDKLog.i("NearLinkNavigationProxy", "startBTMeasure onSuccess");
        }

        @Override // com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback
        public void onUpdate(FindNetworkResult findNetworkResult) {
            if (findNetworkResult != null) {
                C0442u.b().a((BtMeasureResult) findNetworkResult.getData());
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.v$b */
    public class b implements M.a {
        public b() {
        }

        @Override // com.huawei.hms.findnetwork.sdk.M.a
        public void a(int i, String str) {
            if (i != 907201165) {
                HmsFindSDKLog.e("NearLinkNavigationProxy", "onFailed errorCode:" + i);
                C0443v.this.f13250c.onFail(i, str);
                C0442u.b().d();
            }
        }

        @Override // com.huawei.hms.findnetwork.sdk.M.a
        public void b() {
            C0443v.this.f13250c.onSuccess();
            C0442u.b().a(C0443v.this.e);
        }

        public final /* synthetic */ void c() {
            Pair pairB = C0423a.c().b();
            C0443v.this.a(((Integer) pairB.first).intValue() == 0 ? (ARPose) pairB.second : null);
        }

        @Override // com.huawei.hms.findnetwork.sdk.M.a
        public void a() {
            ThreadExec.execNormalTask("NearLinkNavigationProxy", new Runnable() { // from class: com.huawei.hms.findnetwork.sdk.v$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c();
                }
            });
        }

        @Override // com.huawei.hms.findnetwork.sdk.M.a
        public void a(NearLinkNavigationResult nearLinkNavigationResult) {
            C0442u.b().a(nearLinkNavigationResult);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.v$c */
    public class c implements C0442u.c {
        public c() {
        }

        @Override // com.huawei.hms.findnetwork.sdk.C0442u.c
        public void a() {
            HmsFindSDKLog.e("NearLinkNavigationProxy", "onRemoteDied, restartMeasure");
            C0443v.this.c();
        }

        @Override // com.huawei.hms.findnetwork.sdk.C0442u.c
        public void a(int i, NearLinkNavigationResult nearLinkNavigationResult) {
            HmsFindSDKLog.i("NearLinkNavigationProxy", "onUpdate, " + nearLinkNavigationResult + ", stateCode:" + i);
            C0443v.this.f13250c.onRangingResult(i, nearLinkNavigationResult);
        }
    }

    public C0443v(FindNetworkEngine findNetworkEngine, SnRequestBean snRequestBean, NearLinkNavigationCallback nearLinkNavigationCallback) {
        this.f13248a = findNetworkEngine;
        this.f13249b = snRequestBean;
        this.f13250c = nearLinkNavigationCallback;
    }

    public final boolean a(FindNetworkResult findNetworkResult) {
        String str;
        if (findNetworkResult == null || findNetworkResult.getData() == null) {
            str = "parameter invalid.";
        } else {
            Map map = (Map) JsonUtils.json2Object(((DeviceDetail) findNetworkResult.getData()).getAccessoryCapabilities(), AccessoryCapabilities.class);
            if (map != null && map.containsKey(DeviceDetail.CAP_KEY_BLE_MEASURE_DISTANCE) && ((Integer) map.get(DeviceDetail.CAP_KEY_BLE_MEASURE_DISTANCE)).intValue() != 0) {
                return true;
            }
            str = "not support BTMeasure.";
        }
        HmsFindSDKLog.w("NearLinkNavigationProxy", str);
        return false;
    }

    public final /* synthetic */ void b() {
        this.f13248a.doWrite(new J(this.f13249b, new a()));
    }

    public final void c() {
        try {
            this.f13248a.queryFindNetworkStatus().addOnSuccessListener(new OnSuccessListener() { // from class: com.huawei.hms.findnetwork.sdk.v$$ExternalSyntheticLambda6
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f$0.a((FindNetworkStatusResult) obj);
                }
            });
        } catch (FindNetworkException e) {
            HmsFindSDKLog.e("NearLinkNavigationProxy", "restartMeasure err:" + e.getMessage());
        }
    }

    public final void d() {
        HmsFindSDKLog.i("NearLinkNavigationProxy", MaskUtil.maskSn(this.f13249b.getConnectTagSn()) + " startBTMeasure start.");
        ThreadExec.execNormalTask("NearLinkNavigationProxy", new Runnable() { // from class: com.huawei.hms.findnetwork.sdk.v$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        });
    }

    public final Task e() {
        HmsFindSDKLog.i("NearLinkNavigationProxy", "startNearLinkMeasure start.");
        return this.f13248a.doWrite(new M(this.f13249b, new b()));
    }

    public Task f() {
        HmsFindSDKLog.i("NearLinkNavigationProxy", "stopNearLinkNavigation");
        C0442u.b().d();
        C0423a.c().a();
        this.f13248a.doWrite(new O(this.f13249b, new FindNetworkCallback()));
        return this.f13248a.doWrite(new Q(this.f13249b));
    }

    public final /* synthetic */ void a() {
        SystemClock.sleep(100L);
        HmsFindSDKLog.i("NearLinkNavigationProxy", "restartMeasure start.");
        if (this.d) {
            d();
        }
        e();
    }

    public final /* synthetic */ void b(FindNetworkResult findNetworkResult) {
        if (a(findNetworkResult)) {
            this.d = true;
            d();
        }
        e();
    }

    public final /* synthetic */ void a(FindNetworkStatusResult findNetworkStatusResult) {
        ThreadExec.execNormalTask("NearLinkNavigationProxy", new Runnable() { // from class: com.huawei.hms.findnetwork.sdk.v$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a();
            }
        });
    }

    public final /* synthetic */ void b(Exception exc) {
        HmsFindSDKLog.e("NearLinkNavigationProxy", "query detail failed:" + exc.getMessage());
        this.f13250c.onFail(-1, exc.getMessage());
    }

    public final void a(ARPose aRPose) {
        SetArPoseRequestBean setArPoseRequestBean = new SetArPoseRequestBean();
        setArPoseRequestBean.setDeviceId(this.f13249b.getConnectTagSn());
        if (aRPose != null) {
            setArPoseRequestBean.setOutQx(aRPose.qx());
            setArPoseRequestBean.setOutQy(aRPose.qy());
            setArPoseRequestBean.setOutQz(aRPose.qz());
            setArPoseRequestBean.setOutQw(aRPose.qw());
            setArPoseRequestBean.setOutTx(aRPose.tx());
            setArPoseRequestBean.setOutTy(aRPose.ty());
            setArPoseRequestBean.setOutTz(aRPose.tz());
        }
        this.f13248a.doWrite(new D(setArPoseRequestBean)).addOnSuccessListener(new OnSuccessListener() { // from class: com.huawei.hms.findnetwork.sdk.v$$ExternalSyntheticLambda0
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                HmsFindSDKLog.i("NearLinkNavigationProxy", "setArPoseDataToFn succeed");
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.hms.findnetwork.sdk.v$$ExternalSyntheticLambda1
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                HmsFindSDKLog.i("NearLinkNavigationProxy", "setArPoseDataToFn failed");
            }
        });
    }

    public void a(Context context) {
        int iB = C0423a.c().b(context);
        if (iB != 0) {
            this.f13250c.onFail(iB, ErrorCode.getStatusCode(iB));
        } else {
            HmsFindSDKLog.i("NearLinkNavigationProxy", "startNearLinkNavigation start.");
            this.f13248a.doWrite(new QueryDeviceDetailApiCall(this.f13249b)).addOnSuccessListener(new OnSuccessListener() { // from class: com.huawei.hms.findnetwork.sdk.v$$ExternalSyntheticLambda2
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f$0.b((FindNetworkResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.hms.findnetwork.sdk.v$$ExternalSyntheticLambda3
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    this.f$0.b(exc);
                }
            });
        }
    }
}
