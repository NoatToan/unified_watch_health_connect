package zh2;

import androidx.fragment.app.Fragment;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "_fragment", "Landroidx/fragment/app/Fragment;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class d extends w implements l<Fragment, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l<Fragment, Unit> f204806a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(l<? super Fragment, Unit> lVar) {
        super(1);
        this.f204806a = lVar;
    }

    @Override // e23.l
    public final Unit invoke(Fragment fragment) {
        Unit unit;
        Fragment fragment2 = fragment;
        l<Fragment, Unit> lVar = this.f204806a;
        if (fragment2 != null) {
            lVar.invoke(fragment2);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            lVar.invoke(null);
        }
        return Unit.INSTANCE;
    }
}
