package ey;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import c22.f3;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\b\t\n\u000b\fB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Ley/i;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Ley/i$b;", "", "", "mDeviceList", "<init>", "(Ljava/util/List;)V", "a", "b", "d", "c", JWKParameterNames.RSA_EXPONENT, "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<? extends Object> f67086a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ley/i$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b extends RecyclerView.f0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view2) {
            super(view2);
            view2.getClass();
        }

        public abstract void d(Object obj);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ley/i$c;", "Ley/i$b;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f67087a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.compatible_devices_sub_title);
            viewFindViewById.getClass();
            this.f67087a = (TextView) viewFindViewById;
        }

        @Override // ey.i.b
        public final void d(Object obj) {
            obj.getClass();
            this.f67087a.setText((String) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ley/i$d;", "Ley/i$b;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstraintLayout f67088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f67089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f67090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f67091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f67092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final View f67093f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.device_info_container);
            viewFindViewById.getClass();
            this.f67088a = (ConstraintLayout) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.compatible_device_name);
            viewFindViewById2.getClass();
            this.f67089b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.compatible_device_image);
            viewFindViewById3.getClass();
            this.f67090c = (ImageView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.status_connected);
            viewFindViewById4.getClass();
            this.f67091d = (TextView) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.compatible_device_info);
            viewFindViewById5.getClass();
            this.f67092e = (TextView) viewFindViewById5;
            View viewFindViewById6 = view2.findViewById(R.id.device_divider_view);
            viewFindViewById6.getClass();
            this.f67093f = viewFindViewById6;
        }

        @Override // ey.i.b
        public final void d(Object obj) {
            String strB;
            obj.getClass();
            xx.g gVar = (xx.g) obj;
            bm2.c cVar = gVar.f192502a;
            cVar.getClass();
            String str = cVar.F;
            TextView textView = this.f67089b;
            textView.setText(str);
            Context context = this.itemView.getContext();
            context.getClass();
            zp0.c cVar2 = new zp0.c(context);
            cVar2.f206565e = cVar.f18909g;
            cVar2.f206570j = 2131231969;
            cVar2.h(this.f67090c);
            View view2 = this.itemView;
            view2.getClass();
            ConstraintLayout constraintLayout = (ConstraintLayout) view2;
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.f((ConstraintLayout) LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.compatible_device_layout, (ViewGroup) null));
            boolean z14 = gVar.f192504c;
            View view3 = this.f67093f;
            if (z14) {
                dVar.g(view3.getId(), 6, this.f67088a.getId(), 6);
            } else {
                dVar.g(view3.getId(), 6, textView.getId(), 6);
            }
            dVar.b(constraintLayout);
            TextView textView2 = this.f67091d;
            textView2.setVisibility(0);
            rd2.j jVar = rd2.f.a().f152045a;
            long j8 = cVar.f18942x;
            jVar.getClass();
            sd2.f fVarI = rd2.j.i(j8, null);
            if (cVar.g()) {
                f3 f3Var = f3.f23054a;
                Context context2 = this.itemView.getContext();
                context2.getClass();
                String string = this.itemView.getContext().getString(R.string.devices_not_connected);
                f3Var.getClass();
                strB = f3.c(context2, string, false);
            } else {
                strB = z.b(R.string.devices_not_connected, this.itemView);
            }
            if (fVarI == null || !((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).e(fVarI)) {
                textView2.setText(strB);
            } else {
                textView2.setText(this.itemView.getContext().getString(R.string.devices_connected));
            }
            StringBuilder sb3 = new StringBuilder();
            boolean zG = cVar.g();
            TextView textView3 = this.f67092e;
            if (zG) {
                if (cVar.S0) {
                    if (sb3.length() > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(this.itemView.getContext().getString(R.string.lbl_training_plans));
                }
                if (cVar.R0) {
                    if (sb3.length() > 0) {
                        sb3.append(", ");
                    }
                    f3 f3Var2 = f3.f23054a;
                    Context context3 = this.itemView.getContext();
                    context3.getClass();
                    String string2 = this.itemView.getContext().getString(R.string.calendar_sync_compatible_workouts);
                    f3Var2.getClass();
                    sb3.append(f3.b(context3, string2, false));
                }
                if (sb3.length() > 0) {
                    textView3.setText(sb3.toString());
                    textView3.setVisibility(0);
                }
            } else {
                textView3.setText((CharSequence) null);
                textView3.setVisibility(8);
            }
            if (gVar.f192503b) {
                view3.setVisibility(0);
            } else {
                view3.setVisibility(8);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ley/i$e;", "Ley/i$b;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f67094a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.compatible_devices_title);
            viewFindViewById.getClass();
            this.f67094a = (TextView) viewFindViewById;
        }

        @Override // ey.i.b
        public final void d(Object obj) {
            obj.getClass();
            String str = ((xx.h) obj).f192505a;
            TextView textView = this.f67094a;
            textView.setText(str);
            textView.setAllCaps(true);
        }
    }

    static {
        new a(null);
    }

    public i(List<? extends Object> list) {
        list.getClass();
        this.f67086a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f67086a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        List<? extends Object> list = this.f67086a;
        if (list.get(i14) instanceof xx.h) {
            return 3;
        }
        return list.get(i14) instanceof xx.g ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b bVar = (b) f0Var;
        bVar.getClass();
        bVar.d(this.f67086a.get(i14));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i14 == 0) {
            return new c(n23.j.b(viewGroup, R.layout.compatible_device_description_layout, viewGroup, false));
        }
        if (i14 != 1) {
            return new e(n23.j.b(viewGroup, R.layout.compatible_device_title_layout, viewGroup, false));
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.compatible_device_layout, viewGroup, false);
        viewInflate.getClass();
        return new d(viewInflate);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ley/i$a;", "", "<init>", "()V", "", "DESCRIPTION_TYPE", "I", "LIST_TYPE", "TITLE_TYPE", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
