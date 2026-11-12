package com.huawei.hms.findnetwork.sdk;

import android.text.TextUtils;
import com.huawei.hms.findnetwork.FindNetworkEngine;
import com.huawei.hms.findnetwork.comm.exception.FindNetworkException;
import com.huawei.hms.findnetwork.comm.request.bean.HeartBeatBean;
import com.huawei.hms.findnetwork.comm.util.MaskUtil;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class r {
    public static volatile r d = null;
    public static final Object e = new Object();
    public static volatile boolean f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FindNetworkEngine f13236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Timer f13237b = new Timer();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f13238c;

    /* JADX INFO: loaded from: classes33.dex */
    public static class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FindNetworkEngine f13239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f13240b = UUID.randomUUID().toString();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HeartBeatBean f13241c;

        public a(FindNetworkEngine findNetworkEngine) {
            this.f13239a = findNetworkEngine;
        }

        public void a(String str, int i) {
            if (TextUtils.isEmpty(str)) {
                HmsFindSDKLog.i("HeartbeatSender", "addTask, the sn is empty");
                return;
            }
            if (this.f13241c == null) {
                this.f13241c = new HeartBeatBean(str, new ArrayList());
            }
            if (str.equals(this.f13241c.getSn())) {
                if (this.f13241c.getBusinessIdList().contains(Integer.valueOf(i))) {
                    HmsFindSDKLog.i("HeartbeatSender", "the task heartBeat is already in task" + MaskUtil.maskSn(r.a(str, i)));
                    return;
                } else {
                    this.f13241c.getBusinessIdList().add(Integer.valueOf(i));
                    HmsFindSDKLog.i("HeartbeatSender", "add task heartBeat is success" + MaskUtil.maskSn(r.a(str, i)));
                    return;
                }
            }
            HmsFindSDKLog.i("HeartbeatSender", "sn not equals, sn: " + MaskUtil.maskSn(str) + ", getSn(): " + MaskUtil.maskSn(this.f13241c.getSn()));
            a(true);
            this.f13241c.setSn(str);
            this.f13241c.getBusinessIdList().clear();
            this.f13241c.getBusinessIdList().add(Integer.valueOf(i));
        }

        public void b(String str, int i) {
            String str2;
            if (TextUtils.isEmpty(str)) {
                str2 = "removeTask: the sn is empty";
            } else {
                HeartBeatBean heartBeatBean = this.f13241c;
                if (heartBeatBean != null && heartBeatBean.getBusinessIdList() != null) {
                    Iterator<Integer> it = this.f13241c.getBusinessIdList().iterator();
                    while (it.hasNext()) {
                        if (it.next().intValue() == i) {
                            it.remove();
                            try {
                                FindNetworkEngine findNetworkEngine = this.f13239a;
                                if (findNetworkEngine != null) {
                                    findNetworkEngine.sendHeartBeat(str, i, true);
                                }
                            } catch (FindNetworkException e) {
                                HmsFindSDKLog.e("HeartbeatSender", "removeTask: " + e.getMessage());
                            }
                            HmsFindSDKLog.i("HeartbeatSender", "removeTask: " + MaskUtil.maskSn(r.a(str, i)));
                            return;
                        }
                    }
                    return;
                }
                str2 = "removeTask: taskCashBean is null or taskList is null";
            }
            HmsFindSDKLog.i("HeartbeatSender", str2);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (this.f13239a == null) {
                HmsFindSDKLog.i("HeartbeatSender", "FindNetworkEngine is null");
                return;
            }
            HeartBeatBean heartBeatBean = this.f13241c;
            if (heartBeatBean != null && !TextUtils.isEmpty(heartBeatBean.getSn()) && this.f13241c.getBusinessIdList() != null && this.f13241c.getBusinessIdList().size() != 0) {
                a(false);
                return;
            }
            HmsFindSDKLog.i("HeartbeatSender", "not heartBeat Task is null, cancel timer");
            cancel();
            r.a(false);
        }

        public final int[] a() {
            if (this.f13241c.getBusinessIdList() == null || this.f13241c.getBusinessIdList().size() == 0) {
                return new int[0];
            }
            int[] iArr = new int[this.f13241c.getBusinessIdList().size()];
            for (int i = 0; i < this.f13241c.getBusinessIdList().size(); i++) {
                iArr[i] = this.f13241c.getBusinessIdList().get(i).intValue();
            }
            return iArr;
        }

        public void b() {
            cancel();
            r.a(false);
            this.f13241c = null;
            HmsFindSDKLog.i("HeartbeatSender", "stopTask is success");
        }

        public final void a(boolean z) {
            try {
                FindNetworkEngine findNetworkEngine = this.f13239a;
                if (findNetworkEngine == null) {
                    HmsFindSDKLog.i("HeartbeatSender", "engine is null");
                } else {
                    findNetworkEngine.sendHeartBeat(this.f13241c.getSn(), this.f13240b, a(), z, "");
                }
            } catch (FindNetworkException e) {
                HmsFindSDKLog.e("HeartbeatSender", "sendHeartBeat error " + e.getMessage());
            }
        }
    }

    public static r a() {
        if (d == null) {
            synchronized (r.class) {
                if (d == null) {
                    d = new r();
                }
            }
        }
        return d;
    }

    public void b(String str, int i) {
        HmsFindSDKLog.i("HeartbeatSender", "call startHeartbeatSender");
        if (TextUtils.isEmpty(str)) {
            HmsFindSDKLog.i("HeartbeatSender", "Sn is empty.");
            return;
        }
        synchronized (e) {
            if (f) {
                a aVar = this.f13238c;
                if (aVar == null) {
                    HmsFindSDKLog.e("HeartbeatSender", "heartBeatTask is null");
                } else {
                    aVar.a(str, i);
                }
            } else {
                this.f13238c = null;
                this.f13238c = new a(this.f13236a);
                HmsFindSDKLog.i("HeartbeatSender", "start schedule heartBeatTask");
                this.f13238c.a(str, i);
                this.f13237b.schedule(this.f13238c, 0L, 5000L);
                a(true);
            }
        }
    }

    public void c(String str, int i) {
        HmsFindSDKLog.i("HeartbeatSender", "stopHeartbeatSender");
        if (TextUtils.isEmpty(str)) {
            HmsFindSDKLog.i("HeartbeatSender", "Sn is empty.");
            return;
        }
        synchronized (e) {
            HmsFindSDKLog.i("HeartbeatSender", "Stop heartbeat sender for sn: " + MaskUtil.maskSn(str) + "_" + i);
            a aVar = this.f13238c;
            if (aVar != null) {
                aVar.b(str, i);
            }
        }
    }

    public static String a(String str, int i) {
        return str + "_" + i;
    }

    public void b() {
        a aVar = this.f13238c;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void a(FindNetworkEngine findNetworkEngine) {
        this.f13236a = findNetworkEngine;
    }

    public static void a(boolean z) {
        f = z;
    }
}
