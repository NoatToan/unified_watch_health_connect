package qm0;

import am.c2;
import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class g extends p005kotlin.jvm.internal.q implements e23.l<v, Unit> {
    public g(Object obj) {
        super(1, obj, d.class, "onCommentChanged", "onCommentChanged(Lcom/garmin/android/apps/connectmobile/group/details/feed/CommentChangeEvent;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(v vVar) {
        v vVar2 = vVar;
        vVar2.getClass();
        d dVar = (d) this.receiver;
        d.a aVar = d.E;
        dVar.getClass();
        String str = vVar2.f145564a;
        c2 c2Var = vVar2.f145565b;
        if (str == null || str.length() == 0) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "BaseGroupPostFragment", "Commend resource id is null or empty");
        } else {
            p pVarD7 = dVar.d7();
            int i14 = c2Var == null ? -1 : d.b.f145497b[c2Var.ordinal()];
            if (i14 == 1) {
                Context contextRequireContext = dVar.requireContext();
                contextRequireContext.getClass();
                pVarD7.D4(contextRequireContext, str, x.b.ACTIVITY_FEED);
            } else if (i14 != 2) {
                String str2 = "Unsupported resourceType: " + c2Var + ", resourceId: " + str;
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "BaseGroupPostFragment", str2);
            } else {
                Context contextRequireContext2 = dVar.requireContext();
                contextRequireContext2.getClass();
                pVarD7.D4(contextRequireContext2, str, x.b.POST_FEED);
            }
        }
        return Unit.INSTANCE;
    }
}
