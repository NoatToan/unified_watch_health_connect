package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MCTSettingsContraceptionActivity;
import java.io.Serializable;
import java.text.Collator;
import lx0.k;
import o13.m;
import o13.n;
import o13.t;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p13.u;
import ww0.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/settings/MCTSettingsContraceptionActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MCTSettingsContraceptionActivity extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f39006d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f39007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f39008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f39009c = m.a(n.NONE, new b(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f39010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f39011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f39012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f39013d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f39010a = gVar;
            this.f39011b = qualifier;
            this.f39012c = aVar;
            this.f39013d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, lx0.k] */
        @Override // e23.a
        public final k invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f39010a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f39012c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(k.class), f189591b, null, defaultViewModelCreationExtras, this.f39011b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f39013d, 4, null);
        }
    }

    public MCTSettingsContraceptionActivity() {
        final int i14 = 0;
        this.f39007a = m.b(new e23.a(this) { // from class: kx0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MCTSettingsContraceptionActivity f107038b;

            {
                this.f107038b = this;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, o13.l] */
            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                MCTSettingsContraceptionActivity mCTSettingsContraceptionActivity = this.f107038b;
                switch (i15) {
                    case 0:
                        MCTSettingsContraceptionActivity.a aVar = MCTSettingsContraceptionActivity.f39006d;
                        ww0.i.f187563a.getClass();
                        Collator collator = Collator.getInstance();
                        collator.setStrength(1);
                        return (ww0.i[]) u.Y(ww0.i.values(), new ww0.d(new wb1.i(14, collator, mCTSettingsContraceptionActivity), 1)).toArray(new ww0.i[0]);
                    default:
                        MCTSettingsContraceptionActivity.a aVar2 = MCTSettingsContraceptionActivity.f39006d;
                        return new lx0.b((ww0.i[]) mCTSettingsContraceptionActivity.f39007a.getValue(), (lx0.k) mCTSettingsContraceptionActivity.f39009c.getValue(), mCTSettingsContraceptionActivity);
                }
            }
        });
        final int i15 = 1;
        this.f39008b = m.b(new e23.a(this) { // from class: kx0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MCTSettingsContraceptionActivity f107038b;

            {
                this.f107038b = this;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, o13.l] */
            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                MCTSettingsContraceptionActivity mCTSettingsContraceptionActivity = this.f107038b;
                switch (i16) {
                    case 0:
                        MCTSettingsContraceptionActivity.a aVar = MCTSettingsContraceptionActivity.f39006d;
                        ww0.i.f187563a.getClass();
                        Collator collator = Collator.getInstance();
                        collator.setStrength(1);
                        return (ww0.i[]) u.Y(ww0.i.values(), new ww0.d(new wb1.i(14, collator, mCTSettingsContraceptionActivity), 1)).toArray(new ww0.i[0]);
                    default:
                        MCTSettingsContraceptionActivity.a aVar2 = MCTSettingsContraceptionActivity.f39006d;
                        return new lx0.b((ww0.i[]) mCTSettingsContraceptionActivity.f39007a.getValue(), (lx0.k) mCTSettingsContraceptionActivity.f39009c.getValue(), mCTSettingsContraceptionActivity);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        Intent intent = getIntent();
        Serializable serializableExtra = null;
        if (Build.VERSION.SDK_INT < 33) {
            Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("SELECTED_CONTRACEPTIVE_KEY") : null;
            serializableExtra = (i) (serializableExtra2 instanceof i ? serializableExtra2 : null);
        } else if (intent != null) {
            serializableExtra = intent.getSerializableExtra("SELECTED_CONTRACEPTIVE_KEY", i.class);
        }
        ?? r14 = this.f39009c;
        if (serializableExtra != ((k) r14.getValue()).f115194j) {
            setResult(-1, new Intent().putExtra("SELECTED_CONTRACEPTIVE_KEY", ((k) r14.getValue()).f115194j));
        } else {
            setResult(0);
        }
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        Serializable serializableExtra;
        i iVar;
        Object serializable;
        super.onCreate(bundle);
        setContentView(R.layout.activity_mct_settings_hormonal);
        initActionBar(true, getString(R.string.mct_hormonal_contraceptives));
        k kVar = (k) this.f39009c.getValue();
        Serializable serializableExtra2 = null;
        if (bundle == null) {
            intent = getIntent();
            if (Build.VERSION.SDK_INT >= 33) {
                if (intent != null) {
                    serializableExtra = intent.getSerializableExtra("SELECTED_CONTRACEPTIVE_KEY");
                } else {
                    serializableExtra = null;
                }
                serializableExtra2 = (i) (serializableExtra instanceof i ? serializableExtra : null);
            } else if (intent != null) {
                serializableExtra2 = intent.getSerializableExtra("SELECTED_CONTRACEPTIVE_KEY", i.class);
            }
            serializableExtra2.getClass();
            iVar = (i) serializableExtra2;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable("SELECTED_CONTRACEPTIVE_KEY", i.class);
            } else {
                Object serializable2 = bundle.getSerializable("SELECTED_CONTRACEPTIVE_KEY");
                if (!(serializable2 instanceof i)) {
                    serializable2 = null;
                }
                serializable = (i) serializable2;
            }
            iVar = (i) serializable;
            if (iVar == null) {
                intent = getIntent();
                if (Build.VERSION.SDK_INT >= 33) {
                    if (intent != null) {
                        serializableExtra = intent.getSerializableExtra("SELECTED_CONTRACEPTIVE_KEY");
                    } else {
                        serializableExtra = null;
                    }
                    serializableExtra2 = (i) (serializableExtra instanceof i ? serializableExtra : null);
                } else if (intent != null) {
                    serializableExtra2 = intent.getSerializableExtra("SELECTED_CONTRACEPTIVE_KEY", i.class);
                }
                serializableExtra2.getClass();
                iVar = (i) serializableExtra2;
            }
        }
        kVar.getClass();
        kVar.f115194j = iVar;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.contraception_setup_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter((lx0.b) this.f39008b.getValue());
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putSerializable("SELECTED_CONTRACEPTIVE_KEY", ((k) this.f39009c.getValue()).f115194j);
        super.onSaveInstanceState(bundle);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/settings/MCTSettingsContraceptionActivity$a;", "", "<init>", "()V", "", "SELECTED_CONTRACEPTIVE_KEY", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
