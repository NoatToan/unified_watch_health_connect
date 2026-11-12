package com.garmin.android.apps.connectmobile.settings.devices;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.s0;
import c22.j0;
import c22.l3;
import c22.p;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.i;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import ng1.u;
import ng1.v;
import org.apache.commons.lang3.time.TimeZones;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/CreateEditDeviceAlarmActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CreateEditDeviceAlarmActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f41935r = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final HashSet f41936t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final HashSet f41937v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f41938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexTwoLineButton f41939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexTwoLineButton f41940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayout f41941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f41943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f41944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f41945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f41946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Calendar f41947j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f41949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f41950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f41951n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SparseBooleanArray f41952o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u0 f41953p;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41948k = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f41954q = new u(this, 0);

    static {
        u0 u0Var = u0.f203699b2;
        u0 u0Var2 = u0.f203705c2;
        u0 u0Var3 = u0.T1;
        u0 u0Var4 = u0.K1;
        u0 u0Var5 = u0.L1;
        u0 u0Var6 = u0.f203728g2;
        u0 u0Var7 = u0.f203717e2;
        u0 u0Var8 = u0.f203722f2;
        u0 u0Var9 = u0.f203757k2;
        u0 u0Var10 = u0.f203749j2;
        u0 u0Var11 = u0.f203742i2;
        u0 u0Var12 = u0.f203735h2;
        u0 u0Var13 = u0.f203792p2;
        u0 u0Var14 = u0.f203798q2;
        u0 u0Var15 = u0.f203804r2;
        u0 u0Var16 = u0.f203809s2;
        u0 u0Var17 = u0.f203815t2;
        u0 u0Var18 = u0.f203820u2;
        u0 u0Var19 = u0.f203764l2;
        u0 u0Var20 = u0.f203785o2;
        u0 u0Var21 = u0.M1;
        f41936t = new HashSet(Arrays.asList(u0Var, u0Var2, u0Var3, u0Var4, u0Var5, u0Var6, u0Var7, u0Var8, u0Var9, u0Var10, u0Var11, u0Var12, u0Var13, u0Var14, u0Var15, u0Var16, u0Var17, u0Var18, u0Var19, u0Var20, u0Var21));
        f41937v = new HashSet(Arrays.asList(u0Var3, u0Var4, u0Var5, u0Var19, u0Var21, u0.H5));
    }

    public static int ca(Calendar calendar) {
        calendar.getClass();
        return calendar.get(12) + (calendar.get(11) * 60);
    }

    public final ArrayList da() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f41946i;
        arrayList2.getClass();
        int size = arrayList2.size();
        for (int i14 = 0; i14 < size; i14++) {
            SparseBooleanArray sparseBooleanArray = this.f41952o;
            sparseBooleanArray.getClass();
            int iKeyAt = sparseBooleanArray.keyAt(i14);
            SparseBooleanArray sparseBooleanArray2 = this.f41952o;
            sparseBooleanArray2.getClass();
            if (sparseBooleanArray2.get(iKeyAt)) {
                ArrayList arrayList3 = this.f41946i;
                arrayList3.getClass();
                arrayList.add(arrayList3.get(iKeyAt));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    public final void ea(i iVar) {
        String string;
        String str = iVar.f34184d;
        if (str == null || str == null) {
            string = "";
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -1590230414) {
                if (iHashCode != -456571427) {
                    if (iHashCode == 2580850 && str.equals("TONE")) {
                        string = getString(R.string.device_settings_tones);
                        string.getClass();
                    } else {
                        string = "";
                    }
                } else if (str.equals("TONE_AND_VIBRATION")) {
                    string = getString(R.string.device_settings_tones_and_vibration);
                    string.getClass();
                } else {
                    string = "";
                }
            } else if (str.equals("VIBRATION")) {
                string = getString(R.string.device_settings_vibration);
                string.getClass();
            } else {
                string = "";
            }
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f41940c;
        gCMComplexTwoLineButton.getClass();
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(string);
    }

    public final void fa() {
        ArrayList arrayListDa = da();
        if (!p.a(this.f41944g, arrayListDa)) {
            this.f41950m = true;
        }
        if (this.f41950m || this.f41951n) {
            int iCa = ca(this.f41947j);
            i iVar = this.f41943f;
            iVar.getClass();
            iVar.f34182b = iCa;
            i iVar2 = this.f41943f;
            iVar2.getClass();
            iVar2.f34183c = arrayListDa;
            Intent intent = new Intent();
            intent.putExtra("extras_device_alarm", this.f41943f);
            intent.putExtra("extras_alarm_id", this.f41948k);
            setResult(-1, intent);
        }
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Parcelable parcelable;
        if (intent != null && i14 == 102 && i15 == -1) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("EXTRAS_DEVICE_ALARM", i.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("EXTRAS_DEVICE_ALARM");
                if (!(parcelableExtra instanceof i)) {
                    parcelableExtra = null;
                }
                parcelable = (i) parcelableExtra;
            }
            i iVar = (i) parcelable;
            if (iVar != null) {
                this.f41943f = iVar;
                ea(iVar);
                this.f41950m = true;
                return;
            }
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        fa();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String strD1;
        GCMComplexTwoLineButton gCMComplexTwoLineButton;
        ArrayList arrayList;
        ArrayList arrayList2;
        Parcelable parcelable;
        Object serializableExtra;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_create_edit_device_alarm);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                parcelable = (Parcelable) extras.getParcelable("extras_device_alarm", i.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("extras_device_alarm");
                if (!(parcelable2 instanceof i)) {
                    parcelable2 = null;
                }
                parcelable = (i) parcelable2;
            }
            this.f41943f = (i) parcelable;
            this.f41949l = extras.getBoolean("extras_twelve_hour_format", false);
            this.f41948k = extras.getInt("extras_alarm_id", -1);
            Intent intent = getIntent();
            if (i14 >= 33) {
                serializableExtra = intent != null ? intent.getSerializableExtra("GCM_deviceEnumValue", u0.class) : null;
            } else {
                Object serializableExtra2 = intent != null ? intent.getSerializableExtra("GCM_deviceEnumValue") : null;
                if (!(serializableExtra2 instanceof u0)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (u0) serializableExtra2;
            }
            this.f41953p = (u0) serializableExtra;
            if (extras.containsKey("GCM_alarmOnce")) {
                this.f41938a = Boolean.valueOf(getIntent().getBooleanExtra("GCM_alarmOnce", true));
            }
        }
        String string = getString(R.string.device_setting_alarm);
        string.getClass();
        if (this.f41943f == null) {
            i iVar = new i();
            this.f41943f = iVar;
            this.f41942e = true;
            iVar.f34183c = this.f41946i;
            iVar.C(com.garmin.android.apps.connectmobile.devices.model.c.ON);
            this.f41951n = true;
        }
        initActionBar(true, string);
        this.f41939b = (GCMComplexTwoLineButton) findViewById(R.id.edit_device_alarm_time);
        this.f41940c = (GCMComplexTwoLineButton) findViewById(R.id.edit_device_alarm_sound);
        this.f41941d = (LinearLayout) findViewById(R.id.settings_container);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f41939b;
        if (gCMComplexTwoLineButton2 != null) {
            gCMComplexTwoLineButton2.setOnClickListener(this.f41954q);
        }
        w13.c cVar = com.garmin.android.apps.connectmobile.devices.model.a.f34085m;
        this.f41946i = new ArrayList(cVar.getF134973e());
        cVar.getClass();
        int length = p005kotlin.jvm.internal.i.d(cVar, new com.garmin.android.apps.connectmobile.devices.model.a[0]).length;
        for (int i15 = 0; i15 < length; i15++) {
            ArrayList arrayList3 = this.f41946i;
            if (arrayList3 != null) {
                arrayList3.add(((com.garmin.android.apps.connectmobile.devices.model.a) com.garmin.android.apps.connectmobile.devices.model.a.f34085m.get(i15)).f34086a);
            }
        }
        u0 u0Var = this.f41953p;
        if (u0Var != null && f41937v.contains(u0Var) && (arrayList2 = this.f41946i) != null) {
            arrayList2.remove(com.garmin.android.apps.connectmobile.devices.model.a.ONCE.f34086a);
        }
        Boolean bool = this.f41938a;
        if (bool != null && !bool.booleanValue() && (arrayList = this.f41946i) != null) {
            arrayList.remove(com.garmin.android.apps.connectmobile.devices.model.a.ONCE.f34086a);
        }
        i iVar2 = this.f41943f;
        iVar2.getClass();
        this.f41944g = iVar2.f34183c;
        ArrayList arrayList4 = this.f41946i;
        arrayList4.getClass();
        int size = arrayList4.size();
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(size);
        this.f41952o = sparseBooleanArray;
        sparseBooleanArray.clear();
        for (int i16 = 0; i16 < size; i16++) {
            SparseBooleanArray sparseBooleanArray2 = this.f41952o;
            sparseBooleanArray2.getClass();
            sparseBooleanArray2.put(i16, false);
        }
        Object systemService = getSystemService("layout_inflater");
        systemService.getClass();
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        ArrayList arrayList5 = this.f41946i;
        arrayList5.getClass();
        this.f41945h = new ArrayList(arrayList5.size());
        int i17 = Calendar.getInstance(Locale.getDefault()).get(7);
        ArrayList arrayList6 = this.f41946i;
        arrayList6.getClass();
        int size2 = arrayList6.size();
        for (int i18 = 0; i18 < size2; i18++) {
            ArrayList arrayList7 = this.f41946i;
            arrayList7.getClass();
            String str = (String) arrayList7.get(i18);
            View viewInflate = layoutInflater.inflate(R.layout.gcm3_checkable_row, (ViewGroup) null, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.checkable_row_name);
            com.garmin.android.apps.connectmobile.devices.model.a.f34075c.getClass();
            textView.setText(getString(com.garmin.android.apps.connectmobile.devices.model.a.C0576a.a(str).f34087b));
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.checkable_row_img);
            if (c22.b.a(this) >= 1.3f) {
                int iC = (int) c22.b.c(this, getResources().getDimensionPixelSize(R.dimen.icon_small), 1.5f);
                imageView.getLayoutParams().height = iC;
                imageView.getLayoutParams().width = iC;
            }
            ArrayList arrayList8 = this.f41944g;
            if (arrayList8 != null) {
                boolean zContains = arrayList8.contains(str);
                imageView.setVisibility(zContains ? 0 : 8);
                SparseBooleanArray sparseBooleanArray3 = this.f41952o;
                sparseBooleanArray3.getClass();
                sparseBooleanArray3.put(i18, zContains);
            } else {
                int i19 = i17 - 1;
                int i24 = i18 + 1;
                SparseBooleanArray sparseBooleanArray4 = this.f41952o;
                if (i19 == i24) {
                    sparseBooleanArray4.getClass();
                    sparseBooleanArray4.put(i18, true);
                    imageView.setVisibility(0);
                } else {
                    sparseBooleanArray4.getClass();
                    sparseBooleanArray4.put(i18, false);
                    imageView.setVisibility(8);
                }
            }
            s0.r(viewInflate, new v(imageView));
            viewInflate.setOnClickListener(new lq.g(19, imageView, this));
            LinearLayout linearLayout = this.f41941d;
            linearLayout.getClass();
            linearLayout.addView(viewInflate);
            ArrayList arrayList9 = this.f41945h;
            if (arrayList9 != null) {
                arrayList9.add(viewInflate);
            }
        }
        if (!this.f41942e) {
            Button button = (Button) layoutInflater.inflate(R.layout.gcm3_default_grey_button, (ViewGroup) this.f41941d, false).findViewById(R.id.default_blue_button);
            button.setText(R.string.device_settings_delete_alarm);
            button.setOnClickListener(new u(this, 2));
            LinearLayout linearLayout2 = this.f41941d;
            linearLayout2.getClass();
            linearLayout2.addView(button);
        }
        u0 u0Var2 = this.f41953p;
        if (u0Var2 != null && (gCMComplexTwoLineButton = this.f41940c) != null) {
            gCMComplexTwoLineButton.setVisible(!f41936t.contains(u0Var2));
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f41940c;
        if (gCMComplexTwoLineButton3 != null) {
            gCMComplexTwoLineButton3.setOnClickListener(new u(this, 1));
        }
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        this.f41947j = calendar;
        if (calendar != null) {
            calendar.set(10, 7);
        }
        Calendar calendar2 = this.f41947j;
        if (calendar2 != null) {
            calendar2.set(12, 0);
        }
        Calendar calendar3 = this.f41947j;
        if (calendar3 != null) {
            calendar3.set(9, 0);
        }
        if (!this.f41951n) {
            Calendar calendar4 = Calendar.getInstance(TimeZone.getTimeZone(TimeZones.GMT_ID));
            i iVar3 = this.f41943f;
            iVar3.getClass();
            calendar4.setTimeInMillis(((long) (iVar3.f34182b * 1000)) * 60);
            Calendar calendar5 = this.f41947j;
            if (calendar5 != null) {
                calendar5.set(11, calendar4.get(11));
            }
            Calendar calendar6 = this.f41947j;
            if (calendar6 != null) {
                calendar6.set(12, calendar4.get(12));
            }
            Calendar calendar7 = this.f41947j;
            if (calendar7 != null) {
                calendar7.set(13, calendar4.get(13));
            }
        }
        int iCa = ca(this.f41947j);
        if (this.f41949l) {
            strD1 = j0.u(iCa);
        } else {
            l3.f23124b.getClass();
            strD1 = l3.a.d1(iCa);
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f41939b;
        gCMComplexTwoLineButton4.getClass();
        gCMComplexTwoLineButton4.setButtonBottomLeftLabel(strD1);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        fa();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        i iVar = this.f41943f;
        iVar.getClass();
        ea(iVar);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/CreateEditDeviceAlarmActivity$a;", "", "<init>", "()V", "", "EXTRAS_ALARM_ID", "Ljava/lang/String;", "EXTRAS_DELETED", "EXTRAS_DEVICE_ALARM", "EXTRAS_TWELVE_HOUR_FORMAT", "", "Lzb0/u0;", "NO_ALARM_SOUND_DEVICES", "Ljava/util/Set;", "NO_ONCE_DEVICES", "", "REQUEST_CODE_SOUND", "I", "CONSTANT_ALARM_ID", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(Activity activity, int i14, i iVar, boolean z14, u0 u0Var, Boolean bool) {
            Intent intent = new Intent(activity, (Class<?>) CreateEditDeviceAlarmActivity.class);
            intent.putExtra("extras_device_alarm", iVar);
            intent.putExtra("extras_alarm_id", i14);
            intent.putExtra("extras_twelve_hour_format", z14);
            intent.putExtra("GCM_deviceEnumValue", u0Var);
            if (bool != null) {
                intent.putExtra("GCM_alarmOnce", bool.booleanValue());
            }
            activity.startActivityForResult(intent, 101);
        }

        private a() {
        }
    }
}
