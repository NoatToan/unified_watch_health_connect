package com.huami.userproperty.service.interceptor;

import com.huami.userproperty.service.entity.remote.FetchResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/userproperty/service/interceptor/FetchInterceptor;", "Lcom/huami/userproperty/service/interceptor/Interceptor;", "Lcom/huami/userproperty/service/interceptor/FetchInterceptor$Params;", "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "", "Params", "service_release"}, k = 1, mv = {1, 5, 1})
public interface FetchInterceptor extends Interceptor<Params, FetchResult<String>> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/userproperty/service/interceptor/FetchInterceptor$Params;", "", "", "component1", "component2", "component3", "key", "mode", "api", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "b", "getMode", "c", "getApi", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "service_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final String mode;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        private final String api;

        public Params(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            this.key = str;
            this.mode = str2;
            this.api = str3;
        }

        public static /* synthetic */ Params copy$default(Params params, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = params.key;
            }
            if ((i & 2) != 0) {
                str2 = params.mode;
            }
            if ((i & 4) != 0) {
                str3 = params.api;
            }
            return params.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMode() {
            return this.mode;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getApi() {
            return this.api;
        }

        @NotNull
        public final Params copy(@NotNull String key, @NotNull String mode, @NotNull String api) {
            return new Params(key, mode, api);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return Intrinsics.areEqual(this.key, params.key) && Intrinsics.areEqual(this.mode, params.mode) && Intrinsics.areEqual(this.api, params.api);
        }

        @NotNull
        public final String getApi() {
            return this.api;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final String getMode() {
            return this.mode;
        }

        public int hashCode() {
            return (((this.key.hashCode() * 31) + this.mode.hashCode()) * 31) + this.api.hashCode();
        }

        @NotNull
        public String toString() {
            return "Params(key=" + this.key + ", mode=" + this.mode + ", api=" + this.api + ')';
        }
    }
}
