package com.garmin.android.apps.connectmobile.instantinput;

import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestHandler;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIInstantInput;
import com.garmin.proto.generated.GDIInstantInputExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import cq0.g;
import cr0.c;
import cr0.k;
import ds.e0;
import e23.p;
import o13.m;
import o13.q;
import o13.r;
import o13.t;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import t13.d;
import u53.o;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010²\u0006\u0014\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/instantinput/a;", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/ProtobufRequestHandler;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "deviceId", "", "requestId", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "requestMsg", "<init>", "(Landroid/content/Context;JILcom/garmin/proto/generated/GDISmartProto$Smart;)V", "a", "Lcom/garmin/proto/generated/GDIInstantInput$InstantInputEndRequest$Command;", "kotlin.jvm.PlatformType", "endRequestCommand", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ProtobufRequestHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0660a f36928a = new C0660a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.instantinput.InstantInputProtobufRequestHandler$run$1", f = "InstantInputProtobufRequestHandler.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f36929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GDIInstantInput.InstantInputService f36930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ cr0.i f36931c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f36932d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f36933e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GDIInstantInput.InstantInputService instantInputService, cr0.i iVar, a aVar, Context context, d<? super b> dVar) {
            super(2, dVar);
            this.f36930b = instantInputService;
            this.f36931c = iVar;
            this.f36932d = aVar;
            this.f36933e = context;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            b bVar = new b(this.f36930b, this.f36931c, this.f36932d, this.f36933e, dVar);
            bVar.f36929a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            GDIInstantInput.InstantInputService instantInputService = this.f36930b;
            t tVarB = m.b(new g(instantInputService, 3));
            boolean zHasStartRequest = instantInputService.hasStartRequest();
            cr0.i iVar = this.f36931c;
            a aVar2 = this.f36932d;
            if (zHasStartRequest) {
                GDIInstantInput.InstantInputStartRequest startRequest = instantInputService.getStartRequest();
                long j8 = ((ProtobufRequestHandler) aVar2).deviceId;
                int i14 = ((ProtobufRequestHandler) aVar2).requestId;
                int codePage = startRequest.getCodePage();
                int maxSize = startRequest.getMaxSize();
                String content = startRequest.getContent();
                int contentSize = startRequest.getContentSize();
                GDIInstantInput.InstantInputStartRequest.Command command = startRequest.getCommand();
                dr0.a aVar3 = iVar.f55338b;
                cr0.b bVar2 = iVar.f55339c;
                c cVar = iVar.f55337a;
                cr0.i.f55336h.trace("onDeviceStart");
                k kVar = iVar.f55342f;
                if (kVar == null) {
                    iVar.f55342f = new k(j8, maxSize, codePage, content, contentSize, i14, command, cVar, bVar2);
                    com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.g(j8, i14, GDIInstantInput.CommandResult.SUCCESS, com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar3), null);
                } else if (j8 != kVar.f55345a && iVar.f55343g == null) {
                    iVar.f55343g = new k(j8, maxSize, codePage, content, contentSize, i14, command, cVar, bVar2);
                } else {
                    com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.g(j8, i14, GDIInstantInput.CommandResult.FAILURE, com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar3), null);
                }
                iVar.a(1);
                Unit unit = Unit.INSTANCE;
                Context context = this.f36933e;
                try {
                    int i15 = q.f128596b;
                    InstantInputActivity.f36905l.getClass();
                    context.getClass();
                    Intent intent = new Intent(context, (Class<?>) InstantInputActivity.class);
                    intent.setFlags(335544320);
                    cr0.g.f55332a.getClass();
                    cr0.g.a(context, intent);
                    context.startActivity(intent);
                    bVar = Unit.INSTANCE;
                } catch (Throwable th3) {
                    int i16 = q.f128596b;
                    bVar = new q.b(th3);
                }
                if (q.b(bVar) != null) {
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    a.f36928a.getClass();
                    String str = "Failed to start InstantInputActivity right now: " + C0660a.a() + ". Users can still start it by the notificaiton.";
                    aVar4.getClass();
                    i2.a.p(a2Var, "InstantInputProtobufRequestHandler", str);
                }
            } else if (instantInputService.hasInputContent()) {
                GDIInstantInput.InstantInputMessage inputContent = instantInputService.getInputContent();
                long j14 = ((ProtobufRequestHandler) aVar2).deviceId;
                String content2 = inputContent.getContent();
                inputContent.getContentSize();
                iVar.getClass();
                Logger logger = cr0.i.f55336h;
                logger.trace("onDeviceInput");
                k kVar2 = iVar.f55342f;
                if (kVar2 == null || !kVar2.a()) {
                    iVar.f55342f = null;
                    logger.debug("Not able to send it to device");
                    iVar.a(1);
                } else {
                    long j15 = kVar2.f55345a;
                    if (j15 != j14) {
                        StringBuilder sbK = e0.k(j14, "Got a device confirmation(", ") not for current session(");
                        sbK.append(j15);
                        sbK.append(")");
                        logger.debug(sbK.toString());
                    } else {
                        kVar2.f55350f = content2;
                        kVar2.f55351g = kVar2.f55349e.a(content2);
                        iVar.a(4);
                    }
                }
            } else if (instantInputService.hasEndRequest() && ((GDIInstantInput.InstantInputEndRequest.Command) tVarB.getValue()) == GDIInstantInput.InstantInputEndRequest.Command.CANCEL) {
                long j16 = ((ProtobufRequestHandler) aVar2).deviceId;
                int i17 = ((ProtobufRequestHandler) aVar2).requestId;
                iVar.getClass();
                Logger logger2 = cr0.i.f55336h;
                logger2.trace("onDeviceCancel");
                k kVar3 = iVar.f55342f;
                if (kVar3 == null || !kVar3.a()) {
                    iVar.f55342f = null;
                    logger2.debug("Not able to send it to device");
                    iVar.a(1);
                } else {
                    long j17 = kVar3.f55345a;
                    if (j17 != j16) {
                        StringBuilder sbK2 = e0.k(j16, "Got a device confirmation(", ") not for current session(");
                        sbK2.append(j17);
                        sbK2.append(")");
                        logger2.debug(sbK2.toString());
                    } else {
                        iVar.f55342f = null;
                        com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.g(j16, i17, GDIInstantInput.CommandResult.SUCCESS, com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, iVar.f55338b), null);
                        iVar.a(1);
                    }
                }
            } else if (instantInputService.hasEndRequest() && ((GDIInstantInput.InstantInputEndRequest.Command) tVarB.getValue()) == GDIInstantInput.InstantInputEndRequest.Command.CONFIRM) {
                long j18 = ((ProtobufRequestHandler) aVar2).deviceId;
                int i18 = ((ProtobufRequestHandler) aVar2).requestId;
                iVar.getClass();
                Logger logger3 = cr0.i.f55336h;
                logger3.trace("onDeviceConfirm");
                k kVar4 = iVar.f55342f;
                if (kVar4 == null || !kVar4.a()) {
                    iVar.f55342f = null;
                    logger3.debug("Not able to send it to device");
                    iVar.a(1);
                } else {
                    long j19 = kVar4.f55345a;
                    if (j19 != j18) {
                        StringBuilder sbK3 = e0.k(j18, "Got a device confirmation(", ") not for current session(");
                        sbK3.append(j19);
                        sbK3.append(")");
                        logger3.debug(sbK3.toString());
                    } else {
                        iVar.f55342f = null;
                        com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.g(j18, i18, GDIInstantInput.CommandResult.SUCCESS, com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, iVar.f55338b), null);
                        iVar.a(1);
                    }
                }
            } else if (instantInputService.hasSyncRequest()) {
                long j24 = ((ProtobufRequestHandler) aVar2).deviceId;
                iVar.getClass();
                Logger logger4 = cr0.i.f55336h;
                logger4.trace("onDeviceSync");
                k kVar5 = iVar.f55342f;
                if (kVar5 == null || !kVar5.a()) {
                    iVar.f55342f = null;
                    logger4.debug("Not able to send it to device");
                    iVar.a(1);
                } else {
                    long j25 = kVar5.f55345a;
                    if (j25 != j24) {
                        StringBuilder sbK4 = e0.k(j24, "Got a device confirmation(", ") not for current session(");
                        sbK4.append(j25);
                        sbK4.append(")");
                        logger4.debug(sbK4.toString());
                    } else {
                        com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.i(j25, kVar5.f55350f, kVar5.f55351g, com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, iVar.f55338b), null);
                    }
                }
            } else {
                i2.a aVar5 = i2.f36769a;
                aVar5.getClass();
                i2.a.p(a2.GENERAL, "InstantInputProtobufRequestHandler", "Unexpected instantInputService: " + instantInputService);
            }
            return Unit.INSTANCE;
        }
    }

    public a(Context context, long j8, int i14, GDISmartProto.Smart smart) {
        super(context, j8, i14, smart);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Context context = this.contextRef.get();
        if (context == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "InstantInputProtobufRequestHandler", "Aborting InstantInputProtobufRequestHandler. Context is null.");
            return;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        f36928a.getClass();
        String str = "isInstantInputEnabled() = " + C0660a.a();
        aVar2.getClass();
        i2.a.b(a2Var2, "InstantInputProtobufRequestHandler", str);
        if (C0660a.a()) {
            GDIInstantInput.InstantInputService instantInputService = (GDIInstantInput.InstantInputService) this.requestMsg.getExtension((GeneratedMessage.GeneratedExtension) GDIInstantInputExtension.instantInputService);
            cr0.i iVar = (cr0.i) KoinJavaComponent.get$default(cr0.i.class, null, null, 6, null);
            x53.c cVar = s0.f129406a;
            ge1.b.W(o.f168762a, new b(instantInputService, iVar, this, context, null));
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.instantinput.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/instantinput/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0660a {
        public /* synthetic */ C0660a(j jVar) {
            this();
        }

        public static boolean a() {
            c22.o oVar = (c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            return PreferenceManager.getDefaultSharedPreferences(oVar.getF104108a()).getBoolean(oVar.getF104108a().getString(R.string.key_allow_instant_input), true);
        }

        private C0660a() {
        }
    }
}
