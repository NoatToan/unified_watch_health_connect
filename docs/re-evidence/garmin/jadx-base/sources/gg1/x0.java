package gg1;

import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public enum x0 {
    TWELVE_HOUR("time_twelve_hr"),
    /* JADX INFO: Fake field, exist only in values array */
    TWENTY_FOUR_HOUR("time_twenty_four_hr");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f77365c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77367a;

    static {
        x0 x0Var = TWELVE_HOUR;
        x0 x0Var2 = TWENTY_FOUR_HOUR;
        f77365c = null;
        HashMap map = new HashMap(2);
        f77365c = map;
        map.put(x0Var.f77367a, x0Var);
        map.put(x0Var2.f77367a, x0Var2);
    }

    x0(String str) {
        this.f77367a = str;
    }
}
