package mt0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmt0/a2;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a2 extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f120508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f120509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f120510c;

    public a2(Context context) {
        context.getClass();
        this.f120508a = context.getResources().getDimensionPixelSize(R.dimen.spacing_normal);
        this.f120509b = context.getResources().getDimensionPixelSize(R.dimen.spacing_small);
        this.f120510c = context.getResources().getDimensionPixelSize(R.dimen.spacing_large);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.getClass();
        view2.getClass();
        recyclerView.getClass();
        b0Var.getClass();
        RecyclerView.h adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
            int i14 = this.f120509b;
            int i15 = this.f120508a;
            int i16 = this.f120510c;
            if (childAdapterPosition == 0) {
                rect.left = i15;
                if (itemCount <= 1) {
                    i14 = i15;
                }
                rect.right = i14;
                rect.top = i16;
                rect.bottom = i16;
                return;
            }
            if (childAdapterPosition == itemCount - 1) {
                rect.left = 0;
                rect.right = i15;
                rect.top = i16;
                rect.bottom = i16;
                return;
            }
            rect.left = 0;
            rect.right = i14;
            rect.top = i16;
            rect.bottom = i16;
        }
    }
}
