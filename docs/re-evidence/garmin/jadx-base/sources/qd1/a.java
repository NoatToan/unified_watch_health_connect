package qd1;

import b63.v;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqd1/a;", "", "", "enabled", "", "message", "Lb63/v;", "time", "", "userReminderId", "<init>", "(ZLjava/lang/String;Lb63/v;Ljava/lang/Integer;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f144475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f144477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f144478d;

    public a(boolean z14, String str, v vVar, Integer num) {
        str.getClass();
        vVar.getClass();
        this.f144475a = z14;
        this.f144476b = str;
        this.f144477c = vVar;
        this.f144478d = num;
    }

    public static a a(a aVar, boolean z14, String str, v vVar, int i14) {
        if ((i14 & 1) != 0) {
            z14 = aVar.f144475a;
        }
        if ((i14 & 2) != 0) {
            str = aVar.f144476b;
        }
        if ((i14 & 4) != 0) {
            vVar = aVar.f144477c;
        }
        Integer num = aVar.f144478d;
        str.getClass();
        vVar.getClass();
        return new a(z14, str, vVar, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f144475a == aVar.f144475a && s.g(this.f144476b, aVar.f144476b) && s.g(this.f144477c, aVar.f144477c) && s.g(this.f144478d, aVar.f144478d);
    }

    public final int hashCode() {
        int iC = l2.c(this.f144477c.f16219a, g.j(Boolean.hashCode(this.f144475a) * 31, 31, this.f144476b), 31);
        Integer num = this.f144478d;
        return iC + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "FixedTimeDailyReminder(enabled=" + this.f144475a + ", message=" + this.f144476b + ", time=" + this.f144477c + ", userReminderId=" + this.f144478d + ")";
    }

    public /* synthetic */ a(boolean z14, String str, v vVar, Integer num, int i14, j jVar) {
        this(z14, str, vVar, (i14 & 8) != 0 ? null : num);
    }
}
