package uy1;

import am.x0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.GCMComplexTwoLineEventButton;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.fragments.EventListFragment;
import fg0.a0;
import fg0.k;
import java.util.List;
import n23.j;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\fB%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Luy1/e;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Luy1/e$a;", "Landroid/content/Context;", "mContext", "", "Lfg0/k;", "events", "", "isPastEventsView", "<init>", "(Landroid/content/Context;Ljava/util/List;Z)V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f173407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<k> f173408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f173409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EventListFragment f173410d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luy1/e$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemVew", "<init>", "(Luy1/e;Landroid/view/View;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMComplexTwoLineEventButton f173411a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.event_view);
            viewFindViewById.getClass();
            this.f173411a = (GCMComplexTwoLineEventButton) viewFindViewById;
        }
    }

    public e(Context context, List<k> list, boolean z14) {
        context.getClass();
        list.getClass();
        this.f173407a = context;
        this.f173408b = list;
        this.f173409c = z14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f173408b.size();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00bf  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a0 a0Var;
        String strH;
        x0 x0Var;
        a aVar = (a) f0Var;
        aVar.getClass();
        GCMComplexTwoLineEventButton gCMComplexTwoLineEventButton = aVar.f173411a;
        k kVar = this.f173408b.get(i14);
        boolean z14 = this.f173409c;
        Context context = this.f173407a;
        Drawable drawable = null;
        if (z14) {
            gCMComplexTwoLineEventButton.f45661b.setVisibility(8);
        } else {
            List<a0> listS = kVar.s();
            String url = (listS == null || (a0Var = (a0) h0.d0(listS)) == null) ? null : a0Var.getUrl();
            zp0.c cVar = new zp0.c(context);
            cVar.f206565e = url;
            cVar.f206570j = R.drawable.gcm3_calendar_list_icon_events;
            cVar.a("circle_mask");
            cVar.h(gCMComplexTwoLineEventButton.getLeftIconView());
            Resources resources = context.getResources();
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            gCMComplexTwoLineEventButton.setLeftIconBackground(resources.getDrawable(R.drawable.round_image_border_white, null));
            gCMComplexTwoLineEventButton.getLeftIconView().setPadding(4, 4, 4, 4);
        }
        gg0.f eventType = kVar.getEventType();
        if (eventType != null && (x0Var = eventType.f77149c) != null) {
            int i15 = x0Var.f4361d;
            Resources resources2 = context.getResources();
            ThreadLocal<TypedValue> threadLocal2 = b7.g.f16255a;
            drawable = resources2.getDrawable(i15, null);
        }
        gCMComplexTwoLineEventButton.setLeftBottomIcon(drawable);
        gCMComplexTwoLineEventButton.setButtonTopLabel(kVar.r(false));
        LocalDateTime localDateTime = DateTimeFormat.forPattern("yyyy-MM-dd").parseLocalDateTime(String.valueOf(kVar.getDate()));
        localDateTime.getClass();
        gCMComplexTwoLineEventButton.i(j0.a(new DateTime(g22.k.r(localDateTime)), 'L'));
        fg0.d completionTarget = kVar.getCompletionTarget();
        if (completionTarget != null) {
            lz1.f.f115404a.getClass();
            strH = lz1.f.a.h(context, completionTarget);
            if (strH == null) {
                strH = "";
            }
        } else {
            strH = "";
        }
        gCMComplexTwoLineEventButton.j(strH);
        gCMComplexTwoLineEventButton.setOnClickListener(new u12.e(11, this, kVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, j.b(viewGroup, R.layout.gcm_event_item_view, viewGroup, false));
    }
}
