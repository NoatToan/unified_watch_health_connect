package or2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.Arrays;
import p005kotlin.Metadata;
import p13.h0;
import v22.c;
import wr2.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lor2/b;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f133424a = new b();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133425a;

        static {
            int[] iArr = new int[q.b.values().length];
            try {
                iArr[q.b.REMOVED_COMPLETELY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.b.REMOVED_PARTIALLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f133425a = iArr;
        }
    }

    private b() {
    }

    public static Intent a() {
        kj0.b.f104940a.getClass();
        return new Intent("android.intent.action.VIEW", Uri.parse(kj0.b.a() == zi2.a.CHINA ? "http://www.garmin.com.cn/minisite/garmin-pay/" : "https://www.garmin.com/en-US/garminpay/banks/"));
    }

    public static void b(View view2, boolean z14) {
        view2.getClass();
        if (z14) {
            return;
        }
        String string = view2.getContext().getString(R.string.title_error_occurred);
        string.getClass();
        Snackbar snackbarMake = Snackbar.make(view2, string, 0);
        snackbarMake.getClass();
        c.a(snackbarMake);
        snackbarMake.show();
    }

    public static void c(b bVar, Context context, View view2, q.b bVar2, String str, ArrayList arrayList) {
        String str2;
        bVar.getClass();
        view2.getClass();
        int i14 = bVar2 == null ? -1 : a.f133425a[bVar2.ordinal()];
        if (i14 == 1) {
            String string = context.getString(R.string.wallet_item_removed_lbl);
            string.getClass();
            Snackbar snackbarMake = Snackbar.make(view2, String.format(string, Arrays.copyOf(new Object[]{str}, 1)), 0);
            snackbarMake.getClass();
            c.a(snackbarMake);
            snackbarMake.show();
            return;
        }
        if (i14 != 2) {
            br2.c.f19585a.b(context);
            return;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            String string2 = context.getString(R.string.wallet_item_removed_lbl);
            string2.getClass();
            str2 = String.format(string2, Arrays.copyOf(new Object[]{str}, 1));
        } else if (arrayList.size() > 1) {
            String string3 = context.getString(R.string.wallet_lbl_item_plural_removed_partially_sync);
            string3.getClass();
            str2 = String.format(string3, Arrays.copyOf(new Object[]{str}, 1));
        } else {
            String str3 = (String) h0.b0(arrayList);
            String string4 = context.getString(R.string.wallet_item_removed_partially_lbl);
            string4.getClass();
            str2 = String.format(string4, Arrays.copyOf(new Object[]{str, str3}, 2));
        }
        Snackbar snackbarMake2 = Snackbar.make(view2, str2, 0);
        snackbarMake2.getClass();
        c.a(snackbarMake2);
        snackbarMake2.show();
    }
}
