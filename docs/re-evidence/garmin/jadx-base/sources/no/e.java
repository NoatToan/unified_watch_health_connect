package no;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import fg0.k;
import java.util.List;
import lq.g;
import n23.j;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lno/e;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lno/e$a;", "Landroid/content/Context;", "mContext", "", "Lfg0/k;", "events", "selectedEvent", "<init>", "(Landroid/content/Context;Ljava/util/List;Lfg0/k;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f126716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<k> f126717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f126718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.manual.eventType.a f126719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f126720e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lno/e$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemVew", "<init>", "(Lno/e;Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMComplexTwoLineButton f126721a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = this.itemView.findViewById(R.id.event);
            ((GCMComplexTwoLineButton) viewFindViewById).d(false);
            viewFindViewById.getClass();
            this.f126721a = (GCMComplexTwoLineButton) viewFindViewById;
        }
    }

    public e(Context context, List<k> list, k kVar) {
        context.getClass();
        list.getClass();
        this.f126716a = context;
        this.f126717b = list;
        this.f126718c = kVar;
        this.f126720e = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f126717b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = aVar.f126721a;
        k kVar = this.f126717b.get(i14);
        k kVar2 = this.f126718c;
        if (kVar2 != null && s.g(kVar, kVar2)) {
            this.f126720e = aVar.getAbsoluteAdapterPosition();
        }
        Parcelable.Creator<k> creator = k.CREATOR;
        gCMComplexTwoLineButton.setButtonTopLabel(kVar.r(false));
        fg0.d completionTarget = kVar.getCompletionTarget();
        LocalDate date = kVar.getDate();
        String string = date != null ? date.toString("MMM dd") : null;
        Context context = this.f126716a;
        if (completionTarget == null || string == null) {
            LocalDate date2 = kVar.getDate();
            gCMComplexTwoLineButton.setButtonBottomLeftLabel(String.valueOf(date2 != null ? date2.toString("MMM dd") : null));
        } else {
            og0.a.f131967a.getClass();
            String strM = og0.a.m(context, completionTarget, string);
            if (strM != null) {
                gCMComplexTwoLineButton.setButtonBottomLeftLabel(strM);
            }
        }
        gCMComplexTwoLineButton.setRightIcon(context.getDrawable(2131232298));
        gCMComplexTwoLineButton.d(this.f126720e == i14);
        gCMComplexTwoLineButton.setOnClickListener(new g(22, this, aVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, j.b(viewGroup, R.layout.item_event_list, viewGroup, false));
    }
}
