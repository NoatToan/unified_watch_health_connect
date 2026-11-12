package com.xiaomi.hm.health.device.virtual;

import com.alipay.sdk.m.f0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult;", "", "<init>", "()V", "FAIL", "HAS_BOUND", "NO_DEVICE", "NO_NETWORK", "START_BIND", c.p, "Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult$START_BIND;", "Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult$NO_NETWORK;", "Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult$SUCCESS;", "Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult$NO_DEVICE;", "Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult$FAIL;", "Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult$HAS_BOUND;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class VirtualBindResult {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult$FAIL;", "Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class FAIL extends VirtualBindResult {

        @NotNull
        public static final FAIL INSTANCE = new FAIL();

        private FAIL() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult$HAS_BOUND;", "Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class HAS_BOUND extends VirtualBindResult {

        @NotNull
        public static final HAS_BOUND INSTANCE = new HAS_BOUND();

        private HAS_BOUND() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult$NO_DEVICE;", "Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class NO_DEVICE extends VirtualBindResult {

        @NotNull
        public static final NO_DEVICE INSTANCE = new NO_DEVICE();

        private NO_DEVICE() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult$NO_NETWORK;", "Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class NO_NETWORK extends VirtualBindResult {

        @NotNull
        public static final NO_NETWORK INSTANCE = new NO_NETWORK();

        private NO_NETWORK() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult$START_BIND;", "Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class START_BIND extends VirtualBindResult {

        @NotNull
        public static final START_BIND INSTANCE = new START_BIND();

        private START_BIND() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult$SUCCESS;", "Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class SUCCESS extends VirtualBindResult {

        @NotNull
        public static final SUCCESS INSTANCE = new SUCCESS();

        private SUCCESS() {
            super(null);
        }
    }

    private VirtualBindResult() {
    }

    public /* synthetic */ VirtualBindResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
