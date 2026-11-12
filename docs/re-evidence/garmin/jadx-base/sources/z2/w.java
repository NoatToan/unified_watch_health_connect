package z2;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lz2/w;", "Lz2/q;", "Lt13/g;", "coroutineContext", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lz2/a0;", "selectedTextType", "Lz5/c;", "localeList", "<init>", "(Lt13/g;Landroid/content/Context;Lz2/a0;Lz5/c;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t13.g f201824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f201825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f201826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z5.c f201827d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextClassifier f201829f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z53.b f201828e = z53.c.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p3.c2 f201830g = p3.p0.n(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f201831h = new Object();

    public w(t13.g gVar, Context context, a0 a0Var, z5.c cVar) {
        this.f201824a = gVar;
        this.f201825b = context;
        this.f201826c = a0Var;
        this.f201827d = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object d(w wVar, CharSequence charSequence, long j8, TextClassifier textClassifier, v13.c cVar) {
        r rVar;
        long j14;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        z53.b bVar;
        TextClassification textClassificationClassifyText;
        long j15;
        CharSequence charSequence3;
        z53.b bVar2 = wVar.f201828e;
        p3.c2 c2Var = wVar.f201830g;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f201757g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f201757g = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(wVar, cVar);
            }
        } else {
            rVar = new r(wVar, cVar);
        }
        Object obj = rVar.f201755e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f201757g;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                rVar.f201751a = charSequence;
                rVar.f201752b = textClassifier;
                rVar.f201753c = bVar2;
                j14 = j8;
                rVar.f201754d = j14;
                rVar.f201757g = 1;
                if (bVar2.c(rVar) != aVar) {
                    charSequence2 = charSequence;
                    textClassifier2 = textClassifier;
                    bVar = bVar2;
                }
                return aVar;
            }
            if (i15 == 1) {
                j14 = rVar.f201754d;
                bVar = rVar.f201753c;
                textClassifier2 = (TextClassifier) rVar.f201752b;
                charSequence2 = rVar.f201751a;
                o13.r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j15 = rVar.f201754d;
                bVar2 = rVar.f201753c;
                textClassificationClassifyText = (TextClassification) rVar.f201752b;
                charSequence3 = rVar.f201751a;
                o13.r.b(obj);
            }
            try {
                c2Var.setValue(new w1(charSequence3, j15, textClassificationClassifyText, null));
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
            } finally {
                bVar2.e(null);
            }
            w1 w1Var = (w1) c2Var.getF182175a();
            if (w1Var != null) {
                y3 y3Var = x.f201839a;
                if (s5.w0.d(j14, w1Var.f201837b) && p005kotlin.jvm.internal.s.g(charSequence2, w1Var.f201836a)) {
                    Unit unit2 = Unit.INSTANCE;
                    bVar.e(null);
                    return unit2;
                }
            }
            Unit unit3 = Unit.INSTANCE;
            bVar.e(null);
            textClassificationClassifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, s5.w0.h(j14), s5.w0.g(j14)).setDefaultLocales(wVar.e()).build());
            rVar.f201751a = charSequence2;
            rVar.f201752b = textClassificationClassifyText;
            rVar.f201753c = bVar2;
            rVar.f201754d = j14;
            rVar.f201757g = 2;
            if (bVar2.c(rVar) != aVar) {
                j15 = j14;
                charSequence3 = charSequence2;
                c2Var.setValue(new w1(charSequence3, j15, textClassificationClassifyText, null));
                Unit unit4 = Unit.INSTANCE;
                return Unit.INSTANCE;
            }
            return aVar;
        } catch (Throwable th3) {
            bVar.e(null);
            throw th3;
        }
    }

    @Override // z2.q
    public final Object a(CharSequence charSequence, long j8, v13.i iVar) throws Throwable {
        Object objE0;
        if (charSequence.length() == 0 || s5.w0.e(j8)) {
            objE0 = Unit.INSTANCE;
        } else {
            objE0 = ge1.b.e0(this.f201824a, new t(this, new s(this, charSequence, j8, null), null), iVar);
        }
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Override // z2.q
    public final Object b(CharSequence charSequence, long j8, v13.i iVar) throws Throwable {
        Object objE0;
        if (charSequence.length() == 0 || s5.w0.e(j8)) {
            objE0 = Unit.INSTANCE;
        } else {
            objE0 = ge1.b.e0(this.f201824a, new t(this, new s(this, charSequence, j8, null), null), iVar);
        }
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Override // z2.q
    public final Object c(CharSequence charSequence, long j8, v13.i iVar) {
        if (charSequence.length() == 0 || s5.w0.e(j8)) {
            return null;
        }
        return ge1.b.e0(this.f201824a, new t(this, new v(charSequence, j8, this, null), null), iVar);
    }

    public final LocaleList e() {
        z5.c cVar = this.f201827d;
        if (cVar == null) {
            z5.b.f202439b.getClass();
            return new LocaleList(z5.b.a.a().f202440a);
        }
        x1.f201844a.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
        Iterator<z5.b> it = cVar.f202443a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f202440a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
