package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import health.compact.a.HiDateUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f43636a = new Object();
    private static volatile nta e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f43637b;
    private int d = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43638c = 3;

    private nta(Context context) {
        this.f43637b = context;
    }

    public static nta c(Context context) {
        if (e == null) {
            synchronized (f43636a) {
                if (e == null) {
                    if (context == null) {
                        e = new nta(BaseApplication.getContext());
                    } else {
                        e = new nta(context);
                    }
                }
            }
        }
        return e;
    }

    private void e() {
        String strC = ntl.c(30005, "ai-common-001", "message_show_to_smartcard_time");
        String strC2 = ntl.c(30005, "ai-common-002", "click_info_time_on_smartcard_oneday");
        LogUtil.a("SmartDataInteractors", "msgShowTime = ", strC, " clickTime = ", strC2);
        if (!TextUtils.isEmpty(strC)) {
            try {
                this.f43638c = Integer.parseInt(strC);
            } catch (NumberFormatException e2) {
                LogUtil.e("SmartDataInteractors", "NumberFormatException = ", e2.getMessage());
            }
        }
        if (TextUtils.isEmpty(strC2)) {
            return;
        }
        try {
            this.d = Integer.parseInt(strC2);
        } catch (NumberFormatException e3) {
            LogUtil.e("SmartDataInteractors", "NumberFormatException = ", e3.getMessage());
        }
    }

    public SmartMsgDbObject c(List<SmartMsgDbObject> list, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        e();
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        ArrayList<SmartMsgDbObject> arrayList3 = new ArrayList(10);
        ArrayList arrayList4 = new ArrayList(10);
        b(list, i, i2, arrayList, arrayList2);
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return null;
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new b(0));
        }
        if (!arrayList2.isEmpty()) {
            Collections.sort(arrayList2, new b(2));
            int iD = HiDateUtil.d(arrayList2.get(0).getUpdateTime());
            for (SmartMsgDbObject smartMsgDbObject : arrayList2) {
                if (iD == HiDateUtil.d(smartMsgDbObject.getUpdateTime())) {
                    arrayList3.add(smartMsgDbObject);
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            Collections.sort(arrayList3, new b(1));
            int messagePriority = ((SmartMsgDbObject) arrayList3.get(0)).getMessagePriority();
            for (SmartMsgDbObject smartMsgDbObject2 : arrayList3) {
                if (messagePriority == smartMsgDbObject2.getMessagePriority()) {
                    arrayList4.add(smartMsgDbObject2);
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            Collections.sort(arrayList4, new b(0));
        }
        if (arrayList.isEmpty()) {
            return (SmartMsgDbObject) arrayList4.get(0);
        }
        if (arrayList4.isEmpty()) {
            return arrayList.get(0);
        }
        return arrayList.get(0).getUpdateTime() > ((SmartMsgDbObject) arrayList4.get(0)).getUpdateTime() ? arrayList.get(0) : (SmartMsgDbObject) arrayList4.get(0);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0006 A[SYNTHETIC] */
    private void b(List<SmartMsgDbObject> list, int i, int i2, List<SmartMsgDbObject> list2, List<SmartMsgDbObject> list3) {
        NumberFormatException e2;
        int i3;
        long j;
        for (SmartMsgDbObject smartMsgDbObject : list) {
            if (smartMsgDbObject.getId() == i2) {
                if (!nst.d(smartMsgDbObject) && !nst.c(smartMsgDbObject)) {
                    if (nst.d(smartMsgDbObject.getShowTime()) && (!nst.a(smartMsgDbObject) || i != 0)) {
                        if (smartMsgDbObject.getMsgSrc() == 4) {
                            try {
                                i3 = Integer.parseInt(SharedPreferenceManager.e(this.f43637b, Integer.toString(10000), "health_information_click_count"));
                                try {
                                    j = Long.parseLong(SharedPreferenceManager.e(this.f43637b, Integer.toString(10000), "health_information_click_time"));
                                } catch (NumberFormatException e3) {
                                    e2 = e3;
                                    LogUtil.e("SmartDataInteractors", "parseInt Exception ", e2.getMessage());
                                    j = 0;
                                }
                            } catch (NumberFormatException e4) {
                                e2 = e4;
                                i3 = 0;
                            }
                            if (i3 < this.d) {
                                if (HiDateUtil.d(System.currentTimeMillis()) == HiDateUtil.d(j)) {
                                    SharedPreferenceManager.e(this.f43637b, Integer.toString(10000), "health_information_click_count", Integer.toString(0), new StorageParams());
                                }
                            }
                        }
                        if (smartMsgDbObject.getMsgSrc() == 5) {
                            if (smartMsgDbObject.getMsgType() != 50001) {
                                list2.add(smartMsgDbObject);
                            }
                        } else {
                            list3.add(smartMsgDbObject);
                        }
                    }
                }
            } else if (nst.c(smartMsgDbObject, this.f43638c)) {
                LogUtil.a("SmartDataInteractors", "traversingMsgList, Msg is valid");
                if (nst.d(smartMsgDbObject.getShowTime())) {
                    if (smartMsgDbObject.getMsgSrc() == 4) {
                        i3 = Integer.parseInt(SharedPreferenceManager.e(this.f43637b, Integer.toString(10000), "health_information_click_count"));
                        j = Long.parseLong(SharedPreferenceManager.e(this.f43637b, Integer.toString(10000), "health_information_click_time"));
                        if (i3 < this.d) {
                            if (HiDateUtil.d(System.currentTimeMillis()) == HiDateUtil.d(j)) {
                                SharedPreferenceManager.e(this.f43637b, Integer.toString(10000), "health_information_click_count", Integer.toString(0), new StorageParams());
                            }
                        }
                    }
                    if (smartMsgDbObject.getMsgSrc() == 5) {
                        if (smartMsgDbObject.getMsgType() != 50001) {
                            list2.add(smartMsgDbObject);
                        }
                    } else {
                        list3.add(smartMsgDbObject);
                    }
                }
            }
        }
    }

    static class b implements Comparator<SmartMsgDbObject>, Serializable {
        private static final long serialVersionUID = 3205347599318091992L;
        private int e;

        b(int i) {
            this.e = i;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compare(SmartMsgDbObject smartMsgDbObject, SmartMsgDbObject smartMsgDbObject2) {
            int messagePriority;
            int messagePriority2;
            int i = this.e;
            if (i == 0) {
                return smartMsgDbObject2.getUpdateTime() >= smartMsgDbObject.getUpdateTime() ? 1 : -1;
            }
            if (i == 1) {
                messagePriority = smartMsgDbObject2.getMessagePriority();
                messagePriority2 = smartMsgDbObject.getMessagePriority();
            } else {
                if (i != 2) {
                    return 0;
                }
                messagePriority = HiDateUtil.d(smartMsgDbObject2.getUpdateTime());
                messagePriority2 = HiDateUtil.d(smartMsgDbObject.getUpdateTime());
            }
            return messagePriority - messagePriority2;
        }
    }
}
