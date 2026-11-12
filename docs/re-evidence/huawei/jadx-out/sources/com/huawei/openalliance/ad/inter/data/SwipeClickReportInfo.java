package com.huawei.openalliance.ad.inter.data;

/* JADX INFO: loaded from: classes41.dex */
public class SwipeClickReportInfo {
    private Integer angle;
    private boolean canReportClick;
    private Integer cannotReportReason;
    private MaterialClickInfo clickInfo;
    private double density;
    private int diffX;
    private int diffY;
    private Integer limitSwipeDp;
    private Integer sld;
    private Integer swipeDirection;
    private Integer swipeDirectionLength;
    private Integer swipeLength;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f19204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MaterialClickInfo f19205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f19206c;
        private Integer d;
        private Integer e;
        private Integer f;
        private int g;
        private int h;
        private double i;

        public a d(Integer num) {
            this.f = num;
            return this;
        }

        public a c(Integer num) {
            this.e = num;
            return this;
        }

        public a b(Integer num) {
            this.d = num;
            return this;
        }

        public a b(int i) {
            this.h = i;
            return this;
        }

        public SwipeClickReportInfo a() {
            return new SwipeClickReportInfo(this);
        }

        public a a(boolean z) {
            this.f19204a = z;
            return this;
        }

        public a a(Integer num) {
            this.f19206c = num;
            return this;
        }

        public a a(MaterialClickInfo materialClickInfo) {
            this.f19205b = materialClickInfo;
            return this;
        }

        public a a(int i) {
            this.g = i;
            return this;
        }

        public a a(double d) {
            this.i = d;
            return this;
        }
    }

    public Integer i() {
        if (this.angle == null) {
            this.angle = Integer.valueOf((int) Math.toDegrees(Math.atan2(-this.diffY, this.diffX)));
        }
        return this.angle;
    }

    public Integer h() {
        Integer num;
        Integer numF;
        int i;
        int i2;
        if (this.swipeDirectionLength == null && (num = this.swipeDirection) != null && this.density != 0.0d) {
            int iIntValue = num.intValue();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    if (iIntValue == 2) {
                        i2 = this.diffY;
                    } else if (iIntValue == 3) {
                        i = this.diffX;
                    } else if (iIntValue == 4) {
                        i2 = this.diffX;
                    }
                    numF = Integer.valueOf((int) (((double) i2) / this.density));
                } else {
                    i = this.diffY;
                }
                i2 = -i;
                numF = Integer.valueOf((int) (((double) i2) / this.density));
            } else {
                numF = f();
            }
            this.swipeDirectionLength = numF;
        }
        return this.swipeDirectionLength;
    }

    public Integer g() {
        return this.limitSwipeDp;
    }

    public Integer f() {
        if (this.swipeLength == null && this.density != 0.0d) {
            int i = this.diffX;
            int i2 = this.diffY;
            this.swipeLength = Integer.valueOf((int) (Math.sqrt((i * i) + (i2 * i2)) / this.density));
        }
        return this.swipeLength;
    }

    public Integer e() {
        return this.sld;
    }

    public Integer d() {
        return this.swipeDirection;
    }

    public Integer c() {
        return this.cannotReportReason;
    }

    public MaterialClickInfo b() {
        return this.clickInfo;
    }

    public boolean a() {
        return this.canReportClick;
    }

    public SwipeClickReportInfo(a aVar) {
        this.canReportClick = aVar.f19204a;
        this.clickInfo = aVar.f19205b;
        this.cannotReportReason = aVar.f19206c;
        this.sld = aVar.d;
        this.swipeDirection = aVar.e;
        this.limitSwipeDp = aVar.f;
        this.diffX = aVar.g;
        this.diffY = aVar.h;
        this.density = aVar.i;
    }
}
