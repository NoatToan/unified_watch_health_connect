package defpackage;

import com.huawei.ui.main.stories.oa.goodthingsrecommended.api.GoodThingsRecommendedApi;

/* JADX INFO: loaded from: classes43.dex */
public class vyp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile GoodThingsRecommendedApi f51700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f51701b = new Object();

    public static GoodThingsRecommendedApi c() {
        if (f51700a == null) {
            synchronized (f51701b) {
                if (f51700a == null) {
                    f51700a = new vyt();
                }
            }
        }
        return f51700a;
    }
}
