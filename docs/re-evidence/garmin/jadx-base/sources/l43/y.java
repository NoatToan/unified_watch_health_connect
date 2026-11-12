package l43;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class y<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f110128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f110129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f110130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f110131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f110132e;

    public y(T t7, T t14, T t15, T t16, String str) {
        str.getClass();
        this.f110128a = t7;
        this.f110129b = t14;
        this.f110130c = t15;
        this.f110131d = t16;
        this.f110132e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return p005kotlin.jvm.internal.s.g(this.f110128a, yVar.f110128a) && p005kotlin.jvm.internal.s.g(this.f110129b, yVar.f110129b) && p005kotlin.jvm.internal.s.g(this.f110130c, yVar.f110130c) && p005kotlin.jvm.internal.s.g(this.f110131d, yVar.f110131d) && this.f110132e.equals(yVar.f110132e);
    }

    public final int hashCode() {
        T t7 = this.f110128a;
        int iHashCode = (t7 == null ? 0 : t7.hashCode()) * 31;
        T t14 = this.f110129b;
        int iHashCode2 = (iHashCode + (t14 == null ? 0 : t14.hashCode())) * 31;
        T t15 = this.f110130c;
        int iHashCode3 = (iHashCode2 + (t15 == null ? 0 : t15.hashCode())) * 31;
        T t16 = this.f110131d;
        return this.f110132e.hashCode() + ((iHashCode3 + (t16 != null ? t16.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb3.append(this.f110128a);
        sb3.append(", compilerVersion=");
        sb3.append(this.f110129b);
        sb3.append(", languageVersion=");
        sb3.append(this.f110130c);
        sb3.append(", expectedVersion=");
        sb3.append(this.f110131d);
        sb3.append(", filePath=");
        return androidx.room.a0.m(sb3, this.f110132e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
