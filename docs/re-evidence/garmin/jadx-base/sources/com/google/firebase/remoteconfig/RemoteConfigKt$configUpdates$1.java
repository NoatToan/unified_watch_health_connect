package com.google.firebase.remoteconfig;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1", f = "RemoteConfig.kt", l = {76}, m = "invokeSuspend")
public final class RemoteConfigKt$configUpdates$1 extends i implements p<t<? super ConfigUpdate>, t13.d<? super Unit>, Object> {
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigKt$configUpdates$1(FirebaseRemoteConfig firebaseRemoteConfig, t13.d<? super RemoteConfigKt$configUpdates$1> dVar) {
        super(2, dVar);
        this.$this_configUpdates = firebaseRemoteConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ConfigUpdateListenerRegistration configUpdateListenerRegistration) {
        configUpdateListenerRegistration.remove();
        return Unit.INSTANCE;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        RemoteConfigKt$configUpdates$1 remoteConfigKt$configUpdates$1 = new RemoteConfigKt$configUpdates$1(this.$this_configUpdates, dVar);
        remoteConfigKt$configUpdates$1.L$0 = obj;
        return remoteConfigKt$configUpdates$1;
    }

    @Override // e23.p
    public final Object invoke(t<? super ConfigUpdate> tVar, t13.d<? super Unit> dVar) {
        return ((RemoteConfigKt$configUpdates$1) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            t tVar = (t) this.L$0;
            FirebaseRemoteConfig firebaseRemoteConfig = this.$this_configUpdates;
            final ConfigUpdateListenerRegistration configUpdateListenerRegistrationAddOnConfigUpdateListener = firebaseRemoteConfig.addOnConfigUpdateListener(new RemoteConfigKt$configUpdates$1$registration$1(firebaseRemoteConfig, tVar));
            configUpdateListenerRegistrationAddOnConfigUpdateListener.getClass();
            e23.a aVar2 = new e23.a() { // from class: com.google.firebase.remoteconfig.e
                @Override // e23.a
                public final Object invoke() {
                    return RemoteConfigKt$configUpdates$1.invokeSuspend$lambda$0(configUpdateListenerRegistrationAddOnConfigUpdateListener);
                }
            };
            this.label = 1;
            if (q53.r.a(tVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
