package bb2;

import androidx.room.b0;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbb2/g;", "Lbb2/e;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "c", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f17352c = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f17353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f17354b;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"bb2/g$a", "Landroidx/room/g;", "Lbb2/h;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.room.g<h> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, h hVar) {
            h hVar2 = hVar;
            cVar.getClass();
            hVar2.getClass();
            cVar.h(1, hVar2.f17355a);
            String str = hVar2.f17356b;
            if (str == null) {
                cVar.u(2);
            } else {
                cVar.q3(2, str);
            }
            cVar.h(3, hVar2.f17357c);
            String str2 = hVar2.f17358d;
            if (str2 == null) {
                cVar.u(4);
            } else {
                cVar.q3(4, str2);
            }
            cVar.h(5, hVar2.f17359e);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `activity_summaries` (`activityId`,`displayName`,`startTimeGMT`,`json`,`lastUpdate`) VALUES (?,?,?,?,?)";
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"bb2/g$b", "Landroidx/room/e;", "Lbb2/h;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends androidx.room.e<h> {
        @Override // androidx.room.e
        public final void a(ud.c cVar, h hVar) {
            h hVar2 = hVar;
            cVar.getClass();
            hVar2.getClass();
            cVar.h(1, hVar2.f17355a);
        }

        @Override // androidx.room.e
        public final String b() {
            return "DELETE FROM `activity_summaries` WHERE `activityId` = ?";
        }
    }

    public g(b0 b0Var) {
        b0Var.getClass();
        this.f17353a = b0Var;
        this.f17354b = new a();
        new b();
    }

    @Override // bb2.e
    public final void a(ArrayList arrayList) {
        gl1.d.O(this.f17353a, false, true, new a42.i(25, this, arrayList));
    }

    @Override // bb2.e
    public final List d(final long j8, final long j14, final long j15, final String str) {
        return (List) gl1.d.O(this.f17353a, true, false, new e23.l() { // from class: bb2.f
            @Override // e23.l
            public final Object invoke(Object obj) throws Exception {
                long j16 = j15;
                long j17 = j8;
                long j18 = j14;
                ud.a aVar = (ud.a) obj;
                g.c cVar = g.f17352c;
                aVar.getClass();
                ud.c cVarM0 = aVar.M0("SELECT * FROM activity_summaries WHERE displayName = ? AND strftime('%s','now') * 1000 < lastUpdate + ? ORDER BY startTimeGMT DESC LIMIT ?, ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        cVarM0.u(1);
                    } else {
                        cVarM0.q3(1, str2);
                    }
                    cVarM0.h(2, j16);
                    cVarM0.h(3, j17);
                    cVarM0.h(4, j18);
                    int iB = ge1.b.B(cVarM0, "activityId");
                    int iB2 = ge1.b.B(cVarM0, "displayName");
                    int iB3 = ge1.b.B(cVarM0, "startTimeGMT");
                    int iB4 = ge1.b.B(cVarM0, "json");
                    int iB5 = ge1.b.B(cVarM0, "lastUpdate");
                    ArrayList arrayList = new ArrayList();
                    while (cVarM0.J0()) {
                        h hVar = new h();
                        hVar.f17355a = cVarM0.getLong(iB);
                        String strM1 = null;
                        hVar.f17356b = cVarM0.isNull(iB2) ? null : cVarM0.M1(iB2);
                        hVar.f17357c = cVarM0.getLong(iB3);
                        if (!cVarM0.isNull(iB4)) {
                            strM1 = cVarM0.M1(iB4);
                        }
                        hVar.f17358d = strM1;
                        hVar.f17359e = cVarM0.getLong(iB5);
                        arrayList.add(hVar);
                    }
                    cVarM0.close();
                    return arrayList;
                } catch (Throwable th3) {
                    cVarM0.close();
                    throw th3;
                }
            }
        });
    }

    @Override // bb2.e
    public final void deleteAll() {
        gl1.d.O(this.f17353a, false, true, new b71.o(9));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbb2/g$c;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}
