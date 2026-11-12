package defpackage;

import com.huawei.android.location.activityrecognition.HwActivityChangedEvent;
import com.huawei.android.location.activityrecognition.HwActivityChangedExtendEvent;
import com.huawei.android.location.activityrecognition.HwActivityRecognition;
import com.huawei.android.location.activityrecognition.HwActivityRecognitionEvent;
import com.huawei.android.location.activityrecognition.HwActivityRecognitionExtendEvent;
import com.huawei.android.location.activityrecognition.HwActivityRecognitionHardwareSink;
import com.huawei.android.location.activityrecognition.HwActivityRecognitionServiceConnection;
import com.huawei.android.location.activityrecognition.HwEnvironmentChangedEvent;
import com.huawei.healthcloud.plugintrack.manager.inteface.IActivityRecognitionStateListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes10.dex */
public class iwc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IActivityRecognitionStateListener f38116b;
    private boolean d;
    private HwActivityRecognition e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.hihonor.android.location.activityrecognition.HwActivityRecognition f38115a = null;

    private boolean o() {
        return false;
    }

    public iwc(IActivityRecognitionStateListener iActivityRecognitionStateListener) {
        this.f38116b = iActivityRecognitionStateListener;
    }

    public void b() {
        this.d = false;
        if (CommonUtil.bj()) {
            this.f38115a = new com.hihonor.android.location.activityrecognition.HwActivityRecognition(BaseApplication.getContext());
            lsy.a(new Runnable() { // from class: ivz
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.f();
                }
            });
        } else {
            this.e = new HwActivityRecognition(BaseApplication.getContext());
            lsy.a(new Runnable() { // from class: iwa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38114b.a();
                }
            });
        }
        ReleaseLogUtil.d("Track_ActivityRecognitionMotionDetector", "ActivityRecognitionMotionDetector is start");
    }

    public void d() {
        this.d = true;
        if (CommonUtil.bj()) {
            i();
        } else {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            this.e.e(new HwActivityRecognitionHardwareSink() { // from class: iwc.3
                @Override // com.huawei.android.location.activityrecognition.HwActivityRecognitionHardwareSink
                public void onActivityChanged(HwActivityChangedEvent hwActivityChangedEvent) {
                    iwc.this.e(hwActivityChangedEvent);
                }

                @Override // com.huawei.android.location.activityrecognition.HwActivityRecognitionHardwareSink
                public void onActivityExtendChanged(HwActivityChangedExtendEvent hwActivityChangedExtendEvent) {
                    iwc.this.b(hwActivityChangedExtendEvent);
                }

                @Override // com.huawei.android.location.activityrecognition.HwActivityRecognitionHardwareSink
                public void onEnvironmentChanged(HwEnvironmentChangedEvent hwEnvironmentChangedEvent) {
                    iwc.this.b(hwEnvironmentChangedEvent);
                }
            }, new AnonymousClass5());
        } catch (SecurityException e) {
            ReleaseLogUtil.a("Track_ActivityRecognitionMotionDetector", "connectActivityRecognitionModule ", LogAnonymous.b(e));
        } catch (Exception e2) {
            ReleaseLogUtil.d("Track_ActivityRecognitionMotionDetector", "connectActivityRecognitionModule exception ", LogAnonymous.b(e2));
        }
    }

    /* JADX INFO: renamed from: iwc$5, reason: invalid class name */
    class AnonymousClass5 implements HwActivityRecognitionServiceConnection {
        AnonymousClass5() {
        }

        @Override // com.huawei.android.location.activityrecognition.HwActivityRecognitionServiceConnection
        public void onServiceConnected() {
            ReleaseLogUtil.d("Track_ActivityRecognitionMotionDetector", "HwActivityRecognitionServiceConnection onServiceConnected()");
            lsy.a(new Runnable() { // from class: iwg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38125c.e();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e() {
            iwc.this.n();
        }

        @Override // com.huawei.android.location.activityrecognition.HwActivityRecognitionServiceConnection
        public void onServiceDisconnected() {
            ReleaseLogUtil.d("Track_ActivityRecognitionMotionDetector", "HwActivityRecognitionServiceConnection onServiceDisconnected()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        try {
            this.f38115a.d(new com.hihonor.android.location.activityrecognition.HwActivityRecognitionHardwareSink() { // from class: iwc.1
                @Override // com.hihonor.android.location.activityrecognition.HwActivityRecognitionHardwareSink
                public void onActivityChanged(com.hihonor.android.location.activityrecognition.HwActivityChangedEvent hwActivityChangedEvent) {
                    iwc.this.d(hwActivityChangedEvent);
                }

                @Override // com.hihonor.android.location.activityrecognition.HwActivityRecognitionHardwareSink
                public void onActivityExtendChanged(com.hihonor.android.location.activityrecognition.HwActivityChangedExtendEvent hwActivityChangedExtendEvent) {
                    iwc.this.b(hwActivityChangedExtendEvent);
                }

                @Override // com.hihonor.android.location.activityrecognition.HwActivityRecognitionHardwareSink
                public void onEnvironmentChanged(com.hihonor.android.location.activityrecognition.HwEnvironmentChangedEvent hwEnvironmentChangedEvent) {
                    iwc.this.d(hwEnvironmentChangedEvent);
                }
            }, new AnonymousClass2());
        } catch (SecurityException e) {
            ReleaseLogUtil.a("Track_ActivityRecognitionMotionDetector", "connectHnActivityRecognitionModule ", LogAnonymous.b(e));
        } catch (Exception unused) {
            ReleaseLogUtil.a("Track_ActivityRecognitionMotionDetector", "connectHnActivityRecognitionModule exception");
        }
    }

    /* JADX INFO: renamed from: iwc$2, reason: invalid class name */
    class AnonymousClass2 implements com.hihonor.android.location.activityrecognition.HwActivityRecognitionServiceConnection {
        AnonymousClass2() {
        }

        @Override // com.hihonor.android.location.activityrecognition.HwActivityRecognitionServiceConnection
        public void onServiceConnected() {
            ReleaseLogUtil.d("Track_ActivityRecognitionMotionDetector", "connectHnActivityRecognitionModule onServiceConnected()");
            lsy.a(new Runnable() { // from class: iwe
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38124c.d();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            iwc.this.l();
        }

        @Override // com.hihonor.android.location.activityrecognition.HwActivityRecognitionServiceConnection
        public void onServiceDisconnected() {
            ReleaseLogUtil.d("Track_ActivityRecognitionMotionDetector", "connectHnActivityRecognitionModule onServiceDisconnected()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HwActivityChangedEvent hwActivityChangedEvent) {
        if (hwActivityChangedEvent == null) {
            return;
        }
        Iterator<HwActivityRecognitionEvent> it = hwActivityChangedEvent.getActivityRecognitionEvents().iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(com.hihonor.android.location.activityrecognition.HwActivityChangedEvent hwActivityChangedEvent) {
        if (hwActivityChangedEvent == null) {
            return;
        }
        Iterator<com.hihonor.android.location.activityrecognition.HwActivityRecognitionEvent> it = hwActivityChangedEvent.getActivityRecognitionEvents().iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HwActivityChangedExtendEvent hwActivityChangedExtendEvent) {
        if (hwActivityChangedExtendEvent == null) {
            return;
        }
        for (HwActivityRecognitionExtendEvent hwActivityRecognitionExtendEvent : hwActivityChangedExtendEvent.getActivityRecognitionExtendEvents()) {
            if (hwActivityRecognitionExtendEvent != null) {
                LogUtil.a("Track_ActivityRecognitionMotionDetector", hwActivityRecognitionExtendEvent.getActivity(), " ", Integer.valueOf(hwActivityRecognitionExtendEvent.getEventType()));
            }
            LogUtil.a("Track_ActivityRecognitionMotionDetector", "onActivityExtendChanged ", this.e.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.hihonor.android.location.activityrecognition.HwActivityChangedExtendEvent hwActivityChangedExtendEvent) {
        if (hwActivityChangedExtendEvent == null) {
            return;
        }
        for (com.hihonor.android.location.activityrecognition.HwActivityRecognitionExtendEvent hwActivityRecognitionExtendEvent : hwActivityChangedExtendEvent.getActivityRecognitionExtendEvents()) {
            if (hwActivityRecognitionExtendEvent != null) {
                LogUtil.a("Track_ActivityRecognitionMotionDetector", hwActivityRecognitionExtendEvent.getActivity(), " ", Integer.valueOf(hwActivityRecognitionExtendEvent.getEventType()));
            }
            LogUtil.a("Track_ActivityRecognitionMotionDetector", "handleHnActivityExtendChange ", this.f38115a.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HwEnvironmentChangedEvent hwEnvironmentChangedEvent) {
        if (hwEnvironmentChangedEvent == null) {
            return;
        }
        for (HwActivityRecognitionExtendEvent hwActivityRecognitionExtendEvent : hwEnvironmentChangedEvent.getEnvironmentRecognitionEvents()) {
            if (hwActivityRecognitionExtendEvent != null) {
                LogUtil.a("Track_ActivityRecognitionMotionDetector", hwActivityRecognitionExtendEvent.getActivity(), " ", Integer.valueOf(hwActivityRecognitionExtendEvent.getEventType()));
            }
        }
        LogUtil.a("Track_ActivityRecognitionMotionDetector", "onEnvironmentChanged ", this.e.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(com.hihonor.android.location.activityrecognition.HwEnvironmentChangedEvent hwEnvironmentChangedEvent) {
        if (hwEnvironmentChangedEvent == null) {
            return;
        }
        for (com.hihonor.android.location.activityrecognition.HwActivityRecognitionExtendEvent hwActivityRecognitionExtendEvent : hwEnvironmentChangedEvent.getEnvironmentRecognitionEvents()) {
            if (hwActivityRecognitionExtendEvent != null) {
                LogUtil.a("Track_ActivityRecognitionMotionDetector", hwActivityRecognitionExtendEvent.getActivity(), " ", Integer.valueOf(hwActivityRecognitionExtendEvent.getEventType()));
            }
        }
        LogUtil.a("Track_ActivityRecognitionMotionDetector", "handleHnEnvironmentChange ", this.f38115a.e());
    }

    private void a(HwActivityRecognitionEvent hwActivityRecognitionEvent) {
        if (hwActivityRecognitionEvent == null || hwActivityRecognitionEvent.getActivity() == null) {
            LogUtil.e("Track_ActivityRecognitionMotionDetector", "event or event getActivity is null, system error ");
            return;
        }
        if (this.f38116b == null) {
            LogUtil.e("Track_ActivityRecognitionMotionDetector", "mActivityRecognitionListener is null, system error ");
            return;
        }
        LogUtil.a("Track_ActivityRecognitionMotionDetector", hwActivityRecognitionEvent.getActivity(), " ", Integer.valueOf(hwActivityRecognitionEvent.getEventType()));
        if (hwActivityRecognitionEvent.getActivity().equals("android.activity_recognition.still") && hwActivityRecognitionEvent.getEventType() == 1) {
            this.f38116b.onStateChange(0);
            return;
        }
        if (hwActivityRecognitionEvent.getActivity().equals("android.activity_recognition.still") && hwActivityRecognitionEvent.getEventType() == 2) {
            this.f38116b.onStateChange(1);
            return;
        }
        if (hwActivityRecognitionEvent.getActivity().equals("android.activity_recognition.walking") && hwActivityRecognitionEvent.getEventType() == 1) {
            this.f38116b.onStateChange(2);
            return;
        }
        if (hwActivityRecognitionEvent.getActivity().equals("android.activity_recognition.running") && hwActivityRecognitionEvent.getEventType() == 1) {
            this.f38116b.onStateChange(3);
            return;
        }
        if (hwActivityRecognitionEvent.getActivity().equals("android.activity_recognition.on_bicycle") && hwActivityRecognitionEvent.getEventType() == 1) {
            this.f38116b.onStateChange(4);
        } else if (hwActivityRecognitionEvent.getActivity().equals("android.activity_recognition.in_vehicle") && hwActivityRecognitionEvent.getEventType() == 1) {
            this.f38116b.onStateChange(5);
        }
    }

    private void d(com.hihonor.android.location.activityrecognition.HwActivityRecognitionEvent hwActivityRecognitionEvent) {
        if (hwActivityRecognitionEvent == null || hwActivityRecognitionEvent.getActivity() == null) {
            LogUtil.e("Track_ActivityRecognitionMotionDetector", "activityHnChanged event or event getActivity is null, system error ");
            return;
        }
        if (this.f38116b == null) {
            LogUtil.e("Track_ActivityRecognitionMotionDetector", "activityHnChanged mActivityRecognitionListener is null, system error ");
            return;
        }
        LogUtil.a("Track_ActivityRecognitionMotionDetector", "activityHnChanged ", hwActivityRecognitionEvent.getActivity(), " ", Integer.valueOf(hwActivityRecognitionEvent.getEventType()));
        if (hwActivityRecognitionEvent.getActivity().equals("android.activity_recognition.still") && hwActivityRecognitionEvent.getEventType() == 1) {
            this.f38116b.onStateChange(0);
            return;
        }
        if (hwActivityRecognitionEvent.getActivity().equals("android.activity_recognition.still") && hwActivityRecognitionEvent.getEventType() == 2) {
            this.f38116b.onStateChange(1);
            return;
        }
        if (hwActivityRecognitionEvent.getActivity().equals("android.activity_recognition.walking") && hwActivityRecognitionEvent.getEventType() == 1) {
            this.f38116b.onStateChange(2);
            return;
        }
        if (hwActivityRecognitionEvent.getActivity().equals("android.activity_recognition.running") && hwActivityRecognitionEvent.getEventType() == 1) {
            this.f38116b.onStateChange(3);
            return;
        }
        if (hwActivityRecognitionEvent.getActivity().equals("android.activity_recognition.on_bicycle") && hwActivityRecognitionEvent.getEventType() == 1) {
            this.f38116b.onStateChange(4);
        } else if (hwActivityRecognitionEvent.getActivity().equals("android.activity_recognition.in_vehicle") && hwActivityRecognitionEvent.getEventType() == 1) {
            this.f38116b.onStateChange(5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.e == null) {
            ReleaseLogUtil.e("Track_ActivityRecognitionMotionDetector", "mStillActivityRecognition is null");
            return;
        }
        if (this.d) {
            ReleaseLogUtil.e("Track_ActivityRecognitionMotionDetector", "sport is stop, not enableActivityEvent");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.e.b("android.activity_recognition.still", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        this.e.b("android.activity_recognition.still", 2, 2000000000L);
        this.e.b("android.activity_recognition.walking", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        this.e.b("android.activity_recognition.walking", 2, 2000000000L);
        this.e.b("android.activity_recognition.running", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        this.e.b("android.activity_recognition.running", 2, 2000000000L);
        this.e.b("android.activity_recognition.on_bicycle", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        this.e.b("android.activity_recognition.on_bicycle", 2, 2000000000L);
        this.e.b("android.activity_recognition.in_vehicle", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        this.e.b("android.activity_recognition.in_vehicle", 2, 2000000000L);
        ReleaseLogUtil.e("Track_ActivityRecognitionMotionDetector", "serviceConnectedEnable cost:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f38115a == null) {
            ReleaseLogUtil.e("Track_ActivityRecognitionMotionDetector", "mHnStillActivityRecognition is null");
            return;
        }
        if (this.d) {
            ReleaseLogUtil.e("Track_ActivityRecognitionMotionDetector", "sport is stop, not enableActivityEvent");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f38115a.d("android.activity_recognition.still", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        this.f38115a.d("android.activity_recognition.still", 2, 2000000000L);
        this.f38115a.d("android.activity_recognition.walking", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        this.f38115a.d("android.activity_recognition.walking", 2, 2000000000L);
        this.f38115a.d("android.activity_recognition.running", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        this.f38115a.d("android.activity_recognition.running", 2, 2000000000L);
        this.f38115a.d("android.activity_recognition.on_bicycle", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        this.f38115a.d("android.activity_recognition.on_bicycle", 2, 2000000000L);
        this.f38115a.d("android.activity_recognition.in_vehicle", 1, RealConnection.IDLE_CONNECTION_HEALTHY_NS);
        this.f38115a.d("android.activity_recognition.in_vehicle", 2, 2000000000L);
        ReleaseLogUtil.e("Track_ActivityRecognitionMotionDetector", "serviceHnConnectedEnable cost:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private void g() {
        ReleaseLogUtil.d("Track_ActivityRecognitionMotionDetector", "disconnectWithActivityRecognitionModule ");
        try {
            HwActivityRecognition hwActivityRecognition = this.e;
            if (hwActivityRecognition == null) {
                ReleaseLogUtil.e("Track_ActivityRecognitionMotionDetector", "mStillActivityRecognition is null");
                return;
            }
            hwActivityRecognition.e("android.activity_recognition.still", 1);
            this.e.e("android.activity_recognition.still", 2);
            this.e.e("android.activity_recognition.walking", 1);
            this.e.e("android.activity_recognition.running", 1);
            this.e.e("android.activity_recognition.on_bicycle", 1);
            this.e.e("android.activity_recognition.in_vehicle", 1);
            this.e.e("android.activity_recognition.walking", 2);
            this.e.e("android.activity_recognition.running", 2);
            this.e.e("android.activity_recognition.on_bicycle", 2);
            this.e.e("android.activity_recognition.in_vehicle", 2);
            this.e.a();
            ReleaseLogUtil.d("Track_ActivityRecognitionMotionDetector", "disconnectWithActivityRecognitionModule finish");
        } catch (SecurityException e) {
            ReleaseLogUtil.a("Track_ActivityRecognitionMotionDetector", "disconnectWithActivityRecognitionModule ", LogAnonymous.b(e));
        } catch (Exception unused) {
            ReleaseLogUtil.a("Track_ActivityRecognitionMotionDetector", "disconnectWithActivityRecognitionModule exception");
        }
    }

    private void i() {
        ReleaseLogUtil.d("Track_ActivityRecognitionMotionDetector", "disconnectWithHnActivityRecognitionModule ");
        try {
            com.hihonor.android.location.activityrecognition.HwActivityRecognition hwActivityRecognition = this.f38115a;
            if (hwActivityRecognition == null) {
                ReleaseLogUtil.e("Track_ActivityRecognitionMotionDetector", "mHnStillActivityRecognition is null");
                return;
            }
            hwActivityRecognition.b("android.activity_recognition.still", 1);
            this.f38115a.b("android.activity_recognition.still", 2);
            this.f38115a.b("android.activity_recognition.walking", 1);
            this.f38115a.b("android.activity_recognition.running", 1);
            this.f38115a.b("android.activity_recognition.on_bicycle", 1);
            this.f38115a.b("android.activity_recognition.in_vehicle", 1);
            this.f38115a.b("android.activity_recognition.walking", 2);
            this.f38115a.b("android.activity_recognition.running", 2);
            this.f38115a.b("android.activity_recognition.on_bicycle", 2);
            this.f38115a.b("android.activity_recognition.in_vehicle", 2);
            this.f38115a.b();
            ReleaseLogUtil.d("Track_ActivityRecognitionMotionDetector", "disconnectWithHnActivityRecognitionModule finish");
        } catch (SecurityException e) {
            ReleaseLogUtil.a("Track_ActivityRecognitionMotionDetector", "disconnectWithHnActivityRecognitionModule ", LogAnonymous.b(e));
        } catch (Exception unused) {
            ReleaseLogUtil.a("Track_ActivityRecognitionMotionDetector", "disconnectWithHnActivityRecognitionModule exception");
        }
    }

    public String c() {
        if (CommonUtil.bj()) {
            return d("unkwon");
        }
        if (this.e != null) {
            if (o()) {
                return this.e.c();
            }
            HwActivityChangedExtendEvent hwActivityChangedExtendEventI = this.e.i();
            if (hwActivityChangedExtendEventI != null) {
                return d(hwActivityChangedExtendEventI);
            }
        }
        return "unkwon";
    }

    private String d(HwActivityChangedExtendEvent hwActivityChangedExtendEvent) {
        String activity = "";
        long timestampNs = 0;
        for (HwActivityRecognitionExtendEvent hwActivityRecognitionExtendEvent : hwActivityChangedExtendEvent.getActivityRecognitionExtendEvents()) {
            if (hwActivityRecognitionExtendEvent != null) {
                if (timestampNs == 0) {
                    timestampNs = hwActivityRecognitionExtendEvent.getTimestampNs();
                    activity = hwActivityRecognitionExtendEvent.getActivity();
                } else if (timestampNs > hwActivityRecognitionExtendEvent.getTimestampNs()) {
                    timestampNs = hwActivityRecognitionExtendEvent.getTimestampNs();
                    activity = hwActivityRecognitionExtendEvent.getActivity();
                }
            }
        }
        return activity;
    }

    private String d(String str) {
        long timestampNs;
        String activity;
        if (this.f38115a != null) {
            if (o()) {
                return this.f38115a.e();
            }
            com.hihonor.android.location.activityrecognition.HwActivityChangedExtendEvent hwActivityChangedExtendEventC = this.f38115a.c();
            if (hwActivityChangedExtendEventC != null) {
                String str2 = "";
                long j = 0;
                for (com.hihonor.android.location.activityrecognition.HwActivityRecognitionExtendEvent hwActivityRecognitionExtendEvent : hwActivityChangedExtendEventC.getActivityRecognitionExtendEvents()) {
                    if (hwActivityRecognitionExtendEvent != null) {
                        if (j == 0) {
                            timestampNs = hwActivityRecognitionExtendEvent.getTimestampNs();
                            activity = hwActivityRecognitionExtendEvent.getActivity();
                        } else if (j > hwActivityRecognitionExtendEvent.getTimestampNs()) {
                            timestampNs = hwActivityRecognitionExtendEvent.getTimestampNs();
                            activity = hwActivityRecognitionExtendEvent.getActivity();
                        }
                        long j2 = timestampNs;
                        str2 = activity;
                        j = j2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public boolean e() {
        if (CommonUtil.bj()) {
            if (this.f38115a == null) {
                return false;
            }
            if (o()) {
                if ("android.activity_recognition.still".equals(this.f38115a.e())) {
                    LogUtil.a("Track_ActivityRecognitionMotionDetector", "IS_MAGIC_SYSTEM curState is ", "android.activity_recognition.still");
                    return true;
                }
                LogUtil.a("Track_ActivityRecognitionMotionDetector", "IS_MAGIC_SYSTEM curState is ", this.f38115a.e());
            } else {
                return j().booleanValue();
            }
        } else {
            if (this.e == null) {
                return false;
            }
            if (o()) {
                if ("android.activity_recognition.still".equals(this.e.c())) {
                    LogUtil.a("Track_ActivityRecognitionMotionDetector", "IS_EMUI_SYSTEM curState is ", "android.activity_recognition.still");
                    return true;
                }
                LogUtil.a("Track_ActivityRecognitionMotionDetector", "IS_EMUI_SYSTEM curState is ", this.e.c());
            } else {
                return h().booleanValue();
            }
        }
        return false;
    }

    private Boolean h() {
        HwActivityChangedExtendEvent hwActivityChangedExtendEventI = this.e.i();
        if (hwActivityChangedExtendEventI == null) {
            return false;
        }
        for (HwActivityRecognitionExtendEvent hwActivityRecognitionExtendEvent : hwActivityChangedExtendEventI.getActivityRecognitionExtendEvents()) {
            if ("android.activity_recognition.still".equals(hwActivityRecognitionExtendEvent.getActivity())) {
                LogUtil.a("Track_ActivityRecognitionMotionDetector", "IS_EMUI_SYSTEM curState is ", "android.activity_recognition.still");
                return true;
            }
            LogUtil.a("Track_ActivityRecognitionMotionDetector", "IS_EMUI_SYSTEM curState is ", hwActivityRecognitionExtendEvent.getActivity());
        }
        return false;
    }

    private Boolean j() {
        com.hihonor.android.location.activityrecognition.HwActivityChangedExtendEvent hwActivityChangedExtendEventC = this.f38115a.c();
        if (hwActivityChangedExtendEventC == null) {
            return false;
        }
        for (com.hihonor.android.location.activityrecognition.HwActivityRecognitionExtendEvent hwActivityRecognitionExtendEvent : hwActivityChangedExtendEventC.getActivityRecognitionExtendEvents()) {
            if ("android.activity_recognition.still".equals(hwActivityRecognitionExtendEvent.getActivity())) {
                LogUtil.a("Track_ActivityRecognitionMotionDetector", "IS_MAGIC_SYSTEM curState is ", "android.activity_recognition.still");
                return true;
            }
            LogUtil.a("Track_ActivityRecognitionMotionDetector", "IS_MAGIC_SYSTEM curState is ", hwActivityRecognitionExtendEvent.getActivity());
        }
        return false;
    }
}
