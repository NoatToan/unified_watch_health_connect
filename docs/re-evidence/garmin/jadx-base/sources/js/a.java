package js;

import e23.l;
import e23.p;
import java.util.concurrent.CancellationException;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.s;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.util.shareAppPicker.ShareAppPickerHandler$onShareStarted$1", f = "ShareAppPickerHandler.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f100586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l<String, Unit> f100587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(b bVar, l<? super String, Unit> lVar, d<? super a> dVar) {
        super(2, dVar);
        this.f100586b = bVar;
        this.f100587c = lVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f100586b, this.f100587c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f100585a;
        b bVar = this.f100586b;
        try {
            if (i14 == 0) {
                r.b(obj);
                r53.i<String> iVarInvoke = bVar.f100589b.invoke();
                this.f100585a = 1;
                obj = s.y(iVarInvoke, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            String str = (String) obj;
            if (str != null) {
                l<String, Unit> lVar = this.f100587c;
                if (bVar.f100591d.compareAndSet(false, true)) {
                    lVar.invoke(str);
                }
            }
        } catch (CancellationException e4) {
            throw e4;
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
