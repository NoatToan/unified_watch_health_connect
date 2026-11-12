package com.garmin.android.apps.connectmobile.activities.history.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import d53.w;
import fo.a0;
import fo.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o13.p;
import o13.t;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.t0;
import p13.y;
import r53.p2;
import z10.l0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/history/presentation/ActivitiesListActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Lfo/q;", "uiState", "Laz0/c$a;", "networkStatus", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivitiesListActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f29099d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public am.g f29100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f29101b = o13.m.b(new fo.a(this, 0));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f29102c = o13.m.a(o13.n.NONE, new n(this, null, null, new fo.a(this, 1)));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements e23.l<String, Unit> {
        public b(Object obj) {
            super(1, obj, r.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/String;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(String str) {
            Object value;
            String str2 = str;
            str2.getClass();
            r rVar = (r) this.receiver;
            rVar.getClass();
            p2 p2Var = rVar.f72420e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, fo.q.a((fo.q) value, str2, false, false, 0, false, null, null, null, null, null, null, 8189)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements e23.a<Unit> {
        public c(Object obj) {
            super(0, obj, r.class, "onClearFilters", "onClearFilters()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            Object value;
            p2 p2Var = ((r) this.receiver).f72420e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, fo.q.a((fo.q) value, null, false, true, 0, false, null, null, null, null, null, null, 7159)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements e23.l<i53.c<? extends jo.c>, Unit> {
        public d(Object obj) {
            super(1, obj, r.class, "applyFilters", "applyFilters(Lkotlinx/collections/immutable/ImmutableList;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.l
        public final Unit invoke(i53.c<? extends jo.c> cVar) {
            Object value;
            fo.q qVarA;
            jo.c next;
            i53.c<? extends jo.c> cVar2 = cVar;
            cVar2.getClass();
            r rVar = (r) this.receiver;
            rVar.getClass();
            zn.a.g.f205381b.a();
            p2 p2Var = rVar.f72420e;
            do {
                value = p2Var.getValue();
                qVarA = (fo.q) value;
                Iterator<? extends jo.c> it = cVar2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof jo.c.a.C1916a));
                jo.c.a.C1916a c1916a = next instanceof jo.c.a.C1916a ? (jo.c.a.C1916a) next : null;
                if (c1916a != null) {
                    p pVarY4 = r.y4(qVarA.f72408g, c1916a.f99700c);
                    qVarA = fo.q.a(qVarA, null, false, false, 0, false, (jo.f) pVarY4.f128594a, (i53.c) pVarY4.f128595b, null, null, cVar2, null, 6975);
                }
            } while (!p2Var.b(value, qVarA));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends q implements e23.l<jo.b, Unit> {
        public e(Object obj) {
            super(1, obj, r.class, "onRemoveFilterChip", "onRemoveFilterChip(Lcom/garmin/android/apps/connectmobile/activities/history/presentation/model/FilterChipData;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.l
        public final Unit invoke(jo.b bVar) {
            Object value;
            fo.q qVarA;
            Object next;
            jo.c cVar;
            jo.c cVarE;
            jo.f fVar;
            jo.b bVar2 = bVar;
            bVar2.getClass();
            r rVar = (r) this.receiver;
            rVar.getClass();
            String str = bVar2.f99694a;
            String str2 = bVar2.f99695b;
            p2 p2Var = rVar.f72420e;
            do {
                value = p2Var.getValue();
                qVarA = (fo.q) value;
                i53.c<jo.c> cVar2 = qVarA.f72412k;
                if (cVar2 != null) {
                    ArrayList arrayList = new ArrayList(cVar2);
                    int iA = t0.a(y.r(arrayList, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    for (Object obj : arrayList) {
                        linkedHashMap.put(((jo.c) obj).f99698a, obj);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                    jo.d.f99731c.getClass();
                    Iterator<T> it = jo.d.f99741m.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!s.g(((jo.d) next).f99743b, str2));
                    jo.d dVar = (jo.d) next;
                    if (dVar != null && (cVar = (jo.c) linkedHashMap2.get(dVar)) != null) {
                        i53.c<jo.f> cVar3 = qVarA.f72409h;
                        jo.f fVar2 = qVarA.f72408g;
                        if (cVar instanceof jo.c.a.C1916a) {
                            jo.c.a.C1916a c1916a = (jo.c.a.C1916a) cVar;
                            List<ho.b> list = c1916a.f99700c;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list) {
                                if (!s.g(((ho.b) obj2).getF84581a().f4358a, str)) {
                                    arrayList2.add(obj2);
                                }
                            }
                            i53.f fVarJ = i53.a.j(arrayList2);
                            p pVarY4 = r.y4(fVar2, fVarJ);
                            fVar = (jo.f) pVarY4.f128594a;
                            i53.c<jo.f> cVar4 = (i53.c) pVarY4.f128595b;
                            cVarE = jo.c.a.C1916a.f(c1916a, fVarJ);
                            cVar3 = cVar4;
                        } else {
                            if (cVar instanceof jo.c.a.d) {
                                eo.b.a aVar = eo.b.a.f64758d;
                                int i14 = jo.c.a.d.f99712e;
                                aVar.getClass();
                                cVarE = new jo.c.a.d(aVar);
                            } else {
                                cVarE = cVar.e();
                            }
                            fVar = fVar2;
                        }
                        linkedHashMap2.put(dVar, cVarE);
                        qVarA = fo.q.a(qVarA, null, false, false, 0, false, fVar, cVar3, null, null, i53.a.j(linkedHashMap2.values()), null, 6975);
                    }
                }
            } while (!p2Var.b(value, qVarA));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class f extends q implements e23.l<String, Unit> {
        public f(Object obj) {
            super(1, obj, r.class, "onSearchSubmitted", "onSearchSubmitted(Ljava/lang/String;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(String str) {
            Object value;
            Object value2;
            String str2 = str;
            str2.getClass();
            r rVar = (r) this.receiver;
            ao.d dVar = rVar.f72419d;
            zn.a.f.f205380b.a();
            p2 p2Var = rVar.f72420e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, fo.q.a((fo.q) value, str2, false, false, 0, false, null, null, null, null, null, null, 8189)));
            if (!w.J(str2)) {
                dVar.b(str2);
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, fo.q.a((fo.q) value2, null, false, false, 0, false, null, null, null, null, null, i53.a.j(dVar.a()), 4095)));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class g extends q implements e23.a<Unit> {
        public g(Object obj) {
            super(0, obj, r.class, "onRefresh", "onRefresh()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((r) this.receiver).x4();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class h extends q implements e23.a<Unit> {
        public h(Object obj) {
            super(0, obj, r.class, "onRefreshComplete", "onRefreshComplete()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            Object value;
            p2 p2Var = ((r) this.receiver).f72420e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, fo.q.a((fo.q) value, null, false, false, 0, false, null, null, null, null, null, null, 8179)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class i extends q implements e23.l<wo0.a, Unit> {
        public i(Object obj) {
            super(1, obj, r.class, "onDeleteActivityRequested", "onDeleteActivityRequested(Lcom/garmin/android/apps/connectmobile/history/domain/model/ActivityListItem;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(wo0.a aVar) {
            Object value;
            wo0.a aVar2 = aVar;
            aVar2.getClass();
            r rVar = (r) this.receiver;
            rVar.getClass();
            p2 p2Var = rVar.f72420e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, fo.q.a((fo.q) value, null, false, false, 0, false, null, null, null, new a0(aVar2, false, false, true, 6, null), null, null, 7679)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class j extends q implements e23.a<Unit> {
        public j(Object obj) {
            super(0, obj, r.class, "onDeleteActivityConfirmed", "onDeleteActivityConfirmed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            Object value;
            r rVar = (r) this.receiver;
            p2 p2Var = rVar.f72420e;
            a0 a0Var = ((fo.q) p2Var.getValue()).f72411j;
            if (a0Var != null) {
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, fo.q.a((fo.q) value, null, false, false, 0, false, null, null, null, a0.a(a0Var, true, 5), null, null, 7679)));
                ge1.b.T(v1.a(rVar), null, null, new fo.s(rVar, a0Var, null), 3);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class k extends q implements e23.a<Unit> {
        public k(Object obj) {
            super(0, obj, r.class, "onDeleteActivityDismissed", "onDeleteActivityDismissed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            Object value;
            p2 p2Var = ((r) this.receiver).f72420e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, fo.q.a((fo.q) value, null, false, false, 0, false, null, null, null, null, null, null, 7679)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class l extends q implements e23.l<jo.f, Unit> {
        public l(Object obj) {
            super(1, obj, r.class, "onSortChanged", "onSortChanged(Lcom/garmin/android/apps/connectmobile/activities/history/presentation/model/SortData;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(jo.f fVar) {
            Object value;
            jo.f fVar2 = fVar;
            fVar2.getClass();
            r rVar = (r) this.receiver;
            rVar.getClass();
            new zn.a.h(fVar2).a();
            p2 p2Var = rVar.f72420e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, fo.q.a((fo.q) value, null, false, false, 0, false, fVar2, null, null, null, null, null, 8127)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class m extends q implements e23.a<Unit> {
        public m(Object obj) {
            super(0, obj, r.class, "onToastShown", "onToastShown()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            Object value;
            p2 p2Var = ((r) this.receiver).f72420e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, fo.q.a((fo.q) value, null, false, false, 0, false, null, null, null, null, null, null, 7935)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class n implements e23.a<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f29103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f29104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f29105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f29106d;

        public n(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f29103a = gVar;
            this.f29104b = qualifier;
            this.f29105c = aVar;
            this.f29106d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, fo.r] */
        @Override // e23.a
        public final r invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f29103a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f29105c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(r.class), viewModelStore, null, defaultViewModelCreationExtras, this.f29104b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f29106d, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final r da() {
        return (r) this.f29102c.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final void displayErrorBannerNoInternetConnection() {
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.ACTIVITIES;
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("activity_list_mode", am.g.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("activity_list_mode") : null;
            if (!(parcelableExtra instanceof am.g)) {
                parcelableExtra = null;
            }
            parcelable = (am.g) parcelableExtra;
        }
        am.g gVar = (am.g) parcelable;
        if (gVar == null) {
            gVar = am.g.f3942f;
        }
        this.f29100a = gVar;
        if (gVar == null) {
            s.m("activityListMode");
            throw null;
        }
        if (gVar == am.g.f3942f) {
            ((am.d) this.f29101b.getValue()).n(this);
        }
        initComposeScreen(new z3.e(-1748395079, true, new dh1.a(this, 29)));
        zn.a.i.f205383b.a();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/history/presentation/ActivitiesListActivity$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, am.g gVar, Integer num, String str, Integer num2) {
            context.getClass();
            gVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("activity_list_mode", gVar);
            if (num != null) {
                bundle.putInt("GCM_extra_badge_id", num.intValue());
            }
            if (str != null) {
                bundle.putString("GCM_userDisplayName", str);
            }
            if (num2 != null) {
                bundle.putInt("GCM_extra_badge_earned_count", num2.intValue());
            }
            Intent intentPutExtras = new Intent(context, (Class<?>) ActivitiesListActivity.class).putExtras(bundle);
            intentPutExtras.getClass();
            return intentPutExtras;
        }

        public static void b(a aVar, Context context, am.g gVar, Integer num, int i14) {
            if ((i14 & 4) != 0) {
                num = null;
            }
            aVar.getClass();
            context.getClass();
            gVar.getClass();
            context.startActivity(a(context, gVar, num, null, null));
        }

        private a() {
        }
    }
}
