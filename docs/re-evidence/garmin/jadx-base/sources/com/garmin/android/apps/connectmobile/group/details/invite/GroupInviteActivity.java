package com.garmin.android.apps.connectmobile.group.details.invite;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import o53.c2;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import vm0.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/invite/GroupInviteActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupInviteActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f36358e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f36359a = new w1(s0.f105811a.b(k.class), new c(this), new b(this), new d(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SearchView f36360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2 f36362d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36363a;

        public b(g gVar) {
            this.f36363a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36363a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36364a;

        public c(g gVar) {
            this.f36364a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36364a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f36366b;

        public d(e23.a aVar, g gVar) {
            this.f36365a = aVar;
            this.f36366b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36365a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36366b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static final void ca(GroupInviteActivity groupInviteActivity, String str) {
        c2 c2Var = groupInviteActivity.f36362d;
        if (c2Var != null && c2Var.isActive()) {
            c2Var.c(null);
        }
        groupInviteActivity.f36362d = ge1.b.T(f0.w(groupInviteActivity), null, null, new vm0.d(groupInviteActivity, str, null), 3);
    }

    public final void da(CharSequence charSequence) {
        com.garmin.android.apps.connectmobile.group.details.invite.b.f36368o.getClass();
        com.garmin.android.apps.connectmobile.group.details.invite.b bVar = new com.garmin.android.apps.connectmobile.group.details.invite.b();
        Bundle bundle = new Bundle();
        bundle.putString("SEARCH_KEYWORD", String.valueOf(charSequence));
        bVar.setArguments(bundle);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.group_invite_list_fragment, bVar, "GroupInviteActivity");
        aVar.e();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        SearchView searchView = this.f36360b;
        if (searchView == null || searchView.C) {
            super.onBackPressed();
        } else {
            searchView.j("");
            searchView.setIconified(true);
        }
        setResult(-1, getIntent());
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_group_invite);
        super.initActionBar(true, R.string.social_group_invite_members);
        setTitleMaxLines(z1.DEFAULT_TITLE_MAX_LINE);
        ((k) this.f36359a.getValue()).f178777d = getIntent().getLongExtra("GCM_extra_connection_group_id", -1L);
        da("");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        getMenuInflater().inflate(R.menu.group_invite, menu);
        View actionView = (menu == null || (menuItemFindItem = menu.findItem(R.id.menu_item_search)) == null) ? null : menuItemFindItem.getActionView();
        SearchView searchView = actionView instanceof SearchView ? (SearchView) actionView : null;
        if (searchView == null) {
            return true;
        }
        this.f36360b = searchView;
        searchView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        searchView.setMaxWidth(Integer.MAX_VALUE);
        View viewFindViewById = searchView.findViewById(R.id.search_edit_frame);
        viewFindViewById.getClass();
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) viewFindViewById).getLayoutParams();
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        View viewFindViewById2 = searchView.findViewById(R.id.search_src_text);
        viewFindViewById2.getClass();
        EditText editText = (EditText) viewFindViewById2;
        editText.setPadding(0, editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
        searchView.setQueryHint(getString(R.string.lbl_search));
        searchView.setIconifiedByDefault(true);
        searchView.setFocusable(false);
        searchView.setOnQueryTextListener(new vm0.c(this, ((jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null)).B()));
        searchView.setOnCloseListener(new tr2.b(this, 29));
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem = menu != null ? menu.findItem(R.id.menu_item_search) : null;
        if (menuItemFindItem != null) {
            oc.b.G(menuItemFindItem, this, R.color.gcm_icon_primary);
        }
        View actionView = menuItemFindItem != null ? menuItemFindItem.getActionView() : null;
        SearchView searchView = actionView instanceof SearchView ? (SearchView) actionView : null;
        if (searchView == null) {
            super.onPrepareOptionsMenu(menu);
        } else {
            this.f36360b = searchView;
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(a7.b.getColor(this, R.color.gcm_icon_primary));
            colorStateListValueOf.getClass();
            ImageView imageView = (ImageView) searchView.findViewById(R.id.search_button);
            if (imageView != null) {
                imageView.setImageResource(R.drawable.search);
            }
            if (imageView != null) {
                imageView.setImageTintList(colorStateListValueOf);
            }
            ImageView imageView2 = (ImageView) searchView.findViewById(R.id.search_mag_icon);
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.search);
            }
            if (imageView2 != null) {
                imageView2.setImageTintList(colorStateListValueOf);
            }
            String str = this.f36361c;
            if (str != null) {
                searchView.j(str);
                searchView.setIconified(false);
                searchView.clearFocus();
            }
            super.onPrepareOptionsMenu(menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/invite/GroupInviteActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
