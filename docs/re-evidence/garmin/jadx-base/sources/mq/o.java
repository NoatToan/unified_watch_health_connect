package mq;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lmq/o;", "", "Landroid/view/View;", "convertView", "", "columnSize", "Lmq/n;", "builder", "", "isFixedColumn", "<init>", "(Landroid/view/View;ILmq/n;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f120193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f120194b;

    public o(View view2, int i14, n nVar, boolean z14) {
        view2.getClass();
        nVar.getClass();
        View viewFindViewById = view2.findViewById(R.id.lap_data_container);
        viewFindViewById.getClass();
        this.f120193a = viewFindViewById;
        this.f120194b = new ArrayList();
        int i15 = 0;
        if (z14 && (nVar instanceof h)) {
            while (i15 < i14) {
                ArrayList arrayList = this.f120194b;
                List<l> list = ((h) nVar).f120180c;
                View viewFindViewById2 = view2.findViewById((i15 < 0 || i15 >= list.size()) ? -1 : list.get(i15).c());
                viewFindViewById2.getClass();
                arrayList.add(viewFindViewById2);
                i15++;
            }
            return;
        }
        if (z14) {
            return;
        }
        while (i15 < i14) {
            ArrayList arrayList2 = this.f120194b;
            List<l> list2 = nVar.f120191a;
            View viewFindViewById3 = view2.findViewById((i15 < 0 || i15 >= list2.size()) ? -1 : list2.get(i15).c());
            viewFindViewById3.getClass();
            arrayList2.add(viewFindViewById3);
            i15++;
        }
    }

    public /* synthetic */ o(View view2, int i14, n nVar, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(view2, i14, nVar, (i15 & 8) != 0 ? false : z14);
    }
}
