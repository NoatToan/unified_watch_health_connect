package fu0;

import androidx.room.b0;
import androidx.room.g;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import f2.o0;
import fo.x;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfu0/b;", "Lfu0/a;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements fu0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1485b f73492d = new C1485b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f73493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f73494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eu0.c f73495c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"fu0/b$a", "Landroidx/room/g;", "Lgu0/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends g<gu0.a> {
        public a() {
        }

        @Override // androidx.room.g
        public final void a(ud.c cVar, gu0.a aVar) {
            gu0.a aVar2 = aVar;
            cVar.getClass();
            aVar2.getClass();
            cVar.h(1, aVar2.f79032a);
            String str = aVar2.f79033b;
            if (str == null) {
                cVar.u(2);
            } else {
                cVar.q3(2, str);
            }
            String str2 = aVar2.f79034c;
            if (str2 == null) {
                cVar.u(3);
            } else {
                cVar.q3(3, str2);
            }
            List<l20.c> list = aVar2.f79035d;
            b.this.f73495c.getClass();
            String strA = list == null ? null : GsonUtil.a(list);
            if (strA == null) {
                cVar.u(4);
            } else {
                cVar.q3(4, strA);
            }
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `live_event_contacts` (`id`,`first_name`,`last_name`,`phones`) VALUES (nullif(?, 0),?,?,?)";
        }
    }

    public b(b0 b0Var) {
        b0Var.getClass();
        this.f73495c = new eu0.c();
        this.f73493a = b0Var;
        this.f73494b = new a();
    }

    @Override // fu0.a
    public final void a(ArrayList arrayList) {
        gl1.d.O(this.f73493a, false, true, new e52.b(24, this, arrayList));
    }

    @Override // fu0.a
    public final void deleteAll() {
        gl1.d.O(this.f73493a, false, true, new x(14));
    }

    @Override // fu0.a
    public final List<gu0.a> getAll() {
        return (List) gl1.d.O(this.f73493a, true, false, new o0(this, 22));
    }

    /* JADX INFO: renamed from: fu0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfu0/b$b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1485b {
        public /* synthetic */ C1485b(j jVar) {
            this();
        }

        private C1485b() {
        }
    }
}
