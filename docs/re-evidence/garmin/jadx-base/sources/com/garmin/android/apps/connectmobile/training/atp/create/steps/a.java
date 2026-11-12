package com.garmin.android.apps.connectmobile.training.atp.create.steps;

import a61.d0;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0007\b\tB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/a;", "T", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "c", "b", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a<T> extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f45240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<? extends T> f45241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.training.atp.create.steps.b f45242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.training.atp.create.steps.b f45243f;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.atp.create.steps.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/a$a;", "T", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/a$c;", "formatter", "<init>", "(Landroid/view/View;Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/a$c;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0870a<T> extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c<T> f45244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f45245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f45246c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0870a(View view2, c<? super T> cVar) {
            super(view2);
            view2.getClass();
            this.f45244a = cVar;
            View viewFindViewById = view2.findViewById(R.id.training_option_label);
            viewFindViewById.getClass();
            this.f45245b = (TextView) viewFindViewById;
            this.f45246c = view2.findViewById(R.id.training_option_container);
        }
    }

    public interface b<T> {
        void C(T t7);
    }

    public interface c<T> {
        String b3(T t7);
    }

    public a(Activity activity) {
        activity.getClass();
        this.f45240c = activity;
        this.f45241d = j0.f134944a;
    }

    public final void A(View view2, String str) {
        t(view2);
        if (str != null) {
            TextView textView = view2 != null ? (TextView) view2.findViewById(R.id.training_step_header_info) : null;
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final int u() {
        return this.f45241d.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        f0Var.getClass();
        C0870a c0870a = (C0870a) f0Var;
        T t7 = this.f45241d.get(i14);
        TextView textView = c0870a.f45245b;
        c<T> cVar = c0870a.f45244a;
        textView.setText(cVar != null ? cVar.b3(t7) : null);
        View view2 = c0870a.f45246c;
        if (view2 != null) {
            view2.setOnClickListener(new d0(9, this, t7));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.garmin.android.apps.connectmobile.training.atp.create.steps.a$c, com.garmin.android.apps.connectmobile.training.atp.create.steps.b] */
    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        View viewInflate = LayoutInflater.from(this.f45240c).inflate(R.layout.gcm4_create_training_option_item, viewGroup, false);
        viewInflate.getClass();
        return new C0870a(viewInflate, this.f45243f);
    }
}
