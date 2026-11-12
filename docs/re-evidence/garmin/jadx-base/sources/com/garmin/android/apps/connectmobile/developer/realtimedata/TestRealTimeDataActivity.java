package com.garmin.android.apps.connectmobile.developer.realtimedata;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatSpinner;
import c22.u1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.device.datatypes.DeviceProfile;
import h0.r0;
import hk0.p;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import xm2.f;
import xm2.g;
import xm2.h;
import xm2.i;
import xm2.j;
import xm2.l;
import xm2.r;

/* JADX INFO: loaded from: classes8.dex */
public class TestRealTimeDataActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f33670z = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppCompatSpinner f33672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f33673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f33674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f33675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f33676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f33677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f33678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f33679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f33680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f33681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f33682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f33683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f33684n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f33685o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f33686p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f33687q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f33688r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f33689t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f33690v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList<d> f33692x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f33671a = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss", Locale.ENGLISH);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f33691w = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f33693y = new a();

    public class a extends ym2.b {
        public a() {
        }

        @Override // ym2.b
        public final void b(xm2.d dVar) {
            int i14 = dVar.f191518a;
            int i15 = dVar.f191519b;
            int i16 = dVar.f191520c;
            TestRealTimeDataActivity testRealTimeDataActivity = TestRealTimeDataActivity.this;
            String str = testRealTimeDataActivity.f33671a.format(new Date());
            testRealTimeDataActivity.f33692x.add(new d(testRealTimeDataActivity, str, "Floors_Ascended", String.valueOf(i14)));
            testRealTimeDataActivity.f33692x.add(new d(testRealTimeDataActivity, str, "Floors_Descended", String.valueOf(i15)));
            testRealTimeDataActivity.f33692x.add(new d(testRealTimeDataActivity, str, "Floors_Goal", String.valueOf(i16)));
            testRealTimeDataActivity.f33683m.post(new j80.a(testRealTimeDataActivity, i14, 5));
            testRealTimeDataActivity.f33684n.post(new j80.a(testRealTimeDataActivity, i15, 6));
            testRealTimeDataActivity.f33685o.post(new j80.a(testRealTimeDataActivity, i16, 7));
        }

        @Override // ym2.b
        public final void d(f fVar) {
            TestRealTimeDataActivity.ca(TestRealTimeDataActivity.this, fVar.f191524a, fVar.f191525b);
        }

        @Override // ym2.b
        public final void e(String str, i iVar) {
            TestRealTimeDataActivity.da(TestRealTimeDataActivity.this, iVar.f191550a, iVar.f191551b, iVar.f191552c, iVar.f191553d, iVar.f191554e);
        }

        @Override // ym2.b
        public final void f(l lVar) {
            int i14 = lVar.f191558a;
            int i15 = lVar.f191559b;
            int i16 = lVar.f191560c;
            int i17 = lVar.f191561d;
            int i18 = lVar.f191562e;
            TestRealTimeDataActivity testRealTimeDataActivity = TestRealTimeDataActivity.this;
            String str = testRealTimeDataActivity.f33671a.format(new Date());
            testRealTimeDataActivity.f33692x.add(new d(testRealTimeDataActivity, str, "Total_Daily_Intensity_Minutes", String.valueOf(i14)));
            testRealTimeDataActivity.f33692x.add(new d(testRealTimeDataActivity, str, "Daily_Moderate_Minutes", String.valueOf(i15)));
            testRealTimeDataActivity.f33692x.add(new d(testRealTimeDataActivity, str, "Daily_Vigorous_Minutes", String.valueOf(i16)));
            testRealTimeDataActivity.f33692x.add(new d(testRealTimeDataActivity, str, "Weekly_Intensity_Minutes", String.valueOf(i17)));
            testRealTimeDataActivity.f33692x.add(new d(testRealTimeDataActivity, str, "Weekly_Intensity_Minutes_Goal", String.valueOf(i18)));
            testRealTimeDataActivity.f33686p.post(new j80.a(testRealTimeDataActivity, i14, 11));
            testRealTimeDataActivity.f33687q.post(new j80.a(testRealTimeDataActivity, i15, 12));
            testRealTimeDataActivity.f33688r.post(new j80.a(testRealTimeDataActivity, i16, 13));
            testRealTimeDataActivity.f33689t.post(new j80.a(testRealTimeDataActivity, i17, 14));
            testRealTimeDataActivity.f33690v.post(new j80.a(testRealTimeDataActivity, i18, 15));
        }

        @Override // ym2.b
        public final void i(r rVar) {
            TestRealTimeDataActivity.ea(TestRealTimeDataActivity.this, rVar.f191579a, rVar.f191580b);
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view2, int i14, long j8) {
            fh2.d dVar;
            TestRealTimeDataActivity testRealTimeDataActivity = TestRealTimeDataActivity.this;
            int i15 = TestRealTimeDataActivity.f33670z;
            testRealTimeDataActivity.fa();
            String str = (String) TestRealTimeDataActivity.this.f33672b.getSelectedItem();
            int iIndexOf = str.indexOf("(");
            if (iIndexOf != -1) {
                TestRealTimeDataActivity.this.f33691w = Long.parseLong(fb1.c.m(1, iIndexOf + 1, str));
                String strA = u1.a(TestRealTimeDataActivity.this.f33691w);
                if (strA == null) {
                    dVar = null;
                } else {
                    Logger logger = fh2.d.f71626f;
                    synchronized (fh2.d.class) {
                        dVar = fh2.d.f71627g.get(strA);
                    }
                }
                if (dVar != null) {
                    TestRealTimeDataActivity testRealTimeDataActivity2 = TestRealTimeDataActivity.this;
                    testRealTimeDataActivity2.getClass();
                    for (h hVar : h.values()) {
                        a aVar = testRealTimeDataActivity2.f33693y;
                        synchronized (dVar) {
                            g.f191527c.getClass();
                            g.a.b().a(aVar, hVar, dVar.f71632e);
                        }
                    }
                }
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
            TestRealTimeDataActivity.da(TestRealTimeDataActivity.this, j.NO_SOURCE, -1, -1, -1, -1);
            TestRealTimeDataActivity testRealTimeDataActivity = TestRealTimeDataActivity.this;
            TestRealTimeDataActivity.ea(testRealTimeDataActivity, -1, -1);
            TestRealTimeDataActivity.ca(testRealTimeDataActivity, -1, -1);
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f33698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f33699c;

        public d(TestRealTimeDataActivity testRealTimeDataActivity, String str, String str2, String str3) {
            this.f33697a = str;
            this.f33698b = str2;
            this.f33699c = str3;
        }
    }

    public static void ca(TestRealTimeDataActivity testRealTimeDataActivity, int i14, int i15) {
        String str = testRealTimeDataActivity.f33671a.format(new Date());
        testRealTimeDataActivity.f33692x.add(new d(testRealTimeDataActivity, str, "Total_Calories", String.valueOf(i14)));
        testRealTimeDataActivity.f33692x.add(new d(testRealTimeDataActivity, str, "Active_Calories", String.valueOf(i15)));
        testRealTimeDataActivity.f33681k.post(new j80.a(testRealTimeDataActivity, i14, 9));
        testRealTimeDataActivity.f33682l.post(new j80.a(testRealTimeDataActivity, i15, 10));
    }

    public static void da(TestRealTimeDataActivity testRealTimeDataActivity, j jVar, int i14, int i15, int i16, int i17) {
        String str = testRealTimeDataActivity.f33671a.format(new Date());
        testRealTimeDataActivity.f33692x.add(new d(testRealTimeDataActivity, str, "Heart_Rate", String.valueOf(i14)));
        testRealTimeDataActivity.f33692x.add(new d(testRealTimeDataActivity, str, "Resting_Heart_Rate", String.valueOf(i15)));
        testRealTimeDataActivity.f33692x.add(new d(testRealTimeDataActivity, str, "Low_Heart_Rate", String.valueOf(i16)));
        testRealTimeDataActivity.f33692x.add(new d(testRealTimeDataActivity, str, "High_Heart_Rate", String.valueOf(i17)));
        testRealTimeDataActivity.f33673c.post(new r0(22, testRealTimeDataActivity, jVar));
        testRealTimeDataActivity.f33674d.post(new j80.a(testRealTimeDataActivity, i14, 1));
        testRealTimeDataActivity.f33675e.post(new j80.a(testRealTimeDataActivity, i15, 2));
        testRealTimeDataActivity.f33676f.post(new j80.a(testRealTimeDataActivity, i16, 3));
        testRealTimeDataActivity.f33677g.post(new j80.a(testRealTimeDataActivity, i17, 4));
    }

    public static void ea(TestRealTimeDataActivity testRealTimeDataActivity, int i14, int i15) {
        String str = testRealTimeDataActivity.f33671a.format(new Date());
        testRealTimeDataActivity.f33692x.add(new d(testRealTimeDataActivity, str, "Steps", String.valueOf(i14)));
        testRealTimeDataActivity.f33692x.add(new d(testRealTimeDataActivity, str, "Step_Goal", String.valueOf(i15)));
        testRealTimeDataActivity.f33678h.post(new j80.a(testRealTimeDataActivity, i14, 0));
        testRealTimeDataActivity.f33679i.post(new j80.a(testRealTimeDataActivity, i15, 8));
        testRealTimeDataActivity.f33680j.post(new com.mapbox.maps.d(testRealTimeDataActivity, i15, i14, 3));
    }

    public final void fa() {
        fh2.d dVar;
        long j8 = this.f33691w;
        if (j8 != -1) {
            String strA = u1.a(j8);
            if (strA == null) {
                dVar = null;
            } else {
                Logger logger = fh2.d.f71626f;
                synchronized (fh2.d.class) {
                    dVar = fh2.d.f71627g.get(strA);
                }
            }
            if (dVar != null) {
                for (h hVar : h.values()) {
                    a aVar = this.f33693y;
                    synchronized (dVar) {
                        g.f191527c.getClass();
                        g.a.b().b(aVar, hVar, dVar.f71632e);
                    }
                }
            }
        }
    }

    public void onClickDump(View view2) {
        new c(this, 0).c(new Void[0]);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_test_real_time_data);
        initActionBar(true, "Test Real Time Data");
        this.f33692x = new ArrayList<>();
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) findViewById(R.id.device_selection);
        this.f33672b = appCompatSpinner;
        appCompatSpinner.setOnItemSelectedListener(new b());
        this.f33673c = (TextView) findViewById(R.id.heart_rate_source);
        this.f33674d = (TextView) findViewById(R.id.heart_rate);
        this.f33675e = (TextView) findViewById(R.id.resting_heart_rate);
        this.f33676f = (TextView) findViewById(R.id.low_heart_rate);
        this.f33677g = (TextView) findViewById(R.id.high_heart_rate);
        this.f33678h = (TextView) findViewById(R.id.steps);
        this.f33679i = (TextView) findViewById(R.id.step_goal);
        this.f33680j = (TextView) findViewById(R.id.steps_to_goal);
        this.f33681k = (TextView) findViewById(R.id.total_calories);
        this.f33682l = (TextView) findViewById(R.id.active_calories);
        this.f33683m = (TextView) findViewById(R.id.floors_ascended);
        this.f33684n = (TextView) findViewById(R.id.floors_descended);
        this.f33685o = (TextView) findViewById(R.id.floors_goal);
        this.f33686p = (TextView) findViewById(R.id.total_daily_minutes);
        this.f33687q = (TextView) findViewById(R.id.daily_moderate_minutes);
        this.f33688r = (TextView) findViewById(R.id.daily_vigorous_minutes);
        this.f33689t = (TextView) findViewById(R.id.weekly_minutes);
        this.f33690v = (TextView) findViewById(R.id.weekly_goal);
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        fa();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line);
        for (DeviceProfile deviceProfile : p.d()) {
            arrayAdapter.add(deviceProfile.getDeviceFullName() + "(" + deviceProfile.getF92746j() + ")");
        }
        this.f33672b.setAdapter((SpinnerAdapter) arrayAdapter);
    }

    public class c extends g22.c<Void, String> {
        private c() {
        }

        @Override // g22.c
        public final String b(Void[] voidArr) {
            TestRealTimeDataActivity testRealTimeDataActivity = TestRealTimeDataActivity.this;
            try {
                e("real_time_data_log_" + testRealTimeDataActivity.f33671a.format(new Date()) + ".json", testRealTimeDataActivity.f33692x);
                return "Dumping succeeds";
            } catch (Exception e4) {
                return com.airbnb.lottie.animation.keyframe.a.d(e4, "Dumping fails: ");
            }
        }

        @Override // g22.c
        public final void d(String str) {
            Toast.makeText(TestRealTimeDataActivity.this, str, 1).show();
        }

        public final void e(String str, ArrayList<d> arrayList) throws JSONException, IOException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("SDK_INT", Build.VERSION.SDK_INT);
            jSONObject.put("MANUFACTURER", Build.MANUFACTURER);
            jSONObject.put("PRODUCT", Build.PRODUCT);
            jSONObject.put("MODEL", Build.MODEL);
            JSONArray jSONArray = new JSONArray();
            for (d dVar : arrayList) {
                dVar.getClass();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("Time", dVar.f33697a);
                jSONObject2.put("Type", dVar.f33698b);
                jSONObject2.put("Value", dVar.f33699c);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("RealTime_Data_Records", jSONArray);
            TestRealTimeDataActivity testRealTimeDataActivity = TestRealTimeDataActivity.this;
            Context applicationContext = testRealTimeDataActivity.getApplicationContext();
            pi1.b bVar = pi1.b.f137854a;
            applicationContext.getClass();
            File file = new File(pi1.b.a(applicationContext, null), str);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(jSONObject.toString());
            fileWriter.close();
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            testRealTimeDataActivity.getApplicationContext().sendBroadcast(intent);
        }

        public /* synthetic */ c(TestRealTimeDataActivity testRealTimeDataActivity, int i14) {
            this();
        }
    }
}
