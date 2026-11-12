package com.garmin.android.apps.connectmobile.courses.presentation.search;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.d;
import com.garmin.android.apps.connectmobile.l2;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import s20.l;
import ty1.f1;
import u50.h;
import w50.e;
import x50.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/search/CourseSearchActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lw50/e;", "<init>", "()V", "a", "Lx50/f;", RemoteConfigConstants.ResponseFieldKey.STATE, "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CourseSearchActivity extends com.garmin.android.apps.connectmobile.c implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f33091e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f33092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33093b = m.a(n.NONE, new c(this, null, null, new f1(this, 6)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SearchView f33094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f33095d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/courses/presentation/search/CourseSearchActivity$b", "Landroidx/appcompat/widget/SearchView$m;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements SearchView.m {
        public b() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public final boolean E0(String str) {
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public final boolean l5(String str) {
            a aVar = CourseSearchActivity.f33091e;
            CourseSearchActivity.this.ca().z4(new x50.b.f(str));
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f33097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f33098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f33099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f33100d;

        public c(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f33097a = gVar;
            this.f33098b = qualifier;
            this.f33099c = aVar;
            this.f33100d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, u50.h] */
        @Override // e23.a
        public final h invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f33097a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f33099c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(h.class), viewModelStore, null, defaultViewModelCreationExtras, this.f33098b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f33100d, 4, null);
        }
    }

    @Override // w50.e
    public final void Z1(com.garmin.android.library.mapsdkadapter.e eVar) {
        eVar.getClass();
        ca().z4(new x50.b.a(eVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final h ca() {
        return (h) this.f33093b.getValue();
    }

    public final void da() {
        View rootView = findViewById(R.id.composable_container).getRootView();
        rootView.getClass();
        l lVar = l.f156021a;
        Rect rect = new Rect();
        rootView.getWindowVisibleDisplayFrame(rect);
        if (rootView.getBottom() - rect.bottom <= 128 * rootView.getResources().getDisplayMetrics().density || getCurrentFocus() == null) {
            return;
        }
        Object systemService = getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = getCurrentFocus();
        inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
    }

    public final void ea() {
        if (((f) ca().f168673i.f150540a.getValue()).f189014i) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.EDIT");
            setResult(-1, intent);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        String action;
        Parcelable parcelable;
        if (intent != null && i14 == 15) {
            l2.f37135b.getClass();
            Bundle bundleA = l2.a.a(intent);
            d dVar = null;
            if (bundleA != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) bundleA.getParcelable("GCM_extra_course", d.class);
                } else {
                    Parcelable parcelable2 = bundleA.getParcelable("GCM_extra_course");
                    parcelable = (d) (parcelable2 instanceof d ? parcelable2 : null);
                }
                dVar = (d) parcelable;
            }
            if (dVar != null && (action = intent.getAction()) != null) {
                int iHashCode = action.hashCode();
                if (iHashCode != -1173683121) {
                    if (iHashCode == 1639291568 && action.equals("android.intent.action.DELETE")) {
                        ca().z4(new x50.b.d(dVar));
                    }
                } else if (action.equals("android.intent.action.EDIT")) {
                    ca().z4(new x50.b.c(dVar));
                }
            }
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    @o13.e
    public final void onBackPressed() {
        ea();
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        if (bundle == null) {
            Intent intent = getIntent();
            bundle = intent != null ? intent.getExtras() : null;
        }
        this.f33092a = bundle;
        initActionBar(true);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(-1693596722, true, new u50.b(this, 0)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.my_course_search, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_search);
        View actionView = menuItemFindItem != null ? menuItemFindItem.getActionView() : null;
        SearchView searchView = actionView instanceof SearchView ? (SearchView) actionView : null;
        this.f33094c = searchView;
        if (searchView == null) {
            return true;
        }
        searchView.setIconifiedByDefault(false);
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) searchView.findViewById(R.id.search_edit_frame)).getLayoutParams();
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        EditText editText = (EditText) searchView.findViewById(R.id.search_src_text);
        editText.setPadding(0, editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
        editText.setHint(R.string.lbl_search);
        this.f33095d = editText;
        View viewFindViewById = searchView.findViewById(R.id.search_mag_icon);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
        layoutParams2.getClass();
        ((LinearLayout.LayoutParams) layoutParams2).leftMargin = 0;
        viewFindViewById.setPadding(0, viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), viewFindViewById.getPaddingBottom());
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        da();
        ea();
        finish();
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        oc.b.G(menu.findItem(R.id.menu_item_search), this, R.color.gcm_icon_primary);
        SearchView searchView = this.f33094c;
        if (searchView != null) {
            searchView.setOnQueryTextListener(new b());
        }
        EditText editText = this.f33095d;
        if (editText != null) {
            editText.setHint(((f) ca().f168673i.f150540a.getValue()).f189011f);
            editText.setOnFocusChangeListener(new c32.f(this, 14));
            editText.setOnEditorActionListener(new bl0.a(this, 11));
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putAll(this.f33092a);
    }

    @Override // w50.e
    public final void r0(d dVar) {
        dVar.getClass();
        String str = dVar.courseId;
        if (str != null) {
            ca().z4(new x50.b.e(str));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/search/CourseSearchActivity$a;", "", "<init>", "()V", "", "SORT_FILTER_EXTRA", "Ljava/lang/String;", "FAVORITES_LIST_EXTRA", "PACE_PRO_FILTER", "POWER_GUIDE_FLOW", "", "VIEW_COURSE_REQUEST_CODE", "I", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
