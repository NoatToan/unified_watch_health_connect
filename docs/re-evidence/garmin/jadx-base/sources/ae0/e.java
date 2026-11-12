package ae0;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import n70.v;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lae0/e;", "Ln70/v;", "Lzk0/e;", "", "userGoalType", "", "excludePregnancyWeightGoal", "<init>", "(Ljava/lang/String;Z)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements v<zk0.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2797b;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"ae0/e$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lzk0/e;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends zk0.e>> {
    }

    public e(String str, boolean z14) {
        str.getClass();
        this.f2796a = str;
        this.f2797b = z14;
    }

    public final zk0.e b(String... strArr) {
        List list = (List) a((String) u.L(0, strArr), new a());
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            zk0.e eVar = (zk0.e) obj2;
            if (s.g(eVar.getUserGoalType(), this.f2796a) && (!this.f2797b || !s.g(eVar.getUserGoalCategory(), "PREGNANCY"))) {
                obj = obj2;
                break;
            }
        }
        return (zk0.e) obj;
    }

    @Override // n70.v
    public final String getTag() {
        return fb1.c.n("GetUserGoalsDataUseCase - ", this.f2796a);
    }

    public /* synthetic */ e(String str, boolean z14, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? true : z14);
    }
}
