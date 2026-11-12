package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.api.HwWatchFaceManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.mvp.model.datatype.orderhistory.OrderHistoryBean;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes20.dex */
public class s2 {
    public static volatile s2 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBaseResponseCallback f30568a = new IBaseResponseCallback() { // from class: com.huawei.watchface.s2$$ExternalSyntheticLambda0
        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public final void onResponse(int i, Object obj) {
            s2.a(i, obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBaseResponseCallback f30569b = new IBaseResponseCallback() { // from class: com.huawei.watchface.s2$$ExternalSyntheticLambda1
        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public final void onResponse(int i, Object obj) {
            this.f$0.b(i, obj);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBaseResponseCallback f30570c = new IBaseResponseCallback() { // from class: com.huawei.watchface.s2$$ExternalSyntheticLambda2
        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public final void onResponse(int i, Object obj) {
            this.f$0.c(i, obj);
        }
    };
    public String d;
    public String e;

    public static s2 b() {
        s2 s2Var;
        synchronized (s2.class) {
            if (f == null) {
                synchronized (s2.class) {
                    if (f == null) {
                        f = new s2();
                    }
                }
            }
            s2Var = f;
        }
        return s2Var;
    }

    public final /* synthetic */ void c(int i, Object obj) {
        a(i);
        HwWatchFaceManager.getInstance(Environment.getApplicationContext()).dealSetDefaultWatchFaceResponse(i, false, obj, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static /* synthetic */ void a(int i, Object obj) {
        String str;
        String str2;
        if (obj instanceof String) {
            String[] strArrSplit = ((String) obj).split("_");
            if (strArrSplit.length >= 2) {
                str = strArrSplit[0];
                str2 = strArrSplit[1];
            } else {
                str = "";
                str2 = "";
            }
        } else {
            str = "";
            str2 = "";
        }
        if (i == 104) {
            HwWatchFaceManager.getInstance(Environment.getApplicationContext()).processDeleteFailed(str, str2);
        }
    }

    public void c() {
        a(this.d, this.e);
    }

    public final /* synthetic */ void b(int i, Object obj) {
        a(i);
    }

    public final void b(List list, boolean z, boolean z2) {
        String str;
        HwLog.i("MembershipDeletionHelper", "deleteWatchFaces enter" + GsonHelper.toJson(list) + ",isDelete:" + z);
        WatchResourcesInfo tryOutWatchFaceInfo = HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getTryOutWatchFaceInfo();
        WatchResourcesInfo currentWatchFace = HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getCurrentWatchFace();
        Iterator it = list.iterator();
        boolean z3 = false;
        while (true) {
            String str2 = "";
            if (!it.hasNext()) {
                break;
            }
            String[] strArrSplit = ((String) it.next()).split("_");
            if (strArrSplit.length >= 2) {
                str2 = strArrSplit[0];
                str = strArrSplit[1];
            } else {
                str = "";
            }
            if (tryOutWatchFaceInfo != null && tryOutWatchFaceInfo.getWatchInfoId().equals(str2)) {
                HwLog.i("MembershipDeletionHelper", "deleteWatchfaces -- could not remove tryOutWatchFace");
            } else if (currentWatchFace != null && TextUtils.equals(currentWatchFace.getWatchInfoId(), str2) && !z && z2) {
                if (a(currentWatchFace)) {
                    HwLog.i("MembershipDeletionHelper", "deleteWatchFaces currentWatchFace is try out watchface");
                } else {
                    HwWatchFaceManager.getInstance(Environment.getApplicationContext()).notifyCurrentWatchfaceIsVipFree(str2, "1");
                    this.d = str2;
                    this.e = str;
                    z3 = true;
                }
            } else {
                b(str2, str);
            }
        }
        if (z3 || !z2) {
            return;
        }
        HwWatchFaceManager.getInstance(Environment.getApplicationContext()).notifyCurrentWatchfaceIsVipFree(currentWatchFace != null ? currentWatchFace.getWatchInfoId() : "", "0");
    }

    public final void a(int i) {
        if (i == 103) {
            HwWatchFaceManager.getInstance(Environment.getApplicationContext()).transmitDialRecycleResult(this.d, this.e, "1");
        } else if (i == 104) {
            HwWatchFaceManager.getInstance(Environment.getApplicationContext()).transmitDialRecycleResult(this.d, this.e, "0");
        } else {
            HwWatchFaceManager.getInstance(Environment.getApplicationContext()).transmitDialRecycleResult(this.d, this.e, String.valueOf(i));
        }
    }

    public void a(boolean z, boolean z2) {
        HwLog.i("MembershipDeletionHelper", "startDeletionFlow isDelete:" + z);
        a(g5.c().g(), z, z2);
    }

    public final void a(List list, boolean z, boolean z2) {
        WatchResourcesInfo watchResourcesInfo;
        ArrayList arrayList = new ArrayList();
        HashMap<String, WatchResourcesInfo> allWatchInfoHash = HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getAllWatchInfoHash();
        HwLog.i("MembershipDeletionHelper", "addChargedWatchFaces -- enter isDelete:" + z);
        ArrayList arrayList2 = new ArrayList();
        boolean zG = e5.c().g();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OrderHistoryBean orderHistoryBean = (OrderHistoryBean) it.next();
            if (orderHistoryBean.getIsCharge() == a0.CHARGED.getValue() && orderHistoryBean.getIsOrdered().equals(c3.NOT_ORDERED.getValue()) && (watchResourcesInfo = allWatchInfoHash.get(orderHistoryBean.getId())) != null) {
                String strC = g5.c().c(watchResourcesInfo.getWatchInfoId(), watchResourcesInfo.getWatchInfoVersion());
                HwLog.w("MembershipDeletionHelper", "addChargedWatchFaces getContentPrivType:" + orderHistoryBean.getContentPrivType());
                if (zG && (orderHistoryBean.getContentPrivType() == 2 || orderHistoryBean.getContentPrivType() == 4)) {
                    arrayList2.add(strC);
                } else {
                    arrayList.add(strC);
                }
            }
        }
        b(arrayList, z, z2);
        a(arrayList2);
    }

    public final void b(String str, String str2) {
        if (e5.c().g()) {
            HwLog.i("MembershipDeletionHelper", "resetDeleteVipHiTopId isVipMembership");
            return;
        }
        if (HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSupportMemberSignature()) {
            return;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            HwWatchFaceManager.getInstance(Environment.getApplicationContext()).doDeleteWatchFace(str, str2, this.f30568a);
        } else {
            HwLog.i("MembershipDeletionHelper", "resetDeleteVipHiTopId hiTopId or version is null");
        }
    }

    public static boolean a(WatchResourcesInfo watchResourcesInfo) {
        return watchResourcesInfo != null && (watchResourcesInfo.getWatchInfoType() & 64) == 64;
    }

    public final void a(String str, String str2) {
        HwLog.i("MembershipDeletionHelper", "deleteVipHiTopId hiTopId:" + str + ",version:" + str2);
        if (e5.c().g()) {
            HwLog.i("MembershipDeletionHelper", "deleteVipHiTopId isVipMembership");
            this.f30569b.onResponse(104, null);
            return;
        }
        if (HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSupportMemberSignature()) {
            HwLog.i("MembershipDeletionHelper", "deleteVipHiTopId -- isSupportMemberSignature true");
            ArrayList<WatchResourcesInfo> presetWatchInfo = HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getPresetWatchInfo();
            if (ArrayUtils.isEmpty(presetWatchInfo)) {
                HwLog.i("MembershipDeletionHelper", "deleteVipHiTopId -- presetWatchInfo is empty");
                this.f30569b.onResponse(104, null);
                return;
            } else {
                WatchResourcesInfo watchResourcesInfo = presetWatchInfo.get(0);
                HwWatchFaceManager.getInstance(Environment.getApplicationContext()).setDefaultWatchFace(watchResourcesInfo.getWatchInfoId(), watchResourcesInfo.getWatchInfoVersion(), null, this.f30570c);
                return;
            }
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            HwWatchFaceManager.getInstance(Environment.getApplicationContext()).doDeleteWatchFace(str, str2, this.f30569b);
        } else {
            HwLog.i("MembershipDeletionHelper", "deleteVipHiTopId hiTopId or version is null");
            this.f30569b.onResponse(104, null);
        }
    }

    public void a(List list) {
        synchronized (this) {
            if (HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSupportMemberSignature()) {
                HwLog.e("MembershipDeletionHelper", "keepSingleMembershipFreeWatchFace -- isSupportMemberSignature true");
                return;
            }
            if (list == null) {
                return;
            }
            HwLog.i("MembershipDeletionHelper", "keepSingleMembershipFreeWatchFace -- enter" + GsonHelper.toJson(list));
            WatchResourcesInfo currentWatchFace = HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getCurrentWatchFace();
            String watchInfoId = "";
            if (currentWatchFace != null) {
                HwLog.i("MembershipDeletionHelper", "current watchResourcesInfo is not null");
                watchInfoId = currentWatchFace.getWatchInfoId();
            }
            ListIterator listIterator = list.listIterator(0);
            String str = "";
            String str2 = "";
            boolean z = false;
            while (listIterator.hasNext()) {
                String[] strArrSplit = ((String) listIterator.next()).split("_");
                if (strArrSplit.length >= 2) {
                    str = strArrSplit[0];
                    str2 = strArrSplit[1];
                }
                if (str.equals(watchInfoId)) {
                    z = true;
                } else if (listIterator.hasNext() || z) {
                    HwWatchFaceManager.getInstance(Environment.getApplicationContext()).doDeleteWatchFace(str, str2, this.f30568a);
                    listIterator.remove();
                }
            }
            g5.c().c(list);
            HwWatchFaceManager.getInstance(Environment.getApplicationContext()).transmitWatchInfoChange(1);
        }
    }

    public void a() {
        synchronized (this) {
            HwLog.i("MembershipDeletionHelper", "clear:");
            f = null;
        }
    }
}
