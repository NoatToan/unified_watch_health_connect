package af2;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import e23.p;
import java.util.concurrent.CancellationException;
import o13.r;
import o53.a0;
import o53.b0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import re2.l0;
import v13.i;
import we2.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Laf2/e;", "", "", "isAppDebugBuild", "<init>", "(Z)V", "", "jsonStr", "", "handleEvent", "(Ljava/lang/String;)V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f3125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gson f3126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u53.d f3127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f3128e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.portal.PortalJsMessageHandler$handleEvent$1", f = "PortalJsMessageHandler.kt", l = {}, m = "invokeSuspend")
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f3130b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f3130b = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new b(this.f3130b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws InterruptedException {
            String strConcat;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            e eVar = e.this;
            eVar.getClass();
            String str = this.f3130b;
            str.getClass();
            h hVar = null;
            try {
                h hVar2 = (h) eVar.f3126c.fromJson(str, h.class);
                if (hVar2 != null) {
                    if (hVar2.getEventType() == null) {
                        throw new Exception("unrecognized eventType");
                    }
                    hVar = hVar2;
                }
            } catch (Exception e4) {
                eVar.f3125b.error(eVar.f3124a ? "parseMsg:\n".concat(str) : "parseMsg", (Throwable) e4);
            }
            if (hVar != null) {
                f fVar = eVar.f3128e;
                fVar.getClass();
                fVar.f3133c.put(hVar);
                if (fVar.f3131a) {
                    strConcat = "added: " + hVar;
                } else {
                    strConcat = "added: ".concat(hVar.a(true));
                }
                fVar.f3132b.debug(strConcat);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public e(boolean z14) {
        this.f3124a = z14;
        l0.f152316a.getClass();
        this.f3125b = l0.c("PortalJsMessageHandler");
        this.f3126c = new Gson().newBuilder().setPrettyPrinting().create();
        this.f3127d = c0.a(s0.f129406a.plus(new a0("PortalJsMessageHandler")));
        this.f3128e = new f(z14);
    }

    public final void a() {
        this.f3125b.debug("shutDown");
        f fVar = this.f3128e;
        fVar.f3132b.debug("shutDown");
        fVar.f3134d.set(false);
        fVar.f3133c.clear();
        c0.c(this.f3127d, new CancellationException("explicit shutDown"));
    }

    @JavascriptInterface
    public final void handleEvent(String jsonStr) {
        jsonStr.getClass();
        ge1.b.T(this.f3127d, null, null, new b(jsonStr, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Laf2/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
