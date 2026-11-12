package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.view.j;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import lx0.k;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import w3.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/MCTCycleTypeActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MCTCycleTypeActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f39091e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39092a = m.a(n.NONE, new b(this, null, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ww0.a f39093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ww0.a f39094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MenuItem f39095d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f39096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f39097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f39098c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f39099d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f39096a = gVar;
            this.f39097b = qualifier;
            this.f39098c = aVar;
            this.f39099d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, lx0.k] */
        @Override // e23.a
        public final k invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f39096a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f39098c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(k.class), f189591b, null, defaultViewModelCreationExtras, this.f39097b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f39099d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 201 && i15 == -1) {
            setResult(1, intent);
            finish();
        }
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Bundle extras2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_mct_cycle_type);
        initActionBar(R.string.mct_cycle_type, 3);
        Intent intent = getIntent();
        this.f39093b = x.l((intent == null || (extras2 = intent.getExtras()) == null) ? null : Integer.valueOf(extras2.getInt("CYCLE_TYPE_KEY")));
        Intent intent2 = getIntent();
        this.f39094c = x.l((intent2 == null || (extras = intent2.getExtras()) == null) ? null : Integer.valueOf(extras.getInt("CURRENT_CYCLE_TYPE_KEY")));
        k kVar = (k) this.f39092a.getValue();
        ww0.a aVar = this.f39094c;
        if (aVar == null) {
            s.m("mCurrentCycleType");
            throw null;
        }
        kVar.getClass();
        kVar.f115190f = aVar;
        c cVar = new c();
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        aVarB.j(R.id.cycle_type_container, cVar, "CYCLE_TYPE_FRAGMENT_TAG", 1);
        aVarB.e();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.save_menu, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.save_menu_item);
        menuItemFindItem.getClass();
        this.f39095d = menuItemFindItem;
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        ww0.a aVar;
        ww0.a aVar2;
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.save_menu_item) {
            return super.onOptionsItemSelected(menuItem);
        }
        ww0.a aVar3 = ((k) this.f39092a.getValue()).f115190f;
        ww0.a aVar4 = ww0.a.PREGNANT;
        if (aVar3 != aVar4) {
            aVar = ww0.a.NONE;
            if (aVar3 == aVar) {
                Intent intent = new Intent();
                intent.putExtra("CYCLE_TYPE_KEY", aVar3.ordinal());
                setResult(-1, intent);
                finish();
            } else {
                aVar2 = this.f39093b;
                if (aVar2 != null) {
                    s.m("mOriginalCycleType");
                    throw null;
                }
                if (aVar2 != aVar || aVar2 == ww0.a.INACTIVE) {
                    new androidx.appcompat.app.e.a(this).setTitle(getString(R.string.mct_updates_needed)).setMessage(getString(R.string.mct_changing_your_cycle_type)).setNegativeButton(getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setPositiveButton(getString(R.string.lbl_common_continue), new kx0.f(this, 5)).show();
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("CYCLE_TYPE_KEY", aVar3.ordinal());
                    setResult(-1, intent2);
                    finish();
                }
            }
        } else {
            ww0.a aVar5 = this.f39093b;
            if (aVar5 == null) {
                s.m("mOriginalCycleType");
                throw null;
            }
            if (aVar5 != aVar4) {
                ((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).v(this);
            } else {
                aVar = ww0.a.NONE;
                if (aVar3 == aVar) {
                    Intent intent3 = new Intent();
                    intent3.putExtra("CYCLE_TYPE_KEY", aVar3.ordinal());
                    setResult(-1, intent3);
                    finish();
                } else {
                    aVar2 = this.f39093b;
                    if (aVar2 != null) {
                        s.m("mOriginalCycleType");
                        throw null;
                    }
                    if (aVar2 != aVar) {
                    }
                    new androidx.appcompat.app.e.a(this).setTitle(getString(R.string.mct_updates_needed)).setMessage(getString(R.string.mct_changing_your_cycle_type)).setNegativeButton(getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setPositiveButton(getString(R.string.lbl_common_continue), new kx0.f(this, 5)).show();
                }
            }
        }
        sn.a.o(l.f68084a, true);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o13.l] */
    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        boolean z14;
        menu.getClass();
        MenuItem menuItem = this.f39095d;
        if (menuItem != null) {
            ?? r14 = this.f39092a;
            if (((k) r14.getValue()).f115190f != ww0.a.INACTIVE) {
                ww0.a aVar = ((k) r14.getValue()).f115190f;
                ww0.a aVar2 = this.f39093b;
                if (aVar2 == null) {
                    s.m("mOriginalCycleType");
                    throw null;
                }
                if (aVar != aVar2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            menuItem.setEnabled(z14);
        }
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/MCTCycleTypeActivity$a;", "", "<init>", "()V", "", "CYCLE_TYPE_KEY", "Ljava/lang/String;", "CURRENT_CYCLE_TYPE_KEY", "", "SETUP_REQUEST_CODE", "I", "CYCLE_TYPE_FRAGMENT_TAG", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, ww0.a aVar, ww0.a aVar2) {
            aVar.getClass();
            aVar2.getClass();
            Intent intent = new Intent(context, (Class<?>) MCTCycleTypeActivity.class);
            intent.putExtra("CYCLE_TYPE_KEY", aVar.ordinal());
            intent.putExtra("CURRENT_CYCLE_TYPE_KEY", aVar2.ordinal());
            return intent;
        }

        private a() {
        }
    }
}
