package com.xiaomi.fitness;

import com.xiaomi.fitness.baseui.BaseApplication;
import defpackage.gbq;
import defpackage.ma4;
import defpackage.oo9;
import defpackage.ri1;
import defpackage.si1;
import defpackage.txa;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Hilt_FitnessApp extends BaseApplication implements txa {
    private boolean injected = false;
    private final ri1 componentManager = new ri1(new a());

    public class a implements ma4 {
        public a() {
        }

        @Override // defpackage.ma4
        public Object get() {
            return com.xiaomi.fitness.a.a().a(new si1(Hilt_FitnessApp.this)).b();
        }
    }

    @Override // defpackage.sxa
    public final Object generatedComponent() {
        return m220componentManager().generatedComponent();
    }

    public void hiltInternalInject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((oo9) generatedComponent()).c((FitnessApp) gbq.a(this));
    }

    @Override // com.xiaomi.fitness.component.AbsComponentizedApplication, android.app.Application
    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final ri1 m220componentManager() {
        return this.componentManager;
    }
}
