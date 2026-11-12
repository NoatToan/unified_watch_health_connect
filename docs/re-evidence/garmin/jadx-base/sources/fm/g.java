package fm;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lfm/g;", "Lfm/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "primaryValueTextColor", "<init>", "(Landroid/content/Context;I)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f72085c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f72086b;

    static {
        new a(null);
        f72085c = R.style.GCMSmallCardPrimaryValueUnit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, int i14) {
        super(context);
        context.getClass();
        this.f72086b = i14;
    }

    @Override // fm.f, fm.c
    public final CharSequence a(String str) {
        Context context = this.f72084a;
        if (!str.equals(context.getString(R.string.no_value_card))) {
            int length = str.length();
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    i14 = -1;
                    break;
                }
                char cCharAt = str.charAt(i14);
                if (cCharAt == ' ' || cCharAt == '/') {
                    break;
                }
                i14++;
            }
            if (i14 != -1) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                SpannableString spannableString = new SpannableString(upperCase);
                spannableString.setSpan(new TextAppearanceSpan(context, f72085c), i14, str.length(), 33);
                spannableString.setSpan(new ForegroundColorSpan(a7.b.getColor(context, this.f72086b)), i14, str.length(), 33);
                return spannableString;
            }
        }
        return str;
    }

    @Override // fm.f, fm.c
    public final h c() {
        return h.PROFILE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfm/g$a;", "", "<init>", "()V", "", "TEXT_SPAN_STYLE_PRIMARY_VALUE_UNIT", "I", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
