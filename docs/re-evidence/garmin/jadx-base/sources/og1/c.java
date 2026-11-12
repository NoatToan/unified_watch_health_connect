package og1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import aq.b0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import do1.l;
import java.util.ArrayList;
import java.util.Comparator;
import n23.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB?\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Log1/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "activityList", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "activityOptionComparator", "Log1/f;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/util/ArrayList;Ljava/util/Comparator;Log1/f;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<String> f131990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator<String> f131991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f131992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f131993d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Log1/c$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f131994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f131995b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
            this.f131994a = (TextView) view2.findViewById(R.id.tv_disabled_activities);
            this.f131995b = (ImageView) view2.findViewById(R.id.iv_add);
        }
    }

    public c(ArrayList<String> arrayList, Comparator<String> comparator, f fVar) {
        arrayList.getClass();
        comparator.getClass();
        fVar.getClass();
        this.f131990a = arrayList;
        this.f131991b = comparator;
        this.f131992c = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f131990a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        a aVar = (a) f0Var;
        ImageView imageView = aVar.f131995b;
        TextView textView = aVar.f131994a;
        if (textView != null) {
            textView.setText(this.f131990a.get(i14));
        }
        if (this.f131993d) {
            if (textView != null) {
                textView.setAlpha(1.0f);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else {
            if (textView != null) {
                textView.setAlpha(0.5f);
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        if (imageView != null) {
            imageView.setOnClickListener(new b0(this, i14, 14));
        }
        if (textView != null) {
            textView.setOnClickListener(new l(2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(j.b(viewGroup, R.layout.gcm3_disabled_activities_item, viewGroup, false));
    }
}
