package cf;

import ca0.d2;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcf/l;", "Lcf/j;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f26926c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.room.b0 f26927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f26928b;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"cf/l$a", "Landroidx/room/g;", "Lcf/i;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends androidx.room.g<i> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, i iVar) {
            i iVar2 = iVar;
            cVar.getClass();
            iVar2.getClass();
            cVar.q3(1, iVar2.f26920a);
            cVar.h(2, iVar2.f26921b);
            cVar.h(3, iVar2.f26922c);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }
    }

    public l(androidx.room.b0 b0Var) {
        b0Var.getClass();
        this.f26927a = b0Var;
        this.f26928b = new a();
    }

    @Override // cf.j
    public final List<String> a() {
        return (List) gl1.d.O(this.f26927a, true, false, new d2(20));
    }

    @Override // cf.j
    public final i c(int i14, String str) {
        return (i) gl1.d.O(this.f26927a, true, false, new k(str, i14, 0));
    }

    @Override // cf.j
    public final void d(i iVar) {
        gl1.d.O(this.f26927a, false, true, new bp.h(25, this, iVar));
    }

    @Override // cf.j
    public final void e(String str) {
        str.getClass();
        gl1.d.O(this.f26927a, false, true, new c82.b(str, 7));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcf/l$b;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
