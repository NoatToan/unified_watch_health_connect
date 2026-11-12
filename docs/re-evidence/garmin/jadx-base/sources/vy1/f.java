package vy1;

import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import com.garmin.android.apps.connectmobile.R;
import g22.n;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvy1/f;", "Landroidx/appcompat/widget/SearchView$m;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements SearchView.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f180834a;

    public f(e eVar) {
        this.f180834a = eVar;
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public final boolean E0(String str) {
        if ((str != null ? str.length() : -1) < 3) {
            return true;
        }
        e.a aVar = e.T;
        e eVar = this.f180834a;
        eVar.getClass();
        ge1.b.T(f0.w(eVar), null, null, new g(eVar, str, null), 3);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public final boolean l5(String str) {
        e eVar = this.f180834a;
        if (eVar.C) {
            if (n.d(str)) {
                if ((str != null ? str.length() : -1) >= 3) {
                    ge1.b.T(f0.w(eVar), null, null, new g(eVar, str, null), 3);
                }
            }
            if (str == null || str.length() == 0) {
                EditText editText = eVar.f180808g;
                if (editText == null) {
                    s.m("locationSearchViewEditText");
                    throw null;
                }
                editText.setHintTextColor(eVar.getResources().getColor(R.color.gray_40_static, null));
                SearchView searchView = eVar.f180806e;
                if (searchView != null) {
                    searchView.setQueryHint(eVar.getString(R.string.lbl_enter_group_location));
                    return true;
                }
                s.m("locationSearchView");
                throw null;
            }
        }
        return true;
    }
}
