package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import com.garmin.proto.generated.GDILiveTrackProto;
import p005kotlin.Metadata;
import wd2.c2;
import wd2.n1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/proto/generated/GDILiveTrackProto$DeviceType;", "Lwd2/c2;", "toSubscriberType", "(Lcom/garmin/proto/generated/GDILiveTrackProto$DeviceType;)Lwd2/c2;", "Lwd2/n1;", "toTrackerType", "(Lcom/garmin/proto/generated/GDILiveTrackProto$DeviceType;)Lwd2/n1;", "app_vanillaRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class LiveTrackServiceProtobufRequestHandlerKt {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GDILiveTrackProto.DeviceType.values().length];
            try {
                iArr[GDILiveTrackProto.DeviceType.ANONYMOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDILiveTrackProto.DeviceType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GDILiveTrackProto.DeviceType.STRAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GDILiveTrackProto.DeviceType.CONNECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GDILiveTrackProto.DeviceType.GROUPTRACK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GDILiveTrackProto.DeviceType.LIVEEVENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GDILiveTrackProto.DeviceType.FITNESSAPP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GDILiveTrackProto.DeviceType.PND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GDILiveTrackProto.DeviceType.WEARABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c2 toSubscriberType(GDILiveTrackProto.DeviceType deviceType) {
        switch (deviceType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()]) {
            case 1:
                return c2.a.f184409a;
            case 2:
                return c2.c.f184411a;
            case 3:
                return c2.f.f184414a;
            case 4:
                return c2.b.f184410a;
            case 5:
                return c2.b.f184410a;
            case 6:
                return c2.d.f184412a;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n1 toTrackerType(GDILiveTrackProto.DeviceType deviceType) {
        int i14 = WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()];
        if (i14 == 7) {
            return new n1.b();
        }
        if (i14 != 8 && i14 == 9) {
            return new n1.c();
        }
        return new n1.c();
    }
}
