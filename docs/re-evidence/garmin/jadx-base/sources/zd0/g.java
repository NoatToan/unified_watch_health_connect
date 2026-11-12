package zd0;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import c22.s2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.GetAutorotateEnabledUseCase$invoke$1", f = "GetAutorotateEnabledUseCase.kt", l = {25}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<q53.t<? super Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f204019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f204020c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zd0/g$a", "Landroid/database/ContentObserver;", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q53.t<Boolean> f204021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f204022b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(q53.t<? super Boolean> tVar, h hVar, Handler handler) {
            super(handler);
            this.f204021a = tVar;
            this.f204022b = hVar;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z14) {
            this.f204021a.i(Boolean.valueOf(s2.a(this.f204022b.f204023a)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f204020c = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f204020c, dVar);
        gVar.f204019b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super Boolean> tVar, t13.d<? super Unit> dVar) {
        return ((g) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f204019b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204018a;
        if (i14 == 0) {
            o13.r.b(obj);
            h hVar = this.f204020c;
            tVar.i(Boolean.valueOf(s2.a(hVar.f204023a)));
            ContentResolver contentResolver = hVar.f204023a.getContentResolver();
            a aVar2 = new a(tVar, hVar, new Handler(Looper.getMainLooper()));
            contentResolver.registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), true, aVar2);
            z10.d dVar = new z10.d(11, contentResolver, aVar2);
            this.f204019b = null;
            this.f204018a = 1;
            if (q53.r.a(tVar, dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
