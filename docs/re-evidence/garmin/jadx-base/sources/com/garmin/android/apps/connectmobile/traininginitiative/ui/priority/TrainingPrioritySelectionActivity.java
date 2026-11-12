package com.garmin.android.apps.connectmobile.traininginitiative.ui.priority;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import e23.l;
import fg0.j;
import fg0.k;
import iz1.i;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/priority/TrainingPrioritySelectionActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lry1/a;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrainingPrioritySelectionActivity extends com.garmin.android.apps.connectmobile.c implements ry1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46174b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f46175a = new w1(s0.f105811a.b(i.class), new d(this), new c(this), new e(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f46176a;

        public b(l lVar) {
            lVar.getClass();
            this.f46176a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f46176a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46176a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f46177a;

        public c(g gVar) {
            this.f46177a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46177a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f46178a;

        public d(g gVar) {
            this.f46178a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46178a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f46180b;

        public e(e23.a aVar, g gVar) {
            this.f46179a = aVar;
            this.f46180b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46179a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46180b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final i ca() {
        return (i) this.f46175a.getValue();
    }

    public final void da(Fragment fragment, String str) {
        str.getClass();
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.content_frame, fragment, str);
        aVar.d(str);
        aVar.e();
    }

    @Override // ry1.a
    public final void g(int i14, String str) {
        updateActionBar(str, 2);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        setContentView();
        initActionBar(true, getString(R.string.training_priority));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_extra_sharable_event_dto", k.class);
            } else {
                Parcelable parcelable3 = extras.getParcelable("GCM_extra_sharable_event_dto");
                if (!(parcelable3 instanceof k)) {
                    parcelable3 = null;
                }
                parcelable = (k) parcelable3;
            }
            k kVar = (k) parcelable;
            if (kVar != null) {
                ca().I = kVar;
                i iVarCa = ca();
                j eventCustomization = kVar.getEventCustomization();
                iVarCa.P = eventCustomization != null ? j.b(eventCustomization, null, null, null, null, null, null, 8191) : null;
            }
            if (i14 >= 33) {
                parcelable2 = (Parcelable) extras.getParcelable("GCM_calendar_items", CalendarItemDTO.class);
            } else {
                Parcelable parcelable4 = extras.getParcelable("GCM_calendar_items");
                parcelable2 = (CalendarItemDTO) (parcelable4 instanceof CalendarItemDTO ? parcelable4 : null);
            }
            CalendarItemDTO calendarItemDTO = (CalendarItemDTO) parcelable2;
            if (calendarItemDTO != null) {
                ca().T = calendarItemDTO;
            }
            ca().Z = extras.getBoolean("GCM_extra_is_add_to_calendar", false);
            ca().X = extras.getBoolean("extra_navigating_from_goal_setup", false);
            ca().Y = extras.getBoolean("extra_navigating_from_goal_setup_not_now", false);
            ca().H0 = extras.getBoolean("extra_should_hide_primary_event_section", false);
            ca().f95876k0 = extras.getBoolean("extras_navigating_from_event_details", false);
        }
        ca().K0.f(this, new b(new ho0.g(this, 29)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/priority/TrainingPrioritySelectionActivity$a;", "", "<init>", "()V", "", "EXTRA_NAVIGATING_FROM_GOAL_SETUP", "Ljava/lang/String;", "EXTRA_NAVIGATING_FROM_GOAL_SETUP_NOT_NOW", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, k kVar, boolean z14, boolean z15) {
            kVar.getClass();
            Intent intent = new Intent(context, (Class<?>) TrainingPrioritySelectionActivity.class);
            intent.putExtra("GCM_extra_sharable_event_dto", kVar);
            intent.putExtra("extra_should_hide_primary_event_section", z14);
            intent.putExtra("extras_navigating_from_event_details", z15);
            return intent;
        }

        private a() {
        }
    }
}
