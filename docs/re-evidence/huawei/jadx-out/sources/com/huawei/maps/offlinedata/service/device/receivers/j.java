package com.huawei.maps.offlinedata.service.device.receivers;

import com.google.gson.Gson;
import com.huawei.maps.offlinedata.handler.dto.device.DownloadMapInfo;
import com.huawei.maps.offlinedata.health.init.OnObtainMapDataListener;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class j implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile j f17961b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f17962a = new HashMap();

    private j() {
    }

    private OnObtainMapDataListener a() {
        return com.huawei.maps.offlinedata.service.device.b.a();
    }

    public static j b() {
        if (f17961b == null) {
            synchronized (j.class) {
                if (f17961b == null) {
                    f17961b = new j();
                }
            }
        }
        return f17961b;
    }

    private static void a(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jA = -1;
            int iB = 0;
            int iB2 = -1;
            int iB3 = -1;
            for (com.huawei.maps.offlinedata.service.device.tlvtools.f fVar : ((com.huawei.maps.offlinedata.service.device.tlvtools.d) it.next()).b()) {
                byte[] bArrB = fVar.b();
                byte bA = fVar.a();
                if (bA != 22) {
                    switch (bA) {
                        case 9:
                            jA = com.huawei.maps.offlinedata.service.device.tlvtools.a.a(bArrB, -1L);
                            break;
                        case 10:
                            iB3 = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(bArrB, -1);
                            break;
                        case 11:
                            iB2 = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(bArrB, -1);
                            break;
                        default:
                            com.huawei.maps.offlinedata.utils.g.d("QueryDeviceDownloadedMapInfoReceiver", "parseDownloadMapInfoTlv parse mapInfo default");
                            break;
                    }
                } else {
                    iB = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(bArrB, 0);
                    com.huawei.maps.offlinedata.utils.g.c("QueryDeviceDownloadedMapInfoReceiver", "parseDownloadMapInfoTlv downloadType is: " + iB);
                }
            }
            DownloadMapInfo downloadMapInfo = new DownloadMapInfo();
            downloadMapInfo.setCityId(String.valueOf(jA));
            downloadMapInfo.setVersion(iB2);
            downloadMapInfo.setMspType(iB3);
            downloadMapInfo.setDownloadType(iB);
            list2.add(downloadMapInfo);
        }
    }

    @Override // com.huawei.maps.offlinedata.service.device.receivers.f
    public void a(int i, byte[] bArr) {
        Long l = null;
        int i2 = 0;
        try {
            com.huawei.maps.offlinedata.service.device.tlvtools.d dVarB = com.huawei.maps.offlinedata.service.device.tlvtools.e.b(bArr);
            if (dVarB == null) {
                com.huawei.maps.offlinedata.utils.g.d("QueryDeviceDownloadedMapInfoReceiver", "LocalMapList TlvByteFather is null");
                return;
            }
            try {
                int iB = -1;
                int iB2 = -1;
                int iB3 = -1;
                int iB4 = -1;
                for (com.huawei.maps.offlinedata.service.device.tlvtools.f fVar : dVarB.b()) {
                    try {
                        byte[] bArrB = fVar.b();
                        byte bA = fVar.a();
                        if (bA == 19) {
                            iB = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(bArrB, -1);
                            l = (Long) com.huawei.maps.offlinedata.service.device.e.a().b().get(Integer.valueOf(iB));
                        } else if (bA == 4) {
                            iB2 = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(bArrB, -1);
                        } else if (bA == 5) {
                            iB3 = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(bArrB, -1);
                        } else if (bA != 6) {
                            com.huawei.maps.offlinedata.utils.g.d("QueryDeviceDownloadedMapInfoReceiver", "handleDownloadedMapListResponse default");
                        } else {
                            iB4 = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(bArrB, -1);
                        }
                    } catch (com.huawei.maps.offlinedata.service.device.tlvtools.g e) {
                        e = e;
                        i2 = iB;
                    } catch (Exception e2) {
                        e = e2;
                        i2 = iB;
                        a(i2, -1, TrackConstants$Events.EXCEPTION, l);
                        com.huawei.maps.offlinedata.utils.g.b("QueryDeviceDownloadedMapInfoReceiver", "catch Exception:" + e.getMessage());
                        return;
                    }
                }
                com.huawei.maps.offlinedata.utils.g.c("QueryDeviceDownloadedMapInfoReceiver", "totalFrameNum:" + iB2 + ",frameIndex:" + iB3 + ",totalMapNum:" + iB4 + ", msgId:" + iB);
                if (iB4 == 0) {
                    a(iB, l, new ArrayList());
                    return;
                }
                List listA = dVarB.a();
                if (listA != null && !listA.isEmpty()) {
                    com.huawei.maps.offlinedata.service.device.tlvtools.d dVar = (com.huawei.maps.offlinedata.service.device.tlvtools.d) listA.get(0);
                    if (dVar == null) {
                        com.huawei.maps.offlinedata.utils.g.b("QueryDeviceDownloadedMapInfoReceiver", "LocalMapList childTlvList is null");
                        return;
                    }
                    List listA2 = dVar.a();
                    if (listA2 != null && !listA2.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        a(listA2, arrayList);
                        com.huawei.maps.offlinedata.utils.g.c("QueryDeviceDownloadedMapInfoReceiver", "handleDownloadedMapListResponse callbackId " + l + ", size:" + arrayList.size() + ", downloadMapInfos:" + new Gson().toJson(arrayList));
                        if (iB2 == 1) {
                            a(iB, l, arrayList);
                            return;
                        }
                        if (((ArrayList) this.f17962a.get(Integer.valueOf(iB))) == null) {
                            this.f17962a.put(Integer.valueOf(iB), arrayList);
                        } else {
                            ((ArrayList) this.f17962a.get(Integer.valueOf(iB))).addAll(arrayList);
                        }
                        if (((ArrayList) this.f17962a.get(Integer.valueOf(iB))).size() == iB4) {
                            com.huawei.maps.offlinedata.utils.g.c("QueryDeviceDownloadedMapInfoReceiver", "handleDownloadedMapListResponse all frame end:" + new Gson().toJson(this.f17962a.get(Integer.valueOf(iB))));
                            a(iB, l, (ArrayList) this.f17962a.get(Integer.valueOf(iB)));
                            this.f17962a.remove(Integer.valueOf(iB));
                            return;
                        }
                        if (((ArrayList) this.f17962a.get(Integer.valueOf(iB))).size() > iB4) {
                            a(iB, -1, "data error", l);
                            com.huawei.maps.offlinedata.utils.g.b("QueryDeviceDownloadedMapInfoReceiver", "handleDownloadedMapListResponse totalMapNum:" + iB4 + ", size:" + ((ArrayList) this.f17962a.get(Integer.valueOf(iB))).size());
                            this.f17962a.remove(Integer.valueOf(iB));
                            return;
                        }
                        com.huawei.maps.offlinedata.utils.g.d("QueryDeviceDownloadedMapInfoReceiver", "handleDownloadedMapListResponse wait next frame.");
                        return;
                    }
                    com.huawei.maps.offlinedata.utils.g.b("QueryDeviceDownloadedMapInfoReceiver", "mapInfosTlvByte is null");
                    return;
                }
                com.huawei.maps.offlinedata.utils.g.b("QueryDeviceDownloadedMapInfoReceiver", "LocalMapList tlvFathers is empty");
                return;
            } catch (com.huawei.maps.offlinedata.service.device.tlvtools.g e3) {
                e = e3;
                i2 = -1;
            } catch (Exception e4) {
                e = e4;
                i2 = -1;
            }
        } catch (com.huawei.maps.offlinedata.service.device.tlvtools.g e5) {
            e = e5;
        } catch (Exception e6) {
            e = e6;
        }
        a(i2, -1, TrackConstants$Events.EXCEPTION, l);
        com.huawei.maps.offlinedata.utils.g.b("QueryDeviceDownloadedMapInfoReceiver", "catch TlvException:" + e.getMessage());
    }

    private void a(int i, Long l, ArrayList arrayList) {
        if (i >= 10000) {
            a().downLoadInfo(arrayList, i);
        } else if (l != null) {
            com.huawei.maps.offlinedata.jsbridge.a.a().a(arrayList, l.longValue());
        }
        com.huawei.maps.offlinedata.service.device.e.a().b(i);
    }

    private void a(int i, int i2, String str, Long l) {
        if (i >= 10000) {
            a().downLoadInfo(new ArrayList(), i);
        } else if (l != null) {
            com.huawei.maps.offlinedata.jsbridge.a.a().a(i2, str, l.longValue());
        }
        com.huawei.maps.offlinedata.service.device.e.a().b(i);
    }
}
