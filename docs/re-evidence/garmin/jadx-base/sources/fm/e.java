package fm;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfm/e;", "Lfm/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f72083a;

    static {
        new a(null);
    }

    public e(Context context) {
        context.getClass();
        this.f72083a = context;
    }

    @Override // fm.c
    public final CharSequence a(String str) {
        if (!str.equals(this.f72083a.getString(R.string.no_value_card))) {
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
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new RelativeSizeSpan(0.7f), i14, str.length(), 33);
                return spannableString;
            }
        }
        return str;
    }

    @Override // fm.c
    public final h c() {
        return h.NEWS_FEED;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfm/e$a;", "", "<init>", "()V", "", "UNIT_TEXT_RELATIVE_SIZE", "F", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
