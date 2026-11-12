package com.xiaomi.hm.health.di.koin.startup;

import android.content.Context;
import androidx.startup.Initializer;
import com.huami.koinstartup.KoinInitializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.koin.core.KoinApplication;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/startup/UserInfoModuleInitializer;", "Lcom/huami/koinstartup/KoinInitializer;", "Lorg/koin/core/KoinApplication;", "koinApplication", "", "startKoin", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class UserInfoModuleInitializer implements KoinInitializer {
    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ Unit create(Context context) {
        create2(context);
        return Unit.INSTANCE;
    }

    @Override // com.huami.koinstartup.KoinInitializer, androidx.startup.Initializer
    @NotNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return KoinInitializer.DefaultImpls.dependencies(this);
    }

    @Override // com.huami.koinstartup.KoinInitializer
    public void startKoin(@NotNull KoinApplication koinApplication) {
        koinApplication.modules(UserInfoModuleInitializerKt.getUserInfoModule());
    }

    @Override // com.huami.koinstartup.KoinInitializer
    /* JADX INFO: renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(@NotNull Context context) {
        KoinInitializer.DefaultImpls.create(this, context);
    }
}
