package com.garmin.android.apps.connectmobile.traininginitiative.ui.eventfilter;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.eventfilter.TIFindEventFilterActivity;
import dz1.i;
import dz1.k;
import dz1.m;
import dz1.o;
import e23.l;
import n23.j;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import z10.p3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/eventfilter/TIFindEventFilterActivity;", "Lz10/p3;", "Lry1/a;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TIFindEventFilterActivity extends p3 implements ry1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f45949d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f45950c = new w1(s0.f105811a.b(cz1.a.class), new d(this), new c(this), new e(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f45951a;

        public b(l lVar) {
            lVar.getClass();
            this.f45951a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f45951a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45951a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45952a;

        public c(g gVar) {
            this.f45952a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45952a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45953a;

        public d(g gVar) {
            this.f45953a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45953a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f45955b;

        public e(e23.a aVar, g gVar) {
            this.f45954a = aVar;
            this.f45955b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45954a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45955b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // z10.p3
    public final Fragment ca() {
        k.f61743y.getClass();
        Bundle bundle = new Bundle();
        k kVar = new k();
        kVar.setArguments(bundle);
        return kVar;
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

    public final cz1.a ka() {
        return (cz1.a) this.f45950c.getValue();
    }

    public final void la(Fragment fragment, String str) {
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarC = j.c(supportFragmentManager, supportFragmentManager, R.id.content_frame, fragment, str);
        aVarC.d(str);
        aVarC.e();
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        hideActionBar();
        f45949d.getClass();
        Bundle extras = getIntent().getExtras();
        ka().f204392i = extras != null ? Boolean.valueOf(extras.getBoolean("navigating_from_event_dashboard", false)) : Boolean.FALSE;
        ka();
        if (extras != null) {
            extras.getBoolean("GCM_extra_is_garmin_coach_flow", false);
        }
        ka().f204395l = extras != null ? extras.getBoolean("extra_is_fbt_flow", false) : false;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_extra_events_filter_dto", my1.d.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_extra_events_filter_dto");
                if (!(parcelable2 instanceof my1.d)) {
                    parcelable2 = null;
                }
                parcelable = (my1.d) parcelable2;
            }
            my1.d dVar = (my1.d) parcelable;
            if (dVar != null) {
                ka().i5(dVar);
            }
        }
        View viewFindViewById = findViewById(R.id.title_text_view);
        viewFindViewById.getClass();
        ((TextView) viewFindViewById).setText(getString(R.string.lbl_filter));
        ka().T = ka().c5();
        final int i14 = 0;
        ka().Z.f(this, new b(new l(this) { // from class: cz1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TIFindEventFilterActivity f56878b;

            {
                this.f56878b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                TIFindEventFilterActivity tIFindEventFilterActivity = this.f56878b;
                switch (i15) {
                    case 0:
                        String str = (String) obj;
                        TIFindEventFilterActivity.a aVar = TIFindEventFilterActivity.f45949d;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -2081422067:
                                    if (str.equals("TIFindEventFilterParticipationFragment")) {
                                        m.f61773f.getClass();
                                        Bundle bundle2 = new Bundle();
                                        m mVar = new m();
                                        mVar.setArguments(bundle2);
                                        tIFindEventFilterActivity.la(mVar, str);
                                    }
                                    break;
                                case -1593382910:
                                    if (str.equals("EventTypeListFragment")) {
                                        dz1.n.f61786f.getClass();
                                        tIFindEventFilterActivity.la(new dz1.n(), str);
                                    }
                                    break;
                                case -900358433:
                                    if (str.equals("TISearchRadiusFragment")) {
                                        o.f61797e.getClass();
                                        tIFindEventFilterActivity.la(new o(), str);
                                    }
                                    break;
                                case -393130430:
                                    if (str.equals("TIFindEventFilterDateFragment")) {
                                        dz1.c.f61669w.getClass();
                                        Bundle bundle3 = new Bundle();
                                        dz1.c cVar = new dz1.c();
                                        cVar.setArguments(bundle3);
                                        tIFindEventFilterActivity.la(cVar, str);
                                    }
                                    break;
                                case 1672328232:
                                    if (str.equals("TIFindEventFilterDurationFragment")) {
                                        i.F.getClass();
                                        tIFindEventFilterActivity.la(new i(), str);
                                    }
                                    break;
                                case 1859402356:
                                    if (str.equals("TIFindEventFilterFragment")) {
                                        k.f61743y.getClass();
                                        Bundle bundle4 = new Bundle();
                                        k kVar = new k();
                                        kVar.setArguments(bundle4);
                                        tIFindEventFilterActivity.la(kVar, str);
                                    }
                                    break;
                            }
                        }
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        TIFindEventFilterActivity.a aVar2 = TIFindEventFilterActivity.f45949d;
                        if (bool != null) {
                            if (bool.booleanValue()) {
                                tIFindEventFilterActivity.showActionBar();
                            } else {
                                tIFindEventFilterActivity.hideActionBar();
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i15 = 1;
        ka().N0.f(this, new b(new l(this) { // from class: cz1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TIFindEventFilterActivity f56878b;

            {
                this.f56878b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                TIFindEventFilterActivity tIFindEventFilterActivity = this.f56878b;
                switch (i16) {
                    case 0:
                        String str = (String) obj;
                        TIFindEventFilterActivity.a aVar = TIFindEventFilterActivity.f45949d;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -2081422067:
                                    if (str.equals("TIFindEventFilterParticipationFragment")) {
                                        m.f61773f.getClass();
                                        Bundle bundle2 = new Bundle();
                                        m mVar = new m();
                                        mVar.setArguments(bundle2);
                                        tIFindEventFilterActivity.la(mVar, str);
                                    }
                                    break;
                                case -1593382910:
                                    if (str.equals("EventTypeListFragment")) {
                                        dz1.n.f61786f.getClass();
                                        tIFindEventFilterActivity.la(new dz1.n(), str);
                                    }
                                    break;
                                case -900358433:
                                    if (str.equals("TISearchRadiusFragment")) {
                                        o.f61797e.getClass();
                                        tIFindEventFilterActivity.la(new o(), str);
                                    }
                                    break;
                                case -393130430:
                                    if (str.equals("TIFindEventFilterDateFragment")) {
                                        dz1.c.f61669w.getClass();
                                        Bundle bundle3 = new Bundle();
                                        dz1.c cVar = new dz1.c();
                                        cVar.setArguments(bundle3);
                                        tIFindEventFilterActivity.la(cVar, str);
                                    }
                                    break;
                                case 1672328232:
                                    if (str.equals("TIFindEventFilterDurationFragment")) {
                                        i.F.getClass();
                                        tIFindEventFilterActivity.la(new i(), str);
                                    }
                                    break;
                                case 1859402356:
                                    if (str.equals("TIFindEventFilterFragment")) {
                                        k.f61743y.getClass();
                                        Bundle bundle4 = new Bundle();
                                        k kVar = new k();
                                        kVar.setArguments(bundle4);
                                        tIFindEventFilterActivity.la(kVar, str);
                                    }
                                    break;
                            }
                        }
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        TIFindEventFilterActivity.a aVar2 = TIFindEventFilterActivity.f45949d;
                        if (bool != null) {
                            if (bool.booleanValue()) {
                                tIFindEventFilterActivity.showActionBar();
                            } else {
                                tIFindEventFilterActivity.hideActionBar();
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/eventfilter/TIFindEventFilterActivity$a;", "", "<init>", "()V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
