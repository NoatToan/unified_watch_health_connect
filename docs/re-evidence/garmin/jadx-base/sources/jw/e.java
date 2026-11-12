package jw;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u0010\u0011BO\b\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Ljw/e;", "", "T", "Lew/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "Ljava/lang/Class;", "clazz", "Ljw/e$b;", "connectOperationListener", "Liu1/e;", "objectParser", "Ld80/h;", "cacheHandler", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;Ljava/lang/Class;Ljw/e$b;Liu1/e;Ld80/h;)V", "b", "a", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e<T> extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Class<T> f101244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b<T> f101245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final iu1.e<T> f101246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d80.h f101247m;

    public interface b<T> {
        default void onSuccess(T t7) {
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ e(com.garmin.android.library.backgroundtaskmanagement.b bVar, Class cls, b bVar2, iu1.e eVar, d80.h hVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, cls, bVar2, (i14 & 8) != 0 ? new iu1.g() : eVar, (i14 & 16) != 0 ? null : hVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static Enum e(e eVar, v13.c cVar) {
        f fVar;
        String strA;
        Object objB;
        T t7;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f101251d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f101251d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(eVar, cVar);
            }
        } else {
            fVar = new f(eVar, cVar);
        }
        Object objF = fVar.f101249b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f101251d;
        if (i15 == 0) {
            o13.r.b(objF);
            d80.h hVar = eVar.f101247m;
            if (hVar != null && (strA = hVar.a()) != null && (objB = eVar.f101246l.b(eVar.f101244j, strA)) != null) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                String strConcat = "Using cache: ".concat(strA);
                aVar2.getClass();
                i2.a.a(a2Var, strConcat);
                b<T> bVar = eVar.f101245k;
                if (bVar != null) {
                    bVar.onSuccess((T) objB);
                }
                return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            }
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.a(a2Var2, "Using API");
            fVar.f101248a = eVar;
            fVar.f101251d = 1;
            objF = eVar.f(fVar);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = fVar.f101248a;
            o13.r.b(objF);
        }
        v2 v2Var = (v2) objF;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = ((v2.a) v2Var).f47383a instanceof NoNetworkException ? com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK : com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            b<T> bVar2 = eVar.f101245k;
            return cVar2;
        }
        if (eVar.f101247m != null && (t7 = ((v2.b) v2Var).f47386a) != null) {
            try {
                String strA2 = GsonUtil.a(t7);
                d80.h hVar2 = eVar.f101247m;
                if (hVar2 != null) {
                    hVar2.b(strA2);
                }
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                String strConcat2 = "Saving to cache: ".concat(strA2);
                aVar4.getClass();
                i2.a.a(a2Var3, strConcat2);
            } catch (Exception e4) {
                i2.a aVar5 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                String str = "Error saving to cache: " + e4.getMessage();
                aVar5.getClass();
                i2.a.a(a2Var4, str);
            }
        }
        b<T> bVar3 = eVar.f101245k;
        if (bVar3 != null) {
            bVar3.onSuccess(((v2.b) v2Var).f47386a);
        }
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }

    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        return e(this, (v13.c) dVar);
    }

    public abstract Object f(f fVar);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljw/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, Class<T> cls, b<T> bVar2, iu1.e<T> eVar, d80.h hVar) {
        super(bVar);
        bVar.getClass();
        cls.getClass();
        eVar.getClass();
        this.f101244j = cls;
        this.f101245k = bVar2;
        this.f101246l = eVar;
        this.f101247m = hVar;
    }
}
