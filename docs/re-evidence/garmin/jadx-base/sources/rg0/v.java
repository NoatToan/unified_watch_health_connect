package rg0;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class v<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f152627a;

    public v(Comparator comparator) {
        this.f152627a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        h0 f35077a;
        h0 f35077a2;
        Object obj = (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.f) t7;
        String str = null;
        com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.f.g gVar = obj instanceof com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.f.g ? (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.f.g) obj : null;
        String str2 = (gVar == null || (f35077a2 = gVar.getF35077a()) == null) ? null : f35077a2.f152560b;
        Object obj2 = (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.f) t14;
        com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.f.g gVar2 = obj2 instanceof com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.f.g ? (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.f.g) obj2 : null;
        if (gVar2 != null && (f35077a = gVar2.getF35077a()) != null) {
            str = f35077a.f152560b;
        }
        return this.f152627a.compare(str2, str);
    }
}
