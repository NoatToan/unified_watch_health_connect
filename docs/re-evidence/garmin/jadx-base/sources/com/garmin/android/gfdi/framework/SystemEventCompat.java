package com.garmin.android.gfdi.framework;

import b0.y0;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import da2.j;
import e23.p;
import o13.r;
import o53.b0;
import o53.e1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;
import vs2.k;
import vs2.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u001c\u0010&\u001a\n %*\u0004\u0018\u00010$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/garmin/android/gfdi/framework/SystemEventCompat;", "", "Lvs2/l;", "eventSender", "", "connectionId", "<init>", "(Lvs2/l;Ljava/lang/String;)V", "Lvs2/k;", "event", "Lk7/b;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "sendSystemEvent", "(Lvs2/k;Lk7/b;)V", "Lda2/j;", "newMilestone", "sendPairingState", "(Lda2/j;)V", "setSyncState", "", DownloadService.KEY_FOREGROUND, "setApplicationVisibility", "(Z)V", "Lea2/a$a;", "requestFactoryReset", "(Lea2/a$a;)V", "Lea2/a$c;", "initiateRemoteDeviceSoftwareUpdate", "(Lea2/a$c;)V", "Lea2/a$b;", "requestRemoteDeviceDisconnection", "(Lea2/a$b;)V", "setSetupWizardState", "Lvs2/l;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "logger", "Lorg/slf4j/Logger;", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SystemEventCompat {
    private final l eventSender;
    private final Logger logger;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.FINISHED_WITH_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.FINISHED_WITH_FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.SKIPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.SystemEventCompat$sendSystemEvent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.gfdi.framework.SystemEventCompat$sendSystemEvent$1", f = "SystemEventCompat.kt", l = {23}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ k $event;
        final /* synthetic */ k7.b<Integer> $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(k kVar, k7.b<Integer> bVar, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$event = kVar;
            this.$listener = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SystemEventCompat.this.new AnonymousClass1(this.$event, this.$listener, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    l lVar = SystemEventCompat.this.eventSender;
                    k kVar = this.$event;
                    this.label = 1;
                    obj = lVar.a(kVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                int iIntValue = ((Number) obj).intValue();
                k7.b<Integer> bVar = this.$listener;
                if (bVar != null) {
                    bVar.accept(new Integer(iIntValue));
                }
            } catch (Exception unused) {
                k7.b<Integer> bVar2 = this.$listener;
                if (bVar2 != null) {
                    bVar2.accept(new Integer(Integer.MIN_VALUE));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public SystemEventCompat(l lVar, String str) {
        lVar.getClass();
        str.getClass();
        this.eventSender = lVar;
        this.logger = LoggerFactory.getLogger(oa2.d.b("GDI#", "SystemEventCompat", str, -1L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initiateRemoteDeviceSoftwareUpdate$lambda$1(ea2.a.c cVar, Integer num) {
        if (cVar != null) {
            if (num != null && num.intValue() == 0) {
                cVar.b();
            } else {
                cVar.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestFactoryReset$lambda$0(ea2.a.InterfaceC1344a interfaceC1344a, SystemEventCompat systemEventCompat, Integer num) {
        if (interfaceC1344a != null) {
            if (num != null && num.intValue() == 1) {
                interfaceC1344a.a();
            } else {
                systemEventCompat.setSyncState(j.FINISHED_WITH_FAILURE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestRemoteDeviceDisconnection$lambda$2(ea2.a.b bVar, Integer num) {
        if (bVar != null) {
            if (num != null && num.intValue() == 0) {
                bVar.a();
            } else {
                bVar.b();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendSystemEvent$default(SystemEventCompat systemEventCompat, k kVar, k7.b bVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            bVar = null;
        }
        systemEventCompat.sendSystemEvent(kVar, bVar);
    }

    public final void initiateRemoteDeviceSoftwareUpdate(final ea2.a.c listener) {
        sendSystemEvent(k.DEVICE_SOFTWARE_UPDATE, new k7.b() { // from class: com.garmin.android.gfdi.framework.d
            @Override // k7.b
            public final void accept(Object obj) {
                SystemEventCompat.initiateRemoteDeviceSoftwareUpdate$lambda$1(listener, (Integer) obj);
            }
        });
    }

    public final void requestFactoryReset(final ea2.a.InterfaceC1344a listener) {
        if (listener != null) {
            listener.b();
        }
        sendSystemEvent(k.FACTORY_RESET, new k7.b() { // from class: com.garmin.android.gfdi.framework.e
            @Override // k7.b
            public final void accept(Object obj) {
                SystemEventCompat.requestFactoryReset$lambda$0(listener, this, (Integer) obj);
            }
        });
    }

    public final void requestRemoteDeviceDisconnection(ea2.a.b listener) {
        sendSystemEvent(k.DEVICE_DISCONNECT, new y0(1));
    }

    public final void sendPairingState(j newMilestone) {
        k kVar;
        int i14 = newMilestone == null ? -1 : WhenMappings.$EnumSwitchMapping$0[newMilestone.ordinal()];
        if (i14 == 1) {
            kVar = k.PAIR_START;
        } else if (i14 == 2) {
            kVar = k.PAIR_COMPLETE;
        } else if (i14 != 3) {
            return;
        } else {
            kVar = k.PAIR_FAIL;
        }
        sendSystemEvent$default(this, kVar, null, 2, null);
    }

    public final void sendSystemEvent(k event, k7.b<Integer> listener) {
        event.getClass();
        this.logger.info("sendSystemEvent: " + event);
        ge1.b.T(e1.f129333a, null, null, new AnonymousClass1(event, listener, null), 3);
    }

    public final void setApplicationVisibility(boolean foreground) {
        sendSystemEvent$default(this, foreground ? k.HOST_DID_ENTER_FOREGROUND : k.HOST_DID_ENTER_BACKGROUND, null, 2, null);
    }

    public final void setSetupWizardState(j newMilestone) {
        k kVar;
        newMilestone.getClass();
        int i14 = WhenMappings.$EnumSwitchMapping$0[newMilestone.ordinal()];
        if (i14 == 1) {
            kVar = k.SETUP_WIZARD_START;
        } else if (i14 == 2) {
            kVar = k.SETUP_WIZARD_COMPLETE;
        } else if (i14 != 4) {
            return;
        } else {
            kVar = k.SETUP_WIZARD_SKIPPED;
        }
        sendSystemEvent$default(this, kVar, null, 2, null);
    }

    public final void setSyncState(j newMilestone) {
        k kVar;
        newMilestone.getClass();
        int i14 = WhenMappings.$EnumSwitchMapping$0[newMilestone.ordinal()];
        if (i14 == 2) {
            kVar = k.SYNC_COMPLETE;
        } else if (i14 != 3) {
            return;
        } else {
            kVar = k.SYNC_FAIL;
        }
        sendSystemEvent$default(this, kVar, null, 2, null);
    }
}
