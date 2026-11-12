package w52;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.common.components.AudioNoteViewModel$downloadAudioNote$2", f = "AudioNoteViewModel.kt", l = {52}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f182511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f182512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f182513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f182514d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, String str, String str2, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f182512b = eVar;
        this.f182513c = str;
        this.f182514d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f182512b, this.f182513c, this.f182514d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f182511a;
        if (i14 == 0) {
            o13.r.b(obj);
            l52.a aVar2 = this.f182512b.f182501a;
            this.f182511a = 1;
            obj = aVar2.a(this.f182513c, this.f182514d, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Boolean.valueOf(obj instanceof v2.b);
    }
}
