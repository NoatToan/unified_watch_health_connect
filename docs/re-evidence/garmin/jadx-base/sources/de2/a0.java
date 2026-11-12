package de2;

import android.content.Context;
import bs2.fb;
import bs2.js;
import bs2.nv;
import com.garmin.proto.generated.GDILiveTrackExtension;
import com.garmin.proto.generated.GDILiveTrackProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f59242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f59243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f59244d;

        static {
            int[] iArr = new int[fb.values().length];
            try {
                iArr[fb.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f59241a = iArr;
            int[] iArr2 = new int[js.values().length];
            try {
                iArr2[js.ACTIVITY_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f59242b = iArr2;
            int[] iArr3 = new int[nv.values().length];
            try {
                iArr3[nv.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr3[nv.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[nv.TRANSITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[nv.FITNESS_EQUIPMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[nv.SWIMMING.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[nv.WALKING.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[nv.HIKING.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[nv.MOTORCYCLING.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[nv.GENERIC.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            f59243c = iArr3;
            int[] iArr4 = new int[GDILiveTrackProto.StartResponse.Status.values().length];
            try {
                iArr4[GDILiveTrackProto.StartResponse.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[GDILiveTrackProto.StartResponse.Status.ERROR_ALREADY_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[GDILiveTrackProto.StartResponse.Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            f59244d = iArr4;
        }
    }

    public static final GDILiveTrackProto.LiveTrackService a(GDISmartProto.Smart smart) {
        smart.getClass();
        Object extension = smart.getExtension((GeneratedMessage.GeneratedExtension<MessageT, Object>) GDILiveTrackExtension.liveTrackService);
        extension.getClass();
        return (GDILiveTrackProto.LiveTrackService) extension;
    }

    public static final GDILiveTrackProto.LiveTrackService b(long j8, List list) {
        list.getClass();
        GDILiveTrackProto.StopNotification.Builder builderNewBuilder = GDILiveTrackProto.StopNotification.newBuilder();
        builderNewBuilder.setExtendedViewableDurationS(j8);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            builderNewBuilder.addSessionIds((String) it.next());
        }
        GDILiveTrackProto.LiveTrackService.Builder builderNewBuilder2 = GDILiveTrackProto.LiveTrackService.newBuilder();
        builderNewBuilder2.setStopNotification(builderNewBuilder.build());
        GDILiveTrackProto.LiveTrackService liveTrackServiceBuild = builderNewBuilder2.build();
        liveTrackServiceBuild.getClass();
        return liveTrackServiceBuild;
    }

    public static final g0.b c(Context context, String str, GDILiveTrackProto.LiveTrackService liveTrackService) {
        context.getClass();
        if (str == null) {
            return g0.b.a.f59296a;
        }
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        builderNewBuilder.getClass();
        builderNewBuilder.setExtension(GDILiveTrackExtension.liveTrackService, liveTrackService);
        wm2.a aVar = (wm2.a) da2.d.c(context).getCapability(str, wm2.a.class);
        if (aVar != null) {
            GDISmartProto.Smart smartBuild = builderNewBuilder.build();
            smartBuild.getClass();
            aVar.initiateNotification(smartBuild, str);
        }
        return g0.b.d.f59299a;
    }
}
