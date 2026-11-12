package qd1;

import com.garmin.android.apps.connectmobile.f3;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqd1/b;", "", "", "Lqd1/a;", "reminders", "Lpd1/a;", "reminderType", "", "userProfileId", "<init>", "(Ljava/util/List;Lpd1/a;Ljava/lang/Integer;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f144479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pd1.a f144480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f144481c;

    public b(List<a> list, pd1.a aVar, Integer num) {
        list.getClass();
        this.f144479a = list;
        this.f144480b = aVar;
        this.f144481c = num;
    }

    public static b a(b bVar, ArrayList arrayList) {
        pd1.a aVar = bVar.f144480b;
        Integer num = bVar.f144481c;
        bVar.getClass();
        return new b(arrayList, aVar, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f144479a.equals(bVar.f144479a) && this.f144480b == bVar.f144480b && s.g(this.f144481c, bVar.f144481c);
    }

    public final int hashCode() {
        int iHashCode = this.f144479a.hashCode() * 31;
        pd1.a aVar = this.f144480b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num = this.f144481c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FixedTimeDailyReminders(reminders=");
        sb3.append(this.f144479a);
        sb3.append(", reminderType=");
        sb3.append(this.f144480b);
        sb3.append(", userProfileId=");
        return f3.i(sb3, this.f144481c, ")");
    }
}
