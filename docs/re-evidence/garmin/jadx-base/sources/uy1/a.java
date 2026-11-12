package uy1;

import am.x0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.GCMComplexTwoLineEventButton;
import fg0.j;
import fg0.k;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u000e\u000fB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Luy1/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Luy1/a$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "primaryEventID", "", "Lfg0/k;", "mEvents", "", "isSupportingEvent", "<init>", "(Landroid/content/Context;JLjava/util/List;Z)V", "a", "b", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<C3242a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f173382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f173383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<k> f173384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f173385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f173386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f173387f;

    /* JADX INFO: renamed from: uy1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luy1/a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemVew", "<init>", "(Luy1/a;Landroid/view/View;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C3242a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMComplexTwoLineEventButton f173388a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3242a(a aVar, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.event_view);
            viewFindViewById.getClass();
            this.f173388a = (GCMComplexTwoLineEventButton) viewFindViewById;
        }
    }

    public interface b {
        void f(k kVar);
    }

    public a(Context context, long j8, List<k> list, boolean z14) {
        context.getClass();
        list.getClass();
        this.f173382a = context;
        this.f173383b = j8;
        this.f173384c = list;
        this.f173385d = z14;
        this.f173387f = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f173384c.size();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a3  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        Drawable drawable;
        String strH;
        Long l14;
        Boolean isTrainingEvent;
        x0 x0Var;
        C3242a c3242a = (C3242a) f0Var;
        c3242a.getClass();
        k kVar = this.f173384c.get(i14);
        GCMComplexTwoLineEventButton gCMComplexTwoLineEventButton = c3242a.f173388a;
        gg0.f eventType = kVar.getEventType();
        Context context = this.f173382a;
        if (eventType == null || (x0Var = eventType.f77149c) == null) {
            drawable = null;
        } else {
            int i15 = x0Var.f4361d;
            Resources resources = context.getResources();
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            drawable = resources.getDrawable(i15, null);
        }
        gCMComplexTwoLineEventButton.setLeftBottomIcon(drawable);
        gCMComplexTwoLineEventButton.setButtonTopLabel(kVar.r(false));
        Long l15 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
        long j8 = this.f173383b;
        if (l15 != null && l15.longValue() == j8) {
            gCMComplexTwoLineEventButton.i(context.getString(R.string.current_primary) + " • " + j0.a(new DateTime(String.valueOf(kVar.getDate())), 'L'));
        } else {
            gCMComplexTwoLineEventButton.i(j0.a(new DateTime(String.valueOf(kVar.getDate())), 'L'));
        }
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
        LocalDate date = kVar.getDate();
        if (date != null) {
            String string = date.toString("MMM");
            String string2 = date.toString("d");
            string.getClass();
            string2.getClass();
            v22.e.l(gCMComplexTwoLineEventButton.f45661b);
            v22.e.q(gCMComplexTwoLineEventButton.f45667h);
            boolean zIsEmpty = TextUtils.isEmpty(string);
            TextView textView = gCMComplexTwoLineEventButton.f45668i;
            if (zIsEmpty) {
                textView.setVisibility(8);
            } else {
                textView.setText(string);
                gCMComplexTwoLineEventButton.f45668i.setVisibility(0);
                gCMComplexTwoLineEventButton.f45668i.setContentDescription(null);
            }
            boolean zIsEmpty2 = TextUtils.isEmpty(string2);
            TextView textView2 = gCMComplexTwoLineEventButton.f45669j;
            if (zIsEmpty2) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(string2);
                textView2.setVisibility(0);
                textView2.setContentDescription(null);
            }
        }
        int i16 = this.f173387f;
        if (this.f173385d) {
            if (i16 == i14) {
                if (kVar.getEventCustomization() == null) {
                    kVar.E0(new j(null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, 8159, null));
                }
                j eventCustomization = kVar.getEventCustomization();
                if (eventCustomization != null) {
                    j eventCustomization2 = kVar.getEventCustomization();
                    eventCustomization.H((eventCustomization2 == null || (isTrainingEvent = eventCustomization2.getIsTrainingEvent()) == null) ? Boolean.FALSE : Boolean.valueOf(!isTrainingEvent.booleanValue()));
                }
            }
            j eventCustomization3 = kVar.getEventCustomization();
            if (eventCustomization3 != null ? s.g(eventCustomization3.getIsTrainingEvent(), Boolean.TRUE) : false) {
                gCMComplexTwoLineEventButton.k(true);
            } else {
                gCMComplexTwoLineEventButton.k(false);
            }
        } else if (i16 == i14 || (i16 == -1 && (l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) != null && l14.longValue() == j8)) {
            gCMComplexTwoLineEventButton.k(true);
        } else {
            gCMComplexTwoLineEventButton.k(false);
        }
        c3242a.itemView.setOnClickListener(new u12.e(10, this, c3242a));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new C3242a(this, n23.j.b(viewGroup, R.layout.event_dashboard_priority_item, viewGroup, false));
    }

    public /* synthetic */ a(Context context, long j8, List list, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, j8, list, (i14 & 8) != 0 ? false : z14);
    }
}
