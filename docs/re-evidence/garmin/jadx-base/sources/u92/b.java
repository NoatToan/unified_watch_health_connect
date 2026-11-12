package u92;

import e23.l;
import java.io.IOException;
import o13.r;
import p005kotlin.Metadata;
import p92.y;
import q92.a0;
import t13.d;
import v13.c;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.garmin.android.consent.network.NetworkUtilsKt", f = "NetworkUtils.kt", l = {13}, m = "safeApiCall")
    public static final class a<T> extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f169577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f169578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f169579c;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f169578b = obj;
            this.f169579c |= Integer.MIN_VALUE;
            return b.a(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object a(l<? super d<? super a0<? extends T>>, ? extends Object> lVar, String str, d<? super a0<? extends T>> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f169579c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f169579c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objInvoke = aVar.f169578b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f169579c;
        try {
            if (i15 == 0) {
                r.b(objInvoke);
                aVar.f169577a = str;
                aVar.f169579c = 1;
                objInvoke = lVar.invoke(aVar);
                if (objInvoke == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = aVar.f169577a;
                r.b(objInvoke);
            }
            return (a0) objInvoke;
        } catch (Exception e4) {
            IOException iOException = new IOException(str, e4);
            y.f136664a.getClass();
            int i16 = gt2.c.f79010a;
            gt2.b.f79005a.i("GConsentLib").error(iOException.toString());
            return new a0.a(iOException);
        }
    }
}
