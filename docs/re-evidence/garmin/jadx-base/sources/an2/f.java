package an2;

import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.device.sharing.management.SharedDeviceManager$initializeConnections$2", f = "SharedDeviceManager.kt", l = {275}, m = "invokeSuspend")
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection f4553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f4555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f4555c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f4555c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bf A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:32:0x00b4, B:51:0x013f, B:52:0x0143, B:54:0x0149, B:37:0x00bf, B:38:0x00c3, B:40:0x00c9, B:42:0x00d7, B:43:0x00db, B:45:0x00e1, B:47:0x00ed), top: B:62:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9 A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:32:0x00b4, B:51:0x013f, B:52:0x0143, B:54:0x0149, B:37:0x00bf, B:38:0x00c3, B:40:0x00c9, B:42:0x00d7, B:43:0x00db, B:45:0x00e1, B:47:0x00ed), top: B:62:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1 A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:32:0x00b4, B:51:0x013f, B:52:0x0143, B:54:0x0149, B:37:0x00bf, B:38:0x00c3, B:40:0x00c9, B:42:0x00d7, B:43:0x00db, B:45:0x00e1, B:47:0x00ed), top: B:62:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:32:0x00b4, B:51:0x013f, B:52:0x0143, B:54:0x0149, B:37:0x00bf, B:38:0x00c3, B:40:0x00c9, B:42:0x00d7, B:43:0x00db, B:45:0x00e1, B:47:0x00ed), top: B:62:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0135  */
    /* JADX WARN: Code duplicated, block: B:50:0x013c A[LOOP:2: B:38:0x00c3->B:50:0x013c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0149 A[Catch: Exception -> 0x00bc, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bc, blocks: (B:32:0x00b4, B:51:0x013f, B:52:0x0143, B:54:0x0149, B:37:0x00bf, B:38:0x00c3, B:40:0x00c9, B:42:0x00d7, B:43:0x00db, B:45:0x00e1, B:47:0x00ed), top: B:62:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00ed, please report this as an issue */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Iterator it;
        Iterator it3;
        SharedDeviceInfo sharedDeviceInfo;
        Iterator it4;
        SharedDeviceInfo sharedDeviceInfo2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4554b;
        Collection<String> collectionA = null;
        a aVar2 = this.f4555c;
        if (i14 == 0) {
            r.b(obj);
            a.e eVar = aVar2.f4494a;
            a.e eVar2 = aVar2.f4494a;
            Collection<String> collection = eVar.f4510b;
            if (collection != null && collection.isEmpty()) {
                a.d.a(a.f4492e).warn("initializeConnections not applicable if app provided empty deviceProductNumbers list");
                return Unit.INSTANCE;
            }
            if (eVar2.f4509a instanceof dn2.c) {
                try {
                    collectionA = aVar2.f4495b.a();
                } catch (Exception unused) {
                }
                this.f4553a = collectionA;
                this.f4554b = 1;
                objA = eVar2.a(this);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                a.d.a(a.f4492e).warn("initializeConnections not applicable if app doesn't extend LocalDevicesDelegate");
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Collection<String> collection2 = this.f4553a;
        r.b(obj);
        objA = obj;
        collectionA = collection2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : (Iterable) objA) {
            Long l14 = new Long(((SharedDeviceInfo) obj2).getUnitID());
            Object arrayList = linkedHashMap.get(l14);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(l14, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            List list = (List) entry.getValue();
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                sharedDeviceInfo = (SharedDeviceInfo) it3.next();
                                a.d dVar = a.f4492e;
                                if (!aVar2.b(sharedDeviceInfo, collectionA)) {
                                    for (it4 = list.iterator(); it4.hasNext(); it4 = it4) {
                                        sharedDeviceInfo2 = (SharedDeviceInfo) it4.next();
                                        if (sharedDeviceInfo2.isPaired()) {
                                            a.d.a(a.f4492e).trace("initializeConnections forget: " + sharedDeviceInfo2.getProductDisplayName() + StringUtils.SPACE + sharedDeviceInfo2.getUnitID() + StringUtils.SPACE + sharedDeviceInfo2.getMacAddress() + " auth: " + sharedDeviceInfo2.hasGarminAuth());
                                            ((dn2.c) aVar2.f4494a.f4509a).j(sharedDeviceInfo2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    it = list.iterator();
                    while (it.hasNext()) {
                        SharedDeviceInfo sharedDeviceInfo3 = (SharedDeviceInfo) it.next();
                        Logger loggerA = a.d.a(a.f4492e);
                        String productDisplayName = sharedDeviceInfo3.getProductDisplayName();
                        long unitID = sharedDeviceInfo3.getUnitID();
                        String macAddress = sharedDeviceInfo3.getMacAddress();
                        boolean zHasGarminAuth = sharedDeviceInfo3.hasGarminAuth();
                        StringBuilder sb3 = new StringBuilder();
                        Iterator it5 = it;
                        sb3.append("initializeConnections start: ");
                        sb3.append(productDisplayName);
                        sb3.append(StringUtils.SPACE);
                        sb3.append(unitID);
                        sb3.append(StringUtils.SPACE);
                        sb3.append(macAddress);
                        sb3.append(" auth: ");
                        sb3.append(zHasGarminAuth);
                        loggerA.trace(sb3.toString());
                        ((dn2.c) aVar2.f4494a.f4509a).k(sharedDeviceInfo3);
                        it = it5;
                    }
                } catch (Exception e4) {
                    a.d.a(a.f4492e).error("failed to initialize connection for " + jLongValue, (Throwable) e4);
                }
            } else {
                it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        sharedDeviceInfo = (SharedDeviceInfo) it3.next();
                        a.d dVar2 = a.f4492e;
                        if (!aVar2.b(sharedDeviceInfo, collectionA)) {
                            while (it4.hasNext()) {
                                sharedDeviceInfo2 = (SharedDeviceInfo) it4.next();
                                if (sharedDeviceInfo2.isPaired()) {
                                    a.d.a(a.f4492e).trace("initializeConnections forget: " + sharedDeviceInfo2.getProductDisplayName() + StringUtils.SPACE + sharedDeviceInfo2.getUnitID() + StringUtils.SPACE + sharedDeviceInfo2.getMacAddress() + " auth: " + sharedDeviceInfo2.hasGarminAuth());
                                    ((dn2.c) aVar2.f4494a.f4509a).j(sharedDeviceInfo2);
                                }
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (it.hasNext()) {
                            SharedDeviceInfo sharedDeviceInfo4 = (SharedDeviceInfo) it.next();
                            Logger loggerA2 = a.d.a(a.f4492e);
                            String productDisplayName2 = sharedDeviceInfo4.getProductDisplayName();
                            long unitID2 = sharedDeviceInfo4.getUnitID();
                            String macAddress2 = sharedDeviceInfo4.getMacAddress();
                            boolean zHasGarminAuth2 = sharedDeviceInfo4.hasGarminAuth();
                            StringBuilder sb4 = new StringBuilder();
                            Iterator it6 = it;
                            sb4.append("initializeConnections start: ");
                            sb4.append(productDisplayName2);
                            sb4.append(StringUtils.SPACE);
                            sb4.append(unitID2);
                            sb4.append(StringUtils.SPACE);
                            sb4.append(macAddress2);
                            sb4.append(" auth: ");
                            sb4.append(zHasGarminAuth2);
                            loggerA2.trace(sb4.toString());
                            ((dn2.c) aVar2.f4494a.f4509a).k(sharedDeviceInfo4);
                            it = it6;
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
