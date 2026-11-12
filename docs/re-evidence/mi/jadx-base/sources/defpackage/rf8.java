package defpackage;

import android.util.Size;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class rf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32487a;

    public rf8(String str) {
        this.f32487a = str;
    }

    public List<Size> a(int i) {
        sf8 sf8Var = (sf8) za6.a(sf8.class);
        return sf8Var == null ? new ArrayList() : sf8Var.a(this.f32487a, i);
    }
}
