package aq;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Laq/u0;", "", "", TtmlNode.ATTR_ID, "Lcom/garmin/android/apps/connectmobile/repcounting/model/e;", "exerciseSetDTO", "", "isChecked", "backgroundColorRes", "<init>", "(ILcom/garmin/android/apps/connectmobile/repcounting/model/e;ZI)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.repcounting.model.e f12253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12255d;

    public /* synthetic */ u0(int i14, com.garmin.android.apps.connectmobile.repcounting.model.e eVar, boolean z14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, eVar, (i16 & 4) != 0 ? false : z14, (i16 & 8) != 0 ? R.drawable.gcm_surface_1_selector_background : i15);
    }

    public static u0 a(u0 u0Var, com.garmin.android.apps.connectmobile.repcounting.model.e eVar, boolean z14, int i14, int i15) {
        int i16 = u0Var.f12252a;
        if ((i15 & 2) != 0) {
            eVar = u0Var.f12253b;
        }
        if ((i15 & 4) != 0) {
            z14 = u0Var.f12254c;
        }
        if ((i15 & 8) != 0) {
            i14 = u0Var.f12255d;
        }
        u0Var.getClass();
        eVar.getClass();
        return new u0(i16, eVar, z14, i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f12252a == u0Var.f12252a && p005kotlin.jvm.internal.s.g(this.f12253b, u0Var.f12253b) && this.f12254c == u0Var.f12254c && this.f12255d == u0Var.f12255d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12255d) + q6.f.g((this.f12253b.hashCode() + (Integer.hashCode(this.f12252a) * 31)) * 31, 31, this.f12254c);
    }

    public final String toString() {
        return "EditExercisesMultiSelectListItem(id=" + this.f12252a + ", exerciseSetDTO=" + this.f12253b + ", isChecked=" + this.f12254c + ", backgroundColorRes=" + this.f12255d + ")";
    }

    public u0(int i14, com.garmin.android.apps.connectmobile.repcounting.model.e eVar, boolean z14, int i15) {
        eVar.getClass();
        this.f12252a = i14;
        this.f12253b = eVar;
        this.f12254c = z14;
        this.f12255d = i15;
    }
}
