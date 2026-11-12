package g32;

import android.view.View;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg32/a;", "T", "", "Landroid/view/View;", "chartTooltip", "Lg32/b;", "chartTooltipAvailability", "<init>", "(Landroid/view/View;Lg32/b;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f75704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<T> f75705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f75706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f75707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f75708e;

    public a(View view2, b<T> bVar) {
        view2.getClass();
        bVar.getClass();
        this.f75704a = view2;
        this.f75705b = bVar;
        this.f75706c = view2.getContext().getResources().getConfiguration().orientation == 1;
    }

    public final void a() {
        View view2 = this.f75704a;
        int visibility = view2.getVisibility();
        b<T> bVar = this.f75705b;
        boolean z14 = this.f75706c;
        if (visibility == 0 && z14) {
            view2.setVisibility(8);
            bVar.e();
        }
        if (view2.getVisibility() != 0 || z14) {
            return;
        }
        view2.setVisibility(8);
        bVar.d();
    }
}
