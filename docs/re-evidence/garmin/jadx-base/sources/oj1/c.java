package oj1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.library.backgroundtaskmanagement.BizOperationException;
import f12.l;
import gg1.s0;
import gg1.t0;
import gw.k;
import java.io.IOException;
import jw.z;
import lc.u0;
import o13.r;
import o53.s;
import okhttp3.RequestBody;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Loj1/c;", "Lcom/garmin/android/apps/connectmobile/f0;", "Loj1/a;", "Loj1/b;", "settingsApiService", "Lf12/l;", "userSettings", "<init>", "(Loj1/b;Lf12/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements f0, oj1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f132368d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oj1.b f132369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f132370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f132371c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.repo.SettingsRepo", f = "SettingsRepo.kt", l = {44}, m = "getUserSettings", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f132372a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f132374c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f132372a = obj;
            this.f132374c |= Integer.MIN_VALUE;
            return c.this.b(this);
        }
    }

    public c(oj1.b bVar, l lVar) {
        bVar.getClass();
        lVar.getClass();
        this.f132369a = bVar;
        this.f132370b = lVar;
        this.f132371c = gt2.c.b(a2.SETTINGS.f28756a);
    }

    @Override // oj1.a
    public final Object a(RequestBody requestBody, z.a aVar) {
        return f0.J(this, new f(this, requestBody, null), aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // oj1.a
    public final Object b(t13.d<? super v2<UserSettingsDTO>> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f132374c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f132374c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objC = bVar.f132372a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f132374c;
        Logger logger = this.f132371c;
        try {
            if (i15 == 0) {
                r.b(objC);
                o53.r<UserSettingsDTO> rVarK = new k(null).k();
                bVar.f132374c = 1;
                objC = ((s) rVarK).C(bVar);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objC);
            }
            UserSettingsDTO userSettingsDTO = (UserSettingsDTO) objC;
            return userSettingsDTO != null ? new v2.b(userSettingsDTO, 200, null, null, 12, null) : new v2.a(new BizOperationException(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA), null, null, 6, null);
        } catch (BizOperationException e4) {
            logger.error("UsersRepo - getUserSettings() -> server call failed with status=[" + e4.getStatus() + "]");
            return new v2.a(e4, null, null, 6, null);
        } catch (Throwable th3) {
            logger.error("UsersRepo - getUserSettings() -> server call failed with exception=[" + th3.getMessage() + "]");
            return new v2.a(new IOException(th3), null, null, 6, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oj1.a
    public final Object c(v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f132378d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f132378d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objJ = dVar.f132376b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f132378d;
        if (i15 == 0) {
            r.b(objJ);
            e eVar = new e(this, null);
            dVar.f132378d = 1;
            objJ = f0.J(this, eVar, dVar);
            if (objJ != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2.b bVar = dVar.f132375a;
            r.b(objJ);
            return bVar;
        }
        r.b(objJ);
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            u0.r();
            return null;
        }
        s0 s0Var = new s0(null, null, 3, null);
        v2.b bVar2 = (v2.b) v2Var;
        String str = (String) bVar2.f47386a;
        dVar.f132375a = bVar2;
        dVar.f132378d = 2;
        return ge1.b.e0(s0Var.f77311b, new t0(str, s0Var, null), dVar) == aVar ? aVar : v2Var;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loj1/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static c a(a aVar) {
            oj1.b bVar = (oj1.b) ez0.b.a(ez0.b.f67468a, ez0.c.GC, oj1.b.class, new c83.h.a[0], null, null, null, 120);
            l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
            aVar.getClass();
            bVar.getClass();
            lVar.getClass();
            return new c(bVar, lVar);
        }

        private a() {
        }
    }
}
