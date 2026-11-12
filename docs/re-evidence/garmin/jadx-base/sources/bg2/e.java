package bg2;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import p005kotlin.Unit;
import p3.p1;
import p5.d0;
import p5.h0;
import p5.j0;
import p5.k0;
import s5.q0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17860a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17864e;

    public /* synthetic */ e(int i14, String str, String str2, boolean z14) {
        this.f17863d = i14;
        this.f17861b = z14;
        this.f17864e = str;
        this.f17862c = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f17860a;
        boolean z14 = true;
        Object obj2 = this.f17862c;
        Object obj3 = this.f17864e;
        boolean z15 = this.f17861b;
        int i15 = this.f17863d;
        switch (i14) {
            case 0:
                ((Context) obj).getClass();
                StyledPlayerView styledPlayerView = new StyledPlayerView((Context) obj3);
                styledPlayerView.setPlayer((ExoPlayer) ((p1) obj2).getF182175a());
                styledPlayerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                styledPlayerView.setUseController(z15);
                styledPlayerView.setBackgroundColor(i15);
                styledPlayerView.setImportantForAccessibility(4);
                return styledPlayerView;
            case 1:
                p1 p1Var = (p1) obj2;
                p1 p1Var2 = (p1) obj3;
                q0 q0Var = (q0) obj;
                q0Var.getClass();
                if (!z15 && !q0Var.d() && (!((Boolean) p1Var.getF182175a()).booleanValue() || q0Var.f157281b.f157257f <= i15)) {
                    z14 = false;
                }
                p1Var2.setValue(Boolean.valueOf(z14));
                return Unit.INSTANCE;
            default:
                String str = (String) obj3;
                String str2 = (String) obj2;
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                p5.e eVar = new p5.e(0, 1, i15, 1);
                k23.l<Object>[] lVarArr = h0.f136016a;
                d0.f135959a.getClass();
                j0<p5.e> j0Var = d0.f135966h;
                k23.l<Object> lVar = h0.f136016a[25];
                j0Var.getClass();
                k0Var.a(j0Var, eVar);
                if (!z15) {
                    str = str2;
                }
                h0.z(k0Var, str);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(Context context, boolean z14, int i14, p1 p1Var) {
        this.f17864e = context;
        this.f17861b = z14;
        this.f17863d = i14;
        this.f17862c = p1Var;
    }

    public /* synthetic */ e(boolean z14, p1 p1Var, int i14, p1 p1Var2) {
        this.f17861b = z14;
        this.f17862c = p1Var;
        this.f17863d = i14;
        this.f17864e = p1Var2;
    }
}
