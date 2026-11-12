package gg1;

import androidx.appcompat.widget.SearchView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgg1/q;", "Landroidx/appcompat/widget/SearchView$m;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q implements SearchView.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f77296a;

    public q(r rVar) {
        this.f77296a = rVar;
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public final boolean E0(String str) {
        str.getClass();
        lg1.a aVar = this.f77296a.f77298b;
        if (aVar != null) {
            aVar.f112177e.filter(str);
            return false;
        }
        p005kotlin.jvm.internal.s.m("adapter");
        throw null;
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public final boolean l5(String str) {
        str.getClass();
        lg1.a aVar = this.f77296a.f77298b;
        if (aVar != null) {
            aVar.f112177e.filter(str);
            return false;
        }
        p005kotlin.jvm.internal.s.m("adapter");
        throw null;
    }
}
