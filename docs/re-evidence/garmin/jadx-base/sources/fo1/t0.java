package fo1;

import android.content.Context;
import android.text.Editable;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$baseAddComment$1", f = "ConversationViewModel.kt", l = {1080, 1086, 1090, 1103, 1114}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.p<androidx.lifecycle.t0<g3<? extends ConversationCommentDTO>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConversationCommentDTO f72771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConversationCommentDTO f72772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f72773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o0 f72774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f72775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f72776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o0 f72777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f72778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.p<ConversationCommentDTO, t13.d<? super v2<? extends ConversationCommentDTO>>, Object> f72779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Editable f72780j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t0(o0 o0Var, Context context, e23.p<? super ConversationCommentDTO, ? super t13.d<? super v2<? extends ConversationCommentDTO>>, ? extends Object> pVar, Editable editable, t13.d<? super t0> dVar) {
        super(2, dVar);
        this.f72777g = o0Var;
        this.f72778h = context;
        this.f72779i = pVar;
        this.f72780j = editable;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t0 t0Var = new t0(this.f72777g, this.f72778h, this.f72779i, this.f72780j, dVar);
        t0Var.f72776f = obj;
        return t0Var;
    }

    @Override // e23.p
    public final Object invoke(androidx.lifecycle.t0<g3<? extends ConversationCommentDTO>> t0Var, t13.d<? super Unit> dVar) {
        return ((t0) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0155  */
    /* JADX WARN: Code duplicated, block: B:37:0x0161  */
    /* JADX WARN: Code duplicated, block: B:39:0x0165  */
    /* JADX WARN: Code duplicated, block: B:44:0x018f  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f9  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0189, code lost:
    
        if (r1.emit(r3, r24) == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f3, code lost:
    
        if (r1.emit(r3, r24) == r2) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ConversationCommentDTO conversationCommentDTO;
        String str;
        ConversationCommentDTO conversationCommentDTO2;
        Object objE0;
        String str2;
        o0 o0Var;
        Object objInvoke;
        ConversationCommentDTO conversationCommentDTO3;
        ConversationCommentDTO conversationCommentDTO4;
        v2 v2Var;
        v2 v2Var2;
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) this.f72776f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72775e;
        Context context = this.f72778h;
        o0 o0Var2 = this.f72777g;
        if (i14 == 0) {
            o13.r.b(obj);
            ConversationCommentDTO conversationCommentDTO5 = new ConversationCommentDTO();
            Editable editable = this.f72780j;
            conversationCommentDTO5.f44555j = editable.toString();
            conversationCommentDTO5.f44562q = cs1.h.b(editable);
            boolean z14 = o0Var2.f72664k;
            ArrayList arrayList = o0Var2.f72673t;
            String strValueOf = z14 ? String.valueOf(arrayList.size() - 2) : String.valueOf(arrayList.size() - 1);
            ConversationCommentDTO conversationCommentDTO6 = new ConversationCommentDTO();
            conversationCommentDTO6.f44555j = conversationCommentDTO5.f44555j;
            List<mo1.a> list = conversationCommentDTO6.f44562q;
            List<mo1.a> list2 = conversationCommentDTO5.f44562q;
            list2.getClass();
            list.addAll(list2);
            conversationCommentDTO6.f44546a = strValueOf;
            conversationCommentDTO6.f44560o = true;
            conversationCommentDTO6.f44550e = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
            conversationCommentDTO6.f44551f = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName();
            f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
            String strZ4 = lVar.z4("PREMIUM_FRIEND");
            if (strZ4 == null) {
                strZ4 = lVar.q4();
            }
            conversationCommentDTO6.f44552g = strZ4;
            conversationCommentDTO6.f44561p = new b12.b(strZ4, null, null, null, null, 30, null);
            arrayList.add(m0.b(conversationCommentDTO6, context, o0Var2.f72660g));
            String str3 = conversationCommentDTO6.f44546a;
            g3.f35298f.getClass();
            g3 g3VarD = g3.a.d(conversationCommentDTO6);
            this.f72776f = t0Var;
            this.f72771a = conversationCommentDTO5;
            this.f72772b = conversationCommentDTO6;
            this.f72773c = str3;
            this.f72775e = 1;
            if (t0Var.emit(g3VarD, this) != aVar) {
                conversationCommentDTO = conversationCommentDTO5;
                str = str3;
                conversationCommentDTO2 = conversationCommentDTO6;
            }
            return aVar;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 == 3) {
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i14 == 4) {
                    str = this.f72773c;
                    ConversationCommentDTO conversationCommentDTO7 = this.f72772b;
                    o13.r.b(obj);
                    objInvoke = obj;
                    conversationCommentDTO3 = conversationCommentDTO7;
                    v2Var2 = (v2) objInvoke;
                    if (v2Var2 instanceof v2.b) {
                        ConversationCommentDTO conversationCommentDTO8 = (ConversationCommentDTO) ((v2.b) v2Var2).f47386a;
                        str.getClass();
                        int i15 = o0.H0;
                        o0Var2.K4(context, str, conversationCommentDTO8);
                        o0Var2.A = true;
                        int i16 = o0Var2.B;
                        o0Var2.B = i16 + 1;
                        o72.t.k(i16);
                    } else {
                        if (v2Var2 instanceof v2.a) {
                            lc.u0.r();
                            return null;
                        }
                        v2.a aVar2 = (v2.a) v2Var2;
                        g3 g3VarA = g3.a.a(g3.f35298f, null, aVar2.f47383a, conversationCommentDTO3, aVar2.f47384b, 1);
                        this.f72776f = null;
                        this.f72771a = null;
                        this.f72772b = null;
                        this.f72773c = null;
                        this.f72774d = null;
                        this.f72775e = 5;
                    }
                } else {
                    if (i14 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o0Var = this.f72774d;
            str2 = this.f72773c;
            conversationCommentDTO2 = this.f72772b;
            conversationCommentDTO = this.f72771a;
            o13.r.b(obj);
            objE0 = obj;
            conversationCommentDTO4 = conversationCommentDTO2;
            v2Var = (v2) objE0;
            if (v2Var instanceof v2.b) {
                o0Var.f72676x = (mo1.d) ((v2.b) v2Var).f47386a;
                str = str2;
                conversationCommentDTO2 = conversationCommentDTO4;
                this.f72776f = t0Var;
                this.f72771a = null;
                this.f72772b = conversationCommentDTO2;
                this.f72773c = str;
                this.f72774d = null;
                this.f72775e = 4;
                objInvoke = this.f72779i.invoke(conversationCommentDTO, this);
                if (objInvoke != aVar) {
                    conversationCommentDTO3 = conversationCommentDTO2;
                    v2Var2 = (v2) objInvoke;
                    if (v2Var2 instanceof v2.b) {
                        ConversationCommentDTO conversationCommentDTO9 = (ConversationCommentDTO) ((v2.b) v2Var2).f47386a;
                        str.getClass();
                        int i17 = o0.H0;
                        o0Var2.K4(context, str, conversationCommentDTO9);
                        o0Var2.A = true;
                        int i18 = o0Var2.B;
                        o0Var2.B = i18 + 1;
                        o72.t.k(i18);
                    } else {
                        if (v2Var2 instanceof v2.a) {
                            lc.u0.r();
                            return null;
                        }
                        v2.a aVar3 = (v2.a) v2Var2;
                        g3 g3VarA2 = g3.a.a(g3.f35298f, null, aVar3.f47383a, conversationCommentDTO3, aVar3.f47384b, 1);
                        this.f72776f = null;
                        this.f72771a = null;
                        this.f72772b = null;
                        this.f72773c = null;
                        this.f72774d = null;
                        this.f72775e = 5;
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (v2Var instanceof v2.a) {
                    lc.u0.r();
                    return null;
                }
                v2.a aVar4 = (v2.a) v2Var;
                g3 g3VarA3 = g3.a.a(g3.f35298f, null, aVar4.f47383a, conversationCommentDTO4, aVar4.f47384b, 1);
                this.f72776f = null;
                this.f72771a = null;
                this.f72772b = null;
                this.f72773c = null;
                this.f72774d = null;
                this.f72775e = 3;
            }
            return aVar;
        }
        str = this.f72773c;
        conversationCommentDTO2 = this.f72772b;
        conversationCommentDTO = this.f72771a;
        o13.r.b(obj);
        if (o0Var2.f72676x == null) {
            i2.a aVar5 = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var, "ConversationViewModel", "addComment: Conversation has not been created. Request to create conversation.");
            am.c2 c2Var = o0Var2.f72656c;
            String str4 = o0Var2.f72657d;
            this.f72776f = t0Var;
            this.f72771a = conversationCommentDTO;
            this.f72772b = conversationCommentDTO2;
            this.f72773c = str;
            this.f72774d = o0Var2;
            this.f72775e = 2;
            x53.c cVar = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new p1(c2Var, str4, o0Var2, null), this);
            if (objE0 != aVar) {
                str2 = str;
                o0Var = o0Var2;
                conversationCommentDTO4 = conversationCommentDTO2;
                v2Var = (v2) objE0;
                if (v2Var instanceof v2.b) {
                    o0Var.f72676x = (mo1.d) ((v2.b) v2Var).f47386a;
                    str = str2;
                    conversationCommentDTO2 = conversationCommentDTO4;
                    this.f72776f = t0Var;
                    this.f72771a = null;
                    this.f72772b = conversationCommentDTO2;
                    this.f72773c = str;
                    this.f72774d = null;
                    this.f72775e = 4;
                    objInvoke = this.f72779i.invoke(conversationCommentDTO, this);
                    if (objInvoke != aVar) {
                        conversationCommentDTO3 = conversationCommentDTO2;
                        v2Var2 = (v2) objInvoke;
                        if (v2Var2 instanceof v2.b) {
                            ConversationCommentDTO conversationCommentDTO10 = (ConversationCommentDTO) ((v2.b) v2Var2).f47386a;
                            str.getClass();
                            int i19 = o0.H0;
                            o0Var2.K4(context, str, conversationCommentDTO10);
                            o0Var2.A = true;
                            int i110 = o0Var2.B;
                            o0Var2.B = i110 + 1;
                            o72.t.k(i110);
                        } else {
                            if (v2Var2 instanceof v2.a) {
                                lc.u0.r();
                                return null;
                            }
                            v2.a aVar6 = (v2.a) v2Var2;
                            g3 g3VarA4 = g3.a.a(g3.f35298f, null, aVar6.f47383a, conversationCommentDTO3, aVar6.f47384b, 1);
                            this.f72776f = null;
                            this.f72771a = null;
                            this.f72772b = null;
                            this.f72773c = null;
                            this.f72774d = null;
                            this.f72775e = 5;
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        lc.u0.r();
                        return null;
                    }
                    v2.a aVar7 = (v2.a) v2Var;
                    g3 g3VarA5 = g3.a.a(g3.f35298f, null, aVar7.f47383a, conversationCommentDTO4, aVar7.f47384b, 1);
                    this.f72776f = null;
                    this.f72771a = null;
                    this.f72772b = null;
                    this.f72773c = null;
                    this.f72774d = null;
                    this.f72775e = 3;
                }
            }
        } else {
            this.f72776f = t0Var;
            this.f72771a = null;
            this.f72772b = conversationCommentDTO2;
            this.f72773c = str;
            this.f72774d = null;
            this.f72775e = 4;
            objInvoke = this.f72779i.invoke(conversationCommentDTO, this);
            if (objInvoke != aVar) {
                conversationCommentDTO3 = conversationCommentDTO2;
                v2Var2 = (v2) objInvoke;
                if (v2Var2 instanceof v2.b) {
                    ConversationCommentDTO conversationCommentDTO11 = (ConversationCommentDTO) ((v2.b) v2Var2).f47386a;
                    str.getClass();
                    int i111 = o0.H0;
                    o0Var2.K4(context, str, conversationCommentDTO11);
                    o0Var2.A = true;
                    int i112 = o0Var2.B;
                    o0Var2.B = i112 + 1;
                    o72.t.k(i112);
                } else {
                    if (v2Var2 instanceof v2.a) {
                        lc.u0.r();
                        return null;
                    }
                    v2.a aVar8 = (v2.a) v2Var2;
                    g3 g3VarA6 = g3.a.a(g3.f35298f, null, aVar8.f47383a, conversationCommentDTO3, aVar8.f47384b, 1);
                    this.f72776f = null;
                    this.f72771a = null;
                    this.f72772b = null;
                    this.f72773c = null;
                    this.f72774d = null;
                    this.f72775e = 5;
                }
                return Unit.INSTANCE;
            }
        }
        return aVar;
    }
}
