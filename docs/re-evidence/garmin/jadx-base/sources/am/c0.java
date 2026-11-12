package am;

import java.util.Objects;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lc83/a0;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivityUploadStatus$1", f = "ActivityRepo.kt", l = {300, StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<r53.j<? super c83.a0<Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f3883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3885e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(m mVar, String str, String str2, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f3883c = mVar;
        this.f3884d = str;
        this.f3885e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c0 c0Var = new c0(this.f3883c, this.f3884d, this.f3885e, dVar);
        c0Var.f3882b = obj;
        return c0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super c83.a0<Unit>> jVar, t13.d<? super Unit> dVar) {
        return ((c0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L25;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c83.a0 a0VarA;
        r53.j jVar = (r53.j) this.f3882b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3881a;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<Unit>> i0VarG = this.f3883c.f4069a.G(this.f3884d, this.f3885e);
            this.f3882b = jVar;
            this.f3881a = 1;
            obj = i0VarG.await(this);
            if (obj == aVar) {
            }
            return aVar;
            a0VarA = (c83.a0) obj;
        } catch (Exception e4) {
            ResponseBody.Companion companion = ResponseBody.INSTANCE;
            String message = e4.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            ResponseBody responseBodyCreate = companion.create(j.m("{\"error\":\"", message, "\"}"), gz0.a.f80402b);
            Objects.requireNonNull(responseBodyCreate, "body == null");
            a0VarA = c83.a0.a(responseBodyCreate, new Response.Builder().body(new c83.r.c(responseBodyCreate.get$contentType(), responseBodyCreate.getContentLength())).code(503).message("Response.error()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        this.f3882b = null;
        this.f3881a = 2;
    }
}
