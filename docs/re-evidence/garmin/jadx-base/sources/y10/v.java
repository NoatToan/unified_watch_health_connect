package y10;

import android.os.Parcelable;
import androidx.lifecycle.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel$installApp$1", f = "ConnectIQDownloadViewModel.kt", l = {297, 302}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f194000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f194001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o10.b f194002c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y10/v$a", "Lcom/garmin/android/apps/connectmobile/connectiq/b0$f;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements com.garmin.android.apps.connectmobile.connectiq.b0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f194003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f194004b;

        public a(k kVar, boolean z14) {
            this.f194003a = kVar;
            this.f194004b = z14;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.b0.f
        public final void a() {
            this.f194003a.f193917p.m(new n0.a(this.f194004b));
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.b0.f
        public final void b() {
            int i14 = k.f193901y;
            k kVar = this.f194003a;
            kVar.getClass();
            ge1.b.T(v1.a(kVar), null, null, new d0(kVar, null, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(k kVar, o10.b bVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f194001b = kVar;
        this.f194002c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f194001b, this.f194002c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (y10.k.y4(r6, r5, r9) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r10 == r0) goto L25;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f194000a;
        o10.b bVar = this.f194002c;
        k kVar = this.f194001b;
        if (i14 == 0) {
            o13.r.b(obj);
            kVar.f193917p.m(n0.f.f193967a);
            int nativeAppSourceId = bVar.getNativeAppSourceId();
            Parcelable.Creator<com.garmin.android.apps.connectmobile.connectiq.e> creator = com.garmin.android.apps.connectmobile.connectiq.e.CREATOR;
            if (nativeAppSourceId != -1) {
                this.f194000a = 2;
                obj = k.z4(kVar, this);
            } else if (kVar.f193922w) {
                bVar.G(false);
                kVar.f193915n.put(bVar.f(), bVar);
                kVar.f193916o.remove(bVar.f());
                kVar.K4(null, new j(kVar, 1));
            } else if (kVar.f193911j <= 0 || kVar.f193910i <= bVar.getSize()) {
                kVar.f193917p.m(n0.g.f193968a);
            } else {
                this.f194000a = 1;
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            kVar.K4(null, new w52.a(kVar, bVar, ((Boolean) obj).booleanValue(), 3));
        }
        return Unit.INSTANCE;
    }
}
