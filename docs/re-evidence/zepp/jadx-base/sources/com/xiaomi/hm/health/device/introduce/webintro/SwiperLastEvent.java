package com.xiaomi.hm.health.device.introduce.webintro;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/webintro/SwiperLastEvent;", "", "", "a", "Z", "getShowMiotPermission", "()Z", "showMiotPermission", "<init>", "(Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SwiperLastEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean showMiotPermission;

    public SwiperLastEvent() {
        this(false, 1, null);
    }

    public SwiperLastEvent(boolean z) {
        this.showMiotPermission = z;
    }

    public final boolean getShowMiotPermission() {
        return this.showMiotPermission;
    }

    public /* synthetic */ SwiperLastEvent(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
