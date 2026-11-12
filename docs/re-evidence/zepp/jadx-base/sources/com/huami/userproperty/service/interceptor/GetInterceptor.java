package com.huami.userproperty.service.interceptor;

import com.huami.userproperty.service.entity.local.LocalProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/userproperty/service/interceptor/GetInterceptor;", "Lcom/huami/userproperty/service/interceptor/Interceptor;", "Lcom/huami/userproperty/service/interceptor/GetInterceptor$Param;", "Lcom/huami/userproperty/service/entity/local/LocalProperty;", "Param", "service_release"}, k = 1, mv = {1, 5, 1})
public interface GetInterceptor extends Interceptor<Param, LocalProperty> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/userproperty/service/interceptor/GetInterceptor$Param;", "", "", "component1", "component2", "key", "registryApi", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "b", "getRegistryApi", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "service_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Param {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        private final String registryApi;

        public Param(@NotNull String str, @Nullable String str2) {
            this.key = str;
            this.registryApi = str2;
        }

        public static /* synthetic */ Param copy$default(Param param, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = param.key;
            }
            if ((i & 2) != 0) {
                str2 = param.registryApi;
            }
            return param.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRegistryApi() {
            return this.registryApi;
        }

        @NotNull
        public final Param copy(@NotNull String key, @Nullable String registryApi) {
            return new Param(key, registryApi);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Param)) {
                return false;
            }
            Param param = (Param) other;
            return Intrinsics.areEqual(this.key, param.key) && Intrinsics.areEqual(this.registryApi, param.registryApi);
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @Nullable
        public final String getRegistryApi() {
            return this.registryApi;
        }

        public int hashCode() {
            int iHashCode = this.key.hashCode() * 31;
            String str = this.registryApi;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "Param(key=" + this.key + ", registryApi=" + ((Object) this.registryApi) + ')';
        }
    }
}
