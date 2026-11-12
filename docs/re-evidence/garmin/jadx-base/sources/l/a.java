package l;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class a implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f107787a;

    public a(Context context) {
        this.f107787a = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view2) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f107787a);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view2, CharSequence charSequence, boolean z14, int i14, Rect rect) {
    }
}
