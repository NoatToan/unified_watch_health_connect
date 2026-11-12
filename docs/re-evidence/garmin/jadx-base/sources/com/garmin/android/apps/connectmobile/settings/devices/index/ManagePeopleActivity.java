package com.garmin.android.apps.connectmobile.settings.devices.index;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.index.ManagePeopleActivity;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import f12.l;
import fw.p;
import fw.r;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import mh1.q;
import mh1.x;
import o13.m;
import o13.t;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import wn1.e0;
import wn1.f0;
import wn1.g0;
import wn1.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/index/ManagePeopleActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ManagePeopleActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f43042n = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f43046d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.settings.devices.index.b f43048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.settings.devices.index.b f43049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f43050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f43051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f43052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MenuItem f43053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MenuItem f43054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f43055m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f43043a = m.b(new q(3));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f43044b = new w1(s0.f105811a.b(h0.class), new g(this), new f(this), new h(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f43045c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f43047e = -1;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43056a;

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
            f43056a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/index/ManagePeopleActivity$c", "Lcom/garmin/android/apps/connectmobile/settings/devices/index/b$a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.apps.connectmobile.settings.devices.index.b.a {
        public c() {
        }

        @Override // com.garmin.android.apps.connectmobile.settings.devices.index.b.a
        public final void a(com.garmin.android.apps.connectmobile.smartscale.model.e eVar, com.garmin.android.apps.connectmobile.settings.devices.index.b bVar) {
            a aVar = ManagePeopleActivity.f43042n;
            ManagePeopleActivity managePeopleActivity = ManagePeopleActivity.this;
            h0 h0VarDa = managePeopleActivity.da();
            long j8 = managePeopleActivity.f43045c;
            y0<fw.m<com.garmin.android.apps.connectmobile.smartscale.model.e>> y0Var = h0VarDa.f186245d;
            fw.m<com.garmin.android.apps.connectmobile.smartscale.model.e> mVarD = y0Var.d();
            if ((mVarD != null ? mVarD.f73769b : null) != p.LOADING) {
                fw.m.a aVar2 = fw.m.f73767e;
                y0Var.j(fw.m.a.f(aVar2, null, null, 3));
                Long lH = eVar.getUserProfileId();
                if (lH == null) {
                    y0Var.j(fw.m.a.b(aVar2, new r(), null, 1));
                } else {
                    ge1.b.T(v1.a(h0VarDa), null, null, new g0(h0VarDa, j8, lH, eVar, null), 3);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/index/ManagePeopleActivity$d", "Lcom/garmin/android/apps/connectmobile/settings/devices/index/b$a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements com.garmin.android.apps.connectmobile.settings.devices.index.b.a {
        public d() {
        }

        @Override // com.garmin.android.apps.connectmobile.settings.devices.index.b.a
        public final void a(com.garmin.android.apps.connectmobile.smartscale.model.e eVar, com.garmin.android.apps.connectmobile.settings.devices.index.b bVar) {
            a aVar = ManagePeopleActivity.f43042n;
            h0 h0VarDa = ManagePeopleActivity.this.da();
            y0<fw.m<com.garmin.android.apps.connectmobile.smartscale.model.e>> y0Var = h0VarDa.f186245d;
            fw.m<com.garmin.android.apps.connectmobile.smartscale.model.e> mVarD = y0Var.d();
            if ((mVarD != null ? mVarD.f73769b : null) != p.LOADING) {
                fw.m.a aVar2 = fw.m.f73767e;
                y0Var.j(fw.m.a.f(aVar2, null, null, 3));
                Long lD = eVar.getInviteId();
                if (lD == null) {
                    y0Var.j(fw.m.a.b(aVar2, new r(), null, 1));
                } else {
                    ge1.b.T(v1.a(h0VarDa), null, null, new e0(h0VarDa, lD, eVar, null), 3);
                }
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f43059a;

        public e(e23.l lVar) {
            lVar.getClass();
            this.f43059a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f43059a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43059a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f43060a;

        public f(b.g gVar) {
            this.f43060a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43060a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f43061a;

        public g(b.g gVar) {
            this.f43061a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43061a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f43063b;

        public h(e23.a aVar, b.g gVar) {
            this.f43062a = aVar;
            this.f43063b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43062a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43063b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public ManagePeopleActivity() {
        l.f68084a.getClass();
        this.f43055m = l.a.a();
    }

    public final void ca() {
        com.garmin.android.library.backgroundtaskmanagement.c cVar = com.garmin.android.library.backgroundtaskmanagement.c.f50123c;
        long j8 = this.f43047e;
        if (cVar.e(Long.valueOf(j8))) {
            cVar.a(j8);
        }
    }

    public final h0 da() {
        return (h0) this.f43044b.getValue();
    }

    public final void ea() {
        h0 h0VarDa = da();
        long j8 = this.f43045c;
        y0<fw.m<List<com.garmin.android.apps.connectmobile.smartscale.model.e>>> y0Var = h0VarDa.f186244c;
        fw.m<List<com.garmin.android.apps.connectmobile.smartscale.model.e>> mVarD = y0Var.d();
        if ((mVarD != null ? mVarD.f73769b : null) != p.LOADING) {
            y0Var.j(fw.m.a.f(fw.m.f73767e, null, null, 3));
            ge1.b.T(v1.a(h0VarDa), null, null, new f0(h0VarDa, j8, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void fa(List<com.garmin.android.apps.connectmobile.smartscale.model.e> list) {
        ArrayList<com.garmin.android.apps.connectmobile.smartscale.model.e> arrayList = new ArrayList<>();
        for (Object obj : list) {
            if (((com.garmin.android.apps.connectmobile.smartscale.model.e) obj).getIsAccepted()) {
                arrayList.add(obj);
            }
        }
        com.garmin.android.apps.connectmobile.settings.devices.index.b bVar = this.f43048f;
        if (bVar == null) {
            s.m("connectedUsersAdapter");
            throw null;
        }
        bVar.f43066b = arrayList;
        bVar.notifyDataSetChanged();
        ArrayList<com.garmin.android.apps.connectmobile.smartscale.model.e> arrayList2 = new ArrayList<>();
        for (Object obj2 : list) {
            if (!((com.garmin.android.apps.connectmobile.smartscale.model.e) obj2).getIsAccepted()) {
                arrayList2.add(obj2);
            }
        }
        com.garmin.android.apps.connectmobile.settings.devices.index.b bVar2 = this.f43049g;
        if (bVar2 == null) {
            s.m("pendingUsersAdapter");
            throw null;
        }
        bVar2.f43066b = arrayList2;
        bVar2.notifyDataSetChanged();
    }

    public final void ga() {
        MenuItem menuItem = this.f43054l;
        if (menuItem != null) {
            if (menuItem == null) {
                s.m("cancelMenuItem");
                throw null;
            }
            menuItem.setVisible(false);
        }
        MenuItem menuItem2 = this.f43053k;
        if (menuItem2 != null) {
            if (menuItem2 == null) {
                s.m("editMenuItem");
                throw null;
            }
            com.garmin.android.apps.connectmobile.settings.devices.index.b bVar = this.f43048f;
            if (bVar == null) {
                s.m("connectedUsersAdapter");
                throw null;
            }
            menuItem2.setVisible(bVar.f43066b.size() > 1);
        }
        if (s3.b()) {
            TextView textView = this.f43051i;
            if (textView == null) {
                s.m("inviteIndicationTextView");
                throw null;
            }
            textView.setText(getString(R.string.message_connection_invites, this.f43046d));
        } else {
            com.garmin.android.apps.connectmobile.settings.devices.index.b bVar2 = this.f43048f;
            if (bVar2 == null) {
                s.m("connectedUsersAdapter");
                throw null;
            }
            int size = bVar2.f43066b.size() - 1;
            com.garmin.android.apps.connectmobile.settings.devices.index.b bVar3 = this.f43049g;
            if (bVar3 == null) {
                s.m("pendingUsersAdapter");
                throw null;
            }
            int size2 = bVar3.f43066b.size() + size;
            if (size2 > 0) {
                int i14 = 15 - size2;
                if (i14 != 0) {
                    TextView textView2 = this.f43051i;
                    if (i14 != 1) {
                        if (textView2 == null) {
                            s.m("inviteIndicationTextView");
                            throw null;
                        }
                        textView2.setText(getString(R.string.message_invitations_left, String.valueOf(i14), this.f43046d));
                    } else {
                        if (textView2 == null) {
                            s.m("inviteIndicationTextView");
                            throw null;
                        }
                        textView2.setText(getString(R.string.message_invitations_one_left, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, this.f43046d));
                    }
                } else {
                    TextView textView3 = this.f43051i;
                    if (textView3 == null) {
                        s.m("inviteIndicationTextView");
                        throw null;
                    }
                    textView3.setText(getString(R.string.message_invitations_not_available));
                }
            } else {
                TextView textView4 = this.f43051i;
                if (textView4 == null) {
                    s.m("inviteIndicationTextView");
                    throw null;
                }
                textView4.setText(getString(R.string.smart_scale_manage_users_description, this.f43046d));
            }
            Button button = this.f43050h;
            if (button == null) {
                s.m("inviteConnectionsButton");
                throw null;
            }
            button.setEnabled(size2 < 15);
        }
        com.garmin.android.apps.connectmobile.settings.devices.index.b bVar4 = this.f43049g;
        if (bVar4 == null) {
            s.m("pendingUsersAdapter");
            throw null;
        }
        if (!bVar4.f43066b.isEmpty()) {
            TextView textView5 = this.f43052j;
            if (textView5 != null) {
                v22.e.q(textView5);
                return;
            } else {
                s.m("pendingLabelTextView");
                throw null;
            }
        }
        com.garmin.android.apps.connectmobile.settings.devices.index.b bVar5 = this.f43048f;
        if (bVar5 == null) {
            s.m("connectedUsersAdapter");
            throw null;
        }
        int size3 = bVar5.f43066b.size();
        TextView textView6 = this.f43052j;
        if (size3 == 1) {
            if (textView6 != null) {
                v22.e.l(textView6);
                return;
            } else {
                s.m("pendingLabelTextView");
                throw null;
            }
        }
        if (textView6 != null) {
            v22.e.l(textView6);
        } else {
            s.m("pendingLabelTextView");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_manage_smart_scale2_user);
        initActionBar(true, R.string.lbl_manage_users);
        this.f43045c = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        String stringExtra = getIntent().getStringExtra("GCM_deviceDisplayName");
        this.f43046d = stringExtra;
        if (stringExtra == null || stringExtra.length() == 0) {
            this.f43046d = getString(R.string.device_family_index);
        }
        View viewFindViewById = findViewById(R.id.invite_indication);
        viewFindViewById.getClass();
        this.f43051i = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.pending_label);
        viewFindViewById2.getClass();
        this.f43052j = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.invite_connections_button);
        viewFindViewById3.getClass();
        Button button = (Button) viewFindViewById3;
        this.f43050h = button;
        button.setOnClickListener(new js0.d(this, 23));
        this.f43048f = new com.garmin.android.apps.connectmobile.settings.devices.index.b(this, new ArrayList(), this.f43046d, new c());
        View viewFindViewById4 = findViewById(R.id.rv_connected_users);
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        com.garmin.android.apps.connectmobile.settings.devices.index.b bVar = this.f43048f;
        if (bVar == null) {
            s.m("connectedUsersAdapter");
            throw null;
        }
        recyclerView.setAdapter(bVar);
        viewFindViewById4.getClass();
        this.f43049g = new com.garmin.android.apps.connectmobile.settings.devices.index.b(this, new ArrayList(), this.f43046d, new d());
        View viewFindViewById5 = findViewById(R.id.rv_pending_users);
        RecyclerView recyclerView2 = (RecyclerView) viewFindViewById5;
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        com.garmin.android.apps.connectmobile.settings.devices.index.b bVar2 = this.f43049g;
        if (bVar2 == null) {
            s.m("pendingUsersAdapter");
            throw null;
        }
        recyclerView2.setAdapter(bVar2);
        viewFindViewById5.getClass();
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(this.f43045c, e31.a.ENTERED_MANAGE_PEOPLE_SCREEN);
        final int i14 = 0;
        dh.b.L(da().f186244c, this, new z0(this) { // from class: mh1.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagePeopleActivity f118526b;

            {
                this.f118526b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                ManagePeopleActivity managePeopleActivity = this.f118526b;
                switch (i15) {
                    case 0:
                        o13.t tVar = managePeopleActivity.f43043a;
                        fw.m mVar = (fw.m) obj;
                        ManagePeopleActivity.a aVar = ManagePeopleActivity.f43042n;
                        mVar.getClass();
                        int i16 = ManagePeopleActivity.b.f43056a[mVar.f73769b.ordinal()];
                        if (i16 == 1) {
                            ((Logger) tVar.getValue()).debug("Received loading status...");
                            managePeopleActivity.showProgressOverlay();
                            return;
                        }
                        if (i16 != 2) {
                            if (i16 != 3) {
                                u0.r();
                                return;
                            }
                            ((Logger) tVar.getValue()).debug("Received error status");
                            managePeopleActivity.hideProgressOverlay();
                            managePeopleActivity.fa(j0.f134944a);
                            managePeopleActivity.ga();
                            return;
                        }
                        managePeopleActivity.hideProgressOverlay();
                        List<com.garmin.android.apps.connectmobile.smartscale.model.e> list = (List) mVar.f73770c;
                        if (list == null || list.isEmpty()) {
                            return;
                        }
                        managePeopleActivity.fa(list);
                        managePeopleActivity.ga();
                        return;
                    default:
                        o13.t tVar2 = managePeopleActivity.f43043a;
                        fw.m mVar2 = (fw.m) obj;
                        ManagePeopleActivity.a aVar2 = ManagePeopleActivity.f43042n;
                        mVar2.getClass();
                        int i17 = ManagePeopleActivity.b.f43056a[mVar2.f73769b.ordinal()];
                        if (i17 == 1) {
                            ((Logger) tVar2.getValue()).debug("Received loading status...");
                            managePeopleActivity.showProgressOverlay();
                            return;
                        }
                        if (i17 != 2) {
                            if (i17 != 3) {
                                u0.r();
                                return;
                            } else {
                                ((Logger) tVar2.getValue()).debug("Received error status");
                                managePeopleActivity.hideProgressOverlay();
                                return;
                            }
                        }
                        managePeopleActivity.hideProgressOverlay();
                        com.garmin.android.apps.connectmobile.smartscale.model.e eVar = (com.garmin.android.apps.connectmobile.smartscale.model.e) mVar2.f73770c;
                        if (eVar != null) {
                            if (eVar.getIsAccepted()) {
                                com.garmin.android.apps.connectmobile.settings.devices.index.b bVar3 = managePeopleActivity.f43048f;
                                if (bVar3 == null) {
                                    p005kotlin.jvm.internal.s.m("connectedUsersAdapter");
                                    throw null;
                                }
                                int iIndexOf = bVar3.f43066b.indexOf(eVar);
                                bVar3.f43066b.remove(eVar);
                                bVar3.notifyItemRemoved(iIndexOf);
                            } else {
                                com.garmin.android.apps.connectmobile.settings.devices.index.b bVar4 = managePeopleActivity.f43049g;
                                if (bVar4 == null) {
                                    p005kotlin.jvm.internal.s.m("pendingUsersAdapter");
                                    throw null;
                                }
                                int iIndexOf2 = bVar4.f43066b.indexOf(eVar);
                                bVar4.f43066b.remove(eVar);
                                bVar4.notifyItemRemoved(iIndexOf2);
                            }
                        }
                        managePeopleActivity.ga();
                        return;
                }
            }
        });
        final int i15 = 1;
        dh.b.L(da().f186245d, this, new z0(this) { // from class: mh1.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagePeopleActivity f118526b;

            {
                this.f118526b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                ManagePeopleActivity managePeopleActivity = this.f118526b;
                switch (i16) {
                    case 0:
                        o13.t tVar = managePeopleActivity.f43043a;
                        fw.m mVar = (fw.m) obj;
                        ManagePeopleActivity.a aVar = ManagePeopleActivity.f43042n;
                        mVar.getClass();
                        int i17 = ManagePeopleActivity.b.f43056a[mVar.f73769b.ordinal()];
                        if (i17 == 1) {
                            ((Logger) tVar.getValue()).debug("Received loading status...");
                            managePeopleActivity.showProgressOverlay();
                            return;
                        }
                        if (i17 != 2) {
                            if (i17 != 3) {
                                u0.r();
                                return;
                            }
                            ((Logger) tVar.getValue()).debug("Received error status");
                            managePeopleActivity.hideProgressOverlay();
                            managePeopleActivity.fa(j0.f134944a);
                            managePeopleActivity.ga();
                            return;
                        }
                        managePeopleActivity.hideProgressOverlay();
                        List<com.garmin.android.apps.connectmobile.smartscale.model.e> list = (List) mVar.f73770c;
                        if (list == null || list.isEmpty()) {
                            return;
                        }
                        managePeopleActivity.fa(list);
                        managePeopleActivity.ga();
                        return;
                    default:
                        o13.t tVar2 = managePeopleActivity.f43043a;
                        fw.m mVar2 = (fw.m) obj;
                        ManagePeopleActivity.a aVar2 = ManagePeopleActivity.f43042n;
                        mVar2.getClass();
                        int i18 = ManagePeopleActivity.b.f43056a[mVar2.f73769b.ordinal()];
                        if (i18 == 1) {
                            ((Logger) tVar2.getValue()).debug("Received loading status...");
                            managePeopleActivity.showProgressOverlay();
                            return;
                        }
                        if (i18 != 2) {
                            if (i18 != 3) {
                                u0.r();
                                return;
                            } else {
                                ((Logger) tVar2.getValue()).debug("Received error status");
                                managePeopleActivity.hideProgressOverlay();
                                return;
                            }
                        }
                        managePeopleActivity.hideProgressOverlay();
                        com.garmin.android.apps.connectmobile.smartscale.model.e eVar = (com.garmin.android.apps.connectmobile.smartscale.model.e) mVar2.f73770c;
                        if (eVar != null) {
                            if (eVar.getIsAccepted()) {
                                com.garmin.android.apps.connectmobile.settings.devices.index.b bVar3 = managePeopleActivity.f43048f;
                                if (bVar3 == null) {
                                    p005kotlin.jvm.internal.s.m("connectedUsersAdapter");
                                    throw null;
                                }
                                int iIndexOf = bVar3.f43066b.indexOf(eVar);
                                bVar3.f43066b.remove(eVar);
                                bVar3.notifyItemRemoved(iIndexOf);
                            } else {
                                com.garmin.android.apps.connectmobile.settings.devices.index.b bVar4 = managePeopleActivity.f43049g;
                                if (bVar4 == null) {
                                    p005kotlin.jvm.internal.s.m("pendingUsersAdapter");
                                    throw null;
                                }
                                int iIndexOf2 = bVar4.f43066b.indexOf(eVar);
                                bVar4.f43066b.remove(eVar);
                                bVar4.notifyItemRemoved(iIndexOf2);
                            }
                        }
                        managePeopleActivity.ga();
                        return;
                }
            }
        });
        az0.b.f13675f.f(this, new e(new x(this, 0)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        MenuItem menuItemAdd = menu.add(0, 10, 0, R.string.lbl_edit);
        menuItemAdd.getClass();
        this.f43053k = menuItemAdd;
        MenuItem menuItemAdd2 = menu.add(0, 20, 0, R.string.lbl_cancel);
        menuItemAdd2.getClass();
        this.f43054l = menuItemAdd2;
        MenuItem menuItem = this.f43053k;
        if (menuItem == null) {
            s.m("editMenuItem");
            throw null;
        }
        menuItem.setShowAsActionFlags(1);
        MenuItem menuItem2 = this.f43053k;
        if (menuItem2 == null) {
            s.m("editMenuItem");
            throw null;
        }
        menuItem2.setVisible(false);
        MenuItem menuItem3 = this.f43054l;
        if (menuItem3 == null) {
            s.m("cancelMenuItem");
            throw null;
        }
        menuItem3.setShowAsActionFlags(1);
        MenuItem menuItem4 = this.f43054l;
        if (menuItem4 != null) {
            menuItem4.setVisible(false);
            return true;
        }
        s.m("cancelMenuItem");
        throw null;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 10) {
            MenuItem menuItem2 = this.f43053k;
            if (menuItem2 == null) {
                s.m("editMenuItem");
                throw null;
            }
            menuItem2.setVisible(false);
            MenuItem menuItem3 = this.f43054l;
            if (menuItem3 == null) {
                s.m("cancelMenuItem");
                throw null;
            }
            menuItem3.setVisible(true);
            com.garmin.android.apps.connectmobile.settings.devices.index.b bVar = this.f43048f;
            if (bVar == null) {
                s.m("connectedUsersAdapter");
                throw null;
            }
            bVar.f43069e = true;
            bVar.notifyItemRangeChanged(0, bVar.f43066b.size(), Boolean.TRUE);
        }
        if (menuItem.getItemId() == 20) {
            MenuItem menuItem4 = this.f43053k;
            if (menuItem4 == null) {
                s.m("editMenuItem");
                throw null;
            }
            menuItem4.setVisible(true);
            MenuItem menuItem5 = this.f43054l;
            if (menuItem5 == null) {
                s.m("cancelMenuItem");
                throw null;
            }
            menuItem5.setVisible(false);
            com.garmin.android.apps.connectmobile.settings.devices.index.b bVar2 = this.f43048f;
            if (bVar2 == null) {
                s.m("connectedUsersAdapter");
                throw null;
            }
            bVar2.f43069e = false;
            bVar2.notifyItemRangeChanged(0, bVar2.f43066b.size(), Boolean.FALSE);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        ca();
        ea();
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        ca();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/index/ManagePeopleActivity$a;", "", "<init>", "()V", "", "MENU_ITEM_EDIT", "I", "MENU_ITEM_CANCEL", "MAX_USERS_NUMBER", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
