package gv0;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.livetrackui.data.exception.AddContactException;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$replaceRecipient$1", f = "LiveTrackSettingsViewModel.kt", l = {580, 583, 590, 591}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f79391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pu0.b f79392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pu0.b f79393d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(d dVar, pu0.b bVar, pu0.b bVar2, t13.d<? super u> dVar2) {
        super(2, dVar2);
        this.f79391b = dVar;
        this.f79392c = bVar;
        this.f79393d = bVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f79391b, this.f79392c, this.f79393d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0109 A[Catch: AddContactException -> 0x001d, TryCatch #0 {AddContactException -> 0x001d, blocks: (B:8:0x0016, B:51:0x0101, B:53:0x0109, B:54:0x010b, B:56:0x0122, B:57:0x0136, B:58:0x0138, B:14:0x0028, B:45:0x00e1, B:15:0x002f, B:37:0x00c2, B:39:0x00ca, B:42:0x00d6, B:46:0x00e8, B:48:0x00ec, B:61:0x0152, B:62:0x0157, B:63:0x0158, B:64:0x015a, B:16:0x0036, B:27:0x0071, B:21:0x005b, B:24:0x0065, B:28:0x0078, B:30:0x007c, B:31:0x008d, B:33:0x0093, B:34:0x00a3, B:67:0x0174, B:68:0x0179), top: B:74:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0136 A[Catch: AddContactException -> 0x001d, TryCatch #0 {AddContactException -> 0x001d, blocks: (B:8:0x0016, B:51:0x0101, B:53:0x0109, B:54:0x010b, B:56:0x0122, B:57:0x0136, B:58:0x0138, B:14:0x0028, B:45:0x00e1, B:15:0x002f, B:37:0x00c2, B:39:0x00ca, B:42:0x00d6, B:46:0x00e8, B:48:0x00ec, B:61:0x0152, B:62:0x0157, B:63:0x0158, B:64:0x015a, B:16:0x0036, B:27:0x0071, B:21:0x005b, B:24:0x0065, B:28:0x0078, B:30:0x007c, B:31:0x008d, B:33:0x0093, B:34:0x00a3, B:67:0x0174, B:68:0x0179), top: B:74:0x000c }] */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fe, code lost:
    
        if (r2 == r0) goto L50;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        T t7;
        Object objF;
        Object objA;
        boolean zBooleanValue;
        Object value3;
        Object objI;
        Object objO;
        boolean zBooleanValue2;
        p2 p2Var;
        Object value4;
        p2 p2Var2;
        Object value5;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f79390a;
        d dVar = this.f79391b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2Var3 = dVar.f79198o;
                hl.a aVar2 = dVar.f79188f;
                do {
                    value2 = p2Var3.getValue();
                    g3.a aVar3 = g3.f35298f;
                    t7 = ((g3) value2).f35301b;
                    aVar3.getClass();
                } while (!p2Var3.b(value2, g3.a.b(t7)));
                boolean zG = p005kotlin.jvm.internal.s.g(aVar2, hl.a.c.f84256b);
                pu0.b bVar = this.f79392c;
                if (zG) {
                    su0.t tVar = su0.t.f161004a;
                    this.f79390a = 1;
                    objA = tVar.a(bVar, this);
                    if (objA != aVar) {
                        zBooleanValue = ((Boolean) objA).booleanValue();
                    }
                } else {
                    if (!(aVar2 instanceof hl.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<pu0.f> list = bVar.f141186d;
                    ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(pu0.f.a((pu0.f) it.next(), pu0.g.a.f141234a));
                    }
                    pu0.b bVarA = pu0.b.a(bVar, arrayList, null, null, null, null, null, 65527);
                    kd0.m0 f104149f = dVar.f79184b.getF104149f();
                    long j8 = ((hl.a.b) aVar2).f84252b;
                    this.f79390a = 2;
                    objF = f104149f.f(j8, bVarA, this);
                    if (objF != aVar) {
                        zBooleanValue = ((Boolean) objF).booleanValue();
                    }
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objA = obj;
                zBooleanValue = ((Boolean) objA).booleanValue();
            } else {
                if (i14 != 2) {
                    if (i14 == 3) {
                        o13.r.b(obj);
                        objO = obj;
                        zBooleanValue2 = ((Boolean) objO).booleanValue();
                        if (zBooleanValue2) {
                            p2Var2 = dVar.f79198o;
                            do {
                                value5 = p2Var2.getValue();
                                g3.f35298f.getClass();
                            } while (!p2Var2.b(value5, g3.a.d(null)));
                            dVar.G4();
                            dVar.f79184b.getF104151h().getClass();
                            yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                        } else {
                            p2Var = dVar.f79198o;
                            do {
                                value4 = p2Var.getValue();
                            } while (!p2Var.b(value4, g3.a.a(g3.f35298f, null, null, null, null, 15)));
                        }
                        return Unit.INSTANCE;
                    }
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                    objI = obj;
                    zBooleanValue2 = ((Boolean) objI).booleanValue();
                    if (zBooleanValue2) {
                        p2Var2 = dVar.f79198o;
                        do {
                            value5 = p2Var2.getValue();
                            g3.f35298f.getClass();
                        } while (!p2Var2.b(value5, g3.a.d(null)));
                        dVar.G4();
                        dVar.f79184b.getF104151h().getClass();
                        yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                    } else {
                        p2Var = dVar.f79198o;
                        do {
                            value4 = p2Var.getValue();
                        } while (!p2Var.b(value4, g3.a.a(g3.f35298f, null, null, null, null, 15)));
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                objF = obj;
                zBooleanValue = ((Boolean) objF).booleanValue();
            }
            if (zBooleanValue) {
                hl.a aVar4 = dVar.f79188f;
                boolean zG2 = p005kotlin.jvm.internal.s.g(aVar4, hl.a.c.f84256b);
                pu0.b bVar2 = this.f79393d;
                if (zG2) {
                    su0.t tVar2 = su0.t.f161004a;
                    this.f79390a = 3;
                    objO = tVar2.o(bVar2, this);
                    if (objO == aVar) {
                    }
                    zBooleanValue2 = ((Boolean) objO).booleanValue();
                    if (zBooleanValue2) {
                        p2Var2 = dVar.f79198o;
                        do {
                            value5 = p2Var2.getValue();
                            g3.f35298f.getClass();
                        } while (!p2Var2.b(value5, g3.a.d(null)));
                        dVar.G4();
                        dVar.f79184b.getF104151h().getClass();
                        yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                    } else {
                        p2Var = dVar.f79198o;
                        do {
                            value4 = p2Var.getValue();
                        } while (!p2Var.b(value4, g3.a.a(g3.f35298f, null, null, null, null, 15)));
                    }
                } else {
                    if (!(aVar4 instanceof hl.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kd0.m0 f104149f2 = dVar.f79184b.getF104149f();
                    long j14 = ((hl.a.b) dVar.f79188f).f84252b;
                    this.f79390a = 4;
                    objI = f104149f2.i(j14, bVar2, this);
                }
                return aVar;
            }
            p2 p2Var4 = dVar.f79198o;
            do {
                value3 = p2Var4.getValue();
            } while (!p2Var4.b(value3, g3.a.a(g3.f35298f, null, null, null, null, 15)));
        } catch (AddContactException e4) {
            p2 p2Var5 = dVar.f79198o;
            do {
                value = p2Var5.getValue();
            } while (!p2Var5.b(value, g3.a.a(g3.f35298f, null, e4, null, null, 13)));
        }
        return Unit.INSTANCE;
    }
}
