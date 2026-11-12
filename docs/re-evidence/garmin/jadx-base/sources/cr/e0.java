package cr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import lo.f0;
import lo.j3;
import nr.z0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcr/e0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j3 f55266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f55267b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55268c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j23.l f55269d = new j23.l(0, 20);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j23.l f55270e = new j23.l(40, 53);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j23.l f55271f = new j23.l(0, 60);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j23.l f55272g = new j23.l(60, 72);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcr/e0$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "itemView", "<init>", "(Lcr/e0;Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LottieAnimationView f55273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LottieAnimationView f55274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f55275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e0 f55276d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var, View view2) {
            super(view2);
            view2.getClass();
            this.f55276d = e0Var;
            View viewFindViewById = view2.findViewById(R.id.option_icon);
            viewFindViewById.getClass();
            this.f55273a = (LottieAnimationView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.option_icon_check);
            viewFindViewById2.getClass();
            this.f55274b = (LottieAnimationView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.option_label);
            viewFindViewById3.getClass();
            this.f55275c = (TextView) viewFindViewById3;
            view2.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            e0 e0Var = this.f55276d;
            ArrayList arrayList = e0Var.f55267b;
            if (bindingAdapterPosition == -1) {
                return;
            }
            int i14 = e0Var.f55268c;
            if (bindingAdapterPosition == i14) {
                e0Var.r(bindingAdapterPosition);
                e0Var.f55268c = -1;
                j3 j3Var = e0Var.f55266a;
                if (j3Var != null) {
                    f0 f0Var = j3Var.f113886a;
                    f0Var.A1 = -2;
                    f0.d dVar = f0Var.C1;
                    if (dVar != null) {
                        ((lo.t) dVar).w6();
                        return;
                    }
                    return;
                }
                return;
            }
            e0Var.r(i14);
            e0Var.r(bindingAdapterPosition);
            e0Var.f55268c = bindingAdapterPosition;
            j3 j3Var2 = e0Var.f55266a;
            if (j3Var2 != null) {
                z0 z0Var = (z0) arrayList.get(bindingAdapterPosition);
                f0 f0Var2 = j3Var2.f113886a;
                f0Var2.A1 = z0Var.f127602a;
                f0.d dVar2 = f0Var2.C1;
                if (dVar2 != null) {
                    ((lo.t) dVar2).w6();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f55267b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        int i15;
        int i16;
        f0Var.getClass();
        if (i14 != -1 && (f0Var instanceof a)) {
            a aVar = (a) f0Var;
            e0 e0Var = aVar.f55276d;
            ArrayList arrayList = e0Var.f55267b;
            j23.l lVar = e0Var.f55270e;
            j23.l lVar2 = e0Var.f55272g;
            j23.l lVar3 = e0Var.f55269d;
            j23.l lVar4 = e0Var.f55271f;
            z0 z0Var = (z0) arrayList.get(i14);
            LottieAnimationView lottieAnimationView = aVar.f55273a;
            lottieAnimationView.setAnimation(z0Var.f127604c);
            boolean z14 = z0Var.f127605d;
            LottieAnimationView lottieAnimationView2 = aVar.f55274b;
            if (z14) {
                i15 = lVar4.f96797b;
                i16 = lVar3.f96797b;
            } else {
                i15 = lVar2.f96797b;
                i16 = lVar.f96797b;
            }
            lottieAnimationView.cancelAnimation();
            lottieAnimationView.setMinAndMaxFrame(0, i15);
            lottieAnimationView.setFrame(0);
            lottieAnimationView.setFrame(i15);
            lottieAnimationView2.cancelAnimation();
            lottieAnimationView2.setMinAndMaxFrame(0, i16);
            lottieAnimationView2.setFrame(0);
            lottieAnimationView2.setFrame(i16);
            Context context = aVar.itemView.getContext();
            context.getClass();
            o72.t.m(lottieAnimationView2, context, "check", R.color.gcm_lottie_option_item_checkmark);
            Context context2 = aVar.itemView.getContext();
            context2.getClass();
            o72.t.m(lottieAnimationView2, context2, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, R.color.gcm_lottie_option_item_background);
            if (z0Var.f127606e) {
                if (z14) {
                    lVar = lVar3;
                    lVar2 = lVar4;
                }
                lottieAnimationView.setMinAndMaxFrame(lVar2.f96796a, lVar2.f96797b);
                lottieAnimationView.playAnimation();
                lottieAnimationView2.setMinAndMaxFrame(lVar.f96796a, lVar.f96797b);
                lottieAnimationView2.playAnimation();
                e0Var.f55267b.set(i14, z0.b(z0Var, false, false, 15));
            }
            aVar.f55275c.setText(z0Var.f127603b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, n23.j.b(viewGroup, R.layout.workout_feel_option_item, viewGroup, false));
    }

    public final void r(int i14) {
        if (i14 == -1) {
            return;
        }
        ArrayList arrayList = this.f55267b;
        z0 z0Var = (z0) arrayList.get(i14);
        arrayList.set(i14, z0.b(z0Var, !z0Var.f127605d, true, 7));
        notifyItemChanged(i14);
    }
}
