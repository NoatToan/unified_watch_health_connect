package v90;

import android.content.Context;
import android.graphics.Bitmap;
import e23.p;
import hf.f;
import hf.j;
import hf.k;
import hf.m;
import hf.n;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import wf.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lo53/b0;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.profile.picture.ConvertToBitmapUseCase$fromUrl$2", f = "ConvertToBitmapUseCase.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, t13.d<? super Bitmap>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f176282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f176283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f176284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f176283b = bVar;
        this.f176284c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f176283b, this.f176284c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Bitmap> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b bVar = this.f176283b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f176282a;
        try {
            if (i14 == 0) {
                r.b(obj);
                Context context = bVar.f176285a;
                f.c<Boolean> cVar = k.f83572a;
                n nVarA = new j.a(context).a();
                wf.f.a aVar2 = new wf.f.a(bVar.f176285a);
                aVar2.f184930c = this.f176284c;
                h.a(aVar2);
                wf.f fVarA = aVar2.a();
                this.f176282a = 1;
                obj = nVarA.a(fVarA, this);
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
            wf.i iVar = (wf.i) obj;
            if (iVar instanceof wf.p) {
                return m.d(((wf.p) iVar).f185006a);
            }
            return null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }
}
