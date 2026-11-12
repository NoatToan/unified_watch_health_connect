package com.loc;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.gpx.data.GPXBasePoint;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes18.dex */
public final class e {
    public static boolean g = false;
    private List<Messenger> B;
    public Context e;
    private boolean t = false;
    private boolean u = false;
    public String a = null;
    public b b = null;
    private long v = 0;
    private long w = 0;
    private dr x = null;
    public AMapLocation c = null;
    private long y = 0;
    private int z = 0;
    public a d = null;
    private i A = null;
    public dm f = null;
    public HashMap<Messenger, Long> h = new HashMap<>();
    public em i = null;
    public long j = 0;
    public long k = 0;
    public String l = null;
    private boolean C = true;
    private String D = "";
    public AMapLocationClientOption m = null;
    public AMapLocationClientOption n = new AMapLocationClientOption();
    public ServerSocket o = null;
    public boolean p = false;
    public Socket q = null;
    public boolean r = false;
    public c s = null;
    private final int E = 5000;
    private String F = "jsonp1";

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data;
            Messenger messenger;
            try {
                data = message.getData();
                try {
                    messenger = message.replyTo;
                    if (data != null) {
                        try {
                            if (!data.isEmpty()) {
                                String string = data.getString("c");
                                e eVar = e.this;
                                if (TextUtils.isEmpty(eVar.l)) {
                                    eVar.l = ei.b(eVar.e);
                                }
                                if (!(!TextUtils.isEmpty(string) && string.equals(eVar.l))) {
                                    if (message.what == 1) {
                                        em.a((String) null, 2102);
                                        dr drVarA = e.a("invalid handlder scode!!!#1002");
                                        dl dlVar = new dl();
                                        dlVar.f("#1002");
                                        dlVar.e("conitue");
                                        e.this.a(messenger, drVarA, drVarA.k(), dlVar);
                                        return;
                                    }
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                ei.a(th, "ApsServiceCore", "ActionHandler handlerMessage");
                            } catch (Throwable th2) {
                                ei.a(th2, "actionHandler", "handleMessage");
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    messenger = null;
                }
            } catch (Throwable th4) {
                th = th4;
                data = null;
                messenger = null;
            }
            switch (message.what) {
                case 0:
                    e.this.a(data);
                    e.a(e.this, messenger, data);
                    super.handleMessage(message);
                    return;
                case 1:
                    e.this.a(data);
                    e.b(e.this, messenger, data);
                    super.handleMessage(message);
                    return;
                case 2:
                    if (data != null && !data.isEmpty()) {
                        e.this.a((Bundle) null);
                        e eVar2 = e.this;
                        try {
                            if (!eVar2.r) {
                                c cVar = eVar2.new c();
                                eVar2.s = cVar;
                                cVar.start();
                                eVar2.r = true;
                            }
                            break;
                        } catch (Throwable th5) {
                            ei.a(th5, "ApsServiceCore", "startSocket");
                        }
                        super.handleMessage(message);
                        return;
                    }
                    return;
                case 3:
                    if (data != null && !data.isEmpty()) {
                        e.this.a((Bundle) null);
                        e.this.b();
                        super.handleMessage(message);
                        return;
                    }
                    return;
                case 4:
                    e.this.a(data);
                    e.a(e.this);
                    super.handleMessage(message);
                    return;
                case 5:
                    e.this.a(data);
                    e.b(e.this);
                    super.handleMessage(message);
                    return;
                case 6:
                case 8:
                default:
                    super.handleMessage(message);
                    return;
                case 7:
                    e.this.a(data);
                    e.c(e.this);
                    super.handleMessage(message);
                    return;
                case 9:
                    e.this.a(data);
                    e.a(e.this, messenger);
                    super.handleMessage(message);
                    return;
                case 10:
                    e.this.a(data);
                    e.this.a(messenger, data);
                    super.handleMessage(message);
                    return;
                case 11:
                    e.this.c();
                    super.handleMessage(message);
                    return;
                case 12:
                    e.b(e.this, messenger);
                    super.handleMessage(message);
                    return;
                case 13:
                    Messenger messenger2 = message.replyTo;
                    if (messenger2 != null && e.this.B != null && !e.this.B.contains(messenger2)) {
                        e.this.B.add(messenger2);
                        if (e.this.B.size() == 1) {
                            e.this.g();
                        }
                    }
                    super.handleMessage(message);
                    return;
                case 14:
                    Messenger messenger3 = message.replyTo;
                    if (messenger3 != null && e.this.B != null && e.this.B.contains(messenger3)) {
                        e.this.B.remove(messenger3);
                    }
                    if (e.this.B != null && e.this.B.size() == 0) {
                        e.this.f.h();
                    }
                    super.handleMessage(message);
                    return;
            }
            ei.a(th2, "actionHandler", "handleMessage");
        }
    }

    public class b extends HandlerThread {
        public b(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            try {
                try {
                    e.this.A = new i(e.this.e);
                } catch (Throwable th) {
                    ei.a(th, "APSManager$ActionThread", "init 2");
                }
                try {
                    eh.b(e.this.e);
                } catch (Throwable th2) {
                    ei.a(th2, "APSManager$ActionThread", "init 3");
                }
                e.this.f = new dm();
                super.onLooperPrepared();
            } catch (Throwable th3) {
                ei.a(th3, "APSManager$ActionThread", "onLooperPrepared");
            }
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                super.run();
            } catch (Throwable th) {
                ei.a(th, "APSManager$ActionThread", "run");
            }
        }
    }

    public class c extends Thread {
        public c() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ServerSocket serverSocket;
            try {
                e eVar = e.this;
                if (!eVar.p) {
                    eVar.p = true;
                    eVar.o = new ServerSocket(43689);
                }
                while (true) {
                    e eVar2 = e.this;
                    if (!eVar2.p || (serverSocket = eVar2.o) == null) {
                        break;
                    }
                    eVar2.q = serverSocket.accept();
                    e eVar3 = e.this;
                    e.a(eVar3, eVar3.q);
                }
            } catch (Throwable th) {
                ei.a(th, "ApsServiceCore", "run");
            }
            super.run();
        }
    }

