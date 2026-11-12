package com.garmin.android.apps.connectmobile.contacts;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h0;
import com.garmin.android.apps.connectmobile.R;
import f20.p;
import f20.q;
import f20.r;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/ContactProfilesActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lf20/q;", "Lcom/garmin/android/apps/connectmobile/contacts/c$c;", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContactProfilesActivity extends com.garmin.android.apps.connectmobile.c implements q, c.InterfaceC0526c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f32317e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f32318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f32319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f32320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MenuItem f32321d;

    @Override // f20.q
    public final void U4() {
        MenuItem menuItem = this.f32321d;
        if (menuItem != null) {
            menuItem.setEnabled(true);
        }
    }

    @Override // f20.q
    public final void c9(ArrayList<p> arrayList) {
        arrayList.getClass();
        c cVar = this.f32320c;
        if (cVar == null) {
            s.m("adapter");
            throw null;
        }
        ArrayList<p> arrayList2 = cVar.f32379b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        cVar.notifyDataSetChanged();
    }

    @Override // com.garmin.android.apps.connectmobile.contacts.c.InterfaceC0526c
    public final void g3(p pVar) {
        r rVar = this.f32318a;
        if (rVar == null) {
            s.m("presenter");
            throw null;
        }
        rVar.f68426b = pVar;
        rVar.f68425a.U4();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_recycler_view_layout);
        initActionBar(R.string.contact_management_choose_profile, 3);
        View viewFindViewById = findViewById(R.id.recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f32319b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = this.f32319b;
        ArrayList arrayList = null;
        if (recyclerView2 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView2.setHasFixedSize(true);
        RecyclerView recyclerView3 = this.f32319b;
        if (recyclerView3 == null) {
            s.m("recyclerView");
            throw null;
        }
        RecyclerView.m itemAnimator = recyclerView3.getItemAnimator();
        h0 h0Var = itemAnimator instanceof h0 ? (h0) itemAnimator : null;
        if (h0Var != null) {
            h0Var.f10476g = false;
        }
        this.f32320c = new c(this);
        RecyclerView recyclerView4 = this.f32319b;
        if (recyclerView4 == null) {
            s.m("recyclerView");
            throw null;
        }
        n20.b bVar = new n20.b();
        bVar.f122357b = 1;
        Drawable drawable = a7.b.getDrawable(this, R.drawable.gcm3_default_list_item_divider);
        if (drawable != null) {
            bVar.f122358c = drawable;
        }
        recyclerView4.addItemDecoration(bVar);
        RecyclerView recyclerView5 = this.f32319b;
        if (recyclerView5 == null) {
            s.m("recyclerView");
            throw null;
        }
        c cVar = this.f32320c;
        if (cVar == null) {
            s.m("adapter");
            throw null;
        }
        recyclerView5.setAdapter(cVar);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            Object obj = extras.get("extra_key_profiles");
            obj.getClass();
            arrayList = (ArrayList) obj;
        }
        this.f32318a = new r(this, arrayList);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.menu_done, menu);
        this.f32321d = menu.findItem(R.id.menu_item_done);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_done) {
            return super.onOptionsItemSelected(menuItem);
        }
        r rVar = this.f32318a;
        if (rVar == null) {
            s.m("presenter");
            throw null;
        }
        p pVar = rVar.f68426b;
        if (pVar == null) {
            return true;
        }
        rVar.f68425a.p7(pVar);
        return true;
    }

    @Override // f20.q
    public final void p7(p pVar) {
        pVar.getClass();
        Intent intent = new Intent();
        intent.putExtra("extra_key_selected_item", pVar);
        setResult(-1, intent);
        finish();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/ContactProfilesActivity$a;", "", "<init>", "()V", "", "EXTRA_KEY_PROFILES", "Ljava/lang/String;", "EXTRA_KEY_SELECTED_ITEM", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
