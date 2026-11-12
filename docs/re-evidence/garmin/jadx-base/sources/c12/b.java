package c12;

import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lc12/b;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "Lkotlin/Function0;", "", "onClick", "", "enabled", "Lc12/b$a;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/String;Le23/a;ZLc12/b$a;)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f22529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f22531d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc12/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        PRIMARY,
        SECONDARY,
        TERTIARY
    }

    public b(String str, e23.a<Unit> aVar, boolean z14, a aVar2) {
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f22528a = str;
        this.f22529b = aVar;
        this.f22530c = z14;
        this.f22531d = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f22528a, bVar.f22528a) && s.g(this.f22529b, bVar.f22529b) && this.f22530c == bVar.f22530c && this.f22531d == bVar.f22531d;
    }

    public final int hashCode() {
        return this.f22531d.hashCode() + q6.f.g(q6.f.f(this.f22528a.hashCode() * 31, 31, this.f22529b), 31, this.f22530c);
    }

    public final String toString() {
        return "WizardButton(label=" + this.f22528a + ", onClick=" + this.f22529b + ", enabled=" + this.f22530c + ", type=" + this.f22531d + ")";
    }

    public /* synthetic */ b(String str, e23.a aVar, boolean z14, a aVar2, int i14, j jVar) {
        this(str, aVar, (i14 & 4) != 0 ? true : z14, (i14 & 8) != 0 ? a.PRIMARY : aVar2);
    }
}
