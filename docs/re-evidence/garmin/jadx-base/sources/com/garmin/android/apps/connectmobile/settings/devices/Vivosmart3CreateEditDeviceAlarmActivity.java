package com.garmin.android.apps.connectmobile.settings.devices;

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
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import ng1.e1;
import ng1.f1;
import org.apache.commons.lang3.time.TimeZones;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/Vivosmart3CreateEditDeviceAlarmActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Vivosmart3CreateEditDeviceAlarmActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f42315o = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexTwoLineButton f42316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f42317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f42319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f42320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f42321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f42322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Calendar f42323h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f42325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f42327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SparseBooleanArray f42328m;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42324i = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e1 f42329n = new e1(this, 0);

    public static int ca(Calendar calendar) {
        calendar.getClass();
        return calendar.get(12) + (calendar.get(11) * 60);
    }

    public final ArrayList da() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f42322g;
        arrayList2.getClass();
        int size = arrayList2.size();
        for (int i14 = 0; i14 < size; i14++) {
            SparseBooleanArray sparseBooleanArray = this.f42328m;
            sparseBooleanArray.getClass();
            int iKeyAt = sparseBooleanArray.keyAt(i14);
            SparseBooleanArray sparseBooleanArray2 = this.f42328m;
            sparseBooleanArray2.getClass();
            if (sparseBooleanArray2.get(iKeyAt)) {
                ArrayList arrayList3 = this.f42322g;
                arrayList3.getClass();
                arrayList.add(arrayList3.get(iKeyAt));
            }
        }
        return arrayList;
    }

    public final void ea() {
        ArrayList arrayListDa = da();
        if (!p.a(this.f42320e, arrayListDa)) {
            this.f42326k = true;
        }
        if (this.f42326k || this.f42327l) {
            int iCa = ca(this.f42323h);
            i iVar = this.f42319d;
            iVar.getClass();
            iVar.f34182b = iCa;
            i iVar2 = this.f42319d;
            iVar2.getClass();
            iVar2.f34183c = arrayListDa;
            Intent intent = new Intent();
            intent.putExtra("extras_device_alarm", this.f42319d);
            intent.putExtra("extras_alarm_id", this.f42324i);
            setResult(-1, intent);
        }
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Parcelable parcelable;
        if (i15 == -1 && intent != null && i14 == 102) {
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
                this.f42319d = iVar;
                this.f42326k = true;
                return;
            }
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        ea();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        String strD1;
        ArrayList arrayList;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_vivosmart3_create_edit_device_alarm);
        Bundle extras = getIntent().getExtras();
        ViewGroup viewGroup = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("extras_device_alarm", i.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("extras_device_alarm");
                if (!(parcelable2 instanceof i)) {
                    parcelable2 = null;
                }
                parcelable = (i) parcelable2;
            }
            this.f42319d = (i) parcelable;
            this.f42325j = extras.getBoolean("extras_twelve_hour_format", false);
            this.f42324i = extras.getInt("extras_alarm_id", -1);
        }
        if (this.f42319d == null) {
            string = getString(R.string.new_device_alarm_title);
            string.getClass();
            i iVar = new i();
            this.f42319d = iVar;
            this.f42318c = true;
            iVar.f34183c = this.f42322g;
            iVar.C(com.garmin.android.apps.connectmobile.devices.model.c.ON);
            this.f42327l = true;
        } else {
            string = getString(R.string.edit_device_alarm_title);
            string.getClass();
        }
        initActionBar(true, string);
        this.f42316a = (GCMComplexTwoLineButton) findViewById(R.id.edit_device_alarm_time);
        this.f42317b = (LinearLayout) findViewById(R.id.settings_container);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42316a;
        if (gCMComplexTwoLineButton != null) {
            gCMComplexTwoLineButton.setOnClickListener(this.f42329n);
        }
        w13.c cVar = com.garmin.android.apps.connectmobile.devices.model.a.f34085m;
        this.f42322g = new ArrayList(cVar.getF134973e());
        cVar.getClass();
        int length = p005kotlin.jvm.internal.i.d(cVar, new com.garmin.android.apps.connectmobile.devices.model.a[0]).length;
        for (int i14 = 0; i14 < length; i14++) {
            w13.c cVar2 = com.garmin.android.apps.connectmobile.devices.model.a.f34085m;
            if (cVar2.get(i14) != com.garmin.android.apps.connectmobile.devices.model.a.ONCE && (arrayList = this.f42322g) != null) {
                arrayList.add(((com.garmin.android.apps.connectmobile.devices.model.a) cVar2.get(i14)).f34086a);
            }
        }
        i iVar2 = this.f42319d;
        iVar2.getClass();
        this.f42320e = iVar2.f34183c;
        ArrayList arrayList2 = this.f42322g;
        arrayList2.getClass();
        int size = arrayList2.size();
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(size);
        this.f42328m = sparseBooleanArray;
        sparseBooleanArray.clear();
        for (int i15 = 0; i15 < size; i15++) {
            SparseBooleanArray sparseBooleanArray2 = this.f42328m;
            sparseBooleanArray2.getClass();
            sparseBooleanArray2.put(i15, false);
        }
        Object systemService = getSystemService("layout_inflater");
        systemService.getClass();
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        View viewInflate = layoutInflater.inflate(R.layout.gcm_divider_line_thin, (ViewGroup) this.f42317b, false);
        LinearLayout linearLayout = this.f42317b;
        linearLayout.getClass();
        linearLayout.addView(viewInflate);
        ArrayList arrayList3 = this.f42322g;
        arrayList3.getClass();
        this.f42321f = new ArrayList(arrayList3.size());
        int i16 = Calendar.getInstance(Locale.getDefault()).get(7);
        ArrayList arrayList4 = this.f42322g;
        arrayList4.getClass();
        int size2 = arrayList4.size();
        int i17 = 0;
        while (i17 < size2) {
            ArrayList arrayList5 = this.f42322g;
            arrayList5.getClass();
            String str = (String) arrayList5.get(i17);
            View viewInflate2 = layoutInflater.inflate(R.layout.gcm3_checkable_row, viewGroup, false);
            View viewInflate3 = layoutInflater.inflate(R.layout.gcm_divider_line_thin, (ViewGroup) this.f42317b, false);
            TextView textView = (TextView) viewInflate2.findViewById(R.id.checkable_row_name);
            com.garmin.android.apps.connectmobile.devices.model.a.f34075c.getClass();
            textView.setText(getString(com.garmin.android.apps.connectmobile.devices.model.a.C0576a.a(str).f34087b));
            ImageView imageView = (ImageView) viewInflate2.findViewById(R.id.checkable_row_img);
            if (c22.b.a(this) >= 1.3f) {
                int iC = (int) c22.b.c(this, getResources().getDimensionPixelSize(R.dimen.icon_small), 1.5f);
                imageView.getLayoutParams().height = iC;
                imageView.getLayoutParams().width = iC;
            }
            ArrayList arrayList6 = this.f42320e;
            if (arrayList6 != null) {
                boolean zContains = arrayList6.contains(str);
                imageView.setVisibility(zContains ? 0 : 8);
                SparseBooleanArray sparseBooleanArray3 = this.f42328m;
                sparseBooleanArray3.getClass();
                sparseBooleanArray3.put(i17, zContains);
            } else {
                int i18 = i16 - 1;
                int i19 = i17 + 1;
                SparseBooleanArray sparseBooleanArray4 = this.f42328m;
                if (i18 == i19) {
                    sparseBooleanArray4.getClass();
                    sparseBooleanArray4.put(i17, true);
                    imageView.setVisibility(0);
                } else {
                    sparseBooleanArray4.getClass();
                    sparseBooleanArray4.put(i17, false);
                    imageView.setVisibility(8);
                }
            }
            s0.r(viewInflate2, new f1(imageView));
            viewInflate2.setOnClickListener(new lq.g(20, imageView, this));
            LinearLayout linearLayout2 = this.f42317b;
            linearLayout2.getClass();
            linearLayout2.addView(viewInflate2);
            LinearLayout linearLayout3 = this.f42317b;
            linearLayout3.getClass();
            linearLayout3.addView(viewInflate3);
            ArrayList arrayList7 = this.f42321f;
            if (arrayList7 != null) {
                arrayList7.add(viewInflate2);
            }
            i17++;
            viewGroup = null;
        }
        if (!this.f42318c) {
            Button button = (Button) layoutInflater.inflate(R.layout.gcm3_default_blue_button, (ViewGroup) this.f42317b, false).findViewById(R.id.default_blue_button);
            button.setText(R.string.device_settings_delete_alarm);
            button.setOnClickListener(new e1(this, 1));
            LinearLayout linearLayout4 = this.f42317b;
            linearLayout4.getClass();
            linearLayout4.addView(button);
        }
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        this.f42323h = calendar;
        if (calendar != null) {
            calendar.set(10, 7);
        }
        Calendar calendar2 = this.f42323h;
        if (calendar2 != null) {
            calendar2.set(12, 0);
        }
        Calendar calendar3 = this.f42323h;
        if (calendar3 != null) {
            calendar3.set(9, 0);
        }
        if (!this.f42327l) {
            Calendar calendar4 = Calendar.getInstance(TimeZone.getTimeZone(TimeZones.GMT_ID));
            i iVar3 = this.f42319d;
            iVar3.getClass();
            calendar4.setTimeInMillis(((long) iVar3.f34182b) * 1000 * ((long) 60));
            Calendar calendar5 = this.f42323h;
            if (calendar5 != null) {
                calendar5.set(11, calendar4.get(11));
            }
            Calendar calendar6 = this.f42323h;
            if (calendar6 != null) {
                calendar6.set(12, calendar4.get(12));
            }
            Calendar calendar7 = this.f42323h;
            if (calendar7 != null) {
                calendar7.set(13, calendar4.get(13));
            }
        }
        int iCa = ca(this.f42323h);
        if (this.f42325j) {
            strD1 = j0.u(iCa);
        } else {
            l3.f23124b.getClass();
            strD1 = l3.a.d1(iCa);
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f42316a;
        gCMComplexTwoLineButton2.getClass();
        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(strD1);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ea();
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/Vivosmart3CreateEditDeviceAlarmActivity$a;", "", "<init>", "()V", "", "EXTRAS_ALARM_ID", "Ljava/lang/String;", "EXTRAS_DELETED", "EXTRAS_DEVICE_ALARM", "EXTRAS_TWELVE_HOUR_FORMAT", "", "REQUEST_CODE_SOUND", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
