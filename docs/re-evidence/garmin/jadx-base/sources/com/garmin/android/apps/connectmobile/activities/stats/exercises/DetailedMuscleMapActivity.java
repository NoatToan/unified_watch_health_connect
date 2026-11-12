package com.garmin.android.apps.connectmobile.activities.stats.exercises;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import c.j;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import hq.f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.c0;
import p13.u0;
import u53.o;
import wt0.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/DetailedMuscleMapActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DetailedMuscleMapActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29817b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f29818a = new w1(s0.f105811a.b(hq.e.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29819a;

        public b(g gVar) {
            this.f29819a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f29819a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29820a;

        public c(g gVar) {
            this.f29820a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f29820a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f29821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f29822b;

        public d(e23.a aVar, g gVar) {
            this.f29821a = aVar;
            this.f29822b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f29821a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f29822b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static Unit ca(DetailedMuscleMapActivity detailedMuscleMapActivity) {
        super.onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        List<xd1.d> list;
        List<xd1.d> list2;
        com.garmin.android.apps.connectmobile.repcounting.model.e[] eVarArr;
        Object next;
        xd1.d dVar;
        Iterator it;
        Object next2;
        xd1.d dVar2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("VISIBLE_EXERCISE_SET_KEY", ExerciseSetsDTO.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("VISIBLE_EXERCISE_SET_KEY");
                if (!(parcelable2 instanceof ExerciseSetsDTO)) {
                    parcelable2 = null;
                }
                parcelable = (ExerciseSetsDTO) parcelable2;
            }
            ExerciseSetsDTO exerciseSetsDTO = (ExerciseSetsDTO) parcelable;
            if (exerciseSetsDTO != null) {
                hq.e eVar = (hq.e) this.f29818a.getValue();
                l22.a aVar = new l22.a(this);
                zw1.b bVar = new zw1.b(aVar);
                xd1.b bVar2 = new xd1.b(xd1.e.GROUP_BY_EXERCISE, null, null, null, 14, null);
                xd1.b bVar3 = new xd1.b(xd1.e.GROUP_BY_PRIMARY_MUSCLE, null, null, null, 14, null);
                com.garmin.android.apps.connectmobile.repcounting.model.e[] eVarArr2 = exerciseSetsDTO.f41089a;
                eVarArr2.getClass();
                int length = eVarArr2.length;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    list = bVar2.f190009b;
                    list2 = bVar3.f190009b;
                    if (i14 >= length) {
                        break;
                    }
                    com.garmin.android.apps.connectmobile.repcounting.model.e eVar2 = eVarArr2[i14];
                    i15++;
                    String str = eVar2.f41117g;
                    Iterator<T> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            eVarArr = eVarArr2;
                            next = null;
                            break;
                        }
                        next = it3.next();
                        xd1.d dVar3 = (xd1.d) next;
                        eVarArr = eVarArr2;
                        if (s.g(str, dVar3.f190018a) || (str == null && s.g(dVar3.f190018a, "Unknown"))) {
                            break;
                        } else {
                            eVarArr2 = eVarArr;
                        }
                    }
                    xd1.d dVar4 = (xd1.d) next;
                    if (dVar4 == null) {
                        dVar = new xd1.d(str == null ? "Unknown" : str, 0L, 0L, 0.0d, 0.0d, false, null, null, null, false, false, 2046, null);
                        list.add(dVar);
                    } else {
                        dVar = dVar4;
                    }
                    w13.b.e(eVar2, dVar, dVar.a(aVar.a(R.string.lbl_set_with_index, Integer.valueOf(i15))), null);
                    if (str != null) {
                        Iterator it4 = bVar.a(eVar2.f41124n).iterator();
                        while (it4.hasNext()) {
                            p pVar = (p) it4.next();
                            String str2 = (String) pVar.f128594a;
                            String str3 = (String) pVar.f128595b;
                            str3.getClass();
                            Iterator<T> it5 = list2.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    it = it4;
                                    next2 = null;
                                    break;
                                } else {
                                    next2 = it5.next();
                                    it = it4;
                                    if (str3.equals(((xd1.d) next2).f190018a)) {
                                        break;
                                    } else {
                                        it4 = it;
                                    }
                                }
                            }
                            xd1.d dVar5 = (xd1.d) next2;
                            if (dVar5 == null) {
                                dVar2 = new xd1.d(str3, 0L, 0L, 0.0d, 0.0d, false, null, null, null, false, false, 2046, null);
                                list2.add(dVar2);
                            } else {
                                dVar2 = dVar5;
                            }
                            w13.b.e(eVar2, dVar2, dVar2.a(str), str2);
                            it4 = it;
                        }
                    }
                    List<String> list3 = eVar2.f41124n;
                    if (list3 != null) {
                        bVar2.f190010c.addAll(list3);
                        bVar3.f190010c.addAll(list3);
                    }
                    List<String> list4 = eVar2.f41125o;
                    if (list4 != null) {
                        bVar2.f190011d.addAll(list4);
                    }
                    i14++;
                    eVarArr2 = eVarArr;
                }
                bVar2.a();
                bVar3.a();
                c0.u(list, new ww0.d(new i((byte) 0, 25), 3));
                c0.u(list2, new ww0.d(new i((byte) 0, 24), 2));
                Iterator<T> it6 = list2.iterator();
                while (it6.hasNext()) {
                    List<xd1.c> list5 = ((xd1.d) it6.next()).f190024g;
                    if (list5.size() > 1) {
                        c0.u(list5, new xd1.a());
                    }
                }
                xd1.e eVar3 = xd1.e.GROUP_BY_EXERCISE;
                p pVar2 = new p(eVar3, bVar2);
                xd1.e eVar4 = xd1.e.GROUP_BY_PRIMARY_MUSCLE;
                Map mapE = u0.e(pVar2, new p(eVar4, bVar3));
                eVar.f85003a = (xd1.b) mapE.get(eVar3);
                eVar.f85004b = (xd1.b) mapE.get(eVar4);
                w9.a aVarA = v1.a(eVar);
                x53.c cVar = o53.s0.f129406a;
                ge1.b.T(aVarA, o.f168762a, null, new f(eVar, null), 2);
                j.a(this, new z3.e(1332003701, true, new hq.a(this, 0)));
                return;
            }
        }
        finish();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/DetailedMuscleMapActivity$a;", "", "<init>", "()V", "", "VISIBLE_EXERCISE_SET_KEY", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
