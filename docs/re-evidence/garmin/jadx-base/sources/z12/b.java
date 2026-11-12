package z12;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import zd0.g1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lz12/b;", "Lb32/a;", "Lb32/e;", "Lcom/garmin/android/apps/connectmobile/userprofile/e$a;", "viewModel", "<init>", "(Lcom/garmin/android/apps/connectmobile/userprofile/e$a;)V", "a", "b", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends b32.a implements b32.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.userprofile.e.a f201363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f201364c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/b$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
        }
    }

    static {
        new C3760b(null);
    }

    public b(com.garmin.android.apps.connectmobile.userprofile.e.a aVar) {
        aVar.getClass();
        this.f201363b = aVar;
        this.f201364c = (g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null);
    }

    @Override // b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.card_annual_report_entrance, viewGroup, false);
        viewE.getClass();
        return new a(viewE);
    }

    @Override // b32.d
    public final int b() {
        return 1;
    }

    @Override // b32.d
    public final b32.e c(b32.c cVar, int i14) {
        cVar.getClass();
        return this;
    }

    @Override // b32.e
    public final void d(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        View view2 = f0Var.itemView;
        ComposeView composeView = view2 instanceof ComposeView ? (ComposeView) view2 : null;
        if (composeView != null) {
            o.f201454a.getClass();
            composeView.setContent(o.f201456c);
        }
    }

    @Override // b32.d
    public final int getItemCount() {
        return 1;
    }

    @Override // b32.d
    public final int getItemViewType(int i14) {
        return 0;
    }

    @Override // b32.a, b32.d
    /* JADX INFO: renamed from: isVisible */
    public final boolean getF120672c() {
        return this.f201363b.c() && this.f201364c.c(c80.s0.PROFILE);
    }

    /* JADX INFO: renamed from: z12.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lz12/b$b;", "", "<init>", "()V", "", "TYPE_ITEM", "I", "TYPE_COUNT", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3760b {
        public /* synthetic */ C3760b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3760b() {
        }
    }
}
