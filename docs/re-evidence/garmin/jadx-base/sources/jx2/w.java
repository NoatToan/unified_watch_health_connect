package jx2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class w extends p005kotlin.jvm.internal.w implements e23.p<Integer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f101661a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e23.a<Unit> aVar) {
        super(2);
        this.f101661a = aVar;
    }

    @Override // e23.p
    public final Unit invoke(Integer num, Integer num2) {
        num.intValue();
        num2.intValue();
        this.f101661a.invoke();
        return Unit.INSTANCE;
    }
}
