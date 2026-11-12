package defpackage;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class gc3 implements dc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18823b;
    public final fc3 c;

    public gc3(String str, vf3 vf3Var) {
        boolean z;
        int i;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            zpe.k("Camera2CamcorderProfileProvider", "Camera id is not an integer: " + str + ", unable to create CamcorderProfileProvider");
            z = false;
            i = -1;
        }
        this.f18822a = z;
        this.f18823b = i;
        this.c = new fc3((ec3) sh3.a(str, vf3Var).b(ec3.class));
    }
}
