package xz;

import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.firebase.messaging.Constants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxz/c;", "Lcom/github/mikephil/charting/data/LineDataSet;", "", "Lcom/github/mikephil/charting/data/Entry;", "yVals", "", Constants.ScionAnalytics.PARAM_LABEL, "Landroid/graphics/drawable/Drawable;", "circleDrawable", "<init>", "(Ljava/util/List;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends LineDataSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f192732a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List<? extends Entry> list, String str, Drawable drawable) {
        super(list, str);
        list.getClass();
        str.getClass();
        this.f192732a = drawable;
    }
}
