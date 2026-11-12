package xe2;

import android.widget.CheckBox;
import androidx.core.widget.ContentLoadingProgressBar;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/widget/CheckBox;", "<anonymous>", "(Lo53/b0;)Landroid/widget/CheckBox;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.TermsOfUseFrag$setAgeText$2", f = "TermsOfUseFrag.kt", l = {}, m = "invokeSuspend")
public final class v0 extends v13.i implements e23.p<o53.b0, t13.d<? super CheckBox>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.e f190569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f190570b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.garmin.android.library.mobileauth.ui.e eVar, String str, t13.d<? super v0> dVar) {
        super(2, dVar);
        this.f190569a = eVar;
        this.f190570b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v0(this.f190569a, this.f190570b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super CheckBox> dVar) {
        return ((v0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        com.garmin.android.library.mobileauth.ui.e eVar = this.f190569a;
        CheckBox checkBox = eVar.f50431c;
        if (checkBox == null) {
            p005kotlin.jvm.internal.s.m("ageCheckBox");
            throw null;
        }
        String str = this.f190570b;
        checkBox.setText(str);
        checkBox.setContentDescription(str);
        ContentLoadingProgressBar contentLoadingProgressBar = eVar.f50432d;
        if (contentLoadingProgressBar == null) {
            p005kotlin.jvm.internal.s.m("ageCheckBoxProgress");
            throw null;
        }
        contentLoadingProgressBar.post(new p7.b(contentLoadingProgressBar, 3));
        checkBox.setVisibility(0);
        return checkBox;
    }
}
