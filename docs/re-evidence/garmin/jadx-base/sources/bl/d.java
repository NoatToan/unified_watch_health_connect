package bl;

import android.content.Context;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import e23.p;
import java.util.LinkedHashSet;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lwc2/a;", "", "<anonymous>", "(Lo53/b0;)Lwc2/a;"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.analytics.gcs.GcsAnalyticsService$postEvents$2", f = "GcsAnalyticsService.kt", l = {163}, m = "invokeSuspend")
public final class d extends i implements p<b0, t13.d<? super wc2.a<? extends String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedHashSet f18573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f18575c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f18575c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f18575c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super wc2.a<? extends String>> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        LinkedHashSet linkedHashSet;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18574b;
        b bVar = this.f18575c;
        if (i14 == 0) {
            r.b(obj);
            Context context = bVar.f18555e;
            if (context != null && !hb2.i.a(context)) {
                b.f18549l.warn("Network not available, skipping analytics upload");
                return new wc2.a.C3415a(new NoNetworkException(), null, null, null, 14, null);
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            while (true) {
                dl.a aVarPoll = bVar.f18558h.poll();
                if (aVarPoll == null) {
                    break;
                }
                linkedHashSet2.add(aVarPoll);
            }
            if (linkedHashSet2.isEmpty()) {
                return null;
            }
            cl.b bVarInvoke = bVar.f18552b.invoke(bVar.f18551a);
            List listB1 = h0.b1(linkedHashSet2);
            this.f18573a = linkedHashSet2;
            this.f18574b = 1;
            bVarInvoke.getClass();
            Object objA = md2.a.C2243a.a(bVarInvoke, new cl.c(bVarInvoke, listB1, null), this);
            if (objA == aVar) {
                return aVar;
            }
            linkedHashSet = linkedHashSet2;
            obj = objA;
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashSet = this.f18573a;
            r.b(obj);
        }
        wc2.a aVar2 = (wc2.a) obj;
        if (!(aVar2 instanceof wc2.a.C3415a)) {
            b.f18549l.trace("Posted event: {}", aVar2);
            return aVar2;
        }
        if (bVar.f18554d) {
            bVar.f18558h.addAll(linkedHashSet);
        }
        b.f18549l.warn("An error occurred posting event: " + aVar2 + ". AllowRetry: " + bVar.f18554d);
        return aVar2;
    }
}
