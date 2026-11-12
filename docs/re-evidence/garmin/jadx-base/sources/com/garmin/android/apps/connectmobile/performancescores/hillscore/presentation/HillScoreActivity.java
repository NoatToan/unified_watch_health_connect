package com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.viewpager.widget.ViewPager;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import e32.f;
import e32.i;
import e32.j;
import e32.n;
import e32.o;
import g.h;
import lc.u0;
import o72.v3;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p13.u;
import ro0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performancescores/hillscore/presentation/HillScoreActivity;", "Le32/n;", "Lo81/d;", "Le32/f;", "<init>", "()V", "a", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HillScoreActivity extends n<o81.d> implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f40261p = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w1 f40262n = new w1(s0.f105811a.b(v81.a.class), new c(this), new v3(14), new d(null, this));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f.c<Intent> f40263o = registerForActivityResult(new h(), new jp.a(this, 13));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/performancescores/hillscore/presentation/HillScoreActivity$b", "Landroidx/viewpager/widget/ViewPager$m;", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends ViewPager.m {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            a aVar = HillScoreActivity.f40261p;
            HillScoreActivity hillScoreActivity = HillScoreActivity.this;
            fe.a aVarOa = hillScoreActivity.oa();
            w1 w1Var = hillScoreActivity.f40262n;
            j jVar = (j) aVarOa;
            if (jVar != null) {
                o oVar = o.f62808k;
                oVar.getClass();
                if (i14 == u.M(jVar.f62798j, oVar)) {
                    ht.a aVar2 = ht.a.f85464a;
                    Bundle bundle = new Bundle(0);
                    aVar2.getClass();
                    ht.a.a(bundle, "HillScore4wStatsSelected");
                    return;
                }
            }
            j jVar2 = (j) hillScoreActivity.oa();
            if (jVar2 != null) {
                o oVar2 = o.f62810m;
                oVar2.getClass();
                if (i14 == u.M(jVar2.f62798j, oVar2)) {
                    ht.a aVar3 = ht.a.f85464a;
                    Bundle bundle2 = new Bundle(0);
                    aVar3.getClass();
                    ht.a.a(bundle2, "HillScore12wStatsSelected");
                    return;
                }
            }
            j jVar3 = (j) hillScoreActivity.oa();
            if (jVar3 != null) {
                o oVar3 = o.f62814q;
                oVar3.getClass();
                if (i14 == u.M(jVar3.f62798j, oVar3)) {
                    ht.a aVar4 = ht.a.f85464a;
                    Bundle bundle3 = new Bundle(0);
                    aVar4.getClass();
                    ht.a.a(bundle3, "HillScore1yStatsSelected");
                }
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f40265a;

        public c(g gVar) {
            this.f40265a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40265a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f40267b;

        public d(e23.a aVar, g gVar) {
            this.f40266a = aVar;
            this.f40267b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40266a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40267b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // e32.l
    public final void I8(Object obj) {
        o81.d dVar = (o81.d) obj;
        dVar.getClass();
        if (!(dVar instanceof o81.e)) {
            u0.r();
            return;
        }
        HillScoreOneMonthActivity.a aVar = HillScoreOneMonthActivity.f40268n;
        DateTime dateTimeAtStartOfDay = ((o81.e) dVar).f130835a.toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay.getClass();
        aVar.getClass();
        Intent intent = new Intent(this, (Class<?>) HillScoreOneMonthActivity.class);
        intent.putExtra("EXTRA_INITIAL_DATE", dateTimeAtStartOfDay);
        this.f40263o.a(intent, null);
    }

    @Override // e32.f
    public final Fragment U6(int i14, long j8, long j14) {
        if (i14 == 1) {
            com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.a.f40269y.getClass();
            com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.a aVar = new com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.a();
            Bundle bundle = new Bundle();
            bundle.putLong("extra.date.time", j8);
            aVar.setArguments(bundle);
            return aVar;
        }
        if (i14 == 10) {
            e.f40285q.getClass();
            e eVar = new e();
            i.f62791o.getClass();
            eVar.setArguments(i.a.a(10, j8, j14));
            return eVar;
        }
        if (i14 == 5) {
            com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.b.f40274q.getClass();
            com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.b bVar = new com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.b();
            i.f62791o.getClass();
            bVar.setArguments(i.a.a(5, j8, j14));
            return bVar;
        }
        if (i14 == 6) {
            com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.c.f40279q.getClass();
            com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.c cVar = new com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.c();
            i.f62791o.getClass();
            cVar.setArguments(i.a.a(6, j8, j14));
            return cVar;
        }
        com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.a.f40269y.getClass();
        com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.a aVar2 = new com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.a();
        Bundle bundle2 = new Bundle();
        bundle2.putLong("extra.date.time", j8);
        aVar2.setArguments(bundle2);
        return aVar2;
    }

    @Override // e32.n, x22.d, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qa().c(new b());
        ht.a aVar = ht.a.f85464a;
        Bundle bundle2 = new Bundle(0);
        aVar.getClass();
        ht.a.a(bundle2, "HillScoreSelected");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.help_3_0, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a.e(HelpActivity.f36653a, this, l.HILL_SCORE, null, null, 12);
        return true;
    }

    @Override // e32.n
    public final j sa(DateTime dateTime) {
        return new o81.b(this);
    }

    @Override // e32.n
    public final String ta() {
        String string = getString(R.string.lbl_hill_score);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performancescores/hillscore/presentation/HillScoreActivity$a;", "", "<init>", "()V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
