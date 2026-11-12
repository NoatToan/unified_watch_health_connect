package cn1;

import android.graphics.Bitmap;
import android.os.Parcelable;
import c2.a0;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.google.maps.android.compose.MapEffectKt;
import cw1.v1;
import ew0.c0;
import ew1.b3;
import ew1.f1;
import ew1.m2;
import ew1.q1;
import f21.x;
import g81.y;
import java.util.ArrayList;
import java.util.List;
import o53.f0;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28046e;

    public /* synthetic */ p(int i14, e23.l lVar, e23.l lVar2, e23.a aVar, int i15) {
        this.f28042a = 17;
        this.f28043b = i14;
        this.f28044c = lVar;
        this.f28045d = lVar2;
        this.f28046e = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f28042a;
        int i15 = this.f28043b;
        Object obj3 = this.f28045d;
        Object obj4 = this.f28044c;
        Object obj5 = this.f28046e;
        switch (i14) {
            case 0:
                ((Integer) obj2).intValue();
                r.a((a0) obj4, (String) obj3, (String) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ((s) obj4).a((h4.r) obj3, (r70.q) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 2:
                int iIntValue = ((Integer) obj2).intValue();
                return MapEffectKt.MapEffect$lambda$3(this.f28044c, this.f28045d, (e23.q) obj5, this.f28043b, (p3.m) obj, iIntValue);
            case 3:
                ((Integer) obj2).getClass();
                ((cw0.a) obj4).a((h4.r) obj3, (r70.q) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                cw1.c.b((h4.r) obj4, (u4.d) obj5, (String) obj3, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                cw1.c.f(p0.t(i15 | 1), (h4.r) obj4, (String) obj3, (List) obj5, (p3.m) obj);
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                v1.b((hv1.j) obj4, (e23.l) obj3, (e23.a) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                d4.d.a aVar = d4.d.f57433e;
                ((d4.d) obj4).d(obj3, (e23.p) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                d40.a.a((String) obj3, (n50.e) obj4, (e23.l) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).intValue();
                xy2.b.c((h4.r) obj4, (GeoPointDTO) obj3, (e23.p) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                d51.b.a((o51.e) obj4, (e23.a) obj3, (h4.r) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ((d62.a) obj4).a((c62.t) obj3, (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ((d62.c) obj4).a((c62.t) obj3, (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ((d62.u) obj4).a((c62.t) obj3, (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                d70.j.b((h4.r) obj4, (d70.b) obj3, (o82.g) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                int iT = p0.t(49);
                d81.u.a((y) obj4, this.f28043b, (b63.o) obj3, (b63.o) obj5, (p3.m) obj, iT);
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(49);
                d81.v.a((g81.a0) obj4, this.f28043b, (b63.o) obj3, (b63.o) obj5, (p3.m) obj, iT2);
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(49);
                db0.f.a(this.f28043b, (e23.l) obj4, (e23.l) obj3, (e23.a) obj5, (p3.m) obj, iT3);
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ds.j.a((qr.t) obj4, (Bitmap) obj3, (e23.a) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                e51.h.a((o51.i) obj4, (h4.r) obj3, (e23.p) obj5, (p3.m) obj, p0.t(1), this.f28043b);
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ((e81.b) obj4).a((h4.r) obj3, (r70.q) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                c0.f((i53.c) obj4, (e23.l) obj3, (e23.q) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                ew1.y.b bVar = ew1.y.f66842g;
                ((ew1.y) obj4).z6((String) obj3, (String) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                f1.a aVar2 = f1.f66451c;
                ((f1) obj4).y6((String) obj3, (e23.l) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                q1.a aVar3 = q1.f66677f;
                ((q1) obj4).z6((jv1.u) obj3, (fw.p) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                m2.a aVar4 = m2.f66581d;
                ((m2) obj4).w6((vt1.d) obj3, (e23.l) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                b3.a aVar5 = b3.f66335d;
                ((b3) obj4).w6((g3) obj3, (fw1.a) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                f0.f((g21.l) obj4, (List) obj3, (e23.l) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                x.a((List) obj4, (g21.c) obj3, (v21.e) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                xy2.b.e((g21.r) obj4, (ArrayList) obj3, (e23.l) obj5, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ p(Parcelable parcelable, int i14, b63.o oVar, b63.o oVar2, int i15, int i16) {
        this.f28042a = i16;
        this.f28044c = parcelable;
        this.f28043b = i14;
        this.f28045d = oVar;
        this.f28046e = oVar2;
    }

    public /* synthetic */ p(h4.r rVar, u4.d dVar, String str, int i14) {
        this.f28042a = 4;
        this.f28044c = rVar;
        this.f28046e = dVar;
        this.f28045d = str;
        this.f28043b = i14;
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f28042a = i15;
        this.f28044c = obj;
        this.f28045d = obj2;
        this.f28046e = obj3;
        this.f28043b = i14;
    }

    public /* synthetic */ p(String str, n50.e eVar, e23.l lVar, int i14) {
        this.f28042a = 8;
        this.f28045d = str;
        this.f28044c = eVar;
        this.f28046e = lVar;
        this.f28043b = i14;
    }

    public /* synthetic */ p(o51.i iVar, h4.r rVar, e23.p pVar, int i14, int i15) {
        this.f28042a = 19;
        this.f28044c = iVar;
        this.f28045d = rVar;
        this.f28046e = pVar;
        this.f28043b = i15;
    }
}
