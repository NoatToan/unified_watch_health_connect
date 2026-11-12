package ze2;

import android.content.Intent;
import com.google.mlkit.common.MlKitException;
import e23.p;
import java.net.URI;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.AbstractMFAFlowActivity$sendResultOkToCaller$2", f = "AbstractMFAFlowActivity.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend")
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.mfa.a f204279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f204280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ URI f204281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.garmin.android.library.mobileauth.ui.mfa.a aVar, String str, URI uri, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f204279b = aVar;
        this.f204280c = str;
        this.f204281d = uri;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f204279b, this.f204280c, this.f204281d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204278a;
        if (i14 == 0) {
            r.b(obj);
            com.garmin.android.library.mobileauth.ui.mfa.a aVar2 = this.f204279b;
            aVar2.f50497q.debug("sendResultOkToCaller");
            Intent intent = new Intent();
            intent.putExtra("mfa.token.val", this.f204280c);
            URI uri = this.f204281d;
            if (uri != null) {
                intent.putExtra("auto.login.uri.val", uri.toString());
            }
            Unit unit = Unit.INSTANCE;
            this.f204278a = 1;
            if (aVar2.ia(-1, intent, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
