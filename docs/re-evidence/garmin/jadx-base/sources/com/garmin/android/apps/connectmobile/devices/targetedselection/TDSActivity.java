package com.garmin.android.apps.connectmobile.devices.targetedselection;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.f0;
import java.io.Serializable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/TDSActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TDSActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f34565f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fd0.d f34566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m52.k f34567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f0 f34568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.i.b f34569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k30.h f34570e;

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"CommitTransaction"})
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        Object serializableExtra2;
        Object serializableExtra3;
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("arg.module.type", fd0.d.class) : null;
        } else {
            Serializable serializableExtra4 = intent != null ? intent.getSerializableExtra("arg.module.type") : null;
            if (!(serializableExtra4 instanceof fd0.d)) {
                serializableExtra4 = null;
            }
            serializableExtra = (fd0.d) serializableExtra4;
        }
        serializableExtra.getClass();
        this.f34566a = (fd0.d) serializableExtra;
        if (i14 >= 33) {
            serializableExtra2 = intent != null ? intent.getSerializableExtra("arg.sport.type", m52.k.class) : null;
        } else {
            Object serializableExtra5 = intent != null ? intent.getSerializableExtra("arg.sport.type") : null;
            if (!(serializableExtra5 instanceof m52.k)) {
                serializableExtra5 = null;
            }
            serializableExtra2 = (m52.k) serializableExtra5;
        }
        this.f34567b = (m52.k) serializableExtra2;
        if (i14 >= 33) {
            serializableExtra3 = intent != null ? intent.getSerializableExtra("arg.course.coordinate.system", com.garmin.android.library.mapsdkadapter.i.b.class) : null;
        } else {
            Object serializableExtra6 = intent != null ? intent.getSerializableExtra("arg.course.coordinate.system") : null;
            if (!(serializableExtra6 instanceof com.garmin.android.library.mapsdkadapter.i.b)) {
                serializableExtra6 = null;
            }
            serializableExtra3 = (com.garmin.android.library.mapsdkadapter.i.b) serializableExtra6;
        }
        this.f34569d = (com.garmin.android.library.mapsdkadapter.i.b) serializableExtra3;
        if (i14 >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("arg.workout.feature.preferences", f0.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("arg.workout.feature.preferences") : null;
            if (!(parcelableExtra instanceof f0)) {
                parcelableExtra = null;
            }
            parcelable = (f0) parcelableExtra;
        }
        this.f34568c = (f0) parcelable;
        if (i14 >= 33) {
            parcelable2 = intent != null ? (Parcelable) intent.getParcelableExtra("arg.course.feature.preferences", k30.h.class) : null;
        } else {
            Parcelable parcelableExtra2 = intent != null ? intent.getParcelableExtra("arg.course.feature.preferences") : null;
            if (!(parcelableExtra2 instanceof k30.h)) {
                parcelableExtra2 = null;
            }
            parcelable2 = (k30.h) parcelableExtra2;
        }
        this.f34570e = (k30.h) parcelable2;
        setContentView(R.layout.activity_targeted_device_selection);
        fd0.d dVar = this.f34566a;
        if (dVar == null) {
            s.m("moduleType");
            throw null;
        }
        initActionBar(false, dVar.f70467a);
        fd0.d dVar2 = this.f34566a;
        if (dVar2 == null) {
            s.m("moduleType");
            throw null;
        }
        if (dVar2 != fd0.d.COURSES && dVar2 != fd0.d.PACEPRO && dVar2 != fd0.d.POWER_GUIDE && dVar2 != fd0.d.WORKOUTS && dVar2 != fd0.d.ACTIVITY_TO_COURSE && dVar2 != fd0.d.GROUP_RIDE && dVar2 != fd0.d.TRAILS) {
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
            k.a aVar = k.f34608l;
            fd0.d dVar3 = this.f34566a;
            if (dVar3 == null) {
                s.m("moduleType");
                throw null;
            }
            m52.k kVar = this.f34567b;
            com.garmin.android.library.mapsdkadapter.i.b bVar = this.f34569d;
            f0 f0Var = this.f34568c;
            aVar.getClass();
            aVarB.l(R.id.fragment_container, k.a.a(dVar3, kVar, bVar, f0Var), null);
            aVarB.s(true, true);
            return;
        }
        v supportFragmentManager2 = getSupportFragmentManager();
        androidx.fragment.app.a aVarB2 = androidx.core.view.j.b(supportFragmentManager2, supportFragmentManager2);
        j.a aVar2 = j.f34605k;
        fd0.d dVar4 = this.f34566a;
        if (dVar4 == null) {
            s.m("moduleType");
            throw null;
        }
        m52.k kVar2 = this.f34567b;
        com.garmin.android.library.mapsdkadapter.i.b bVar2 = this.f34569d;
        f0 f0Var2 = this.f34568c;
        k30.h hVar = this.f34570e;
        aVar2.getClass();
        j jVar = new j();
        Bundle bundle2 = new Bundle(4);
        bundle2.putSerializable("arg.module.type", dVar4);
        bundle2.putSerializable("arg.sport.type", kVar2);
        bundle2.putSerializable("arg.course.coordinate.system", bVar2);
        bundle2.putParcelable("arg.workout.feature.preferences", f0Var2);
        bundle2.putParcelable("arg.course.feature.preferences", hVar);
        jVar.setArguments(bundle2);
        aVarB2.l(R.id.fragment_container, jVar, null);
        aVarB2.s(true, true);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/TDSActivity$a;", "", "<init>", "()V", "", "ARG_MODULE_TYPE", "Ljava/lang/String;", "ARG_SPORT_TYPE", "ARG_WORKOUT_FEATURE_PREFERENCES", "ARG_COURSE_FEATURE_PREFERENCES", "ARG_COURSE_COORDINATE_SYSTEM", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
