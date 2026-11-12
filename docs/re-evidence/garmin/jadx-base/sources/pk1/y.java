package pk1;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.UnsupportedEncodingException;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.usersettings.UserSettingsFragment$initObservers$1", f = "UserSettingsFragment.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f138350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f138351b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpk1/l;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "<anonymous>", "(Lpk1/l;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.usersettings.UserSettingsFragment$initObservers$1$1", f = "UserSettingsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<l, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f138352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f138353b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u uVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f138353b = uVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f138353b, dVar);
            aVar.f138352a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(l lVar, t13.d<? super Unit> dVar) {
            return ((a) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
            l lVar = (l) this.f138352a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            u uVar = this.f138353b;
            g22.e.f(uVar);
            String str = lVar.f138299a;
            String str2 = lVar.f138300b;
            if (g22.n.d(str)) {
                Context contextRequireContext = uVar.requireContext();
                contextRequireContext.getClass();
                g22.a.f(contextRequireContext, str, str2);
            } else {
                Context contextRequireContext2 = uVar.requireContext();
                contextRequireContext2.getClass();
                g22.a.d(contextRequireContext2, Uri.parse(str2));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(u uVar, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f138351b = uVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f138351b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f138350a;
        if (i14 == 0) {
            o13.r.b(obj);
            u.a aVar2 = u.E;
            u uVar = this.f138351b;
            r53.b bVarA = androidx.lifecycle.u.a(((f) uVar.C.getValue()).f138288c, uVar.getViewLifecycleOwner().getF158016a(), androidx.lifecycle.b0.b.STARTED);
            a aVar3 = new a(uVar, null);
            this.f138350a = 1;
            if (r53.s.k(bVarA, aVar3, this) == aVar) {
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
