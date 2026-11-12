package com.garmin.android.apps.connectmobile.setup.presentation;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d;
import com.garmin.android.apps.connectmobile.i2;
import e11.f0;
import gl1.z;
import java.util.Iterator;
import kl1.c;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import p13.w;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/setup/presentation/RecordActivitySettingsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RecordActivitySettingsActivity extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f44210b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44211a = m.a(n.NONE, new b(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f44213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f44214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f44215d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f44212a = gVar;
            this.f44213b = qualifier;
            this.f44214c = aVar;
            this.f44215d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, gl1.z] */
        @Override // e23.a
        public final z invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f44212a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f44214c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(z.class), viewModelStore, null, defaultViewModelCreationExtras, this.f44213b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f44215d, 4, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Long lValueOf;
        Object next;
        Iterable iterableC;
        Bundle extras;
        super.onCreate(bundle);
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            long j8 = extras2.getLong("extra_device_id");
            lValueOf = Long.valueOf(j8);
            if (j8 <= 0) {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        if (lValueOf == null && (extras = getIntent().getExtras()) != null && extras.containsKey("extra_device_id")) {
            a2 a2Var = a2.RECORD_ACTIVITY;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "RecordActivitySettingsActivity", "Invalid device ID provided in intent extras.");
            displayFailedMessage();
            finish();
            return;
        }
        Bundle extras3 = getIntent().getExtras();
        String string = extras3 != null ? extras3.getString("extra_activity_type_key") : null;
        c.f105264a.getClass();
        Iterator<T> it = il1.a.f93986m.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            il1.a aVar = (il1.a) next;
            c.f105264a.getClass();
            aVar.getClass();
            int i14 = c.C2027c.f105274b[aVar.ordinal()];
            if (i14 == 1) {
                iterableC = w.c("running");
            } else if (i14 == 2) {
                iterableC = w.c("cycling");
            } else if (i14 == 3) {
                iterableC = w.c("swimming");
            } else if (i14 != 4) {
                iterableC = i14 != 5 ? j0.f134944a : w.c("walking");
            } else {
                iterableC = w.c("fitness_equipment");
            }
        } while (!h0.R(iterableC, string));
        il1.a aVar2 = (il1.a) next;
        String str = aVar2 != null ? aVar2.f93987a : null;
        i2.f36769a.getClass();
        i2.a.b(a2.RECORD_ACTIVITY, "RecordActivitySettingsActivity", "Record Activity flow started with initialDeviceId=" + lValueOf + ", initialSelectedSportType=" + str);
        initComposeScreen(new e(551550813, true, new f0(lValueOf, str, 25, this)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/setup/presentation/RecordActivitySettingsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_DEVICE_ID", "EXTRA_ACTIVITY_TYPE_KEY", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
