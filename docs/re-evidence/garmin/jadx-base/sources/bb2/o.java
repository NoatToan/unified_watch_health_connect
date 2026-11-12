package bb2;

import androidx.room.b0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbb2/o;", "Lbb2/m;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "c", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f17378d = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f17379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f17380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f17381c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"bb2/o$a", "Landroidx/room/g;", "Lbb2/l;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.room.g<l> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, l lVar) {
            l lVar2 = lVar;
            cVar.getClass();
            lVar2.getClass();
            cVar.h(1, lVar2.getInputTimestamp());
            cVar.q3(2, lVar2.getInputAction());
            cVar.h(3, lVar2.getUnitId());
            cVar.q3(4, lVar2.getRemoteDeviceProfile());
            byte[] deviceXML = lVar2.getDeviceXML();
            if (deviceXML == null) {
                cVar.u(5);
            } else {
                cVar.t(5, deviceXML);
            }
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `device_work_input` (`inputTimestamp`,`inputAction`,`unitId`,`remoteDeviceProfile`,`deviceXML`) VALUES (?,?,?,?,?)";
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"bb2/o$b", "Landroidx/room/e;", "Lbb2/l;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends androidx.room.e<l> {
        @Override // androidx.room.e
        public final void a(ud.c cVar, l lVar) {
            l lVar2 = lVar;
            cVar.getClass();
            lVar2.getClass();
            cVar.h(1, lVar2.getInputTimestamp());
        }

        @Override // androidx.room.e
        public final String b() {
            return "DELETE FROM `device_work_input` WHERE `inputTimestamp` = ?";
        }
    }

    public o(b0 b0Var) {
        b0Var.getClass();
        this.f17379a = b0Var;
        this.f17380b = new a();
        this.f17381c = new b();
    }

    @Override // bb2.m
    public final void a(l lVar) {
        gl1.d.O(this.f17379a, false, true, new n(this, lVar, 0));
    }

    @Override // bb2.m
    public final l b(long j8) {
        return (l) gl1.d.O(this.f17379a, true, false, new a02.a(j8, 4));
    }

    @Override // bb2.m
    public final void c(l lVar) {
        gl1.d.O(this.f17379a, false, true, new n(this, lVar, 1));
    }

    @Override // bb2.m
    public final void deleteAll() {
        gl1.d.O(this.f17379a, false, true, new b71.o(12));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbb2/o$c;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}
