package r10;

import c83.a0;
import com.garmin.android.apps.connectmobile.v2;
import java.io.IOException;
import o13.q;
import o13.r;
import o53.i0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr10/a;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p10.c f149331a;

    static {
        new C2815a(null);
    }

    public a() {
        p10.c.f134886c.getClass();
        this.f149331a = new p10.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(a aVar, String str, String str2, String str3, String str4, String str5, v13.c cVar) {
        c cVar2;
        Object bVar;
        ResponseBody responseBody;
        aVar.getClass();
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f149341c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f149341c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(aVar, cVar);
            }
        } else {
            cVar2 = new c(aVar, cVar);
        }
        Object objAwait = cVar2.f149339a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f149341c;
        try {
            if (i15 == 0) {
                r.b(objAwait);
                RequestBody requestBodyCreate = RequestBody.INSTANCE.create(str5, MediaType.INSTANCE.get("application/json"));
                int i16 = q.f128596b;
                Object value = aVar.f149331a.f134887a.getValue();
                value.getClass();
                i0<a0<ResponseBody>> i0VarA = ((p10.b) value).a(str, str2, str3, str4, requestBodyCreate);
                cVar2.f149341c = 1;
                objAwait = i0VarA.await(cVar2);
                if (objAwait == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objAwait);
            }
            bVar = (a0) objAwait;
            int i17 = q.f128596b;
        } catch (Throwable th3) {
            int i18 = q.f128596b;
            bVar = new q.b(th3);
        }
        a0 a0Var = (a0) (bVar instanceof q.b ? null : bVar);
        byte[] bArrBytes = (a0Var == null || (responseBody = (ResponseBody) a0Var.f25746b) == null) ? null : responseBody.bytes();
        if (a0Var != null) {
            new Integer(a0Var.f25745a.code());
        }
        Throwable thB = q.b(bVar);
        if (thB != null) {
            thB.getMessage();
        }
        if (a0Var != null) {
            Response response = a0Var.f25745a;
            if (response.isSuccessful() && bArrBytes != null) {
                return new v2.b(bArrBytes, response.code(), null, null, 12, null);
            }
        }
        return new v2.a(new IOException("Error occurred during getting binary settings !"), a0Var != null ? new Integer(a0Var.f25745a.code()) : null, null, 4, null);
    }

    /* JADX INFO: renamed from: r10.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lr10/a$a;", "", "<init>", "()V", "", "THEME_DARK", "Ljava/lang/String;", "TAG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2815a {
        public /* synthetic */ C2815a(j jVar) {
            this();
        }

        private C2815a() {
        }
    }
}
