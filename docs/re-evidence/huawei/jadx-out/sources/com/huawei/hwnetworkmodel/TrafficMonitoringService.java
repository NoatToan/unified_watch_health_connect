package com.huawei.hwnetworkmodel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.SpKeys;
import defpackage.nqe;
import defpackage.nqg;
import health.compact.a.CompileParameterUtil;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class TrafficMonitoringService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f17651a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f17652b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f17653c = false;
    private static HttpDatabaseHelper d = null;
    private static boolean e = false;
    private static SharedPreferences f;
    private static nqe j;
    private Context g;
    private ConnectivityManager h;
    private b i;
    private e l;
    private d m;
    private Date n;

    public TrafficMonitoringService(Context context) {
        this.g = context;
    }

    public static boolean j() {
        return CompileParameterUtil.c("IS_TRAFFIC_LIMITED", false);
    }

    public static boolean e() {
        nqe nqeVar;
        if (!j() || !f17653c) {
            return false;
        }
        synchronized (TrafficMonitoringService.class) {
            nqeVar = new nqe(j.a(), j.e(), j.c(), j.b());
        }
        if (f17652b) {
            LogUtil.j("TrafficMonService", "isOverFlow network traffic overflow 3 days.");
            if (!f17651a) {
                i();
            }
            return true;
        }
        if (nqeVar.b() < 314572800) {
            return false;
        }
        LogUtil.j("TrafficMonService", "isOverFlow network traffic overflow.");
        if (!e) {
            synchronized (TrafficMonitoringService.class) {
                j(true);
                Bundle bundle = new Bundle();
                bundle.putString(SpKeys.TODAY_DATE, nqeVar.a());
                bundle.putLong("today_total", nqeVar.b());
                bundle.putLong("today_requested", nqeVar.e());
                bundle.putLong("today_received", nqeVar.c());
                LogUtil.a(907127001, "TrafficMonService", bundle, false, "network traffic overflow. ", bundle);
            }
        }
        return true;
    }

    private static void i() {
        h(true);
        Bundle bundle = new Bundle();
        Date date = new Date();
        nqe nqeVarB = b(date, -1);
        if (nqeVarB != null) {
            bundle.putString("1_date", nqeVarB.a());
            bundle.putLong("1_total", nqeVarB.b());
            bundle.putLong("1_requested", nqeVarB.e());
            bundle.putLong("1_received", nqeVarB.c());
        }
        nqe nqeVarB2 = b(date, -2);
        if (nqeVarB2 != null) {
            bundle.putString("2_date", nqeVarB2.a());
            bundle.putLong("2_total", nqeVarB2.b());
            bundle.putLong("2_requested", nqeVarB2.e());
            bundle.putLong("2_received", nqeVarB2.c());
        }
        nqe nqeVarB3 = b(date, -3);
        if (nqeVarB3 != null) {
            bundle.putString("3_date", nqeVarB3.a());
            bundle.putLong("3_total", nqeVarB3.b());
            bundle.putLong("3_requested", nqeVarB3.e());
            bundle.putLong("3_received", nqeVarB3.c());
        }
        LogUtil.a(907127002, "TrafficMonService", bundle, false, "reportOverFlowError network traffic overflow 3 days.", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(nqe nqeVar) {
        d.e(nqeVar);
    }

    private static nqe b(Date date, int i) {
        return d.d(c(date, i));
    }

    private static String c(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, i);
        return nqg.d(calendar.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(boolean z) {
        e = z;
        SharedPreferences.Editor editorEdit = f.edit();
        editorEdit.putBoolean("setReportTodayError isReportTodayError:", z);
        editorEdit.commit();
    }

    private static void h(boolean z) {
        f17651a = z;
        SharedPreferences.Editor editorEdit = f.edit();
        editorEdit.putBoolean("setReportThreeDaysError isReportThreeDaysError:", z);
        editorEdit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(boolean z) {
        f17652b = z;
        SharedPreferences.Editor editorEdit = f.edit();
        editorEdit.putBoolean("setOverflowThreeDays isOverflowThreeDays:", z);
        editorEdit.commit();
    }

    private static void e(boolean z) {
        f17653c = z;
    }

    private static void c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("TrafficMonitorPreferences", 0);
        f = sharedPreferences;
        f17652b = sharedPreferences.getBoolean("isOverflow3days", false);
        e = f.getBoolean("isReportTodayErr", false);
        f17651a = f.getBoolean("isReport3DaysErr", false);
    }

    private static void d(nqe nqeVar) {
        synchronized (TrafficMonitoringService.class) {
            j = nqeVar;
        }
    }

    private static void c(HttpDatabaseHelper httpDatabaseHelper) {
        d = httpDatabaseHelper;
    }

    public static void e(long j2) {
        if (f17653c) {
            synchronized (TrafficMonitoringService.class) {
                nqe nqeVar = j;
                if (nqeVar != null) {
                    LogUtil.d("TrafficMonService", "requesting bytes:", Long.valueOf(j2), " total:", Long.valueOf(nqeVar.b()));
                    j.d(j2);
                }
            }
        }
    }

    public static void c(long j2) {
        if (f17653c) {
            synchronized (TrafficMonitoringService.class) {
                nqe nqeVar = j;
                if (nqeVar != null) {
                    LogUtil.d("TrafficMonService", "received bytes = ", Long.valueOf(j2), " total() = ", Long.valueOf(nqeVar.b()));
                    j.a(j2);
                }
            }
        }
    }

    public void f() {
        LogUtil.d("TrafficMonService", "onCreate");
        if (j()) {
            this.n = new Date();
            c(this.g);
            c(new HttpDatabaseHelper(this.g));
            if (!f17652b) {
                b(a(this.n));
            }
            synchronized (TrafficMonitoringService.class) {
                d(d.d(nqg.d(this.n)));
                if (j == null) {
                    LogUtil.j("TrafficMonService", "onCreate init today traffic with 0");
                    d(new nqe(nqg.d(this.n)));
                    LogUtil.d("TrafficMonService", "onCreate ->1--> total is ", Long.valueOf(j.b()), "->1--> sTodayState is ", j.toString());
                    d.d(j);
                    LogUtil.d("TrafficMonService", "onCreate ->2--> total is ", Long.valueOf(j.b()), "->2--> sTodayState is ", j.toString());
                }
                LogUtil.d("TrafficMonService", "onCreate ->3--> total is ", Long.valueOf(j.b()), "->3-->sTodayState is ", j.toString());
            }
            this.l = new e();
            this.m = new d();
            e(h());
            if (f17653c) {
                LogUtil.d("TrafficMonService", "onCreate start refresh thread.");
                if (!f17652b) {
                    this.l.start();
                }
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            b bVar = new b();
            this.i = bVar;
            this.g.registerReceiver(bVar, intentFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        NetworkInfo networkInfo;
        if (this.g.getSystemService("connectivity") instanceof ConnectivityManager) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.g.getSystemService("connectivity");
            this.h = connectivityManager;
            networkInfo = connectivityManager.getNetworkInfo(1);
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            boolean zIsConnected = networkInfo.isConnected();
            NetworkInfo networkInfo2 = this.h.getNetworkInfo(0);
            if (networkInfo2 != null) {
                boolean zIsConnected2 = networkInfo2.isConnected();
                if (zIsConnected) {
                    LogUtil.d("TrafficMonService", "isMobileConnection isWifiConn = true");
                    return false;
                }
                if (zIsConnected2) {
                    LogUtil.d("TrafficMonService", "isMobileConnection isMobileConn = true");
                    return true;
                }
                LogUtil.d("TrafficMonService", "isMobileConnection isWifiConn = false & isMobileConn = false");
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(Date date) {
        return nqg.d(new Date()).toString().equals(nqg.d(date).toString());
    }

    private boolean d(Date date, int i) {
        nqe nqeVarB = b(date, i);
        return nqeVarB != null && nqeVarB.b() >= 314572800;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Date date) {
        return d(date, -1) && d(date, -2) && d(date, -3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        synchronized (TrafficMonitoringService.class) {
            LogUtil.d("TrafficMonService", "updateTodayTraffic writing today traffic to DB: ", j);
            a(j);
        }
    }

    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null) {
                LogUtil.j("TrafficMonService", "ConnectionChangeReceiver onReceive null");
                return;
            }
            LogUtil.d("TrafficMonService", "ConnectionChangeReceiver onReceive, intent.action: ", intent.getAction(), " intent.type:", intent.getType());
            if (TrafficMonitoringService.this.h()) {
                LogUtil.d("TrafficMonService", "ConnectionChangeReceiver onReceive, isMobile is true");
                boolean unused = TrafficMonitoringService.f17653c = true;
                if (TrafficMonitoringService.this.l == null || TrafficMonitoringService.this.l.isAlive() || TrafficMonitoringService.f17652b) {
                    return;
                }
                LogUtil.d("TrafficMonService", "ConnectionChangeReceiver start refresh thread@ConnectionChangeReceiver");
                TrafficMonitoringService.this.l = TrafficMonitoringService.this.new e();
                TrafficMonitoringService.this.l.start();
                return;
            }
            LogUtil.d("TrafficMonService", "ConnectionChangeReceiver onReceive, isMobile is false");
            if (TrafficMonitoringService.f17653c) {
                boolean unused2 = TrafficMonitoringService.f17653c = false;
                LogUtil.d("TrafficMonService", "ConnectionChangeReceiver onReceive, from mobile switch to non-mobile");
                TrafficMonitoringService trafficMonitoringService = TrafficMonitoringService.this;
                if (trafficMonitoringService.c(trafficMonitoringService.n) && TrafficMonitoringService.this.m != null && !TrafficMonitoringService.this.m.isAlive()) {
                    LogUtil.d("TrafficMonService", "ConnectionChangeReceiver to start");
                    TrafficMonitoringService.this.m = TrafficMonitoringService.this.new d();
                    TrafficMonitoringService.this.m.start();
                }
            }
            boolean unused3 = TrafficMonitoringService.f17653c = false;
            LogUtil.d("TrafficMonService", "ConnectionChangeReceiver onReceive, ready to close refresh thread");
        }
    }

    class e extends Thread {
        e() {
            super("TrafficMonitoringService-RefreshThread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            do {
                TrafficMonitoringService trafficMonitoringService = TrafficMonitoringService.this;
                if (!trafficMonitoringService.c(trafficMonitoringService.n)) {
                    synchronized (TrafficMonitoringService.class) {
                        LogUtil.d("TrafficMonService", "RefreshThread cross day");
                        TrafficMonitoringService.j(false);
                        LogUtil.d("TrafficMonService", " RefreshThread run Writing yesterday traffic to DB: ", TrafficMonitoringService.j);
                        TrafficMonitoringService.a(TrafficMonitoringService.j);
                        Date date = new Date();
                        TrafficMonitoringService.b(TrafficMonitoringService.this.a(date));
                        nqe unused = TrafficMonitoringService.j = TrafficMonitoringService.d.d(nqg.d(date));
                        if (TrafficMonitoringService.j == null) {
                            nqe unused2 = TrafficMonitoringService.j = new nqe(nqg.d(date));
                            TrafficMonitoringService.d.d(TrafficMonitoringService.j);
                        }
                        TrafficMonitoringService.this.n = date;
                    }
                }
                LogUtil.d("TrafficMonService", "RefreshThread run update today traffic");
                TrafficMonitoringService.this.g();
                try {
                    Thread.sleep(1200000L);
                } catch (InterruptedException unused3) {
                    LogUtil.e("TrafficMonService", "RefreshThread run InterruptedException");
                }
                if (!TrafficMonitoringService.f17653c) {
                    return;
                }
            } while (!TrafficMonitoringService.f17652b);
        }
    }

    class d extends Thread {
        d() {
            super("TrafficMonitoringService-RecordThread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            LogUtil.d("TrafficMonService", "RecordThread run updateTodayTraffic");
            TrafficMonitoringService.this.g();
        }
    }
}
