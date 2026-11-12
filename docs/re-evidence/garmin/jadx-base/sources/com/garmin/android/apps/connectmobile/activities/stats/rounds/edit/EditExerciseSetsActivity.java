package com.garmin.android.apps.connectmobile.activities.stats.rounds.edit;

import am.x0;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.c0;
import com.garmin.android.apps.connectmobile.activities.newmodel.f;
import com.garmin.android.apps.connectmobile.activities.newmodel.f0;
import com.garmin.android.apps.connectmobile.activities.newmodel.h;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.l2;
import fw.m;
import fw.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import mt0.e0;
import nq.e;
import nq.i;
import nq.k;
import nq.l;
import nq.o;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.x;
import p13.y;
import pq.g;
import qq.d;
import r53.c2;
import r53.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/rounds/edit/EditExerciseSetsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditExerciseSetsActivity extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f29937e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f29938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f29939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f29940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f29941d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29942a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29942a = iArr;
        }
    }

    public static Unit ca(EditExerciseSetsActivity editExerciseSetsActivity, f fVar, m mVar) {
        int i14 = b.f29942a[mVar.f73769b.ordinal()];
        if (i14 == 1) {
            editExerciseSetsActivity.showProgressOverlay();
        } else if (i14 == 2) {
            editExerciseSetsActivity.hideProgressOverlay();
            editExerciseSetsActivity.displayFailedMessage();
        } else {
            if (i14 != 3) {
                u0.r();
                return null;
            }
            Intent intent = new Intent();
            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, h7.c.a(new o13.p("EXTRA_ROUNDS", fVar)));
            editExerciseSetsActivity.setResult(-1, intent);
            editExerciseSetsActivity.hideProgressOverlay();
            super.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Parcelable parcelable;
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 1001 && intent != null) {
            l2.f37135b.getClass();
            Bundle bundleA = l2.a.a(intent);
            if (bundleA != null) {
                Object obj = null;
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) bundleA.getParcelable("EXTRA_EXERCISE_SET", sq.a.class);
                } else {
                    Parcelable parcelable2 = bundleA.getParcelable("EXTRA_EXERCISE_SET");
                    if (!(parcelable2 instanceof sq.a)) {
                        parcelable2 = null;
                    }
                    parcelable = (sq.a) parcelable2;
                }
                sq.a aVar = (sq.a) parcelable;
                if (aVar == null) {
                    return;
                }
                e eVar = this.f29938a;
                if (eVar == null) {
                    s.m("adapter");
                    throw null;
                }
                ArrayList arrayListZ = eVar.z();
                ArrayList arrayList = new ArrayList(y.r(arrayListZ, 10));
                Iterator it = arrayListZ.iterator();
                while (it.hasNext()) {
                    arrayList.add(c0.b((c0) it.next(), null, 7));
                }
                for (Object obj2 : arrayList) {
                    f0 split = ((c0) obj2).getSplit();
                    if (split != null) {
                        Integer messageIndex = split.getMessageIndex();
                        int i16 = aVar.f160520a;
                        if (messageIndex != null && messageIndex.intValue() == i16) {
                            obj = obj2;
                            break;
                        }
                    }
                }
                c0 c0Var = (c0) obj;
                if (c0Var == null) {
                    return;
                }
                ArrayList<sq.a> arrayListA = e.A(c0Var);
                ArrayList<sq.a> arrayList2 = new ArrayList(y.r(arrayListA, 10));
                for (sq.a aVar2 : arrayListA) {
                    if (aVar2.f160521b.G() == aVar.f160521b.G()) {
                        aVar2 = aVar;
                    }
                    arrayList2.add(aVar2);
                }
                ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
                for (sq.a aVar3 : arrayList2) {
                    arrayList3.add(x.k(aVar3.f160521b, aVar3.f160522c));
                }
                c0Var.i(h0.Z(y.s(arrayList3)));
                eVar.B(arrayList);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_recycler_view_layout);
        initActionBar(true, R.string.strength_training_edit_exercises);
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (bundleA == null) {
            return;
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            parcelable = (Parcelable) bundleA.getParcelable("GCM_extra_activity_summary", h.class);
        } else {
            Parcelable parcelable3 = bundleA.getParcelable("GCM_extra_activity_summary");
            if (!(parcelable3 instanceof h)) {
                parcelable3 = null;
            }
            parcelable = (h) parcelable3;
        }
        h hVar = (h) parcelable;
        if (hVar == null) {
            return;
        }
        this.f29941d = hVar;
        x0 x0VarC = hVar.C();
        x0VarC.getClass();
        if (i14 >= 33) {
            parcelable2 = (Parcelable) bundleA.getParcelable("EXTRA_ROUNDS", f.class);
        } else {
            Parcelable parcelable4 = bundleA.getParcelable("EXTRA_ROUNDS");
            if (!(parcelable4 instanceof f)) {
                parcelable4 = null;
            }
            parcelable2 = (f) parcelable4;
        }
        f fVar = (f) parcelable2;
        if (fVar == null) {
            return;
        }
        this.f29940c = fVar;
        long activityId = fVar.getActivityId();
        h hVar2 = this.f29941d;
        if (hVar2 == null) {
            s.m("activitySummary");
            throw null;
        }
        this.f29939b = (k) new x1(this, new l(activityId, x0VarC, s.g(hVar2.f29459l.getIsWheelchair(), Boolean.TRUE))).b(s0.f105811a.b(k.class));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List listK = x.k(g.f139551a, o.f126927a);
        k kVar = this.f29939b;
        if (kVar == null) {
            s.m("roundsViewModel");
            throw null;
        }
        c2 c2VarB = kVar.f126921f.b(kVar.f126917b, kVar.f126918c);
        x53.c cVar = o53.s0.f129406a;
        v.b(new w(r53.s.A(c2VarB, x53.b.f189152a), new nq.h(null))).f(this, new nq.c(new e0(this, listK, recyclerView, x0VarC, 5)));
        showProgressOverlay();
        recyclerView.addItemDecoration(new qq.b(this, R.color.gcm3_workout_note_divider, R.dimen.gcm3_divider_height, R.dimen.spacing_small));
        recyclerView.addItemDecoration(new qq.c(this, R.color.gcm3_workout_note_divider, R.dimen.gcm3_divider_height, R.dimen.spacing_small));
        recyclerView.addItemDecoration(new qq.a(this, R.color.gcm3_workout_note_divider, R.dimen.gcm3_divider_height, R.dimen.spacing_small));
        recyclerView.addItemDecoration(new d(this, R.color.gcm3_workout_note_divider, R.dimen.gcm3_divider_height, R.dimen.spacing_small));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.save_menu, menu);
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
        f fVar = this.f29940c;
        if (fVar == null) {
            s.m("activityRoundsDTO");
            throw null;
        }
        e eVar = this.f29938a;
        if (eVar == null) {
            s.m("adapter");
            throw null;
        }
        f fVarB = f.b(fVar, eVar.z());
        f fVar2 = this.f29940c;
        if (fVar2 == null) {
            s.m("activityRoundsDTO");
            throw null;
        }
        if (fVarB.equals(fVar2)) {
            super.onBackPressed();
        }
        k kVar = this.f29939b;
        if (kVar == null) {
            s.m("roundsViewModel");
            throw null;
        }
        y0 y0Var = new y0();
        ge1.b.T(v1.a(kVar), null, null, new i(y0Var, kVar, fVarB, null), 3);
        y0Var.f(this, new nq.c(new ml0.e(27, this, fVarB)));
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/rounds/edit/EditExerciseSetsActivity$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
