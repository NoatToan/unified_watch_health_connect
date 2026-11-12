package u40;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import e23.q;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.m1;
import r22.n1;
import t21.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u000b\f\r\u000eB3\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lu40/k;", "Lr22/n1;", "Lu40/k$b;", "Lkotlin/Function1;", "", "", "initialSelectionListener", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "selectionChangedListener", "<init>", "(Le23/l;Le23/l;)V", "a", "b", "c", "d", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends n1<b> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f168576g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<Integer, Unit> f168577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.l<com.garmin.android.apps.connectmobile.courses.model.f, Unit> f168578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.f f168579f;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lu40/k$b;", "Lr22/m1;", "Lu40/e;", "coursePointGroup", "Lkotlin/Function3;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "", "bind", "<init>", "(Lu40/e;Le23/q;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f168580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q<RecyclerView.f0, Integer, com.garmin.android.apps.connectmobile.courses.model.f, Unit> f168581b;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f168582a;

            static {
                int[] iArr = new int[com.garmin.android.apps.connectmobile.courses.model.f.values().length];
                try {
                    iArr[com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T1_CLIMB.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T2_CLIMB.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T3_CLIMB.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T4_CLIMB.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f168582a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(e eVar, q<? super RecyclerView.f0, ? super Integer, ? super com.garmin.android.apps.connectmobile.courses.model.f, Unit> qVar) {
            eVar.getClass();
            qVar.getClass();
            this.f168580a = eVar;
            this.f168581b = qVar;
        }

        @Override // r22.m1
        public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
            return i14 == 0 ? new c(n23.j.b(viewGroup, R.layout.course_section_header, viewGroup, false)) : new d(n23.j.b(viewGroup, R.layout.course_point_item, viewGroup, false));
        }

        @Override // r22.m1
        public final void b(RecyclerView.f0 f0Var, int i14) {
            String string;
            boolean z14 = f0Var instanceof c;
            e eVar = this.f168580a;
            if (z14) {
                TextView textView = ((c) f0Var).f168583a;
                Context context = textView.getContext();
                context.getClass();
                textView.setText(dh.b.A(context, eVar.f168566a));
                return;
            }
            if (f0Var instanceof d) {
                GCMCheckableRow gCMCheckableRow = ((d) f0Var).f168584a;
                Context context2 = gCMCheckableRow.getContext();
                com.garmin.android.apps.connectmobile.courses.model.f fVar = eVar.f168567b.get(i14 - 1);
                int[] iArr = a.f168582a;
                int iOrdinal = fVar.ordinal();
                int i15 = fVar.f32925d;
                int i16 = iArr[iOrdinal];
                if (i16 == 1) {
                    string = context2.getString(i15, 1);
                } else if (i16 == 2) {
                    string = context2.getString(i15, 2);
                } else if (i16 == 3) {
                    string = context2.getString(i15, 3);
                } else if (i16 != 4) {
                    context2.getClass();
                    string = dh.b.A(context2, fVar.a());
                } else {
                    string = context2.getString(i15, 4);
                }
                string.getClass();
                gCMCheckableRow.setDefaultText(string);
                context2.getClass();
                gCMCheckableRow.setLeftIcon(new u40.d(context2, fVar, false, null, 0.0f, 28, null));
                this.f168581b.invoke(f0Var, Integer.valueOf(i14), fVar);
            }
        }

        @Override // r22.m1
        public final int getItemCount() {
            return this.f168580a.f168567b.size() + 1;
        }

        @Override // r22.m1
        public final int getItemViewType(int i14) {
            return i14 == 0 ? 0 : 1;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu40/k$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f168583a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.section_header_text);
            viewFindViewById.getClass();
            this.f168583a = (TextView) viewFindViewById;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu40/k$d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMCheckableRow f168584a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.course_point_type_label);
            viewFindViewById.getClass();
            this.f168584a = (GCMCheckableRow) viewFindViewById;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(e23.l<? super Integer, Unit> lVar, e23.l<? super com.garmin.android.apps.connectmobile.courses.model.f, Unit> lVar2) {
        lVar.getClass();
        this.f168577d = lVar;
        this.f168578e = lVar2;
        b bVar = new b(e.f168557d, new v0(this, 8));
        b bVar2 = new b(e.f168558e, new v0(this, 8));
        b bVar3 = new b(e.f168559f, new v0(this, 8));
        b bVar4 = new b(e.f168560g, new v0(this, 8));
        b bVar5 = new b(e.f168561h, new v0(this, 8));
        b bVar6 = new b(e.f168562i, new v0(this, 8));
        b bVar7 = new b(e.f168563j, new v0(this, 8));
        b bVar8 = new b(e.f168564k, new v0(this, 8));
        this.f149766a.add(bVar);
        this.f149766a.add(bVar2);
        this.f149766a.add(bVar3);
        this.f149766a.add(bVar4);
        boolean zK = ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).k();
        ArrayList arrayList = this.f149766a;
        if (zK) {
            arrayList.add(bVar5);
        } else {
            arrayList.add(bVar6);
        }
        this.f149766a.add(bVar7);
        if (((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).c()) {
            this.f149766a.add(bVar8);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lu40/k$a;", "", "<init>", "()V", "", "VIEW_TYPE_SECTION_HEADER", "I", "VIEW_TYPE_ITEM", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ k(e23.l lVar, e23.l lVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(lVar, (i14 & 2) != 0 ? null : lVar2);
    }
}
