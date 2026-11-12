package p002j6;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import e23.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class o extends w implements a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p<View> f97247a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p<View> pVar) {
        super(0);
        this.f97247a = pVar;
    }

    @Override // e23.a
    public final Object invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f97247a.D.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
