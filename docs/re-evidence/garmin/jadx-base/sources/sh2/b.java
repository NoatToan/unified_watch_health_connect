package sh2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import hi2.d;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lsh2/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f159312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f159313b;

    static {
        new a(null);
    }

    public b(Context context) {
        context.getClass();
        this.f159312a = context;
        this.f159313b = new d("ControlsMenuDataLoader", null, 2, null);
    }

    public final ArrayList<sh2.a> a(ArrayList<sh2.a> arrayList) {
        rh2.a aVar;
        ArrayList<sh2.a> arrayList2 = new ArrayList<>();
        for (sh2.a aVar2 : arrayList) {
            rh2.a.C2882a c2882a = rh2.a.f152755d;
            String str = aVar2.f159307a;
            c2882a.getClass();
            rh2.a[] aVarArrValues = rh2.a.values();
            int length = aVarArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    aVar = null;
                    break;
                }
                aVar = aVarArrValues[i14];
                if (s.g(aVar.f152757a, str)) {
                    break;
                }
                i14++;
            }
            if (aVar != null) {
                Integer num = aVar2.f159308b;
                int iIntValue = num != null ? num.intValue() : 9631;
                String str2 = aVar2.f159307a;
                Integer numValueOf = Integer.valueOf(iIntValue);
                Boolean bool = aVar2.f159309c;
                int i15 = aVar.f152758b;
                Context context = this.f159312a;
                String string = context.getString(i15);
                string.getClass();
                arrayList2.add(new sh2.a(str2, numValueOf, bool, string, a7.b.getDrawable(context, aVar.f152759c)));
            } else {
                this.f159313b.b("Did not find control object for " + aVar2.f159307a);
            }
        }
        return arrayList2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lsh2/b$a;", "", "<init>", "()V", "", "ID", "Ljava/lang/String;", "INDEX", "REQUIRED", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
