package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.navigation.NavController;
import androidx.navigation.d;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class b00 implements NavController.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Integer> f3629b;
    public final WeakReference<fbh> c;
    public k57 d;
    public ValueAnimator e;

    public b00(Context context, ze1 ze1Var) {
        this.f3628a = context;
        this.f3629b = ze1Var.c();
        fbh fbhVarB = ze1Var.b();
        if (fbhVarB != null) {
            this.c = new WeakReference<>(fbhVarB);
        } else {
            this.c = null;
        }
    }

    @Override // androidx.navigation.NavController.b
    public void a(NavController navController, d dVar, Bundle bundle) {
        if (dVar instanceof wy9) {
            return;
        }
        WeakReference<fbh> weakReference = this.c;
        fbh fbhVar = weakReference != null ? weakReference.get() : null;
        if (this.c != null && fbhVar == null) {
            navController.removeOnDestinationChangedListener(this);
            return;
        }
        CharSequence charSequenceO = dVar.o();
        if (charSequenceO != null) {
            StringBuffer stringBuffer = new StringBuffer();
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequenceO);
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                if (bundle == null || !bundle.containsKey(strGroup)) {
                    throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill label " + ((Object) charSequenceO));
                }
                matcher.appendReplacement(stringBuffer, "");
                stringBuffer.append(bundle.get(strGroup).toString());
            }
            matcher.appendTail(stringBuffer);
            d(stringBuffer);
        }
        boolean zD = sig.d(dVar, this.f3629b);
        if (fbhVar == null && zD) {
            c(null, 0);
        } else {
            b(fbhVar != null && zD);
        }
    }

    public final void b(boolean z) {
        boolean z2;
        if (this.d == null) {
            this.d = new k57(this.f3628a);
            z2 = false;
        } else {
            z2 = true;
        }
        c(this.d, z ? tzi.f35219b : tzi.f35218a);
        float f = z ? 0.0f : 1.0f;
        if (!z2) {
            this.d.setProgress(f);
            return;
        }
        float fA = this.d.a();
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.d, BroadcastsKt.SILENT_PUSHING_PROGRESS, fA, f);
        this.e = objectAnimatorOfFloat;
        objectAnimatorOfFloat.start();
    }

    public abstract void c(Drawable drawable, int i);

    public abstract void d(CharSequence charSequence);
}
