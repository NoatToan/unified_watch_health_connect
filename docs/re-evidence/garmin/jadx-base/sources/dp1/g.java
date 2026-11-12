package dp1;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import e32.l;
import e32.p;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import yo1.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ldp1/g;", "Le32/p;", "", "Lyo1/k;", "Landroid/view/View;", "view", "Le32/l;", "Ldp1/b;", "navigator", "<init>", "(Landroid/view/View;Le32/l;)V", "a", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements p<List<? extends k>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f60656d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f60657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f60658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f60659c;

    static {
        new a(null);
    }

    public g(View view2, l<b> lVar) {
        view2.getClass();
        lVar.getClass();
        Context context = view2.getContext();
        context.getClass();
        this.f60657a = context;
        View viewFindViewById = view2.findViewById(R.id.group_ride_no_data_layout);
        viewFindViewById.getClass();
        this.f60658b = viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.group_ride_no_data_view);
        viewFindViewById2.getClass();
        d dVar = new d(context, new e(lVar, 0));
        this.f60659c = dVar;
        new e32.g(null, view2, null, 5, null).a(dVar);
        ((ComposeView) viewFindViewById2).setContent(new z3.e(-1955637208, true, new f(this, 0)));
    }

    @Override // e32.p
    public final void a() {
        v22.e.j(this.f60658b);
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(List<? extends k> list) {
        return false;
    }

    @Override // e32.p
    public final void c(List<? extends k> list) {
        List<? extends k> list2 = list;
        View view2 = this.f60658b;
        if (list2 == null || list2.isEmpty()) {
            v22.e.q(view2);
        } else {
            v22.e.j(view2);
        }
        d dVar = this.f60659c;
        ArrayList arrayList = dVar.f60651e;
        arrayList.clear();
        if (list2 != null && !list2.isEmpty()) {
            arrayList.addAll(list2);
        }
        dVar.notifyDataSetChanged();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldp1/g$a;", "", "<init>", "()V", "", "LEARN_MORE_URL_FORMAT", "Ljava/lang/String;", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
