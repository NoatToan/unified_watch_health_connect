package z12;

import am.x0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.GCMComplexTwoLineEventButton;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lz12/s0;", "Lb32/a;", "Lb32/e;", "<init>", "()V", "b", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s0 extends b32.a implements b32.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.userprofile.i f201485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f201486c = new ArrayList();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/s0$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f201487a;

        public b(ViewGroup viewGroup) {
            super(e5.e(viewGroup, R.layout.user_profile_stats_section_header_with_privacy, viewGroup, false));
            View viewFindViewById = this.itemView.findViewById(R.id.card_header_privacy);
            viewFindViewById.getClass();
            this.f201487a = (TextView) viewFindViewById;
            View viewFindViewById2 = this.itemView.findViewById(R.id.section_header);
            viewFindViewById2.getClass();
            ((TextView) viewFindViewById2).setText(R.string.lbl_upcoming_events);
        }
    }

    static {
        new a(null);
    }

    @Override // b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return i14 == 0 ? new b(viewGroup) : new r0(n23.j.b(viewGroup, R.layout.gcm_event_item_view, viewGroup, false));
    }

    @Override // b32.d
    public final int b() {
        return 2;
    }

    @Override // b32.d
    public final b32.e c(b32.c cVar, int i14) {
        cVar.getClass();
        if (cVar instanceof g12.e) {
            this.f201485b = ((g12.e) cVar).f74887b;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    @Override // b32.e
    public final void d(RecyclerView.f0 f0Var, int i14) {
        String strM;
        x0 x0Var;
        f0Var.getClass();
        boolean z14 = false;
        Drawable drawable = null;
        if (i14 == 0) {
            b bVar = (b) f0Var;
            com.garmin.android.apps.connectmobile.userprofile.i iVar = this.f201485b;
            if (iVar == null) {
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            }
            if (!iVar.y4()) {
                com.garmin.android.apps.connectmobile.userprofile.i iVar2 = this.f201485b;
                if (iVar2 == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                if (!iVar2.E) {
                    z14 = true;
                }
            }
            v22.e.v(bVar.f201487a, z14);
            return;
        }
        r0 r0Var = (r0) f0Var;
        fg0.k kVar = (fg0.k) this.f201486c.get(i14 - 1);
        Context context = r0Var.f201481a;
        kVar.getClass();
        GCMComplexTwoLineEventButton gCMComplexTwoLineEventButton = r0Var.f201483c;
        gCMComplexTwoLineEventButton.f45661b.setVisibility(8);
        gg0.f eventType = kVar.getEventType();
        if (eventType != null && (x0Var = eventType.f77149c) != null) {
            int i15 = x0Var.f4361d;
            Resources resources = context.getResources();
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            drawable = resources.getDrawable(i15, null);
        }
        gCMComplexTwoLineEventButton.setLeftBottomIcon(drawable);
        gCMComplexTwoLineEventButton.setButtonTopLabel(kVar.r(false));
        gCMComplexTwoLineEventButton.i(c22.j0.a(new DateTime(String.valueOf(kVar.getDate())), 'L'));
        fg0.d completionTarget = kVar.getCompletionTarget();
        if (completionTarget != null) {
            m12.r rVar = r0Var.f201482b;
            context.getClass();
            strM = rVar.m(context, completionTarget);
            if (strM == null) {
                strM = "";
            }
        } else {
            strM = "";
        }
        gCMComplexTwoLineEventButton.j(strM);
        gCMComplexTwoLineEventButton.setOnClickListener(new wv2.h(18, r0Var, kVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b32.a, b32.d
    public final void e(b32.c cVar) {
        List list;
        cVar.getClass();
        ArrayList arrayList = this.f201486c;
        arrayList.clear();
        com.garmin.android.apps.connectmobile.userprofile.i iVar = this.f201485b;
        if (iVar == null) {
            p005kotlin.jvm.internal.s.m("viewModel");
            throw null;
        }
        g3 g3Var = (g3) iVar.f46761m.d();
        if (g3Var == null || (list = (List) g3Var.f35301b) == null) {
            return;
        }
        arrayList.addAll(p13.h0.Z(list));
    }

    @Override // b32.d
    public final int getItemCount() {
        int size = this.f201486c.size();
        if (size > 0) {
            return size + 1;
        }
        return 0;
    }

    @Override // b32.d
    public final int getItemViewType(int i14) {
        return i14 == 0 ? 0 : 1;
    }

    @Override // b32.a, b32.d
    /* JADX INFO: renamed from: isVisible */
    public final boolean getF120672c() {
        return !this.f201486c.isEmpty();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lz12/s0$a;", "", "<init>", "()V", "", "ITEM_HEADER", "I", "ITEM_EVENT", "ITEM_TYPE_COUNT", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
