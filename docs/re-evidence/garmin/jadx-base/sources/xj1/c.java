package xj1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableTwoLineRow;
import e23.l;
import i3.e5;
import l20.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB%\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lxj1/c;", "Landroidx/recyclerview/widget/x;", "Lwj1/b;", "Lxj1/c$a;", "Lwj1/b$a;", "initialSelectedContactId", "Lkotlin/Function1;", "", "onContactClicked", "<init>", "(Lwj1/b$a;Le23/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends x<wj1.b, a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<wj1.b, Unit> f191161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wj1.b.a f191162c;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxj1/c$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "Lkotlin/Function1;", "Lwj1/b;", "", "onContactClicked", "<init>", "(Landroid/view/View;Le23/l;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f191163d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l<wj1.b, Unit> f191164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GCMCheckableTwoLineRow f191165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final vj1.g f191166c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(View view2, l<? super wj1.b, Unit> lVar) {
            super(view2);
            view2.getClass();
            lVar.getClass();
            this.f191164a = lVar;
            View viewFindViewById = view2.findViewById(R.id.contact_item);
            viewFindViewById.getClass();
            this.f191165b = (GCMCheckableTwoLineRow) viewFindViewById;
            Context context = view2.getContext();
            context.getClass();
            this.f191166c = new vj1.g(new l22.a(context));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(wj1.b.a aVar, l<? super wj1.b, Unit> lVar) {
        super(xj1.a.f191157a);
        lVar.getClass();
        this.f191161b = lVar;
        this.f191162c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        String strV;
        a aVar = (a) f0Var;
        aVar.getClass();
        wj1.b bVarR = r(i14);
        bVarR.getClass();
        boolean zG = s.g(bVarR.f185788e, this.f191162c);
        vj1.g gVar = aVar.f191166c;
        String str = bVarR.f185785b;
        String str2 = bVarR.f185786c;
        gVar.getClass();
        String strA = vj1.g.a(str, str2);
        GCMCheckableTwoLineRow gCMCheckableTwoLineRow = aVar.f191165b;
        gCMCheckableTwoLineRow.setTopLabel(strA);
        l20.c cVar = bVarR.f185787d;
        Context context = aVar.itemView.getContext();
        context.getClass();
        String str3 = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
        p pVarU = cVar.u();
        if (str3 == null || str3.length() == 0) {
            strV = null;
        } else if (pVarU != null) {
            l22.b bVar = gVar.f178466a;
            strV = bVar.a(R.string.string_colon_string_pattern, bVar.getString(pVarU.f109041b), jg.b.v(context, str3));
        } else {
            strV = jg.b.v(context, str3);
        }
        gCMCheckableTwoLineRow.setBottomLabel(strV);
        gCMCheckableTwoLineRow.b(zG);
        gCMCheckableTwoLineRow.setOnCheckChangeListener(new b(0, aVar, bVarR));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.emergency_calling_contact_item, viewGroup, false);
        viewE.getClass();
        return new a(viewE, new xa2.g(this, 5));
    }
}
