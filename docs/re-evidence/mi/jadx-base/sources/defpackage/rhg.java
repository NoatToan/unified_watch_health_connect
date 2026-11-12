package defpackage;

import com.facebook.soloader.SoLoader;

/* JADX INFO: loaded from: classes4.dex */
public class rhg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f32548a;

    public static synchronized void a() {
        if (!f32548a) {
            SoLoader.q("native-imagetranscoder");
            f32548a = true;
        }
    }
}
