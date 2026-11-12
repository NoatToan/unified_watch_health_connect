package r22;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes10.dex */
public abstract class w0 extends androidx.fragment.app.e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f149911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f149912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f149913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SparseArray<Object> f149914k;

    public w0(androidx.fragment.app.v vVar) {
        super(vVar);
        this.f149911h = 0;
        this.f149912i = 50000;
        this.f149913j = 0;
        this.f149914k = new SparseArray<>();
    }

    @Override // androidx.fragment.app.e0, fe.a
    public void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
        super.destroyItem(viewGroup, i14, obj);
        this.f149914k.remove(i14);
    }

    @Override // fe.a
    public int getCount() {
        return 100000;
    }

    @Override // fe.a
    public final int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.fragment.app.e0, fe.a
    public Object instantiateItem(ViewGroup viewGroup, int i14) {
        Object objInstantiateItem = super.instantiateItem(viewGroup, i14);
        this.f149914k.put(i14, objInstantiateItem);
        return objInstantiateItem;
    }

    @Override // androidx.fragment.app.e0, fe.a
    public final Parcelable saveState() {
        Bundle bundle = (Bundle) super.saveState();
        if (bundle != null) {
            bundle.remove("states");
        }
        return bundle;
    }

    public w0(androidx.fragment.app.v vVar, int i14) {
        super(vVar, i14);
        this.f149911h = 0;
        this.f149912i = 50000;
        this.f149913j = 0;
        this.f149914k = new SparseArray<>();
    }
}
