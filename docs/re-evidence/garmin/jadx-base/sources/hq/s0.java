package hq;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lhq/s0;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "Lkotlin/Function1;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "", "itemOnClick", "<init>", "(Landroid/view/View;Le23/l;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s0 extends RecyclerView.f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f85145d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<com.garmin.android.apps.connectmobile.repcounting.model.d, Unit> f85146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f85147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GCMCheckableRow f85148c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s0(View view2, e23.l<? super com.garmin.android.apps.connectmobile.repcounting.model.d, Unit> lVar) {
        super(view2);
        view2.getClass();
        lVar.getClass();
        this.f85146a = lVar;
        View viewFindViewById = view2.findViewById(R.id.activity_title);
        viewFindViewById.getClass();
        this.f85147b = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.gcm_checkable_row);
        viewFindViewById2.getClass();
        this.f85148c = (GCMCheckableRow) viewFindViewById2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhq/s0$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
