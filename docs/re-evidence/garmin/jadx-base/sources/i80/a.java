package i80;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.developer.glogger.GloggerAdminActivity;
import com.garmin.android.apps.connectmobile.z1;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import go1.g0;
import i3.d6;
import i3.e5;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Li80/a;", "Li80/c;", "Li80/b;", "<init>", "()V", "a", "b", "c", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends i80.c implements i80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f92217a = 0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li80/a$b;", "", "", "isChecked", "", "name", "<init>", "(ZLjava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f92218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92219b;

        public b(boolean z14, String str) {
            str.getClass();
            this.f92218a = z14;
            this.f92219b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f92218a == bVar.f92218a && this.f92219b.equals(bVar.f92219b);
        }

        public final int hashCode() {
            return this.f92219b.hashCode() + (Boolean.hashCode(this.f92218a) * 31);
        }

        public final String toString() {
            return "Item(isChecked=" + this.f92218a + ", name=" + this.f92219b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Li80/a$c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Li80/a$c$a;", "Li80/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Li80/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends RecyclerView.h<C1760a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i80.b f92220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashSet f92221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<b> f92222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final g0 f92223d;

        /* JADX INFO: renamed from: i80.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li80/a$c$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Li80/a$c;Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class C1760a extends RecyclerView.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final View f92224a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ImageView f92225b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TextView f92226c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1760a(c cVar, View view2) {
                super(view2);
                view2.getClass();
                this.f92224a = view2;
                View viewFindViewById = view2.findViewById(R.id.checkmark);
                viewFindViewById.getClass();
                this.f92225b = (ImageView) viewFindViewById;
                View viewFindViewById2 = view2.findViewById(R.id.name);
                viewFindViewById2.getClass();
                this.f92226c = (TextView) viewFindViewById2;
            }
        }

        public c(i80.b bVar) {
            bVar.getClass();
            this.f92220a = bVar;
            this.f92222c = new ArrayList(0);
            this.f92221b = new HashSet();
            this.f92223d = new g0(this, 17);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.f92222c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            C1760a c1760a = (C1760a) f0Var;
            c1760a.getClass();
            ImageView imageView = c1760a.f92225b;
            b bVar = this.f92222c.get(i14);
            c1760a.f92226c.setText(bVar.f92219b);
            boolean z14 = bVar.f92218a;
            if (z14) {
                imageView.setVisibility(0);
            } else {
                if (z14) {
                    u0.r();
                    return;
                }
                imageView.setVisibility(4);
            }
            View view2 = c1760a.f92224a;
            view2.setTag(bVar);
            view2.setTag(R.id.tag_key_for_recycler_view_position, Integer.valueOf(i14));
            view2.setOnClickListener(this.f92223d);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            View viewE = e5.e(viewGroup, R.layout.glogger_add_file_logger_item, viewGroup, false);
            viewE.getClass();
            return new C1760a(this, viewE);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((b) t7).f92219b, ((b) t14).f92219b);
        }
    }

    static {
        new C1759a(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m activity = getActivity();
        activity.getClass();
        ((z1) activity).setTitle("Add File Loggers");
        u6("");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = (RecyclerView) com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.glogger_add_file_loggers_frag, viewGroup, false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new c(this));
        return recyclerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m activity = getActivity();
        activity.getClass();
        ((GloggerAdminActivity) activity).da("AddFileLoggersFrag");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ArrayList arrayList = new ArrayList();
        a2[] a2VarArrValues = a2.values();
        ArrayList arrayList2 = new ArrayList();
        int length = a2VarArrValues.length;
        for (int i14 = 1; i14 < length; i14++) {
            arrayList2.add(a2VarArrValues[i14].f28756a);
        }
        oi0.c.W(5, new d6(arrayList2, 4, arrayList, view2));
    }

    @Override // i80.b
    public final void v4(int i14) {
        View view2 = getView();
        if (view2 != null) {
            view2.post(new androidx.media3.exoplayer.d(this, i14, 8));
        }
    }

    /* JADX INFO: renamed from: i80.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li80/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1759a {
        public /* synthetic */ C1759a(j jVar) {
            this();
        }

        private C1759a() {
        }
    }
}
