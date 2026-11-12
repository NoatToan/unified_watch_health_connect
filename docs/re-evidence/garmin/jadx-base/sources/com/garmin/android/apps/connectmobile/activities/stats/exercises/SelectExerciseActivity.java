package com.garmin.android.apps.connectmobile.activities.stats.exercises;

import android.app.SearchManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.viewpager2.widget.ViewPager2;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import gw.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/SelectExerciseActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "b", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SelectExerciseActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f29833f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f29834a = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.activities.stats.exercises.c.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager2 f29835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f29836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f29837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29838e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/SelectExerciseActivity$b;", "Lhe/a;", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/SelectExerciseActivity;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends he.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public com.garmin.android.apps.connectmobile.activities.stats.exercises.b f29839j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public com.garmin.android.apps.connectmobile.activities.stats.exercises.b f29840k;

        public b(SelectExerciseActivity selectExerciseActivity) {
            super(selectExerciseActivity);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return 2;
        }

        @Override // he.a
        public final Fragment u(int i14) {
            if (i14 == 0) {
                com.garmin.android.apps.connectmobile.activities.stats.exercises.b.f29861g.getClass();
                com.garmin.android.apps.connectmobile.activities.stats.exercises.b bVar = new com.garmin.android.apps.connectmobile.activities.stats.exercises.b();
                Bundle bundle = new Bundle();
                bundle.putBoolean("RECENT_EXERCISES", false);
                bVar.setArguments(bundle);
                this.f29839j = bVar;
                return bVar;
            }
            com.garmin.android.apps.connectmobile.activities.stats.exercises.b.f29861g.getClass();
            com.garmin.android.apps.connectmobile.activities.stats.exercises.b bVar2 = new com.garmin.android.apps.connectmobile.activities.stats.exercises.b();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("RECENT_EXERCISES", true);
            bVar2.setArguments(bundle2);
            this.f29840k = bVar2;
            return bVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/stats/exercises/SelectExerciseActivity$c", "Landroidx/appcompat/widget/SearchView$m;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements SearchView.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SearchView f29841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SelectExerciseActivity f29842b;

        public c(SearchView searchView, SelectExerciseActivity selectExerciseActivity) {
            this.f29841a = searchView;
            this.f29842b = selectExerciseActivity;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public final boolean E0(String str) {
            this.f29841a.clearFocus();
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public final boolean l5(String str) {
            b bVar = this.f29842b.f29836c;
            if (bVar == null) {
                s.m("viewPagerAdapter");
                throw null;
            }
            com.garmin.android.apps.connectmobile.activities.stats.exercises.b bVar2 = bVar.f29839j;
            if (bVar2 != null) {
                bVar2.u6(str);
            }
            com.garmin.android.apps.connectmobile.activities.stats.exercises.b bVar3 = bVar.f29840k;
            if (bVar3 == null) {
                return true;
            }
            bVar3.u6(str);
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29843a;

        public d(g gVar) {
            this.f29843a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f29843a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29844a;

        public e(g gVar) {
            this.f29844a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f29844a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f29845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f29846b;

        public f(e23.a aVar, g gVar) {
            this.f29845a = aVar;
            this.f29846b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f29845a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f29846b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        setContentView(R.layout.select_exercise);
        Bundle extras = getIntent().getExtras();
        w1 w1Var = this.f29834a;
        if (extras != null) {
            com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVar = (com.garmin.android.apps.connectmobile.activities.stats.exercises.c) w1Var.getValue();
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                parcelable = (Parcelable) extras.getParcelable("EXTRA_EXERCISE_LIST", com.garmin.android.apps.connectmobile.repcounting.model.c.class);
            } else {
                Parcelable parcelable3 = extras.getParcelable("EXTRA_EXERCISE_LIST");
                if (!(parcelable3 instanceof com.garmin.android.apps.connectmobile.repcounting.model.c)) {
                    parcelable3 = null;
                }
                parcelable = (com.garmin.android.apps.connectmobile.repcounting.model.c) parcelable3;
            }
            cVar.f29896m = (com.garmin.android.apps.connectmobile.repcounting.model.c) parcelable;
            cVar.f29898o = cVar.B4();
            com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVar2 = (com.garmin.android.apps.connectmobile.activities.stats.exercises.c) w1Var.getValue();
            if (i14 >= 33) {
                parcelable2 = (Parcelable) extras.getParcelable("EXTRA_SUGGESTED_EXERCISE_LIST", com.garmin.android.apps.connectmobile.repcounting.model.c.class);
            } else {
                Parcelable parcelable4 = extras.getParcelable("EXTRA_SUGGESTED_EXERCISE_LIST");
                if (!(parcelable4 instanceof com.garmin.android.apps.connectmobile.repcounting.model.c)) {
                    parcelable4 = null;
                }
                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.c) parcelable4;
            }
            cVar2.f29897n = (com.garmin.android.apps.connectmobile.repcounting.model.c) parcelable2;
            ((com.garmin.android.apps.connectmobile.activities.stats.exercises.c) w1Var.getValue()).f29899p = i14 >= 33 ? extras.getParcelableArrayList("EXTRA_DISABLED_EXERCISE_LIST", com.garmin.android.apps.connectmobile.repcounting.model.a.class) : extras.getParcelableArrayList("EXTRA_DISABLED_EXERCISE_LIST");
            this.f29837d = extras.getString("EXTRA_TITLE");
            this.f29838e = extras.getString("EXTRA_SEARCH_HINT");
        }
        if (((com.garmin.android.apps.connectmobile.activities.stats.exercises.c) w1Var.getValue()).f29896m == null) {
            finish();
            return;
        }
        initActionBar(true, this.f29837d);
        View viewFindViewById = findViewById(R.id.search_view);
        SearchView searchView = (SearchView) viewFindViewById;
        searchView.setQueryHint(this.f29838e);
        searchView.setIconifiedByDefault(false);
        searchView.setFocusable(false);
        Object systemService = getSystemService("search");
        systemService.getClass();
        searchView.setSearchableInfo(((SearchManager) systemService).getSearchableInfo(getComponentName()));
        searchView.setOnQueryTextListener(new c(searchView, this));
        viewFindViewById.getClass();
        View viewFindViewById2 = findViewById(R.id.view_pager);
        ViewPager2 viewPager2 = (ViewPager2) viewFindViewById2;
        viewPager2.setOffscreenPageLimit(1);
        b bVar = new b(this);
        this.f29836c = bVar;
        viewPager2.setAdapter(bVar);
        viewFindViewById2.getClass();
        this.f29835b = (ViewPager2) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.sliding_tabs);
        com.garmin.android.apps.connectmobile.view.view_3_0.a aVar = (com.garmin.android.apps.connectmobile.view.view_3_0.a) viewFindViewById3;
        ViewPager2 viewPager3 = this.f29835b;
        if (viewPager3 == null) {
            s.m("viewPager");
            throw null;
        }
        j jVar = new j(this, 9);
        com.garmin.android.apps.connectmobile.view.view_3_0.a.e eVar = aVar.f47856e;
        eVar.f47863b = viewPager3;
        eVar.f47862a = null;
        eVar.f47864c = jVar;
        aVar.c();
        viewFindViewById3.getClass();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/SelectExerciseActivity$a;", "", "<init>", "()V", "", "EXTRA_EXERCISE_LIST", "Ljava/lang/String;", "EXTRA_SUGGESTED_EXERCISE_LIST", "EXTRA_DISABLED_EXERCISE_LIST", "EXTRA_TITLE", "EXTRA_SEARCH_HINT", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
