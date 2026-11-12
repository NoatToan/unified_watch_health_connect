package com.huami.healthlabel.repository;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.ui.utils.SportAnalytics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0019\b\u0080\b\u0018\u0000 -*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001-B#\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b+\u0010,J\u0006\u0010\u0004\u001a\u00020\u0003J.\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\bø\u0001\u0000J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J8\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\rHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0019\u0010\u000f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u0010\u001a\u0004\u0018\u00018\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006."}, d2 = {"Lcom/huami/healthlabel/repository/Resource;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "isCompleted", "R", "Lkotlin/Function1;", "mapper", SportAnalytics.ParamValue.MapButtonType.MAP, "Lcom/huami/healthlabel/repository/Status;", "component1", "component2", "()Ljava/lang/Object;", "", "component3", "status", "data", "message", "copy", "(Lcom/huami/healthlabel/repository/Status;Ljava/lang/Object;Ljava/lang/String;)Lcom/huami/healthlabel/repository/Resource;", "toString", "", "hashCode", "other", "equals", "a", "Lcom/huami/healthlabel/repository/Status;", "getStatus", "()Lcom/huami/healthlabel/repository/Status;", "b", "Ljava/lang/Object;", "getData", "c", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "Z", "getLoadFromDb", "()Z", "setLoadFromDb", "(Z)V", "loadFromDb", "<init>", "(Lcom/huami/healthlabel/repository/Status;Ljava/lang/Object;Ljava/lang/String;)V", "Companion", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Resource<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
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

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean loadFromDb = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/huami/healthlabel/repository/Resource$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "data", "Lcom/huami/healthlabel/repository/Resource;", "success", "(Ljava/lang/Object;)Lcom/huami/healthlabel/repository/Resource;", "", "msg", "error", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/huami/healthlabel/repository/Resource;", "loading", "<init>", "()V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Resource error$default(Companion companion, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                obj = null;
            }
            return companion.error(str, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Resource loading$default(Companion companion, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return companion.loading(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Resource success$default(Companion companion, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return companion.success(obj);
        }

        @NotNull
        public final <T> Resource<T> error(@Nullable String msg, @Nullable T data) {
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
    }

    public Resource(@NotNull Status status, @Nullable T t, @Nullable String str) {
        this.status = status;
        this.data = t;
        this.message = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        return this.status == resource.status && Intrinsics.areEqual(this.data, resource.data) && Intrinsics.areEqual(this.message, resource.message);
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    public final boolean getLoadFromDb() {
        return this.loadFromDb;
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
        int iHashCode = this.status.hashCode() * 31;
        T t = this.data;
        int iHashCode2 = (iHashCode + (t == null ? 0 : t.hashCode())) * 31;
        String str = this.message;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isCompleted() {
        Status status = this.status;
        return status == Status.SUCCESS || status == Status.ERROR;
    }

    @NotNull
    public final <R> Resource<R> map(@NotNull Function1<? super T, ? extends R> mapper) {
        return new Resource<>(getStatus(), mapper.invoke(getData()), getMessage());
    }

    public final void setLoadFromDb(boolean z) {
        this.loadFromDb = z;
    }

    @NotNull
    public String toString() {
        return "Resource(status=" + this.status + ", data=" + this.data + ", message=" + this.message + ")";
    }
}
