package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import am.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.database.SQLException;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.GDIInternationalGolf;
import com.garmin.proto.generated.GDIInternationalGolfExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.common.primitives.Longs;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessage;
import hl0.p;
import hl0.q;
import hl0.r;
import hl0.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o53.c0;
import o53.s0;
import rd2.k;
import rd2.l;
import sd2.h;

/* JADX INFO: loaded from: classes8.dex */
class InternationalGolfProtobufRequestHandler extends ProtobufRequestHandler {
    private static final String TAG = "IntlGolfProtoReqHandler";
    private final String macAddress;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.InternationalGolfProtobufRequestHandler$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$garmin$proto$generated$GDIInternationalGolf$MapType;

        static {
            int[] iArr = new int[GDIInternationalGolf.MapType.values().length];
            $SwitchMap$com$garmin$proto$generated$GDIInternationalGolf$MapType = iArr;
            try {
                iArr[GDIInternationalGolf.MapType.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$garmin$proto$generated$GDIInternationalGolf$MapType[GDIInternationalGolf.MapType.MEDIUM_PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$garmin$proto$generated$GDIInternationalGolf$MapType[GDIInternationalGolf.MapType.COURSE_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public InternationalGolfProtobufRequestHandler(Context context, long j8, String str, int i14, GDISmartProto.Smart smart) {
        super(context, j8, i14, smart);
        this.macAddress = str;
    }

    private int convertProtoToDatabaseObj(GDIInternationalGolf.MapType mapType) {
        if (mapType != null && mapType != GDIInternationalGolf.MapType.MEDIUM) {
            if (mapType == GDIInternationalGolf.MapType.MEDIUM_PLUS) {
                return 1;
            }
            if (mapType == GDIInternationalGolf.MapType.COURSE_VIEW) {
                return 2;
            }
        }
        return 0;
    }

    private void respond(GDIInternationalGolf.GetGolfCourseListRequest getGolfCourseListRequest) throws Throwable {
        int iB;
        int iB2;
        if (!getGolfCourseListRequest.hasNumCourses()) {
            i2.i(TAG, "Aborting. Number of courses not set.");
            return;
        }
        if (getGolfCourseListRequest.getNumCourses() <= 0) {
            i2.i(TAG, "Aborting. Number of courses requested [" + getGolfCourseListRequest.getNumCourses() + "].");
            return;
        }
        if (!getGolfCourseListRequest.hasPosition()) {
            i2.i(TAG, "Aborting. Position not set.");
            return;
        }
        ArrayList<h> arrayList = new ArrayList();
        GDIInternationalGolf.GetGolfCourseListResponse.Builder builderNewBuilder = GDIInternationalGolf.GetGolfCourseListResponse.newBuilder();
        try {
            l.e().getClass();
            arrayList = l.g();
            if (!arrayList.isEmpty()) {
                int lat = getGolfCourseListRequest.getPosition().getLat();
                int lon = getGolfCourseListRequest.getPosition().getLon();
                Iterator it = arrayList.iterator();
                while (true) {
                    iB = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    h hVar = (h) it.next();
                    int iIntValue = hVar.f158664g.intValue();
                    int iIntValue2 = hVar.f158665h.intValue();
                    int i14 = lb2.b.f111713b;
                    int i15 = ((iIntValue + lat) >> 1) + 1610612736;
                    int i16 = (i15 >> 30) & 3;
                    int i17 = (i15 & 1073741823) - 536870912;
                    if (i16 == 0) {
                        iB = lb2.a.b(i17);
                    } else if (i16 != 1) {
                        if (i16 == 2) {
                            iB2 = lb2.a.b(i17);
                        } else if (i16 == 3) {
                            iB2 = lb2.a.a(i17);
                        }
                        iB = -iB2;
                    } else {
                        iB = lb2.a.a(i17);
                    }
                    int i18 = (int) lb2.b.f111712a;
                    if (iB < i18) {
                        iB = i18;
                    }
                    long j8 = (int) ((((long) (lon - iIntValue2)) * ((long) iB)) >> 31);
                    long j14 = lat - iIntValue;
                    long j15 = (j14 * j14) + (j8 * j8);
                    long j16 = Longs.MAX_POWER_OF_TWO;
                    long j17 = 0;
                    do {
                        long j18 = j17 + j16;
                        if (j18 <= j15) {
                            j15 -= j18;
                            j17 = j18 + j16;
                        }
                        j17 >>= 1;
                        j16 >>= 2;
                    } while (j16 != 0);
                    if (j15 > j17) {
                        j17++;
                    }
                    hVar.f158676t = Long.valueOf((j17 * 2002735018) / 214748364800L);
                }
                Collections.sort(arrayList, new hl0.h());
                int numCourses = getGolfCourseListRequest.getNumCourses();
                if (arrayList.size() < numCourses) {
                    numCourses = arrayList.size();
                }
                while (iB < numCourses) {
                    h hVar2 = (h) arrayList.get(iB);
                    GDIDataTypes.ScPoint.Builder builderNewBuilder2 = GDIDataTypes.ScPoint.newBuilder();
                    builderNewBuilder2.setLat(hVar2.f158664g.intValue());
                    builderNewBuilder2.setLon(hVar2.f158665h.intValue());
                    GDIInternationalGolf.GolfCourseInfo.Builder builderNewBuilder3 = GDIInternationalGolf.GolfCourseInfo.newBuilder();
                    builderNewBuilder3.setBuildId(hVar2.f158658a.intValue());
                    builderNewBuilder3.setGlobalId(hVar2.f158663f.intValue());
                    builderNewBuilder3.setName(hVar2.f158666i);
                    builderNewBuilder3.setPosition(builderNewBuilder2);
                    builderNewBuilder.addCourseList(builderNewBuilder3);
                    iB++;
                }
            }
            builderNewBuilder.setStatus(GDIInternationalGolf.GetGolfCourseListResponse.ResponseStatus.OK);
        } catch (SQLException e4) {
            i2.g(e4, TAG);
            builderNewBuilder.setStatus(GDIInternationalGolf.GetGolfCourseListResponse.ResponseStatus.DATABASE_ERROR);
        }
        ProtobufRequestManager.getInstance().respondToRequest(this.requestId, this.deviceId, setInternationalGolfService(GDISmartProto.Smart.newBuilder(), GDIInternationalGolf.InternationalGolfService.newBuilder().setGetGolfCourseListResponse(builderNewBuilder)).build());
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (h hVar3 : arrayList) {
            arrayList2.add(GDIInternationalGolf.CourseUpdateRequestInfo.newBuilder().setBuildId(hVar3.f158658a.intValue()).setGlobalId(hVar3.f158663f.intValue()).build());
        }
        r rVar = new r(arrayList2, GDIInternationalGolf.MapType.MEDIUM, this.deviceId);
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new s(rVar, null), 3);
    }

    private void respondToCourseUpdateRequestIntermediateMapType(GDIInternationalGolf.CourseUpdateRequest courseUpdateRequest) throws Throwable {
        List<GDIInternationalGolf.CourseUpdateRequestInfo> installedCoursesList = courseUpdateRequest.getInstalledCoursesList();
        ArrayList arrayList = new ArrayList();
        GDIInternationalGolf.CourseUpdateResponse.Builder builderNewBuilder = GDIInternationalGolf.CourseUpdateResponse.newBuilder();
        builderNewBuilder.setStatus(GDIInternationalGolf.CourseUpdateResponse.ResponseStatus.OK);
        k kVarF = k.f();
        for (GDIInternationalGolf.CourseUpdateRequestInfo courseUpdateRequestInfo : installedCoursesList) {
            int globalId = courseUpdateRequestInfo.getGlobalId();
            GDIInternationalGolf.CourseUpdateResponseInfo.Builder builderNewBuilder2 = GDIInternationalGolf.CourseUpdateResponseInfo.newBuilder();
            builderNewBuilder2.setGlobalId(globalId);
            long j8 = this.deviceId;
            int number = courseUpdateRequest.getMapType().getNumber();
            kVarF.getClass();
            sd2.g gVarE = k.e(globalId, number, j8);
            boolean z14 = true;
            boolean z15 = false;
            if (gVarE != null) {
                int iB = sd2.g.b(gVarE.f158654e);
                if (iB > sd2.g.b(courseUpdateRequestInfo.getPartNumber())) {
                    builderNewBuilder2.setBuildId(iB);
                } else {
                    z14 = false;
                }
                z15 = z14;
                z14 = false;
            }
            if (z14) {
                arrayList.add(courseUpdateRequestInfo);
            }
            builderNewBuilder2.setUpdateAvailable(z15);
            builderNewBuilder.addInstalledCourses(builderNewBuilder2.build());
        }
        ProtobufRequestManager.getInstance().respondToRequest(this.requestId, this.deviceId, setInternationalGolfService(GDISmartProto.Smart.newBuilder(), GDIInternationalGolf.InternationalGolfService.newBuilder().setCourseUpdateResponse(builderNewBuilder)).build());
        if (arrayList.isEmpty()) {
            return;
        }
        p pVar = new p(arrayList, this.deviceId);
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new q(pVar, null), 3);
    }

    private void respondToCourseUpdateRequestMediumOrMediumPlusMapType(GDIInternationalGolf.CourseUpdateRequest courseUpdateRequest) throws Throwable {
        int iConvertProtoToDatabaseObj = convertProtoToDatabaseObj(courseUpdateRequest.getMapType());
        List<GDIInternationalGolf.CourseUpdateRequestInfo> installedCoursesList = courseUpdateRequest.getInstalledCoursesList();
        ArrayList arrayList = new ArrayList();
        GDIInternationalGolf.CourseUpdateResponse.Builder builderNewBuilder = GDIInternationalGolf.CourseUpdateResponse.newBuilder();
        builderNewBuilder.setStatus(GDIInternationalGolf.CourseUpdateResponse.ResponseStatus.OK);
        l lVarE = l.e();
        for (GDIInternationalGolf.CourseUpdateRequestInfo courseUpdateRequestInfo : installedCoursesList) {
            int globalId = courseUpdateRequestInfo.getGlobalId();
            GDIInternationalGolf.CourseUpdateResponseInfo.Builder builderNewBuilder2 = GDIInternationalGolf.CourseUpdateResponseInfo.newBuilder();
            builderNewBuilder2.setGlobalId(globalId);
            Integer numValueOf = Integer.valueOf(globalId);
            lVarE.getClass();
            h hVarI = l.i(iConvertProtoToDatabaseObj, numValueOf);
            boolean z14 = false;
            boolean z15 = true;
            if (hVarI == null || hVarI.f158678w.intValue() != 5) {
                z15 = false;
                z14 = true;
            } else if (!courseUpdateRequestInfo.hasBuildId() || hVarI.f158658a.intValue() <= courseUpdateRequestInfo.getBuildId()) {
                z15 = false;
            }
            if (z14) {
                arrayList.add(courseUpdateRequestInfo);
            }
            builderNewBuilder2.setUpdateAvailable(z15);
            builderNewBuilder2.setBuildId(z15 ? hVarI.f158658a.intValue() : courseUpdateRequestInfo.getBuildId());
            builderNewBuilder.addInstalledCourses(builderNewBuilder2.build());
        }
        ProtobufRequestManager.getInstance().respondToRequest(this.requestId, this.deviceId, setInternationalGolfService(GDISmartProto.Smart.newBuilder(), GDIInternationalGolf.InternationalGolfService.newBuilder().setCourseUpdateResponse(builderNewBuilder)).build());
        if (arrayList.isEmpty()) {
            return;
        }
        r rVar = new r(arrayList, courseUpdateRequest.getMapType(), this.deviceId);
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new s(rVar, null), 3);
    }

    private void respondToGetCourseRequestIntermediateMapType(GDIInternationalGolf.GetGolfCourseRequest getGolfCourseRequest) throws Throwable {
        zj2.e eVar;
        GDIInternationalGolf.GetGolfCourseResponse.Builder builderNewBuilder = GDIInternationalGolf.GetGolfCourseResponse.newBuilder();
        k kVarF = k.f();
        long j8 = this.deviceId;
        int globalId = getGolfCourseRequest.getGlobalId();
        int number = getGolfCourseRequest.getMapType().getNumber();
        kVarF.getClass();
        sd2.g gVarE = k.e(globalId, number, j8);
        if (gVarE == null) {
            builderNewBuilder.setStatus(GDIInternationalGolf.GetGolfCourseResponse.ResponseStatus.COURSE_NOT_AVAILABLE);
        } else {
            builderNewBuilder.setGlobalId(gVarE.f158651b);
            builderNewBuilder.setPartNumber(gVarE.f158654e);
            builderNewBuilder.setGolfCourseGmaData(ByteString.copyFrom(gVarE.f158656g));
            builderNewBuilder.setGolfCourseUnlData(ByteString.copyFrom(gVarE.f158657h));
            byte[] bArr = gVarE.f158655f;
            Context context = this.contextRef.get();
            if (context == null || (eVar = (zj2.e) da2.d.c(context).getCapability(this.macAddress, zj2.e.class)) == null) {
                builderNewBuilder.setStatus(GDIInternationalGolf.GetGolfCourseResponse.ResponseStatus.UNKNOWN_RESPONSE_STATUS);
            } else {
                byte[] bArr2 = gVarE.f158655f;
                bArr2.getClass();
                int i14 = zj2.e.f204964l;
                builderNewBuilder.setGolfCourseFile(GDIDataTypes.DataTransferItem.newBuilder().setId(eVar.d(bArr2, null, null, null)).setSize(gVarE.f158655f.length));
                builderNewBuilder.setStatus(GDIInternationalGolf.GetGolfCourseResponse.ResponseStatus.OK);
            }
            StringBuilder sb3 = new StringBuilder("respondToGetCourseRequestIntermediateMapType: globalID ");
            sb3.append(builderNewBuilder.getGlobalId());
            sb3.append(", partNbr ");
            sb3.append(builderNewBuilder.getPartNumber());
            sb3.append(", GMA ");
            sb3.append(builderNewBuilder.getGolfCourseGmaData().size());
            sb3.append(" bytes, UNL ");
            sb3.append(builderNewBuilder.getGolfCourseUnlData().size());
            sb3.append(" bytes, IMG ");
            sb3.append(bArr != null ? j.q(new StringBuilder(), bArr.length, " bytes") : " null");
            i2.d(TAG, sb3.toString());
        }
        ProtobufRequestManager.getInstance().respondToRequest(this.requestId, this.deviceId, setInternationalGolfService(GDISmartProto.Smart.newBuilder(), GDIInternationalGolf.InternationalGolfService.newBuilder().setGetGolfCourseResponse(builderNewBuilder)).build());
    }

    @SuppressLint({"SwitchIntDef"})
    private void respondToGetCourseRequestMediumOrMediumPlusMapType(GDIInternationalGolf.GetGolfCourseRequest getGolfCourseRequest) throws Throwable {
        int iConvertProtoToDatabaseObj = convertProtoToDatabaseObj(getGolfCourseRequest.getMapType());
        GDIInternationalGolf.GetGolfCourseResponse.Builder builderNewBuilder = GDIInternationalGolf.GetGolfCourseResponse.newBuilder();
        try {
            l lVarE = l.e();
            int globalId = getGolfCourseRequest.getGlobalId();
            int buildId = getGolfCourseRequest.getBuildId();
            lVarE.getClass();
            byte[] bArrH = l.h(globalId, buildId, iConvertProtoToDatabaseObj);
            if (bArrH == null) {
                if (iConvertProtoToDatabaseObj == 0) {
                    l lVarE2 = l.e();
                    int globalId2 = getGolfCourseRequest.getGlobalId();
                    int buildId2 = getGolfCourseRequest.getBuildId();
                    lVarE2.getClass();
                    bArrH = l.h(globalId2, buildId2, 1);
                } else if (iConvertProtoToDatabaseObj == 1) {
                    l lVarE3 = l.e();
                    int globalId3 = getGolfCourseRequest.getGlobalId();
                    int buildId3 = getGolfCourseRequest.getBuildId();
                    lVarE3.getClass();
                    bArrH = l.h(globalId3, buildId3, 0);
                }
            }
            if (bArrH == null || bArrH.length == 0) {
                builderNewBuilder.setStatus(GDIInternationalGolf.GetGolfCourseResponse.ResponseStatus.COURSE_NOT_AVAILABLE);
            } else {
                builderNewBuilder.setGolfCourseData(ByteString.copyFrom(bArrH));
                builderNewBuilder.setGlobalId(getGolfCourseRequest.getGlobalId());
                builderNewBuilder.setStatus(GDIInternationalGolf.GetGolfCourseResponse.ResponseStatus.OK);
            }
        } catch (SQLException e4) {
            i2.i(TAG, "respondToGetCourseRequestMediumOrMediumPlusMapType: " + e4.getMessage());
            builderNewBuilder.setStatus(GDIInternationalGolf.GetGolfCourseResponse.ResponseStatus.DATABASE_ERROR);
        }
        ProtobufRequestManager.getInstance().respondToRequest(this.requestId, this.deviceId, setInternationalGolfService(GDISmartProto.Smart.newBuilder(), GDIInternationalGolf.InternationalGolfService.newBuilder().setGetGolfCourseResponse(builderNewBuilder)).build());
        l lVarE4 = l.e();
        Integer numValueOf = Integer.valueOf(getGolfCourseRequest.getGlobalId());
        Integer numValueOf2 = Integer.valueOf(getGolfCourseRequest.getBuildId());
        lVarE4.getClass();
        try {
            qd2.a.b().f144484a.delete("golf_downloaded_course", "global_layout_id =?  and build_id =?  and map_type =?  and name is null", new String[]{String.valueOf(numValueOf), String.valueOf(numValueOf2), String.valueOf(iConvertProtoToDatabaseObj)});
        } catch (Exception e14) {
            l.f152081a.error("deleteIfAutoUpdate", (Throwable) e14);
        }
    }

    private GDISmartProto.Smart.Builder setInternationalGolfService(GDISmartProto.Smart.Builder builder, GDIInternationalGolf.InternationalGolfService.Builder builder2) {
        builder.setExtension(GDIInternationalGolfExtension.internationalGolfService, builder2.build());
        return builder;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        if (this.contextRef.get() == null) {
            i2.i(TAG, "Aborting. Context is null.");
            return;
        }
        GDIInternationalGolf.InternationalGolfService internationalGolfService = (GDIInternationalGolf.InternationalGolfService) this.requestMsg.getExtension((GeneratedMessage.GeneratedExtension) GDIInternationalGolfExtension.internationalGolfService);
        if (internationalGolfService.hasGetGolfCourseListRequest()) {
            respond(internationalGolfService.getGetGolfCourseListRequest());
            return;
        }
        if (internationalGolfService.hasGetGolfCourseRequest()) {
            GDIInternationalGolf.GetGolfCourseRequest getGolfCourseRequest = internationalGolfService.getGetGolfCourseRequest();
            if (!getGolfCourseRequest.hasMapType() || !getGolfCourseRequest.hasGlobalId() || !getGolfCourseRequest.hasBuildId()) {
                i2.i(TAG, "get golf course request: either mapType, globalId, or buildId is missing");
                return;
            }
            int i14 = AnonymousClass1.$SwitchMap$com$garmin$proto$generated$GDIInternationalGolf$MapType[getGolfCourseRequest.getMapType().ordinal()];
            if (i14 == 1 || i14 == 2) {
                respondToGetCourseRequestMediumOrMediumPlusMapType(getGolfCourseRequest);
                return;
            } else if (i14 != 3) {
                respondToGetCourseRequestMediumOrMediumPlusMapType(getGolfCourseRequest);
                return;
            } else {
                respondToGetCourseRequestIntermediateMapType(getGolfCourseRequest);
                return;
            }
        }
        if (!internationalGolfService.hasCourseUpdateRequest()) {
            i2.i(TAG, "run: aborting, request type not implemented");
            return;
        }
        GDIInternationalGolf.CourseUpdateRequest courseUpdateRequest = internationalGolfService.getCourseUpdateRequest();
        if (courseUpdateRequest.hasMapType()) {
            int i15 = AnonymousClass1.$SwitchMap$com$garmin$proto$generated$GDIInternationalGolf$MapType[courseUpdateRequest.getMapType().ordinal()];
            if (i15 == 1 || i15 == 2) {
                respondToCourseUpdateRequestMediumOrMediumPlusMapType(courseUpdateRequest);
                return;
            }
            if (i15 == 3) {
                respondToCourseUpdateRequestIntermediateMapType(courseUpdateRequest);
                return;
            }
            i2.i(TAG, "course update request: map type [" + courseUpdateRequest.getMapType().name() + "] not yet implemented");
        }
    }
}
