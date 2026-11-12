package com.huami.phn.util;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.login.a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.Throwable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u0015*\u0006\b\u0000\u0010\u0001 \u0001*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00022\u00020\u0004:\u0001\u0015B\u0011\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000e\u001a\u00020\u00048\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\u0006R\u0013\u0010\u0010\u001a\u00020\u000f8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u00020\u000f8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/phn/util/Result;", ExifInterface.GPS_DIRECTION_TRUE, "", "E", "", "getOrNull", "()Ljava/lang/Object;", "exceptionOrNull", "()Ljava/lang/Throwable;", "a", "Ljava/lang/Object;", "getValue", "getValue$annotations", "()V", "value", "", "isSuccess", "()Z", "isFailure", "<init>", "(Ljava/lang/Object;)V", "Companion", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class Result<T, E extends Throwable> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Object value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0002\u0010\u0002\"\b\b\u0003\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0002\u0010\u0002\"\b\b\u0003\u0010\u0004*\u00020\u00032\u0006\u0010\n\u001a\u00028\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/phn/util/Result$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "E", "value", "Lcom/huami/phn/util/Result;", "success$phn_coach_release", "(Ljava/lang/Object;)Lcom/huami/phn/util/Result;", "success", Constants.EXCEPTION, "failure$phn_coach_release", "(Ljava/lang/Throwable;)Lcom/huami/phn/util/Result;", a.K, "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T, E extends Throwable> Result<T, E> failure$phn_coach_release(@NotNull E exception) {
            return new Result<>(exception);
        }

        @NotNull
        public final <T, E extends Throwable> Result<T, E> success$phn_coach_release(T value) {
            Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.Any");
            return new Result<>(value);
        }
    }

    public Result(@NotNull Object obj) {
        this.value = obj;
    }

    @PublishedApi
    public static /* synthetic */ void getValue$annotations() {
    }

    @Nullable
    public final E exceptionOrNull() {
        Object obj = this.value;
        if (obj instanceof Throwable) {
            return (E) obj;
        }
        return null;
    }

    @Nullable
    public final T getOrNull() {
        if (isFailure()) {
            return null;
        }
        return (T) this.value;
    }

    @NotNull
    public final Object getValue() {
        return this.value;
    }

    public final boolean isFailure() {
        return this.value instanceof Throwable;
    }

    public final boolean isSuccess() {
        return !(this.value instanceof Throwable);
    }
}
