package com.garmin.android.apps.connectmobile.connections.groups;

import a61.i;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.m;
import androidx.lifecycle.x1;
import b31.f;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.group.details.GroupDetailActivity;
import com.garmin.android.apps.connectmobile.z1;
import com.nimbusds.jose.jwk.JWKParameterNames;
import g.h;
import h10.e;
import h10.j;
import h10.o;
import h10.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s0;
import r22.q0;

/* JADX INFO: loaded from: classes7.dex */
public class GroupsActivity extends com.garmin.android.apps.connectmobile.c implements h10.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f31357h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SearchView f31358a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MenuItem f31360c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f31363f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31359b = s3.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f31361d = ((jm0.b) KoinJavaComponent.inject(jm0.b.class).getValue()).h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31362e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.c<Intent> f31364g = registerForActivityResult(new h(), new i(this, 23));

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            GroupsActivity groupsActivity = GroupsActivity.this;
            groupsActivity.f31360c.setVisible(false);
            groupsActivity.ea(null);
        }
    }

    public class b implements SearchView.m {
        public b() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public final boolean E0(String str) {
            GroupsActivity.this.f31358a.clearFocus();
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public final boolean l5(String str) {
            return false;
        }
    }

    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view2, boolean z14) {
            if (z14) {
                return;
            }
            GroupsActivity groupsActivity = GroupsActivity.this;
            if (TextUtils.isEmpty(groupsActivity.f31358a.getQuery())) {
                if (groupsActivity.f31362e) {
                    groupsActivity.ca();
                    groupsActivity.da();
                }
                groupsActivity.f31362e = false;
                return;
            }
            CharSequence query = groupsActivity.f31358a.getQuery();
            if (TextUtils.isEmpty(query)) {
                return;
            }
            r rVar = (r) groupsActivity.getSupportFragmentManager().G(JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
            if (rVar != null) {
                rVar.v6(query.toString());
            } else {
                groupsActivity.ea(query);
            }
        }
    }

    public class d implements SearchView.l {
        public d() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public final void onClose() {
            GroupsActivity groupsActivity = GroupsActivity.this;
            groupsActivity.f31360c.setVisible(groupsActivity.f31361d);
            v supportFragmentManager = groupsActivity.getSupportFragmentManager();
            Fragment fragmentG = supportFragmentManager.G(JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
            if (fragmentG != null) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.k(fragmentG);
                aVar.e();
                supportFragmentManager.Z();
            }
        }
    }

    @Override // h10.b
    public final void J8() {
        this.f31362e = true;
    }

    public final void ca() {
        Fragment fragmentG = getSupportFragmentManager().G("GroupsFragment");
        h10.h hVar = (fragmentG == null || !(fragmentG instanceof h10.h)) ? null : (h10.h) fragmentG;
        if (hVar != null) {
            hVar.M7();
        }
    }

    public final void da() {
        o oVar = this.f31363f;
        oVar.getClass();
        dh.b.L(m.a(null, new j(oVar, null), 3), this, new h10.d(this));
    }

    public final void ea(CharSequence charSequence) {
        Bundle bundle;
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        if (charSequence != null) {
            bundle = new Bundle();
            bundle.putString("GCM_extra_connection_group_query_param", charSequence.toString());
        } else {
            bundle = null;
        }
        aVarB.j(R.id.fragment_group_placeholder, Fragment.instantiate(this, r.class.getName(), bundle), JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, 1);
        aVarB.d(null);
        aVarB.e();
    }

    @Override // h10.b
    public final void h9(GroupDTO groupDTO) {
        String str = groupDTO.f31558a;
        String str2 = groupDTO.f31559b;
        GroupDetailActivity.a aVar = GroupDetailActivity.f36137j;
        aVar.getClass();
        str.getClass();
        startActivityForResult(GroupDetailActivity.a.a(aVar, this, str, str2, null, null, null, 56), 7);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 7 && i15 == -1) {
            if (intent != null && intent.getBooleanExtra("Leave Group", false)) {
                View viewFindViewById = findViewById(R.id.fragment_group_placeholder);
                q0.f149800b.getClass();
                viewFindViewById.getClass();
                q0.b.a(viewFindViewById, R.string.msg_leave_group_prompt, 0).show();
            }
            ca();
            Fragment fragmentG = getSupportFragmentManager().G(JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
            r rVar = (fragmentG == null || !(fragmentG instanceof r)) ? null : (r) fragmentG;
            if (rVar != null) {
                rVar.v6(rVar.f80807a);
            }
            da();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        SearchView searchView;
        super.onBackPressed();
        if (this.f31359b || (searchView = this.f31358a) == null || searchView.C) {
            return;
        }
        searchView.j("");
        this.f31358a.setIconified(true);
        if (this.f31362e) {
            ca();
            da();
        }
        this.f31362e = false;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Fragment fragmentInstantiate;
        super.onCreate(bundle);
        setContentView(R.layout.gcm_connection_groups);
        super.initActionBar(true, R.string.lbl_groups);
        setTitleMaxLines(z1.DEFAULT_TITLE_MAX_LINE);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        boolean z14 = this.f31359b;
        if (z14) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "PageViewChildGroups");
            com.garmin.android.apps.connectmobile.connections.groups.a.f31369a.getClass();
            fragmentInstantiate = new com.garmin.android.apps.connectmobile.connections.groups.a();
        } else {
            fragmentInstantiate = Fragment.instantiate(this, h10.h.class.getName(), null);
        }
        if (fragmentInstantiate instanceof h10.h) {
            ((h10.h) fragmentInstantiate).B = this;
        }
        aVar.l(R.id.fragment_group_placeholder, fragmentInstantiate, "GroupsFragment");
        aVar.e();
        if (z14) {
            return;
        }
        ((f) KoinJavaComponent.get$default(f.class, null, null, 6, null)).b(e31.a.ENTERED_GROUPS);
        this.f31363f = (o) new x1(this).b(s0.f105811a.b(o.class));
        da();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (this.f31359b) {
            return true;
        }
        getMenuInflater().inflate(R.menu.groups, menu);
        this.f31358a = (SearchView) menu.findItem(R.id.menu_item_search).getActionView();
        this.f31360c = menu.findItem(R.id.menu_item_create_group);
        this.f31358a.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f31358a.setMaxWidth(Integer.MAX_VALUE);
        ((LinearLayout.LayoutParams) ((LinearLayout) this.f31358a.findViewById(R.id.search_edit_frame)).getLayoutParams()).leftMargin = 0;
        EditText editText = (EditText) this.f31358a.findViewById(R.id.search_src_text);
        editText.setPadding(0, editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
        this.f31358a.setQueryHint(getString(R.string.lbl_search));
        this.f31358a.setIconifiedByDefault(true);
        this.f31358a.setFocusable(false);
        this.f31358a.setOnSearchClickListener(new a());
        this.f31358a.setOnQueryTextListener(new b());
        this.f31358a.setOnQueryTextFocusChangeListener(new c());
        this.f31358a.setOnCloseListener(new d());
        this.f31360c.setOnMenuItemClickListener(new e(this, 0));
        this.f31360c.setVisible(this.f31361d);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (this.f31359b) {
            return true;
        }
        this.f31358a = (SearchView) menu.findItem(R.id.menu_item_search).getActionView();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(a7.b.getColor(this, R.color.gcm_icon_primary));
        ImageView imageView = (ImageView) this.f31358a.findViewById(R.id.search_button);
        if (imageView != null) {
            imageView.setImageResource(R.drawable.search);
            imageView.setImageTintList(colorStateListValueOf);
        }
        ImageView imageView2 = (ImageView) this.f31358a.findViewById(R.id.search_mag_icon);
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.search);
            imageView2.setImageTintList(colorStateListValueOf);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        ht.a.f85464a.getClass();
        ht.a.a(null, "PageViewGroupsList");
    }
}
