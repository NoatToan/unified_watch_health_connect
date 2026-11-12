package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.library.livetrack.LivetrackService;
import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.GDIGroupLiveTrack;
import com.garmin.proto.generated.GDIGroupLiveTrackExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.ProtocolStringList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v.h;
import wd2.g1;
import wd2.m;
import wd2.o0;
import wd2.p0;
import wd2.q;
import wd2.t;
import wd2.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/GrouptrackProtobufRequestHandler;", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/ProtobufRequestHandler;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "deviceUnitId", "", "macAddress", "", "requestId", "", "requestMsg", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "<init>", "(Landroid/content/Context;JLjava/lang/String;ILcom/garmin/proto/generated/GDISmartProto$Smart;)V", "getContext", "()Landroid/content/Context;", "logger", "Lorg/slf4j/Logger;", "service", "Lcom/garmin/proto/generated/GDIGroupLiveTrack$GroupLiveTrackService;", "run", "", "handleConnectionRequest", "liveTrackConnectionsRequest", "Lcom/garmin/proto/generated/GDIGroupLiveTrack$GetLiveTrackConnectionsRequest;", "handleLastKnownLocationRequest", "lastKnownLocationRequest", "Lcom/garmin/proto/generated/GDIGroupLiveTrack$GetLastKnownLocationRequest;", "Companion", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GrouptrackProtobufRequestHandler extends ProtobufRequestHandler {
    private static final String TAG = "GtProtobufRequestHandler";
    private final Context context;
    private final Logger logger;
    private final String macAddress;
    private GDIGroupLiveTrack.GroupLiveTrackService service;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrouptrackProtobufRequestHandler(Context context, long j8, String str, int i14, GDISmartProto.Smart smart) {
        super(context, j8, i14, smart);
        str.getClass();
        smart.getClass();
        this.context = context;
        this.macAddress = str;
        this.logger = nu0.c.a(TAG);
    }

    private final void handleConnectionRequest(GDIGroupLiveTrack.GetLiveTrackConnectionsRequest liveTrackConnectionsRequest) {
        Unit unit;
        Context applicationContext;
        ArrayList arrayList;
        GDIDataTypes.ScPoint position;
        GDIDataTypes.ScPoint position2;
        long j8 = this.deviceId;
        int radius = liveTrackConnectionsRequest != null ? liveTrackConnectionsRequest.getRadius() : 0;
        List<GDIGroupLiveTrack.FitnessPointData.ActivityType> activityTypeList = liveTrackConnectionsRequest != null ? liveTrackConnectionsRequest.getActivityTypeList() : null;
        Integer numValueOf = (liveTrackConnectionsRequest == null || (position2 = liveTrackConnectionsRequest.getPosition()) == null) ? null : Integer.valueOf(position2.getLat());
        Integer numValueOf2 = (liveTrackConnectionsRequest == null || (position = liveTrackConnectionsRequest.getPosition()) == null) ? null : Integer.valueOf(position.getLon());
        Logger logger = this.logger;
        long j14 = this.deviceId;
        if (activityTypeList != null) {
            Iterator<T> it = activityTypeList.iterator();
            while (it.hasNext()) {
                ((GDIGroupLiveTrack.FitnessPointData.ActivityType) it.next()).name();
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        StringBuilder sbW = h.w(radius, "handleConnectionRequest ", " radius: ", j14);
        sbW.append(" activityTypes: ");
        sbW.append(unit);
        sbW.append(" lat: ");
        sbW.append(numValueOf);
        sbW.append(" long: ");
        sbW.append(numValueOf2);
        sbW.append(StringUtils.SPACE);
        logger.debug(sbW.toString());
        Context context = this.context;
        if (context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        int i14 = this.requestId;
        String str = this.macAddress;
        if (activityTypeList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it3 = activityTypeList.iterator();
            while (it3.hasNext()) {
                String strName = ((GDIGroupLiveTrack.FitnessPointData.ActivityType) it3.next()).name();
                if (strName != null) {
                    arrayList2.add(strName);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        str.getClass();
        q qVarC = q.f184563f.c();
        if (!qVarC.e(Long.valueOf(j8))) {
            ge1.b.T(qVarC, null, null, new t(j8, applicationContext, i14, str, null), 3);
            return;
        }
        g1 g1Var = qVarC.f184567b;
        if (g1Var != null) {
            LivetrackService livetrackService = g1Var.f184472d;
            if (livetrackService == null) {
                g1Var.f184471c.error("Not initialized");
            } else if (m.e(j8)) {
                ge1.b.T(livetrackService, null, null, new o0(livetrackService, j8, i14, str, radius, arrayList, numValueOf, numValueOf2, null), 3);
            }
        }
    }

    private final void handleLastKnownLocationRequest(GDIGroupLiveTrack.GetLastKnownLocationRequest lastKnownLocationRequest) {
        Context applicationContext;
        if (lastKnownLocationRequest != null) {
            this.logger.debug("handleLastKnownLocationRequest " + this.deviceId + "  sessionIdsList: " + lastKnownLocationRequest.getSessionIdList() + StringUtils.SPACE);
            Context context = this.context;
            if (context == null || (applicationContext = context.getApplicationContext()) == null) {
                return;
            }
            int i14 = this.requestId;
            long j8 = this.deviceId;
            String str = this.macAddress;
            ProtocolStringList sessionIdList = lastKnownLocationRequest.getSessionIdList();
            str.getClass();
            q qVarC = q.f184563f.c();
            if (!qVarC.e(Long.valueOf(j8))) {
                ge1.b.T(qVarC, null, null, new u(j8, applicationContext, i14, str, null), 3);
                return;
            }
            g1 g1Var = qVarC.f184567b;
            if (g1Var != null) {
                LivetrackService livetrackService = g1Var.f184472d;
                if (livetrackService == null) {
                    g1Var.f184471c.error("Not initialized");
                } else if (m.e(j8)) {
                    ge1.b.T(livetrackService, null, null, new p0(livetrackService, j8, i14, str, sessionIdList, null), 3);
                }
            }
        }
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // java.lang.Runnable
    public void run() {
        wr.g.w("triggered by device ", this.deviceId, this.logger);
        GDIGroupLiveTrack.GroupLiveTrackService groupLiveTrackService = (GDIGroupLiveTrack.GroupLiveTrackService) this.requestMsg.getExtension((GeneratedMessage.GeneratedExtension) GDIGroupLiveTrackExtension.groupLiveTrackService);
        this.service = groupLiveTrackService;
        if (groupLiveTrackService != null) {
            if (groupLiveTrackService.hasGetLiveTrackConnectionsRequest()) {
                handleConnectionRequest(groupLiveTrackService.getGetLiveTrackConnectionsRequest());
            } else if (groupLiveTrackService.hasGetLastKnownLocationRequest()) {
                handleLastKnownLocationRequest(groupLiveTrackService.getGetLastKnownLocationRequest());
            }
        }
    }
}
