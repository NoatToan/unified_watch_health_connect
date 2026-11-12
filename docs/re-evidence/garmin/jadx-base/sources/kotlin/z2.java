package kotlin;

import android.graphics.Outline;
import o4.f1;
import o4.j;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li5/z2;", "", "<init>", "()V", "Landroid/graphics/Outline;", "outline", "Lo4/f1;", "path", "", "a", "(Landroid/graphics/Outline;Lo4/f1;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z2 f91669a = new z2();

    private z2() {
    }

    public final void a(Outline outline, f1 path) {
        if (path instanceof j) {
            outline.setPath(((j) path).f128869b);
        } else {
            e.w("Unable to obtain android.graphics.Path");
        }
    }
}
