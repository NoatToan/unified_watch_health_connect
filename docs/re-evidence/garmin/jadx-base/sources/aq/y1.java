package aq;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Laq/y1;", "Laq/d2;", "Li/c;", "activity", "Ljava/util/ArrayList;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "exerciseList", "Lcom/garmin/android/apps/connectmobile/repcounting/model/e;", "exerciseDetail", "Lmt0/k0;", "addExerciseListener", "<init>", "(Li/c;Ljava/util/ArrayList;Ljava/util/ArrayList;Lmt0/k0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y1 extends d2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(i.c cVar, ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.d> arrayList, ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> arrayList2, mt0.k0 k0Var) {
        super(cVar, arrayList, arrayList2, k0Var, null);
        cVar.getClass();
        arrayList.getClass();
        arrayList2.getClass();
        k0Var.getClass();
    }

    @Override // aq.d2, android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        viewGroup.getClass();
        View view3 = super.getView(i14, view2, viewGroup);
        view3.getClass();
        ImageView imageView = this.f11909f.f11910a;
        imageView.getClass();
        imageView.setVisibility(8);
        this.f11909f.f11910a.setOnClickListener(null);
        return view3;
    }
}
