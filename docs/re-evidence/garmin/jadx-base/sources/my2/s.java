package my2;

import c83.a0;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p13.u;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lmy2/s;", "Lhy2/c;", "Lc83/a0;", "Lokhttp3/ResponseBody;", "response", "", "responseData", "", "exception", "<init>", "(Lc83/a0;Ljava/lang/Object;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "a", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s implements hy2.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f121600d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f121601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0<ResponseBody> f121602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f121603c;

    public s(Throwable th3) {
        th3.getClass();
        this.f121602b = null;
        this.f121601a = null;
        this.f121603c = th3;
    }

    @Override // hy2.c
    public final boolean a() {
        return b() instanceof NoNetworkException;
    }

    @Override // hy2.c
    public final Exception b() {
        Throwable th3 = this.f121603c;
        if (th3 == null) {
            return null;
        }
        if (!(th3 instanceof Exception)) {
            return new Exception(th3);
        }
        th3.getClass();
        return (Exception) th3;
    }

    @Override // hy2.c
    public final boolean c() {
        int httpResponseCode = getHttpResponseCode();
        return 200 <= httpResponseCode && httpResponseCode < 300;
    }

    @Override // hy2.c
    public final String d(String str) {
        Headers headers;
        a0<ResponseBody> a0Var = this.f121602b;
        if (a0Var == null || (headers = a0Var.f25745a.headers()) == null) {
            return null;
        }
        return headers.get(str);
    }

    @Override // hy2.c
    /* JADX INFO: renamed from: getData, reason: from getter */
    public final Object getF121601a() {
        return this.f121601a;
    }

    @Override // hy2.c
    public final int getHttpResponseCode() {
        a0<ResponseBody> a0Var = this.f121602b;
        if (a0Var == null && (b() instanceof HttpException)) {
            Exception excB = b();
            excB.getClass();
            return ((HttpException) excB).code();
        }
        if (a0Var != null || !(b() instanceof ny2.a)) {
            if (a0Var != null) {
                return a0Var.f25745a.code();
            }
            return -1;
        }
        Object objB = b();
        objB.getClass();
        Integer httpCode = ((ny2.a) objB).getHttpCode();
        if (httpCode != null) {
            return httpCode.intValue();
        }
        return -1;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmy2/s$a;", "", "<init>", "()V", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static s a(a0 a0Var, int[] iArr) {
            MediaType mediaType;
            T t7 = a0Var.f25746b;
            Response response = a0Var.f25745a;
            if (!response.isSuccessful() && (iArr == null || !u.x(iArr, response.code()))) {
                return new s(new HttpException(a0Var));
            }
            ResponseBody responseBody = (ResponseBody) t7;
            if (p005kotlin.jvm.internal.s.g((responseBody == null || (mediaType = responseBody.get$contentType()) == null) ? null : mediaType.subtype(), "octet-stream")) {
                return new s(a0Var, responseBody != null ? responseBody.bytes() : null, null, 4, null);
            }
            return new s(a0Var, responseBody != null ? responseBody.string() : null, null, 4, null);
        }

        private a() {
        }
    }

    public /* synthetic */ s(a0 a0Var, Object obj, Throwable th3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(a0Var, obj, (i14 & 4) != 0 ? null : th3);
    }

    public s(a0<ResponseBody> a0Var, Object obj, Throwable th3) {
        a0Var.getClass();
        this.f121602b = a0Var;
        this.f121601a = obj;
        this.f121603c = th3;
    }
}
