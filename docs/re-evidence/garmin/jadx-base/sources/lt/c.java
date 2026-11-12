package lt;

import am.j;
import ht.r;
import java.util.ArrayList;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public interface c extends r {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llt/c$a;", "Llt/c;", "", "recommendedFocus", "<init>", "(Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f114818a;

        public a(String str) {
            str.getClass();
            this.f114818a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f114818a.equals(((a) obj).f114818a);
        }

        public final int hashCode() {
            return this.f114818a.hashCode();
        }

        public final String toString() {
            return j.m("FocusSetup(recommendedFocus=", this.f114818a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llt/c$b;", "Llt/c;", "", "step", "<init>", "(Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f114819a;

        public b(String str) {
            str.getClass();
            this.f114819a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f114819a.equals(((b) obj).f114819a);
        }

        public final int hashCode() {
            return this.f114819a.hashCode();
        }

        public final String toString() {
            return j.m("FocusStepFinished(step=", this.f114819a, ")");
        }
    }

    /* JADX INFO: renamed from: lt.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llt/c$c;", "Llt/c;", "", "newFocus", "<init>", "(Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2182c implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f114820a;

        public C2182c(String str) {
            str.getClass();
            this.f114820a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2182c) && this.f114820a.equals(((C2182c) obj).f114820a);
        }

        public final int hashCode() {
            return this.f114820a.hashCode();
        }

        public final String toString() {
            return j.m("FocusSwitch(newFocus=", this.f114820a, ")");
        }
    }

    @Override // ht.r
    default zk.a a() {
        String str;
        ArrayList arrayList = new ArrayList();
        boolean z14 = this instanceof a;
        if (z14) {
            arrayList.add(new zk.e("Type", ((a) this).f114818a));
        } else if (this instanceof C2182c) {
            arrayList.add(new zk.e("Type", ((C2182c) this).f114820a));
        } else {
            if (!(this instanceof b)) {
                u0.r();
                return null;
            }
            arrayList.add(new zk.e("Type", ((b) this).f114819a));
        }
        if (z14) {
            str = "FocusSetup";
        } else if (this instanceof C2182c) {
            str = "FocusSwitch";
        } else {
            if (!(this instanceof b)) {
                u0.r();
                return null;
            }
            str = "FocusStepFinished";
        }
        return new zk.a(str, arrayList, false, 0L, 12, null);
    }
}
