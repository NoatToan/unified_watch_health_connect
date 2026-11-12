package org.koin.android.ext.koin;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import java.io.InputStream;
import java.util.Properties;
import jg.b;
import k23.d;
import lc.u0;
import org.koin.android.logger.AndroidLogger;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.PropertyRegistryExtKt;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;
import ot.c;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p13.u;
import p13.w;
import r12.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"androidLogger", "Lorg/koin/core/KoinApplication;", "level", "Lorg/koin/core/logger/Level;", "androidContext", "Landroid/content/Context;", "androidFileProperties", "koinPropertyFile", "", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KoinExtKt {
    public static final KoinApplication androidContext(KoinApplication koinApplication, Context context) {
        koinApplication.getClass();
        context.getClass();
        Logger logger = koinApplication.getKoin().getLogger();
        if (logger.getLevel().compareTo(Level.INFO) <= 0) {
            koinApplication.getKoin().getLogger().info("[init] declare Android Context");
        }
        Koin.loadModules$default(koinApplication.getKoin(), w.c(ModuleDSLKt.module$default(false, new c(context, 9), 1, null)), false, false, 6, null);
        return koinApplication;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit androidContext$lambda$2(Context context, Module module) {
        module.getClass();
        if (context instanceof Application) {
            a aVar = new a((Application) context, 10);
            StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            j0 j0Var = j0.f134944a;
            t0 t0Var = s0.f105811a;
            SingleInstanceFactory<?> singleInstanceFactoryP = u0.p(new BeanDefinition(rootScopeQualifier, t0Var.b(Application.class), null, aVar, kind, j0Var), module);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactoryP);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactoryP), t0Var.b(Context.class));
        } else {
            br2.a aVar2 = new br2.a(context, 16);
            SingleInstanceFactory<?> singleInstanceFactoryP2 = u0.p(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(Context.class), null, aVar2, Kind.Singleton, j0.f134944a), module);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactoryP2);
            }
            new KoinDefinition(module, singleInstanceFactoryP2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Application androidContext$lambda$2$lambda$0(Context context, Scope scope, ParametersHolder parametersHolder) {
        scope.getClass();
        parametersHolder.getClass();
        return (Application) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context androidContext$lambda$2$lambda$1(Context context, Scope scope, ParametersHolder parametersHolder) {
        scope.getClass();
        parametersHolder.getClass();
        return context;
    }

    public static final KoinApplication androidFileProperties(KoinApplication koinApplication, String str) {
        String[] list;
        koinApplication.getClass();
        str.getClass();
        Properties properties = new Properties();
        Context context = (Context) koinApplication.getKoin().getScopeRegistry().getRootScope().get((d<?>) s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
        try {
            AssetManager assets = context.getAssets();
            if ((assets == null || (list = assets.list("")) == null) ? false : u.z(list, str)) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open(str);
                    try {
                        properties.load(inputStreamOpen);
                        Unit unit = Unit.INSTANCE;
                        b.l(inputStreamOpen, null);
                        PropertyRegistryExtKt.saveProperties(koinApplication.getKoin().getPropertyRegistry(), properties);
                        Unit unit2 = Unit.INSTANCE;
                        if (koinApplication.getKoin().getLogger().getLevel().compareTo(Level.INFO) <= 0) {
                            koinApplication.getKoin().getLogger().info("[Android-Properties] loaded " + unit2 + " properties from assets/" + str);
                            return koinApplication;
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            b.l(inputStreamOpen, th3);
                            throw th4;
                        }
                    }
                } catch (Exception e4) {
                    koinApplication.getKoin().getLogger().error("[Android-Properties] error for binding properties : " + e4);
                }
            } else {
                if (koinApplication.getKoin().getLogger().getLevel().compareTo(Level.INFO) <= 0) {
                    koinApplication.getKoin().getLogger().info("[Android-Properties] no assets/" + str + " file to load");
                    return koinApplication;
                }
            }
        } catch (Exception e14) {
            koinApplication.getKoin().getLogger().error("[Android-Properties] error while loading properties from assets/" + str + " : " + e14);
        }
        return koinApplication;
    }

    public static /* synthetic */ KoinApplication androidFileProperties$default(KoinApplication koinApplication, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = "koin.properties";
        }
        return androidFileProperties(koinApplication, str);
    }

    public static final KoinApplication androidLogger(KoinApplication koinApplication, Level level) {
        koinApplication.getClass();
        level.getClass();
        koinApplication.getKoin().setupLogger(new AndroidLogger(level));
        return koinApplication;
    }

    public static /* synthetic */ KoinApplication androidLogger$default(KoinApplication koinApplication, Level level, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            level = Level.INFO;
        }
        return androidLogger(koinApplication, level);
    }
}
