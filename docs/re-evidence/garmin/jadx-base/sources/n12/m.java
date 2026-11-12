package n12;

import androidx.recyclerview.widget.GridLayoutManager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ln12/m;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends GridLayoutManager.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f122266c;

    public m(boolean z14) {
        this.f122266c = z14;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i14) {
        return (this.f122266c || i14 != 0) ? 1 : 3;
    }
}
