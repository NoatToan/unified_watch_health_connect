package wr2;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.snackbar.Snackbar;
import java.util.Arrays;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwr2/g;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f186857a = new g();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f186859b;

        static {
            int[] iArr = new int[qs2.f.values().length];
            try {
                iArr[qs2.f.PENDING_VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qs2.f.ELIGIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qs2.f.PENDING_ACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[qs2.f.ACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f186858a = iArr;
            int[] iArr2 = new int[q.b.values().length];
            try {
                iArr2[q.b.REMOVED_COMPLETELY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[q.b.REMOVED_PARTIALLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f186859b = iArr2;
        }
    }

    private g() {
    }

    public static String a(Context context, qs2.f fVar, String str) {
        int i14 = a.f186858a[fVar.ordinal()];
        if (i14 == 1 || i14 == 2) {
            x0 x0Var = x0.f105818a;
            String string = context.getString(R.string.wallet_card_added_no_verification);
            string.getClass();
            return String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        }
        if (i14 != 3 && i14 != 4) {
            return "";
        }
        x0 x0Var2 = x0.f105818a;
        String string2 = context.getString(R.string.wallet_card_added_message);
        string2.getClass();
        return String.format(string2, Arrays.copyOf(new Object[]{str}, 1));
    }

    public static void b(View view2, f fVar) {
        String string;
        view2.getClass();
        fVar.getClass();
        if (fVar instanceof f.a) {
            Context context = view2.getContext();
            context.getClass();
            f.a aVar = (f.a) fVar;
            string = a(context, aVar.f186847c, aVar.f186845a);
        } else if (fVar instanceof f.c) {
            Context context2 = view2.getContext();
            context2.getClass();
            f.c cVar = (f.c) fVar;
            string = a(context2, cVar.f186854c, cVar.f186852a);
        } else if (fVar instanceof f.b) {
            Context context3 = view2.getContext();
            context3.getClass();
            f.b bVar = (f.b) fVar;
            q.b bVar2 = bVar.f186850c;
            String str = bVar.f186848a;
            List<String> list = bVar.f186851d;
            int i14 = a.f186859b[bVar2.ordinal()];
            if (i14 == 1) {
                String string2 = context3.getString(R.string.wallet_item_removed_lbl);
                string2.getClass();
                string = String.format(string2, Arrays.copyOf(new Object[]{str}, 1));
            } else if (i14 != 2) {
                string = "";
            } else if (list == null || list.isEmpty()) {
                String string3 = context3.getString(R.string.wallet_item_removed_lbl);
                string3.getClass();
                string = String.format(string3, Arrays.copyOf(new Object[]{str}, 1));
            } else if (list.size() > 1) {
                String string4 = context3.getString(R.string.wallet_lbl_item_plural_removed_partially_sync);
                string4.getClass();
                string = String.format(string4, Arrays.copyOf(new Object[]{str}, 1));
            } else {
                String str2 = (String) h0.b0(list);
                String string5 = context3.getString(R.string.wallet_item_removed_partially_lbl);
                string5.getClass();
                string = String.format(string5, Arrays.copyOf(new Object[]{str, str2}, 2));
            }
        } else if (!(fVar instanceof f.d)) {
            u0.r();
            return;
        } else {
            string = view2.getContext().getString(R.string.wallet_message_transfer_success, ((f.d) fVar).f186855a);
            string.getClass();
        }
        if (g22.n.d(string)) {
            Snackbar snackbarMake = Snackbar.make(view2, string, 0);
            snackbarMake.getClass();
            v22.c.a(snackbarMake);
            snackbarMake.show();
        }
    }
}
