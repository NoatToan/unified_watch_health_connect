package ew;

import androidx.room.a0;
import c22.o;
import c83.d;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s0;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import jw.c;
import jw.c0;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lew/b;", "Lew/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "", "operation", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;)V", "a", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f66188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d<String> f66189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f66190l;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.garmin.android.library.backgroundtaskmanagement.b<? extends Object> bVar) {
        super(bVar);
        bVar.getClass();
    }

    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar;
        c cVar2;
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar3;
        o oVar = (o) KoinJavaComponent.get$default(o.class, null, null, 6, null);
        d<String> dVarH = h();
        this.f66189k = dVarH;
        if (dVarH == null) {
            s.m("call");
            throw null;
        }
        this.f66190l = dVarH.request().url().getUrl();
        c0 c0VarA = ((s0) KoinJavaComponent.get$default(s0.class, null, null, 6, null)).a(e(), 2592000000L);
        this.f66188j = c0VarA;
        String str = this.f66190l;
        if (str == null) {
            s.m("requestUrl");
            throw null;
        }
        c0VarA.e(str);
        if (!f()) {
            c cVar4 = this.f66188j;
            String strA = cVar4 != null ? cVar4.a() : null;
            if (strA != null) {
                try {
                    com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
                    String str2 = this.f66190l;
                    if (str2 == null) {
                        s.m("requestUrl");
                        throw null;
                    }
                    g(strA, eVar, str2);
                    cVar3 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
                } catch (Exception e4) {
                    i2.a aVar = i2.f36769a;
                    String str3 = this.f66190l;
                    if (str3 == null) {
                        s.m("requestUrl");
                        throw null;
                    }
                    i2.a.j(aVar, "GCCachedOperationTask", a0.j("Error while fetching data from fresh cache: ", str3, StringUtils.SPACE, e4.getMessage()));
                    cVar3 = e4 instanceof NoNetworkException ? com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK : com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
                }
            } else {
                cVar3 = null;
            }
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (oVar.a()) {
            d<String> dVar2 = this.f66189k;
            if (dVar2 == null) {
                s.m("call");
                throw null;
            }
            try {
                c83.a0<String> a0VarExecute = dVar2.execute();
                Response response = a0VarExecute.f25745a;
                String str4 = a0VarExecute.f25746b;
                int iCode = response.code();
                if (a0VarExecute.f25745a.isSuccessful()) {
                    String str5 = str4;
                    com.garmin.android.library.backgroundtaskmanagement.b.e eVar2 = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
                    String str6 = this.f66190l;
                    if (str6 == null) {
                        s.m("requestUrl");
                        throw null;
                    }
                    g(str5, eVar2, str6);
                    String str7 = str4;
                    if (str7 != null && (cVar2 = this.f66188j) != null) {
                        String str8 = this.f66190l;
                        if (str8 == null) {
                            s.m("requestUrl");
                            throw null;
                        }
                        cVar2.d(str8, str7);
                    }
                    cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
                } else if (iCode != 401) {
                    cVar = iCode != 403 ? com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE : com.garmin.android.library.backgroundtaskmanagement.b.c.USER_NOT_AUTHORIZED;
                } else {
                    cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.USER_NOT_AUTHENTICATED;
                }
            } catch (Exception e14) {
                cVar = e14 instanceof NoNetworkException ? com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK : com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            }
        } else {
            c cVar5 = this.f66188j;
            String strC = cVar5 != null ? cVar5.c() : null;
            if (strC != null) {
                try {
                    com.garmin.android.library.backgroundtaskmanagement.b.e eVar3 = com.garmin.android.library.backgroundtaskmanagement.b.e.CACHED;
                    String str9 = this.f66190l;
                    if (str9 == null) {
                        s.m("requestUrl");
                        throw null;
                    }
                    g(strC, eVar3, str9);
                    cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
                } catch (Exception e15) {
                    i2.a aVar2 = i2.f36769a;
                    String str10 = this.f66190l;
                    if (str10 == null) {
                        s.m("requestUrl");
                        throw null;
                    }
                    i2.a.j(aVar2, "GCCachedOperationTask", a0.j("Error while making call: ", str10, StringUtils.SPACE, e15.getMessage()));
                    cVar = e15 instanceof NoNetworkException ? com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK : com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
                }
            } else {
                cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA;
            }
        }
        return cVar;
    }

    public long e() {
        return AbstractComponentTracker.LINGERING_TIMEOUT;
    }

    public boolean f() {
        return true;
    }

    public abstract void g(String str, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, String str2);

    public abstract d<String> h();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
