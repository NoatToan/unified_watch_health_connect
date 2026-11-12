package o12;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.card.view.CardSummaryRowView;
import g22.n;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo12/h;", "", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {
    static {
        new h();
    }

    private h() {
    }

    public static final void a(CardSummaryRowView cardSummaryRowView, int i14, String str) {
        cardSummaryRowView.getClass();
        if (i14 <= 0) {
            cardSummaryRowView.setVisibility(8);
        } else {
            l3.f23124b.getClass();
            b(cardSummaryRowView, l3.a.B(i14), str, null);
        }
    }

    public static final void b(CardSummaryRowView cardSummaryRowView, String str, String str2, String str3) {
        cardSummaryRowView.getClass();
        if (!n.d(str2)) {
            cardSummaryRowView.setValueText(str);
        } else {
            Context context = cardSummaryRowView.getContext();
            cardSummaryRowView.c(gm.b.c(context, R.style.GCMCardSecondaryValueCaption, -1, context.getString(R.string.string_space_string_pattern, str, str2)), str3);
        }
    }
}
