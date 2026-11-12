package com.garmin.android.apps.connectmobile.smartnotification;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a0;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.GNCSNotificationListener;
import com.garmin.android.gncs.GNCSNotificationManager;
import com.garmin.android.gncs.StatusBarNotificationListener;
import com.garmin.android.gncs.StatusBarNotificationListenerManager;
import com.google.android.material.tabs.TabLayout;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class LogSmartNotificationActivity extends m implements StatusBarNotificationListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public un1.c<un1.e> f44282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public un1.c<un1.d> f44283d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.smartnotification.a f44280a = new com.garmin.android.apps.connectmobile.smartnotification.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k[] f44281b = {new k("Default", new a()), new k("Full", new b()), new k("Content View", new c()), new k("Big Content View", new d()), new k("Group", new e()), new k("To Devices Full", new f())};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f44284e = new g();

    public class a implements ib2.a<Fragment> {
        public a() {
        }

        @Override // ib2.a
        public final Fragment b() {
            un1.c cVar = LogSmartNotificationActivity.this.f44282c;
            un1.b bVar = new un1.b();
            bVar.f172048b = cVar;
            return bVar;
        }
    }

    public class b implements ib2.a<Fragment> {
        public b() {
        }

        @Override // ib2.a
        public final Fragment b() {
            LogSmartNotificationActivity logSmartNotificationActivity = LogSmartNotificationActivity.this;
            un1.c cVar = logSmartNotificationActivity.f44282c;
            com.garmin.android.apps.connectmobile.smartnotification.a aVar = logSmartNotificationActivity.f44280a;
            aVar.getClass();
            ArrayList arrayList = new ArrayList(aVar.f44304b);
            un1.b bVar = new un1.b();
            bVar.f172048b = cVar;
            bVar.f172049c = arrayList;
            return bVar;
        }
    }

    public class c implements ib2.a<Fragment> {
        public c() {
        }

        @Override // ib2.a
        public final Fragment b() {
            LogSmartNotificationActivity logSmartNotificationActivity = LogSmartNotificationActivity.this;
            un1.c cVar = logSmartNotificationActivity.f44282c;
            ArrayList arrayListE = logSmartNotificationActivity.f44280a.e(com.garmin.android.apps.connectmobile.smartnotification.a.g0.CONTENT_VIEW, new com.garmin.android.apps.connectmobile.smartnotification.a.g0[0]);
            un1.b bVar = new un1.b();
            bVar.f172048b = cVar;
            bVar.f172049c = arrayListE;
            return bVar;
        }
    }

    public class d implements ib2.a<Fragment> {
        public d() {
        }

        @Override // ib2.a
        public final Fragment b() {
            LogSmartNotificationActivity logSmartNotificationActivity = LogSmartNotificationActivity.this;
            un1.c cVar = logSmartNotificationActivity.f44282c;
            ArrayList arrayListE = logSmartNotificationActivity.f44280a.e(com.garmin.android.apps.connectmobile.smartnotification.a.g0.BIG_CONTENT_VIEW, new com.garmin.android.apps.connectmobile.smartnotification.a.g0[0]);
            un1.b bVar = new un1.b();
            bVar.f172048b = cVar;
            bVar.f172049c = arrayListE;
            return bVar;
        }
    }

    public class e implements ib2.a<Fragment> {
        public e() {
        }

        @Override // ib2.a
        public final Fragment b() {
            LogSmartNotificationActivity logSmartNotificationActivity = LogSmartNotificationActivity.this;
            un1.c cVar = logSmartNotificationActivity.f44282c;
            ArrayList arrayListE = logSmartNotificationActivity.f44280a.e(com.garmin.android.apps.connectmobile.smartnotification.a.g0.GROUP_KEY, com.garmin.android.apps.connectmobile.smartnotification.a.g0.IS_SUMMARY);
            un1.b bVar = new un1.b();
            bVar.f172048b = cVar;
            bVar.f172049c = arrayListE;
            return bVar;
        }
    }

    public class f implements ib2.a<Fragment> {
        public f() {
        }

        @Override // ib2.a
        public final Fragment b() {
            LogSmartNotificationActivity logSmartNotificationActivity = LogSmartNotificationActivity.this;
            un1.c cVar = logSmartNotificationActivity.f44283d;
            com.garmin.android.apps.connectmobile.smartnotification.a aVar = logSmartNotificationActivity.f44280a;
            aVar.getClass();
            ArrayList arrayList = new ArrayList(aVar.f44305c);
            un1.b bVar = new un1.b();
            bVar.f172048b = cVar;
            bVar.f172049c = arrayList;
            return bVar;
        }
    }

    public class g implements GNCSNotificationListener {
        public g() {
        }

        @Override // com.garmin.android.gncs.GNCSNotificationListener
        public final void onNotificationPosted(GNCSNotificationInfo gNCSNotificationInfo) {
            LogSmartNotificationActivity.this.f44283d.a(new un1.d(1, gNCSNotificationInfo));
        }

        @Override // com.garmin.android.gncs.GNCSNotificationListener
        public final void onNotificationRemoved(GNCSNotificationInfo gNCSNotificationInfo) {
            LogSmartNotificationActivity.this.f44283d.a(new un1.d(3, gNCSNotificationInfo));
        }

        @Override // com.garmin.android.gncs.GNCSNotificationListener
        public final void onNotificationUpdated(GNCSNotificationInfo gNCSNotificationInfo) {
            LogSmartNotificationActivity.this.f44283d.a(new un1.d(2, gNCSNotificationInfo));
        }
    }

    public class h extends un1.a<un1.e> {
        public h(LogSmartNotificationActivity logSmartNotificationActivity, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.e eVar) {
            un1.e eVar2 = eVar;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(eVar2.f172053a == 1 ? "Post: " : "Remove: ");
            sb3.append(eVar2.f172054b);
            return sb3.toString();
        }
    }

    public class i extends un1.a<un1.d> {
        public i(LogSmartNotificationActivity logSmartNotificationActivity, String str) {
            super(str);
        }

        @Override // un1.a
        public final String a(un1.d dVar) {
            un1.d dVar2 = dVar;
            StringBuilder sb3 = new StringBuilder();
            int i14 = dVar2.f172051a;
            if (i14 == 1) {
                sb3.append("POST: ");
            } else if (i14 == 2) {
                sb3.append("UPDATE: ");
            } else if (i14 == 3) {
                sb3.append("REMOVE: ");
            }
            sb3.append(dVar2.f172052b);
            return sb3.toString();
        }
    }

    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f44293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ib2.a<Fragment> f44294b;

        public k(String str, ib2.a<Fragment> aVar) {
            this.f44293a = str;
            this.f44294b = aVar;
        }
    }

    public class l extends a0 {
        public l(v vVar) {
            super(vVar);
        }

        @Override // fe.a
        /* JADX INFO: renamed from: getCount */
        public final int getF44052d() {
            return LogSmartNotificationActivity.this.f44281b.length;
        }

        @Override // androidx.fragment.app.a0
        public final Fragment getItem(int i14) {
            return LogSmartNotificationActivity.this.f44281b[i14].f44294b.b();
        }

        @Override // fe.a
        public final CharSequence getPageTitle(int i14) {
            return LogSmartNotificationActivity.this.f44281b[i14].f44293a;
        }
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.log_smart_notification);
        ViewPager viewPager = (ViewPager) findViewById(R.id.notification_table_view_pager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        this.f44282c = new un1.c<>(this, Collections.singletonList(new h(this, "Default")));
        this.f44283d = new un1.c<>(this, Collections.singletonList(new i(this, "Default")));
        viewPager.setAdapter(new l(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
    }

    public void onDump(View view2) {
        new j(this, 0).c(new Void[0]);
    }

    @Override // com.garmin.android.gncs.StatusBarNotificationListener
    public final void onNotificationPosted(StatusBarNotification statusBarNotification) {
        this.f44282c.a(new un1.e(1, statusBarNotification));
    }

    @Override // com.garmin.android.gncs.StatusBarNotificationListener
    public final void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        this.f44282c.a(new un1.e(2, statusBarNotification));
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        ((StatusBarNotificationListenerManager) jb2.b.a(StatusBarNotificationListenerManager.class)).removeListener(this);
        ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).unregisterListener(this.f44284e);
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((StatusBarNotificationListenerManager) jb2.b.a(StatusBarNotificationListenerManager.class)).addListener(this);
        ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).registerListener(this.f44284e);
    }

    public class j extends g22.c<Void, String> {
        private j() {
        }

        @Override // g22.c
        public final String b(Void[] voidArr) {
            LogSmartNotificationActivity logSmartNotificationActivity = LogSmartNotificationActivity.this;
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMdd_HHmmss");
                Date date = new Date();
                String str = "status_bar_notificaction_log_" + simpleDateFormat.format(date) + ".json";
                String str2 = "smart_notification_log_" + simpleDateFormat.format(date) + ".json";
                un1.c<un1.e> cVar = logSmartNotificationActivity.f44282c;
                com.garmin.android.apps.connectmobile.smartnotification.a aVar = logSmartNotificationActivity.f44280a;
                ArrayList<un1.e> arrayList = cVar.f172055a;
                aVar.getClass();
                e(str, arrayList, new ArrayList(aVar.f44304b));
                e(str2, logSmartNotificationActivity.f44283d.f172055a, new ArrayList(aVar.f44305c));
                return "Dumping succeeds";
            } catch (Exception e4) {
                return com.airbnb.lottie.animation.keyframe.a.d(e4, "Dumping fails: ");
            }
        }

        @Override // g22.c
        public final void d(String str) {
            Toast.makeText(LogSmartNotificationActivity.this, str, 1).show();
        }

        public final void e(String str, ArrayList arrayList, ArrayList arrayList2) throws JSONException, IOException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("SDK_INT", Build.VERSION.SDK_INT);
            jSONObject.put("MANUFACTURER", Build.MANUFACTURER);
            jSONObject.put("PRODUCT", Build.PRODUCT);
            jSONObject.put("MODEL", Build.MODEL);
            JSONArray jSONArray = new JSONArray();
            for (Object obj : arrayList) {
                JSONObject jSONObject2 = new JSONObject();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    un1.a aVar = (un1.a) it.next();
                    jSONObject2.put(aVar.f172046a, aVar.a(obj));
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("Notifications", jSONArray);
            Context applicationContext = LogSmartNotificationActivity.this.getApplicationContext();
            pi1.b bVar = pi1.b.f137854a;
            applicationContext.getClass();
            FileWriter fileWriter = new FileWriter(new File(pi1.b.a(applicationContext, null), str));
            fileWriter.write(jSONObject.toString());
            fileWriter.close();
        }

        public /* synthetic */ j(LogSmartNotificationActivity logSmartNotificationActivity, int i14) {
            this();
        }
    }
}
