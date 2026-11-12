package cf2;

import c83.a0;
import java.util.Locale;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.promotionlibrary.data.SendCampaignEmailOperation$executeHTTPRequest$2", f = "SendCampaignEmailOperation.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.l<t13.d<? super a0<String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f27081b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, t13.d<? super q> dVar) {
        super(1, dVar);
        this.f27081b = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q(this.f27081b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<String>> dVar) {
        return ((q) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f27080a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        Locale locale = Locale.getDefault();
        s sVar = this.f27081b;
        d dVar = (d) sVar.f27091q.getValue();
        String strValueOf = String.valueOf(sVar.f27088n);
        String strL6 = g.l6(sVar.f27087m);
        String language = locale.getLanguage();
        language.getClass();
        String upperCase = language.toUpperCase(locale);
        upperCase.getClass();
        i0<a0<String>> i0VarA = dVar.a(strValueOf, strL6, upperCase);
        this.f27080a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
