package pd0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.EventSharingSubscriptionHandler;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDILiveTrackExtension;
import com.garmin.proto.generated.GDILiveTrackProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.common.collect.ImmutableList;
import f12.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p90.n;
import wd2.m;
import zb0.n0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpd0/a;", "Lp90/n;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lf12/l;", "userSettings", "<init>", "(Landroid/content/Context;Lf12/l;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f137367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f137368b;

    public a(Context context, l lVar) {
        context.getClass();
        lVar.getClass();
        this.f137367a = context;
        this.f137368b = lVar;
    }

    @Override // p90.n
    public final Unit a(long j8) {
        int iOrdinal = SupportedCapability.DEVICE_DRIVEN_LIVETRACK_SUPPORT.ordinal();
        ImmutableList<String> immutableList = n0.f203578b;
        boolean zI = km2.a.i(j8, immutableList, iOrdinal);
        l lVar = this.f137368b;
        boolean zY = lVar.Y();
        boolean zI2 = km2.a.i(j8, immutableList, SupportedCapability.LIVETRACK_AUTO_START.ordinal());
        if (zI) {
            if (zI2) {
                boolean zD = m.d(this.f137367a, j8);
                GDILiveTrackProto.ShareDeviceSettingNotification.Builder builderNewBuilder = GDILiveTrackProto.ShareDeviceSettingNotification.newBuilder();
                builderNewBuilder.setAutoStartEnabled(zD);
                GDILiveTrackProto.LiveTrackService.Builder builderNewBuilder2 = GDILiveTrackProto.LiveTrackService.newBuilder();
                builderNewBuilder2.setShareDeviceSettingNotification(builderNewBuilder);
                GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                builderNewBuilder3.getClass();
                GDILiveTrackProto.LiveTrackService liveTrackServiceBuild = builderNewBuilder2.build();
                liveTrackServiceBuild.getClass();
                builderNewBuilder3.setExtension(GDILiveTrackExtension.liveTrackService, liveTrackServiceBuild);
                ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
                GDISmartProto.Smart smartBuild = builderNewBuilder3.build();
                smartBuild.getClass();
                protobufRequestManager.initiateNotification(smartBuild, j8);
            }
            if (zY) {
                GDILiveTrackProto.ShareSocialCredentialsNotification.Builder builderNewBuilder4 = GDILiveTrackProto.ShareSocialCredentialsNotification.newBuilder();
                builderNewBuilder4.setStravaBeaconConnected(lVar.V1());
                GDILiveTrackProto.LiveTrackService.Builder builderNewBuilder5 = GDILiveTrackProto.LiveTrackService.newBuilder();
                builderNewBuilder5.setShareSocialNotification(builderNewBuilder4);
                GDISmartProto.Smart.Builder builderNewBuilder6 = GDISmartProto.Smart.newBuilder();
                builderNewBuilder6.getClass();
                GDILiveTrackProto.LiveTrackService liveTrackServiceBuild2 = builderNewBuilder5.build();
                liveTrackServiceBuild2.getClass();
                builderNewBuilder6.setExtension(GDILiveTrackExtension.liveTrackService, liveTrackServiceBuild2);
                ProtobufRequestManager protobufRequestManager2 = ProtobufRequestManager.getInstance();
                GDISmartProto.Smart smartBuild2 = builderNewBuilder6.build();
                smartBuild2.getClass();
                protobufRequestManager2.initiateNotification(smartBuild2, j8);
            }
            if (km2.a.i(j8, null, SupportedCapability.EVENT_SHARING.ordinal())) {
                EventSharingSubscriptionHandler.fetchDeviceSupportedEvents$default(j8, null, 2, null);
                EventSharingSubscriptionHandler.askDeviceForLTSupportedFeatures$default(j8, null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
