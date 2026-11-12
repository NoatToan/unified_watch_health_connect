package qm;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.widget.TextView;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqm/t;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f145451a = 0;

    static {
        new t();
    }

    private t() {
    }

    public static final TextView a(Context context, int i14, int i15, String str) {
        String str2 = TextUtils.isEmpty(null) ? "" : null;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return b(context, i14, new SpannableString(str2), i15, str != null ? str : "");
    }

    public static final TextView b(Context context, int i14, Spanned spanned, int i15, String str) {
        SpannableString spannableString;
        str.getClass();
        if (TextUtils.isEmpty(spanned)) {
            spannableString = new SpannableString(str);
        } else {
            SpannableString spannableString2 = new SpannableString(((Object) spanned) + StringUtils.SPACE + str);
            spannableString2.setSpan(new ForegroundColorSpan(i14), 0, spanned.length(), 33);
            spannableString = spannableString2;
        }
        TextView textView = new TextView(context);
        textView.setPadding(50, 0, 0, 0);
        textView.setText(spannableString);
        textView.setTextColor(i15);
        textView.setTextSize(12.0f);
        return textView;
    }

    public static final void c(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setLayerType(1, null);
        }
    }
}
