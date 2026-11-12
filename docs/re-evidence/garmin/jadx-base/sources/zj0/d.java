package zj0;

import android.content.Context;
import c80.q;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import e23.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.p2;
import v13.i;
import vb.h;
import we0.f;
import zd0.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.feedback.GCPlusFeedbackViewModel$createSubscriptionConfig$1", f = "GCPlusFeedbackViewModel.kt", l = {31}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p2 f204896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p2 f204897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f204898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f204899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f204900e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(sj0.a.a((q) t7)), Integer.valueOf(sj0.a.a((q) t14)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Context context, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f204899d = eVar;
        this.f204900e = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f204899d, this.f204900e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [r53.z1] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        g3 g3VarA;
        ?? r14;
        Object objM;
        p2 p2Var;
        Context context;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        ?? r15 = this.f204898c;
        e eVar = this.f204899d;
        try {
            if (r15 == 0) {
                r.b(obj);
                p2 p2Var2 = eVar.f204903c;
                u uVar = eVar.f204902b;
                this.f204896a = p2Var2;
                this.f204897b = p2Var2;
                this.f204898c = 1;
                objM = uVar.m(this);
                if (objM == aVar) {
                    return aVar;
                }
                p2Var = p2Var2;
            } else {
                if (r15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p2 p2Var3 = this.f204897b;
                p2 p2Var4 = this.f204896a;
                r.b(obj);
                objM = obj;
                p2Var = p2Var3;
            }
            List listN0 = h0.N0((List) objM, new a());
            ArrayList arrayList = new ArrayList();
            Iterator it = listN0.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                context = this.f204900e;
                if (!zHasNext) {
                    break;
                }
                we0.a aVarB = sj0.a.b((q) it.next(), context);
                if (aVarB != null) {
                    arrayList.add(aVarB);
                }
            }
            String string = context.getString(R.string.which_garmin_connect_plus_feature_you_found_valuable);
            string.getClass();
            we0.c cVar = we0.c.AT_MOST_ONE;
            String string2 = context.getString(R.string.are_there_any_other_features_you_like_to_see_in_future);
            string2.getClass();
            String string3 = context.getString(R.string.please_specify_sentence_case);
            string3.getClass();
            we0.b bVar = new we0.b(string, arrayList, cVar, new f(string2, string3, 0, 4, null));
            int i14 = eVar.f204901a ? R.string.lbl_thank_you_for_sharing : R.string.provide_more_feedback_in_garmin_connect_plus_settings;
            xe0.a aVar2 = xe0.a.GCPlus;
            String string4 = context.getString(R.string.garmin_connect_plus_feedback);
            string4.getClass();
            String string5 = context.getString(R.string.how_would_you_rate_garmin_connect_plus_subscription);
            string5.getClass();
            String string6 = context.getString(R.string.lbl_additional_feedback);
            string6.getClass();
            String string7 = context.getString(R.string.add_feedback);
            string7.getClass();
            we0.d dVar = new we0.d(aVar2, string4, string5, new f(string6, string7, 0, 4, null), bVar, i14);
            g3.f35298f.getClass();
            g3VarA = g3.a.d(dVar);
            r14 = p2Var;
        } catch (Exception unused) {
            g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
            r14 = r15;
        }
        r14.setValue(g3VarA);
        return Unit.INSTANCE;
    }
}
