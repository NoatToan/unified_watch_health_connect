package ha1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lha1/a;", "Lcom/garmin/android/apps/connectmobile/c;", "Lha1/g;", "<init>", "()V", "b", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends com.garmin.android.apps.connectmobile.c implements g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f82658l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f82659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f82660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f82661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f82662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f82663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MenuItem f82664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MenuItem f82665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MenuItem f82666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MenuItem f82667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f82668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecyclerView f82669k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lha1/a$b;", "Landroidx/recyclerview/widget/s$d;", "<init>", "(Lha1/a;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends s.d {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.s.d
        public final void b(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            recyclerView.getClass();
            f0Var.getClass();
            if (f0Var instanceof sq0.c) {
                ((sq0.c) f0Var).c();
            }
            super.b(recyclerView, f0Var);
        }

        @Override // androidx.recyclerview.widget.s.d
        public final int e() {
            return 50;
        }

        @Override // androidx.recyclerview.widget.s.d
        public final float f(RecyclerView.f0 f0Var) {
            f0Var.getClass();
            return 0.2f;
        }

        @Override // androidx.recyclerview.widget.s.d
        public final int g(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            recyclerView.getClass();
            f0Var.getClass();
            return s.d.k(15, 0);
        }

        @Override // androidx.recyclerview.widget.s.d
        public final int h(RecyclerView recyclerView, int i14, int i15, long j8) {
            recyclerView.getClass();
            return ((int) Math.signum(i15)) * 10;
        }

        @Override // androidx.recyclerview.widget.s.d
        public final boolean i() {
            return false;
        }

        @Override // androidx.recyclerview.widget.s.d
        public final boolean j() {
            return a.this.f82661c;
        }

        @Override // androidx.recyclerview.widget.s.d
        public final boolean m(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            recyclerView.getClass();
            f0Var.getClass();
            a aVar = a.this;
            e eVarCa = aVar.ca();
            int bindingAdapterPosition = f0Var.getBindingAdapterPosition();
            int bindingAdapterPosition2 = f0Var2.getBindingAdapterPosition();
            eVarCa.x(bindingAdapterPosition, bindingAdapterPosition2);
            ArrayList<Integer> arrayList = eVarCa.f82694j;
            if (arrayList != null) {
                arrayList.add(Integer.valueOf(bindingAdapterPosition));
            }
            ArrayList<Integer> arrayList2 = eVarCa.f82694j;
            if (arrayList2 != null) {
                arrayList2.add(Integer.valueOf(bindingAdapterPosition2));
            }
            MenuItem menuItem = aVar.f82667i;
            if (menuItem != null) {
                menuItem.setEnabled(true);
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.s.d
        public final void n(int i14, RecyclerView.f0 f0Var) {
            if (i14 != 0 && (f0Var instanceof sq0.c)) {
                ((sq0.c) f0Var).a();
            }
            super.n(i14, f0Var);
        }

        @Override // androidx.recyclerview.widget.s.d
        public final void o(int i14, RecyclerView.f0 f0Var) {
            f0Var.getClass();
        }
    }

    static {
        new C1634a(null);
    }

    @Override // ha1.g
    public final void I0(boolean z14) {
        Drawable icon;
        Drawable drawableMutate;
        MenuItem menuItem = this.f82665g;
        if (menuItem != null && (icon = menuItem.getIcon()) != null && (drawableMutate = icon.mutate()) != null) {
            drawableMutate.setAlpha(z14 ? 255 : 102);
        }
        MenuItem menuItem2 = this.f82665g;
        if (menuItem2 != null) {
            menuItem2.setEnabled(z14);
        }
    }

    @Override // ha1.g
    public final void W2(boolean z14) {
        this.f82660b = z14;
        MenuItem menuItem = this.f82664f;
        if (menuItem != null) {
            menuItem.setVisible(!z14);
        }
        MenuItem menuItem2 = this.f82666h;
        if (menuItem2 != null) {
            menuItem2.setVisible(!z14);
        }
        MenuItem menuItem3 = this.f82665g;
        if (menuItem3 != null) {
            menuItem3.setVisible(z14);
        }
        e eVarCa = ca();
        List<f> list = eVarCa.f82686b;
        eVarCa.f82692h = z14;
        if (z14) {
            return;
        }
        eVarCa.f82690f = new SparseBooleanArray(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            eVarCa.u(i14, false, false);
        }
        eVarCa.f82691g = 0;
        eVarCa.notifyDataSetChanged();
    }

    public final e ca() {
        e eVar = this.f82668j;
        if (eVar != null) {
            return eVar;
        }
        p005kotlin.jvm.internal.s.m("photoAdapter");
        throw null;
    }

    public final RecyclerView da() {
        RecyclerView recyclerView = this.f82669k;
        if (recyclerView != null) {
            return recyclerView;
        }
        p005kotlin.jvm.internal.s.m("recyclerView");
        throw null;
    }

    public boolean ea() {
        return true;
    }

    public abstract void fa();

    public final void ga(List<String> list) {
        list.getClass();
        this.f82662d = true;
        if (list.size() == ca().f82686b.size()) {
            ca().clear();
            z6();
            return;
        }
        e eVarCa = ca();
        List<f> list2 = eVarCa.f82686b;
        for (String str : list) {
            int size = list2.size();
            for (int i14 = 0; i14 < size; i14++) {
                if (p005kotlin.jvm.internal.s.g(str, list2.get(i14).f82700b)) {
                    list2.remove(i14);
                    eVarCa.notifyItemRemoved(i14);
                    break;
                }
            }
        }
    }

    @Override // ha1.g
    public final Context getContext() {
        return this;
    }

    public abstract void ha();

    public final void ia(boolean z14) {
        MenuItem menuItem;
        if (z14) {
            updateActionBar(getString(R.string.title_reorder_photos), 3);
        } else {
            updateActionBar(getString(R.string.title_photos), 2);
            if (!this.f82663e && (menuItem = this.f82667i) != null && menuItem.isEnabled()) {
                ca().t();
                da().scrollToPosition(0);
            }
        }
        this.f82661c = z14;
        MenuItem menuItem2 = this.f82664f;
        if (menuItem2 != null) {
            menuItem2.setVisible(!z14);
        }
        MenuItem menuItem3 = this.f82666h;
        if (menuItem3 != null) {
            menuItem3.setVisible(!z14);
        }
        MenuItem menuItem4 = this.f82667i;
        if (menuItem4 != null) {
            menuItem4.setVisible(z14);
        }
        e eVarCa = ca();
        eVarCa.f82693i = z14;
        if (z14) {
            eVarCa.f82694j = new ArrayList<>();
        }
        MenuItem menuItem5 = this.f82667i;
        if (menuItem5 != null) {
            menuItem5.setEnabled(false);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addMenuProvider(new ha1.b(this), this, b0.b.RESUMED);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // z6.e
    public abstract void z6();

    /* JADX INFO: renamed from: ha1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lha1/a$a;", "", "<init>", "()V", "", "REQUEST_ACTIVITY_IMAGES", "I", "", "TAG", "Ljava/lang/String;", "NUMBER_OF_COLUMNS", "ALPHA_40", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1634a {
        public /* synthetic */ C1634a(j jVar) {
            this();
        }

        private C1634a() {
        }
    }
}
