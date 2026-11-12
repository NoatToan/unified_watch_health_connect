package com.huawei.maps.offlinedata.service.device.receivers;

import com.google.gson.Gson;
import com.huawei.maps.offlinedata.handler.dto.device.DeleteMapInfoResponse;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a f17939b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f17940a = new HashMap();

    private a() {
    }

    public static a a() {
        if (f17939b == null) {
            synchronized (a.class) {
                if (f17939b == null) {
                    f17939b = new a();
                }
            }
        }
        return f17939b;
    }

    private static void a(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jA = -1;
            int iB = -1;
            int iB2 = -1;
            for (com.huawei.maps.offlinedata.service.device.tlvtools.f fVar : ((com.huawei.maps.offlinedata.service.device.tlvtools.d) it.next()).b()) {
                byte[] bArrB = fVar.b();
                byte bA = fVar.a();
                if (bA == 9) {
                    jA = com.huawei.maps.offlinedata.service.device.tlvtools.a.a(bArrB, -1L);
                } else if (bA == 10) {
                    iB2 = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(bArrB, -1);
                } else if (bA != 18) {
                    com.huawei.maps.offlinedata.utils.g.d("DeleteDeviceMapInfoReceiver", "parseDownloadMapInfoTlv parse mapInfo default");
                } else {
                    iB = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(bArrB, -1);
                }
            }
            DeleteMapInfoResponse deleteMapInfoResponse = new DeleteMapInfoResponse();
            deleteMapInfoResponse.setCityId(String.valueOf(jA));
            deleteMapInfoResponse.setMapDeleteState(Integer.valueOf(iB));
            deleteMapInfoResponse.setMapType(iB2);
            list2.add(deleteMapInfoResponse);
        }
    }

    @Override // com.huawei.maps.offlinedata.service.device.receivers.f
    public void a(int i, byte[] bArr) {
        Long l = null;
        try {
            com.huawei.maps.offlinedata.service.device.tlvtools.d dVarB = com.huawei.maps.offlinedata.service.device.tlvtools.e.b(bArr);
            if (dVarB == null) {
                com.huawei.maps.offlinedata.utils.g.d("DeleteDeviceMapInfoReceiver", "MapDelete TlvByteFather is null");
                return;
            }
            int iB = -1;
            int iB2 = -1;
            int iB3 = -1;
            int iB4 = -1;
            for (com.huawei.maps.offlinedata.service.device.tlvtools.f fVar : dVarB.b()) {
                byte[] bArrB = fVar.b();
                byte bA = fVar.a();
                if (bA == 19) {
                    iB4 = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(bArrB, -1);
                    l = (Long) com.huawei.maps.offlinedata.service.device.e.a().b().get(Integer.valueOf(iB4));
                } else if (bA == 4) {
                    iB = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(bArrB, -1);
                } else if (bA == 5) {
                    iB2 = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(bArrB, -1);
                } else if (bA != 6) {
                    com.huawei.maps.offlinedata.utils.g.d("DeleteDeviceMapInfoReceiver", "handleDownloadedMapListResponse default");
                } else {
                    iB3 = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(bArrB, -1);
                }
            }
            com.huawei.maps.offlinedata.utils.g.c("DeleteDeviceMapInfoReceiver", "totalFrameNum:" + iB + ",frameIndex:" + iB2 + ",totalMapNum:" + iB3 + ", msgId:" + iB4);
            List listA = dVarB.a();
            if (listA != null && !listA.isEmpty()) {
                com.huawei.maps.offlinedata.service.device.tlvtools.d dVar = (com.huawei.maps.offlinedata.service.device.tlvtools.d) listA.get(0);
                if (dVar == null) {
                    com.huawei.maps.offlinedata.utils.g.d("DeleteDeviceMapInfoReceiver", "secondChildTlvList childTlvList is null");
                }
                List listA2 = dVar.a();
                if (listA2 == null || listA2.isEmpty()) {
                    com.huawei.maps.offlinedata.utils.g.d("DeleteDeviceMapInfoReceiver", "mapInfosTlvByte is null");
                }
                ArrayList arrayList = new ArrayList();
                a(listA2, arrayList);
                com.huawei.maps.offlinedata.utils.g.c("DeleteDeviceMapInfoReceiver", "handleDeleteDeviceMapResponse deleteMapInfos:" + new Gson().toJson(arrayList));
                if (iB == 1) {
                    if (l != null) {
                        com.huawei.maps.offlinedata.jsbridge.a.a().a(arrayList, l.longValue());
                    }
                    com.huawei.maps.offlinedata.service.device.e.a().b(iB4);
                    return;
                }
                if (((ArrayList) this.f17940a.get(Integer.valueOf(iB4))) == null) {
                    this.f17940a.put(Integer.valueOf(iB4), new ArrayList());
                }
                ((ArrayList) this.f17940a.get(Integer.valueOf(iB4))).addAll(arrayList);
                if (((ArrayList) this.f17940a.get(Integer.valueOf(iB4))).size() == iB3) {
                    com.huawei.maps.offlinedata.utils.g.c("DeleteDeviceMapInfoReceiver", "handleDeleteDeviceMapResponse all frame end:" + new Gson().toJson(this.f17940a.get(Integer.valueOf(iB4))));
                    if (l != null) {
                        com.huawei.maps.offlinedata.jsbridge.a.a().a(this.f17940a.get(Integer.valueOf(iB4)), l.longValue());
                    }
                    this.f17940a.remove(Integer.valueOf(iB4));
                    com.huawei.maps.offlinedata.service.device.e.a().b(iB4);
                }
                if (((ArrayList) this.f17940a.get(Integer.valueOf(iB4))).size() > iB3) {
                    if (l != null) {
                        com.huawei.maps.offlinedata.jsbridge.a.a().a(-1, "data error", l.longValue());
                    }
                    this.f17940a.remove(Integer.valueOf(iB4));
                    com.huawei.maps.offlinedata.service.device.e.a().b(iB4);
                    com.huawei.maps.offlinedata.utils.g.b("DeleteDeviceMapInfoReceiver", "handleDeleteDeviceMapResponse totalMapNum:" + iB3 + ", size:" + ((ArrayList) this.f17940a.get(Integer.valueOf(iB4))).size());
                    return;
                }
                return;
            }
            com.huawei.maps.offlinedata.utils.g.d("DeleteDeviceMapInfoReceiver", "MapDelete tlvFathers is empty");
        } catch (com.huawei.maps.offlinedata.service.device.tlvtools.g unused) {
            com.huawei.maps.offlinedata.utils.g.b("DeleteDeviceMapInfoReceiver", "catch TlvException");
            if (0 != 0) {
                com.huawei.maps.offlinedata.jsbridge.a.a().a(-1, TrackConstants$Events.EXCEPTION, l.longValue());
            }
        }
    }
}
