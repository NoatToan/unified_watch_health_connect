package com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ch1.v4;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import p005kotlin.Metadata;
import vk1.j;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/TrainingMethodActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Ljava/util/Observer;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrainingMethodActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f44085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f44086b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44087a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.HR_MAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.HR_RESERVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.LACTATE_THRESHOLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44087a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (this.f44086b != this.f44085a) {
            Intent intent = new Intent("android.intent.action.EDIT");
            intent.putExtra("CURRENT_TRAINING_METHOD_EXTRA", this.f44086b);
            setResult(-1, intent);
        }
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        initActionBar(true, R.string.heart_rate_zones_training_method);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("CURRENT_TRAINING_METHOD_EXTRA", j.class) : null;
        } else {
            Object serializableExtra2 = intent != null ? intent.getSerializableExtra("CURRENT_TRAINING_METHOD_EXTRA") : null;
            if (!(serializableExtra2 instanceof j)) {
                serializableExtra2 = null;
            }
            serializableExtra = (j) serializableExtra2;
        }
        j jVar = (j) serializableExtra;
        this.f44085a = jVar;
        if (jVar == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            aVar.getClass();
            i2.a.f(a2Var, "TrainingMethodActivity", "Missing training method parameter");
            finish();
            return;
        }
        this.f44086b = jVar;
        String stringExtra = getIntent().getStringExtra("GCM_deviceProductNbr");
        vk1.c cVar = vk1.c.f178593a;
        j[] jVarArr = (j[]) j.f178640h.toArray(new j[0]);
        ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(jVarArr, jVarArr.length)));
        if (stringExtra != null && stringExtra.length() != 0) {
            u0 u0Var = (u0) u0.f203782n6.get(stringExtra);
            int i14 = u0Var == null ? -1 : vk1.c.a.f178595b[u0Var.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4 || i14 == 5) {
                arrayList.remove(j.LACTATE_THRESHOLD);
            }
        }
        v4 v4Var = new v4(this, arrayList);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.gcm3_training_method_help_content, (ViewGroup) null, false);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i15 = b.f44087a[((j) it.next()).ordinal()];
            if (i15 == 1) {
                viewInflate.findViewById(R.id.title_percent_max_hr).setVisibility(0);
                viewInflate.findViewById(R.id.description_percent_max_hr).setVisibility(0);
            } else if (i15 == 2) {
                viewInflate.findViewById(R.id.title_percent_hr_reserve).setVisibility(0);
                viewInflate.findViewById(R.id.description_percent_hr_reserve).setVisibility(0);
            } else if (i15 == 3) {
                viewInflate.findViewById(R.id.title_percent_lactate_hr).setVisibility(0);
                viewInflate.findViewById(R.id.description_percent_lactate_hr).setVisibility(0);
            }
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        linearLayout.addView(v4Var.a());
        linearLayout.addView(viewInflate);
        j jVar2 = this.f44085a;
        jVar2.getClass();
        boolean zY = v4Var.y(findViewById(v4.f27484h), this, jVar2);
        v4Var.addObserver(this);
        v4Var.m(zY);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        obj.getClass();
        if (obj instanceof j) {
            this.f44086b = (j) obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/TrainingMethodActivity$a;", "", "<init>", "()V", "", "CURRENT_TRAINING_METHOD_EXTRA", "Ljava/lang/String;", "TAG", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
