package k32;

import android.view.View;
import android.widget.Button;
import com.nimbusds.jose.HeaderParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk32/e;", "", "T", "Landroid/view/View;", "view", HeaderParameterNames.AUTHENTICATION_TAG, "", "enabled", "<init>", "(Landroid/view/View;Ljava/lang/Object;Z)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f102676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f102677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f102678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f102679d;

    public e(View view2, T t7, boolean z14) {
        t7.getClass();
        this.f102676a = view2;
        this.f102677b = t7;
        this.f102678c = z14;
        this.f102679d = (Button) view2;
    }

    public final void a(boolean z14) {
        Button button = this.f102679d;
        if (button != null) {
            button.setVisibility((this.f102678c && z14) ? 0 : 8);
        }
    }

    public final boolean b() {
        Button button = this.f102679d;
        if (button != null) {
            return button.isSelected();
        }
        return false;
    }

    public final void c(boolean z14) {
        Button button = this.f102679d;
        if (button != null) {
            button.setSelected(z14);
        }
    }

    public final void d(int i14) {
        Button button = this.f102679d;
        if (button != null) {
            button.setText(i14);
        }
    }

    public /* synthetic */ e(View view2, Object obj, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(view2, obj, (i14 & 4) != 0 ? true : z14);
    }
}
