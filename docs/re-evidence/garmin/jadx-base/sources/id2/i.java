package id2;

import com.google.common.net.HttpHeaders;
import d53.w;
import o13.r;
import o13.t;
import o53.b0;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000bB7\b\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lid2/i;", "Lid2/e;", "Lkotlin/Function0;", "", "tokenType", "Lkotlin/Function1;", "Lt13/d;", "", "accessTokenAsync", "<init>", "(Le23/a;Le23/l;)V", "a", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f93051e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<String> f93052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<t13.d<? super String>, Object> f93053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f93054d;

    /* JADX WARN: Multi-variable type inference failed */
    private i(e23.a<String> aVar, e23.l<? super t13.d<? super String>, ? extends Object> lVar) {
        this.f93052b = aVar;
        this.f93053c = lVar;
        this.f93054d = o13.m.b(new i31.e(19));
    }

    @Override // id2.e
    public final Response a(Interceptor.Chain chain) {
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        String strInvoke = this.f93052b.invoke();
        return chain.proceed(builderNewBuilder.header(HttpHeaders.AUTHORIZATION, ((Object) strInvoke) + StringUtils.SPACE + ed2.c.a.a(ed2.c.C, (b0) this.f93054d.getValue(), this.f93053c)).build());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(v13.c cVar) {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f93057c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f93057c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objInvoke = jVar.f93055a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f93057c;
        if (i15 == 0) {
            r.b(objInvoke);
            jVar.f93057c = 1;
            objInvoke = this.f93053c.invoke(jVar);
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objInvoke);
        }
        return Boolean.valueOf(!w.J((CharSequence) objInvoke));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lid2/i$a;", "", "<init>", "()V", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ i(e23.a aVar, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new i31.e(20) : aVar, lVar);
    }

    public /* synthetic */ i(e23.a aVar, e23.l lVar, p005kotlin.jvm.internal.j jVar) {
        this(aVar, lVar);
    }
}
