package com.huami.phn.coach.usecase;

import com.huami.phn.core.device.BleException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/huami/phn/coach/usecase/UseCaseException;", "", "", "msg", "<init>", "(Ljava/lang/String;)V", "DeviceException", "NetException", "Lcom/huami/phn/coach/usecase/UseCaseException$DeviceException;", "Lcom/huami/phn/coach/usecase/UseCaseException$NetException;", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public abstract class UseCaseException extends Throwable {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/phn/coach/usecase/UseCaseException$DeviceException;", "Lcom/huami/phn/coach/usecase/UseCaseException;", "Lcom/huami/phn/core/device/BleException;", "component1", "exc", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/huami/phn/core/device/BleException;", "getExc", "()Lcom/huami/phn/core/device/BleException;", "<init>", "(Lcom/huami/phn/core/device/BleException;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class DeviceException extends UseCaseException {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final BleException exc;

        public DeviceException(@NotNull BleException bleException) {
            super(bleException.getMessage(), null);
            this.exc = bleException;
        }

        public static /* synthetic */ DeviceException copy$default(DeviceException deviceException, BleException bleException, int i, Object obj) {
            if ((i & 1) != 0) {
                bleException = deviceException.exc;
            }
            return deviceException.copy(bleException);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BleException getExc() {
            return this.exc;
        }

        @NotNull
        public final DeviceException copy(@NotNull BleException exc) {
            return new DeviceException(exc);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeviceException) && Intrinsics.areEqual(this.exc, ((DeviceException) other).exc);
        }

        @NotNull
        public final BleException getExc() {
            return this.exc;
        }

        public int hashCode() {
            return this.exc.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "DeviceException(exc=" + this.exc + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/huami/phn/coach/usecase/UseCaseException$NetException;", "Lcom/huami/phn/coach/usecase/UseCaseException;", "", "msg", "<init>", "(Ljava/lang/String;)V", "NetAvailableException", "ServerErrorException", "Lcom/huami/phn/coach/usecase/UseCaseException$NetException$NetAvailableException;", "Lcom/huami/phn/coach/usecase/UseCaseException$NetException$ServerErrorException;", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class NetException extends UseCaseException {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/coach/usecase/UseCaseException$NetException$NetAvailableException;", "Lcom/huami/phn/coach/usecase/UseCaseException$NetException;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
        public static final class NetAvailableException extends NetException {

            @NotNull
            public static final NetAvailableException INSTANCE = new NetAvailableException();

            private NetAvailableException() {
                super("网络不可用", null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/phn/coach/usecase/UseCaseException$NetException$ServerErrorException;", "Lcom/huami/phn/coach/usecase/UseCaseException$NetException;", "", "msg", "<init>", "(Ljava/lang/String;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
        public static final class ServerErrorException extends NetException {
            public ServerErrorException(@NotNull String str) {
                super(str, null);
            }
        }

        private NetException(String str) {
            super(str, null);
        }

        public /* synthetic */ NetException(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    private UseCaseException(String str) {
        super(str);
    }

    public /* synthetic */ UseCaseException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
