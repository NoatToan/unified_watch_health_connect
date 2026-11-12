package com.garmin.android.apps.connectmobile.traininginitiative.ui.goal;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.EventGoalActivity;
import e23.l;
import f2.o0;
import fg0.j;
import fw.p;
import fy1.i;
import fz1.k;
import lc.u0;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/goal/EventGoalActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lry1/a;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EventGoalActivity extends com.garmin.android.apps.connectmobile.c implements ry1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f45976e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m52.c f45977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f45978b = new w1(s0.f105811a.b(k.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz1.b f45979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fz1.b f45980d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45981a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45981a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f45982a;

        public c(l lVar) {
            lVar.getClass();
            this.f45982a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f45982a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45982a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45983a;

        public d(g gVar) {
            this.f45983a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45983a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45984a;

        public e(g gVar) {
            this.f45984a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45984a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f45986b;

        public f(e23.a aVar, g gVar) {
            this.f45985a = aVar;
            this.f45986b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45985a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45986b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fz1.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [fz1.b] */
    public EventGoalActivity() {
        final int i14 = 0;
        this.f45979c = new z0(this) { // from class: fz1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EventGoalActivity f73977b;

            {
                this.f73977b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                EventGoalActivity eventGoalActivity = this.f73977b;
                g3 g3Var = (g3) obj;
                switch (i15) {
                    case 0:
                        EventGoalActivity.a aVar = EventGoalActivity.f45976e;
                        g3Var.getClass();
                        int i16 = EventGoalActivity.b.f45981a[g3Var.f35300a.ordinal()];
                        if (i16 == 1) {
                            eventGoalActivity.showProgressOverlay();
                        } else if (i16 == 2) {
                            eventGoalActivity.hideProgressOverlay();
                            CalendarItemDTO calendarItemDTO = eventGoalActivity.da().f74005d;
                            if (calendarItemDTO != null) {
                                eventGoalActivity.ca(eventGoalActivity.da().x4(), calendarItemDTO, true);
                            }
                        } else if (i16 != 3) {
                            u0.r();
                        } else {
                            eventGoalActivity.hideProgressOverlay();
                        }
                        break;
                    default:
                        EventGoalActivity.a aVar2 = EventGoalActivity.f45976e;
                        g3Var.getClass();
                        int i17 = EventGoalActivity.b.f45981a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            eventGoalActivity.showProgressOverlay();
                        } else if (i17 == 2) {
                            eventGoalActivity.hideProgressOverlay();
                            if (!eventGoalActivity.da().f74009h) {
                                eventGoalActivity.setResult(-1);
                                eventGoalActivity.finish();
                            } else {
                                eventGoalActivity.da().z4().m("EventGoalAddedFragment");
                            }
                        } else if (i17 != 3) {
                            u0.r();
                        } else {
                            eventGoalActivity.hideProgressOverlay();
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f45980d = new z0(this) { // from class: fz1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EventGoalActivity f73977b;

            {
                this.f73977b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                EventGoalActivity eventGoalActivity = this.f73977b;
                g3 g3Var = (g3) obj;
                switch (i16) {
                    case 0:
                        EventGoalActivity.a aVar = EventGoalActivity.f45976e;
                        g3Var.getClass();
                        int i17 = EventGoalActivity.b.f45981a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            eventGoalActivity.showProgressOverlay();
                        } else if (i17 == 2) {
                            eventGoalActivity.hideProgressOverlay();
                            CalendarItemDTO calendarItemDTO = eventGoalActivity.da().f74005d;
                            if (calendarItemDTO != null) {
                                eventGoalActivity.ca(eventGoalActivity.da().x4(), calendarItemDTO, true);
                            }
                        } else if (i17 != 3) {
                            u0.r();
                        } else {
                            eventGoalActivity.hideProgressOverlay();
                        }
                        break;
                    default:
                        EventGoalActivity.a aVar2 = EventGoalActivity.f45976e;
                        g3Var.getClass();
                        int i18 = EventGoalActivity.b.f45981a[g3Var.f35300a.ordinal()];
                        if (i18 == 1) {
                            eventGoalActivity.showProgressOverlay();
                        } else if (i18 == 2) {
                            eventGoalActivity.hideProgressOverlay();
                            if (!eventGoalActivity.da().f74009h) {
                                eventGoalActivity.setResult(-1);
                                eventGoalActivity.finish();
                            } else {
                                eventGoalActivity.da().z4().m("EventGoalAddedFragment");
                            }
                        } else if (i18 != 3) {
                            u0.r();
                        } else {
                            eventGoalActivity.hideProgressOverlay();
                        }
                        break;
                }
            }
        };
    }

    public final void ca(fg0.k kVar, CalendarItemDTO calendarItemDTO, boolean z14) {
        calendarItemDTO.getClass();
        if (!da().f74010i) {
            EventDetailsActivity.f45692o.getClass();
            startActivity(EventDetailsActivity.a.b(this, calendarItemDTO, kVar, z14));
            finish();
        } else {
            Intent intent = new Intent();
            intent.putExtra("extra_show_event_added_snack_bar", true);
            setResult(-1, intent);
            finish();
        }
    }

    public final k da() {
        return (k) this.f45978b.getValue();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (da().f74012k) {
            overridePendingTransition(0, 0);
        }
    }

    @Override // ry1.a
    public final void g(int i14, String str) {
        updateActionBar(str, 2);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        Parcelable parcelable;
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 124) {
            fg0.k kVar = null;
            kVar = null;
            if (intent != null && (extras = intent.getExtras()) != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) extras.getParcelable("GCM_extra_sharable_event_dto", fg0.k.class);
                } else {
                    Parcelable parcelable2 = extras.getParcelable("GCM_extra_sharable_event_dto");
                    parcelable = (fg0.k) (parcelable2 instanceof fg0.k ? parcelable2 : null);
                }
                kVar = (fg0.k) parcelable;
            }
            if (kVar == null || da().f74005d == null) {
                finish();
                return;
            }
            CalendarItemDTO calendarItemDTO = da().f74005d;
            calendarItemDTO.getClass();
            Bundle extras2 = intent.getExtras();
            ca(kVar, calendarItemDTO, extras2 != null ? extras2.getBoolean("extra_show_event_added_snack_bar") : false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0186  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        Parcelable parcelable4;
        String string;
        Object serializable;
        super.onCreate(bundle);
        setContentView();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            da().f74010i = extras.getBoolean("GCM_extra_is_add_to_calendar", false);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_extra_sharable_event_dto", fg0.k.class);
            } else {
                Parcelable parcelable5 = extras.getParcelable("GCM_extra_sharable_event_dto");
                if (!(parcelable5 instanceof fg0.k)) {
                    parcelable5 = null;
                }
                parcelable = (fg0.k) parcelable5;
            }
            fg0.k kVar = (fg0.k) parcelable;
            if (kVar != null) {
                da().f74004c = kVar;
            }
            boolean z14 = extras.getBoolean("extra_launch_fbt_triathlon_goal_selection", false);
            boolean z15 = extras.getBoolean("extra_launch_fbt_triathlon_leg_goal_review", false);
            boolean z16 = extras.getBoolean("extra_launch_fbt_triathlon_overall_time_goal", false);
            da().f74012k = z14 || z15 || z16;
            da().f74013l = extras.getBoolean("extra_is_fbt_flow_back_navigation", false);
            da().f74014m = extras.getBoolean("extra_is_fbt_editing", false);
            da().f74015n = extras.getBoolean("extra_is_fbt_editing_leg_goal", false);
            da().f74016o = extras.getBoolean("extra_fbt_only_allow_finish", false);
            da().f74017p = extras.getString("extra_fbt_custom_goal_selection_title");
            if (i14 >= 33) {
                parcelable2 = (Parcelable) extras.getParcelable("extra_triathlon_goal_steps", fy1.d.class);
            } else {
                Parcelable parcelable6 = extras.getParcelable("extra_triathlon_goal_steps");
                if (!(parcelable6 instanceof fy1.d)) {
                    parcelable6 = null;
                }
                parcelable2 = (fy1.d) parcelable6;
            }
            fy1.d dVar = (fy1.d) parcelable2;
            if (dVar != null) {
                da().f74018q = dVar;
            }
            da().f74019r = extras.getInt("extra_fbt_setup_flow_total_steps", 0);
            da().f74008g = extras.getInt("extra_no_upcoming_event", 0);
            da().f74020t = extras.getBoolean("extra_should_hide_primary_event_section", false);
            k kVarDa = da();
            if (i14 >= 33) {
                parcelable3 = (Parcelable) extras.getParcelable("extras_event_customization", j.class);
            } else {
                Parcelable parcelable7 = extras.getParcelable("extras_event_customization");
                if (!(parcelable7 instanceof j)) {
                    parcelable7 = null;
                }
                parcelable3 = (j) parcelable7;
            }
            kVarDa.f74021v = (j) parcelable3;
            if (i14 >= 33) {
                parcelable4 = (Parcelable) extras.getParcelable("GCM_calendar_items", CalendarItemDTO.class);
            } else {
                Parcelable parcelable8 = extras.getParcelable("GCM_calendar_items");
                if (!(parcelable8 instanceof CalendarItemDTO)) {
                    parcelable8 = null;
                }
                parcelable4 = (CalendarItemDTO) parcelable8;
            }
            CalendarItemDTO calendarItemDTO = (CalendarItemDTO) parcelable4;
            if (calendarItemDTO != null) {
                da().f74005d = calendarItemDTO;
            }
            if (z14) {
                string = "EventGoalTypeFragment";
            } else if (z15) {
                string = "EventLegGoalReviewFragment";
            } else {
                string = z16 ? "EventGoalDetailsFragment" : extras.getString("fragment_tag");
            }
            k kVarDa2 = da();
            if (string == null) {
                kVarDa2.z4().m("EventGoalTypeFragment");
            } else {
                int iHashCode = string.hashCode();
                if (iHashCode != -657893280) {
                    if (iHashCode != -436349371) {
                        if (iHashCode == 1842448399 && string.equals("EventLegGoalReviewFragment")) {
                            kVarDa2.z4().m("EventLegGoalReviewFragment");
                        } else {
                            kVarDa2.z4().m("EventGoalTypeFragment");
                        }
                    } else if (string.equals("EventGoalDetailsFragment")) {
                        kVarDa2.z4().m("EventGoalDetailsFragment");
                    } else {
                        kVarDa2.z4().m("EventGoalTypeFragment");
                    }
                } else if (string.equals("EventGoalSetUpFragment")) {
                    kVarDa2.f74009h = true;
                    kVarDa2.z4().m("EventGoalSetUpFragment");
                } else {
                    kVarDa2.z4().m("EventGoalTypeFragment");
                }
            }
            if (i14 >= 33) {
                serializable = extras.getSerializable("LEG_TARGET_TYPE", m52.c.class);
            } else {
                Object serializable2 = extras.getSerializable("LEG_TARGET_TYPE");
                serializable = (m52.c) (serializable2 instanceof m52.c ? serializable2 : null);
            }
            this.f45977a = (m52.c) serializable;
        }
        if (da().f74012k) {
            overridePendingTransition(0, 0);
        }
        initActionBar(true, getString((da().f74012k || da().f74014m) ? R.string.set_goals_title : R.string.event_goal));
        da().f74023x.f(this, new c(new o0(this, 24)));
        da().B.f(this, this.f45979c);
        da().f74025z.f(this, this.f45980d);
        m52.c cVar = this.f45977a;
        if (cVar != null) {
            da().F4(cVar, ng0.a.DETAILS_SCREEN_VIEW);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        if (!da().D4() || da().f74014m) {
            return false;
        }
        getMenuInflater().inflate(R.menu.menu_exit, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_exit) {
            return super.onOptionsItemSelected(menuItem);
        }
        i.f73924a.getClass();
        i.a.u(this, null);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/goal/EventGoalActivity$a;", "", "<init>", "()V", "", "LAUNCH_EVENT_GOAL_FROM_EVENT_DETAILS", "I", "LAUNCH_FROM_EVENT_GOAL_SET_UP", "", "FRAGMENT_TAG", "Ljava/lang/String;", "LEG_TARGET_TYPE", "EXTRA_NO_UPCOMING_EVENT", "EXTRA_LAUNCH_FBT_TRIATHLON_GOAL_SELECTION", "EXTRA_LAUNCH_FBT_TRIATHLON_LEG_GOAL_REVIEW", "EXTRA_LAUNCH_FBT_TRIATHLON_OVERALL_TIME_GOAL", "EXTRA_IS_FBT_FLOW_BACK_NAVIGATION", "EXTRA_FBT_TRIATHLON_GOAL_STEPS", "EXTRA_IS_FBT_EDITING", "EXTRA_IS_FBT_EDITING_LEG_GOAL", "EXTRA_FBT_ONLY_ALLOW_FINISH", "EXTRA_FBT_CUSTOM_GOAL_SELECTION_TITLE", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, fg0.k kVar, CalendarItemDTO calendarItemDTO, int i14, boolean z14, j jVar) {
            kVar.getClass();
            calendarItemDTO.getClass();
            Intent intent = new Intent(context, (Class<?>) EventGoalActivity.class);
            intent.putExtra("GCM_extra_sharable_event_dto", kVar);
            intent.putExtra("GCM_calendar_items", calendarItemDTO);
            intent.putExtra("extra_no_upcoming_event", i14);
            intent.putExtra("extra_should_hide_primary_event_section", z14);
            intent.putExtra("extras_event_customization", jVar);
            intent.putExtra("fragment_tag", "EventGoalSetUpFragment");
            intent.putExtra("GCM_extra_is_add_to_calendar", true);
            return intent;
        }

        private a() {
        }
    }
}
