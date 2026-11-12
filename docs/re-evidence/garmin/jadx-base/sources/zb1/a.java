package zb1;

import android.util.Log;
import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIGarminConnect;
import com.garmin.proto.generated.GDIGarminConnectExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import dt2.g;
import e23.p;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.a1;
import rs2.c;
import u53.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzb1/a;", "Ldt2/a;", "<init>", "()V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements dt2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f203887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f203888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f203889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<Integer> f203890e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.protobuf.GCProtobufDataHandler$sendContactsUpdateRequestNotification$1", f = "GCProtobufDataHandler.kt", l = {45}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f203891a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.this;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f203891a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    c cVar = aVar.f203889d;
                    if (cVar != null) {
                        new Long(cVar.getF92746j());
                    }
                    g gVar = aVar.f203888c;
                    if (gVar != null) {
                        GDIGarminConnect.ContactsUpdateRequestNotification contactsUpdateRequestNotificationBuild = GDIGarminConnect.ContactsUpdateRequestNotification.newBuilder().build();
                        GDIGarminConnect.Service.Builder builderNewBuilder = GDIGarminConnect.Service.newBuilder();
                        builderNewBuilder.setContactsUpdateRequestNotification(contactsUpdateRequestNotificationBuild);
                        GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIGarminConnectExtension.garminConnectService, builderNewBuilder.build()).build();
                        smartBuild.getClass();
                        this.f203891a = 1;
                        obj = gVar.b(smartBuild, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            } catch (ProtobufException e4) {
                new Integer(Log.d("GCProtobufDataHandler", "ProtobufException: " + e4));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new C3802a(null);
    }

    public a() {
        x53.c cVar = s0.f129406a;
        this.f203887b = c0.a(x53.b.f189152a.plus(g8.i.c()));
        this.f203890e = a1.b(72);
    }

    public final void c() {
        ge1.b.T(this.f203887b, null, null, new b(null), 3);
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f203890e;
    }

    @Override // dt2.a
    public final void start(c cVar, g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f203888c = gVar;
        this.f203889d = cVar;
    }

    /* JADX INFO: renamed from: zb1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzb1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3802a {
        public /* synthetic */ C3802a(j jVar) {
            this();
        }

        private C3802a() {
        }
    }
}
