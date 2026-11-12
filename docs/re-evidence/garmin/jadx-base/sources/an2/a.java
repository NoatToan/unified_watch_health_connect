package an2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import ch.qos.logback.core.CoreConstants;
import com.garmin.device.sharing.management.bluetooth.BluetoothHelper;
import com.garmin.device.sharing.management.dtos.BluetoothConnectionType;
import com.garmin.device.sharing.management.dtos.ConnectionInfoDto;
import com.garmin.device.sharing.management.dtos.GarminBondingInfo;
import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o13.m;
import o13.r;
import o13.t;
import o53.a0;
import o53.b0;
import o53.c0;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.a1;
import p13.h0;
import p13.l0;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lan2/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lan2/a$e;", "config", "Lbn2/c;", "btHelper", "<init>", "(Landroid/content/Context;Lan2/a$e;Lbn2/c;)V", "(Landroid/content/Context;Lan2/a$e;)V", "b", "d", JWKParameterNames.RSA_EXPONENT, "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f4492e = new d(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f4493f = m.b(c.f4508a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f4494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bn2.c f4495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"UseSparseArrays"})
    public final HashMap<Long, Collection<SharedDeviceInfo>> f4496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u53.d f4497d;

    /* JADX INFO: renamed from: an2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcn2/a;", "it", "", "invoke", "(Lcn2/a;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C0070a extends w implements e23.l<cn2.a, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0070a f4498a = new C0070a();

        public C0070a() {
            super(1);
        }

        @Override // e23.l
        public final CharSequence invoke(cn2.a aVar) {
            cn2.a aVar2 = aVar;
            aVar2.getClass();
            return aVar2.name();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lan2/a$b;", "Lbn2/b;", "<init>", "(Lan2/a;)V", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b implements bn2.b {

        /* JADX INFO: renamed from: an2.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
        @v13.e(c = "com.garmin.device.sharing.management.SharedDeviceManager$BondingListener$eventBondStateChange$1", f = "SharedDeviceManager.kt", l = {763, 767, 775}, m = "invokeSuspend")
        public static final class C0071a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public r0 f4500a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public HashSet f4501b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public SharedDeviceInfo f4502c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f4503d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f4504e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ int f4505f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ BluetoothDevice f4506g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ b f4507h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0071a(a aVar, int i14, BluetoothDevice bluetoothDevice, b bVar, t13.d<? super C0071a> dVar) {
                super(2, dVar);
                this.f4504e = aVar;
                this.f4505f = i14;
                this.f4506g = bluetoothDevice;
                this.f4507h = bVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C0071a(this.f4504e, this.f4505f, this.f4506g, this.f4507h, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C0071a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:68:0x0149, code lost:
            
                if (an2.a.b.a(r5, r9, r11, r3, r10, r6, r3, r15) == r8) goto L69;
             */
            /* JADX WARN: Type inference failed for: r0v8, types: [T, java.util.ArrayList] */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object next;
                Object objA;
                HashSet hashSet;
                SharedDeviceInfo sharedDeviceInfo;
                r0 r0Var;
                Object next2;
                Object next3;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f4503d;
                try {
                    if (i14 == 0) {
                        r.b(obj);
                        r0 r0Var2 = new r0();
                        a aVar2 = this.f4504e;
                        synchronized (aVar2.f4496c) {
                            Collection<Collection<SharedDeviceInfo>> collectionValues = aVar2.f4496c.values();
                            collectionValues.getClass();
                            r0Var2.f105810a = y.s(collectionValues);
                            Unit unit = Unit.INSTANCE;
                        }
                        HashSet hashSet2 = new HashSet();
                        if (this.f4505f == 12) {
                            hashSet2.add(this.f4506g.getAddress());
                        }
                        Iterable iterable = (Iterable) r0Var2.f105810a;
                        BluetoothDevice bluetoothDevice = this.f4506g;
                        Iterator it = iterable.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!s.g(((SharedDeviceInfo) next).getMacAddress(), bluetoothDevice.getAddress()));
                        SharedDeviceInfo sharedDeviceInfo2 = (SharedDeviceInfo) next;
                        e eVar = this.f4504e.f4494a;
                        this.f4500a = r0Var2;
                        this.f4501b = hashSet2;
                        this.f4502c = sharedDeviceInfo2;
                        this.f4503d = 1;
                        objA = eVar.a(this);
                        if (objA != aVar) {
                            hashSet = hashSet2;
                            sharedDeviceInfo = sharedDeviceInfo2;
                            r0Var = r0Var2;
                        }
                        return aVar;
                    }
                    if (i14 != 1) {
                        if (i14 == 2) {
                            r.b(obj);
                            return Unit.INSTANCE;
                        }
                        if (i14 == 3) {
                            r.b(obj);
                            return Unit.INSTANCE;
                        }
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sharedDeviceInfo = this.f4502c;
                    HashSet hashSet3 = this.f4501b;
                    r0 r0Var3 = this.f4500a;
                    r.b(obj);
                    r0Var = r0Var3;
                    hashSet = hashSet3;
                    objA = obj;
                    List list = (List) objA;
                    BluetoothDevice bluetoothDevice2 = this.f4506g;
                    Iterator it3 = list.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!s.g(((SharedDeviceInfo) next2).getMacAddress(), bluetoothDevice2.getAddress()));
                    SharedDeviceInfo sharedDeviceInfo3 = (SharedDeviceInfo) next2;
                    if (sharedDeviceInfo != null) {
                        if (sharedDeviceInfo.doesConnectionTypeMatch(sharedDeviceInfo3 != null ? sharedDeviceInfo3.getConnectionType() : null)) {
                            SharedDeviceInfo sharedDeviceInfo4 = sharedDeviceInfo;
                            b bVar = this.f4507h;
                            int i15 = this.f4505f;
                            Collection collection = (Collection) r0Var.f105810a;
                            this.f4500a = null;
                            this.f4501b = null;
                            this.f4502c = null;
                            this.f4503d = 2;
                            if (b.a(bVar, sharedDeviceInfo4, sharedDeviceInfo3, hashSet, i15, collection, list, this) == aVar) {
                            }
                            return Unit.INSTANCE;
                        }
                        return aVar;
                    }
                    HashSet hashSet4 = hashSet;
                    if (sharedDeviceInfo3 != null) {
                        Iterator it4 = ((Iterable) r0Var.f105810a).iterator();
                        do {
                            if (!it4.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it4.next();
                        } while (((SharedDeviceInfo) next3).getUnitID() != sharedDeviceInfo3.getUnitID());
                        SharedDeviceInfo sharedDeviceInfo5 = (SharedDeviceInfo) next3;
                        if (sharedDeviceInfo5 != null) {
                            b bVar2 = this.f4507h;
                            int i16 = this.f4505f;
                            Collection collection2 = (Collection) r0Var.f105810a;
                            this.f4500a = null;
                            this.f4501b = null;
                            this.f4502c = null;
                            this.f4503d = 3;
                        }
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    d.a(a.f4492e).error("failed to process changed bond state", th3);
                }
                return Unit.INSTANCE;
            }
        }

        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0117, code lost:
        
            if (r0.c(r1, null, r5, null, r8) == r2) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0185, code lost:
        
            if (r0.c(r3, r1, r5, null, r8) == r2) goto L76;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object a(b bVar, SharedDeviceInfo sharedDeviceInfo, SharedDeviceInfo sharedDeviceInfo2, HashSet hashSet, int i14, Collection collection, List list, v13.c cVar) {
            an2.b bVar2;
            List list2;
            b bVar3;
            int i15;
            SharedDeviceInfo sharedDeviceInfo3;
            SharedDeviceInfo sharedDeviceInfo4;
            HashSet hashSet2;
            Collection collection2;
            Integer connectionType;
            Integer connectionType2;
            Object next;
            Integer connectionType3;
            Object next2;
            Integer connectionType4;
            bVar.getClass();
            if (cVar instanceof an2.b) {
                bVar2 = (an2.b) cVar;
                int i16 = bVar2.f4537j;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    bVar2.f4537j = i16 - Integer.MIN_VALUE;
                } else {
                    bVar2 = new an2.b(bVar, cVar);
                }
            } else {
                bVar2 = new an2.b(bVar, cVar);
            }
            an2.b bVar4 = bVar2;
            Object obj = bVar4.f4535h;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i17 = bVar4.f4537j;
            if (i17 == 0) {
                r.b(obj);
                a aVar2 = a.this;
                bVar4.f4528a = bVar;
                bVar4.f4529b = sharedDeviceInfo;
                bVar4.f4530c = sharedDeviceInfo2;
                bVar4.f4531d = hashSet;
                bVar4.f4532e = collection;
                list2 = list;
                bVar4.f4533f = list2;
                bVar4.f4534g = i14;
                bVar4.f4537j = 1;
                if (aVar2.c(sharedDeviceInfo, sharedDeviceInfo2, hashSet, null, bVar4) != aVar) {
                    bVar3 = bVar;
                    i15 = i14;
                    sharedDeviceInfo3 = sharedDeviceInfo;
                    sharedDeviceInfo4 = sharedDeviceInfo2;
                    hashSet2 = hashSet;
                    collection2 = collection;
                }
                return aVar;
            }
            if (i17 != 1) {
                if (i17 == 2) {
                    r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i17 == 3) {
                    r.b(obj);
                    return Unit.INSTANCE;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i15 = bVar4.f4534g;
            List list3 = bVar4.f4533f;
            collection2 = bVar4.f4532e;
            hashSet2 = bVar4.f4531d;
            sharedDeviceInfo4 = bVar4.f4530c;
            sharedDeviceInfo3 = bVar4.f4529b;
            bVar3 = bVar4.f4528a;
            r.b(obj);
            list2 = list3;
            if (a.this.f4494a.f4511c.size() > 1 && (((connectionType = sharedDeviceInfo3.getConnectionType()) != null && connectionType.intValue() == 2) || (sharedDeviceInfo4 != null && (connectionType2 = sharedDeviceInfo4.getConnectionType()) != null && connectionType2.intValue() == 2))) {
                if (i15 == 10) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        SharedDeviceInfo sharedDeviceInfo5 = (SharedDeviceInfo) next;
                        if (sharedDeviceInfo5.getUnitID() == sharedDeviceInfo3.getUnitID() && (connectionType3 = sharedDeviceInfo5.getConnectionType()) != null && connectionType3.intValue() == 1) {
                            break;
                        }
                    }
                    SharedDeviceInfo sharedDeviceInfo6 = (SharedDeviceInfo) next;
                    if (sharedDeviceInfo6 != null) {
                        a aVar3 = a.this;
                        SharedDeviceInfo sharedDeviceInfoBuild = new SharedDeviceInfo.Builder(sharedDeviceInfo3, (ConnectionInfoDto) null).build();
                        SharedDeviceInfo sharedDeviceInfoBuild2 = new SharedDeviceInfo.Builder(sharedDeviceInfo6).clearGarminAuth().build();
                        bVar4.f4528a = null;
                        bVar4.f4529b = null;
                        bVar4.f4530c = null;
                        bVar4.f4531d = null;
                        bVar4.f4532e = null;
                        bVar4.f4533f = null;
                        bVar4.f4537j = 3;
                    }
                } else if (i15 == 12) {
                    Iterator it3 = collection2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        SharedDeviceInfo sharedDeviceInfo7 = (SharedDeviceInfo) next2;
                        if (sharedDeviceInfo7.getUnitID() == sharedDeviceInfo3.getUnitID() && (connectionType4 = sharedDeviceInfo7.getConnectionType()) != null && connectionType4.intValue() == 1) {
                            break;
                        }
                    }
                    SharedDeviceInfo sharedDeviceInfo8 = (SharedDeviceInfo) next2;
                    if (sharedDeviceInfo8 != null) {
                        a aVar4 = a.this;
                        bVar4.f4528a = null;
                        bVar4.f4529b = null;
                        bVar4.f4530c = null;
                        bVar4.f4531d = null;
                        bVar4.f4532e = null;
                        bVar4.f4533f = null;
                        bVar4.f4537j = 2;
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // bn2.b
        public final void f6(BluetoothDevice bluetoothDevice, int i14, int i15) {
            if (i14 == 12 || i14 == 10) {
                a aVar = a.this;
                if (aVar.f4494a.d()) {
                    d.a(a.f4492e).debug("ignoring bond change during user pair flow");
                } else {
                    ge1.b.T(aVar.f4497d, null, null, new C0071a(aVar, i14, bluetoothDevice, this, null), 3);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f4508a = new c();

        public c() {
            super(0);
        }

        @Override // e23.a
        public final Logger invoke() {
            l.f4589a.getClass();
            return LoggerFactory.getLogger("DM#".concat("SharedDeviceManager"));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.device.sharing.management.SharedDeviceManager$uploadNewDeviceInfo$1", f = "SharedDeviceManager.kt", l = {657}, m = "invokeSuspend")
    public static final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f4520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f4521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ byte[] f4522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Integer f4523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ byte[] f4524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f4525g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f4526h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ dn2.j f4527i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(byte[] bArr, byte[] bArr2, byte[] bArr3, Integer num, byte[] bArr4, long j8, String str, dn2.j jVar, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f4520b = bArr;
            this.f4521c = bArr2;
            this.f4522d = bArr3;
            this.f4523e = num;
            this.f4524f = bArr4;
            this.f4525g = j8;
            this.f4526h = str;
            this.f4527i = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f4520b, this.f4521c, this.f4522d, this.f4523e, this.f4524f, this.f4525g, this.f4526h, this.f4527i, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            GarminBondingInfo garminBondingInfo;
            byte[] bArr;
            byte[] bArr2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f4519a;
            String str = this.f4526h;
            long j8 = this.f4525g;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    byte[] bArr3 = this.f4520b;
                    if (bArr3 == null || (bArr = this.f4521c) == null || (bArr2 = this.f4522d) == null) {
                        garminBondingInfo = null;
                    } else {
                        fn2.a.f72254a.getClass();
                        garminBondingInfo = new GarminBondingInfo(fn2.a.b(bArr3), fn2.a.b(bArr), fn2.a.b(bArr2));
                    }
                    Integer num = this.f4523e;
                    BluetoothConnectionType bluetoothConnectionType = (num != null && num.intValue() == 1) ? BluetoothConnectionType.LOW_ENERGY : BluetoothConnectionType.CLASSIC;
                    fn2.a aVar2 = fn2.a.f72254a;
                    byte[] bArr4 = this.f4524f;
                    aVar2.getClass();
                    String strB = fn2.a.b(bArr4);
                    if (strB == null) {
                        d.a(a.f4492e).warn("uploadNewDeviceInfo " + j8 + " skipped, missing capabilities");
                        return Unit.INSTANCE;
                    }
                    ConnectionInfoDto connectionInfoDto = new ConnectionInfoDto(str, strB, garminBondingInfo, bluetoothConnectionType);
                    d.a(a.f4492e).debug("attempting GC connection info update " + j8);
                    dn2.j jVar = this.f4527i;
                    this.f4519a = 1;
                    if (jVar.b(j8, connectionInfoDto, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Exception e4) {
                d.a(a.f4492e).error(v.h.u(j8, "failed to uploadNewDeviceInfo for ", StringUtils.SPACE, str), (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    public a(Context context, e eVar, bn2.c cVar) {
        context.getClass();
        eVar.getClass();
        cVar.getClass();
        this.f4494a = eVar;
        this.f4495b = cVar;
        this.f4496c = new HashMap<>();
        this.f4497d = c0.a(t13.g.a.C3052a.d(new a0("DM#Manager"), ge1.b.h()));
        if (eVar.f4511c.isEmpty()) {
            vb.h.s("config.connectionTypes must be populated");
            throw null;
        }
        boolean z14 = eVar.f4514f;
        d dVar = f4492e;
        if (z14) {
            d.a(dVar).debug("start bonding listener");
            cVar.b(new b());
        }
        if (eVar.b().isEmpty()) {
            return;
        }
        d.a(dVar).debug("register for broadcasts from ".concat(h0.k0(eVar.b(), null, null, null, C0070a.f4498a, 31)));
        cn2.b bVar = new cn2.b(context, this, eVar, null, 8, null);
        if (bVar.f28078h) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        Iterator<String> it = cn2.b.f28070i.iterator();
        while (it.hasNext()) {
            intentFilter.addAction(it.next());
        }
        a7.b.registerReceiver(bVar.f28071a, bVar, intentFilter, null, null, 2);
        bVar.f28078h = true;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[LOOP:1: B:71:0x01dc->B:100:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x0120  */
    /* JADX WARN: Code duplicated, block: B:59:0x0153  */
    /* JADX WARN: Code duplicated, block: B:62:0x018d  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x0250 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x014d A[SYNTHETIC] */
    public final Object a(dn2.j jVar, v13.c cVar) {
        an2.d dVar;
        dn2.j jVar2;
        a aVar;
        Collection collection;
        dn2.j jVar3;
        Collection<String> collection2;
        Collection<SharedDeviceInfo> collection3;
        int iA;
        LinkedHashMap linkedHashMap;
        HashSet hashSet;
        dn2.j jVar4;
        Map map;
        a aVar2;
        Collection<String> collection4;
        Iterator it;
        Collection collection5;
        Serializable serializableD;
        SharedDeviceInfo sharedDeviceInfo;
        d dVar2;
        String productNumber;
        Set setKeySet;
        Iterator it3;
        dn2.i iVar;
        if (cVar instanceof an2.d) {
            dVar = (an2.d) cVar;
            int i14 = dVar.f4550i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f4550i = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new an2.d(this, cVar);
            }
        } else {
            dVar = new an2.d(this, cVar);
        }
        Object objC = dVar.f4548g;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f4550i;
        if (i15 == 0) {
            r.b(objC);
            dn2.i iVar2 = this.f4494a.f4509a;
            dVar.f4542a = this;
            jVar2 = jVar;
            dVar.f4543b = jVar2;
            dVar.f4550i = 1;
            objC = iVar2.c();
            if (objC != aVar3) {
                aVar = this;
            }
            return aVar3;
        }
        if (i15 == 1) {
            jVar2 = dVar.f4543b;
            a aVar4 = dVar.f4542a;
            r.b(objC);
            aVar = aVar4;
        } else if (i15 == 2) {
            collection2 = (Collection) dVar.f4545d;
            collection = dVar.f4544c;
            jVar3 = dVar.f4543b;
            aVar = dVar.f4542a;
            r.b(objC);
            collection3 = (Collection) objC;
            iA = t0.a(y.r(collection3, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            for (SharedDeviceInfo sharedDeviceInfo2 : collection3) {
                Long l14 = new Long(sharedDeviceInfo2.getUnitID());
                ArrayList arrayList = new ArrayList();
                for (Object obj : collection3) {
                    if (((SharedDeviceInfo) obj).getUnitID() == sharedDeviceInfo2.getUnitID() || !sharedDeviceInfo2.isSupportedConnectionType(aVar.f4494a.f4511c)) {
                        collection5 = collection3;
                    } else {
                        d dVar3 = f4492e;
                        collection5 = collection3;
                        String productNumber2 = sharedDeviceInfo2.getProductNumber();
                        dVar3.getClass();
                        if (d.b(productNumber2, collection2)) {
                            arrayList.add(obj);
                        }
                    }
                    collection3 = collection5;
                }
                linkedHashMap.put(l14, arrayList);
            }
            synchronized (aVar.f4496c) {
                aVar.f4496c.clear();
                aVar.f4496c.putAll(linkedHashMap);
                Unit unit = Unit.INSTANCE;
            }
            HashSet hashSet2 = new HashSet();
            Iterator it4 = collection.iterator();
            hashSet = hashSet2;
            jVar4 = jVar3;
            map = linkedHashMap;
            aVar2 = aVar;
            collection4 = collection2;
            it = it4;
        } else {
            if (i15 != 3) {
                if (i15 == 4) {
                    r.b(objC);
                    return objC;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = dVar.f4547f;
            hashSet = dVar.f4546e;
            map = (Map) dVar.f4545d;
            collection4 = dVar.f4544c;
            jVar4 = dVar.f4543b;
            aVar2 = dVar.f4542a;
            r.b(objC);
        }
        while (it.hasNext()) {
            sharedDeviceInfo = (SharedDeviceInfo) it.next();
            if (sharedDeviceInfo.isSupportedConnectionType(aVar2.f4494a.f4511c)) {
                dVar2 = f4492e;
                productNumber = sharedDeviceInfo.getProductNumber();
                dVar2.getClass();
                if (d.b(productNumber, collection4)) {
                    setKeySet = map.keySet();
                    if ((setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                        it3 = setKeySet.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((Number) it3.next()).longValue() == sharedDeviceInfo.getUnitID()) {
                                    hashSet.add(sharedDeviceInfo);
                                }
                            }
                        }
                    }
                    Logger loggerA = d.a(f4492e);
                    StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(sharedDeviceInfo.getUnitID(), "deleting device ", sharedDeviceInfo.getDisplayName(), StringUtils.SPACE);
                    sbJ.append(" that is not in GC");
                    loggerA.debug(sbJ.toString());
                    iVar = aVar2.f4494a.f4509a;
                    dVar.f4542a = aVar2;
                    dVar.f4543b = jVar4;
                    dVar.f4544c = collection4;
                    dVar.f4545d = map;
                    dVar.f4546e = hashSet;
                    dVar.f4547f = it;
                    dVar.f4550i = 3;
                    if (iVar.g(sharedDeviceInfo, dVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    Logger loggerA2 = d.a(dVar2);
                    StringBuilder sbJ2 = com.nimbusds.jose.shaded.gson.internal.a.j(sharedDeviceInfo.getUnitID(), "ignoring device ", sharedDeviceInfo.getDisplayName(), StringUtils.SPACE);
                    sbJ2.append(" not in list of productNumbers");
                    loggerA2.debug(sbJ2.toString());
                    aVar2.f4494a.f4509a.e(sharedDeviceInfo);
                }
            } else {
                Logger loggerA3 = d.a(f4492e);
                StringBuilder sbJ3 = com.nimbusds.jose.shaded.gson.internal.a.j(sharedDeviceInfo.getUnitID(), "ignoring device ", sharedDeviceInfo.getDisplayName(), StringUtils.SPACE);
                sbJ3.append(" with unsupported BT type");
                loggerA3.debug(sbJ3.toString());
                aVar2.f4494a.f4509a.e(sharedDeviceInfo);
            }
        }
        dVar.f4542a = null;
        dVar.f4543b = null;
        dVar.f4544c = null;
        dVar.f4545d = null;
        dVar.f4546e = null;
        dVar.f4547f = null;
        dVar.f4550i = 4;
        serializableD = aVar2.d(hashSet, map, jVar4, dVar);
        if (serializableD != aVar3) {
            return aVar3;
        }
        return serializableD;
        Collection collection6 = (Collection) objC;
        e eVar = aVar.f4494a;
        Collection<String> collection7 = eVar.f4510b;
        Collection<String> collection8 = collection7 == null ? l0.f134950a : collection7;
        Collection<Integer> collection9 = eVar.f4511c;
        dVar.f4542a = aVar;
        dVar.f4543b = jVar2;
        dVar.f4544c = collection6;
        dVar.f4545d = collection7;
        dVar.f4550i = 2;
        Object objA = jVar2.a(collection8, collection9, dVar);
        if (objA != aVar3) {
            collection = collection6;
            objC = objA;
            jVar3 = jVar2;
            collection2 = collection7;
            collection3 = (Collection) objC;
            iA = t0.a(y.r(collection3, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            while (r11.hasNext()) {
                Long l15 = new Long(sharedDeviceInfo2.getUnitID());
                ArrayList arrayList2 = new ArrayList();
                while (r15.hasNext()) {
                    if (((SharedDeviceInfo) obj).getUnitID() == sharedDeviceInfo2.getUnitID()) {
                        collection5 = collection3;
                    } else {
                        collection5 = collection3;
                    }
                    collection3 = collection5;
                }
                linkedHashMap.put(l15, arrayList2);
            }
            synchronized (aVar.f4496c) {
                aVar.f4496c.clear();
                aVar.f4496c.putAll(linkedHashMap);
                Unit unit2 = Unit.INSTANCE;
                HashSet hashSet3 = new HashSet();
                Iterator it5 = collection.iterator();
                hashSet = hashSet3;
                jVar4 = jVar3;
                map = linkedHashMap;
                aVar2 = aVar;
                collection4 = collection2;
                it = it5;
                while (it.hasNext()) {
                    sharedDeviceInfo = (SharedDeviceInfo) it.next();
                    if (sharedDeviceInfo.isSupportedConnectionType(aVar2.f4494a.f4511c)) {
                        Logger loggerA4 = d.a(f4492e);
                        StringBuilder sbJ4 = com.nimbusds.jose.shaded.gson.internal.a.j(sharedDeviceInfo.getUnitID(), "ignoring device ", sharedDeviceInfo.getDisplayName(), StringUtils.SPACE);
                        sbJ4.append(" with unsupported BT type");
                        loggerA4.debug(sbJ4.toString());
                        aVar2.f4494a.f4509a.e(sharedDeviceInfo);
                    } else {
                        dVar2 = f4492e;
                        productNumber = sharedDeviceInfo.getProductNumber();
                        dVar2.getClass();
                        if (d.b(productNumber, collection4)) {
                            Logger loggerA5 = d.a(dVar2);
                            StringBuilder sbJ5 = com.nimbusds.jose.shaded.gson.internal.a.j(sharedDeviceInfo.getUnitID(), "ignoring device ", sharedDeviceInfo.getDisplayName(), StringUtils.SPACE);
                            sbJ5.append(" not in list of productNumbers");
                            loggerA5.debug(sbJ5.toString());
                            aVar2.f4494a.f4509a.e(sharedDeviceInfo);
                        } else {
                            setKeySet = map.keySet();
                            if (setKeySet instanceof Collection) {
                                it3 = setKeySet.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((Number) it3.next()).longValue() == sharedDeviceInfo.getUnitID()) {
                                            hashSet.add(sharedDeviceInfo);
                                        }
                                    }
                                }
                            } else {
                                it3 = setKeySet.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((Number) it3.next()).longValue() == sharedDeviceInfo.getUnitID()) {
                                            hashSet.add(sharedDeviceInfo);
                                        }
                                    }
                                }
                            }
                            Logger loggerA6 = d.a(f4492e);
                            StringBuilder sbJ6 = com.nimbusds.jose.shaded.gson.internal.a.j(sharedDeviceInfo.getUnitID(), "deleting device ", sharedDeviceInfo.getDisplayName(), StringUtils.SPACE);
                            sbJ6.append(" that is not in GC");
                            loggerA6.debug(sbJ6.toString());
                            iVar = aVar2.f4494a.f4509a;
                            dVar.f4542a = aVar2;
                            dVar.f4543b = jVar4;
                            dVar.f4544c = collection4;
                            dVar.f4545d = map;
                            dVar.f4546e = hashSet;
                            dVar.f4547f = it;
                            dVar.f4550i = 3;
                            if (iVar.g(sharedDeviceInfo, dVar) == aVar3) {
                            }
                        }
                    }
                }
                dVar.f4542a = null;
                dVar.f4543b = null;
                dVar.f4544c = null;
                dVar.f4545d = null;
                dVar.f4546e = null;
                dVar.f4547f = null;
                dVar.f4550i = 4;
                serializableD = aVar2.d(hashSet, map, jVar4, dVar);
                if (serializableD != aVar3) {
                    return serializableD;
                }
            }
        }
        return aVar3;
    }

    public final boolean b(SharedDeviceInfo sharedDeviceInfo, Collection<String> collection) {
        if (collection != null && sharedDeviceInfo.isBonded$shared_device_management_release(collection)) {
            return true;
        }
        if (collection == null && sharedDeviceInfo.isPaired()) {
            return true;
        }
        return sharedDeviceInfo.isPaired() && this.f4494a.f4513e.invoke(sharedDeviceInfo).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:115:0x027e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:136:0x02f2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0236 A[RETURN] */
    public final Object c(SharedDeviceInfo sharedDeviceInfo, SharedDeviceInfo sharedDeviceInfo2, Collection collection, dn2.j jVar, v13.c cVar) {
        g gVar;
        SharedDeviceInfo sharedDeviceInfoBuild = sharedDeviceInfo;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f4559d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f4559d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f4557b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        switch (gVar2.f4559d) {
            case 0:
                r.b(obj);
                if (!sharedDeviceInfoBuild.doesConnectionTypeMatch(sharedDeviceInfo2 != null ? sharedDeviceInfo2.getConnectionType() : null)) {
                    throw new IllegalArgumentException("if registered (" + sharedDeviceInfoBuild.getConnectionType() + ") and saved (" + (sharedDeviceInfo2 != null ? sharedDeviceInfo2.getConnectionType() : null) + ") devices have BT types, they must match");
                }
                if (sharedDeviceInfo2 != null && sharedDeviceInfo2.getUnitID() != sharedDeviceInfoBuild.getUnitID()) {
                    vb.h.s("init IDs must match");
                    return null;
                }
                boolean zIsBonded$shared_device_management_release = sharedDeviceInfoBuild.isBonded$shared_device_management_release(collection);
                boolean zIsPaired = sharedDeviceInfoBuild.isPaired();
                d dVar = f4492e;
                if (zIsPaired != zIsBonded$shared_device_management_release) {
                    Logger loggerA = d.a(dVar);
                    StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(sharedDeviceInfoBuild.getUnitID(), "device ", StringUtils.SPACE, sharedDeviceInfoBuild.getMacAddress());
                    sbK.append(" isPaired:");
                    sbK.append(zIsPaired);
                    sbK.append(", hasBond:");
                    sbK.append(zIsBonded$shared_device_management_release);
                    loggerA.debug(sbK.toString());
                }
                e eVar = this.f4494a;
                if (zIsPaired) {
                    boolean z14 = false;
                    if (b(sharedDeviceInfoBuild, collection)) {
                        if ((sharedDeviceInfo2 != null ? sharedDeviceInfo2.getCapabilities() : null) != null && sharedDeviceInfo2.getCapabilities().length != 0 && (sharedDeviceInfoBuild.getCapabilities() == null || !Arrays.equals(sharedDeviceInfoBuild.getCapabilities(), sharedDeviceInfo2.getCapabilities()))) {
                            z14 = true;
                        }
                        if (sharedDeviceInfo2 != null) {
                            SharedDeviceInfo.Builder builderConfigureSWVersion = new SharedDeviceInfo.Builder(sharedDeviceInfoBuild).configureSWVersion(sharedDeviceInfo2.getSoftwareVersion(), sharedDeviceInfoBuild.getSoftwareVersion());
                            byte[] capabilities = sharedDeviceInfo2.getCapabilities();
                            if (capabilities == null) {
                                capabilities = sharedDeviceInfoBuild.getCapabilities();
                            }
                            SharedDeviceInfo.Builder builderConfigureCapabilities = builderConfigureSWVersion.configureCapabilities(capabilities);
                            if (eVar.h(sharedDeviceInfoBuild.getProductNumber()) && b(sharedDeviceInfo2, collection)) {
                                if (!s.g(sharedDeviceInfo2.getMacAddress(), sharedDeviceInfoBuild.getMacAddress()) || sharedDeviceInfo2.hasGarminAuth() != sharedDeviceInfoBuild.hasGarminAuth()) {
                                    Logger loggerA2 = d.a(dVar);
                                    long unitID = sharedDeviceInfoBuild.getUnitID();
                                    String macAddress = sharedDeviceInfoBuild.getMacAddress();
                                    String macAddress2 = sharedDeviceInfo2.getMacAddress();
                                    StringBuilder sbK2 = com.airbnb.lottie.animation.keyframe.a.k(unitID, "overwrite registered device ", " mac address ", macAddress);
                                    sbK2.append(" with ");
                                    sbK2.append(macAddress2);
                                    loggerA2.debug(sbK2.toString());
                                    builderConfigureCapabilities.macAddress = sharedDeviceInfo2.getMacAddress();
                                    builderConfigureCapabilities.connectionType = sharedDeviceInfo2.getConnectionType();
                                    builderConfigureCapabilities.configureGarminAuth(sharedDeviceInfo2.getGbleEdiv(), sharedDeviceInfo2.getGbleRand(), sharedDeviceInfo2.getGbleLongTermKey());
                                    z14 = true;
                                } else if (sharedDeviceInfo2.hasGarminAuth()) {
                                    byte[] gbleEdiv = sharedDeviceInfo2.getGbleEdiv();
                                    gbleEdiv.getClass();
                                    byte[] gbleEdiv2 = sharedDeviceInfoBuild.getGbleEdiv();
                                    gbleEdiv2.getClass();
                                    if (Arrays.equals(gbleEdiv, gbleEdiv2)) {
                                        byte[] gbleLongTermKey = sharedDeviceInfo2.getGbleLongTermKey();
                                        gbleLongTermKey.getClass();
                                        byte[] gbleLongTermKey2 = sharedDeviceInfoBuild.getGbleLongTermKey();
                                        gbleLongTermKey2.getClass();
                                        if (Arrays.equals(gbleLongTermKey, gbleLongTermKey2)) {
                                            byte[] gbleRand = sharedDeviceInfo2.getGbleRand();
                                            gbleRand.getClass();
                                            byte[] gbleRand2 = sharedDeviceInfoBuild.getGbleRand();
                                            gbleRand2.getClass();
                                            if (!Arrays.equals(gbleRand, gbleRand2)) {
                                                Logger loggerA3 = d.a(dVar);
                                                long unitID2 = sharedDeviceInfoBuild.getUnitID();
                                                String macAddress3 = sharedDeviceInfoBuild.getMacAddress();
                                                String macAddress4 = sharedDeviceInfo2.getMacAddress();
                                                StringBuilder sbK3 = com.airbnb.lottie.animation.keyframe.a.k(unitID2, "overwrite registered device ", " mac address ", macAddress3);
                                                sbK3.append(" with ");
                                                sbK3.append(macAddress4);
                                                loggerA3.debug(sbK3.toString());
                                                builderConfigureCapabilities.macAddress = sharedDeviceInfo2.getMacAddress();
                                                builderConfigureCapabilities.connectionType = sharedDeviceInfo2.getConnectionType();
                                                builderConfigureCapabilities.configureGarminAuth(sharedDeviceInfo2.getGbleEdiv(), sharedDeviceInfo2.getGbleRand(), sharedDeviceInfo2.getGbleLongTermKey());
                                                z14 = true;
                                            }
                                        } else {
                                            Logger loggerA4 = d.a(dVar);
                                            long unitID3 = sharedDeviceInfoBuild.getUnitID();
                                            String macAddress5 = sharedDeviceInfoBuild.getMacAddress();
                                            String macAddress6 = sharedDeviceInfo2.getMacAddress();
                                            StringBuilder sbK4 = com.airbnb.lottie.animation.keyframe.a.k(unitID3, "overwrite registered device ", " mac address ", macAddress5);
                                            sbK4.append(" with ");
                                            sbK4.append(macAddress6);
                                            loggerA4.debug(sbK4.toString());
                                            builderConfigureCapabilities.macAddress = sharedDeviceInfo2.getMacAddress();
                                            builderConfigureCapabilities.connectionType = sharedDeviceInfo2.getConnectionType();
                                            builderConfigureCapabilities.configureGarminAuth(sharedDeviceInfo2.getGbleEdiv(), sharedDeviceInfo2.getGbleRand(), sharedDeviceInfo2.getGbleLongTermKey());
                                            z14 = true;
                                        }
                                    } else {
                                        Logger loggerA5 = d.a(dVar);
                                        long unitID4 = sharedDeviceInfoBuild.getUnitID();
                                        String macAddress7 = sharedDeviceInfoBuild.getMacAddress();
                                        String macAddress8 = sharedDeviceInfo2.getMacAddress();
                                        StringBuilder sbK5 = com.airbnb.lottie.animation.keyframe.a.k(unitID4, "overwrite registered device ", " mac address ", macAddress7);
                                        sbK5.append(" with ");
                                        sbK5.append(macAddress8);
                                        loggerA5.debug(sbK5.toString());
                                        builderConfigureCapabilities.macAddress = sharedDeviceInfo2.getMacAddress();
                                        builderConfigureCapabilities.connectionType = sharedDeviceInfo2.getConnectionType();
                                        builderConfigureCapabilities.configureGarminAuth(sharedDeviceInfo2.getGbleEdiv(), sharedDeviceInfo2.getGbleRand(), sharedDeviceInfo2.getGbleLongTermKey());
                                        z14 = true;
                                    }
                                }
                            }
                            sharedDeviceInfoBuild = builderConfigureCapabilities.build();
                        }
                        SharedDeviceInfo sharedDeviceInfo3 = sharedDeviceInfoBuild;
                        if (jVar != null && z14) {
                            f(jVar, sharedDeviceInfo3.getUnitID(), sharedDeviceInfo3.getMacAddress(), sharedDeviceInfo3.getCapabilities(), sharedDeviceInfo3.getConnectionType(), sharedDeviceInfo3.getGbleEdiv(), sharedDeviceInfo3.getGbleRand(), sharedDeviceInfo3.getGbleLongTermKey());
                        }
                        if (sharedDeviceInfo2 == null || !sharedDeviceInfo2.isPaired()) {
                            dn2.i iVar = eVar.f4509a;
                            gVar2.f4556a = sharedDeviceInfo3;
                            gVar2.f4559d = 2;
                            if (iVar.d(sharedDeviceInfo3, sharedDeviceInfo2, gVar2) != aVar) {
                                return sharedDeviceInfo3;
                            }
                        } else {
                            dn2.i iVar2 = eVar.f4509a;
                            gVar2.f4556a = sharedDeviceInfo3;
                            gVar2.f4559d = 1;
                            if (iVar2.f(sharedDeviceInfo3, sharedDeviceInfo2, gVar2) != aVar) {
                                return sharedDeviceInfo3;
                            }
                        }
                    } else {
                        SharedDeviceInfo sharedDeviceInfoBuild2 = new SharedDeviceInfo.Builder(sharedDeviceInfoBuild, (ConnectionInfoDto) null).configureSWVersion(sharedDeviceInfo2 != null ? sharedDeviceInfo2.getSoftwareVersion() : null, sharedDeviceInfoBuild.getSoftwareVersion()).build();
                        if (sharedDeviceInfo2 != null && sharedDeviceInfo2.isPaired()) {
                            z14 = true;
                        }
                        h hVar = new h(this, sharedDeviceInfoBuild, z14);
                        if (!z14 || sharedDeviceInfo2 == null) {
                            dn2.i iVar3 = eVar.f4509a;
                            gVar2.f4556a = sharedDeviceInfoBuild2;
                            gVar2.f4559d = 4;
                            if (iVar3.a(sharedDeviceInfoBuild2, sharedDeviceInfo2, hVar, gVar2) != aVar) {
                                return sharedDeviceInfoBuild2;
                            }
                        } else {
                            dn2.i iVar4 = eVar.f4509a;
                            gVar2.f4556a = sharedDeviceInfoBuild2;
                            gVar2.f4559d = 3;
                            if (iVar4.b(sharedDeviceInfoBuild2, sharedDeviceInfo2, hVar, gVar2) != aVar) {
                                return sharedDeviceInfoBuild2;
                            }
                        }
                    }
                } else if (sharedDeviceInfo2 == null || !sharedDeviceInfo2.isPaired()) {
                    dn2.i iVar5 = eVar.f4509a;
                    gVar2.f4556a = sharedDeviceInfoBuild;
                    gVar2.f4559d = 7;
                    if (iVar5.a(sharedDeviceInfoBuild, sharedDeviceInfo2, null, gVar2) != aVar) {
                        return sharedDeviceInfoBuild;
                    }
                } else if (b(sharedDeviceInfo2, collection)) {
                    SharedDeviceInfo sharedDeviceInfoBuild3 = new SharedDeviceInfo.Builder(sharedDeviceInfoBuild, (ConnectionInfoDto) null).configureDeviceInfo(sharedDeviceInfo2).build();
                    if (jVar != null && eVar.h(sharedDeviceInfoBuild3.getProductNumber())) {
                        f(jVar, sharedDeviceInfoBuild3.getUnitID(), sharedDeviceInfoBuild3.getMacAddress(), sharedDeviceInfoBuild3.getCapabilities(), sharedDeviceInfoBuild3.getConnectionType(), sharedDeviceInfoBuild3.getGbleEdiv(), sharedDeviceInfoBuild3.getGbleRand(), sharedDeviceInfoBuild3.getGbleLongTermKey());
                    }
                    dn2.i iVar6 = eVar.f4509a;
                    gVar2.f4556a = sharedDeviceInfoBuild3;
                    gVar2.f4559d = 5;
                    if (iVar6.f(sharedDeviceInfoBuild3, sharedDeviceInfo2, gVar2) != aVar) {
                        return sharedDeviceInfoBuild3;
                    }
                } else {
                    dn2.i iVar7 = eVar.f4509a;
                    gVar2.f4556a = sharedDeviceInfoBuild;
                    gVar2.f4559d = 6;
                    if (iVar7.b(sharedDeviceInfoBuild, sharedDeviceInfo2, null, gVar2) != aVar) {
                        return sharedDeviceInfoBuild;
                    }
                }
                return aVar;
            case 1:
                SharedDeviceInfo sharedDeviceInfo4 = gVar2.f4556a;
                r.b(obj);
                return sharedDeviceInfo4;
            case 2:
                SharedDeviceInfo sharedDeviceInfo5 = gVar2.f4556a;
                r.b(obj);
                return sharedDeviceInfo5;
            case 3:
                SharedDeviceInfo sharedDeviceInfo6 = gVar2.f4556a;
                r.b(obj);
                return sharedDeviceInfo6;
            case 4:
                SharedDeviceInfo sharedDeviceInfo7 = gVar2.f4556a;
                r.b(obj);
                return sharedDeviceInfo7;
            case 5:
                SharedDeviceInfo sharedDeviceInfo8 = gVar2.f4556a;
                r.b(obj);
                return sharedDeviceInfo8;
            case 6:
                SharedDeviceInfo sharedDeviceInfo9 = gVar2.f4556a;
                r.b(obj);
                return sharedDeviceInfo9;
            case 7:
                SharedDeviceInfo sharedDeviceInfo10 = gVar2.f4556a;
                r.b(obj);
                return sharedDeviceInfo10;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x029c  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[LOOP:0: B:62:0x01b2->B:112:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01e6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0219  */
    /* JADX WARN: Code duplicated, block: B:88:0x0238  */
    /* JADX WARN: Code duplicated, block: B:99:0x027b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [an2.a] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [an2.a] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x029c -> B:103:0x02a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable d(java.util.HashSet r22, java.util.Map r23, dn2.j r24, v13.c r25) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: an2.a.d(java.util.HashSet, java.util.Map, dn2.j, v13.c):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:116:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x018a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0149  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:72:0x0162  */
    /* JADX WARN: Code duplicated, block: B:76:0x0171  */
    /* JADX WARN: Code duplicated, block: B:78:0x017b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:85:0x0192  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [an2.a] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v11, types: [com.garmin.device.sharing.management.dtos.SharedDeviceInfo] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.garmin.device.sharing.management.dtos.SharedDeviceInfo] */
    /* JADX WARN: Type inference failed for: r6v13, types: [an2.a] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x024d -> B:114:0x0252). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x01c5 -> B:90:0x01ca). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable e(java.util.ArrayList r21, java.util.Collection r22, java.util.Collection r23, dn2.j r24, v13.c r25) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: an2.a.e(java.util.ArrayList, java.util.Collection, java.util.Collection, dn2.j, v13.c):java.io.Serializable");
    }

    public final void f(dn2.j jVar, long j8, String str, byte[] bArr, Integer num, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (str != null && str.length() != 0 && bArr != null) {
            if ((num != null ? num.intValue() : 0) != 0) {
                ge1.b.T(this.f4497d, null, null, new f(bArr2, bArr3, bArr4, num, bArr, j8, str, jVar, null), 3);
                return;
            }
        }
        Logger loggerA = d.a(f4492e);
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "tried to upload invalid connection info ", StringUtils.SPACE, str);
        sbK.append(", ");
        sbK.append(num);
        sbK.append(", ");
        sbK.append(bArr);
        loggerA.warn(sbK.toString());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lan2/a$d;", "", "<init>", "()V", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final Logger a(d dVar) {
            dVar.getClass();
            return (Logger) a.f4493f.getValue();
        }

        public static boolean b(String str, Collection collection) {
            str.getClass();
            return collection == null || collection.isEmpty() || collection.contains(str);
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u000e\u0010\u000fBM\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0011¨\u0006\u0012"}, d2 = {"Lan2/a$e;", "", "Ldn2/i;", "localDeviceDelegate", "", "", "deviceProductNumbers", "", "connectionTypes", "", "treatRegisteredDevicesAsPaired", "Lkotlin/Function1;", "Lcom/garmin/device/sharing/management/dtos/SharedDeviceInfo;", "excludeBondValidationFunc", "<init>", "(Ldn2/i;Ljava/util/Collection;Ljava/util/Collection;ZLe23/l;)V", "excludeBondValidation", "(Ldn2/i;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Z)V", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dn2.i f4509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Collection<String> f4510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Collection<Integer> f4511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f4512d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e23.l<SharedDeviceInfo, Boolean> f4513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f4514f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Collection<cn2.a> f4515g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final l0 f4516h;

        /* JADX INFO: renamed from: an2.a$e$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/garmin/device/sharing/management/dtos/SharedDeviceInfo;", "invoke", "(Lcom/garmin/device/sharing/management/dtos/SharedDeviceInfo;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0072a extends w implements e23.l<SharedDeviceInfo, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0072a f4517a = new C0072a();

            public C0072a() {
                super(1);
            }

            @Override // e23.l
            public final Boolean invoke(SharedDeviceInfo sharedDeviceInfo) {
                sharedDeviceInfo.getClass();
                return Boolean.FALSE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/garmin/device/sharing/management/dtos/SharedDeviceInfo;", "invoke", "(Lcom/garmin/device/sharing/management/dtos/SharedDeviceInfo;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b extends w implements e23.l<SharedDeviceInfo, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Collection<String> f4518a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Collection<String> collection) {
                super(1);
                this.f4518a = collection;
            }

            @Override // e23.l
            public final Boolean invoke(SharedDeviceInfo sharedDeviceInfo) {
                SharedDeviceInfo sharedDeviceInfo2 = sharedDeviceInfo;
                sharedDeviceInfo2.getClass();
                Collection<String> collection = this.f4518a;
                return Boolean.valueOf(collection == null || collection.contains(sharedDeviceInfo2.getProductNumber()));
            }
        }

        public /* synthetic */ e(dn2.i iVar, Collection collection, Set set, boolean z14, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(iVar, (Collection<String>) ((i14 & 2) != 0 ? null : collection), (Collection<Integer>) ((i14 & 4) != 0 ? a1.b(1) : set), (i14 & 8) != 0 ? false : z14, (e23.l<? super SharedDeviceInfo, Boolean>) ((i14 & 16) != 0 ? C0072a.f4517a : lVar));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Serializable a(v13.c cVar) {
            an2.c cVar2;
            e eVar;
            if (cVar instanceof an2.c) {
                cVar2 = (an2.c) cVar;
                int i14 = cVar2.f4541d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    cVar2.f4541d = i14 - Integer.MIN_VALUE;
                } else {
                    cVar2 = new an2.c(this, cVar);
                }
            } else {
                cVar2 = new an2.c(this, cVar);
            }
            Object objC = cVar2.f4539b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = cVar2.f4541d;
            if (i15 == 0) {
                r.b(objC);
                cVar2.f4538a = this;
                cVar2.f4541d = 1;
                objC = this.f4509a.c();
                if (objC == aVar) {
                    return aVar;
                }
                eVar = this;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                eVar = cVar2.f4538a;
                r.b(objC);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) objC) {
                SharedDeviceInfo sharedDeviceInfo = (SharedDeviceInfo) obj;
                if (sharedDeviceInfo.isSupportedConnectionType(eVar.f4511c)) {
                    d dVar = a.f4492e;
                    Collection<String> collection = eVar.f4510b;
                    String productNumber = sharedDeviceInfo.getProductNumber();
                    dVar.getClass();
                    if (d.b(productNumber, collection)) {
                        arrayList.add(obj);
                    }
                }
            }
            return arrayList;
        }

        public Collection<cn2.a> b() {
            return this.f4515g;
        }

        public boolean c() {
            return true;
        }

        public boolean d() {
            return false;
        }

        public void e(SharedDeviceInfo sharedDeviceInfo) {
            sharedDeviceInfo.getClass();
        }

        public void f(long j8, String str, boolean z14) {
            str.getClass();
        }

        public void g(long j8, String str, boolean z14) {
        }

        public abstract boolean h(String str);

        public abstract dn2.d i();

        /* JADX WARN: Multi-variable type inference failed */
        public e(dn2.i iVar, Collection<String> collection, Collection<Integer> collection2, boolean z14, e23.l<? super SharedDeviceInfo, Boolean> lVar) {
            iVar.getClass();
            collection2.getClass();
            lVar.getClass();
            this.f4509a = iVar;
            this.f4510b = collection;
            this.f4511c = collection2;
            this.f4512d = z14;
            this.f4513e = lVar;
            this.f4514f = true;
            this.f4515g = a1.b(cn2.a.f28067e);
            this.f4516h = l0.f134950a;
        }

        public /* synthetic */ e(dn2.i iVar, Collection collection, Set set, Collection collection2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(iVar, (Collection<String>) ((i14 & 2) != 0 ? null : collection), (Collection<Integer>) ((i14 & 4) != 0 ? a1.b(1) : set), (Collection<String>) collection2, (i14 & 16) != 0 ? false : z14);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @o13.e
        public e(dn2.i iVar, Collection<String> collection, Collection<Integer> collection2, Collection<String> collection3, boolean z14) {
            this(iVar, collection, collection2, z14, new b(collection3));
            iVar.getClass();
            collection2.getClass();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, e eVar) {
        this(context, eVar, new BluetoothHelper(context));
        context.getClass();
        eVar.getClass();
    }
}
