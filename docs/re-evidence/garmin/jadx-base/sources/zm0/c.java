package zm0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.userprofile.model.k;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.actions.SearchIntents;
import hi0.l;
import hi0.m;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.w;
import vb.h;
import yc.h3;
import yc.i3;
import ym0.w0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lzm0/c;", "Lyc/h3;", "", "Lhi0/l;", "", SearchIntents.EXTRA_QUERY, "Lym0/a;", "groupRepo", "<init>", "(Ljava/lang/String;Lym0/a;)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends h3<Integer, l> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ym0.a f205287c;

    static {
        new a(null);
    }

    public c(String str, ym0.a aVar) {
        str.getClass();
        aVar.getClass();
        this.f205286b = str;
        this.f205287c = aVar;
    }

    @Override // yc.h3
    public final Integer c(i3<Integer, l> i3Var) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        d dVar;
        int i14;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i15 = dVar.f205291d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                dVar.f205291d = i15 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objJ = dVar.f205289b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = dVar.f205291d;
        try {
            if (i16 == 0) {
                r.b(objJ);
                Integer num = (Integer) aVar.a();
                int iIntValue = num != null ? num.intValue() : 1;
                ym0.a aVar3 = this.f205287c;
                String str = this.f205286b;
                List listC = w.c(k.PREMIUM_FRIEND);
                dVar.f205288a = iIntValue;
                dVar.f205291d = 1;
                aVar3.getClass();
                objJ = f0.J(aVar3, new w0(aVar3, str, iIntValue, 20, listC, null), dVar);
                if (objJ == aVar2) {
                    return aVar2;
                }
                i14 = iIntValue;
            } else {
                if (i16 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = dVar.f205288a;
                r.b(objJ);
            }
            v2 v2Var = (v2) objJ;
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            if (!(v2Var instanceof v2.b)) {
                throw new NoWhenBranchMatchedException();
            }
            List<l> listA = ((m) ((v2.b) v2Var).f47386a).a();
            if (listA == null) {
                listA = j0.f134944a;
            }
            return new h3.b.c(listA, null, listA.size() < 20 ? null : new Integer(i14 + 20));
        } catch (Exception e4) {
            return new h3.b.a(e4);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lzm0/c$a;", "", "<init>", "()V", "", "START_INDEX", "I", "PAGE_SIZE", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
