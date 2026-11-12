package f83;

import i63.i;
import i63.m;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lf83/e;", "", "<init>", "()V", "a", "Lf83/e$a;", "kotlinx-serialization"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf83/e$a;", "Lf83/e;", "Li63/m;", "format", "<init>", "(Li63/m;)V", "kotlinx-serialization"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f69956a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar) {
            super(null);
            mVar.getClass();
            this.f69956a = mVar;
        }

        @Override // f83.e
        public final <T> T a(i63.b<? extends T> bVar, ResponseBody responseBody) throws IOException {
            responseBody.getClass();
            return (T) this.f69956a.c(bVar, responseBody.string());
        }

        @Override // f83.e
        /* JADX INFO: renamed from: b, reason: from getter */
        public final m getF69956a() {
            return this.f69956a;
        }

        @Override // f83.e
        public final <T> RequestBody c(MediaType mediaType, i<? super T> iVar, T t7) {
            return RequestBody.INSTANCE.create(this.f69956a.b(iVar, t7), mediaType);
        }
    }

    public /* synthetic */ e(j jVar) {
        this();
    }

    public abstract <T> T a(i63.b<? extends T> bVar, ResponseBody responseBody);

    /* JADX INFO: renamed from: b */
    public abstract m getF69956a();

    public abstract <T> RequestBody c(MediaType mediaType, i<? super T> iVar, T t7);

    private e() {
    }
}
