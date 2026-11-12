package com.huami.apm.prod.core;

import android.content.Context;
import androidx.startup.Initializer;
import com.huami.apm.prod.service.AbstractApmApiKt;
import com.huami.koinstartup.KoinInitializer;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.KoinApplication;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/apm/prod/core/ApmKoinInitializer;", "Lcom/huami/koinstartup/KoinInitializer;", "Lorg/koin/core/KoinApplication;", "koinApplication", "", "startKoin", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "create", "<init>", "()V", "apm-prod-core_release"}, k = 1, mv = {1, 5, 1})
public final class ApmKoinInitializer implements KoinInitializer {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "APM-Prod 初始化成功（core）";
        }
    }

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
        koinApplication.modules(ApmKoinInitializerKt.getNoOpModule());
        HMLog.info(AbstractApmApiKt.APM_MODULE_TAG, a.a);
    }

    @Override // com.huami.koinstartup.KoinInitializer
    /* JADX INFO: renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(@NotNull Context context) {
        KoinInitializer.DefaultImpls.create(this, context);
        ApmEnvLogReporter.INSTANCE.init(context.getApplicationContext());
    }
}
