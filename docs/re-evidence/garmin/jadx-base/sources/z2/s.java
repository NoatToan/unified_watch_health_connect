package z2;

import android.view.textclassifier.TextClassifier;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroid/view/textclassifier/TextClassifier;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2", f = "PlatformSelectionBehaviors.android.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", v = 1)
public final class s extends v13.i implements e23.p<TextClassifier, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f201778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f201779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CharSequence f201780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f201781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, CharSequence charSequence, long j8, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f201779c = wVar;
        this.f201780d = charSequence;
        this.f201781e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f201779c, this.f201780d, this.f201781e, dVar);
        sVar.f201778b = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(TextClassifier textClassifier, t13.d<? super Unit> dVar) {
        return ((s) create(textClassifier, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201777a;
        if (i14 == 0) {
            o13.r.b(obj);
            TextClassifier textClassifier = (TextClassifier) this.f201778b;
            this.f201777a = 1;
            if (w.d(this.f201779c, this.f201780d, this.f201781e, textClassifier, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
