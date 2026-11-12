package com.google.firebase.sessions.settings;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.s;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "<anonymous>", "(Lo53/b0;)Lcom/google/firebase/sessions/settings/SessionConfigs;"}, k = 3, mv = {2, 0, 0})
@e(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$sessionConfigs$1", f = "SettingsCache.kt", l = {64}, m = "invokeSuspend")
public final class SettingsCacheImpl$sessionConfigs$1 extends i implements p<b0, d<? super SessionConfigs>, Object> {
    int label;
    final /* synthetic */ SettingsCacheImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCacheImpl$sessionConfigs$1(SettingsCacheImpl settingsCacheImpl, d<? super SettingsCacheImpl$sessionConfigs$1> dVar) {
        super(2, dVar);
        this.this$0 = settingsCacheImpl;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SettingsCacheImpl$sessionConfigs$1(this.this$0, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super SessionConfigs> dVar) {
        return ((SettingsCacheImpl$sessionConfigs$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        r53.i data = this.this$0.sessionConfigsDataStore.getData();
        this.label = 1;
        Object objX = s.x(data, this);
        return objX == aVar ? aVar : objX;
    }
}
