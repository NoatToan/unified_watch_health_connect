package p003ji0;

import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import li0.d0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lji0/m;", "", "<init>", "()V", "a", "b", "Lji0/m$a;", "Lji0/m$b;", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class m {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lji0/m$a;", "Lji0/m;", "Lli0/d0;", "data", "<init>", "(Lli0/d0;)V", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0 f98798a;

        static {
            Parcelable.Creator<d0> creator = d0.CREATOR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d0 d0Var) {
            super(null);
            d0Var.getClass();
            this.f98798a = d0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lji0/m$b;", "Lji0/m;", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(I)V", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f98799a;

        public b(int i14) {
            super(null);
            this.f98799a = i14;
        }
    }

    public /* synthetic */ m(j jVar) {
        this();
    }

    private m() {
    }
}
