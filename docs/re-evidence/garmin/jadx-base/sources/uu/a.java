package uu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import mt0.l2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Luu/a;", "Lcom/garmin/android/apps/connectmobile/d0$a;", "Lkotlin/Function1;", "", "", "badgeOnClick", "<init>", "(Le23/l;)V", "b", "a", "c", "d", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends com.garmin.android.apps.connectmobile.d0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.m> f172630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f172631d;

    /* JADX INFO: renamed from: uu.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Luu/a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/ViewGroup;", "parent", "Lkotlin/Function1;", "", "", "badgeOnClick", "<init>", "(Landroid/view/ViewGroup;Le23/l;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3226a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e23.l<Integer, Unit> f172632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f172633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f172634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f172635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f172636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f172637f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TextView f172638g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TextView f172639h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final LinearLayout f172640i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ProgressBar f172641j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final View f172642k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Context f172643l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ImageView f172644m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3226a(ViewGroup viewGroup, e23.l<? super Integer, Unit> lVar) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.available_badge_list_item, viewGroup, false));
            viewGroup.getClass();
            lVar.getClass();
            this.f172632a = lVar;
            Context context = viewGroup.getContext();
            context.getClass();
            this.f172643l = context;
            View view2 = this.itemView;
            view2.getClass();
            this.f172633b = view2;
            View viewFindViewById = this.itemView.findViewById(R.id.badge_image);
            viewFindViewById.getClass();
            this.f172634c = (ImageView) viewFindViewById;
            View viewFindViewById2 = this.itemView.findViewById(R.id.badge_name);
            viewFindViewById2.getClass();
            this.f172635d = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.itemView.findViewById(R.id.badge_description);
            viewFindViewById3.getClass();
            this.f172636e = (TextView) viewFindViewById3;
            View viewFindViewById4 = this.itemView.findViewById(R.id.badge_special);
            viewFindViewById4.getClass();
            this.f172638g = (TextView) viewFindViewById4;
            View viewFindViewById5 = this.itemView.findViewById(R.id.badge_special_1);
            viewFindViewById5.getClass();
            this.f172637f = (TextView) viewFindViewById5;
            View viewFindViewById6 = this.itemView.findViewById(R.id.badge_special_2);
            viewFindViewById6.getClass();
            this.f172639h = (TextView) viewFindViewById6;
            View viewFindViewById7 = this.itemView.findViewById(R.id.badge_tag_layout);
            viewFindViewById7.getClass();
            this.f172640i = (LinearLayout) viewFindViewById7;
            View viewFindViewById8 = this.itemView.findViewById(R.id.badge_progress);
            viewFindViewById8.getClass();
            this.f172641j = (ProgressBar) viewFindViewById8;
            View viewFindViewById9 = this.itemView.findViewById(R.id.item_divider);
            viewFindViewById9.getClass();
            this.f172642k = viewFindViewById9;
            View viewFindViewById10 = this.itemView.findViewById(R.id.inflated_point_image);
            viewFindViewById10.getClass();
            this.f172644m = (ImageView) viewFindViewById10;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luu/a$b;", "Lb32/a;", "Lkotlin/Function1;", "", "", "badgeOnClick", "<init>", "(Le23/l;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b32.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.l<Integer, Unit> f172645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f172646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f172647d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final l2 f172648e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.l<? super Integer, Unit> lVar) {
            lVar.getClass();
            this.f172645b = lVar;
            this.f172648e = new l2(this, 1);
        }

        @Override // b32.d
        public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            if (i14 == 0) {
                return new j(viewGroup);
            }
            return i14 == 2 ? new c(viewGroup) : new C3226a(viewGroup, this.f172645b);
        }

        @Override // b32.d
        public final int b() {
            return 3;
        }

        @Override // b32.d
        public final b32.e c(b32.c cVar, int i14) {
            cVar.getClass();
            if (i14 == 0 || i14 == 2) {
                return null;
            }
            if (cVar instanceof a) {
                this.f172646c = (a) cVar;
            }
            return this.f172648e;
        }

        @Override // b32.d
        public final int getItemCount() {
            a aVar = this.f172646c;
            if (aVar == null) {
                return 0;
            }
            aVar.getClass();
            if (aVar.f172630c == null) {
                return 0;
            }
            a aVar2 = this.f172646c;
            aVar2.getClass();
            if (aVar2.f172630c.size() <= 0) {
                return 0;
            }
            a aVar3 = this.f172646c;
            aVar3.getClass();
            return aVar3.f172630c.size() + 2;
        }

        @Override // b32.d
        public final int getItemViewType(int i14) {
            if (i14 == 0) {
                return 0;
            }
            return i14 == getItemCount() - 1 ? 2 : 1;
        }
    }

    static {
        new d(null);
    }

    public a(e23.l<? super Integer, Unit> lVar) {
        lVar.getClass();
        this.f172630c = new ArrayList<>();
        this.f172631d = new b(lVar);
    }

    @Override // com.garmin.android.apps.connectmobile.d0.a
    public final void B() {
        z(this.f172631d);
    }

    @Override // com.garmin.android.apps.connectmobile.d0.a
    public final void clear() {
        this.f172630c.clear();
        notifyDataSetChanged();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Luu/a$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3227a f172649a = new C3227a(null);

        /* JADX WARN: Illegal instructions before constructor call */
        public c(ViewGroup viewGroup) {
            viewGroup.getClass();
            f172649a.getClass();
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_divider, viewGroup, false);
            viewInflate.getClass();
            super(viewInflate);
        }

        /* JADX INFO: renamed from: uu.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luu/a$c$a;", "", "<init>", "()V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3227a {
            public /* synthetic */ C3227a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C3227a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Luu/a$d;", "", "<init>", "()V", "", "VIEW_TYPE_EMPTY_HEADER", "I", "VIEW_TYPE_AVAILABLE_BADGE", "VIEW_TYPE_EMPTY_FOOTER", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }
}
