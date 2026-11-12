package com.huawei.android.location.activityrecognition;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.bde;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class HwActivityRecognition {
    private static final int d = Build.VERSION.SDK_INT;
    private static int e = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f5133c;
    private Context f;
    private IActivityRecognitionHardwareSink k;
    private String l;
    private com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink o;
    private int g = 0;
    private HwActivityRecognitionServiceConnection m = null;
    private IActivityRecognitionHardwareService h = null;
    private com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService n = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f5132b = {"android.activity_recognition.in_vehicle", "android.activity_recognition.on_bicycle", "android.activity_recognition.walking", "android.activity_recognition.running", "android.activity_recognition.still", "android.activity_recognition.tilting", "android.activity_recognition.fast_walking", "android.activity_recognition.high_speed_rail", "android.activity_recognition.unknown", "android.activity_recognition.on_foot", "android.activity_recognition.outdoor", "android.activity_recognition.elevator", "android.activity_recognition.relative_still", "android.activity_recognition.walking_handhold", "android.activity_recognition.lying_posture"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f5131a = {"android.activity_recognition.env_home", "android.activity_recognition.env_office", "android.activity_recognition.env_way_home", "android.activity_recognition.env_way_office"};
    private Handler j = new Handler() { // from class: com.huawei.android.location.activityrecognition.HwActivityRecognition.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                HwActivityRecognition.this.n();
            } else {
                if (i != 1) {
                    return;
                }
                HwActivityRecognition.this.j();
            }
        }
    };
    private ServiceConnection i = new ServiceConnection() { // from class: com.huawei.android.location.activityrecognition.HwActivityRecognition.5
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            bde.d("ARMoudle.HwActivityRecognition", "Connection service ok");
            HwActivityRecognition.this.j.removeMessages(1);
            if (HwActivityRecognition.d >= 25) {
                HwActivityRecognition.this.n = com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService.Stub.asInterface(iBinder);
                HwActivityRecognition.this.k();
            } else {
                HwActivityRecognition.this.h = IActivityRecognitionHardwareService.Stub.asInterface(iBinder);
            }
            HwActivityRecognition.this.m();
            HwActivityRecognition.this.l();
            if (HwActivityRecognition.d >= 25) {
                HwActivityRecognition.this.m.onServiceConnected();
            } else {
                HwActivityRecognition.this.j.sendEmptyMessage(0);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (HwActivityRecognition.d < 25) {
                HwActivityRecognition.this.h = null;
            } else {
                HwActivityRecognition.this.n = null;
            }
            HwActivityRecognition.this.m.onServiceDisconnected();
        }
    };

    public HwActivityRecognition(Context context) {
        b bVar = null;
        this.f = null;
        bde.d("ARMoudle.HwActivityRecognition", "AR sdk version:12");
        bde.d("ARMoudle.HwActivityRecognition", "HwActivityRecognition, android version:" + d);
        bde.d("ARMoudle.HwActivityRecognition", "AR sdk modify version:1.3.1");
        if (context != null) {
            this.f = context;
            this.l = context.getPackageName();
            this.f5133c = new b(this, bVar);
        }
    }

    public static int e() {
        return e;
    }

    public static void b(int i) {
        e = i;
    }

    private boolean o() {
        try {
            int iIntValue = ((Integer) Class.forName("android.os.UserHandle").getMethod("myUserId", new Class[0]).invoke(null, new Object[0])).intValue();
            bde.d("ARMoudle.HwActivityRecognition", "user id:" + iIntValue);
            return iIntValue == 0;
        } catch (ClassNotFoundException unused) {
            bde.c("ARMoudle.HwActivityRecognition", "ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            bde.c("ARMoudle.HwActivityRecognition", "IllegalAccessException");
        } catch (IllegalArgumentException unused3) {
            bde.c("ARMoudle.HwActivityRecognition", "IllegalArgumentException");
        } catch (NoSuchMethodException unused4) {
            bde.c("ARMoudle.HwActivityRecognition", "NoSuchMethodException");
        } catch (InvocationTargetException unused5) {
            bde.c("ARMoudle.HwActivityRecognition", "InvocationTargetException");
        }
    }

    public boolean e(HwActivityRecognitionHardwareSink hwActivityRecognitionHardwareSink, HwActivityRecognitionServiceConnection hwActivityRecognitionServiceConnection) {
        bde.d("ARMoudle.HwActivityRecognition", "connectService");
        if (!o()) {
            bde.c("ARMoudle.HwActivityRecognition", "not system user.");
            return false;
        }
        if (hwActivityRecognitionServiceConnection == null || hwActivityRecognitionHardwareSink == null) {
            bde.c("ARMoudle.HwActivityRecognition", "connection or sink is null.");
            return false;
        }
        this.m = hwActivityRecognitionServiceConnection;
        if (d >= 25) {
            if (this.n != null) {
                return true;
            }
            this.o = d(hwActivityRecognitionHardwareSink);
            j();
            return true;
        }
        if (this.h != null) {
            return true;
        }
        this.k = e(hwActivityRecognitionHardwareSink);
        j();
        return true;
    }

    public boolean a() {
        bde.d("ARMoudle.HwActivityRecognition", "disconnectService");
        if (d >= 25) {
            com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
            if (iActivityRecognitionHardwareService == null) {
                bde.c("ARMoudle.HwActivityRecognition", "mService_O is null.");
                return false;
            }
            try {
                iActivityRecognitionHardwareService.asBinder().unlinkToDeath(this.f5133c, 0);
            } catch (Exception unused) {
                bde.c("ARMoudle.HwActivityRecognition", "mService unlink fail.");
            }
        } else {
            IActivityRecognitionHardwareService iActivityRecognitionHardwareService2 = this.h;
            if (iActivityRecognitionHardwareService2 == null) {
                bde.c("ARMoudle.HwActivityRecognition", "mService is null.");
                return false;
            }
            iActivityRecognitionHardwareService2.asBinder().unlinkToDeath(this.f5133c, 0);
        }
        p();
        this.f.unbindService(this.i);
        this.m.onServiceDisconnected();
        if (d >= 25) {
            this.n = null;
        } else {
            this.h = null;
        }
        this.g = 0;
        this.j.removeMessages(1);
        this.j.removeMessages(0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        if (d >= 25) {
            return r();
        }
        return t();
    }

    private boolean t() {
        IActivityRecognitionHardwareSink iActivityRecognitionHardwareSink;
        bde.d("ARMoudle.HwActivityRecognition", "registerSink_N");
        IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.h;
        if (iActivityRecognitionHardwareService == null || (iActivityRecognitionHardwareSink = this.k) == null) {
            bde.c("ARMoudle.HwActivityRecognition", "mService or mSink is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.registerSink(iActivityRecognitionHardwareSink);
        } catch (RemoteException e2) {
            bde.c("ARMoudle.HwActivityRecognition", "registerSink error:" + e2.getMessage());
            return false;
        }
    }

    private boolean r() {
        com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink iActivityRecognitionHardwareSink;
        bde.d("ARMoudle.HwActivityRecognition", "registerSink_O");
        com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
        if (iActivityRecognitionHardwareService == null || (iActivityRecognitionHardwareSink = this.o) == null) {
            bde.c("ARMoudle.HwActivityRecognition", "mService_O or mSink_O is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.registerSink(this.l, iActivityRecognitionHardwareSink);
        } catch (RemoteException e2) {
            bde.c("ARMoudle.HwActivityRecognition", "registerSink error:" + e2.getMessage());
            return false;
        }
    }

    private boolean p() {
        if (d >= 25) {
            return s();
        }
        return q();
    }

    private boolean q() {
        IActivityRecognitionHardwareSink iActivityRecognitionHardwareSink;
        bde.d("ARMoudle.HwActivityRecognition", "unregisterSink_N");
        IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.h;
        if (iActivityRecognitionHardwareService == null || (iActivityRecognitionHardwareSink = this.k) == null) {
            bde.c("ARMoudle.HwActivityRecognition", "mService or mSink is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.unregisterSink(iActivityRecognitionHardwareSink);
        } catch (RemoteException e2) {
            bde.c("ARMoudle.HwActivityRecognition", "unregisterSink error:" + e2.getMessage());
            return false;
        }
    }

    private boolean s() {
        com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink iActivityRecognitionHardwareSink;
        bde.d("ARMoudle.HwActivityRecognition", "unregisterSink_O");
        com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
        if (iActivityRecognitionHardwareService == null || (iActivityRecognitionHardwareSink = this.o) == null) {
            bde.c("ARMoudle.HwActivityRecognition", "mService_O or mService_O is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.unregisterSink(this.l, iActivityRecognitionHardwareSink);
        } catch (RemoteException e2) {
            bde.c("ARMoudle.HwActivityRecognition", "unregisterSink error:" + e2.getMessage());
            return false;
        }
    }

    public int g() {
        bde.d("ARMoudle.HwActivityRecognition", "getSupportedModule");
        com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
        if (iActivityRecognitionHardwareService == null) {
            bde.c("ARMoudle.HwActivityRecognition", "mService_O is null.");
            return 0;
        }
        try {
            return iActivityRecognitionHardwareService.getSupportedModule();
        } catch (RemoteException e2) {
            bde.c("ARMoudle.HwActivityRecognition", "getSupportedModule error:" + e2.getMessage());
            return 0;
        }
    }

    public boolean b(String str, int i, long j) {
        if (d >= 25) {
            return e(str, i, j);
        }
        return d(str, i, j);
    }

    private boolean d(String str, int i, long j) {
        bde.d("ARMoudle.HwActivityRecognition", "enableActivityEvent");
        if (TextUtils.isEmpty(str) || j < 0) {
            bde.c("ARMoudle.HwActivityRecognition", "activity is null or reportLatencyNs < 0");
            return false;
        }
        bde.d("ARMoudle.HwActivityRecognition", String.valueOf(c(str)) + "," + i + "," + j);
        IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.h;
        if (iActivityRecognitionHardwareService == null) {
            bde.c("ARMoudle.HwActivityRecognition", "mService is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.enableActivityEvent(str, i, j);
        } catch (RemoteException e2) {
            bde.c("ARMoudle.HwActivityRecognition", "enableActivityEvent error:" + e2.getMessage());
            return false;
        }
    }

    private boolean e(String str, int i, long j) {
        bde.d("ARMoudle.HwActivityRecognition", "enableActivityEvent");
        if (TextUtils.isEmpty(str) || j < 0) {
            bde.c("ARMoudle.HwActivityRecognition", "activity is null or reportLatencyNs < 0");
            return false;
        }
        bde.d("ARMoudle.HwActivityRecognition", String.valueOf(c(str)) + "," + i + "," + j);
        com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
        if (iActivityRecognitionHardwareService == null) {
            bde.c("ARMoudle.HwActivityRecognition", "mService is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.enableActivityEvent(this.l, str, i, j);
        } catch (RemoteException e2) {
            bde.c("ARMoudle.HwActivityRecognition", "enableActivityEvent error:" + e2.getMessage());
            return false;
        }
    }

    private int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int i = 0;
        while (true) {
            String[] strArr = this.f5132b;
            if (i >= strArr.length) {
                i = -1;
                break;
            }
            if (str.equals(strArr[i])) {
                break;
            }
            i++;
        }
        if (i == -1) {
            bde.c("ARMoudle.HwActivityRecognition", "activity type invalid!");
        }
        return i;
    }

    private int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int i = 0;
        while (true) {
            String[] strArr = this.f5131a;
            if (i >= strArr.length) {
                i = -1;
                break;
            }
            if (str.equals(strArr[i])) {
                break;
            }
            i++;
        }
        if (i == -1) {
            bde.c("ARMoudle.HwActivityRecognition", "environment type invalid!");
        }
        return i;
    }

    public boolean e(String str, int i) {
        if (d >= 25) {
            return b(str, i);
        }
        return a(str, i);
    }

    private boolean a(String str, int i) {
        bde.d("ARMoudle.HwActivityRecognition", "disableActivityEvent");
        if (TextUtils.isEmpty(str)) {
            bde.c("ARMoudle.HwActivityRecognition", "activity is null.");
            return false;
        }
        bde.d("ARMoudle.HwActivityRecognition", String.valueOf(c(str)) + "," + i);
        IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.h;
        if (iActivityRecognitionHardwareService == null) {
            bde.c("ARMoudle.HwActivityRecognition", "mService is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.disableActivityEvent(str, i);
        } catch (RemoteException e2) {
            bde.c("ARMoudle.HwActivityRecognition", "disableActivityEvent error:" + e2.getMessage());
            return false;
        }
    }

    private boolean b(String str, int i) {
        bde.d("ARMoudle.HwActivityRecognition", "disableActivityEvent");
        if (TextUtils.isEmpty(str)) {
            bde.c("ARMoudle.HwActivityRecognition", "activity is null.");
            return false;
        }
        bde.d("ARMoudle.HwActivityRecognition", String.valueOf(c(str)) + "," + i);
        com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
        if (iActivityRecognitionHardwareService == null) {
            bde.c("ARMoudle.HwActivityRecognition", "mService_O is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.disableActivityEvent(this.l, str, i);
        } catch (RemoteException e2) {
            bde.c("ARMoudle.HwActivityRecognition", "disableActivityEvent error:" + e2.getMessage());
            return false;
        }
    }

    public String c() {
        bde.d("ARMoudle.HwActivityRecognition", "getCurrentActivity");
        IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.h;
        if (iActivityRecognitionHardwareService == null) {
            bde.c("ARMoudle.HwActivityRecognition", "mService is null.");
            return "unknown";
        }
        try {
            return iActivityRecognitionHardwareService.getCurrentActivity();
        } catch (RemoteException e2) {
            bde.c("ARMoudle.HwActivityRecognition", "getCurrentActivity error:" + e2.getMessage());
            return "unknown";
        }
    }

    public HwActivityChangedExtendEvent i() {
        bde.d("ARMoudle.HwActivityRecognition", "getCurrentActivityExtend");
        com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
        com.huawei.systemserver.activityrecognition.HwActivityChangedExtendEvent currentActivity = null;
        if (iActivityRecognitionHardwareService == null) {
            bde.c("ARMoudle.HwActivityRecognition", "mService is null.");
            return null;
        }
        try {
            if (e == 1) {
                currentActivity = iActivityRecognitionHardwareService.getCurrentActivityV1_1();
            } else {
                currentActivity = iActivityRecognitionHardwareService.getCurrentActivity();
            }
        } catch (RemoteException e2) {
            bde.c("ARMoudle.HwActivityRecognition", "getCurrentActivity error:" + e2.getMessage());
        }
        return b(currentActivity);
    }

    public boolean b() {
        if (d >= 25) {
            return h();
        }
        return f();
    }

    private boolean f() {
        bde.d("ARMoudle.HwActivityRecognition", "flush");
        IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.h;
        if (iActivityRecognitionHardwareService == null) {
            bde.c("ARMoudle.HwActivityRecognition", "mService is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.flush();
        } catch (RemoteException e2) {
            bde.c("ARMoudle.HwActivityRecognition", "flush error:" + e2.getMessage());
            return false;
        }
    }

    private boolean h() {
        bde.d("ARMoudle.HwActivityRecognition", "flush");
        com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
        if (iActivityRecognitionHardwareService == null) {
            bde.c("ARMoudle.HwActivityRecognition", "mService is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.flush();
        } catch (RemoteException e2) {
            bde.c("ARMoudle.HwActivityRecognition", "flush error:" + e2.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        bde.d("ARMoudle.HwActivityRecognition", "getARVersion");
        com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
        if (iActivityRecognitionHardwareService == null) {
            bde.c("ARMoudle.HwActivityRecognition", "mService is null.");
            return;
        }
        int aRVersion = -1;
        try {
            aRVersion = iActivityRecognitionHardwareService.getARVersion(this.l, 12);
            bde.d("ARMoudle.HwActivityRecognition", "version:" + aRVersion);
        } catch (RemoteException e2) {
            bde.c("ARMoudle.HwActivityRecognition", "getARVersion error:" + e2.getMessage());
        }
        b(aRVersion);
    }

    private IActivityRecognitionHardwareSink e(final HwActivityRecognitionHardwareSink hwActivityRecognitionHardwareSink) {
        if (hwActivityRecognitionHardwareSink == null) {
            return null;
        }
        return new IActivityRecognitionHardwareSink.Stub() { // from class: com.huawei.android.location.activityrecognition.HwActivityRecognition.3
            @Override // com.huawei.android.location.activityrecognition.IActivityRecognitionHardwareSink
            public void onActivityChanged(HwActivityChangedEvent hwActivityChangedEvent) throws RemoteException {
                bde.d("ARMoudle.HwActivityRecognition", "onActivityChanged_N...");
                hwActivityRecognitionHardwareSink.onActivityChanged(hwActivityChangedEvent);
            }
        };
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f5138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f5139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private OtherParameters f5140c;
        private long d;
        private String e;

        public int d() {
            return this.f5138a;
        }

        public String e() {
            return this.e;
        }

        public int a() {
            return this.f5139b;
        }

        public long b() {
            return this.d;
        }

        public OtherParameters c() {
            return this.f5140c;
        }

        public c(String str, int i, long j, OtherParameters otherParameters, int i2) {
            this.e = str;
            this.f5139b = i;
            this.d = j;
            this.f5140c = otherParameters;
            this.f5138a = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HwActivityChangedEvent d(com.huawei.systemserver.activityrecognition.HwActivityChangedEvent hwActivityChangedEvent) {
        if (hwActivityChangedEvent == null) {
            bde.c("ARMoudle.HwActivityRecognition", "tranferToHwActivityChangedEvent event is null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.huawei.systemserver.activityrecognition.HwActivityRecognitionEvent hwActivityRecognitionEvent : hwActivityChangedEvent.getActivityRecognitionEvents()) {
            arrayList.add(new c(hwActivityRecognitionEvent.getActivity(), hwActivityRecognitionEvent.getEventType(), hwActivityRecognitionEvent.getTimestampNs(), null, hwActivityRecognitionEvent.getConfidence()));
            bde.d("ARMoudle.HwActivityRecognition", "onActivityChanged_O: " + c(hwActivityRecognitionEvent.getActivity()) + "  , " + hwActivityRecognitionEvent.getEventType() + "  , " + hwActivityRecognitionEvent.getTimestampNs() + "  ," + hwActivityRecognitionEvent.getConfidence());
        }
        HwActivityRecognitionEvent[] hwActivityRecognitionEventArr = new HwActivityRecognitionEvent[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            c cVar = (c) arrayList.get(i);
            hwActivityRecognitionEventArr[i] = new HwActivityRecognitionEvent(cVar.e(), cVar.a(), cVar.b(), cVar.d());
        }
        return new HwActivityChangedEvent(hwActivityRecognitionEventArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HwActivityChangedExtendEvent b(com.huawei.systemserver.activityrecognition.HwActivityChangedExtendEvent hwActivityChangedExtendEvent) {
        if (hwActivityChangedExtendEvent == null) {
            bde.c("ARMoudle.HwActivityRecognition", "hwActivityEvent is null.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.huawei.systemserver.activityrecognition.HwActivityRecognitionExtendEvent hwActivityRecognitionExtendEvent : hwActivityChangedExtendEvent.getActivityRecognitionExtendEvents()) {
            arrayList.add(new c(hwActivityRecognitionExtendEvent.getActivity(), hwActivityRecognitionExtendEvent.getEventType(), hwActivityRecognitionExtendEvent.getTimestampNs(), d(hwActivityRecognitionExtendEvent.getOtherParams()), hwActivityRecognitionExtendEvent.getConfidence()));
            bde.d("ARMoudle.HwActivityRecognition", "hwActivityEvent: " + c(hwActivityRecognitionExtendEvent.getActivity()) + "," + hwActivityRecognitionExtendEvent.getEventType() + "," + hwActivityRecognitionExtendEvent.getTimestampNs() + "," + hwActivityRecognitionExtendEvent.getConfidence());
        }
        HwActivityRecognitionExtendEvent[] hwActivityRecognitionExtendEventArr = new HwActivityRecognitionExtendEvent[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            c cVar = (c) arrayList.get(i);
            hwActivityRecognitionExtendEventArr[i] = new HwActivityRecognitionExtendEvent(cVar.e(), cVar.a(), cVar.b(), cVar.c(), cVar.d());
        }
        return new HwActivityChangedExtendEvent(hwActivityRecognitionExtendEventArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HwEnvironmentChangedEvent c(com.huawei.systemserver.activityrecognition.HwEnvironmentChangedEvent hwEnvironmentChangedEvent) {
        if (hwEnvironmentChangedEvent == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.huawei.systemserver.activityrecognition.HwActivityRecognitionExtendEvent hwActivityRecognitionExtendEvent : hwEnvironmentChangedEvent.getEnvironmentRecognitionEvents()) {
            arrayList.add(new c(hwActivityRecognitionExtendEvent.getActivity(), hwActivityRecognitionExtendEvent.getEventType(), hwActivityRecognitionExtendEvent.getTimestampNs(), d(hwActivityRecognitionExtendEvent.getOtherParams()), hwActivityRecognitionExtendEvent.getConfidence()));
            bde.d("ARMoudle.HwActivityRecognition", "hwEnvironmentEvent: " + a(hwActivityRecognitionExtendEvent.getActivity()) + "," + hwActivityRecognitionExtendEvent.getEventType() + "," + hwActivityRecognitionExtendEvent.getTimestampNs() + "," + hwActivityRecognitionExtendEvent.getConfidence());
        }
        HwActivityRecognitionExtendEvent[] hwActivityRecognitionExtendEventArr = new HwActivityRecognitionExtendEvent[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            c cVar = (c) arrayList.get(i);
            hwActivityRecognitionExtendEventArr[i] = new HwActivityRecognitionExtendEvent(cVar.e(), cVar.a(), cVar.b(), cVar.c(), cVar.d());
        }
        return new HwEnvironmentChangedEvent(hwActivityRecognitionExtendEventArr);
    }

    private OtherParameters d(com.huawei.systemserver.activityrecognition.OtherParameters otherParameters) {
        if (otherParameters == null) {
            return null;
        }
        return new OtherParameters(otherParameters.getmParam1(), otherParameters.getmParam2(), otherParameters.getmParam3(), otherParameters.getmParam4(), otherParameters.getmParam5());
    }

    private com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink d(final HwActivityRecognitionHardwareSink hwActivityRecognitionHardwareSink) {
        if (hwActivityRecognitionHardwareSink == null) {
            bde.c("ARMoudle.HwActivityRecognition", "createActivityRecognitionHardwareSink_O... sink is null");
            return null;
        }
        return new com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink.Stub() { // from class: com.huawei.android.location.activityrecognition.HwActivityRecognition.2
            @Override // com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink
            public void onActivityChanged(com.huawei.systemserver.activityrecognition.HwActivityChangedEvent hwActivityChangedEvent) throws RemoteException {
                bde.d("ARMoudle.HwActivityRecognition", "onActivityChanged_O...");
                bde.d("ARMoudle.HwActivityRecognition", "package name = " + HwActivityRecognition.this.f.getPackageName());
                hwActivityRecognitionHardwareSink.onActivityChanged(HwActivityRecognition.this.d(hwActivityChangedEvent));
            }

            @Override // com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink
            public void onActivityExtendChanged(com.huawei.systemserver.activityrecognition.HwActivityChangedExtendEvent hwActivityChangedExtendEvent) throws RemoteException {
                bde.c("ARMoudle.HwActivityRecognition", "onActivityExtendChanged...");
                hwActivityRecognitionHardwareSink.onActivityExtendChanged(HwActivityRecognition.this.b(hwActivityChangedExtendEvent));
            }

            @Override // com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink
            public void onEnvironmentChanged(com.huawei.systemserver.activityrecognition.HwEnvironmentChangedEvent hwEnvironmentChangedEvent) throws RemoteException {
                bde.d("ARMoudle.HwActivityRecognition", "onEnvironmentChanged...");
                hwActivityRecognitionHardwareSink.onEnvironmentChanged(HwActivityRecognition.this.c(hwEnvironmentChangedEvent));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.h;
            if (iActivityRecognitionHardwareService != null) {
                if (iActivityRecognitionHardwareService.providerLoadOk()) {
                    this.j.removeMessages(0);
                    this.m.onServiceConnected();
                } else {
                    this.j.sendEmptyMessageDelayed(0, 500L);
                }
            }
        } catch (RemoteException unused) {
            bde.c("ARMoudle.HwActivityRecognition", "providerLoadOk fail");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.g > 10) {
            bde.d("ARMoudle.HwActivityRecognition", "try connect 10 times, connection fail");
            return;
        }
        if (d >= 25) {
            if (this.n == null) {
                bde.d("ARMoudle.HwActivityRecognition", String.valueOf(this.f.getPackageName()) + " bind ar service.");
                Intent intent = new Intent();
                intent.setClassName("com.huawei.systemserver", "com.huawei.systemserver.activityrecognition.ActivityRecognitionService");
                bde.d("ARMoudle.HwActivityRecognition", "bindIntent = " + intent);
                this.f.bindService(intent, this.i, 1);
                this.g = this.g + 1;
                this.j.sendEmptyMessageDelayed(1, 2000L);
                return;
            }
            return;
        }
        if (this.h == null) {
            bde.d("ARMoudle.HwActivityRecognition", String.valueOf(this.f.getPackageName()) + " bind ar service.");
            Intent intent2 = new Intent();
            intent2.setClassName("com.huawei.android.location.activityrecognition", "com.huawei.android.location.activityrecognition.ActivityRecognitionService");
            this.f.bindService(intent2, this.i, 1);
            this.g++;
            this.j.sendEmptyMessageDelayed(1, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            if (d >= 25) {
                com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
                if (iActivityRecognitionHardwareService != null) {
                    iActivityRecognitionHardwareService.asBinder().linkToDeath(this.f5133c, 0);
                    return;
                }
                return;
            }
            IActivityRecognitionHardwareService iActivityRecognitionHardwareService2 = this.h;
            if (iActivityRecognitionHardwareService2 != null) {
                iActivityRecognitionHardwareService2.asBinder().linkToDeath(this.f5133c, 0);
            }
        } catch (RemoteException unused) {
            bde.c("ARMoudle.HwActivityRecognition", "IBinder register linkToDeath function fail.");
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    class b implements IBinder.DeathRecipient {
        private b() {
        }

        /* synthetic */ b(HwActivityRecognition hwActivityRecognition, b bVar) {
            this();
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            bde.d("ARMoudle.HwActivityRecognition", "Ar service has died!");
            if (HwActivityRecognition.this.m != null) {
                HwActivityRecognition.this.m.onServiceDisconnected();
            }
            if (HwActivityRecognition.d < 25) {
                if (HwActivityRecognition.this.h != null) {
                    HwActivityRecognition.this.h.asBinder().unlinkToDeath(HwActivityRecognition.this.f5133c, 0);
                    HwActivityRecognition.this.h = null;
                    return;
                }
                return;
            }
            if (HwActivityRecognition.this.n != null) {
                HwActivityRecognition.this.n.asBinder().unlinkToDeath(HwActivityRecognition.this.f5133c, 0);
                HwActivityRecognition.this.n = null;
            }
        }
    }
}
