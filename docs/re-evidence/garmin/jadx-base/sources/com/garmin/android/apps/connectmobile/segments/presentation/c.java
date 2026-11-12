package com.garmin.android.apps.connectmobile.segments.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import androidx.fragment.app.m;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import cg1.c0;
import cg1.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.o0;
import e23.l;
import fw.p;
import java.util.List;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/c;", "Lcom/garmin/android/apps/connectmobile/o0;", "<init>", "()V", "b", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends o0 {
    public static final a A = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f41430w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public xf1.i f41431x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f41432y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c0 f41433z;

    public interface b {
        void D8(List<bg1.b> list, boolean z14, boolean z15);

        void P5();

        void T5(bg1.a aVar);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.segments.presentation.c$c, reason: collision with other inner class name */
    public static final /* synthetic */ class C0787c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41434a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41434a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f41435a;

        public d(l lVar) {
            lVar.getClass();
            this.f41435a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f41435a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f41435a.invoke(obj);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    /* JADX INFO: renamed from: C6 */
    public final String getF39648t() {
        return getString(R.string.msg_no_matching_segments);
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final String E6() {
        return "";
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final void H6(int i14, int i15) {
        T6(i14, i15);
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final void I6() {
        o0.a aVar = this.f39649v;
        int i14 = aVar.f149667d;
        int i15 = aVar.f149664a;
        this.f41432y = true;
        T6(i14, i15);
    }

    public final void T6(int i14, int i15) {
        c0 c0Var = this.f41433z;
        c0Var.getClass();
        f0.N(new z(c0Var, i14, i15, null)).f(getViewLifecycleOwner(), new d(new b41.a(this, 22)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        xf1.i iVar = new xf1.i(mVarRequireActivity, lVar.y());
        this.f41431x = iVar;
        w6(iVar);
        m mVarRequireActivity2 = requireActivity();
        mVarRequireActivity2.getClass();
        this.f41433z = (c0) new x1(mVarRequireActivity2).b(s0.f105811a.b(c0.class));
        o0.a aVar = this.f39649v;
        T6(aVar.f149667d, aVar.f149664a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f41430w = (b) context;
        } catch (ClassCastException unused) {
            wr.g.u(context, " must implement SegmentsListListener");
        }
    }

    @Override // androidx.fragment.app.n0
    public final void v6(ListView listView, View view2, int i14) {
        listView.getClass();
        view2.getClass();
        xf1.i iVar = this.f41431x;
        iVar.getClass();
        bg1.a item = iVar.getItem(i14);
        b bVar = this.f41430w;
        bVar.getClass();
        bVar.T5(item);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
