package pu;

import android.content.Context;
import android.content.SharedPreferences;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lpu/f;", "Lpu/c;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f141063c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f141064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f141065b;

    static {
        new a(null);
    }

    public f(Context context) {
        context.getClass();
        this.f141064a = o13.m.b(new pk0.m(5));
        this.f141065b = o13.m.b(new o72.f(context, 26));
    }

    @Override // pu.c
    public final boolean a() {
        return ((SharedPreferences) this.f141065b.getValue()).getBoolean("use_legacy_auth_remote_config", false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // pu.c
    public final Object b(v13.c cVar) {
        g gVar;
        Object bVar;
        f fVar;
        e eVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f141072d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f141072d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objA = gVar.f141070b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f141072d;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "GCMAuthRemoteConfig", "Fetching auth remote config");
                int i16 = o13.q.f128596b;
                d dVar = (d) this.f141064a.getValue();
                gVar.f141069a = this;
                gVar.f141072d = 1;
                objA = dVar.a(gVar);
                if (objA == aVar) {
                    return aVar;
                }
                fVar = this;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fVar = gVar.f141069a;
                o13.r.b(objA);
            }
            e eVar2 = (e) ((c83.a0) objA).f25746b;
            if (eVar2 != null) {
                SharedPreferences sharedPreferences = (SharedPreferences) fVar.f141065b.getValue();
                sharedPreferences.getClass();
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean("use_legacy_auth_remote_config", !eVar2.getCom.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME java.lang.String());
                editorEdit.apply();
                eVar = eVar2;
            } else {
                eVar = null;
            }
            int i17 = o13.q.f128596b;
            bVar = eVar;
        } catch (Throwable th3) {
            int i18 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        Throwable thB = o13.q.b(bVar);
        if (thB != null) {
            String strP = am.j.p("Failed to fetch auth remote config: ", thB);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "GCMAuthRemoteConfig", strP);
        }
        if (!(bVar instanceof o13.q.b)) {
            e eVar3 = (e) bVar;
            String str = "Fetched auth remote config successfully: keys[" + (eVar3 != null ? Boolean.valueOf(eVar3.getCom.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME java.lang.String()) : null) + "]";
            i2.a aVar4 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var3, "GCMAuthRemoteConfig", str);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lpu/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "AUTH_REMOTE_CONFIG_PREFS", "USE_LEGACY_AUTH_CONFIG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
