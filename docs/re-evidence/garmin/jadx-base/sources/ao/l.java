package ao;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.reflect.TypeToken;
import d53.w;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lao/l;", "Lao/k;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f11527a;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"ao/l$b", "Lcom/google/gson/reflect/TypeToken;", "", "", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends TypeToken<List<? extends String>> {
    }

    static {
        new a(null);
    }

    public l(f12.l lVar) {
        lVar.getClass();
        this.f11527a = lVar;
    }

    @Override // ao.k
    public final List<String> a() {
        String strA4 = this.f11527a.A4("keyActivitiesRecentSearches", null);
        if (strA4 == null || strA4.length() == 0) {
            return j0.f134944a;
        }
        return (List) GsonUtil.f47253b.fromJson(strA4, new b().getType());
    }

    @Override // ao.k
    public final void b(String str) {
        str.getClass();
        if (w.J(str)) {
            return;
        }
        ArrayList arrayListD1 = h0.d1(a());
        arrayListD1.remove(str);
        arrayListD1.add(0, str);
        if (arrayListD1.size() > 10) {
            arrayListD1.subList(10, arrayListD1.size()).clear();
        }
        this.f11527a.S("keyActivitiesRecentSearches", GsonUtil.a(arrayListD1));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lao/l$a;", "", "<init>", "()V", "", "KEY_ACTIVITIES_RECENT_SEARCHES", "Ljava/lang/String;", "", "MAX_RECENT_SEARCHES", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
