package com.garmin.android.apps.connectmobile.liveeventsharing.recipients;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.m;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.material.snackbar.Snackbar;
import cw.j;
import ew1.h1;
import f20.e0;
import fw.p;
import g.h;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import k32.l;
import l20.r;
import og2.k;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/recipients/LiveEventRecipientsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"LongLogTag"})
public final class LiveEventRecipientsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f38506l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MenuItem f38507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f38508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f38509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f38510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f38511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f38512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ku0.d f38513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f38514h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f38515i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w1 f38516j = new w1(s0.f105811a.b(ku0.f.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f.c<Intent> f38517k = registerForActivityResult(new h(), new jp.a(this, 2));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38518a;

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
            f38518a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f38519a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f38519a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f38519a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38519a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f38520a;

        public d(g gVar) {
            this.f38520a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f38520a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f38521a;

        public e(g gVar) {
            this.f38521a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f38521a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f38522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f38523b;

        public f(e23.a aVar, g gVar) {
            this.f38522a = aVar;
            this.f38523b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f38522a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f38523b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static void ca(LiveEventRecipientsActivity liveEventRecipientsActivity) {
        super.onBackPressed();
    }

    public final void da(boolean z14) {
        MenuItem menuItem = this.f38507a;
        if (menuItem != null) {
            menuItem.setEnabled(z14);
        }
    }

    public final void ea() {
        ku0.d dVar = this.f38513g;
        if (dVar == null) {
            s.m("adapter");
            throw null;
        }
        int size = dVar.f106544c.size();
        l lVar = this.f38509c;
        if (size <= 0) {
            if (lVar == null) {
                s.m("addOrEditRecipientsRow");
                throw null;
            }
            String string = getString(R.string.live_track_add_recipients);
            string.getClass();
            lVar.b(string, null);
            l lVar2 = this.f38508b;
            if (lVar2 != null) {
                lVar2.f102707b.setVisibility(0);
                return;
            } else {
                s.m("noRecipientsRow");
                throw null;
            }
        }
        if (lVar == null) {
            s.m("addOrEditRecipientsRow");
            throw null;
        }
        String string2 = getString(R.string.live_track_edit_recipients);
        string2.getClass();
        lVar.b(string2, null);
        l lVar3 = this.f38508b;
        if (lVar3 != null) {
            lVar3.f102707b.setVisibility(8);
        } else {
            s.m("noRecipientsRow");
            throw null;
        }
    }

    public final void fa() {
        r rVar = this.f38510d;
        if (rVar == null) {
            s.m("userContactsDTO");
            throw null;
        }
        List<l20.a> listF = rVar.f();
        setSubtitle(getString(R.string.contact_management_subtitle_add_contacts, String.valueOf(listF != null ? j.d(listF) : 0), String.valueOf(this.f38514h)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        Parcelable parcelable;
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 2) {
            r rVar = null;
            rVar = null;
            if (intent != null && (extras = intent.getExtras()) != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) extras.getParcelable("RESULT_EXTRA_USER_CONTACTS_DTO", r.class);
                } else {
                    Parcelable parcelable2 = extras.getParcelable("RESULT_EXTRA_USER_CONTACTS_DTO");
                    parcelable = (r) (parcelable2 instanceof r ? parcelable2 : null);
                }
                rVar = (r) parcelable;
            }
            rVar.getClass();
            this.f38510d = rVar;
            List<l20.a> listF = rVar.f();
            if (listF == null || !listF.isEmpty()) {
                u20.e eVarU6 = u20.e.u6(R.string.common_you_are_all_set, R.string.live_event_sharing_setup_contacts_success);
                eVarU6.setCancelable(false);
                eVarU6.g(getSupportFragmentManager());
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        MenuItem menuItem = this.f38507a;
        if (menuItem != null && menuItem.isEnabled()) {
            new androidx.appcompat.app.e.a(this).setMessage(getString(R.string.msg_sure_you_want_to_cancel)).setNegativeButton(R.string.lbl_no, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.lbl_yes, new h1(this, 29)).show();
        } else {
            setResult(-1);
            super.onBackPressed();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01da  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object obj;
        boolean z14;
        List<l20.c> listZ;
        String str;
        String strV;
        boolean zG;
        ku0.a aVar;
        String firstName;
        ku0.d dVar;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_recycler_view_with_banner);
        initActionBar(R.string.lbl_recipients, 2);
        View viewFindViewById = findViewById(R.id.banner_layout);
        viewFindViewById.getClass();
        this.f38511e = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.banner_text_view);
        viewFindViewById2.getClass();
        ((TextView) viewFindViewById2).setText(getString(R.string.live_event_sharing_recipients_messages_warning));
        View viewFindViewById3 = findViewById(R.id.recycler_view);
        viewFindViewById3.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f38512f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = this.f38512f;
        if (recyclerView2 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView2.setHasFixedSize(true);
        ku0.d dVar2 = new ku0.d();
        this.f38513g = dVar2;
        LayoutInflater layoutInflater = getLayoutInflater();
        RecyclerView recyclerView3 = this.f38512f;
        if (recyclerView3 == null) {
            s.m("recyclerView");
            throw null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.gcm4_live_event_recipients_header, (ViewGroup) recyclerView3, false);
        ((TextView) viewInflate.findViewById(R.id.recipients_max_number_label)).setText(getString(R.string.live_event_sharing_choose_recipients, String.valueOf(this.f38514h)));
        View viewFindViewById4 = viewInflate.findViewById(R.id.live_event_recipients_add_contacts_btn);
        viewFindViewById4.getClass();
        l lVar = new l(viewFindViewById4);
        this.f38509c = lVar;
        lVar.f102707b.setOnClickListener(new ku0.b(this, 1));
        View viewFindViewById5 = viewInflate.findViewById(R.id.no_recipients);
        viewFindViewById5.getClass();
        l lVar2 = new l(viewFindViewById5);
        this.f38508b = lVar2;
        String string = getString(R.string.live_event_sharing_no_recipients);
        string.getClass();
        lVar2.b(string, null);
        dVar2.t(viewInflate);
        RecyclerView recyclerView4 = this.f38512f;
        if (recyclerView4 == null) {
            s.m("recyclerView");
            throw null;
        }
        ku0.d dVar3 = this.f38513g;
        if (dVar3 == null) {
            s.m("adapter");
            throw null;
        }
        recyclerView4.setAdapter(dVar3);
        int color = a7.b.getColor(this, R.color.gcm_surface_danger_action);
        Drawable drawable = a7.b.getDrawable(this, R.drawable.discard);
        if (drawable != null) {
            k.F(R.color.gcm_icon_on_color, this, drawable);
        }
        androidx.recyclerview.widget.s sVar = new androidx.recyclerview.widget.s(new ku0.c(color, drawable, this));
        RecyclerView recyclerView5 = this.f38512f;
        if (recyclerView5 == null) {
            s.m("recyclerView");
            throw null;
        }
        sVar.e(recyclerView5);
        if (getIntent() == null || !getIntent().hasExtra("extra_user_contact_dto")) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "LiveEventRecipientsActivity", "EXTRA_USER_CONTACTS_DTO missing from intent!!");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            obj = intent != null ? (Parcelable) intent.getParcelableExtra("extra_user_contact_dto", r.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra_user_contact_dto") : null;
            if (!(parcelableExtra instanceof r)) {
                parcelableExtra = null;
            }
            obj = (r) parcelableExtra;
        }
        obj.getClass();
        this.f38510d = (r) obj;
        e0 e0Var = new e0(this);
        r rVar = this.f38510d;
        if (rVar == null) {
            s.m("userContactsDTO");
            throw null;
        }
        List<l20.a> listF = rVar.f();
        if (listF != null) {
            z14 = false;
            for (l20.a aVar3 : listF) {
                if (s.g(aVar3.getIsLiveEventSharingDefault(), Boolean.TRUE) && (listZ = aVar3.z()) != null) {
                    for (l20.c cVar : listZ) {
                        Long contactInfoPk = cVar.getContactInfoPk();
                        if (s.g(cVar.getIsLiveEventSharingDefault(), Boolean.TRUE) && contactInfoPk != null) {
                            Integer numD = com.garmin.android.apps.connectmobile.contacts.b.d(cVar, e0Var, false);
                            if (numD != null) {
                                strV = getString(numD.intValue());
                            } else {
                                String str2 = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                if (str2 != null) {
                                    strV = jg.b.v(this, str2);
                                } else {
                                    str = null;
                                }
                                zG = com.garmin.android.apps.connectmobile.contacts.b.g(cVar, e0Var);
                                if (zG) {
                                    z14 = true;
                                }
                                String contactId = aVar3.getContactId();
                                firstName = aVar3.getFirstName();
                                if (firstName == null) {
                                    firstName = "";
                                }
                                String lastName = aVar3.getLastName();
                                aVar = new ku0.a(contactId, e5.g(firstName, StringUtils.SPACE, lastName != null ? lastName : ""), str, contactInfoPk.longValue(), zG);
                                dVar = this.f38513g;
                                if (dVar != null) {
                                    s.m("adapter");
                                    throw null;
                                }
                                ArrayList arrayList = dVar.f106544c;
                                arrayList.add(aVar);
                                dVar.notifyItemInserted(arrayList.size() - 1);
                            }
                            str = strV;
                            zG = com.garmin.android.apps.connectmobile.contacts.b.g(cVar, e0Var);
                            if (zG) {
                                z14 = true;
                            }
                            String contactId2 = aVar3.getContactId();
                            firstName = aVar3.getFirstName();
                            if (firstName == null) {
                                firstName = "";
                            }
                            String lastName2 = aVar3.getLastName();
                            aVar = new ku0.a(contactId2, e5.g(firstName, StringUtils.SPACE, lastName2 != null ? lastName2 : ""), str, contactInfoPk.longValue(), zG);
                            dVar = this.f38513g;
                            if (dVar != null) {
                                s.m("adapter");
                                throw null;
                            }
                            ArrayList arrayList2 = dVar.f106544c;
                            arrayList2.add(aVar);
                            dVar.notifyItemInserted(arrayList2.size() - 1);
                        }
                    }
                }
            }
        } else {
            z14 = false;
        }
        LinearLayout linearLayout = this.f38511e;
        if (linearLayout == null) {
            s.m("bannerLayout");
            throw null;
        }
        linearLayout.setVisibility((z14 && bo1.a.a().c().b0()) ? 0 : 8);
        ea();
        fa();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.save_menu, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.save_menu_item);
        menuItemFindItem.getClass();
        this.f38507a = menuItemFindItem;
        da(false);
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
        if (menuItem.getItemId() != R.id.save_menu_item) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f38515i.isEmpty()) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "LiveEventRecipientsActivity", "saveRecipients() called with empty Contacts list.");
            return true;
        }
        ArrayList arrayList = this.f38515i;
        arrayList.getClass();
        m.a(null, new ku0.e(arrayList, null), 3).f(this, new c(new kp2.a(this, 1)));
        return true;
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
            return;
        }
        RecyclerView recyclerView = this.f38512f;
        if (recyclerView == null) {
            s.m("recyclerView");
            throw null;
        }
        Snackbar snackbarMake = Snackbar.make(recyclerView, j22.b.g(j22.a.f96717f), 0);
        snackbarMake.getClass();
        snackbarMake.setAction(R.string.lbl_settings, new ku0.b(this, 0));
        v22.c.a(snackbarMake);
        snackbarMake.show();
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        j22.b bVar = j22.b.f96736a;
        j22.a aVar = j22.a.f96717f;
        bVar.getClass();
        if (j22.b.k(aVar)) {
            return;
        }
        j22.b.B(this, aVar);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/recipients/LiveEventRecipientsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_USER_CONTACTS_DTO", "", "REQUEST_CODE_PERM_READ_CONTACTS", "I", "REQUEST_CODE_SETUP_CONTACTS", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
