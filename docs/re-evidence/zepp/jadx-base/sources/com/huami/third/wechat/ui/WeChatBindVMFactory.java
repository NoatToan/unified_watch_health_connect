package com.huami.third.wechat.ui;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import com.huami.third.wechat.api.DataSourceApi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0004*\u0004\u0018\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\r\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/third/wechat/ui/WeChatBindVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lorg/koin/core/component/KoinComponent;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Lcom/huami/third/wechat/api/DataSourceApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/third/wechat/api/DataSourceApi;", "dataSourceApi", "<init>", "()V", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeChatBindVMFactory implements ViewModelProvider.Factory, KoinComponent {

    @NotNull
    public static final WeChatBindVMFactory INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy dataSourceApi;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final WeChatBindVMFactory weChatBindVMFactory = new WeChatBindVMFactory();
        INSTANCE = weChatBindVMFactory;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        dataSourceApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DataSourceApi>() { // from class: com.huami.third.wechat.ui.WeChatBindVMFactory$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.third.wechat.api.DataSourceApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DataSourceApi invoke() {
                KoinComponent koinComponent = weChatBindVMFactory;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DataSourceApi.class), qualifier, objArr);
            }
        });
    }

    private WeChatBindVMFactory() {
    }

    private final DataSourceApi a() {
        return (DataSourceApi) dataSourceApi.getValue();
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        return new WeChatBindViewModel(a());
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
