package bb2;

import androidx.room.b0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbb2/k;", "Lbb2/j;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f17367c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f17368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f17369b;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"bb2/k$a", "Landroidx/room/g;", "Lbb2/i;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.room.g<i> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, i iVar) {
            i iVar2 = iVar;
            cVar.getClass();
            iVar2.getClass();
            cVar.h(1, iVar2.f17361a);
            cVar.q3(2, iVar2.f17362b);
            cVar.q3(3, iVar2.f17363c);
            cVar.q3(4, iVar2.f17364d);
            cVar.q3(5, iVar2.f17365e);
            cVar.h(6, iVar2.f17366f ? 1L : 0L);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR IGNORE INTO `device_needs_bond` (`device_unit_id`,`device_mac_address`,`device_product_number`,`device_name`,`device_image_url`,`device_dialog_shown`) VALUES (?,?,?,?,?,?)";
        }
    }

    public k(b0 b0Var) {
        b0Var.getClass();
        this.f17368a = b0Var;
        this.f17369b = new a();
    }

    @Override // bb2.j
    public final void a(long j8) {
        gl1.d.O(this.f17368a, false, true, new a02.a(j8, 2));
    }

    @Override // bb2.j
    public final void b(long j8) {
        gl1.d.O(this.f17368a, false, true, new a02.a(j8, 3));
    }

    @Override // bb2.j
    public final i c() {
        return (i) gl1.d.O(this.f17368a, true, false, new b71.o(11));
    }

    @Override // bb2.j
    public final void d(i iVar) {
        gl1.d.O(this.f17368a, false, true, new a42.i(26, this, iVar));
    }

    @Override // bb2.j
    public final void deleteAll() {
        gl1.d.O(this.f17368a, false, true, new b71.o(10));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbb2/k$b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
