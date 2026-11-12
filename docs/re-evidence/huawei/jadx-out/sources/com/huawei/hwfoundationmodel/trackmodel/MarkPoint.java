package com.huawei.hwfoundationmodel.trackmodel;

import com.braintreepayments.api.PayPalPaymentIntent;
import com.google.gson.annotations.SerializedName;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwWorkoutServiceUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class MarkPoint implements Serializable, TimeSequence, Cloneable {
    private static final long serialVersionUID = 8974499289536629196L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("color")
    private int f17566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("lng")
    private double f17567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(PayPalPaymentIntent.ORDER)
    private int f17568c;

    @SerializedName(Wpt.MODE)
    private int d;

    @SerializedName("lat")
    private double e;

    @SerializedName("type")
    private int f;

    @SerializedName("time")
    private long j;

    public void c(int i) {
        this.f17568c = i;
    }

    public void d(int i) {
        this.f = i;
    }

    public void e(long j) {
        this.j = j;
    }

    public void c(double d) {
        this.e = d;
    }

    public void a(double d) {
        this.f17567b = d;
    }

    public void a(int i) {
        this.f17566a = i;
    }

    public void b(int i) {
        this.d = i;
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.j;
    }

    public int d() {
        return this.f17568c;
    }

    public int f() {
        return this.f;
    }

    public double e() {
        return this.e;
    }

    public double b() {
        return this.f17567b;
    }

    public int a() {
        return this.f17566a;
    }

    public int c() {
        return this.d;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public MarkPoint clone() throws CloneNotSupportedException {
        return (MarkPoint) super.clone();
    }

    public enum MarkType {
        COMMON(0),
        START(1),
        CAMPSITE(2),
        LEFT(3),
        RIGHT(4),
        STRAIGHT(5),
        DANGER(6),
        BEAST(7),
        HEALTHCARE(8),
        WATER(9),
        PROVIDE(10),
        BRIDGE(11),
        RISK_AVERSION(12),
        TOP_MOUNTAIN(13),
        HOUSE(14),
        END(HwWorkoutServiceUtils.HEART_RATE_TRUST_VALUE),
        AUTO_MARK(255);

        private final int mType;

        MarkType(int i) {
            this.mType = i;
        }

        public int type() {
            return this.mType;
        }

        public static MarkType getType(int i) {
            if (i >= 0 && i < values().length) {
                return values()[i];
            }
            return values()[0];
        }
    }

    public enum PointColor {
        ORANGE(0),
        RED(1),
        BLUE(2),
        YELLOW(3),
        GRAY(4),
        GREEN(5),
        AUTO(255);

        private final int mColor;

        PointColor(int i) {
            this.mColor = i;
        }

        public int color() {
            return this.mColor;
        }

        public static PointColor getColor(int i) {
            if (i >= 0 && i < values().length) {
                return values()[i];
            }
            return values()[0];
        }
    }
}
