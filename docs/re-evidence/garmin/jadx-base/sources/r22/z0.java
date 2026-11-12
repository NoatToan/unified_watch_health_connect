package r22;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBA\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lr22/z0;", "Landroidx/recyclerview/widget/RecyclerView$o;", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "<init>", "(IIII)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "leftId", "topId", "rightId", "bottomId", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z0 extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f149939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f149940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f149941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f149942d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z0(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        this(num != null ? context.getResources().getDimensionPixelSize(num.intValue()) : 0, num2 != null ? context.getResources().getDimensionPixelSize(num2.intValue()) : 0, num3 != null ? context.getResources().getDimensionPixelSize(num3.intValue()) : 0, num4 != null ? context.getResources().getDimensionPixelSize(num4.intValue()) : 0);
        context.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.getClass();
        view2.getClass();
        recyclerView.getClass();
        b0Var.getClass();
        super.getItemOffsets(rect, view2, recyclerView, b0Var);
        rect.set(this.f149939a, this.f149940b, this.f149941c, this.f149942d);
    }

    public z0(int i14, int i15, int i16, int i17) {
        this.f149939a = i14;
        this.f149940b = i15;
        this.f149941c = i16;
        this.f149942d = i17;
    }
}
