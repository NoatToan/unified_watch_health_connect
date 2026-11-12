package ia1;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.fragment.app.v;
import cp.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.y0;
import ps.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lia1/a;", "Landroidx/fragment/app/e0;", "Ljava/util/ArrayList;", "Lps/j;", "Lkotlin/collections/ArrayList;", "imageList", "Landroidx/fragment/app/v;", "fragmentManager", "<init>", "(Ljava/util/ArrayList;Landroidx/fragment/app/v;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<j> f92438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v f92439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap<String, WeakReference<b>> f92440j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ArrayList<j> arrayList, v vVar) {
        super(vVar, 1);
        arrayList.getClass();
        vVar.getClass();
        this.f92438h = arrayList;
        this.f92439i = vVar;
        this.f92440j = new HashMap<>();
    }

    public final j a(int i14) {
        ArrayList<j> arrayList = this.f92438h;
        if (arrayList.isEmpty() || i14 < 0 || i14 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i14);
    }

    public final void b(int i14) {
        j jVarA = a(i14);
        if (jVarA != null) {
            String imageId = jVarA.getImageId();
            HashMap<String, WeakReference<b>> map = this.f92440j;
            WeakReference<b> weakReference = map.get(imageId);
            b bVar = weakReference != null ? weakReference.get() : null;
            if (bVar != null) {
                y0.c(map).remove(imageId);
                v vVar = this.f92439i;
                vVar.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(vVar);
                aVar.k(bVar);
                aVar.e();
            }
            this.f92438h.remove(i14);
            notifyDataSetChanged();
        }
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF44034e() {
        return this.f92438h.size();
    }

    @Override // androidx.fragment.app.e0
    public final Fragment getItem(int i14) {
        j jVarA = a(i14);
        if (jVarA == null || jVarA.getUrl() == null) {
            return new Fragment();
        }
        String url = jVarA.getUrl();
        url.getClass();
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putString("imageUrl", url);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // fe.a
    public final int getItemPosition(Object obj) {
        obj.getClass();
        return -2;
    }

    @Override // androidx.fragment.app.e0, fe.a
    public final Object instantiateItem(ViewGroup viewGroup, int i14) {
        String imageId;
        viewGroup.getClass();
        b bVar = (b) super.instantiateItem(viewGroup, i14);
        j jVarA = a(i14);
        if (jVarA != null && (imageId = jVarA.getImageId()) != null) {
            this.f92440j.put(imageId, new WeakReference<>(bVar));
        }
        return bVar;
    }
}
