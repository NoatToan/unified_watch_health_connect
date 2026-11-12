package tm0;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import i3.e5;
import java.security.InvalidParameterException;
import java.util.List;
import o53.s0;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ltm0/l;", "Landroidx/lifecycle/u1;", "", "groupId", "<init>", "(J)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f165395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym0.a f165396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bq0.c f165397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<List<ef0.b>> f165398d;

    static {
        new a(null);
    }

    public l(long j8) {
        this.f165395a = j8;
        ym0.a.f197886f.getClass();
        this.f165396b = ym0.a.C3709a.a();
        int i14 = 0;
        this.f165397c = new bq0.c(i14, i14, 3, null);
        this.f165398d = new y0<>();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(l lVar, Context context, ef0.b bVar, v13.c cVar) throws Throwable {
        n nVar;
        lVar.getClass();
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f165406c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f165406c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(lVar, cVar);
            }
        } else {
            nVar = new n(lVar, cVar);
        }
        Object objE0 = nVar.f165404a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f165406c;
        if (i15 == 0) {
            o13.r.b(objE0);
            Object obj = bVar.f63941c;
            bq0.k kVar = obj instanceof bq0.k ? (bq0.k) obj : null;
            if (kVar == null) {
                throw new InvalidParameterException(e5.f(bVar.f63941c, "Upload data is not StorageImage, StorageImage: "));
            }
            nVar.f165406c = 1;
            x53.c cVar2 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new o(lVar, context, kVar, null), nVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        zp0.f fVar = (zp0.f) objE0;
        if (fVar != null) {
            return MultipartBody.Part.INSTANCE.createFormData("file", "image.".concat(fVar.f206589b), RequestBody.Companion.create$default(RequestBody.INSTANCE, fVar.f206588a, gz0.a.f80404d, 0, 0, 6, (Object) null));
        }
        throw new InvalidParameterException("Convert to input body failed, input body is null");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltm0/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
