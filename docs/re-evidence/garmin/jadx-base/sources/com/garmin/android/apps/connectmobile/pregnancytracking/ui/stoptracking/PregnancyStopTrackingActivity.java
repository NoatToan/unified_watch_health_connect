package com.garmin.android.apps.connectmobile.pregnancytracking.ui.stoptracking;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.core.view.j;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.stoptracking.PregnancyStopTrackingActivity;
import e23.l;
import fw.p;
import o13.h;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import r70.n;
import rb1.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/stoptracking/PregnancyStopTrackingActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PregnancyStopTrackingActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f41001d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f41002a = m.b(new n(15));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f41003b = new w1(s0.f105811a.b(g.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public eb1.e f41004c = eb1.e.REASON;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f41006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f41007c;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41005a = iArr;
            int[] iArr2 = new int[eb1.d.values().length];
            try {
                iArr2[eb1.d.HAD_BABY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[eb1.d.EXPERIENCED_LOSS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f41006b = iArr2;
            int[] iArr3 = new int[eb1.e.values().length];
            try {
                iArr3[eb1.e.REASON.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[eb1.e.CALENDAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[eb1.e.NOTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f41007c = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f41008a;

        public c(l lVar) {
            lVar.getClass();
            this.f41008a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f41008a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f41008a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f41009a;

        public d(b.g gVar) {
            this.f41009a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f41009a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f41010a;

        public e(b.g gVar) {
            this.f41010a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f41010a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f41011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f41012b;

        public f(e23.a aVar, b.g gVar) {
            this.f41011a = aVar;
            this.f41012b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f41011a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f41012b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static void ea(PregnancyStopTrackingActivity pregnancyStopTrackingActivity) {
        dh.b.L(pregnancyStopTrackingActivity.ca().C4(), pregnancyStopTrackingActivity, new c(new rb1.c(pregnancyStopTrackingActivity, 3)));
        pregnancyStopTrackingActivity.ca().D4(false);
    }

    public final g ca() {
        return (g) this.f41003b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void da(boolean z14) {
        int i14 = b.f41007c[this.f41004c.ordinal()];
        o13.p pVar = null;
        Object[] objArr = 0;
        int i15 = 1;
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    Toast.makeText(this, "You are done", 0).show();
                    return;
                } else {
                    ea(this);
                    return;
                }
            }
            ca().f151622c = z14;
            rb1.a aVar = new rb1.a();
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            aVar2.d("PregnancyNotesFragment");
            aVar2.l(R.id.stop_pregnancy_container, aVar, null);
            aVar2.e();
            this.f41004c = eb1.e.NOTES;
            return;
        }
        int i16 = b.f41006b[ca().f151621b.ordinal()];
        if (i16 != 1 && i16 != 2) {
            androidx.appcompat.app.e eVarD = c22.f.d(c22.f.f23050a, this, getString(R.string.pregnancy_stop_pregnancy_tracking), getString(R.string.pregnancy_cannot_be_resumed), new o13.p(getString(R.string.pregnancy_stop_tracking), new r12.a(this, 11)), new o13.p(getString(R.string.lbl_cancel), new r72.g((byte) 0, 14)), null, false, 96);
            eVarD.setOnShowListener(new c22.e(this, 5));
            eVarD.show();
            return;
        }
        rb1.f fVar = new rb1.f(pVar, i15, objArr == true ? 1 : 0);
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager2);
        aVar3.d("PregnancyStopTrackingCalendarFragment");
        aVar3.l(R.id.stop_pregnancy_container, fVar, null);
        aVar3.e();
        this.f41004c = eb1.e.CALENDAR;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().M() <= 0) {
            finish();
            return;
        }
        getSupportFragmentManager().Z();
        eb1.e.a aVar = eb1.e.f63669a;
        int iOrdinal = this.f41004c.ordinal() - 1;
        aVar.getClass();
        eb1.e eVar = eb1.e.CALENDAR;
        if (iOrdinal != eVar.ordinal()) {
            eVar = eb1.e.NOTES;
            if (iOrdinal != eVar.ordinal()) {
                eVar = eb1.e.CYCLE_TRACKING;
                if (iOrdinal != eVar.ordinal()) {
                    eVar = eb1.e.REASON;
                }
            }
        }
        this.f41004c = eVar;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.activity_stop_pregnancy);
        initActionBar(R.string.pregnancy_stop_tracking, 2);
        if (bundle != null) {
            eb1.e.a aVar = eb1.e.f63669a;
            int i14 = bundle.getInt("EXTRA_CURRENT_STEP");
            aVar.getClass();
            eb1.e eVar = eb1.e.CALENDAR;
            if (i14 != eVar.ordinal()) {
                eVar = eb1.e.NOTES;
                if (i14 != eVar.ordinal()) {
                    eVar = eb1.e.CYCLE_TRACKING;
                    if (i14 != eVar.ordinal()) {
                        eVar = eb1.e.REASON;
                    }
                }
            }
            this.f41004c = eVar;
        }
        boolean zHasExtra = getIntent().hasExtra("EXTRA_PREGNANCY_SNAPSHOT");
        t tVar = this.f41002a;
        if (zHasExtra) {
            ((Logger) tVar.getValue()).debug("Intent has pregnancy snapshot DTO");
            g gVarCa = ca();
            Intent intent = getIntent();
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("EXTRA_PREGNANCY_SNAPSHOT", db1.m.class) : null;
            } else {
                Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("EXTRA_PREGNANCY_SNAPSHOT") : null;
                if (!(parcelableExtra instanceof db1.m)) {
                    parcelableExtra = null;
                }
                parcelable = (db1.m) parcelableExtra;
            }
            gVarCa.f151620a = (db1.m) parcelable;
        } else {
            ((Logger) tVar.getValue()).debug("Intent does not have pregnancy snapshot DTO, starting API call");
            ca().A4().f(this, new c(new rb1.c(this, 1)));
            ca().B4();
        }
        ((y0) ca().f151625f.getValue()).f(this, new c(new rb1.c(this, 2)));
        final int i15 = 0;
        ((Button) findViewById(R.id.stop_pregnancy_next_button)).setOnClickListener(new View.OnClickListener(this) { // from class: rb1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PregnancyStopTrackingActivity f151598b;

            {
                this.f151598b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                PregnancyStopTrackingActivity pregnancyStopTrackingActivity = this.f151598b;
                switch (i16) {
                    case 0:
                        PregnancyStopTrackingActivity.a aVar2 = PregnancyStopTrackingActivity.f41001d;
                        pregnancyStopTrackingActivity.da(false);
                        break;
                    default:
                        PregnancyStopTrackingActivity.a aVar3 = PregnancyStopTrackingActivity.f41001d;
                        pregnancyStopTrackingActivity.da(true);
                        break;
                }
            }
        });
        final int i16 = 1;
        ((Button) findViewById(R.id.stop_pregnancy_skip_button)).setOnClickListener(new View.OnClickListener(this) { // from class: rb1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PregnancyStopTrackingActivity f151598b;

            {
                this.f151598b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i16;
                PregnancyStopTrackingActivity pregnancyStopTrackingActivity = this.f151598b;
                switch (i17) {
                    case 0:
                        PregnancyStopTrackingActivity.a aVar2 = PregnancyStopTrackingActivity.f41001d;
                        pregnancyStopTrackingActivity.da(false);
                        break;
                    default:
                        PregnancyStopTrackingActivity.a aVar3 = PregnancyStopTrackingActivity.f41001d;
                        pregnancyStopTrackingActivity.da(true);
                        break;
                }
            }
        });
        if (this.f41004c != eb1.e.REASON) {
            da(false);
            return;
        }
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        aVarB.j(R.id.stop_pregnancy_container, new rb1.b(), null, 1);
        aVarB.e();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        bundle.getClass();
        persistableBundle.getClass();
        super.onSaveInstanceState(bundle, persistableBundle);
        bundle.putInt("EXTRA_CURRENT_STEP", this.f41004c.ordinal());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/stoptracking/PregnancyStopTrackingActivity$a;", "", "<init>", "()V", "", "EXTRA_CURRENT_STEP", "Ljava/lang/String;", "EXTRA_PREGNANCY_SNAPSHOT", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, db1.m mVar) {
            Intent intent = new Intent(context, (Class<?>) PregnancyStopTrackingActivity.class);
            if (mVar != null) {
                intent.putExtra("EXTRA_PREGNANCY_SNAPSHOT", mVar);
            }
            context.startActivity(intent);
        }

        private a() {
        }
    }
}
