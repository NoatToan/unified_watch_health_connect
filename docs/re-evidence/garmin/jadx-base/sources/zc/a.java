package zc;

import com.google.firebase.analytics.FirebaseAnalytics;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class a extends w implements l<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l<Object, Object> f203898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d<Object> f203899b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l<Object, ? extends Object> lVar, d<Object> dVar) {
        super(1);
        this.f203898a = lVar;
        this.f203899b = dVar;
    }

    @Override // e23.l
    public final Object invoke(Integer num) {
        Object obj;
        int iIntValue = num.intValue();
        l<Object, Object> lVar = this.f203898a;
        if (lVar != null && (obj = this.f203899b.c().get(iIntValue)) != null) {
            return lVar.invoke(obj);
        }
        return new h(iIntValue);
    }
}
