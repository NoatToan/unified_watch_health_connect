package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mz1.a1;
import mz1.e0;
import mz1.h0;
import mz1.t0;
import mz1.x0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import z10.p3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/EventDetailsActivity;", "Lz10/p3;", "Lry1/a;", "Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/b$b;", "Lca1/d$c;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EventDetailsActivity extends p3 implements ry1.a, com.garmin.android.apps.connectmobile.traininginitiative.ui.b.InterfaceC0884b, ca1.d.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f45692o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static EventDetailsActivity f45693p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f45694c = new w1(s0.f105811a.b(e0.class), new d(this), new c(this), new e(null, this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CalendarItemDTO f45695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fg0.k f45696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f45700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ty1.g f45701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ty1.g f45702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ty1.g f45703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ty1.g f45704m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ty1.g f45705n;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45706a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45706a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f45707a;

        public c(b.g gVar) {
            this.f45707a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45707a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f45708a;

        public d(b.g gVar) {
            this.f45708a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45708a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f45710b;

        public e(e23.a aVar, b.g gVar) {
            this.f45709a = aVar;
            this.f45710b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45709a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45710b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ty1.g] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ty1.g] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ty1.g] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ty1.g] */
    /* JADX WARN: Type inference failed for: r0v5, types: [ty1.g] */
    public EventDetailsActivity() {
        final int i14 = 0;
        this.f45701j = new z0(this) { // from class: ty1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EventDetailsActivity f167111b;

            {
                this.f167111b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                Boolean bool;
                int i15 = i14;
                EventDetailsActivity eventDetailsActivity = this.f167111b;
                switch (i15) {
                    case 0:
                        fg0.k kVar = (fg0.k) obj;
                        EventDetailsActivity.a aVar = EventDetailsActivity.f45692o;
                        if (kVar != null) {
                            if (kVar.getLocationStartPoint() != null) {
                                eventDetailsActivity.initActionBar(true, R.string.lbl_event);
                            } else {
                                eventDetailsActivity.initActionBar(true, R.string.virtual_event_title);
                            }
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        EventDetailsActivity.a aVar2 = EventDetailsActivity.f45692o;
                        str.getClass();
                        eventDetailsActivity.showActionBar();
                        switch (str.hashCode()) {
                            case -1205557300:
                                if (str.equals("TILinkActivitiesFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w.getClass();
                                    eventDetailsActivity.na(new com.garmin.android.apps.connectmobile.traininginitiative.ui.x(), str);
                                    break;
                                }
                                break;
                            case -765418137:
                                if (str.equals("TIEventDetailsBlankFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.w.f46309a.getClass();
                                    eventDetailsActivity.na(new com.garmin.android.apps.connectmobile.traininginitiative.ui.w(), str);
                                    break;
                                }
                                break;
                            case -45643560:
                                if (str.equals("EventDetailsFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                                    boolean z14 = eventDetailsActivity.f45700i;
                                    boolean z15 = eventDetailsActivity.f45698g;
                                    c0883a.getClass();
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar3 = new com.garmin.android.apps.connectmobile.traininginitiative.ui.a();
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("GCM_extra_show_strategy_tab", z14);
                                    bundle.putBoolean("GCM_extra_is_find_an_event", z15);
                                    aVar3.setArguments(bundle);
                                    eventDetailsActivity.na(aVar3, str);
                                }
                                break;
                            case 1924251799:
                                if (str.equals("TIAddCourseFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.h.f46056f.getClass();
                                    Bundle bundle2 = new Bundle();
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.h hVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.h();
                                    hVar.setArguments(bundle2);
                                    eventDetailsActivity.na(hVar, str);
                                    break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        v2 v2Var = (v2) obj;
                        EventDetailsActivity.a aVar4 = EventDetailsActivity.f45692o;
                        v2Var.getClass();
                        if ((v2Var instanceof v2.b) || (v2Var instanceof v2.a)) {
                            eventDetailsActivity.ma();
                        }
                        break;
                    case 3:
                        o13.p pVar = (o13.p) obj;
                        EventDetailsActivity.a aVar5 = EventDetailsActivity.f45692o;
                        pVar.getClass();
                        Boolean bool2 = (Boolean) pVar.f128594a;
                        if (!bool2.booleanValue() && eventDetailsActivity.f45698g) {
                            fg0.k kVar2 = eventDetailsActivity.f45696e;
                            if (kVar2 != null) {
                                kVar2.h1();
                            }
                            eventDetailsActivity.la().E5(eventDetailsActivity.f45696e);
                            break;
                        } else if (!bool2.booleanValue() && (bool = (Boolean) pVar.f128595b) != null) {
                            if (!bool.booleanValue()) {
                                Toast.makeText(eventDetailsActivity, R.string.txt_error_occurred, 1).show();
                                eventDetailsActivity.setResult(0);
                                eventDetailsActivity.finish();
                            } else {
                                ((androidx.lifecycle.y0) eventDetailsActivity.la().f121686h1.getValue()).m("TIEventDetailsBlankFragment");
                                new androidx.appcompat.app.e.a(eventDetailsActivity).setTitle(eventDetailsActivity.getString(R.string.lbl_event_deleted)).setMessage(eventDetailsActivity.getString(R.string.lbl_event_has_been_deleted)).setPositiveButton(R.string.lbl_ok, new sa2.b(eventDetailsActivity, 4)).setCancelable(false).show();
                            }
                            break;
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        EventDetailsActivity.a aVar6 = EventDetailsActivity.f45692o;
                        g3Var.getClass();
                        int i16 = EventDetailsActivity.b.f45706a[g3Var.f35300a.ordinal()];
                        if (i16 == 1) {
                            eventDetailsActivity.showProgressOverlay();
                            break;
                        } else if (i16 == 2) {
                            eventDetailsActivity.ma();
                            break;
                        } else if (i16 != 3) {
                            lc.u0.r();
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f45702k = new z0(this) { // from class: ty1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EventDetailsActivity f167111b;

            {
                this.f167111b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                Boolean bool;
                int i16 = i15;
                EventDetailsActivity eventDetailsActivity = this.f167111b;
                switch (i16) {
                    case 0:
                        fg0.k kVar = (fg0.k) obj;
                        EventDetailsActivity.a aVar = EventDetailsActivity.f45692o;
                        if (kVar != null) {
                            if (kVar.getLocationStartPoint() != null) {
                                eventDetailsActivity.initActionBar(true, R.string.lbl_event);
                            } else {
                                eventDetailsActivity.initActionBar(true, R.string.virtual_event_title);
                            }
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        EventDetailsActivity.a aVar2 = EventDetailsActivity.f45692o;
                        str.getClass();
                        eventDetailsActivity.showActionBar();
                        switch (str.hashCode()) {
                            case -1205557300:
                                if (str.equals("TILinkActivitiesFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w.getClass();
                                    eventDetailsActivity.na(new com.garmin.android.apps.connectmobile.traininginitiative.ui.x(), str);
                                    break;
                                }
                                break;
                            case -765418137:
                                if (str.equals("TIEventDetailsBlankFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.w.f46309a.getClass();
                                    eventDetailsActivity.na(new com.garmin.android.apps.connectmobile.traininginitiative.ui.w(), str);
                                    break;
                                }
                                break;
                            case -45643560:
                                if (str.equals("EventDetailsFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                                    boolean z14 = eventDetailsActivity.f45700i;
                                    boolean z15 = eventDetailsActivity.f45698g;
                                    c0883a.getClass();
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar3 = new com.garmin.android.apps.connectmobile.traininginitiative.ui.a();
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("GCM_extra_show_strategy_tab", z14);
                                    bundle.putBoolean("GCM_extra_is_find_an_event", z15);
                                    aVar3.setArguments(bundle);
                                    eventDetailsActivity.na(aVar3, str);
                                }
                                break;
                            case 1924251799:
                                if (str.equals("TIAddCourseFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.h.f46056f.getClass();
                                    Bundle bundle2 = new Bundle();
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.h hVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.h();
                                    hVar.setArguments(bundle2);
                                    eventDetailsActivity.na(hVar, str);
                                    break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        v2 v2Var = (v2) obj;
                        EventDetailsActivity.a aVar4 = EventDetailsActivity.f45692o;
                        v2Var.getClass();
                        if ((v2Var instanceof v2.b) || (v2Var instanceof v2.a)) {
                            eventDetailsActivity.ma();
                        }
                        break;
                    case 3:
                        o13.p pVar = (o13.p) obj;
                        EventDetailsActivity.a aVar5 = EventDetailsActivity.f45692o;
                        pVar.getClass();
                        Boolean bool2 = (Boolean) pVar.f128594a;
                        if (!bool2.booleanValue() && eventDetailsActivity.f45698g) {
                            fg0.k kVar2 = eventDetailsActivity.f45696e;
                            if (kVar2 != null) {
                                kVar2.h1();
                            }
                            eventDetailsActivity.la().E5(eventDetailsActivity.f45696e);
                            break;
                        } else if (!bool2.booleanValue() && (bool = (Boolean) pVar.f128595b) != null) {
                            if (!bool.booleanValue()) {
                                Toast.makeText(eventDetailsActivity, R.string.txt_error_occurred, 1).show();
                                eventDetailsActivity.setResult(0);
                                eventDetailsActivity.finish();
                            } else {
                                ((androidx.lifecycle.y0) eventDetailsActivity.la().f121686h1.getValue()).m("TIEventDetailsBlankFragment");
                                new androidx.appcompat.app.e.a(eventDetailsActivity).setTitle(eventDetailsActivity.getString(R.string.lbl_event_deleted)).setMessage(eventDetailsActivity.getString(R.string.lbl_event_has_been_deleted)).setPositiveButton(R.string.lbl_ok, new sa2.b(eventDetailsActivity, 4)).setCancelable(false).show();
                            }
                            break;
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        EventDetailsActivity.a aVar6 = EventDetailsActivity.f45692o;
                        g3Var.getClass();
                        int i17 = EventDetailsActivity.b.f45706a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            eventDetailsActivity.showProgressOverlay();
                            break;
                        } else if (i17 == 2) {
                            eventDetailsActivity.ma();
                            break;
                        } else if (i17 != 3) {
                            lc.u0.r();
                            break;
                        }
                        break;
                }
            }
        };
        final int i16 = 2;
        this.f45703l = new z0(this) { // from class: ty1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EventDetailsActivity f167111b;

            {
                this.f167111b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                Boolean bool;
                int i17 = i16;
                EventDetailsActivity eventDetailsActivity = this.f167111b;
                switch (i17) {
                    case 0:
                        fg0.k kVar = (fg0.k) obj;
                        EventDetailsActivity.a aVar = EventDetailsActivity.f45692o;
                        if (kVar != null) {
                            if (kVar.getLocationStartPoint() != null) {
                                eventDetailsActivity.initActionBar(true, R.string.lbl_event);
                            } else {
                                eventDetailsActivity.initActionBar(true, R.string.virtual_event_title);
                            }
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        EventDetailsActivity.a aVar2 = EventDetailsActivity.f45692o;
                        str.getClass();
                        eventDetailsActivity.showActionBar();
                        switch (str.hashCode()) {
                            case -1205557300:
                                if (str.equals("TILinkActivitiesFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w.getClass();
                                    eventDetailsActivity.na(new com.garmin.android.apps.connectmobile.traininginitiative.ui.x(), str);
                                    break;
                                }
                                break;
                            case -765418137:
                                if (str.equals("TIEventDetailsBlankFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.w.f46309a.getClass();
                                    eventDetailsActivity.na(new com.garmin.android.apps.connectmobile.traininginitiative.ui.w(), str);
                                    break;
                                }
                                break;
                            case -45643560:
                                if (str.equals("EventDetailsFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                                    boolean z14 = eventDetailsActivity.f45700i;
                                    boolean z15 = eventDetailsActivity.f45698g;
                                    c0883a.getClass();
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar3 = new com.garmin.android.apps.connectmobile.traininginitiative.ui.a();
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("GCM_extra_show_strategy_tab", z14);
                                    bundle.putBoolean("GCM_extra_is_find_an_event", z15);
                                    aVar3.setArguments(bundle);
                                    eventDetailsActivity.na(aVar3, str);
                                }
                                break;
                            case 1924251799:
                                if (str.equals("TIAddCourseFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.h.f46056f.getClass();
                                    Bundle bundle2 = new Bundle();
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.h hVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.h();
                                    hVar.setArguments(bundle2);
                                    eventDetailsActivity.na(hVar, str);
                                    break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        v2 v2Var = (v2) obj;
                        EventDetailsActivity.a aVar4 = EventDetailsActivity.f45692o;
                        v2Var.getClass();
                        if ((v2Var instanceof v2.b) || (v2Var instanceof v2.a)) {
                            eventDetailsActivity.ma();
                        }
                        break;
                    case 3:
                        o13.p pVar = (o13.p) obj;
                        EventDetailsActivity.a aVar5 = EventDetailsActivity.f45692o;
                        pVar.getClass();
                        Boolean bool2 = (Boolean) pVar.f128594a;
                        if (!bool2.booleanValue() && eventDetailsActivity.f45698g) {
                            fg0.k kVar2 = eventDetailsActivity.f45696e;
                            if (kVar2 != null) {
                                kVar2.h1();
                            }
                            eventDetailsActivity.la().E5(eventDetailsActivity.f45696e);
                            break;
                        } else if (!bool2.booleanValue() && (bool = (Boolean) pVar.f128595b) != null) {
                            if (!bool.booleanValue()) {
                                Toast.makeText(eventDetailsActivity, R.string.txt_error_occurred, 1).show();
                                eventDetailsActivity.setResult(0);
                                eventDetailsActivity.finish();
                            } else {
                                ((androidx.lifecycle.y0) eventDetailsActivity.la().f121686h1.getValue()).m("TIEventDetailsBlankFragment");
                                new androidx.appcompat.app.e.a(eventDetailsActivity).setTitle(eventDetailsActivity.getString(R.string.lbl_event_deleted)).setMessage(eventDetailsActivity.getString(R.string.lbl_event_has_been_deleted)).setPositiveButton(R.string.lbl_ok, new sa2.b(eventDetailsActivity, 4)).setCancelable(false).show();
                            }
                            break;
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        EventDetailsActivity.a aVar6 = EventDetailsActivity.f45692o;
                        g3Var.getClass();
                        int i18 = EventDetailsActivity.b.f45706a[g3Var.f35300a.ordinal()];
                        if (i18 == 1) {
                            eventDetailsActivity.showProgressOverlay();
                            break;
                        } else if (i18 == 2) {
                            eventDetailsActivity.ma();
                            break;
                        } else if (i18 != 3) {
                            lc.u0.r();
                            break;
                        }
                        break;
                }
            }
        };
        final int i17 = 3;
        this.f45704m = new z0(this) { // from class: ty1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EventDetailsActivity f167111b;

            {
                this.f167111b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                Boolean bool;
                int i18 = i17;
                EventDetailsActivity eventDetailsActivity = this.f167111b;
                switch (i18) {
                    case 0:
                        fg0.k kVar = (fg0.k) obj;
                        EventDetailsActivity.a aVar = EventDetailsActivity.f45692o;
                        if (kVar != null) {
                            if (kVar.getLocationStartPoint() != null) {
                                eventDetailsActivity.initActionBar(true, R.string.lbl_event);
                            } else {
                                eventDetailsActivity.initActionBar(true, R.string.virtual_event_title);
                            }
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        EventDetailsActivity.a aVar2 = EventDetailsActivity.f45692o;
                        str.getClass();
                        eventDetailsActivity.showActionBar();
                        switch (str.hashCode()) {
                            case -1205557300:
                                if (str.equals("TILinkActivitiesFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w.getClass();
                                    eventDetailsActivity.na(new com.garmin.android.apps.connectmobile.traininginitiative.ui.x(), str);
                                    break;
                                }
                                break;
                            case -765418137:
                                if (str.equals("TIEventDetailsBlankFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.w.f46309a.getClass();
                                    eventDetailsActivity.na(new com.garmin.android.apps.connectmobile.traininginitiative.ui.w(), str);
                                    break;
                                }
                                break;
                            case -45643560:
                                if (str.equals("EventDetailsFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                                    boolean z14 = eventDetailsActivity.f45700i;
                                    boolean z15 = eventDetailsActivity.f45698g;
                                    c0883a.getClass();
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar3 = new com.garmin.android.apps.connectmobile.traininginitiative.ui.a();
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("GCM_extra_show_strategy_tab", z14);
                                    bundle.putBoolean("GCM_extra_is_find_an_event", z15);
                                    aVar3.setArguments(bundle);
                                    eventDetailsActivity.na(aVar3, str);
                                }
                                break;
                            case 1924251799:
                                if (str.equals("TIAddCourseFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.h.f46056f.getClass();
                                    Bundle bundle2 = new Bundle();
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.h hVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.h();
                                    hVar.setArguments(bundle2);
                                    eventDetailsActivity.na(hVar, str);
                                    break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        v2 v2Var = (v2) obj;
                        EventDetailsActivity.a aVar4 = EventDetailsActivity.f45692o;
                        v2Var.getClass();
                        if ((v2Var instanceof v2.b) || (v2Var instanceof v2.a)) {
                            eventDetailsActivity.ma();
                        }
                        break;
                    case 3:
                        o13.p pVar = (o13.p) obj;
                        EventDetailsActivity.a aVar5 = EventDetailsActivity.f45692o;
                        pVar.getClass();
                        Boolean bool2 = (Boolean) pVar.f128594a;
                        if (!bool2.booleanValue() && eventDetailsActivity.f45698g) {
                            fg0.k kVar2 = eventDetailsActivity.f45696e;
                            if (kVar2 != null) {
                                kVar2.h1();
                            }
                            eventDetailsActivity.la().E5(eventDetailsActivity.f45696e);
                            break;
                        } else if (!bool2.booleanValue() && (bool = (Boolean) pVar.f128595b) != null) {
                            if (!bool.booleanValue()) {
                                Toast.makeText(eventDetailsActivity, R.string.txt_error_occurred, 1).show();
                                eventDetailsActivity.setResult(0);
                                eventDetailsActivity.finish();
                            } else {
                                ((androidx.lifecycle.y0) eventDetailsActivity.la().f121686h1.getValue()).m("TIEventDetailsBlankFragment");
                                new androidx.appcompat.app.e.a(eventDetailsActivity).setTitle(eventDetailsActivity.getString(R.string.lbl_event_deleted)).setMessage(eventDetailsActivity.getString(R.string.lbl_event_has_been_deleted)).setPositiveButton(R.string.lbl_ok, new sa2.b(eventDetailsActivity, 4)).setCancelable(false).show();
                            }
                            break;
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        EventDetailsActivity.a aVar6 = EventDetailsActivity.f45692o;
                        g3Var.getClass();
                        int i19 = EventDetailsActivity.b.f45706a[g3Var.f35300a.ordinal()];
                        if (i19 == 1) {
                            eventDetailsActivity.showProgressOverlay();
                            break;
                        } else if (i19 == 2) {
                            eventDetailsActivity.ma();
                            break;
                        } else if (i19 != 3) {
                            lc.u0.r();
                            break;
                        }
                        break;
                }
            }
        };
        final int i18 = 4;
        this.f45705n = new z0(this) { // from class: ty1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EventDetailsActivity f167111b;

            {
                this.f167111b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                Boolean bool;
                int i19 = i18;
                EventDetailsActivity eventDetailsActivity = this.f167111b;
                switch (i19) {
                    case 0:
                        fg0.k kVar = (fg0.k) obj;
                        EventDetailsActivity.a aVar = EventDetailsActivity.f45692o;
                        if (kVar != null) {
                            if (kVar.getLocationStartPoint() != null) {
                                eventDetailsActivity.initActionBar(true, R.string.lbl_event);
                            } else {
                                eventDetailsActivity.initActionBar(true, R.string.virtual_event_title);
                            }
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        EventDetailsActivity.a aVar2 = EventDetailsActivity.f45692o;
                        str.getClass();
                        eventDetailsActivity.showActionBar();
                        switch (str.hashCode()) {
                            case -1205557300:
                                if (str.equals("TILinkActivitiesFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w.getClass();
                                    eventDetailsActivity.na(new com.garmin.android.apps.connectmobile.traininginitiative.ui.x(), str);
                                    break;
                                }
                                break;
                            case -765418137:
                                if (str.equals("TIEventDetailsBlankFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.w.f46309a.getClass();
                                    eventDetailsActivity.na(new com.garmin.android.apps.connectmobile.traininginitiative.ui.w(), str);
                                    break;
                                }
                                break;
                            case -45643560:
                                if (str.equals("EventDetailsFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                                    boolean z14 = eventDetailsActivity.f45700i;
                                    boolean z15 = eventDetailsActivity.f45698g;
                                    c0883a.getClass();
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar3 = new com.garmin.android.apps.connectmobile.traininginitiative.ui.a();
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("GCM_extra_show_strategy_tab", z14);
                                    bundle.putBoolean("GCM_extra_is_find_an_event", z15);
                                    aVar3.setArguments(bundle);
                                    eventDetailsActivity.na(aVar3, str);
                                }
                                break;
                            case 1924251799:
                                if (str.equals("TIAddCourseFragment")) {
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.h.f46056f.getClass();
                                    Bundle bundle2 = new Bundle();
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.h hVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.h();
                                    hVar.setArguments(bundle2);
                                    eventDetailsActivity.na(hVar, str);
                                    break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        v2 v2Var = (v2) obj;
                        EventDetailsActivity.a aVar4 = EventDetailsActivity.f45692o;
                        v2Var.getClass();
                        if ((v2Var instanceof v2.b) || (v2Var instanceof v2.a)) {
                            eventDetailsActivity.ma();
                        }
                        break;
                    case 3:
                        o13.p pVar = (o13.p) obj;
                        EventDetailsActivity.a aVar5 = EventDetailsActivity.f45692o;
                        pVar.getClass();
                        Boolean bool2 = (Boolean) pVar.f128594a;
                        if (!bool2.booleanValue() && eventDetailsActivity.f45698g) {
                            fg0.k kVar2 = eventDetailsActivity.f45696e;
                            if (kVar2 != null) {
                                kVar2.h1();
                            }
                            eventDetailsActivity.la().E5(eventDetailsActivity.f45696e);
                            break;
                        } else if (!bool2.booleanValue() && (bool = (Boolean) pVar.f128595b) != null) {
                            if (!bool.booleanValue()) {
                                Toast.makeText(eventDetailsActivity, R.string.txt_error_occurred, 1).show();
                                eventDetailsActivity.setResult(0);
                                eventDetailsActivity.finish();
                            } else {
                                ((androidx.lifecycle.y0) eventDetailsActivity.la().f121686h1.getValue()).m("TIEventDetailsBlankFragment");
                                new androidx.appcompat.app.e.a(eventDetailsActivity).setTitle(eventDetailsActivity.getString(R.string.lbl_event_deleted)).setMessage(eventDetailsActivity.getString(R.string.lbl_event_has_been_deleted)).setPositiveButton(R.string.lbl_ok, new sa2.b(eventDetailsActivity, 4)).setCancelable(false).show();
                            }
                            break;
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        EventDetailsActivity.a aVar6 = EventDetailsActivity.f45692o;
                        g3Var.getClass();
                        int i110 = EventDetailsActivity.b.f45706a[g3Var.f35300a.ordinal()];
                        if (i110 == 1) {
                            eventDetailsActivity.showProgressOverlay();
                            break;
                        } else if (i110 == 2) {
                            eventDetailsActivity.ma();
                            break;
                        } else if (i110 != 3) {
                            lc.u0.r();
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override // ca1.d.c
    public final ca1.d.b M2() {
        return la();
    }

    @Override // com.garmin.android.apps.connectmobile.traininginitiative.ui.b.InterfaceC0884b
    public final void V() {
        e0 e0VarLa = la();
        jy1.b bVar = e0VarLa.T;
        List<com.garmin.android.apps.connectmobile.courses.model.e> listD = e0VarLa.f5().d();
        if (listD != null && !listD.isEmpty()) {
            bVar.j(this, listD);
            return;
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVarD = e0VarLa.e5().d();
        if (eVarD != null) {
            bVar.h(this, eVarD);
        }
    }

    @Override // z10.p3
    public final Fragment ca() {
        com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
        boolean z14 = this.f45700i;
        boolean z15 = this.f45698g;
        c0883a.getClass();
        com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.a();
        Bundle bundle = new Bundle();
        bundle.putBoolean("GCM_extra_show_strategy_tab", z14);
        bundle.putBoolean("GCM_extra_is_find_an_event", z15);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.lbl_event);
        string.getClass();
        return string;
    }

    @Override // ry1.a
    public final void g(int i14, String str) {
        updateActionBar(str, 2);
    }

    @Override // z10.p3
    public final boolean ia() {
        return true;
    }

    public final void ka(CalendarItemDTO calendarItemDTO) {
        String str;
        if (calendarItemDTO.I1 && (str = calendarItemDTO.H1) != null) {
            e0 e0VarLa = la();
            fg0.k kVar = this.f45696e;
            ge1.b.T(v1.a(e0VarLa), null, null, new a1(e0VarLa, str, kVar != null ? kVar.h() : null, null), 3);
        } else if (calendarItemDTO.f30969b != 0) {
            e0 e0VarLa2 = la();
            ge1.b.T(v1.a(e0VarLa2), null, null, new t0(e0VarLa2, calendarItemDTO.f30969b, calendarItemDTO.f30967a, null), 3);
        } else {
            e0 e0VarLa3 = la();
            ge1.b.T(v1.a(e0VarLa3), null, null, new x0(e0VarLa3, calendarItemDTO.f30967a, null), 3);
        }
    }

    public final e0 la() {
        return (e0) this.f45694c.getValue();
    }

    public final void ma() {
        Boolean eventOrganizer;
        CalendarItemDTO calendarItemDTO = this.f45695d;
        if (calendarItemDTO != null) {
            ka(calendarItemDTO);
            return;
        }
        fg0.k kVarD = la().l5().d();
        if ((kVarD == null || (eventOrganizer = kVarD.getEventOrganizer()) == null) ? false : eventOrganizer.booleanValue()) {
            fg0.k kVar = this.f45696e;
            if ((kVar != null ? kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() : null) != null) {
                fg0.k kVar2 = this.f45696e;
                Long l14 = kVar2 != null ? kVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() : null;
                l14.getClass();
                long jLongValue = l14.longValue();
                e0 e0VarLa = la();
                ge1.b.T(v1.a(e0VarLa), null, null, new x0(e0VarLa, jLongValue, null), 3);
                return;
            }
        }
        String str = this.f45697f;
        if (str != null) {
            e0 e0VarLa2 = la();
            fg0.k kVar3 = this.f45696e;
            ge1.b.T(v1.a(e0VarLa2), null, null, new a1(e0VarLa2, str, kVar3 != null ? kVar3.h() : null, null), 3);
        }
    }

    public final void na(Fragment fragment, String str) {
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarC = n23.j.c(supportFragmentManager, supportFragmentManager, R.id.content_frame, fragment, str);
        aVarC.d(str);
        aVarC.e();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Object next;
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        Bundle extras4;
        Bundle extras5;
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 || i15 == 3) {
            if (i14 == 123 || i14 == 1555) {
                String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("GCM_extra_course_id");
                if (string == null) {
                    ma();
                } else {
                    fg0.k kVar = this.f45696e;
                    if (kVar != null) {
                        e0 e0VarLa = la();
                        e0 e0VarLa2 = la();
                        if (e0VarLa2.z5()) {
                            List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH = kVar.h();
                            ArrayList arrayList = listH != null ? new ArrayList(listH) : new ArrayList();
                            Iterator it = arrayList.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next).getEventLegActivityType() != m52.c.RUNNING);
                            com.garmin.android.apps.connectmobile.workouts.data.model.k kVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
                            if (kVar2 != null) {
                                com.garmin.android.apps.connectmobile.workouts.data.model.k kVarB = com.garmin.android.apps.connectmobile.workouts.data.model.k.b(kVar2, Integer.valueOf(Integer.parseInt(string)), null, null, 62);
                                ArrayList arrayList2 = new ArrayList(arrayList);
                                ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
                                for (Object obj : arrayList2) {
                                    com.garmin.android.apps.connectmobile.workouts.data.model.k kVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) obj;
                                    int i16 = e0.K1;
                                    kVar3.getClass();
                                    if (kVar3.getLegIndex() == kVarB.getLegIndex()) {
                                        obj = kVarB;
                                    }
                                    arrayList3.add(obj);
                                }
                                kVar.x0(arrayList3);
                            }
                        } else if (e0VarLa2.y5()) {
                            kVar.z0(Long.valueOf(Long.parseLong(string)));
                        }
                        e0VarLa.M5(kVar);
                    }
                }
            }
            if (i14 == 103) {
                Intent intent2 = new Intent();
                intent2.putExtra("GCM_extra_event_updated", true);
                if (p005kotlin.jvm.internal.s.g(la().f204392i, Boolean.TRUE)) {
                    intent2.putExtra("extra_event_dashboard_refresh_needed", true);
                }
                setResult(-1, intent2);
                finish();
            }
            if (i14 == 100) {
                if (intent != null && (extras4 = intent.getExtras()) != null && extras4.get("GCM_extra_event_deleted") != null) {
                    setResult(-1, intent);
                    finish();
                }
                if (intent != null && (extras3 = intent.getExtras()) != null && extras3.get("GCM_extra_event_updated") != null) {
                    ma();
                }
                if (intent != null && (extras2 = intent.getExtras()) != null && extras2.get("GCM_extra_event_created") != null) {
                    Intent intent3 = new Intent();
                    intent3.putExtra("GCM_extra_event_created", true);
                    Boolean bool = la().f204392i;
                    Boolean bool2 = Boolean.TRUE;
                    if (p005kotlin.jvm.internal.s.g(bool, bool2)) {
                        intent3.putExtra("extra_event_dashboard_refresh_needed", true);
                    }
                    if (p005kotlin.jvm.internal.s.g(la().f204392i, bool2)) {
                        setResult(-1, intent3);
                        finish();
                    }
                }
            }
        }
        if (i15 == 2) {
            setResult(2);
            finish();
        }
        if (intent != null && (extras5 = intent.getExtras()) != null && extras5.getBoolean("extra_show_event_added_snack_bar")) {
            la().L5();
        }
        if (i14 == 1234) {
            ma();
        }
        if (i14 == 500) {
            ma();
        }
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        CalendarItemDTO calendarItemDTO;
        fg0.k kVar;
        fg0.k kVar2;
        fg0.p pVar;
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        Parcelable parcelable4;
        Parcelable parcelable5;
        Parcelable parcelable6;
        super.onCreate(bundle);
        f45692o.getClass();
        f45693p = this;
        Bundle extras = getIntent().getExtras();
        fg0.k kVar3 = null;
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("EVENT_SPORTS_LEG_LIST") : null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable6 = (Parcelable) extras.getParcelable("GCM_calendar_items", CalendarItemDTO.class);
            } else {
                Parcelable parcelable7 = extras.getParcelable("GCM_calendar_items");
                if (!(parcelable7 instanceof CalendarItemDTO)) {
                    parcelable7 = null;
                }
                parcelable6 = (CalendarItemDTO) parcelable7;
            }
            calendarItemDTO = (CalendarItemDTO) parcelable6;
        } else {
            calendarItemDTO = null;
        }
        this.f45695d = calendarItemDTO;
        this.f45697f = extras != null ? extras.getString("GCM_extra_sharable_event_id") : null;
        boolean z14 = false;
        this.f45698g = extras != null ? extras.getBoolean("GCM_extra_is_find_an_event", false) : false;
        this.f45699h = extras != null ? extras.getBoolean("GCM_extra_is_review_entries", false) : false;
        this.f45700i = extras != null ? extras.getBoolean("GCM_extra_show_strategy_tab", false) : false;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable5 = (Parcelable) extras.getParcelable("GCM_extra_sharable_event_dto", fg0.k.class);
            } else {
                Parcelable parcelable8 = extras.getParcelable("GCM_extra_sharable_event_dto");
                if (!(parcelable8 instanceof fg0.k)) {
                    parcelable8 = null;
                }
                parcelable5 = (fg0.k) parcelable8;
            }
            kVar = (fg0.k) parcelable5;
        } else {
            kVar = null;
        }
        this.f45696e = kVar;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH = kVar != null ? kVar.h() : null;
        if ((listH == null || listH.isEmpty()) && parcelableArrayList != null && (kVar2 = this.f45696e) != null) {
            kVar2.x0(parcelableArrayList);
        }
        e0 e0VarLa = la();
        fg0.k kVar4 = this.f45696e;
        e0VarLa.u5(kVar4 != null ? kVar4.h() : null);
        e0 e0VarLa2 = la();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable4 = (Parcelable) extras.getParcelable("GCM_extra_sharable_event_search_dto", fg0.p.class);
            } else {
                Parcelable parcelable9 = extras.getParcelable("GCM_extra_sharable_event_search_dto");
                if (!(parcelable9 instanceof fg0.p)) {
                    parcelable9 = null;
                }
                parcelable4 = (fg0.p) parcelable9;
            }
            pVar = (fg0.p) parcelable4;
        } else {
            pVar = null;
        }
        e0VarLa2.I = pVar;
        fg0.p pVar2 = la().I;
        if (pVar2 != null) {
            pVar2.h(parcelableArrayList);
        }
        if (extras != null && extras.getBoolean("navigating_from_event_dashboard", false)) {
            la().f121693n1 = this.f45696e;
            la().f204392i = Boolean.TRUE;
        }
        if (extras != null && extras.getBoolean("GCM_extra_is_garmin_coach_flow", false)) {
            la().f204393j = Boolean.TRUE;
            e0 e0VarLa3 = la();
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable3 = (Parcelable) extras.getParcelable("GCM_extra_is_garmin_coach_dto", fg0.x.class);
            } else {
                Parcelable parcelable10 = extras.getParcelable("GCM_extra_is_garmin_coach_dto");
                if (!(parcelable10 instanceof fg0.x)) {
                    parcelable10 = null;
                }
                parcelable3 = (fg0.x) parcelable10;
            }
            e0VarLa3.f204394k = (fg0.x) parcelable3;
            String string = extras.getString("GCM_tp_plan_name");
            if (string != null) {
                if (la().f204394k != null) {
                    e0 e0VarLa4 = la();
                    fg0.x xVar = la().f204394k;
                    e0VarLa4.f204394k = xVar != null ? fg0.x.b(xVar, string, null, null, null, null, null, null, null, 1021) : null;
                } else {
                    la().f204394k = new fg0.x(null, string, null, null, null, null, null, null, null, null, 1021, null);
                }
            }
        }
        if (extras != null && extras.getBoolean("extra_is_fbt_flow", false)) {
            la().f204395l = true;
            e0 e0VarLa5 = la();
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = (Parcelable) extras.getParcelable("extra_fbt_flow_dto", fg0.u.class);
            } else {
                Parcelable parcelable11 = extras.getParcelable("extra_fbt_flow_dto");
                if (!(parcelable11 instanceof fg0.u)) {
                    parcelable11 = null;
                }
                parcelable2 = (fg0.u) parcelable11;
            }
            e0VarLa5.f204397n = (fg0.u) parcelable2;
        }
        la().f204398o = extras != null ? extras.getBoolean("extra_enable_events_training_plan_button", true) : true;
        ((y0) la().J0.getValue()).j(Boolean.valueOf(this.f45698g));
        la().k5().f(this, this.f45701j);
        la().f121687i1.f(this, this.f45702k);
        ((androidx.lifecycle.s0) la().f121681c1.getValue()).f(this, this.f45703l);
        ((androidx.lifecycle.s0) la().I0.getValue()).f(this, this.f45704m);
        ((androidx.lifecycle.s0) la().H1.getValue()).f(this, this.f45705n);
        e0 e0VarLa6 = la();
        e0VarLa6.X = new ArrayList();
        ge1.b.T(v1.a(e0VarLa6), null, null, new h0(e0VarLa6, null), 3);
        if (this.f45695d != null) {
            showProgressOverlay();
            CalendarItemDTO calendarItemDTO2 = this.f45695d;
            if (calendarItemDTO2 != null) {
                if (this.f45699h) {
                    if (extras != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable = (Parcelable) extras.getParcelable("GCM_extra_sharable_event_dto", fg0.k.class);
                        } else {
                            Parcelable parcelable12 = extras.getParcelable("GCM_extra_sharable_event_dto");
                            parcelable = (fg0.k) (parcelable12 instanceof fg0.k ? parcelable12 : null);
                        }
                        kVar3 = (fg0.k) parcelable;
                    }
                    this.f45696e = kVar3;
                    if (kVar3 != null) {
                        la().E5(kVar3);
                    }
                } else if (this.f45698g) {
                    ka(calendarItemDTO2);
                } else {
                    ka(calendarItemDTO2);
                }
            }
        } else if (this.f45696e != null) {
            e0 e0VarLa7 = la();
            fg0.k kVar5 = this.f45696e;
            kVar5.getClass();
            e0VarLa7.E5(kVar5);
            fg0.k kVar6 = this.f45696e;
            if (kVar6 != null ? p005kotlin.jvm.internal.s.g(kVar6.getEventOrganizer(), Boolean.FALSE) : false) {
                fg0.k kVar7 = this.f45696e;
                this.f45697f = kVar7 != null ? kVar7.getShareableEventUuid() : null;
            }
        } else if (this.f45697f != null) {
            showProgressOverlay();
            String str = this.f45697f;
            if (str != null) {
                e0 e0VarLa8 = la();
                fg0.k kVar8 = this.f45696e;
                ge1.b.T(v1.a(e0VarLa8), null, null, new a1(e0VarLa8, str, kVar8 != null ? kVar8.h() : null, null), 3);
            }
        } else {
            initActionBar(true, R.string.txt_empty_page_no_data);
        }
        if (extras != null && extras.getBoolean("extra_show_event_added_snack_bar")) {
            z14 = true;
        }
        if (z14) {
            la().L5();
        }
        ma();
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/EventDetailsActivity$a;", "", "<init>", "()V", "", "EXTRA_EVENT_SPORTS_LEG_LIST", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, CalendarItemDTO calendarItemDTO, fg0.k kVar, fg0.p pVar, List list, boolean z14, fg0.x xVar, boolean z15, fg0.u uVar) {
            kVar.getClass();
            Intent intent = new Intent(context, (Class<?>) EventDetailsActivity.class);
            intent.putExtra("GCM_calendar_items", calendarItemDTO);
            intent.putExtra("GCM_extra_sharable_event_dto", kVar);
            intent.putExtra("GCM_extra_sharable_event_search_dto", pVar);
            intent.putExtra("GCM_extra_is_find_an_event", true);
            intent.putExtra("GCM_extra_is_garmin_coach_flow", z14);
            if (xVar != null) {
                intent.putExtra("GCM_extra_is_garmin_coach_dto", xVar);
            }
            intent.putExtra("extra_is_fbt_flow", z15);
            if (uVar != null) {
                intent.putExtra("extra_fbt_flow_dto", uVar);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("EVENT_SPORTS_LEG_LIST", list != null ? new ArrayList<>(list) : null);
            intent.putExtras(bundle);
            return intent;
        }

        public static Intent b(Context context, CalendarItemDTO calendarItemDTO, fg0.k kVar, boolean z14) {
            calendarItemDTO.getClass();
            kVar.getClass();
            Intent intent = new Intent(context, (Class<?>) EventDetailsActivity.class);
            intent.putExtra("GCM_calendar_items", calendarItemDTO);
            intent.putExtra("GCM_extra_sharable_event_dto", kVar);
            intent.putExtra("extra_show_event_added_snack_bar", z14);
            intent.putExtra("GCM_extra_is_review_entries", true);
            return intent;
        }

        public static Intent c(Context context, Long l14, String str) {
            context.getClass();
            CalendarItemDTO calendarItemDTO = new CalendarItemDTO();
            if (str != null) {
                calendarItemDTO.I1 = true;
                calendarItemDTO.H1 = str;
            } else if (l14 != null) {
                calendarItemDTO.f30967a = (int) l14.longValue();
            }
            Intent intent = new Intent(context, (Class<?>) EventDetailsActivity.class);
            intent.putExtra("GCM_calendar_items", calendarItemDTO);
            return intent;
        }

        public static void d(a aVar, Context context, Long l14, String str) {
            aVar.getClass();
            context.getClass();
            context.startActivity(c(context, l14, str));
        }

        private a() {
        }
    }
}
