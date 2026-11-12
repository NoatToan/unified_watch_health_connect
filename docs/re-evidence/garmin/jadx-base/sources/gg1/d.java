package gg1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.f1;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lgg1/d;", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/app/Activity;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lgg1/e;", "list", "Lgg1/f;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/app/Activity;Ljava/util/List;Lgg1/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f77204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<e> f77205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f77206e;

    /* JADX WARN: Multi-variable type inference failed */
    public d(Activity activity, List<? extends e> list, f fVar) {
        activity.getClass();
        list.getClass();
        fVar.getClass();
        this.f77204c = fVar;
        this.f77205d = list;
        this.f77206e = LayoutInflater.from(activity);
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final int u() {
        return this.f77205d.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        if (f0Var instanceof g) {
            e eVar = this.f77205d.get(i14);
            g gVar = (g) f0Var;
            eVar.getClass();
            TextView textView = gVar.f77233a;
            textView.setText(eVar.f77226a);
            Integer num = eVar.f77228c;
            if (num != null) {
                textView.setContentDescription(textView.getContext().getString(num.intValue()));
            }
            View view2 = gVar.itemView;
            if (view2 != null) {
                view2.setOnClickListener(new cw2.b(18, this, eVar));
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.f77206e;
        layoutInflater.getClass();
        return new g(layoutInflater, viewGroup);
    }
}
