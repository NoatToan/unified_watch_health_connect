package com.garmin.android.apps.connectmobile.cannedtextreply;

import android.content.Context;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDISmsNotificationExtension;
import com.garmin.proto.generated.GDISmsNotificationProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import dt2.g;
import dt2.h;
import dt2.k;
import e23.p;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lc.u0;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.a1;
import u53.d;
import us2.f;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/cannedtextreply/b;", "Ldt2/c;", "Ldt2/h;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements dt2.c, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f31291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f31292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Logger f31293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f31294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f31295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<Integer> f31296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GDISmsNotificationProto.CapabilitiesResponse f31297h;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31298a;

        static {
            int[] iArr = new int[GDISmsNotificationProto.CannedListType.values().length];
            try {
                iArr[GDISmsNotificationProto.CannedListType.SMS_MESSAGE_RESPONSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDISmsNotificationProto.CannedListType.PHONE_CALL_RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GDISmsNotificationProto.CannedListType.GROUP_TRACK_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31298a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.cannedtextreply.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.cannedtextreply.CustomMessagesService$onProtobufRequest$1", f = "CustomMessagesService.kt", l = {70}, m = "invokeSuspend", v = 2)
    public static final class C0506b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31299a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmsNotificationProto.SmsNotificationService f31301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f31302d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0506b(GDISmsNotificationProto.SmsNotificationService smsNotificationService, k kVar, t13.d<? super C0506b> dVar) {
            super(2, dVar);
            this.f31301c = smsNotificationService;
            this.f31302d = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new C0506b(this.f31301c, this.f31302d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0506b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f31299a;
            if (i14 == 0) {
                r.b(obj);
                GDISmsNotificationProto.SmsSendMessageRequest smsSendMessageRequest = this.f31301c.getSmsSendMessageRequest();
                smsSendMessageRequest.getClass();
                this.f31299a = 1;
                if (b.d(b.this, smsSendMessageRequest, this.f31302d, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.cannedtextreply.CustomMessagesService$onProtobufRequest$2", f = "CustomMessagesService.kt", l = {75}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31303a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmsNotificationProto.SmsNotificationService f31305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f31306d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GDISmsNotificationProto.SmsNotificationService smsNotificationService, k kVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f31305c = smsNotificationService;
            this.f31306d = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new c(this.f31305c, this.f31306d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f31303a;
            if (i14 == 0) {
                r.b(obj);
                GDISmsNotificationProto.SmsCannedListRequest smsCannedListRequest = this.f31305c.getSmsCannedListRequest();
                smsCannedListRequest.getClass();
                this.f31303a = 1;
                if (b.c(b.this, smsCannedListRequest, this.f31306d, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public b(Context context) {
        context.getClass();
        this.f31291b = context;
        x53.c cVar = s0.f129406a;
        this.f31292c = zl.a.e("ConnectTransferService", x53.b.f189152a.plus(ge1.b.h()));
        this.f31294e = -1L;
        this.f31296g = a1.b(Integer.valueOf(SupportedCapability.CUSTOM_CANNED_TEXT_LIST_SUPPORT.ordinal()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c(b bVar, GDISmsNotificationProto.SmsCannedListRequest smsCannedListRequest, k kVar, v13.c cVar) {
        zy.b bVar2;
        bVar.getClass();
        if (cVar instanceof zy.b) {
            bVar2 = (zy.b) cVar;
            int i14 = bVar2.f207381c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar2.f207381c = i14 - Integer.MIN_VALUE;
            } else {
                bVar2 = new zy.b(bVar, cVar);
            }
        } else {
            bVar2 = new zy.b(bVar, cVar);
        }
        Object obj = bVar2.f207379a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar2.f207381c;
        try {
            if (i15 == 0) {
                r.b(obj);
                GDISmsNotificationProto.SmsCannedListResponse.Builder builderNewBuilder = GDISmsNotificationProto.SmsCannedListResponse.newBuilder();
                if (smsCannedListRequest.getRequestedTypesCount() > 0) {
                    builderNewBuilder.setStatus(GDISmsNotificationProto.SmsCannedListResponse.ResponseStatus.SUCCESS);
                } else {
                    builderNewBuilder.setStatus(GDISmsNotificationProto.SmsCannedListResponse.ResponseStatus.GENERIC_ERROR);
                }
                List<GDISmsNotificationProto.CannedListType> requestedTypesList = smsCannedListRequest.getRequestedTypesList();
                if (requestedTypesList != null && !requestedTypesList.isEmpty()) {
                    Iterator<GDISmsNotificationProto.CannedListType> it = requestedTypesList.iterator();
                    while (it.hasNext()) {
                        GDISmsNotificationProto.CannedListType next = it.next();
                        int i16 = next == null ? -1 : a.f31298a[next.ordinal()];
                        if (i16 == 1) {
                            GDISmsNotificationProto.SmsCannedList.Builder builderNewBuilder2 = GDISmsNotificationProto.SmsCannedList.newBuilder();
                            builderNewBuilder2.setType(next);
                            com.garmin.android.apps.connectmobile.cannedtextreply.a.f31282d.getClass();
                            com.garmin.android.apps.connectmobile.cannedtextreply.a aVarA = com.garmin.android.apps.connectmobile.cannedtextreply.a.C0505a.a();
                            long j8 = bVar.f31294e;
                            aVarA.getClass();
                            builderNewBuilder2.addAllResponses(com.garmin.android.apps.connectmobile.cannedtextreply.a.b(0, j8));
                            builderNewBuilder.addLists(builderNewBuilder2);
                        } else if (i16 == 2) {
                            GDISmsNotificationProto.SmsCannedList.Builder builderNewBuilder3 = GDISmsNotificationProto.SmsCannedList.newBuilder();
                            builderNewBuilder3.setType(next);
                            com.garmin.android.apps.connectmobile.cannedtextreply.a.f31282d.getClass();
                            com.garmin.android.apps.connectmobile.cannedtextreply.a aVarA2 = com.garmin.android.apps.connectmobile.cannedtextreply.a.C0505a.a();
                            long j14 = bVar.f31294e;
                            aVarA2.getClass();
                            builderNewBuilder3.addAllResponses(com.garmin.android.apps.connectmobile.cannedtextreply.a.b(1, j14));
                            builderNewBuilder.addLists(builderNewBuilder3);
                        } else {
                            if (i16 != 3) {
                                u0.r();
                                return null;
                            }
                            GDISmsNotificationProto.SmsCannedList.Builder builderNewBuilder4 = GDISmsNotificationProto.SmsCannedList.newBuilder();
                            builderNewBuilder4.setType(next);
                            com.garmin.android.apps.connectmobile.cannedtextreply.a.f31282d.getClass();
                            com.garmin.android.apps.connectmobile.cannedtextreply.a aVarA3 = com.garmin.android.apps.connectmobile.cannedtextreply.a.C0505a.a();
                            long j15 = bVar.f31294e;
                            aVarA3.getClass();
                            builderNewBuilder4.addAllResponses(com.garmin.android.apps.connectmobile.cannedtextreply.a.b(3, j15));
                            builderNewBuilder.addLists(builderNewBuilder4);
                        }
                    }
                }
                GDISmsNotificationProto.SmsNotificationService.Builder builderNewBuilder5 = GDISmsNotificationProto.SmsNotificationService.newBuilder();
                builderNewBuilder5.setSmsCannedListResponse(builderNewBuilder);
                GDISmartProto.Smart.Builder builderNewBuilder6 = GDISmartProto.Smart.newBuilder();
                builderNewBuilder6.setExtension(GDISmsNotificationExtension.smsNotificationService, builderNewBuilder5.build());
                GDISmartProto.Smart smartBuild = builderNewBuilder6.build();
                smartBuild.getClass();
                bVar2.f207381c = 1;
                Object objA = kVar.a(smartBuild, bVar2);
                bVar = objA;
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                bVar = bVar;
            }
        } catch (Exception e4) {
            Logger logger = bVar.f31293d;
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            logger.error("Failed to respond to SmsCannedListRequest", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object d(b bVar, GDISmsNotificationProto.SmsSendMessageRequest smsSendMessageRequest, k kVar, v13.c cVar) {
        zy.c cVar2;
        bVar.getClass();
        if (cVar instanceof zy.c) {
            cVar2 = (zy.c) cVar;
            int i14 = cVar2.f207384c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f207384c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new zy.c(bVar, cVar);
            }
        } else {
            cVar2 = new zy.c(bVar, cVar);
        }
        Object obj = cVar2.f207382a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f207384c;
        try {
            if (i15 == 0) {
                r.b(obj);
                GDISmsNotificationProto.SmsSendMessageResponse.Builder builderNewBuilder = GDISmsNotificationProto.SmsSendMessageResponse.newBuilder();
                if (smsSendMessageRequest.hasReceiverNumber() && smsSendMessageRequest.hasMessage()) {
                    wx2.b bVar2 = new wx2.b(bVar.f31291b);
                    String receiverNumber = smsSendMessageRequest.getReceiverNumber();
                    receiverNumber.getClass();
                    String message = smsSendMessageRequest.getMessage();
                    message.getClass();
                    bVar2.c(receiverNumber, message, null);
                    builderNewBuilder.setStatus(GDISmsNotificationProto.SmsSendMessageResponse.ResponseStatus.SUCCESS);
                } else {
                    builderNewBuilder.setStatus(GDISmsNotificationProto.SmsSendMessageResponse.ResponseStatus.GENERIC_ERROR);
                }
                GDISmsNotificationProto.SmsNotificationService.Builder builderNewBuilder2 = GDISmsNotificationProto.SmsNotificationService.newBuilder();
                builderNewBuilder2.setSmsSendMessageResponse(builderNewBuilder.build());
                GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                builderNewBuilder3.setExtension(GDISmsNotificationExtension.smsNotificationService, builderNewBuilder2.build());
                GDISmartProto.Smart smartBuild = builderNewBuilder3.build();
                smartBuild.getClass();
                cVar2.f207384c = 1;
                Object objA = kVar.a(smartBuild, cVar2);
                bVar = objA;
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                bVar = bVar;
            }
        } catch (Exception e4) {
            Logger logger = bVar.f31293d;
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            logger.error("Failed to respond to SmsSendMessageRequest", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        c0.d(this.f31292c, "CustomMessageService closed");
    }

    @Override // dt2.c
    public final void configure(rs2.c cVar, ExtensionRegistryLite extensionRegistryLite, GDICore.FeatureCapabilitiesRequest.Builder builder) {
        cVar.getClass();
        extensionRegistryLite.getClass();
        zy.d.f207385a.getClass();
        GDISmsNotificationExtension.registerAllExtensions(extensionRegistryLite);
        GDISmsNotificationProto.registerAllExtensions(extensionRegistryLite);
        GDISmsNotificationProto.CapabilitiesRequest.Builder builderNewBuilder = GDISmsNotificationProto.CapabilitiesRequest.newBuilder();
        builderNewBuilder.getClass();
        builder.setExtension(GDISmsNotificationProto.CapabilitiesRequest.messagesCapabilityRequest, builderNewBuilder.build());
    }

    @Override // dt2.c
    public final void connectionReady(GDICore.ConnectionReadyNotification connectionReadyNotification) {
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f31296g;
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, k kVar) {
        GDISmsNotificationProto.SmsNotificationService smsNotificationService;
        smart.getClass();
        zy.d.f207385a.getClass();
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISmsNotificationProto.SmsNotificationService> generatedExtension = GDISmsNotificationExtension.smsNotificationService;
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            Object extension = smart.getExtension((GeneratedMessage.GeneratedExtension<MessageT, Object>) generatedExtension);
            extension.getClass();
            smsNotificationService = (GDISmsNotificationProto.SmsNotificationService) extension;
        } else {
            smsNotificationService = null;
        }
        if (smsNotificationService != null) {
            try {
                boolean zHasSmsSendMessageRequest = smsNotificationService.hasSmsSendMessageRequest();
                d dVar = this.f31292c;
                if (zHasSmsSendMessageRequest) {
                    ge1.b.T(dVar, null, null, new C0506b(smsNotificationService, kVar, null), 3);
                    return true;
                }
                if (smsNotificationService.hasSmsCannedListRequest()) {
                    ge1.b.T(dVar, null, null, new c(smsNotificationService, kVar, null), 3);
                    return true;
                }
            } catch (Throwable th3) {
                Logger logger = this.f31293d;
                if (logger != null) {
                    logger.error("Error parsing notification", th3);
                    return false;
                }
                s.m("logger");
                throw null;
            }
        }
        return false;
    }

    @Override // dt2.c
    public final void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse) {
        GDISmsNotificationProto.CapabilitiesResponse capabilitiesResponse;
        zy.d.f207385a.getClass();
        GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, GDISmsNotificationProto.CapabilitiesResponse> generatedExtension = GDISmsNotificationProto.CapabilitiesResponse.messagesCapabilityResponse;
        if (featureCapabilitiesResponse.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            Object extension = featureCapabilitiesResponse.getExtension((GeneratedMessage.GeneratedExtension<MessageT, Object>) generatedExtension);
            extension.getClass();
            capabilitiesResponse = (GDISmsNotificationProto.CapabilitiesResponse) extension;
        } else {
            capabilitiesResponse = null;
        }
        this.f31297h = capabilitiesResponse;
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        f fVar = (f) cVar;
        Logger logger = LoggerFactory.getLogger("CustomMessageService[" + fVar.f172493a + "]");
        logger.getClass();
        this.f31293d = logger;
        this.f31295f = gVar;
        this.f31294e = fVar.f172494b;
        ((dt2.d) gVar).f61154i.add(this);
    }
}
