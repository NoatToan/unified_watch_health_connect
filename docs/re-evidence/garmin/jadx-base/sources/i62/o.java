package i62;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.ViewMultisportWorkoutActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Li62/o;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "c", "a", "b", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f91868a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.workouts.presentation.msn.b f91869b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li62/o$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f91870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f91871b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
            this.f91870a = (ImageView) view2.findViewById(R.id.error_image);
            this.f91871b = (TextView) view2.findViewById(R.id.error_msg);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li62/o$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComposeView f91872a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view2) {
            super(view2);
            view2.getClass();
            this.f91872a = (ComposeView) view2.findViewById(R.id.promotion_container);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li62/o$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "itemView", "<init>", "(Li62/o;Landroid/view/View;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends RecyclerView.f0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f91873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f91874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f91875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f91876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o f91877e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o oVar, View view2) {
            super(view2);
            view2.getClass();
            this.f91877e = oVar;
            this.f91873a = (ImageView) view2.findViewById(R.id.msn_workout_image_view);
            this.f91874b = (TextView) view2.findViewById(R.id.msn_workout_difficulty_view);
            this.f91875c = (TextView) view2.findViewById(R.id.msn_workout_name_view);
            this.f91876d = (TextView) view2.findViewById(R.id.msn_workout_description_view);
            view2.setOnClickListener(this);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0048  */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            com.garmin.android.apps.connectmobile.workouts.presentation.msn.b bVar;
            androidx.fragment.app.m activity;
            long jLongValue;
            view2.getClass();
            o oVar = this.f91877e;
            Object obj = oVar.f91868a.get(getBindingAdapterPosition());
            obj.getClass();
            com.garmin.android.apps.connectmobile.workouts.data.model.n.b bVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.n.b) obj;
            String str = bVar2.f48265f;
            m52.k kVar = bVar2.f48263d;
            if (str == null || kVar == null || (bVar = oVar.f91869b) == null || (activity = bVar.getActivity()) == null) {
                return;
            }
            Bundle arguments = bVar.getArguments();
            long jLongValue2 = -1;
            if (arguments != null) {
                long j8 = arguments.getLong("GCM_preselected_device_id", -1L);
                Long lValueOf = Long.valueOf(j8);
                if (j8 <= 0) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    jLongValue = lValueOf.longValue();
                } else {
                    jLongValue = -1;
                }
            } else {
                jLongValue = -1;
            }
            Bundle arguments2 = bVar.getArguments();
            if (arguments2 != null) {
                long j14 = arguments2.getLong("GCM_workout_queue_download_to_device", -1L);
                Long lValueOf2 = j14 > 0 ? Long.valueOf(j14) : null;
                if (lValueOf2 != null) {
                    jLongValue2 = lValueOf2.longValue();
                }
            }
            a2 a2Var = a2.WORKOUTS;
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(jLongValue, "List item clicked with id: ", str, ", preselectedDeviceId: ");
            sbJ.append(", workoutQueueDownloadToDevice: ");
            sbJ.append(jLongValue2);
            String string = sbJ.toString();
            i2.f36769a.getClass();
            i2.a.b(a2Var, "MSNWorkoutListFragment", string);
            if (kVar == m52.k.A) {
                bv.b.f21239a.getClass();
                bv.b.a();
                if (k1.f37122a.H()) {
                    ViewMultisportWorkoutActivity.f48481g.getClass();
                    Intent intent = new Intent(activity, (Class<?>) ViewMultisportWorkoutActivity.class);
                    intent.putExtra("GCM_extra_activity_type", MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD);
                    intent.putExtra("GCM_workout_source_id", str);
                    activity.startActivity(intent);
                    return;
                }
            }
            WorkoutDetailsActivity.f48482f.getClass();
            Intent intent2 = new Intent(activity, (Class<?>) WorkoutDetailsActivity.class);
            intent2.putExtra("GCM_workout_source_id", str);
            intent2.putExtra("GCM_preselected_device_id", jLongValue);
            intent2.putExtra("GCM_workout_queue_download_to_device", jLongValue2);
            activity.startActivityForResult(intent2, 1501);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f91868a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        com.garmin.android.apps.connectmobile.workouts.data.model.n nVar = (com.garmin.android.apps.connectmobile.workouts.data.model.n) this.f91868a.get(i14);
        if (nVar instanceof com.garmin.android.apps.connectmobile.workouts.data.model.n.b) {
            return 1;
        }
        if (nVar instanceof com.garmin.android.apps.connectmobile.workouts.data.model.n.a) {
            return 3;
        }
        if (nVar instanceof com.garmin.android.apps.connectmobile.workouts.data.model.n.c) {
            return 4;
        }
        u0.r();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (i14 == -1) {
            return;
        }
        boolean z14 = f0Var instanceof c;
        ArrayList arrayList = this.f91868a;
        if (!z14) {
            if (!(f0Var instanceof a)) {
                if (f0Var instanceof b) {
                    ComposeView composeView = ((b) f0Var).f91872a;
                    i62.a.f91825a.getClass();
                    composeView.setContent(i62.a.f91827c);
                    return;
                }
                return;
            }
            a aVar = (a) f0Var;
            Object obj = arrayList.get(i14);
            obj.getClass();
            com.garmin.android.apps.connectmobile.workouts.data.model.n.a aVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.n.a) obj;
            aVar.f91870a.setImageResource(aVar2.f48258a);
            aVar.f91871b.setText(aVar2.f48259b);
            return;
        }
        c cVar = (c) f0Var;
        Object obj2 = arrayList.get(i14);
        obj2.getClass();
        com.garmin.android.apps.connectmobile.workouts.data.model.n.b bVar = (com.garmin.android.apps.connectmobile.workouts.data.model.n.b) obj2;
        Context context = cVar.itemView.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.msn_workouts_list_image_size);
        zp0.c cVar2 = new zp0.c(context);
        cVar2.f206573m = dimensionPixelSize;
        cVar2.f206574n = dimensionPixelSize;
        cVar2.f206565e = bVar.f48264e;
        ImageView imageView = cVar.f91873a;
        imageView.getClass();
        cVar2.h(imageView);
        cVar.f91874b.setText(bVar.f48260a);
        TextView textView = cVar.f91875c;
        textView.setText(bVar.f48261b);
        textView.setContentDescription(bVar.f48266g);
        TextView textView2 = cVar.f91876d;
        textView2.setText(bVar.f48262c);
        textView2.setContentDescription(bVar.f48267h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 == 1) {
            return new c(this, n23.j.b(viewGroup, R.layout.gcm4_msn_workout_list_item, viewGroup, false));
        }
        if (i14 != 3 && i14 == 4) {
            return new b(n23.j.b(viewGroup, R.layout.msn_workouts_promotion_container, viewGroup, false));
        }
        return new a(n23.j.b(viewGroup, R.layout.gcm4_workout_list_error, viewGroup, false));
    }

    public final void r(List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.n> list) {
        ArrayList arrayList = this.f91868a;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }
}
