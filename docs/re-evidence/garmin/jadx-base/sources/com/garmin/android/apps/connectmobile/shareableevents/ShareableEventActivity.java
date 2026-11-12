package com.garmin.android.apps.connectmobile.shareableevents;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w0;
import androidx.lifecycle.w1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.map.CourseMapActivity;
import com.garmin.android.apps.connectmobile.devices.targetedselection.TDSActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.pacepro.presentation.activity.CreatePaceProComposeActivity;
import com.garmin.android.apps.connectmobile.pacepro.presentation.activity.PaceProComposeActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.shareableevents.ShareableEventActivity;
import e23.l;
import fw.p;
import java.io.Serializable;
import lc.u0;
import mt0.y;
import n82.i;
import o13.h;
import ol1.f;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import ro1.g0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/shareableevents/ShareableEventActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/social/share/b$b;", "Lpl1/e$b;", "Lpl1/d$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ShareableEventActivity extends com.garmin.android.apps.connectmobile.c implements com.garmin.android.apps.connectmobile.social.share.b.InterfaceC0845b, pl1.e.b, pl1.d.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f44216b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f44217a = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.shareableevents.a.class), new d(this), new i(this, 21), new e(null, this));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44219b;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44218a = iArr;
            int[] iArr2 = new int[com.garmin.android.apps.connectmobile.shareableevents.a.EnumC0830a.values().length];
            try {
                iArr2[com.garmin.android.apps.connectmobile.shareableevents.a.EnumC0830a.DELETE_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.garmin.android.apps.connectmobile.shareableevents.a.EnumC0830a.PACE_PRO_CREATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f44219b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f44220a;

        public c(l lVar) {
            lVar.getClass();
            this.f44220a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f44220a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44220a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44221a;

        public d(g gVar) {
            this.f44221a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f44221a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f44223b;

        public e(e23.a aVar, g gVar) {
            this.f44222a = aVar;
            this.f44223b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f44222a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f44223b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
    }

    @Override // pl1.d.b
    public final void D4(long j8) {
        ca().f44232i = j8;
        fd0.d dVar = fd0.d.PACEPRO;
        GCMSettingManager.J(dVar, null, -1L);
        TDSActivity.f34565f.getClass();
        Intent intent = new Intent(this, (Class<?>) TDSActivity.class);
        intent.putExtra("arg.module.type", dVar);
        intent.putExtra("arg.course.coordinate.system", (Serializable) null);
        startActivityForResult(intent, 4);
    }

    @Override // pl1.d.b
    public final void G5(com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar) {
        PaceProComposeActivity.f39792a.getClass();
        startActivity(PaceProComposeActivity.a.a(this, bVar));
    }

    @Override // pl1.e.b
    public final void V() {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        g3<com.garmin.android.apps.connectmobile.courses.model.e> g3VarD = ca().z4().d();
        if (g3VarD == null || (eVar = g3VarD.f35301b) == null) {
            return;
        }
        CourseMapActivity.f33059b.getClass();
        CourseMapActivity.a.a(this, eVar);
    }

    public final com.garmin.android.apps.connectmobile.shareableevents.a ca() {
        return (com.garmin.android.apps.connectmobile.shareableevents.a) this.f44217a.getValue();
    }

    @Override // pl1.d.b
    public final void e7() {
        dy.a aVar;
        String shareableEventUuid;
        com.garmin.android.apps.connectmobile.shareableevents.a aVarCa = ca();
        g3<dy.a> g3VarD = aVarCa.y4().d();
        if (g3VarD == null || (aVar = g3VarD.f35301b) == null || (shareableEventUuid = aVar.getShareableEventUuid()) == null) {
            return;
        }
        ge1.b.T(v1.a(aVarCa), null, null, new ol1.g(aVarCa, shareableEventUuid, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.social.share.b.InterfaceC0845b
    public final void i8(ro1.e eVar, Intent intent) {
        eVar.getClass();
        intent.getClass();
        ActivityInfo activityInfo = eVar.f153929a;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.putExtra("android.intent.extra.TEXT", "TODO shareable event details");
        g0.f153957a.getClass();
        g0.g(this, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        dy.a aVar;
        Long courseId;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 4) {
            if (i15 == -1) {
                com.garmin.android.apps.connectmobile.shareableevents.a aVarCa = ca();
                xy2.b.K(aVarCa, new ol1.i(aVarCa, GCMSettingManager.r(fd0.d.PACEPRO, null), null));
                return;
            }
            return;
        }
        if (i14 == 100 || i14 == 1555 || i14 == 8673) {
            if (i15 == -1 || i15 == 2 || i15 == 3) {
                com.garmin.android.apps.connectmobile.shareableevents.a aVarCa2 = ca();
                g3<dy.a> g3VarD = aVarCa2.y4().d();
                if (g3VarD == null || (aVar = g3VarD.f35301b) == null || (courseId = aVar.getCourseId()) == null) {
                    return;
                }
                ge1.b.T(v1.a(aVarCa2), null, null, new ol1.e(aVarCa2, courseId.longValue(), null), 3);
                ge1.b.T(v1.a(aVarCa2), null, null, new f(null), 3);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.shareable_event_activity);
        final com.garmin.android.apps.connectmobile.shareableevents.a aVarCa = ca();
        final w0 w0Var = new w0();
        final int i14 = 0;
        w0Var.n(aVarCa.y4(), new com.garmin.android.apps.connectmobile.shareableevents.a.c(new l() { // from class: ol1.d
            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        com.garmin.android.apps.connectmobile.shareableevents.a aVar = aVarCa;
                        w0Var.m(aVar.x4(aVar.y4(), aVar.z4(), (y0) aVar.f44230g.getValue()));
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.shareableevents.a aVar2 = aVarCa;
                        w0Var.m(aVar2.x4(aVar2.y4(), aVar2.z4(), (y0) aVar2.f44230g.getValue()));
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.shareableevents.a aVar3 = aVarCa;
                        w0Var.m(aVar3.x4(aVar3.y4(), aVar3.z4(), (y0) aVar3.f44230g.getValue()));
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i15 = 1;
        w0Var.n(aVarCa.z4(), new com.garmin.android.apps.connectmobile.shareableevents.a.c(new l() { // from class: ol1.d
            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.shareableevents.a aVar = aVarCa;
                        w0Var.m(aVar.x4(aVar.y4(), aVar.z4(), (y0) aVar.f44230g.getValue()));
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.shareableevents.a aVar2 = aVarCa;
                        w0Var.m(aVar2.x4(aVar2.y4(), aVar2.z4(), (y0) aVar2.f44230g.getValue()));
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.shareableevents.a aVar3 = aVarCa;
                        w0Var.m(aVar3.x4(aVar3.y4(), aVar3.z4(), (y0) aVar3.f44230g.getValue()));
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i16 = 2;
        w0Var.n((y0) aVarCa.f44230g.getValue(), new com.garmin.android.apps.connectmobile.shareableevents.a.c(new l() { // from class: ol1.d
            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.shareableevents.a aVar = aVarCa;
                        w0Var.m(aVar.x4(aVar.y4(), aVar.z4(), (y0) aVar.f44230g.getValue()));
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.shareableevents.a aVar2 = aVarCa;
                        w0Var.m(aVar2.x4(aVar2.y4(), aVar2.z4(), (y0) aVar2.f44230g.getValue()));
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.shareableevents.a aVar3 = aVarCa;
                        w0Var.m(aVar3.x4(aVar3.y4(), aVar3.z4(), (y0) aVar3.f44230g.getValue()));
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i17 = 0;
        w0Var.f(this, new c(new l(this) { // from class: ol1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShareableEventActivity f132833b;

            {
                this.f132833b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                final ShareableEventActivity shareableEventActivity = this.f132833b;
                final int i19 = 1;
                switch (i18) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        int i24 = ShareableEventActivity.f44216b;
                        int i25 = ShareableEventActivity.b.f44218a[g3Var.f35300a.ordinal()];
                        if (i25 == 1) {
                            shareableEventActivity.hideProgressOverlay();
                            c cVar = (c) g3Var.f35301b;
                            if (cVar != null) {
                                shareableEventActivity.initActionBar(true, shareableEventActivity.getString(s.g(cVar.f132849n, Boolean.TRUE) ? R.string.shareable_event_title : R.string.shared_event_title));
                                shareableEventActivity.invalidateOptionsMenu();
                                v supportFragmentManager = shareableEventActivity.getSupportFragmentManager();
                                Fragment fragmentG = supportFragmentManager.G("ShareableEventDetailsFragment");
                                if (fragmentG == null) {
                                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                                    pl1.d.f138528n.getClass();
                                    pl1.d dVar = new pl1.d();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putParcelable("eventUIModel", cVar);
                                    dVar.setArguments(bundle2);
                                    aVar.l(R.id.container, dVar, "ShareableEventDetailsFragment");
                                    aVar.e();
                                } else {
                                    ((pl1.d) fragmentG).u6(cVar);
                                }
                            }
                        } else if (i25 == 2) {
                            shareableEventActivity.hideProgressOverlay();
                            shareableEventActivity.displayFailedMessage();
                            shareableEventActivity.finish();
                        } else {
                            if (i25 != 3) {
                                u0.r();
                                return null;
                            }
                            shareableEventActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.shareableevents.a.EnumC0830a enumC0830a = (com.garmin.android.apps.connectmobile.shareableevents.a.EnumC0830a) obj;
                        int i26 = ShareableEventActivity.f44216b;
                        int i27 = enumC0830a == null ? -1 : ShareableEventActivity.b.f44219b[enumC0830a.ordinal()];
                        if (i27 == -1) {
                            Unit unit = Unit.INSTANCE;
                        } else if (i27 == 1) {
                            androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(shareableEventActivity);
                            aVar2.setTitle(shareableEventActivity.getString(R.string.delete_event_question));
                            aVar2.setMessage(shareableEventActivity.getString(R.string.delete_event_message));
                            final int i28 = 0;
                            aVar2.setPositiveButton(R.string.lbl_delete, new DialogInterface.OnClickListener() { // from class: ol1.b
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i29) {
                                    com.garmin.android.apps.connectmobile.courses.model.e eVar;
                                    int i30 = i28;
                                    ShareableEventActivity shareableEventActivity2 = shareableEventActivity;
                                    switch (i30) {
                                        case 0:
                                            int i34 = ShareableEventActivity.f44216b;
                                            shareableEventActivity2.ca();
                                            break;
                                        default:
                                            int i35 = ShareableEventActivity.f44216b;
                                            g3<com.garmin.android.apps.connectmobile.courses.model.e> g3VarD = shareableEventActivity2.ca().z4().d();
                                            if (g3VarD != null && (eVar = g3VarD.f35301b) != null) {
                                                t41.d dVar2 = new t41.d(shareableEventActivity2);
                                                if (!dVar2.a(eVar.q())) {
                                                    dVar2.b();
                                                } else {
                                                    CreatePaceProComposeActivity.f39791b.getClass();
                                                    shareableEventActivity2.startActivityForResult(CreatePaceProComposeActivity.a.a(shareableEventActivity2, eVar, null, true), 1555);
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            aVar2.setNegativeButton(R.string.lbl_cancel, new y(12));
                            aVar2.show();
                        } else {
                            if (i27 != 2) {
                                u0.r();
                                return null;
                            }
                            androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(shareableEventActivity);
                            aVar3.setTitle(shareableEventActivity.getString(R.string.pacepro_lbl_create_plan));
                            aVar3.setMessage(shareableEventActivity.getString(R.string.create_pacepro_strategy_message));
                            aVar3.setPositiveButton(shareableEventActivity.getString(R.string.lbl_common_continue), new DialogInterface.OnClickListener() { // from class: ol1.b
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i29) {
                                    com.garmin.android.apps.connectmobile.courses.model.e eVar;
                                    int i30 = i19;
                                    ShareableEventActivity shareableEventActivity2 = shareableEventActivity;
                                    switch (i30) {
                                        case 0:
                                            int i34 = ShareableEventActivity.f44216b;
                                            shareableEventActivity2.ca();
                                            break;
                                        default:
                                            int i35 = ShareableEventActivity.f44216b;
                                            g3<com.garmin.android.apps.connectmobile.courses.model.e> g3VarD = shareableEventActivity2.ca().z4().d();
                                            if (g3VarD != null && (eVar = g3VarD.f35301b) != null) {
                                                t41.d dVar2 = new t41.d(shareableEventActivity2);
                                                if (!dVar2.a(eVar.q())) {
                                                    dVar2.b();
                                                } else {
                                                    CreatePaceProComposeActivity.f39791b.getClass();
                                                    shareableEventActivity2.startActivityForResult(CreatePaceProComposeActivity.a.a(shareableEventActivity2, eVar, null, true), 1555);
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            aVar3.setNegativeButton(shareableEventActivity.getString(R.string.lbl_cancel), new y(12));
                            aVar3.show();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i18 = 1;
        ((y0) ca().f44231h.getValue()).f(this, new c(new l(this) { // from class: ol1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShareableEventActivity f132833b;

            {
                this.f132833b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i18;
                final ShareableEventActivity shareableEventActivity = this.f132833b;
                final int i110 = 1;
                switch (i19) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        int i24 = ShareableEventActivity.f44216b;
                        int i25 = ShareableEventActivity.b.f44218a[g3Var.f35300a.ordinal()];
                        if (i25 == 1) {
                            shareableEventActivity.hideProgressOverlay();
                            c cVar = (c) g3Var.f35301b;
                            if (cVar != null) {
                                shareableEventActivity.initActionBar(true, shareableEventActivity.getString(s.g(cVar.f132849n, Boolean.TRUE) ? R.string.shareable_event_title : R.string.shared_event_title));
                                shareableEventActivity.invalidateOptionsMenu();
                                v supportFragmentManager = shareableEventActivity.getSupportFragmentManager();
                                Fragment fragmentG = supportFragmentManager.G("ShareableEventDetailsFragment");
                                if (fragmentG == null) {
                                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                                    pl1.d.f138528n.getClass();
                                    pl1.d dVar = new pl1.d();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putParcelable("eventUIModel", cVar);
                                    dVar.setArguments(bundle2);
                                    aVar.l(R.id.container, dVar, "ShareableEventDetailsFragment");
                                    aVar.e();
                                } else {
                                    ((pl1.d) fragmentG).u6(cVar);
                                }
                            }
                        } else if (i25 == 2) {
                            shareableEventActivity.hideProgressOverlay();
                            shareableEventActivity.displayFailedMessage();
                            shareableEventActivity.finish();
                        } else {
                            if (i25 != 3) {
                                u0.r();
                                return null;
                            }
                            shareableEventActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.shareableevents.a.EnumC0830a enumC0830a = (com.garmin.android.apps.connectmobile.shareableevents.a.EnumC0830a) obj;
                        int i26 = ShareableEventActivity.f44216b;
                        int i27 = enumC0830a == null ? -1 : ShareableEventActivity.b.f44219b[enumC0830a.ordinal()];
                        if (i27 == -1) {
                            Unit unit = Unit.INSTANCE;
                        } else if (i27 == 1) {
                            androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(shareableEventActivity);
                            aVar2.setTitle(shareableEventActivity.getString(R.string.delete_event_question));
                            aVar2.setMessage(shareableEventActivity.getString(R.string.delete_event_message));
                            final int i28 = 0;
                            aVar2.setPositiveButton(R.string.lbl_delete, new DialogInterface.OnClickListener() { // from class: ol1.b
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i29) {
                                    com.garmin.android.apps.connectmobile.courses.model.e eVar;
                                    int i30 = i28;
                                    ShareableEventActivity shareableEventActivity2 = shareableEventActivity;
                                    switch (i30) {
                                        case 0:
                                            int i34 = ShareableEventActivity.f44216b;
                                            shareableEventActivity2.ca();
                                            break;
                                        default:
                                            int i35 = ShareableEventActivity.f44216b;
                                            g3<com.garmin.android.apps.connectmobile.courses.model.e> g3VarD = shareableEventActivity2.ca().z4().d();
                                            if (g3VarD != null && (eVar = g3VarD.f35301b) != null) {
                                                t41.d dVar2 = new t41.d(shareableEventActivity2);
                                                if (!dVar2.a(eVar.q())) {
                                                    dVar2.b();
                                                } else {
                                                    CreatePaceProComposeActivity.f39791b.getClass();
                                                    shareableEventActivity2.startActivityForResult(CreatePaceProComposeActivity.a.a(shareableEventActivity2, eVar, null, true), 1555);
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            aVar2.setNegativeButton(R.string.lbl_cancel, new y(12));
                            aVar2.show();
                        } else {
                            if (i27 != 2) {
                                u0.r();
                                return null;
                            }
                            androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(shareableEventActivity);
                            aVar3.setTitle(shareableEventActivity.getString(R.string.pacepro_lbl_create_plan));
                            aVar3.setMessage(shareableEventActivity.getString(R.string.create_pacepro_strategy_message));
                            aVar3.setPositiveButton(shareableEventActivity.getString(R.string.lbl_common_continue), new DialogInterface.OnClickListener() { // from class: ol1.b
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i29) {
                                    com.garmin.android.apps.connectmobile.courses.model.e eVar;
                                    int i30 = i110;
                                    ShareableEventActivity shareableEventActivity2 = shareableEventActivity;
                                    switch (i30) {
                                        case 0:
                                            int i34 = ShareableEventActivity.f44216b;
                                            shareableEventActivity2.ca();
                                            break;
                                        default:
                                            int i35 = ShareableEventActivity.f44216b;
                                            g3<com.garmin.android.apps.connectmobile.courses.model.e> g3VarD = shareableEventActivity2.ca().z4().d();
                                            if (g3VarD != null && (eVar = g3VarD.f35301b) != null) {
                                                t41.d dVar2 = new t41.d(shareableEventActivity2);
                                                if (!dVar2.a(eVar.q())) {
                                                    dVar2.b();
                                                } else {
                                                    CreatePaceProComposeActivity.f39791b.getClass();
                                                    shareableEventActivity2.startActivityForResult(CreatePaceProComposeActivity.a.a(shareableEventActivity2, eVar, null, true), 1555);
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            aVar3.setNegativeButton(shareableEventActivity.getString(R.string.lbl_cancel), new y(12));
                            aVar3.show();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        dy.a aVar;
        MenuItem menuItemFindItem2;
        MenuItem menuItemFindItem3;
        dy.a aVar2;
        getMenuInflater().inflate(R.menu.menu_shareable_event_details, menu);
        g3<dy.a> g3VarD = ca().y4().d();
        Boolean subscribed = null;
        Boolean eventOrganizer = (g3VarD == null || (aVar2 = g3VarD.f35301b) == null) ? null : aVar2.getEventOrganizer();
        Boolean bool = Boolean.TRUE;
        if (!s.g(eventOrganizer, bool)) {
            g3<dy.a> g3VarD2 = ca().y4().d();
            if (g3VarD2 != null && (aVar = g3VarD2.f35301b) != null) {
                subscribed = aVar.getSubscribed();
            }
            if (s.g(subscribed, bool) && menu != null && (menuItemFindItem = menu.findItem(R.id.remove_event)) != null) {
                menuItemFindItem.setVisible(true);
            }
        } else if (s.g(ca().B4(), bool)) {
            if (menu != null && (menuItemFindItem3 = menu.findItem(R.id.remove_event)) != null) {
                menuItemFindItem3.setVisible(true);
                return true;
            }
        } else if (menu != null && (menuItemFindItem2 = menu.findItem(R.id.delete_event)) != null) {
            menuItemFindItem2.setVisible(true);
            return true;
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        dy.a aVar;
        String shareableEventUuid;
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.delete_event) {
            ((y0) ca().f44231h.getValue()).j(com.garmin.android.apps.connectmobile.shareableevents.a.EnumC0830a.DELETE_EVENT);
            return true;
        }
        if (itemId != R.id.remove_event) {
            return super.onOptionsItemSelected(menuItem);
        }
        com.garmin.android.apps.connectmobile.shareableevents.a aVarCa = ca();
        g3<dy.a> g3VarD = aVarCa.y4().d();
        if (g3VarD != null && (aVar = g3VarD.f35301b) != null && (shareableEventUuid = aVar.getShareableEventUuid()) != null) {
            ge1.b.T(v1.a(aVarCa), null, null, new ol1.h(aVarCa, shareableEventUuid, null), 3);
        }
        return true;
    }

    @Override // pl1.d.b
    public final void p8() {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        g3<com.garmin.android.apps.connectmobile.courses.model.e> g3VarD = ca().z4().d();
        if (g3VarD == null || (eVar = g3VarD.f35301b) == null) {
            return;
        }
        CourseDetailsActivity.a aVar = CourseDetailsActivity.f33024k;
        com.garmin.android.apps.connectmobile.courses.model.d dVar = new com.garmin.android.apps.connectmobile.courses.model.d(eVar);
        aVar.getClass();
        CourseDetailsActivity.a.a(this, dVar, 8673);
    }

    @Override // pl1.d.b
    public final void x3() {
        ((y0) ca().f44231h.getValue()).j(com.garmin.android.apps.connectmobile.shareableevents.a.EnumC0830a.PACE_PRO_CREATION);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/shareableevents/ShareableEventActivity$a;", "", "<init>", "()V", "", "BUNDLE_EXTRA_KEY_EVENT_UUID", "Ljava/lang/String;", "BUNDLE_EXTRA_KEY_EVENT_ID", "", "REQUEST_CODE_VIEW_COURSE", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
