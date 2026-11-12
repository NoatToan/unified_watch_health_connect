package xu;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxu/a;", "", "Lxu/c;", "badgeTranslationsUseCase", "<init>", "(Lxu/c;)V", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f192206a;

    static {
        new C3586a(null);
        int i14 = c.f192210d;
    }

    public a(c cVar) {
        cVar.getClass();
        this.f192206a = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f192209c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f192209c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objA = bVar.f192207a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f192209c;
        if (i15 == 0) {
            r.b(objA);
            String strB = ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).b();
            if (strB.equals("en")) {
                strB = "";
            }
            bVar.f192209c = 1;
            objA = this.f192206a.a(strB, "", bVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        v2 v2Var = (v2) objA;
        a2 a2Var = a2.BADGES;
        String strValueOf = String.valueOf(v2Var);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "BadgeTranslationsLoaderUseCase", strValueOf);
        return v2Var;
    }

    /* JADX INFO: renamed from: xu.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lxu/a$a;", "", "<init>", "()V", "", "LANGUAGE_ENGLISH", "Ljava/lang/String;", "LANGUAGE_DEFAULT", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3586a {
        public /* synthetic */ C3586a(j jVar) {
            this();
        }

        private C3586a() {
        }
    }
}
