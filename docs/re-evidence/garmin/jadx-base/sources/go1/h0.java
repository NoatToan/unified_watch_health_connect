package go1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgo1/h0;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lu22/b;", "Landroid/view/View;", "itemView", "Lgo1/v;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/view/View;Lgo1/v;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 extends RecyclerView.f0 implements u22.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f78243a = 0;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78244a;

        static {
            int[] iArr = new int[u22.a.values().length];
            try {
                iArr[u22.a.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u22.a.EditBackgroundCell.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u22.a.EditFocusCell.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78244a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(View view2, v vVar) {
        super(view2);
        view2.getClass();
        vVar.getClass();
        view2.setOnClickListener(new g0(vVar, 0));
    }

    @Override // u22.b
    public final void b(u22.a aVar) {
        aVar.getClass();
        int i14 = a.f78244a[aVar.ordinal()];
        if (i14 == 1) {
            this.itemView.setAlpha(1.0f);
            this.itemView.setEnabled(true);
        } else if (i14 == 2) {
            this.itemView.setAlpha(0.3f);
            this.itemView.setEnabled(false);
        } else {
            if (i14 == 3) {
                return;
            }
            u0.r();
        }
    }
}
