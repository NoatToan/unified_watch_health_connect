package z2;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/textclassifier/TextClassifier;", "Ls5/w0;", "<anonymous>", "(Landroid/view/textclassifier/TextClassifier;)Ls5/w0;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 159}, m = "invokeSuspend", v = 1)
public final class v extends v13.i implements e23.p<TextClassifier, t13.d<? super s5.w0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f201806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f201807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f201808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f201809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f201810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f201811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CharSequence f201812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f201813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f201814i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(CharSequence charSequence, long j8, w wVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f201812g = charSequence;
        this.f201813h = j8;
        this.f201814i = wVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(this.f201812g, this.f201813h, this.f201814i, dVar);
        vVar.f201811f = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(TextClassifier textClassifier, t13.d<? super s5.w0> dVar) {
        return ((v) create(textClassifier, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        long j8;
        z53.b bVar;
        w wVar;
        CharSequence charSequence;
        long j14;
        TextSelection textSelection;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201810e;
        if (i14 == 0) {
            o13.r.b(obj);
            TextClassifier textClassifier = (TextClassifier) this.f201811f;
            long j15 = this.f201813h;
            int iH = s5.w0.h(j15);
            int iG = s5.w0.g(j15);
            CharSequence charSequence2 = this.f201812g;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence2, iH, iG);
            w wVar2 = this.f201814i;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(wVar2.e());
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jL = og.a.l(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i15 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.f201809d = jL;
                this.f201810e = 2;
                if (w.d(this.f201814i, this.f201812g, jL, textClassifier, this) != aVar) {
                    j8 = jL;
                    j14 = j8;
                }
            } else {
                z53.b bVar2 = wVar2.f201828e;
                this.f201811f = textSelectionSuggestSelection;
                this.f201806a = bVar2;
                this.f201807b = wVar2;
                this.f201808c = charSequence2;
                this.f201809d = jL;
                this.f201810e = 1;
                if (bVar2.c(this) != aVar) {
                    bVar = bVar2;
                    wVar = wVar2;
                    charSequence = charSequence2;
                    j14 = jL;
                    textSelection = textSelectionSuggestSelection;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    wVar.f201830g.setValue(new w1(charSequence, j14, textClassification, null));
                    Unit unit = Unit.INSTANCE;
                }
            }
            return aVar;
        }
        if (i14 == 1) {
            long j16 = this.f201809d;
            CharSequence charSequence3 = this.f201808c;
            wVar = this.f201807b;
            bVar = this.f201806a;
            textSelection = (TextSelection) this.f201811f;
            o13.r.b(obj);
            j14 = j16;
            charSequence = charSequence3;
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                wVar.f201830g.setValue(new w1(charSequence, j14, textClassification2, null));
                Unit unit2 = Unit.INSTANCE;
            } finally {
                bVar.e(null);
            }
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = this.f201809d;
            o13.r.b(obj);
            j14 = j8;
        }
        return s5.w0.a(j14);
    }
}
