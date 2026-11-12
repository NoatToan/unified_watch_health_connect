package qm0;

import android.content.Context;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.BaseGroupFeedViewModel$refreshPostItem$1", f = "BaseGroupFeedViewModel.kt", l = {297, 313}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f145548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f145549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f145550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f145551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f145552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f145553f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p pVar, String str, Context context, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f145551d = pVar;
        this.f145552e = str;
        this.f145553f = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f145551d, this.f145552e, this.f145553f, dVar);
        sVar.f145550c = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        if (r1 == r2) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        v2 v2Var;
        Object objA;
        List<Long> listF;
        o53.b0 b0Var = (o53.b0) this.f145550c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f145549b;
        p pVar = this.f145551d;
        if (i14 == 0) {
            o13.r.b(obj);
            pVar.f145531g.j(s51.e.LOADING);
            ym0.a aVar2 = pVar.f145528d;
            String strValueOf = String.valueOf(pVar.f145526b);
            this.f145550c = b0Var;
            this.f145549b = 1;
            aVar2.getClass();
            objJ = f0.J(aVar2, new ym0.f0(aVar2, strValueOf, "GROUP", this.f145552e, null), this);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objJ = obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2.b bVar = this.f145548a;
            o13.r.b(obj);
            v2Var = bVar;
            objA = obj;
        }
        wg0.a aVarZ4 = pVar.z4(this.f145553f, (jo1.e) ((v2.b) v2Var).f47386a, (Map) objA);
        y0<s51.e> y0Var = pVar.f145531g;
        if (aVarZ4 != null) {
            pVar.H4(aVarZ4);
            y0Var.j(s51.e.LOADED);
            return Unit.INSTANCE;
        }
        i2.a aVar3 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar3.getClass();
        i2.a.p(a2Var, "BaseGroupFeedViewModel", "Convert NewsPostDTO to ActivityFeed failed, get null converted feed");
        y0Var.j(s51.e.FAILED);
        return Unit.INSTANCE;
        v2Var = (v2) objJ;
        if (v2Var instanceof v2.a) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Get news post item failed with exception: ");
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.p(a2Var2, "BaseGroupFeedViewModel", strD);
            pVar.f145531g.j(s51.e.FAILED);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            v2.b bVar2 = (v2.b) v2Var;
            jo1.e eVar = (jo1.e) bVar2.f47386a;
            String strValueOf2 = String.valueOf(eVar.getUserProfilePk());
            mo1.d conversationDTO = eVar.getConversationDTO();
            String ownerProfilePk = conversationDTO != null ? conversationDTO.getOwnerProfilePk() : null;
            mo1.e highlightedCommentDTO = eVar.getHighlightedCommentDTO();
            ArrayList arrayListM = p13.x.m(strValueOf2, ownerProfilePk, highlightedCommentDTO != null ? String.valueOf(highlightedCommentDTO.getUserProfilePk()) : null);
            mo1.g conversationLikersDTO = eVar.getConversationLikersDTO();
            if (conversationLikersDTO != null && (listF = conversationLikersDTO.f()) != null) {
                ArrayList arrayList = new ArrayList(p13.y.r(listF, 10));
                Iterator<T> it = listF.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((Number) it.next()).longValue()));
                }
                arrayListM.addAll(arrayList);
            }
            ArrayList arrayListZ = h0.Z(arrayListM);
            a22.i iVar = pVar.f145530f;
            this.f145550c = b0Var;
            this.f145548a = bVar2;
            this.f145549b = 2;
            a22.i.a aVar5 = a22.i.f537b;
            objA = iVar.a(arrayListZ, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, this);
        }
        return Unit.INSTANCE;
    }
}
