package mz1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.v2;
import java.security.InvalidParameterException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$onAddToCalendarClicked$1", f = "AddTIEventViewModel.kt", l = {1792, 1803, 1805}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f121952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f121953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f121954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f121956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(AddTIEventViewModel addTIEventViewModel, Context context, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f121955d = addTIEventViewModel;
        this.f121956e = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w wVar = new w(this.f121955d, this.f121956e, dVar);
        wVar.f121954c = obj;
        return wVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d A[PHI: r0
      0x009d: PHI (r0v12 com.garmin.android.apps.connectmobile.v2) = (r0v4 com.garmin.android.apps.connectmobile.v2), (r0v17 com.garmin.android.apps.connectmobile.v2) binds: [B:28:0x009a, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:45:0x013a  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
    
        if (com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel.X4(r7, r14.f121956e, r15, r14) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 aVar;
        v2.b bVar;
        v2.b bVar2;
        o53.b0 b0Var = (o53.b0) this.f121954c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121953b;
        AddTIEventViewModel addTIEventViewModel = this.f121955d;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                aVar = this.f121952a;
                o13.r.b(obj);
                String[] strArr = AddTIEventViewModel.V2;
                if (addTIEventViewModel.a6().d() != null) {
                    bVar2 = (v2.b) aVar;
                    if (((fg0.k) bVar2.f47386a).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != null) {
                        fg0.k kVar = (fg0.k) bVar2.f47386a;
                        this.f121954c = null;
                        this.f121952a = null;
                        this.f121953b = 3;
                    } else {
                        bVar = (v2.b) aVar;
                        if (((fg0.k) bVar.f47386a).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != null) {
                            ((androidx.lifecycle.y0) addTIEventViewModel.G1.getValue()).j(g3.a.e(g3.f35298f));
                            addTIEventViewModel.w5().j(g3.a.d(bVar.f47386a));
                        }
                    }
                } else {
                    bVar = (v2.b) aVar;
                    if (((fg0.k) bVar.f47386a).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != null) {
                        ((androidx.lifecycle.y0) addTIEventViewModel.G1.getValue()).j(g3.a.e(g3.f35298f));
                        addTIEventViewModel.w5().j(g3.a.d(bVar.f47386a));
                    }
                }
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        String[] strArr2 = AddTIEventViewModel.V2;
        addTIEventViewModel.w5().j(g3.a.c(g3.f35298f));
        ((androidx.lifecycle.y0) addTIEventViewModel.S1.getValue()).m(Boolean.FALSE);
        fg0.k kVar2 = addTIEventViewModel.f46435s2;
        if (kVar2 == null) {
            p005kotlin.jvm.internal.s.m("eventDTO");
            throw null;
        }
        if (kVar2.getDate() == null) {
            aVar = new v2.a(new InvalidParameterException("Invalid EventDTO"), null, null, 6, null);
            if (aVar instanceof v2.b) {
                this.f121954c = null;
                this.f121952a = (v2.b) aVar;
                this.f121953b = 2;
                if (addTIEventViewModel.Z5(this) != aVar2) {
                    String[] strArr3 = AddTIEventViewModel.V2;
                    if (addTIEventViewModel.a6().d() != null) {
                        bVar2 = (v2.b) aVar;
                        if (((fg0.k) bVar2.f47386a).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != null) {
                            fg0.k kVar3 = (fg0.k) bVar2.f47386a;
                            this.f121954c = null;
                            this.f121952a = null;
                            this.f121953b = 3;
                        } else {
                            bVar = (v2.b) aVar;
                            if (((fg0.k) bVar.f47386a).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != null) {
                                ((androidx.lifecycle.y0) addTIEventViewModel.G1.getValue()).j(g3.a.e(g3.f35298f));
                                addTIEventViewModel.w5().j(g3.a.d(bVar.f47386a));
                            }
                        }
                    } else {
                        bVar = (v2.b) aVar;
                        if (((fg0.k) bVar.f47386a).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != null) {
                            ((androidx.lifecycle.y0) addTIEventViewModel.G1.getValue()).j(g3.a.e(g3.f35298f));
                            addTIEventViewModel.w5().j(g3.a.d(bVar.f47386a));
                        }
                    }
                }
            } else {
                if (aVar instanceof v2.a) {
                    lc.u0.r();
                    return null;
                }
                String string = ((v2.a) aVar).f47383a.toString();
                p92.y.f136664a.getClass();
                p92.y.a.c("AddTIEventViewModel", string);
                String[] strArr4 = AddTIEventViewModel.V2;
                addTIEventViewModel.w5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                androidx.lifecycle.y0 y0Var = (androidx.lifecycle.y0) addTIEventViewModel.S1.getValue();
                Boolean bool = Boolean.TRUE;
                y0Var.m(bool);
                ((androidx.lifecycle.y0) addTIEventViewModel.T1.getValue()).m(bool);
            }
            return Unit.INSTANCE;
        }
        zf0.d dVar = addTIEventViewModel.f204384a;
        fg0.k kVar4 = addTIEventViewModel.f46435s2;
        if (kVar4 == null) {
            p005kotlin.jvm.internal.s.m("eventDTO");
            throw null;
        }
        this.f121954c = b0Var;
        this.f121953b = 1;
        dVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.e(dVar, kVar4, null), this);
        return aVar2;
        aVar = (v2) obj;
        if (aVar instanceof v2.b) {
            this.f121954c = null;
            this.f121952a = (v2.b) aVar;
            this.f121953b = 2;
            if (addTIEventViewModel.Z5(this) != aVar2) {
                String[] strArr5 = AddTIEventViewModel.V2;
                if (addTIEventViewModel.a6().d() != null) {
                    bVar2 = (v2.b) aVar;
                    if (((fg0.k) bVar2.f47386a).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != null) {
                        fg0.k kVar5 = (fg0.k) bVar2.f47386a;
                        this.f121954c = null;
                        this.f121952a = null;
                        this.f121953b = 3;
                    } else {
                        bVar = (v2.b) aVar;
                        if (((fg0.k) bVar.f47386a).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != null) {
                            ((androidx.lifecycle.y0) addTIEventViewModel.G1.getValue()).j(g3.a.e(g3.f35298f));
                            addTIEventViewModel.w5().j(g3.a.d(bVar.f47386a));
                        }
                    }
                } else {
                    bVar = (v2.b) aVar;
                    if (((fg0.k) bVar.f47386a).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != null) {
                        ((androidx.lifecycle.y0) addTIEventViewModel.G1.getValue()).j(g3.a.e(g3.f35298f));
                        addTIEventViewModel.w5().j(g3.a.d(bVar.f47386a));
                    }
                }
            }
            return aVar2;
        }
        if (aVar instanceof v2.a) {
            lc.u0.r();
            return null;
        }
        String string2 = ((v2.a) aVar).f47383a.toString();
        p92.y.f136664a.getClass();
        p92.y.a.c("AddTIEventViewModel", string2);
        String[] strArr6 = AddTIEventViewModel.V2;
        addTIEventViewModel.w5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        androidx.lifecycle.y0 y0Var2 = (androidx.lifecycle.y0) addTIEventViewModel.S1.getValue();
        Boolean bool2 = Boolean.TRUE;
        y0Var2.m(bool2);
        ((androidx.lifecycle.y0) addTIEventViewModel.T1.getValue()).m(bool2);
        return Unit.INSTANCE;
    }
}
