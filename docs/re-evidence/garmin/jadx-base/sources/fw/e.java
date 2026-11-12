package fw;

import androidx.lifecycle.w0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lfw/e;", "T", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class e<T> extends com.garmin.android.library.backgroundtaskmanagement.b<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w0<m<T>> f73764l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f73765m;

    static {
        new a(null);
    }

    public e() {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, null);
        this.f73764l = new w0<>();
        this.f73765m = new f();
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b
    public final void b(com.garmin.android.library.backgroundtaskmanagement.d dVar) {
        super.b(dVar);
        m<T> mVarD = this.f73764l.d();
        if ((mVarD != null ? mVarD.f73769b : null) != p.LOADING) {
            d dVar2 = new d(this, 1);
            f fVar = this.f73765m;
            fVar.getClass();
            fVar.f73766a.post(dVar2);
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b
    public final void c(List<com.garmin.android.library.backgroundtaskmanagement.d> list) {
        super.c(list);
        m<T> mVarD = this.f73764l.d();
        if ((mVarD != null ? mVarD.f73769b : null) != p.LOADING) {
            d dVar = new d(this, 2);
            f fVar = this.f73765m;
            fVar.getClass();
            fVar.f73766a.post(dVar);
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b
    public void g() {
        super.g();
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar = this.f50094d.get();
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        f fVar = this.f73765m;
        if (cVar == cVar2) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "LiveDataBizOperation", "onComplete(): SUCCESS");
            d dVar = new d(this, 0);
            fVar.getClass();
            fVar.f73766a.post(dVar);
            return;
        }
        i2.a aVar2 = i2.f36769a;
        aVar2.getClass();
        i2.a.b(a2.GENERAL, "LiveDataBizOperation", "onComplete(): " + cVar);
        df.d dVar2 = new df.d(9, this, cVar);
        fVar.getClass();
        fVar.f73766a.post(dVar2);
    }

    public final w0 k() {
        com.garmin.android.library.backgroundtaskmanagement.c.d(this, null);
        return this.f73764l;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfw/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
