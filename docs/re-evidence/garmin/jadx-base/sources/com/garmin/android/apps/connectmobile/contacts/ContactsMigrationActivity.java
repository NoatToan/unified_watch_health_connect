package com.garmin.android.apps.connectmobile.contacts;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.CheckBox;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h0;
import androidx.recyclerview.widget.p;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.snackbar.Snackbar;
import f20.o;
import f20.w;
import f20.x;
import java.util.ArrayList;
import java.util.Iterator;
import o53.c0;
import o53.c2;
import o53.m1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/ContactsMigrationActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "", "Lcom/garmin/android/apps/connectmobile/contacts/g$b;", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContactsMigrationActivity extends com.garmin.android.apps.connectmobile.c implements g.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f32322j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Intent f32323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f32324b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f32325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f32326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f32327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f32328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f32329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f32330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f32331i;

    @Override // com.garmin.android.apps.connectmobile.contacts.g.b
    public final void B(o oVar, CheckBox checkBox) {
        oVar.getClass();
        checkBox.getClass();
        x xVar = this.f32325c;
        if (xVar == null) {
            s.m("presenter");
            throw null;
        }
        ArrayList arrayList = xVar.f68453h;
        if (!oVar.f68411g) {
            int size = arrayList.size();
            int i14 = xVar.f68452g;
            if (size < i14) {
                oVar.f68411g = true;
                arrayList.add(oVar);
                x.e(xVar, null, oVar, 1);
                return;
            } else {
                ContactsMigrationActivity contactsMigrationActivity = xVar.f68446a;
                if (contactsMigrationActivity != null) {
                    u20.e.v6(contactsMigrationActivity.getString(R.string.contact_management_title_max_reached), contactsMigrationActivity.getString(R.string.contact_management_max_reached, Integer.valueOf(i14))).g(contactsMigrationActivity.getSupportFragmentManager());
                    return;
                }
                return;
            }
        }
        int i15 = 0;
        oVar.f68411g = false;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                i15 = -1;
                break;
            } else if (((o) it.next()).f68405a == oVar.f68405a) {
                break;
            } else {
                i15++;
            }
        }
        if (i15 != -1) {
            arrayList.remove(i15);
            x.e(xVar, null, oVar, 1);
        }
    }

    public final void ca(boolean z14) {
        if (z14) {
            ArrayList arrayList = this.f32324b;
            if (!arrayList.isEmpty()) {
                startActivities((Intent[]) arrayList.toArray(new Intent[0]));
            }
        } else {
            Intent intent = this.f32323a;
            if (intent != null) {
                startActivity(intent);
            }
        }
        setResult(-1);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i14;
        Bundle extras;
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        hl.a aVar = hl.a.c.f84256b;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            i14 = -1;
        } else {
            i14 = extras.getInt("KEY_TITLE_RES_ID", -1);
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
            } else {
                Parcelable parcelable3 = extras.getParcelable("GCM_extra_screen_access_role");
                if (!(parcelable3 instanceof hl.a)) {
                    parcelable3 = null;
                }
                parcelable = (hl.a) parcelable3;
            }
            hl.a aVar2 = (hl.a) parcelable;
            if (aVar2 != null) {
                aVar = aVar2;
            }
            if (i15 >= 33) {
                parcelable2 = (Parcelable) extras.getParcelable("KEY_MIGRATION_SKIPPED_REDIRECT_INTENT", Intent.class);
            } else {
                Parcelable parcelable4 = extras.getParcelable("KEY_MIGRATION_SKIPPED_REDIRECT_INTENT");
                if (!(parcelable4 instanceof Intent)) {
                    parcelable4 = null;
                }
                parcelable2 = (Intent) parcelable4;
            }
            this.f32323a = (Intent) parcelable2;
            Parcelable[] parcelableArray = extras.getParcelableArray("KEY_MIGRATION_DONE_REDIRECT_INTENTS");
            if (parcelableArray != null) {
                for (Parcelable parcelable5 : parcelableArray) {
                    if (parcelable5 instanceof Intent) {
                        this.f32324b.add(parcelable5);
                    }
                }
            }
        }
        x xVar = new x();
        this.f32325c = xVar;
        if ((aVar instanceof hl.a.b) || !xVar.a().g()) {
            ca(false);
            return;
        }
        setContentView(R.layout.gcm4_contacts_migration_activity);
        initActionBar(true);
        if (i14 != -1) {
            setTitle(i14);
        }
        View viewFindViewById = findViewById(R.id.empty_view_container);
        viewFindViewById.getClass();
        this.f32330h = viewFindViewById;
        findViewById(R.id.button_positive).setOnClickListener(new w(this, 1));
        findViewById(R.id.button_negative).setOnClickListener(new w(this, 2));
        View viewFindViewById2 = findViewById(R.id.contacts_container);
        viewFindViewById2.getClass();
        this.f32331i = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.recycler_view);
        viewFindViewById3.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f32326d = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = this.f32326d;
        if (recyclerView2 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView2.setHasFixedSize(true);
        RecyclerView recyclerView3 = this.f32326d;
        if (recyclerView3 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView3.addItemDecoration(new p(this, 1));
        g gVar = new g(this, this, true);
        this.f32327e = gVar;
        RecyclerView recyclerView4 = this.f32326d;
        if (recyclerView4 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView4.setAdapter(gVar);
        RecyclerView recyclerView5 = this.f32326d;
        if (recyclerView5 == null) {
            s.m("recyclerView");
            throw null;
        }
        RecyclerView.m itemAnimator = recyclerView5.getItemAnimator();
        h0 h0Var = itemAnimator instanceof h0 ? (h0) itemAnimator : null;
        if (h0Var != null) {
            h0Var.f10476g = false;
        }
        View viewFindViewById4 = findViewById(R.id.bottom_container);
        viewFindViewById4.getClass();
        this.f32328f = viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.save_btn);
        viewFindViewById5.getClass();
        this.f32329g = viewFindViewById5;
        viewFindViewById5.setOnClickListener(new w(this, 3));
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (i14 != 1) {
            super.onRequestPermissionsResult(i14, strArr, iArr);
            return;
        }
        j22.b.f96736a.getClass();
        if (j22.b.E(iArr)) {
            x xVar = this.f32325c;
            if (xVar != null) {
                xVar.c();
                return;
            } else {
                s.m("presenter");
                throw null;
            }
        }
        RecyclerView recyclerView = this.f32326d;
        if (recyclerView == null) {
            s.m("recyclerView");
            throw null;
        }
        Snackbar snackbarMake = Snackbar.make(recyclerView, j22.b.g(j22.a.f96717f), 0);
        snackbarMake.getClass();
        snackbarMake.setAction(R.string.lbl_settings, new w(this, 0));
        v22.c.a(snackbarMake);
        snackbarMake.show();
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        c2 c2Var;
        c2 c2Var2;
        super.onStart();
        x xVar = this.f32325c;
        if (xVar == null) {
            s.m("presenter");
            throw null;
        }
        xVar.f68446a = this;
        m1 m1VarC = g8.i.c();
        x53.c cVar = s0.f129406a;
        xVar.f68455j = c0.a(t13.g.a.C3052a.d(x53.b.f189152a, m1VarC));
        xVar.a().a();
        xVar.a().b();
        xVar.a().f(xVar.f68455j);
        if (xVar.f68448c && (c2Var2 = xVar.f68457l) != null && !c2Var2.isActive()) {
            xVar.f68448c = false;
            ContactsMigrationActivity contactsMigrationActivity = xVar.f68446a;
            if (contactsMigrationActivity != null) {
                j22.b bVar = j22.b.f96736a;
                j22.a aVar = j22.a.f96717f;
                bVar.getClass();
                if (j22.b.k(aVar)) {
                    xVar.c();
                    return;
                } else {
                    j22.b.B(contactsMigrationActivity, aVar);
                    return;
                }
            }
            return;
        }
        if (xVar.f68449d && (c2Var = xVar.f68456k) != null && !c2Var.isActive()) {
            xVar.f68449d = false;
            xVar.d();
            return;
        }
        if (xVar.f68450e != null) {
            xVar.b();
            return;
        }
        ContactsMigrationActivity contactsMigrationActivity2 = xVar.f68446a;
        if (contactsMigrationActivity2 != null) {
            View view2 = contactsMigrationActivity2.f32330h;
            if (view2 == null) {
                s.m("emptyViewContainer");
                throw null;
            }
            v22.e.q(view2);
            View view3 = contactsMigrationActivity2.f32331i;
            if (view3 != null) {
                v22.e.j(view3);
            } else {
                s.m("contactListContainer");
                throw null;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        x xVar = this.f32325c;
        if (xVar == null) {
            s.m("presenter");
            throw null;
        }
        c2 c2Var = xVar.f68457l;
        if (c2Var == null || !c2Var.isActive()) {
            c2 c2Var2 = xVar.f68456k;
            if (c2Var2 != null && c2Var2.isActive()) {
                c2 c2Var3 = xVar.f68456k;
                if (c2Var3 != null) {
                    c2Var3.c(null);
                }
                xVar.f68449d = true;
                ContactsMigrationActivity contactsMigrationActivity = xVar.f68446a;
                if (contactsMigrationActivity != null) {
                    contactsMigrationActivity.hideProgressOverlay();
                }
            }
        } else {
            c2 c2Var4 = xVar.f68457l;
            if (c2Var4 != null) {
                c2Var4.c(null);
            }
            xVar.f68448c = true;
            ContactsMigrationActivity contactsMigrationActivity2 = xVar.f68446a;
            if (contactsMigrationActivity2 != null) {
                contactsMigrationActivity2.hideProgressOverlay();
            }
        }
        u53.d dVar = xVar.f68455j;
        if (dVar != null) {
            c0.c(dVar, null);
        }
        xVar.f68446a = null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/ContactsMigrationActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_TITLE_RES_ID", "KEY_MIGRATION_DONE_REDIRECT_INTENTS", "KEY_MIGRATION_SKIPPED_REDIRECT_INTENT", "", "REQUEST_CODE_READ_CONTACTS_PERMISSION", "I", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, Intent intent, Intent[] intentArr, hl.a aVar) {
            context.getClass();
            aVar.getClass();
            Intent intent2 = new Intent(context, (Class<?>) ContactsMigrationActivity.class);
            intent2.putExtra("KEY_TITLE_RES_ID", R.string.contact_management_title_contacts);
            intent2.putExtra("KEY_MIGRATION_SKIPPED_REDIRECT_INTENT", intent);
            intent2.putExtra("KEY_MIGRATION_DONE_REDIRECT_INTENTS", intentArr);
            intent2.putExtra("GCM_extra_screen_access_role", aVar);
            return intent2;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, Intent intent, Intent[] intentArr, int i14) {
            if ((i14 & 4) != 0) {
                intent = null;
            }
            if ((i14 & 8) != 0) {
                intentArr = null;
            }
            hl.a.c cVar = hl.a.c.f84256b;
            aVar.getClass();
            return a(context, intent, intentArr, cVar);
        }

        private a() {
        }
    }
}
