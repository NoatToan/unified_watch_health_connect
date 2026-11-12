package ll1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.util.Iterator;
import java.util.List;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p13.h0;
import r53.p2;
import r53.s;
import r53.u1;
import zd0.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.init.RecordActivityInitialStateCheckViewModel$checkInitialState$1", f = "RecordActivityInitialStateCheckViewModel.kt", l = {38, 39, 55}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f113387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f113388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f113389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f113390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f113392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f113393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f113394h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f113394h = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f113394h, dVar);
        fVar.f113393g = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f2 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:8:0x0028, B:47:0x0173, B:49:0x017e, B:69:0x01fa, B:51:0x0195, B:52:0x01a5, B:54:0x01ab, B:57:0x01b7, B:61:0x01c1, B:63:0x01c5, B:64:0x01d1, B:65:0x01ec, B:15:0x0048, B:30:0x00d1, B:32:0x00f2, B:34:0x00fa, B:37:0x0105, B:39:0x011d, B:40:0x014e, B:43:0x0154, B:66:0x01ed, B:68:0x01f3, B:70:0x01fd, B:71:0x0204, B:72:0x0205, B:73:0x020a, B:18:0x005b, B:27:0x00b5, B:23:0x0099), top: B:87:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00fa A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:8:0x0028, B:47:0x0173, B:49:0x017e, B:69:0x01fa, B:51:0x0195, B:52:0x01a5, B:54:0x01ab, B:57:0x01b7, B:61:0x01c1, B:63:0x01c5, B:64:0x01d1, B:65:0x01ec, B:15:0x0048, B:30:0x00d1, B:32:0x00f2, B:34:0x00fa, B:37:0x0105, B:39:0x011d, B:40:0x014e, B:43:0x0154, B:66:0x01ed, B:68:0x01f3, B:70:0x01fd, B:71:0x0204, B:72:0x0205, B:73:0x020a, B:18:0x005b, B:27:0x00b5, B:23:0x0099), top: B:87:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0102  */
    /* JADX WARN: Code duplicated, block: B:36:0x0104  */
    /* JADX WARN: Code duplicated, block: B:39:0x011d A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:8:0x0028, B:47:0x0173, B:49:0x017e, B:69:0x01fa, B:51:0x0195, B:52:0x01a5, B:54:0x01ab, B:57:0x01b7, B:61:0x01c1, B:63:0x01c5, B:64:0x01d1, B:65:0x01ec, B:15:0x0048, B:30:0x00d1, B:32:0x00f2, B:34:0x00fa, B:37:0x0105, B:39:0x011d, B:40:0x014e, B:43:0x0154, B:66:0x01ed, B:68:0x01f3, B:70:0x01fd, B:71:0x0204, B:72:0x0205, B:73:0x020a, B:18:0x005b, B:27:0x00b5, B:23:0x0099), top: B:87:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x014e A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:8:0x0028, B:47:0x0173, B:49:0x017e, B:69:0x01fa, B:51:0x0195, B:52:0x01a5, B:54:0x01ab, B:57:0x01b7, B:61:0x01c1, B:63:0x01c5, B:64:0x01d1, B:65:0x01ec, B:15:0x0048, B:30:0x00d1, B:32:0x00f2, B:34:0x00fa, B:37:0x0105, B:39:0x011d, B:40:0x014e, B:43:0x0154, B:66:0x01ed, B:68:0x01f3, B:70:0x01fd, B:71:0x0204, B:72:0x0205, B:73:0x020a, B:18:0x005b, B:27:0x00b5, B:23:0x0099), top: B:87:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0154 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:8:0x0028, B:47:0x0173, B:49:0x017e, B:69:0x01fa, B:51:0x0195, B:52:0x01a5, B:54:0x01ab, B:57:0x01b7, B:61:0x01c1, B:63:0x01c5, B:64:0x01d1, B:65:0x01ec, B:15:0x0048, B:30:0x00d1, B:32:0x00f2, B:34:0x00fa, B:37:0x0105, B:39:0x011d, B:40:0x014e, B:43:0x0154, B:66:0x01ed, B:68:0x01f3, B:70:0x01fd, B:71:0x0204, B:72:0x0205, B:73:0x020a, B:18:0x005b, B:27:0x00b5, B:23:0x0099), top: B:87:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0170  */
    /* JADX WARN: Code duplicated, block: B:49:0x017e A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:8:0x0028, B:47:0x0173, B:49:0x017e, B:69:0x01fa, B:51:0x0195, B:52:0x01a5, B:54:0x01ab, B:57:0x01b7, B:61:0x01c1, B:63:0x01c5, B:64:0x01d1, B:65:0x01ec, B:15:0x0048, B:30:0x00d1, B:32:0x00f2, B:34:0x00fa, B:37:0x0105, B:39:0x011d, B:40:0x014e, B:43:0x0154, B:66:0x01ed, B:68:0x01f3, B:70:0x01fd, B:71:0x0204, B:72:0x0205, B:73:0x020a, B:18:0x005b, B:27:0x00b5, B:23:0x0099), top: B:87:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0195 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:8:0x0028, B:47:0x0173, B:49:0x017e, B:69:0x01fa, B:51:0x0195, B:52:0x01a5, B:54:0x01ab, B:57:0x01b7, B:61:0x01c1, B:63:0x01c5, B:64:0x01d1, B:65:0x01ec, B:15:0x0048, B:30:0x00d1, B:32:0x00f2, B:34:0x00fa, B:37:0x0105, B:39:0x011d, B:40:0x014e, B:43:0x0154, B:66:0x01ed, B:68:0x01f3, B:70:0x01fd, B:71:0x0204, B:72:0x0205, B:73:0x020a, B:18:0x005b, B:27:0x00b5, B:23:0x0099), top: B:87:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01ab A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:8:0x0028, B:47:0x0173, B:49:0x017e, B:69:0x01fa, B:51:0x0195, B:52:0x01a5, B:54:0x01ab, B:57:0x01b7, B:61:0x01c1, B:63:0x01c5, B:64:0x01d1, B:65:0x01ec, B:15:0x0048, B:30:0x00d1, B:32:0x00f2, B:34:0x00fa, B:37:0x0105, B:39:0x011d, B:40:0x014e, B:43:0x0154, B:66:0x01ed, B:68:0x01f3, B:70:0x01fd, B:71:0x0204, B:72:0x0205, B:73:0x020a, B:18:0x005b, B:27:0x00b5, B:23:0x0099), top: B:87:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01c5 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:8:0x0028, B:47:0x0173, B:49:0x017e, B:69:0x01fa, B:51:0x0195, B:52:0x01a5, B:54:0x01ab, B:57:0x01b7, B:61:0x01c1, B:63:0x01c5, B:64:0x01d1, B:65:0x01ec, B:15:0x0048, B:30:0x00d1, B:32:0x00f2, B:34:0x00fa, B:37:0x0105, B:39:0x011d, B:40:0x014e, B:43:0x0154, B:66:0x01ed, B:68:0x01f3, B:70:0x01fd, B:71:0x0204, B:72:0x0205, B:73:0x020a, B:18:0x005b, B:27:0x00b5, B:23:0x0099), top: B:87:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01d1 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:8:0x0028, B:47:0x0173, B:49:0x017e, B:69:0x01fa, B:51:0x0195, B:52:0x01a5, B:54:0x01ab, B:57:0x01b7, B:61:0x01c1, B:63:0x01c5, B:64:0x01d1, B:65:0x01ec, B:15:0x0048, B:30:0x00d1, B:32:0x00f2, B:34:0x00fa, B:37:0x0105, B:39:0x011d, B:40:0x014e, B:43:0x0154, B:66:0x01ed, B:68:0x01f3, B:70:0x01fd, B:71:0x0204, B:72:0x0205, B:73:0x020a, B:18:0x005b, B:27:0x00b5, B:23:0x0099), top: B:87:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01ed A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:8:0x0028, B:47:0x0173, B:49:0x017e, B:69:0x01fa, B:51:0x0195, B:52:0x01a5, B:54:0x01ab, B:57:0x01b7, B:61:0x01c1, B:63:0x01c5, B:64:0x01d1, B:65:0x01ec, B:15:0x0048, B:30:0x00d1, B:32:0x00f2, B:34:0x00fa, B:37:0x0105, B:39:0x011d, B:40:0x014e, B:43:0x0154, B:66:0x01ed, B:68:0x01f3, B:70:0x01fd, B:71:0x0204, B:72:0x0205, B:73:0x020a, B:18:0x005b, B:27:0x00b5, B:23:0x0099), top: B:87:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01f3 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:8:0x0028, B:47:0x0173, B:49:0x017e, B:69:0x01fa, B:51:0x0195, B:52:0x01a5, B:54:0x01ab, B:57:0x01b7, B:61:0x01c1, B:63:0x01c5, B:64:0x01d1, B:65:0x01ec, B:15:0x0048, B:30:0x00d1, B:32:0x00f2, B:34:0x00fa, B:37:0x0105, B:39:0x011d, B:40:0x014e, B:43:0x0154, B:66:0x01ed, B:68:0x01f3, B:70:0x01fd, B:71:0x0204, B:72:0x0205, B:73:0x020a, B:18:0x005b, B:27:0x00b5, B:23:0x0099), top: B:87:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01fd A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:8:0x0028, B:47:0x0173, B:49:0x017e, B:69:0x01fa, B:51:0x0195, B:52:0x01a5, B:54:0x01ab, B:57:0x01b7, B:61:0x01c1, B:63:0x01c5, B:64:0x01d1, B:65:0x01ec, B:15:0x0048, B:30:0x00d1, B:32:0x00f2, B:34:0x00fa, B:37:0x0105, B:39:0x011d, B:40:0x014e, B:43:0x0154, B:66:0x01ed, B:68:0x01f3, B:70:0x01fd, B:71:0x0204, B:72:0x0205, B:73:0x020a, B:18:0x005b, B:27:0x00b5, B:23:0x0099), top: B:87:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0205 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:8:0x0028, B:47:0x0173, B:49:0x017e, B:69:0x01fa, B:51:0x0195, B:52:0x01a5, B:54:0x01ab, B:57:0x01b7, B:61:0x01c1, B:63:0x01c5, B:64:0x01d1, B:65:0x01ec, B:15:0x0048, B:30:0x00d1, B:32:0x00f2, B:34:0x00fa, B:37:0x0105, B:39:0x011d, B:40:0x014e, B:43:0x0154, B:66:0x01ed, B:68:0x01f3, B:70:0x01fd, B:71:0x0204, B:72:0x0205, B:73:0x020a, B:18:0x005b, B:27:0x00b5, B:23:0x0099), top: B:87:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0218  */
    /* JADX WARN: Code duplicated, block: B:82:0x024d  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x011d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x01d1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x0218, please report this as an issue */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Throwable thB;
        p2 p2Var;
        Object value;
        a aVar;
        p2 p2Var2;
        Object value2;
        Object value3;
        int i14;
        Object objX;
        b0 b0Var;
        e eVar;
        List list;
        Object objX2;
        bu0.k kVar;
        a2 a2Var;
        Long l14;
        Long l15;
        Object objA;
        List list2;
        Object obj2;
        Long l16;
        o.a aVar2;
        Iterator it;
        Object next;
        o.a aVar3;
        Object c2168a;
        b0 b0Var2 = (b0) this.f113393g;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f113392f;
        e eVar2 = this.f113394h;
        try {
            if (i15 == 0) {
                r.b(obj);
                a2 a2Var2 = a2.RECORD_ACTIVITY;
                String str = "Starting initial state check with initialDeviceId=" + eVar2.f113380a;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "RecordActivityInitialStateCheckViewModel", str);
                p2 p2Var3 = eVar2.f113384e;
                do {
                    value3 = p2Var3.getValue();
                    ((d) value3).getClass();
                    i14 = 0;
                } while (!p2Var3.b(value3, new d(true, false, null)));
                int i16 = q.f128596b;
                u1 u1VarA = eVar2.f113383d.a();
                this.f113393g = b0Var2;
                this.f113387a = eVar2;
                this.f113388b = b0Var2;
                this.f113391e = 0;
                this.f113392f = 1;
                objX = s.x(u1VarA, this);
                if (objX != aVar4) {
                    b0Var = b0Var2;
                    eVar = eVar2;
                }
                return aVar4;
            }
            if (i15 == 1) {
                int i17 = this.f113391e;
                b0 b0Var3 = (b0) this.f113388b;
                e eVar3 = (e) this.f113387a;
                r.b(obj);
                i14 = i17;
                eVar = eVar3;
                objX = obj;
                b0Var = b0Var3;
            } else {
                if (i15 == 2) {
                    int i18 = this.f113391e;
                    List list3 = this.f113389c;
                    b0Var = (b0) this.f113388b;
                    eVar = (e) this.f113387a;
                    r.b(obj);
                    i14 = i18;
                    list = list3;
                    objX2 = obj;
                    kVar = (bu0.k) objX2;
                    a2Var = a2.RECORD_ACTIVITY;
                    l14 = eVar.f113380a;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "RecordActivityInitialStateCheckViewModel", "Initial device ID provided: " + l14);
                    if (l14 == null) {
                        aVar2 = (o.a) h0.K0(list);
                        if (aVar2 != null) {
                            l15 = new Long(aVar2.f204090a);
                        } else {
                            l15 = null;
                        }
                    } else {
                        l15 = l14;
                    }
                    i2.a.b(a2Var, "RecordActivityInitialStateCheckViewModel", "Selected device ID: " + l14);
                    if (kVar instanceof bu0.k.a) {
                        i2.a.b(a2Var, "RecordActivityInitialStateCheckViewModel", "Active session found for device ID " + ((bu0.k.a) kVar).f21212a + " (selected device ID " + l15 + "), navigating to Record Activity In Progress screen");
                        bVar = new a.b(((bu0.k.a) kVar).f21212a);
                    } else {
                        if (kVar instanceof bu0.k.b) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (l15 != null) {
                            fl1.b bVar2 = eVar.f113382c;
                            long jLongValue = l15.longValue();
                            this.f113393g = b0Var2;
                            this.f113387a = b0Var;
                            this.f113388b = list;
                            this.f113389c = null;
                            this.f113390d = l15;
                            this.f113391e = i14;
                            this.f113392f = 3;
                            objA = bVar2.a(jLongValue, this);
                            if (objA != aVar4) {
                                list2 = list;
                                obj2 = objA;
                                l16 = l15;
                            }
                            return aVar4;
                        }
                        if (!list.isEmpty()) {
                            throw new IllegalStateException("No start activity capable devices found");
                        }
                        i2.a.b(a2Var, "RecordActivityInitialStateCheckViewModel", "No device selected, but start activity capable devices found, navigating to Select Device screen");
                        bVar = a.d.f113369a;
                    }
                    int i19 = q.f128596b;
                    if (!(bVar instanceof q.b)) {
                        aVar = (a) bVar;
                        i2.f36769a.getClass();
                        i2.a.b(a2.RECORD_ACTIVITY, "RecordActivityInitialStateCheckViewModel", "Initial state check completed: loading=false, error=false, initialState=" + aVar);
                        p2Var2 = eVar2.f113384e;
                        do {
                            value2 = p2Var2.getValue();
                        } while (!p2Var2.b(value2, d.a((d) value2, aVar, 2)));
                    }
                    thB = q.b(bVar);
                    if (thB != null) {
                        a2 a2Var3 = a2.RECORD_ACTIVITY;
                        i2.f36769a.getClass();
                        i2.a.g(a2Var3, "RecordActivityInitialStateCheckViewModel", thB);
                        p2Var = eVar2.f113384e;
                        do {
                            value = p2Var.getValue();
                        } while (!p2Var.b(value, d.a((d) value, null, 4)));
                    }
                    return Unit.INSTANCE;
                }
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l16 = this.f113390d;
                list2 = (List) this.f113388b;
                r.b(obj);
                obj2 = ((q) obj).f128597a;
            }
            r.b(obj2);
            if (((Boolean) obj2).booleanValue()) {
                a2 a2Var4 = a2.RECORD_ACTIVITY;
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "RecordActivityInitialStateCheckViewModel", "Onboarding completed, navigating to Select Activity screen");
                c2168a = new a.c(l16.longValue());
            } else {
                a2 a2Var5 = a2.RECORD_ACTIVITY;
                i2.f36769a.getClass();
                i2.a.b(a2Var5, "RecordActivityInitialStateCheckViewModel", "Onboarding not completed, navigating to Onboarding flow");
                it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    long j8 = ((o.a) next).f204090a;
                    if (l16 != null && j8 == l16.longValue()) {
                        break;
                    }
                }
                aVar3 = (o.a) next;
                if (aVar3 != null) {
                    throw new IllegalStateException("Selected device ID " + l16 + " not found in start activity capable devices");
                }
                c2168a = new a.C2168a(l16.longValue(), aVar3.f204091b);
            }
            bVar = c2168a;
            int i110 = q.f128596b;
            if (!(bVar instanceof q.b)) {
                aVar = (a) bVar;
                i2.f36769a.getClass();
                i2.a.b(a2.RECORD_ACTIVITY, "RecordActivityInitialStateCheckViewModel", "Initial state check completed: loading=false, error=false, initialState=" + aVar);
                p2Var2 = eVar2.f113384e;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, d.a((d) value2, aVar, 2)));
            }
            thB = q.b(bVar);
            if (thB != null) {
                a2 a2Var6 = a2.RECORD_ACTIVITY;
                i2.f36769a.getClass();
                i2.a.g(a2Var6, "RecordActivityInitialStateCheckViewModel", thB);
                p2Var = eVar2.f113384e;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, d.a((d) value, null, 4)));
            }
            return Unit.INSTANCE;
            list = (List) objX;
            u1 u1VarA2 = eVar.f113381b.a();
            this.f113393g = b0Var2;
            this.f113387a = eVar;
            this.f113388b = b0Var;
            this.f113389c = list;
            this.f113391e = i14;
            this.f113392f = 2;
            objX2 = s.x(u1VarA2, this);
            if (objX2 != aVar4) {
                kVar = (bu0.k) objX2;
                a2Var = a2.RECORD_ACTIVITY;
                l14 = eVar.f113380a;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "RecordActivityInitialStateCheckViewModel", "Initial device ID provided: " + l14);
                if (l14 == null) {
                    aVar2 = (o.a) h0.K0(list);
                    if (aVar2 != null) {
                        l15 = new Long(aVar2.f204090a);
                    } else {
                        l15 = null;
                    }
                } else {
                    l15 = l14;
                }
                i2.a.b(a2Var, "RecordActivityInitialStateCheckViewModel", "Selected device ID: " + l14);
                if (kVar instanceof bu0.k.a) {
                    i2.a.b(a2Var, "RecordActivityInitialStateCheckViewModel", "Active session found for device ID " + ((bu0.k.a) kVar).f21212a + " (selected device ID " + l15 + "), navigating to Record Activity In Progress screen");
                    bVar = new a.b(((bu0.k.a) kVar).f21212a);
                } else {
                    if (kVar instanceof bu0.k.b) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (l15 != null) {
                        fl1.b bVar3 = eVar.f113382c;
                        long jLongValue2 = l15.longValue();
                        this.f113393g = b0Var2;
                        this.f113387a = b0Var;
                        this.f113388b = list;
                        this.f113389c = null;
                        this.f113390d = l15;
                        this.f113391e = i14;
                        this.f113392f = 3;
                        objA = bVar3.a(jLongValue2, this);
                        if (objA != aVar4) {
                            list2 = list;
                            obj2 = objA;
                            l16 = l15;
                            r.b(obj2);
                            if (((Boolean) obj2).booleanValue()) {
                                a2 a2Var7 = a2.RECORD_ACTIVITY;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var7, "RecordActivityInitialStateCheckViewModel", "Onboarding completed, navigating to Select Activity screen");
                                c2168a = new a.c(l16.longValue());
                            } else {
                                a2 a2Var8 = a2.RECORD_ACTIVITY;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var8, "RecordActivityInitialStateCheckViewModel", "Onboarding not completed, navigating to Onboarding flow");
                                it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    long j14 = ((o.a) next).f204090a;
                                    if (l16 != null) {
                                        break;
                                        break;
                                    }
                                }
                                aVar3 = (o.a) next;
                                if (aVar3 != null) {
                                    throw new IllegalStateException("Selected device ID " + l16 + " not found in start activity capable devices");
                                }
                                c2168a = new a.C2168a(l16.longValue(), aVar3.f204091b);
                            }
                            bVar = c2168a;
                        }
                    } else {
                        if (!list.isEmpty()) {
                            throw new IllegalStateException("No start activity capable devices found");
                        }
                        i2.a.b(a2Var, "RecordActivityInitialStateCheckViewModel", "No device selected, but start activity capable devices found, navigating to Select Device screen");
                        bVar = a.d.f113369a;
                    }
                }
                int i111 = q.f128596b;
                if (!(bVar instanceof q.b)) {
                    aVar = (a) bVar;
                    i2.f36769a.getClass();
                    i2.a.b(a2.RECORD_ACTIVITY, "RecordActivityInitialStateCheckViewModel", "Initial state check completed: loading=false, error=false, initialState=" + aVar);
                    p2Var2 = eVar2.f113384e;
                    do {
                        value2 = p2Var2.getValue();
                    } while (!p2Var2.b(value2, d.a((d) value2, aVar, 2)));
                }
                thB = q.b(bVar);
                if (thB != null) {
                    a2 a2Var9 = a2.RECORD_ACTIVITY;
                    i2.f36769a.getClass();
                    i2.a.g(a2Var9, "RecordActivityInitialStateCheckViewModel", thB);
                    p2Var = eVar2.f113384e;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, d.a((d) value, null, 4)));
                }
                return Unit.INSTANCE;
            }
            return aVar4;
        } catch (Throwable th3) {
            int i24 = q.f128596b;
            bVar = new q.b(th3);
        }
    }
}
