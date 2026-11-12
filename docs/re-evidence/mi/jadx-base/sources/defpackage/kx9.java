package defpackage;

import android.view.View;
import com.google.android.flexbox.a;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface kx9 {
    void a(View view, int i, int i2, a aVar);

    View b(int i);

    int c(int i, int i2, int i3);

    int d(View view);

    View e(int i);

    int f(View view, int i, int i2);

    int g(int i, int i2, int i3);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<a> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    void h(a aVar);

    void i(int i, View view);

    boolean j();

    void setFlexLines(List<a> list);
}
