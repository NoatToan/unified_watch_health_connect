package e32;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.n0;
import java.util.Arrays;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Le32/j;", "Landroidx/fragment/app/e0;", "Landroidx/fragment/app/m;", "activity", "Lorg/joda/time/DateTime;", "initialDate", "", "Le32/o;", "pagesTimeInterval", "Le32/k;", "fragmentFactory", "<init>", "(Landroidx/fragment/app/m;Lorg/joda/time/DateTime;[Le32/o;Le32/k;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class j extends e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.fragment.app.m f62796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DateTime f62797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o[] f62798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k f62799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SparseArray<Fragment> f62800l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.fragment.app.m mVar, DateTime dateTime, o[] oVarArr, k kVar) {
        super(mVar.getSupportFragmentManager(), 1);
        mVar.getClass();
        oVarArr.getClass();
        kVar.getClass();
        this.f62796h = mVar;
        this.f62797i = dateTime;
        this.f62798j = oVarArr;
        this.f62799k = kVar;
        this.f62800l = new SparseArray<>();
    }

    public final void a() {
        o[] oVarArr = this.f62798j;
        b((o[]) Arrays.copyOf(oVarArr, oVarArr.length));
    }

    public final void b(o... oVarArr) {
        for (o oVar : oVarArr) {
            o[] oVarArr2 = this.f62798j;
            if (u.z(oVarArr2, oVar)) {
                oVar.getClass();
                int iM = u.M(oVarArr2, oVar);
                n0 n0Var = iM >= 0 ? (Fragment) this.f62800l.get(iM) : null;
                if (n0Var instanceof m) {
                    ((m) n0Var).f5();
                }
            }
        }
    }

    @Override // androidx.fragment.app.e0, fe.a
    public final void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
        viewGroup.getClass();
        obj.getClass();
        super.destroyItem(viewGroup, i14, obj);
        this.f62800l.remove(i14);
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF149591t() {
        return this.f62798j.length;
    }

    @Override // androidx.fragment.app.e0
    public final Fragment getItem(int i14) {
        return this.f62799k.a(this.f62798j[i14], this.f62797i);
    }

    @Override // fe.a
    public final CharSequence getPageTitle(int i14) {
        o oVar = this.f62798j[i14];
        String str = oVar.f62821c;
        int i15 = oVar.f62820b;
        androidx.fragment.app.m mVar = this.f62796h;
        return str != null ? mVar.getString(i15, str) : mVar.getString(i15);
    }

    @Override // androidx.fragment.app.e0, fe.a
    public final Object instantiateItem(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        Object objInstantiateItem = super.instantiateItem(viewGroup, i14);
        this.f62800l.put(i14, (Fragment) objInstantiateItem);
        return objInstantiateItem;
    }

    public /* synthetic */ j(androidx.fragment.app.m mVar, DateTime dateTime, o[] oVarArr, k kVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(mVar, dateTime, oVarArr, (i14 & 8) != 0 ? new k(null, 1, null) : kVar);
    }
}
