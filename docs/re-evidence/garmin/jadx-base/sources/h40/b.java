package h40;

import android.view.View;
import c60.e;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f81592a;

    public b(a aVar) {
        this.f81592a = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        view2.removeOnLayoutChangeListener(this);
        View viewFindViewById = view2.findViewById(R.id.bottom_sheet_header);
        View viewFindViewById2 = view2.findViewById(R.id.scroll_view_content);
        a.C1617a c1617a = a.f81589i;
        a aVar = this.f81592a;
        aVar.w6().setPeekHeight(viewFindViewById2.getMeasuredHeight() + viewFindViewById.getMeasuredHeight());
        e.b bVar = aVar.f81590h;
        if (bVar != null) {
            bVar.a(aVar.w6().getState(), aVar.w6().getPeekHeight());
        }
    }
}
