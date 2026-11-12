package cx2;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcx2/f;", "Landroidx/core/view/a;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends androidx.core.view.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f56671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f56672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f56673c;

    public f(boolean z14, String str, String str2) {
        this.f56671a = z14;
        this.f56672b = str;
        this.f56673c = str2;
    }

    @Override // androidx.core.view.a
    public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
        view2.getClass();
        fVar.getClass();
        super.onInitializeAccessibilityNodeInfo(view2, fVar);
        x0 x0Var = x0.f105818a;
        Context context = view2.getContext();
        boolean z14 = this.f56671a;
        String str = this.f56672b;
        String string = context.getString((!z14 || str == null) ? R.string.lbl_moved_above : R.string.lbl_move_row_up_disabled);
        string.getClass();
        fVar.b(new l7.f.a(16, String.format(string, Arrays.copyOf(new Object[]{this.f56673c, str}, 2))));
    }
}
