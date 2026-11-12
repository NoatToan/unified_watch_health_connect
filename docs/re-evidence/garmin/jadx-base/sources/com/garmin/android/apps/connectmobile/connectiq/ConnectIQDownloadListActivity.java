package com.garmin.android.apps.connectmobile.connectiq;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.f3;
import c62.m1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQDownloadListActivity.g;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import java.io.Serializable;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/ConnectIQDownloadListActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/connectiq/b0$k;", "Lsq0/e;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConnectIQDownloadListActivity extends com.garmin.android.apps.connectmobile.c implements b0.k, sq0.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f31779o = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f31780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.recyclerview.widget.s f31781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f31782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f31783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f31784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f31785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.appcompat.app.e f31787h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o13.t f31790k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a32.b f31788i = new a32.b(this, 29);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f31789j = new n();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f31791l = new q(this, 5);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f31792m = new q(this, 6);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q f31793n = new q(this, 7);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31794a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.APPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.WIDGETS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.WATCH_FACES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.DATA_FIELDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.MUSIC_PROVIDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f31794a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/connectiq/ConnectIQDownloadListActivity$c", "Landroid/text/style/ClickableSpan;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends ClickableSpan {
        public c() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view2) {
            view2.getClass();
            a aVar = ConnectIQDownloadListActivity.f31779o;
            ConnectIQDownloadListActivity connectIQDownloadListActivity = ConnectIQDownloadListActivity.this;
            connectIQDownloadListActivity.fa().f193921v.f(connectIQDownloadListActivity, new d(new q(connectIQDownloadListActivity, 3)));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.getClass();
            textPaint.setColor(a7.b.getColor(ConnectIQDownloadListActivity.this, R.color.gcm_text_primary_action_selector));
            textPaint.setUnderlineText(false);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements androidx.lifecycle.z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f31796a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f31796a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f31796a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31796a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f31797a;

        public e(b.g gVar) {
            this.f31797a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f31797a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f31798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f31799b;

        public f(e23.a aVar, b.g gVar) {
            this.f31798a = aVar;
            this.f31799b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f31798a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f31799b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/connectiq/ConnectIQDownloadListActivity$g", "Lyr1/r;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements yr1.r {
        public g() {
        }

        @Override // yr1.r
        public final void B1(al2.c cVar) {
        }

        @Override // yr1.r
        public final void F1(al2.a aVar, boolean z14) {
        }

        @Override // yr1.r
        public final void g5(al2.c cVar, boolean z14) {
            a aVar = ConnectIQDownloadListActivity.f31779o;
            ConnectIQDownloadListActivity connectIQDownloadListActivity = ConnectIQDownloadListActivity.this;
            if (hk0.p.k(connectIQDownloadListActivity.ea())) {
                y10.k kVarFa = connectIQDownloadListActivity.fa();
                int i14 = y10.k.f193901y;
                ge1.b.T(v1.a(kVarFa), null, null, new y10.d0(kVarFa, null, null), 3);
            }
        }
    }

    public ConnectIQDownloadListActivity() {
        final int i14 = 0;
        this.f31783d = new w1(p005kotlin.jvm.internal.s0.f105811a.b(y10.k.class), new e(this), new e23.a(this) { // from class: com.garmin.android.apps.connectmobile.connectiq.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectIQDownloadListActivity f31942b;

            {
                this.f31942b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                ConnectIQDownloadListActivity connectIQDownloadListActivity = this.f31942b;
                switch (i15) {
                    case 0:
                        ConnectIQDownloadListActivity.a aVar = ConnectIQDownloadListActivity.f31779o;
                        return new y10.f0(connectIQDownloadListActivity.da(), connectIQDownloadListActivity.ea(), null, null, null, null, null, null, 252, null);
                    case 1:
                        ConnectIQDownloadListActivity.a aVar2 = ConnectIQDownloadListActivity.f31779o;
                        return Long.valueOf(connectIQDownloadListActivity.getIntent().getLongExtra("CONNECT_IQ_DEVICE_UNIT_ID", -1L));
                    case 2:
                        ConnectIQDownloadListActivity.a aVar3 = ConnectIQDownloadListActivity.f31779o;
                        Intent intent = connectIQDownloadListActivity.getIntent();
                        Serializable serializableExtra = null;
                        if (Build.VERSION.SDK_INT < 33) {
                            Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("CONNECT_IQ_CATEGORY") : null;
                            serializableExtra = (l) (serializableExtra2 instanceof l ? serializableExtra2 : null);
                        } else if (intent != null) {
                            serializableExtra = intent.getSerializableExtra("CONNECT_IQ_CATEGORY", l.class);
                        }
                        l lVar = (l) serializableExtra;
                        return lVar == null ? l.APPS : lVar;
                    default:
                        ConnectIQDownloadListActivity.a aVar4 = ConnectIQDownloadListActivity.f31779o;
                        return new yr1.q("ConnectIQDownloadListActivity", connectIQDownloadListActivity.new g(), Long.valueOf(connectIQDownloadListActivity.ea()), null, 8, null);
                }
            }
        }, new f(null, this));
        final int i15 = 1;
        this.f31784e = o13.m.b(new e23.a(this) { // from class: com.garmin.android.apps.connectmobile.connectiq.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectIQDownloadListActivity f31942b;

            {
                this.f31942b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                ConnectIQDownloadListActivity connectIQDownloadListActivity = this.f31942b;
                switch (i16) {
                    case 0:
                        ConnectIQDownloadListActivity.a aVar = ConnectIQDownloadListActivity.f31779o;
                        return new y10.f0(connectIQDownloadListActivity.da(), connectIQDownloadListActivity.ea(), null, null, null, null, null, null, 252, null);
                    case 1:
                        ConnectIQDownloadListActivity.a aVar2 = ConnectIQDownloadListActivity.f31779o;
                        return Long.valueOf(connectIQDownloadListActivity.getIntent().getLongExtra("CONNECT_IQ_DEVICE_UNIT_ID", -1L));
                    case 2:
                        ConnectIQDownloadListActivity.a aVar3 = ConnectIQDownloadListActivity.f31779o;
                        Intent intent = connectIQDownloadListActivity.getIntent();
                        Serializable serializableExtra = null;
                        if (Build.VERSION.SDK_INT < 33) {
                            Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("CONNECT_IQ_CATEGORY") : null;
                            serializableExtra = (l) (serializableExtra2 instanceof l ? serializableExtra2 : null);
                        } else if (intent != null) {
                            serializableExtra = intent.getSerializableExtra("CONNECT_IQ_CATEGORY", l.class);
                        }
                        l lVar = (l) serializableExtra;
                        return lVar == null ? l.APPS : lVar;
                    default:
                        ConnectIQDownloadListActivity.a aVar4 = ConnectIQDownloadListActivity.f31779o;
                        return new yr1.q("ConnectIQDownloadListActivity", connectIQDownloadListActivity.new g(), Long.valueOf(connectIQDownloadListActivity.ea()), null, 8, null);
                }
            }
        });
        final int i16 = 2;
        this.f31785f = o13.m.b(new e23.a(this) { // from class: com.garmin.android.apps.connectmobile.connectiq.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectIQDownloadListActivity f31942b;

            {
                this.f31942b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                ConnectIQDownloadListActivity connectIQDownloadListActivity = this.f31942b;
                switch (i17) {
                    case 0:
                        ConnectIQDownloadListActivity.a aVar = ConnectIQDownloadListActivity.f31779o;
                        return new y10.f0(connectIQDownloadListActivity.da(), connectIQDownloadListActivity.ea(), null, null, null, null, null, null, 252, null);
                    case 1:
                        ConnectIQDownloadListActivity.a aVar2 = ConnectIQDownloadListActivity.f31779o;
                        return Long.valueOf(connectIQDownloadListActivity.getIntent().getLongExtra("CONNECT_IQ_DEVICE_UNIT_ID", -1L));
                    case 2:
                        ConnectIQDownloadListActivity.a aVar3 = ConnectIQDownloadListActivity.f31779o;
                        Intent intent = connectIQDownloadListActivity.getIntent();
                        Serializable serializableExtra = null;
                        if (Build.VERSION.SDK_INT < 33) {
                            Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("CONNECT_IQ_CATEGORY") : null;
                            serializableExtra = (l) (serializableExtra2 instanceof l ? serializableExtra2 : null);
                        } else if (intent != null) {
                            serializableExtra = intent.getSerializableExtra("CONNECT_IQ_CATEGORY", l.class);
                        }
                        l lVar = (l) serializableExtra;
                        return lVar == null ? l.APPS : lVar;
                    default:
                        ConnectIQDownloadListActivity.a aVar4 = ConnectIQDownloadListActivity.f31779o;
                        return new yr1.q("ConnectIQDownloadListActivity", connectIQDownloadListActivity.new g(), Long.valueOf(connectIQDownloadListActivity.ea()), null, 8, null);
                }
            }
        });
        final int i17 = 3;
        this.f31790k = o13.m.b(new e23.a(this) { // from class: com.garmin.android.apps.connectmobile.connectiq.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectIQDownloadListActivity f31942b;

            {
                this.f31942b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i18 = i17;
                ConnectIQDownloadListActivity connectIQDownloadListActivity = this.f31942b;
                switch (i18) {
                    case 0:
                        ConnectIQDownloadListActivity.a aVar = ConnectIQDownloadListActivity.f31779o;
                        return new y10.f0(connectIQDownloadListActivity.da(), connectIQDownloadListActivity.ea(), null, null, null, null, null, null, 252, null);
                    case 1:
                        ConnectIQDownloadListActivity.a aVar2 = ConnectIQDownloadListActivity.f31779o;
                        return Long.valueOf(connectIQDownloadListActivity.getIntent().getLongExtra("CONNECT_IQ_DEVICE_UNIT_ID", -1L));
                    case 2:
                        ConnectIQDownloadListActivity.a aVar3 = ConnectIQDownloadListActivity.f31779o;
                        Intent intent = connectIQDownloadListActivity.getIntent();
                        Serializable serializableExtra = null;
                        if (Build.VERSION.SDK_INT < 33) {
                            Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("CONNECT_IQ_CATEGORY") : null;
                            serializableExtra = (l) (serializableExtra2 instanceof l ? serializableExtra2 : null);
                        } else if (intent != null) {
                            serializableExtra = intent.getSerializableExtra("CONNECT_IQ_CATEGORY", l.class);
                        }
                        l lVar = (l) serializableExtra;
                        return lVar == null ? l.APPS : lVar;
                    default:
                        ConnectIQDownloadListActivity.a aVar4 = ConnectIQDownloadListActivity.f31779o;
                        return new yr1.q("ConnectIQDownloadListActivity", connectIQDownloadListActivity.new g(), Long.valueOf(connectIQDownloadListActivity.ea()), null, 8, null);
                }
            }
        });
    }

    public static Unit ca(ConnectIQDownloadListActivity connectIQDownloadListActivity) {
        super.onNavigateUp();
        return Unit.INSTANCE;
    }

    @Override // sq0.e
    public final void H6(RecyclerView.f0 f0Var) {
        f0Var.getClass();
        androidx.recyclerview.widget.s sVar = this.f31781b;
        if (sVar != null) {
            sVar.o(f0Var);
        } else {
            p005kotlin.jvm.internal.s.m("itemTouchHelperList");
            throw null;
        }
    }

    public final l da() {
        return (l) this.f31785f.getValue();
    }

    public final long ea() {
        return ((Number) this.f31784e.getValue()).longValue();
    }

    public final y10.k fa() {
        return (y10.k) this.f31783d.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            y10.k kVarFa = fa();
            int i16 = y10.k.f193901y;
            ge1.b.T(v1.a(kVarFa), null, null, new y10.d0(kVarFa, null, null), 3);
        } else {
            if (i15 != 999) {
                return;
            }
            setResult(999);
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        setResult(0);
        if (fa().H4()) {
            showProgressOverlay(getString(R.string.txt_saving));
        }
        fa().K4(null, new q(this, 2));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i14;
        super.onCreate(bundle);
        setContentView(R.layout.gcm_connect_iq_app_management);
        switch (b.f31794a[da().ordinal()]) {
            case 1:
                i14 = R.string.device_settings_activities_apps;
                break;
            case 2:
                rd2.j jVar = rd2.f.a().f152045a;
                long jEa = ea();
                jVar.getClass();
                sd2.f fVarI = rd2.j.i(jEa, null);
                i14 = !zb0.u0.c(fVarI != null ? fVarI.getProductNumber() : null) ? R.string.connect_iq_widgets : R.string.ciq_glances_title;
                break;
            case 3:
                i14 = R.string.connect_iq_watch_faces;
                break;
            case 4:
                i14 = R.string.connect_iq_data_fields;
                break;
            case 5:
                i14 = R.string.device_screen_music;
                break;
            case 6:
                i14 = R.string.unknown;
                break;
            default:
                lc.u0.r();
                return;
        }
        initActionBar(true, i14);
        b0.e().f31823a = ea();
        fa().f193918q.f(this, new d(new q(this, 8)));
        fa().f193920t.f(this, new d(new q(this, 0)));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.ciq_app_mgt_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        l lVarDa = da();
        m1 m1Var = new m1(this, 15);
        q qVar = this.f31791l;
        q qVar2 = this.f31792m;
        q qVar3 = this.f31793n;
        a32.b bVar = this.f31788i;
        w wVar = new w(lVarDa, this, qVar, qVar2, qVar3, bVar, m1Var);
        this.f31780a = wVar;
        recyclerView.setAdapter(wVar);
        View viewFindViewById = findViewById(R.id.get_more_banner);
        viewFindViewById.getClass();
        Button button = (Button) viewFindViewById;
        this.f31782c = button;
        button.setOnClickListener(bVar);
        Button button2 = this.f31782c;
        if (button2 == null) {
            p005kotlin.jvm.internal.s.m("getMoreBtn");
            throw null;
        }
        button2.setText(da().f31896c);
        TextView textView = (TextView) findViewById(R.id.usage_description_text_view);
        if (da() == l.MUSIC_PROVIDER) {
            c cVar = new c();
            textView.setText(getString(R.string.music_wifi_required_text));
            f3.f23054a.getClass();
            textView.setText(f3.d(textView, cVar));
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        if (da() == l.DATA_FIELDS) {
            if (!GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_connect_iq_datafield_alert), false)) {
                androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(this).setMessage(R.string.connect_iq_installing_data_fields_msg).setPositiveButton(R.string.lbl_ok, new i(2)).create();
                this.f31787h = eVarCreate;
                if (eVarCreate != null) {
                    eVarCreate.show();
                }
            }
        } else if (da() == l.WIDGETS) {
            ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(ea(), e31.a.ENTERED_WIDGETS_SETUP_SCREEN);
        }
        w wVar2 = this.f31780a;
        if (wVar2 == null) {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
        androidx.recyclerview.widget.s sVar = new androidx.recyclerview.widget.s(new t(wVar2));
        this.f31781b = sVar;
        sVar.e(recyclerView);
        y10.k kVarFa = fa();
        ge1.b.T(v1.a(kVarFa), null, null, new y10.d0(kVarFa, null, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        setResult(0);
        if (fa().H4()) {
            showProgressOverlay(getString(R.string.txt_saving));
        }
        fa().K4(null, new q(this, 1));
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        hideProgressOverlay();
        ((yr1.q) this.f31790k.getValue()).e();
        if (this.f31786g) {
            n nVar = this.f31789j;
            nVar.getClass();
            da2.d.b().f58886a.i(nVar);
            this.f31786g = false;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((yr1.q) this.f31790k.getValue()).b();
        if (this.f31786g) {
            return;
        }
        this.f31789j.a(this, ea());
        this.f31786g = true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/ConnectIQDownloadListActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "APP_TYPE", "CONNECT_IQ_CATEGORY", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, long j8, l lVar) {
            context.getClass();
            lVar.getClass();
            Intent intent = new Intent(context, (Class<?>) ConnectIQDownloadListActivity.class);
            intent.putExtra("CONNECT_IQ_CATEGORY", lVar);
            intent.putExtra("CONNECT_IQ_DEVICE_UNIT_ID", j8);
            context.startActivity(intent);
        }

        private a() {
        }
    }
}
