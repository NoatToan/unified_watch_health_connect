package uu;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luu/i;", "", "<init>", "()V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f172715a = new i();

    private i() {
    }

    public static SpannableStringBuilder a(int i14, int i15, Context context) {
        int i16 = i15 * i14;
        x0 x0Var = x0.f105818a;
        String string = context.getString(R.string.social_points);
        string.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i15)}, 1)) + " x " + i14 + " = ");
        String string2 = context.getString(R.string.social_points);
        string2.getClass();
        spannableStringBuilder.append(String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(i16)}, 1)), new ForegroundColorSpan(a7.b.getColor(context, R.color.gds_data_viz_orange_secondary)), 18);
        return spannableStringBuilder;
    }
}
