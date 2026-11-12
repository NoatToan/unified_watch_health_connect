package mz1;

import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$onSaveClicked$2", f = "AddTIEventViewModel.kt", l = {1861, 1876, 1879, 1894}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AddTIEventViewModel f121961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f121962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f121963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f121964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f121965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f121966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f121967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f121968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f121969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f121970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f121971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f121973m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(AddTIEventViewModel addTIEventViewModel, Context context, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f121972l = addTIEventViewModel;
        this.f121973m = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        x xVar = new x(this.f121972l, this.f121973m, dVar);
        xVar.f121971k = obj;
        return xVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x0146  */
    /* JADX WARN: Code duplicated, block: B:54:0x0157  */
    /* JADX WARN: Code duplicated, block: B:57:0x0191  */
    /* JADX WARN: Code duplicated, block: B:60:0x01af  */
    /* JADX WARN: Code duplicated, block: B:61:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e9  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0143, code lost:
    
        if (com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel.Y4(r14, r13, r7, r21) == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ac, code lost:
    
        if (com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel.Y4(r11, r15, r12, r21) == r2) goto L59;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        long j8;
        Context context;
        AddTIEventViewModel addTIEventViewModel;
        int i14;
        int i15;
        long j14;
        v2 v2Var;
        AddTIEventViewModel addTIEventViewModel2;
        Uri uriD;
        AddTIEventViewModel addTIEventViewModel3;
        fg0.k kVar;
        List<fg0.a0> listS;
        fg0.a0 a0Var;
        int i16;
        Object objAwait;
        Uri uri;
        long j15;
        AddTIEventViewModel addTIEventViewModel4;
        int i17;
        int i18;
        int i19;
        Context context2;
        c83.a0 a0Var2;
        o53.b0 b0Var = (o53.b0) this.f121971k;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i24 = this.f121970j;
        int i25 = 0;
        if (i24 == 0) {
            o13.r.b(obj);
            AddTIEventViewModel addTIEventViewModel5 = this.f121972l;
            fg0.k kVar2 = addTIEventViewModel5.f46435s2;
            if (kVar2 == null) {
                p005kotlin.jvm.internal.s.m("eventDTO");
                throw null;
            }
            Long l14 = kVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            if (l14 != null) {
                long jLongValue = l14.longValue();
                zf0.d dVar = addTIEventViewModel5.f204384a;
                fg0.k kVar3 = addTIEventViewModel5.f46435s2;
                if (kVar3 == null) {
                    p005kotlin.jvm.internal.s.m("eventDTO");
                    throw null;
                }
                this.f121971k = b0Var;
                this.f121961a = addTIEventViewModel5;
                Context context3 = this.f121973m;
                this.f121962b = context3;
                this.f121964d = 0;
                this.f121969i = jLongValue;
                this.f121965e = 0;
                this.f121970j = 1;
                dVar.getClass();
                objJ = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.b0(dVar, jLongValue, kVar3, null), this);
                if (objJ != aVar) {
                    j8 = jLongValue;
                    context = context3;
                    addTIEventViewModel = addTIEventViewModel5;
                    i14 = 0;
                    i15 = 0;
                    j14 = j8;
                    v2Var = (v2) objJ;
                    if (v2Var instanceof v2.b) {
                        String[] strArr = AddTIEventViewModel.V2;
                        uriD = addTIEventViewModel.a6().d();
                        addTIEventViewModel3 = addTIEventViewModel;
                        kVar = addTIEventViewModel3.f46437t2;
                        if (kVar == null) {
                        }
                        if (uriD != null) {
                            this.f121971k = null;
                            this.f121961a = addTIEventViewModel3;
                            this.f121962b = null;
                            this.f121963c = null;
                            this.f121964d = i15;
                            this.f121969i = j14;
                            this.f121965e = i14;
                            this.f121966f = 0;
                            this.f121967g = 0;
                            this.f121968h = 0;
                            this.f121970j = 4;
                        } else {
                            addTIEventViewModel3.O4().j(g3.a.e(g3.f35298f));
                        }
                    } else {
                        addTIEventViewModel2 = addTIEventViewModel;
                        if (v2Var instanceof v2.a) {
                            lc.u0.r();
                            return null;
                        }
                        String[] strArr2 = AddTIEventViewModel.V2;
                        addTIEventViewModel2.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        String string = ((v2.a) v2Var).f47383a.toString();
                        p92.y.f136664a.getClass();
                        p92.y.a.c("AddTIEventViewModel", string);
                    }
                }
                return aVar;
            }
            return Unit.INSTANCE;
        }
        if (i24 == 1) {
            i14 = this.f121965e;
            long j16 = this.f121969i;
            int i26 = this.f121964d;
            Context context4 = this.f121962b;
            AddTIEventViewModel addTIEventViewModel6 = this.f121961a;
            o13.r.b(obj);
            j8 = j16;
            objJ = obj;
            addTIEventViewModel = addTIEventViewModel6;
            context = context4;
            i15 = i26;
            j14 = j8;
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                String[] strArr3 = AddTIEventViewModel.V2;
                uriD = addTIEventViewModel.a6().d();
                addTIEventViewModel3 = addTIEventViewModel;
                kVar = addTIEventViewModel3.f46437t2;
                if (kVar == null && (listS = kVar.s()) != null && (a0Var = (fg0.a0) p13.h0.d0(listS)) != null) {
                    i16 = (uriD == null || URLUtil.isHttpsUrl(uriD.toString())) ? 0 : 1;
                    if ((a0Var.getUrl() != null && uriD == null) || (uriD != null && i16 != 0)) {
                        zf0.d dVar2 = addTIEventViewModel3.f204384a;
                        this.f121971k = b0Var;
                        this.f121961a = addTIEventViewModel3;
                        this.f121962b = context;
                        this.f121963c = uriD;
                        this.f121964d = i15;
                        this.f121969i = j14;
                        this.f121965e = i14;
                        this.f121966f = 0;
                        this.f121967g = 0;
                        this.f121968h = i16;
                        this.f121970j = 2;
                        objAwait = dVar2.f204344a.e(j14).await(this);
                        if (objAwait != aVar) {
                            uri = uriD;
                            j15 = j14;
                            int i27 = i15;
                            addTIEventViewModel4 = addTIEventViewModel3;
                            i17 = i27;
                            i18 = i14;
                            i19 = 0;
                            context2 = context;
                            a0Var2 = (c83.a0) objAwait;
                            if (a0Var2.f25745a.isSuccessful()) {
                                String[] strArr4 = AddTIEventViewModel.V2;
                                addTIEventViewModel4.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strH = am.j.h(a0Var2.f25745a.code(), "Problem in deleting the existing image result ");
                                p92.y.f136664a.getClass();
                                p92.y.a.c("AddTIEventViewModel", strH);
                            } else if (i16 != 0) {
                                this.f121971k = null;
                                this.f121961a = addTIEventViewModel4;
                                this.f121962b = context2;
                                this.f121963c = uri;
                                this.f121964d = i17;
                                this.f121969i = j15;
                                this.f121965e = i18;
                                this.f121966f = i25;
                                this.f121967g = i19;
                                this.f121968h = i16;
                                this.f121970j = 3;
                            } else {
                                String[] strArr5 = AddTIEventViewModel.V2;
                                addTIEventViewModel4.O4().j(g3.a.e(g3.f35298f));
                            }
                        }
                        return aVar;
                    }
                    addTIEventViewModel3.O4().j(g3.a.e(g3.f35298f));
                } else if (uriD != null) {
                    this.f121971k = null;
                    this.f121961a = addTIEventViewModel3;
                    this.f121962b = null;
                    this.f121963c = null;
                    this.f121964d = i15;
                    this.f121969i = j14;
                    this.f121965e = i14;
                    this.f121966f = 0;
                    this.f121967g = 0;
                    this.f121968h = 0;
                    this.f121970j = 4;
                } else {
                    addTIEventViewModel3.O4().j(g3.a.e(g3.f35298f));
                }
            } else {
                addTIEventViewModel2 = addTIEventViewModel;
                if (v2Var instanceof v2.a) {
                    lc.u0.r();
                    return null;
                }
                String[] strArr6 = AddTIEventViewModel.V2;
                addTIEventViewModel2.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                String string2 = ((v2.a) v2Var).f47383a.toString();
                p92.y.f136664a.getClass();
                p92.y.a.c("AddTIEventViewModel", string2);
            }
        } else if (i24 != 2) {
            if (i24 != 3) {
                if (i24 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            o13.r.b(obj);
        } else {
            int i28 = this.f121968h;
            int i29 = this.f121967g;
            int i30 = this.f121966f;
            i18 = this.f121965e;
            j15 = this.f121969i;
            i17 = this.f121964d;
            uri = this.f121963c;
            context2 = this.f121962b;
            addTIEventViewModel4 = this.f121961a;
            o13.r.b(obj);
            i25 = i30;
            i19 = i29;
            i16 = i28;
            objAwait = obj;
            a0Var2 = (c83.a0) objAwait;
            if (a0Var2.f25745a.isSuccessful()) {
                String[] strArr7 = AddTIEventViewModel.V2;
                addTIEventViewModel4.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                String strH2 = am.j.h(a0Var2.f25745a.code(), "Problem in deleting the existing image result ");
                p92.y.f136664a.getClass();
                p92.y.a.c("AddTIEventViewModel", strH2);
            } else if (i16 != 0) {
                this.f121971k = null;
                this.f121961a = addTIEventViewModel4;
                this.f121962b = context2;
                this.f121963c = uri;
                this.f121964d = i17;
                this.f121969i = j15;
                this.f121965e = i18;
                this.f121966f = i25;
                this.f121967g = i19;
                this.f121968h = i16;
                this.f121970j = 3;
            } else {
                String[] strArr8 = AddTIEventViewModel.V2;
                addTIEventViewModel4.O4().j(g3.a.e(g3.f35298f));
            }
        }
        return Unit.INSTANCE;
    }
}
