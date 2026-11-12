package zn1;

import c83.a0;
import com.garmin.android.apps.connectmobile.smartscale.model.WeightScaleUserInfoDTO;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/smartscale/model/WeightScaleUserInfoDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.smartscale.repo.SmartScaleRepo$getUserInfo$2", f = "SmartScaleRepo.kt", l = {18}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<WeightScaleUserInfoDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f205397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f205398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f205399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, String str, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f205398b = aVar;
        this.f205399c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f205398b, this.f205399c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<WeightScaleUserInfoDTO>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205397a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<WeightScaleUserInfoDTO>> i0VarA = this.f205398b.f205393a.a(this.f205399c);
        this.f205397a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
