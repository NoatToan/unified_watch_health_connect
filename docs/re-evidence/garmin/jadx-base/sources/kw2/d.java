package kw2;

import com.garmin.proto.generated.GDIRealtimeSettingsExtension;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import cx2.h;
import dt2.g;
import java.io.Serializable;
import java.util.Objects;
import l73.k;
import o13.r;
import o53.c2;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkw2/d;", "", "Ldt2/g;", "messenger", "<init>", "(Ldt2/g;)V", "Llw2/a;", "changeResponseEvent", "", "onChangeResponseReceived", "(Llw2/a;)V", "Lmw2/a;", "compositionEvent", "onCompositionsReceived", "(Lmw2/a;)V", "Lnw2/a;", "dataResponseEvent", "onDataResponseReceived", "(Lnw2/a;)V", "Low2/a;", "menuResponseEvent", "onMenuResponseReceived", "(Low2/a;)V", "Lpw2/a;", "settingsStateEvent", "onSettingsStateReceived", "(Lpw2/a;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f106995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f106996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2 f106997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GDIRealtimeSettingsProto.RealtimeSettingsService f106998d;

    public d(g gVar) {
        gVar.getClass();
        this.f106995a = gVar;
        this.f106996b = new h("DeviceServiceCalls", null, 2, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public h getF134312g() {
        return this.f106996b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(GDIRealtimeSettingsProto.RealtimeSettingsService.Builder builder, v13.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f106986d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f106986d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object obj = aVar.f106984b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f106986d;
        if (i15 == 0) {
            r.b(obj);
            getF134312g().getClass();
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            b bVar2 = new b(this, builder, null);
            aVar.f106983a = builder;
            aVar.f106986d = 1;
            if (ge1.b.e0(bVar, bVar2, aVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            builder = aVar.f106983a;
            r.b(obj);
        }
        h f106996b = getF134312g();
        GDIRealtimeSettingsProto.RealtimeSettingsService realtimeSettingsService = this.f106998d;
        Objects.toString(builder);
        Objects.toString(realtimeSettingsService);
        f106996b.getClass();
        return this.f106998d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(GDIRealtimeSettingsProto.RealtimeSettingsService.Builder builder, v13.c cVar) {
        c cVar2;
        GDIRealtimeSettingsProto.RealtimeSettingsService realtimeSettingsService;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f106994c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f106994c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objB = cVar2.f106992a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f106994c;
        if (i15 == 0) {
            r.b(objB);
            GDIRealtimeSettingsProto.RealtimeSettingsService realtimeSettingsServiceBuild = builder.build();
            GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
            builderNewBuilder.setExtension(GDIRealtimeSettingsExtension.realtimeSettingsService, realtimeSettingsServiceBuild);
            GDISmartProto.Smart smartBuild = builderNewBuilder.build();
            smartBuild.getClass();
            cVar2.f106994c = 1;
            objB = this.f106995a.b(smartBuild, cVar2);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objB);
        }
        GDISmartProto.Smart smart = (GDISmartProto.Smart) objB;
        if (smart != null) {
            GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIRealtimeSettingsProto.RealtimeSettingsService> generatedExtension = GDIRealtimeSettingsExtension.realtimeSettingsService;
            if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                realtimeSettingsService = (GDIRealtimeSettingsProto.RealtimeSettingsService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            } else {
                realtimeSettingsService = null;
            }
        } else {
            realtimeSettingsService = null;
        }
        getF134312g().getClass();
        return realtimeSettingsService;
    }

    @k
    public void onChangeResponseReceived(lw2.a changeResponseEvent) {
        changeResponseEvent.getClass();
    }

    @k
    public void onCompositionsReceived(mw2.a compositionEvent) {
        compositionEvent.getClass();
    }

    @k
    public void onDataResponseReceived(nw2.a dataResponseEvent) {
        dataResponseEvent.getClass();
    }

    @k
    public void onMenuResponseReceived(ow2.a menuResponseEvent) {
        menuResponseEvent.getClass();
    }

    @k
    public void onSettingsStateReceived(pw2.a settingsStateEvent) {
        settingsStateEvent.getClass();
    }
}
