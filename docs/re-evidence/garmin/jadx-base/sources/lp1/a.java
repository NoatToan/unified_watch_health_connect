package lp1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Llp1/a;", "", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Lip1/a;", "", "navigateToActivity", "<init>", "(Landroid/view/View;Le23/l;)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f114128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f114129b;

    public a(View view2, e23.l<? super ip1.a, Unit> lVar) {
        view2.getClass();
        lVar.getClass();
        this.f114128a = (TextView) view2.findViewById(R.id.activities_title);
        Context context = view2.getContext();
        context.getClass();
        b bVar = new b(context, lVar);
        this.f114129b = bVar;
        new e32.g(null, view2, null, 5, null).a(bVar);
    }

    public final void a(ArrayList arrayList) {
        b bVar = this.f114129b;
        TextView textView = this.f114128a;
        if (arrayList == null || !(!arrayList.isEmpty())) {
            textView.getClass();
            textView.setVisibility(8);
            bVar.f114131d.clear();
            bVar.notifyDataSetChanged();
            return;
        }
        textView.getClass();
        textView.setVisibility(0);
        ArrayList arrayList2 = bVar.f114131d;
        arrayList2.clear();
        if (!arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
        }
        bVar.notifyDataSetChanged();
    }
}
