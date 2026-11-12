package cn2;

import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import e23.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u53.o;
import v13.e;
import v13.i;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.garmin.device.sharing.management.broadcasts.SharedDeviceBroadcastReceiver$onDeviceRemoved$1", f = "SharedDeviceBroadcastReceiver.kt", l = {171, 177}, m = "invokeSuspend")
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f28080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f28081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f28083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f28084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f28085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f28086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f28087h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.garmin.device.sharing.management.broadcasts.SharedDeviceBroadcastReceiver$onDeviceRemoved$1$3", f = "SharedDeviceBroadcastReceiver.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f28088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f28089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f28091d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, long j8, String str, boolean z14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f28088a = bVar;
            this.f28089b = j8;
            this.f28090c = str;
            this.f28091d = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f28088a, this.f28089b, this.f28090c, this.f28091d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f28088a.f28073c.f(this.f28089b, this.f28090c, this.f28091d);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, boolean z14, long j8, String str, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f28084e = bVar;
        this.f28085f = z14;
        this.f28086g = j8;
        this.f28087h = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f28084e, this.f28085f, this.f28086g, this.f28087h, dVar);
        cVar.f28083d = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[LOOP:0: B:27:0x009e->B:37:?, LOOP_END, SYNTHETIC] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        HashSet hashSet;
        HashSet hashSet2;
        long j8;
        Iterator it;
        b bVar;
        b0 b0Var2;
        SharedDeviceInfo sharedDeviceInfo;
        dn2.i iVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f28082c;
        b bVar2 = this.f28084e;
        if (i14 == 0) {
            r.b(obj);
            b0Var = (b0) this.f28083d;
            hashSet = new HashSet();
            an2.a.e eVar = bVar2.f28073c;
            this.f28083d = b0Var;
            this.f28080a = hashSet;
            this.f28081b = hashSet;
            this.f28082c = 1;
            obj = eVar.a(this);
            if (obj != aVar) {
                hashSet2 = hashSet;
            }
            return aVar;
        }
        if (i14 == 1) {
            hashSet = (HashSet) this.f28081b;
            hashSet2 = (HashSet) this.f28080a;
            b0Var = (b0) this.f28083d;
            r.b(obj);
        } else {
            if (i14 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.f28081b;
            b bVar3 = (b) this.f28080a;
            b0Var2 = (b0) this.f28083d;
            r.b(obj);
            bVar = bVar3;
        }
        while (it.hasNext()) {
            sharedDeviceInfo = (SharedDeviceInfo) it.next();
            iVar = bVar.f28073c.f4509a;
            this.f28083d = b0Var2;
            this.f28080a = bVar;
            this.f28081b = it;
            this.f28082c = 2;
            if (iVar.g(sharedDeviceInfo, this) == aVar) {
                return aVar;
            }
        }
        x53.c cVar = s0.f129406a;
        ge1.b.T(b0Var2, o.f168762a, null, new a(this.f28084e, this.f28086g, this.f28087h, this.f28085f, null), 2);
        return Unit.INSTANCE;
        ArrayList arrayList = new ArrayList();
        Iterator it3 = ((Iterable) obj).iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            j8 = this.f28086g;
            if (!zHasNext) {
                break;
            }
            Object next = it3.next();
            if (((SharedDeviceInfo) next).getUnitID() == j8) {
                arrayList.add(next);
            }
        }
        hashSet.addAll(arrayList);
        if (this.f28085f && hashSet2.isEmpty()) {
            Set<String> set = b.f28070i;
            g.w("ignoring ACTION_DEVICE_REMOVED for unknown device ", j8, bVar2.a());
            return Unit.INSTANCE;
        }
        it = hashSet2.iterator();
        bVar = bVar2;
        b0Var2 = b0Var;
        while (it.hasNext()) {
            sharedDeviceInfo = (SharedDeviceInfo) it.next();
            iVar = bVar.f28073c.f4509a;
            this.f28083d = b0Var2;
            this.f28080a = bVar;
            this.f28081b = it;
            this.f28082c = 2;
            if (iVar.g(sharedDeviceInfo, this) == aVar) {
                return aVar;
            }
        }
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(b0Var2, o.f168762a, null, new a(this.f28084e, this.f28086g, this.f28087h, this.f28085f, null), 2);
        return Unit.INSTANCE;
    }
}