    public e(Context context) {
        this.e = null;
        this.e = context;
    }

    private static dr a(int i, String str) {
        try {
            dr drVar = new dr("");
            drVar.setErrorCode(i);
            drVar.setLocationDetail(str);
            return drVar;
        } catch (Throwable th) {
            ei.a(th, "ApsServiceCore", "newInstanceAMapLoc");
            return null;
        }
    }

    public static /* synthetic */ dr a(String str) {
        return a(10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        try {
            if (this.t) {
                return;
            }
            ei.a(this.e);
            if (bundle != null) {
                this.n = ei.a(bundle.getBundle("optBundle"));
            }
            this.f.a(this.e);
            this.f.a();
            a(this.n);
            this.f.b();
            this.t = true;
            this.C = true;
            this.D = "";
            List<Messenger> list = this.B;
            if (list == null || list.size() <= 0) {
                return;
            }
            g();
        } catch (Throwable th) {
            this.C = false;
            this.D = th.getMessage();
            ei.a(th, "ApsServiceCore", PointCategory.INIT);
        }
    }

    private static void a(Messenger messenger, int i, Bundle bundle) {
        if (messenger != null) {
            try {
                Message messageObtain = Message.obtain();
                messageObtain.setData(bundle);
                messageObtain.what = i;
                messenger.send(messageObtain);
            } catch (Throwable th) {
                ei.a(th, "ApsServiceCore", "sendMessage");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Messenger messenger, AMapLocation aMapLocation, String str, dl dlVar) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(AMapLocation.class.getClassLoader());
        bundle.putParcelable("loc", aMapLocation);
        bundle.putString("nb", str);
        bundle.putParcelable("statics", dlVar);
        this.h.put(messenger, Long.valueOf(eo.b()));
        a(messenger, 1, bundle);
    }

    private void a(Messenger messenger, boolean z) {
        try {
            this.f.a(this.e, z);
            if (eh.i()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("ngpsAble", eh.k());
                a(messenger, 7, bundle);
                eh.j();
            }
            if (eh.q()) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("installMockApp", true);
                a(messenger, 9, bundle2);
            }
        } catch (Throwable th) {
            ei.a(th, "ApsServiceCore", "initAuth");
        }
    }

    private void a(AMapLocationClientOption aMapLocationClientOption) {
        try {
            dm dmVar = this.f;
            if (dmVar != null) {
                dmVar.a(aMapLocationClientOption);
            }
            if (aMapLocationClientOption != null) {
                g = aMapLocationClientOption.isKillProcess();
                if (this.m != null && (aMapLocationClientOption.isOffset() != this.m.isOffset() || aMapLocationClientOption.isNeedAddress() != this.m.isNeedAddress() || aMapLocationClientOption.isLocationCacheEnable() != this.m.isLocationCacheEnable() || this.m.getGeoLanguage() != aMapLocationClientOption.getGeoLanguage())) {
                    this.w = 0L;
                    this.c = null;
                }
                this.m = aMapLocationClientOption;
            }
        } catch (Throwable th) {
            ei.a(th, "ApsServiceCore", "setExtra");
        }
    }

    public static /* synthetic */ void a(e eVar) {
        try {
            if (eVar.z < eh.b()) {
                eVar.z++;
                eVar.f.d();
                eVar.d.sendEmptyMessageDelayed(4, 2000L);
            }
        } catch (Throwable th) {
            ei.a(th, "ApsServiceCore", "doGpsFusion");
        }
    }

    public static /* synthetic */ void a(e eVar, Messenger messenger) {
        try {
            eVar.a(messenger, false);
            eh.c(eVar.e);
        } catch (Throwable th) {
            ei.a(th, "ApsServiceCore", "doCallOtherSer");
        }
    }

    public static /* synthetic */ void a(e eVar, Messenger messenger, Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.isEmpty() || eVar.u) {
                    return;
                }
                eVar.u = true;
                boolean z = bundle.getBoolean("needRequestCloud", false);
                eh.b = bundle.getString("requestHost");
                eh.c = bundle.getString("requestIpV6Host");
                eh.d = bundle.getString("dnsHostName");
                eVar.a(messenger, z);
                eh.c(eVar.e);
                eVar.e();
                if (eh.a(eVar.y) && "1".equals(bundle.getString("isCacheLoc"))) {
                    eVar.y = eo.b();
                    eVar.f.d();
                }
            } catch (Throwable th) {
                ei.a(th, "ApsServiceCore", "doInitAuth");
            }
        }
    }

    public static /* synthetic */ void a(e eVar, Socket socket) {
        BufferedReader bufferedReader;
        if (socket == null) {
            return;
        }
        try {
            int i = ei.g;
            String str = null;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                try {
                    eVar.a(bufferedReader);
                    String strF = eVar.f();
                    ei.g = i;
                    try {
                        eVar.b(strF);
                        try {
                            bufferedReader.close();
                            socket.close();
                        } catch (Throwable th) {
                            ei.a(th, "apm", "inSocetLn part3");
                        }
                    } catch (Throwable th2) {
                        try {
                            ei.a(th2, "apm", "inSocetLn part2");
                            try {
                                bufferedReader.close();
                                socket.close();
                            } catch (Throwable th3) {
                                ei.a(th3, "apm", "inSocetLn part3");
                            }
                        } catch (Throwable th4) {
                            try {
                                bufferedReader.close();
                                socket.close();
                            } catch (Throwable th5) {
                                ei.a(th5, "apm", "inSocetLn part3");
                            }
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    try {
                        str = eVar.F + "&&" + eVar.F + "({'package':'" + eVar.a + "','error_code':1,'error':'params error'})";
                        ei.a(th, "apm", "inSocetLn");
                        ei.g = i;
                        try {
                            eVar.b(str);
                            try {
                                bufferedReader.close();
                                socket.close();
                            } catch (Throwable th7) {
                                ei.a(th7, "apm", "inSocetLn part3");
                            }
                        } catch (Throwable th8) {
                            try {
                                ei.a(th8, "apm", "inSocetLn part2");
                                try {
                                    bufferedReader.close();
                                    socket.close();
                                } catch (Throwable th9) {
                                    ei.a(th9, "apm", "inSocetLn part3");
                                }
                            } catch (Throwable th10) {
                                try {
                                    bufferedReader.close();
                                    socket.close();
                                } catch (Throwable th11) {
                                    ei.a(th11, "apm", "inSocetLn part3");
                                }
                                throw th10;
                            }
                        }
                    } catch (Throwable th12) {
                        ei.g = i;
                        try {
                            eVar.b(str);
                            try {
                                bufferedReader.close();
                                socket.close();
                            } catch (Throwable th13) {
                                th = th13;
                                ei.a(th, "apm", "inSocetLn part3");
                                throw th12;
                            }
                        } catch (Throwable th14) {
                            try {
                                ei.a(th14, "apm", "inSocetLn part2");
                                try {
                                    bufferedReader.close();
                                    socket.close();
                                } catch (Throwable th15) {
                                    th = th15;
                                    ei.a(th, "apm", "inSocetLn part3");
                                    throw th12;
                                }
                            } catch (Throwable th16) {
                                try {
                                    bufferedReader.close();
                                    socket.close();
                                } catch (Throwable th17) {
                                    ei.a(th17, "apm", "inSocetLn part3");
                                }
                                throw th16;
                            }
                        }
                        throw th12;
                    }
                }
            } catch (Throwable th18) {
                th = th18;
                bufferedReader = null;
            }
        } catch (Throwable th19) {
            ei.a(th19, "apm", "inSocetLn part4");
        }
    }

    private void a(BufferedReader bufferedReader) throws Exception {
        String[] strArrSplit;
        String[] strArrSplit2;
        String[] strArrSplit3;
        String line = bufferedReader.readLine();
        int iG = 30000;
        if (line != null && line.length() > 0 && (strArrSplit = line.split(" ")) != null && strArrSplit.length > 1 && (strArrSplit2 = strArrSplit[1].split("\\?")) != null && strArrSplit2.length > 1 && (strArrSplit3 = strArrSplit2[1].split(com.alipay.sdk.m.s.a.l)) != null && strArrSplit3.length > 0) {
            for (String str : strArrSplit3) {
                String[] strArrSplit4 = str.split(SearchCriteria.EQ);
                if (strArrSplit4 != null && strArrSplit4.length > 1) {
                    if ("to".equals(strArrSplit4[0])) {
                        iG = eo.g(strArrSplit4[1]);
                    }
                    if ("callback".equals(strArrSplit4[0])) {
                        this.F = strArrSplit4[1];
                    }
                }
            }
        }
        ei.g = iG;
    }

    private AMapLocationClientOption b(Bundle bundle) {
        AMapLocationClientOption aMapLocationClientOptionA = ei.a(bundle.getBundle("optBundle"));
        a(aMapLocationClientOptionA);
        try {
            String string = bundle.getString(GoogleApiAvailabilityLight.a);
            if (!TextUtils.isEmpty(string)) {
                n.a(string);
            }
        } catch (Throwable th) {
            try {
                ei.a(th, "APSManager", "doLocation setUmidToken");
            } catch (Throwable th2) {
                ei.a(th2, "APSManager", "parseBundle");
            }
        }
        return aMapLocationClientOptionA;
    }

    public static /* synthetic */ void b(e eVar) {
        try {
            if (eh.e() || !eo.e(eVar.e)) {
                dm dmVar = eVar.f;
                dmVar.d();
            }
            eVar.d.sendEmptyMessageDelayed(5, eh.d() * 1000);
        } catch (Throwable th) {
            ei.a(th, "ApsServiceCore", "doOffFusion");
        }
    }

    public static /* synthetic */ void b(e eVar, Messenger messenger) {
        eVar.h.remove(messenger);
    }

    public static /* synthetic */ void b(e eVar, Messenger messenger, Bundle bundle) {
        String str;
        i iVar;
        dr drVar;
        if (bundle != null) {
            try {
                if (bundle.isEmpty()) {
                    return;
                }
                dl dlVar = new dl();
                dlVar.e("conitue");
                AMapLocationClientOption aMapLocationClientOptionB = eVar.b(bundle);
                if (eVar.h.containsKey(messenger) && !aMapLocationClientOptionB.isOnceLocation()) {
                    if (eo.b() - eVar.h.get(messenger).longValue() < 800) {
                        return;
                    }
                }
                AMapLocation aMapLocationA = null;
                if (!eVar.C) {
                    eVar.x = a(9, "init error : " + eVar.D + "#0901");
                    dlVar.f("#0901");
                    dr drVar2 = eVar.x;
                    eVar.a(messenger, drVar2, drVar2.k(), dlVar);
                    em.a((String) null, 2091);
                    return;
                }
                long jB = eo.b();
                if (!eo.a(eVar.x) || jB - eVar.w >= 600) {
                    dlVar.c(eo.b());
                    try {
                        dr drVarA = eVar.f.a(dlVar);
                        eVar.x = drVarA;
                        if (drVarA.getLocationType() != 6) {
                            eVar.x.getLocationType();
                        }
                        eVar.x = eVar.f.a(eVar.x);
                    } catch (Throwable th) {
                        em.a((String) null, 2081);
                        dlVar.f("#0801");
                        eVar.x = a(8, "loc error : " + th.getMessage() + "#0801");
                        ei.a(th, "ApsServiceCore", "run part2");
                    }
                    if (eo.a(eVar.x)) {
                        eVar.w = eo.b();
                    }
                    if (eVar.x == null) {
                        eVar.x = a(8, "loc is null#0801");
                        dlVar.f("#0801");
                    }
                    dr drVar3 = eVar.x;
                    if (drVar3 != null) {
                        String strK = drVar3.k();
                        aMapLocationA = eVar.x.m3277clone();
                        str = strK;
                    } else {
                        str = null;
                    }
                    try {
                        if (aMapLocationClientOptionB.isLocationCacheEnable() && (iVar = eVar.A) != null) {
                            aMapLocationA = iVar.a(aMapLocationA, str, aMapLocationClientOptionB.getLastLocationLifeCycle());
                        }
                    } catch (Throwable th2) {
                        ei.a(th2, "ApsServiceCore", "fixLastLocation");
                    }
                    eVar.a(messenger, aMapLocationA, str, dlVar);
                } else {
                    dr drVar4 = eVar.x;
                    eVar.a(messenger, drVar4, drVar4.k(), dlVar);
                }
                eVar.a(messenger, false);
                if (eh.r()) {
                    eVar.e();
                }
                if (!eh.a(eVar.y) || (drVar = eVar.x) == null) {
                    return;
                }
                if (drVar.getLocationType() == 2 || eVar.x.getLocationType() == 4 || eVar.x.getLocationType() == 9) {
                    eVar.y = eo.b();
                    eVar.f.d();
                }
            } catch (Throwable th3) {
                ei.a(th3, "ApsServiceCore", "doLocation");
            }
        }
    }

    private void b(String str) throws IOException {
        PrintStream printStream = new PrintStream(this.q.getOutputStream(), true, "UTF-8");
        printStream.println("HTTP/1.0 200 OK");
        printStream.println("Content-Length:" + str.getBytes("UTF-8").length);
        printStream.println();
        printStream.println(str);
        printStream.close();
    }

    public static /* synthetic */ void c(e eVar) {
        try {
            if (eh.a(eVar.e, eVar.v)) {
                eVar.v = eo.a();
                eVar.f.d();
            }
        } catch (Throwable th) {
            ei.a(th, "ApsServiceCore", "doNGps");
        }
    }

    public static void d() {
        g = false;
    }

    private void e() {
        try {
            this.d.removeMessages(4);
            if (eh.a()) {
                this.d.sendEmptyMessage(4);
            }
            this.d.removeMessages(5);
            if (!eh.c() || eh.d() <= 2) {
                return;
            }
            this.d.sendEmptyMessage(5);
        } catch (Throwable th) {
            ei.a(th, "ApsServiceCore", "checkConfig");
        }
    }

    private String f() {
        StringBuilder sb;
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (eo.e(this.e)) {
            sb = new StringBuilder();
            sb.append(this.F);
            sb.append("&&");
            sb.append(this.F);
            sb.append("({'package':'");
            sb.append(this.a);
            str = "','error_code':36,'error':'app is background'})";
        } else {
            dr drVar = this.x;
            if (drVar == null || jCurrentTimeMillis - drVar.getTime() > 5000) {
                try {
                    this.x = this.f.a(new dl());
                } catch (Throwable th) {
                    ei.a(th, "ApsServiceCore", "getSocketLocResult");
                }
            }
            dr drVar2 = this.x;
            if (drVar2 == null) {
                sb = new StringBuilder();
                sb.append(this.F);
                sb.append("&&");
                sb.append(this.F);
                sb.append("({'package':'");
                sb.append(this.a);
                str = "','error_code':8,'error':'unknown error'})";
            } else if (drVar2.getErrorCode() != 0) {
                sb = new StringBuilder();
                sb.append(this.F);
                sb.append("&&");
                sb.append(this.F);
                sb.append("({'package':'");
                sb.append(this.a);
                sb.append("','error_code':");
                sb.append(this.x.getErrorCode());
                sb.append(",'error':'");
                sb.append(this.x.getErrorInfo());
                str = "'})";
            } else {
                sb = new StringBuilder();
                sb.append(this.F);
                sb.append("&&");
                sb.append(this.F);
                sb.append("({'package':'");
                sb.append(this.a);
                sb.append("','error_code':0,'error':'','location':{'y':");
                sb.append(this.x.getLatitude());
                sb.append(",'precision':");
                sb.append(this.x.getAccuracy());
                sb.append(",'x':");
                sb.append(this.x.getLongitude());
                str = "},'version_code':'5.0.0','version':'5.0.0'})";
            }
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            dm dmVar = this.f;
            if (dmVar == null || dmVar == null) {
                return;
            }
            dmVar.a(this.d);
            this.f.g();
        } catch (Throwable th) {
            ei.a(th, "ApsServiceCore", "startColl");
        }
    }

    public final void a() {
        try {
            this.i = new em();
            b bVar = new b("amapLocCoreThread");
            this.b = bVar;
            bVar.setPriority(5);
            this.b.start();
            this.d = new a(this.b.getLooper());
            this.B = new ArrayList();
        } catch (Throwable th) {
            ei.a(th, "ApsServiceCore", "onCreate");
        }
    }

    public final void a(Messenger messenger, Bundle bundle) {
        float fA;
        if (bundle != null) {
            try {
                if (!bundle.isEmpty() && eh.n()) {
                    double d = bundle.getDouble(GPXBasePoint.XML.ATTR_LAT);
                    double d2 = bundle.getDouble(GPXBasePoint.XML.ATTR_LON);
                    b(bundle);
                    AMapLocation aMapLocation = this.c;
                    if (aMapLocation != null) {
                        fA = eo.a(new double[]{d, d2, aMapLocation.getLatitude(), this.c.getLongitude()});
                        if (fA < eh.o() * 3) {
                            Bundle bundle2 = new Bundle();
                            bundle2.setClassLoader(AMapLocation.class.getClassLoader());
                            bundle2.putInt("I_MAX_GEO_DIS", eh.o() * 3);
                            bundle2.putInt("I_MIN_GEO_DIS", eh.o());
                            bundle2.putParcelable("loc", this.c);
                            a(messenger, 6, bundle2);
                        }
                    } else {
                        fA = -1.0f;
                    }
                    if (fA == -1.0f || fA > eh.o()) {
                        a(bundle);
                        this.c = this.f.a(d, d2);
                    }
                }
            } catch (Throwable th) {
                ei.a(th, "ApsServiceCore", "doLocationGeo");
            }
        }
    }

    public final void b() {
        try {
            Socket socket = this.q;
            if (socket != null) {
                socket.close();
            }
        } catch (Throwable th) {
            ei.a(th, "ApsServiceCore", "doStopScocket 1");
        }
        try {
            ServerSocket serverSocket = this.o;
            if (serverSocket != null) {
                serverSocket.close();
            }
        } catch (Throwable th2) {
            ei.a(th2, "ApsServiceCore", "doStopScocket 2");
        }
        try {
            c cVar = this.s;
            if (cVar != null) {
                cVar.interrupt();
            }
        } catch (Throwable unused) {
        }
        this.s = null;
        this.o = null;
        this.p = false;
        this.r = false;
    }

    public final void c() {
        try {
            HashMap<Messenger, Long> map = this.h;
            if (map != null) {
                map.clear();
                this.h = null;
            }
            try {
                List<Messenger> list = this.B;
                if (list != null) {
                    list.clear();
                }
            } catch (Throwable th) {
                ei.a(th, "apm", "des1");
            }
            dm dmVar = this.f;
            if (dmVar != null) {
                dmVar.a(this.e, false);
            }
            a aVar = this.d;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            b bVar = this.b;
            if (bVar != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    try {
                        el.a(bVar, (Class<?>) HandlerThread.class, "quitSafely", new Object[0]);
                    } catch (Throwable unused) {
                        bVar = this.b;
                        bVar.quit();
                    }
                } else {
                    bVar.quit();
                }
            }
            this.b = null;
            this.d = null;
            i iVar = this.A;
            if (iVar != null) {
                iVar.c();
                this.A = null;
            }
            b();
            this.t = false;
            this.u = false;
            this.f.e();
            if (this.i != null && this.j != 0 && this.k != 0) {
                long jB = eo.b() - this.j;
                em.a(this.e, this.i.c(this.e), this.i.d(this.e), this.k, jB);
                this.i.e(this.e);
            }
            em.a(this.e);
            ab.b();
            if (g) {
                Process.killProcess(Process.myPid());
            }
        } catch (Throwable th2) {
            ei.a(th2, "apm", "tdest");
        }
    }
}
