package p40;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f135702a;

    public m(l lVar) {
        this.f135702a = lVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        view2.removeOnLayoutChangeListener(this);
        View viewFindViewById = view2.findViewById(R.id.bottom_sheet_header);
        l.a aVar = l.f135693p;
        l lVar = this.f135702a;
        lVar.w6().setPeekHeight(viewFindViewById.getMeasuredHeight());
        lVar.w6().setState(4);
        e23.l<? super Integer, Unit> lVar2 = lVar.f135700n;
        if (lVar2 != null) {
            lVar2.invoke(Integer.valueOf(lVar.w6().getPeekHeight()));
        }
    }
}
