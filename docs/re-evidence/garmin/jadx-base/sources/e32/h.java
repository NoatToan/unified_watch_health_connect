package e32;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.InfiniteViewPager;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r22.b0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Le32/h;", "Lx22/a;", "Le32/m;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class h extends x22.a implements m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f62784h = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f62785d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DateTime f62786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DateTime f62787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f62788g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"e32/h$b", "Lr22/b0;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b0 {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ h f62789v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0.b bVar, h hVar, v vVar, int i14, DateTime dateTime) {
            super(vVar, i14, null, dateTime, bVar);
            this.f62789v = hVar;
            vVar.getClass();
        }

        @Override // r22.b0
        public final Fragment b(long j8, long j14) {
            f fVar = this.f62789v.f62788g;
            if (fVar != null) {
                return fVar.U6(this.f149584l, j8, j14);
            }
            s.m("onCreateSummaryPageFragmentListener");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"e32/h$c", "Landroidx/viewpager/widget/ViewPager$j;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements ViewPager.j {
        public c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            h hVar = h.this;
            f fVar = hVar.f62788g;
            if (fVar != null) {
                fVar.H8(hVar.f62785d, hVar.v6().f149586n.b(i14).f128594a);
            }
        }
    }

    @Override // e32.m
    public final void f5() {
        dv0.n nVar = new dv0.n(21);
        SparseArray<Object> sparseArray = v6().f149914k;
        int size = sparseArray.size();
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = sparseArray.get(sparseArray.keyAt(i14));
            if (obj != null) {
                nVar.invoke(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f62788g = (f) context;
        } catch (ClassCastException e4) {
            String strN = fb1.c.n("Parent activity must implement OnCreateSummaryPageFragmentListener: ", e4.getMessage());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "SummaryDateInfiniteViewPagerFragment", strN);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Object serializable;
        Object serializable2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f62785d = arguments.getInt("ARG_INTERVAL_TYPE", 1);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                serializable = arguments.getSerializable("ARG_INITIAL_DATE", DateTime.class);
            } else {
                Object serializable3 = arguments.getSerializable("ARG_INITIAL_DATE");
                if (!(serializable3 instanceof DateTime)) {
                    serializable3 = null;
                }
                serializable = (DateTime) serializable3;
            }
            this.f62786e = (DateTime) serializable;
            if (i14 >= 33) {
                serializable2 = arguments.getSerializable("ARG_END_DATE", DateTime.class);
            } else {
                Object serializable4 = arguments.getSerializable("ARG_END_DATE");
                serializable2 = (DateTime) (serializable4 instanceof DateTime ? serializable4 : null);
            }
            this.f62787f = (DateTime) serializable2;
        }
    }

    @Override // x22.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        if (bundle == null) {
            DateTime dateTimeNow = this.f62786e;
            InfiniteViewPager infiniteViewPagerW6 = w6();
            b0 b0VarV6 = v6();
            if (dateTimeNow == null) {
                dateTimeNow = DateTime.now();
            }
            dateTimeNow.getClass();
            infiniteViewPagerW6.setDefaultPosition(b0VarV6.c(dateTimeNow));
        }
        f fVar = this.f62788g;
        if (fVar != null) {
            DateTime dateTimeNow2 = this.f62786e;
            if (dateTimeNow2 == null) {
                dateTimeNow2 = DateTime.now();
            }
            dateTimeNow2.getClass();
            fVar.H8(this.f62785d, dateTimeNow2);
        }
        w6().c(new c());
    }

    @Override // x22.a
    public b0 u6() {
        Context context = getContext();
        return new b(context != null ? new x22.b(context) : new b0.c(), this, getChildFragmentManager(), this.f62785d, this.f62787f);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Le32/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ARG_INTERVAL_TYPE", "ARG_INITIAL_DATE", "ARG_END_DATE", "", "DEFAULT_VALUE_INTERVAL_TYPE", "I", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
