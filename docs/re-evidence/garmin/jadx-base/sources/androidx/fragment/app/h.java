package androidx.fragment.app;

import android.view.View;
import androidx.core.view.g1;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "entry", "", "", "kotlin.jvm.PlatformType", "Landroid/view/View;", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class h extends p005kotlin.jvm.internal.w implements e23.l<Map.Entry<String, View>, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collection<String> f7261a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Collection<String> collection) {
        super(1);
        this.f7261a = collection;
    }

    @Override // e23.l
    public final Boolean invoke(Map.Entry<String, View> entry) {
        Map.Entry<String, View> entry2 = entry;
        entry2.getClass();
        Collection<String> collection = this.f7261a;
        View value = entry2.getValue();
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        return Boolean.valueOf(p13.h0.R(collection, value.getTransitionName()));
    }
}
