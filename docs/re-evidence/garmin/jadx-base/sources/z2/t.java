package z2;

import android.content.Context;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 273, 282}, m = "invokeSuspend", v = 1)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.a f201788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f201789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f201790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f201791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.p<TextClassifier, t13.d<Object>, Object> f201792e;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1", f = "PlatformSelectionBehaviors.android.kt", l = {283}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f201793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextClassifier f201794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<TextClassifier, t13.d<Object>, Object> f201795c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(TextClassifier textClassifier, e23.p<? super TextClassifier, ? super t13.d<Object>, ? extends Object> pVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f201794b = textClassifier;
            this.f201795c = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f201794b, this.f201795c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<Object> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f201793a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            TextClassifier textClassifier = this.f201794b;
            if (textClassifier == null) {
                return null;
            }
            this.f201793a = 1;
            Object objInvoke = this.f201795c.invoke(textClassifier, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/view/textclassifier/TextClassifier;", "<anonymous>", "(Lo53/b0;)Landroid/view/textclassifier/TextClassifier;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1", f = "PlatformSelectionBehaviors.android.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super TextClassifier>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w f201796a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w wVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f201796a = wVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f201796a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super TextClassifier> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            x1 x1Var = x1.f201844a;
            w wVar = this.f201796a;
            Context context = wVar.f201825b;
            a0 a0Var = wVar.f201826c;
            x1Var.getClass();
            TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
            int i14 = x1.a.f201845a[a0Var.ordinal()];
            if (i14 == 1) {
                str = "edittext";
            } else {
                if (i14 != 2) {
                    lc.u0.r();
                    return null;
                }
                str = "textview";
            }
            TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
            wVar.f201829f = textClassifierCreateTextClassificationSession;
            return textClassifierCreateTextClassificationSession;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(w wVar, e23.p<? super TextClassifier, ? super t13.d<Object>, ? extends Object> pVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f201791d = wVar;
        this.f201792e = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f201791d, this.f201792e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<Object> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0084 A[RETURN] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        w wVar;
        z53.a aVar;
        z53.a aVar2;
        Throwable th3;
        TextClassifier textClassifier;
        Object objC;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201790c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                wVar = this.f201791d;
                aVar = wVar.f201828e;
                this.f201788a = aVar;
                this.f201789b = wVar;
                this.f201790c = 1;
                if (aVar.c(this) != aVar3) {
                }
                return aVar3;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = this.f201788a;
                try {
                    o13.r.b(obj);
                    textClassifier = (TextClassifier) obj;
                    aVar = aVar2;
                    aVar.e(null);
                    a aVar4 = new a(textClassifier, this.f201792e, null);
                    this.f201788a = null;
                    this.f201789b = null;
                    this.f201790c = 3;
                    objC = o53.j2.c(200L, aVar4, this);
                    if (objC == aVar3) {
                        return aVar3;
                    }
                    return objC;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            wVar = this.f201789b;
            z53.a aVar5 = this.f201788a;
            o13.r.b(obj);
            aVar = aVar5;
            textClassifier = wVar.f201829f;
            if (textClassifier == null || textClassifier.isDestroyed()) {
                b bVar = new b(wVar, null);
                this.f201788a = aVar;
                this.f201789b = null;
                this.f201790c = 2;
                Object objC2 = o53.j2.c(300L, bVar, this);
                if (objC2 != aVar3) {
                    aVar2 = aVar;
                    obj = objC2;
                    textClassifier = (TextClassifier) obj;
                    aVar = aVar2;
                    aVar.e(null);
                    a aVar6 = new a(textClassifier, this.f201792e, null);
                    this.f201788a = null;
                    this.f201789b = null;
                    this.f201790c = 3;
                    objC = o53.j2.c(200L, aVar6, this);
                    if (objC == aVar3) {
                        return objC;
                    }
                }
            } else {
                aVar.e(null);
                a aVar7 = new a(textClassifier, this.f201792e, null);
                this.f201788a = null;
                this.f201789b = null;
                this.f201790c = 3;
                objC = o53.j2.c(200L, aVar7, this);
                if (objC == aVar3) {
                    return objC;
                }
            }
            return aVar3;
        } catch (Throwable th5) {
            aVar2 = aVar;
            th3 = th5;
            aVar2.e(null);
            throw th3;
        }
    }
}
