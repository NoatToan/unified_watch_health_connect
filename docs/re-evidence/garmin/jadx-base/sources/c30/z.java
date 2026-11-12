package c30;

import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLng;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lc30/z;", "", "Ld60/b;", "coursesRepo", "<init>", "(Ld60/b;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d60.b f24061a;

    static {
        new a(null);
        d60.b.a aVar = d60.b.f57806c;
    }

    public z(d60.b bVar) {
        bVar.getClass();
        this.f24061a = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(LatLng latLng, LatLng latLng2, LatLng latLng3, int i14, String str, com.garmin.android.apps.connectmobile.courses.model.i iVar, boolean z14, boolean z15, boolean z16, v13.c cVar) {
        a0 a0Var;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i15 = a0Var.f23780c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                a0Var.f23780c = i15 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object objC = a0Var.f23778a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = a0Var.f23780c;
        if (i16 == 0) {
            o13.r.b(objC);
            k30.e eVar = new k30.e(new Double(latLng.latitude), new Double(latLng.longitude), new Double(latLng3.latitude), new Double(latLng3.longitude), "MOBILE", p13.w.c(new k30.c(new Double(latLng2.latitude), new Double(latLng2.longitude), new Integer(i14))));
            String str2 = iVar.f32983e;
            Boolean boolValueOf = iVar.c() ? Boolean.valueOf(z14) : null;
            Boolean boolValueOf2 = iVar.c() ? Boolean.valueOf(z15) : null;
            Boolean boolValueOf3 = iVar.c() ? Boolean.valueOf(z16) : null;
            a0Var.f23780c = 1;
            d60.b bVar = this.f24061a;
            objC = bVar.C(new d60.b0(bVar, eVar, str, str2, boolValueOf, boolValueOf2, boolValueOf3, null), a0Var);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            T t7 = ((v2.b) v2Var).f47386a;
            k30.d dVar = (k30.d) t7;
            if ((dVar != null ? dVar.b() : null) != null) {
                return t7;
            }
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc30/z$a;", "", "<init>", "()V", "", "DEVICE_TYPE", "Ljava/lang/String;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
