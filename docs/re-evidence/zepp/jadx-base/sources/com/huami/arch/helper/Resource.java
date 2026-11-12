package com.huami.arch.helper;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 !*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001!B'\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J8\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\n\u001a\u0004\u0018\u00018\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0006R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/arch/helper/Resource;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/huami/arch/helper/Status;", "component1", "component2", "()Ljava/lang/Object;", "", "component3", "status", "data", "message", "copy", "(Lcom/huami/arch/helper/Status;Ljava/lang/Object;Ljava/lang/String;)Lcom/huami/arch/helper/Resource;", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/arch/helper/Status;", "getStatus", "()Lcom/huami/arch/helper/Status;", "b", "Ljava/lang/Object;", "getData", "c", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(Lcom/huami/arch/helper/Status;Ljava/lang/Object;Ljava/lang/String;)V", "Companion", "aac-helper_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class Resource<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Status status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final T data;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String message;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/huami/arch/helper/Resource$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "data", "Lcom/huami/arch/helper/Resource;", "success", "(Ljava/lang/Object;)Lcom/huami/arch/helper/Resource;", "", "msg", "error", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/huami/arch/helper/Resource;", "loading", "<init>", "()V", "aac-helper_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static /* synthetic */ Resource error$default(Companion companion, String str, Object obj, int i, Object obj2) {
            if ((i & 2) != 0) {
                obj = null;
            }
            return companion.error(str, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static /* synthetic */ Resource loading$default(Companion companion, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return companion.loading(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static /* synthetic */ Resource success$default(Companion companion, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return companion.success(obj);
        }

        @NotNull
        public final <T> Resource<T> error(@NotNull String msg, @Nullable T data) {
            return new Resource<>(Status.ERROR, data, msg);
        }

        @NotNull
        public final <T> Resource<T> loading(@Nullable T data) {
            return new Resource<>(Status.LOADING, data, null);
        }

        @NotNull
        public final <T> Resource<T> success(@Nullable T data) {
            return new Resource<>(Status.SUCCESS, data, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Resource(@NotNull Status status, @Nullable T t, @Nullable String str) {
        this.status = status;
        this.data = t;
        this.message = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static /* synthetic */ Resource copy$default(Resource resource, Status status, Object obj, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            status = resource.status;
        }
        if ((i & 2) != 0) {
            obj = resource.data;
        }
        if ((i & 4) != 0) {
            str = resource.message;
        }
        return resource.copy(status, obj, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @Nullable
    public final T component2() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Resource<T> copy(@NotNull Status status, @Nullable T data, @Nullable String message) {
        return new Resource<>(status, data, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) other;
        return Intrinsics.areEqual(this.status, resource.status) && Intrinsics.areEqual(this.data, resource.data) && Intrinsics.areEqual(this.message, resource.message);
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        Status status = this.status;
        int iHashCode = (status != null ? status.hashCode() : 0) * 31;
        T t = this.data;
        int iHashCode2 = (iHashCode + (t != null ? t.hashCode() : 0)) * 31;
        String str = this.message;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Resource(status=" + this.status + ", data=" + this.data + ", message=" + this.message + ")";
    }

    public /* synthetic */ Resource(Status status, Object obj, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : str);
    }
}
