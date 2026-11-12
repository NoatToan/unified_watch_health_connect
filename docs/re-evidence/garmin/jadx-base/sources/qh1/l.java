package qh1;

import c22.n3;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqh1/l;", "", "Ll22/b;", "stringResources", "<init>", "(Ll22/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f144742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f144744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f144745d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f144746a;

        static {
            int[] iArr = new int[n3.values().length];
            try {
                iArr[n3.KILOGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n3.POUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f144746a = iArr;
        }
    }

    public l(l22.b bVar) {
        bVar.getClass();
        this.f144742a = bVar;
        this.f144743b = bVar.getString(R.string.no_value);
        this.f144744c = bVar.getString(R.string.string_space_string_bracket_pattern);
        this.f144745d = bVar.getString(R.string.string_space_string_pattern);
    }

    public final String a(LocalDate localDate) {
        if (localDate == null) {
            return this.f144743b;
        }
        if (g22.k.g(localDate, LocalDate.now())) {
            return this.f144742a.getString(R.string.wallet_lbl_today);
        }
        String string = localDate.toDateTimeAtStartOfDay().toString("MMM d, yyyy");
        string.getClass();
        return string;
    }

    public final String b(n3 n3Var) {
        int i14 = n3Var == null ? -1 : a.f144746a[n3Var.ordinal()];
        l22.b bVar = this.f144742a;
        if (i14 != 1 && i14 == 2) {
            return bVar.getString(R.string.lbl_lbs);
        }
        return bVar.getString(R.string.lbl_kg);
    }
}
