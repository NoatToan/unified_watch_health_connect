package fu0;

import androidx.room.b0;
import androidx.room.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfu0/f;", "Lfu0/e;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f73502c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f73503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f73504b;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"fu0/f$a", "Landroidx/room/g;", "Lgu0/c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends g<gu0.c> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, gu0.c cVar2) {
            gu0.c cVar3 = cVar2;
            cVar.getClass();
            cVar3.getClass();
            cVar.h(1, cVar3.f79045a);
            cVar.h(2, cVar3.f79046b);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `transitions_counter` (`device_id`,`counter`) VALUES (?,?)";
        }
    }

    public f(b0 b0Var) {
        b0Var.getClass();
        this.f73503a = b0Var;
        this.f73504b = new a();
    }

    @Override // fu0.e
    public final void a(long j8) {
        gl1.d.O(this.f73503a, false, true, new a02.a(j8, 18));
    }

    @Override // fu0.e
    public final gu0.c b(long j8) {
        return (gu0.c) gl1.d.O(this.f73503a, true, false, new a02.a(j8, 19));
    }

    @Override // fu0.e
    public final void c(gu0.c cVar) {
        gl1.d.O(this.f73503a, false, true, new e52.b(26, this, cVar));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfu0/f$b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
