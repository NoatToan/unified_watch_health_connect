package s52;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ls52/m;", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f157451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.c f157452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f157453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LayoutInflater f157454f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls52/m$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Ls52/m;Landroid/view/View;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k32.i f157455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f157456b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, View view2) {
            super(view2);
            view2.getClass();
            this.f157456b = mVar;
            this.f157455a = new k32.i(view2);
        }
    }

    public m(Context context) {
        context.getClass();
        this.f157451c = true;
        this.f157453e = new ArrayList();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.getClass();
        this.f157454f = layoutInflaterFrom;
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final int u() {
        return this.f157453e.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        String exerciseKey;
        com.garmin.android.apps.connectmobile.workouts.data.model.l lVar = (com.garmin.android.apps.connectmobile.workouts.data.model.l) h0.e0(i14, this.f157453e);
        if (lVar == null || !(f0Var instanceof a)) {
            return;
        }
        a aVar = (a) f0Var;
        m mVar = aVar.f157456b;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = mVar.f157452d;
        com.garmin.android.apps.connectmobile.repcounting.model.d dVarD = cVar != null ? cVar.D(lVar.getCategoryKey(), lVar.getExerciseKey()) : null;
        k32.i iVar = aVar.f157455a;
        if (dVarD == null || (exerciseKey = dVarD.f41107f) == null) {
            exerciseKey = lVar.getExerciseKey();
        }
        int i15 = mVar.f157451c ? R.style.Text_Body1_Primary : R.style.Text_Body1_Secondary;
        TextView textView = iVar.f102695b;
        textView.setText(exerciseKey);
        textView.setTextAppearance(i15);
        textView.setBackgroundResource(R.drawable.list_item_surface_2);
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        View viewInflate = this.f157454f.inflate(R.layout.gcm_label_list_item, viewGroup, false);
        viewInflate.getClass();
        return new a(this, viewInflate);
    }
}
