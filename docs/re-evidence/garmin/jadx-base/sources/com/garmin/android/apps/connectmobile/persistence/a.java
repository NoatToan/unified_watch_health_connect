package com.garmin.android.apps.connectmobile.persistence;

import androidx.room.b0;
import androidx.room.g;
import gl1.d;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import to.o;
import ud.c;
import yt.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/persistence/a;", "Lz81/a;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements z81.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f40315c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f40316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0756a f40317b;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.persistence.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/persistence/a$a", "Landroidx/room/g;", "Lto/o;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0756a extends g<o> {
        @Override // androidx.room.g
        public final void a(c cVar, o oVar) {
            o oVar2 = oVar;
            cVar.getClass();
            oVar2.getClass();
            cVar.h(1, oVar2.getTypeId());
            cVar.q3(2, oVar2.j());
            Integer parentTypeId = oVar2.getParentTypeId();
            if (parentTypeId == null) {
                cVar.u(3);
            } else {
                cVar.h(3, parentTypeId.intValue());
            }
            Integer sortOrder = oVar2.getSortOrder();
            if (sortOrder == null) {
                cVar.u(4);
            } else {
                cVar.h(4, sortOrder.intValue());
            }
            cVar.h(5, oVar2.getIsHidden() ? 1L : 0L);
            cVar.h(6, oVar2.getRestricted() ? 1L : 0L);
            cVar.h(7, oVar2.getTrimmable() ? 1L : 0L);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `activity_types` (`typeId`,`typeKey`,`parentTypeId`,`sortOrder`,`isHidden`,`restricted`,`trimmable`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    public a(b0 b0Var) {
        b0Var.getClass();
        this.f40316a = b0Var;
        this.f40317b = new C0756a();
    }

    @Override // z81.a
    public final void a(List<o> list) {
        d.O(this.f40316a, false, true, new f(10, this, list));
    }

    @Override // z81.a
    public final void b() {
        d.O(this.f40316a, false, true, new z81.b(0));
    }

    @Override // z81.a
    public final List<o> c() {
        return (List) d.O(this.f40316a, true, false, new yq.d(29));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/persistence/a$b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
