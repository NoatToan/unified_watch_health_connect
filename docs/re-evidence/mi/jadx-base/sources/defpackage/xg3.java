package defpackage;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class xg3 extends mag<wg3> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<wg3> f39088a = new ArrayList();

        public a(List<wg3> list) {
            Iterator<wg3> it = list.iterator();
            while (it.hasNext()) {
                this.f39088a.add(it.next());
            }
        }

        public List<e> a() {
            ArrayList arrayList = new ArrayList();
            Iterator<wg3> it = this.f39088a.iterator();
            while (it.hasNext()) {
                e eVarA = it.next().a();
                if (eVarA != null) {
                    arrayList.add(eVarA);
                }
            }
            return arrayList;
        }

        public List<e> b() {
            ArrayList arrayList = new ArrayList();
            Iterator<wg3> it = this.f39088a.iterator();
            while (it.hasNext()) {
                e eVarB = it.next().b();
                if (eVarB != null) {
                    arrayList.add(eVarB);
                }
            }
            return arrayList;
        }

        public List<e> c() {
            ArrayList arrayList = new ArrayList();
            Iterator<wg3> it = this.f39088a.iterator();
            while (it.hasNext()) {
                e eVarC = it.next().c();
                if (eVarC != null) {
                    arrayList.add(eVarC);
                }
            }
            return arrayList;
        }

        public List<e> d() {
            ArrayList arrayList = new ArrayList();
            Iterator<wg3> it = this.f39088a.iterator();
            while (it.hasNext()) {
                e eVarD = it.next().d();
                if (eVarD != null) {
                    arrayList.add(eVarD);
                }
            }
            return arrayList;
        }
    }

    public xg3(wg3... wg3VarArr) {
        a(Arrays.asList(wg3VarArr));
    }

    public static xg3 e() {
        return new xg3(new wg3[0]);
    }

    @Override // defpackage.mag
    /* JADX INFO: renamed from: b */
    public mag<wg3> clone() {
        xg3 xg3VarE = e();
        xg3VarE.a(c());
        return xg3VarE;
    }

    public a d() {
        return new a(c());
    }
}
