package t20;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.File;
import lc.u0;
import o13.r;
import o53.s0;
import o53.t1;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lt20/j;", "Lq20/a;", "Ljava/io/File;", "file", "", "fileName", "Lt20/j$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/io/File;Ljava/lang/String;Lt20/j$a;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends q20.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f161786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f161788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d60.b f161789e;

    public interface a {
        void a();

        void b(com.garmin.android.apps.connectmobile.courses.model.e eVar);
    }

    public j(File file, String str, a aVar) {
        file.getClass();
        str.getClass();
        aVar.getClass();
        this.f161786b = file;
        this.f161787c = str;
        this.f161788d = aVar;
        this.f161789e = u0.g(d60.b.f57806c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (ge1.b.e0(r2, r3, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        if (ge1.b.e0(r10, r2, r0) == r1) goto L32;
     */
    @Override // q20.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v13.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f161792c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f161792c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objJ = kVar.f161790a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f161792c;
        if (i15 == 0) {
            r.b(objJ);
            MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("file", this.f161787c, RequestBody.INSTANCE.create(this.f161786b, gz0.a.f80404d));
            kVar.f161792c = 1;
            d60.b bVar = this.f161789e;
            bVar.getClass();
            objJ = f0.J(bVar, new d60.f0(bVar, partCreateFormData, null), kVar);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(objJ);
                return Unit.INSTANCE;
            }
            if (i15 == 3) {
                r.b(objJ);
                return Unit.INSTANCE;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objJ);
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            x53.c cVar2 = s0.f129406a;
            t1 t1Var = u53.o.f168762a;
            l lVar = new l(this, v2Var, null);
            kVar.f161792c = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            x53.c cVar3 = s0.f129406a;
            t1 t1Var2 = u53.o.f168762a;
            m mVar = new m(this, null);
            kVar.f161792c = 3;
        }
        return aVar;
    }
}
