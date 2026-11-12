package com.huawei.hms.health;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.hihealth.HiHealthKitClient;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.huawei.hms.hihealth.data.HealthKitApiResult;
import com.huawei.hms.kit.awareness.AwarenessStatusCodes;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.utils.Util;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class aaci {
    private static volatile aaci aabk;
    private static volatile HealthKitApiInvoker aabl;
    private long aab;
    private com.huawei.hms.hihealth.data.aab aaba;
    private com.huawei.hms.hihealth.data.aaba aabe;
    private int aabf;
    private long aabg;
    private long aabh;
    private long aabj;
    private Map<String, com.huawei.hms.hihealth.data.aabb> aabb = new HashMap();
    private Map<String, Pair<String, Long>> aabc = new HashMap();
    private Map<String, Long> aabd = new HashMap();
    private int aabi = -1;

    private String aab(HealthKitApiInvoker healthKitApiInvoker, boolean z) throws ApiException, RemoteException {
        boolean zAwait;
        if (HiHealthKitClient.getInstance().bindService(100) == null) {
            throw new ApiException(new Status(HiHealthStatusCodes.API_EXCEPTION_ERROR, "the client is not connected"));
        }
        if (!z) {
            HealthKitApiResult healthKitApiResult = (HealthKitApiResult) aacs.aab(aack.aabe().aabb().aabb(aacs.aab(healthKitApiInvoker)), (Type) HealthKitApiResult.class);
            if (healthKitApiResult == null) {
                aabz.aab("CommonMethodImpl", "result from core is null");
                return "";
            }
            if (!healthKitApiResult.isResultGzipped()) {
                return healthKitApiResult.getResponse();
            }
            StringBuilder sbAab = com.huawei.hms.health.aab.aab("the result length from core is ");
            sbAab.append(healthKitApiResult.getResponse().length());
            aabz.aab("CommonMethodImpl", sbAab.toString());
            return aacs.aabd(healthKitApiResult.getResponse());
        }
        String strAab = aacs.aab(healthKitApiInvoker);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList arrayList = new ArrayList();
        aack.aabe().aabb().aab(strAab, new aab(countDownLatch, arrayList));
        try {
            zAwait = countDownLatch.await(1L, TimeUnit.MINUTES);
        } catch (InterruptedException unused) {
            aabz.aab("CommonMethodImpl", "invokeReadInterface interruptedException");
            zAwait = false;
        }
        String string = null;
        if (!zAwait) {
            aabz.aab("CommonMethodImpl", "invokeReadInterface time Out");
            return null;
        }
        if (arrayList.isEmpty()) {
            aabz.aabc("CommonMethodImpl", "build result fail for return empty body");
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            aabz.aabb("CommonMethodImpl", "build result by StringBuilder appending");
            string = sb.toString();
        }
        HealthKitApiResult healthKitApiResult2 = (HealthKitApiResult) aacs.aab(string, (Type) HealthKitApiResult.class);
        if (healthKitApiResult2 != null) {
            return healthKitApiResult2.isResultGzipped() ? aacs.aabd(healthKitApiResult2.getResponse()) : healthKitApiResult2.getResponse();
        }
        aabz.aab("CommonMethodImpl", "result from core is null");
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0115  */
    private String aaba(HealthKitApiInvoker healthKitApiInvoker, boolean z) throws ApiException, RemoteException {
        String str;
        String string;
        Pair<String, Long> pair;
        com.huawei.hms.hihealth.data.aab aabVar;
        if (healthKitApiInvoker == null) {
            throw new SecurityException(String.valueOf(HiHealthStatusCodes.INPUT_PARAM_MISSING));
        }
        String strAabc = aabc(healthKitApiInvoker);
        aabz.aabb("CommonMethodImpl", "invoke with policy " + strAabc + " " + z);
        Context context = HiHealthKitClient.getInstance().getContext();
        if (context == null || (aabVar = this.aaba) == null || aabz.aab(aabVar.aaba()).booleanValue()) {
            aabz.aabb("CommonMethodImpl", "bgLimitPolicy empty");
        } else if (!this.aaba.aaba().contains(strAabc)) {
            aabz.aabb("CommonMethodImpl", "interface not in bgLimitPolicy");
        } else {
            if (aacs.aabb(context)) {
                aabz.aab("CommonMethodImpl", "the phone is screen off or locked");
                throw new SecurityException(String.valueOf(HiHealthStatusCodes.DISABLE_DATA_OPERATION));
            }
            if (aacs.aab(context)) {
                long j = this.aabj;
                long jConvert = TimeUnit.MILLISECONDS.convert(this.aaba.aabb(), TimeUnit.SECONDS);
                if (j != -1 && System.currentTimeMillis() - j <= jConvert) {
                    StringBuilder sbAab = com.huawei.hms.health.aab.aab("background app can not invoke read apis in ");
                    sbAab.append(this.aaba.aabb());
                    aabz.aab("CommonMethodImpl", sbAab.toString());
                    throw new SecurityException(String.valueOf(HiHealthStatusCodes.APPLICATION_NOT_FORGROUND));
                }
                this.aabj = System.currentTimeMillis();
            }
        }
        com.huawei.hms.hihealth.data.aabb aabbVar = this.aabb.get(aabc(healthKitApiInvoker));
        if (aabbVar != null) {
            String strAabb = aabb(healthKitApiInvoker);
            if (aab(healthKitApiInvoker, strAabb) || (pair = this.aabc.get(strAabb)) == null || aacs.aab(((Long) pair.second).longValue(), TimeUnit.MILLISECONDS.convert(aabbVar.aab(), TimeUnit.SECONDS))) {
                str = null;
            } else {
                StringBuilder sbAab2 = com.huawei.hms.health.aab.aab("get cache result within ");
                sbAab2.append(pair.second);
                aabz.aabb("CommonMethodImpl", sbAab2.toString());
                str = (String) pair.first;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        com.huawei.hms.hihealth.data.aaba aabaVar = this.aabe;
        try {
            if (aabaVar != null && aabaVar.aaba() != 0) {
                StringBuilder sbAab3 = com.huawei.hms.health.aab.aab("do flow policy countBeginTime ");
                sbAab3.append(this.aabg);
                sbAab3.toString();
                long j2 = this.aabg;
                if (j2 == 0 || aacs.aab(j2, TimeUnit.MILLISECONDS.convert(this.aabe.aabb(), TimeUnit.SECONDS))) {
                    this.aabf = 1;
                    this.aabi = -1;
                    this.aabg = System.currentTimeMillis();
                    StringBuilder sbAab4 = com.huawei.hms.health.aab.aab("init flow policy countBeginTime ");
                    sbAab4.append(this.aabg);
                    string = sbAab4.toString();
                } else {
                    this.aabf++;
                    StringBuilder sbAab5 = com.huawei.hms.health.aab.aab("do flow policy countBeginTime flowCount ");
                    sbAab5.append(this.aabf);
                    sbAab5.toString();
                    if (this.aabf > this.aabe.aaba()) {
                        if (this.aabi == -1) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            this.aabg = jCurrentTimeMillis;
                            this.aabh = jCurrentTimeMillis;
                            this.aabi = 0;
                            StringBuilder sbAab6 = com.huawei.hms.health.aab.aab("flow policy invoke at ");
                            sbAab6.append(this.aabg);
                            sbAab6.append(" with ");
                            sbAab6.append(this.aabf);
                            aabz.aabb("CommonMethodImpl", sbAab6.toString());
                        }
                        if (aacs.aab(this.aabh, 10000L)) {
                            this.aabh = System.currentTimeMillis();
                            this.aabi = 0;
                        }
                        int i = this.aabi + 1;
                        this.aabi = i;
                        if (i > this.aabe.aab()) {
                            StringBuilder sbAab7 = com.huawei.hms.health.aab.aab("flow policy limit effect ");
                            sbAab7.append(this.aabi);
                            aabz.aabb("CommonMethodImpl", sbAab7.toString());
                            throw new ApiException(new Status(HiHealthStatusCodes.API_FLOW_LIMIT, String.format(Locale.ENGLISH, "Interface calls are too frequent, more than %d calls in %d second, triggering flow control, and only %d calls in the next 10s", Integer.valueOf(this.aabe.aaba()), Integer.valueOf(this.aabe.aabb()), Integer.valueOf(this.aabe.aab()))));
                        }
                    }
                }
                String strAab = aab(healthKitApiInvoker, z);
                aaba(healthKitApiInvoker, strAab);
                return strAab;
            }
            string = "flowPolicy is empty";
            String strAab2 = aab(healthKitApiInvoker, z);
            aaba(healthKitApiInvoker, strAab2);
            return strAab2;
        } finally {
            aabd();
        }
        aabz.aabb("CommonMethodImpl", string);
    }

    private String aabc(HealthKitApiInvoker healthKitApiInvoker) {
        return healthKitApiInvoker.getInterfaceProvider() + "." + healthKitApiInvoker.getInterfaceInvoked();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    public static aaci aabc() {
        String str;
        String str2;
        String str3;
        String str4;
        if (aabk == null) {
            synchronized (aaci.class) {
                if (aabk == null) {
                    aabk = new aaci();
                    aabl = new HealthKitApiInvoker();
                    Context context = HiHealthKitClient.getInstance().getContext();
                    aabl.setAppId(Util.getAppId(context));
                    HealthKitApiInvoker healthKitApiInvoker = aabl;
                    if (context != null) {
                        try {
                            str2 = context.getPackageManager() == null ? "" : context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                        } catch (PackageManager.NameNotFoundException unused) {
                            str = "can not find PackageManager";
                            aabz.aab("PackageManagerUtil", str);
                        } catch (Exception unused2) {
                            str = "catch basic exception";
                            aabz.aab("PackageManagerUtil", str);
                        }
                    }
                    healthKitApiInvoker.setPackageName(str2);
                    aabl.setSdkVersion("6.15.0.301");
                    HealthKitApiInvoker healthKitApiInvoker2 = aabl;
                    if (context == null || context.getPackageManager() == null) {
                        str3 = "";
                    } else {
                        try {
                            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
                            if (packageInfo != null) {
                                str3 = packageInfo.versionName;
                            } else {
                                str3 = "";
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            str4 = "getAppVersion NameNotFoundException";
                            aabz.aab("PackageManagerUtil", str4);
                        } catch (RuntimeException unused4) {
                            str4 = "getPackageInfo exists exception!";
                            aabz.aab("PackageManagerUtil", str4);
                        }
                    }
                    healthKitApiInvoker2.setAppVersion(str3);
                }
            }
        }
        return aabk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aab(com.huawei.hms.hihealth.data.aabc aabcVar) {
        Objects.toString(aabcVar);
        if (aabcVar == null) {
            return;
        }
        this.aab = System.currentTimeMillis();
        this.aaba = aabcVar.aab();
        if (aabz.aaba(aabcVar.aaba()).booleanValue()) {
            for (com.huawei.hms.hihealth.data.aabb aabbVar : aabcVar.aaba()) {
                this.aabb.put(aabbVar.aaba(), aabbVar);
            }
        }
        this.aabe = aabcVar.aabb();
        Log.i("HmsHealth_kit CommonMethodImpl", aacs.aab("getInterfacePolicy success bgLimit %s, cachePolicy size %s, flow %s", Boolean.valueOf(this.aaba != null), Integer.valueOf(this.aabb.size()), Boolean.valueOf(this.aabe != null)));
    }

    private boolean aab(HealthKitApiInvoker healthKitApiInvoker, String str) {
        int iAab;
        boolean z = false;
        if (!"AuthController".equals(healthKitApiInvoker.getInterfaceProvider())) {
            return false;
        }
        Long l = this.aabd.get(str);
        if (l != null) {
            long jLongValue = l.longValue();
            com.huawei.hms.hihealth.data.aabb aabbVar = this.aabb.get(aacs.aab("AuthController", "TIME_WINDOW"));
            if (aabbVar != null) {
                aabz.aabb("CommonMethodImpl", "getInvokeTimeWindow with timeWindowPolicy");
                iAab = aabbVar.aab();
            } else {
                aabz.aabb("CommonMethodImpl", "getInvokeTimeWindow with default TimeWindow");
                iAab = AwarenessStatusCodes.AWARENESS_APPLICATION_NOT_HUAWEI_PHONE;
            }
            if (aacs.aab(jLongValue, iAab)) {
                z = true;
            }
        }
        aabz.aabb("CommonMethodImpl", "timeWindow lastTime " + l + " result " + z);
        this.aabd.put(str, Long.valueOf(System.currentTimeMillis()));
        return z;
    }

    private void aaba(HealthKitApiInvoker healthKitApiInvoker, String str) {
        if (this.aabb.get(aabc(healthKitApiInvoker)) != null) {
            String strAabb = aabb(healthKitApiInvoker);
            if (!"AuthController".equals(healthKitApiInvoker.getInterfaceProvider()) || (!TextUtils.isEmpty(str) && !"[]".equals(str))) {
                this.aabc.put(strAabb, new Pair<>(str, Long.valueOf(System.currentTimeMillis())));
            } else {
                aabz.aabb("CommonMethodImpl", "skip cache empty result, and clear cache");
                this.aabc.remove(strAabb);
            }
        }
    }

    public int aabb() {
        com.huawei.hms.hihealth.data.aab aabVar = this.aaba;
        if (aabVar == null || aabVar.aab() == -1 || this.aaba.aab() == 0) {
            return 30000;
        }
        return this.aaba.aab();
    }

    String aaba(HealthKitApiInvoker healthKitApiInvoker) throws ApiException, RemoteException {
        String strAaba;
        synchronized (this) {
            aabz.aabb("CommonMethodImpl", "invoke read interface");
            strAaba = aaba(healthKitApiInvoker, true);
        }
        return strAaba;
    }

    HealthKitApiInvoker aaba() {
        return aabl;
    }

    public void aab() {
        this.aabc.clear();
    }

    String aab(HealthKitApiInvoker healthKitApiInvoker) throws ApiException, RemoteException {
        String strAaba;
        synchronized (this) {
            strAaba = aaba(healthKitApiInvoker, false);
        }
        return strAaba;
    }

    private void aabd() {
        long j = this.aab;
        if (j == 0 || aacs.aab(j, 86400000L)) {
            StringBuilder sbAab = com.huawei.hms.health.aab.aab("init InterfacePolicy, last time ");
            sbAab.append(this.aab);
            aabz.aabb("CommonMethodImpl", sbAab.toString());
            aacp.aabg().aabd().addOnSuccessListener(new OnSuccessListener() { // from class: com.huawei.hms.health.aaci$$ExternalSyntheticLambda0
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f$0.aab((com.huawei.hms.hihealth.data.aabc) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.hms.health.aaci$$ExternalSyntheticLambda1
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    aabz.aabc("CommonMethodImpl", "init InterfacePolicy fail");
                }
            });
        }
    }

    private String aabb(HealthKitApiInvoker healthKitApiInvoker) {
        return healthKitApiInvoker.getInterfaceProvider() + healthKitApiInvoker.getInterfaceInvoked() + healthKitApiInvoker.getRequestBody().hashCode();
    }

    public static class aab extends com.huawei.hms.hihealth.options.aaba.aab {
        private CountDownLatch aab;
        private List<String> aaba;

        public void aab(List list, int i, int i2, int i3) throws RemoteException {
            aabz.aabb("CommonMethodImpl", "onTransmissionResult enter");
            if (i == 3) {
                aabz.aabb("CommonMethodImpl", "transfer complete");
                this.aab.countDown();
                return;
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            Object obj = list.get(0);
            if (i == 1) {
                StringBuilder sbAab = com.huawei.hms.health.aab.aab("transmission slice get:");
                sbAab.append(System.currentTimeMillis());
                aabz.aabb("CommonMethodImpl", sbAab.toString());
                if (obj instanceof String) {
                    this.aaba.add((String) obj);
                    return;
                }
                return;
            }
            if (i != 2) {
                aabz.aabb("CommonMethodImpl", "unknown transmissionType" + i);
            } else {
                if (obj instanceof String) {
                    this.aaba.add((String) obj);
                }
                this.aab.countDown();
                aabz.aabb("CommonMethodImpl", "transmission complete no need slice");
            }
        }

        aab(CountDownLatch countDownLatch, List<String> list) {
            this.aab = countDownLatch;
            this.aaba = list;
        }
    }
}
