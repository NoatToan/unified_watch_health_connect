package bf1;

import af1.e;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbf1/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17823a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17824a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f3072e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f3078k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f17824a = iArr;
        }
    }

    static {
        new C0254a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f17823a = context;
        context.getResources().getClass();
    }

    public final String a(Long l14, Long l15, e eVar) {
        eVar.getClass();
        int i14 = b.f17824a[eVar.ordinal()];
        Context context = this.f17823a;
        if (i14 == 1) {
            String string = context.getString(R.string.activities_lbl_value1_and_above, String.valueOf(l14 != null ? l14.longValue() : 0L));
            string.getClass();
            return string;
        }
        if (i14 == 2) {
            String string2 = context.getString(R.string.activities_lbl_value1_and_below, String.valueOf(l15 != null ? l15.longValue() - 1 : 0L));
            string2.getClass();
            return string2;
        }
        String strValueOf = String.valueOf(l15 != null ? l15.longValue() - 1 : 0L);
        Object obj = l14;
        if (l14 == null) {
            obj = "0";
        }
        String string3 = context.getString(R.string.square_bracket_pattern, context.getString(R.string.string_short_dash_line_string_pattern, strValueOf, obj));
        string3.getClass();
        return string3;
    }

    /* JADX INFO: renamed from: bf1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbf1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0254a {
        public /* synthetic */ C0254a(j jVar) {
            this();
        }

        private C0254a() {
        }
    }
}
