package eg0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Leg0/b;", "Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/InlineUnitsTextFieldView$a;", "Lbg0/a$b;", "unit", "<init>", "(Lbg0/a$b;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements InlineUnitsTextFieldView.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f63971b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bg0.a.b f63972a;

    public b(bg0.a.b bVar) {
        bVar.getClass();
        this.f63972a = bVar;
    }

    @Override // c32.d
    public final String a(Context context) {
        return this.f63972a.a(context);
    }

    @Override // com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView.a
    public final String c(Number number, Context context) {
        number.getClass();
        return this.f63972a.d(context, number, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f63972a == ((b) obj).f63972a;
    }

    public final int hashCode() {
        return this.f63972a.hashCode();
    }

    public final String toString() {
        return "MeasurementType(unit=" + this.f63972a + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leg0/b$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static List a() {
            return x.k(new b(bg0.a.b.MILE), new b(bg0.a.b.KILOMETER), new b(bg0.a.b.METER), new b(bg0.a.b.YARD));
        }

        private a() {
        }
    }
}
