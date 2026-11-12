package com.hihonor.android.location.activityrecognition;

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
import defpackage.awp;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class HwActivityRecognition {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f4728c;
    private Context f;
    private IActivityRecognitionHardwareSink l;
    private String m;
    private com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareSink o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f4727b = Build.VERSION.SDK_INT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4726a = -1;
    private int i = 0;
    private HwActivityRecognitionServiceConnection k = null;
    private IActivityRecognitionHardwareService j = null;
    private com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService n = null;
    private String[] d = {"android.activity_recognition.in_vehicle", "android.activity_recognition.on_bicycle", "android.activity_recognition.walking", "android.activity_recognition.running", "android.activity_recognition.still", "android.activity_recognition.tilting", "android.activity_recognition.fast_walking", "android.activity_recognition.high_speed_rail", "android.activity_recognition.unknown", "android.activity_recognition.on_foot", "android.activity_recognition.outdoor", "android.activity_recognition.elevator", "android.activity_recognition.relative_still", "android.activity_recognition.walking_handhold", "android.activity_recognition.lying_posture"};
    private String[] e = {"android.activity_recognition.env_home", "android.activity_recognition.env_office", "android.activity_recognition.env_way_home", "android.activity_recognition.env_way_office"};
    private Handler h = new Handler() { // from class: com.hihonor.android.location.activityrecognition.HwActivityRecognition.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                HwActivityRecognition.this.i();
            } else {
                if (i != 1) {
                    return;
                }
                HwActivityRecognition.this.h();
            }
        }
    };
    private ServiceConnection g = new ServiceConnection() { // from class: com.hihonor.android.location.activityrecognition.HwActivityRecognition.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            awp.e("ARMoudle.HwActivityRecognition", "Connection service ok");
            HwActivityRecognition.this.h.removeMessages(1);
            if (HwActivityRecognition.f4727b >= 25) {
                HwActivityRecognition.this.n = com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService.Stub.asInterface(iBinder);
                HwActivityRecognition.this.f();
            } else {
                HwActivityRecognition.this.j = IActivityRecognitionHardwareService.Stub.asInterface(iBinder);
            }
            HwActivityRecognition.this.o();
            HwActivityRecognition.this.l();
            if (HwActivityRecognition.f4727b >= 25) {
                HwActivityRecognition.this.k.onServiceConnected();
            } else {
                HwActivityRecognition.this.h.sendEmptyMessage(0);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (HwActivityRecognition.f4727b < 25) {
                HwActivityRecognition.this.j = null;
            } else {
                HwActivityRecognition.this.n = null;
            }
            HwActivityRecognition.this.k.onServiceDisconnected();
        }
    };

    public HwActivityRecognition(Context context) {
        c cVar = null;
        this.f = null;
        awp.e("ARMoudle.HwActivityRecognition", "AR sdk version:12");
        awp.e("ARMoudle.HwActivityRecognition", "HwActivityRecognition, android version:" + f4727b);
        awp.e("ARMoudle.HwActivityRecognition", "AR sdk modify version:1.3.1");
        if (context != null) {
            this.f = context;
            this.m = context.getPackageName();
            this.f4728c = new c(this, cVar);
        }
    }

    public static int d() {
        return f4726a;
    }

    public static void e(int i) {
        f4726a = i;
    }

    private boolean g() {
        try {
            int iIntValue = ((Integer) Class.forName("android.os.UserHandle").getMethod("myUserId", new Class[0]).invoke(null, new Object[0])).intValue();
            awp.e("ARMoudle.HwActivityRecognition", "user id:" + iIntValue);
            return iIntValue == 0;
        } catch (ClassNotFoundException unused) {
            awp.a("ARMoudle.HwActivityRecognition", "ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            awp.a("ARMoudle.HwActivityRecognition", "IllegalAccessException");
        } catch (IllegalArgumentException unused3) {
            awp.a("ARMoudle.HwActivityRecognition", "IllegalArgumentException");
        } catch (NoSuchMethodException unused4) {
            awp.a("ARMoudle.HwActivityRecognition", "NoSuchMethodException");
        } catch (InvocationTargetException unused5) {
            awp.a("ARMoudle.HwActivityRecognition", "InvocationTargetException");
        }
    }

    public boolean d(HwActivityRecognitionHardwareSink hwActivityRecognitionHardwareSink, HwActivityRecognitionServiceConnection hwActivityRecognitionServiceConnection) {
        awp.e("ARMoudle.HwActivityRecognition", "connectService");
        if (!g()) {
            awp.a("ARMoudle.HwActivityRecognition", "not system user.");
            return false;
        }
        if (hwActivityRecognitionServiceConnection == null || hwActivityRecognitionHardwareSink == null) {
            awp.a("ARMoudle.HwActivityRecognition", "connection or sink is null.");
            return false;
        }
        this.k = hwActivityRecognitionServiceConnection;
        if (f4727b >= 25) {
            if (this.n != null) {
                return true;
            }
            this.o = e(hwActivityRecognitionHardwareSink);
            h();
            return true;
        }
        if (this.j != null) {
            return true;
        }
        this.l = d(hwActivityRecognitionHardwareSink);
        h();
        return true;
    }

    public boolean b() {
        awp.e("ARMoudle.HwActivityRecognition", "disconnectService");
        if (f4727b >= 25) {
            com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
            if (iActivityRecognitionHardwareService == null) {
                awp.a("ARMoudle.HwActivityRecognition", "mService_O is null.");
                return false;
            }
            try {
                iActivityRecognitionHardwareService.asBinder().unlinkToDeath(this.f4728c, 0);
            } catch (Exception unused) {
                awp.a("ARMoudle.HwActivityRecognition", "mService unlink fail.");
            }
        } else {
            IActivityRecognitionHardwareService iActivityRecognitionHardwareService2 = this.j;
            if (iActivityRecognitionHardwareService2 == null) {
                awp.a("ARMoudle.HwActivityRecognition", "mService is null.");
                return false;
            }
            iActivityRecognitionHardwareService2.asBinder().unlinkToDeath(this.f4728c, 0);
        }
        m();
        this.f.unbindService(this.g);
        this.k.onServiceDisconnected();
        if (f4727b >= 25) {
            this.n = null;
        } else {
            this.j = null;
        }
        this.i = 0;
        this.h.removeMessages(1);
        this.h.removeMessages(0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        if (f4727b >= 25) {
            return k();
        }
        return n();
    }

    private boolean n() {
        IActivityRecognitionHardwareSink iActivityRecognitionHardwareSink;
        awp.e("ARMoudle.HwActivityRecognition", "registerSink_N");
        IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.j;
        if (iActivityRecognitionHardwareService == null || (iActivityRecognitionHardwareSink = this.l) == null) {
            awp.a("ARMoudle.HwActivityRecognition", "mService or mSink is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.registerSink(iActivityRecognitionHardwareSink);
        } catch (RemoteException e) {
            awp.a("ARMoudle.HwActivityRecognition", "registerSink error:" + e.getMessage());
            return false;
        }
    }

    private boolean k() {
        com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareSink iActivityRecognitionHardwareSink;
        awp.e("ARMoudle.HwActivityRecognition", "registerSink_O");
        com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
        if (iActivityRecognitionHardwareService == null || (iActivityRecognitionHardwareSink = this.o) == null) {
            awp.a("ARMoudle.HwActivityRecognition", "mService_O or mSink_O is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.registerSink(this.m, iActivityRecognitionHardwareSink);
        } catch (RemoteException e) {
            awp.a("ARMoudle.HwActivityRecognition", "registerSink error:" + e.getMessage());
            return false;
        }
    }

    private boolean m() {
        if (f4727b >= 25) {
            return p();
        }
        return q();
    }

    private boolean q() {
        IActivityRecognitionHardwareSink iActivityRecognitionHardwareSink;
        awp.e("ARMoudle.HwActivityRecognition", "unregisterSink_N");
        IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.j;
        if (iActivityRecognitionHardwareService == null || (iActivityRecognitionHardwareSink = this.l) == null) {
            awp.a("ARMoudle.HwActivityRecognition", "mService or mSink is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.unregisterSink(iActivityRecognitionHardwareSink);
        } catch (RemoteException e) {
            awp.a("ARMoudle.HwActivityRecognition", "unregisterSink error:" + e.getMessage());
            return false;
        }
    }

    private boolean p() {
        com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareSink iActivityRecognitionHardwareSink;
        awp.e("ARMoudle.HwActivityRecognition", "unregisterSink_O");
        com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
        if (iActivityRecognitionHardwareService == null || (iActivityRecognitionHardwareSink = this.o) == null) {
            awp.a("ARMoudle.HwActivityRecognition", "mService_O or mService_O is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.unregisterSink(this.m, iActivityRecognitionHardwareSink);
        } catch (RemoteException e) {
            awp.a("ARMoudle.HwActivityRecognition", "unregisterSink error:" + e.getMessage());
            return false;
        }
    }

    public int j() {
        awp.e("ARMoudle.HwActivityRecognition", "getSupportedModule");
        com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
        if (iActivityRecognitionHardwareService == null) {
            awp.a("ARMoudle.HwActivityRecognition", "mService_O is null.");
            return 0;
        }
        try {
            return iActivityRecognitionHardwareService.getSupportedModule();
        } catch (RemoteException e) {
            awp.a("ARMoudle.HwActivityRecognition", "getSupportedModule error:" + e.getMessage());
            return 0;
        }
    }

    public boolean d(String str, int i, long j) {
        if (f4727b >= 25) {
            return a(str, i, j);
        }
        return b(str, i, j);
    }

    private boolean b(String str, int i, long j) {
        awp.e("ARMoudle.HwActivityRecognition", "enableActivityEvent");
        if (TextUtils.isEmpty(str) || j < 0) {
            awp.a("ARMoudle.HwActivityRecognition", "activity is null or reportLatencyNs < 0");
            return false;
        }
        awp.e("ARMoudle.HwActivityRecognition", String.valueOf(c(str)) + "," + i + "," + j);
        IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.j;
        if (iActivityRecognitionHardwareService == null) {
            awp.a("ARMoudle.HwActivityRecognition", "mService is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.enableActivityEvent(str, i, j);
        } catch (RemoteException e) {
            awp.a("ARMoudle.HwActivityRecognition", "enableActivityEvent error:" + e.getMessage());
            return false;
        }
    }

    private boolean a(String str, int i, long j) {
        awp.e("ARMoudle.HwActivityRecognition", "enableActivityEvent");
        if (TextUtils.isEmpty(str) || j < 0) {
            awp.a("ARMoudle.HwActivityRecognition", "activity is null or reportLatencyNs < 0");
            return false;
        }
        awp.e("ARMoudle.HwActivityRecognition", String.valueOf(c(str)) + "," + i + "," + j);
        com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
        if (iActivityRecognitionHardwareService == null) {
            awp.a("ARMoudle.HwActivityRecognition", "mService is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.enableActivityEvent(this.m, str, i, j);
        } catch (RemoteException e) {
            awp.a("ARMoudle.HwActivityRecognition", "enableActivityEvent error:" + e.getMessage());
            return false;
        }
    }

    private int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int i = 0;
        while (true) {
            String[] strArr = this.d;
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
            awp.a("ARMoudle.HwActivityRecognition", "activity type invalid!");
        }
        return i;
    }

    private int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int i = 0;
        while (true) {
            String[] strArr = this.e;
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
            awp.a("ARMoudle.HwActivityRecognition", "environment type invalid!");
        }
        return i;
    }

    public boolean b(String str, int i) {
        if (f4727b >= 25) {
            return a(str, i);
        }
        return d(str, i);
    }

    private boolean d(String str, int i) {
        awp.e("ARMoudle.HwActivityRecognition", "disableActivityEvent");
        if (TextUtils.isEmpty(str)) {
            awp.a("ARMoudle.HwActivityRecognition", "activity is null.");
            return false;
        }
        awp.e("ARMoudle.HwActivityRecognition", String.valueOf(c(str)) + "," + i);
        IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.j;
        if (iActivityRecognitionHardwareService == null) {
            awp.a("ARMoudle.HwActivityRecognition", "mService is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.disableActivityEvent(str, i);
        } catch (RemoteException e) {
            awp.a("ARMoudle.HwActivityRecognition", "disableActivityEvent error:" + e.getMessage());
            return false;
        }
    }

    private boolean a(String str, int i) {
        awp.e("ARMoudle.HwActivityRecognition", "disableActivityEvent");
        if (TextUtils.isEmpty(str)) {
            awp.a("ARMoudle.HwActivityRecognition", "activity is null.");
            return false;
        }
        awp.e("ARMoudle.HwActivityRecognition", String.valueOf(c(str)) + "," + i);
        com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
        if (iActivityRecognitionHardwareService == null) {
            awp.a("ARMoudle.HwActivityRecognition", "mService_O is null.");
            return false;
        }
        try {
            return iActivityRecognitionHardwareService.disableActivityEvent(this.m, str, i);
        } catch (RemoteException e) {
            awp.a("ARMoudle.HwActivityRecognition", "disableActivityEvent error:" + e.getMessage());
            return false;
        }
    }

    public String e() {
        awp.e("ARMoudle.HwActivityRecognition", "getCurrentActivity");
        IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.j;
        if (iActivityRecognitionHardwareService == null) {
            awp.a("ARMoudle.HwActivityRecognition", "mService is null.");
            return "unknown";
        }
        try {
            return iActivityRecognitionHardwareService.getCurrentActivity();
        } catch (RemoteException e) {
            awp.a("ARMoudle.HwActivityRecognition", "getCurrentActivity error:" + e.getMessage());
            return "unknown";
        }
    }

    public HwActivityChangedExtendEvent c() {
        awp.e("ARMoudle.HwActivityRecognition", "getCurrentActivityExtend");
        com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
        com.hihonor.systemserver.activityrecognition.HwActivityChangedExtendEvent currentActivity = null;
        if (iActivityRecognitionHardwareService == null) {
            awp.a("ARMoudle.HwActivityRecognition", "mService is null.");
            return null;
        }
        try {
            if (f4726a == 1) {
                currentActivity = iActivityRecognitionHardwareService.getCurrentActivityV1_1();
            } else {
                currentActivity = iActivityRecognitionHardwareService.getCurrentActivity();
            }
        } catch (RemoteException e) {
            awp.a("ARMoudle.HwActivityRecognition", "getCurrentActivity error:" + e.getMessage());
        }
        return a(currentActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        awp.e("ARMoudle.HwActivityRecognition", "getARVersion");
        com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
        if (iActivityRecognitionHardwareService == null) {
            awp.a("ARMoudle.HwActivityRecognition", "mService is null.");
            return;
        }
        int aRVersion = -1;
        try {
            aRVersion = iActivityRecognitionHardwareService.getARVersion(this.m, 12);
            awp.e("ARMoudle.HwActivityRecognition", "version:" + aRVersion);
        } catch (RemoteException e) {
            awp.a("ARMoudle.HwActivityRecognition", "getARVersion error:" + e.getMessage());
        }
        e(aRVersion);
    }

    private IActivityRecognitionHardwareSink d(final HwActivityRecognitionHardwareSink hwActivityRecognitionHardwareSink) {
        if (hwActivityRecognitionHardwareSink == null) {
            return null;
        }
        return new IActivityRecognitionHardwareSink.Stub() { // from class: com.hihonor.android.location.activityrecognition.HwActivityRecognition.2
            @Override // com.hihonor.android.location.activityrecognition.IActivityRecognitionHardwareSink
            public void onActivityChanged(HwActivityChangedEvent hwActivityChangedEvent) throws RemoteException {
                awp.e("ARMoudle.HwActivityRecognition", "onActivityChanged_N...");
                hwActivityRecognitionHardwareSink.onActivityChanged(hwActivityChangedEvent);
            }
        };
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f4734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private OtherParameters f4735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4736c;
        private String d;
        private long e;

        public int b() {
            return this.f4734a;
        }

        public String c() {
            return this.d;
        }

        public int a() {
            return this.f4736c;
        }

        public long e() {
            return this.e;
        }

        public OtherParameters d() {
            return this.f4735b;
        }

        public d(String str, int i, long j, OtherParameters otherParameters, int i2) {
            this.d = str;
            this.f4736c = i;
            this.e = j;
            this.f4735b = otherParameters;
            this.f4734a = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HwActivityChangedEvent a(com.hihonor.systemserver.activityrecognition.HwActivityChangedEvent hwActivityChangedEvent) {
        if (hwActivityChangedEvent == null) {
            awp.a("ARMoudle.HwActivityRecognition", "tranferToHwActivityChangedEvent event is null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.hihonor.systemserver.activityrecognition.HwActivityRecognitionEvent hwActivityRecognitionEvent : hwActivityChangedEvent.getActivityRecognitionEvents()) {
            arrayList.add(new d(hwActivityRecognitionEvent.getActivity(), hwActivityRecognitionEvent.getEventType(), hwActivityRecognitionEvent.getTimestampNs(), null, hwActivityRecognitionEvent.getConfidence()));
            awp.e("ARMoudle.HwActivityRecognition", "onActivityChanged_O: " + c(hwActivityRecognitionEvent.getActivity()) + "  , " + hwActivityRecognitionEvent.getEventType() + "  , " + hwActivityRecognitionEvent.getTimestampNs() + "  ," + hwActivityRecognitionEvent.getConfidence());
        }
        HwActivityRecognitionEvent[] hwActivityRecognitionEventArr = new HwActivityRecognitionEvent[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            d dVar = (d) arrayList.get(i);
            hwActivityRecognitionEventArr[i] = new HwActivityRecognitionEvent(dVar.c(), dVar.a(), dVar.e(), dVar.b());
        }
        return new HwActivityChangedEvent(hwActivityRecognitionEventArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HwActivityChangedExtendEvent a(com.hihonor.systemserver.activityrecognition.HwActivityChangedExtendEvent hwActivityChangedExtendEvent) {
        if (hwActivityChangedExtendEvent == null) {
            awp.a("ARMoudle.HwActivityRecognition", "hwActivityEvent is null.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.hihonor.systemserver.activityrecognition.HwActivityRecognitionExtendEvent hwActivityRecognitionExtendEvent : hwActivityChangedExtendEvent.getActivityRecognitionExtendEvents()) {
            arrayList.add(new d(hwActivityRecognitionExtendEvent.getActivity(), hwActivityRecognitionExtendEvent.getEventType(), hwActivityRecognitionExtendEvent.getTimestampNs(), d(hwActivityRecognitionExtendEvent.getOtherParams()), hwActivityRecognitionExtendEvent.getConfidence()));
            awp.e("ARMoudle.HwActivityRecognition", "hwActivityEvent: " + c(hwActivityRecognitionExtendEvent.getActivity()) + "," + hwActivityRecognitionExtendEvent.getEventType() + "," + hwActivityRecognitionExtendEvent.getTimestampNs() + "," + hwActivityRecognitionExtendEvent.getConfidence());
        }
        HwActivityRecognitionExtendEvent[] hwActivityRecognitionExtendEventArr = new HwActivityRecognitionExtendEvent[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            d dVar = (d) arrayList.get(i);
            hwActivityRecognitionExtendEventArr[i] = new HwActivityRecognitionExtendEvent(dVar.c(), dVar.a(), dVar.e(), dVar.d(), dVar.b());
        }
        return new HwActivityChangedExtendEvent(hwActivityRecognitionExtendEventArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HwEnvironmentChangedEvent e(com.hihonor.systemserver.activityrecognition.HwEnvironmentChangedEvent hwEnvironmentChangedEvent) {
        if (hwEnvironmentChangedEvent == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.hihonor.systemserver.activityrecognition.HwActivityRecognitionExtendEvent hwActivityRecognitionExtendEvent : hwEnvironmentChangedEvent.getEnvironmentRecognitionEvents()) {
            arrayList.add(new d(hwActivityRecognitionExtendEvent.getActivity(), hwActivityRecognitionExtendEvent.getEventType(), hwActivityRecognitionExtendEvent.getTimestampNs(), d(hwActivityRecognitionExtendEvent.getOtherParams()), hwActivityRecognitionExtendEvent.getConfidence()));
            awp.e("ARMoudle.HwActivityRecognition", "hwEnvironmentEvent: " + a(hwActivityRecognitionExtendEvent.getActivity()) + "," + hwActivityRecognitionExtendEvent.getEventType() + "," + hwActivityRecognitionExtendEvent.getTimestampNs() + "," + hwActivityRecognitionExtendEvent.getConfidence());
        }
        HwActivityRecognitionExtendEvent[] hwActivityRecognitionExtendEventArr = new HwActivityRecognitionExtendEvent[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            d dVar = (d) arrayList.get(i);
            hwActivityRecognitionExtendEventArr[i] = new HwActivityRecognitionExtendEvent(dVar.c(), dVar.a(), dVar.e(), dVar.d(), dVar.b());
        }
        return new HwEnvironmentChangedEvent(hwActivityRecognitionExtendEventArr);
    }

    private OtherParameters d(com.hihonor.systemserver.activityrecognition.OtherParameters otherParameters) {
        if (otherParameters == null) {
            return null;
        }
        return new OtherParameters(otherParameters.getmParam1(), otherParameters.getmParam2(), otherParameters.getmParam3(), otherParameters.getmParam4(), otherParameters.getmParam5());
    }

    private com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareSink e(final HwActivityRecognitionHardwareSink hwActivityRecognitionHardwareSink) {
        if (hwActivityRecognitionHardwareSink == null) {
            awp.a("ARMoudle.HwActivityRecognition", "createActivityRecognitionHardwareSink_O... sink is null");
            return null;
        }
        return new com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareSink.Stub() { // from class: com.hihonor.android.location.activityrecognition.HwActivityRecognition.3
            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareSink
            public void onActivityChanged(com.hihonor.systemserver.activityrecognition.HwActivityChangedEvent hwActivityChangedEvent) throws RemoteException {
                awp.e("ARMoudle.HwActivityRecognition", "onActivityChanged_O...");
                awp.e("ARMoudle.HwActivityRecognition", "package name = " + HwActivityRecognition.this.f.getPackageName());
                hwActivityRecognitionHardwareSink.onActivityChanged(HwActivityRecognition.this.a(hwActivityChangedEvent));
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareSink
            public void onActivityExtendChanged(com.hihonor.systemserver.activityrecognition.HwActivityChangedExtendEvent hwActivityChangedExtendEvent) throws RemoteException {
                awp.a("ARMoudle.HwActivityRecognition", "onActivityExtendChanged...");
                hwActivityRecognitionHardwareSink.onActivityExtendChanged(HwActivityRecognition.this.a(hwActivityChangedExtendEvent));
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareSink
            public void onEnvironmentChanged(com.hihonor.systemserver.activityrecognition.HwEnvironmentChangedEvent hwEnvironmentChangedEvent) throws RemoteException {
                awp.e("ARMoudle.HwActivityRecognition", "onEnvironmentChanged...");
                hwActivityRecognitionHardwareSink.onEnvironmentChanged(HwActivityRecognition.this.e(hwEnvironmentChangedEvent));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        try {
            IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.j;
            if (iActivityRecognitionHardwareService != null) {
                if (iActivityRecognitionHardwareService.providerLoadOk()) {
                    this.h.removeMessages(0);
                    this.k.onServiceConnected();
                } else {
                    this.h.sendEmptyMessageDelayed(0, 500L);
                }
            }
        } catch (RemoteException unused) {
            awp.a("ARMoudle.HwActivityRecognition", "providerLoadOk fail");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.i > 10) {
            awp.e("ARMoudle.HwActivityRecognition", "try connect 10 times, connection fail");
            return;
        }
        if (f4727b >= 25) {
            if (this.n == null) {
                awp.e("ARMoudle.HwActivityRecognition", String.valueOf(this.f.getPackageName()) + " bind ar service.");
                Intent intent = new Intent();
                intent.setClassName("com.hihonor.systemserver", "com.hihonor.systemserver.activityrecognition.ActivityRecognitionService");
                awp.e("ARMoudle.HwActivityRecognition", "bindIntent = " + intent);
                this.f.bindService(intent, this.g, 1);
                this.i = this.i + 1;
                this.h.sendEmptyMessageDelayed(1, 2000L);
                return;
            }
            return;
        }
        if (this.j == null) {
            awp.e("ARMoudle.HwActivityRecognition", String.valueOf(this.f.getPackageName()) + " bind ar service.");
            Intent intent2 = new Intent();
            intent2.setClassName("com.hihonor.android.location.activityrecognition", "com.hihonor.android.location.activityrecognition.ActivityRecognitionService");
            this.f.bindService(intent2, this.g, 1);
            this.i++;
            this.h.sendEmptyMessageDelayed(1, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            if (f4727b >= 25) {
                com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService iActivityRecognitionHardwareService = this.n;
                if (iActivityRecognitionHardwareService != null) {
                    iActivityRecognitionHardwareService.asBinder().linkToDeath(this.f4728c, 0);
                    return;
                }
                return;
            }
            IActivityRecognitionHardwareService iActivityRecognitionHardwareService2 = this.j;
            if (iActivityRecognitionHardwareService2 != null) {
                iActivityRecognitionHardwareService2.asBinder().linkToDeath(this.f4728c, 0);
            }
        } catch (RemoteException unused) {
            awp.a("ARMoudle.HwActivityRecognition", "IBinder register linkToDeath function fail.");
        }
    }

    class c implements IBinder.DeathRecipient {
        private c() {
        }

        /* synthetic */ c(HwActivityRecognition hwActivityRecognition, c cVar) {
            this();
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            awp.e("ARMoudle.HwActivityRecognition", "Ar service has died!");
            if (HwActivityRecognition.this.k != null) {
                HwActivityRecognition.this.k.onServiceDisconnected();
            }
            if (HwActivityRecognition.f4727b < 25) {
                if (HwActivityRecognition.this.j != null) {
                    HwActivityRecognition.this.j.asBinder().unlinkToDeath(HwActivityRecognition.this.f4728c, 0);
                    HwActivityRecognition.this.j = null;
                    return;
                }
                return;
            }
            if (HwActivityRecognition.this.n != null) {
                HwActivityRecognition.this.n.asBinder().unlinkToDeath(HwActivityRecognition.this.f4728c, 0);
                HwActivityRecognition.this.n = null;
            }
        }
    }
}
