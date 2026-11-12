package com.garmin.android.apps.connectmobile.util.location;

import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDICoreExtension;
import com.garmin.proto.generated.GDISmartProto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.l0;
import p13.x;
import v.e0;
import wr.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47272a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f47273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap<Long, Set<b>> f47274c;

    static {
        int i14 = gt2.c.f79010a;
        f47273b = gt2.b.f79005a.h("DeviceLocationSubscriptionManager");
        f47274c = new ConcurrentHashMap<>();
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(int i14, long j8) {
        LinkedHashSet<b> linkedHashSet;
        Set<b> set = f47274c.get(Long.valueOf(j8));
        if (set != null) {
            linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!((b) obj).f47279d) {
                    linkedHashSet.add(obj);
                }
            }
        } else {
            linkedHashSet = null;
        }
        ArrayList<p> arrayList = new ArrayList();
        if (linkedHashSet != null) {
            for (b bVar : linkedHashSet) {
                arrayList.add(new p(bVar.f47278c, s.g(bVar.f47280e, b.c.a.f47282a) ? GDICore.LocationUpdatedSetEnabledResponse.RequestStatus.Status.OK : GDICore.LocationUpdatedSetEnabledResponse.RequestStatus.Status.NOT_AVAILABLE));
            }
        }
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        GDICore.LocationUpdatedSetEnabledResponse.Builder builderNewBuilder = GDICore.LocationUpdatedSetEnabledResponse.newBuilder();
        boolean zIsEmpty = arrayList.isEmpty();
        for (p pVar : arrayList) {
            GDICore.LocationUpdatedSetEnabledResponse.RequestStatus.Builder builderNewBuilder2 = GDICore.LocationUpdatedSetEnabledResponse.RequestStatus.newBuilder();
            A a14 = pVar.f128594a;
            B b14 = pVar.f128595b;
            builderNewBuilder2.setRequested((GDICore.LocationData.DataType) a14);
            builderNewBuilder2.setStatus((GDICore.LocationUpdatedSetEnabledResponse.RequestStatus.Status) b14);
            builderNewBuilder.addRequests(builderNewBuilder2);
            if (!zIsEmpty && b14 == GDICore.LocationUpdatedSetEnabledResponse.RequestStatus.Status.OK) {
                zIsEmpty = true;
            }
        }
        builderNewBuilder.setStatus(zIsEmpty ? GDICore.LocationUpdatedSetEnabledResponse.Status.OK : GDICore.LocationUpdatedSetEnabledResponse.Status.NOT_AVAILABLE);
        String strName = builderNewBuilder.getStatus().name();
        List<GDICore.LocationUpdatedSetEnabledResponse.RequestStatus> requestsList = builderNewBuilder.getRequestsList();
        requestsList.getClass();
        String str = "";
        int i15 = 0;
        for (Object obj2 : requestsList) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                x.q();
                throw null;
            }
            GDICore.LocationUpdatedSetEnabledResponse.RequestStatus requestStatus = (GDICore.LocationUpdatedSetEnabledResponse.RequestStatus) obj2;
            if (i15 != 0) {
                str = ((Object) str) + ", ";
            }
            str = ((Object) str) + "requested=" + requestStatus.getRequested() + ", status=" + requestStatus.getStatus().name();
            i15 = i16;
        }
        String strConcat = "Device response message: ".concat(e0.g("LocationUpdatedSetEnabledResponse(status=", strName, ", requests=[", str, "])"));
        Logger logger = f47273b;
        logger.debug(strConcat);
        GDICore.CoreService.Builder builderNewBuilder3 = GDICore.CoreService.newBuilder();
        builderNewBuilder3.setLocationUpdatedSetEnabledResponse(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder4 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder4.setExtension(GDICoreExtension.coreService, builderNewBuilder3.build());
        GDISmartProto.Smart smartBuild = builderNewBuilder4.build();
        smartBuild.getClass();
        protobufRequestManager.respondToRequest(i14, j8, smartBuild);
        g.w("Sent LocationUpdatedSetEnabledResponse proto to device: ", j8, logger);
        if (linkedHashSet != null) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((b) it.next()).f47279d = true;
            }
        }
    }

    public static void b(Integer num, long j8) {
        Set<b> set = f47274c.get(Long.valueOf(j8));
        Set<b> set2 = set;
        Logger logger = f47273b;
        if (set2 == null || set2.isEmpty()) {
            g.v("unsubscribe: no active/pending subscriptions for device ", j8, ", cannot unsubscribe", logger);
        } else {
            logger.debug("unsubscribe: subscriptions for " + j8 + " will be removed: " + set);
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                ((b) it.next()).b().a();
            }
            c(j8, l0.f134950a);
        }
        if (num != null) {
            int iIntValue = num.intValue();
            f47272a.getClass();
            a(iIntValue, j8);
        }
    }

    public static void c(long j8, Set set) {
        boolean zIsEmpty = set.isEmpty();
        ConcurrentHashMap<Long, Set<b>> concurrentHashMap = f47274c;
        Long lValueOf = Long.valueOf(j8);
        if (zIsEmpty) {
            concurrentHashMap.remove(lValueOf);
        } else {
            concurrentHashMap.put(lValueOf, set);
        }
        f47273b.debug("Updated subscriptions cache: " + concurrentHashMap);
    }
}
