package jp1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import ip1.i;
import java.io.IOException;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ljp1/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "Ljp1/a;", "api", "<init>", "(Ljp1/a;)V", "a", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f99884b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jp1.a f99885a;

    public b(jp1.a aVar) {
        aVar.getClass();
        this.f99885a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(long j8, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, v13.c cVar) {
        e eVar;
        DateTime dateTime4;
        long j14;
        DateTime dateTime5;
        v2 v2Var;
        v2 v2Var2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f99903g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f99903g = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        e eVar2 = eVar;
        Object objJ = eVar2.f99901e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar2.f99903g;
        if (i15 == 0) {
            r.b(objJ);
            f fVar = new f(this, j8, dateTime2, dateTime3, null);
            eVar2.f99898b = dateTime;
            eVar2.f99899c = dateTime2;
            eVar2.f99897a = j8;
            eVar2.f99903g = 1;
            Object objJ2 = f0.J(this, fVar, eVar2);
            if (objJ2 != aVar) {
                objJ = objJ2;
                dateTime4 = dateTime2;
                j14 = j8;
                dateTime5 = dateTime;
            }
            return aVar;
        }
        if (i15 == 1) {
            j14 = eVar2.f99897a;
            DateTime dateTime6 = eVar2.f99899c;
            DateTime dateTime7 = eVar2.f99898b;
            r.b(objJ);
            dateTime4 = dateTime6;
            dateTime5 = dateTime7;
        } else {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = eVar2.f99900d;
            r.b(objJ);
        }
        v2Var2 = (v2) objJ;
        if (!(v2Var instanceof v2.b) && (v2Var2 instanceof v2.b)) {
            v2.b bVar = (v2.b) v2Var;
            return new v2.b(new i((ip1.h) bVar.f47386a, (ip1.h) ((v2.b) v2Var2).f47386a), bVar.f47387b, null, null, 12, null);
        }
        if (v2Var instanceof v2.a) {
            v2.a aVar2 = (v2.a) v2Var;
            return new v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
        }
        if (v2Var2 instanceof v2.a) {
            return new v2.a(new IOException("Error occurred during getting Solar Charge summary data."), null, null, 6, null);
        }
        v2.a aVar3 = (v2.a) v2Var2;
        return new v2.a(aVar3.f47383a, aVar3.f47384b, aVar3.f47385c);
        v2 v2Var3 = (v2) objJ;
        g gVar = new g(this, j14, dateTime5, dateTime4, null);
        eVar2.f99898b = null;
        eVar2.f99899c = null;
        eVar2.f99900d = v2Var3;
        eVar2.f99897a = j14;
        eVar2.f99903g = 2;
        objJ = f0.J(this, gVar, eVar2);
        if (objJ != aVar) {
            v2Var = v2Var3;
            v2Var2 = (v2) objJ;
            if (!(v2Var instanceof v2.b)) {
            }
            if (v2Var instanceof v2.a) {
                v2.a aVar4 = (v2.a) v2Var;
                return new v2.a(aVar4.f47383a, aVar4.f47384b, aVar4.f47385c);
            }
            if (v2Var2 instanceof v2.a) {
                return new v2.a(new IOException("Error occurred during getting Solar Charge summary data."), null, null, 6, null);
            }
            v2.a aVar5 = (v2.a) v2Var2;
            return new v2.a(aVar5.f47383a, aVar5.f47384b, aVar5.f47385c);
        }
        return aVar;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljp1/b$a;", "", "<init>", "()V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(a aVar) {
            jp1.a aVar2 = (jp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, jp1.a.class, new c83.h.a[0], null, null, null, 120);
            aVar.getClass();
            aVar2.getClass();
            return new b(aVar2);
        }

        private a() {
        }
    }
}
