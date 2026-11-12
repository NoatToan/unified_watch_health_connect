package com.garmin.android.apps.connectmobile.permissions;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.gncs.BuildConfig;
import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.SmartNotificationsModule;
import j22.h;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\n\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/permissions/RequestPermissionsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RequestPermissionsActivity extends c implements View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f40292l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f40293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f40294b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f40295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f40299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f40300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f40301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AppCompatButton f40302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AppCompatButton f40303k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/permissions/RequestPermissionsActivity$b;", "Landroid/os/Parcelable;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b implements Parcelable {
        public abstract void b();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v14) {
        v14.getClass();
        int id3 = v14.getId();
        if (id3 != R.id.button_ok) {
            if (id3 == R.id.button_settings) {
                j22.b.f96736a.getClass();
                j22.b.r(this);
                return;
            }
            return;
        }
        ArrayList arrayList = this.f40294b;
        if (arrayList.isEmpty()) {
            finish();
        } else {
            j22.b.f96736a.getClass();
            j22.b.w(this, 101, arrayList);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        Bundle extras;
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            ArrayList<String> stringArrayList = extras2.getStringArrayList("GCM_permissionType");
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                stringArrayList = null;
            }
            if (stringArrayList != null) {
                this.f40293a = stringArrayList;
            } else {
                finish();
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras2.getParcelable("EXTRA_PERMISSIONS_ACCEPTED_OPERATION", b.class);
            } else {
                Parcelable parcelable2 = extras2.getParcelable("EXTRA_PERMISSIONS_ACCEPTED_OPERATION");
                if (!(parcelable2 instanceof b)) {
                    parcelable2 = null;
                }
                parcelable = (b) parcelable2;
            }
            this.f40295c = (b) parcelable;
            this.f40297e = extras2.getBoolean("EXTRA_FORCE_SHOW_RATIONALE", false);
            this.f40300h = extras2.getString("EXTRA_LIBRARY_PACKAGE_NAME");
        } else {
            finish();
        }
        setContentView(R.layout.gcm3_permission_notification_layout);
        initActionBar(true, R.string.permission_required);
        View viewFindViewById = findViewById(R.id.permission_needed_message);
        viewFindViewById.getClass();
        this.f40301i = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.button_ok);
        viewFindViewById2.getClass();
        AppCompatButton appCompatButton = (AppCompatButton) viewFindViewById2;
        this.f40302j = appCompatButton;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("EXTRA_PRIMARY_BUTTON_TEXT")) == null) {
            string = getString(R.string.lbl_ok);
            string.getClass();
        }
        appCompatButton.setText(string);
        View viewFindViewById3 = findViewById(R.id.button_settings);
        viewFindViewById3.getClass();
        this.f40303k = (AppCompatButton) viewFindViewById3;
        AppCompatButton appCompatButton2 = this.f40302j;
        if (appCompatButton2 == null) {
            s.m("mOkButton");
            throw null;
        }
        appCompatButton2.setOnClickListener(this);
        AppCompatButton appCompatButton3 = this.f40303k;
        if (appCompatButton3 != null) {
            appCompatButton3.setOnClickListener(this);
        } else {
            s.m("mSettingsButton");
            throw null;
        }
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (i14 != 101) {
            super.onRequestPermissionsResult(i14, strArr, iArr);
            return;
        }
        this.f40299g = true;
        b bVar = this.f40295c;
        if (bVar != null) {
            j22.b.f96736a.getClass();
            if (!j22.b.E(iArr)) {
                bVar = null;
            }
            if (bVar != null) {
                bVar.b();
            }
        }
        if (!TextUtils.isEmpty(this.f40300h) && BuildConfig.LIBRARY_PACKAGE_NAME.equals(this.f40300h)) {
            j22.b.f96736a.getClass();
            h hVarG = j22.b.G(iArr);
            if (h.ALLOWED == hVarG || h.PARTIALLY_ALLOWED == hVarG) {
                Context applicationContext = getApplicationContext();
                applicationContext.sendBroadcast(new Intent(SmartNotificationsModule.ACTION_PERMISSIONS_GRANTED), oa2.b.d(applicationContext));
                GNCSListenerService.refreshPhoneCallListener();
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        j22.a aVar;
        super.onResume();
        ArrayList<j22.a> arrayList = this.f40294b;
        arrayList.clear();
        ArrayList arrayList2 = this.f40293a;
        if (arrayList2 == null) {
            s.m("permsRequestedByCaller");
            throw null;
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            int i14 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            j22.a.f96714c.getClass();
            str.getClass();
            j22.a[] aVarArrValues = j22.a.values();
            int length = aVarArrValues.length;
            while (true) {
                if (i14 >= length) {
                    aVar = null;
                    break;
                }
                aVar = aVarArrValues[i14];
                if (s.g(aVar.f96735b, str)) {
                    break;
                } else {
                    i14++;
                }
            }
            if (aVar != null) {
                j22.b.f96736a.getClass();
                if (!j22.b.k(aVar)) {
                    arrayList.add(aVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            Object systemService = getSystemService("notification");
            systemService.getClass();
            ((NotificationManager) systemService).cancel(9);
            finish();
        }
        if (!this.f40297e) {
            for (j22.a aVar2 : arrayList) {
                j22.b.f96736a.getClass();
                boolean zC = j22.b.C(this, aVar2);
                this.f40296d = zC;
                if (zC) {
                    break;
                }
            }
        }
        TextView textView = this.f40301i;
        if (textView == null) {
            s.m("mPermissionRationale");
            throw null;
        }
        StringBuilder sb3 = new StringBuilder();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            String stringExtra = getIntent().getStringExtra(((j22.a) it3.next()).f96735b);
            if (!TextUtils.isEmpty(stringExtra)) {
                sb3.append(stringExtra + "\n\n");
            }
        }
        textView.setText(sb3.toString());
        if (!this.f40296d && !this.f40297e) {
            AppCompatButton appCompatButton = this.f40302j;
            if (appCompatButton == null) {
                s.m("mOkButton");
                throw null;
            }
            appCompatButton.setVisibility(8);
            AppCompatButton appCompatButton2 = this.f40303k;
            if (appCompatButton2 == null) {
                s.m("mSettingsButton");
                throw null;
            }
            appCompatButton2.setVisibility(0);
            if (this.f40299g) {
                return;
            }
            if (arrayList.isEmpty()) {
                finish();
                return;
            } else {
                j22.b.f96736a.getClass();
                j22.b.w(this, 101, arrayList);
                return;
            }
        }
        boolean z14 = this.f40298f;
        AppCompatButton appCompatButton3 = this.f40302j;
        if (z14) {
            if (appCompatButton3 == null) {
                s.m("mOkButton");
                throw null;
            }
            appCompatButton3.setVisibility(8);
            AppCompatButton appCompatButton4 = this.f40303k;
            if (appCompatButton4 != null) {
                appCompatButton4.setVisibility(0);
                return;
            } else {
                s.m("mSettingsButton");
                throw null;
            }
        }
        if (appCompatButton3 == null) {
            s.m("mOkButton");
            throw null;
        }
        appCompatButton3.setVisibility(0);
        AppCompatButton appCompatButton5 = this.f40303k;
        if (appCompatButton5 == null) {
            s.m("mSettingsButton");
            throw null;
        }
        appCompatButton5.setVisibility(8);
        this.f40298f = true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/permissions/RequestPermissionsActivity$a;", "", "<init>", "()V", "", "EXTRA_PERMISSIONS_ACCEPTED_OPERATION", "Ljava/lang/String;", "EXTRA_FORCE_SHOW_RATIONALE", "EXTRA_LIBRARY_PACKAGE_NAME", "EXTRA_PRIMARY_BUTTON_TEXT", "", "REQUEST_CODE_ASK_MULTIPLE_PERMISSIONS", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, ArrayList arrayList, ArrayList arrayList2, com.garmin.android.apps.connectmobile.util.location.c.d dVar, String str, int i14) {
            if ((i14 & 32) != 0) {
                str = null;
            }
            String str2 = (i14 & 64) == 0 ? BuildConfig.LIBRARY_PACKAGE_NAME : null;
            aVar.getClass();
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) RequestPermissionsActivity.class);
            intent.putStringArrayListExtra("GCM_permissionType", arrayList);
            intent.putExtra("EXTRA_PERMISSIONS_ACCEPTED_OPERATION", dVar);
            intent.putExtra("EXTRA_FORCE_SHOW_RATIONALE", true);
            intent.putExtra("EXTRA_PRIMARY_BUTTON_TEXT", str);
            intent.putExtra("EXTRA_LIBRARY_PACKAGE_NAME", str2);
            int size = arrayList.size();
            for (int i15 = 0; i15 < size && i15 < arrayList2.size(); i15++) {
                intent.putExtra((String) arrayList.get(i15), (String) arrayList2.get(i15));
            }
            return intent;
        }

        private a() {
        }
    }
}
