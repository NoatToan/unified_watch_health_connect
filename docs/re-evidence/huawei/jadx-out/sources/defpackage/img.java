package defpackage;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huawei.operation.utils.Constants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes32.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/huawei/health/trusport_ee/Sample;", "", "timestamp", "", "speed", "", "steprate", "hr", "", "<init>", "(JFFI)V", "getTimestamp", "()J", "getSpeed", "()F", "getSteprate", "getHr", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", WatchFaceConstant.HASHCODE, "toString", "", "Builder", "trusport_ee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class img {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f37819c;
    private final int d;
    private final float e;

    public img(long j, float f, float f2, int i) {
        this.f37818b = j;
        this.f37819c = f;
        this.e = f2;
        this.d = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getF37818b() {
        return this.f37818b;
    }

    public /* synthetic */ img(long j, float f, float f2, int i, int i2, zcm zcmVar) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? imq.a() : f, (i2 & 4) != 0 ? imq.e() : f2, (i2 & 8) != 0 ? imq.b() : i);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getF37819c() {
        return this.f37819c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getD() {
        return this.d;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/huawei/health/trusport_ee/Sample$Builder;", "", "timestamp", "", "<init>", "(J)V", "speed", "", "steprate", "hr", "", "setSpeed", "value", "setSteprate", "setHr", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/huawei/health/trusport_ee/Sample;", "trusport_ee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f37821b;
        private float e = imq.a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f37820a = imq.e();
        private int d = imq.b();

        public b(long j) {
            this.f37821b = j;
        }

        public final b c(float f) {
            this.e = f;
            return this;
        }

        public final b a(float f) {
            this.f37820a = f;
            return this;
        }

        public final b d(int i) {
            this.d = i;
            return this;
        }

        public final img a() {
            return new img(this.f37821b, this.e, this.f37820a, this.d);
        }
    }

    public String toString() {
        return "Sample(timestamp=" + this.f37818b + ", speed=" + this.f37819c + ", steprate=" + this.e + ", hr=" + this.d + Constants.RIGHT_BRACKET_ONLY;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f37818b) * 31) + Float.hashCode(this.f37819c)) * 31) + Float.hashCode(this.e)) * 31) + Integer.hashCode(this.d);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof img)) {
            return false;
        }
        img imgVar = (img) other;
        return this.f37818b == imgVar.f37818b && Float.compare(this.f37819c, imgVar.f37819c) == 0 && Float.compare(this.e, imgVar.e) == 0 && this.d == imgVar.d;
    }

    public img() {
        this(0L, 0.0f, 0.0f, 0, 15, null);
    }
}
