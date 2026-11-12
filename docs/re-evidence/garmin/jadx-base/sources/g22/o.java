package g22;

import com.daasuu.bl.BubbleLayout;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    public static void a(BubbleLayout bubbleLayout, String str) {
        g12.m mVar = new g12.m(2);
        bubbleLayout.getClass();
        if (bubbleLayout.getContext().getSharedPreferences("tooltips_showed", 0).getBoolean(str, false)) {
            return;
        }
        m0 m0Var = new m0();
        bubbleLayout.setVisibility(0);
        bubbleLayout.setOnClickListener(new bv2.j(bubbleLayout, 6, m0Var, mVar));
        bubbleLayout.postDelayed(new fh2.a(bubbleLayout, 4, m0Var, mVar), 8000L);
        bubbleLayout.getContext().getSharedPreferences("tooltips_showed", 0).edit().putBoolean(str, true).apply();
    }
}
