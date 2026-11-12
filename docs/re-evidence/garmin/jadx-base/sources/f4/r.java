package f4;

import android.os.Parcelable;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f68803b;

    public /* synthetic */ r(Collection collection, int i14) {
        this.f68802a = i14;
        this.f68803b = collection;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean zRetainAll;
        int i14 = this.f68802a;
        Collection<?> collection = this.f68803b;
        switch (i14) {
            case 0:
                Parcelable.Creator<s<Object>> creator = s.CREATOR;
                zRetainAll = ((List) obj).retainAll(collection);
                break;
            case 1:
                int i15 = j53.f.f97118g;
                zRetainAll = collection.contains(obj);
                break;
            case 2:
                int i16 = v3.b.f175356b;
                zRetainAll = collection.contains(obj);
                break;
            default:
                int i17 = v3.f.f175363i;
                zRetainAll = collection.contains(obj);
                break;
        }
        return Boolean.valueOf(zRetainAll);
    }
}
