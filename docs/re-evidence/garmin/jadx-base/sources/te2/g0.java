package te2;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ContinueAsHandler$execute$2", f = "ContinueAsHandler.kt", l = {96, 101, 107, 116, 118}, m = "invokeSuspend")
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f164032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ve2.d f164033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f164035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f164035d = h0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g0(this.f164035d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00f4 A[Catch: all -> 0x0026, PHI: r0
      0x00f4: PHI (r0v16 ve2.q) = (r0v12 ve2.q), (r0v12 ve2.q), (r0v20 ve2.q) binds: [B:51:0x00d0, B:53:0x00d8, B:58:0x00ef] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0026, blocks: (B:10:0x001e, B:76:0x015f, B:77:0x0169, B:79:0x016f, B:80:0x0175, B:16:0x0030, B:72:0x0139, B:19:0x0039, B:66:0x0111, B:67:0x0115, B:69:0x011b, B:84:0x0180, B:85:0x0187, B:22:0x0046, B:58:0x00ef, B:59:0x00f4, B:61:0x00fa, B:63:0x0102, B:25:0x0054, B:49:0x00c7, B:50:0x00cc, B:52:0x00d2, B:54:0x00da, B:28:0x005e, B:30:0x006f, B:32:0x0075, B:34:0x007e, B:36:0x008a, B:37:0x008d, B:39:0x0092, B:41:0x009a, B:43:0x00aa, B:45:0x00b2, B:86:0x0188, B:87:0x018f, B:38:0x0090, B:88:0x0190, B:89:0x0197), top: B:93:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fa A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:10:0x001e, B:76:0x015f, B:77:0x0169, B:79:0x016f, B:80:0x0175, B:16:0x0030, B:72:0x0139, B:19:0x0039, B:66:0x0111, B:67:0x0115, B:69:0x011b, B:84:0x0180, B:85:0x0187, B:22:0x0046, B:58:0x00ef, B:59:0x00f4, B:61:0x00fa, B:63:0x0102, B:25:0x0054, B:49:0x00c7, B:50:0x00cc, B:52:0x00d2, B:54:0x00da, B:28:0x005e, B:30:0x006f, B:32:0x0075, B:34:0x007e, B:36:0x008a, B:37:0x008d, B:39:0x0092, B:41:0x009a, B:43:0x00aa, B:45:0x00b2, B:86:0x0188, B:87:0x018f, B:38:0x0090, B:88:0x0190, B:89:0x0197), top: B:93:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0115 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:10:0x001e, B:76:0x015f, B:77:0x0169, B:79:0x016f, B:80:0x0175, B:16:0x0030, B:72:0x0139, B:19:0x0039, B:66:0x0111, B:67:0x0115, B:69:0x011b, B:84:0x0180, B:85:0x0187, B:22:0x0046, B:58:0x00ef, B:59:0x00f4, B:61:0x00fa, B:63:0x0102, B:25:0x0054, B:49:0x00c7, B:50:0x00cc, B:52:0x00d2, B:54:0x00da, B:28:0x005e, B:30:0x006f, B:32:0x0075, B:34:0x007e, B:36:0x008a, B:37:0x008d, B:39:0x0092, B:41:0x009a, B:43:0x00aa, B:45:0x00b2, B:86:0x0188, B:87:0x018f, B:38:0x0090, B:88:0x0190, B:89:0x0197), top: B:93:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:69:0x011b A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:10:0x001e, B:76:0x015f, B:77:0x0169, B:79:0x016f, B:80:0x0175, B:16:0x0030, B:72:0x0139, B:19:0x0039, B:66:0x0111, B:67:0x0115, B:69:0x011b, B:84:0x0180, B:85:0x0187, B:22:0x0046, B:58:0x00ef, B:59:0x00f4, B:61:0x00fa, B:63:0x0102, B:25:0x0054, B:49:0x00c7, B:50:0x00cc, B:52:0x00d2, B:54:0x00da, B:28:0x005e, B:30:0x006f, B:32:0x0075, B:34:0x007e, B:36:0x008a, B:37:0x008d, B:39:0x0092, B:41:0x009a, B:43:0x00aa, B:45:0x00b2, B:86:0x0188, B:87:0x018f, B:38:0x0090, B:88:0x0190, B:89:0x0197), top: B:93:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0138  */
    /* JADX WARN: Code duplicated, block: B:72:0x0139 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:10:0x001e, B:76:0x015f, B:77:0x0169, B:79:0x016f, B:80:0x0175, B:16:0x0030, B:72:0x0139, B:19:0x0039, B:66:0x0111, B:67:0x0115, B:69:0x011b, B:84:0x0180, B:85:0x0187, B:22:0x0046, B:58:0x00ef, B:59:0x00f4, B:61:0x00fa, B:63:0x0102, B:25:0x0054, B:49:0x00c7, B:50:0x00cc, B:52:0x00d2, B:54:0x00da, B:28:0x005e, B:30:0x006f, B:32:0x0075, B:34:0x007e, B:36:0x008a, B:37:0x008d, B:39:0x0092, B:41:0x009a, B:43:0x00aa, B:45:0x00b2, B:86:0x0188, B:87:0x018f, B:38:0x0090, B:88:0x0190, B:89:0x0197), top: B:93:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:75:0x015e  */
    /* JADX WARN: Code duplicated, block: B:79:0x016f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:10:0x001e, B:76:0x015f, B:77:0x0169, B:79:0x016f, B:80:0x0175, B:16:0x0030, B:72:0x0139, B:19:0x0039, B:66:0x0111, B:67:0x0115, B:69:0x011b, B:84:0x0180, B:85:0x0187, B:22:0x0046, B:58:0x00ef, B:59:0x00f4, B:61:0x00fa, B:63:0x0102, B:25:0x0054, B:49:0x00c7, B:50:0x00cc, B:52:0x00d2, B:54:0x00da, B:28:0x005e, B:30:0x006f, B:32:0x0075, B:34:0x007e, B:36:0x008a, B:37:0x008d, B:39:0x0092, B:41:0x009a, B:43:0x00aa, B:45:0x00b2, B:86:0x0188, B:87:0x018f, B:38:0x0090, B:88:0x0190, B:89:0x0197), top: B:93:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0180 A[Catch: all -> 0x0026, TRY_ENTER, TryCatch #0 {all -> 0x0026, blocks: (B:10:0x001e, B:76:0x015f, B:77:0x0169, B:79:0x016f, B:80:0x0175, B:16:0x0030, B:72:0x0139, B:19:0x0039, B:66:0x0111, B:67:0x0115, B:69:0x011b, B:84:0x0180, B:85:0x0187, B:22:0x0046, B:58:0x00ef, B:59:0x00f4, B:61:0x00fa, B:63:0x0102, B:25:0x0054, B:49:0x00c7, B:50:0x00cc, B:52:0x00d2, B:54:0x00da, B:28:0x005e, B:30:0x006f, B:32:0x0075, B:34:0x007e, B:36:0x008a, B:37:0x008d, B:39:0x0092, B:41:0x009a, B:43:0x00aa, B:45:0x00b2, B:86:0x0188, B:87:0x018f, B:38:0x0090, B:88:0x0190, B:89:0x0197), top: B:93:0x000e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.ArrayList] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        ve2.q qVar;
        Object objD;
        ve2.q qVar2;
        ve2.d dVar;
        Object objE;
        ve2.q qVar3;
        ve2.d dVar2;
        ve2.d dVar3;
        Object objF;
        ve2.d dVar4;
        j2 j2Var;
        Context context;
        Account account;
        AccountManager accountManager;
        Object objB;
        h0 h0Var;
        Iterator it;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164034c;
        h0 h0Var2 = this.f164035d;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    dVar = this.f164033b;
                    ve2.q qVar4 = (ve2.q) this.f164032a;
                    o13.r.b(obj);
                    qVar2 = qVar4;
                    objD = obj;
                } else {
                    if (i14 == 2) {
                        dVar2 = this.f164033b;
                        ve2.q qVar5 = (ve2.q) this.f164032a;
                        o13.r.b(obj);
                        qVar3 = qVar5;
                        objE = obj;
                        dVar2.f177695f = (dd2.a) objE;
                        qVar = qVar3;
                        if (h0Var2.f164060f.f177695f == null || !qVar.a(sc2.a.f158478d)) {
                            dVar4 = h0Var2.f164060f;
                            if (dVar4.f177695f == null) {
                                throw new Exception("exhausted all other apps' credentials");
                            }
                            j2Var = j2.f164115a;
                            context = h0Var2.f164059e;
                            account = h0Var2.f164064j;
                            account.getClass();
                            accountManager = h0Var2.f164063i;
                            accountManager.getClass();
                            this.f164032a = null;
                            this.f164033b = null;
                            this.f164034c = 4;
                            if (j2Var.h(context, dVar4, account, accountManager, this) != aVar) {
                                AccountManager accountManager2 = h0Var2.f164063i;
                                accountManager2.getClass();
                                Account account2 = h0Var2.f164064j;
                                account2.getClass();
                                accountManager2.setPassword(account2, String.valueOf(System.currentTimeMillis()));
                                re2.b bVar = re2.b.f152215a;
                                this.f164032a = h0Var2;
                                this.f164034c = 5;
                                bVar.getClass();
                                objB = re2.b.B(this);
                                if (objB != aVar) {
                                    h0Var = h0Var2;
                                }
                            }
                        } else {
                            dVar3 = h0Var2.f164060f;
                            this.f164032a = dVar3;
                            this.f164033b = null;
                            this.f164034c = 3;
                            objF = h0.f(h0Var2, this);
                            if (objF != aVar) {
                                dVar3.f177695f = (dd2.a) objF;
                                dVar4 = h0Var2.f164060f;
                                if (dVar4.f177695f == null) {
                                    throw new Exception("exhausted all other apps' credentials");
                                }
                                j2Var = j2.f164115a;
                                context = h0Var2.f164059e;
                                account = h0Var2.f164064j;
                                account.getClass();
                                accountManager = h0Var2.f164063i;
                                accountManager.getClass();
                                this.f164032a = null;
                                this.f164033b = null;
                                this.f164034c = 4;
                                if (j2Var.h(context, dVar4, account, accountManager, this) != aVar) {
                                    AccountManager accountManager3 = h0Var2.f164063i;
                                    accountManager3.getClass();
                                    Account account3 = h0Var2.f164064j;
                                    account3.getClass();
                                    accountManager3.setPassword(account3, String.valueOf(System.currentTimeMillis()));
                                    re2.b bVar2 = re2.b.f152215a;
                                    this.f164032a = h0Var2;
                                    this.f164034c = 5;
                                    bVar2.getClass();
                                    objB = re2.b.B(this);
                                    if (objB != aVar) {
                                        h0Var = h0Var2;
                                    }
                                }
                            }
                        }
                        return aVar;
                    }
                    if (i14 == 3) {
                        dVar3 = (ve2.d) this.f164032a;
                        o13.r.b(obj);
                        objF = obj;
                        dVar3.f177695f = (dd2.a) objF;
                        dVar4 = h0Var2.f164060f;
                        if (dVar4.f177695f == null) {
                            throw new Exception("exhausted all other apps' credentials");
                        }
                        j2Var = j2.f164115a;
                        context = h0Var2.f164059e;
                        account = h0Var2.f164064j;
                        account.getClass();
                        accountManager = h0Var2.f164063i;
                        accountManager.getClass();
                        this.f164032a = null;
                        this.f164033b = null;
                        this.f164034c = 4;
                        if (j2Var.h(context, dVar4, account, accountManager, this) != aVar) {
                            AccountManager accountManager4 = h0Var2.f164063i;
                            accountManager4.getClass();
                            Account account4 = h0Var2.f164064j;
                            account4.getClass();
                            accountManager4.setPassword(account4, String.valueOf(System.currentTimeMillis()));
                            re2.b bVar3 = re2.b.f152215a;
                            this.f164032a = h0Var2;
                            this.f164034c = 5;
                            bVar3.getClass();
                            objB = re2.b.B(this);
                            if (objB != aVar) {
                                h0Var = h0Var2;
                            }
                        }
                        return aVar;
                    }
                    if (i14 == 4) {
                        o13.r.b(obj);
                        AccountManager accountManager5 = h0Var2.f164063i;
                        accountManager5.getClass();
                        Account account5 = h0Var2.f164064j;
                        account5.getClass();
                        accountManager5.setPassword(account5, String.valueOf(System.currentTimeMillis()));
                        re2.b bVar4 = re2.b.f152215a;
                        this.f164032a = h0Var2;
                        this.f164034c = 5;
                        bVar4.getClass();
                        objB = re2.b.B(this);
                        if (objB != aVar) {
                            h0Var = h0Var2;
                        }
                        return aVar;
                    }
                    if (i14 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h0 h0Var3 = (h0) this.f164032a;
                    o13.r.b(obj);
                    h0Var = h0Var3;
                    objB = obj;
                }
                h0Var.f164060f = (ve2.d) objB;
                it = h0Var2.f164062h.iterator();
                while (it.hasNext()) {
                    try {
                        ((re2.b.InterfaceC2863b) it.next()).e(h0Var2.f164060f, re2.b.d.CONTINUE_AS_EXISTING);
                    } catch (Exception unused) {
                    }
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            j2 j2Var2 = j2.f164115a;
            Context context2 = h0Var2.f164059e;
            Context context3 = h0Var2.f164059e;
            j2Var2.getClass();
            Account accountK = j2.k(context2);
            h0Var2.f164064j = accountK;
            if (accountK == null) {
                throw new IllegalStateException("GARMIN system account does not exist");
            }
            String[] strArrN = j2.n(context3, true, null);
            if (strArrN != null) {
                arrayList = new ArrayList();
                for (String str : strArrN) {
                    if (!p005kotlin.jvm.internal.s.g(str, context3.getPackageName())) {
                        arrayList.add(str);
                    }
                }
            } else {
                arrayList = p13.j0.f134944a;
            }
            h0Var2.f164065k = arrayList;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("no signed-in package names");
            }
            h0Var2.f164063i = AccountManager.get(context3);
            qVar = h0Var2.f164061g.f177761b;
            if (h0Var2.f164060f.f177695f == null && qVar.a(sc2.a.f158477c)) {
                ve2.d dVar5 = h0Var2.f164060f;
                this.f164032a = qVar;
                this.f164033b = dVar5;
                this.f164034c = 1;
                objD = h0.d(h0Var2, this);
                if (objD != aVar) {
                    qVar2 = qVar;
                    dVar = dVar5;
                }
            } else if (h0Var2.f164060f.f177695f != null && qVar.a(sc2.a.f158476b)) {
                ve2.d dVar6 = h0Var2.f164060f;
                this.f164032a = qVar;
                this.f164033b = dVar6;
                this.f164034c = 2;
                objE = h0.e(h0Var2, this);
                if (objE != aVar) {
                    qVar3 = qVar;
                    dVar2 = dVar6;
                    dVar2.f177695f = (dd2.a) objE;
                    qVar = qVar3;
                    if (h0Var2.f164060f.f177695f == null) {
                        dVar4 = h0Var2.f164060f;
                        if (dVar4.f177695f == null) {
                            throw new Exception("exhausted all other apps' credentials");
                        }
                        j2Var = j2.f164115a;
                        context = h0Var2.f164059e;
                        account = h0Var2.f164064j;
                        account.getClass();
                        accountManager = h0Var2.f164063i;
                        accountManager.getClass();
                        this.f164032a = null;
                        this.f164033b = null;
                        this.f164034c = 4;
                        if (j2Var.h(context, dVar4, account, accountManager, this) != aVar) {
                            AccountManager accountManager6 = h0Var2.f164063i;
                            accountManager6.getClass();
                            Account account6 = h0Var2.f164064j;
                            account6.getClass();
                            accountManager6.setPassword(account6, String.valueOf(System.currentTimeMillis()));
                            re2.b bVar5 = re2.b.f152215a;
                            this.f164032a = h0Var2;
                            this.f164034c = 5;
                            bVar5.getClass();
                            objB = re2.b.B(this);
                            if (objB != aVar) {
                                h0Var = h0Var2;
                                h0Var.f164060f = (ve2.d) objB;
                                it = h0Var2.f164062h.iterator();
                                while (it.hasNext()) {
                                    ((re2.b.InterfaceC2863b) it.next()).e(h0Var2.f164060f, re2.b.d.CONTINUE_AS_EXISTING);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        dVar4 = h0Var2.f164060f;
                        if (dVar4.f177695f == null) {
                            throw new Exception("exhausted all other apps' credentials");
                        }
                        j2Var = j2.f164115a;
                        context = h0Var2.f164059e;
                        account = h0Var2.f164064j;
                        account.getClass();
                        accountManager = h0Var2.f164063i;
                        accountManager.getClass();
                        this.f164032a = null;
                        this.f164033b = null;
                        this.f164034c = 4;
                        if (j2Var.h(context, dVar4, account, accountManager, this) != aVar) {
                            AccountManager accountManager7 = h0Var2.f164063i;
                            accountManager7.getClass();
                            Account account7 = h0Var2.f164064j;
                            account7.getClass();
                            accountManager7.setPassword(account7, String.valueOf(System.currentTimeMillis()));
                            re2.b bVar6 = re2.b.f152215a;
                            this.f164032a = h0Var2;
                            this.f164034c = 5;
                            bVar6.getClass();
                            objB = re2.b.B(this);
                            if (objB != aVar) {
                                h0Var = h0Var2;
                                h0Var.f164060f = (ve2.d) objB;
                                it = h0Var2.f164062h.iterator();
                                while (it.hasNext()) {
                                    ((re2.b.InterfaceC2863b) it.next()).e(h0Var2.f164060f, re2.b.d.CONTINUE_AS_EXISTING);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
            } else if (h0Var2.f164060f.f177695f == null) {
                dVar4 = h0Var2.f164060f;
                if (dVar4.f177695f == null) {
                    throw new Exception("exhausted all other apps' credentials");
                }
                j2Var = j2.f164115a;
                context = h0Var2.f164059e;
                account = h0Var2.f164064j;
                account.getClass();
                accountManager = h0Var2.f164063i;
                accountManager.getClass();
                this.f164032a = null;
                this.f164033b = null;
                this.f164034c = 4;
                if (j2Var.h(context, dVar4, account, accountManager, this) != aVar) {
                    AccountManager accountManager8 = h0Var2.f164063i;
                    accountManager8.getClass();
                    Account account8 = h0Var2.f164064j;
                    account8.getClass();
                    accountManager8.setPassword(account8, String.valueOf(System.currentTimeMillis()));
                    re2.b bVar7 = re2.b.f152215a;
                    this.f164032a = h0Var2;
                    this.f164034c = 5;
                    bVar7.getClass();
                    objB = re2.b.B(this);
                    if (objB != aVar) {
                        h0Var = h0Var2;
                        h0Var.f164060f = (ve2.d) objB;
                        it = h0Var2.f164062h.iterator();
                        while (it.hasNext()) {
                            ((re2.b.InterfaceC2863b) it.next()).e(h0Var2.f164060f, re2.b.d.CONTINUE_AS_EXISTING);
                        }
                        return Unit.INSTANCE;
                    }
                }
            } else {
                dVar4 = h0Var2.f164060f;
                if (dVar4.f177695f == null) {
                    throw new Exception("exhausted all other apps' credentials");
                }
                j2Var = j2.f164115a;
                context = h0Var2.f164059e;
                account = h0Var2.f164064j;
                account.getClass();
                accountManager = h0Var2.f164063i;
                accountManager.getClass();
                this.f164032a = null;
                this.f164033b = null;
                this.f164034c = 4;
                if (j2Var.h(context, dVar4, account, accountManager, this) != aVar) {
                    AccountManager accountManager9 = h0Var2.f164063i;
                    accountManager9.getClass();
                    Account account9 = h0Var2.f164064j;
                    account9.getClass();
                    accountManager9.setPassword(account9, String.valueOf(System.currentTimeMillis()));
                    re2.b bVar8 = re2.b.f152215a;
                    this.f164032a = h0Var2;
                    this.f164034c = 5;
                    bVar8.getClass();
                    objB = re2.b.B(this);
                    if (objB != aVar) {
                        h0Var = h0Var2;
                        h0Var.f164060f = (ve2.d) objB;
                        it = h0Var2.f164062h.iterator();
                        while (it.hasNext()) {
                            ((re2.b.InterfaceC2863b) it.next()).e(h0Var2.f164060f, re2.b.d.CONTINUE_AS_EXISTING);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
            return aVar;
            dVar.f177695f = (dd2.a) objD;
            qVar = qVar2;
            if (h0Var2.f164060f.f177695f != null) {
                if (h0Var2.f164060f.f177695f == null) {
                    dVar4 = h0Var2.f164060f;
                    if (dVar4.f177695f == null) {
                        throw new Exception("exhausted all other apps' credentials");
                    }
                    j2Var = j2.f164115a;
                    context = h0Var2.f164059e;
                    account = h0Var2.f164064j;
                    account.getClass();
                    accountManager = h0Var2.f164063i;
                    accountManager.getClass();
                    this.f164032a = null;
                    this.f164033b = null;
                    this.f164034c = 4;
                    if (j2Var.h(context, dVar4, account, accountManager, this) != aVar) {
                        AccountManager accountManager10 = h0Var2.f164063i;
                        accountManager10.getClass();
                        Account account10 = h0Var2.f164064j;
                        account10.getClass();
                        accountManager10.setPassword(account10, String.valueOf(System.currentTimeMillis()));
                        re2.b bVar9 = re2.b.f152215a;
                        this.f164032a = h0Var2;
                        this.f164034c = 5;
                        bVar9.getClass();
                        objB = re2.b.B(this);
                        if (objB != aVar) {
                            h0Var = h0Var2;
                            h0Var.f164060f = (ve2.d) objB;
                            it = h0Var2.f164062h.iterator();
                            while (it.hasNext()) {
                                ((re2.b.InterfaceC2863b) it.next()).e(h0Var2.f164060f, re2.b.d.CONTINUE_AS_EXISTING);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    dVar4 = h0Var2.f164060f;
                    if (dVar4.f177695f == null) {
                        throw new Exception("exhausted all other apps' credentials");
                    }
                    j2Var = j2.f164115a;
                    context = h0Var2.f164059e;
                    account = h0Var2.f164064j;
                    account.getClass();
                    accountManager = h0Var2.f164063i;
                    accountManager.getClass();
                    this.f164032a = null;
                    this.f164033b = null;
                    this.f164034c = 4;
                    if (j2Var.h(context, dVar4, account, accountManager, this) != aVar) {
                        AccountManager accountManager11 = h0Var2.f164063i;
                        accountManager11.getClass();
                        Account account11 = h0Var2.f164064j;
                        account11.getClass();
                        accountManager11.setPassword(account11, String.valueOf(System.currentTimeMillis()));
                        re2.b bVar10 = re2.b.f152215a;
                        this.f164032a = h0Var2;
                        this.f164034c = 5;
                        bVar10.getClass();
                        objB = re2.b.B(this);
                        if (objB != aVar) {
                            h0Var = h0Var2;
                            h0Var.f164060f = (ve2.d) objB;
                            it = h0Var2.f164062h.iterator();
                            while (it.hasNext()) {
                                ((re2.b.InterfaceC2863b) it.next()).e(h0Var2.f164060f, re2.b.d.CONTINUE_AS_EXISTING);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
            } else if (h0Var2.f164060f.f177695f == null) {
                dVar4 = h0Var2.f164060f;
                if (dVar4.f177695f == null) {
                    throw new Exception("exhausted all other apps' credentials");
                }
                j2Var = j2.f164115a;
                context = h0Var2.f164059e;
                account = h0Var2.f164064j;
                account.getClass();
                accountManager = h0Var2.f164063i;
                accountManager.getClass();
                this.f164032a = null;
                this.f164033b = null;
                this.f164034c = 4;
                if (j2Var.h(context, dVar4, account, accountManager, this) != aVar) {
                    AccountManager accountManager12 = h0Var2.f164063i;
                    accountManager12.getClass();
                    Account account12 = h0Var2.f164064j;
                    account12.getClass();
                    accountManager12.setPassword(account12, String.valueOf(System.currentTimeMillis()));
                    re2.b bVar11 = re2.b.f152215a;
                    this.f164032a = h0Var2;
                    this.f164034c = 5;
                    bVar11.getClass();
                    objB = re2.b.B(this);
                    if (objB != aVar) {
                        h0Var = h0Var2;
                        h0Var.f164060f = (ve2.d) objB;
                        it = h0Var2.f164062h.iterator();
                        while (it.hasNext()) {
                            ((re2.b.InterfaceC2863b) it.next()).e(h0Var2.f164060f, re2.b.d.CONTINUE_AS_EXISTING);
                        }
                        return Unit.INSTANCE;
                    }
                }
            } else {
                dVar4 = h0Var2.f164060f;
                if (dVar4.f177695f == null) {
                    throw new Exception("exhausted all other apps' credentials");
                }
                j2Var = j2.f164115a;
                context = h0Var2.f164059e;
                account = h0Var2.f164064j;
                account.getClass();
                accountManager = h0Var2.f164063i;
                accountManager.getClass();
                this.f164032a = null;
                this.f164033b = null;
                this.f164034c = 4;
                if (j2Var.h(context, dVar4, account, accountManager, this) != aVar) {
                    AccountManager accountManager13 = h0Var2.f164063i;
                    accountManager13.getClass();
                    Account account13 = h0Var2.f164064j;
                    account13.getClass();
                    accountManager13.setPassword(account13, String.valueOf(System.currentTimeMillis()));
                    re2.b bVar12 = re2.b.f152215a;
                    this.f164032a = h0Var2;
                    this.f164034c = 5;
                    bVar12.getClass();
                    objB = re2.b.B(this);
                    if (objB != aVar) {
                        h0Var = h0Var2;
                        h0Var.f164060f = (ve2.d) objB;
                        it = h0Var2.f164062h.iterator();
                        while (it.hasNext()) {
                            ((re2.b.InterfaceC2863b) it.next()).e(h0Var2.f164060f, re2.b.d.CONTINUE_AS_EXISTING);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
            return aVar;
        } catch (Throwable th3) {
            h0Var2.f164316c.error("", th3);
            throw th3;
        }
    }
}
