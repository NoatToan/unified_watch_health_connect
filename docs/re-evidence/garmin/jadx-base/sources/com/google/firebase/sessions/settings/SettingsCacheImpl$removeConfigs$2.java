package com.google.firebase.sessions.settings;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$removeConfigs$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
public final class SettingsCacheImpl$removeConfigs$2 extends i implements p<SessionConfigs, d<? super SessionConfigs>, Object> {
    int label;

    public SettingsCacheImpl$removeConfigs$2(d<? super SettingsCacheImpl$removeConfigs$2> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SettingsCacheImpl$removeConfigs$2(dVar);
    }

    @Override // e23.p
    public final Object invoke(SessionConfigs sessionConfigs, d<? super SessionConfigs> dVar) {
        return ((SettingsCacheImpl$removeConfigs$2) create(sessionConfigs, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            r.b(obj);
            return SessionConfigsSerializer.INSTANCE.getDefaultValue();
        }
        h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
