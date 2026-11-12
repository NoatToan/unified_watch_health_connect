package bc2;

import com.garmin.sync.UploadConfigurationLoader;
import e23.p;
import java.util.Set;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "", "<anonymous>", "(Lo53/b0;)Ljava/util/Set;"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.android.lib.connectdevicesync.cloudtarget.UploadEndpointConfiguration$getUploadableFileTypes$1", f = "UploadEndpointConfiguration.kt", l = {106}, m = "invokeSuspend")
public final class f extends i implements p<b0, t13.d<? super Set<? extends String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f17436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17437c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, long j8, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f17436b = eVar;
        this.f17437c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f17436b, this.f17437c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Set<? extends String>> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f17435a;
        try {
            if (i14 == 0) {
                r.b(obj);
                UploadConfigurationLoader uploadConfigurationLoader = this.f17436b.f17427c;
                long j8 = this.f17437c;
                this.f17435a = 1;
                obj = uploadConfigurationLoader.d(j8, this, true);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return (Set) obj;
        } catch (Exception unused) {
            return null;
        }
    }
}
