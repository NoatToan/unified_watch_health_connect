package com.huami.pay.service;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/huami/pay/service/PayProgress;", "", "<init>", "()V", "GenerateOrder", "Notification", "PayEnd", "Paying", "Prepare", "QueryOrderState", "Lcom/huami/pay/service/PayProgress$Prepare;", "Lcom/huami/pay/service/PayProgress$GenerateOrder;", "Lcom/huami/pay/service/PayProgress$Paying;", "Lcom/huami/pay/service/PayProgress$Notification;", "Lcom/huami/pay/service/PayProgress$QueryOrderState;", "Lcom/huami/pay/service/PayProgress$PayEnd;", "pay-service_release"}, k = 1, mv = {1, 5, 1})
public abstract class PayProgress {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/pay/service/PayProgress$GenerateOrder;", "Lcom/huami/pay/service/PayProgress;", "<init>", "()V", "pay-service_release"}, k = 1, mv = {1, 5, 1})
    public static final class GenerateOrder extends PayProgress {

        @NotNull
        public static final GenerateOrder INSTANCE = new GenerateOrder();

        private GenerateOrder() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/pay/service/PayProgress$Notification;", "Lcom/huami/pay/service/PayProgress;", "<init>", "()V", "pay-service_release"}, k = 1, mv = {1, 5, 1})
    public static final class Notification extends PayProgress {

        @NotNull
        public static final Notification INSTANCE = new Notification();

        private Notification() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/pay/service/PayProgress$PayEnd;", "Lcom/huami/pay/service/PayProgress;", "Lcom/huami/pay/service/PayResult;", "component1", "payResult", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/huami/pay/service/PayResult;", "getPayResult", "()Lcom/huami/pay/service/PayResult;", "<init>", "(Lcom/huami/pay/service/PayResult;)V", "pay-service_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class PayEnd extends PayProgress {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final PayResult payResult;

        public PayEnd(@NotNull PayResult payResult) {
            super(null);
            this.payResult = payResult;
        }

        public static /* synthetic */ PayEnd copy$default(PayEnd payEnd, PayResult payResult, int i, Object obj) {
            if ((i & 1) != 0) {
                payResult = payEnd.payResult;
            }
            return payEnd.copy(payResult);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PayResult getPayResult() {
            return this.payResult;
        }

        @NotNull
        public final PayEnd copy(@NotNull PayResult payResult) {
            return new PayEnd(payResult);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PayEnd) && this.payResult == ((PayEnd) other).payResult;
        }

        @NotNull
        public final PayResult getPayResult() {
            return this.payResult;
        }

        public int hashCode() {
            return this.payResult.hashCode();
        }

        @NotNull
        public String toString() {
            return "PayEnd(payResult=" + this.payResult + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/pay/service/PayProgress$Paying;", "Lcom/huami/pay/service/PayProgress;", "<init>", "()V", "pay-service_release"}, k = 1, mv = {1, 5, 1})
    public static final class Paying extends PayProgress {

        @NotNull
        public static final Paying INSTANCE = new Paying();

        private Paying() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/pay/service/PayProgress$Prepare;", "Lcom/huami/pay/service/PayProgress;", "Lcom/huami/pay/service/PayChannel;", "component1", "payChannel", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/huami/pay/service/PayChannel;", "getPayChannel", "()Lcom/huami/pay/service/PayChannel;", "<init>", "(Lcom/huami/pay/service/PayChannel;)V", "pay-service_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Prepare extends PayProgress {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final PayChannel payChannel;

        public Prepare(@NotNull PayChannel payChannel) {
            super(null);
            this.payChannel = payChannel;
        }

        public static /* synthetic */ Prepare copy$default(Prepare prepare, PayChannel payChannel, int i, Object obj) {
            if ((i & 1) != 0) {
                payChannel = prepare.payChannel;
            }
            return prepare.copy(payChannel);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PayChannel getPayChannel() {
            return this.payChannel;
        }

        @NotNull
        public final Prepare copy(@NotNull PayChannel payChannel) {
            return new Prepare(payChannel);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Prepare) && this.payChannel == ((Prepare) other).payChannel;
        }

        @NotNull
        public final PayChannel getPayChannel() {
            return this.payChannel;
        }

        public int hashCode() {
            return this.payChannel.hashCode();
        }

        @NotNull
        public String toString() {
            return "Prepare(payChannel=" + this.payChannel + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/pay/service/PayProgress$QueryOrderState;", "Lcom/huami/pay/service/PayProgress;", "<init>", "()V", "pay-service_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryOrderState extends PayProgress {

        @NotNull
        public static final QueryOrderState INSTANCE = new QueryOrderState();

        private QueryOrderState() {
            super(null);
        }
    }

    private PayProgress() {
    }

    public /* synthetic */ PayProgress(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
