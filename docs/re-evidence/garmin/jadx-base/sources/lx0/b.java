package lx0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.s0;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Llx0/b;", "Lcom/garmin/android/apps/connectmobile/f1;", "", "Lww0/i;", FirebaseAnalytics.Param.ITEMS, "Llx0/k;", "viewModel", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "([Lww0/i;Llx0/k;Landroid/content/Context;)V", "a", "b", "c", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ww0.i[] f115142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f115143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f115144e;

    /* JADX INFO: renamed from: lx0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llx0/b$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Llx0/b;Landroid/view/View;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C2191b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f115145e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f115146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f115147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f115148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f115149d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2191b(b bVar, View view2) {
            super(view2);
            view2.getClass();
            this.f115149d = bVar;
            View viewFindViewById = view2.findViewById(R.id.checkmark_cell_row);
            viewFindViewById.getClass();
            this.f115146a = viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.checkmark_cell_text);
            viewFindViewById2.getClass();
            this.f115147b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.checkmark_cell_check_icon);
            viewFindViewById3.getClass();
            this.f115148c = (ImageView) viewFindViewById3;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llx0/b$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Llx0/b;Landroid/view/View;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends RecyclerView.f0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, View view2) {
            super(view2);
            view2.getClass();
        }
    }

    static {
        new a(null);
    }

    public b(ww0.i[] iVarArr, k kVar, Context context) {
        iVarArr.getClass();
        kVar.getClass();
        context.getClass();
        setHasStableIds(true);
        this.f115142c = iVarArr;
        this.f115143d = kVar;
        this.f115144e = context;
    }

    @Override // com.garmin.android.apps.connectmobile.f1, androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return i14 == this.f115142c.length ? 1001 : 1000;
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final int u() {
        return this.f115142c.length + 1;
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        f0Var.getClass();
        if (f0Var instanceof C2191b) {
            ww0.i[] iVarArr = this.f115142c;
            ww0.i iVar = iVarArr[i14];
            ConstraintLayout constraintLayout = (ConstraintLayout) f0Var.itemView.findViewById(R.id.checkmark_cell_row);
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            layoutParams.getClass();
            RecyclerView.q qVar = (RecyclerView.q) layoutParams;
            ((ViewGroup.MarginLayoutParams) qVar).bottomMargin = i14 == iVarArr.length + (-2) ? MathKt.c(this.f115144e.getResources().getDimension(R.dimen.spacing_normal)) : 0;
            f0Var.itemView.findViewById(R.id.checkmark_cell_top_divider).setVisibility(i14 == iVarArr.length + (-1) ? 0 : 8);
            constraintLayout.setLayoutParams(qVar);
            C2191b c2191b = (C2191b) f0Var;
            b bVar = c2191b.f115149d;
            View view2 = c2191b.f115146a;
            if (iVar == null) {
                return;
            }
            s0.r(view2, new lx0.c(c2191b));
            TextView textView = c2191b.f115147b;
            Context context = c2191b.itemView.getContext();
            context.getClass();
            textView.setText(iVar.a(context));
            c2191b.f115148c.setVisibility(iVar != bVar.f115143d.f115194j ? 8 : 0);
            view2.setOnClickListener(new lq.g(2, bVar, iVar));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i14 == 1000) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.checkmark_cell, viewGroup, false);
            viewInflate.getClass();
            return new C2191b(this, viewInflate);
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.mct_setup_contraception_none_description, viewGroup, false);
        viewInflate2.getClass();
        return new c(this, viewInflate2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Llx0/b$a;", "", "<init>", "()V", "", "TYPE_ROW_ITEM", "I", "TYPE_NONE_DESCRIPTION", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
