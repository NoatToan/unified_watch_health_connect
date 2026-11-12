package qz;

import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import zz.i;
import zz.j;
import zz.k;

/* JADX INFO: loaded from: classes7.dex */
public interface e {
    default i a() {
        return new zz.b();
    }

    MarkerView b();

    j c();

    default Entry d(Highlight highlight) {
        highlight.getClass();
        return new Entry();
    }

    k e();

    b00.b f();

    default Entry g(Highlight[] highlightArr) {
        highlightArr.getClass();
        return new Entry();
    }
}
