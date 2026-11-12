package w81;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import j22.f;
import j22.g;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lw81/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lw81/a$a;", "", "Lj22/g;", "permissionGroups", "<init>", "(Ljava/util/List;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<C3400a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<g> f183542a;

    /* JADX INFO: renamed from: w81.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw81/a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3400a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f183543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f183544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f183545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f183546d;

        /* JADX INFO: renamed from: w81.a$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3401a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f183547a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f183548b;

            static {
                int[] iArr = new int[f.values().length];
                try {
                    iArr[f.ALLOWED_ALL_TIME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f.ALLOWED_WHILE_USING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f183547a = iArr;
                int[] iArr2 = new int[g.values().length];
                try {
                    iArr2[g.f96765j.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[g.f96769n.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[g.f96767l.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                f183548b = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3400a(View view2) {
            super(view2);
            view2.getClass();
            this.f183543a = view2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends g> list) {
        list.getClass();
        this.f183542a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f183542a.size();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ca  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        C3400a c3400a = (C3400a) f0Var;
        c3400a.getClass();
        g gVar = this.f183542a.get(i14);
        gVar.getClass();
        int i15 = gVar.f96773b;
        View view2 = c3400a.f183543a;
        View viewFindViewById = view2.findViewById(R.id.permission_group_title);
        viewFindViewById.getClass();
        c3400a.f183544b = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.permission_group_status);
        viewFindViewById2.getClass();
        c3400a.f183545c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.permission_group_description);
        viewFindViewById3.getClass();
        c3400a.f183546d = (TextView) viewFindViewById3;
        TextView textView = c3400a.f183544b;
        if (textView == null) {
            s.m("groupTitleTextView");
            throw null;
        }
        textView.setText(view2.getContext().getString(gVar.f96772a));
        TextView textView2 = c3400a.f183545c;
        if (textView2 == null) {
            s.m("groupStatusTextView");
            throw null;
        }
        String strB = z.b(R.string.lbl_on, view2);
        String strB2 = z.b(R.string.lbl_off, view2);
        int i16 = C3400a.C3401a.f183548b[gVar.ordinal()];
        if (i16 == 1) {
            j22.b bVar = j22.b.f96736a;
            Context context = view2.getContext();
            context.getClass();
            bVar.getClass();
            int i17 = C3400a.C3401a.f183547a[j22.b.j(context).ordinal()];
            if (i17 != 1) {
                if (i17 != 2) {
                    strB = strB2;
                } else {
                    strB = z.b(R.string.location_status_allowed_while_using, view2);
                }
            } else if (j22.b.t()) {
                strB = z.b(R.string.device_autodisplay_always, view2);
            }
        } else if (i16 == 2) {
            j22.b bVar2 = j22.b.f96736a;
            Context context2 = view2.getContext();
            context2.getClass();
            bVar2.getClass();
            if (!j22.b.o(context2, "android.permission.READ_EXTERNAL_STORAGE")) {
                strB = strB2;
            }
        } else if (i16 != 3) {
            j22.b bVar3 = j22.b.f96736a;
            Context context3 = view2.getContext();
            context3.getClass();
            bVar3.getClass();
            if (!j22.b.p(context3, gVar)) {
                strB = strB2;
            }
        } else {
            j22.b bVar4 = j22.b.f96736a;
            Context context4 = view2.getContext();
            context4.getClass();
            bVar4.getClass();
            if (!j22.b.a(context4)) {
                strB = strB2;
            }
        }
        textView2.setText(strB);
        TextView textView3 = c3400a.f183546d;
        if (textView3 != null) {
            textView3.setText((gVar != g.f96765j || Build.VERSION.SDK_INT <= 29) ? z.b(i15, view2) : e5.g(view2.getContext().getString(i15), StringUtils.SPACE, view2.getContext().getString(R.string.settings_location_permission_usage_explanation)));
        } else {
            s.m("groupDescriptionTextView");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.permission_settings_recycler_row_layout, viewGroup, false);
        viewE.getClass();
        return new C3400a(viewE);
    }
}
