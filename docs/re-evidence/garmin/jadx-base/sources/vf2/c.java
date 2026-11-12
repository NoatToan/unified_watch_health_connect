package vf2;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvf2/c;", "", "", "name", "category", "", "primaryMuscles", "secondaryMuscles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f177924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f177925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f177926d;

    public c(String str, String str2, List<String> list, List<String> list2) {
        list.getClass();
        list2.getClass();
        this.f177923a = str;
        this.f177924b = str2;
        this.f177925c = list;
        this.f177926d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.f177923a, cVar.f177923a) && p005kotlin.jvm.internal.s.g(this.f177924b, cVar.f177924b) && p005kotlin.jvm.internal.s.g(this.f177925c, cVar.f177925c) && p005kotlin.jvm.internal.s.g(this.f177926d, cVar.f177926d);
    }

    public final int hashCode() {
        String str = this.f177923a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f177924b;
        return this.f177926d.hashCode() + u0.b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f177925c);
    }

    public final String toString() {
        return n23.j.j(p6.b.i("ExerciseData(name=", this.f177923a, ", category=", this.f177924b, ", primaryMuscles="), this.f177925c, ", secondaryMuscles=", this.f177926d, ")");
    }

    public /* synthetic */ c(String str, String str2, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, list, list2);
    }
}
