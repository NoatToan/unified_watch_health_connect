package z21;

import androidx.compose.ui.platform.ComposeView;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lz21/i;", "", "Landroidx/compose/ui/platform/ComposeView;", "view", "", "isSavePowerGuideFlow", "Lkotlin/Function1;", "Lw01/c;", "", "onNavigateToNutritionAndHydrationPage", "<init>", "(Landroidx/compose/ui/platform/ComposeView;ZLe23/l;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f202012d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f202013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f202014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<w01.c, Unit> f202015c;

    static {
        int i14 = ComposeView.f6053c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(ComposeView composeView, boolean z14, l<? super w01.c, Unit> lVar) {
        composeView.getClass();
        lVar.getClass();
        this.f202013a = composeView;
        this.f202014b = z14;
        this.f202015c = lVar;
    }

    public final void a(w01.c cVar, double d14) {
        boolean zE = sa1.h.e(d14);
        ComposeView composeView = this.f202013a;
        if (zE) {
            composeView.setVisibility(8);
            return;
        }
        composeView.setVisibility(0);
        boolean z14 = cVar != null && cVar.f181037j;
        if ((cVar != null ? cVar.f181036i : null) == null && cVar != null) {
            cVar.f181036i = z14 ? a01.a.CUSTOM : a01.a.TODAY;
        }
        composeView.setContent(new z3.e(-1137632376, true, new g(cVar != null ? dh.b.R(cVar) : null, this, cVar, z14, 0)));
    }
}
