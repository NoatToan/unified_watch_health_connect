package com.garmin.androiddynamicsettings.app.features.search;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.presentationlayer.SettingsActivity;
import com.garmin.androiddynamicsettings.app.presentationlayer.b;
import d53.w;
import g8.i;
import hi2.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kh2.k;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import x53.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/search/SettingsSearchActivity;", "Lcom/garmin/androiddynamicsettings/app/presentationlayer/b;", "Lcom/garmin/androiddynamicsettings/app/features/search/a$a;", "<init>", "()V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SettingsSearchActivity extends b implements com.garmin.androiddynamicsettings.app.features.search.a.InterfaceC1017a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<Map<String, Object>> f50629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SearchView f50630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public vh2.b f50631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RecyclerView f50632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.garmin.androiddynamicsettings.app.features.search.a f50633q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f50628l = new d("SettingsSearchActivity", null, 2, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f50634r = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/androiddynamicsettings/app/features/search/SettingsSearchActivity$a", "Landroidx/appcompat/widget/SearchView$m;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements SearchView.m {
        public a() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public final boolean E0(String str) {
            SearchView searchView = SettingsSearchActivity.this.f50630n;
            if (searchView == null) {
                return true;
            }
            searchView.clearFocus();
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public final boolean l5(String str) {
            SettingsSearchActivity settingsSearchActivity = SettingsSearchActivity.this;
            vh2.b bVar = settingsSearchActivity.f50631o;
            if (bVar == null) {
                s.m("searchPresenter");
                throw null;
            }
            com.garmin.androiddynamicsettings.app.features.search.a aVar = settingsSearchActivity.f50633q;
            if (aVar == null) {
                s.m("searchResultsAdapter");
                throw null;
            }
            com.garmin.androiddynamicsettings.app.features.search.a.c cVar = aVar.f50641f;
            cVar.getClass();
            bVar.f178412b.getClass();
            if (bVar.f178413c.isActive() || bVar.f178413c.e()) {
                bVar.f178413c.c(new CancellationException("New input text"));
                bVar.f178413c = i.c();
            }
            c cVar2 = s0.f129406a;
            ge1.b.T(c0.a(x53.b.f189152a.plus(bVar.f178413c)), null, null, new vh2.c(cVar, str, null), 3);
            return true;
        }
    }

    @Override // com.garmin.androiddynamicsettings.app.features.search.a.InterfaceC1017a
    public final void M6(int i14, List<vh2.a> list) {
        list.getClass();
        if (list.size() < i14) {
            this.f50628l.b("Item click at " + i14 + " but data object size is " + list.size());
            Toast.makeText(this, R.string.txt_something_went_wrong_try_again, 0).show();
            return;
        }
        if (S9()) {
            vh2.b bVar = this.f50631o;
            String string = null;
            if (bVar == null) {
                s.m("searchPresenter");
                throw null;
            }
            vh2.a aVar = list.get(i14);
            Context context = bVar.f178411a;
            aVar.getClass();
            String str = aVar.f178409b;
            bVar.f178412b.getClass();
            k.a aVar2 = k.f104801a;
            String str2 = aVar.f178410c;
            if (str2.length() != 0 && w.z(str2, ">", false)) {
                string = w.i0(str2.substring(w.E(str2, ">", 0, true) + 1, str2.length())).toString();
            }
            m mVar = (m) context;
            aVar2.getClass();
            k.f104802b.getClass();
            Intent intent = new Intent(mVar, (Class<?>) SettingsActivity.class);
            intent.putExtra("DynamicSettingInitializer_Section", str);
            intent.putExtra("DynamicSettingInitializer_SectionDeepLinkKey", string);
            mVar.startActivity(intent);
            mVar.finish();
        }
    }

    @Override // com.garmin.androiddynamicsettings.app.presentationlayer.b, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dsl_searchable_action);
        b.Q9(this, "", null, 4);
        Bundle bundleExtra = getIntent().getBundleExtra("SETTINGS_DATA_MODEL_BUNDLE");
        nh2.d dVar = bundleExtra != null ? (nh2.d) bundleExtra.getParcelable("SETTINGS_SEARCH_DATA_BUNDLE") : null;
        ArrayList arrayList = dVar != null ? dVar.f126169i : null;
        this.f50629m = arrayList;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f50628l.b("Could not get search values. Ideally, you should not be here. This feature is enabled only when data exists");
            Toast.makeText(this, R.string.txt_something_went_wrong_try_again, 0).show();
            finish();
            return;
        }
        this.f50631o = new vh2.b(this);
        List<Map<String, Object>> list = this.f50629m;
        list.getClass();
        this.f50633q = new com.garmin.androiddynamicsettings.app.features.search.a(this, list, this);
        View viewFindViewById = findViewById(R.id.search_results_list);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f50632p = recyclerView;
        com.garmin.androiddynamicsettings.app.features.search.a aVar = this.f50633q;
        if (aVar == null) {
            s.m("searchResultsAdapter");
            throw null;
        }
        recyclerView.setAdapter(aVar);
        RecyclerView recyclerView2 = this.f50632p;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        } else {
            s.m("searchResultList");
            throw null;
        }
    }

    @Override // com.garmin.androiddynamicsettings.app.presentationlayer.b, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        this.f50628l.getClass();
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.dsl_search_action_menu, menu);
        Object systemService = getSystemService("search");
        systemService.getClass();
        SearchManager searchManager = (SearchManager) systemService;
        MenuItem menuItemFindItem = menu.findItem(R.id.search_action);
        SearchView searchView = (SearchView) (menuItemFindItem != null ? menuItemFindItem.getActionView() : null);
        this.f50630n = searchView;
        if (searchView == null) {
            return true;
        }
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(false);
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.requestFocus();
        searchView.setOnQueryTextListener(this.f50634r);
        return true;
    }
}
