package fo1;

import android.content.Context;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.social.conversation.exception.InvalidResourceIdException;
import com.garmin.android.apps.connectmobile.social.conversation.exception.InvalidResourceTypeException;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$baseFetchComments$1", f = "ConversationViewModel.kt", l = {922, 927, 932, 936, 940, 952, 957, 960}, m = "invokeSuspend", v = 2)
public final class u0 extends v13.i implements e23.p<androidx.lifecycle.t0<g3<? extends List<? extends ConversationCommentDTO>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public am.c2 f72789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f72790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f72792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f72793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0 f72794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f72795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f72796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.r<am.c2, String, Integer, t13.d<? super v2<? extends List<? extends ConversationCommentDTO>>>, Object> f72797i;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$baseFetchComments$1$result$1", f = "ConversationViewModel.kt", l = {952}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends ConversationCommentDTO>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f72798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.r<am.c2, String, Integer, t13.d<? super v2<? extends List<? extends ConversationCommentDTO>>>, Object> f72799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ am.c2 f72800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f72801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f72802e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.r<? super am.c2, ? super String, ? super Integer, ? super t13.d<? super v2<? extends List<? extends ConversationCommentDTO>>>, ? extends Object> rVar, am.c2 c2Var, String str, int i14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f72799b = rVar;
            this.f72800c = c2Var;
            this.f72801d = str;
            this.f72802e = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f72799b, this.f72800c, this.f72801d, this.f72802e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends ConversationCommentDTO>>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f72798a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            Integer num = new Integer(this.f72802e);
            this.f72798a = 1;
            Object objInvoke = this.f72799b.invoke(this.f72800c, this.f72801d, num, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u0(o0 o0Var, Context context, boolean z14, e23.r<? super am.c2, ? super String, ? super Integer, ? super t13.d<? super v2<? extends List<? extends ConversationCommentDTO>>>, ? extends Object> rVar, t13.d<? super u0> dVar) {
        super(2, dVar);
        this.f72794f = o0Var;
        this.f72795g = context;
        this.f72796h = z14;
        this.f72797i = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u0 u0Var = new u0(this.f72794f, this.f72795g, this.f72796h, this.f72797i, dVar);
        u0Var.f72793e = obj;
        return u0Var;
    }

    @Override // e23.p
    public final Object invoke(androidx.lifecycle.t0<g3<? extends List<? extends ConversationCommentDTO>>> t0Var, t13.d<? super Unit> dVar) {
        return ((u0) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0278  */
    /* JADX WARN: Code duplicated, block: B:35:0x00de  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:47:0x0107  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    /* JADX WARN: Code duplicated, block: B:52:0x011c A[PHI: r1 r2
      0x011c: PHI (r1v17 java.lang.String) = (r1v12 java.lang.String), (r1v12 java.lang.String), (r1v24 java.lang.String) binds: [B:48:0x0109, B:50:0x0118, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r2v11 am.c2) = (r2v8 am.c2), (r2v8 am.c2), (r2v13 am.c2) binds: [B:48:0x0109, B:50:0x0118, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:55:0x012c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0154 A[PHI: r1 r2
      0x0154: PHI (r1v25 java.lang.Object) = (r1v22 java.lang.Object), (r1v40 java.lang.Object) binds: [B:57:0x0150, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r2v14 int) = (r2v12 int), (r2v17 int) binds: [B:57:0x0150, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x015a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0162  */
    /* JADX WARN: Code duplicated, block: B:64:0x016b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0178  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x020a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0214  */
    /* JADX WARN: Code duplicated, block: B:90:0x0218  */
    /* JADX WARN: Code duplicated, block: B:95:0x0249  */
    /* JADX WARN: Code duplicated, block: B:97:0x024d  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        if (r6.emit(r0, r31) == r7) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        if (r6.emit(r0, r31) == r7) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0246, code lost:
    
        if (r6.emit(r1, r31) == r7) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0270, code lost:
    
        if (r6.emit(r1, r31) == r7) goto L99;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        am.c2 c2Var;
        String str;
        am.c2 c2Var2;
        Parcelable parcelable;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar;
        Object objB4;
        String str2;
        wg0.a aVar;
        int i14;
        int i15;
        Object objE0;
        v2 v2Var;
        v2.b bVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z14;
        List listC;
        ConversationCommentDTO conversationCommentDTO;
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) this.f72793e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f72792d;
        Context context = this.f72795g;
        boolean z15 = this.f72796h;
        o0 o0Var = this.f72794f;
        switch (i16) {
            case 0:
                o13.r.b(obj);
                boolean z16 = o0Var.f72677y;
                String str3 = o0Var.f72657d;
                c2Var = o0Var.f72656c;
                if (z16) {
                    return Unit.INSTANCE;
                }
                if (c2Var != null) {
                    if (str3 == null) {
                        g3 g3VarA = g3.a.a(g3.f35298f, null, new InvalidResourceIdException(str3), null, null, 13);
                        this.f72793e = null;
                        this.f72789a = null;
                        this.f72790b = null;
                        this.f72791c = 0;
                        this.f72792d = 2;
                    } else {
                        o0Var.f72677y = true;
                        g3 g3VarC = g3.a.c(g3.f35298f);
                        this.f72793e = t0Var;
                        this.f72789a = c2Var;
                        this.f72790b = str3;
                        this.f72792d = 3;
                        if (t0Var.emit(g3VarC, this) != aVar2) {
                            str = str3;
                            if (!o0Var.f72678z) {
                                o0Var.f72678z = false;
                                parcelable = o0Var.f72659f;
                                if (parcelable instanceof com.garmin.android.apps.connectmobile.activities.newmodel.h) {
                                    hVar = (com.garmin.android.apps.connectmobile.activities.newmodel.h) parcelable;
                                } else {
                                    hVar = null;
                                }
                                this.f72793e = t0Var;
                                this.f72789a = c2Var;
                                this.f72790b = str;
                                this.f72792d = 4;
                                objB4 = o0Var.B4(this.f72795g, hVar, c2Var, str, this);
                                if (objB4 != aVar2) {
                                    c2Var2 = c2Var;
                                    aVar = (wg0.a) objB4;
                                    if (aVar != null) {
                                        o0Var.f72659f = aVar;
                                    }
                                    str2 = str;
                                    if (!z15) {
                                        this.f72793e = t0Var;
                                        this.f72789a = c2Var2;
                                        this.f72790b = str2;
                                        this.f72792d = 5;
                                        if (o0.y4(o0Var, context, c2Var2, str2, this) != aVar2) {
                                            String str4 = str2;
                                            am.c2 c2Var3 = c2Var2;
                                            if (z15) {
                                                o0Var.f72664k = true;
                                                o0Var.f72673t.clear();
                                                i14 = 1;
                                            } else {
                                                i14 = o0Var.f72675w + 10;
                                            }
                                            x53.c cVar = o53.s0.f129406a;
                                            x53.b bVar2 = x53.b.f189152a;
                                            a aVar3 = new a(this.f72797i, c2Var3, str4, i14, null);
                                            i15 = i14;
                                            this.f72793e = t0Var;
                                            this.f72789a = null;
                                            this.f72790b = null;
                                            this.f72791c = i15;
                                            this.f72792d = 6;
                                            objE0 = ge1.b.e0(bVar2, aVar3, this);
                                            if (objE0 != aVar2) {
                                                v2Var = (v2) objE0;
                                                if (v2Var instanceof v2.b) {
                                                    bVar = (v2.b) v2Var;
                                                    if (bVar.f47387b == 200) {
                                                        arrayList = p13.h0.d1((Collection) bVar.f47386a);
                                                    } else {
                                                        arrayList = new ArrayList();
                                                    }
                                                    o0Var.f72675w = i15;
                                                    arrayList2 = o0Var.f72673t;
                                                    if (o0Var.f72676x == null && !arrayList.isEmpty() && (conversationCommentDTO = (ConversationCommentDTO) p13.h0.d0(arrayList)) != null) {
                                                        mo1.d dVar = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
                                                        o0Var.f72676x = dVar;
                                                        dVar.s(conversationCommentDTO.f44547b);
                                                    }
                                                    if (arrayList.isEmpty() && arrayList.size() == 11) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    o0Var.f72664k = z14;
                                                    if (z14) {
                                                        arrayList.remove(0);
                                                    }
                                                    if (o0Var.f72675w == 1) {
                                                        arrayList2.add(new go1.w(0, false, null, o0Var.f72659f, null, 22, null));
                                                        if (o0Var.f72664k) {
                                                            arrayList2.add(new go1.w(1, false, null, null, null, 30, null));
                                                        }
                                                        arrayList2.addAll(m0.c(arrayList, context, o0Var.f72660g));
                                                        o0Var.f72667m.j(arrayList2);
                                                    } else {
                                                        listC = m0.c(arrayList, context, o0Var.f72660g);
                                                        if (o0Var.f72664k) {
                                                            arrayList2.addAll(2, listC);
                                                        } else {
                                                            arrayList2.remove(1);
                                                            arrayList2.addAll(1, listC);
                                                        }
                                                        o0Var.f72668n.j(new o13.p<>(listC, Boolean.valueOf(o0Var.f72664k)));
                                                    }
                                                    g3.f35298f.getClass();
                                                    g3 g3VarD = g3.a.d(arrayList);
                                                    this.f72793e = null;
                                                    this.f72789a = null;
                                                    this.f72790b = null;
                                                    this.f72791c = i15;
                                                    this.f72792d = 7;
                                                } else {
                                                    if (v2Var instanceof v2.a) {
                                                        lc.u0.r();
                                                        return null;
                                                    }
                                                    g3 g3VarA2 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                                                    this.f72793e = null;
                                                    this.f72789a = null;
                                                    this.f72790b = null;
                                                    this.f72791c = i15;
                                                    this.f72792d = 8;
                                                }
                                            }
                                        }
                                    } else {
                                        String str5 = str2;
                                        am.c2 c2Var4 = c2Var2;
                                        if (z15) {
                                            o0Var.f72664k = true;
                                            o0Var.f72673t.clear();
                                            i14 = 1;
                                        } else {
                                            i14 = o0Var.f72675w + 10;
                                        }
                                        x53.c cVar2 = o53.s0.f129406a;
                                        x53.b bVar3 = x53.b.f189152a;
                                        a aVar4 = new a(this.f72797i, c2Var4, str5, i14, null);
                                        i15 = i14;
                                        this.f72793e = t0Var;
                                        this.f72789a = null;
                                        this.f72790b = null;
                                        this.f72791c = i15;
                                        this.f72792d = 6;
                                        objE0 = ge1.b.e0(bVar3, aVar4, this);
                                        if (objE0 != aVar2) {
                                            v2Var = (v2) objE0;
                                            if (v2Var instanceof v2.b) {
                                                bVar = (v2.b) v2Var;
                                                if (bVar.f47387b == 200) {
                                                    arrayList = p13.h0.d1((Collection) bVar.f47386a);
                                                } else {
                                                    arrayList = new ArrayList();
                                                }
                                                o0Var.f72675w = i15;
                                                arrayList2 = o0Var.f72673t;
                                                if (o0Var.f72676x == null) {
                                                    mo1.d dVar2 = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
                                                    o0Var.f72676x = dVar2;
                                                    dVar2.s(conversationCommentDTO.f44547b);
                                                }
                                                if (arrayList.isEmpty()) {
                                                    z14 = false;
                                                } else {
                                                    z14 = false;
                                                }
                                                o0Var.f72664k = z14;
                                                if (z14) {
                                                    arrayList.remove(0);
                                                }
                                                if (o0Var.f72675w == 1) {
                                                    arrayList2.add(new go1.w(0, false, null, o0Var.f72659f, null, 22, null));
                                                    if (o0Var.f72664k) {
                                                        arrayList2.add(new go1.w(1, false, null, null, null, 30, null));
                                                    }
                                                    arrayList2.addAll(m0.c(arrayList, context, o0Var.f72660g));
                                                    o0Var.f72667m.j(arrayList2);
                                                } else {
                                                    listC = m0.c(arrayList, context, o0Var.f72660g);
                                                    if (o0Var.f72664k) {
                                                        arrayList2.addAll(2, listC);
                                                    } else {
                                                        arrayList2.remove(1);
                                                        arrayList2.addAll(1, listC);
                                                    }
                                                    o0Var.f72668n.j(new o13.p<>(listC, Boolean.valueOf(o0Var.f72664k)));
                                                }
                                                g3.f35298f.getClass();
                                                g3 g3VarD2 = g3.a.d(arrayList);
                                                this.f72793e = null;
                                                this.f72789a = null;
                                                this.f72790b = null;
                                                this.f72791c = i15;
                                                this.f72792d = 7;
                                            } else {
                                                if (v2Var instanceof v2.a) {
                                                    lc.u0.r();
                                                    return null;
                                                }
                                                g3 g3VarA3 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                                                this.f72793e = null;
                                                this.f72789a = null;
                                                this.f72790b = null;
                                                this.f72791c = i15;
                                                this.f72792d = 8;
                                            }
                                        }
                                    }
                                }
                            } else {
                                c2Var2 = c2Var;
                                str2 = str;
                                if (!z15) {
                                    this.f72793e = t0Var;
                                    this.f72789a = c2Var2;
                                    this.f72790b = str2;
                                    this.f72792d = 5;
                                    if (o0.y4(o0Var, context, c2Var2, str2, this) != aVar2) {
                                        String str6 = str2;
                                        am.c2 c2Var5 = c2Var2;
                                        if (z15) {
                                            o0Var.f72664k = true;
                                            o0Var.f72673t.clear();
                                            i14 = 1;
                                        } else {
                                            i14 = o0Var.f72675w + 10;
                                        }
                                        x53.c cVar3 = o53.s0.f129406a;
                                        x53.b bVar4 = x53.b.f189152a;
                                        a aVar5 = new a(this.f72797i, c2Var5, str6, i14, null);
                                        i15 = i14;
                                        this.f72793e = t0Var;
                                        this.f72789a = null;
                                        this.f72790b = null;
                                        this.f72791c = i15;
                                        this.f72792d = 6;
                                        objE0 = ge1.b.e0(bVar4, aVar5, this);
                                        if (objE0 != aVar2) {
                                            v2Var = (v2) objE0;
                                            if (v2Var instanceof v2.b) {
                                                bVar = (v2.b) v2Var;
                                                if (bVar.f47387b == 200) {
                                                    arrayList = p13.h0.d1((Collection) bVar.f47386a);
                                                } else {
                                                    arrayList = new ArrayList();
                                                }
                                                o0Var.f72675w = i15;
                                                arrayList2 = o0Var.f72673t;
                                                if (o0Var.f72676x == null) {
                                                    mo1.d dVar3 = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
                                                    o0Var.f72676x = dVar3;
                                                    dVar3.s(conversationCommentDTO.f44547b);
                                                }
                                                if (arrayList.isEmpty()) {
                                                    z14 = false;
                                                } else {
                                                    z14 = false;
                                                }
                                                o0Var.f72664k = z14;
                                                if (z14) {
                                                    arrayList.remove(0);
                                                }
                                                if (o0Var.f72675w == 1) {
                                                    arrayList2.add(new go1.w(0, false, null, o0Var.f72659f, null, 22, null));
                                                    if (o0Var.f72664k) {
                                                        arrayList2.add(new go1.w(1, false, null, null, null, 30, null));
                                                    }
                                                    arrayList2.addAll(m0.c(arrayList, context, o0Var.f72660g));
                                                    o0Var.f72667m.j(arrayList2);
                                                } else {
                                                    listC = m0.c(arrayList, context, o0Var.f72660g);
                                                    if (o0Var.f72664k) {
                                                        arrayList2.addAll(2, listC);
                                                    } else {
                                                        arrayList2.remove(1);
                                                        arrayList2.addAll(1, listC);
                                                    }
                                                    o0Var.f72668n.j(new o13.p<>(listC, Boolean.valueOf(o0Var.f72664k)));
                                                }
                                                g3.f35298f.getClass();
                                                g3 g3VarD3 = g3.a.d(arrayList);
                                                this.f72793e = null;
                                                this.f72789a = null;
                                                this.f72790b = null;
                                                this.f72791c = i15;
                                                this.f72792d = 7;
                                            } else {
                                                if (v2Var instanceof v2.a) {
                                                    lc.u0.r();
                                                    return null;
                                                }
                                                g3 g3VarA4 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                                                this.f72793e = null;
                                                this.f72789a = null;
                                                this.f72790b = null;
                                                this.f72791c = i15;
                                                this.f72792d = 8;
                                            }
                                        }
                                    }
                                } else {
                                    String str7 = str2;
                                    am.c2 c2Var6 = c2Var2;
                                    if (z15) {
                                        o0Var.f72664k = true;
                                        o0Var.f72673t.clear();
                                        i14 = 1;
                                    } else {
                                        i14 = o0Var.f72675w + 10;
                                    }
                                    x53.c cVar4 = o53.s0.f129406a;
                                    x53.b bVar5 = x53.b.f189152a;
                                    a aVar6 = new a(this.f72797i, c2Var6, str7, i14, null);
                                    i15 = i14;
                                    this.f72793e = t0Var;
                                    this.f72789a = null;
                                    this.f72790b = null;
                                    this.f72791c = i15;
                                    this.f72792d = 6;
                                    objE0 = ge1.b.e0(bVar5, aVar6, this);
                                    if (objE0 != aVar2) {
                                        v2Var = (v2) objE0;
                                        if (v2Var instanceof v2.b) {
                                            bVar = (v2.b) v2Var;
                                            if (bVar.f47387b == 200) {
                                                arrayList = p13.h0.d1((Collection) bVar.f47386a);
                                            } else {
                                                arrayList = new ArrayList();
                                            }
                                            o0Var.f72675w = i15;
                                            arrayList2 = o0Var.f72673t;
                                            if (o0Var.f72676x == null) {
                                                mo1.d dVar4 = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
                                                o0Var.f72676x = dVar4;
                                                dVar4.s(conversationCommentDTO.f44547b);
                                            }
                                            if (arrayList.isEmpty()) {
                                                z14 = false;
                                            } else {
                                                z14 = false;
                                            }
                                            o0Var.f72664k = z14;
                                            if (z14) {
                                                arrayList.remove(0);
                                            }
                                            if (o0Var.f72675w == 1) {
                                                arrayList2.add(new go1.w(0, false, null, o0Var.f72659f, null, 22, null));
                                                if (o0Var.f72664k) {
                                                    arrayList2.add(new go1.w(1, false, null, null, null, 30, null));
                                                }
                                                arrayList2.addAll(m0.c(arrayList, context, o0Var.f72660g));
                                                o0Var.f72667m.j(arrayList2);
                                            } else {
                                                listC = m0.c(arrayList, context, o0Var.f72660g);
                                                if (o0Var.f72664k) {
                                                    arrayList2.addAll(2, listC);
                                                } else {
                                                    arrayList2.remove(1);
                                                    arrayList2.addAll(1, listC);
                                                }
                                                o0Var.f72668n.j(new o13.p<>(listC, Boolean.valueOf(o0Var.f72664k)));
                                            }
                                            g3.f35298f.getClass();
                                            g3 g3VarD4 = g3.a.d(arrayList);
                                            this.f72793e = null;
                                            this.f72789a = null;
                                            this.f72790b = null;
                                            this.f72791c = i15;
                                            this.f72792d = 7;
                                        } else {
                                            if (v2Var instanceof v2.a) {
                                                lc.u0.r();
                                                return null;
                                            }
                                            g3 g3VarA5 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                                            this.f72793e = null;
                                            this.f72789a = null;
                                            this.f72790b = null;
                                            this.f72791c = i15;
                                            this.f72792d = 8;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                } else {
                    g3 g3VarA6 = g3.a.a(g3.f35298f, null, new InvalidResourceTypeException(c2Var), null, null, 13);
                    this.f72793e = null;
                    this.f72789a = null;
                    this.f72791c = 0;
                    this.f72792d = 1;
                    break;
                }
                return aVar2;
            case 1:
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 2:
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 3:
                String str8 = this.f72790b;
                am.c2 c2Var7 = this.f72789a;
                o13.r.b(obj);
                str = str8;
                c2Var = c2Var7;
                if (!o0Var.f72678z) {
                    c2Var2 = c2Var;
                    str2 = str;
                    if (!z15) {
                        this.f72793e = t0Var;
                        this.f72789a = c2Var2;
                        this.f72790b = str2;
                        this.f72792d = 5;
                        if (o0.y4(o0Var, context, c2Var2, str2, this) != aVar2) {
                            String str9 = str2;
                            am.c2 c2Var8 = c2Var2;
                            if (z15) {
                                o0Var.f72664k = true;
                                o0Var.f72673t.clear();
                                i14 = 1;
                            } else {
                                i14 = o0Var.f72675w + 10;
                            }
                            x53.c cVar5 = o53.s0.f129406a;
                            x53.b bVar6 = x53.b.f189152a;
                            a aVar7 = new a(this.f72797i, c2Var8, str9, i14, null);
                            i15 = i14;
                            this.f72793e = t0Var;
                            this.f72789a = null;
                            this.f72790b = null;
                            this.f72791c = i15;
                            this.f72792d = 6;
                            objE0 = ge1.b.e0(bVar6, aVar7, this);
                            if (objE0 != aVar2) {
                                v2Var = (v2) objE0;
                                if (v2Var instanceof v2.b) {
                                    bVar = (v2.b) v2Var;
                                    if (bVar.f47387b == 200) {
                                        arrayList = p13.h0.d1((Collection) bVar.f47386a);
                                    } else {
                                        arrayList = new ArrayList();
                                    }
                                    o0Var.f72675w = i15;
                                    arrayList2 = o0Var.f72673t;
                                    if (o0Var.f72676x == null) {
                                        mo1.d dVar5 = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
                                        o0Var.f72676x = dVar5;
                                        dVar5.s(conversationCommentDTO.f44547b);
                                    }
                                    if (arrayList.isEmpty()) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    o0Var.f72664k = z14;
                                    if (z14) {
                                        arrayList.remove(0);
                                    }
                                    if (o0Var.f72675w == 1) {
                                        arrayList2.add(new go1.w(0, false, null, o0Var.f72659f, null, 22, null));
                                        if (o0Var.f72664k) {
                                            arrayList2.add(new go1.w(1, false, null, null, null, 30, null));
                                        }
                                        arrayList2.addAll(m0.c(arrayList, context, o0Var.f72660g));
                                        o0Var.f72667m.j(arrayList2);
                                    } else {
                                        listC = m0.c(arrayList, context, o0Var.f72660g);
                                        if (o0Var.f72664k) {
                                            arrayList2.addAll(2, listC);
                                        } else {
                                            arrayList2.remove(1);
                                            arrayList2.addAll(1, listC);
                                        }
                                        o0Var.f72668n.j(new o13.p<>(listC, Boolean.valueOf(o0Var.f72664k)));
                                    }
                                    g3.f35298f.getClass();
                                    g3 g3VarD5 = g3.a.d(arrayList);
                                    this.f72793e = null;
                                    this.f72789a = null;
                                    this.f72790b = null;
                                    this.f72791c = i15;
                                    this.f72792d = 7;
                                } else {
                                    if (v2Var instanceof v2.a) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    g3 g3VarA7 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                                    this.f72793e = null;
                                    this.f72789a = null;
                                    this.f72790b = null;
                                    this.f72791c = i15;
                                    this.f72792d = 8;
                                }
                            }
                        }
                    } else {
                        String str10 = str2;
                        am.c2 c2Var9 = c2Var2;
                        if (z15) {
                            o0Var.f72664k = true;
                            o0Var.f72673t.clear();
                            i14 = 1;
                        } else {
                            i14 = o0Var.f72675w + 10;
                        }
                        x53.c cVar6 = o53.s0.f129406a;
                        x53.b bVar7 = x53.b.f189152a;
                        a aVar8 = new a(this.f72797i, c2Var9, str10, i14, null);
                        i15 = i14;
                        this.f72793e = t0Var;
                        this.f72789a = null;
                        this.f72790b = null;
                        this.f72791c = i15;
                        this.f72792d = 6;
                        objE0 = ge1.b.e0(bVar7, aVar8, this);
                        if (objE0 != aVar2) {
                            v2Var = (v2) objE0;
                            if (v2Var instanceof v2.b) {
                                bVar = (v2.b) v2Var;
                                if (bVar.f47387b == 200) {
                                    arrayList = p13.h0.d1((Collection) bVar.f47386a);
                                } else {
                                    arrayList = new ArrayList();
                                }
                                o0Var.f72675w = i15;
                                arrayList2 = o0Var.f72673t;
                                if (o0Var.f72676x == null) {
                                    mo1.d dVar6 = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
                                    o0Var.f72676x = dVar6;
                                    dVar6.s(conversationCommentDTO.f44547b);
                                }
                                if (arrayList.isEmpty()) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                o0Var.f72664k = z14;
                                if (z14) {
                                    arrayList.remove(0);
                                }
                                if (o0Var.f72675w == 1) {
                                    arrayList2.add(new go1.w(0, false, null, o0Var.f72659f, null, 22, null));
                                    if (o0Var.f72664k) {
                                        arrayList2.add(new go1.w(1, false, null, null, null, 30, null));
                                    }
                                    arrayList2.addAll(m0.c(arrayList, context, o0Var.f72660g));
                                    o0Var.f72667m.j(arrayList2);
                                } else {
                                    listC = m0.c(arrayList, context, o0Var.f72660g);
                                    if (o0Var.f72664k) {
                                        arrayList2.addAll(2, listC);
                                    } else {
                                        arrayList2.remove(1);
                                        arrayList2.addAll(1, listC);
                                    }
                                    o0Var.f72668n.j(new o13.p<>(listC, Boolean.valueOf(o0Var.f72664k)));
                                }
                                g3.f35298f.getClass();
                                g3 g3VarD6 = g3.a.d(arrayList);
                                this.f72793e = null;
                                this.f72789a = null;
                                this.f72790b = null;
                                this.f72791c = i15;
                                this.f72792d = 7;
                            } else {
                                if (v2Var instanceof v2.a) {
                                    lc.u0.r();
                                    return null;
                                }
                                g3 g3VarA8 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                                this.f72793e = null;
                                this.f72789a = null;
                                this.f72790b = null;
                                this.f72791c = i15;
                                this.f72792d = 8;
                            }
                        }
                    }
                    break;
                } else {
                    o0Var.f72678z = false;
                    parcelable = o0Var.f72659f;
                    if (parcelable instanceof com.garmin.android.apps.connectmobile.activities.newmodel.h) {
                        hVar = (com.garmin.android.apps.connectmobile.activities.newmodel.h) parcelable;
                    } else {
                        hVar = null;
                    }
                    this.f72793e = t0Var;
                    this.f72789a = c2Var;
                    this.f72790b = str;
                    this.f72792d = 4;
                    objB4 = o0Var.B4(this.f72795g, hVar, c2Var, str, this);
                    if (objB4 != aVar2) {
                        c2Var2 = c2Var;
                        aVar = (wg0.a) objB4;
                        if (aVar != null) {
                            o0Var.f72659f = aVar;
                        }
                        str2 = str;
                        if (!z15) {
                            this.f72793e = t0Var;
                            this.f72789a = c2Var2;
                            this.f72790b = str2;
                            this.f72792d = 5;
                            if (o0.y4(o0Var, context, c2Var2, str2, this) != aVar2) {
                                String str11 = str2;
                                am.c2 c2Var10 = c2Var2;
                                if (z15) {
                                    o0Var.f72664k = true;
                                    o0Var.f72673t.clear();
                                    i14 = 1;
                                } else {
                                    i14 = o0Var.f72675w + 10;
                                }
                                x53.c cVar7 = o53.s0.f129406a;
                                x53.b bVar8 = x53.b.f189152a;
                                a aVar9 = new a(this.f72797i, c2Var10, str11, i14, null);
                                i15 = i14;
                                this.f72793e = t0Var;
                                this.f72789a = null;
                                this.f72790b = null;
                                this.f72791c = i15;
                                this.f72792d = 6;
                                objE0 = ge1.b.e0(bVar8, aVar9, this);
                                if (objE0 != aVar2) {
                                    v2Var = (v2) objE0;
                                    if (v2Var instanceof v2.b) {
                                        bVar = (v2.b) v2Var;
                                        if (bVar.f47387b == 200) {
                                            arrayList = p13.h0.d1((Collection) bVar.f47386a);
                                        } else {
                                            arrayList = new ArrayList();
                                        }
                                        o0Var.f72675w = i15;
                                        arrayList2 = o0Var.f72673t;
                                        if (o0Var.f72676x == null) {
                                            mo1.d dVar7 = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
                                            o0Var.f72676x = dVar7;
                                            dVar7.s(conversationCommentDTO.f44547b);
                                        }
                                        if (arrayList.isEmpty()) {
                                            z14 = false;
                                        } else {
                                            z14 = false;
                                        }
                                        o0Var.f72664k = z14;
                                        if (z14) {
                                            arrayList.remove(0);
                                        }
                                        if (o0Var.f72675w == 1) {
                                            arrayList2.add(new go1.w(0, false, null, o0Var.f72659f, null, 22, null));
                                            if (o0Var.f72664k) {
                                                arrayList2.add(new go1.w(1, false, null, null, null, 30, null));
                                            }
                                            arrayList2.addAll(m0.c(arrayList, context, o0Var.f72660g));
                                            o0Var.f72667m.j(arrayList2);
                                        } else {
                                            listC = m0.c(arrayList, context, o0Var.f72660g);
                                            if (o0Var.f72664k) {
                                                arrayList2.addAll(2, listC);
                                            } else {
                                                arrayList2.remove(1);
                                                arrayList2.addAll(1, listC);
                                            }
                                            o0Var.f72668n.j(new o13.p<>(listC, Boolean.valueOf(o0Var.f72664k)));
                                        }
                                        g3.f35298f.getClass();
                                        g3 g3VarD7 = g3.a.d(arrayList);
                                        this.f72793e = null;
                                        this.f72789a = null;
                                        this.f72790b = null;
                                        this.f72791c = i15;
                                        this.f72792d = 7;
                                    } else {
                                        if (v2Var instanceof v2.a) {
                                            lc.u0.r();
                                            return null;
                                        }
                                        g3 g3VarA9 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                                        this.f72793e = null;
                                        this.f72789a = null;
                                        this.f72790b = null;
                                        this.f72791c = i15;
                                        this.f72792d = 8;
                                    }
                                }
                            }
                        } else {
                            String str12 = str2;
                            am.c2 c2Var11 = c2Var2;
                            if (z15) {
                                o0Var.f72664k = true;
                                o0Var.f72673t.clear();
                                i14 = 1;
                            } else {
                                i14 = o0Var.f72675w + 10;
                            }
                            x53.c cVar8 = o53.s0.f129406a;
                            x53.b bVar9 = x53.b.f189152a;
                            a aVar10 = new a(this.f72797i, c2Var11, str12, i14, null);
                            i15 = i14;
                            this.f72793e = t0Var;
                            this.f72789a = null;
                            this.f72790b = null;
                            this.f72791c = i15;
                            this.f72792d = 6;
                            objE0 = ge1.b.e0(bVar9, aVar10, this);
                            if (objE0 != aVar2) {
                                v2Var = (v2) objE0;
                                if (v2Var instanceof v2.b) {
                                    bVar = (v2.b) v2Var;
                                    if (bVar.f47387b == 200) {
                                        arrayList = p13.h0.d1((Collection) bVar.f47386a);
                                    } else {
                                        arrayList = new ArrayList();
                                    }
                                    o0Var.f72675w = i15;
                                    arrayList2 = o0Var.f72673t;
                                    if (o0Var.f72676x == null) {
                                        mo1.d dVar8 = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
                                        o0Var.f72676x = dVar8;
                                        dVar8.s(conversationCommentDTO.f44547b);
                                    }
                                    if (arrayList.isEmpty()) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    o0Var.f72664k = z14;
                                    if (z14) {
                                        arrayList.remove(0);
                                    }
                                    if (o0Var.f72675w == 1) {
                                        arrayList2.add(new go1.w(0, false, null, o0Var.f72659f, null, 22, null));
                                        if (o0Var.f72664k) {
                                            arrayList2.add(new go1.w(1, false, null, null, null, 30, null));
                                        }
                                        arrayList2.addAll(m0.c(arrayList, context, o0Var.f72660g));
                                        o0Var.f72667m.j(arrayList2);
                                    } else {
                                        listC = m0.c(arrayList, context, o0Var.f72660g);
                                        if (o0Var.f72664k) {
                                            arrayList2.addAll(2, listC);
                                        } else {
                                            arrayList2.remove(1);
                                            arrayList2.addAll(1, listC);
                                        }
                                        o0Var.f72668n.j(new o13.p<>(listC, Boolean.valueOf(o0Var.f72664k)));
                                    }
                                    g3.f35298f.getClass();
                                    g3 g3VarD8 = g3.a.d(arrayList);
                                    this.f72793e = null;
                                    this.f72789a = null;
                                    this.f72790b = null;
                                    this.f72791c = i15;
                                    this.f72792d = 7;
                                } else {
                                    if (v2Var instanceof v2.a) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    g3 g3VarA10 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                                    this.f72793e = null;
                                    this.f72789a = null;
                                    this.f72790b = null;
                                    this.f72791c = i15;
                                    this.f72792d = 8;
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar2;
            case 4:
                String str13 = this.f72790b;
                c2Var2 = this.f72789a;
                o13.r.b(obj);
                str = str13;
                objB4 = obj;
                aVar = (wg0.a) objB4;
                if (aVar != null) {
                    o0Var.f72659f = aVar;
                }
                str2 = str;
                if (!z15) {
                    String str14 = str2;
                    am.c2 c2Var12 = c2Var2;
                    if (z15) {
                        o0Var.f72664k = true;
                        o0Var.f72673t.clear();
                        i14 = 1;
                    } else {
                        i14 = o0Var.f72675w + 10;
                    }
                    x53.c cVar9 = o53.s0.f129406a;
                    x53.b bVar10 = x53.b.f189152a;
                    a aVar11 = new a(this.f72797i, c2Var12, str14, i14, null);
                    i15 = i14;
                    this.f72793e = t0Var;
                    this.f72789a = null;
                    this.f72790b = null;
                    this.f72791c = i15;
                    this.f72792d = 6;
                    objE0 = ge1.b.e0(bVar10, aVar11, this);
                    if (objE0 != aVar2) {
                        v2Var = (v2) objE0;
                        if (v2Var instanceof v2.b) {
                            bVar = (v2.b) v2Var;
                            if (bVar.f47387b == 200) {
                                arrayList = p13.h0.d1((Collection) bVar.f47386a);
                            } else {
                                arrayList = new ArrayList();
                            }
                            o0Var.f72675w = i15;
                            arrayList2 = o0Var.f72673t;
                            if (o0Var.f72676x == null) {
                                mo1.d dVar9 = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
                                o0Var.f72676x = dVar9;
                                dVar9.s(conversationCommentDTO.f44547b);
                            }
                            if (arrayList.isEmpty()) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            o0Var.f72664k = z14;
                            if (z14) {
                                arrayList.remove(0);
                            }
                            if (o0Var.f72675w == 1) {
                                arrayList2.add(new go1.w(0, false, null, o0Var.f72659f, null, 22, null));
                                if (o0Var.f72664k) {
                                    arrayList2.add(new go1.w(1, false, null, null, null, 30, null));
                                }
                                arrayList2.addAll(m0.c(arrayList, context, o0Var.f72660g));
                                o0Var.f72667m.j(arrayList2);
                            } else {
                                listC = m0.c(arrayList, context, o0Var.f72660g);
                                if (o0Var.f72664k) {
                                    arrayList2.addAll(2, listC);
                                } else {
                                    arrayList2.remove(1);
                                    arrayList2.addAll(1, listC);
                                }
                                o0Var.f72668n.j(new o13.p<>(listC, Boolean.valueOf(o0Var.f72664k)));
                            }
                            g3.f35298f.getClass();
                            g3 g3VarD9 = g3.a.d(arrayList);
                            this.f72793e = null;
                            this.f72789a = null;
                            this.f72790b = null;
                            this.f72791c = i15;
                            this.f72792d = 7;
                        } else {
                            if (v2Var instanceof v2.a) {
                                lc.u0.r();
                                return null;
                            }
                            g3 g3VarA11 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                            this.f72793e = null;
                            this.f72789a = null;
                            this.f72790b = null;
                            this.f72791c = i15;
                            this.f72792d = 8;
                        }
                    }
                    break;
                } else {
                    this.f72793e = t0Var;
                    this.f72789a = c2Var2;
                    this.f72790b = str2;
                    this.f72792d = 5;
                    if (o0.y4(o0Var, context, c2Var2, str2, this) != aVar2) {
                        String str15 = str2;
                        am.c2 c2Var13 = c2Var2;
                        if (z15) {
                            o0Var.f72664k = true;
                            o0Var.f72673t.clear();
                            i14 = 1;
                        } else {
                            i14 = o0Var.f72675w + 10;
                        }
                        x53.c cVar10 = o53.s0.f129406a;
                        x53.b bVar11 = x53.b.f189152a;
                        a aVar12 = new a(this.f72797i, c2Var13, str15, i14, null);
                        i15 = i14;
                        this.f72793e = t0Var;
                        this.f72789a = null;
                        this.f72790b = null;
                        this.f72791c = i15;
                        this.f72792d = 6;
                        objE0 = ge1.b.e0(bVar11, aVar12, this);
                        if (objE0 != aVar2) {
                            v2Var = (v2) objE0;
                            if (v2Var instanceof v2.b) {
                                bVar = (v2.b) v2Var;
                                if (bVar.f47387b == 200) {
                                    arrayList = p13.h0.d1((Collection) bVar.f47386a);
                                } else {
                                    arrayList = new ArrayList();
                                }
                                o0Var.f72675w = i15;
                                arrayList2 = o0Var.f72673t;
                                if (o0Var.f72676x == null) {
                                    mo1.d dVar10 = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
                                    o0Var.f72676x = dVar10;
                                    dVar10.s(conversationCommentDTO.f44547b);
                                }
                                if (arrayList.isEmpty()) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                o0Var.f72664k = z14;
                                if (z14) {
                                    arrayList.remove(0);
                                }
                                if (o0Var.f72675w == 1) {
                                    arrayList2.add(new go1.w(0, false, null, o0Var.f72659f, null, 22, null));
                                    if (o0Var.f72664k) {
                                        arrayList2.add(new go1.w(1, false, null, null, null, 30, null));
                                    }
                                    arrayList2.addAll(m0.c(arrayList, context, o0Var.f72660g));
                                    o0Var.f72667m.j(arrayList2);
                                } else {
                                    listC = m0.c(arrayList, context, o0Var.f72660g);
                                    if (o0Var.f72664k) {
                                        arrayList2.addAll(2, listC);
                                    } else {
                                        arrayList2.remove(1);
                                        arrayList2.addAll(1, listC);
                                    }
                                    o0Var.f72668n.j(new o13.p<>(listC, Boolean.valueOf(o0Var.f72664k)));
                                }
                                g3.f35298f.getClass();
                                g3 g3VarD10 = g3.a.d(arrayList);
                                this.f72793e = null;
                                this.f72789a = null;
                                this.f72790b = null;
                                this.f72791c = i15;
                                this.f72792d = 7;
                            } else {
                                if (v2Var instanceof v2.a) {
                                    lc.u0.r();
                                    return null;
                                }
                                g3 g3VarA12 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                                this.f72793e = null;
                                this.f72789a = null;
                                this.f72790b = null;
                                this.f72791c = i15;
                                this.f72792d = 8;
                            }
                        }
                    }
                    break;
                }
                return aVar2;
            case 5:
                str2 = this.f72790b;
                c2Var2 = this.f72789a;
                o13.r.b(obj);
                String str16 = str2;
                am.c2 c2Var14 = c2Var2;
                if (z15) {
                    o0Var.f72664k = true;
                    o0Var.f72673t.clear();
                    i14 = 1;
                } else {
                    i14 = o0Var.f72675w + 10;
                }
                x53.c cVar11 = o53.s0.f129406a;
                x53.b bVar12 = x53.b.f189152a;
                a aVar13 = new a(this.f72797i, c2Var14, str16, i14, null);
                i15 = i14;
                this.f72793e = t0Var;
                this.f72789a = null;
                this.f72790b = null;
                this.f72791c = i15;
                this.f72792d = 6;
                objE0 = ge1.b.e0(bVar12, aVar13, this);
                if (objE0 != aVar2) {
                    v2Var = (v2) objE0;
                    if (v2Var instanceof v2.b) {
                        bVar = (v2.b) v2Var;
                        if (bVar.f47387b == 200) {
                            arrayList = p13.h0.d1((Collection) bVar.f47386a);
                        } else {
                            arrayList = new ArrayList();
                        }
                        o0Var.f72675w = i15;
                        arrayList2 = o0Var.f72673t;
                        if (o0Var.f72676x == null) {
                            mo1.d dVar11 = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
                            o0Var.f72676x = dVar11;
                            dVar11.s(conversationCommentDTO.f44547b);
                        }
                        if (arrayList.isEmpty()) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        o0Var.f72664k = z14;
                        if (z14) {
                            arrayList.remove(0);
                        }
                        if (o0Var.f72675w == 1) {
                            arrayList2.add(new go1.w(0, false, null, o0Var.f72659f, null, 22, null));
                            if (o0Var.f72664k) {
                                arrayList2.add(new go1.w(1, false, null, null, null, 30, null));
                            }
                            arrayList2.addAll(m0.c(arrayList, context, o0Var.f72660g));
                            o0Var.f72667m.j(arrayList2);
                        } else {
                            listC = m0.c(arrayList, context, o0Var.f72660g);
                            if (o0Var.f72664k) {
                                arrayList2.addAll(2, listC);
                            } else {
                                arrayList2.remove(1);
                                arrayList2.addAll(1, listC);
                            }
                            o0Var.f72668n.j(new o13.p<>(listC, Boolean.valueOf(o0Var.f72664k)));
                        }
                        g3.f35298f.getClass();
                        g3 g3VarD11 = g3.a.d(arrayList);
                        this.f72793e = null;
                        this.f72789a = null;
                        this.f72790b = null;
                        this.f72791c = i15;
                        this.f72792d = 7;
                    } else {
                        if (v2Var instanceof v2.a) {
                            lc.u0.r();
                            return null;
                        }
                        g3 g3VarA13 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                        this.f72793e = null;
                        this.f72789a = null;
                        this.f72790b = null;
                        this.f72791c = i15;
                        this.f72792d = 8;
                    }
                    break;
                }
                return aVar2;
            case 6:
                int i17 = this.f72791c;
                o13.r.b(obj);
                i15 = i17;
                objE0 = obj;
                v2Var = (v2) objE0;
                if (v2Var instanceof v2.b) {
                    bVar = (v2.b) v2Var;
                    if (bVar.f47387b == 200) {
                        arrayList = p13.h0.d1((Collection) bVar.f47386a);
                    } else {
                        arrayList = new ArrayList();
                    }
                    o0Var.f72675w = i15;
                    arrayList2 = o0Var.f72673t;
                    if (o0Var.f72676x == null) {
                        mo1.d dVar12 = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
                        o0Var.f72676x = dVar12;
                        dVar12.s(conversationCommentDTO.f44547b);
                    }
                    if (arrayList.isEmpty()) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    o0Var.f72664k = z14;
                    if (z14) {
                        arrayList.remove(0);
                    }
                    if (o0Var.f72675w == 1) {
                        arrayList2.add(new go1.w(0, false, null, o0Var.f72659f, null, 22, null));
                        if (o0Var.f72664k) {
                            arrayList2.add(new go1.w(1, false, null, null, null, 30, null));
                        }
                        arrayList2.addAll(m0.c(arrayList, context, o0Var.f72660g));
                        o0Var.f72667m.j(arrayList2);
                    } else {
                        listC = m0.c(arrayList, context, o0Var.f72660g);
                        if (o0Var.f72664k) {
                            arrayList2.addAll(2, listC);
                        } else {
                            arrayList2.remove(1);
                            arrayList2.addAll(1, listC);
                        }
                        o0Var.f72668n.j(new o13.p<>(listC, Boolean.valueOf(o0Var.f72664k)));
                    }
                    g3.f35298f.getClass();
                    g3 g3VarD12 = g3.a.d(arrayList);
                    this.f72793e = null;
                    this.f72789a = null;
                    this.f72790b = null;
                    this.f72791c = i15;
                    this.f72792d = 7;
                } else {
                    if (v2Var instanceof v2.a) {
                        lc.u0.r();
                        return null;
                    }
                    g3 g3VarA14 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                    this.f72793e = null;
                    this.f72789a = null;
                    this.f72790b = null;
                    this.f72791c = i15;
                    this.f72792d = 8;
                }
                break;
            case 7:
            case 8:
                o13.r.b(obj);
                o0Var.f72677y = false;
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
