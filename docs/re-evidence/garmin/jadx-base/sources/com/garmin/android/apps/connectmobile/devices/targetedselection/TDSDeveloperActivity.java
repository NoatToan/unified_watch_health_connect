package com.garmin.android.apps.connectmobile.devices.targetedselection;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/TDSDeveloperActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "Landroid/view/View;", "view", "", "onClickAddFragment", "(Landroid/view/View;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TDSDeveloperActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fd0.d f34571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m52.k f34572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f34573c;

    static {
        new a(null);
    }

    @SuppressLint({"CommitTransaction"})
    public final void onClickAddFragment(View view2) {
        view2.getClass();
        if (this.f34571a != null) {
            Button button = this.f34573c;
            if (button == null) {
                s.m("mButton");
                throw null;
            }
            button.setEnabled(false);
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            k.a aVar2 = k.f34608l;
            fd0.d dVar = this.f34571a;
            dVar.getClass();
            m52.k kVar = this.f34572b;
            com.garmin.android.library.mapsdkadapter.i.b bVar = this.f34571a == fd0.d.COURSES ? com.garmin.android.library.mapsdkadapter.i.b.WGS84 : null;
            f0 f0Var = new f0(false, false, false, false, false, false, false, false, false, false, false, false, null, null, 16383, null);
            aVar2.getClass();
            aVar.l(R.id.fragment_container, k.a.a(dVar, kVar, bVar, f0Var), null);
            aVar.d(null);
            aVar.e();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"SetTextI18n"})
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        Object serializableExtra2;
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.activity_targeted_device_selection_developer);
        initActionBar(true, "TDS");
        View viewFindViewById = findViewById(R.id.bttn);
        viewFindViewById.getClass();
        this.f34573c = (Button) viewFindViewById;
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("arg.module.type", fd0.d.class) : null;
        } else {
            Object serializableExtra3 = intent != null ? intent.getSerializableExtra("arg.module.type") : null;
            if (!(serializableExtra3 instanceof fd0.d)) {
                serializableExtra3 = null;
            }
            serializableExtra = (fd0.d) serializableExtra3;
        }
        this.f34571a = (fd0.d) serializableExtra;
        Intent intent2 = getIntent();
        if (i14 >= 33) {
            serializableExtra2 = intent2 != null ? intent2.getSerializableExtra("arg.sport.type", m52.k.class) : null;
        } else {
            Object serializableExtra4 = intent2 != null ? intent2.getSerializableExtra("arg.sport.type") : null;
            if (!(serializableExtra4 instanceof m52.k)) {
                serializableExtra4 = null;
            }
            serializableExtra2 = (m52.k) serializableExtra4;
        }
        this.f34572b = (m52.k) serializableExtra2;
        TextView textView = (TextView) findViewById(R.id.text);
        fd0.d dVar = this.f34571a;
        String strName = dVar != null ? dVar.name() : null;
        m52.k kVar = this.f34572b;
        if ((kVar != null ? kVar.f116768d : null) != null) {
            kVar.getClass();
            str = ":" + kVar.f116768d;
        } else {
            str = "";
        }
        textView.setText(strName + str);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/TDSDeveloperActivity$a;", "", "<init>", "()V", "", "ARG_MODULE_TYPE", "Ljava/lang/String;", "ARG_SPORT_TYPE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
