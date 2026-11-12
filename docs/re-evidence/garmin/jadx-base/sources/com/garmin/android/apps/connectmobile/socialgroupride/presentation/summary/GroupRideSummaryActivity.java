package com.garmin.android.apps.connectmobile.socialgroupride.presentation.summary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import dp1.i;
import dp1.j;
import e23.l;
import e32.f;
import e32.n;
import e32.o;
import fw.p;
import lc.u0;
import o13.h;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yo1.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/socialgroupride/presentation/summary/GroupRideSummaryActivity;", "Le32/n;", "Ldp1/b;", "Le32/f;", "<init>", "()V", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupRideSummaryActivity extends n<dp1.b> implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f44755o = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f44756n;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44757a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44757a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f44758a;

        public b(l lVar) {
            lVar.getClass();
            this.f44758a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f44758a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44758a.invoke(obj);
        }
    }

    @Override // e32.l
    public final void I8(Object obj) {
        dp1.b bVar = (dp1.b) obj;
        bVar.getClass();
        if (!(bVar instanceof dp1.a)) {
            u0.r();
            return;
        }
        k kVar = ((dp1.a) bVar).f60643a;
        String gcsUuid = kVar.getGcsUuid();
        String strB = hb2.h.b();
        Long activityId = kVar.getActivityId();
        j jVar = this.f44756n;
        if (jVar == null) {
            s.m("viewModel");
            throw null;
        }
        gcsUuid.getClass();
        m.a(v1.a(jVar).f183565a, new i(jVar, gcsUuid, strB, activityId, null), 2).f(this, new b(new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(this, 27)));
    }

    @Override // e32.f
    public final Fragment U6(int i14, long j8, long j14) {
        if (i14 == 5) {
            com.garmin.android.apps.connectmobile.socialgroupride.presentation.summary.a.f44759q.getClass();
            com.garmin.android.apps.connectmobile.socialgroupride.presentation.summary.a aVar = new com.garmin.android.apps.connectmobile.socialgroupride.presentation.summary.a();
            e32.i.f62791o.getClass();
            aVar.setArguments(e32.i.a.a(i14, j8, j14));
            return aVar;
        }
        if (i14 != 13) {
            return new Fragment();
        }
        com.garmin.android.apps.connectmobile.socialgroupride.presentation.summary.a.f44759q.getClass();
        com.garmin.android.apps.connectmobile.socialgroupride.presentation.summary.a aVar2 = new com.garmin.android.apps.connectmobile.socialgroupride.presentation.summary.a();
        e32.i.f62791o.getClass();
        aVar2.setArguments(e32.i.a.a(i14, j8, j14));
        return aVar2;
    }

    @Override // e32.n, x22.d, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content_frame);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        layoutInflaterFrom.getClass();
        frameLayout.addView(layoutInflaterFrom.inflate(R.layout.composable_container, (ViewGroup) frameLayout, false));
        this.f44756n = (j) new x1(this).a(j.class);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.group_ride_reports_menu, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.SOCIAL_GROUP_RIDE, null, null, 12);
        return true;
    }

    @Override // e32.n
    public final e32.j sa(DateTime dateTime) {
        return new e32.j(this, dateTime, new o[]{o.f62808k, o.f62816t}, null, 8, null);
    }

    @Override // e32.n
    public final String ta() {
        String string = getString(R.string.lbl_group_ride);
        string.getClass();
        return string;
    }
}
