package oa0;

import android.os.Parcelable;
import c22.c3;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import j90.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Loa0/e;", "", "<init>", "()V", "b", "a", "Loa0/e$a;", "Loa0/e$b;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Loa0/e$b;", "Loa0/e;", "Lc22/c3;", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Lc22/c3;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c3 f131055a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c3 c3Var) {
            super(null);
            c3Var.getClass();
            this.f131055a = c3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f131055a, ((b) obj).f131055a);
        }

        public final int hashCode() {
            return this.f131055a.hashCode();
        }

        public final String toString() {
            return "Title(label=" + this.f131055a + ")";
        }
    }

    public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private e() {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Loa0/e$a;", "Loa0/e;", "Lc22/i;", Constants.ScionAnalytics.PARAM_LABEL, "Lj90/o;", FirebaseAnalytics.Param.LOCATION, "<init>", "(ILj90/o;Lkotlin/jvm/internal/j;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f131053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f131054b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private a(int i14, o oVar) {
            super(null);
            oVar.getClass();
            this.f131053a = i14;
            this.f131054b = oVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i14 = aVar.f131053a;
            Parcelable.Creator<c22.i> creator = c22.i.CREATOR;
            return this.f131053a == i14 && this.f131054b == aVar.f131054b;
        }

        public final int hashCode() {
            Parcelable.Creator<c22.i> creator = c22.i.CREATOR;
            return this.f131054b.hashCode() + (Integer.hashCode(this.f131053a) * 31);
        }

        public final String toString() {
            Parcelable.Creator<c22.i> creator = c22.i.CREATOR;
            return "Item(label=" + e0.f(this.f131053a, "AndroidStringHandle(strRes=", ")") + ", location=" + this.f131054b + ")";
        }

        public /* synthetic */ a(int i14, o oVar, p005kotlin.jvm.internal.j jVar) {
            this(i14, oVar);
        }
    }
}
