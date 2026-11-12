package fj1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import f12.l;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lfj1/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "", "Lfj1/a;", "primaryDeviceApi", "Lf12/l;", "userSettings", "<init>", "(Lfj1/a;Lf12/l;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f71828c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fj1.a f71829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f71830b;

    public b(fj1.a aVar, l lVar) {
        aVar.getClass();
        lVar.getClass();
        this.f71829a = aVar;
        this.f71830b = lVar;
    }

    public final Object a(v13.c cVar) {
        return f0.J(this, new d(this, null), cVar);
    }

    public final Object b(gj1.d dVar, v13.c cVar) {
        return f0.J(this, new e(this, dVar, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j8, v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f71842d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f71842d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objJ = fVar.f71840b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f71842d;
        if (i15 == 0) {
            r.b(objJ);
            g gVar = new g(this, j8, null);
            fVar.f71839a = j8;
            fVar.f71842d = 1;
            objJ = f0.J(this, gVar, fVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = fVar.f71839a;
            r.b(objJ);
        }
        if (((v2) objJ) instanceof v2.b) {
            this.f71830b.s1(j8);
        }
        return objJ;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfj1/b$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(a aVar) {
            fj1.a aVar2 = (fj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, fj1.a.class, new c83.h.a[0], null, null, null, 120);
            aVar.getClass();
            aVar2.getClass();
            return new b(aVar2, (l) KoinJavaComponent.get$default(l.class, null, null, 6, null));
        }

        private a() {
        }
    }
}
