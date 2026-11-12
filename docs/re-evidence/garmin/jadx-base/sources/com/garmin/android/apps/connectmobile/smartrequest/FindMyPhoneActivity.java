package com.garmin.android.apps.connectmobile.smartrequest;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import c22.u1;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.smartrequest.FindMyPhoneActivity;
import com.garmin.device.datatypes.DeviceProfile;
import com.google.android.exoplayer2.audio.AacUtil;
import hk0.p;
import i.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import rd2.j;
import sz0.e;
import sz0.f;
import z6.q;

/* JADX INFO: loaded from: classes10.dex */
public class FindMyPhoneActivity extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f44350g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NotificationManager f44351a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f44353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Intent f44354d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f44356f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Timer f44352b = new Timer();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet<Long> f44355e = new HashSet<>();

    public class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f44357a;

        public a(FindMyPhoneActivity findMyPhoneActivity, Runnable runnable) {
            this.f44357a = runnable;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            new Thread(this.f44357a).start();
        }
    }

    public class b extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f44358a;

        public b(FindMyPhoneActivity findMyPhoneActivity, Runnable runnable) {
            this.f44358a = runnable;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            new Thread(this.f44358a).start();
        }
    }

    public final void O9(DeviceProfile deviceProfile) {
        e eVar = e.f161381v;
        q qVar = new q(this, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = q.e(getString(R.string.fmp_notification_title));
        qVar.f202684f = q.e(getResources().getString(R.string.find_my_phone_notification_title, deviceProfile.getDeviceFullName()));
        Intent intent = new Intent(this, (Class<?>) FindMyPhoneActivity.class);
        intent.setAction("com.garmin.android.gdi.ACTION_ON_CANCEL_FIND_MY_PHONE_MESSAGE_RECEIVED");
        intent.addFlags(268435456);
        qVar.f202686h = PendingIntent.getActivity(this, 0, intent, 201326592);
        this.f44351a = (NotificationManager) getSystemService("notification");
        Notification notificationC = qVar.c();
        notificationC.flags = 16;
        f.f161394a.getClass();
        f.a.c(this, eVar);
        this.f44351a.notify(0, notificationC);
    }

    public final void P9(boolean z14) {
        ia2.a aVar;
        Timer timer = this.f44352b;
        if (timer != null) {
            timer.cancel();
            this.f44352b.purge();
            this.f44352b = null;
        }
        vn1.f.a();
        Vibrator vibrator = (Vibrator) GarminConnectMobileApp.f28688j.getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.cancel();
        }
        vn1.f.c();
        if (z14) {
            Iterator<Long> it = this.f44355e.iterator();
            while (it.hasNext()) {
                String strA = u1.a(it.next().longValue());
                if (strA != null && (aVar = (ia2.a) p.f().getCapability(strA, ia2.a.class)) != null) {
                    ge1.b.T(aVar.f70164c, null, null, new ia2.b(aVar, null), 3);
                }
            }
        }
        finish();
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i14;
        super.onCreate(bundle);
        final int i15 = 1;
        requestWindowFeature(1);
        setContentView(R.layout.gcm_smartrequest_fragment_find_my_phone);
        j22.b bVar = j22.b.f96736a;
        j22.a aVar = j22.a.f96716e;
        bVar.getClass();
        if (!j22.b.k(aVar)) {
            j22.b.x(this, 110, aVar);
        }
        TextView textView = (TextView) findViewById(R.id.fmp_text_view);
        this.f44356f = textView;
        final int i16 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: vn1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FindMyPhoneActivity f178841b;

            {
                this.f178841b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i16;
                FindMyPhoneActivity findMyPhoneActivity = this.f178841b;
                switch (i17) {
                    case 0:
                        int i18 = FindMyPhoneActivity.f44350g;
                        findMyPhoneActivity.P9(true);
                        break;
                    default:
                        int i19 = FindMyPhoneActivity.f44350g;
                        findMyPhoneActivity.P9(true);
                        break;
                }
            }
        });
        findViewById(R.id.fmp_btn_ok).setOnClickListener(new View.OnClickListener(this) { // from class: vn1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FindMyPhoneActivity f178841b;

            {
                this.f178841b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i15;
                FindMyPhoneActivity findMyPhoneActivity = this.f178841b;
                switch (i17) {
                    case 0:
                        int i18 = FindMyPhoneActivity.f44350g;
                        findMyPhoneActivity.P9(true);
                        break;
                    default:
                        int i19 = FindMyPhoneActivity.f44350g;
                        findMyPhoneActivity.P9(true);
                        break;
                }
            }
        });
        Intent intent = getIntent();
        this.f44354d = intent;
        long longExtra = intent.getLongExtra("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L);
        this.f44353c = longExtra;
        this.f44355e.add(Long.valueOf(longExtra));
        if (this.f44354d.getAction() == null) {
            i2.d("FindMyPhoneActivity", "Action in Find My Phone's OnCreate's intent is null.");
        } else if (this.f44354d.getAction().equals("com.garmin.android.gdi.ACTION_ON_FIND_MY_PHONE_MESSAGE_RECEIVED")) {
            if (j22.b.k(aVar)) {
                vn1.f.d();
            }
            Vibrator vibrator = (Vibrator) GarminConnectMobileApp.f28688j.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(new long[]{0, 1000, 600}, 0);
            }
            vn1.f.b(R.raw.fmp_loopable, true);
            int intExtra = getIntent().getIntExtra("com.garmin.android.gdi.EXTRA_FIND_MY_PHONE_AUDIBLE_DURATION", 0);
            int i17 = AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
            if (intExtra > 0 && (i14 = intExtra * 1000) <= 256000) {
                i17 = i14;
            }
            Timer timer = new Timer();
            this.f44352b = timer;
            timer.schedule(new a(this, new vn1.a(this, 1)), i17);
            DeviceProfile deviceProfileB = p.b(this.f44353c);
            if (deviceProfileB != null) {
                O9(deviceProfileB);
            }
        } else if (this.f44354d.getAction().equals("com.garmin.android.gdi.ACTION_ON_CANCEL_FIND_MY_PHONE_MESSAGE_RECEIVED")) {
            P9(false);
        }
        setFinishOnTouchOutside(false);
        long j8 = this.f44353c;
        if (j8 != -1) {
            if (!p.k(j8)) {
                finish();
                return;
            }
            j jVar = rd2.f.a().f152045a;
            long j14 = this.f44353c;
            jVar.getClass();
            sd2.f fVarI = j.i(j14, null);
            if (fVarI != null) {
                this.f44356f.setText(String.format(getResources().getString(R.string.find_my_phone_message), TextUtils.isEmpty(fVarI.getDisplayName()) ? fVarI.getProductDisplayName() : fVarI.getDisplayName()));
            } else {
                finish();
            }
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        if (this.f44352b != null) {
            P9(true);
        }
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        this.f44351a = notificationManager;
        notificationManager.cancel(0);
        super.onDestroy();
    }

    @Override // b.g, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(getIntent());
        this.f44354d = intent;
        String action = intent.getAction();
        if (action == null) {
            i2.d("FindMyPhoneActivity", "Action in FindMyPhone's OnNewIntent's action is null");
            return;
        }
        if (!action.equals("com.garmin.android.gdi.ACTION_ON_FIND_MY_PHONE_MESSAGE_RECEIVED")) {
            if (action.equals("com.garmin.android.gdi.ACTION_ON_CANCEL_FIND_MY_PHONE_MESSAGE_RECEIVED")) {
                vn1.f.a();
                Vibrator vibrator = (Vibrator) GarminConnectMobileApp.f28688j.getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.cancel();
                }
                vn1.f.c();
                P9(false);
                return;
            }
            return;
        }
        long j8 = this.f44353c;
        if (j8 != -1) {
            if (!p.k(j8)) {
                finish();
                return;
            }
            DeviceProfile deviceProfileB = p.b(this.f44353c);
            if (deviceProfileB == null) {
                finish();
            }
            int intExtra = this.f44354d.getIntExtra("com.garmin.android.gdi.EXTRA_FIND_MY_PHONE_AUDIBLE_DURATION", 0);
            int i14 = intExtra > 0 ? intExtra * 1000 : AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
            Timer timer = this.f44352b;
            if (timer != null) {
                timer.cancel();
                this.f44352b.purge();
                this.f44352b = null;
            }
            Timer timer2 = new Timer();
            this.f44352b = timer2;
            timer2.schedule(new b(this, new vn1.a(this, 0)), i14);
            O9(deviceProfileB);
        }
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        StringBuilder sb3 = new StringBuilder("Got both Camera and Vibration access: ");
        j22.b.f96736a.getClass();
        sb3.append(j22.b.E(iArr));
        i2.d("FindMyPhoneActivity", sb3.toString());
    }
}
