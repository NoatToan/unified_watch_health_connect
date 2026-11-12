package m21;

import c22.c3;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm21/c;", "", "", TtmlNode.ATTR_ID, "Lc22/c3;", "labelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lc22/c3;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum c {
    MENU_ITEM_QUICK_ADD("quick_add", c22.i.b(R.string.lbl_quick_add)),
    MENU_ITEM_CREATE_FOOD("create_food", c22.i.b(R.string.create_food)),
    MENU_ITEM_CREATE_RECIPE("create_recipe", g2.b(x0.Jd)),
    MENU_ITEM_CREATE_MEAL("create_meal", c22.i.b(R.string.create_meal));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f116081b;

    static {
        x0.f23314a.getClass();
    }

    c(String str, c3 c3Var) {
        this.f116080a = str;
        this.f116081b = c3Var;
    }
}
