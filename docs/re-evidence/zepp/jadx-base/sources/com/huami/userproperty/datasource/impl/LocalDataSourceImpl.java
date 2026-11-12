package com.huami.userproperty.datasource.impl;

import androidx.exifinterface.media.ExifInterface;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyManager;
import com.huami.userproperty.UserPropertyModuleKt;
import com.huami.userproperty.datasource.InternalLocalDataSource;
import com.huami.userproperty.entity.ParseResult;
import com.huami.userproperty.service.UserProperty;
import com.huami.userproperty.service.datasource.LocalDataSource;
import com.huami.userproperty.service.entity.local.LocalProperty;
import com.huami.userproperty.service.interceptor.GetInterceptor;
import com.huami.userproperty.service.interceptor.InterceptorKt;
import com.huami.userproperty.service.interceptor.SetInterceptor;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ=\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/userproperty/datasource/impl/LocalDataSourceImpl;", "Lcom/huami/userproperty/service/datasource/LocalDataSource;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/UserProperty;", "property", "value", "", "registryApi", "", "Lcom/huami/userproperty/service/interceptor/SetInterceptor;", "interceptors", "", WatchFaceArrivingEvent.CMD_SET, "(Lcom/huami/userproperty/service/UserProperty;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)V", "Lcom/huami/userproperty/service/interceptor/GetInterceptor;", "get", "(Lcom/huami/userproperty/service/UserProperty;Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;", "Lcom/huami/userproperty/datasource/InternalLocalDataSource;", "a", "Lcom/huami/userproperty/datasource/InternalLocalDataSource;", "internalLocalDataSource", "<init>", "(Lcom/huami/userproperty/datasource/InternalLocalDataSource;)V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final class LocalDataSourceImpl implements LocalDataSource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InternalLocalDataSource internalLocalDataSource;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("property 读取本地 key: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/interceptor/GetInterceptor$Param;", "it", "Lcom/huami/userproperty/service/entity/local/LocalProperty;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<GetInterceptor.Param, LocalProperty> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LocalProperty invoke(@NotNull GetInterceptor.Param param) {
            return LocalDataSourceImpl.this.internalLocalDataSource.readLocal(param.getKey(), param.getRegistryApi());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ T b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, T t) {
            super(0);
            this.a = str;
            this.b = t;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "property 写入本地 key: " + this.a + " value: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/interceptor/SetInterceptor$Params;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<SetInterceptor.Params, Unit> {
        public final /* synthetic */ SetInterceptor.Params b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SetInterceptor.Params params) {
            super(1);
            this.b = params;
        }

        public final void a(@NotNull SetInterceptor.Params params) {
            LocalDataSourceImpl.this.internalLocalDataSource.saveLocal(this.b.getKey(), this.b.getRegistryApi(), this.b.getValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SetInterceptor.Params params) {
            a(params);
            return Unit.INSTANCE;
        }
    }

    public LocalDataSourceImpl(@NotNull InternalLocalDataSource internalLocalDataSource) {
        this.internalLocalDataSource = internalLocalDataSource;
    }

    @Override // com.huami.userproperty.service.datasource.LocalDataSource
    @Nullable
    public <T> T get(@NotNull UserProperty<T> property, @Nullable String registryApi, @NotNull List<? extends GetInterceptor> interceptors) {
        HMLog.verbose(UserPropertyModuleKt.MODULE_TAG, new a(property.getKey()));
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection) UserPropertyManager.INSTANCE.getGlobalInterceptors$userproperty_release(), (Iterable) interceptors);
        ArrayList arrayList = new ArrayList();
        for (T t : listPlus) {
            if (t instanceof GetInterceptor) {
                arrayList.add(t);
            }
        }
        LocalProperty localProperty = (LocalProperty) InterceptorKt.call(CollectionsKt___CollectionsKt.toList(arrayList), new GetInterceptor.Param(property.getKey(), registryApi), new b());
        ParseResult<T> parseResult = SerializeHelper.INSTANCE.parse(SerializeHelperKt.getFirstTypeParam(property), localProperty == null ? null : localProperty.getValue());
        if (parseResult instanceof ParseResult.Success) {
            return (T) ((ParseResult.Success) parseResult).getValue();
        }
        if (parseResult instanceof ParseResult.Failed.ParseFailed) {
            return null;
        }
        boolean z = parseResult instanceof ParseResult.Failed.JsonEmpty;
        return null;
    }

    @Override // com.huami.userproperty.service.datasource.LocalDataSource
    public <T> void set(@NotNull UserProperty<T> property, @Nullable T value, @Nullable String registryApi, @NotNull List<? extends SetInterceptor> interceptors) {
        HMLog.verbose(UserPropertyModuleKt.MODULE_TAG, new c(property.getKey(), value));
        String stringOrJson = SerializeHelper.INSTANCE.toStringOrJson(value);
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection) UserPropertyManager.INSTANCE.getGlobalInterceptors$userproperty_release(), (Iterable) interceptors);
        ArrayList arrayList = new ArrayList();
        for (T t : listPlus) {
            if (t instanceof SetInterceptor) {
                arrayList.add(t);
            }
        }
        List list = CollectionsKt___CollectionsKt.toList(arrayList);
        SetInterceptor.Params params = new SetInterceptor.Params(property.getKey(), stringOrJson, registryApi);
        InterceptorKt.call(list, params, new d(params));
    }
}
