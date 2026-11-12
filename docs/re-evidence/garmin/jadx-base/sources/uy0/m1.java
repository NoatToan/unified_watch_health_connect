package uy0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00020\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Luy0/m1;", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "item", "", "Lcom/garmin/android/apps/connectmobile/navigation/domain/Breadcrumbs;", "breadcrumbs", "<init>", "(Lcom/garmin/android/apps/connectmobile/navigation/more/b;Ljava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.navigation.more.b f173249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.navigation.more.b> f173250b;

    /* JADX WARN: Multi-variable type inference failed */
    public m1(com.garmin.android.apps.connectmobile.navigation.more.b bVar, List<? extends com.garmin.android.apps.connectmobile.navigation.more.b> list) {
        bVar.getClass();
        list.getClass();
        this.f173249a = bVar;
        this.f173250b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return p005kotlin.jvm.internal.s.g(this.f173249a, m1Var.f173249a) && p005kotlin.jvm.internal.s.g(this.f173250b, m1Var.f173250b);
    }

    public final int hashCode() {
        return this.f173250b.hashCode() + (this.f173249a.hashCode() * 31);
    }

    public final String toString() {
        return "SearchItemData(item=" + this.f173249a + ", breadcrumbs=" + this.f173250b + ")";
    }

    public m1(com.garmin.android.apps.connectmobile.navigation.more.b bVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? p13.j0.f134944a : list);
    }
}
