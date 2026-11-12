package com.garmin.android.apps.connectmobile.ecg.presentation.stats;

import am.j;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import pf0.x;
import s51.e;
import vb.h;
import yc.r2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\b\t\nB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/c;", "Lyc/r2;", "Lgf0/a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/c$d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/c$d;)V", "d", "c", "b", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends r2<gf0.a, RecyclerView.f0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f34898d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f34899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f34900c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/ecg/presentation/stats/c$a", "Landroidx/recyclerview/widget/o$f;", "Lgf0/a;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends o.f<gf0.a> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(gf0.a aVar, gf0.a aVar2) {
            gf0.a aVar3 = aVar;
            gf0.a aVar4 = aVar2;
            aVar3.getClass();
            aVar4.getClass();
            return aVar3.equals(aVar4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(gf0.a aVar, gf0.a aVar2) {
            gf0.a aVar3 = aVar;
            gf0.a aVar4 = aVar2;
            aVar3.getClass();
            aVar4.getClass();
            return s.g(aVar3.getDetailId(), aVar4.getDetailId());
        }
    }

    public interface d {
        void Y0(gf0.a aVar);
    }

    static {
        new b(null);
        f34898d = new a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(f34898d);
        dVar.getClass();
        this.f34899b = dVar;
    }

    @Override // yc.r2, androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        int iA = this.f196366a.a();
        e eVar = this.f34900c;
        return ((eVar == null || eVar == e.LOADED) ? 0 : 1) + iA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        e eVar = this.f34900c;
        return (eVar == null || eVar == e.LOADED || i14 != getItemCount() + (-1)) ? 100 : 101;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (getItemViewType(i14) == 100 && (f0Var instanceof C0591c)) {
            gf0.a aVarR = r(i14);
            C0591c c0591c = (C0591c) f0Var;
            if (aVarR == null) {
                return;
            }
            c0591c.f34902a.setContent(new z3.e(1742204915, true, new x(c0591c, aVarR, 0)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 != 100) {
            if (i14 == 101) {
                h12.a.f80820a.getClass();
                return h12.a.C1612a.a(viewGroup);
            }
            h.s(j.h(i14, "unknown view type "));
            return null;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        return new C0591c(new ComposeView(context, null, 0, 6, null), null, this.f34899b, 2, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/c$b;", "", "<init>", "()V", "", "LIST_ROW_ID", "I", "LIST_LOADING_ID", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.ecg.presentation.stats.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/c$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "Lpf0/s;", "formatter", "Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/c$d;", "rowListener", "<init>", "(Landroidx/compose/ui/platform/ComposeView;Lpf0/s;Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/c$d;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0591c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f34901d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComposeView f34902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final pf0.s f34903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f34904c;

        public /* synthetic */ C0591c(ComposeView composeView, pf0.s sVar, d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
            if ((i14 & 2) != 0) {
                Context context = composeView.getContext();
                context.getClass();
                sVar = new pf0.s(context);
            }
            this(composeView, sVar, dVar);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0591c(ComposeView composeView, pf0.s sVar, d dVar) {
            super(composeView);
            composeView.getClass();
            sVar.getClass();
            dVar.getClass();
            this.f34902a = composeView;
            this.f34903b = sVar;
            this.f34904c = dVar;
        }
    }
}
