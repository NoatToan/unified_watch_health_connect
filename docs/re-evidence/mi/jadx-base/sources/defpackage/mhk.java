package defpackage;

import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fitness.banner.export.newbieguide.model.HighLight;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class mhk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HighLight f26189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26190b;
    public int c;
    public int d;
    public View e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26192b;
        public int c;
        public int d;
        public int e;

        public String toString() {
            return "MarginInfo{leftMargin=" + this.f26191a + ", topMargin=" + this.f26192b + ", rightMargin=" + this.c + ", bottomMargin=" + this.d + ", gravity=" + this.e + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public mhk(int i, int i2) {
        this.f26190b = i;
        this.d = i2;
    }

    public final View a(ViewGroup viewGroup, com.fitness.banner.export.newbieguide.core.a aVar) {
        View viewInflate = this.f26190b != 0 ? LayoutInflater.from(viewGroup.getContext()).inflate(this.f26190b, viewGroup, false) : this.e;
        d(viewInflate);
        e(viewInflate, aVar);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewInflate.getLayoutParams();
        a aVarB = b(this.d, viewGroup, viewInflate);
        c(aVarB, viewGroup, viewInflate);
        layoutParams.gravity = aVarB.e;
        layoutParams.leftMargin += aVarB.f26191a;
        layoutParams.topMargin += aVarB.f26192b;
        layoutParams.rightMargin += aVarB.c;
        layoutParams.bottomMargin += aVarB.d;
        viewInflate.setLayoutParams(layoutParams);
        return viewInflate;
    }

    public final a b(int i, ViewGroup viewGroup, View view) {
        a aVar = new a();
        RectF rectFB = this.f26189a.b(viewGroup);
        if (i == 3) {
            aVar.e = 5;
            aVar.c = (int) ((viewGroup.getWidth() - rectFB.left) + this.c);
            aVar.f26192b = (int) rectFB.top;
        } else if (i == 5) {
            aVar.f26191a = (int) (rectFB.right + this.c);
            aVar.f26192b = (int) rectFB.top;
        } else if (i == 48) {
            aVar.e = 80;
            aVar.d = (int) ((viewGroup.getHeight() - rectFB.top) + this.c);
            aVar.f26191a = (int) rectFB.left;
        } else if (i == 80) {
            aVar.f26192b = (int) (rectFB.bottom + this.c);
            aVar.f26191a = (int) rectFB.left;
        }
        return aVar;
    }

    public void c(a aVar, ViewGroup viewGroup, View view) {
    }

    @Deprecated
    public void d(View view) {
    }

    public void e(View view, com.fitness.banner.export.newbieguide.core.a aVar) {
    }
}
