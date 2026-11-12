package gg1;

import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lgg1/h0;", "", "", "jsonValue", "", "displayResId", "contentDescriptionResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum h0 {
    MILLI_MOLES_PER_LITER("millimolesPerLitre", R.string.pregnancy_mmol, R.string.lbl_mmol_l_long),
    MILLI_GRAMS_PER_DECILITER("milligramsPerDecilitre", R.string.pregnancy_mgdl, R.string.lbl_mgdl_long);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f77238d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77244c;

    h0(String str, int i14, int i15) {
        this.f77242a = str;
        this.f77243b = i14;
        this.f77244c = i15;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgg1/h0$a;", "", "<init>", "()V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static h0 a(String str) {
            if (str != null) {
                for (h0 h0Var : h0.values()) {
                    if (p005kotlin.jvm.internal.s.g(h0Var.f77242a, str)) {
                        return h0Var;
                    }
                }
            }
            return ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? h0.MILLI_MOLES_PER_LITER : h0.MILLI_GRAMS_PER_DECILITER;
        }

        private a() {
        }
    }
}
