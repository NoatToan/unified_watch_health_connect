package zn1;

import c83.a0;
import com.garmin.android.apps.connectmobile.smartscale.model.WeightScaleServiceResponseDTO;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/smartscale/model/WeightScaleServiceResponseDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.smartscale.repo.SmartScaleRepo$setUserInfo$2", f = "SmartScaleRepo.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<WeightScaleServiceResponseDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f205400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f205401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f205402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WeightScaleUserInfoDTO f205403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, String str, WeightScaleUserInfoDTO weightScaleUserInfoDTO, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f205401b = aVar;
        this.f205402c = str;
        this.f205403d = weightScaleUserInfoDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f205401b, this.f205402c, this.f205403d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<WeightScaleServiceResponseDTO>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205400a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<WeightScaleServiceResponseDTO>> i0VarC = this.f205401b.f205393a.c(this.f205402c, this.f205403d);
        this.f205400a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
