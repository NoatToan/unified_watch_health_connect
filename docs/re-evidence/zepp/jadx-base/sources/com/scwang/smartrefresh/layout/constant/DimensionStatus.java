package com.scwang.smartrefresh.layout.constant;

/* JADX INFO: loaded from: classes18.dex */
public enum DimensionStatus {
    DefaultUnNotify(false),
    Default(true),
    XmlWrap(true),
    XmlExact(true),
    XmlLayoutUnNotify(false),
    XmlLayout(true),
    CodeExactUnNotify(false),
    CodeExact(true),
    DeadLockUnNotify(false),
    DeadLock(true);

    public final boolean notifyed;

    DimensionStatus(boolean z) {
        this.notifyed = z;
    }

    public boolean canReplaceWith(DimensionStatus dimensionStatus) {
        return ordinal() < dimensionStatus.ordinal() || ((!this.notifyed || CodeExact == this) && ordinal() == dimensionStatus.ordinal());
    }

    public boolean gteReplaceWith(DimensionStatus dimensionStatus) {
        return ordinal() >= dimensionStatus.ordinal();
    }

    public DimensionStatus notifyed() {
        return !this.notifyed ? values()[ordinal() + 1] : this;
    }

    public DimensionStatus unNotify() {
        if (!this.notifyed) {
            return this;
        }
        DimensionStatus dimensionStatus = values()[ordinal() - 1];
        return !dimensionStatus.notifyed ? dimensionStatus : DefaultUnNotify;
    }
}
