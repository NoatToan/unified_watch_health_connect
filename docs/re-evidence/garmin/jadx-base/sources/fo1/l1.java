package fo1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$likeOrUnlikeComment$1", f = "ConversationViewModel.kt", l = {399, GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE}, m = "invokeSuspend", v = 2)
public final class l1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f72621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f72622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f72623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f72624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(boolean z14, o0 o0Var, String str, Context context, t13.d<? super l1> dVar) {
        super(2, dVar);
        this.f72621b = z14;
        this.f72622c = o0Var;
        this.f72623d = str;
        this.f72624e = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l1(this.f72621b, this.f72622c, this.f72623d, this.f72624e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r10 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r10 == r0) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        ConversationCommentDTO conversationCommentDTO;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72620a;
        Object objB = null;
        String str = this.f72623d;
        o0 o0Var = this.f72622c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f72621b) {
                f fVar = o0Var.f72674v;
                this.f72620a = 1;
                fVar.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(fVar, new a0(fVar, str, null), this);
            } else {
                f fVar2 = o0Var.f72674v;
                this.f72620a = 2;
                fVar2.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(fVar2, new u(fVar2, str, null), this);
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            v2Var = (v2) obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            v2Var = (v2) obj;
        }
        boolean z14 = v2Var instanceof v2.b;
        Context context = this.f72624e;
        int i15 = 0;
        if (z14) {
            for (Object obj2 : o0Var.f72673t) {
                ConversationCommentDTO conversationCommentDTO2 = ((go1.w) obj2).f78313c;
                if (p005kotlin.jvm.internal.s.g(conversationCommentDTO2 != null ? conversationCommentDTO2.f44546a : null, str)) {
                    objB = obj2;
                    break;
                }
            }
            go1.w wVar = (go1.w) objB;
            if (wVar != null && (conversationCommentDTO = wVar.f78313c) != null) {
                if (conversationCommentDTO.f44556k) {
                    conversationCommentDTO.f44556k = false;
                    conversationCommentDTO.f44557l--;
                } else {
                    conversationCommentDTO.f44556k = true;
                    conversationCommentDTO.f44557l++;
                }
                o0Var.K4(context, str, conversationCommentDTO);
            }
            o0Var.C = true;
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            androidx.lifecycle.y0<lj0.b> y0Var = o0Var.f72666l;
            ArrayList arrayList = o0Var.f72673t;
            v2.a aVar2 = (v2.a) v2Var;
            Integer num = aVar2.f47384b;
            y0Var.j(new lj0.b(num != null ? num.intValue() : 0, aVar2.f47385c));
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i15 = -1;
                    break;
                }
                ConversationCommentDTO conversationCommentDTO3 = ((go1.w) it.next()).f78313c;
                if (p005kotlin.jvm.internal.s.g(conversationCommentDTO3 != null ? conversationCommentDTO3.f44546a : null, str)) {
                    break;
                }
                i15++;
            }
            if (i15 >= 0) {
                ConversationCommentDTO conversationCommentDTO4 = ((go1.w) arrayList.get(i15)).f78313c;
                objB = conversationCommentDTO4 != null ? m0.b(conversationCommentDTO4, context, o0Var.f72660g) : null;
                if (objB != null) {
                    arrayList.set(i15, objB);
                    o0Var.f72669o.j(new o13.p<>(objB, new Integer(i15)));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
