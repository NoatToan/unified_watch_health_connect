package iw;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.w2;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import zb0.c0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Liw/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lzb0/c0;", "deviceSettingsAPI", "<init>", "(Lzb0/c0;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1823a f95249b = new C1823a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f95250a;

    public a(c0 c0Var) {
        c0Var.getClass();
        this.f95250a = c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(long j8, String str, v13.c cVar) {
        c cVar2;
        String str2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f95257d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f95257d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        c cVar3 = cVar2;
        Object objJ = cVar3.f95255b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar3.f95257d;
        if (i15 == 0) {
            r.b(objJ);
            a2 a2Var = a2.DEVICES;
            String strN = fb1.c.n("Saving device location to GC JSON = ", str);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceSettingsRepo", strN);
            d dVar = new d(this, j8, str, null);
            cVar3.f95254a = str;
            cVar3.f95257d = 1;
            objJ = f0.J(this, dVar, cVar3);
            if (objJ == aVar) {
                return aVar;
            }
            str2 = str;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = cVar3.f95254a;
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            a2 a2Var2 = a2.DEVICES;
            String strN2 = fb1.c.n("Success saving device location to GC: ", str2);
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "DeviceSettingsRepo", strN2);
            return Boolean.TRUE;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        w2.b((v2.a) v2Var, a2.DEVICES, "DeviceSettingsRepo", "Error saving device location to GC: " + str2);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: iw.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liw/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1823a {
        public /* synthetic */ C1823a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a a(C1823a c1823a) {
            c0 c0Var = (c0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, c0.class, new c83.h.a[0], null, null, null, 120);
            c1823a.getClass();
            c0Var.getClass();
            return new a(c0Var);
        }

        private C1823a() {
        }
    }
}
