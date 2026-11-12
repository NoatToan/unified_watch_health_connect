package yb1;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.i;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyb1/b;", "Landroidx/fragment/app/i;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b extends i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f195683j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f195684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ff2.c f195685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ff2.a f195686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f195687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f195688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f195689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f195690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f195691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f195692i;

    static {
        new a(null);
    }

    public b() {
        int i14 = gt2.c.f79010a;
        this.f195684a = gt2.b.f79005a.h("CampaignDialogFragmentBase");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Window window2;
        layoutInflater.getClass();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            Resources resources = getResources();
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            window2.setBackgroundDrawable(resources.getDrawable(R.color.transparent, null));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.requestFeature(1);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setCanceledOnTouchOutside(false);
        }
        return getView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ff2.c.a aVar = ff2.c.f71140c;
        Context applicationContext = view2.getContext().getApplicationContext();
        applicationContext.getClass();
        ff2.c cVarA = aVar.a(applicationContext);
        cVarA.getClass();
        this.f195685b = cVarA;
        v6().a(new x9.b(21, this, view2), false);
    }

    public final ff2.a u6() {
        ff2.a aVar = this.f195686c;
        if (aVar != null) {
            return aVar;
        }
        s.m("campaign");
        throw null;
    }

    public final ff2.c v6() {
        ff2.c cVar = this.f195685b;
        if (cVar != null) {
            return cVar;
        }
        s.m("interactor");
        throw null;
    }

    public final void w6(kf2.a aVar) {
        aVar.getClass();
        ff2.c cVarV6 = v6();
        cVarV6.f71143b.e(aVar, u6().getCampaignId());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyb1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
