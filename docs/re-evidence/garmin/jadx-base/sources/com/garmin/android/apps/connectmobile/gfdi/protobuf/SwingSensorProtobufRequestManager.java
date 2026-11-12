package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.ListView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.golf.truswing.ClubSelectionDrawerFragment;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.Configuration;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDISwingSensor;
import com.garmin.proto.generated.GDISwingSensorClubs;
import com.garmin.proto.generated.GDISwingSensorExtension;
import hk0.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import wl0.h;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
public class SwingSensorProtobufRequestManager {

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.SwingSensorProtobufRequestManager$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$garmin$proto$generated$GDISwingSensorClubs$SetActiveClubResponse$ResponseStatus;

        static {
            int[] iArr = new int[GDISwingSensorClubs.SetActiveClubResponse.ResponseStatus.values().length];
            $SwitchMap$com$garmin$proto$generated$GDISwingSensorClubs$SetActiveClubResponse$ResponseStatus = iArr;
            try {
                iArr[GDISwingSensorClubs.SetActiveClubResponse.ResponseStatus.UNKNOWN_RESPONSE_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$garmin$proto$generated$GDISwingSensorClubs$SetActiveClubResponse$ResponseStatus[GDISwingSensorClubs.SetActiveClubResponse.ResponseStatus.OK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$garmin$proto$generated$GDISwingSensorClubs$SetActiveClubResponse$ResponseStatus[GDISwingSensorClubs.SetActiveClubResponse.ResponseStatus.INVALID_CLUB_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$garmin$proto$generated$GDISwingSensorClubs$SetActiveClubResponse$ResponseStatus[GDISwingSensorClubs.SetActiveClubResponse.ResponseStatus.NO_REMOTE_DEVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void getGolfClubList(Context context, final long j8, final wl0.e eVar) {
        GDISwingSensorClubs.GetClubListRequest.Builder builderNewBuilder = GDISwingSensorClubs.GetClubListRequest.newBuilder();
        GDISwingSensor.SwingSensorService.Builder builderNewBuilder2 = GDISwingSensor.SwingSensorService.newBuilder();
        builderNewBuilder2.setGetClubListRequest(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.setExtension(GDISwingSensorExtension.swingSensorService, builderNewBuilder2.build());
        ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), j8, new wm2.b() { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.SwingSensorProtobufRequestManager.1
            @Override // wm2.b
            public void onResponseFailed(int i14) {
                wl0.e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.onClubListRequestFailed(j8, wl0.e.a.PROTOBUF_REQUEST_FAILED);
                }
            }

            @Override // wm2.b
            public void onResponseReceived(int i14, GDISmartProto.Smart smart) {
                if (eVar == null) {
                    return;
                }
                GDISwingSensor.SwingSensorService swingSensorService = ProtoUtil.getSwingSensorService(smart);
                if (swingSensorService == null) {
                    eVar.onClubListRequestFailed(j8, wl0.e.a.RESPONSE_MISSING_DATA);
                    return;
                }
                if (!swingSensorService.hasGetClubListResponse()) {
                    eVar.onClubListRequestFailed(j8, wl0.e.a.RESPONSE_MISSING_DATA);
                }
                GDISwingSensorClubs.GetClubListResponse getClubListResponse = swingSensorService.getGetClubListResponse();
                long activeClubId = getClubListResponse.getActiveClubId();
                List<GDISwingSensorClubs.Club> clubsList = getClubListResponse.getClubsList();
                ArrayList arrayList = new ArrayList();
                Iterator<GDISwingSensorClubs.Club> it = clubsList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.a(it.next()));
                }
                eVar.onClubListRetrieved(j8, arrayList, activeClubId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$notifyListener$0(List list, com.garmin.android.apps.connectmobile.golf.truswing.d dVar, List list2) {
        wl0.f fVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((com.garmin.android.apps.connectmobile.golf.truswing.d.a) it.next()) != com.garmin.android.apps.connectmobile.golf.truswing.d.a.SUCCESS) {
                ((com.garmin.android.apps.connectmobile.golf.truswing.b) dVar).getClass();
                i2.f(a2.GOLF, "ClubSelectionDrawerFragment", "Error setting active club on one or more devices");
                for (int i14 = 0; i14 < list2.size(); i14++) {
                    i2.f(a2.GOLF, "ClubSelectionDrawerFragment", "DeviceId: " + list2.get(i14) + ", Status: " + ((com.garmin.android.apps.connectmobile.golf.truswing.d.a) list.get(i14)).name());
                }
                return;
            }
        }
        com.garmin.android.apps.connectmobile.golf.truswing.b bVar = (com.garmin.android.apps.connectmobile.golf.truswing.b) dVar;
        ClubSelectionDrawerFragment clubSelectionDrawerFragment = bVar.f35813c;
        int i15 = bVar.f35811a;
        clubSelectionDrawerFragment.f35764l = i15;
        ListView listView = clubSelectionDrawerFragment.f35756d;
        if (listView != null) {
            listView.setItemChecked(i15 + 1, true);
        }
        DrawerLayout drawerLayout = clubSelectionDrawerFragment.f35755c;
        if (drawerLayout != null) {
            drawerLayout.c(clubSelectionDrawerFragment.f35758f, true);
        }
        ClubSelectionDrawerFragment.c cVar = clubSelectionDrawerFragment.f35753a;
        if (cVar != null && (fVar = clubSelectionDrawerFragment.f35766n) != null) {
            cVar.S8((com.garmin.android.apps.connectmobile.golf.truswing.model.a) fVar.getItem(i15));
        }
        i2.a(a2.GOLF, "ClubSelectionDrawerFragment", "Club set to " + bVar.f35812b.f35891c.name());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyListener(List<Long> list, List<com.garmin.android.apps.connectmobile.golf.truswing.d.a> list2, com.garmin.android.apps.connectmobile.golf.truswing.d dVar) {
        if (list == null || list2 == null || dVar == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new a8.d(list2, 15, dVar, list));
    }

    public static void setActiveClub(Context context, long j8, final com.garmin.android.apps.connectmobile.golf.truswing.d dVar) {
        if (context == null) {
            return;
        }
        ArrayList arrayListH = h.i().h(true);
        if (arrayListH == null) {
            if (dVar != null) {
                ((com.garmin.android.apps.connectmobile.golf.truswing.b) dVar).a(com.garmin.android.apps.connectmobile.golf.truswing.d.a.NO_CLUB_DATA_AVAILABLE);
                return;
            }
            return;
        }
        Iterator it = arrayListH.iterator();
        while (it.hasNext()) {
            if (((com.garmin.android.apps.connectmobile.golf.truswing.model.a) it.next()).f35890b == j8) {
                if (!h.o()) {
                    if (dVar != null) {
                        ((com.garmin.android.apps.connectmobile.golf.truswing.b) dVar).a(com.garmin.android.apps.connectmobile.golf.truswing.d.a.NO_REMOTE_DEVICE);
                        return;
                    }
                    return;
                }
                ArrayList<DeviceProfile> arrayListD = p.d();
                ArrayList<DeviceProfile> arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                for (DeviceProfile deviceProfile : arrayListD) {
                    Configuration configuration = deviceProfile.getConfiguration();
                    if (configuration != null) {
                        if (l2.q(SupportedCapability.SWING_SENSOR, configuration.getCapabilityFlagsAsSet())) {
                            arrayList2.add(deviceProfile);
                            arrayList.add(deviceProfile);
                        } else {
                            if (l2.q(SupportedCapability.SWING_SENSOR_REMOTE, configuration.getCapabilityFlagsAsSet())) {
                                arrayList.add(deviceProfile);
                            }
                        }
                    }
                }
                for (final DeviceProfile deviceProfile2 : arrayList) {
                    long f172494b = deviceProfile2.getF92746j();
                    GDISwingSensorClubs.SetActiveClubRequest.Builder builderNewBuilder = GDISwingSensorClubs.SetActiveClubRequest.newBuilder();
                    builderNewBuilder.setClubId(j8);
                    GDISwingSensor.SwingSensorService.Builder builderNewBuilder2 = GDISwingSensor.SwingSensorService.newBuilder();
                    builderNewBuilder2.setSetActiveClubRequest(builderNewBuilder);
                    GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                    builderNewBuilder3.setExtension(GDISwingSensorExtension.swingSensorService, builderNewBuilder2.build());
                    i2.d("ClubSelection", "Sending club selection to " + f172494b);
                    ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), f172494b, new wm2.b() { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.SwingSensorProtobufRequestManager.2
                        @Override // wm2.b
                        public void onResponseFailed(int i14) {
                            arrayList3.add(Long.valueOf(deviceProfile2.getF92746j()));
                            arrayList4.add(com.garmin.android.apps.connectmobile.golf.truswing.d.a.PROTOBUF_REQUEST_FAILED);
                            synchronized (arrayList2) {
                                try {
                                    arrayList2.remove(deviceProfile2);
                                    if (arrayList2.size() == 0) {
                                        SwingSensorProtobufRequestManager.notifyListener(arrayList3, arrayList4, dVar);
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }

                        @Override // wm2.b
                        public void onResponseReceived(int i14, GDISmartProto.Smart smart) {
                            i2.d("ClubSelection", "Response received");
                            if (smart == null) {
                                arrayList3.add(Long.valueOf(deviceProfile2.getF92746j()));
                                arrayList4.add(com.garmin.android.apps.connectmobile.golf.truswing.d.a.RESPONSE_MISSING_DATA);
                                return;
                            }
                            GDISwingSensor.SwingSensorService swingSensorService = ProtoUtil.getSwingSensorService(smart);
                            if (swingSensorService == null || !swingSensorService.hasSetActiveClubResponse()) {
                                arrayList3.add(Long.valueOf(deviceProfile2.getF92746j()));
                                arrayList4.add(com.garmin.android.apps.connectmobile.golf.truswing.d.a.RESPONSE_MISSING_DATA);
                                return;
                            }
                            int i15 = AnonymousClass3.$SwitchMap$com$garmin$proto$generated$GDISwingSensorClubs$SetActiveClubResponse$ResponseStatus[swingSensorService.getSetActiveClubResponse().getStatus().ordinal()];
                            if (i15 == 1) {
                                arrayList3.add(Long.valueOf(deviceProfile2.getF92746j()));
                                arrayList4.add(com.garmin.android.apps.connectmobile.golf.truswing.d.a.PROTOBUF_REQUEST_FAILED);
                            } else if (i15 == 2) {
                                arrayList3.add(Long.valueOf(deviceProfile2.getF92746j()));
                                arrayList4.add(com.garmin.android.apps.connectmobile.golf.truswing.d.a.SUCCESS);
                            } else if (i15 == 3) {
                                arrayList3.add(Long.valueOf(deviceProfile2.getF92746j()));
                                arrayList4.add(com.garmin.android.apps.connectmobile.golf.truswing.d.a.INVALID_CLUB_ID);
                            } else if (i15 == 4) {
                                arrayList3.add(Long.valueOf(deviceProfile2.getF92746j()));
                                arrayList4.add(com.garmin.android.apps.connectmobile.golf.truswing.d.a.NO_REMOTE_DEVICE);
                            }
                            synchronized (arrayList2) {
                                try {
                                    arrayList2.remove(deviceProfile2);
                                    if (arrayList2.size() == 0) {
                                        SwingSensorProtobufRequestManager.notifyListener(arrayList3, arrayList4, dVar);
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                    });
                }
                return;
            }
        }
        if (dVar != null) {
            ((com.garmin.android.apps.connectmobile.golf.truswing.b) dVar).a(com.garmin.android.apps.connectmobile.golf.truswing.d.a.INVALID_CLUB_ID);
        }
    }
}
