package i4;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", TtmlNode.LEFT, "", "top", TtmlNode.RIGHT, "bottom", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class d extends p005kotlin.jvm.internal.w implements e23.r<Integer, Integer, Integer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f90836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.s f90837b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, p5.s sVar) {
        super(4);
        this.f90836a = bVar;
        this.f90837b = sVar;
    }

    @Override // e23.r
    public final Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        int iIntValue4 = num4.intValue();
        b bVar = this.f90836a;
        bVar.f90829f.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        bVar.f90824a.c(bVar.f90826c, this.f90837b.getF81761b(), bVar.f90829f);
        return Unit.INSTANCE;
    }
}
