package kotlin;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import o13.r;
import o53.b0;
import p3.s2;
import p3.t2;
import r53.s;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {223}, m = "invokeSuspend", v = 1)
public final class m4 extends i implements p<b0, d<? super p005kotlin.Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2 f91345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f91346c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(s2 s2Var, View view2, d<? super m4> dVar) {
        super(2, dVar);
        this.f91345b = s2Var;
        this.f91346c = view2;
    }

    @Override // v13.a
    public final d<p005kotlin.Unit> create(Object obj, d<?> dVar) {
        return new m4(this.f91345b, this.f91346c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super p005kotlin.Unit> dVar) {
        return ((m4) create(b0Var, dVar)).invokeSuspend(p005kotlin.Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = a.COROUTINE_SUSPENDED;
        int i14 = this.f91344a;
        s2 s2Var = this.f91345b;
        View view2 = this.f91346c;
        try {
            if (i14 == 0) {
                r.b(obj);
                this.f91344a = 1;
                Object objW = s.w(s2Var.f135294u, new t2(null), this);
                if (objW != obj2) {
                    objW = p005kotlin.Unit.INSTANCE;
                }
                if (objW == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            if (s4.a(view2) == s2Var) {
                view2.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return p005kotlin.Unit.INSTANCE;
        } catch (Throwable th3) {
            if (s4.a(view2) == s2Var) {
                view2.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            throw th3;
        }
    }
}
