package xe2;

import android.widget.CheckBox;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/widget/CheckBox;", "<anonymous>", "(Lo53/b0;)Landroid/widget/CheckBox;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.TermsOfUseFrag$setAgeTextDefaultAge$2", f = "TermsOfUseFrag.kt", l = {400}, m = "invokeSuspend")
public final class w0 extends v13.i implements e23.p<o53.b0, t13.d<? super CheckBox>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.e f190576b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.garmin.android.library.mobileauth.ui.e eVar, t13.d<? super w0> dVar) {
        super(2, dVar);
        this.f190576b = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w0(this.f190576b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super CheckBox> dVar) {
        return ((w0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190575a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        com.garmin.android.library.mobileauth.ui.e eVar = this.f190576b;
        String string = eVar.requireContext().getString(R.string.legal_page_minimum_age_limit_dynamic, eVar.f50438j);
        string.getClass();
        this.f190575a = 1;
        x53.c cVar = o53.s0.f129406a;
        Object objE0 = ge1.b.e0(u53.o.f168762a, new v0(eVar, string, null), this);
        return objE0 == aVar ? aVar : objE0;
    }
}
