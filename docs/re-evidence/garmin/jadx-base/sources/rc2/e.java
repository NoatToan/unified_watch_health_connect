package rc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.net.HttpURLConnection;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lrc2/e;", "Lrc2/k;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "requestedClientId", "it2AccessToken", "thisAppITClientIdLoggingOnly", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f151891i = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f151892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f151893h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lwc2/a;", "Lsc2/c;", "<anonymous>", "(Lo53/b0;)Lwc2/a;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.lib.networking.authentication.itapi.IT2ForIT2Request$run$2", f = "IT2ForIT2Request.kt", l = {74}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super wc2.a<? extends sc2.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f151894a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super wc2.a<? extends sc2.c>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f151894a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f151894a = 1;
            int i15 = e.f151891i;
            Object objB = e.this.b(this);
            return objB == aVar ? aVar : objB;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, ve2.e eVar, String str, String str2, String str3) {
        super(context, "IT2ForIT2Request", eVar, str3, "oauth_exchange");
        context.getClass();
        eVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f151892g = str;
        this.f151893h = str2;
    }

    @Override // rc2.k
    public final byte[] d() {
        return d53.u.o("client_id=" + this.f151892g + "&access_token=" + nd2.c.i(this.f151893h));
    }

    @Override // rc2.k
    public final void g(HttpURLConnection httpURLConnection) {
    }

    public final Object h(t13.d<? super wc2.a<sc2.c>> dVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new b(null), dVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrc2/e$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
