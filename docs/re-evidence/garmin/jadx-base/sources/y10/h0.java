package y10;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQStorageManagementViewModel$appUpdates$1", f = "ConnectIQStorageManagementViewModel.kt", l = {46, 56}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f193872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f193873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f193874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map<String, o10.b> f193875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f193876e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo10/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQStorageManagementViewModel$appUpdates$1$iconResult$1", f = "ConnectIQStorageManagementViewModel.kt", l = {57}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends o10.b>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k0 f193878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map<String, o10.b> f193879c;

        /* JADX INFO: renamed from: y10.h0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo10/b;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQStorageManagementViewModel$appUpdates$1$iconResult$1$1", f = "ConnectIQStorageManagementViewModel.kt", l = {57}, m = "invokeSuspend", v = 2)
        public static final class C3618a extends v13.i implements e23.l<t13.d<? super v2<? extends List<? extends o10.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f193880a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f193881b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Map<String, o10.b> f193882c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3618a(k0 k0Var, Map<String, o10.b> map, t13.d<? super C3618a> dVar) {
                super(1, dVar);
                this.f193881b = k0Var;
                this.f193882c = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new C3618a(this.f193881b, this.f193882c, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super v2<? extends List<? extends o10.b>>> dVar) {
                return ((C3618a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f193880a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f193880a = 1;
                    Object objX4 = k0.x4(this.f193881b, this.f193882c, this);
                    return objX4 == aVar ? aVar : objX4;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k0 k0Var, Map<String, o10.b> map, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f193878b = k0Var;
            this.f193879c = map;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f193878b, this.f193879c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends o10.b>>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193877a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            C3618a c3618a = new C3618a(this.f193878b, this.f193879c, null);
            this.f193877a = 1;
            Object objA = p10.e.a(c3618a, "Error occurred", this);
            return objA == aVar ? aVar : objA;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo10/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQStorageManagementViewModel$appUpdates$1$result$1", f = "ConnectIQStorageManagementViewModel.kt", l = {47}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends o10.b>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k0 f193884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map<String, o10.b> f193885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f193886d;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo10/b;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQStorageManagementViewModel$appUpdates$1$result$1$1", f = "ConnectIQStorageManagementViewModel.kt", l = {48}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.l<t13.d<? super v2<? extends List<? extends o10.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f193887a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f193888b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Map<String, o10.b> f193889c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f193890d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k0 k0Var, Map<String, o10.b> map, String str, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f193888b = k0Var;
                this.f193889c = map;
                this.f193890d = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f193888b, this.f193889c, this.f193890d, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super v2<? extends List<? extends o10.b>>> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f193887a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                ArrayList arrayList = new ArrayList(this.f193889c.values());
                this.f193887a = 1;
                Object objY4 = k0.y4(this.f193888b, arrayList, this.f193890d, this);
                return objY4 == aVar ? aVar : objY4;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k0 k0Var, Map<String, o10.b> map, String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f193884b = k0Var;
            this.f193885c = map;
            this.f193886d = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f193884b, this.f193885c, this.f193886d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends o10.b>>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193883a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            a aVar2 = new a(this.f193884b, this.f193885c, this.f193886d, null);
            this.f193883a = 1;
            Object objA = p10.e.a(aVar2, "Error occurred", this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, Map<String, o10.b> map, String str, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f193874c = k0Var;
        this.f193875d = map;
        this.f193876e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f193874c, this.f193875d, this.f193876e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:30:0x0107  */
    /* JADX WARN: Code duplicated, block: B:32:0x010b  */
    /* JADX WARN: Code duplicated, block: B:34:0x010f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0113  */
    /* JADX WARN: Code duplicated, block: B:38:0x012a  */
    /* JADX WARN: Code duplicated, block: B:39:0x012c  */
    /* JADX WARN: Code duplicated, block: B:41:0x013a  */
    /* JADX WARN: Code duplicated, block: B:43:0x013e  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        Object objE1;
        v2 v2Var;
        v2 v2Var2;
        y0<m0> y0Var;
        String message;
        String str;
        y0<m0> y0Var2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f193873b;
        Map<String, o10.b> map = this.f193875d;
        k0 k0Var = this.f193874c;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            b bVar2 = new b(k0Var, map, this.f193876e, null);
            this.f193873b = 1;
            objE0 = ge1.b.e0(bVar, bVar2, this);
            if (objE0 != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objE0 = obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = this.f193872a;
            o13.r.b(obj);
            objE1 = obj;
        }
        v2Var2 = (v2) objE1;
        if (v2Var2 instanceof v2.b) {
            y0Var2 = k0Var.f193933a;
            if (y0Var2 != null) {
                p005kotlin.jvm.internal.s.m("connectIQLiveData");
                throw null;
            }
            y0Var2.m(new m0(g0.APP_UPDATES_DOWNLOADED, new Integer(((v2.b) v2Var2).f47387b), new ArrayList(map.values()), null, null, 24, null));
        } else {
            if (v2Var2 instanceof v2.a) {
                u0.r();
                return null;
            }
            y0Var = k0Var.f193933a;
            if (y0Var != null) {
                p005kotlin.jvm.internal.s.m("connectIQLiveData");
                throw null;
            }
            g0 g0Var = g0.ERROR;
            Integer num = new Integer(((v2.b) v2Var).f47387b);
            message = ((v2.a) v2Var2).f47383a.getMessage();
            if (message == null) {
                str = "";
            } else {
                str = message;
            }
            y0Var.m(new m0(g0Var, num, null, str, null, 20, null));
        }
        return Unit.INSTANCE;
        v2 v2Var3 = (v2) objE0;
        if (v2Var3 instanceof v2.b) {
            v2.b bVar3 = (v2.b) v2Var3;
            List<o10.b> list = (List) bVar3.f47386a;
            k0Var.getClass();
            for (o10.b bVar4 : list) {
                o10.b bVar5 = map.get(bVar4.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String());
                if (bVar5 != null) {
                    bVar5.c0(bVar4.getName());
                    bVar5.F(bVar4.getDeveloperName());
                    bVar5.g0(bVar4.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String());
                    bVar5.f0(bVar4.getSize());
                    bVar5.a0(bVar4.getInternalVersion());
                    bVar5.i0(bVar4.getVersionName());
                    bVar5.Z(bVar4.getInstalled());
                    bVar5.G(bVar4.getDisabled());
                    bVar5.h0(bVar4.getUpdateAvailable());
                    bVar5.e0(bVar4.getNativeAppSourceId());
                    bVar5.I(bVar4.getHasSettings());
                    bVar5.H(bVar4.A());
                }
            }
            x53.c cVar2 = s0.f129406a;
            x53.b bVar6 = x53.b.f189152a;
            a aVar2 = new a(k0Var, map, null);
            this.f193872a = bVar3;
            this.f193873b = 2;
            objE1 = ge1.b.e0(bVar6, aVar2, this);
            if (objE1 != aVar) {
                v2Var = v2Var3;
                v2Var2 = (v2) objE1;
                if (v2Var2 instanceof v2.b) {
                    y0Var2 = k0Var.f193933a;
                    if (y0Var2 != null) {
                        p005kotlin.jvm.internal.s.m("connectIQLiveData");
                        throw null;
                    }
                    y0Var2.m(new m0(g0.APP_UPDATES_DOWNLOADED, new Integer(((v2.b) v2Var2).f47387b), new ArrayList(map.values()), null, null, 24, null));
                } else {
                    if (v2Var2 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    y0Var = k0Var.f193933a;
                    if (y0Var != null) {
                        p005kotlin.jvm.internal.s.m("connectIQLiveData");
                        throw null;
                    }
                    g0 g0Var2 = g0.ERROR;
                    Integer num2 = new Integer(((v2.b) v2Var).f47387b);
                    message = ((v2.a) v2Var2).f47383a.getMessage();
                    if (message == null) {
                        str = "";
                    } else {
                        str = message;
                    }
                    y0Var.m(new m0(g0Var2, num2, null, str, null, 20, null));
                }
            }
            return aVar;
        }
        if (!(v2Var3 instanceof v2.a)) {
            u0.r();
            return null;
        }
        y0<m0> y0Var3 = k0Var.f193933a;
        if (y0Var3 == null) {
            p005kotlin.jvm.internal.s.m("connectIQLiveData");
            throw null;
        }
        g0 g0Var3 = g0.ERROR;
        v2.a aVar3 = (v2.a) v2Var3;
        Integer num3 = aVar3.f47384b;
        String message2 = aVar3.f47383a.getMessage();
        y0Var3.m(new m0(g0Var3, num3, null, message2 == null ? "" : message2, null, 20, null));
        return Unit.INSTANCE;
    }
}
