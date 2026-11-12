package com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import lc.u0;
import n23.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/a$b;", "emergencyContactActionListener", "<init>", "(Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/a$b;)V", "b", "a", JWKParameterNames.RSA_EXPONENT, "d", "c", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f43700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f43701b;

    public interface b {
        void H5(l20.a aVar);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/a$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/a;Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int f43702i = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstraintLayout f43703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f43704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f43705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f43706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f43707e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f43708f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ImageView f43709g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ a f43710h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f43710h = aVar;
            this.f43703a = (ConstraintLayout) view2.findViewById(R.id.contact_view);
            this.f43704b = (TextView) view2.findViewById(R.id.contact_info_label);
            this.f43705c = (TextView) view2.findViewById(R.id.contact_info_value);
            this.f43706d = (TextView) view2.findViewById(R.id.contact_warning_label);
            this.f43707e = view2.findViewById(R.id.contact_info_warning);
            this.f43708f = (TextView) view2.findViewById(R.id.contact_details_label);
            this.f43709g = (ImageView) view2.findViewById(R.id.emergency_contact_icon);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/a$d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/a;Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class d extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f43711a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f43711a = (TextView) view2;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/a$e;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/a;Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class e extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f43712a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f43712a = (TextView) view2.findViewById(R.id.header_text_view);
        }
    }

    static {
        new C0811a(null);
    }

    public a(b bVar) {
        this.f43700a = bVar;
        this.f43701b = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f43701b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        yj1.f fVar = (yj1.f) this.f43701b.get(i14);
        if (fVar instanceof yj1.f.d) {
            return 1;
        }
        if (fVar instanceof yj1.f.c) {
            return 3;
        }
        if (fVar instanceof yj1.f.b) {
            return 2;
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
        ArrayList arrayList = this.f43701b;
        if (!z14) {
            if (f0Var instanceof e) {
                e eVar = (e) f0Var;
                Object obj = arrayList.get(i14);
                obj.getClass();
                eVar.f43712a.setText(eVar.itemView.getContext().getString(((yj1.f.d) obj).f197541a));
                return;
            }
            if (f0Var instanceof d) {
                d dVar = (d) f0Var;
                Object obj2 = arrayList.get(i14);
                obj2.getClass();
                dVar.f43711a.setText(dVar.itemView.getContext().getString(((yj1.f.c) obj2).f197540a));
                return;
            }
            return;
        }
        c cVar = (c) f0Var;
        yj1.f fVar = (yj1.f) arrayList.get(i14);
        ImageView imageView = cVar.f43709g;
        View view2 = cVar.f43707e;
        fVar.getClass();
        TextView textView = cVar.f43706d;
        textView.getClass();
        textView.setVisibility(8);
        TextView textView2 = cVar.f43704b;
        textView2.getClass();
        textView2.setVisibility(8);
        Context context = cVar.itemView.getContext();
        context.getClass();
        if (c22.b.e(context)) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Context context2 = cVar.itemView.getContext();
            context2.getClass();
            Resources resources = cVar.itemView.getResources();
            resources.getClass();
            layoutParams.width = (int) c22.b.c(context2, xy2.b.n(resources, 16.0f), 1.5f);
        }
        if (!(fVar instanceof yj1.f.b)) {
            a2 a2Var = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "EmergencyContactListAdapter", "[EmergencyContactListAdapter] bind is not handled");
            return;
        }
        cVar.f43703a.setOnClickListener(new u12.e(5, fVar, cVar.f43710h));
        TextView textView3 = cVar.f43705c;
        yj1.f.b bVar = (yj1.f.b) fVar;
        int i15 = bVar.f197536c;
        textView3.setText(bVar.f197534a);
        cVar.f43708f.setText(cVar.itemView.getContext().getString(bVar.f197535b));
        view2.getClass();
        view2.setVisibility(bVar.f197538e ? 0 : 8);
        if (i15 != -1) {
            imageView.getClass();
            imageView.setVisibility(0);
            imageView.setImageResource(i15);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 == 1) {
            return new e(this, j.b(viewGroup, R.layout.emergency_contact_list_header, viewGroup, false));
        }
        if (i14 != 2) {
            return i14 != 3 ? new d(this, j.b(viewGroup, R.layout.emergency_contact_list_footer, viewGroup, false)) : new d(this, j.b(viewGroup, R.layout.emergency_contact_list_footer, viewGroup, false));
        }
        return new c(this, j.b(viewGroup, R.layout.gcm4_emergency_contact_info_list_item, viewGroup, false));
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0811a {
        public /* synthetic */ C0811a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0811a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ a(b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bVar);
    }
}
