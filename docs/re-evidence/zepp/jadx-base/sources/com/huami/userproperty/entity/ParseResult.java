package com.huami.userproperty.entity;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/huami/userproperty/entity/ParseResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Success", "Lcom/huami/userproperty/entity/ParseResult$Success;", "Lcom/huami/userproperty/entity/ParseResult$Failed;", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public abstract class ParseResult<T> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/huami/userproperty/entity/ParseResult$Failed;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/entity/ParseResult;", "<init>", "()V", "JsonEmpty", "ParseFailed", "Lcom/huami/userproperty/entity/ParseResult$Failed$ParseFailed;", "Lcom/huami/userproperty/entity/ParseResult$Failed$JsonEmpty;", "userproperty_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class Failed<T> extends ParseResult<T> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/userproperty/entity/ParseResult$Failed$JsonEmpty;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/entity/ParseResult$Failed;", "<init>", "()V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
        public static final class JsonEmpty<T> extends Failed<T> {
            public JsonEmpty() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/userproperty/entity/ParseResult$Failed$ParseFailed;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/entity/ParseResult$Failed;", "<init>", "()V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
        public static final class ParseFailed<T> extends Failed<T> {
            public ParseFailed() {
                super(null);
            }
        }

        private Failed() {
            super(null);
        }

        public /* synthetic */ Failed(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0003\u001a\u0004\u0018\u00018\u0001HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001b\u0010\u0005\u001a\u0004\u0018\u00018\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/huami/userproperty/entity/ParseResult$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/entity/ParseResult;", "component1", "()Ljava/lang/Object;", "value", "copy", "(Ljava/lang/Object;)Lcom/huami/userproperty/entity/ParseResult$Success;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/Object;", "getValue", "<init>", "(Ljava/lang/Object;)V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Success<T> extends ParseResult<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        private final T value;

        public Success(@Nullable T t) {
            super(null);
            this.value = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        @Nullable
        public final T component1() {
            return this.value;
        }

        @NotNull
        public final Success<T> copy(@Nullable T value) {
            return new Success<>(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.value, ((Success) other).value);
        }

        @Nullable
        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            T t = this.value;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(value=" + this.value + ')';
        }
    }

    private ParseResult() {
    }

    public /* synthetic */ ParseResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
